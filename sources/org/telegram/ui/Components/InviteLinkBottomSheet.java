package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import org.telegram.tgnet.TLRPC$ChannelParticipant;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatParticipant;
import org.telegram.tgnet.TLRPC$TL_channelParticipantAdmin;
import org.telegram.tgnet.TLRPC$TL_channelParticipantCreator;
import org.telegram.tgnet.TLRPC$TL_chatChannelParticipant;
import org.telegram.tgnet.TLRPC$TL_chatInviteExported;
import org.telegram.tgnet.TLRPC$TL_chatInviteImporter;
import org.telegram.tgnet.TLRPC$TL_chatParticipantAdmin;
import org.telegram.tgnet.TLRPC$TL_chatParticipantCreator;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters;
import org.telegram.tgnet.TLRPC$TL_messages_deleteExportedChatInvite;
import org.telegram.tgnet.TLRPC$TL_messages_editExportedChatInvite;
import org.telegram.tgnet.TLRPC$TL_messages_exportedChatInviteReplaced;
import org.telegram.tgnet.TLRPC$TL_starsSubscriptionPricing;
import org.telegram.tgnet.TLRPC$TL_users_getUsers;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$Vector;
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
import org.telegram.ui.Components.InviteLinkBottomSheet;
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
    ArrayList<TLRPC$TL_chatInviteImporter> expiredUsers;
    BaseFragment fragment;
    boolean hasMore;
    private boolean ignoreLayout;
    TLRPC$ChatFull info;
    TLRPC$TL_chatInviteExported invite;
    InviteDelegate inviteDelegate;
    private boolean isChannel;
    public boolean isNeedReopen;
    int joinedEndRow;
    int joinedHeaderRow;
    int joinedStartRow;
    ArrayList<TLRPC$TL_chatInviteImporter> joinedUsers;
    int linkActionRow;
    int linkInfoRow;
    private RecyclerListView listView;
    int loadingRow;
    private boolean permanent;
    int requestedEndRow;
    int requestedHeaderRow;
    int requestedStartRow;
    ArrayList<TLRPC$TL_chatInviteImporter> requestedUsers;
    int revenueHeaderRow;
    int revenueRow;
    int rowCount;
    private int scrollOffsetY;
    private View shadow;
    private AnimatorSet shadowAnimation;
    private final long timeDif;
    private TextView titleTextView;
    private boolean titleVisible;
    HashMap<Long, TLRPC$User> users;
    boolean usersLoading;

    public interface InviteDelegate {
        void linkRevoked(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported);

        void onLinkDeleted(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported);

        void onLinkEdited(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported);

        void permanentLinkReplaced(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported, TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported2);
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    public InviteLinkBottomSheet(final Context context, final TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported, final TLRPC$ChatFull tLRPC$ChatFull, final HashMap<Long, TLRPC$User> hashMap, final BaseFragment baseFragment, final long j, boolean z, boolean z2) {
        super(context, false);
        this.joinedUsers = new ArrayList<>();
        this.expiredUsers = new ArrayList<>();
        this.requestedUsers = new ArrayList<>();
        this.canEdit = true;
        this.isNeedReopen = false;
        this.invite = tLRPC$TL_chatInviteExported;
        this.users = hashMap;
        this.fragment = baseFragment;
        this.info = tLRPC$ChatFull;
        this.chatId = j;
        this.permanent = z;
        this.isChannel = z2;
        fixNavigationBar(getThemedColor(Theme.key_graySection));
        if (this.users == null) {
            this.users = new HashMap<>();
        }
        this.timeDif = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - (System.currentTimeMillis() / 1000);
        FrameLayout frameLayout = new FrameLayout(context) {
            private boolean fullHeight;
            private RectF rect = new RectF();
            private Boolean statusBarOpen;

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && InviteLinkBottomSheet.this.scrollOffsetY != 0 && motionEvent.getY() < InviteLinkBottomSheet.this.scrollOffsetY) {
                    InviteLinkBottomSheet.this.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !InviteLinkBottomSheet.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            protected void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i2);
                if (Build.VERSION.SDK_INT >= 21) {
                    InviteLinkBottomSheet.this.ignoreLayout = true;
                    setPadding(((BottomSheet) InviteLinkBottomSheet.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) InviteLinkBottomSheet.this).backgroundPaddingLeft, 0);
                    InviteLinkBottomSheet.this.ignoreLayout = false;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                this.fullHeight = true;
            }

            @Override
            protected void onLayout(boolean z3, int i, int i2, int i3, int i4) {
                super.onLayout(z3, i, i2, i3, i4);
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
            protected void onDraw(android.graphics.Canvas r12) {
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
            public void onMeasure(int i, int i2) {
                if (this.lastH != View.MeasureSpec.getSize(i2)) {
                    this.lastH = View.MeasureSpec.getSize(i2);
                    InviteLinkBottomSheet.this.ignoreLayout = true;
                    InviteLinkBottomSheet.this.listView.setPadding(0, 0, 0, 0);
                    InviteLinkBottomSheet.this.ignoreLayout = false;
                    measure(i, View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
                    int measuredHeight = getMeasuredHeight();
                    int i3 = this.lastH;
                    int i4 = (int) ((i3 / 5.0f) * 2.0f);
                    if (i4 < (i3 - measuredHeight) + AndroidUtilities.dp(60.0f)) {
                        i4 = this.lastH - measuredHeight;
                    }
                    InviteLinkBottomSheet.this.ignoreLayout = true;
                    InviteLinkBottomSheet.this.listView.setPadding(0, i4, 0, 0);
                    InviteLinkBottomSheet.this.ignoreLayout = false;
                    measure(i, View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
                }
                super.onMeasure(i, i2);
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setTag(14);
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
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                InviteLinkBottomSheet.this.updateLayout();
                InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                if (!inviteLinkBottomSheet.hasMore || inviteLinkBottomSheet.usersLoading) {
                    return;
                }
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                InviteLinkBottomSheet inviteLinkBottomSheet2 = InviteLinkBottomSheet.this;
                if (inviteLinkBottomSheet2.rowCount - findLastVisibleItemPosition < 10) {
                    inviteLinkBottomSheet2.loadUsers();
                }
            }
        });
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i) {
                InviteLinkBottomSheet.this.lambda$new$3(tLRPC$TL_chatInviteExported, hashMap, tLRPC$ChatFull, context, j, baseFragment, view2, i);
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
            if (tLRPC$TL_chatInviteExported.expired) {
                this.titleTextView.setText(LocaleController.getString(R.string.ExpiredLink));
            } else if (tLRPC$TL_chatInviteExported.revoked) {
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
        if (!TextUtils.isEmpty(tLRPC$TL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tLRPC$TL_chatInviteExported.title);
            Emoji.replaceEmoji((CharSequence) spannableStringBuilder, this.titleTextView.getPaint().getFontMetricsInt(), (int) this.titleTextView.getPaint().getTextSize(), false);
            this.titleTextView.setText(spannableStringBuilder);
        }
        this.containerView.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, !this.titleVisible ? 0.0f : 44.0f, 0.0f, 0.0f));
        this.containerView.addView(this.titleTextView, LayoutHelper.createFrame(-1, !this.titleVisible ? 44.0f : 50.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        updateRows();
        loadUsers();
        if (hashMap == null || hashMap.get(Long.valueOf(tLRPC$TL_chatInviteExported.admin_id)) == null) {
            loadCreator();
        }
        updateColors();
    }

    public void lambda$new$3(final org.telegram.tgnet.TLRPC$TL_chatInviteExported r16, java.util.HashMap r17, org.telegram.tgnet.TLRPC$ChatFull r18, final android.content.Context r19, final long r20, final org.telegram.ui.ActionBar.BaseFragment r22, android.view.View r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.InviteLinkBottomSheet.lambda$new$3(org.telegram.tgnet.TLRPC$TL_chatInviteExported, java.util.HashMap, org.telegram.tgnet.TLRPC$ChatFull, android.content.Context, long, org.telegram.ui.ActionBar.BaseFragment, android.view.View, int):void");
    }

    public void lambda$new$1(final AlertDialog alertDialog, final Context context, final long j, final TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported, final TLRPC$TL_chatInviteImporter tLRPC$TL_chatInviteImporter, final TLRPC$ChannelParticipant tLRPC$ChannelParticipant) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                InviteLinkBottomSheet.this.lambda$new$0(alertDialog, context, j, tLRPC$TL_chatInviteExported, tLRPC$TL_chatInviteImporter, tLRPC$ChannelParticipant);
            }
        });
    }

    public void lambda$new$0(AlertDialog alertDialog, Context context, long j, TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported, TLRPC$TL_chatInviteImporter tLRPC$TL_chatInviteImporter, TLRPC$ChannelParticipant tLRPC$ChannelParticipant) {
        alertDialog.dismissUnless(400L);
        showSubscriptionSheet(context, this.currentAccount, -j, tLRPC$TL_chatInviteExported.subscription_pricing, tLRPC$TL_chatInviteImporter, tLRPC$ChannelParticipant, this.resourcesProvider);
    }

    public void lambda$new$2(TLRPC$User tLRPC$User, BaseFragment baseFragment) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", tLRPC$User.id);
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
        setBackgroundColor(Theme.getColor(Theme.key_dialogBackground));
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
        } else if (view instanceof LinkActionView) {
            ((LinkActionView) view).updateColors();
        } else if (view instanceof TextInfoPrivacyCell) {
            CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(view.getContext(), R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
            combinedDrawable.setFullsize(true);
            view.setBackground(combinedDrawable);
            ((TextInfoPrivacyCell) view).setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4));
        } else if (view instanceof UserCell) {
            ((UserCell) view).update(0);
        }
        RecyclerView.ViewHolder childViewHolder = this.listView.getChildViewHolder(view);
        if (childViewHolder != null) {
            if (childViewHolder.getItemViewType() == 7) {
                CombinedDrawable combinedDrawable2 = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(view.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow), 0, 0);
                combinedDrawable2.setFullsize(true);
                view.setBackgroundDrawable(combinedDrawable2);
                return;
            }
            if (childViewHolder.getItemViewType() == 2) {
                CombinedDrawable combinedDrawable3 = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(view.getContext(), R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow), 0, 0);
                combinedDrawable3.setFullsize(true);
                view.setBackgroundDrawable(combinedDrawable3);
            }
        }
    }

    private void loadCreator() {
        TLRPC$TL_users_getUsers tLRPC$TL_users_getUsers = new TLRPC$TL_users_getUsers();
        tLRPC$TL_users_getUsers.id.add(MessagesController.getInstance(UserConfig.selectedAccount).getInputUser(this.invite.admin_id));
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tLRPC$TL_users_getUsers, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                InviteLinkBottomSheet.this.lambda$loadCreator$4(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadCreator$4(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public void run() {
                if (tLRPC$TL_error == null) {
                    TLRPC$User tLRPC$User = (TLRPC$User) ((TLRPC$Vector) tLObject).objects.get(0);
                    InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                    inviteLinkBottomSheet.users.put(Long.valueOf(inviteLinkBottomSheet.invite.admin_id), tLRPC$User);
                    InviteLinkBottomSheet.this.adapter.notifyDataSetChanged();
                }
            }
        });
    }

    private void updateRows() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.InviteLinkBottomSheet.updateRows():void");
    }

    public class Adapter extends RecyclerListView.SelectionAdapter {
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
            View view;
            Context context = viewGroup.getContext();
            switch (i) {
                case 1:
                    view = new RevenueUserCell(context);
                    break;
                case 2:
                    view = new ShadowSectionCell(context, 12, Theme.getColor(Theme.key_windowBackgroundGray));
                    break;
                case 3:
                    InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                    LinkActionView linkActionView = new LinkActionView(context, inviteLinkBottomSheet.fragment, inviteLinkBottomSheet, inviteLinkBottomSheet.chatId, false, InviteLinkBottomSheet.this.isChannel) {
                        @Override
                        public void showBulletin(int i2, CharSequence charSequence) {
                            InviteLinkBottomSheet inviteLinkBottomSheet2 = InviteLinkBottomSheet.this;
                            Bulletin createSimpleBulletin = BulletinFactory.of(inviteLinkBottomSheet2.container, ((BottomSheet) inviteLinkBottomSheet2).resourcesProvider).createSimpleBulletin(i2, charSequence);
                            createSimpleBulletin.hideAfterBottomSheet = false;
                            createSimpleBulletin.show(true);
                        }
                    };
                    linkActionView.setDelegate(new AnonymousClass2());
                    linkActionView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    view = linkActionView;
                    break;
                case 4:
                    View timerPrivacyCell = new TimerPrivacyCell(context);
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    combinedDrawable.setFullsize(true);
                    timerPrivacyCell.setBackground(combinedDrawable);
                    view = timerPrivacyCell;
                    break;
                case 5:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setViewType(10);
                    flickerLoadingView.showDate(false);
                    flickerLoadingView.setPaddingLeft(AndroidUtilities.dp(10.0f));
                    view = flickerLoadingView;
                    break;
                case 6:
                    view = new View(context) {
                        @Override
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(5.0f), 1073741824));
                        }
                    };
                    break;
                case 7:
                    View shadowSectionCell = new ShadowSectionCell(context, 12);
                    CombinedDrawable combinedDrawable2 = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow), 0, 0);
                    combinedDrawable2.setFullsize(true);
                    shadowSectionCell.setBackgroundDrawable(combinedDrawable2);
                    view = shadowSectionCell;
                    break;
                case 8:
                    view = new EmptyHintRow(context);
                    break;
                case 9:
                    view = new RevenueCell(context);
                    break;
                default:
                    view = new GraySectionCell(context, ((BottomSheet) InviteLinkBottomSheet.this).resourcesProvider);
                    break;
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(view);
        }

        public class AnonymousClass2 implements LinkActionView.Delegate {
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
                    TLRPC$TL_messages_editExportedChatInvite tLRPC$TL_messages_editExportedChatInvite = new TLRPC$TL_messages_editExportedChatInvite();
                    InviteLinkBottomSheet inviteLinkBottomSheet2 = InviteLinkBottomSheet.this;
                    tLRPC$TL_messages_editExportedChatInvite.link = inviteLinkBottomSheet2.invite.link;
                    tLRPC$TL_messages_editExportedChatInvite.revoked = true;
                    tLRPC$TL_messages_editExportedChatInvite.peer = MessagesController.getInstance(((BottomSheet) inviteLinkBottomSheet2).currentAccount).getInputPeer(-InviteLinkBottomSheet.this.chatId);
                    ConnectionsManager.getInstance(((BottomSheet) InviteLinkBottomSheet.this).currentAccount).sendRequest(tLRPC$TL_messages_editExportedChatInvite, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            InviteLinkBottomSheet.Adapter.AnonymousClass2.this.lambda$revokeLink$1(tLObject, tLRPC$TL_error);
                        }
                    });
                }
                InviteLinkBottomSheet.this.dismiss();
            }

            public void lambda$revokeLink$1(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        InviteLinkBottomSheet.Adapter.AnonymousClass2.this.lambda$revokeLink$0(tLRPC$TL_error, tLObject);
                    }
                });
            }

            public void lambda$revokeLink$0(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
                if (tLRPC$TL_error == null) {
                    if (tLObject instanceof TLRPC$TL_messages_exportedChatInviteReplaced) {
                        TLRPC$TL_messages_exportedChatInviteReplaced tLRPC$TL_messages_exportedChatInviteReplaced = (TLRPC$TL_messages_exportedChatInviteReplaced) tLObject;
                        InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                        TLRPC$ChatFull tLRPC$ChatFull = inviteLinkBottomSheet.info;
                        if (tLRPC$ChatFull != null) {
                            tLRPC$ChatFull.exported_invite = (TLRPC$TL_chatInviteExported) tLRPC$TL_messages_exportedChatInviteReplaced.new_invite;
                        }
                        InviteDelegate inviteDelegate = inviteLinkBottomSheet.inviteDelegate;
                        if (inviteDelegate != null) {
                            inviteDelegate.permanentLinkReplaced(inviteLinkBottomSheet.invite, tLRPC$ChatFull.exported_invite);
                            return;
                        }
                        return;
                    }
                    InviteLinkBottomSheet inviteLinkBottomSheet2 = InviteLinkBottomSheet.this;
                    TLRPC$ChatFull tLRPC$ChatFull2 = inviteLinkBottomSheet2.info;
                    if (tLRPC$ChatFull2 != null) {
                        int i = tLRPC$ChatFull2.invitesCount - 1;
                        tLRPC$ChatFull2.invitesCount = i;
                        if (i < 0) {
                            tLRPC$ChatFull2.invitesCount = 0;
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
                        public void onLinkRemoved(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported) {
                        }

                        @Override
                        public void revokeLink(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported) {
                        }

                        @Override
                        public void onLinkEdited(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported, TLObject tLObject) {
                            InviteDelegate inviteDelegate = InviteLinkBottomSheet.this.inviteDelegate;
                            if (inviteDelegate != null) {
                                inviteDelegate.onLinkEdited(tLRPC$TL_chatInviteExported);
                            }
                        }
                    });
                    InviteLinkBottomSheet.this.fragment.presentFragment(linkEditActivity);
                }
                InviteLinkBottomSheet.this.dismiss();
            }

            @Override
            public void removeLink() {
                InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                BaseFragment baseFragment = inviteLinkBottomSheet.fragment;
                if (baseFragment instanceof ManageLinksActivity) {
                    ((ManageLinksActivity) baseFragment).deleteLink(inviteLinkBottomSheet.invite);
                } else {
                    TLRPC$TL_messages_deleteExportedChatInvite tLRPC$TL_messages_deleteExportedChatInvite = new TLRPC$TL_messages_deleteExportedChatInvite();
                    InviteLinkBottomSheet inviteLinkBottomSheet2 = InviteLinkBottomSheet.this;
                    tLRPC$TL_messages_deleteExportedChatInvite.link = inviteLinkBottomSheet2.invite.link;
                    tLRPC$TL_messages_deleteExportedChatInvite.peer = MessagesController.getInstance(((BottomSheet) inviteLinkBottomSheet2).currentAccount).getInputPeer(-InviteLinkBottomSheet.this.chatId);
                    ConnectionsManager.getInstance(((BottomSheet) InviteLinkBottomSheet.this).currentAccount).sendRequest(tLRPC$TL_messages_deleteExportedChatInvite, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            InviteLinkBottomSheet.Adapter.AnonymousClass2.this.lambda$removeLink$3(tLObject, tLRPC$TL_error);
                        }
                    });
                }
                InviteLinkBottomSheet.this.dismiss();
            }

            public void lambda$removeLink$3(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        InviteLinkBottomSheet.Adapter.AnonymousClass2.this.lambda$removeLink$2(tLRPC$TL_error);
                    }
                });
            }

            public void lambda$removeLink$2(TLRPC$TL_error tLRPC$TL_error) {
                InviteLinkBottomSheet inviteLinkBottomSheet;
                InviteDelegate inviteDelegate;
                if (tLRPC$TL_error != null || (inviteDelegate = (inviteLinkBottomSheet = InviteLinkBottomSheet.this).inviteDelegate) == null) {
                    return;
                }
                inviteDelegate.onLinkDeleted(inviteLinkBottomSheet.invite);
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            int i3;
            TLRPC$TL_chatInviteImporter tLRPC$TL_chatInviteImporter;
            long j;
            TLRPC$ChatParticipant tLRPC$ChatParticipant;
            String str;
            TLRPC$TL_starsSubscriptionPricing tLRPC$TL_starsSubscriptionPricing;
            int itemViewType = viewHolder.getItemViewType();
            String str2 = null;
            if (itemViewType == 0) {
                GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                if (i == inviteLinkBottomSheet.creatorHeaderRow) {
                    graySectionCell.setText(LocaleController.getString(R.string.LinkCreatedeBy));
                    graySectionCell.setRightText(null);
                    return;
                }
                if (i == inviteLinkBottomSheet.revenueHeaderRow) {
                    graySectionCell.setText(LocaleController.getString(R.string.LinkRevenue));
                    graySectionCell.setRightText(null);
                    return;
                }
                if (i == inviteLinkBottomSheet.joinedHeaderRow) {
                    TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported = inviteLinkBottomSheet.invite;
                    int i4 = tLRPC$TL_chatInviteExported.usage;
                    if (i4 > 0) {
                        graySectionCell.setText(LocaleController.formatPluralString("PeopleJoined", i4, new Object[0]));
                    } else {
                        graySectionCell.setText(LocaleController.getString(tLRPC$TL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined));
                    }
                    TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported2 = InviteLinkBottomSheet.this.invite;
                    if (!tLRPC$TL_chatInviteExported2.expired && !tLRPC$TL_chatInviteExported2.revoked && (i2 = tLRPC$TL_chatInviteExported2.usage_limit) > 0 && (i3 = tLRPC$TL_chatInviteExported2.usage) > 0) {
                        graySectionCell.setRightText(LocaleController.formatPluralString("PeopleJoinedRemaining", i2 - i3, new Object[0]));
                        return;
                    } else {
                        graySectionCell.setRightText(null);
                        return;
                    }
                }
                if (i == inviteLinkBottomSheet.expiredHeaderRow) {
                    graySectionCell.setText(LocaleController.formatPluralString("PeopleSubscriptionExpired", inviteLinkBottomSheet.invite.subscription_expired, new Object[0]));
                    graySectionCell.setRightText(null);
                    return;
                } else {
                    if (i == inviteLinkBottomSheet.requestedHeaderRow) {
                        graySectionCell.setText(LocaleController.formatPluralString("JoinRequests", inviteLinkBottomSheet.invite.requested, new Object[0]));
                        graySectionCell.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            if (itemViewType == 1) {
                RevenueUserCell revenueUserCell = (RevenueUserCell) viewHolder.itemView;
                InviteLinkBottomSheet inviteLinkBottomSheet2 = InviteLinkBottomSheet.this;
                if (i == inviteLinkBottomSheet2.creatorRow) {
                    j = inviteLinkBottomSheet2.invite.admin_id;
                    tLRPC$TL_chatInviteImporter = null;
                } else {
                    int i5 = inviteLinkBottomSheet2.joinedStartRow;
                    ArrayList<TLRPC$TL_chatInviteImporter> arrayList = inviteLinkBottomSheet2.joinedUsers;
                    int i6 = inviteLinkBottomSheet2.expiredStartRow;
                    if (i6 != -1 && i >= i6) {
                        arrayList = inviteLinkBottomSheet2.expiredUsers;
                        i5 = i6;
                    }
                    int i7 = inviteLinkBottomSheet2.requestedStartRow;
                    if (i7 != -1 && i >= i7) {
                        arrayList = inviteLinkBottomSheet2.requestedUsers;
                        i5 = i7;
                    }
                    tLRPC$TL_chatInviteImporter = arrayList.get(i - i5);
                    j = tLRPC$TL_chatInviteImporter.user_id;
                }
                TLRPC$User tLRPC$User = InviteLinkBottomSheet.this.users.get(Long.valueOf(j));
                TLRPC$ChatFull tLRPC$ChatFull = InviteLinkBottomSheet.this.info;
                if (tLRPC$ChatFull != null && tLRPC$ChatFull.participants != null) {
                    for (int i8 = 0; i8 < InviteLinkBottomSheet.this.info.participants.participants.size(); i8++) {
                        if (InviteLinkBottomSheet.this.info.participants.participants.get(i8).user_id == j) {
                            tLRPC$ChatParticipant = InviteLinkBottomSheet.this.info.participants.participants.get(i8);
                            break;
                        }
                    }
                }
                tLRPC$ChatParticipant = null;
                InviteLinkBottomSheet inviteLinkBottomSheet3 = InviteLinkBottomSheet.this;
                if (i == inviteLinkBottomSheet3.creatorRow) {
                    TLRPC$User tLRPC$User2 = inviteLinkBottomSheet3.users.get(Long.valueOf(j));
                    if (tLRPC$User2 == null) {
                        tLRPC$User2 = MessagesController.getInstance(((BottomSheet) InviteLinkBottomSheet.this).currentAccount).getUser(Long.valueOf(InviteLinkBottomSheet.this.invite.admin_id));
                    }
                    str = tLRPC$User2 != null ? LocaleController.formatDateAudio(InviteLinkBottomSheet.this.invite.date, false) : null;
                    tLRPC$User = tLRPC$User2;
                } else {
                    str = null;
                }
                if (i == InviteLinkBottomSheet.this.creatorRow && tLRPC$ChatParticipant != null) {
                    if (tLRPC$ChatParticipant instanceof TLRPC$TL_chatChannelParticipant) {
                        TLRPC$ChannelParticipant tLRPC$ChannelParticipant = ((TLRPC$TL_chatChannelParticipant) tLRPC$ChatParticipant).channelParticipant;
                        if (!TextUtils.isEmpty(tLRPC$ChannelParticipant.rank)) {
                            str2 = tLRPC$ChannelParticipant.rank;
                        } else if (tLRPC$ChannelParticipant instanceof TLRPC$TL_channelParticipantCreator) {
                            str2 = LocaleController.getString(R.string.ChannelCreator);
                        } else if (tLRPC$ChannelParticipant instanceof TLRPC$TL_channelParticipantAdmin) {
                            str2 = LocaleController.getString(R.string.ChannelAdmin);
                        }
                    } else if (tLRPC$ChatParticipant instanceof TLRPC$TL_chatParticipantCreator) {
                        str2 = LocaleController.getString(R.string.ChannelCreator);
                    } else if (tLRPC$ChatParticipant instanceof TLRPC$TL_chatParticipantAdmin) {
                        str2 = LocaleController.getString(R.string.ChannelAdmin);
                    }
                }
                revenueUserCell.setAdminRole(str2);
                revenueUserCell.setData(tLRPC$User, null, str, 0, false);
                InviteLinkBottomSheet inviteLinkBottomSheet4 = InviteLinkBottomSheet.this;
                if (i == inviteLinkBottomSheet4.creatorRow || (tLRPC$TL_starsSubscriptionPricing = inviteLinkBottomSheet4.invite.subscription_pricing) == null || tLRPC$TL_chatInviteImporter == null) {
                    return;
                }
                revenueUserCell.setRevenue(tLRPC$TL_starsSubscriptionPricing, tLRPC$TL_chatInviteImporter.date);
                return;
            }
            if (itemViewType == 3) {
                LinkActionView linkActionView = (LinkActionView) viewHolder.itemView;
                linkActionView.setUsers(0, null);
                linkActionView.setLink(InviteLinkBottomSheet.this.invite.link);
                linkActionView.setRevoke(InviteLinkBottomSheet.this.invite.revoked);
                linkActionView.setPermanent(InviteLinkBottomSheet.this.invite.permanent);
                linkActionView.setCanEdit(InviteLinkBottomSheet.this.canEdit);
                linkActionView.hideRevokeOption(!InviteLinkBottomSheet.this.canEdit);
                return;
            }
            if (itemViewType != 4) {
                if (itemViewType != 8) {
                    if (itemViewType != 9) {
                        return;
                    }
                    RevenueCell revenueCell = (RevenueCell) viewHolder.itemView;
                    TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported3 = InviteLinkBottomSheet.this.invite;
                    revenueCell.set(tLRPC$TL_chatInviteExported3.subscription_pricing, tLRPC$TL_chatInviteExported3.usage);
                    return;
                }
                EmptyHintRow emptyHintRow = (EmptyHintRow) viewHolder.itemView;
                int i9 = InviteLinkBottomSheet.this.invite.usage_limit;
                if (i9 > 0) {
                    emptyHintRow.textView.setText(LocaleController.formatPluralString("PeopleCanJoinViaLinkCount", i9, new Object[0]));
                    emptyHintRow.textView.setVisibility(0);
                    return;
                } else {
                    emptyHintRow.textView.setVisibility(8);
                    return;
                }
            }
            TimerPrivacyCell timerPrivacyCell = (TimerPrivacyCell) viewHolder.itemView;
            timerPrivacyCell.cancelTimer();
            timerPrivacyCell.timer = false;
            timerPrivacyCell.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText4));
            timerPrivacyCell.setFixedSize(0);
            TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported4 = InviteLinkBottomSheet.this.invite;
            if (tLRPC$TL_chatInviteExported4.revoked) {
                timerPrivacyCell.setText(LocaleController.getString(R.string.LinkIsNoActive));
                return;
            }
            if (tLRPC$TL_chatInviteExported4.expired) {
                int i10 = tLRPC$TL_chatInviteExported4.usage_limit;
                if (i10 > 0 && i10 == tLRPC$TL_chatInviteExported4.usage) {
                    timerPrivacyCell.setText(LocaleController.getString(R.string.LinkIsExpiredLimitReached));
                    return;
                } else {
                    timerPrivacyCell.setText(LocaleController.getString(R.string.LinkIsExpired));
                    timerPrivacyCell.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
                    return;
                }
            }
            if (tLRPC$TL_chatInviteExported4.expire_date > 0) {
                long currentTimeMillis = System.currentTimeMillis() + (InviteLinkBottomSheet.this.timeDif * 1000);
                long j2 = InviteLinkBottomSheet.this.invite.expire_date;
                long j3 = (j2 * 1000) - currentTimeMillis;
                if (j3 < 0) {
                    j3 = 0;
                }
                if (j3 > 86400000) {
                    timerPrivacyCell.setText(LocaleController.formatString("LinkExpiresIn", R.string.LinkExpiresIn, LocaleController.formatDateAudio(j2, false)));
                    return;
                }
                long j4 = j3 / 1000;
                int i11 = (int) (j4 % 60);
                long j5 = j4 / 60;
                StringBuilder sb = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb.append(String.format(locale, "%02d", Integer.valueOf((int) (j5 / 60))));
                sb.append(String.format(locale, ":%02d", Integer.valueOf((int) (j5 % 60))));
                sb.append(String.format(locale, ":%02d", Integer.valueOf(i11)));
                String sb2 = sb.toString();
                timerPrivacyCell.timer = true;
                timerPrivacyCell.runTimer();
                timerPrivacyCell.setText(LocaleController.formatString("LinkExpiresInTime", R.string.LinkExpiresInTime, sb2));
                return;
            }
            timerPrivacyCell.setFixedSize(-1);
            timerPrivacyCell.setText(null);
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

    public void lambda$loadUsers$6(final List list, final boolean z, final boolean z2, final boolean z3, final boolean z4, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                InviteLinkBottomSheet.this.lambda$loadUsers$5(tLRPC$TL_error, tLObject, list, z, z2, z3, z4);
            }
        });
    }

    public void lambda$loadUsers$5(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_chatInviteImporters tLRPC$TL_messages_chatInviteImporters = (TLRPC$TL_messages_chatInviteImporters) tLObject;
            list.addAll(tLRPC$TL_messages_chatInviteImporters.importers);
            for (int i = 0; i < tLRPC$TL_messages_chatInviteImporters.users.size(); i++) {
                TLRPC$User tLRPC$User = tLRPC$TL_messages_chatInviteImporters.users.get(i);
                this.users.put(Long.valueOf(tLRPC$User.id), tLRPC$User);
            }
            this.hasMore = !z ? !(!z2 ? !(list.size() < tLRPC$TL_messages_chatInviteImporters.count || z3 || z4) : !(list.size() < tLRPC$TL_messages_chatInviteImporters.count || z3)) : list.size() >= tLRPC$TL_messages_chatInviteImporters.count;
            updateRows();
        }
        this.usersLoading = false;
    }

    public void setInviteDelegate(InviteDelegate inviteDelegate) {
        this.inviteDelegate = inviteDelegate;
    }

    public class TimerPrivacyCell extends TextInfoPrivacyCell {
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

    public class EmptyHintRow extends FrameLayout {
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

    public class RevenueUserCell extends UserCell {
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

        public void setRevenue(TLRPC$TL_starsSubscriptionPricing tLRPC$TL_starsSubscriptionPricing, int i) {
            if (tLRPC$TL_starsSubscriptionPricing == null) {
                this.priceView.setText((CharSequence) null);
                this.periodView.setText((CharSequence) null);
                setRightPadding(0, true, true);
                return;
            }
            SpannableStringBuilder replaceStarsWithPlain = StarsIntroActivity.replaceStarsWithPlain("⭐️" + tLRPC$TL_starsSubscriptionPricing.amount, 0.7f);
            int i2 = tLRPC$TL_starsSubscriptionPricing.period;
            String string = i2 == 2592000 ? LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth) : i2 == 300 ? "per 5 minutes" : "per each minute";
            this.priceView.setText(replaceStarsWithPlain);
            this.periodView.setText(string);
            setRightPadding((int) Math.max(HintView2.measureCorrectly(replaceStarsWithPlain, this.priceView.getPaint()), HintView2.measureCorrectly(string, this.periodView.getPaint())), true, true);
            this.statusTextView.setText(LocaleController.formatJoined(i));
        }
    }

    public class RevenueCell extends FrameLayout {
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

        public void set(TLRPC$TL_starsSubscriptionPricing tLRPC$TL_starsSubscriptionPricing, int i) {
            String format;
            String formatString;
            if (tLRPC$TL_starsSubscriptionPricing == null) {
                return;
            }
            int i2 = tLRPC$TL_starsSubscriptionPricing.period;
            String str = "";
            if (i2 == 2592000) {
                TextView textView = this.titleView;
                StringBuilder sb = new StringBuilder();
                sb.append(LocaleController.formatString(R.string.LinkRevenuePrice, Long.valueOf(tLRPC$TL_starsSubscriptionPricing.amount)));
                if (i > 0) {
                    str = " x " + i;
                }
                sb.append(str);
                textView.setText(StarsIntroActivity.replaceStarsWithPlain(sb.toString(), 0.8f));
                TextView textView2 = this.subtitleView;
                if (i == 0) {
                    formatString = LocaleController.getString(R.string.NoOneSubscribed);
                } else {
                    int i3 = R.string.LinkRevenuePriceInfo;
                    BillingController billingController = BillingController.getInstance();
                    double d = tLRPC$TL_starsSubscriptionPricing.amount;
                    Double.isNaN(d);
                    double d2 = MessagesController.getInstance(((BottomSheet) InviteLinkBottomSheet.this).currentAccount).starsUsdWithdrawRate1000;
                    Double.isNaN(d2);
                    double d3 = i;
                    Double.isNaN(d3);
                    formatString = LocaleController.formatString(i3, billingController.formatCurrency((long) ((d / 1000.0d) * d2 * d3), "USD"));
                }
                textView2.setText(formatString);
                return;
            }
            String str2 = i2 == 300 ? "5min" : "min";
            TextView textView3 = this.titleView;
            StringBuilder sb2 = new StringBuilder();
            Locale locale = Locale.US;
            sb2.append(String.format(locale, "⭐%1$d/%2$s", Long.valueOf(tLRPC$TL_starsSubscriptionPricing.amount), str2));
            if (i > 0) {
                str = " x " + i;
            }
            sb2.append(str);
            textView3.setText(StarsIntroActivity.replaceStarsWithPlain(sb2.toString(), 0.8f));
            TextView textView4 = this.subtitleView;
            if (i == 0) {
                format = LocaleController.getString(R.string.NoOneSubscribed);
            } else {
                BillingController billingController2 = BillingController.getInstance();
                double d4 = tLRPC$TL_starsSubscriptionPricing.amount;
                Double.isNaN(d4);
                double d5 = MessagesController.getInstance(((BottomSheet) InviteLinkBottomSheet.this).currentAccount).starsUsdWithdrawRate1000;
                Double.isNaN(d5);
                double d6 = i;
                Double.isNaN(d6);
                format = String.format(locale, "you get approximately %1$s %2$s", billingController2.formatCurrency((long) ((d4 / 1000.0d) * d5 * d6), "USD"), "for " + str2);
            }
            textView4.setText(format);
        }
    }

    public static BottomSheet showSubscriptionSheet(final Context context, int i, long j, TLRPC$TL_starsSubscriptionPricing tLRPC$TL_starsSubscriptionPricing, final TLRPC$TL_chatInviteImporter tLRPC$TL_chatInviteImporter, TLRPC$ChannelParticipant tLRPC$ChannelParticipant, Theme.ResourcesProvider resourcesProvider) {
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
            TLRPC$User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
            avatarDrawable.setInfo(user);
            backupImageView.setForUserOrChat(user, avatarDrawable);
        } else {
            TLRPC$Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
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
        int i3 = tLRPC$TL_starsSubscriptionPricing.period;
        if (i3 == 2592000) {
            builder = builder2;
            textView2.setText(StarsIntroActivity.replaceStarsWithPlain(LocaleController.formatString(R.string.StarsSubscriptionPrice, Long.valueOf(tLRPC$TL_starsSubscriptionPricing.amount)), 0.8f));
            obj = "min";
            obj2 = "5min";
        } else {
            builder = builder2;
            String str = i3 == 300 ? "5min" : "min";
            obj = "min";
            obj2 = "5min";
            textView2.setText(StarsIntroActivity.replaceStarsWithPlain(String.format(Locale.US, "⭐%1$d/%2$s", Long.valueOf(tLRPC$TL_starsSubscriptionPricing.amount), str), 0.8f));
        }
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setGravity(17);
        textView3.setTextColor(Theme.getColor(i2, resourcesProvider));
        int i4 = tLRPC$TL_starsSubscriptionPricing.period;
        if (i4 == 2592000) {
            int i5 = R.string.StarsParticipantSubscriptionApproxMonth;
            BillingController billingController = BillingController.getInstance();
            Double.isNaN(tLRPC$TL_starsSubscriptionPricing.amount);
            Double.isNaN(MessagesController.getInstance(i).starsUsdWithdrawRate1000);
            textView3.setText(LocaleController.formatString(i5, billingController.formatCurrency((int) ((r13 / 1000.0d) * r8), "USD")));
        } else {
            Object obj3 = i4 == 300 ? obj2 : obj;
            Locale locale = Locale.US;
            BillingController billingController2 = BillingController.getInstance();
            Double.isNaN(tLRPC$TL_starsSubscriptionPricing.amount);
            Double.isNaN(MessagesController.getInstance(i).starsUsdWithdrawRate1000);
            textView3.setText(String.format(locale, "appx. %1$s per %2$s", billingController2.formatCurrency((int) ((r14 / 1000.0d) * r8), "USD"), obj3));
        }
        linearLayout.addView(textView3, LayoutHelper.createLinear(-1, -2, 17, 20, 0, 20, 4));
        TableView tableView = new TableView(context, resourcesProvider);
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
        linksTextView.setEllipsize(TextUtils.TruncateAt.END);
        int i6 = Theme.key_chat_messageLinkIn;
        linksTextView.setTextColor(Theme.getColor(i6, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(i6, resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setSingleLine(true);
        linksTextView.setDisablePaddingsOffsetY(true);
        AvatarSpan avatarSpan = new AvatarSpan(linksTextView, i, 24.0f);
        TLRPC$User user2 = MessagesController.getInstance(i).getUser(Long.valueOf(tLRPC$TL_chatInviteImporter.user_id));
        boolean z = user2 == null;
        String userName = UserObject.getUserName(user2);
        avatarSpan.setUser(user2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x  " + ((Object) userName));
        spannableStringBuilder.setSpan(avatarSpan, 0, 1, 33);
        spannableStringBuilder.setSpan(new ClickableSpan() {
            @Override
            public void onClick(View view) {
                bottomSheetArr[0].dismiss();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(ProfileActivity.of(tLRPC$TL_chatInviteImporter.user_id));
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
        int i7 = R.string.formatDateAtTime;
        tableView.addRow(string, LocaleController.formatString(i7, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tLRPC$TL_chatInviteImporter.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tLRPC$TL_chatInviteImporter.date * 1000))));
        int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
        if (tLRPC$ChannelParticipant != null) {
            tableView.addRow(LocaleController.getString(tLRPC$ChannelParticipant.subscription_until_date > currentTime ? R.string.StarsParticipantSubscriptionRenews : R.string.StarsParticipantSubscriptionExpired), LocaleController.formatString(i7, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(tLRPC$ChannelParticipant.subscription_until_date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(tLRPC$ChannelParticipant.subscription_until_date * 1000))));
        }
        linearLayout.addView(tableView, LayoutHelper.createLinear(-1, -2, 0.0f, 17.0f, 0.0f, 0.0f));
        LinkSpanDrawable.LinksTextView linksTextView2 = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        linksTextView2.setLinkTextColor(Theme.getColor(i6, resourcesProvider));
        linksTextView2.setTextSize(1, 14.0f);
        linksTextView2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTransactionTOS), new Runnable() {
            @Override
            public final void run() {
                InviteLinkBottomSheet.lambda$showSubscriptionSheet$7(context);
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
                InviteLinkBottomSheet.lambda$showSubscriptionSheet$8(bottomSheetArr, view);
            }
        });
        BottomSheet.Builder builder3 = builder;
        builder3.setCustomView(linearLayout);
        BottomSheet create = builder3.create();
        bottomSheetArr[0] = create;
        create.useBackgroundTopPadding = false;
        create.fixNavigationBar();
        bottomSheetArr[0].show();
        return bottomSheetArr[0];
    }

    public static void lambda$showSubscriptionSheet$7(Context context) {
        Browser.openUrl(context, LocaleController.getString(R.string.StarsTOSLink));
    }

    public static void lambda$showSubscriptionSheet$8(BottomSheet[] bottomSheetArr, View view) {
        bottomSheetArr[0].dismiss();
    }
}
