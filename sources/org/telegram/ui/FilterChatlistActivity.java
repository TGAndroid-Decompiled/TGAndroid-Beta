package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline2;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CrossfadeDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.community.CommunitySheet;

public final class FilterChatlistActivity extends BaseFragment {
    public ListAdapter adapter;
    public final ArrayList allowedPeers;
    public int chatsEndRow;
    public int chatsHeaderRow;
    public int chatsSectionRow;
    public int chatsStartRow;
    public ActionBarMenuItem doneButton;
    public float doneButtonAlpha;
    public CrossfadeDrawable doneButtonDrawable;
    public ValueAnimator doneButtonDrawableAnimator;
    public final ComposeDrawable$$ExternalSyntheticLambda0 enableDoneLoading;
    public final MessagesController.DialogFilter filter;
    public FolderBottomSheet.HeaderCell headerCountCell;
    public HintInnerCell hintCountCell;
    public final TL_chatlists.TL_exportedChatlistInvite invite;
    public long lastClicked;
    public long lastClickedDialogId;
    public int linkHeaderRow;
    public int linkRow;
    public int linkSectionRow;
    public MessageSeenView.AnonymousClass1 listView;
    public Utilities.Callback onDelete;
    public Utilities.Callback onEdit;
    public final ArrayList peers;
    public boolean peersChanged;
    public int rowsCount;
    public boolean saving;
    public int savingTitleReqId;
    public final ArrayList selectedPeers;
    public int shiftDp;

    public final class HintInnerCell extends FrameLayout {
        public final SpoilersTextView subtitleTextView;

