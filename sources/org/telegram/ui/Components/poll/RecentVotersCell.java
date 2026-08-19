package org.telegram.ui.Components.poll;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AvatarsListDrawable;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.MessageSeenView;

public class RecentVotersCell extends FrameLayout {
    public final AvatarsListDrawable avatarsListDrawable;
    private UniversalRecyclerView listView;
    public final TextView textView;

    public RecentVotersCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.avatarsListDrawable = new AvatarsListDrawable(i, this, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dpf2(1.0f));
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider));
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(19);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextSize(1, 16.0f);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(68.0f), 0);
        addView(textView, LayoutHelper.createFrameMatchParent());
    }

    public void setText(String str) {
        this.textView.setText(str);
    }

    public void setRecentVoters(List list, boolean z) {
        this.avatarsListDrawable.set(list, z);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.avatarsListDrawable.attach();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.avatarsListDrawable.detach();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.avatarsListDrawable.setBounds((getWidth() - AndroidUtilities.dp(11.0f)) - ((int) this.avatarsListDrawable.getAnimatedWidth()), AndroidUtilities.dp(12.0f), getWidth() - AndroidUtilities.dp(11.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(24.0f));
        this.avatarsListDrawable.draw(canvas);
    }

    public RecyclerListView createListView(BaseFragment baseFragment, long j, int i, byte[] bArr, final int i2, Utilities.Callback callback) {
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            return universalRecyclerView;
        }
        final VotesList votesList = new VotesList(baseFragment.getCurrentAccount(), baseFragment.getMessagesController().getInputPeer(j), i, bArr, new Runnable() {
            @Override
            public final void run() {
                this.f$0.listView.adapter.update(true);
            }
        }, callback);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                votesList.load();
            }
        }, 1000L);
        UniversalRecyclerView universalRecyclerView2 = new UniversalRecyclerView(baseFragment, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                votesList.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, null, null) {
            @Override
            protected void onMeasure(int i3, int i4) {
                int iMin = Math.min(AndroidUtilities.dp(220.0f), View.MeasureSpec.getSize(i3));
                View.MeasureSpec.getSize(i4);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(MathUtils.clamp(i2, 1, 5) * 48), 1073741824));
            }
        };
        this.listView = universalRecyclerView2;
        universalRecyclerView2.adapter.setApplyBackground(false);
        this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                if (votesList.completed || votesList.loading) {
                    return;
                }
                if ((RecentVotersCell.this.listView.adapter.getItemCount() - 1) - RecentVotersCell.this.listView.layoutManager.findLastCompletelyVisibleItemPosition() < 5) {
                    votesList.load();
                }
            }
        });
        return this.listView;
    }

    static class VotesList {
        private boolean completed;
        private int count;
        public final int currentAccount;
        private boolean loading;
        public final int msgId;
        private String nextOffset;
        private final Utilities.Callback onClick;
        private final Runnable onUpdate;
        public final byte[] option;
        public final TLRPC.InputPeer peer;
        private ArrayList votes;

        private VotesList(int i, TLRPC.InputPeer inputPeer, int i2, byte[] bArr, Runnable runnable, Utilities.Callback callback) {
            this.count = -1;
            this.votes = new ArrayList();
            this.currentAccount = i;
            this.peer = inputPeer;
            this.msgId = i2;
            this.option = bArr;
            this.onUpdate = runnable;
            this.onClick = callback;
        }

        public void load() {
            if (this.completed || this.loading) {
                return;
            }
            this.loading = true;
            TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
            String str = this.nextOffset;
            tL_messages_getPollVotes.limit = str != null ? 10 : 15;
            tL_messages_getPollVotes.peer = this.peer;
            tL_messages_getPollVotes.id = this.msgId;
            tL_messages_getPollVotes.option = this.option;
            tL_messages_getPollVotes.offset = str;
            ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getPollVotes, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    RecentVotersCell.VotesList.$r8$lambda$Tr7iptCM8TYxXZb72A_eJ6F0Hso(this.f$0, (TLRPC.TL_messages_votesList) obj, (TLRPC.TL_error) obj2);
                }
            });
        }

        public static void $r8$lambda$Tr7iptCM8TYxXZb72A_eJ6F0Hso(VotesList votesList, TLRPC.TL_messages_votesList tL_messages_votesList, TLRPC.TL_error tL_error) {
            votesList.loading = false;
            if (tL_messages_votesList != null) {
                MessagesController.getInstance(votesList.currentAccount).putUsers(tL_messages_votesList.users, false);
                MessagesController.getInstance(votesList.currentAccount).putChats(tL_messages_votesList.chats, false);
                String str = tL_messages_votesList.next_offset;
                votesList.nextOffset = str;
                votesList.completed = str == null;
                votesList.count = tL_messages_votesList.count;
                votesList.votes.addAll(tL_messages_votesList.votes);
                Runnable runnable = votesList.onUpdate;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            votesList.nextOffset = null;
            votesList.completed = true;
        }

        public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            arrayList.clear();
            ArrayList arrayList2 = this.votes;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                TLRPC.MessagePeerVote messagePeerVote = (TLRPC.MessagePeerVote) obj;
                final long peerDialogId = DialogObject.getPeerDialogId(messagePeerVote.peer);
                arrayList.add(Factory.of(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId), peerDialogId, messagePeerVote.date, new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        RecentVotersCell.VotesList.m2958$r8$lambda$FWhD4iE8bM0SvRU6HI1zX8FouU(this.f$0, peerDialogId, view);
                    }
                }));
            }
            if (this.completed) {
                return;
            }
            if (this.votes.isEmpty()) {
                arrayList.add(FlickerFactory2.of());
                arrayList.add(FlickerFactory2.of());
                arrayList.add(FlickerFactory2.of());
                arrayList.add(FlickerFactory2.of());
                arrayList.add(FlickerFactory2.of());
                return;
            }
            arrayList.add(FlickerFactory.of());
        }

        public static void m2958$r8$lambda$FWhD4iE8bM0SvRU6HI1zX8FouU(VotesList votesList, long j, View view) {
            Utilities.Callback callback = votesList.onClick;
            if (callback != null) {
                callback.run(Long.valueOf(j));
            }
        }
    }

    public static class FlickerFactory extends UItem.UItemFactory {
        static {
            UItem.UItemFactory.setup(new FlickerFactory());
        }

        @Override
        public FlickerLoadingView createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
            flickerLoadingView.setViewType(16);
            flickerLoadingView.setMinimumHeight(AndroidUtilities.dp(48.0f));
            return flickerLoadingView;
        }

        public static UItem of() {
            return UItem.ofFactory(FlickerFactory.class);
        }
    }

    public static class FlickerFactory2 extends UItem.UItemFactory {
        static {
            UItem.UItemFactory.setup(new FlickerFactory2());
        }

        @Override
        public FlickerLoadingView createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
            flickerLoadingView.setViewType(16);
            flickerLoadingView.setMinimumHeight(AndroidUtilities.dp(48.0f));
            return flickerLoadingView;
        }

        public static UItem of() {
            return UItem.ofFactory(FlickerFactory2.class);
        }
    }

    public static class Factory extends UItem.UItemFactory {
        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public MessageSeenView.UserCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            MessageSeenView.UserCell userCell = new MessageSeenView.UserCell(context);
            userCell.setBackground(Theme.getSelectorDrawable(false));
            return userCell;
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            MessageSeenView.UserCell userCell = (MessageSeenView.UserCell) view;
            userCell.setUser((TLObject) uItem.object, uItem.intValue, true);
            userCell.setOnClickListener(uItem.clickCallback);
        }

        public static UItem of(TLObject tLObject, long j, int i, View.OnClickListener onClickListener) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.object = tLObject;
            uItemOfFactory.longValue = j;
            uItemOfFactory.intValue = i;
            uItemOfFactory.clickCallback = onClickListener;
            return uItemOfFactory;
        }

        @Override
        public boolean equals(UItem uItem, UItem uItem2) {
            return uItem.longValue == uItem2.longValue;
        }

        @Override
        public boolean contentsEquals(UItem uItem, UItem uItem2) {
            return uItem.longValue == uItem2.longValue;
        }
    }
}
