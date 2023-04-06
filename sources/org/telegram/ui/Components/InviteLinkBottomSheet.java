package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$ChannelParticipant;
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
import org.telegram.tgnet.TLRPC$TL_inputUserEmpty;
import org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters;
import org.telegram.tgnet.TLRPC$TL_messages_deleteExportedChatInvite;
import org.telegram.tgnet.TLRPC$TL_messages_editExportedChatInvite;
import org.telegram.tgnet.TLRPC$TL_messages_exportedChatInviteReplaced;
import org.telegram.tgnet.TLRPC$TL_messages_getChatInviteImporters;
import org.telegram.tgnet.TLRPC$TL_users_getUsers;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$Vector;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.InviteLinkBottomSheet;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.LinkEditActivity;
import org.telegram.ui.ManageLinksActivity;
import org.telegram.ui.ProfileActivity;
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
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public InviteLinkBottomSheet(Context context, final TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported, TLRPC$ChatFull tLRPC$ChatFull, final HashMap<Long, TLRPC$User> hashMap, final BaseFragment baseFragment, long j, boolean z, boolean z2) {
        super(context, false);
        this.joinedUsers = new ArrayList<>();
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
        fixNavigationBar(getThemedColor("graySection"));
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
            protected void onDraw(android.graphics.Canvas r13) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.InviteLinkBottomSheet.AnonymousClass1.onDraw(android.graphics.Canvas):void");
            }

            private void updateLightStatusBar(boolean z3) {
                Boolean bool = this.statusBarOpen;
                if (bool == null || bool.booleanValue() != z3) {
                    boolean z4 = AndroidUtilities.computePerceivedBrightness(InviteLinkBottomSheet.this.getThemedColor("dialogBackground")) > 0.721f;
                    boolean z5 = AndroidUtilities.computePerceivedBrightness(Theme.blendOver(InviteLinkBottomSheet.this.getThemedColor("actionBarDefault"), AndroidUtilities.DARK_STATUS_BAR_OVERLAY)) > 0.721f;
                    Boolean valueOf = Boolean.valueOf(z3);
                    this.statusBarOpen = valueOf;
                    if (!valueOf.booleanValue()) {
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
                InviteLinkBottomSheet.this.lambda$new$1(tLRPC$TL_chatInviteExported, hashMap, baseFragment, view2, i);
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
        this.titleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        if (!z) {
            if (tLRPC$TL_chatInviteExported.expired) {
                this.titleTextView.setText(LocaleController.getString("ExpiredLink", R.string.ExpiredLink));
            } else if (tLRPC$TL_chatInviteExported.revoked) {
                this.titleTextView.setText(LocaleController.getString("RevokedLink", R.string.RevokedLink));
            } else {
                this.titleTextView.setText(LocaleController.getString("InviteLink", R.string.InviteLink));
            }
            this.titleVisible = true;
        } else {
            this.titleTextView.setText(LocaleController.getString("InviteLink", R.string.InviteLink));
            this.titleVisible = false;
            this.titleTextView.setVisibility(4);
            this.titleTextView.setAlpha(0.0f);
        }
        if (!TextUtils.isEmpty(tLRPC$TL_chatInviteExported.title)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tLRPC$TL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, this.titleTextView.getPaint().getFontMetricsInt(), (int) this.titleTextView.getPaint().getTextSize(), false);
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

    public void lambda$new$1(TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported, HashMap hashMap, final BaseFragment baseFragment, View view, int i) {
        if (i == this.creatorRow && tLRPC$TL_chatInviteExported.admin_id == UserConfig.getInstance(this.currentAccount).clientUserId) {
            return;
        }
        int i2 = this.joinedStartRow;
        boolean z = true;
        boolean z2 = i >= i2 && i < this.joinedEndRow;
        int i3 = this.requestedStartRow;
        z = (i < i3 || i >= this.requestedEndRow) ? false : false;
        if ((i == this.creatorRow || z2 || z) && hashMap != null) {
            long j = tLRPC$TL_chatInviteExported.admin_id;
            if (z2) {
                j = this.joinedUsers.get(i - i2).user_id;
            } else if (z) {
                j = this.requestedUsers.get(i - i3).user_id;
            }
            final TLRPC$User tLRPC$User = (TLRPC$User) hashMap.get(Long.valueOf(j));
            if (tLRPC$User != null) {
                MessagesController.getInstance(UserConfig.selectedAccount).putUser(tLRPC$User, false);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        InviteLinkBottomSheet.this.lambda$new$0(tLRPC$User, baseFragment);
                    }
                }, 100L);
                dismiss();
            }
        }
    }

    public void lambda$new$0(TLRPC$User tLRPC$User, BaseFragment baseFragment) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", tLRPC$User.id);
        baseFragment.presentFragment(new ProfileActivity(bundle));
        this.isNeedReopen = true;
    }

    public void updateColors() {
        TextView textView = this.titleTextView;
        if (textView != null) {
            textView.setTextColor(Theme.getColor("dialogTextBlack"));
            this.titleTextView.setLinkTextColor(Theme.getColor("dialogTextLink"));
            this.titleTextView.setHighlightColor(Theme.getColor("dialogLinkSelection"));
            if (!this.titleVisible) {
                this.titleTextView.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            }
        }
        this.listView.setGlowColor(Theme.getColor("dialogScrollGlow"));
        this.shadow.setBackgroundColor(Theme.getColor("dialogShadowLine"));
        setBackgroundColor(Theme.getColor("dialogBackground"));
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
            ((HeaderCell) view).getTextView().setTextColor(Theme.getColor("windowBackgroundWhiteBlueHeader"));
        } else if (view instanceof LinkActionView) {
            ((LinkActionView) view).updateColors();
        } else if (view instanceof TextInfoPrivacyCell) {
            CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(view.getContext(), R.drawable.greydivider, "windowBackgroundGrayShadow"));
            combinedDrawable.setFullsize(true);
            view.setBackground(combinedDrawable);
            ((TextInfoPrivacyCell) view).setTextColor(Theme.getColor("windowBackgroundWhiteGrayText4"));
        } else if (view instanceof UserCell) {
            ((UserCell) view).update(0);
        }
        RecyclerView.ViewHolder childViewHolder = this.listView.getChildViewHolder(view);
        if (childViewHolder != null) {
            if (childViewHolder.getItemViewType() == 7) {
                CombinedDrawable combinedDrawable2 = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(view.getContext(), R.drawable.greydivider_bottom, "windowBackgroundGrayShadow"), 0, 0);
                combinedDrawable2.setFullsize(true);
                view.setBackgroundDrawable(combinedDrawable2);
            } else if (childViewHolder.getItemViewType() == 2) {
                CombinedDrawable combinedDrawable3 = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(view.getContext(), R.drawable.greydivider, "windowBackgroundGrayShadow"), 0, 0);
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
                InviteLinkBottomSheet.this.lambda$loadCreator$2(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadCreator$2(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public void run() {
                if (tLRPC$TL_error == null) {
                    InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                    inviteLinkBottomSheet.users.put(Long.valueOf(inviteLinkBottomSheet.invite.admin_id), (TLRPC$User) ((TLRPC$Vector) tLObject).objects.get(0));
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
            if (i == inviteLinkBottomSheet.creatorHeaderRow || i == inviteLinkBottomSheet.requestedHeaderRow || i == inviteLinkBottomSheet.joinedHeaderRow) {
                return 0;
            }
            if (i != inviteLinkBottomSheet.creatorRow) {
                if (i < inviteLinkBottomSheet.requestedStartRow || i >= inviteLinkBottomSheet.requestedEndRow) {
                    if (i < inviteLinkBottomSheet.joinedStartRow || i >= inviteLinkBottomSheet.joinedEndRow) {
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
                        return i == inviteLinkBottomSheet.emptyHintRow ? 8 : 0;
                    }
                    return 1;
                }
                return 1;
            }
            return 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View timerPrivacyCell;
            HeaderCell headerCell;
            Context context = viewGroup.getContext();
            switch (i) {
                case 1:
                    headerCell = new UserCell(context, 12, 0, true);
                    break;
                case 2:
                    headerCell = new ShadowSectionCell(context, 12, Theme.getColor("windowBackgroundGray"));
                    break;
                case 3:
                    InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                    LinkActionView linkActionView = new LinkActionView(context, inviteLinkBottomSheet.fragment, inviteLinkBottomSheet, inviteLinkBottomSheet.chatId, false, InviteLinkBottomSheet.this.isChannel);
                    linkActionView.setDelegate(new AnonymousClass1());
                    linkActionView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    headerCell = linkActionView;
                    break;
                case 4:
                    timerPrivacyCell = new TimerPrivacyCell(context);
                    CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(context, R.drawable.greydivider, "windowBackgroundGrayShadow"));
                    combinedDrawable.setFullsize(true);
                    timerPrivacyCell.setBackground(combinedDrawable);
                    headerCell = timerPrivacyCell;
                    break;
                case 5:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setViewType(10);
                    flickerLoadingView.showDate(false);
                    flickerLoadingView.setPaddingLeft(AndroidUtilities.dp(10.0f));
                    headerCell = flickerLoadingView;
                    break;
                case 6:
                    headerCell = new View(this, context) {
                        @Override
                        protected void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(5.0f), 1073741824));
                        }
                    };
                    break;
                case 7:
                    timerPrivacyCell = new ShadowSectionCell(context, 12);
                    CombinedDrawable combinedDrawable2 = new CombinedDrawable(new ColorDrawable(Theme.getColor("windowBackgroundGray")), Theme.getThemedDrawable(context, R.drawable.greydivider_bottom, "windowBackgroundGrayShadow"), 0, 0);
                    combinedDrawable2.setFullsize(true);
                    timerPrivacyCell.setBackgroundDrawable(combinedDrawable2);
                    headerCell = timerPrivacyCell;
                    break;
                case 8:
                    headerCell = new EmptyHintRow(InviteLinkBottomSheet.this, context);
                    break;
                default:
                    HeaderCell headerCell2 = new HeaderCell(context, "windowBackgroundWhiteBlueHeader", 21, 15, true);
                    headerCell2.getTextView2().setTextColor(Theme.getColor("windowBackgroundWhiteRedText"));
                    headerCell2.getTextView2().setTextSize(15);
                    headerCell2.getTextView2().setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                    headerCell = headerCell2;
                    break;
            }
            headerCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(headerCell);
        }

        public class AnonymousClass1 implements LinkActionView.Delegate {
            @Override
            public void showUsersForPermanentLink() {
                LinkActionView.Delegate.CC.$default$showUsersForPermanentLink(this);
            }

            AnonymousClass1() {
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
                            InviteLinkBottomSheet.Adapter.AnonymousClass1.this.lambda$revokeLink$1(tLObject, tLRPC$TL_error);
                        }
                    });
                }
                InviteLinkBottomSheet.this.dismiss();
            }

            public void lambda$revokeLink$1(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        InviteLinkBottomSheet.Adapter.AnonymousClass1.this.lambda$revokeLink$0(tLRPC$TL_error, tLObject);
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
                            InviteLinkBottomSheet.Adapter.AnonymousClass1.this.lambda$removeLink$3(tLObject, tLRPC$TL_error);
                        }
                    });
                }
                InviteLinkBottomSheet.this.dismiss();
            }

            public void lambda$removeLink$3(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        InviteLinkBottomSheet.Adapter.AnonymousClass1.this.lambda$removeLink$2(tLRPC$TL_error);
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
            TLRPC$User tLRPC$User;
            String str;
            String string;
            int itemViewType = viewHolder.getItemViewType();
            String str2 = null;
            int i4 = 0;
            if (itemViewType == 0) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                InviteLinkBottomSheet inviteLinkBottomSheet = InviteLinkBottomSheet.this;
                if (i == inviteLinkBottomSheet.creatorHeaderRow) {
                    headerCell.setText(LocaleController.getString("LinkCreatedeBy", R.string.LinkCreatedeBy));
                    headerCell.setText2(null);
                } else if (i == inviteLinkBottomSheet.joinedHeaderRow) {
                    int i5 = inviteLinkBottomSheet.invite.usage;
                    if (i5 > 0) {
                        headerCell.setText(LocaleController.formatPluralString("PeopleJoined", i5, new Object[0]));
                    } else {
                        headerCell.setText(LocaleController.getString("NoOneJoined", R.string.NoOneJoined));
                    }
                    TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported = InviteLinkBottomSheet.this.invite;
                    if (!tLRPC$TL_chatInviteExported.expired && !tLRPC$TL_chatInviteExported.revoked && (i2 = tLRPC$TL_chatInviteExported.usage_limit) > 0 && (i3 = tLRPC$TL_chatInviteExported.usage) > 0) {
                        headerCell.setText2(LocaleController.formatPluralString("PeopleJoinedRemaining", i2 - i3, new Object[0]));
                    } else {
                        headerCell.setText2(null);
                    }
                } else if (i == inviteLinkBottomSheet.requestedHeaderRow) {
                    headerCell.setText(LocaleController.formatPluralString("JoinRequests", inviteLinkBottomSheet.invite.requested, new Object[0]));
                }
            } else if (itemViewType == 1) {
                UserCell userCell = (UserCell) viewHolder.itemView;
                InviteLinkBottomSheet inviteLinkBottomSheet2 = InviteLinkBottomSheet.this;
                if (i == inviteLinkBottomSheet2.creatorRow) {
                    TLRPC$User tLRPC$User2 = inviteLinkBottomSheet2.users.get(Long.valueOf(inviteLinkBottomSheet2.invite.admin_id));
                    if (tLRPC$User2 == null) {
                        tLRPC$User2 = MessagesController.getInstance(((BottomSheet) InviteLinkBottomSheet.this).currentAccount).getUser(Long.valueOf(InviteLinkBottomSheet.this.invite.admin_id));
                    }
                    String formatDateAudio = tLRPC$User2 != null ? LocaleController.formatDateAudio(InviteLinkBottomSheet.this.invite.date, false) : null;
                    TLRPC$ChatFull tLRPC$ChatFull = InviteLinkBottomSheet.this.info;
                    if (tLRPC$ChatFull != null && tLRPC$User2 != null && tLRPC$ChatFull.participants != null) {
                        while (true) {
                            if (i4 >= InviteLinkBottomSheet.this.info.participants.participants.size()) {
                                break;
                            } else if (InviteLinkBottomSheet.this.info.participants.participants.get(i4).user_id == tLRPC$User2.id) {
                                TLRPC$ChatParticipant tLRPC$ChatParticipant = InviteLinkBottomSheet.this.info.participants.participants.get(i4);
                                if (tLRPC$ChatParticipant instanceof TLRPC$TL_chatChannelParticipant) {
                                    TLRPC$ChannelParticipant tLRPC$ChannelParticipant = ((TLRPC$TL_chatChannelParticipant) tLRPC$ChatParticipant).channelParticipant;
                                    if (!TextUtils.isEmpty(tLRPC$ChannelParticipant.rank)) {
                                        str2 = tLRPC$ChannelParticipant.rank;
                                    } else if (tLRPC$ChannelParticipant instanceof TLRPC$TL_channelParticipantCreator) {
                                        str2 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                                    } else if (tLRPC$ChannelParticipant instanceof TLRPC$TL_channelParticipantAdmin) {
                                        str2 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                                    }
                                } else {
                                    if (tLRPC$ChatParticipant instanceof TLRPC$TL_chatParticipantCreator) {
                                        string = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                                    } else if (tLRPC$ChatParticipant instanceof TLRPC$TL_chatParticipantAdmin) {
                                        string = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                                    }
                                    str2 = string;
                                }
                            } else {
                                i4++;
                            }
                        }
                    }
                    tLRPC$User = tLRPC$User2;
                    str = formatDateAudio;
                } else {
                    int i6 = inviteLinkBottomSheet2.joinedStartRow;
                    ArrayList<TLRPC$TL_chatInviteImporter> arrayList = inviteLinkBottomSheet2.joinedUsers;
                    int i7 = inviteLinkBottomSheet2.requestedStartRow;
                    if (i7 != -1 && i >= i7) {
                        arrayList = inviteLinkBottomSheet2.requestedUsers;
                        i6 = i7;
                    }
                    tLRPC$User = InviteLinkBottomSheet.this.users.get(Long.valueOf(arrayList.get(i - i6).user_id));
                    str = null;
                }
                userCell.setAdminRole(str2);
                userCell.setData(tLRPC$User, null, str, 0, false);
            } else if (itemViewType == 3) {
                LinkActionView linkActionView = (LinkActionView) viewHolder.itemView;
                linkActionView.setUsers(0, null);
                linkActionView.setLink(InviteLinkBottomSheet.this.invite.link);
                linkActionView.setRevoke(InviteLinkBottomSheet.this.invite.revoked);
                linkActionView.setPermanent(InviteLinkBottomSheet.this.invite.permanent);
                linkActionView.setCanEdit(InviteLinkBottomSheet.this.canEdit);
                linkActionView.hideRevokeOption(!InviteLinkBottomSheet.this.canEdit);
            } else if (itemViewType != 4) {
                if (itemViewType != 8) {
                    return;
                }
                EmptyHintRow emptyHintRow = (EmptyHintRow) viewHolder.itemView;
                int i8 = InviteLinkBottomSheet.this.invite.usage_limit;
                if (i8 > 0) {
                    emptyHintRow.textView.setText(LocaleController.formatPluralString("PeopleCanJoinViaLinkCount", i8, new Object[0]));
                    emptyHintRow.textView.setVisibility(0);
                    return;
                }
                emptyHintRow.textView.setVisibility(8);
            } else {
                TimerPrivacyCell timerPrivacyCell = (TimerPrivacyCell) viewHolder.itemView;
                timerPrivacyCell.cancelTimer();
                timerPrivacyCell.timer = false;
                timerPrivacyCell.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText4"));
                timerPrivacyCell.setFixedSize(0);
                TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported2 = InviteLinkBottomSheet.this.invite;
                if (tLRPC$TL_chatInviteExported2.revoked) {
                    timerPrivacyCell.setText(LocaleController.getString("LinkIsNoActive", R.string.LinkIsNoActive));
                } else if (tLRPC$TL_chatInviteExported2.expired) {
                    int i9 = tLRPC$TL_chatInviteExported2.usage_limit;
                    if (i9 > 0 && i9 == tLRPC$TL_chatInviteExported2.usage) {
                        timerPrivacyCell.setText(LocaleController.getString("LinkIsExpiredLimitReached", R.string.LinkIsExpiredLimitReached));
                        return;
                    }
                    timerPrivacyCell.setText(LocaleController.getString("LinkIsExpired", R.string.LinkIsExpired));
                    timerPrivacyCell.setTextColor(Theme.getColor("windowBackgroundWhiteRedText"));
                } else if (tLRPC$TL_chatInviteExported2.expire_date > 0) {
                    long currentTimeMillis = System.currentTimeMillis() + (InviteLinkBottomSheet.this.timeDif * 1000);
                    int i10 = InviteLinkBottomSheet.this.invite.expire_date;
                    long j = (i10 * 1000) - currentTimeMillis;
                    if (j < 0) {
                        j = 0;
                    }
                    if (j > 86400000) {
                        timerPrivacyCell.setText(LocaleController.formatString("LinkExpiresIn", R.string.LinkExpiresIn, LocaleController.formatDateAudio(i10, false)));
                        return;
                    }
                    long j2 = j / 1000;
                    int i11 = (int) (j2 % 60);
                    long j3 = j2 / 60;
                    int i12 = (int) (j3 / 60);
                    StringBuilder sb = new StringBuilder();
                    Locale locale = Locale.ENGLISH;
                    sb.append(String.format(locale, "%02d", Integer.valueOf(i12)));
                    sb.append(String.format(locale, ":%02d", Integer.valueOf((int) (j3 % 60))));
                    sb.append(String.format(locale, ":%02d", Integer.valueOf(i11)));
                    String sb2 = sb.toString();
                    timerPrivacyCell.timer = true;
                    timerPrivacyCell.runTimer();
                    timerPrivacyCell.setText(LocaleController.formatString("LinkExpiresInTime", R.string.LinkExpiresInTime, sb2));
                } else {
                    timerPrivacyCell.setFixedSize(12);
                    timerPrivacyCell.setText(null);
                }
            }
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
        Animator[] animatorArr = new Animator[1];
        View view = this.shadow;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        fArr[0] = z ? 1.0f : 0.0f;
        animatorArr[0] = ObjectAnimator.ofFloat(view, property, fArr);
        animatorSet2.playTogether(animatorArr);
        if (!this.titleVisible) {
            AnimatorSet animatorSet3 = this.shadowAnimation;
            Animator[] animatorArr2 = new Animator[1];
            TextView textView = this.titleTextView;
            Property property2 = View.ALPHA;
            float[] fArr2 = new float[1];
            fArr2[0] = z ? 1.0f : 0.0f;
            animatorArr2[0] = ObjectAnimator.ofFloat(textView, property2, fArr2);
            animatorSet3.playTogether(animatorArr2);
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
        if (this.usersLoading) {
            return;
        }
        final boolean z = false;
        boolean z2 = this.invite.usage > this.joinedUsers.size();
        TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported = this.invite;
        final boolean z3 = tLRPC$TL_chatInviteExported.request_needed && tLRPC$TL_chatInviteExported.requested > this.requestedUsers.size();
        if (!z2) {
            if (!z3) {
                return;
            }
            z = true;
        }
        final ArrayList<TLRPC$TL_chatInviteImporter> arrayList = z ? this.requestedUsers : this.joinedUsers;
        TLRPC$TL_messages_getChatInviteImporters tLRPC$TL_messages_getChatInviteImporters = new TLRPC$TL_messages_getChatInviteImporters();
        tLRPC$TL_messages_getChatInviteImporters.flags |= 2;
        tLRPC$TL_messages_getChatInviteImporters.link = this.invite.link;
        tLRPC$TL_messages_getChatInviteImporters.peer = MessagesController.getInstance(UserConfig.selectedAccount).getInputPeer(-this.chatId);
        tLRPC$TL_messages_getChatInviteImporters.requested = z;
        if (arrayList.isEmpty()) {
            tLRPC$TL_messages_getChatInviteImporters.offset_user = new TLRPC$TL_inputUserEmpty();
        } else {
            TLRPC$TL_chatInviteImporter tLRPC$TL_chatInviteImporter = arrayList.get(arrayList.size() - 1);
            tLRPC$TL_messages_getChatInviteImporters.offset_user = MessagesController.getInstance(this.currentAccount).getInputUser(this.users.get(Long.valueOf(tLRPC$TL_chatInviteImporter.user_id)));
            tLRPC$TL_messages_getChatInviteImporters.offset_date = tLRPC$TL_chatInviteImporter.date;
        }
        this.usersLoading = true;
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tLRPC$TL_messages_getChatInviteImporters, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                InviteLinkBottomSheet.this.lambda$loadUsers$4(arrayList, z, z3, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadUsers$4(final List list, final boolean z, final boolean z2, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                InviteLinkBottomSheet.this.lambda$loadUsers$3(tLRPC$TL_error, tLObject, list, z, z2);
            }
        });
    }

    public void lambda$loadUsers$3(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, List list, boolean z, boolean z2) {
        if (tLRPC$TL_error == null) {
            TLRPC$TL_messages_chatInviteImporters tLRPC$TL_messages_chatInviteImporters = (TLRPC$TL_messages_chatInviteImporters) tLObject;
            list.addAll(tLRPC$TL_messages_chatInviteImporters.importers);
            for (int i = 0; i < tLRPC$TL_messages_chatInviteImporters.users.size(); i++) {
                TLRPC$User tLRPC$User = tLRPC$TL_messages_chatInviteImporters.users.get(i);
                this.users.put(Long.valueOf(tLRPC$User.id), tLRPC$User);
            }
            boolean z3 = true;
            if (!z ? !(list.size() < tLRPC$TL_messages_chatInviteImporters.count || z2) : list.size() >= tLRPC$TL_messages_chatInviteImporters.count) {
                z3 = false;
            }
            this.hasMore = z3;
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

        public EmptyHintRow(InviteLinkBottomSheet inviteLinkBottomSheet, Context context) {
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 14.0f);
            this.textView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText"));
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
}
