package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkEditActivity;
import org.telegram.ui.ManageLinksActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;

public class InviteLinkBottomSheet extends BottomSheet {
    Adapter adapter;
    private boolean canEdit;
    private long chatId;
    int creatorHeaderRow;
    int creatorRow;
    int divider2Row;
    int divider3Row;
    int dividerRow;
    int emptyHintRow;
    int emptyView;
    int emptyView2;
    int emptyView3;
    int expiredEndRow;
    int expiredHeaderRow;
    int expiredStartRow;
    ArrayList expiredUsers;
    BaseFragment fragment;
    boolean hasMore;
    private boolean ignoreLayout;
    TLRPC.ChatFull info;
    TLRPC.TL_chatInviteExported invite;
    InviteDelegate inviteDelegate;
    private boolean isChannel;
    public boolean isNeedReopen;
    int joinedEndRow;
    int joinedHeaderRow;
    int joinedStartRow;
    ArrayList joinedUsers;
    int linkActionRow;
    int linkInfoRow;
    private RecyclerListView listView;
    int loadingRow;
    private boolean permanent;
    int requestedEndRow;
    int requestedHeaderRow;
    int requestedStartRow;
    ArrayList requestedUsers;
    int revenueHeaderRow;
    int revenueRow;
    int rowCount;
    private int scrollOffsetY;
    private View shadow;
    private AnimatorSet shadowAnimation;
    private final long timeDif;
    private TextView titleTextView;
    private boolean titleVisible;
    HashMap users;
    boolean usersLoading;

    public interface InviteDelegate {
        void linkRevoked(TLRPC.TL_chatInviteExported tL_chatInviteExported);

        void onLinkDeleted(TLRPC.TL_chatInviteExported tL_chatInviteExported);

        void onLinkEdited(TLRPC.TL_chatInviteExported tL_chatInviteExported);

        void permanentLinkReplaced(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteExported tL_chatInviteExported2);
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public InviteLinkBottomSheet(final Context context, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.ChatFull chatFull, final HashMap map, final BaseFragment baseFragment, final long j, boolean z, boolean z2) {
        super(context, false);
        this.joinedUsers = new ArrayList();
        this.expiredUsers = new ArrayList();
        this.requestedUsers = new ArrayList();
        this.canEdit = true;
        this.isNeedReopen = false;
        this.invite = tL_chatInviteExported;
        this.users = map;
        this.fragment = baseFragment;
        this.info = chatFull;
        this.chatId = j;
        this.permanent = z;
        this.isChannel = z2;
        int i = Theme.key_windowBackgroundGray;
        setBackgroundColor(getThemedColor(i));
        fixNavigationBar(getThemedColor(i));
        this.behindKeyboardColorKey = -1;
        if (this.users == null) {
            this.users = new HashMap();
        }
        this.timeDif = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        FrameLayout frameLayout = new FrameLayout(context) {
            private boolean fullHeight;
            private RectF rect = new RectF();
            private Boolean statusBarOpen;

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && InviteLinkBottomSheet.this.scrollOffsetY != 0 && motionEvent.getY() < InviteLinkBottomSheet.this.scrollOffsetY) {
                    InviteLinkBottomSheet.this.lambda$new$0();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !InviteLinkBottomSheet.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            protected void onMeasure(int i2, int i3) {
                int size = View.MeasureSpec.getSize(i3);
                InviteLinkBottomSheet.this.ignoreLayout = true;
                setPadding(((BottomSheet) InviteLinkBottomSheet.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) InviteLinkBottomSheet.this).backgroundPaddingLeft, 0);
                InviteLinkBottomSheet.this.ignoreLayout = false;
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                this.fullHeight = true;
            }

            @Override
            protected void onLayout(boolean z3, int i2, int i3, int i4, int i5) {
                super.onLayout(z3, i2, i3, i4, i5);
                InviteLinkBottomSheet.this.updateLayout();
            }

            @Override
            public void requestLayout() {
                if (InviteLinkBottomSheet.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override
            protected void onDraw(android.graphics.Canvas r13) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.InviteLinkBottomSheet.AnonymousClass1.onDraw(android.graphics.Canvas):void");
            }

            private void updateLightStatusBar(boolean z3) {
                Boolean bool = this.statusBarOpen;
                if (bool == null || bool.booleanValue() != z3) {
                    boolean z4 = AndroidUtilities.computePerceivedBrightness(InviteLinkBottomSheet.this.getThemedColor(Theme.key_dialogBackground)) > 0.721f;
                    boolean z5 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(InviteLinkBottomSheet.this.getThemedColor(Theme.key_actionBarDefault), 855638016)) > 0.721f;
                    this.statusBarOpen = Boolean.valueOf(z3);
                    if (!z3) {
                        z4 = z5;
                    }
                    AndroidUtilities.setLightStatusBar(InviteLinkBottomSheet.this.getWindow(), z4);
                }
            }
        };
        this.containerView = frameLayout;
        frameLayout.setWillNotDraw(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f);
        View view = new View(context);
        this.shadow = view;
        view.setAlpha(0.0f);
        this.shadow.setVisibility(4);
        this.shadow.setTag(1);
        this.containerView.addView(this.shadow, layoutParams);
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            int lastH;