        public HintInnerCell(Activity activity, int i) {
            super(activity);
            RLottieImageView rLottieImageView = new RLottieImageView(activity);
            rLottieImageView.setAnimation(i, 90, 90, null);
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            rLottieImageView.playAnimation();
            rLottieImageView.setImportantForAccessibility(2);
            addView(rLottieImageView, LayoutHelper.createFrame(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            SpoilersTextView spoilersTextView = new SpoilersTextView(activity, null, true);
            this.subtitleTextView = spoilersTextView;
            spoilersTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
            spoilersTextView.setTextSize(1, 14.0f);
            spoilersTextView.setGravity(17);
            spoilersTextView.setLines(2);
            addView(spoilersTextView, LayoutHelper.createFrame(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        }

        public SpoilersTextView getSubtitleTextView() {
            return this.subtitleTextView;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    public abstract class InviteLinkCell extends FrameLayout {
        public ActionBarPopupWindow actionBarPopupWindow;
        public final CommunitySheet.ContainerView buttonsBox;
        public float changeAlpha;
        public final ArticleViewer.AnonymousClass9 copyButton;
        public final TextView generateButton;
        public String lastUrl;
        public final FrameLayout linkBox;
        public final ImageView optionsIcon;
        public final BaseFragment parentFragment;
        public final float[] point;
        public final ArticleViewer.AnonymousClass9 shareButton;
        public final SimpleTextView spoilerTextView;
        public final SimpleTextView textView;

        public InviteLinkCell(Activity activity, BaseFragment baseFragment) {
            super(activity);
            this.point = new float[2];
            this.parentFragment = baseFragment;
            FrameLayout frameLayout = new FrameLayout(activity);
            this.linkBox = frameLayout;
            int iDp = AndroidUtilities.dp(8.0f);
            int i = Theme.key_graySection;
            int color = Theme.getColor(null, i, false);
            int iBlendOver = Theme.blendOver(Theme.getColor(null, i, false), Theme.getColor(null, Theme.key_listSelector, false));
            frameLayout.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, iBlendOver, iBlendOver));
            frameLayout.setOnClickListener(new FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda0(this, 0));
            addView(frameLayout, LayoutHelper.createFrame(-1, 48.0f, 55, 22.0f, 9.0f, 22.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(activity);
            this.spoilerTextView = simpleTextView;
            simpleTextView.setTextSize(16);
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            simpleTextView.setTextColor(Theme.getColor(null, i2, false));
            SpannableString spannableString = new SpannableString("t.me/folder/N3k/dImA/bIo");
            TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
            textStyleRun.flags |= 256;
            spannableString.setSpan(new TextStyleSpan(textStyleRun, 0), 0, spannableString.length(), 33);
            simpleTextView.setText(spannableString, false);
            simpleTextView.setAlpha(1.0f);
            frameLayout.addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, 23, 20.0f, 0.0f, 40.0f, 0.0f));
            SimpleTextView simpleTextView2 = new SimpleTextView(activity);
            this.textView = simpleTextView2;
            simpleTextView2.setTextSize(16);
            simpleTextView2.setTextColor(Theme.getColor(null, i2, false));
            simpleTextView2.setText(spannableString, false);
            simpleTextView2.setAlpha(0.0f);
            frameLayout.addView(simpleTextView2, LayoutHelper.createFrame(-1, -2.0f, 23, 20.0f, 0.0f, 40.0f, 0.0f));
            ImageView imageView = new ImageView(activity);
            this.optionsIcon = imageView;
            imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_ab_other));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogTextGray3, false), PorterDuff.Mode.SRC_IN));
            imageView.setAlpha(0.0f);
            imageView.setVisibility(8);
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            imageView.setOnClickListener(new FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda0(this, 1));
            frameLayout.addView(imageView, LayoutHelper.createFrame(40, 40.0f, 21, 4.0f, 4.0f, 4.0f, 4.0f));
            CommunitySheet.ContainerView containerView = new CommunitySheet.ContainerView(activity);
            this.buttonsBox = containerView;
            addView(containerView, LayoutHelper.createFrame(-1, 42.0f, 55, 22.0f, 69.0f, 22.0f, 0.0f));
            ArticleViewer.AnonymousClass9 anonymousClass9 = new ArticleViewer.AnonymousClass9(activity, 14);
            this.copyButton = anonymousClass9;
            anonymousClass9.setGravity(17);
            int i3 = Theme.key_featuredStickers_buttonText;
            anonymousClass9.setTextColor(Theme.getColor(null, i3, false));
            anonymousClass9.setBackground(Theme.createRadSelectorDrawable(822083583, 8, 8));
            anonymousClass9.setTypeface(AndroidUtilities.bold());
            anonymousClass9.setTextSize(14.0f);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "..").setSpan(new ColoredImageSpan(0, activity.getDrawable(R.drawable.msg_copy_filled)), 0, 1, 0);
            spannableStringBuilder.setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(8.0f)), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.LinkActionCopy));
            spannableStringBuilder.append((CharSequence) ".").setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(5.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            anonymousClass9.setText(spannableStringBuilder);
            anonymousClass9.setOnClickListener(new FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda0(this, 2));
            anonymousClass9.setAlpha(0.0f);
            anonymousClass9.setVisibility(8);
            containerView.addView(anonymousClass9, LayoutHelper.createFrame(-1, -1, 3));
            ArticleViewer.AnonymousClass9 anonymousClass10 = new ArticleViewer.AnonymousClass9(activity, 15);
            this.shareButton = anonymousClass10;
            anonymousClass10.setGravity(17);
            anonymousClass10.setTextColor(Theme.getColor(null, i3, false));
            anonymousClass10.setBackground(Theme.createRadSelectorDrawable(822083583, 8, 8));
            anonymousClass10.setTypeface(AndroidUtilities.bold());
            anonymousClass10.setTextSize(14.0f);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "..").setSpan(new ColoredImageSpan(0, activity.getDrawable(R.drawable.msg_share_filled)), 0, 1, 0);
            spannableStringBuilder2.setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(8.0f)), 1, 2, 0);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkActionShare));
            spannableStringBuilder2.append((CharSequence) ".").setSpan(new DialogCell.FixedWidthSpan(AndroidUtilities.dp(5.0f)), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 0);
            anonymousClass10.setText(spannableStringBuilder2);
            anonymousClass10.setOnClickListener(new FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda0(this, 3));
            anonymousClass10.setAlpha(0.0f);
            anonymousClass10.setVisibility(8);
            containerView.addView(anonymousClass10, LayoutHelper.createFrame(-1, -1, 5));
            TextView textView = new TextView(activity);
            this.generateButton = textView;
            textView.setGravity(17);
            textView.setTextColor(Theme.getColor(null, i3, false));
            textView.setBackground(Theme.createRadSelectorDrawable(822083583, 8, 8));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(14.0f);
            textView.setText("Generate Invite Link");
            textView.setOnClickListener(new FilterChatlistActivity$InviteLinkCell$$ExternalSyntheticLambda0(this, 4));
            textView.setAlpha(1.0f);
            textView.setVisibility(0);
            containerView.addView(textView, LayoutHelper.createFrame(-1.0f, -1));
        }

        public static void getPointOnScreen(FrameLayout frameLayout, FrameLayout frameLayout2, float[] fArr) {
            float f = 0.0f;
            float x = 0.0f;
            while (frameLayout != frameLayout2) {
                float y = frameLayout.getY() + f;
                x += frameLayout.getX();
                if (frameLayout instanceof ScrollView) {
                    y -= frameLayout.getScrollY();
                }
                f = y;
                if (!(frameLayout.getParent() instanceof View)) {
                    break;
                }
                frameLayout = (View) frameLayout.getParent();
                if (!(frameLayout instanceof ViewGroup)) {
                    return;
                }
            }
            float paddingLeft = x - frameLayout2.getPaddingLeft();
            float paddingTop = f - frameLayout2.getPaddingTop();
            fArr[0] = paddingLeft;
            fArr[1] = paddingTop;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(127.0f), 1073741824));
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {

        public final class AnonymousClass1 extends InviteLinkCell {
            public AnonymousClass1(Activity activity, BaseFragment baseFragment) {
                super(activity, baseFragment);
            }
        }

        public ListAdapter() {
        }

        @Override
        public final int getItemCount() {
            return FilterChatlistActivity.this.rowsCount;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == 0) {
                return 0;
            }
            FilterChatlistActivity filterChatlistActivity = FilterChatlistActivity.this;
            if (i == filterChatlistActivity.chatsSectionRow || i == filterChatlistActivity.linkSectionRow) {
                return 2;
            }
            if (i == filterChatlistActivity.linkRow) {
                return 3;
            }
            if (i < filterChatlistActivity.chatsStartRow || i >= filterChatlistActivity.chatsEndRow) {
                return (i == filterChatlistActivity.chatsHeaderRow || i == filterChatlistActivity.linkHeaderRow) ? 5 : 0;
            }
            return 4;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType == 4;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Chat chat;
            String string;
            TLRPC.User user;
            TLRPC.User user2;
            TLRPC.User user3;
            int i2 = viewHolder.mItemViewType;
            FilterChatlistActivity filterChatlistActivity = FilterChatlistActivity.this;
            View view = viewHolder.itemView;
            if (i2 == 0) {
                filterChatlistActivity.hintCountCell = (HintInnerCell) view;
                filterChatlistActivity.updateHintCell();
                return;
            }
            ArrayList arrayList = filterChatlistActivity.allowedPeers;
            TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = filterChatlistActivity.invite;
            if (i2 == 2) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                textInfoPrivacyCell.setBackground(Theme.getThemedDrawableByKey(filterChatlistActivity.getParentActivity(), i == filterChatlistActivity.chatsSectionRow ? R.drawable.greydivider_bottom : R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                if (i != filterChatlistActivity.chatsSectionRow) {
                    textInfoPrivacyCell.setFixedSize(12);
                    return;
                }
                textInfoPrivacyCell.setFixedSize(0);
                if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                    return;
                } else {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.FilterInviteHint));
                    return;
                }
            }
            String userName = null;
            if (i2 == 3) {
                InviteLinkCell inviteLinkCell = (InviteLinkCell) view;
                userName = tL_exportedChatlistInvite != null ? tL_exportedChatlistInvite.url : null;
                inviteLinkCell.lastUrl = userName;
                if (userName != null) {
                    if (userName.startsWith("http://")) {
                        userName = userName.substring(7);
                    }
                    if (userName.startsWith("https://")) {
                        userName = userName.substring(8);
                    }
                }
                SimpleTextView simpleTextView = inviteLinkCell.textView;
                simpleTextView.setText(userName, false);
                if (inviteLinkCell.changeAlpha != (userName == null ? 0 : 1)) {
                    float f = userName != null ? 1.0f : 0.0f;
                    inviteLinkCell.changeAlpha = f;
                    CommunitySheet.ContainerView containerView = inviteLinkCell.buttonsBox;
                    containerView.top = f;
                    containerView.invalidate();
                    float f2 = inviteLinkCell.changeAlpha;
                    ArticleViewer.AnonymousClass9 anonymousClass9 = inviteLinkCell.copyButton;
                    anonymousClass9.setAlpha(f2);
                    float f3 = inviteLinkCell.changeAlpha;
                    ArticleViewer.AnonymousClass9 anonymousClass10 = inviteLinkCell.shareButton;
                    anonymousClass10.setAlpha(f3);
                    ImageView imageView = inviteLinkCell.optionsIcon;
                    imageView.setAlpha(inviteLinkCell.changeAlpha);
                    TextView textView = inviteLinkCell.generateButton;
                    textView.setAlpha(1.0f - inviteLinkCell.changeAlpha);
                    simpleTextView.setAlpha(inviteLinkCell.changeAlpha);
                    inviteLinkCell.spoilerTextView.setAlpha(1.0f - inviteLinkCell.changeAlpha);
                    if (userName == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        anonymousClass9.setVisibility(8);
                        anonymousClass10.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    anonymousClass9.setVisibility(0);
                    anonymousClass10.setVisibility(0);
                    return;
                }
                return;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    FolderBottomSheet.HeaderCell headerCell = (FolderBottomSheet.HeaderCell) view;
                    if (headerCell == filterChatlistActivity.headerCountCell) {
                        filterChatlistActivity.headerCountCell = null;
                    }
                    if (i == filterChatlistActivity.linkHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.InviteLink), false);
                        headerCell.setAction("", null);
                        return;
                    }
                    filterChatlistActivity.headerCountCell = headerCell;
                    if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                        filterChatlistActivity.updateHeaderCell$1(false);
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                        headerCell.setAction("", null);
                        return;
                    }
                }
                return;
            }
            GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
            Long l = (Long) filterChatlistActivity.peers.get(i - filterChatlistActivity.chatsStartRow);
            long jLongValue = l.longValue();
            if (jLongValue >= 0) {
                user3 = filterChatlistActivity.getMessagesController().getUser(l);
                if (user3 != null) {
                    user = user3;
                    userName = UserObject.getUserName(user3);
                    string = null;
                    user2 = user3;
                } else {
                    user = chat;
                    user = user3;
                    string = null;
                    user2 = user;
                }
            } else {
                chat = filterChatlistActivity.getMessagesController().getChat(Long.valueOf(-jLongValue));
                if (chat != null) {
                    userName = chat.title;
                    if (chat.participants_count != 0) {
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            user = chat;
                            string = LocaleController.formatPluralStringComma("Subscribers", chat.participants_count);
                            user2 = chat;
                        } else {
                            user = chat;
                            string = LocaleController.formatPluralStringComma("Members", chat.participants_count);
                            user2 = chat;
                        }
                    } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        user = chat;
                        string = LocaleController.getString("ChannelPublic");
                        user2 = chat;
                    } else {
                        user = chat;
                        string = LocaleController.getString("MegaPublic");
                        user2 = chat;
                    }
                } else {
                    user = chat;
                    user = user3;
                    string = null;
                    user2 = user;
                }
            }
            if (arrayList.contains(l)) {
                groupCreateUserCell.setForbiddenCheck(false);
                groupCreateUserCell.setChecked(filterChatlistActivity.selectedPeers.contains(l), false);
            } else {
                groupCreateUserCell.setForbiddenCheck(true);
                groupCreateUserCell.setChecked(false, false);
                if (user2 instanceof TLRPC.User) {
                    string = user2.bot ? LocaleController.getString(R.string.FilterInviteBot) : LocaleController.getString(R.string.FilterInviteUser);
                } else if (user2 instanceof TLRPC.Chat) {
                    string = ChatObject.isChannelAndNotMegaGroup((TLRPC.Chat) user2) ? LocaleController.getString(R.string.FilterInviteChannel) : LocaleController.getString(R.string.FilterInviteGroup);
                }
            }
            groupCreateUserCell.setTag(l);
            groupCreateUserCell.setObject(user2, userName, string);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            FilterChatlistActivity filterChatlistActivity = FilterChatlistActivity.this;
            if (i == 0) {
                headerCell = new HintInnerCell(filterChatlistActivity.getParentActivity(), R.raw.folder_share);
            } else if (i == 2) {
                headerCell = new TextInfoPrivacyCell(filterChatlistActivity.getParentActivity(), 24, null);
            } else if (i == 3) {
                headerCell = new AnonymousClass1(filterChatlistActivity.getParentActivity(), filterChatlistActivity);
                headerCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else if (i == 4) {
                GroupCreateUserCell groupCreateUserCell = new GroupCreateUserCell(1, 0, filterChatlistActivity.getParentActivity(), null, false, false);
                groupCreateUserCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                headerCell = groupCreateUserCell;
            } else if (i == 5) {
                headerCell = new FolderBottomSheet.HeaderCell(filterChatlistActivity.getParentActivity());
                headerCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            } else {
                headerCell = null;
            }
            return new RecyclerListView.Holder(headerCell);
        }
    }

    public FilterChatlistActivity(MessagesController.DialogFilter dialogFilter, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.selectedPeers = new ArrayList();
        this.allowedPeers = new ArrayList();
        this.peers = new ArrayList();
        this.shiftDp = -5;
        this.saving = false;
        this.rowsCount = 0;
        this.linkRow = -1;
        this.linkHeaderRow = -1;
        this.linkSectionRow = -1;
        this.chatsHeaderRow = -1;
        this.chatsStartRow = -1;
        this.chatsEndRow = -1;
        this.chatsSectionRow = -1;
        this.enableDoneLoading = new ComposeDrawable$$ExternalSyntheticLambda0(this, 19);
        this.doneButtonAlpha = 1.0f;
        this.filter = dialogFilter;
        this.invite = tL_exportedChatlistInvite;
    }

    @Override
    public final boolean canBeginSlide() {
        return checkDiscard$8(true);
    }

    public final boolean checkDiscard$8(boolean z) {
        if (this.selectedPeers.isEmpty() || !this.peersChanged) {
            return true;
        }
        if (z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            String string = LocaleController.getString(R.string.UnsavedChanges);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = LocaleController.getString(R.string.UnsavedChangesMessage);
            final int i = 0;
            builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new AlertDialog.OnButtonClickListener(this) {
                public final FilterChatlistActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog2, int i2) {
                    switch (i) {
                        case 0:
                            this.f$0.save$1();
                            break;
                        default:
                            this.f$0.lambda$checkDiscard$10(alertDialog2, i2);
                            break;
                    }
                }
            });
            final int i2 = 1;
            builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new AlertDialog.OnButtonClickListener(this) {
                public final FilterChatlistActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog2, int i3) {
                    switch (i2) {
                        case 0:
                            this.f$0.save$1();
                            break;
                        default:
                            this.f$0.lambda$checkDiscard$10(alertDialog2, i3);
                            break;
                    }
                }
            });
            showDialog(alertDialog);
        }
        return false;
    }

    public final void checkDoneButton$3() {
        float f;
        boolean z = this.peersChanged;
        boolean zIsEmpty = this.selectedPeers.isEmpty();
        if (z) {
            f = !zIsEmpty ? 1.0f : 0.5f;
        } else {
            f = 0.0f;
        }
        if (Math.abs(this.doneButtonAlpha - f) > 0.1f) {
            this.doneButton.clearAnimation();
            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.doneButton.animate();
            this.doneButtonAlpha = f;
            viewPropertyAnimatorAnimate.alpha(f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        }
    }

    public final void checkPeersChanged() {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.invite;
        if (tL_exportedChatlistInvite == null || tL_exportedChatlistInvite.url == null || !this.peersChanged) {
            return;
        }
        ArrayList arrayList = this.selectedPeers;
        boolean z = true;
        boolean z2 = arrayList.size() != tL_exportedChatlistInvite.peers.size();
        if (!z2) {
            int i = 0;
            while (true) {
                if (i >= tL_exportedChatlistInvite.peers.size()) {
                    z = z2;
                    break;
                } else if (!arrayList.contains(Long.valueOf(DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(i))))) {
                    break;
                } else {
                    i++;
                }
            }
        } else {
            z = z2;
            break;
        }
        if (z) {
            return;
        }
        this.peersChanged = false;
        checkDoneButton$3();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        updateActionBarTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 16));
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i = Theme.key_actionBarDefaultIcon;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.MULTIPLY));
        CrossfadeDrawable crossfadeDrawable = new CrossfadeDrawable(drawableMutate, new CircularProgressDrawable(Theme.getColor(null, i, false)));
        this.doneButtonDrawable = crossfadeDrawable;
        this.doneButton = actionBarMenuCreateMenu.addItemWithWidth(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), crossfadeDrawable);
        checkDoneButton$3();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        MessageSeenView.AnonymousClass1 anonymousClass1 = new MessageSeenView.AnonymousClass1(context, 9, null);
        this.listView = anonymousClass1;
        anonymousClass1.setLayoutManager(new LinearLayoutManager(1, false));
        this.listView.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        MessageSeenView.AnonymousClass1 anonymousClass2 = this.listView;
        ListAdapter listAdapter = new ListAdapter();
        this.adapter = listAdapter;
        anonymousClass2.setAdapter(listAdapter);
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 10));
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.filter;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList arrayList = this.peers;
        arrayList.clear();
        ArrayList arrayList2 = this.allowedPeers;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.invite;
        if (tL_exportedChatlistInvite != null) {
            int iM = 0;
            while (iM < tL_exportedChatlistInvite.peers.size()) {
                long peerDialogId = DialogObject.getPeerDialogId(tL_exportedChatlistInvite.peers.get(iM));
                arrayList.add(Long.valueOf(peerDialogId));
                this.selectedPeers.add(Long.valueOf(peerDialogId));
                iM = MessagesController$$ExternalSyntheticOutline2.m(peerDialogId, arrayList2, iM, 1);
            }
        }
        for (int i2 = 0; i2 < dialogFilter.dialogs.size(); i2++) {
            TLRPC.Dialog dialog = dialogFilter.dialogs.get(i2);
            if (dialog != null && !DialogObject.isEncryptedDialog(dialog.id) && !arrayList.contains(Long.valueOf(dialog.id))) {
                long j = dialog.id;
                boolean zCanAddToFolder = j < 0;
                if (j < 0) {
                    zCanAddToFolder = FilterCreateActivity.canAddToFolder(getMessagesController().getChat(Long.valueOf(-dialog.id)));
                }
                if (zCanAddToFolder) {
                    arrayList.add(Long.valueOf(dialog.id));
                    arrayList2.add(Long.valueOf(dialog.id));
                }
            }
        }
        for (int i3 = 0; i3 < dialogFilter.dialogs.size(); i3++) {
            TLRPC.Dialog dialog2 = dialogFilter.dialogs.get(i3);
            if (dialog2 != null && !DialogObject.isEncryptedDialog(dialog2.id) && !arrayList.contains(Long.valueOf(dialog2.id)) && !arrayList2.contains(Long.valueOf(dialog2.id))) {
                arrayList.add(Long.valueOf(dialog2.id));
            }
        }
        this.rowsCount = 1;
        if (tL_exportedChatlistInvite != null) {
            this.linkHeaderRow = 1;
            this.linkRow = 2;
            this.rowsCount = 4;
            this.linkSectionRow = 3;
        } else {
            this.linkHeaderRow = -1;
            this.linkRow = -1;
            this.linkSectionRow = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList.isEmpty()) {
            this.chatsHeaderRow = -1;
            this.chatsStartRow = -1;
            this.chatsEndRow = -1;
            this.chatsSectionRow = -1;
        } else {
            int i4 = this.rowsCount;
            int i5 = i4 + 1;
            this.chatsHeaderRow = i4;
            int i6 = i4 + 2;
            this.rowsCount = i6;
            this.chatsStartRow = i5;
            int size = (arrayList.size() - 1) + i6;
            this.chatsEndRow = size;
            this.rowsCount = size + 1;
            this.chatsSectionRow = size;
        }
        ListAdapter listAdapter2 = this.adapter;
        if (listAdapter2 != null) {
            listAdapter2.mObservable.notifyChanged();
        }
        return this.fragmentView;
    }

    public final void deselectAll$1(FolderBottomSheet.HeaderCell headerCell, boolean z) {
        ArrayList arrayList = this.selectedPeers;
        arrayList.clear();
        ArrayList arrayList2 = this.allowedPeers;
        if (!z) {
            arrayList.addAll(arrayList2.subList(0, Math.min(getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault, arrayList2.size())));
        }
        headerCell.setAction(LocaleController.getString(arrayList.size() >= Math.min(getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault, arrayList2.size()) ? R.string.DeselectAll : R.string.SelectAll), new PhotoViewer$$ExternalSyntheticLambda89(this, headerCell, z, 22));
        this.peersChanged = true;
        checkPeersChanged();
        checkDoneButton$3();
        updateHeaderCell$1(true);
        updateHintCell();
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof GroupCreateUserCell) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    Long l = (Long) tag;
                    l.getClass();
                    ((GroupCreateUserCell) childAt).setChecked(arrayList.contains(l), true);
                }
            }
        }
    }

    public final void lambda$createView$0$6(int i, View view) {
        String string;
        String string2;
        if (getParentActivity() != null && (view instanceof GroupCreateUserCell)) {
            Long l = (Long) this.peers.get(i - this.chatsStartRow);
            long jLongValue = l.longValue();
            ArrayList arrayList = this.selectedPeers;
            if (arrayList.contains(l)) {
                arrayList.remove(l);
                this.peersChanged = true;
                checkDoneButton$3();
                ((GroupCreateUserCell) view).setChecked(false, true);
            } else {
                if (!this.allowedPeers.contains(l)) {
                    int i2 = -this.shiftDp;
                    this.shiftDp = i2;
                    AndroidUtilities.shakeViewSpring(view, i2);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    ArrayList arrayList2 = new ArrayList();
                    if (jLongValue >= 0) {
                        arrayList2.add(getMessagesController().getUser(l));
                        TLRPC.User user = getMessagesController().getUser(l);
                        string2 = (user == null || !user.bot) ? LocaleController.getString(R.string.FilterInviteUserToast) : LocaleController.getString(R.string.FilterInviteBotToast);
                    } else {
                        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-jLongValue));
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            string = ChatObject.isPublic(chat) ? LocaleController.getString(R.string.FilterInviteChannelToast) : LocaleController.getString(R.string.FilterInvitePrivateChannelToast);
                        } else {
                            string = ChatObject.isPublic(chat) ? LocaleController.getString(R.string.FilterInviteGroupToast) : LocaleController.getString(R.string.FilterInvitePrivateGroupToast);
                        }
                        arrayList2.add(chat);
                        string2 = string;
                    }
                    if (this.lastClickedDialogId != jLongValue || System.currentTimeMillis() - this.lastClicked > 1500) {
                        this.lastClickedDialogId = jLongValue;
                        this.lastClicked = System.currentTimeMillis();
                        BulletinFactory.of(this).createChatsBulletin(string2, arrayList2).show();
                        return;
                    }
                    return;
                }
                if (arrayList.size() + 1 > (getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault)) {
                    showDialog(new LimitReachedBottomSheet(4, this.currentAccount, getParentActivity(), this, null));
                    return;
                }
                arrayList.add(l);
                this.peersChanged = true;
                checkDoneButton$3();
                ((GroupCreateUserCell) view).setChecked(true, true);
            }
            checkPeersChanged();
            updateHeaderCell$1(true);
            updateHintCell();
        }
    }

    public final void lambda$save$1(TLRPC.TL_error tL_error) {
        updateDoneProgress$2(false);
        this.saving = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            showDialog(new LimitReachedBottomSheet(12, this.currentAccount, getParentActivity(), this, null));
            return;
        }
        if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            showDialog(new LimitReachedBottomSheet(4, this.currentAccount, getParentActivity(), this, null));
        } else if (tL_error == null || !"CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            finishFragment();
        } else {
            showDialog(new LimitReachedBottomSheet(13, this.currentAccount, getParentActivity(), this, null));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        return checkDiscard$8(z);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.savingTitleReqId != 0) {
            getConnectionsManager().cancelRequest(this.savingTitleReqId, true);
            this.savingTitleReqId = 0;
        }
    }

    public final void save$1() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.invite;
        if (tL_exportedChatlistInvite == null || this.saving || !this.peersChanged) {
            return;
        }
        updateDoneProgress$2(true);
        this.saving = true;
        tL_exportedChatlistInvite.peers.clear();
        int i = 0;
        while (true) {
            arrayList = this.selectedPeers;
            if (i >= arrayList.size()) {
                break;
            }
            tL_exportedChatlistInvite.peers.add(getMessagesController().getPeer(((Long) arrayList.get(i)).longValue()));
            i++;
        }
        TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = this.filter.id;
        String str = tL_exportedChatlistInvite.url;
        tL_chatlists_editExportedInvite.slug = str == null ? null : str.substring(str.lastIndexOf(47) + 1);
        tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
        tL_chatlists_editExportedInvite.flags |= 4;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            tL_chatlists_editExportedInvite.peers.add(getMessagesController().getInputPeer(((Long) arrayList.get(i2)).longValue()));
        }
        getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new FilterChatlistActivity$$ExternalSyntheticLambda5(this, 0));
        Utilities.Callback callback = this.onEdit;
        if (callback != null) {
            callback.run(tL_exportedChatlistInvite);
        }
    }

    public final void updateActionBarTitle(boolean z) {
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.invite;
        String string = TextUtils.isEmpty(tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.title) ? LocaleController.getString(R.string.FilterShare) : tL_exportedChatlistInvite.title;
        if (z) {
            this.actionBar.setTitleAnimated(string, false, 220L, null);
        } else {
            this.actionBar.setTitle(string);
        }
    }

    public final void updateDoneProgress$2(boolean z) {
        if (!z) {
            AndroidUtilities.cancelRunOnUIThread(this.enableDoneLoading);
        }
        if (this.doneButtonDrawable != null) {
            ValueAnimator valueAnimator = this.doneButtonDrawableAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.doneButtonDrawable.progress, z ? 1.0f : 0.0f);
            this.doneButtonDrawableAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 12));
            this.doneButtonDrawableAnimator.setDuration((long) (Math.abs(this.doneButtonDrawable.progress - (z ? 1.0f : 0.0f)) * 200.0f));
            this.doneButtonDrawableAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.doneButtonDrawableAnimator.start();
        }
    }

    public final void updateHeaderCell$1(boolean z) {
        FolderBottomSheet.HeaderCell headerCell = this.headerCountCell;
        if (headerCell == null) {
            return;
        }
        ArrayList arrayList = this.selectedPeers;
        headerCell.setText(arrayList.size() <= 0 ? LocaleController.getString("FilterInviteHeaderChatsEmpty") : LocaleController.formatPluralString("FilterInviteHeaderChats", arrayList.size(), new Object[0]), z);
        ArrayList arrayList2 = this.allowedPeers;
        if (arrayList2.size() > 1) {
            boolean z2 = arrayList.size() >= Math.min(getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault, arrayList2.size());
            this.headerCountCell.setAction(LocaleController.getString(!z2 ? R.string.SelectAll : R.string.DeselectAll), new TodoItemMenu$$ExternalSyntheticLambda5(1, this, z2));
        } else {
            this.headerCountCell.setAction("", null);
        }
        if (z) {
            AndroidUtilities.makeAccessibilityAnnouncement(((Object) this.headerCountCell.textView.getText()) + ", " + ((Object) this.headerCountCell.actionTextView.getText()));
        }
    }

    public final void updateHintCell() {
        HintInnerCell hintInnerCell = this.hintCountCell;
        if (hintInnerCell == null) {
            return;
        }
        if (this.invite == null) {
            String string = LocaleController.getString(R.string.FilterInviteHeaderNo);
            SpoilersTextView spoilersTextView = hintInnerCell.subtitleTextView;
            spoilersTextView.setText(string);
            spoilersTextView.cacheType = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = hintInnerCell.getSubtitleTextView().getPaint().getFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.filter;
        Spannable spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
        HintInnerCell hintInnerCell2 = this.hintCountCell;
        CharSequence charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralSpannable("FilterInviteHeader", this.selectedPeers.size(), spannableReplaceAnimatedEmoji));
        boolean z = dialogFilter.title_noanimate;
        hintInnerCell2.subtitleTextView.setText(charSequenceReplaceTags);
        hintInnerCell2.subtitleTextView.cacheType = z ? 26 : 0;
    }
}
