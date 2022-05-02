package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messagePeerReaction;
import org.telegram.tgnet.TLRPC$TL_messages_getMessageReactionsList;
import org.telegram.tgnet.TLRPC$TL_messages_messageReactionsList;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_reactionCount;
import org.telegram.tgnet.TLRPC$User;
import p008j$.util.Comparator$CC;

public class ReactedUsersListView extends FrameLayout {
    private RecyclerView.Adapter adapter;
    private int currentAccount;
    private String filter;
    private boolean isLoaded;
    private boolean isLoading;
    private RecyclerListView listView;
    private FlickerLoadingView loadingView;
    private MessageObject message;
    private String offset;
    private OnHeightChangedListener onHeightChangedListener;
    private OnProfileSelectedListener onProfileSelectedListener;
    private boolean onlySeenNow;
    private int predictiveCount;
    private List<TLRPC$TL_messagePeerReaction> userReactions = new ArrayList();
    private LongSparseArray<TLRPC$TL_messagePeerReaction> peerReactionMap = new LongSparseArray<>();
    private boolean canLoadMore = true;

    public interface OnHeightChangedListener {
        void onHeightChanged(ReactedUsersListView reactedUsersListView, int i);
    }

    public interface OnProfileSelectedListener {
        void onProfileSelected(ReactedUsersListView reactedUsersListView, long j);
    }

    public ReactedUsersListView(final Context context, Theme.ResourcesProvider resourcesProvider, int i, MessageObject messageObject, TLRPC$TL_reactionCount tLRPC$TL_reactionCount, boolean z) {
        super(context);
        this.currentAccount = i;
        this.message = messageObject;
        this.filter = tLRPC$TL_reactionCount == null ? null : tLRPC$TL_reactionCount.reaction;
        int i2 = 6;
        this.predictiveCount = tLRPC$TL_reactionCount == null ? 6 : tLRPC$TL_reactionCount.count;
        this.listView = new RecyclerListView(context, resourcesProvider) {
            @Override
            public void onMeasure(int i3, int i4) {
                super.onMeasure(i3, i4);
                ReactedUsersListView.this.updateHeight();
            }
        };
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.listView.setLayoutManager(linearLayoutManager);
        if (z) {
            this.listView.setPadding(0, 0, 0, AndroidUtilities.m34dp(8.0f));
            this.listView.setClipToPadding(false);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.listView.setVerticalScrollbarThumbDrawable(new ColorDrawable(Theme.getColor("listSelectorSDK21")));
        }
        RecyclerListView recyclerListView = this.listView;
        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i3) {
                return new RecyclerListView.Holder(new ReactedUserHolderView(context));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i3) {
                ((ReactedUserHolderView) viewHolder.itemView).setUserReaction((TLRPC$TL_messagePeerReaction) ReactedUsersListView.this.userReactions.get(i3));
            }