            @Override
            public void requestLayout() {
                if (InviteLinkBottomSheet.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override
            protected void onMeasure(int i2, int i3) {
                if (this.lastH != View.MeasureSpec.getSize(i3)) {
                    this.lastH = View.MeasureSpec.getSize(i3);
                    InviteLinkBottomSheet.this.ignoreLayout = true;
                    InviteLinkBottomSheet.this.listView.setPadding(0, 0, 0, 0);
                    InviteLinkBottomSheet.this.ignoreLayout = false;
                    measure(i2, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
                    int measuredHeight = getMeasuredHeight();
                    int i4 = this.lastH;
                    int i5 = (int) ((i4 / 5.0f) * 2.0f);
                    if (i5 < (i4 - measuredHeight) + AndroidUtilities.dp(60.0f)) {
                        i5 = this.lastH - measuredHeight;
                    }
                    InviteLinkBottomSheet.this.ignoreLayout = true;
                    InviteLinkBottomSheet.this.listView.setPadding(0, i5, 0, 0);
                    InviteLinkBottomSheet.this.ignoreLayout = false;
                    measure(i2, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
                }
                super.onMeasure(i2, i3);
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.listView.setTag(14);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        this.listView.setLayoutManager(linearLayoutManager);
        RecyclerListView recyclerListView2 = this.listView;
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView2.setAdapter(adapter);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setClipToPadding(false);
        this.listView.setNestedScrollingEnabled(true);
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                InviteLinkBottomSheet.this.updateLayout();
                InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                if (!inviteLinkBottomSheet.hasMore || inviteLinkBottomSheet.usersLoading) {
                    return;
                }
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                InviteLinkBottomSheet inviteLinkBottomSheet2 = InviteLinkBottomSheet.this;
                if (inviteLinkBottomSheet2.rowCount - iFindLastVisibleItemPosition < 10) {
                    inviteLinkBottomSheet2.loadUsers();
                }
            }
        });
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i2) throws Resources.NotFoundException {
                this.f$0.lambda$new$3(tL_chatInviteExported, map, chatFull, context, j, baseFragment, view2, i2);
            }
        });
        TextView textView = new TextView(context);
        this.titleTextView = textView;
        textView.setLines(1);
        this.titleTextView.setSingleLine(true);
        this.titleTextView.setTextSize(1, 20.0f);
        this.titleTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.titleTextView.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        this.titleTextView.setGravity(16);
        this.titleTextView.setTypeface(AndroidUtilities.bold());
        if (!z) {
            if (tL_chatInviteExported.expired) {
                this.titleTextView.setText(LocaleController.getString(R.string.ExpiredLink));
            } else if (tL_chatInviteExported.revoked) {
                this.titleTextView.setText(LocaleController.getString(R.string.RevokedLink));
            } else {
                this.titleTextView.setText(LocaleController.getString(R.string.InviteLink));
            }
            this.titleVisible = true;
        } else {
            this.titleTextView.setText(LocaleController.getString(R.string.InviteLink));
            this.titleVisible = false;
            this.titleTextView.setVisibility(4);
            this.titleTextView.setAlpha(0.0f);
        }
        if (!TextUtils.isEmpty(tL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, this.titleTextView.getPaint().getFontMetricsInt(), false);
            this.titleTextView.setText(spannableStringBuilder);
        }
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, !this.titleVisible ? 0.0f : 44.0f, 0.0f, 0.0f));
        this.containerView.addView(this.titleTextView, LayoutHelper.createFrame(-1, !this.titleVisible ? 44.0f : 50.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        updateRows();
        loadUsers();
        if (map == null || map.get(Long.valueOf(tL_chatInviteExported.admin_id)) == null) {
            loadCreator();
        }
        updateColors();
    }

    public void lambda$new$3(final org.telegram.tgnet.TLRPC.TL_chatInviteExported r16, java.util.HashMap r17, org.telegram.tgnet.TLRPC.ChatFull r18, final android.content.Context r19, final long r20, final org.telegram.ui.ActionBar.BaseFragment r22, android.view.View r23, int r24) throws android.content.res.Resources.NotFoundException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.InviteLinkBottomSheet.lambda$new$3(org.telegram.tgnet.TLRPC$TL_chatInviteExported, java.util.HashMap, org.telegram.tgnet.TLRPC$ChatFull, android.content.Context, long, org.telegram.ui.ActionBar.BaseFragment, android.view.View, int):void");
    }

    public void lambda$new$1(final AlertDialog alertDialog, final Context context, final long j, final TLRPC.TL_chatInviteExported tL_chatInviteExported, final TLRPC.TL_chatInviteImporter tL_chatInviteImporter, final TLRPC.ChannelParticipant channelParticipant) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws Resources.NotFoundException {
                this.f$0.lambda$new$0(alertDialog, context, j, tL_chatInviteExported, tL_chatInviteImporter, channelParticipant);
            }
        });
    }

    public void lambda$new$0(AlertDialog alertDialog, Context context, long j, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant) throws Resources.NotFoundException {
        alertDialog.dismissUnless(400L);
        showSubscriptionSheet(context, this.currentAccount, -j, tL_chatInviteExported.subscription_pricing, tL_chatInviteImporter, channelParticipant, this.resourcesProvider);
    }

    public void lambda$new$2(TLRPC.User user, BaseFragment baseFragment) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        baseFragment.presentFragment(new ProfileActivity(bundle));
        this.isNeedReopen = true;
    }

    public void updateColors() {
        TextView textView = this.titleTextView;
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
            this.titleTextView.setLinkTextColor(Theme.getColor(Theme.key_dialogTextLink));
            this.titleTextView.setHighlightColor(Theme.getColor(Theme.key_dialogLinkSelection));
            if (!this.titleVisible) {
                this.titleTextView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            }
        }
        this.listView.setGlowColor(Theme.getColor(Theme.key_dialogScrollGlow));
        this.shadow.setBackgroundColor(Theme.getColor(Theme.key_dialogShadowLine));
        setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        int hiddenChildCount = this.listView.getHiddenChildCount();
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            updateColorForView(this.listView.getChildAt(i));
        }
        for (int i2 = 0; i2 < hiddenChildCount; i2++) {
            updateColorForView(this.listView.getHiddenChildAt(i2));
        }
        int cachedChildCount = this.listView.getCachedChildCount();
        for (int i3 = 0; i3 < cachedChildCount; i3++) {
            updateColorForView(this.listView.getCachedChildAt(i3));
        }
        int attachedScrapChildCount = this.listView.getAttachedScrapChildCount();
        for (int i4 = 0; i4 < attachedScrapChildCount; i4++) {
            updateColorForView(this.listView.getAttachedScrapChildAt(i4));
        }
        this.containerView.invalidate();
    }

    @Override
    public void show() {
        super.show();
        this.isNeedReopen = false;
    }

    private void updateColorForView(View view) {
        if (view instanceof HeaderCell) {
            ((HeaderCell) view).getTextView().setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader));
            return;
        }
        if (view instanceof LinkActionView) {
            ((LinkActionView) view).updateColors();
        } else if (view instanceof TextInfoPrivacyCell) {
            ((TextInfoPrivacyCell) view).setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4));
        } else if (view instanceof UserCell) {
            ((UserCell) view).update(0);
        }
    }

    private void loadCreator() {
        TLRPC.TL_users_getUsers tL_users_getUsers = new TLRPC.TL_users_getUsers();
        tL_users_getUsers.id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(this.invite.admin_id));
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_users_getUsers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$loadCreator$5(tLObject, tL_error);
            }
        });
    }

    public void lambda$loadCreator$5(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadCreator$4(tLObject);
            }
        });
    }

    public void lambda$loadCreator$4(TLObject tLObject) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (vector.objects.isEmpty()) {
                return;
            }
            this.users.put(Long.valueOf(this.invite.admin_id), (TLRPC.User) vector.objects.get(0));
            this.adapter.notifyDataSetChanged();
        }
    }

    private void updateRows() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.InviteLinkBottomSheet.updateRows():void");
    }

    class Adapter extends RecyclerListView.SelectionAdapter {
        private Adapter() {
        }

        @Override
        public int getItemViewType(int i) {
            InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
            if (i == inviteLinkBottomSheet.creatorHeaderRow || i == inviteLinkBottomSheet.requestedHeaderRow || i == inviteLinkBottomSheet.joinedHeaderRow || i == inviteLinkBottomSheet.revenueHeaderRow) {
                return 0;
            }
            if (i == inviteLinkBottomSheet.creatorRow) {
                return 1;
            }
            if (i >= inviteLinkBottomSheet.requestedStartRow && i < inviteLinkBottomSheet.requestedEndRow) {
                return 1;
            }
            if (i >= inviteLinkBottomSheet.joinedStartRow && i < inviteLinkBottomSheet.joinedEndRow) {
                return 1;
            }
            if (i == inviteLinkBottomSheet.dividerRow || i == inviteLinkBottomSheet.divider2Row) {
                return 2;
            }
            if (i == inviteLinkBottomSheet.linkActionRow) {
                return 3;
            }
            if (i == inviteLinkBottomSheet.linkInfoRow) {
                return 4;
            }
            if (i == inviteLinkBottomSheet.loadingRow) {
                return 5;
            }
            if (i == inviteLinkBottomSheet.emptyView || i == inviteLinkBottomSheet.emptyView2 || i == inviteLinkBottomSheet.emptyView3) {
                return 6;
            }
            if (i == inviteLinkBottomSheet.divider3Row) {
                return 7;
            }
            if (i == inviteLinkBottomSheet.emptyHintRow) {
                return 8;
            }
            return i == inviteLinkBottomSheet.revenueRow ? 9 : 0;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View revenueUserCell;
            Context context = viewGroup.getContext();
            switch (i) {
                case 1:
                    revenueUserCell = InviteLinkBottomSheet.this.new RevenueUserCell(context);
                    break;
                case 2:
                    revenueUserCell = new ShadowSectionCell(context, 12, Theme.getColor(Theme.key_windowBackgroundGray));
                    break;
                case 3:
                    InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                    LinkActionView linkActionView = new LinkActionView(context, inviteLinkBottomSheet.fragment, inviteLinkBottomSheet, inviteLinkBottomSheet.chatId, false, InviteLinkBottomSheet.this.isChannel) {
                        @Override
                        public void showBulletin(int i2, CharSequence charSequence) {
                            InviteLinkBottomSheet inviteLinkBottomSheet2 = InviteLinkBottomSheet.this;
                            Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(inviteLinkBottomSheet2.container, ((BottomSheet) inviteLinkBottomSheet2).resourcesProvider).createSimpleBulletin(i2, charSequence);
                            bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
                            bulletinCreateSimpleBulletin.show(true);
                        }
                    };
                    linkActionView.setDelegate(new AnonymousClass2());
                    linkActionView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    revenueUserCell = linkActionView;
                    break;
                case 4:
                    revenueUserCell = InviteLinkBottomSheet.this.new TimerPrivacyCell(context);
                    break;
                case 5:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setViewType(10);
                    flickerLoadingView.showDate(false);
                    flickerLoadingView.setPaddingLeft(AndroidUtilities.dp(10.0f));
                    revenueUserCell = flickerLoadingView;
                    break;
                case 6:
                    revenueUserCell = new View(context) {
                        @Override
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(5.0f), 1073741824));
                        }
                    };
                    break;
                case 7:
                    revenueUserCell = new ShadowSectionCell(context, 12);
                    break;
                case 8:
                    revenueUserCell = InviteLinkBottomSheet.this.new EmptyHintRow(context);
                    break;
                case 9:
                    revenueUserCell = InviteLinkBottomSheet.this.new RevenueCell(context);
                    break;
                default:
                    revenueUserCell = new GraySectionCell(context, ((BottomSheet) InviteLinkBottomSheet.this).resourcesProvider);
                    break;
            }
            revenueUserCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(revenueUserCell);
        }

        class AnonymousClass2 implements LinkActionView.Delegate {
            @Override
            public void showUsersForPermanentLink() {
                LinkActionView.Delegate.CC.$default$showUsersForPermanentLink(this);
            }

            AnonymousClass2() {
            }

            @Override
            public void revokeLink() {
                InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                BaseFragment baseFragment = inviteLinkBottomSheet.fragment;
                if (baseFragment instanceof ManageLinksActivity) {
                    ((ManageLinksActivity) baseFragment).revokeLink(inviteLinkBottomSheet.invite);
                } else {
                    TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
                    InviteLinkBottomSheet inviteLinkBottomSheet2 = InviteLinkBottomSheet.this;
                    tL_messages_editExportedChatInvite.link = inviteLinkBottomSheet2.invite.link;
                    tL_messages_editExportedChatInvite.revoked = true;
                    tL_messages_editExportedChatInvite.peer = MessagesController.getInstance(((BottomSheet) inviteLinkBottomSheet2).currentAccount).getInputPeer(-InviteLinkBottomSheet.this.chatId);
                    ConnectionsManager.getInstance(((BottomSheet) InviteLinkBottomSheet.this).currentAccount).sendRequest(tL_messages_editExportedChatInvite, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$revokeLink$1(tLObject, tL_error);
                        }
                    });
                }
                InviteLinkBottomSheet.this.lambda$new$0();
            }

            public void lambda$revokeLink$1(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$revokeLink$0(tL_error, tLObject);
                    }
                });
            }

            public void lambda$revokeLink$0(TLRPC.TL_error tL_error, TLObject tLObject) {
                if (tL_error == null) {
                    if (tLObject instanceof TLRPC.TL_messages_exportedChatInviteReplaced) {
                        TLRPC.TL_messages_exportedChatInviteReplaced tL_messages_exportedChatInviteReplaced = (TLRPC.TL_messages_exportedChatInviteReplaced) tLObject;
                        InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                        TLRPC.ChatFull chatFull = inviteLinkBottomSheet.info;
                        if (chatFull != null) {
                            chatFull.exported_invite = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        InviteDelegate inviteDelegate = inviteLinkBottomSheet.inviteDelegate;
                        if (inviteDelegate != null) {
                            inviteDelegate.permanentLinkReplaced(inviteLinkBottomSheet.invite, chatFull.exported_invite);
                            return;
                        }
                        return;
                    }
                    InviteLinkBottomSheet inviteLinkBottomSheet2 = InviteLinkBottomSheet.this;
                    TLRPC.ChatFull chatFull2 = inviteLinkBottomSheet2.info;
                    if (chatFull2 != null) {
                        int i = chatFull2.invitesCount - 1;
                        chatFull2.invitesCount = i;
                        if (i < 0) {
                            chatFull2.invitesCount = 0;
                        }
                        MessagesStorage.getInstance(((BottomSheet) inviteLinkBottomSheet2).currentAccount).saveChatLinksCount(InviteLinkBottomSheet.this.chatId, InviteLinkBottomSheet.this.info.invitesCount);
                    }
                    InviteLinkBottomSheet inviteLinkBottomSheet3 = InviteLinkBottomSheet.this;
                    InviteDelegate inviteDelegate2 = inviteLinkBottomSheet3.inviteDelegate;
                    if (inviteDelegate2 != null) {
                        inviteDelegate2.linkRevoked(inviteLinkBottomSheet3.invite);
                    }
                }
            }

            @Override
            public void editLink() {
                InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                BaseFragment baseFragment = inviteLinkBottomSheet.fragment;
                if (baseFragment instanceof ManageLinksActivity) {
                    ((ManageLinksActivity) baseFragment).editLink(inviteLinkBottomSheet.invite);
                } else {
                    LinkEditActivity linkEditActivity = new LinkEditActivity(1, inviteLinkBottomSheet.chatId);
                    linkEditActivity.setInviteToEdit(InviteLinkBottomSheet.this.invite);
                    linkEditActivity.setCallback(new LinkEditActivity.Callback() {
                        @Override
                        public void onLinkCreated(TLObject tLObject) {
                        }

                        @Override
                        public void onLinkRemoved(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
                        }

                        @Override
                        public void revokeLink(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
                        }

                        @Override
                        public void onLinkEdited(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject) {
                            InviteDelegate inviteDelegate = InviteLinkBottomSheet.this.inviteDelegate;
                            if (inviteDelegate != null) {
                                inviteDelegate.onLinkEdited(tL_chatInviteExported);
                            }
                        }
                    });
                    InviteLinkBottomSheet.this.fragment.presentFragment(linkEditActivity);
                }
                InviteLinkBottomSheet.this.lambda$new$0();
            }

            @Override
            public void removeLink() {
                InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                BaseFragment baseFragment = inviteLinkBottomSheet.fragment;
                if (baseFragment instanceof ManageLinksActivity) {
                    ((ManageLinksActivity) baseFragment).deleteLink(inviteLinkBottomSheet.invite);
                } else {
                    TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
                    InviteLinkBottomSheet inviteLinkBottomSheet2 = InviteLinkBottomSheet.this;
                    tL_messages_deleteExportedChatInvite.link = inviteLinkBottomSheet2.invite.link;
                    tL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(((BottomSheet) inviteLinkBottomSheet2).currentAccount).getInputPeer(-InviteLinkBottomSheet.this.chatId);
                    ConnectionsManager.getInstance(((BottomSheet) InviteLinkBottomSheet.this).currentAccount).sendRequest(tL_messages_deleteExportedChatInvite, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$removeLink$3(tLObject, tL_error);
                        }
                    });
                }
                InviteLinkBottomSheet.this.lambda$new$0();
            }

            public void lambda$removeLink$3(TLObject tLObject, final TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$removeLink$2(tL_error);
                    }
                });
            }

            public void lambda$removeLink$2(TLRPC.TL_error tL_error) {
                InviteLinkBottomSheet inviteLinkBottomSheet;
                InviteDelegate inviteDelegate;
                if (tL_error != null || (inviteDelegate = (inviteLinkBottomSheet = InviteLinkBottomSheet.this).inviteDelegate) == null) {
                    return;
                }
                inviteDelegate.onLinkDeleted(inviteLinkBottomSheet.invite);
            }
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r20, int r21) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.InviteLinkBottomSheet.Adapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        public void lambda$onBindViewHolder$0(TLRPC.User user, String str, boolean z, boolean z2, boolean z3, View view) {
            TagEditCell.showInfoSheet(InviteLinkBottomSheet.this.getContext(), ((BottomSheet) InviteLinkBottomSheet.this).currentAccount, -InviteLinkBottomSheet.this.chatId, user, str, z, z2, z3, ((BottomSheet) InviteLinkBottomSheet.this).resourcesProvider);
        }

        @Override
        public int getItemCount() {
            return InviteLinkBottomSheet.this.rowCount;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
            return adapterPosition == inviteLinkBottomSheet.creatorRow ? inviteLinkBottomSheet.invite.admin_id != UserConfig.getInstance(((BottomSheet) inviteLinkBottomSheet).currentAccount).clientUserId : (adapterPosition >= inviteLinkBottomSheet.joinedStartRow && adapterPosition < inviteLinkBottomSheet.joinedEndRow) || (adapterPosition >= inviteLinkBottomSheet.requestedStartRow && adapterPosition < inviteLinkBottomSheet.requestedEndRow);
        }
    }

    public void updateLayout() {
        if (this.listView.getChildCount() <= 0) {
            RecyclerListView recyclerListView = this.listView;
            int paddingTop = recyclerListView.getPaddingTop();
            this.scrollOffsetY = paddingTop;
            recyclerListView.setTopGlowOffset(paddingTop);
            this.titleTextView.setTranslationY(this.scrollOffsetY);
            this.shadow.setTranslationY(this.scrollOffsetY);
            this.containerView.invalidate();
            return;
        }
        int i = 0;
        View childAt = this.listView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
        int top = childAt.getTop();
        if (top >= 0 && holder != null && holder.getAdapterPosition() == 0) {
            runShadowAnimation(false);
            i = top;
        } else {
            runShadowAnimation(true);
        }
        if (this.scrollOffsetY != i) {
            RecyclerListView recyclerListView2 = this.listView;
            this.scrollOffsetY = i;
            recyclerListView2.setTopGlowOffset(i);
            TextView textView = this.titleTextView;
            if (textView != null) {
                textView.setTranslationY(this.scrollOffsetY);
            }
            this.shadow.setTranslationY(this.scrollOffsetY);
            this.containerView.invalidate();
        }
    }

    private void runShadowAnimation(final boolean z) {
        if ((!z || this.shadow.getTag() == null) && (z || this.shadow.getTag() != null)) {
            return;
        }
        this.shadow.setTag(z ? null : 1);
        if (z) {
            this.shadow.setVisibility(0);
            this.titleTextView.setVisibility(0);
        }
        AnimatorSet animatorSet = this.shadowAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.shadowAnimation = animatorSet2;
        View view = this.shadow;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z ? 1.0f : 0.0f));
        if (!this.titleVisible) {
            this.shadowAnimation.playTogether(ObjectAnimator.ofFloat(this.titleTextView, (Property<TextView, Float>) property, z ? 1.0f : 0.0f));
        }
        this.shadowAnimation.setDuration(150L);
        this.shadowAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (InviteLinkBottomSheet.this.shadowAnimation == null || !InviteLinkBottomSheet.this.shadowAnimation.equals(animator)) {
                    return;
                }
                if (!z) {
                    InviteLinkBottomSheet.this.shadow.setVisibility(4);
                }
                InviteLinkBottomSheet.this.shadowAnimation = null;
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (InviteLinkBottomSheet.this.shadowAnimation == null || !InviteLinkBottomSheet.this.shadowAnimation.equals(animator)) {
                    return;
                }
                InviteLinkBottomSheet.this.shadowAnimation = null;
            }
        });
        this.shadowAnimation.start();
    }

    public void loadUsers() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.InviteLinkBottomSheet.loadUsers():void");
    }

    public void lambda$loadUsers$7(final List list, final boolean z, final boolean z2, final boolean z3, final boolean z4, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadUsers$6(tL_error, tLObject, list, z, z2, z3, z4);
            }
        });
    }

    public void lambda$loadUsers$6(TLRPC.TL_error tL_error, TLObject tLObject, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        if (tL_error == null) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
            list.addAll(tL_messages_chatInviteImporters.importers);
            for (int i = 0; i < tL_messages_chatInviteImporters.users.size(); i++) {
                TLRPC.User user = tL_messages_chatInviteImporters.users.get(i);
                this.users.put(Long.valueOf(user.id), user);
            }
            this.hasMore = !z ? !(!z2 ? !(list.size() < tL_messages_chatInviteImporters.count || z3 || z4) : !(list.size() < tL_messages_chatInviteImporters.count || z3)) : list.size() >= tL_messages_chatInviteImporters.count;
            updateRows();
        }
        this.usersLoading = false;
    }

    public void setInviteDelegate(InviteDelegate inviteDelegate) {
        this.inviteDelegate = inviteDelegate;
    }

    private class TimerPrivacyCell extends TextInfoPrivacyCell {
        boolean timer;
        Runnable timerRunnable;

        public TimerPrivacyCell(Context context) {
            super(context);
            this.timerRunnable = new Runnable() {
                @Override
                public void run() {
                    int childAdapterPosition;
                    if (InviteLinkBottomSheet.this.listView != null && InviteLinkBottomSheet.this.listView.getAdapter() != null && (childAdapterPosition = InviteLinkBottomSheet.this.listView.getChildAdapterPosition(TimerPrivacyCell.this)) >= 0) {
                        InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                        inviteLinkBottomSheet.adapter.onBindViewHolder(inviteLinkBottomSheet.listView.getChildViewHolder(TimerPrivacyCell.this), childAdapterPosition);
                    }
                    AndroidUtilities.runOnUIThread(this);
                }
            };
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            runTimer();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            cancelTimer();
        }

        public void cancelTimer() {
            AndroidUtilities.cancelRunOnUIThread(this.timerRunnable);
        }

        public void runTimer() {
            cancelTimer();
            if (this.timer) {
                AndroidUtilities.runOnUIThread(this.timerRunnable, 500L);
            }
        }
    }

    private class EmptyHintRow extends FrameLayout {
        TextView textView;

        public EmptyHintRow(Context context) {
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 14.0f);
            this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
            this.textView.setGravity(1);
            addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(84.0f), 1073741824));
        }
    }

    public void setCanEdit(boolean z) {
        this.canEdit = z;
    }

    private class RevenueUserCell extends UserCell {
        public final LinearLayout layout;
        public final TextView periodView;
        public final TextView priceView;

        public RevenueUserCell(Context context) {
            super(context, 6, 0, true);
            LinearLayout linearLayout = new LinearLayout(context);
            this.layout = linearLayout;
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            this.priceView = textView;
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            textView.setTextSize(1, 16.0f);
            textView.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 5));
            TextView textView2 = new TextView(context);
            this.periodView = textView2;
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2));
            textView2.setTextSize(1, 13.0f);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 5, 0, 1, 0, 0));
            addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
        }

        public void setRevenue(TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, int i) {
            if (tL_starsSubscriptionPricing == null) {
                this.priceView.setText((CharSequence) null);
                this.periodView.setText((CharSequence) null);
                setRightPadding(0, true, true);
                return;
            }
            SpannableStringBuilder spannableStringBuilderReplaceStarsWithPlain = StarsIntroActivity.replaceStarsWithPlain("⭐️" + tL_starsSubscriptionPricing.amount, 0.7f);
            int i2 = tL_starsSubscriptionPricing.period;
            String string = i2 == 2592000 ? LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth) : i2 == 300 ? "per 5 minutes" : "per each minute";
            this.priceView.setText(spannableStringBuilderReplaceStarsWithPlain);
            this.periodView.setText(string);
            setRightPadding((int) Math.max(HintView2.measureCorrectly(spannableStringBuilderReplaceStarsWithPlain, this.priceView.getPaint()), HintView2.measureCorrectly(string, this.periodView.getPaint())), true, true);
            this.statusTextView.setText(LocaleController.formatJoined(i));
        }
    }

    private class RevenueCell extends FrameLayout {
        public final ImageView imageView;
        public final TextView subtitleView;
        public final TextView titleView;

        public RevenueCell(Context context) {
            super(context);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setBackground(Theme.createCircleDrawable(46, Theme.getColor(Theme.key_avatar_backgroundGreen), Theme.getColor(Theme.key_avatar_background2Green)));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setImageResource(R.drawable.large_income);
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            addView(imageView, LayoutHelper.createFrame(46, 46.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 16.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 51, 72.0f, 9.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.subtitleView = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 51, 72.0f, 32.0f, 0.0f, 0.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
        }

        public void set(TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, int i) {
            String string;
            if (tL_starsSubscriptionPricing == null) {
                return;
            }
            int i2 = tL_starsSubscriptionPricing.period;
            String str = "";
            if (i2 == 2592000) {
                TextView textView = this.titleView;
                StringBuilder sb = new StringBuilder();
                sb.append(LocaleController.formatString(R.string.LinkRevenuePrice, Long.valueOf(tL_starsSubscriptionPricing.amount)));
                if (i > 0) {
                    str = " x " + i;
                }
                sb.append(str);
                textView.setText(StarsIntroActivity.replaceStarsWithPlain(sb.toString(), 0.8f));
                this.subtitleView.setText(i == 0 ? LocaleController.getString(R.string.NoOneSubscribed) : LocaleController.formatString(R.string.LinkRevenuePriceInfo, BillingController.getInstance().formatCurrency((long) ((tL_starsSubscriptionPricing.amount / 1000.0d) * MessagesController.getInstance(((BottomSheet) InviteLinkBottomSheet.this).currentAccount).starsUsdWithdrawRate1000 * i), "USD")));
                return;
            }
            String str2 = i2 == 300 ? "5min" : "min";
            TextView textView2 = this.titleView;
            StringBuilder sb2 = new StringBuilder();
            Locale locale = Locale.US;
            sb2.append(String.format(locale, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing.amount), str2));
            if (i > 0) {
                str = " x " + i;
            }
            sb2.append(str);
            textView2.setText(StarsIntroActivity.replaceStarsWithPlain(sb2.toString(), 0.8f));
            TextView textView3 = this.subtitleView;
            if (i == 0) {
                string = LocaleController.getString(R.string.NoOneSubscribed);
            } else {
                string = String.format(locale, "you get approximately %1$s %2$s", BillingController.getInstance().formatCurrency((long) ((tL_starsSubscriptionPricing.amount / 1000.0d) * MessagesController.getInstance(((BottomSheet) InviteLinkBottomSheet.this).currentAccount).starsUsdWithdrawRate1000 * i), "USD"), "for " + str2);
            }
            textView3.setText(string);
        }
    }

    public static BottomSheet showSubscriptionSheet(final Context context, int i, long j, TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing, final TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.ChannelParticipant channelParticipant, Theme.ResourcesProvider resourcesProvider) throws Resources.NotFoundException {
        BottomSheet.Builder builder;
        Object obj;
        Object obj2;
        BottomSheet.Builder builder2 = new BottomSheet.Builder(context, false, resourcesProvider);
        final BottomSheet[] bottomSheetArr = new BottomSheet[1];
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 7, 0, 0, 0, 10));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setRoundRadius(AndroidUtilities.dp(50.0f));
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        if (j >= 0) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            avatarDrawable.setInfo(user);
            backupImageView.setForUserOrChat(user, avatarDrawable);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
            avatarDrawable.setInfo(chat);
            backupImageView.setForUserOrChat(chat, avatarDrawable);
        }
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(100, 100, 17));
        Drawable drawable = context.getResources().getDrawable(R.drawable.star_small_outline);
        drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground, resourcesProvider), PorterDuff.Mode.SRC_IN));
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.star_small_inner);
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(drawable);
        frameLayout.addView(imageView, LayoutHelper.createFrame(28, 28, 17));
        imageView.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView.setTranslationY(AndroidUtilities.dp(35.0f));
        imageView.setScaleX(1.1f);
        imageView.setScaleY(1.1f);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(drawable2);
        frameLayout.addView(imageView2, LayoutHelper.createFrame(28, 28, 17));
        imageView2.setTranslationX(AndroidUtilities.dp(34.0f));
        imageView2.setTranslationY(AndroidUtilities.dp(35.0f));
        TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.StarsSubscriptionTitle));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        int i2 = Theme.key_windowBackgroundWhiteGrayText4;
        textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        int i3 = tL_starsSubscriptionPricing.period;
        if (i3 == 2592000) {
            builder = builder2;
            textView2.setText(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tL_starsSubscriptionPricing.amount)), 0.8f));
            obj = "min";
            obj2 = "5min";
        } else {
            builder = builder2;
            String str = i3 == 300 ? "5min" : "min";
            obj = "min";
            obj2 = "5min";
            textView2.setText(StarsIntroActivity.replaceStarsWithPlain(String.format(Locale.US, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing.amount), str), 0.8f));
        }
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        textView3.setTextColor(Theme.getColor(i2, resourcesProvider));
        int i4 = tL_starsSubscriptionPricing.period;
        if (i4 == 2592000) {
            textView3.setText(LocaleController.formatString(R.string.StarsParticipantSubscriptionApproxMonth, BillingController.getInstance().formatCurrency((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * MessagesController.getInstance(i).starsUsdWithdrawRate1000), "USD")));
        } else {
            textView3.setText(String.format(Locale.US, "appx. %1$s per %2$s", BillingController.getInstance().formatCurrency((int) ((tL_starsSubscriptionPricing.amount / 1000.0d) * MessagesController.getInstance(i).starsUsdWithdrawRate1000), "USD"), i4 == 300 ? obj2 : obj));
        }
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        TableView tableView = new TableView(context, resourcesProvider);
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        linksTextView.setEllipsize(TextUtils.TruncateAt.END);
        int i5 = Theme.key_chat_messageLinkIn;
        linksTextView.setTextColor(Theme.getColor(i5, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(i5, resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setSingleLine(true);
        linksTextView.setDisablePaddingsOffsetY(true);
        AvatarSpan avatarSpan = new AvatarSpan(linksTextView, i, 24.0f);
        TLRPC.User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
        boolean z = user2 == null;
        String userName = UserObject.getUserName(user2);
        avatarSpan.setUser(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(avatarSpan, 0, 1, 33);
        spannableStringBuilder.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View view) {
                bottomSheetArr[0].lambda$new$0();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(ProfileActivity.of(tL_chatInviteImporter.user_id));
                }
            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                textPaint.setUnderlineText(false);
            }
        }, 3, spannableStringBuilder.length(), 33);
        linksTextView.setText(spannableStringBuilder);
        if (!z) {
            tableView.addRowUnpadded(LocaleController.getString(R.string.StarsParticipantSubscription), linksTextView);
        }
        CharSequence string = LocaleController.getString(R.string.StarsParticipantSubscriptionStart);
        int i6 = R.string.formatDateAtTime;
        tableView.addRow(string, LocaleController.formatString(i6, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tL_chatInviteImporter.date * 1000))));
        int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        if (channelParticipant != null) {
            tableView.addRow(LocaleController.getString(channelParticipant.subscription_until_date > currentTime ? R.string.StarsParticipantSubscriptionRenews : R.string.StarsParticipantSubscriptionExpired), LocaleController.formatString(i6, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(channelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(channelParticipant.subscription_until_date * 1000))));
        }
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 0.0f, 17.0f, 0.0f, 0.0f));
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        linksTextView2.setLinkTextColor(Theme.getColor(i5, resourcesProvider));
        linksTextView2.setTextSize(1, 14.0f);
        linksTextView2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() {
            @Override
            public final void run() {
                InviteLinkBottomSheet.lambda$showSubscriptionSheet$8(context);
            }
        }));
        linksTextView2.setGravity(17);
        linearLayout.addView(linksTextView2, LayoutHelper.createLinear(-1, -2, 14.0f, 15.0f, 14.0f, 15.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
        buttonWithCounterView.setText(LocaleController.getString(R.string.OK), false);
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48));
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                InviteLinkBottomSheet.lambda$showSubscriptionSheet$9(bottomSheetArr, view);
            }
        });
        BottomSheet.Builder builder3 = builder;
        builder3.setCustomView(linearLayout);
        BottomSheet bottomSheetCreate = builder3.create();
        bottomSheetArr[0] = bottomSheetCreate;
        bottomSheetCreate.useBackgroundTopPadding = false;
        bottomSheetCreate.fixNavigationBar();
        bottomSheetArr[0].show();
        return bottomSheetArr[0];
    }

    public static void lambda$showSubscriptionSheet$8(Context context) {
        Browser.openUrl(context, LocaleController.getString(R.string.StarsTOSLink));
    }

    public static void lambda$showSubscriptionSheet$9(BottomSheet[] bottomSheetArr, View view) {
        bottomSheetArr[0].lambda$new$0();
    }
}
