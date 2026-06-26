package org.telegram.ui.community;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.firebase.sessions.SessionDetails$$ExternalSyntheticBackport0;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.community.sheet.CommunityAddOptionsSheet;

public class CommunityCreateActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private CommunityHeaderView communityHeaderView;
    private FrameLayout containerView;
    private TLRPC.Chat currentChat;
    private long dialogId;
    private ArrayList joinedCommunities;
    private UniversalRecyclerView listView;
    private NotificationCenter.ObserversGroup observersGroup;

    public boolean onLongClick(UItem uItem, View view, int i, float f, float f2) {
        return false;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    public CommunityCreateActivity(Bundle bundle) {
        super(bundle);
    }

    @Override
    public boolean onFragmentCreate() {
        this.dialogId = this.arguments.getLong("dialog_id", 0L);
        this.currentChat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
        this.joinedCommunities = getMessagesController().getJoinedCommunities();
        getMessagesController().fetchJoinedCommunities(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$onFragmentCreate$0((ArrayList) obj);
            }
        }, this.classGuid);
        this.observersGroup = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    public void lambda$onFragmentCreate$0(ArrayList arrayList) {
        ArrayList arrayList2 = this.joinedCommunities;
        boolean z = arrayList2 == null || arrayList2.isEmpty();
        this.joinedCommunities = arrayList;
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(z);
        }
    }

    @Override
    public View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    CommunityCreateActivity.this.finishFragment();
                }
            }
        });
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        blurredBackgroundSourceColor.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        this.actionBar.setBackground(null);
        this.actionBar.setupGlass(blurredBackgroundDrawableViewFactory, BlurredBackgroundProviderImpl.topPanelChatActivity(this.resourceProvider));
        this.actionBar.setGlassOnlyBack();
        FrameLayout frameLayout = new FrameLayout(context);
        this.containerView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
        CommunityHeaderView communityHeaderView = new CommunityHeaderView(context, this.resourceProvider);
        this.communityHeaderView = communityHeaderView;
        communityHeaderView.setTitle(LocaleController.getString(R.string.CommunityTitle));
        this.communityHeaderView.setSubtitle(LocaleController.getString(R.string.CommunityDescription));
        this.communityHeaderView.setTag(-33024);
        this.communityHeaderView.avatarView.setForUserOrChat(chat, new AvatarDrawable(chat));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return Boolean.valueOf(this.f$0.onLongClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue()));
            }
        });
        this.listView = universalRecyclerView;
        universalRecyclerView.setClipToPadding(false);
        this.listView.adapter.setApplyBackground(false);
        this.listView.setSections();
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.containerView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 48));
        FrameLayout frameLayout2 = this.containerView;
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        String string;
        arrayList.add(UItem.asCustomShadow(0, this.communityHeaderView));
        arrayList.add(UItem.asButton(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity)).accent());
        arrayList.add(UItem.asSpace(2, AndroidUtilities.dp(14.0f)));
        ArrayList arrayList2 = this.joinedCommunities;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        arrayList.add(UItem.asHeader(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
        Iterator it = this.joinedCommunities.iterator();
        while (it.hasNext()) {
            TLRPC.Chat chat = (TLRPC.Chat) it.next();
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(chat.id);
            UItem uItemAsProfileCell = UItem.asProfileCell(chat);
            uItemAsProfileCell.id = SessionDetails$$ExternalSyntheticBackport0.m(chat.id);
            if (chatFull != null) {
                ArrayList<TL_communities.CommunityPeer> arrayList3 = chatFull.linked_peers;
                string = LocaleController.formatPluralString("Chats", arrayList3 != null ? arrayList3.size() : 0, new Object[0]);
            } else {
                string = LocaleController.getString(R.string.Loading);
            }
            uItemAsProfileCell.subtext = string;
            arrayList.add(uItemAsProfileCell);
        }
    }

    public void onClick(UItem uItem, View view, int i, float f, float f2) {
        if (uItem.id == 1) {
            AlertsCreator.createSimpleTextInputAlert(getContext(), this, LocaleController.getString(R.string.CommunityNewCommunityTitle), null, LocaleController.getString(R.string.CommunityNewCommunityNameHint), null, Integer.MAX_VALUE, LocaleController.getString(R.string.Create), this.resourceProvider, new MessagesStorage.StringCallback() {
                @Override
                public final void run(String str) {
                    this.f$0.createNewCommunity(str);
                }
            });
        }
        Object obj = uItem.object;
        if (obj instanceof TLRPC.Chat) {
            final TLRPC.Chat chat = (TLRPC.Chat) obj;
            showDialog(new CommunityAddOptionsSheet(getContext(), chat, getMessagesController().getChat(Long.valueOf(-this.dialogId)), new Utilities.Callback() {
                @Override
                public final void run(Object obj2) {
                    this.f$0.lambda$onClick$1(chat, (Boolean) obj2);
                }
            }));
        }
    }

    public void lambda$onClick$1(TLRPC.Chat chat, Boolean bool) {
        linkToCommunity(chat.id, bool.booleanValue());
    }

    public void createNewCommunity(final String str) {
        if (!ChatObject.isChannel(this.currentChat)) {
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            alertDialog.showDelayed(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.dialogId, this, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j) {
                    this.f$0.lambda$createNewCommunity$2(alertDialog, str, j);
                }
            });
            return;
        }
        getMessagesController().createCommunity(str, this.dialogId, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.lambda$createNewCommunity$3((TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public void lambda$createNewCommunity$2(AlertDialog alertDialog, String str, long j) {
        alertDialog.dismiss();
        if (j == 0) {
            return;
        }
        this.dialogId = -j;
        this.currentChat = getMessagesController().getChat(Long.valueOf(j));
        createNewCommunity(str);
    }

    public void lambda$createNewCommunity$3(TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            BulletinFactory.of(this).showForError(tL_error);
        } else {
            CommunityUtils.onCommunityLinkSuccess(this, this.dialogId, 0);
        }
    }

    private void linkToCommunity(final long j, final boolean z) {
        if (!ChatObject.isChannel(this.currentChat)) {
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            alertDialog.showDelayed(250L);
            getMessagesController().convertToMegaGroup(getParentActivity(), -this.dialogId, this, new MessagesStorage.LongCallback() {
                @Override
                public final void run(long j2) {
                    this.f$0.lambda$linkToCommunity$4(alertDialog, j, z, j2);
                }
            });
            return;
        }
        CommunityUtils.linkToCommunityWithoutConvert(this, this.currentAccount, -this.dialogId, j, z);
    }

    public void lambda$linkToCommunity$4(AlertDialog alertDialog, long j, boolean z, long j2) {
        alertDialog.dismiss();
        if (j2 == 0) {
            return;
        }
        this.dialogId = -j2;
        this.currentChat = getMessagesController().getChat(Long.valueOf(j2));
        linkToCommunity(j, z);
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        super.onInsets(i, i2, i3, i4);
        this.listView.setPadding(0, i2, 0, i4);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            View viewFindViewByItemId = this.listView.findViewByItemId(SessionDetails$$ExternalSyntheticBackport0.m(chatFull.id));
            if (viewFindViewByItemId instanceof ProfileSearchCell) {
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewFindViewByItemId;
                ArrayList<TL_communities.CommunityPeer> arrayList = chatFull.linked_peers;
                profileSearchCell.setSubLabel(LocaleController.formatPluralString("Chats", arrayList != null ? arrayList.size() : 0, new Object[0]));
                return;
            }
            this.listView.adapter.update(false);
        }
    }

    @Override
    public void onFragmentDestroy() {
        NotificationCenter.ObserversGroup observersGroup = this.observersGroup;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.observersGroup = null;
        }
        super.onFragmentDestroy();
    }

    public static class CommunityHeaderView extends FrameLayout implements Theme.Colorable {
        public final BackupImageView avatarView;
        private final Drawable communityCardsDrawable;
        private final Theme.ResourcesProvider resourcesProvider;
        private final TextView subtitleView;
        private final TextView titleView;

        public CommunityHeaderView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            this.communityCardsDrawable = context.getResources().getDrawable(R.drawable.community_cards).mutate();
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarView = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(20.0f));
            addView(backupImageView, LayoutHelper.createFrame(72, 72.0f, 49, 0.0f, 36.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 20.0f);
            textView.setGravity(17);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 24.0f, 123.0f, 24.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 49, 32.0f, 157.0f, 32.0f, 0.0f));
            updateColors();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            DrawableUtils.drawCommunityCardDrawable(canvas, this.communityCardsDrawable, this.avatarView.getLeft() + (this.avatarView.getWidth() / 2.0f), this.avatarView.getTop() + (this.avatarView.getHeight() / 2.0f), this.avatarView.getHeight());
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(218.0f), 1073741824));
        }

        @Override
        public void updateColors() {
            TextView textView = this.titleView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
            this.subtitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider));
            this.communityCardsDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
        }

        public void setTitle(CharSequence charSequence) {
            this.titleView.setText(charSequence);
        }

        public void setSubtitle(CharSequence charSequence) {
            this.subtitleView.setText(charSequence);
        }
    }
}