            @Override
            public int getItemCount() {
                return ReactedUsersListView.this.userReactions.size();
            }
        };
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i3) {
                ReactedUsersListView.this.lambda$new$0(view, i3);
            }
        });
        this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                if (ReactedUsersListView.this.isLoaded && ReactedUsersListView.this.canLoadMore && !ReactedUsersListView.this.isLoading && linearLayoutManager.findLastVisibleItemPosition() >= (ReactedUsersListView.this.adapter.getItemCount() - 1) - ReactedUsersListView.this.getLoadCount()) {
                    ReactedUsersListView.this.load();
                }
            }
        });
        this.listView.setVerticalScrollBarEnabled(true);
        this.listView.setAlpha(0.0f);
        addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, resourcesProvider);
        this.loadingView = flickerLoadingView;
        flickerLoadingView.setViewType(16);
        this.loadingView.setIsSingleCell(true);
        this.loadingView.setItemsCount(tLRPC$TL_reactionCount != null ? tLRPC$TL_reactionCount.count : i2);
        addView(this.loadingView, LayoutHelper.createFrame(-1, -1.0f));
    }

    public void lambda$new$0(View view, int i) {
        OnProfileSelectedListener onProfileSelectedListener = this.onProfileSelectedListener;
        if (onProfileSelectedListener != null) {
            onProfileSelectedListener.onProfileSelected(this, MessageObject.getPeerId(this.userReactions.get(i).peer_id));
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public ReactedUsersListView setSeenUsers(List<TLRPC$User> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (TLRPC$User tLRPC$User : list) {
            if (this.peerReactionMap.get(tLRPC$User.f985id) == null) {
                TLRPC$TL_messagePeerReaction tLRPC$TL_messagePeerReaction = new TLRPC$TL_messagePeerReaction();
                tLRPC$TL_messagePeerReaction.reaction = null;
                TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                tLRPC$TL_messagePeerReaction.peer_id = tLRPC$TL_peerUser;
                tLRPC$TL_peerUser.user_id = tLRPC$User.f985id;
                this.peerReactionMap.put(MessageObject.getPeerId(tLRPC$TL_peerUser), tLRPC$TL_messagePeerReaction);
                arrayList.add(tLRPC$TL_messagePeerReaction);
            }
        }
        if (this.userReactions.isEmpty()) {
            this.onlySeenNow = true;
        }
        this.userReactions.addAll(arrayList);
        this.adapter.notifyDataSetChanged();
        updateHeight();
        return this;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.isLoaded && !this.isLoading) {
            load();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void load() {
        this.isLoading = true;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        TLRPC$TL_messages_getMessageReactionsList tLRPC$TL_messages_getMessageReactionsList = new TLRPC$TL_messages_getMessageReactionsList();
        tLRPC$TL_messages_getMessageReactionsList.peer = messagesController.getInputPeer(this.message.getDialogId());
        tLRPC$TL_messages_getMessageReactionsList.f938id = this.message.getId();
        tLRPC$TL_messages_getMessageReactionsList.limit = getLoadCount();
        String str = this.filter;
        tLRPC$TL_messages_getMessageReactionsList.reaction = str;
        String str2 = this.offset;
        tLRPC$TL_messages_getMessageReactionsList.offset = str2;
        if (str != null) {
            tLRPC$TL_messages_getMessageReactionsList.flags = 1 | tLRPC$TL_messages_getMessageReactionsList.flags;
        }
        if (str2 != null) {
            tLRPC$TL_messages_getMessageReactionsList.flags |= 2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_getMessageReactionsList, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ReactedUsersListView.this.lambda$load$5(tLObject, tLRPC$TL_error);
            }
        }, 64);
    }

    public void lambda$load$4(final TLObject tLObject) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(new Runnable() {
            @Override
            public final void run() {
                ReactedUsersListView.this.lambda$load$3(tLObject);
            }
        });
    }

    public void lambda$load$5(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ReactedUsersListView.this.lambda$load$4(tLObject);
            }
        });
    }

    public void lambda$load$3(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_messages_messageReactionsList) {
            TLRPC$TL_messages_messageReactionsList tLRPC$TL_messages_messageReactionsList = (TLRPC$TL_messages_messageReactionsList) tLObject;
            Iterator<TLRPC$User> it = tLRPC$TL_messages_messageReactionsList.users.iterator();
            while (it.hasNext()) {
                MessagesController.getInstance(this.currentAccount).putUser(it.next(), false);
            }
            for (int i = 0; i < tLRPC$TL_messages_messageReactionsList.reactions.size(); i++) {
                this.userReactions.add(tLRPC$TL_messages_messageReactionsList.reactions.get(i));
                long peerId = MessageObject.getPeerId(tLRPC$TL_messages_messageReactionsList.reactions.get(i).peer_id);
                TLRPC$TL_messagePeerReaction tLRPC$TL_messagePeerReaction = this.peerReactionMap.get(peerId);
                if (tLRPC$TL_messagePeerReaction != null) {
                    this.userReactions.remove(tLRPC$TL_messagePeerReaction);
                }
                this.peerReactionMap.put(peerId, tLRPC$TL_messages_messageReactionsList.reactions.get(i));
            }
            if (this.onlySeenNow) {
                Collections.sort(this.userReactions, Comparator$CC.comparingInt(ReactedUsersListView$$ExternalSyntheticLambda3.INSTANCE));
            }
            if (this.onlySeenNow) {
                this.onlySeenNow = false;
            }
            this.adapter.notifyDataSetChanged();
            if (!this.isLoaded) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ReactedUsersListView.this.lambda$load$2(valueAnimator);
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ReactedUsersListView.this.loadingView.setVisibility(8);
                    }
                });
                duration.start();
                updateHeight();
                this.isLoaded = true;
            }
            String str = tLRPC$TL_messages_messageReactionsList.next_offset;
            this.offset = str;
            if (str == null) {
                this.canLoadMore = false;
            }
            this.isLoading = false;
            return;
        }
        this.isLoading = false;
    }

    public static int lambda$load$1(TLRPC$TL_messagePeerReaction tLRPC$TL_messagePeerReaction) {
        return tLRPC$TL_messagePeerReaction.reaction != null ? 0 : 1;
    }

    public void lambda$load$2(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.listView.setAlpha(floatValue);
        this.loadingView.setAlpha(1.0f - floatValue);
    }

    public void updateHeight() {
        int i;
        if (this.onHeightChangedListener != null) {
            int size = this.userReactions.size();
            if (size == 0) {
                size = this.predictiveCount;
            }
            if (this.listView.getMeasuredHeight() != 0) {
                i = Math.min(this.listView.getMeasuredHeight(), AndroidUtilities.m34dp(size * 48));
            } else {
                i = AndroidUtilities.m34dp(size * 48);
            }
            this.onHeightChangedListener.onHeightChanged(this, i);
        }
    }

    public int getLoadCount() {
        return this.filter == null ? 100 : 50;
    }

    private final class ReactedUserHolderView extends FrameLayout {
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        BackupImageView avatarView;
        View overlaySelectorView;
        BackupImageView reactView;
        TextView titleView;

        ReactedUserHolderView(Context context) {
            super(context);
            setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.m34dp(48.0f)));
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.m34dp(32.0f));
            addView(this.avatarView, LayoutHelper.createFrameRelatively(36.0f, 36.0f, 8388627, 8.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setLines(1);
            this.titleView.setTextSize(1, 16.0f);
            this.titleView.setTextColor(Theme.getColor("actionBarDefaultSubmenuItem"));
            this.titleView.setEllipsize(TextUtils.TruncateAt.END);
            addView(this.titleView, LayoutHelper.createFrameRelatively(-2.0f, -2.0f, 8388627, 58.0f, 0.0f, 44.0f, 0.0f));
            BackupImageView backupImageView2 = new BackupImageView(context);
            this.reactView = backupImageView2;
            addView(backupImageView2, LayoutHelper.createFrameRelatively(24.0f, 24.0f, 8388629, 0.0f, 0.0f, 12.0f, 0.0f));
            View view = new View(context);
            this.overlaySelectorView = view;
            view.setBackground(Theme.getSelectorDrawable(false));
            addView(this.overlaySelectorView, LayoutHelper.createFrame(-1, -1.0f));
        }

        void setUserReaction(TLRPC$TL_messagePeerReaction tLRPC$TL_messagePeerReaction) {
            TLRPC$User user = MessagesController.getInstance(ReactedUsersListView.this.currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(tLRPC$TL_messagePeerReaction.peer_id)));
            if (user != null) {
                this.avatarDrawable.setInfo(user);
                this.titleView.setText(UserObject.getUserName(user));
                this.avatarView.setImage(ImageLocation.getForUser(user, 1), "50_50", this.avatarDrawable, user);
                if (tLRPC$TL_messagePeerReaction.reaction != null) {
                    TLRPC$TL_availableReaction tLRPC$TL_availableReaction = MediaDataController.getInstance(ReactedUsersListView.this.currentAccount).getReactionsMap().get(tLRPC$TL_messagePeerReaction.reaction);
                    if (tLRPC$TL_availableReaction != null) {
                        this.reactView.setImage(ImageLocation.getForDocument(tLRPC$TL_availableReaction.static_icon), "50_50", "webp", DocumentObject.getSvgThumb(tLRPC$TL_availableReaction.static_icon.thumbs, "windowBackgroundGray", 1.0f), tLRPC$TL_availableReaction);
                        return;
                    }
                    this.reactView.setImageDrawable(null);
                    return;
                }
                this.reactView.setImageDrawable(null);
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(48.0f), 1073741824));
        }
    }

    public ReactedUsersListView setOnProfileSelectedListener(OnProfileSelectedListener onProfileSelectedListener) {
        this.onProfileSelectedListener = onProfileSelectedListener;
        return this;
    }

    public ReactedUsersListView setOnHeightChangedListener(OnHeightChangedListener onHeightChangedListener) {
        this.onHeightChangedListener = onHeightChangedListener;
        return this;
    }
}
