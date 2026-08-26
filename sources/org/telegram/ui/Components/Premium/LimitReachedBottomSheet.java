package org.telegram.ui.Components.Premium;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.palette.graphics.Palette;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda71;
import org.telegram.ui.Cells.AdminedChannelCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.GroupCreateUserCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.ChannelColorActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatEditActivity;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.AvatarsDrawable;
import org.telegram.ui.Components.AvatarsImageView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CounterView;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ImageUpdater$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Loadable;
import org.telegram.ui.Components.LoginOrView;
import org.telegram.ui.Components.PasscodeView$9$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Premium.boosts.BoostCounterView;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs$$ExternalSyntheticLambda10;
import org.telegram.ui.Components.Premium.boosts.BoostPagerBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.Premium.boosts.ReassignBoostBottomSheet;
import org.telegram.ui.Components.Reactions.ChatCustomReactionsEditActivity;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SearchField$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.ShareAlert$$ExternalSyntheticLambda15;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.GroupColorActivity;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda13;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda11;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.QrActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.ThemePreviewActivity;
import org.telegram.ui.VoIPFragment;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda42;

public class LimitReachedBottomSheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public final TextView actionBtn;
    public ArrayList boostFeatures;
    public int boostFeaturesStartRow;
    public ButtonWithCounterView boostMiniBtn;
    public final ButtonWithCounterView boostToUnlockGroupBtn;
    public TL_stories.TL_premium_boostsStatus boostsStatus;
    public int bottomRow;
    public ChannelBoostsController.CanApplyBoost canApplyBoost;
    public boolean canSendLink;
    public int chatEndRow;
    public ChatMessageCell chatMessageCell;
    public int chatStartRow;
    public final ArrayList chats;
    public int chatsTitleRow;
    public int currentValue;
    public long dialogId;
    public QrActivity.AnonymousClass2 divider;
    public int dividerRow;
    public int emptyViewDividerRow;
    public RecyclerItemsEnterAnimator enterAnimator;
    public final FireworksOverlay fireworksOverlay;
    public String forceLink;
    public TLRPC.Chat fromChat;
    public int headerRow;
    public HeaderView headerView;
    public final ArrayList inactiveChats;
    public final ArrayList inactiveChatsSignatures;
    public boolean isCurrentChat;
    public boolean isVeryLargeFile;
    public Palette.Builder limitParams;
    public HeaderView.AnonymousClass2 limitPreviewView;
    public int linkRow;
    public boolean loading;
    public int loadingRow;
    public boolean lockInvalidation;
    public Runnable onSuccessRunnable;
    public final BaseFragment parentFragment;
    public boolean parentIsChannel;
    public boolean premiumButtonSetSubscribe;
    public AnonymousClass1 premiumButtonView;
    public ArrayList premiumInviteBlockedUsers;
    public ArrayList premiumMessagingBlockedUsers;
    public int requiredLvl;
    public ArrayList restrictedUsers;
    public int rowCount;
    public final HashSet selectedChats;
    public int shiftDp;
    public Runnable statisticClickRunnable;
    public int storiesCount;
    public final int type;

    public final class AnonymousClass1 extends PremiumButtonView {
        public AnonymousClass1(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(AndroidUtilities.dp(8.0f), context, resourcesProvider, true);
        }

        @Override
        public final void invalidate() {
            if (LimitReachedBottomSheet.this.lockInvalidation) {
                return;
            }
            super.invalidate();
        }
    }

    public final class AnonymousClass5 extends RecyclerListView.SelectionAdapter {
        public AnonymousClass5() {
        }

        @Override
        public final int getItemCount() {
            return LimitReachedBottomSheet.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            int i2;
            LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
            if (limitReachedBottomSheet.headerRow == i) {
                return 0;
            }
            if (limitReachedBottomSheet.dividerRow == i) {
                return 2;
            }
            if (limitReachedBottomSheet.chatsTitleRow == i) {
                return 3;
            }
            if (limitReachedBottomSheet.loadingRow == i) {
                return 5;
            }
            if (limitReachedBottomSheet.emptyViewDividerRow == i) {
                return 6;
            }
            if (limitReachedBottomSheet.linkRow == i) {
                return 7;
            }
            if (limitReachedBottomSheet.bottomRow == i) {
                return 8;
            }
            ArrayList arrayList = limitReachedBottomSheet.boostFeatures;
            if (arrayList != null && i >= (i2 = limitReachedBottomSheet.boostFeaturesStartRow) && i <= arrayList.size() + i2) {
                return 9;
            }
            int i3 = limitReachedBottomSheet.type;
            return (i3 == 5 || i3 == 11 || i3 == 34) ? 4 : 1;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
            int i = limitReachedBottomSheet.type;
            if ((i == 11 || i == 34) && !limitReachedBottomSheet.canSendLink) {
                return false;
            }
            int i2 = viewHolder.mItemViewType;
            return i2 == 1 || i2 == 4;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            int i2 = viewHolder.mItemViewType;
            LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
            View view = viewHolder.itemView;
            if (i2 == 1) {
                TLRPC.Chat chat = (TLRPC.Chat) limitReachedBottomSheet.chats.get(i - limitReachedBottomSheet.chatStartRow);
                AdminedChannelCell adminedChannelCell = (AdminedChannelCell) view;
                TLRPC.Chat currentChannel = adminedChannelCell.getCurrentChannel();
                adminedChannelCell.setChannel(chat, false);
                adminedChannelCell.checkBox.checkBoxBase.setChecked(-1, limitReachedBottomSheet.selectedChats.contains(chat), currentChannel == chat);
                return;
            }
            if (i2 != 9) {
                if (i2 == 3) {
                    HeaderCell headerCell = (HeaderCell) view;
                    int i3 = limitReachedBottomSheet.type;
                    if (i3 != 11 && i3 != 34) {
                        if (i3 == 2) {
                            headerCell.setText(LocaleController.getString(R.string.YourPublicCommunities));
                            return;
                        } else {
                            headerCell.setText(LocaleController.getString(R.string.LastActiveCommunities));
                            return;
                        }
                    }
                    if (limitReachedBottomSheet.canSendLink) {
                        headerCell.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                        return;
                    } else if (limitReachedBottomSheet.restrictedUsers.size() == 1) {
                        headerCell.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                        return;
                    }
                }
                if (i2 != 4) {
                    return;
                }
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
                int i4 = limitReachedBottomSheet.type;
                HashSet hashSet = limitReachedBottomSheet.selectedChats;
                if (i4 == 5) {
                    TLRPC.Chat chat2 = (TLRPC.Chat) limitReachedBottomSheet.inactiveChats.get(i - limitReachedBottomSheet.chatStartRow);
                    String str = (String) limitReachedBottomSheet.inactiveChatsSignatures.get(i - limitReachedBottomSheet.chatStartRow);
                    String str2 = chat2.title;
                    z = ((float) i) != ((float) limitReachedBottomSheet.chatEndRow) - 1.0f;
                    groupCreateUserCell.setObject(chat2, str2, str);
                    groupCreateUserCell.drawDivider = z;
                    groupCreateUserCell.setChecked(hashSet.contains(chat2), false);
                    return;
                }
                if (i4 == 11 || i4 == 34) {
                    TLRPC.User user = (TLRPC.User) limitReachedBottomSheet.restrictedUsers.get(i - limitReachedBottomSheet.chatStartRow);
                    ArrayList arrayList = limitReachedBottomSheet.premiumMessagingBlockedUsers;
                    boolean z2 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                    TL_account.requirementToContactPremium requirementtocontactpremium = z2 ? new TL_account.requirementToContactPremium() : null;
                    groupCreateUserCell.showPremiumBlocked = true;
                    groupCreateUserCell.blockedOverridden = requirementtocontactpremium;
                    groupCreateUserCell.updatePremiumBlocked();
                    String string = z2 ? LocaleController.getString(R.string.InvitePremiumBlockedUser) : LocaleController.formatUserStatus(((BottomSheet) limitReachedBottomSheet).currentAccount, user, null, null);
                    String name = ContactsController.formatName(user.first_name, user.last_name);
                    z = ((float) i) != ((float) limitReachedBottomSheet.chatEndRow) - 1.0f;
                    groupCreateUserCell.setObject(user, name, string);
                    groupCreateUserCell.drawDivider = z;
                    groupCreateUserCell.setChecked(hashSet.contains(user), false);
                    return;
                }
                return;
            }
            int i5 = i - limitReachedBottomSheet.boostFeaturesStartRow;
            ArrayList arrayList2 = limitReachedBottomSheet.boostFeatures;
            if (arrayList2 == null || i5 < 0 || i5 >= arrayList2.size()) {
                return;
            }
            BoostFeatureCell boostFeatureCell = (BoostFeatureCell) view;
            BoostFeature boostFeature = (BoostFeature) limitReachedBottomSheet.boostFeatures.get(i5);
            boostFeatureCell.getClass();
            boolean z3 = boostFeature instanceof BoostFeature.BoostFeatureLevel;
            ImageView imageView = boostFeatureCell.imageView;
            SimpleTextView simpleTextView = boostFeatureCell.textView;
            ThemePreviewActivity.AnonymousClass14 anonymousClass14 = boostFeatureCell.levelLayout;
            if (z3) {
                boostFeatureCell.level = (BoostFeature.BoostFeatureLevel) boostFeature;
                boostFeatureCell.feature = null;
                imageView.setVisibility(8);
                simpleTextView.setVisibility(8);
                anonymousClass14.setVisibility(0);
                SimpleTextView simpleTextView2 = boostFeatureCell.levelTextView;
                BoostFeature.BoostFeatureLevel boostFeatureLevel = boostFeatureCell.level;
                simpleTextView2.setText(LocaleController.formatPluralString(boostFeatureLevel.isFirst ? "BoostLevelUnlocks" : "BoostLevel", boostFeatureLevel.lvl, new Object[0]), false);
                return;
            }
            if (boostFeature != null) {
                boostFeatureCell.level = null;
                boostFeatureCell.feature = boostFeature;
                imageView.setVisibility(0);
                imageView.setImageResource(boostFeatureCell.feature.iconResId);
                simpleTextView.setVisibility(0);
                BoostFeature boostFeature2 = boostFeatureCell.feature;
                if (boostFeature2.textKeyPlural != null) {
                    String string2 = LocaleController.getString(boostFeatureCell.feature.textKeyPlural + "_" + LocaleController.getStringParamForNumber(boostFeatureCell.feature.countPlural));
                    if (string2 == null || string2.startsWith("LOC_ERR")) {
                        string2 = LocaleController.getString(boostFeatureCell.feature.textKeyPlural + "_other");
                    }
                    if (string2 == null) {
                        string2 = "";
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
                    int iIndexOf = string2.indexOf("%d");
                    if (iIndexOf >= 0) {
                        spannableStringBuilder = new SpannableStringBuilder(string2);
                        SpannableString spannableString = new SpannableString(SurfaceContainer$$ExternalSyntheticOutline0.m(boostFeatureCell.feature.countPlural, "", new StringBuilder()));
                        spannableString.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                        spannableStringBuilder.replace(iIndexOf, iIndexOf + 2, (CharSequence) spannableString);
                    }
                    simpleTextView.setText(spannableStringBuilder, false);
                } else {
                    String string3 = LocaleController.getString(boostFeature2.textKey);
                    String str3 = string3 != null ? string3 : "";
                    if (boostFeatureCell.feature.countValue != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str3);
                        int iIndexOf2 = str3.indexOf("%s");
                        if (iIndexOf2 >= 0) {
                            spannableStringBuilder2 = new SpannableStringBuilder(str3);
                            SpannableString spannableString2 = new SpannableString(boostFeatureCell.feature.countValue);
                            spannableString2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                            spannableStringBuilder2.replace(iIndexOf2, iIndexOf2 + 2, (CharSequence) spannableString2);
                        }
                        simpleTextView.setText(spannableStringBuilder2, false);
                    } else {
                        simpleTextView.setText(str3, false);
                    }
                }
                anonymousClass14.setVisibility(8);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View adminedChannelCell;
            Context context = viewGroup.getContext();
            final int i2 = 0;
            LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
            switch (i) {
                case 1:
                    adminedChannelCell = new AdminedChannelCell(context, new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            AdminedChannelCell adminedChannelCell2 = (AdminedChannelCell) view.getParent();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(adminedChannelCell2.getCurrentChannel());
                            LimitReachedBottomSheet limitReachedBottomSheet2 = LimitReachedBottomSheet.this;
                            int i3 = LimitReachedBottomSheet.$r8$clinit;
                            limitReachedBottomSheet2.revokeLinks(arrayList);
                        }
                    }, true, 9);
                    break;
                case 2:
                    adminedChannelCell = new ShadowSectionCell(context, Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) limitReachedBottomSheet).resourcesProvider), 0);
                    break;
                case 3:
                    HeaderCell headerCell = new HeaderCell(context);
                    headerCell.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                    adminedChannelCell = headerCell;
                    break;
                case 4:
                    GroupCreateUserCell groupCreateUserCell = new GroupCreateUserCell(1, 0, context, ((BottomSheet) limitReachedBottomSheet).resourcesProvider, false, false);
                    groupCreateUserCell.setPadding(((BottomSheet) limitReachedBottomSheet).backgroundPaddingLeft, 0, ((BottomSheet) limitReachedBottomSheet).backgroundPaddingLeft, 0);
                    adminedChannelCell = groupCreateUserCell;
                    break;
                case 5:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
                    flickerLoadingView.setViewType(limitReachedBottomSheet.type == 2 ? 22 : 21);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setIgnoreHeightCheck(true);
                    flickerLoadingView.setItemsCount(10);
                    adminedChannelCell = flickerLoadingView;
                    break;
                case 6:
                    adminedChannelCell = new PaymentFormActivity.AnonymousClass2(limitReachedBottomSheet.getContext(), 11);
                    break;
                case 7:
                    FrameLayout frameLayout = new FrameLayout(limitReachedBottomSheet.getContext());
                    frameLayout.setPadding(AndroidUtilities.dp(6.0f) + ((BottomSheet) limitReachedBottomSheet).backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + ((BottomSheet) limitReachedBottomSheet).backgroundPaddingLeft, 0);
                    TextView textView = new TextView(context);
                    if (limitReachedBottomSheet.statisticClickRunnable == null && ChatObject.hasAdminRights(limitReachedBottomSheet.getChat$1$1())) {
                        limitReachedBottomSheet.statisticClickRunnable = new PasscodeView$9$$ExternalSyntheticLambda0(this, 13);
                    }
                    textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(limitReachedBottomSheet.statisticClickRunnable == null ? 18.0f : 50.0f), AndroidUtilities.dp(13.0f));
                    textView.setTextSize(1, 16.0f);
                    textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    textView.setSingleLine(true);
                    frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                    int iDp = AndroidUtilities.dp(8.0f);
                    int color = Theme.getColor(Theme.key_graySection, ((BottomSheet) limitReachedBottomSheet).resourcesProvider);
                    int i3 = Theme.key_listSelector;
                    int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(i3, ((BottomSheet) limitReachedBottomSheet).resourcesProvider), 76);
                    textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, alphaComponent, alphaComponent));
                    textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) limitReachedBottomSheet).resourcesProvider));
                    final int i4 = 2;
                    textView.setOnClickListener(new View.OnClickListener(this) {
                        public final LimitReachedBottomSheet.AnonymousClass5 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i4) {
                                case 0:
                                    LimitReachedBottomSheet limitReachedBottomSheet2 = LimitReachedBottomSheet.this;
                                    BoostPagerBottomSheet.show(limitReachedBottomSheet2.baseFragment, ((BottomSheet) limitReachedBottomSheet2).resourcesProvider, limitReachedBottomSheet2.dialogId, null);
                                    break;
                                case 1:
                                    LimitReachedBottomSheet limitReachedBottomSheet3 = LimitReachedBottomSheet.this;
                                    AndroidUtilities.addToClipboard(limitReachedBottomSheet3.getBoostLink());
                                    limitReachedBottomSheet3.lambda$showGiftOfferSheet$15();
                                    break;
                                case 2:
                                    AndroidUtilities.addToClipboard(LimitReachedBottomSheet.this.getBoostLink());
                                    break;
                                default:
                                    LimitReachedBottomSheet limitReachedBottomSheet4 = LimitReachedBottomSheet.this;
                                    limitReachedBottomSheet4.statisticClickRunnable.run();
                                    limitReachedBottomSheet4.lambda$showGiftOfferSheet$15();
                                    break;
                            }
                        }
                    });
                    if (limitReachedBottomSheet.statisticClickRunnable != null) {
                        ImageView imageView = new ImageView(limitReachedBottomSheet.getContext());
                        imageView.setImageResource(R.drawable.msg_stats);
                        imageView.setColorFilter(Theme.getColor(Theme.key_dialogTextBlack, ((BottomSheet) limitReachedBottomSheet).resourcesProvider));
                        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                        int iDp2 = AndroidUtilities.dp(20.0f);
                        int alphaComponent2 = ColorUtils.setAlphaComponent(Theme.getColor(i3, ((BottomSheet) limitReachedBottomSheet).resourcesProvider), 76);
                        imageView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, 0, alphaComponent2, alphaComponent2));
                        frameLayout.addView(imageView, LayoutHelper.createFrame(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                        final int i5 = 3;
                        imageView.setOnClickListener(new View.OnClickListener(this) {
                            public final LimitReachedBottomSheet.AnonymousClass5 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i5) {
                                    case 0:
                                        LimitReachedBottomSheet limitReachedBottomSheet2 = LimitReachedBottomSheet.this;
                                        BoostPagerBottomSheet.show(limitReachedBottomSheet2.baseFragment, ((BottomSheet) limitReachedBottomSheet2).resourcesProvider, limitReachedBottomSheet2.dialogId, null);
                                        break;
                                    case 1:
                                        LimitReachedBottomSheet limitReachedBottomSheet3 = LimitReachedBottomSheet.this;
                                        AndroidUtilities.addToClipboard(limitReachedBottomSheet3.getBoostLink());
                                        limitReachedBottomSheet3.lambda$showGiftOfferSheet$15();
                                        break;
                                    case 2:
                                        AndroidUtilities.addToClipboard(LimitReachedBottomSheet.this.getBoostLink());
                                        break;
                                    default:
                                        LimitReachedBottomSheet limitReachedBottomSheet4 = LimitReachedBottomSheet.this;
                                        limitReachedBottomSheet4.statisticClickRunnable.run();
                                        limitReachedBottomSheet4.lambda$showGiftOfferSheet$15();
                                        break;
                                }
                            }
                        });
                    }
                    textView.setText(limitReachedBottomSheet.getBoostLink());
                    textView.setGravity(17);
                    adminedChannelCell = frameLayout;
                    break;
                case 8:
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setPadding(AndroidUtilities.dp(6.0f) + ((BottomSheet) limitReachedBottomSheet).backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + ((BottomSheet) limitReachedBottomSheet).backgroundPaddingLeft, 0);
                    linearLayout.setOrientation(1);
                    LoginOrView loginOrView = new LoginOrView(context);
                    LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
                    SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(limitReachedBottomSheet.isGroup() ? R.string.BoostingStoriesByGiftingGroup2 : R.string.BoostingStoriesByGiftingChannel2));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                    spannableStringBuilder.setSpan(new ChatActivity.AnonymousClass102(this, 4), 0, spannableStringBuilder.length(), 33);
                    SpannableString spannableString = new SpannableString(">");
                    Drawable drawableMutate = limitReachedBottomSheet.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                    int i6 = Theme.key_chat_messageLinkIn;
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(i6, PorterDuff.Mode.SRC_IN));
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(0, drawableMutate);
                    coloredImageSpan.setColorKey(i6);
                    coloredImageSpan.setSize(AndroidUtilities.dp(18.0f));
                    coloredImageSpan.setWidth(AndroidUtilities.dp(11.0f));
                    coloredImageSpan.setTranslateX(-AndroidUtilities.dp(5.0f));
                    spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
                    linksTextView.setText(TextUtils.concat(spannableStringBuilderReplaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                    linksTextView.setTextSize(1, 14.0f);
                    linksTextView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                    if (((BottomSheet) limitReachedBottomSheet).resourcesProvider instanceof DarkThemeResourceProvider) {
                        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, ((BottomSheet) limitReachedBottomSheet).resourcesProvider));
                    } else {
                        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, ((BottomSheet) limitReachedBottomSheet).resourcesProvider));
                    }
                    linksTextView.setGravity(1);
                    linksTextView.setOnClickListener(new View.OnClickListener(this) {
                        public final LimitReachedBottomSheet.AnonymousClass5 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i2) {
                                case 0:
                                    LimitReachedBottomSheet limitReachedBottomSheet2 = LimitReachedBottomSheet.this;
                                    BoostPagerBottomSheet.show(limitReachedBottomSheet2.baseFragment, ((BottomSheet) limitReachedBottomSheet2).resourcesProvider, limitReachedBottomSheet2.dialogId, null);
                                    break;
                                case 1:
                                    LimitReachedBottomSheet limitReachedBottomSheet3 = LimitReachedBottomSheet.this;
                                    AndroidUtilities.addToClipboard(limitReachedBottomSheet3.getBoostLink());
                                    limitReachedBottomSheet3.lambda$showGiftOfferSheet$15();
                                    break;
                                case 2:
                                    AndroidUtilities.addToClipboard(LimitReachedBottomSheet.this.getBoostLink());
                                    break;
                                default:
                                    LimitReachedBottomSheet limitReachedBottomSheet4 = LimitReachedBottomSheet.this;
                                    limitReachedBottomSheet4.statisticClickRunnable.run();
                                    limitReachedBottomSheet4.lambda$showGiftOfferSheet$15();
                                    break;
                            }
                        }
                    });
                    loginOrView.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(linksTextView, 16));
                    if (limitReachedBottomSheet.isMiniBoostBtnForAdminAvailable()) {
                        final int i7 = 1;
                        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, ((BottomSheet) limitReachedBottomSheet).resourcesProvider, true);
                        buttonWithCounterView.setText(LocaleController.getString(R.string.Copy), false, true);
                        buttonWithCounterView.setOnClickListener(new View.OnClickListener(this) {
                            public final LimitReachedBottomSheet.AnonymousClass5 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        LimitReachedBottomSheet limitReachedBottomSheet2 = LimitReachedBottomSheet.this;
                                        BoostPagerBottomSheet.show(limitReachedBottomSheet2.baseFragment, ((BottomSheet) limitReachedBottomSheet2).resourcesProvider, limitReachedBottomSheet2.dialogId, null);
                                        break;
                                    case 1:
                                        LimitReachedBottomSheet limitReachedBottomSheet3 = LimitReachedBottomSheet.this;
                                        AndroidUtilities.addToClipboard(limitReachedBottomSheet3.getBoostLink());
                                        limitReachedBottomSheet3.lambda$showGiftOfferSheet$15();
                                        break;
                                    case 2:
                                        AndroidUtilities.addToClipboard(LimitReachedBottomSheet.this.getBoostLink());
                                        break;
                                    default:
                                        LimitReachedBottomSheet limitReachedBottomSheet4 = LimitReachedBottomSheet.this;
                                        limitReachedBottomSheet4.statisticClickRunnable.run();
                                        limitReachedBottomSheet4.lambda$showGiftOfferSheet$15();
                                        break;
                                }
                            }
                        });
                        LinearLayout linearLayout2 = new LinearLayout(context);
                        linearLayout2.addView(limitReachedBottomSheet.boostMiniBtn, LayoutHelper.createLinear(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                        linearLayout2.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                    } else {
                        linearLayout.addView(limitReachedBottomSheet.actionBtn, LayoutHelper.createLinear(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                    }
                    linearLayout.addView(loginOrView, LayoutHelper.createLinear(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                    linearLayout.addView(linksTextView, LayoutHelper.createLinear(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                    adminedChannelCell = linearLayout;
                    break;
                case 9:
                    adminedChannelCell = new BoostFeatureCell(limitReachedBottomSheet, context, ((BottomSheet) limitReachedBottomSheet).resourcesProvider);
                    break;
                default:
                    HeaderView headerView = limitReachedBottomSheet.new HeaderView(context);
                    limitReachedBottomSheet.headerView = headerView;
                    adminedChannelCell = headerView;
                    break;
            }
            return zzkl.m(adminedChannelCell, adminedChannelCell);
        }
    }

    public class BoostFeature {
        public final int countPlural;
        public final String countValue;
        public final int iconResId;
        public boolean incremental;
        public final int textKey;
        public final String textKeyPlural;

        public final class BoostFeatureLevel extends BoostFeature {
            public final boolean isFirst;
            public final int lvl;

            public BoostFeatureLevel(int i, boolean z) {
                super(-1, -1, -1, null, null);
                this.lvl = i;
                this.isFirst = z;
            }
        }

        public BoostFeature(int i, int i2, int i3, String str, String str2) {
            this.iconResId = i;
            this.textKey = i2;
            this.countValue = str;
            this.textKeyPlural = str2;
            this.countPlural = i3;
        }

        public static BoostFeature of(int i, int i2) {
            return new BoostFeature(i, i2, -1, null, null);
        }
    }

    public final class BoostFeatureCell extends FrameLayout {
        public BoostFeature feature;
        public final ImageView imageView;
        public BoostFeature.BoostFeatureLevel level;
        public final ThemePreviewActivity.AnonymousClass14 levelLayout;
        public final SimpleTextView levelTextView;
        public final SimpleTextView textView;

        public BoostFeatureCell(LimitReachedBottomSheet limitReachedBottomSheet, Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            setPadding(((BottomSheet) limitReachedBottomSheet).backgroundPaddingLeft, 0, ((BottomSheet) limitReachedBottomSheet).backgroundPaddingLeft, 0);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_premiumGradient1, resourcesProvider), PorterDuff.Mode.SRC_IN));
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.textView = simpleTextView;
            simpleTextView.setWidthWrapContent(true);
            simpleTextView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            simpleTextView.setTextSize(14);
            boolean z = LocaleController.isRTL;
            addView(simpleTextView, LayoutHelper.createFrame(-2, -2.0f, (z ? 5 : 3) | 16, z ? 30.0f : 60.0f, 0.0f, z ? 60.0f : 30.0f, 0.0f));
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.levelTextView = simpleTextView2;
            simpleTextView2.setTextColor(-1);
            simpleTextView2.setWidthWrapContent(true);
            simpleTextView2.setTypeface(AndroidUtilities.bold());
            simpleTextView2.setTextSize(14);
            ThemePreviewActivity.AnonymousClass14 anonymousClass14 = new ThemePreviewActivity.AnonymousClass14(this, context, resourcesProvider);
            this.levelLayout = anonymousClass14;
            anonymousClass14.setWillNotDraw(false);
            anonymousClass14.addView(simpleTextView2, LayoutHelper.createFrame(-2, -2, 17));
            addView(anonymousClass14, LayoutHelper.createFrame(-1.0f, -1));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.level != null ? 49.0f : 36.0f), 1073741824));
        }
    }

    public final class HeaderView extends LinearLayout {
        public final BoostCounterView boostCounterView;
        public TextView description;
        public TextView title;
        public LinearLayout titleLinearLayout;

        public final class AnonymousClass2 extends LimitPreviewView {
            public AnonymousClass2(Context context, int i, int i2, int i3, float f, Theme.ResourcesProvider resourcesProvider) {
                super(context, i, i2, i3, f, resourcesProvider);
            }

            @Override
            public final void invalidate() {
                if (LimitReachedBottomSheet.this.lockInvalidation) {
                    return;
                }
                super.invalidate();
            }
        }

        public HeaderView(Context context) {
            String string;
            String string2;
            boolean z;
            int i;
            int i2;
            int activatedAccountsCount;
            ArrayList<TLRPC.Dialog> dialogs;
            int size;
            int i3;
            int i4;
            TLRPC.Dialog dialog;
            float f;
            float f2;
            boolean z2;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            AvatarsImageView avatarsImageView;
            AvatarsDrawable avatarsDrawable;
            int iMin;
            int i5;
            TextView textView;
            boolean z3;
            ArrayList arrayList4;
            boolean z4;
            String str;
            String string3;
            int i6;
            int i7;
            ArrayList arrayList5;
            int size2;
            ArrayList arrayList6;
            int size3;
            int i8;
            int i9;
            BoostCounterView boostCounterView;
            int i10;
            TLRPC.Chat chat;
            TextView textView2;
            final int i11;
            int i12;
            AnonymousClass2 anonymousClass2;
            float f3;
            boolean z5;
            int i13;
            LimitPreviewView.CounterView counterView;
            ChannelBoostsController.CanApplyBoost canApplyBoost;
            boolean z6;
            float f4;
            float f5;
            super(context);
            setOrientation(1);
            setPadding(AndroidUtilities.dp(6.0f) + ((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + ((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft, 0);
            int i14 = ((BottomSheet) LimitReachedBottomSheet.this).currentAccount;
            int i15 = LimitReachedBottomSheet.this.type;
            Palette.Builder limitParams = LimitReachedBottomSheet.getLimitParams(i15, i14);
            LimitReachedBottomSheet.this.limitParams = limitParams;
            int i16 = limitParams.mMaxColors;
            MessagesController messagesController = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount);
            boolean zPremiumFeaturesBlocked = messagesController.premiumFeaturesBlocked();
            boolean zIsGroup = LimitReachedBottomSheet.this.isGroup();
            BaseFragment baseFragment = LimitReachedBottomSheet.this.baseFragment;
            if (i15 == 31) {
                string = LocaleController.getString(zIsGroup ? R.string.BoostingAdditionalFeaturesSubtitle : R.string.BoostingAdditionalFeaturesSubtitleChannel);
            } else if (i15 == 32) {
                string = LimitReachedBottomSheet.this.getBoostsDescriptionString(true);
            } else if (i15 == 19) {
                ChatMessageCell chatMessageCell = LimitReachedBottomSheet.this.chatMessageCell;
                if (chatMessageCell != null) {
                    int i17 = chatMessageCell.getMessageObject().messageOwner.from_boosts_applied;
                    TLRPC.Chat chat$1$1 = LimitReachedBottomSheet.this.getChat$1$1();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("GroupBoostedByUserWithTimes", i17, UserObject.getFirstName(LimitReachedBottomSheet.this.chatMessageCell.getCurrentUser())));
                    spannableStringBuilder.append((CharSequence) " ");
                    spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.GroupBoostedByUserWithDescription, chat$1$1 == null ? "" : chat$1$1.title));
                    string = spannableStringBuilder.toString();
                } else if (baseFragment instanceof GroupColorActivity) {
                    string = LocaleController.formatPluralString("BoostingGroupBoostWhatAreBoostsDescription", (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayBoostsPerPremium, new Object[0]);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LimitReachedBottomSheet.this.getBoostsDescriptionString(true));
                    if (ChatObject.hasAdminRights(LimitReachedBottomSheet.this.getChat$1$1()) && zIsGroup) {
                        spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.BoostingPremiumUserCanBoostGroupWithLink));
                    }
                    string = spannableStringBuilder2.toString();
                }
            } else if (i15 == 18) {
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = LimitReachedBottomSheet.this.boostsStatus;
                if (tL_premium_boostsStatus.level == 0) {
                    int i18 = zIsGroup ? R.string.GroupNeedBoostsDescription : R.string.ChannelNeedBoostsDescription;
                    int i19 = tL_premium_boostsStatus.next_level_boosts;
                    string = LocaleController.formatString(i18, LocaleController.formatPluralString("MoreBoosts", i19, Integer.valueOf(i19)));
                } else {
                    int i20 = zIsGroup ? R.string.GroupNeedBoostsDescriptionNextLevel : R.string.ChannelNeedBoostsDescriptionNextLevel;
                    int i21 = tL_premium_boostsStatus.next_level_boosts;
                    int i22 = tL_premium_boostsStatus.boosts;
                    string = LocaleController.formatString(i20, LocaleController.formatPluralString("MoreBoosts", i21 - i22, Integer.valueOf(i21 - i22)), LocaleController.formatPluralString("BoostStories", LimitReachedBottomSheet.this.boostsStatus.level + 1, new Object[0]));
                }
            } else if (i15 == 20) {
                string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(LimitReachedBottomSheet.this.channelColorLevelMin()));
            } else if (i15 == 24) {
                string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(LimitReachedBottomSheet.this.channelColorLevelMin()));
            } else if (i15 == 29) {
                string = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
            } else if (i15 == 30) {
                string = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
            } else if (i15 == 35) {
                string = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
            } else if (i15 == 25) {
                string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(zIsGroup ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
            } else if (i15 == 26) {
                string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(zIsGroup ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
            } else if (i15 == 27) {
                string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
            } else if (i15 == 28) {
                string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(zIsGroup ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
            } else if (i15 == 22) {
                string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(zIsGroup ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
            } else if (i15 == 23) {
                string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(zIsGroup ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
            } else {
                if (i15 != 21) {
                    if (i15 == 11) {
                        string2 = !LimitReachedBottomSheet.this.canSendLink ? ChatObject.isChannelAndNotMegaGroup(LimitReachedBottomSheet.this.fromChat) ? LimitReachedBottomSheet.this.restrictedUsers.size() == 1 ? LocaleController.formatString(R.string.InviteChannelRestrictedUsers2One, ContactsController.formatName((TLRPC.User) LimitReachedBottomSheet.this.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers2", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size())) : LimitReachedBottomSheet.this.restrictedUsers.size() == 1 ? LocaleController.formatString(R.string.InviteRestrictedUsers2One, ContactsController.formatName((TLRPC.User) LimitReachedBottomSheet.this.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteRestrictedUsers2", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size())) : ChatObject.isChannelAndNotMegaGroup(LimitReachedBottomSheet.this.fromChat) ? LimitReachedBottomSheet.this.restrictedUsers.size() == 1 ? LocaleController.formatString(R.string.InviteChannelRestrictedUsersOne, ContactsController.formatName((TLRPC.User) LimitReachedBottomSheet.this.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size())) : LimitReachedBottomSheet.this.restrictedUsers.size() == 1 ? LocaleController.formatString(R.string.InviteRestrictedUsersOne, ContactsController.formatName((TLRPC.User) LimitReachedBottomSheet.this.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteRestrictedUsers", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size()));
                        z = true;
                    } else if (i15 == 34) {
                        string = LimitReachedBottomSheet.this.restrictedUsers.size() == 1 ? LocaleController.formatString(R.string.InviteCallRestrictedUsersOne, ContactsController.formatName((TLRPC.User) LimitReachedBottomSheet.this.restrictedUsers.get(0))) : LocaleController.formatPluralString("InviteCallRestrictedUsers", LimitReachedBottomSheet.this.restrictedUsers.size(), Integer.valueOf(LimitReachedBottomSheet.this.restrictedUsers.size()));
                    } else if (zPremiumFeaturesBlocked) {
                        string = (String) LimitReachedBottomSheet.this.limitParams.mFilters;
                    } else {
                        string = (String) ((UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium() || LimitReachedBottomSheet.this.isVeryLargeFile) ? LimitReachedBottomSheet.this.limitParams.mTargets : LimitReachedBottomSheet.this.limitParams.mBitmap);
                    }
                    Palette.Builder builder = LimitReachedBottomSheet.this.limitParams;
                    i = builder.mResizeArea;
                    i2 = builder.mResizeMaxDimension;
                    activatedAccountsCount = LimitReachedBottomSheet.this.currentValue;
                    if (i15 == 3) {
                        activatedAccountsCount = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).dialogFilters.size() - 1;
                    } else if (i15 == 7) {
                        activatedAccountsCount = UserConfig.getActivatedAccountsCount();
                    } else if (i15 == 0) {
                        dialogs = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getDialogs(0);
                        size = dialogs.size();
                        i4 = 0;
                        for (i3 = 0; i3 < size; i3++) {
                            dialog = dialogs.get(i3);
                            if (!(dialog instanceof TLRPC.TL_dialogFolder) && dialog.pinned) {
                                i4++;
                            }
                        }
                        activatedAccountsCount = i4;
                    }
                    if (!UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium() || LimitReachedBottomSheet.this.isVeryLargeFile) {
                        activatedAccountsCount = i2;
                        f = 1.0f;
                    } else {
                        activatedAccountsCount = activatedAccountsCount < 0 ? i : activatedAccountsCount;
                        if (i15 != 7) {
                            f4 = activatedAccountsCount;
                            f5 = i2;
                        } else if (activatedAccountsCount > i) {
                            f4 = activatedAccountsCount - i;
                            f5 = i2 - i;
                        } else {
                            f = 0.5f;
                        }
                        f = f4 / f5;
                    }
                    f2 = i / i2;
                    if (i15 == 18 && i15 != 20 && i15 != 24 && i15 != 25 && i15 != 26 && i15 != 29 && i15 != 22 && i15 != 23 && i15 != 19 && i15 != 30 && i15 != 35 && i15 != 21 && i15 != 27 && i15 != 28) {
                        if (i15 != 32) {
                            z2 = false;
                        }
                        activatedAccountsCount = z2 ? 0 : activatedAccountsCount;
                        if ((i15 != 11 || i15 == 34) && !MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).premiumFeaturesBlocked() && (!((arrayList = LimitReachedBottomSheet.this.premiumInviteBlockedUsers) == null || arrayList.isEmpty()) || ((arrayList2 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers) != null && arrayList2.size() >= LimitReachedBottomSheet.this.restrictedUsers.size()))) {
                            if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
                                arrayList3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                            } else {
                                arrayList3 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                            }
                            avatarsImageView = new AvatarsImageView(context, false);
                            int iDp = AndroidUtilities.dp(3.33f);
                            avatarsDrawable = avatarsImageView.avatarsDrawable;
                            avatarsDrawable.strokeWidth = iDp;
                            avatarsImageView.setSize(AndroidUtilities.dp(72.0f));
                            avatarsImageView.setStepFactor(0.4f);
                            iMin = Math.min(arrayList3.size(), 3);
                            avatarsImageView.setCount(iMin);
                            for (i5 = 0; i5 < iMin; i5++) {
                                Long l = (Long) arrayList3.get(i5);
                                l.getClass();
                                avatarsDrawable.setObject(i5, MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser(l), ((BottomSheet) LimitReachedBottomSheet.this).currentAccount);
                            }
                            avatarsDrawable.commitTransition(false, true);
                            addView(avatarsImageView, LayoutHelper.createLinear(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                            TextView textView3 = new TextView(context);
                            textView3.setGravity(17);
                            zzkh.m(20.0f, textView3);
                            int i23 = Theme.key_dialogTextBlack;
                            textView3.setTextColor(Theme.getColor(i23, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            textView3.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                            addView(textView3, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                            textView = new TextView(context);
                            textView.setGravity(17);
                            textView.setTextSize(1, 14.0f);
                            textView.setTextColor(Theme.getColor(i23, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                            if (i15 == 34) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            arrayList4 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                            if (arrayList4 != null || arrayList4.size() < LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size()) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (arrayList3.size() == 1) {
                                if (z3) {
                                    i8 = R.string.InviteCallMessagePremiumBlockedOne;
                                } else if (z4) {
                                    i8 = R.string.InviteMessagePremiumBlockedOne;
                                } else {
                                    i8 = R.string.InvitePremiumBlockedOne;
                                }
                                string3 = LocaleController.formatString(i8, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))));
                            } else if (arrayList3.size() == 2) {
                                if (z3) {
                                    i7 = R.string.InviteCallMessagePremiumBlockedTwo;
                                } else if (z4) {
                                    i7 = R.string.InviteMessagePremiumBlockedTwo;
                                } else {
                                    i7 = R.string.InvitePremiumBlockedTwo;
                                }
                                string3 = LocaleController.formatString(i7, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(1))));
                            } else if (arrayList3.size() == 3) {
                                if (z3) {
                                    i6 = R.string.InviteCallMessagePremiumBlockedThree;
                                } else if (z4) {
                                    i6 = R.string.InviteMessagePremiumBlockedThree;
                                } else {
                                    i6 = R.string.InvitePremiumBlockedThree;
                                }
                                string3 = LocaleController.formatString(i6, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(2))));
                            } else {
                                if (z3) {
                                    str = "InviteCallMessagePremiumBlockedMany";
                                } else if (z4) {
                                    str = "InviteMessagePremiumBlockedMany";
                                } else {
                                    str = "InvitePremiumBlockedMany";
                                }
                                String pluralString = LocaleController.formatPluralString(str, arrayList3.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(1))));
                                int size4 = arrayList3.size() - 2;
                                int themedColor = LimitReachedBottomSheet.this.getThemedColor(Theme.key_dialogBackground);
                                avatarsImageView.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, null);
                                avatarsImageView.plusText = new Text(DiffUtil.m(size4, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                                Paint paint = new Paint(1);
                                avatarsImageView.plusBgPaint = paint;
                                paint.setColor(themedColor);
                                string3 = pluralString;
                            }
                            textView.setText(AndroidUtilities.replaceTags(string3));
                            arrayList5 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                            if (arrayList5 == null) {
                                size2 = 0;
                            } else {
                                size2 = arrayList5.size();
                            }
                            arrayList6 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                            if (arrayList6 == null) {
                                size3 = 0;
                            } else {
                                size3 = arrayList6.size();
                            }
                            if (size2 - size3 > 0 || ((size2 == 1 && size3 == 1) || !LimitReachedBottomSheet.this.canSendLink)) {
                                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                                LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                            } else {
                                final int i24 = 0;
                                PremiumButtonView premiumButtonView = new PremiumButtonView(AndroidUtilities.dp(8.0f), context, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider, false);
                                ScaleStateListAnimator.apply(premiumButtonView, 0.02f, 1.2f);
                                premiumButtonView.setButton(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), new View.OnClickListener(this) {
                                    public final LimitReachedBottomSheet.HeaderView f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void onClick(View view) {
                                        switch (i24) {
                                            case 0:
                                                BaseFragment baseFragment2 = LimitReachedBottomSheet.this.parentFragment;
                                                if (baseFragment2 != null) {
                                                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                                                    bottomSheetParams.transitionFromLeft = true;
                                                    baseFragment2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bottomSheetParams);
                                                    break;
                                                }
                                                break;
                                            default:
                                                LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                                                limitReachedBottomSheet.baseFragment.presentFragment(ChatActivity.of(limitReachedBottomSheet.dialogId));
                                                limitReachedBottomSheet.lambda$showGiftOfferSheet$15();
                                                break;
                                        }
                                    }
                                }, false);
                                addView(premiumButtonView, LayoutHelper.createLinear((((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft / AndroidUtilities.density) + 4.0f, 0.0f, (((BottomSheet) LimitReachedBottomSheet.this).backgroundPaddingLeft / AndroidUtilities.density) + 4.0f, 18.0f, -1, 48));
                                IntroActivity.AnonymousClass4 anonymousClass4 = new IntroActivity.AnonymousClass4(this, context);
                                anonymousClass4.setGravity(17);
                                anonymousClass4.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                anonymousClass4.setText(" " + LocaleController.getString(R.string.InvitePremiumBlockedOr) + " ");
                                anonymousClass4.setTextSize(14.0f);
                                addView(anonymousClass4, LayoutHelper.createLinear(190, -2, 1, 12, 0, 12, 20));
                                TextView textView4 = new TextView(context);
                                textView4.setGravity(17);
                                textView4.setTypeface(AndroidUtilities.bold());
                                textView4.setTextSize(1, 20.0f);
                                textView4.setTextColor(Theme.getColor(i23, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                textView4.setText(LocaleController.getString(R.string.InviteBlockedTitle));
                                addView(textView4, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                                TextView textView5 = new TextView(context);
                                textView5.setGravity(17);
                                textView5.setTextSize(1, 14.0f);
                                textView5.setTextColor(Theme.getColor(i23, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.size() <= 1) {
                                    textView5.setText(LocaleController.getString(R.string.InviteBlockedOneMessage));
                                } else {
                                    textView5.setText(LocaleController.getString(R.string.InviteBlockedManyMessage));
                                }
                                addView(textView5, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                            }
                            LimitReachedBottomSheet.this.updatePremiumButtonText();
                            return;
                        }
                        if (i15 != 31 && i15 != 34) {
                            f3 = f;
                            anonymousClass2 = new AnonymousClass2(context, i16, activatedAccountsCount, i2, f2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                            LimitReachedBottomSheet.this.limitPreviewView = anonymousClass2;
                            if (!z2) {
                                anonymousClass2.setBagePosition(f3);
                                LimitReachedBottomSheet.this.limitPreviewView.setType(i15);
                                LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setVisibility(8);
                                if (z) {
                                    AnonymousClass2 anonymousClass3 = LimitReachedBottomSheet.this.limitPreviewView;
                                    anonymousClass3.limitsContainer.setVisibility(8);
                                    counterView = anonymousClass3.limitIcon;
                                    if (counterView != null) {
                                        counterView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f));
                                    }
                                    anonymousClass3.premiumLocked = true;
                                } else {
                                    if (!UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium() || LimitReachedBottomSheet.this.isVeryLargeFile) {
                                        LimitReachedBottomSheet.this.limitPreviewView.premiumCount.setVisibility(8);
                                        if (i15 == 6) {
                                            LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setText("2 GB");
                                        } else {
                                            LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setText(Integer.toString(i));
                                        }
                                        z5 = false;
                                        LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setVisibility(0);
                                        i13 = 2;
                                    }
                                    if (i15 != i13 || i15 == 5) {
                                        LimitReachedBottomSheet.this.limitPreviewView.animationCanPlay = z5;
                                    }
                                    addView(LimitReachedBottomSheet.this.limitPreviewView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                                }
                            } else if (LimitReachedBottomSheet.this.boostsStatus != null) {
                                AnonymousClass2 anonymousClass5 = LimitReachedBottomSheet.this.limitPreviewView;
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = LimitReachedBottomSheet.this.boostsStatus;
                                canApplyBoost = LimitReachedBottomSheet.this.canApplyBoost;
                                if (canApplyBoost == null && canApplyBoost.boostedNow) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                anonymousClass5.setBoosts(tL_premium_boostsStatus2, z6);
                            }
                            i13 = 2;
                            z5 = false;
                            if (i15 != i13) {
                                LimitReachedBottomSheet.this.limitPreviewView.animationCanPlay = z5;
                            } else {
                                LimitReachedBottomSheet.this.limitPreviewView.animationCanPlay = z5;
                            }
                            addView(LimitReachedBottomSheet.this.limitPreviewView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                        }
                        if (i15 == 31) {
                            FrameLayout frameLayout = new FrameLayout(context);
                            ImageView imageView = new ImageView(context);
                            imageView.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.large_boosts));
                            frameLayout.addView(imageView, LayoutHelper.createFrame(-2, -2, 17));
                            frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(79.0f), Theme.getColor(Theme.key_featuredStickers_addButton)));
                            addView(frameLayout, LayoutHelper.createLinear(79, 79, 1, 0, 23, 0, 0));
                        }
                        TextView textView6 = new TextView(context);
                        this.title = textView6;
                        textView6.setTypeface(AndroidUtilities.bold());
                        if (i15 == 31) {
                            this.title.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                        } else if (i15 == 32) {
                            this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                        } else if (i15 == 19) {
                            if (baseFragment instanceof GroupColorActivity) {
                                this.title.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                            } else {
                                this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                            }
                        } else if (i15 == 30) {
                            this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                        } else if (i15 == 35) {
                            this.title.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                        } else if (i15 == 18) {
                            if (LimitReachedBottomSheet.this.boostsStatus.level == 0) {
                                this.title.setText(LocaleController.getString(R.string.BoostingEnableStories));
                            } else {
                                this.title.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                            }
                        } else if (i15 == 21) {
                            this.title.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                        } else if (i15 == 20) {
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableColor));
                        } else if (i15 == 24) {
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                        } else if (i15 == 27) {
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                        } else if (i15 == 28) {
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                        } else if (i15 == 25) {
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                        } else {
                            if (i15 != 26) {
                                if (i15 == 29) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                                } else if (i15 != 22 || i15 == 23) {
                                    this.title.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                                } else if (i15 == 11) {
                                    if (LimitReachedBottomSheet.this.canSendLink) {
                                        this.title.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                                    } else {
                                        this.title.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted));
                                    }
                                } else if (i15 == 34) {
                                    this.title.setText(LocaleController.getString(R.string.CallInviteViaLinkTitle));
                                } else if (i15 == 6) {
                                    this.title.setText(LocaleController.getString(R.string.FileTooLarge));
                                } else if (i15 != 14 || LimitReachedBottomSheet.this.storiesCount <= 1) {
                                    this.title.setText(LocaleController.getString(R.string.LimitReached));
                                } else {
                                    this.title.setText(LocaleController.getString(R.string.CreateMultipleStories));
                                }
                                this.title.setTextSize(1, 20.0f);
                                TextView textView7 = this.title;
                                i9 = Theme.key_windowBackgroundWhiteBlackText;
                                textView7.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                this.title.setGravity(17);
                                if (i15 != 19 || i15 == 32 || LimitReachedBottomSheet.this.isMiniBoostBtnForAdminAvailable()) {
                                    ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider;
                                    boostCounterView = new BoostCounterView(context);
                                    this.boostCounterView = boostCounterView;
                                    boostCounterView.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                                    if (i15 == 32) {
                                        boostCounterView.setVisibility(8);
                                    }
                                    if (LimitReachedBottomSheet.this.isCurrentChat) {
                                        LinearLayout linearLayout = new LinearLayout(context);
                                        this.titleLinearLayout = linearLayout;
                                        linearLayout.setOrientation(0);
                                        this.titleLinearLayout.setWeightSum(1.0f);
                                        this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                        this.titleLinearLayout.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                        View view = this.titleLinearLayout;
                                        if (z) {
                                            i12 = 8;
                                        } else {
                                            i12 = 22;
                                        }
                                        addView(view, LayoutHelper.createLinear(-2, -2, 1, 12, i12, 12, 9));
                                    } else {
                                        View view2 = this.title;
                                        if (z) {
                                            i10 = 8;
                                        } else {
                                            i10 = 22;
                                        }
                                        addView(view2, LayoutHelper.createLinear(-2, -2, 1, 0, i10, 0, 0));
                                        LinearLayout linearLayout2 = new LinearLayout(getContext());
                                        linearLayout2.setOrientation(0);
                                        linearLayout2.setClipChildren(false);
                                        FrameLayout frameLayout2 = new FrameLayout(getContext());
                                        frameLayout2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                        BackupImageView backupImageView = new BackupImageView(getContext());
                                        backupImageView.setRoundRadius(AndroidUtilities.dp(14.0f));
                                        chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                        AvatarDrawable avatarDrawable = new AvatarDrawable();
                                        avatarDrawable.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                                        backupImageView.setForUserOrChat(chat, avatarDrawable);
                                        frameLayout2.addView(backupImageView, LayoutHelper.createFrame(28.0f, 28));
                                        textView2 = new TextView(getContext());
                                        if (chat != null) {
                                            textView2.setText(chat.title);
                                        }
                                        textView2.setSingleLine(true);
                                        textView2.setMaxLines(1);
                                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                                        textView2.setTextSize(1, 13.0f);
                                        textView2.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                        frameLayout2.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                        linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                        LayoutTransition layoutTransition = new LayoutTransition();
                                        layoutTransition.setDuration(100L);
                                        layoutTransition.enableTransitionType(4);
                                        linearLayout2.setLayoutTransition(layoutTransition);
                                        linearLayout2.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                        addView(linearLayout2, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                        ScaleStateListAnimator.apply(linearLayout2);
                                        i11 = 1;
                                        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
                                            public final LimitReachedBottomSheet.HeaderView f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override
                                            public final void onClick(View view3) {
                                                switch (i11) {
                                                    case 0:
                                                        BaseFragment baseFragment2 = LimitReachedBottomSheet.this.parentFragment;
                                                        if (baseFragment2 != null) {
                                                            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                                                            bottomSheetParams.transitionFromLeft = true;
                                                            baseFragment2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bottomSheetParams);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                                                        limitReachedBottomSheet.baseFragment.presentFragment(ChatActivity.of(limitReachedBottomSheet.dialogId));
                                                        limitReachedBottomSheet.lambda$showGiftOfferSheet$15();
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                    TextView textView8 = new TextView(context);
                                    this.description = textView8;
                                    textView8.setText(AndroidUtilities.replaceTags(string2));
                                    this.description.setTextSize(i11, 14.0f);
                                    this.description.setGravity(i11);
                                    TextView textView9 = this.description;
                                    textView9.setLineSpacing(textView9.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                                    if (i15 == 18 || !(((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider instanceof DarkThemeResourceProvider)) {
                                        this.description.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    } else {
                                        this.description.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    }
                                    if (i15 == 19) {
                                        addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
                                    } else {
                                        addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
                                    }
                                    if (i15 == 31) {
                                        ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                                        ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                                        ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                                    }
                                    LimitReachedBottomSheet.this.updatePremiumButtonText();
                                }
                                addView(this.title, LayoutHelper.createLinear(-2, -2, 1, 0, z ? 8 : 22, 0, 10));
                                i11 = 1;
                                TextView textView10 = new TextView(context);
                                this.description = textView10;
                                textView10.setText(AndroidUtilities.replaceTags(string2));
                                this.description.setTextSize(i11, 14.0f);
                                this.description.setGravity(i11);
                                TextView textView11 = this.description;
                                textView11.setLineSpacing(textView11.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                                if (i15 == 18) {
                                    this.description.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                } else {
                                    this.description.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                }
                                if (i15 == 19) {
                                    addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
                                } else {
                                    addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
                                }
                                if (i15 == 31) {
                                    ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                                    ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                                    ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                                }
                                LimitReachedBottomSheet.this.updatePremiumButtonText();
                            }
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                        }
                        this.title.setTextSize(1, 20.0f);
                        TextView textView12 = this.title;
                        i9 = Theme.key_windowBackgroundWhiteBlackText;
                        textView12.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        this.title.setGravity(17);
                        if (i15 != 19) {
                            ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider;
                            boostCounterView = new BoostCounterView(context);
                            this.boostCounterView = boostCounterView;
                            boostCounterView.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                            if (i15 == 32) {
                                boostCounterView.setVisibility(8);
                            }
                            if (LimitReachedBottomSheet.this.isCurrentChat) {
                                LinearLayout linearLayout3 = new LinearLayout(context);
                                this.titleLinearLayout = linearLayout3;
                                linearLayout3.setOrientation(0);
                                this.titleLinearLayout.setWeightSum(1.0f);
                                this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                this.titleLinearLayout.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                View view3 = this.titleLinearLayout;
                                if (z) {
                                    i12 = 8;
                                } else {
                                    i12 = 22;
                                }
                                addView(view3, LayoutHelper.createLinear(-2, -2, 1, 12, i12, 12, 9));
                                i11 = 1;
                            } else {
                                View view4 = this.title;
                                if (z) {
                                    i10 = 8;
                                } else {
                                    i10 = 22;
                                }
                                addView(view4, LayoutHelper.createLinear(-2, -2, 1, 0, i10, 0, 0));
                                LinearLayout linearLayout4 = new LinearLayout(getContext());
                                linearLayout4.setOrientation(0);
                                linearLayout4.setClipChildren(false);
                                FrameLayout frameLayout3 = new FrameLayout(getContext());
                                frameLayout3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                BackupImageView backupImageView2 = new BackupImageView(getContext());
                                backupImageView2.setRoundRadius(AndroidUtilities.dp(14.0f));
                                chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                                avatarDrawable2.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                                backupImageView2.setForUserOrChat(chat, avatarDrawable2);
                                frameLayout3.addView(backupImageView2, LayoutHelper.createFrame(28.0f, 28));
                                textView2 = new TextView(getContext());
                                if (chat != null) {
                                    textView2.setText(chat.title);
                                }
                                textView2.setSingleLine(true);
                                textView2.setMaxLines(1);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setTextSize(1, 13.0f);
                                textView2.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                frameLayout3.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                linearLayout4.addView(frameLayout3, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                LayoutTransition layoutTransition2 = new LayoutTransition();
                                layoutTransition2.setDuration(100L);
                                layoutTransition2.enableTransitionType(4);
                                linearLayout4.setLayoutTransition(layoutTransition2);
                                linearLayout4.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                addView(linearLayout4, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                ScaleStateListAnimator.apply(linearLayout4);
                                i11 = 1;
                                linearLayout4.setOnClickListener(new View.OnClickListener(this) {
                                    public final LimitReachedBottomSheet.HeaderView f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void onClick(View view5) {
                                        switch (i11) {
                                            case 0:
                                                BaseFragment baseFragment2 = LimitReachedBottomSheet.this.parentFragment;
                                                if (baseFragment2 != null) {
                                                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                                                    bottomSheetParams.transitionFromLeft = true;
                                                    baseFragment2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bottomSheetParams);
                                                    break;
                                                }
                                                break;
                                            default:
                                                LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                                                limitReachedBottomSheet.baseFragment.presentFragment(ChatActivity.of(limitReachedBottomSheet.dialogId));
                                                limitReachedBottomSheet.lambda$showGiftOfferSheet$15();
                                                break;
                                        }
                                    }
                                });
                            }
                        } else {
                            ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider;
                            boostCounterView = new BoostCounterView(context);
                            this.boostCounterView = boostCounterView;
                            boostCounterView.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                            if (i15 == 32) {
                                boostCounterView.setVisibility(8);
                            }
                            if (LimitReachedBottomSheet.this.isCurrentChat) {
                                LinearLayout linearLayout5 = new LinearLayout(context);
                                this.titleLinearLayout = linearLayout5;
                                linearLayout5.setOrientation(0);
                                this.titleLinearLayout.setWeightSum(1.0f);
                                this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                this.titleLinearLayout.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                View view5 = this.titleLinearLayout;
                                if (z) {
                                    i12 = 8;
                                } else {
                                    i12 = 22;
                                }
                                addView(view5, LayoutHelper.createLinear(-2, -2, 1, 12, i12, 12, 9));
                                i11 = 1;
                            } else {
                                View view6 = this.title;
                                if (z) {
                                    i10 = 8;
                                } else {
                                    i10 = 22;
                                }
                                addView(view6, LayoutHelper.createLinear(-2, -2, 1, 0, i10, 0, 0));
                                LinearLayout linearLayout6 = new LinearLayout(getContext());
                                linearLayout6.setOrientation(0);
                                linearLayout6.setClipChildren(false);
                                FrameLayout frameLayout4 = new FrameLayout(getContext());
                                frameLayout4.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                BackupImageView backupImageView3 = new BackupImageView(getContext());
                                backupImageView3.setRoundRadius(AndroidUtilities.dp(14.0f));
                                chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                AvatarDrawable avatarDrawable3 = new AvatarDrawable();
                                avatarDrawable3.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                                backupImageView3.setForUserOrChat(chat, avatarDrawable3);
                                frameLayout4.addView(backupImageView3, LayoutHelper.createFrame(28.0f, 28));
                                textView2 = new TextView(getContext());
                                if (chat != null) {
                                    textView2.setText(chat.title);
                                }
                                textView2.setSingleLine(true);
                                textView2.setMaxLines(1);
                                textView2.setEllipsize(TextUtils.TruncateAt.END);
                                textView2.setTextSize(1, 13.0f);
                                textView2.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                frameLayout4.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                linearLayout6.addView(frameLayout4, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                LayoutTransition layoutTransition3 = new LayoutTransition();
                                layoutTransition3.setDuration(100L);
                                layoutTransition3.enableTransitionType(4);
                                linearLayout6.setLayoutTransition(layoutTransition3);
                                linearLayout6.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                addView(linearLayout6, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                ScaleStateListAnimator.apply(linearLayout6);
                                i11 = 1;
                                linearLayout6.setOnClickListener(new View.OnClickListener(this) {
                                    public final LimitReachedBottomSheet.HeaderView f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void onClick(View view7) {
                                        switch (i11) {
                                            case 0:
                                                BaseFragment baseFragment2 = LimitReachedBottomSheet.this.parentFragment;
                                                if (baseFragment2 != null) {
                                                    BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                                                    bottomSheetParams.transitionFromLeft = true;
                                                    baseFragment2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bottomSheetParams);
                                                    break;
                                                }
                                                break;
                                            default:
                                                LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                                                limitReachedBottomSheet.baseFragment.presentFragment(ChatActivity.of(limitReachedBottomSheet.dialogId));
                                                limitReachedBottomSheet.lambda$showGiftOfferSheet$15();
                                                break;
                                        }
                                    }
                                });
                            }
                        }
                        TextView textView13 = new TextView(context);
                        this.description = textView13;
                        textView13.setText(AndroidUtilities.replaceTags(string2));
                        this.description.setTextSize(i11, 14.0f);
                        this.description.setGravity(i11);
                        TextView textView14 = this.description;
                        textView14.setLineSpacing(textView14.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                        if (i15 == 18) {
                            this.description.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        } else {
                            this.description.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        }
                        if (i15 == 19) {
                            addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
                        } else {
                            addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
                        }
                        if (i15 == 31) {
                            ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                            ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                            ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        }
                        LimitReachedBottomSheet.this.updatePremiumButtonText();
                    }
                    if (z2) {
                    }
                    if (i15 != 11) {
                        if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
                            arrayList3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                        } else {
                            arrayList3 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                        }
                        avatarsImageView = new AvatarsImageView(context, false);
                        int iDp2 = AndroidUtilities.dp(3.33f);
                        avatarsDrawable = avatarsImageView.avatarsDrawable;
                        avatarsDrawable.strokeWidth = iDp2;
                        avatarsImageView.setSize(AndroidUtilities.dp(72.0f));
                        avatarsImageView.setStepFactor(0.4f);
                        iMin = Math.min(arrayList3.size(), 3);
                        avatarsImageView.setCount(iMin);
                        while (i5 < iMin) {
                            Long l2 = (Long) arrayList3.get(i5);
                            l2.getClass();
                            avatarsDrawable.setObject(i5, MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser(l2), ((BottomSheet) LimitReachedBottomSheet.this).currentAccount);
                        }
                        avatarsDrawable.commitTransition(false, true);
                        addView(avatarsImageView, LayoutHelper.createLinear(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                        TextView textView15 = new TextView(context);
                        textView15.setGravity(17);
                        zzkh.m(20.0f, textView15);
                        int i25 = Theme.key_dialogTextBlack;
                        textView15.setTextColor(Theme.getColor(i25, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        textView15.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                        addView(textView15, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                        textView = new TextView(context);
                        textView.setGravity(17);
                        textView.setTextSize(1, 14.0f);
                        textView.setTextColor(Theme.getColor(i25, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                        addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                        if (i15 == 34) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        arrayList4 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                        if (arrayList4 != null) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (arrayList3.size() == 1) {
                            if (z3) {
                                i8 = R.string.InviteCallMessagePremiumBlockedOne;
                            } else if (z4) {
                                i8 = R.string.InviteMessagePremiumBlockedOne;
                            } else {
                                i8 = R.string.InvitePremiumBlockedOne;
                            }
                            string3 = LocaleController.formatString(i8, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))));
                        } else if (arrayList3.size() == 2) {
                            if (z3) {
                                i7 = R.string.InviteCallMessagePremiumBlockedTwo;
                            } else if (z4) {
                                i7 = R.string.InviteMessagePremiumBlockedTwo;
                            } else {
                                i7 = R.string.InvitePremiumBlockedTwo;
                            }
                            string3 = LocaleController.formatString(i7, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(1))));
                        } else if (arrayList3.size() == 3) {
                            if (z3) {
                                i6 = R.string.InviteCallMessagePremiumBlockedThree;
                            } else if (z4) {
                                i6 = R.string.InviteMessagePremiumBlockedThree;
                            } else {
                                i6 = R.string.InvitePremiumBlockedThree;
                            }
                            string3 = LocaleController.formatString(i6, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(2))));
                        } else {
                            if (z3) {
                                str = "InviteCallMessagePremiumBlockedMany";
                            } else if (z4) {
                                str = "InviteMessagePremiumBlockedMany";
                            } else {
                                str = "InvitePremiumBlockedMany";
                            }
                            String pluralString2 = LocaleController.formatPluralString(str, arrayList3.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(1))));
                            int size5 = arrayList3.size() - 2;
                            int themedColor2 = LimitReachedBottomSheet.this.getThemedColor(Theme.key_dialogBackground);
                            avatarsImageView.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, null);
                            avatarsImageView.plusText = new Text(DiffUtil.m(size5, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                            Paint paint2 = new Paint(1);
                            avatarsImageView.plusBgPaint = paint2;
                            paint2.setColor(themedColor2);
                            string3 = pluralString2;
                        }
                        textView.setText(AndroidUtilities.replaceTags(string3));
                        arrayList5 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                        if (arrayList5 == null) {
                            size2 = 0;
                        } else {
                            size2 = arrayList5.size();
                        }
                        arrayList6 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                        if (arrayList6 == null) {
                            size3 = 0;
                        } else {
                            size3 = arrayList6.size();
                        }
                        if (size2 - size3 > 0) {
                            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                            LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                        } else {
                            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                            LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                        }
                        LimitReachedBottomSheet.this.updatePremiumButtonText();
                        return;
                    }
                    if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
                        arrayList3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                    } else {
                        arrayList3 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                    }
                    avatarsImageView = new AvatarsImageView(context, false);
                    int iDp3 = AndroidUtilities.dp(3.33f);
                    avatarsDrawable = avatarsImageView.avatarsDrawable;
                    avatarsDrawable.strokeWidth = iDp3;
                    avatarsImageView.setSize(AndroidUtilities.dp(72.0f));
                    avatarsImageView.setStepFactor(0.4f);
                    iMin = Math.min(arrayList3.size(), 3);
                    avatarsImageView.setCount(iMin);
                    while (i5 < iMin) {
                        Long l3 = (Long) arrayList3.get(i5);
                        l3.getClass();
                        avatarsDrawable.setObject(i5, MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser(l3), ((BottomSheet) LimitReachedBottomSheet.this).currentAccount);
                    }
                    avatarsDrawable.commitTransition(false, true);
                    addView(avatarsImageView, LayoutHelper.createLinear(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                    TextView textView16 = new TextView(context);
                    textView16.setGravity(17);
                    zzkh.m(20.0f, textView16);
                    int i26 = Theme.key_dialogTextBlack;
                    textView16.setTextColor(Theme.getColor(i26, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    textView16.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                    addView(textView16, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                    textView = new TextView(context);
                    textView.setGravity(17);
                    textView.setTextSize(1, 14.0f);
                    textView.setTextColor(Theme.getColor(i26, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                    if (i15 == 34) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    arrayList4 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                    if (arrayList4 != null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (arrayList3.size() == 1) {
                        if (z3) {
                            i8 = R.string.InviteCallMessagePremiumBlockedOne;
                        } else if (z4) {
                            i8 = R.string.InviteMessagePremiumBlockedOne;
                        } else {
                            i8 = R.string.InvitePremiumBlockedOne;
                        }
                        string3 = LocaleController.formatString(i8, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))));
                    } else if (arrayList3.size() == 2) {
                        if (z3) {
                            i7 = R.string.InviteCallMessagePremiumBlockedTwo;
                        } else if (z4) {
                            i7 = R.string.InviteMessagePremiumBlockedTwo;
                        } else {
                            i7 = R.string.InvitePremiumBlockedTwo;
                        }
                        string3 = LocaleController.formatString(i7, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(1))));
                    } else if (arrayList3.size() == 3) {
                        if (z3) {
                            i6 = R.string.InviteCallMessagePremiumBlockedThree;
                        } else if (z4) {
                            i6 = R.string.InviteMessagePremiumBlockedThree;
                        } else {
                            i6 = R.string.InvitePremiumBlockedThree;
                        }
                        string3 = LocaleController.formatString(i6, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(2))));
                    } else {
                        if (z3) {
                            str = "InviteCallMessagePremiumBlockedMany";
                        } else if (z4) {
                            str = "InviteMessagePremiumBlockedMany";
                        } else {
                            str = "InvitePremiumBlockedMany";
                        }
                        String pluralString3 = LocaleController.formatPluralString(str, arrayList3.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(1))));
                        int size6 = arrayList3.size() - 2;
                        int themedColor3 = LimitReachedBottomSheet.this.getThemedColor(Theme.key_dialogBackground);
                        avatarsImageView.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, null);
                        avatarsImageView.plusText = new Text(DiffUtil.m(size6, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                        Paint paint3 = new Paint(1);
                        avatarsImageView.plusBgPaint = paint3;
                        paint3.setColor(themedColor3);
                        string3 = pluralString3;
                    }
                    textView.setText(AndroidUtilities.replaceTags(string3));
                    arrayList5 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                    if (arrayList5 == null) {
                        size2 = 0;
                    } else {
                        size2 = arrayList5.size();
                    }
                    arrayList6 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                    if (arrayList6 == null) {
                        size3 = 0;
                    } else {
                        size3 = arrayList6.size();
                    }
                    if (size2 - size3 > 0) {
                        ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                        LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                    } else {
                        ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                        LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                    }
                    LimitReachedBottomSheet.this.updatePremiumButtonText();
                    return;
                    if (i15 != 31) {
                        f3 = f;
                        anonymousClass2 = new AnonymousClass2(context, i16, activatedAccountsCount, i2, f2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                        LimitReachedBottomSheet.this.limitPreviewView = anonymousClass2;
                        if (!z2) {
                            anonymousClass2.setBagePosition(f3);
                            LimitReachedBottomSheet.this.limitPreviewView.setType(i15);
                            LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setVisibility(8);
                            if (z) {
                                AnonymousClass2 anonymousClass6 = LimitReachedBottomSheet.this.limitPreviewView;
                                anonymousClass6.limitsContainer.setVisibility(8);
                                counterView = anonymousClass6.limitIcon;
                                if (counterView != null) {
                                    counterView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f));
                                }
                                anonymousClass6.premiumLocked = true;
                            } else {
                                if (!UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium()) {
                                }
                                LimitReachedBottomSheet.this.limitPreviewView.premiumCount.setVisibility(8);
                                if (i15 == 6) {
                                    LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setText("2 GB");
                                } else {
                                    LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setText(Integer.toString(i));
                                }
                                z5 = false;
                                LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setVisibility(0);
                                i13 = 2;
                                if (i15 != i13) {
                                    LimitReachedBottomSheet.this.limitPreviewView.animationCanPlay = z5;
                                } else {
                                    LimitReachedBottomSheet.this.limitPreviewView.animationCanPlay = z5;
                                }
                                addView(LimitReachedBottomSheet.this.limitPreviewView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                            }
                        } else if (LimitReachedBottomSheet.this.boostsStatus != null) {
                            AnonymousClass2 anonymousClass7 = LimitReachedBottomSheet.this.limitPreviewView;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = LimitReachedBottomSheet.this.boostsStatus;
                            canApplyBoost = LimitReachedBottomSheet.this.canApplyBoost;
                            if (canApplyBoost == null) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            anonymousClass7.setBoosts(tL_premium_boostsStatus3, z6);
                        }
                        i13 = 2;
                        z5 = false;
                        if (i15 != i13) {
                            LimitReachedBottomSheet.this.limitPreviewView.animationCanPlay = z5;
                        } else {
                            LimitReachedBottomSheet.this.limitPreviewView.animationCanPlay = z5;
                        }
                        addView(LimitReachedBottomSheet.this.limitPreviewView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                    }
                    if (i15 == 31) {
                        FrameLayout frameLayout5 = new FrameLayout(context);
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.large_boosts));
                        frameLayout5.addView(imageView2, LayoutHelper.createFrame(-2, -2, 17));
                        frameLayout5.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(79.0f), Theme.getColor(Theme.key_featuredStickers_addButton)));
                        addView(frameLayout5, LayoutHelper.createLinear(79, 79, 1, 0, 23, 0, 0));
                    }
                    TextView textView17 = new TextView(context);
                    this.title = textView17;
                    textView17.setTypeface(AndroidUtilities.bold());
                    if (i15 == 31) {
                        this.title.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                    } else if (i15 == 32) {
                        this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                    } else if (i15 == 19) {
                        if (baseFragment instanceof GroupColorActivity) {
                            this.title.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                        } else {
                            this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                        }
                    } else if (i15 == 30) {
                        this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                    } else if (i15 == 35) {
                        this.title.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                    } else if (i15 == 18) {
                        if (LimitReachedBottomSheet.this.boostsStatus.level == 0) {
                            this.title.setText(LocaleController.getString(R.string.BoostingEnableStories));
                        } else {
                            this.title.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                        }
                    } else if (i15 == 21) {
                        this.title.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                    } else if (i15 == 20) {
                        this.title.setText(LocaleController.getString(R.string.BoostingEnableColor));
                    } else if (i15 == 24) {
                        this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                    } else if (i15 == 27) {
                        this.title.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                    } else if (i15 == 28) {
                        this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                    } else if (i15 == 25) {
                        this.title.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                    } else {
                        if (i15 != 26) {
                            if (i15 == 29) {
                                this.title.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                            } else if (i15 != 22) {
                                this.title.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                            } else {
                                this.title.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                            }
                            this.title.setTextSize(1, 20.0f);
                            TextView textView18 = this.title;
                            i9 = Theme.key_windowBackgroundWhiteBlackText;
                            textView18.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            this.title.setGravity(17);
                            if (i15 != 19) {
                                ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider;
                                boostCounterView = new BoostCounterView(context);
                                this.boostCounterView = boostCounterView;
                                boostCounterView.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                                if (i15 == 32) {
                                    boostCounterView.setVisibility(8);
                                }
                                if (LimitReachedBottomSheet.this.isCurrentChat) {
                                    LinearLayout linearLayout7 = new LinearLayout(context);
                                    this.titleLinearLayout = linearLayout7;
                                    linearLayout7.setOrientation(0);
                                    this.titleLinearLayout.setWeightSum(1.0f);
                                    this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                    this.titleLinearLayout.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                    View view7 = this.titleLinearLayout;
                                    if (z) {
                                        i12 = 8;
                                    } else {
                                        i12 = 22;
                                    }
                                    addView(view7, LayoutHelper.createLinear(-2, -2, 1, 12, i12, 12, 9));
                                    i11 = 1;
                                } else {
                                    View view8 = this.title;
                                    if (z) {
                                        i10 = 8;
                                    } else {
                                        i10 = 22;
                                    }
                                    addView(view8, LayoutHelper.createLinear(-2, -2, 1, 0, i10, 0, 0));
                                    LinearLayout linearLayout8 = new LinearLayout(getContext());
                                    linearLayout8.setOrientation(0);
                                    linearLayout8.setClipChildren(false);
                                    FrameLayout frameLayout6 = new FrameLayout(getContext());
                                    frameLayout6.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                    BackupImageView backupImageView4 = new BackupImageView(getContext());
                                    backupImageView4.setRoundRadius(AndroidUtilities.dp(14.0f));
                                    chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                    AvatarDrawable avatarDrawable4 = new AvatarDrawable();
                                    avatarDrawable4.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                                    backupImageView4.setForUserOrChat(chat, avatarDrawable4);
                                    frameLayout6.addView(backupImageView4, LayoutHelper.createFrame(28.0f, 28));
                                    textView2 = new TextView(getContext());
                                    if (chat != null) {
                                        textView2.setText(chat.title);
                                    }
                                    textView2.setSingleLine(true);
                                    textView2.setMaxLines(1);
                                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                                    textView2.setTextSize(1, 13.0f);
                                    textView2.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    frameLayout6.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                    linearLayout8.addView(frameLayout6, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                    LayoutTransition layoutTransition4 = new LayoutTransition();
                                    layoutTransition4.setDuration(100L);
                                    layoutTransition4.enableTransitionType(4);
                                    linearLayout8.setLayoutTransition(layoutTransition4);
                                    linearLayout8.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                    addView(linearLayout8, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                    ScaleStateListAnimator.apply(linearLayout8);
                                    i11 = 1;
                                    linearLayout8.setOnClickListener(new View.OnClickListener(this) {
                                        public final LimitReachedBottomSheet.HeaderView f$0;

                                        {
                                            this.f$0 = this;
                                        }

                                        @Override
                                        public final void onClick(View view9) {
                                            switch (i11) {
                                                case 0:
                                                    BaseFragment baseFragment2 = LimitReachedBottomSheet.this.parentFragment;
                                                    if (baseFragment2 != null) {
                                                        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                                                        bottomSheetParams.transitionFromLeft = true;
                                                        baseFragment2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bottomSheetParams);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                                                    limitReachedBottomSheet.baseFragment.presentFragment(ChatActivity.of(limitReachedBottomSheet.dialogId));
                                                    limitReachedBottomSheet.lambda$showGiftOfferSheet$15();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            } else {
                                ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider;
                                boostCounterView = new BoostCounterView(context);
                                this.boostCounterView = boostCounterView;
                                boostCounterView.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                                if (i15 == 32) {
                                    boostCounterView.setVisibility(8);
                                }
                                if (LimitReachedBottomSheet.this.isCurrentChat) {
                                    LinearLayout linearLayout9 = new LinearLayout(context);
                                    this.titleLinearLayout = linearLayout9;
                                    linearLayout9.setOrientation(0);
                                    this.titleLinearLayout.setWeightSum(1.0f);
                                    this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                                    this.titleLinearLayout.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                                    View view9 = this.titleLinearLayout;
                                    if (z) {
                                        i12 = 8;
                                    } else {
                                        i12 = 22;
                                    }
                                    addView(view9, LayoutHelper.createLinear(-2, -2, 1, 12, i12, 12, 9));
                                    i11 = 1;
                                } else {
                                    View view10 = this.title;
                                    if (z) {
                                        i10 = 8;
                                    } else {
                                        i10 = 22;
                                    }
                                    addView(view10, LayoutHelper.createLinear(-2, -2, 1, 0, i10, 0, 0));
                                    LinearLayout linearLayout10 = new LinearLayout(getContext());
                                    linearLayout10.setOrientation(0);
                                    linearLayout10.setClipChildren(false);
                                    FrameLayout frameLayout7 = new FrameLayout(getContext());
                                    frameLayout7.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                                    BackupImageView backupImageView5 = new BackupImageView(getContext());
                                    backupImageView5.setRoundRadius(AndroidUtilities.dp(14.0f));
                                    chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                                    AvatarDrawable avatarDrawable5 = new AvatarDrawable();
                                    avatarDrawable5.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                                    backupImageView5.setForUserOrChat(chat, avatarDrawable5);
                                    frameLayout7.addView(backupImageView5, LayoutHelper.createFrame(28.0f, 28));
                                    textView2 = new TextView(getContext());
                                    if (chat != null) {
                                        textView2.setText(chat.title);
                                    }
                                    textView2.setSingleLine(true);
                                    textView2.setMaxLines(1);
                                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                                    textView2.setTextSize(1, 13.0f);
                                    textView2.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                                    frameLayout7.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                    linearLayout10.addView(frameLayout7, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                                    LayoutTransition layoutTransition5 = new LayoutTransition();
                                    layoutTransition5.setDuration(100L);
                                    layoutTransition5.enableTransitionType(4);
                                    linearLayout10.setLayoutTransition(layoutTransition5);
                                    linearLayout10.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                                    addView(linearLayout10, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                                    ScaleStateListAnimator.apply(linearLayout10);
                                    i11 = 1;
                                    linearLayout10.setOnClickListener(new View.OnClickListener(this) {
                                        public final LimitReachedBottomSheet.HeaderView f$0;

                                        {
                                            this.f$0 = this;
                                        }

                                        @Override
                                        public final void onClick(View view11) {
                                            switch (i11) {
                                                case 0:
                                                    BaseFragment baseFragment2 = LimitReachedBottomSheet.this.parentFragment;
                                                    if (baseFragment2 != null) {
                                                        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                                                        bottomSheetParams.transitionFromLeft = true;
                                                        baseFragment2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bottomSheetParams);
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                                                    limitReachedBottomSheet.baseFragment.presentFragment(ChatActivity.of(limitReachedBottomSheet.dialogId));
                                                    limitReachedBottomSheet.lambda$showGiftOfferSheet$15();
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                            TextView textView19 = new TextView(context);
                            this.description = textView19;
                            textView19.setText(AndroidUtilities.replaceTags(string2));
                            this.description.setTextSize(i11, 14.0f);
                            this.description.setGravity(i11);
                            TextView textView110 = this.description;
                            textView110.setLineSpacing(textView110.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                            if (i15 == 18) {
                                this.description.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            } else {
                                this.description.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            }
                            if (i15 == 19) {
                                addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
                            } else {
                                addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
                            }
                            if (i15 == 31) {
                                ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                                ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                                ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                            }
                            LimitReachedBottomSheet.this.updatePremiumButtonText();
                        }
                        this.title.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                    }
                    this.title.setTextSize(1, 20.0f);
                    TextView textView111 = this.title;
                    i9 = Theme.key_windowBackgroundWhiteBlackText;
                    textView111.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    this.title.setGravity(17);
                    if (i15 != 19) {
                        ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider;
                        boostCounterView = new BoostCounterView(context);
                        this.boostCounterView = boostCounterView;
                        boostCounterView.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                        if (i15 == 32) {
                            boostCounterView.setVisibility(8);
                        }
                        if (LimitReachedBottomSheet.this.isCurrentChat) {
                            LinearLayout linearLayout11 = new LinearLayout(context);
                            this.titleLinearLayout = linearLayout11;
                            linearLayout11.setOrientation(0);
                            this.titleLinearLayout.setWeightSum(1.0f);
                            this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                            this.titleLinearLayout.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                            View view11 = this.titleLinearLayout;
                            if (z) {
                                i12 = 8;
                            } else {
                                i12 = 22;
                            }
                            addView(view11, LayoutHelper.createLinear(-2, -2, 1, 12, i12, 12, 9));
                            i11 = 1;
                        } else {
                            View view12 = this.title;
                            if (z) {
                                i10 = 8;
                            } else {
                                i10 = 22;
                            }
                            addView(view12, LayoutHelper.createLinear(-2, -2, 1, 0, i10, 0, 0));
                            LinearLayout linearLayout12 = new LinearLayout(getContext());
                            linearLayout12.setOrientation(0);
                            linearLayout12.setClipChildren(false);
                            FrameLayout frameLayout8 = new FrameLayout(getContext());
                            frameLayout8.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                            BackupImageView backupImageView6 = new BackupImageView(getContext());
                            backupImageView6.setRoundRadius(AndroidUtilities.dp(14.0f));
                            chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                            AvatarDrawable avatarDrawable6 = new AvatarDrawable();
                            avatarDrawable6.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                            backupImageView6.setForUserOrChat(chat, avatarDrawable6);
                            frameLayout8.addView(backupImageView6, LayoutHelper.createFrame(28.0f, 28));
                            textView2 = new TextView(getContext());
                            if (chat != null) {
                                textView2.setText(chat.title);
                            }
                            textView2.setSingleLine(true);
                            textView2.setMaxLines(1);
                            textView2.setEllipsize(TextUtils.TruncateAt.END);
                            textView2.setTextSize(1, 13.0f);
                            textView2.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            frameLayout8.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                            linearLayout12.addView(frameLayout8, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                            LayoutTransition layoutTransition6 = new LayoutTransition();
                            layoutTransition6.setDuration(100L);
                            layoutTransition6.enableTransitionType(4);
                            linearLayout12.setLayoutTransition(layoutTransition6);
                            linearLayout12.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                            addView(linearLayout12, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                            ScaleStateListAnimator.apply(linearLayout12);
                            i11 = 1;
                            linearLayout12.setOnClickListener(new View.OnClickListener(this) {
                                public final LimitReachedBottomSheet.HeaderView f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final void onClick(View view13) {
                                    switch (i11) {
                                        case 0:
                                            BaseFragment baseFragment2 = LimitReachedBottomSheet.this.parentFragment;
                                            if (baseFragment2 != null) {
                                                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                                                bottomSheetParams.transitionFromLeft = true;
                                                baseFragment2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bottomSheetParams);
                                                break;
                                            }
                                            break;
                                        default:
                                            LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                                            limitReachedBottomSheet.baseFragment.presentFragment(ChatActivity.of(limitReachedBottomSheet.dialogId));
                                            limitReachedBottomSheet.lambda$showGiftOfferSheet$15();
                                            break;
                                    }
                                }
                            });
                        }
                    } else {
                        ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider;
                        boostCounterView = new BoostCounterView(context);
                        this.boostCounterView = boostCounterView;
                        boostCounterView.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                        if (i15 == 32) {
                            boostCounterView.setVisibility(8);
                        }
                        if (LimitReachedBottomSheet.this.isCurrentChat) {
                            LinearLayout linearLayout13 = new LinearLayout(context);
                            this.titleLinearLayout = linearLayout13;
                            linearLayout13.setOrientation(0);
                            this.titleLinearLayout.setWeightSum(1.0f);
                            this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                            this.titleLinearLayout.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                            View view13 = this.titleLinearLayout;
                            if (z) {
                                i12 = 8;
                            } else {
                                i12 = 22;
                            }
                            addView(view13, LayoutHelper.createLinear(-2, -2, 1, 12, i12, 12, 9));
                            i11 = 1;
                        } else {
                            View view14 = this.title;
                            if (z) {
                                i10 = 8;
                            } else {
                                i10 = 22;
                            }
                            addView(view14, LayoutHelper.createLinear(-2, -2, 1, 0, i10, 0, 0));
                            LinearLayout linearLayout14 = new LinearLayout(getContext());
                            linearLayout14.setOrientation(0);
                            linearLayout14.setClipChildren(false);
                            FrameLayout frameLayout9 = new FrameLayout(getContext());
                            frameLayout9.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                            BackupImageView backupImageView7 = new BackupImageView(getContext());
                            backupImageView7.setRoundRadius(AndroidUtilities.dp(14.0f));
                            chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                            AvatarDrawable avatarDrawable7 = new AvatarDrawable();
                            avatarDrawable7.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                            backupImageView7.setForUserOrChat(chat, avatarDrawable7);
                            frameLayout9.addView(backupImageView7, LayoutHelper.createFrame(28.0f, 28));
                            textView2 = new TextView(getContext());
                            if (chat != null) {
                                textView2.setText(chat.title);
                            }
                            textView2.setSingleLine(true);
                            textView2.setMaxLines(1);
                            textView2.setEllipsize(TextUtils.TruncateAt.END);
                            textView2.setTextSize(1, 13.0f);
                            textView2.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            frameLayout9.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                            linearLayout14.addView(frameLayout9, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                            LayoutTransition layoutTransition7 = new LayoutTransition();
                            layoutTransition7.setDuration(100L);
                            layoutTransition7.enableTransitionType(4);
                            linearLayout14.setLayoutTransition(layoutTransition7);
                            linearLayout14.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                            addView(linearLayout14, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                            ScaleStateListAnimator.apply(linearLayout14);
                            i11 = 1;
                            linearLayout14.setOnClickListener(new View.OnClickListener(this) {
                                public final LimitReachedBottomSheet.HeaderView f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final void onClick(View view15) {
                                    switch (i11) {
                                        case 0:
                                            BaseFragment baseFragment2 = LimitReachedBottomSheet.this.parentFragment;
                                            if (baseFragment2 != null) {
                                                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                                                bottomSheetParams.transitionFromLeft = true;
                                                baseFragment2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bottomSheetParams);
                                                break;
                                            }
                                            break;
                                        default:
                                            LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                                            limitReachedBottomSheet.baseFragment.presentFragment(ChatActivity.of(limitReachedBottomSheet.dialogId));
                                            limitReachedBottomSheet.lambda$showGiftOfferSheet$15();
                                            break;
                                    }
                                }
                            });
                        }
                    }
                    TextView textView112 = new TextView(context);
                    this.description = textView112;
                    textView112.setText(AndroidUtilities.replaceTags(string2));
                    this.description.setTextSize(i11, 14.0f);
                    this.description.setGravity(i11);
                    TextView textView113 = this.description;
                    textView113.setLineSpacing(textView113.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                    if (i15 == 18) {
                        this.description.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    } else {
                        this.description.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    }
                    if (i15 == 19) {
                        addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
                    } else {
                        addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
                    }
                    if (i15 == 31) {
                        ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                        ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                        ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                    }
                    LimitReachedBottomSheet.this.updatePremiumButtonText();
                }
                int i27 = LimitReachedBottomSheet.this.requiredLvl;
                string = LocaleController.formatPluralString("ReactionReachLvlForReaction", i27, Integer.valueOf(i27));
            }
            string2 = string;
            z = zPremiumFeaturesBlocked;
            Palette.Builder builder2 = LimitReachedBottomSheet.this.limitParams;
            i = builder2.mResizeArea;
            i2 = builder2.mResizeMaxDimension;
            activatedAccountsCount = LimitReachedBottomSheet.this.currentValue;
            if (i15 == 3) {
                activatedAccountsCount = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).dialogFilters.size() - 1;
            } else if (i15 == 7) {
                activatedAccountsCount = UserConfig.getActivatedAccountsCount();
            } else if (i15 == 0) {
                dialogs = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getDialogs(0);
                size = dialogs.size();
                i4 = 0;
                while (i3 < size) {
                    dialog = dialogs.get(i3);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                        i4++;
                    }
                }
                activatedAccountsCount = i4;
            }
            if (UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium()) {
                activatedAccountsCount = i2;
                f = 1.0f;
            } else {
                activatedAccountsCount = i2;
                f = 1.0f;
            }
            f2 = i / i2;
            z2 = i15 == 18 ? true : true;
            if (z2) {
            }
            if (i15 != 11) {
                if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
                    arrayList3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                } else {
                    arrayList3 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                }
                avatarsImageView = new AvatarsImageView(context, false);
                int iDp4 = AndroidUtilities.dp(3.33f);
                avatarsDrawable = avatarsImageView.avatarsDrawable;
                avatarsDrawable.strokeWidth = iDp4;
                avatarsImageView.setSize(AndroidUtilities.dp(72.0f));
                avatarsImageView.setStepFactor(0.4f);
                iMin = Math.min(arrayList3.size(), 3);
                avatarsImageView.setCount(iMin);
                while (i5 < iMin) {
                    Long l4 = (Long) arrayList3.get(i5);
                    l4.getClass();
                    avatarsDrawable.setObject(i5, MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser(l4), ((BottomSheet) LimitReachedBottomSheet.this).currentAccount);
                }
                avatarsDrawable.commitTransition(false, true);
                addView(avatarsImageView, LayoutHelper.createLinear(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                TextView textView114 = new TextView(context);
                textView114.setGravity(17);
                zzkh.m(20.0f, textView114);
                int i28 = Theme.key_dialogTextBlack;
                textView114.setTextColor(Theme.getColor(i28, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                textView114.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                addView(textView114, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
                textView = new TextView(context);
                textView.setGravity(17);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(Theme.getColor(i28, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
                if (i15 == 34) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                arrayList4 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                if (arrayList4 != null) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (arrayList3.size() == 1) {
                    if (z3) {
                        i8 = R.string.InviteCallMessagePremiumBlockedOne;
                    } else if (z4) {
                        i8 = R.string.InviteMessagePremiumBlockedOne;
                    } else {
                        i8 = R.string.InvitePremiumBlockedOne;
                    }
                    string3 = LocaleController.formatString(i8, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))));
                } else if (arrayList3.size() == 2) {
                    if (z3) {
                        i7 = R.string.InviteCallMessagePremiumBlockedTwo;
                    } else if (z4) {
                        i7 = R.string.InviteMessagePremiumBlockedTwo;
                    } else {
                        i7 = R.string.InvitePremiumBlockedTwo;
                    }
                    string3 = LocaleController.formatString(i7, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(1))));
                } else if (arrayList3.size() == 3) {
                    if (z3) {
                        i6 = R.string.InviteCallMessagePremiumBlockedThree;
                    } else if (z4) {
                        i6 = R.string.InviteMessagePremiumBlockedThree;
                    } else {
                        i6 = R.string.InvitePremiumBlockedThree;
                    }
                    string3 = LocaleController.formatString(i6, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(2))));
                } else {
                    if (z3) {
                        str = "InviteCallMessagePremiumBlockedMany";
                    } else if (z4) {
                        str = "InviteMessagePremiumBlockedMany";
                    } else {
                        str = "InvitePremiumBlockedMany";
                    }
                    String pluralString4 = LocaleController.formatPluralString(str, arrayList3.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(1))));
                    int size7 = arrayList3.size() - 2;
                    int themedColor4 = LimitReachedBottomSheet.this.getThemedColor(Theme.key_dialogBackground);
                    avatarsImageView.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, null);
                    avatarsImageView.plusText = new Text(DiffUtil.m(size7, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                    Paint paint4 = new Paint(1);
                    avatarsImageView.plusBgPaint = paint4;
                    paint4.setColor(themedColor4);
                    string3 = pluralString4;
                }
                textView.setText(AndroidUtilities.replaceTags(string3));
                arrayList5 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
                if (arrayList5 == null) {
                    size2 = 0;
                } else {
                    size2 = arrayList5.size();
                }
                arrayList6 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
                if (arrayList6 == null) {
                    size3 = 0;
                } else {
                    size3 = arrayList6.size();
                }
                if (size2 - size3 > 0) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                    LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                } else {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                    LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
                }
                LimitReachedBottomSheet.this.updatePremiumButtonText();
                return;
            }
            if (LimitReachedBottomSheet.this.premiumInviteBlockedUsers.isEmpty()) {
                arrayList3 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
            } else {
                arrayList3 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
            }
            avatarsImageView = new AvatarsImageView(context, false);
            int iDp5 = AndroidUtilities.dp(3.33f);
            avatarsDrawable = avatarsImageView.avatarsDrawable;
            avatarsDrawable.strokeWidth = iDp5;
            avatarsImageView.setSize(AndroidUtilities.dp(72.0f));
            avatarsImageView.setStepFactor(0.4f);
            iMin = Math.min(arrayList3.size(), 3);
            avatarsImageView.setCount(iMin);
            while (i5 < iMin) {
                Long l5 = (Long) arrayList3.get(i5);
                l5.getClass();
                avatarsDrawable.setObject(i5, MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser(l5), ((BottomSheet) LimitReachedBottomSheet.this).currentAccount);
            }
            avatarsDrawable.commitTransition(false, true);
            addView(avatarsImageView, LayoutHelper.createLinear(((iMin - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
            TextView textView115 = new TextView(context);
            textView115.setGravity(17);
            zzkh.m(20.0f, textView115);
            int i29 = Theme.key_dialogTextBlack;
            textView115.setTextColor(Theme.getColor(i29, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
            textView115.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
            addView(textView115, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 9));
            textView = new TextView(context);
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(Theme.getColor(i29, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
            addView(textView, LayoutHelper.createLinear(-1, -2, 1, 32, 0, 32, 19));
            if (i15 == 34) {
                z3 = true;
            } else {
                z3 = false;
            }
            arrayList4 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
            if (arrayList4 != null) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (arrayList3.size() == 1) {
                if (z3) {
                    i8 = R.string.InviteCallMessagePremiumBlockedOne;
                } else if (z4) {
                    i8 = R.string.InviteMessagePremiumBlockedOne;
                } else {
                    i8 = R.string.InvitePremiumBlockedOne;
                }
                string3 = LocaleController.formatString(i8, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))));
            } else if (arrayList3.size() == 2) {
                if (z3) {
                    i7 = R.string.InviteCallMessagePremiumBlockedTwo;
                } else if (z4) {
                    i7 = R.string.InviteMessagePremiumBlockedTwo;
                } else {
                    i7 = R.string.InvitePremiumBlockedTwo;
                }
                string3 = LocaleController.formatString(i7, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(1))));
            } else if (arrayList3.size() == 3) {
                if (z3) {
                    i6 = R.string.InviteCallMessagePremiumBlockedThree;
                } else if (z4) {
                    i6 = R.string.InviteMessagePremiumBlockedThree;
                } else {
                    i6 = R.string.InvitePremiumBlockedThree;
                }
                string3 = LocaleController.formatString(i6, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(1))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(2))));
            } else {
                if (z3) {
                    str = "InviteCallMessagePremiumBlockedMany";
                } else if (z4) {
                    str = "InviteMessagePremiumBlockedMany";
                } else {
                    str = "InvitePremiumBlockedMany";
                }
                String pluralString5 = LocaleController.formatPluralString(str, arrayList3.size() - 2, UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(0))), UserObject.getForcedFirstName(MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getUser((Long) arrayList3.get(1))));
                int size8 = arrayList3.size() - 2;
                int themedColor5 = LimitReachedBottomSheet.this.getThemedColor(Theme.key_dialogBackground);
                avatarsImageView.premiumGradient = new PremiumGradient.PremiumGradientTools(Theme.key_premiumGradient1, Theme.key_premiumGradient2, -1, -1, null);
                avatarsImageView.plusText = new Text(DiffUtil.m(size8, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                Paint paint5 = new Paint(1);
                avatarsImageView.plusBgPaint = paint5;
                paint5.setColor(themedColor5);
                string3 = pluralString5;
            }
            textView.setText(AndroidUtilities.replaceTags(string3));
            arrayList5 = LimitReachedBottomSheet.this.premiumInviteBlockedUsers;
            if (arrayList5 == null) {
                size2 = 0;
            } else {
                size2 = arrayList5.size();
            }
            arrayList6 = LimitReachedBottomSheet.this.premiumMessagingBlockedUsers;
            if (arrayList6 == null) {
                size3 = 0;
            } else {
                size3 = arrayList6.size();
            }
            if (size2 - size3 > 0) {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
            } else {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                LimitReachedBottomSheet.this.premiumButtonSetSubscribe = true;
            }
            LimitReachedBottomSheet.this.updatePremiumButtonText();
            return;
            if (i15 != 31) {
                f3 = f;
                anonymousClass2 = new AnonymousClass2(context, i16, activatedAccountsCount, i2, f2, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider);
                LimitReachedBottomSheet.this.limitPreviewView = anonymousClass2;
                if (!z2) {
                    anonymousClass2.setBagePosition(f3);
                    LimitReachedBottomSheet.this.limitPreviewView.setType(i15);
                    LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setVisibility(8);
                    if (z) {
                        AnonymousClass2 anonymousClass8 = LimitReachedBottomSheet.this.limitPreviewView;
                        anonymousClass8.limitsContainer.setVisibility(8);
                        counterView = anonymousClass8.limitIcon;
                        if (counterView != null) {
                            counterView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f));
                        }
                        anonymousClass8.premiumLocked = true;
                    } else {
                        if (!UserConfig.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).isPremium()) {
                        }
                        LimitReachedBottomSheet.this.limitPreviewView.premiumCount.setVisibility(8);
                        if (i15 == 6) {
                            LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setText("2 GB");
                        } else {
                            LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setText(Integer.toString(i));
                        }
                        z5 = false;
                        LimitReachedBottomSheet.this.limitPreviewView.defaultCount.setVisibility(0);
                        i13 = 2;
                        if (i15 != i13) {
                            LimitReachedBottomSheet.this.limitPreviewView.animationCanPlay = z5;
                        } else {
                            LimitReachedBottomSheet.this.limitPreviewView.animationCanPlay = z5;
                        }
                        addView(LimitReachedBottomSheet.this.limitPreviewView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                    }
                } else if (LimitReachedBottomSheet.this.boostsStatus != null) {
                    AnonymousClass2 anonymousClass9 = LimitReachedBottomSheet.this.limitPreviewView;
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = LimitReachedBottomSheet.this.boostsStatus;
                    canApplyBoost = LimitReachedBottomSheet.this.canApplyBoost;
                    if (canApplyBoost == null) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    anonymousClass9.setBoosts(tL_premium_boostsStatus4, z6);
                }
                i13 = 2;
                z5 = false;
                if (i15 != i13) {
                    LimitReachedBottomSheet.this.limitPreviewView.animationCanPlay = z5;
                } else {
                    LimitReachedBottomSheet.this.limitPreviewView.animationCanPlay = z5;
                }
                addView(LimitReachedBottomSheet.this.limitPreviewView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, -4, 0, -4, 0));
            }
            if (i15 == 31) {
                FrameLayout frameLayout10 = new FrameLayout(context);
                ImageView imageView3 = new ImageView(context);
                imageView3.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.large_boosts));
                frameLayout10.addView(imageView3, LayoutHelper.createFrame(-2, -2, 17));
                frameLayout10.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(79.0f), Theme.getColor(Theme.key_featuredStickers_addButton)));
                addView(frameLayout10, LayoutHelper.createLinear(79, 79, 1, 0, 23, 0, 0));
            }
            TextView textView116 = new TextView(context);
            this.title = textView116;
            textView116.setTypeface(AndroidUtilities.bold());
            if (i15 == 31) {
                this.title.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
            } else if (i15 == 32) {
                this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
            } else if (i15 == 19) {
                if (baseFragment instanceof GroupColorActivity) {
                    this.title.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                } else {
                    this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
                }
            } else if (i15 == 30) {
                this.title.setText(LimitReachedBottomSheet.this.getBoostsTitleString());
            } else if (i15 == 35) {
                this.title.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
            } else if (i15 == 18) {
                if (LimitReachedBottomSheet.this.boostsStatus.level == 0) {
                    this.title.setText(LocaleController.getString(R.string.BoostingEnableStories));
                } else {
                    this.title.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                }
            } else if (i15 == 21) {
                this.title.setText(LocaleController.getString(R.string.ReactionCustomReactions));
            } else if (i15 == 20) {
                this.title.setText(LocaleController.getString(R.string.BoostingEnableColor));
            } else if (i15 == 24) {
                this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
            } else if (i15 == 27) {
                this.title.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
            } else if (i15 == 28) {
                this.title.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
            } else if (i15 == 25) {
                this.title.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
            } else {
                if (i15 != 26) {
                    if (i15 == 29) {
                        this.title.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                    } else if (i15 != 22) {
                        this.title.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                    } else {
                        this.title.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                    }
                    this.title.setTextSize(1, 20.0f);
                    TextView textView117 = this.title;
                    i9 = Theme.key_windowBackgroundWhiteBlackText;
                    textView117.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    this.title.setGravity(17);
                    if (i15 != 19) {
                        ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider;
                        boostCounterView = new BoostCounterView(context);
                        this.boostCounterView = boostCounterView;
                        boostCounterView.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                        if (i15 == 32) {
                            boostCounterView.setVisibility(8);
                        }
                        if (LimitReachedBottomSheet.this.isCurrentChat) {
                            LinearLayout linearLayout15 = new LinearLayout(context);
                            this.titleLinearLayout = linearLayout15;
                            linearLayout15.setOrientation(0);
                            this.titleLinearLayout.setWeightSum(1.0f);
                            this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                            this.titleLinearLayout.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                            View view15 = this.titleLinearLayout;
                            if (z) {
                                i12 = 8;
                            } else {
                                i12 = 22;
                            }
                            addView(view15, LayoutHelper.createLinear(-2, -2, 1, 12, i12, 12, 9));
                            i11 = 1;
                        } else {
                            View view16 = this.title;
                            if (z) {
                                i10 = 8;
                            } else {
                                i10 = 22;
                            }
                            addView(view16, LayoutHelper.createLinear(-2, -2, 1, 0, i10, 0, 0));
                            LinearLayout linearLayout16 = new LinearLayout(getContext());
                            linearLayout16.setOrientation(0);
                            linearLayout16.setClipChildren(false);
                            FrameLayout frameLayout11 = new FrameLayout(getContext());
                            frameLayout11.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                            BackupImageView backupImageView8 = new BackupImageView(getContext());
                            backupImageView8.setRoundRadius(AndroidUtilities.dp(14.0f));
                            chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                            AvatarDrawable avatarDrawable8 = new AvatarDrawable();
                            avatarDrawable8.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                            backupImageView8.setForUserOrChat(chat, avatarDrawable8);
                            frameLayout11.addView(backupImageView8, LayoutHelper.createFrame(28.0f, 28));
                            textView2 = new TextView(getContext());
                            if (chat != null) {
                                textView2.setText(chat.title);
                            }
                            textView2.setSingleLine(true);
                            textView2.setMaxLines(1);
                            textView2.setEllipsize(TextUtils.TruncateAt.END);
                            textView2.setTextSize(1, 13.0f);
                            textView2.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            frameLayout11.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                            linearLayout16.addView(frameLayout11, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                            LayoutTransition layoutTransition8 = new LayoutTransition();
                            layoutTransition8.setDuration(100L);
                            layoutTransition8.enableTransitionType(4);
                            linearLayout16.setLayoutTransition(layoutTransition8);
                            linearLayout16.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                            addView(linearLayout16, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                            ScaleStateListAnimator.apply(linearLayout16);
                            i11 = 1;
                            linearLayout16.setOnClickListener(new View.OnClickListener(this) {
                                public final LimitReachedBottomSheet.HeaderView f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final void onClick(View view17) {
                                    switch (i11) {
                                        case 0:
                                            BaseFragment baseFragment2 = LimitReachedBottomSheet.this.parentFragment;
                                            if (baseFragment2 != null) {
                                                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                                                bottomSheetParams.transitionFromLeft = true;
                                                baseFragment2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bottomSheetParams);
                                                break;
                                            }
                                            break;
                                        default:
                                            LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                                            limitReachedBottomSheet.baseFragment.presentFragment(ChatActivity.of(limitReachedBottomSheet.dialogId));
                                            limitReachedBottomSheet.lambda$showGiftOfferSheet$15();
                                            break;
                                    }
                                }
                            });
                        }
                    } else {
                        ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider;
                        boostCounterView = new BoostCounterView(context);
                        this.boostCounterView = boostCounterView;
                        boostCounterView.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                        if (i15 == 32) {
                            boostCounterView.setVisibility(8);
                        }
                        if (LimitReachedBottomSheet.this.isCurrentChat) {
                            LinearLayout linearLayout17 = new LinearLayout(context);
                            this.titleLinearLayout = linearLayout17;
                            linearLayout17.setOrientation(0);
                            this.titleLinearLayout.setWeightSum(1.0f);
                            this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                            this.titleLinearLayout.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                            View view17 = this.titleLinearLayout;
                            if (z) {
                                i12 = 8;
                            } else {
                                i12 = 22;
                            }
                            addView(view17, LayoutHelper.createLinear(-2, -2, 1, 12, i12, 12, 9));
                            i11 = 1;
                        } else {
                            View view18 = this.title;
                            if (z) {
                                i10 = 8;
                            } else {
                                i10 = 22;
                            }
                            addView(view18, LayoutHelper.createLinear(-2, -2, 1, 0, i10, 0, 0));
                            LinearLayout linearLayout18 = new LinearLayout(getContext());
                            linearLayout18.setOrientation(0);
                            linearLayout18.setClipChildren(false);
                            FrameLayout frameLayout12 = new FrameLayout(getContext());
                            frameLayout12.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                            BackupImageView backupImageView9 = new BackupImageView(getContext());
                            backupImageView9.setRoundRadius(AndroidUtilities.dp(14.0f));
                            chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                            AvatarDrawable avatarDrawable9 = new AvatarDrawable();
                            avatarDrawable9.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                            backupImageView9.setForUserOrChat(chat, avatarDrawable9);
                            frameLayout12.addView(backupImageView9, LayoutHelper.createFrame(28.0f, 28));
                            textView2 = new TextView(getContext());
                            if (chat != null) {
                                textView2.setText(chat.title);
                            }
                            textView2.setSingleLine(true);
                            textView2.setMaxLines(1);
                            textView2.setEllipsize(TextUtils.TruncateAt.END);
                            textView2.setTextSize(1, 13.0f);
                            textView2.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                            frameLayout12.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                            linearLayout18.addView(frameLayout12, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                            LayoutTransition layoutTransition9 = new LayoutTransition();
                            layoutTransition9.setDuration(100L);
                            layoutTransition9.enableTransitionType(4);
                            linearLayout18.setLayoutTransition(layoutTransition9);
                            linearLayout18.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                            addView(linearLayout18, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                            ScaleStateListAnimator.apply(linearLayout18);
                            i11 = 1;
                            linearLayout18.setOnClickListener(new View.OnClickListener(this) {
                                public final LimitReachedBottomSheet.HeaderView f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final void onClick(View view19) {
                                    switch (i11) {
                                        case 0:
                                            BaseFragment baseFragment2 = LimitReachedBottomSheet.this.parentFragment;
                                            if (baseFragment2 != null) {
                                                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                                                bottomSheetParams.transitionFromLeft = true;
                                                baseFragment2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bottomSheetParams);
                                                break;
                                            }
                                            break;
                                        default:
                                            LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                                            limitReachedBottomSheet.baseFragment.presentFragment(ChatActivity.of(limitReachedBottomSheet.dialogId));
                                            limitReachedBottomSheet.lambda$showGiftOfferSheet$15();
                                            break;
                                    }
                                }
                            });
                        }
                    }
                    TextView textView118 = new TextView(context);
                    this.description = textView118;
                    textView118.setText(AndroidUtilities.replaceTags(string2));
                    this.description.setTextSize(i11, 14.0f);
                    this.description.setGravity(i11);
                    TextView textView119 = this.description;
                    textView119.setLineSpacing(textView119.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
                    if (i15 == 18) {
                        this.description.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    } else {
                        this.description.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    }
                    if (i15 == 19) {
                        addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
                    } else {
                        addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
                    }
                    if (i15 == 31) {
                        ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                        ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                        ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                    }
                    LimitReachedBottomSheet.this.updatePremiumButtonText();
                }
                this.title.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
            }
            this.title.setTextSize(1, 20.0f);
            TextView textView1110 = this.title;
            i9 = Theme.key_windowBackgroundWhiteBlackText;
            textView1110.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
            this.title.setGravity(17);
            if (i15 != 19) {
                ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider;
                boostCounterView = new BoostCounterView(context);
                this.boostCounterView = boostCounterView;
                boostCounterView.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                if (i15 == 32) {
                    boostCounterView.setVisibility(8);
                }
                if (LimitReachedBottomSheet.this.isCurrentChat) {
                    LinearLayout linearLayout19 = new LinearLayout(context);
                    this.titleLinearLayout = linearLayout19;
                    linearLayout19.setOrientation(0);
                    this.titleLinearLayout.setWeightSum(1.0f);
                    this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                    this.titleLinearLayout.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                    View view19 = this.titleLinearLayout;
                    if (z) {
                        i12 = 8;
                    } else {
                        i12 = 22;
                    }
                    addView(view19, LayoutHelper.createLinear(-2, -2, 1, 12, i12, 12, 9));
                    i11 = 1;
                } else {
                    View view110 = this.title;
                    if (z) {
                        i10 = 8;
                    } else {
                        i10 = 22;
                    }
                    addView(view110, LayoutHelper.createLinear(-2, -2, 1, 0, i10, 0, 0));
                    LinearLayout linearLayout110 = new LinearLayout(getContext());
                    linearLayout110.setOrientation(0);
                    linearLayout110.setClipChildren(false);
                    FrameLayout frameLayout13 = new FrameLayout(getContext());
                    frameLayout13.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                    BackupImageView backupImageView10 = new BackupImageView(getContext());
                    backupImageView10.setRoundRadius(AndroidUtilities.dp(14.0f));
                    chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                    AvatarDrawable avatarDrawable10 = new AvatarDrawable();
                    avatarDrawable10.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                    backupImageView10.setForUserOrChat(chat, avatarDrawable10);
                    frameLayout13.addView(backupImageView10, LayoutHelper.createFrame(28.0f, 28));
                    textView2 = new TextView(getContext());
                    if (chat != null) {
                        textView2.setText(chat.title);
                    }
                    textView2.setSingleLine(true);
                    textView2.setMaxLines(1);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    frameLayout13.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                    linearLayout110.addView(frameLayout13, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                    LayoutTransition layoutTransition10 = new LayoutTransition();
                    layoutTransition10.setDuration(100L);
                    layoutTransition10.enableTransitionType(4);
                    linearLayout110.setLayoutTransition(layoutTransition10);
                    linearLayout110.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                    addView(linearLayout110, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                    ScaleStateListAnimator.apply(linearLayout110);
                    i11 = 1;
                    linearLayout110.setOnClickListener(new View.OnClickListener(this) {
                        public final LimitReachedBottomSheet.HeaderView f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view111) {
                            switch (i11) {
                                case 0:
                                    BaseFragment baseFragment2 = LimitReachedBottomSheet.this.parentFragment;
                                    if (baseFragment2 != null) {
                                        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                                        bottomSheetParams.transitionFromLeft = true;
                                        baseFragment2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bottomSheetParams);
                                        break;
                                    }
                                    break;
                                default:
                                    LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                                    limitReachedBottomSheet.baseFragment.presentFragment(ChatActivity.of(limitReachedBottomSheet.dialogId));
                                    limitReachedBottomSheet.lambda$showGiftOfferSheet$15();
                                    break;
                            }
                        }
                    });
                }
            } else {
                ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider;
                boostCounterView = new BoostCounterView(context);
                this.boostCounterView = boostCounterView;
                boostCounterView.setCount(LimitReachedBottomSheet.this.canApplyBoost.boostCount, false);
                if (i15 == 32) {
                    boostCounterView.setVisibility(8);
                }
                if (LimitReachedBottomSheet.this.isCurrentChat) {
                    LinearLayout linearLayout111 = new LinearLayout(context);
                    this.titleLinearLayout = linearLayout111;
                    linearLayout111.setOrientation(0);
                    this.titleLinearLayout.setWeightSum(1.0f);
                    this.titleLinearLayout.addView(this.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
                    this.titleLinearLayout.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
                    View view111 = this.titleLinearLayout;
                    if (z) {
                        i12 = 8;
                    } else {
                        i12 = 22;
                    }
                    addView(view111, LayoutHelper.createLinear(-2, -2, 1, 12, i12, 12, 9));
                    i11 = 1;
                } else {
                    View view112 = this.title;
                    if (z) {
                        i10 = 8;
                    } else {
                        i10 = 22;
                    }
                    addView(view112, LayoutHelper.createLinear(-2, -2, 1, 0, i10, 0, 0));
                    LinearLayout linearLayout112 = new LinearLayout(getContext());
                    linearLayout112.setOrientation(0);
                    linearLayout112.setClipChildren(false);
                    FrameLayout frameLayout14 = new FrameLayout(getContext());
                    frameLayout14.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), Theme.getColor(Theme.key_windowBackgroundGray, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider)));
                    BackupImageView backupImageView11 = new BackupImageView(getContext());
                    backupImageView11.setRoundRadius(AndroidUtilities.dp(14.0f));
                    chat = MessagesController.getInstance(((BottomSheet) LimitReachedBottomSheet.this).currentAccount).getChat(Long.valueOf(-LimitReachedBottomSheet.this.dialogId));
                    AvatarDrawable avatarDrawable11 = new AvatarDrawable();
                    avatarDrawable11.setInfo(((BottomSheet) LimitReachedBottomSheet.this).currentAccount, chat);
                    backupImageView11.setForUserOrChat(chat, avatarDrawable11);
                    frameLayout14.addView(backupImageView11, LayoutHelper.createFrame(28.0f, 28));
                    textView2 = new TextView(getContext());
                    if (chat != null) {
                        textView2.setText(chat.title);
                    }
                    textView2.setSingleLine(true);
                    textView2.setMaxLines(1);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    textView2.setTextSize(1, 13.0f);
                    textView2.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
                    frameLayout14.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                    linearLayout112.addView(frameLayout14, LayoutHelper.createLinear(-2, 28, 80, 18, 0, 18, 0));
                    LayoutTransition layoutTransition11 = new LayoutTransition();
                    layoutTransition11.setDuration(100L);
                    layoutTransition11.enableTransitionType(4);
                    linearLayout112.setLayoutTransition(layoutTransition11);
                    linearLayout112.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, -30, 2, 18, 0));
                    addView(linearLayout112, LayoutHelper.createLinear(-2, 38, 17, 0, -4, 0, 12));
                    ScaleStateListAnimator.apply(linearLayout112);
                    i11 = 1;
                    linearLayout112.setOnClickListener(new View.OnClickListener(this) {
                        public final LimitReachedBottomSheet.HeaderView f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view113) {
                            switch (i11) {
                                case 0:
                                    BaseFragment baseFragment2 = LimitReachedBottomSheet.this.parentFragment;
                                    if (baseFragment2 != null) {
                                        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                                        bottomSheetParams.transitionFromLeft = true;
                                        baseFragment2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bottomSheetParams);
                                        break;
                                    }
                                    break;
                                default:
                                    LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
                                    limitReachedBottomSheet.baseFragment.presentFragment(ChatActivity.of(limitReachedBottomSheet.dialogId));
                                    limitReachedBottomSheet.lambda$showGiftOfferSheet$15();
                                    break;
                            }
                        }
                    });
                }
            }
            TextView textView1111 = new TextView(context);
            this.description = textView1111;
            textView1111.setText(AndroidUtilities.replaceTags(string2));
            this.description.setTextSize(i11, 14.0f);
            this.description.setGravity(i11);
            TextView textView1112 = this.description;
            textView1112.setLineSpacing(textView1112.getLineSpacingExtra(), this.description.getLineSpacingMultiplier() * 1.1f);
            if (i15 == 18) {
                this.description.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
            } else {
                this.description.setTextColor(Theme.getColor(i9, ((BottomSheet) LimitReachedBottomSheet.this).resourcesProvider));
            }
            if (i15 == 19) {
                addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
            } else {
                addView(this.description, LayoutHelper.createLinear(-2, -2, 1, 24, 0, 24, 24));
            }
            if (i15 == 31) {
                ((ViewGroup.MarginLayoutParams) this.description.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                ((ViewGroup.MarginLayoutParams) this.title.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
            }
            LimitReachedBottomSheet.this.updatePremiumButtonText();
        }
    }

    public LimitReachedBottomSheet(int i, int i2, Context context, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
        super(context, baseFragment, false, hasFixedSize(i), false, resourcesProvider);
        this.linkRow = -1;
        this.lockInvalidation = false;
        this.chats = new ArrayList();
        this.headerRow = -1;
        this.dividerRow = -1;
        this.chatsTitleRow = -1;
        this.chatStartRow = -1;
        this.chatEndRow = -1;
        this.loadingRow = -1;
        this.emptyViewDividerRow = -1;
        this.bottomRow = -1;
        this.boostFeaturesStartRow = -1;
        this.currentValue = -1;
        this.selectedChats = new HashSet();
        this.inactiveChats = new ArrayList();
        this.inactiveChatsSignatures = new ArrayList();
        this.restrictedUsers = new ArrayList();
        this.premiumMessagingBlockedUsers = new ArrayList();
        this.premiumInviteBlockedUsers = new ArrayList();
        this.loading = false;
        this.requiredLvl = 0;
        this.shiftDp = -4;
        fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
        this.parentFragment = baseFragment;
        this.currentAccount = i2;
        this.type = i;
        updateTitle$1();
        updateRows$7();
        if (i == 2) {
            this.loading = true;
            updateRows$7();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new LimitReachedBottomSheet$$ExternalSyntheticLambda4(this, 2));
        } else if (i == 5) {
            this.loading = true;
            updateRows$7();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new LimitReachedBottomSheet$$ExternalSyntheticLambda4(this, 0));
        }
        updatePremiumButtonText();
        if (i == 32 || isBoostingForAdminPossible()) {
            FireworksOverlay fireworksOverlay = new FireworksOverlay(getContext());
            this.fireworksOverlay = fireworksOverlay;
            this.container.addView(fireworksOverlay, LayoutHelper.createFrame(-1.0f, -1));
        }
        if (i == 18 || i == 20 || i == 24 || i == 25 || i == 26 || i == 29 || i == 22 || i == 23 || i == 21 || i == 27 || i == 28 || i == 30 || i == 35 || i == 31) {
            ((ViewGroup) this.premiumButtonView.getParent()).removeView(this.premiumButtonView);
            QrActivity.AnonymousClass2 anonymousClass2 = this.divider;
            if (anonymousClass2 != null) {
                ((ViewGroup) anonymousClass2.getParent()).removeView(this.divider);
            }
            this.recyclerListView.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.actionBtn = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(this.premiumButtonView.getTextView().getText());
            textView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
            textView.setOnClickListener(new LimitReachedBottomSheet$$ExternalSyntheticLambda0(this, 0));
            int iDp = AndroidUtilities.dp(8.0f);
            int color = Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider);
            int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider), 120);
            textView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, alphaComponent, alphaComponent));
        }
        if (i == 32) {
            ((ViewGroup) this.premiumButtonView.getParent()).removeView(this.premiumButtonView);
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
            this.boostToUnlockGroupBtn = buttonWithCounterView;
            buttonWithCounterView.withCounterIcon();
            buttonWithCounterView.setText(LocaleController.getString(R.string.BoostGroup), false, true);
            buttonWithCounterView.setOnClickListener(new LimitReachedBottomSheet$$ExternalSyntheticLambda0(this, 2));
            this.containerView.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.containerView.post(new LimitReachedBottomSheet$$ExternalSyntheticLambda2(this, 0));
        }
        if (i == 19 || i == 18) {
            this.containerView.post(new LimitReachedBottomSheet$$ExternalSyntheticLambda2(this, 4));
        }
    }

    public static Palette.Builder getLimitParams(int i, int i2) {
        Palette.Builder builder = new Palette.Builder();
        builder.mMaxColors = 0;
        builder.mBitmap = null;
        builder.mTargets = null;
        builder.mFilters = null;
        builder.mResizeArea = 0;
        builder.mResizeMaxDimension = 0;
        if (i == 0) {
            builder.mResizeArea = MessagesController.getInstance(i2).dialogFiltersPinnedLimitDefault;
            builder.mResizeMaxDimension = MessagesController.getInstance(i2).dialogFiltersPinnedLimitPremium;
            builder.mMaxColors = R.drawable.msg_limit_pin;
            builder.mBitmap = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(builder.mResizeArea), Integer.valueOf(builder.mResizeMaxDimension));
            builder.mTargets = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(builder.mResizeMaxDimension));
            builder.mFilters = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(builder.mResizeArea));
            return builder;
        }
        if (i == 33) {
            builder.mResizeArea = MessagesController.getInstance(i2).savedDialogsPinnedLimitDefault;
            builder.mResizeMaxDimension = MessagesController.getInstance(i2).savedDialogsPinnedLimitPremium;
            builder.mMaxColors = R.drawable.msg_limit_pin;
            builder.mBitmap = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(builder.mResizeArea), Integer.valueOf(builder.mResizeMaxDimension));
            builder.mTargets = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(builder.mResizeMaxDimension));
            builder.mFilters = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(builder.mResizeArea));
            return builder;
        }
        if (i == 2) {
            builder.mResizeArea = MessagesController.getInstance(i2).publicLinksLimitDefault;
            builder.mResizeMaxDimension = MessagesController.getInstance(i2).publicLinksLimitPremium;
            builder.mMaxColors = R.drawable.msg_limit_links;
            builder.mBitmap = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(builder.mResizeArea), Integer.valueOf(builder.mResizeMaxDimension));
            builder.mTargets = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(builder.mResizeMaxDimension));
            builder.mFilters = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(builder.mResizeArea));
            return builder;
        }
        if (i == 12) {
            builder.mResizeArea = MessagesController.getInstance(i2).chatlistInvitesLimitDefault;
            builder.mResizeMaxDimension = MessagesController.getInstance(i2).chatlistInvitesLimitPremium;
            builder.mMaxColors = R.drawable.msg_limit_links;
            builder.mBitmap = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(builder.mResizeArea), Integer.valueOf(builder.mResizeMaxDimension));
            builder.mTargets = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(builder.mResizeMaxDimension));
            builder.mFilters = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(builder.mResizeArea));
            return builder;
        }
        if (i == 13) {
            builder.mResizeArea = MessagesController.getInstance(i2).chatlistJoinedLimitDefault;
            builder.mResizeMaxDimension = MessagesController.getInstance(i2).chatlistJoinedLimitPremium;
            builder.mMaxColors = R.drawable.msg_limit_folder;
            builder.mBitmap = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(builder.mResizeArea), Integer.valueOf(builder.mResizeMaxDimension));
            builder.mTargets = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(builder.mResizeMaxDimension));
            builder.mFilters = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(builder.mResizeArea));
            return builder;
        }
        if (i == 3) {
            builder.mResizeArea = MessagesController.getInstance(i2).dialogFiltersLimitDefault;
            builder.mResizeMaxDimension = MessagesController.getInstance(i2).dialogFiltersLimitPremium;
            builder.mMaxColors = R.drawable.msg_limit_folder;
            builder.mBitmap = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(builder.mResizeArea), Integer.valueOf(builder.mResizeMaxDimension));
            builder.mTargets = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(builder.mResizeMaxDimension));
            builder.mFilters = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(builder.mResizeArea));
            return builder;
        }
        if (i == 4) {
            builder.mResizeArea = MessagesController.getInstance(i2).dialogFiltersChatsLimitDefault;
            builder.mResizeMaxDimension = MessagesController.getInstance(i2).dialogFiltersChatsLimitPremium;
            builder.mMaxColors = R.drawable.msg_limit_chats;
            builder.mBitmap = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(builder.mResizeArea), Integer.valueOf(builder.mResizeMaxDimension));
            builder.mTargets = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(builder.mResizeMaxDimension));
            builder.mFilters = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(builder.mResizeArea));
            return builder;
        }
        if (i == 5) {
            builder.mResizeArea = MessagesController.getInstance(i2).channelsLimitDefault;
            builder.mResizeMaxDimension = MessagesController.getInstance(i2).channelsLimitPremium;
            builder.mMaxColors = R.drawable.msg_limit_groups;
            builder.mBitmap = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(builder.mResizeArea), Integer.valueOf(builder.mResizeMaxDimension));
            builder.mTargets = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(builder.mResizeMaxDimension));
            builder.mFilters = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(builder.mResizeArea));
            return builder;
        }
        if (i == 6) {
            builder.mResizeArea = 100;
            builder.mResizeMaxDimension = 200;
            builder.mMaxColors = R.drawable.msg_limit_folder;
            builder.mBitmap = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            builder.mTargets = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            builder.mFilters = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
            return builder;
        }
        if (i == 7) {
            builder.mResizeArea = 3;
            builder.mResizeMaxDimension = 4;
            builder.mMaxColors = R.drawable.msg_limit_accounts;
            builder.mBitmap = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(builder.mResizeMaxDimension));
            int i3 = R.string.LimitReachedAccountsPremium;
            builder.mTargets = LocaleController.formatString("LimitReachedAccountsPremium", i3, Integer.valueOf(builder.mResizeMaxDimension));
            builder.mFilters = LocaleController.formatString("LimitReachedAccountsPremium", i3, Integer.valueOf(builder.mResizeArea));
            return builder;
        }
        if (i == 11) {
            builder.mResizeArea = 0;
            builder.mResizeMaxDimension = 0;
            builder.mMaxColors = R.drawable.msg_limit_links;
            builder.mBitmap = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(builder.mResizeMaxDimension));
            builder.mTargets = "";
            builder.mFilters = "";
            return builder;
        }
        if (i == 14) {
            builder.mResizeArea = MessagesController.getInstance(i2).storyExpiringLimitDefault;
            builder.mResizeMaxDimension = MessagesController.getInstance(i2).storyExpiringLimitPremium;
            builder.mMaxColors = R.drawable.msg_limit_stories;
            builder.mBitmap = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2First", builder.mResizeArea) + "\n" + LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Second", builder.mResizeMaxDimension);
            builder.mTargets = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", builder.mResizeMaxDimension);
            builder.mFilters = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", builder.mResizeArea);
            return builder;
        }
        if (i == 15) {
            builder.mResizeArea = MessagesController.getInstance(i2).storiesSentWeeklyLimitDefault;
            builder.mResizeMaxDimension = MessagesController.getInstance(i2).storiesSentWeeklyLimitPremium;
            builder.mMaxColors = R.drawable.msg_limit_stories;
            builder.mBitmap = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(builder.mResizeArea), Integer.valueOf(builder.mResizeMaxDimension));
            int i4 = R.string.LimitReachedStoriesWeeklyPremium;
            builder.mTargets = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", i4, Integer.valueOf(builder.mResizeMaxDimension));
            builder.mFilters = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", i4, Integer.valueOf(builder.mResizeArea));
            return builder;
        }
        if (i == 16) {
            builder.mResizeArea = MessagesController.getInstance(i2).storiesSentMonthlyLimitDefault;
            builder.mResizeMaxDimension = MessagesController.getInstance(i2).storiesSentMonthlyLimitPremium;
            builder.mMaxColors = R.drawable.msg_limit_stories;
            builder.mBitmap = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(builder.mResizeArea), Integer.valueOf(builder.mResizeMaxDimension));
            int i5 = R.string.LimitReachedStoriesMonthlyPremium;
            builder.mTargets = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i5, Integer.valueOf(builder.mResizeMaxDimension));
            builder.mFilters = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i5, Integer.valueOf(builder.mResizeArea));
            return builder;
        }
        if (i != 18 && i != 32 && i != 20 && i != 24 && i != 27 && i != 28 && i != 25 && i != 30 && i != 35 && i != 29 && i != 22 && i != 23 && i != 19 && i != 21 && i != 26) {
            return builder;
        }
        builder.mResizeArea = MessagesController.getInstance(i2).storiesSentMonthlyLimitDefault;
        builder.mResizeMaxDimension = MessagesController.getInstance(i2).storiesSentMonthlyLimitPremium;
        builder.mMaxColors = R.drawable.filled_limit_boost;
        builder.mBitmap = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(builder.mResizeArea), Integer.valueOf(builder.mResizeMaxDimension));
        int i6 = R.string.LimitReachedStoriesMonthlyPremium;
        builder.mTargets = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i6, Integer.valueOf(builder.mResizeMaxDimension));
        builder.mFilters = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", i6, Integer.valueOf(builder.mResizeArea));
        return builder;
    }

    public static boolean hasFixedSize(int i) {
        return i == 0 || i == 33 || i == 3 || i == 4 || i == 6 || i == 7 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16;
    }

    public static String limitTypeToServerString(int i) {
        switch (i) {
            case 0:
                return "double_limits__dialog_pinned";
            case 1:
            case 7:
            case 11:
            default:
                return null;
            case 2:
                return "double_limits__channels_public";
            case 3:
                return "double_limits__dialog_filters";
            case 4:
                return "double_limits__dialog_filters_chats";
            case 5:
                return "double_limits__channels";
            case 6:
                return "double_limits__upload_max_fileparts";
            case 8:
                return "double_limits__caption_length";
            case 9:
                return "double_limits__saved_gifs";
            case 10:
                return "double_limits__stickers_faved";
            case 12:
                return "double_limits__chatlist_invites";
            case 13:
                return "double_limits__chatlists_joined";
        }
    }

    public static void openBoostsForRemoveRestrictions(BaseFragment baseFragment, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j, boolean z) {
        if (tL_premium_boostsStatus == null || canApplyBoost == null || baseFragment.getContext() == null) {
            return;
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(32, baseFragment.getCurrentAccount(), baseFragment.getContext(), baseFragment, baseFragment.getResourceProvider());
        limitReachedBottomSheet.canApplyBoost = canApplyBoost;
        limitReachedBottomSheet.updateButton$2();
        limitReachedBottomSheet.updatePremiumButtonText();
        limitReachedBottomSheet.boostsStatus = tL_premium_boostsStatus;
        limitReachedBottomSheet.isCurrentChat = true;
        limitReachedBottomSheet.updateRows$7();
        limitReachedBottomSheet.dialogId = j;
        limitReachedBottomSheet.updateRows$7();
        if (z) {
            baseFragment.showDialog(limitReachedBottomSheet);
        } else {
            limitReachedBottomSheet.show();
        }
    }

    public final void boostChannel(final Loadable loadable, boolean z) {
        if (!loadable.isLoading() || z) {
            loadable.setLoading(true);
            ChannelBoostsController boostsController = MessagesController.getInstance(this.currentAccount).getBoostsController();
            long j = this.dialogId;
            int i = this.canApplyBoost.slot;
            final int i2 = 0;
            Utilities.Callback<TL_stories.TL_premium_myBoosts> callback = new Utilities.Callback(this) {
                public final LimitReachedBottomSheet f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$boostChannel$17(loadable, (TL_stories.TL_premium_myBoosts) obj);
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            LimitReachedBottomSheet limitReachedBottomSheet = this.f$0;
                            limitReachedBottomSheet.getClass();
                            boolean zStartsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            Loadable loadable2 = loadable;
                            if (zStartsWith) {
                                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                if (iIntValue <= 5) {
                                    AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(19, limitReachedBottomSheet, loadable2), ((long) iIntValue) * 1000);
                                } else {
                                    BoostDialogs.showFloodWait(iIntValue);
                                }
                            }
                            loadable2.setLoading(false);
                            break;
                    }
                }
            };
            final int i3 = 1;
            boostsController.applyBoost(j, i, callback, new Utilities.Callback(this) {
                public final LimitReachedBottomSheet f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$boostChannel$17(loadable, (TL_stories.TL_premium_myBoosts) obj);
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            LimitReachedBottomSheet limitReachedBottomSheet = this.f$0;
                            limitReachedBottomSheet.getClass();
                            boolean zStartsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            Loadable loadable2 = loadable;
                            if (zStartsWith) {
                                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                if (iIntValue <= 5) {
                                    AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(19, limitReachedBottomSheet, loadable2), ((long) iIntValue) * 1000);
                                } else {
                                    BoostDialogs.showFloodWait(iIntValue);
                                }
                            }
                            loadable2.setLoading(false);
                            break;
                    }
                }
            });
        }
    }

    public int channelColorLevelMin() {
        return 0;
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        return new AnonymousClass5();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        if (i != NotificationCenter.boostByChannelCreated) {
            if (i != NotificationCenter.boostedChannelByUser) {
                if (i == NotificationCenter.didStartedMultiGiftsSelector) {
                    lambda$showGiftOfferSheet$15();
                    return;
                }
                return;
            }
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int iIntValue = ((Integer) objArr[1]).intValue();
            int iIntValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus == null || this.canApplyBoost == null) {
                return;
            }
            this.boostsStatus.boosts += iIntValue;
            if (this.type == 32 && (chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-this.dialogId)) != null) {
                chatFull.boosts_applied += iIntValue;
            }
            limitPreviewIncreaseCurrentValue();
            boolean z = this.isCurrentChat;
            this.boostsStatus = tL_premium_boostsStatus;
            this.isCurrentChat = z;
            updateRows$7();
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
            canApplyBoost.isMaxLvl = this.boostsStatus.next_level_boosts <= 0;
            canApplyBoost.boostedNow = true;
            canApplyBoost.setMyBoosts(tL_premium_myBoosts);
            if (onBoostSuccess()) {
                Bulletin bulletinCreateSimpleBulletinWithIconSize = new BulletinFactory(this.container, this.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.ic_boosts_replace, 30, LocaleController.formatPluralString("BoostingReassignedFromPlural", iIntValue, LocaleController.formatPluralString("BoostingFromOtherChannel", iIntValue2, new Object[0])));
                bulletinCreateSimpleBulletinWithIconSize.duration = 4000;
                bulletinCreateSimpleBulletinWithIconSize.show(true);
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        BaseFragment baseFragment = this.baseFragment;
        BaseFragment lastFragment = ((ActionBarLayout) baseFragment.getParentLayout()).getLastFragment();
        BaseFragment baseFragment2 = null;
        if (lastFragment instanceof ChatCustomReactionsEditActivity) {
            List<BaseFragment> fragmentStack = ((ActionBarLayout) baseFragment.getParentLayout()).getFragmentStack();
            BaseFragment baseFragment3 = fragmentStack.size() >= 2 ? (BaseFragment) RendererCapabilities.CC.m(2, fragmentStack) : null;
            BaseFragment baseFragment4 = fragmentStack.size() >= 3 ? (BaseFragment) RendererCapabilities.CC.m(3, fragmentStack) : null;
            baseFragment2 = fragmentStack.size() >= 4 ? (BaseFragment) RendererCapabilities.CC.m(4, fragmentStack) : null;
            if (baseFragment3 instanceof ChatEditActivity) {
                INavigationLayout parentLayout = baseFragment.getParentLayout();
                parentLayout.getClass();
                ((ActionBarLayout) parentLayout).removeFragmentFromStack(baseFragment3, false);
            }
            lambda$showGiftOfferSheet$15();
            if (!zBooleanValue) {
                lastFragment.finishFragment();
                BoostDialogs.showBulletin(baseFragment4, chat, false);
                return;
            }
            if (baseFragment4 instanceof ProfileActivity) {
                INavigationLayout parentLayout2 = baseFragment.getParentLayout();
                parentLayout2.getClass();
                ((ActionBarLayout) parentLayout2).removeFragmentFromStack(baseFragment4, false);
            }
            lastFragment.finishFragment();
            BoostDialogs.showBulletin(baseFragment2, chat, true);
            return;
        }
        if ((lastFragment instanceof ChatActivity) && zBooleanValue) {
            BoostDialogs.showBulletin(lastFragment, chat, true);
            return;
        }
        if ((lastFragment instanceof ChannelColorActivity) && zBooleanValue) {
            List<BaseFragment> fragmentStack2 = ((ActionBarLayout) baseFragment.getParentLayout()).getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                BaseFragment baseFragment5 = fragmentStack2.get(size);
                if ((baseFragment5 instanceof ChatActivity) || (baseFragment5 instanceof DialogsActivity)) {
                    baseFragment2 = baseFragment5;
                    break;
                }
                arrayList.add(baseFragment5);
            }
            if (baseFragment2 == null) {
                return;
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                INavigationLayout parentLayout3 = baseFragment.getParentLayout();
                parentLayout3.getClass();
                ((ActionBarLayout) parentLayout3).removeFragmentFromStack((BaseFragment) obj, false);
            }
            baseFragment.finishFragment();
            lambda$showGiftOfferSheet$15();
            BoostDialogs.showBulletin(baseFragment2, chat, true);
            return;
        }
        if (!zBooleanValue) {
            StoryRecorder storyRecorder = StoryRecorder.instance;
            if (storyRecorder == null || !storyRecorder.isShown) {
                lambda$showGiftOfferSheet$15();
                BoostDialogs.showBulletin(LaunchActivity.getLastFragment(), chat, false);
                return;
            }
            ChatActivity chatActivityOf = ChatActivity.of(-chat.id);
            LaunchActivity.getLastFragment().presentFragment(chatActivityOf, false, false);
            StoryRecorder.destroyInstance();
            lambda$showGiftOfferSheet$15();
            BoostDialogs.showBulletin(chatActivityOf, chat, false);
            return;
        }
        StoryRecorder storyRecorder2 = StoryRecorder.instance;
        if (storyRecorder2 != null && storyRecorder2.isShown) {
            ChatActivity chatActivityOf2 = ChatActivity.of(-chat.id);
            LaunchActivity.getLastFragment().presentFragment(chatActivityOf2, false, false);
            StoryRecorder.destroyInstance();
            lambda$showGiftOfferSheet$15();
            BoostDialogs.showBulletin(chatActivityOf2, chat, true);
            return;
        }
        List<BaseFragment> fragmentStack3 = ((ActionBarLayout) baseFragment.getParentLayout()).getFragmentStack();
        baseFragment2 = fragmentStack3.size() >= 2 ? (BaseFragment) RendererCapabilities.CC.m(2, fragmentStack3) : null;
        baseFragment.finishFragment();
        lambda$showGiftOfferSheet$15();
        if (baseFragment2 instanceof ChatActivity) {
            BoostDialogs.showBulletin(baseFragment2, chat, true);
        }
    }

    public final String getBoostLink() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.boostsStatus.boost_url;
        }
        int i = this.currentAccount;
        long j = -this.dialogId;
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(j));
        if (TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
            return Log.m(j, "https://t.me/boost/?c=");
        }
        return "https://t.me/boost/" + ChatObject.getPublicUsername(chat);
    }

    public final String getBoostsDescriptionString(boolean z) {
        String string;
        if (this.type == 32) {
            TLRPC.Chat chat$1$1 = getChat$1$1();
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-this.dialogId);
            return LocaleController.formatPluralString("BoostingRemoveRestrictionsSubtitle", Math.max(chatFull.boosts_unrestrict - chatFull.boosts_applied, 0), chat$1$1 == null ? "" : chat$1$1.title);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        if (chat == null) {
            string = LocaleController.getString(isGroup() ? R.string.AccDescrGroup : R.string.AccDescrChannel);
        } else {
            string = chat.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        boolean z2 = tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts;
        if (isMiniBoostBtnForAdminAvailable() && this.boostsStatus.next_level_boosts != 0 && z) {
            int i = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.boostsStatus;
            int i2 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i, string, LocaleController.formatPluralString("MoreBoosts", i2, Integer.valueOf(i2)));
        }
        if (z2 && this.canApplyBoost.alreadyActive) {
            if (this.boostsStatus.level == 1) {
                return LocaleController.formatString(isGroup() ? R.string.GroupBoostsJustReachedLevel1 : R.string.ChannelBoostsJustReachedLevel1, new Object[0]);
            }
            return LocaleController.formatString(isGroup() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.boostsStatus.level), LocaleController.formatPluralString("BoostStories", this.boostsStatus.level, new Object[0]));
        }
        if (this.canApplyBoost.alreadyActive) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.boostsStatus;
            if (tL_premium_boostsStatus3.level == 0) {
                int i3 = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.boostsStatus;
                int i4 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i3, string, LocaleController.formatPluralString("MoreBoosts", i4, Integer.valueOf(i4)));
            }
            if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                return LocaleController.formatString(isGroup() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.boostsStatus.level), LocaleController.formatPluralString("BoostStories", this.boostsStatus.level + 1, new Object[0]));
            }
            int i5 = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.boostsStatus;
            int i6 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
            return LocaleController.formatString(i5, string, LocaleController.formatPluralString("MoreBoosts", i6, Integer.valueOf(i6)));
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.boostsStatus;
        if (tL_premium_boostsStatus6.level == 0) {
            int i7 = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.boostsStatus;
            int i8 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return LocaleController.formatString(i7, string, LocaleController.formatPluralString("MoreBoosts", i8, Integer.valueOf(i8)));
        }
        if (tL_premium_boostsStatus6.next_level_boosts == 0) {
            return LocaleController.formatString(isGroup() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.boostsStatus.level), LocaleController.formatPluralString("BoostStories", this.boostsStatus.level + 1, new Object[0]));
        }
        int i9 = isGroup() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.boostsStatus;
        int i10 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
        return LocaleController.formatString(i9, string, LocaleController.formatPluralString("MoreBoosts", i10, Integer.valueOf(i10)));
    }

    public final String getBoostsTitleString() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.canApplyBoost.alreadyActive) {
            return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        boolean z = this.isCurrentChat;
        int i = this.type;
        if (!z) {
            if (i == 32) {
                return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
            }
            if (this.canApplyBoost.alreadyActive) {
                return LocaleController.getString(isGroup() ? R.string.YouBoostedGroup : R.string.YouBoostedChannel);
            }
            return LocaleController.getString(isGroup() ? R.string.BoostingEnableStoriesForGroup : R.string.BoostingEnableStoriesForChannel);
        }
        if (i == 32) {
            return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        if (this.canApplyBoost.alreadyActive) {
            return LocaleController.formatString("YouBoostedChannel2", R.string.YouBoostedChannel2, chat.title);
        }
        return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
    }

    public final TLRPC.Chat getChat$1$1() {
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
    }

    @Override
    public final CharSequence getTitle() {
        int i = this.type;
        if (i == 11) {
            return LocaleController.getString(R.string.ChannelInviteViaLink2);
        }
        if (i == 34) {
            return LocaleController.getString(R.string.CallInviteViaLink);
        }
        if (i == 35) {
            return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
        }
        switch (i) {
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
            case 19:
            case 30:
                return LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
            case 31:
                return LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle);
            case 32:
                return LocaleController.getString(R.string.BoostGroup);
            default:
                return LocaleController.getString(R.string.LimitReached);
        }
    }

    public final boolean isBoostingForAdminPossible() {
        int i = this.type;
        return i == 19 || i == 18 || i == 20 || i == 24 || i == 25 || i == 26 || i == 29 || i == 22 || i == 27 || i == 28 || i == 23 || i == 30 || i == 35;
    }

    public final boolean isGroup() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)));
    }

    public final boolean isMiniBoostBtnForAdminAvailable() {
        return isBoostingForAdminPossible() && ChatObject.hasAdminRights(getChat$1$1());
    }

    public final void lambda$boostChannel$16(Loadable loadable, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        TLRPC.ChatFull chatFull;
        loadable.setLoading(false);
        if (tL_premium_boostsStatus == null) {
            return;
        }
        this.boostsStatus.boosts++;
        if (this.type == 32 && (chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-this.dialogId)) != null) {
            chatFull.boosts_applied++;
        }
        limitPreviewIncreaseCurrentValue();
        boolean z = this.isCurrentChat;
        this.boostsStatus = tL_premium_boostsStatus;
        this.isCurrentChat = z;
        updateRows$7();
        ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
        canApplyBoost.isMaxLvl = this.boostsStatus.next_level_boosts <= 0;
        canApplyBoost.boostedNow = true;
        canApplyBoost.setMyBoosts(tL_premium_myBoosts);
        onBoostSuccess();
    }

    public final void lambda$boostChannel$17(Loadable loadable, TL_stories.TL_premium_myBoosts tL_premium_myBoosts) {
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(this.dialogId, new LinkManager$$ExternalSyntheticLambda13(this, loadable, tL_premium_myBoosts, 2));
    }

    public final void lambda$leaveFromSelectedGroups$21(ArrayList arrayList, TLRPC.User user) {
        lambda$showGiftOfferSheet$15();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i);
            MessagesController.getInstance(this.currentAccount).putChat(chat, false);
            MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(chat.id, user);
        }
    }

    public final void lambda$loadInactiveChannels$26(ArrayList arrayList, int i, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        RecyclerListView recyclerListView;
        int top;
        ArrayList arrayList2 = this.inactiveChatsSignatures;
        arrayList2.clear();
        ArrayList arrayList3 = this.inactiveChats;
        arrayList3.clear();
        arrayList2.addAll(arrayList);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList3.add(tL_messages_inactiveChats.chats.get(i2));
        }
        this.loading = false;
        this.enterAnimator.showItemsAnimated(this.chatsTitleRow + 4);
        int i3 = 0;
        while (true) {
            recyclerListView = this.recyclerListView;
            if (i3 >= recyclerListView.getChildCount()) {
                top = 0;
                break;
            } else {
                if (recyclerListView.getChildAt(i3) instanceof HeaderView) {
                    top = recyclerListView.getChildAt(i3).getTop();
                    break;
                }
                i3++;
            }
        }
        updateRows$7();
        if (this.headerRow >= 0 && top != 0) {
            ((LinearLayoutManager) recyclerListView.getLayoutManager()).scrollToPositionWithOffset(this.headerRow + 1, top);
        }
        if (this.limitParams == null) {
            this.limitParams = getLimitParams(this.type, this.currentAccount);
        }
        int iMax = Math.max(arrayList3.size(), this.limitParams.mResizeArea);
        HeaderView.AnonymousClass2 anonymousClass2 = this.limitPreviewView;
        if (anonymousClass2 != null) {
            anonymousClass2.setIconValue(iMax, false);
            this.limitPreviewView.setBagePosition(iMax / this.limitParams.mResizeMaxDimension);
            HeaderView.AnonymousClass2 anonymousClass3 = this.limitPreviewView;
            anonymousClass3.animationCanPlay = true;
            anonymousClass3.requestLayout();
        }
    }

    public final void lambda$loadInactiveChannels$27(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
            ArrayList arrayList = new ArrayList();
            int iMin = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
            for (int i = 0; i < iMin; i++) {
                TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i);
                int currentTime = (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - tL_messages_inactiveChats.dates.get(i).intValue()) / 86400;
                String pluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                if (ChatObject.isMegagroup(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), pluralString));
                } else if (ChatObject.isChannel(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, pluralString));
                } else {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), pluralString));
                }
            }
            AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda71(this, arrayList, iMin, tL_messages_inactiveChats, 20));
        }
    }

    public final void lambda$new$2() {
        ButtonWithCounterView buttonWithCounterView = this.boostToUnlockGroupBtn;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-this.dialogId);
        buttonWithCounterView.setCount(Math.max(chatFull.boosts_unrestrict - chatFull.boosts_applied, 0), false);
    }

    public final void lambda$onViewCreated$12(Context context) {
        int i = 2;
        int i2 = 20;
        int i3 = 19;
        int i4 = 1;
        int i5 = this.type;
        if (i5 == 11 || i5 == 34) {
            return;
        }
        if (i5 != 19 && i5 != 32 && !isMiniBoostBtnForAdminAvailable()) {
            if (i5 == 18 || i5 == 20 || i5 == 24 || i5 == 25 || i5 == 26 || i5 == 29 || i5 == 22 || i5 == 23 || i5 == 21 || i5 == 27 || i5 == 28 || i5 == 30 || i5 == 35) {
                AndroidUtilities.addToClipboard(getBoostLink());
                lambda$showGiftOfferSheet$15();
                return;
            }
            if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.isVeryLargeFile) {
                lambda$showGiftOfferSheet$15();
                return;
            }
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment == null) {
                return;
            }
            if (baseFragment.getVisibleDialog() != null) {
                baseFragment.getVisibleDialog().dismiss();
            }
            baseFragment.presentFragment(new PremiumPreviewFragment(0, limitTypeToServerString(i5)));
            lambda$showGiftOfferSheet$15();
            return;
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
        if (canApplyBoost.empty) {
            if (UserConfig.getInstance(this.currentAccount).isPremium() && BoostRepository.isMultiBoostsAvailable()) {
                BoostDialogs.showMoreBoostsNeeded(this.dialogId, this);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.PremiumNeeded);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = string;
            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.getString(isGroup() ? R.string.PremiumNeededForBoostingGroup : R.string.PremiumNeededForBoosting));
            builder.setPositiveButton(LocaleController.getString(R.string.CheckPhoneNumberYes), new BoostDialogs$$ExternalSyntheticLambda10(this, i4));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ShareAlert$$ExternalSyntheticLambda15(i3));
            builder.show();
            return;
        }
        boolean z = canApplyBoost.canApply;
        if (z && canApplyBoost.replaceDialogId == 0) {
            if (canApplyBoost.needSelector && BoostRepository.isMultiBoostsAvailable()) {
                this.lockInvalidation = true;
                this.limitPreviewView.invalidationEnabled = false;
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.canApplyBoost;
                ReassignBoostBottomSheet reassignBoostBottomSheet = new ReassignBoostBottomSheet(this.baseFragment, canApplyBoost2.myBoosts, canApplyBoost2.currentChat);
                reassignBoostBottomSheet.show();
                reassignBoostBottomSheet.setOnHideListener(new OAuthSheet$$ExternalSyntheticLambda11(this, 16));
                return;
            }
            if (this.boostMiniBtn.isAttachedToWindow()) {
                boostChannel(this.boostMiniBtn, false);
                return;
            }
            ButtonWithCounterView buttonWithCounterView = this.boostToUnlockGroupBtn;
            if (buttonWithCounterView == null || !buttonWithCounterView.isAttachedToWindow()) {
                boostChannel(this.premiumButtonView, false);
                return;
            } else {
                boostChannel(buttonWithCounterView, false);
                return;
            }
        }
        if (!z) {
            int i6 = canApplyBoost.floodWait;
            if (i6 != 0) {
                BoostDialogs.showFloodWait(i6);
                return;
            }
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        BackupImageView backupImageView = new BackupImageView(getContext());
        backupImageView.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(backupImageView, LayoutHelper.createFrame(60.0f, 60));
        frameLayout.setClipChildren(false);
        Paint paint = new Paint(1);
        paint.setColor(Theme.getColor(null, Theme.key_dialogBackground, false));
        frameLayout.addView(new ChatActivity.AnonymousClass27(getContext(), paint, getContext().getDrawable(R.drawable.filled_limit_boost)), LayoutHelper.createFrame(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayIcon, false));
        frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24, 17));
        BackupImageView backupImageView2 = new BackupImageView(getContext());
        backupImageView2.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(backupImageView2, LayoutHelper.createFrame(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.addView(frameLayout, LayoutHelper.createFrame(-2, 60, 1));
        frameLayout2.setClipChildren(false);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        textView.setTextSize(1, 16.0f);
        frameLayout2.addView(textView, LayoutHelper.createLinear(-1, -2, 0, 24, 80, 24, 0));
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.canApplyBoost.replaceDialogId));
        avatarDrawable.setInfo(this.currentAccount, chat);
        backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
        backupImageView.onNewImageSet();
        AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
        TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        avatarDrawable2.setInfo(this.currentAccount, chat2);
        backupImageView2.imageReceiver.setForUserOrChat(chat2, avatarDrawable2);
        backupImageView2.onNewImageSet();
        AlertDialog.Builder builder2 = new AlertDialog.Builder(context, 0, null);
        builder2.setView(frameLayout2);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
        builder2.setPositiveButton(LocaleController.getString(R.string.Replace), new BoostDialogs$$ExternalSyntheticLambda10(this, i));
        builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), new ShareAlert$$ExternalSyntheticLambda15(i2));
        builder2.show();
    }

    public final void lambda$onViewCreated$14() {
        boolean z = this.premiumButtonSetSubscribe;
        int i = 1;
        int i2 = this.type;
        if (z) {
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment == null) {
                return;
            }
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            baseFragment.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), bottomSheetParams);
        } else if (i2 == 19 || i2 == 32 || isMiniBoostBtnForAdminAvailable()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
            if (canApplyBoost.canApply) {
                this.premiumButtonView.buttonLayout.callOnClick();
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.canApplyBoost;
                if (canApplyBoost2.alreadyActive && canApplyBoost2.boostedNow) {
                    AndroidUtilities.runOnUIThread(new LimitReachedBottomSheet$$ExternalSyntheticLambda2(this, i), canApplyBoost2.needSelector ? 300L : 0L);
                    return;
                }
                return;
            }
            if (canApplyBoost.alreadyActive && BoostRepository.isMultiBoostsAvailable() && !this.canApplyBoost.isMaxLvl) {
                BoostDialogs.showMoreBoostsNeeded(this.dialogId, this);
                return;
            } else {
                lambda$showGiftOfferSheet$15();
                return;
            }
        }
        HashSet hashSet = this.selectedChats;
        if (i2 == 11 || i2 == 34) {
            if (hashSet.isEmpty()) {
                lambda$showGiftOfferSheet$15();
                return;
            } else {
                sendInviteMessages(null);
                return;
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        if (i2 == 2) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.chats.add((TLRPC.Chat) it.next());
            }
            revokeLinks(arrayList);
            return;
        }
        if (i2 == 5) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList2.add((TLRPC.Chat) it2.next());
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
            String pluralString = LocaleController.formatPluralString("LeaveCommunities", arrayList2.size(), new Object[0]);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.title = pluralString;
            if (arrayList2.size() == 1) {
                alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList2.get(0)).title));
            } else {
                alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0]));
            }
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.setPositiveButton(LocaleController.getString(R.string.VoipGroupLeave), new VoIPFragment$$ExternalSyntheticLambda42(this, arrayList2, user, 4));
            alertDialog.show();
            TextView textView = (TextView) alertDialog.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
            }
        }
    }

    public final void lambda$onViewCreated$5(View view) {
        int i;
        boolean z = view instanceof AdminedChannelCell;
        HashSet hashSet = this.selectedChats;
        if (z) {
            AdminedChannelCell adminedChannelCell = (AdminedChannelCell) view;
            TLRPC.Chat currentChannel = adminedChannelCell.getCurrentChannel();
            if (hashSet.contains(currentChannel)) {
                hashSet.remove(currentChannel);
            } else {
                hashSet.add(currentChannel);
            }
            adminedChannelCell.checkBox.checkBoxBase.setChecked(-1, hashSet.contains(currentChannel), true);
            updateButton$2();
            return;
        }
        if (view instanceof GroupCreateUserCell) {
            if (this.canSendLink || !((i = this.type) == 11 || i == 34)) {
                GroupCreateUserCell groupCreateUserCell = (GroupCreateUserCell) view;
                Object object = groupCreateUserCell.getObject();
                if (!groupCreateUserCell.premiumBlocked) {
                    if (hashSet.contains(object)) {
                        hashSet.remove(object);
                    } else {
                        hashSet.add(object);
                    }
                    groupCreateUserCell.setChecked(hashSet.contains(object), true);
                    updateButton$2();
                    return;
                }
                if (object instanceof TLRPC.User) {
                    long j = ((TLRPC.User) object).id;
                    int i2 = -this.shiftDp;
                    this.shiftDp = i2;
                    AndroidUtilities.shakeViewSpring(groupCreateUserCell, i2);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    String forcedFirstName = j >= 0 ? UserObject.getForcedFirstName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j))) : "";
                    (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() ? new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName))) : new BulletinFactory((FrameLayout) this.containerView, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName)), new LimitReachedBottomSheet$$ExternalSyntheticLambda2(this, 2), LocaleController.getString(R.string.UserBlockedNonPremiumButton))).show();
                }
            }
        }
    }

    public final void lambda$revokeLinks$25(ArrayList arrayList) {
        lambda$showGiftOfferSheet$15();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
            tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) arrayList.get(i));
            tL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_updateUsername, new LimitReachedBottomSheet$$ExternalSyntheticLambda4(this, 1), 64);
        }
    }

    public final void limitPreviewIncreaseCurrentValue() {
        HeaderView.AnonymousClass2 anonymousClass2 = this.limitPreviewView;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        int i = tL_premium_boostsStatus.boosts;
        int i2 = tL_premium_boostsStatus.current_level_boosts;
        int i3 = tL_premium_boostsStatus.next_level_boosts - i2;
        anonymousClass2.currentValue++;
        anonymousClass2.percent = MathUtils.clamp((i - i2) / i3, 0.0f, 1.0f);
        anonymousClass2.animateIncrease = true;
        anonymousClass2.animateIncreaseWidth = anonymousClass2.width1;
        anonymousClass2.setIconValue(i, true);
        anonymousClass2.limitsContainer.requestLayout();
        anonymousClass2.requestLayout();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    public final boolean onBoostSuccess() {
        String string;
        int i = 3;
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.boostsStatus, this.canApplyBoost.copy(), Long.valueOf(this.dialogId));
        ButtonWithCounterView buttonWithCounterView = this.boostToUnlockGroupBtn;
        if (buttonWithCounterView != null) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-this.dialogId);
            int iMax = Math.max(chatFull.boosts_unrestrict - chatFull.boosts_applied, 0);
            if (iMax == 0) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.groupRestrictionsUnlockedByBoosts, new Object[0]);
                lambda$showGiftOfferSheet$15();
                return false;
            }
            buttonWithCounterView.setCount(iMax, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new VoIPFragment.AnonymousClass23(i));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.headerView, transitionSet);
        HeaderView headerView = this.headerView;
        int iIndexOfChild = headerView.indexOfChild(headerView.description);
        LimitReachedBottomSheet limitReachedBottomSheet = LimitReachedBottomSheet.this;
        if (limitReachedBottomSheet.isCurrentChat) {
            int iIndexOfChild2 = headerView.indexOfChild(headerView.titleLinearLayout);
            headerView.removeView(headerView.titleLinearLayout);
            headerView.titleLinearLayout.removeView(headerView.title);
            LinearLayout linearLayout = headerView.titleLinearLayout;
            BoostCounterView boostCounterView = headerView.boostCounterView;
            linearLayout.removeView(boostCounterView);
            LinearLayout linearLayout2 = new LinearLayout(headerView.getContext());
            headerView.titleLinearLayout = linearLayout2;
            linearLayout2.setOrientation(0);
            headerView.titleLinearLayout.setWeightSum(1.0f);
            headerView.titleLinearLayout.addView(headerView.title, LayoutHelper.createLinear(-2, -2, 1.0f, 0));
            headerView.titleLinearLayout.addView(boostCounterView, LayoutHelper.createLinear(-2, -2, 48, 0, 2, 0, 0));
            headerView.addView(headerView.titleLinearLayout, iIndexOfChild2, LayoutHelper.createLinear(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int iIndexOfChild3 = headerView.indexOfChild(headerView.title);
            headerView.removeView(headerView.title);
            TextView textView = new TextView(headerView.getContext());
            headerView.title = textView;
            textView.setTypeface(AndroidUtilities.bold());
            headerView.title.setTextSize(1, 20.0f);
            headerView.title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, limitReachedBottomSheet.resourcesProvider));
            headerView.title.setGravity(17);
            headerView.addView(headerView.title, iIndexOfChild3, LayoutHelper.createLinear(-2, -2, 1, 0, 22, 0, 0));
        }
        headerView.removeView(headerView.description);
        TextView textView2 = new TextView(headerView.getContext());
        headerView.description = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = headerView.description;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), headerView.description.getLineSpacingMultiplier() * 1.1f);
        headerView.description.setGravity(1);
        headerView.description.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, limitReachedBottomSheet.resourcesProvider));
        headerView.addView(headerView.description, iIndexOfChild, LayoutHelper.createLinear(-2, -2, 1, 24, -2, 24, 17));
        this.headerView.title.setText(getBoostsTitleString());
        TextView textView4 = this.headerView.description;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        boolean zIsGroup = isGroup();
        int i2 = this.type;
        if (i2 == 20) {
            string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(channelColorLevelMin()));
        } else if (i2 == 24) {
            string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(channelColorLevelMin()));
        } else if (i2 == 29) {
            string = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i2 == 30) {
            string = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i2 == 35) {
            string = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i2 == 25) {
            string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(zIsGroup ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i2 == 26) {
            string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(zIsGroup ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i2 == 27) {
            string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i2 == 28) {
            string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(zIsGroup ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
        } else if (i2 == 22) {
            string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(zIsGroup ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
        } else if (i2 == 23) {
            string = LocaleController.formatString(zIsGroup ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(zIsGroup ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
        } else {
            string = null;
        }
        if (string == null) {
            string = getBoostsDescriptionString(false);
        }
        textView4.setText(AndroidUtilities.replaceTags(string));
        updateButton$2();
        FireworksOverlay fireworksOverlay = this.fireworksOverlay;
        fireworksOverlay.start(false);
        try {
            fireworksOverlay.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.headerView.boostCounterView.setCount(this.canApplyBoost.boostCount, true);
        this.recyclerListView.smoothScrollToPosition(0);
        if (i2 == 32) {
            this.headerView.boostCounterView.setVisibility(8);
        }
        return true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    @Override
    public final void onViewCreated(SizeNotifierFrameLayout sizeNotifierFrameLayout) {
        int i;
        Context context = sizeNotifierFrameLayout.getContext();
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, this.resourcesProvider, true);
        this.boostMiniBtn = buttonWithCounterView;
        buttonWithCounterView.setFlickeringLoading(true);
        this.boostMiniBtn.setText(LocaleController.getString(R.string.BoostBtn), false, true);
        this.boostMiniBtn.setOnClickListener(new LimitReachedBottomSheet$$ExternalSyntheticLambda0(this, 3));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, this.resourcesProvider);
        this.premiumButtonView = anonymousClass1;
        ScaleStateListAnimator.apply(anonymousClass1, 0.02f, 1.2f);
        if (!this.hasFixedSize && (i = this.type) != 18 && i != 20 && i != 24 && i != 25 && i != 26 && i != 29 && i != 22 && i != 23 && i != 21 && i != 27 && i != 28 && i != 30 && i != 35) {
            QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(this, context, 13);
            this.divider = anonymousClass2;
            anonymousClass2.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider));
            sizeNotifierFrameLayout.addView(this.divider, LayoutHelper.createFrame(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        AnonymousClass1 anonymousClass3 = this.premiumButtonView;
        float f = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        sizeNotifierFrameLayout.addView(anonymousClass3, LayoutHelper.createFrame(-1, 48.0f, 80, f, 0.0f, f, 12.0f));
        int iDp = AndroidUtilities.dp(72.0f);
        RecyclerListView recyclerListView = this.recyclerListView;
        recyclerListView.setPadding(0, 0, 0, iDp);
        recyclerListView.setClipToPadding(false);
        recyclerListView.setClipChildren(false);
        recyclerListView.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 22));
        recyclerListView.setOnItemLongClickListener(new BoostDialogs$$ExternalSyntheticLambda10(this, 3));
        this.premiumButtonView.buttonLayout.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(5, this, context));
        setOnClickListener(new LimitReachedBottomSheet$$ExternalSyntheticLambda0(this, 1));
        this.enterAnimator = new RecyclerItemsEnterAnimator(recyclerListView, true);
    }

    public final void revokeLinks(ArrayList arrayList) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        String pluralString = LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = pluralString;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.parentIsChannel) {
                alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            } else {
                alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            }
        } else if (this.parentIsChannel) {
            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0]));
        } else {
            alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0]));
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.RevokeButton), new RateCallLayout$$ExternalSyntheticLambda1(9, this, arrayList));
        alertDialog.show();
        TextView textView = (TextView) alertDialog.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold, this.resourcesProvider));
        }
    }

    public final void sendInviteMessages(HashMap map) {
        String str;
        HashMap map2 = map;
        if (TextUtils.isEmpty(this.forceLink)) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.fromChat.id);
            if (chatFull == null) {
                lambda$showGiftOfferSheet$15();
                return;
            }
            if (this.fromChat.username != null) {
                str = "@" + this.fromChat.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                if (tL_chatInviteExported == null) {
                    lambda$showGiftOfferSheet$15();
                    return;
                }
                str = tL_chatInviteExported.link;
            }
        } else {
            str = this.forceLink;
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet<TLRPC.User> hashSet = this.selectedChats;
        for (TLRPC.User user : hashSet) {
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(user.id);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(user.id));
            }
            (sendPaidMessagesStars >= 0 ? arrayList : arrayList2).add(user);
        }
        int i = 0;
        if (map2 == null && !arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                arrayList3.add(Long.valueOf(((TLRPC.User) obj).id));
            }
            AlertsCreator.ensurePaidMessagesMultiConfirmation(this.currentAccount, arrayList3, 1, new DialogCell$$ExternalSyntheticLambda6(this, 26));
            return;
        }
        Iterator it = hashSet.iterator();
        boolean z = false;
        while (it.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it.next();
            long jLongValue = map2 == null ? 0L : ((Long) map2.get(Long.valueOf(user2.id))).longValue();
            SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(str2, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            sendMessageParamsOf.payStars = jLongValue;
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf);
            map2 = map;
            it = it;
            if (sendMessageParamsOf.payStars > 0) {
                z = true;
            }
        }
        if (!z) {
            AndroidUtilities.runOnUIThread(new LimitReachedBottomSheet$$ExternalSyntheticLambda2(this, 3));
        }
        lambda$showGiftOfferSheet$15();
    }

    public final void setRestrictedUsers(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.fromChat = chat;
        this.forceLink = str;
        this.canSendLink = !TextUtils.isEmpty(str) || ChatObject.canUserDoAdminAction(chat, 3);
        this.restrictedUsers = new ArrayList(arrayList);
        this.premiumMessagingBlockedUsers = arrayList2;
        this.premiumInviteBlockedUsers = arrayList3;
        HashSet hashSet = this.selectedChats;
        hashSet.clear();
        if (this.canSendLink) {
            ArrayList arrayList4 = this.restrictedUsers;
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.id))) {
                    hashSet.add(user);
                }
            }
        }
        updateRows$7();
        updateButton$2();
        int i2 = this.type;
        if ((i2 == 11 || i2 == 34) && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            if (((arrayList3 == null || arrayList3.isEmpty()) && (arrayList2 == null || arrayList2.size() < this.restrictedUsers.size())) || arrayList3 == null || arrayList2 == null) {
                return;
            }
            if (!(arrayList3.size() == 1 && arrayList2.size() == 1) && arrayList2.size() < arrayList3.size()) {
                return;
            }
            AnonymousClass1 anonymousClass1 = this.premiumButtonView;
            if (anonymousClass1 != null && anonymousClass1.getParent() != null) {
                ((ViewGroup) this.premiumButtonView.getParent()).removeView(this.premiumButtonView);
            }
            QrActivity.AnonymousClass2 anonymousClass2 = this.divider;
            if (anonymousClass2 != null && anonymousClass2.getParent() != null) {
                ((ViewGroup) this.divider.getParent()).removeView(this.divider);
            }
            RecyclerListView recyclerListView = this.recyclerListView;
            if (recyclerListView != null) {
                recyclerListView.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void setupBoostFeatures() {
        this.boostFeatures = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        int i = tL_premium_boostsStatus != null ? tL_premium_boostsStatus.level + 1 : 1;
        if (this.type == 31) {
            i = 1;
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        ArrayList arrayList = null;
        int iMax = 10;
        if (messagesController != null) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            int iMax2 = Math.max(10, peerColors != null ? peerColors.maxLevel(isGroup()) : 0);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            int iMax3 = Math.max(iMax2, peerColors2 != null ? peerColors2.maxLevel(isGroup()) : 0);
            iMax = isGroup() ? Math.max(Math.max(Math.max(Math.max(Math.max(iMax3, messagesController.groupTranscribeLevelMin), messagesController.groupWallpaperLevelMin), messagesController.groupCustomWallpaperLevelMin), messagesController.groupEmojiStatusLevelMin), messagesController.groupProfileBgIconLevelMin) : Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(iMax3, messagesController.channelBgIconLevelMin), messagesController.channelProfileIconLevelMin), messagesController.channelEmojiStatusLevelMin), messagesController.channelWallpaperLevelMin), messagesController.channelCustomWallpaperLevelMin), messagesController.channelRestrictSponsoredLevelMin), messagesController.channelAutotranslationLevelMin);
        }
        for (int i2 = i; i2 <= iMax; i2++) {
            boolean zIsGroup = isGroup();
            ArrayList arrayList2 = new ArrayList();
            MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
            if (messagesController2 != null) {
                if (!zIsGroup && i2 >= messagesController2.channelAutotranslationLevelMin) {
                    arrayList2.add(BoostFeature.of(R.drawable.menu_feature_translate, R.string.BoostFeatureAutotranslation));
                }
                BoostFeature boostFeature = new BoostFeature(R.drawable.menu_feature_stories, -1, i2, null, "BoostFeatureStoriesPerDay");
                boostFeature.incremental = true;
                arrayList2.add(boostFeature);
                if (!zIsGroup) {
                    BoostFeature boostFeature2 = new BoostFeature(R.drawable.menu_feature_reactions, -1, i2, null, "BoostFeatureCustomReaction");
                    boostFeature2.incremental = true;
                    arrayList2.add(boostFeature2);
                }
                MessagesController.PeerColors peerColors3 = messagesController2.peerColors;
                int iColorsAvailable = peerColors3 != null ? peerColors3.colorsAvailable(i2, false) : 0;
                MessagesController.PeerColors peerColors4 = messagesController2.profilePeerColors;
                int iColorsAvailable2 = peerColors4 != null ? peerColors4.colorsAvailable(i2, zIsGroup) : 0;
                if (!zIsGroup && iColorsAvailable > 0) {
                    arrayList2.add(new BoostFeature(R.drawable.menu_feature_color_name, -1, 7, null, "BoostFeatureNameColor"));
                }
                if (!zIsGroup && iColorsAvailable > 0) {
                    arrayList2.add(new BoostFeature(R.drawable.menu_feature_links, -1, iColorsAvailable, null, "BoostFeatureReplyColor"));
                }
                if (!zIsGroup && i2 >= messagesController2.channelBgIconLevelMin) {
                    arrayList2.add(BoostFeature.of(R.drawable.menu_feature_links2, R.string.BoostFeatureReplyIcon));
                }
                if (iColorsAvailable2 > 0) {
                    arrayList2.add(new BoostFeature(R.drawable.menu_feature_color_profile, -1, iColorsAvailable2, null, zIsGroup ? "BoostFeatureProfileColorGroup" : "BoostFeatureProfileColor"));
                }
                if (zIsGroup && i2 >= messagesController2.groupEmojiStickersLevelMin) {
                    arrayList2.add(BoostFeature.of(R.drawable.menu_feature_pack, R.string.BoostFeatureCustomEmojiPack));
                }
                if ((!zIsGroup && i2 >= messagesController2.channelProfileIconLevelMin) || (zIsGroup && i2 >= messagesController2.groupProfileBgIconLevelMin)) {
                    arrayList2.add(BoostFeature.of(R.drawable.menu_feature_cover, zIsGroup ? R.string.BoostFeatureProfileIconGroup : R.string.BoostFeatureProfileIcon));
                }
                if (zIsGroup && i2 >= messagesController2.groupTranscribeLevelMin) {
                    arrayList2.add(BoostFeature.of(R.drawable.menu_feature_voice, R.string.BoostFeatureVoiceToTextConversion));
                }
                if ((!zIsGroup && i2 >= messagesController2.channelEmojiStatusLevelMin) || (zIsGroup && i2 >= messagesController2.groupEmojiStatusLevelMin)) {
                    arrayList2.add(new BoostFeature(R.drawable.menu_feature_status, R.string.BoostFeatureEmojiStatuses, -1, "1000+", null));
                }
                if ((!zIsGroup && i2 >= messagesController2.channelWallpaperLevelMin) || (zIsGroup && i2 >= messagesController2.groupWallpaperLevelMin)) {
                    arrayList2.add(new BoostFeature(R.drawable.menu_feature_wallpaper, -1, 8, null, zIsGroup ? "BoostFeatureBackgroundGroup" : "BoostFeatureBackground"));
                }
                if ((!zIsGroup && i2 >= messagesController2.channelCustomWallpaperLevelMin) || (zIsGroup && i2 >= messagesController2.groupCustomWallpaperLevelMin)) {
                    arrayList2.add(BoostFeature.of(R.drawable.menu_feature_custombg, zIsGroup ? R.string.BoostFeatureCustomBackgroundGroup : R.string.BoostFeatureCustomBackground));
                }
                if (!zIsGroup && i2 >= messagesController2.channelRestrictSponsoredLevelMin) {
                    arrayList2.add(BoostFeature.of(R.drawable.menu_feature_noads, R.string.BoostFeatureSwitchOffAds));
                }
                Collections.reverse(arrayList2);
            }
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    BoostFeature boostFeature3 = (BoostFeature) arrayList.get(i3);
                    BoostFeature boostFeature4 = (BoostFeature) arrayList2.get(i3);
                    if (boostFeature4 == null) {
                        boostFeature3.getClass();
                    } else {
                        boolean z = boostFeature3.incremental;
                        int i4 = boostFeature3.countPlural;
                        if ((z && i4 > 2) || (boostFeature3.iconResId == boostFeature4.iconResId && boostFeature3.textKey == boostFeature4.textKey && TextUtils.equals(boostFeature3.countValue, boostFeature4.countValue) && TextUtils.equals(boostFeature3.textKeyPlural, boostFeature4.textKeyPlural) && i4 == boostFeature4.countPlural)) {
                        }
                    }
                    ArrayList arrayList3 = this.boostFeatures;
                    arrayList3.add(new BoostFeature.BoostFeatureLevel(i2, arrayList3.isEmpty()));
                    this.boostFeatures.addAll(arrayList2);
                    arrayList = arrayList2;
                    break;
                }
            }
            ArrayList arrayList4 = this.boostFeatures;
            arrayList4.add(new BoostFeature.BoostFeatureLevel(i2, arrayList4.isEmpty()));
            this.boostFeatures.addAll(arrayList2);
            arrayList = arrayList2;
            break;
        }
    }

    public final void updateButton$2() {
        if (this.premiumButtonSetSubscribe) {
            this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i = this.type;
        if (i != 19 && i != 32 && !isMiniBoostBtnForAdminAvailable()) {
            HashSet hashSet = this.selectedChats;
            String pluralString = null;
            if (i != 11 && i != 34) {
                if (hashSet.size() <= 0) {
                    AnonymousClass1 anonymousClass1 = this.premiumButtonView;
                    anonymousClass1.showOverlay = false;
                    anonymousClass1.updateOverlay(true);
                    return;
                } else {
                    if (i == 2) {
                        pluralString = LocaleController.formatPluralString("RevokeLinks", hashSet.size(), new Object[0]);
                    } else if (i == 5) {
                        pluralString = LocaleController.formatPluralString("LeaveCommunities", hashSet.size(), new Object[0]);
                    }
                    this.premiumButtonView.setOverlayText(pluralString, true, true);
                    return;
                }
            }
            AnonymousClass1 anonymousClass2 = this.premiumButtonView;
            if (anonymousClass2.counterView == null) {
                CounterView counterView = new CounterView(anonymousClass2.getContext(), null);
                anonymousClass2.counterView = counterView;
                counterView.setGravity(3);
                CounterView counterView2 = anonymousClass2.counterView;
                int i2 = Theme.key_featuredStickers_addButton;
                int i3 = Theme.key_featuredStickers_buttonText;
                CounterView.CounterDrawable counterDrawable = counterView2.counterDrawable;
                counterDrawable.textColorKey = i2;
                counterDrawable.circleColorKey = i3;
                counterDrawable.circleScale = 0.8f;
                anonymousClass2.setClipChildren(false);
                anonymousClass2.addView(anonymousClass2.counterView, LayoutHelper.createFrame(-1, 24, 16));
            }
            if (!this.canSendLink) {
                this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.Close), true, true);
            } else if (hashSet.size() > 0) {
                this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.SendInviteLink), true, true);
            } else {
                this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.ActionSkip), true, true);
            }
            this.premiumButtonView.counterView.counterDrawable.setCount(hashSet.size(), true);
            this.premiumButtonView.invalidate();
            return;
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
        boolean z = canApplyBoost.canApply;
        if ((z || canApplyBoost.empty) && !canApplyBoost.boostedNow && !canApplyBoost.alreadyActive) {
            if (canApplyBoost.isMaxLvl) {
                this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.OK), true, true);
                return;
            }
            AnonymousClass1 anonymousClass3 = this.premiumButtonView;
            anonymousClass3.showOverlay = false;
            anonymousClass3.updateOverlay(true);
            return;
        }
        ButtonWithCounterView buttonWithCounterView = this.boostToUnlockGroupBtn;
        if (z) {
            if (BoostRepository.isMultiBoostsAvailable()) {
                this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            } else {
                this.premiumButtonView.setOverlayText(LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel), true, true);
            }
            this.boostMiniBtn.setText(LocaleController.getString(R.string.BoostBtn), true, true);
            if (buttonWithCounterView != null) {
                buttonWithCounterView.setText(LocaleController.getString(R.string.BoostGroup), true, true);
                return;
            }
            return;
        }
        if (canApplyBoost.isMaxLvl) {
            ButtonWithCounterView buttonWithCounterView2 = this.boostMiniBtn;
            int i4 = R.string.OK;
            buttonWithCounterView2.setText(LocaleController.getString(i4), true, true);
            if (buttonWithCounterView != null) {
                buttonWithCounterView.setText(LocaleController.getString(i4), true, true);
            }
            this.premiumButtonView.setOverlayText(LocaleController.getString(i4), true, true);
            return;
        }
        if (BoostRepository.isMultiBoostsAvailable()) {
            if (buttonWithCounterView != null) {
                buttonWithCounterView.setText(LocaleController.getString(R.string.BoostGroup), true, true);
            }
            this.boostMiniBtn.setText(LocaleController.getString(R.string.BoostBtn), true, true);
            this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            return;
        }
        if (buttonWithCounterView != null) {
            buttonWithCounterView.setText(LocaleController.getString(R.string.OK), true, true);
        }
        ButtonWithCounterView buttonWithCounterView3 = this.boostMiniBtn;
        int i5 = R.string.OK;
        buttonWithCounterView3.setText(LocaleController.getString(i5), true, true);
        this.premiumButtonView.setOverlayText(LocaleController.getString(i5), true, true);
    }

    public final void updatePremiumButtonText() {
        String string;
        if (this.premiumButtonSetSubscribe) {
            this.premiumButtonView.setOverlayText(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i = this.type;
        if (i == 19 || i == 32 || isMiniBoostBtnForAdminAvailable()) {
            if (!BoostRepository.isMultiBoostsAvailable()) {
                setText(LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel));
                return;
            }
            PremiumButtonView.AnonymousClass1 anonymousClass1 = this.premiumButtonView.buttonTextView;
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.canApplyBoost;
            if (canApplyBoost == null || !canApplyBoost.alreadyActive) {
                string = LocaleController.getString(isGroup() ? R.string.BoostGroup : R.string.BoostChannel);
            } else {
                string = LocaleController.getString(R.string.BoostingBoostAgain);
            }
            anonymousClass1.setText(string);
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.canApplyBoost;
            if (canApplyBoost2 == null || !canApplyBoost2.isMaxLvl) {
                return;
            }
            setText(LocaleController.getString(R.string.OK));
            return;
        }
        if (i == 18 || i == 20 || i == 24 || i == 25 || i == 26 || i == 29 || i == 22 || i == 23 || i == 21 || i == 27 || i == 28 || i == 30 || i == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_copy_filled), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            setText(spannableStringBuilder);
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.isVeryLargeFile) {
            setText(LocaleController.getString(R.string.OK));
            AnonymousClass1 anonymousClass2 = this.premiumButtonView;
            anonymousClass2.flickerDrawable.onRestartCallback = null;
            anonymousClass2.iconView.setVisibility(8);
            return;
        }
        setText(LocaleController.getString(R.string.IncreaseLimit));
        Palette.Builder builder = this.limitParams;
        if (builder == null) {
            AnonymousClass1 anonymousClass3 = this.premiumButtonView;
            anonymousClass3.flickerDrawable.onRestartCallback = null;
            anonymousClass3.iconView.setVisibility(8);
            return;
        }
        int i2 = builder.mResizeArea;
        int i3 = i2 + 1;
        int i4 = builder.mResizeMaxDimension;
        if (i3 == i4) {
            this.premiumButtonView.setIcon(R.raw.addone_icon);
            return;
        }
        if (i2 != 0 && i4 != 0) {
            float f = i4 / i2;
            if (f >= 1.6f && f <= 2.5f) {
                this.premiumButtonView.setIcon(R.raw.double_icon);
                return;
            }
        }
        AnonymousClass1 anonymousClass4 = this.premiumButtonView;
        anonymousClass4.flickerDrawable.onRestartCallback = null;
        anonymousClass4.iconView.setVisibility(8);
    }

    public final void updateRows$7() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.dividerRow = -1;
        this.chatStartRow = -1;
        this.chatEndRow = -1;
        this.loadingRow = -1;
        this.linkRow = -1;
        this.emptyViewDividerRow = -1;
        this.boostFeaturesStartRow = -1;
        this.rowCount = 1;
        this.headerRow = 0;
        int i = this.type;
        if (i == 19 || i == 18 || i == 20 || i == 24 || i == 27 || i == 28 || i == 22 || i == 23 || i == 25 || i == 26 || i == 29 || i == 21 || i == 30 || i == 35) {
            if (i != 19 || ChatObject.hasAdminRights(getChat$1$1())) {
                this.topPadding = 0.24f;
                int i2 = this.rowCount;
                this.rowCount = i2 + 1;
                this.linkRow = i2;
                if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable) {
                    int i3 = this.rowCount;
                    this.rowCount = i3 + 1;
                    this.bottomRow = i3;
                }
            }
            setupBoostFeatures();
            int i4 = this.rowCount;
            int i5 = i4 + 1;
            this.rowCount = i5;
            this.boostFeaturesStartRow = i4;
            this.rowCount = (this.boostFeatures.size() - 1) + i5;
        } else if (i == 31 || i == 32) {
            this.topPadding = 0.24f;
            setupBoostFeatures();
            int i6 = this.rowCount;
            this.chatStartRow = i6;
            int i7 = i6 + 1;
            this.rowCount = i7;
            this.boostFeaturesStartRow = i6;
            int size = (this.boostFeatures.size() - 1) + i7;
            this.rowCount = size;
            this.chatEndRow = size;
        } else if (!hasFixedSize(i)) {
            if (i == 11 || i == 34) {
                this.topPadding = 0.24f;
            } else {
                int i8 = this.rowCount;
                this.dividerRow = i8;
                this.rowCount = i8 + 2;
                this.chatsTitleRow = i8 + 1;
            }
            if (this.loading) {
                int i9 = this.rowCount;
                this.rowCount = i9 + 1;
                this.loadingRow = i9;
            } else if (i != 11 || this.canSendLink) {
                if (i != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((((arrayList = this.premiumInviteBlockedUsers) == null || arrayList.isEmpty()) && ((arrayList2 = this.premiumMessagingBlockedUsers) == null || arrayList2.size() < this.restrictedUsers.size())) || (arrayList3 = this.premiumInviteBlockedUsers) == null || arrayList3.size() != 1 || (arrayList4 = this.premiumMessagingBlockedUsers) == null || arrayList4.size() != 1 || !this.canSendLink)) {
                    int i10 = this.rowCount;
                    this.chatStartRow = i10;
                    if (i == 11 || i == 34) {
                        this.rowCount = this.restrictedUsers.size() + i10;
                    } else if (i == 5) {
                        this.rowCount = this.inactiveChats.size() + i10;
                    } else {
                        this.rowCount = this.chats.size() + i10;
                    }
                    this.chatEndRow = this.rowCount;
                }
                if (this.chatEndRow - this.chatStartRow > 1) {
                    int i11 = this.rowCount;
                    this.rowCount = i11 + 1;
                    this.emptyViewDividerRow = i11;
                }
            }
        }
        this.recyclerListView.getAdapter().notifyDataSetChanged();
    }
}
