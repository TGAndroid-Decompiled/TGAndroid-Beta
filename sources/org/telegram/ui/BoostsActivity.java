package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzkq;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.FixedHeightEmptyCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Charts.view_data.ChartHeaderView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkActionView;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostDialogs;
import org.telegram.ui.Components.Premium.boosts.BoostPagerBottomSheet;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.Premium.boosts.cells.statistics.GiftedUserCell;
import org.telegram.ui.Components.Premium.boosts.cells.statistics.GiveawayCell;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Stars.StarsIntroActivity;

public final class BoostsActivity extends GradientHeaderActivity implements NotificationCenter.NotificationCenterDelegate {
    public final AnonymousClass1 adapter;
    public final ArrayList boosters;
    public TL_stories.TL_premium_boostsStatus boostsStatus;
    public ScrollSlidingTextTabStrip boostsTabs;
    public ChannelBoostsController.CanApplyBoost canApplyBoost;
    public final int currentAccount;
    public final TLRPC.Chat currentChat;
    public final long dialogId;
    public final ArrayList gifts;
    public boolean hasBoostsNext;
    public boolean hasGiftsNext;
    public final ArrayList items;
    public String lastBoostsOffset;
    public String lastGiftsOffset;
    public int limitBoosts;
    public int limitGifts;
    public LimitPreviewView limitPreviewView;
    public int nextBoostRemaining;
    public int nextGiftsRemaining;
    public LinearLayout progressLayout;
    public int selectedTab;
    public int totalBoosts;
    public int totalGifts;
    public boolean usersLoading;

    public final class AnonymousClass1 extends AdapterWithDiffUtils {

        public final class AnonymousClass5 extends ManageChatTextCell {
            @Override
            public final int getFullHeight() {
                return AndroidUtilities.dp(50.0f);
            }
        }

        public AnonymousClass1() {
        }

        @Override
        public final int getItemCount() {
            return BoostsActivity.this.items.size();
        }

        @Override
        public final int getItemViewType(int i) {
            return ((ItemInternal) BoostsActivity.this.items.get(i)).viewType;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return ((ItemInternal) BoostsActivity.this.items.get(viewHolder.getAdapterPosition())).selectable;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            int i3;
            int i4 = viewHolder.mItemViewType;
            if (i4 == 4 || i4 == 14 || i4 == 15) {
                return;
            }
            BoostsActivity boostsActivity = BoostsActivity.this;
            View view = viewHolder.itemView;
            if (i4 == 1 || i4 == 12 || i4 == 16) {
                ChartHeaderView chartHeaderView = (ChartHeaderView) view;
                chartHeaderView.setTitle(((ItemInternal) boostsActivity.items.get(i)).title);
                chartHeaderView.showDate(false);
                if (viewHolder.mItemViewType == 12) {
                    chartHeaderView.setPadding(AndroidUtilities.dp(3.0f), chartHeaderView.getPaddingTop(), chartHeaderView.getPaddingRight(), chartHeaderView.getPaddingBottom());
                    return;
                }
                return;
            }
            if (i4 == 0) {
                StatisticActivity.OverviewCell overviewCell = (StatisticActivity.OverviewCell) view;
                overviewCell.setData(Integer.toString(boostsActivity.boostsStatus.level), 0, null, LocaleController.getString(R.string.BoostsLevel2));
                TL_stats.TL_statsPercentValue tL_statsPercentValue = boostsActivity.boostsStatus.premium_audience;
                TLRPC.Chat chat = boostsActivity.currentChat;
                if (tL_statsPercentValue != null) {
                    double d = tL_statsPercentValue.total;
                    if (d != 0.0d) {
                        overviewCell.setData("≈" + ((int) boostsActivity.boostsStatus.premium_audience.part), 1, String.format(Locale.US, "%.1f", Float.valueOf((((float) tL_statsPercentValue.part) / ((float) d)) * 100.0f)).concat("%"), LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.PremiumSubscribers : R.string.PremiumMembers));
                    } else {
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            i3 = R.string.PremiumSubscribers;
                        } else {
                            i3 = R.string.PremiumMembers;
                        }
                        overviewCell.setData("~0", 1, "0%", LocaleController.getString(i3));
                    }
                } else {
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        i3 = R.string.PremiumSubscribers;
                    } else {
                        i3 = R.string.PremiumMembers;
                    }
                    overviewCell.setData("~0", 1, "0%", LocaleController.getString(i3));
                }
                overviewCell.setData(String.valueOf(boostsActivity.boostsStatus.boosts), 2, null, LocaleController.getString(R.string.BoostsExisting));
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = boostsActivity.boostsStatus;
                overviewCell.setData(String.valueOf(Math.max(0, tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.boosts)), 3, null, LocaleController.getString(R.string.BoostsToLevel));
                overviewCell.setPadding(AndroidUtilities.dp(23.0f), overviewCell.getPaddingTop(), AndroidUtilities.dp(23.0f), overviewCell.getPaddingBottom());
                return;
            }
            if (i4 == 5) {
                TL_stories.Boost boost = ((ItemInternal) boostsActivity.items.get(i)).booster;
                TLRPC.User user = MessagesController.getInstance(boostsActivity.currentAccount).getUser(Long.valueOf(boost.user_id));
                GiftedUserCell giftedUserCell = (GiftedUserCell) view;
                giftedUserCell.setData(user, ContactsController.formatName(user), boost.multiplier > 1 ? LocaleController.formatString("BoostsExpireOn", R.string.BoostsExpireOn, LocaleController.formatDate(boost.expires)) : LocaleController.formatString("BoostExpireOn", R.string.BoostExpireOn, LocaleController.formatDate(boost.expires)), !((ItemInternal) boostsActivity.items.get(i)).isLast);
                giftedUserCell.setStatus(boost);
                giftedUserCell.setAvatarPadding(5);
                return;
            }
            if (i4 == 6) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                textInfoPrivacyCell.setText(((ItemInternal) boostsActivity.items.get(i)).title);
                textInfoPrivacyCell.setTextColor(Theme.multAlpha(0.875f, -1));
                return;
            }
            if (i4 == 9) {
                ManageChatTextCell manageChatTextCell = (ManageChatTextCell) view;
                if (boostsActivity.selectedTab == 0) {
                    manageChatTextCell.setText(LocaleController.formatPluralString("BoostingShowMoreBoosts", boostsActivity.nextBoostRemaining, new Object[0]), R.drawable.arrow_more, 5, false);
                    return;
                } else {
                    manageChatTextCell.setText(LocaleController.formatPluralString("BoostingShowMoreGifts", boostsActivity.nextGiftsRemaining, new Object[0]), R.drawable.arrow_more, 5, false);
                    return;
                }
            }
            if (i4 == 3) {
                ((LinkActionView) view).setLink(((ItemInternal) boostsActivity.items.get(i)).title);
                return;
            }
            if (i4 == 11) {
                ItemInternal itemInternal = (ItemInternal) boostsActivity.items.get(i);
                TL_stories.PrepaidGiveaway prepaidGiveaway = itemInternal.prepaidGiveaway;
                GiveawayCell giveawayCell = (GiveawayCell) view;
                boolean z = prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway;
                boolean z2 = itemInternal.isLast;
                if (z) {
                    giveawayCell.setData(prepaidGiveaway, LocaleController.formatPluralString("BoostingTelegramPremiumCountPlural", prepaidGiveaway.quantity, new Object[0]), LocaleController.formatPluralString("BoostingSubscriptionsCountPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("PrepaidGiveawayMonths", ((TL_stories.TL_prepaidGiveaway) prepaidGiveaway).months, new Object[0])), !z2);
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                    giveawayCell.setData(prepaidGiveaway, LocaleController.formatPluralStringComma("BoostingStarsCountPlural", (int) tL_prepaidStarsGiveaway.stars), LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]), !z2);
                }
                giveawayCell.setImage(prepaidGiveaway);
                giveawayCell.setAvatarPadding(5);
                return;
            }
            if (i4 == 13) {
                if (boostsActivity.boostsTabs.getTag() == null || ((Integer) boostsActivity.boostsTabs.getTag()).intValue() != Objects.hash(Integer.valueOf(boostsActivity.totalBoosts), Integer.valueOf(boostsActivity.totalGifts))) {
                    boostsActivity.boostsTabs.setTag(Integer.valueOf(Objects.hash(Integer.valueOf(boostsActivity.totalBoosts), Integer.valueOf(boostsActivity.totalGifts))));
                    boostsActivity.boostsTabs.removeTabs();
                    boostsActivity.boostsTabs.addTextTab(0, LocaleController.formatPluralString("BoostingBoostsCount", boostsActivity.totalBoosts, new Object[0]), null);
                    if (MessagesController.getInstance(boostsActivity.currentAccount).giveawayGiftsPurchaseAvailable && (i2 = boostsActivity.totalGifts) > 0 && i2 != boostsActivity.totalBoosts) {
                        boostsActivity.boostsTabs.addTextTab(1, LocaleController.formatPluralString("BoostingGiftsCount", i2, new Object[0]), null);
                    }
                    boostsActivity.boostsTabs.setInitialTabId(boostsActivity.selectedTab);
                    boostsActivity.boostsTabs.finishAddingTabs();
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View overviewCell;
            View giftedUserCell;
            BoostsActivity boostsActivity = BoostsActivity.this;
            switch (i) {
                case 0:
                    overviewCell = new StatisticActivity.OverviewCell(boostsActivity.getParentActivity(), 2);
                    giftedUserCell = overviewCell;
                    return zzkl.m(giftedUserCell, giftedUserCell);
                case 1:
                case 16:
                    overviewCell = new ChartHeaderView(boostsActivity.getParentActivity(), null);
                    overviewCell.setPadding(overviewCell.getPaddingLeft(), AndroidUtilities.dp(16.0f), overviewCell.getRight(), AndroidUtilities.dp(16.0f));
                    giftedUserCell = overviewCell;
                    return zzkl.m(giftedUserCell, giftedUserCell);
                case 2:
                    overviewCell = new ShadowSectionCell(viewGroup.getContext(), 0, 0);
                    giftedUserCell = overviewCell;
                    return zzkl.m(giftedUserCell, giftedUserCell);
                case 3:
                    LinkActionView linkActionView = new LinkActionView(boostsActivity.getParentActivity(), BoostsActivity.this, null, false, false);
                    linkActionView.optionsView.setVisibility(8);
                    linkActionView.linkView.setGravity(17);
                    linkActionView.removeView.setVisibility(8);
                    linkActionView.avatarsContainer.setVisibility(8);
                    linkActionView.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), AndroidUtilities.dp(24.0f));
                    giftedUserCell = linkActionView;
                    return zzkl.m(giftedUserCell, giftedUserCell);
                case 4:
                default:
                    throw new UnsupportedOperationException();
                case 5:
                    giftedUserCell = new GiftedUserCell(boostsActivity.getParentActivity());
                    return zzkl.m(giftedUserCell, giftedUserCell);
                case 6:
                    overviewCell = new TextInfoPrivacyCell(viewGroup.getContext(), 20, ((BaseFragment) boostsActivity).resourceProvider);
                    giftedUserCell = overviewCell;
                    return zzkl.m(giftedUserCell, giftedUserCell);
                case 7:
                    giftedUserCell = new FixedHeightEmptyCell(boostsActivity.getParentActivity(), 8);
                    return zzkl.m(giftedUserCell, giftedUserCell);
                case 8:
                    PhotoViewer.AnonymousClass19 anonymousClass19 = new PhotoViewer.AnonymousClass19(boostsActivity.getParentActivity(), 4);
                    TextView textView = new TextView(boostsActivity.getParentActivity());
                    zzkq.m(14.0f, ChatObject.isChannelAndNotMegaGroup(boostsActivity.currentChat) ? R.string.NoBoostersHint : R.string.NoBoostersGroupHint, textView);
                    zzkr.m(Theme.key_windowBackgroundWhiteGrayText, textView, 17);
                    anonymousClass19.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 16.0f, 0.0f, 0.0f));
                    giftedUserCell = anonymousClass19;
                    return zzkl.m(giftedUserCell, giftedUserCell);
                case 9:
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(boostsActivity.getParentActivity());
                    anonymousClass5.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    giftedUserCell = anonymousClass5;
                    return zzkl.m(giftedUserCell, giftedUserCell);
                case 10:
                    TextCell textCell = new TextCell(boostsActivity.getParentActivity());
                    textCell.setTextAndIcon(R.drawable.msg_gift_premium, (CharSequence) LocaleController.formatString(R.string.BoostingGetBoostsViaGifts, new Object[0]), false);
                    textCell.offsetFromImage = 64;
                    int i2 = Theme.key_windowBackgroundWhiteBlueText4;
                    textCell.setColors(i2, i2);
                    giftedUserCell = textCell;
                    return zzkl.m(giftedUserCell, giftedUserCell);
                case 11:
                    giftedUserCell = new GiveawayCell(boostsActivity.getParentActivity());
                    return zzkl.m(giftedUserCell, giftedUserCell);
                case 12:
                    ChartHeaderView chartHeaderView = new ChartHeaderView(boostsActivity.getParentActivity(), null);
                    chartHeaderView.setPadding(chartHeaderView.getPaddingLeft(), AndroidUtilities.dp(16.0f), chartHeaderView.getRight(), AndroidUtilities.dp(8.0f));
                    giftedUserCell = chartHeaderView;
                    return zzkl.m(giftedUserCell, giftedUserCell);
                case 13:
                    ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(boostsActivity.getParentActivity(), ((BaseFragment) boostsActivity).resourceProvider);
                    boostsActivity.boostsTabs = scrollSlidingTextTabStrip;
                    int i3 = Theme.key_profile_tabSelectedText;
                    int i4 = Theme.key_profile_tabText;
                    scrollSlidingTextTabStrip.activeTextColorKey = i3;
                    scrollSlidingTextTabStrip.unactiveTextColorKey = i4;
                    scrollSlidingTextTabStrip.updateColors$1();
                    IntroActivity.AnonymousClass1 anonymousClass1 = new IntroActivity.AnonymousClass1(this, boostsActivity.getParentActivity());
                    boostsActivity.boostsTabs.setDelegate(new PhotoViewer.AnonymousClass18(this, 11));
                    anonymousClass1.addView(boostsActivity.boostsTabs, LayoutHelper.createFrame(48.0f, -2));
                    giftedUserCell = anonymousClass1;
                    return zzkl.m(giftedUserCell, giftedUserCell);
                case 14:
                    overviewCell = new QrActivity.AnonymousClass2(boostsActivity, boostsActivity.getParentActivity(), 21);
                    overviewCell.setTag(-33024);
                    giftedUserCell = overviewCell;
                    return zzkl.m(giftedUserCell, giftedUserCell);
                case 15:
                    QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(this, boostsActivity.getParentActivity(), 3);
                    anonymousClass2.setTag(-33024);
                    giftedUserCell = anonymousClass2;
                    return zzkl.m(giftedUserCell, giftedUserCell);
            }
        }
    }

    public final class AnonymousClass4 extends FrameLayout {
    }

    public final class AnonymousClass5 extends FrameLayout {
        public AnonymousClass5(Activity activity) {
            super(activity);
            setWillNotDraw(false);
            ThemePreviewActivity.AnonymousClass14 anonymousClass14 = new ThemePreviewActivity.AnonymousClass14(BoostsActivity.this, getContext());
            ThemePreviewActivity.AnonymousClass14 anonymousClass15 = new ThemePreviewActivity.AnonymousClass14(BoostsActivity.this, getContext());
            ThemePreviewActivity.AnonymousClass14 anonymousClass16 = new ThemePreviewActivity.AnonymousClass14(BoostsActivity.this, getContext());
            String string = LocaleController.getString(R.string.BoostBtn);
            int i = R.drawable.filled_boost_plus;
            ((TextView) anonymousClass14.dimPaint).setText(string);
            ((ImageView) anonymousClass14.shadowPaint).setImageDrawable(anonymousClass14.getContext().getDrawable(i));
            String string2 = LocaleController.getString(R.string.GiveawayBtn);
            int i2 = R.drawable.filled_gift_premium;
            ((TextView) anonymousClass15.dimPaint).setText(string2);
            ((ImageView) anonymousClass15.shadowPaint).setImageDrawable(anonymousClass15.getContext().getDrawable(i2));
            String string3 = LocaleController.getString(R.string.FeaturesBtn);
            int i3 = R.drawable.filled_info;
            ((TextView) anonymousClass16.dimPaint).setText(string3);
            ((ImageView) anonymousClass16.shadowPaint).setImageDrawable(anonymousClass16.getContext().getDrawable(i3));
            final int i4 = 0;
            anonymousClass14.setOnClickListener(new View.OnClickListener(this) {
                public final BoostsActivity.AnonymousClass5 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    BoostsActivity.AnonymousClass5 anonymousClass5 = this.f$0;
                    int i5 = 1;
                    switch (i4) {
                        case 0:
                            BoostsActivity boostsActivity = BoostsActivity.this;
                            long j = boostsActivity.dialogId;
                            ChannelBoostsController.CanApplyBoost canApplyBoost = boostsActivity.canApplyBoost;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = boostsActivity.boostsStatus;
                            int i6 = LimitReachedBottomSheet.$r8$clinit;
                            if (canApplyBoost != null && tL_premium_boostsStatus != null && boostsActivity.getParentActivity() != null) {
                                LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(19, boostsActivity.getCurrentAccount(), boostsActivity.getParentActivity(), boostsActivity, boostsActivity.getResourceProvider());
                                limitReachedBottomSheet.canApplyBoost = canApplyBoost;
                                limitReachedBottomSheet.updateButton$2();
                                limitReachedBottomSheet.updatePremiumButtonText();
                                limitReachedBottomSheet.boostsStatus = tL_premium_boostsStatus;
                                limitReachedBottomSheet.isCurrentChat = true;
                                limitReachedBottomSheet.updateRows$7();
                                limitReachedBottomSheet.dialogId = j;
                                limitReachedBottomSheet.updateRows$7();
                                limitReachedBottomSheet.chatMessageCell = null;
                                boostsActivity.showDialog(limitReachedBottomSheet);
                                break;
                            }
                            break;
                        case 1:
                            BoostsActivity boostsActivity2 = BoostsActivity.this;
                            if (true != boostsActivity2.isDialogVisible) {
                                boostsActivity2.isDialogVisible = true;
                                boostsActivity2.particlesView.setPaused(true);
                                boostsActivity2.contentView.invalidate();
                            }
                            BoostPagerBottomSheet.show(boostsActivity2, ((BaseFragment) boostsActivity2).resourceProvider, boostsActivity2.dialogId, null);
                            BoostPagerBottomSheet.instance.setOnHideListener(new OAuthSheet$$ExternalSyntheticLambda11(anonymousClass5, i5));
                            break;
                        default:
                            anonymousClass5.getClass();
                            Context context = anonymousClass5.getContext();
                            BoostsActivity boostsActivity3 = BoostsActivity.this;
                            LimitReachedBottomSheet limitReachedBottomSheet2 = new LimitReachedBottomSheet(31, boostsActivity3.currentAccount, context, BoostsActivity.this, boostsActivity3.getResourceProvider());
                            limitReachedBottomSheet2.boostsStatus = boostsActivity3.boostsStatus;
                            limitReachedBottomSheet2.isCurrentChat = true;
                            limitReachedBottomSheet2.updateRows$7();
                            limitReachedBottomSheet2.dialogId = boostsActivity3.dialogId;
                            limitReachedBottomSheet2.updateRows$7();
                            boostsActivity3.showDialog(limitReachedBottomSheet2);
                            break;
                    }
                }
            });
            final int i5 = 1;
            anonymousClass15.setOnClickListener(new View.OnClickListener(this) {
                public final BoostsActivity.AnonymousClass5 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    BoostsActivity.AnonymousClass5 anonymousClass5 = this.f$0;
                    int i6 = 1;
                    switch (i5) {
                        case 0:
                            BoostsActivity boostsActivity = BoostsActivity.this;
                            long j = boostsActivity.dialogId;
                            ChannelBoostsController.CanApplyBoost canApplyBoost = boostsActivity.canApplyBoost;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = boostsActivity.boostsStatus;
                            int i7 = LimitReachedBottomSheet.$r8$clinit;
                            if (canApplyBoost != null && tL_premium_boostsStatus != null && boostsActivity.getParentActivity() != null) {
                                LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(19, boostsActivity.getCurrentAccount(), boostsActivity.getParentActivity(), boostsActivity, boostsActivity.getResourceProvider());
                                limitReachedBottomSheet.canApplyBoost = canApplyBoost;
                                limitReachedBottomSheet.updateButton$2();
                                limitReachedBottomSheet.updatePremiumButtonText();
                                limitReachedBottomSheet.boostsStatus = tL_premium_boostsStatus;
                                limitReachedBottomSheet.isCurrentChat = true;
                                limitReachedBottomSheet.updateRows$7();
                                limitReachedBottomSheet.dialogId = j;
                                limitReachedBottomSheet.updateRows$7();
                                limitReachedBottomSheet.chatMessageCell = null;
                                boostsActivity.showDialog(limitReachedBottomSheet);
                                break;
                            }
                            break;
                        case 1:
                            BoostsActivity boostsActivity2 = BoostsActivity.this;
                            if (true != boostsActivity2.isDialogVisible) {
                                boostsActivity2.isDialogVisible = true;
                                boostsActivity2.particlesView.setPaused(true);
                                boostsActivity2.contentView.invalidate();
                            }
                            BoostPagerBottomSheet.show(boostsActivity2, ((BaseFragment) boostsActivity2).resourceProvider, boostsActivity2.dialogId, null);
                            BoostPagerBottomSheet.instance.setOnHideListener(new OAuthSheet$$ExternalSyntheticLambda11(anonymousClass5, i6));
                            break;
                        default:
                            anonymousClass5.getClass();
                            Context context = anonymousClass5.getContext();
                            BoostsActivity boostsActivity3 = BoostsActivity.this;
                            LimitReachedBottomSheet limitReachedBottomSheet2 = new LimitReachedBottomSheet(31, boostsActivity3.currentAccount, context, BoostsActivity.this, boostsActivity3.getResourceProvider());
                            limitReachedBottomSheet2.boostsStatus = boostsActivity3.boostsStatus;
                            limitReachedBottomSheet2.isCurrentChat = true;
                            limitReachedBottomSheet2.updateRows$7();
                            limitReachedBottomSheet2.dialogId = boostsActivity3.dialogId;
                            limitReachedBottomSheet2.updateRows$7();
                            boostsActivity3.showDialog(limitReachedBottomSheet2);
                            break;
                    }
                }
            });
            final int i6 = 2;
            anonymousClass16.setOnClickListener(new View.OnClickListener(this) {
                public final BoostsActivity.AnonymousClass5 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    BoostsActivity.AnonymousClass5 anonymousClass5 = this.f$0;
                    int i7 = 1;
                    switch (i6) {
                        case 0:
                            BoostsActivity boostsActivity = BoostsActivity.this;
                            long j = boostsActivity.dialogId;
                            ChannelBoostsController.CanApplyBoost canApplyBoost = boostsActivity.canApplyBoost;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = boostsActivity.boostsStatus;
                            int i8 = LimitReachedBottomSheet.$r8$clinit;
                            if (canApplyBoost != null && tL_premium_boostsStatus != null && boostsActivity.getParentActivity() != null) {
                                LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(19, boostsActivity.getCurrentAccount(), boostsActivity.getParentActivity(), boostsActivity, boostsActivity.getResourceProvider());
                                limitReachedBottomSheet.canApplyBoost = canApplyBoost;
                                limitReachedBottomSheet.updateButton$2();
                                limitReachedBottomSheet.updatePremiumButtonText();
                                limitReachedBottomSheet.boostsStatus = tL_premium_boostsStatus;
                                limitReachedBottomSheet.isCurrentChat = true;
                                limitReachedBottomSheet.updateRows$7();
                                limitReachedBottomSheet.dialogId = j;
                                limitReachedBottomSheet.updateRows$7();
                                limitReachedBottomSheet.chatMessageCell = null;
                                boostsActivity.showDialog(limitReachedBottomSheet);
                                break;
                            }
                            break;
                        case 1:
                            BoostsActivity boostsActivity2 = BoostsActivity.this;
                            if (true != boostsActivity2.isDialogVisible) {
                                boostsActivity2.isDialogVisible = true;
                                boostsActivity2.particlesView.setPaused(true);
                                boostsActivity2.contentView.invalidate();
                            }
                            BoostPagerBottomSheet.show(boostsActivity2, ((BaseFragment) boostsActivity2).resourceProvider, boostsActivity2.dialogId, null);
                            BoostPagerBottomSheet.instance.setOnHideListener(new OAuthSheet$$ExternalSyntheticLambda11(anonymousClass5, i7));
                            break;
                        default:
                            anonymousClass5.getClass();
                            Context context = anonymousClass5.getContext();
                            BoostsActivity boostsActivity3 = BoostsActivity.this;
                            LimitReachedBottomSheet limitReachedBottomSheet2 = new LimitReachedBottomSheet(31, boostsActivity3.currentAccount, context, BoostsActivity.this, boostsActivity3.getResourceProvider());
                            limitReachedBottomSheet2.boostsStatus = boostsActivity3.boostsStatus;
                            limitReachedBottomSheet2.isCurrentChat = true;
                            limitReachedBottomSheet2.updateRows$7();
                            limitReachedBottomSheet2.dialogId = boostsActivity3.dialogId;
                            limitReachedBottomSheet2.updateRows$7();
                            boostsActivity3.showDialog(limitReachedBottomSheet2);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.addView(anonymousClass14, LayoutHelper.createLinear(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
            if (MessagesController.getInstance(BoostsActivity.this.currentAccount).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(BoostsActivity.this.currentChat)) {
                linearLayout.addView(anonymousClass15, LayoutHelper.createLinear(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
            }
            linearLayout.addView(anonymousClass16, LayoutHelper.createLinear(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
            addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
        }
    }

    public BoostsActivity(long j) {
        int i = UserConfig.selectedAccount;
        this.currentAccount = i;
        this.boosters = new ArrayList();
        this.gifts = new ArrayList();
        this.items = new ArrayList();
        this.selectedTab = 0;
        this.adapter = new AnonymousClass1();
        this.lastBoostsOffset = "";
        this.lastGiftsOffset = "";
        this.limitGifts = 5;
        this.limitBoosts = 5;
        this.dialogId = j;
        this.currentChat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
    }

    @Override
    public final RecyclerView.Adapter createAdapter() {
        return this.adapter;
    }

    @Override
    public final View createView(Context context) {
        View viewCreateView = super.createView(context);
        resetHeader(false);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(0, this, context));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.progressLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.progressLayout.addView(new AnonymousClass3(parentActivity), LayoutHelper.createLinear(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.progressLayout, LayoutHelper.createFrame(-1, -2, 17));
        this.progressLayout.setAlpha(0.0f);
        if (this.boostsStatus == null) {
            this.progressLayout.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().getBoostsController().getBoostsStats(this.dialogId, new BoostsActivity$$ExternalSyntheticLambda1(this, 1));
        } else {
            this.progressLayout.setVisibility(8);
            loadUsers(null);
        }
        updateRows(false);
        return viewCreateView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.boostByChannelCreated) {
            if (i == NotificationCenter.chatWasBoostedByUser) {
                if (this.dialogId == ((Long) objArr[2]).longValue()) {
                    this.boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[0];
                    this.canApplyBoost = (ChannelBoostsController.CanApplyBoost) objArr[1];
                    return;
                }
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        List<BaseFragment> fragmentStack = ((ActionBarLayout) getParentLayout()).getFragmentStack();
        BaseFragment baseFragment = fragmentStack.size() >= 2 ? (BaseFragment) RendererCapabilities.CC.m(2, fragmentStack) : null;
        if (baseFragment instanceof ChatEditActivity) {
            INavigationLayout parentLayout = getParentLayout();
            parentLayout.getClass();
            ((ActionBarLayout) parentLayout).removeFragmentFromStack(baseFragment, false);
        }
        List<BaseFragment> fragmentStack2 = ((ActionBarLayout) getParentLayout()).getFragmentStack();
        BaseFragment baseFragment2 = fragmentStack2.size() >= 2 ? (BaseFragment) RendererCapabilities.CC.m(2, fragmentStack2) : null;
        if (!zBooleanValue) {
            finishFragment();
            if ((baseFragment2 instanceof ProfileActivity) || (baseFragment2 instanceof ChatActivity)) {
                BoostDialogs.showBulletin(baseFragment2, chat, false);
                return;
            }
            return;
        }
        BaseFragment baseFragment3 = fragmentStack2.size() >= 3 ? (BaseFragment) RendererCapabilities.CC.m(3, fragmentStack2) : null;
        if (baseFragment2 instanceof ProfileActivity) {
            INavigationLayout parentLayout2 = getParentLayout();
            parentLayout2.getClass();
            ((ActionBarLayout) parentLayout2).removeFragmentFromStack(baseFragment2, false);
        }
        finishFragment();
        if (baseFragment3 instanceof ChatActivity) {
            BoostDialogs.showBulletin(baseFragment3, chat, true);
        }
        if (baseFragment2 instanceof ChatActivity) {
            BoostDialogs.showBulletin(baseFragment2, chat, true);
        }
    }

    public final void lambda$createView$12(Context context, View view, int i) {
        if (view instanceof GiftedUserCell) {
            GiftedUserCell giftedUserCell = (GiftedUserCell) view;
            TL_stories.Boost boost = giftedUserCell.getBoost();
            boolean z = boost.giveaway;
            if (!z || boost.stars <= 0) {
                boolean z2 = boost.gift;
                if (((z2 || z) && boost.user_id >= 0) || boost.unclaimed) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-this.currentChat.id);
                    int i2 = boost.date;
                    tL_payments_checkedGiftCode.date = i2;
                    tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                    int i3 = boost.expires - i2;
                    tL_payments_checkedGiftCode.days = i3 / 86400;
                    tL_payments_checkedGiftCode.months = (i3 / 30) / 86400;
                    if (boost.unclaimed) {
                        tL_payments_checkedGiftCode.to_id = -1L;
                        tL_payments_checkedGiftCode.flags = -1;
                    } else {
                        tL_payments_checkedGiftCode.boost = boost;
                    }
                    new GiftInfoBottomSheet(this, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                } else if (z && boost.user_id == -1) {
                    Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getParentActivity(), getResourceProvider());
                    lottieLayout.setAnimation(R.raw.chats_infotip, 36, 36, new String[0]);
                    lottieLayout.textView.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                    lottieLayout.textView.setSingleLine(false);
                    lottieLayout.textView.setMaxLines(2);
                    Bulletin.make(this, lottieLayout, 2750).show();
                } else if (!z2 && !z) {
                    presentFragment(ProfileActivity.of(giftedUserCell.getDialogId()));
                }
            } else {
                StarsIntroActivity.showBoostsSheet(context, this.currentAccount, this.dialogId, boost, getResourceProvider());
            }
        }
        boolean z3 = view instanceof TextCell;
        long j = this.dialogId;
        if (z3) {
            BoostPagerBottomSheet.show(this, this.resourceProvider, j, null);
        }
        if (view instanceof GiveawayCell) {
            BoostPagerBottomSheet.show(this, this.resourceProvider, j, ((GiveawayCell) view).getPrepaidGiveaway());
        }
        if (((ItemInternal) this.items.get(i)).viewType == 9) {
            loadUsers(Boolean.valueOf(this.selectedTab == 1));
        }
    }

    public final void loadCanApplyBoosts() {
        if (this.boostsStatus == null) {
            return;
        }
        getMessagesController().getBoostsController().userCanBoostChannel(this.dialogId, this.boostsStatus, new BoostsActivity$$ExternalSyntheticLambda1(this, 0));
    }

    public final void loadOnlyBoosts(CountDownLatch countDownLatch, BoostsActivity$$ExternalSyntheticLambda4 boostsActivity$$ExternalSyntheticLambda4) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.limitBoosts;
        tL_premium_getBoostsList.offset = this.lastBoostsOffset;
        int i = this.currentAccount;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i).getInputPeer(this.dialogId);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new BoostsActivity$$ExternalSyntheticLambda7(this, countDownLatch, boostsActivity$$ExternalSyntheticLambda4, 1), 2);
    }

    public final void loadOnlyGifts(CountDownLatch countDownLatch, BoostsActivity$$ExternalSyntheticLambda4 boostsActivity$$ExternalSyntheticLambda4) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.limitGifts;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.lastGiftsOffset;
        int i = this.currentAccount;
        tL_premium_getBoostsList.peer = MessagesController.getInstance(i).getInputPeer(this.dialogId);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new BoostsActivity$$ExternalSyntheticLambda7(this, countDownLatch, boostsActivity$$ExternalSyntheticLambda4, 0), 2);
    }

    public final void loadUsers(Boolean bool) {
        if (this.usersLoading) {
            return;
        }
        this.usersLoading = true;
        if (bool == null) {
            Utilities.globalQueue.postRunnable(new BoostsActivity$$ExternalSyntheticLambda4(this, 0));
        } else if (bool.booleanValue()) {
            loadOnlyGifts(null, new BoostsActivity$$ExternalSyntheticLambda4(this, 2));
        } else {
            loadOnlyBoosts(null, new BoostsActivity$$ExternalSyntheticLambda4(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        super.onFragmentDestroy();
    }

    public final void resetHeader(boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        if (this.limitPreviewView == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), R.drawable.filled_limit_boost, 0, 0, 0.5f, this.resourceProvider);
            this.limitPreviewView = limitPreviewView;
            limitPreviewView.isStatistic = true;
            limitPreviewView.setDarkGradientProvider(new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 19));
        }
        if (this.limitPreviewView.getParent() != null) {
            ((ViewGroup) this.limitPreviewView.getParent()).removeView(this.limitPreviewView);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.boostsStatus;
        if (tL_premium_boostsStatus != null) {
            this.limitPreviewView.setBoosts(tL_premium_boostsStatus, false);
            if (z) {
                this.limitPreviewView.setAlpha(0.0f);
                this.limitPreviewView.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.currentChat;
        String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingBoostForChannels : R.string.BoostingBoostForGroups);
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingBoostForChannelsInfo : R.string.BoostingBoostForGroupsInfo));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(getParentActivity());
        anonymousClass4.addView(this.boostsStatus != null ? this.limitPreviewView : new View(anonymousClass4.getContext()), LayoutHelper.createFrame(-1, this.boostsStatus != null ? -2.0f : 110.0f, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        configureHeader(string, spannableStringBuilderReplaceTags, anonymousClass4, new AnonymousClass5(getParentActivity()));
    }

    public final void updateRows(boolean z) {
        ArrayList arrayList = this.items;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        arrayList.add(new ItemInternal(14, false));
        if (this.boostsStatus != null) {
            arrayList.add(new ItemInternal(16, LocaleController.getString(R.string.StatisticOverview)));
            arrayList.add(new ItemInternal(0, false));
            arrayList.add(new ItemInternal(2, false));
            if (this.boostsStatus.prepaid_giveaways.size() > 0) {
                arrayList.add(new ItemInternal(12, LocaleController.getString(R.string.BoostingPreparedGiveaways)));
                int i = 0;
                while (i < this.boostsStatus.prepaid_giveaways.size()) {
                    arrayList.add(new ItemInternal(this.boostsStatus.prepaid_giveaways.get(i), i == this.boostsStatus.prepaid_giveaways.size() - 1));
                    i++;
                }
                arrayList.add(new ItemInternal(6, LocaleController.getString(R.string.BoostingSelectPaidGiveaway)));
            }
            arrayList.add(new ItemInternal(13, LocaleController.getString(R.string.Boosters)));
            int i2 = this.selectedTab;
            TLRPC.Chat chat = this.currentChat;
            if (i2 == 0) {
                ArrayList arrayList3 = this.boosters;
                if (arrayList3.isEmpty()) {
                    arrayList.add(new ItemInternal(8, false));
                    arrayList.add(new ItemInternal(2, false));
                } else {
                    int i3 = 0;
                    while (i3 < arrayList3.size()) {
                        arrayList.add(new ItemInternal((TL_stories.Boost) arrayList3.get(i3), i3 == arrayList3.size() - 1 && !this.hasBoostsNext, this.selectedTab));
                        i3++;
                    }
                    if (this.hasBoostsNext) {
                        arrayList.add(new ItemInternal(9, true));
                    } else {
                        arrayList.add(new ItemInternal(7, false));
                    }
                    arrayList.add(new ItemInternal(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            } else {
                ArrayList arrayList4 = this.gifts;
                if (arrayList4.isEmpty()) {
                    arrayList.add(new ItemInternal(8, false));
                    arrayList.add(new ItemInternal(2, false));
                } else {
                    int i4 = 0;
                    while (i4 < arrayList4.size()) {
                        arrayList.add(new ItemInternal((TL_stories.Boost) arrayList4.get(i4), i4 == arrayList4.size() - 1 && !this.hasGiftsNext, this.selectedTab));
                        i4++;
                    }
                    if (this.hasGiftsNext) {
                        arrayList.add(new ItemInternal(9, true));
                    } else {
                        arrayList.add(new ItemInternal(7, false));
                    }
                    arrayList.add(new ItemInternal(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostersInfoDescription : R.string.BoostersInfoGroupDescription)));
                }
            }
            arrayList.add(new ItemInternal(1, LocaleController.getString(R.string.LinkForBoosting)));
            arrayList.add(new ItemInternal(3, this.boostsStatus.boost_url));
            if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable && ChatObject.hasAdminRights(chat)) {
                arrayList.add(new ItemInternal(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingShareThisLink : R.string.BoostingShareThisLinkGroup)));
                arrayList.add(new ItemInternal(10, true));
                arrayList.add(new ItemInternal(6, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.BoostingGetMoreBoosts2 : R.string.BoostingGetMoreBoostsGroup)));
            } else {
                arrayList.add(new ItemInternal(6, ""));
            }
            arrayList.add(new ItemInternal(15, false));
        }
        AnonymousClass1 anonymousClass1 = this.adapter;
        if (z) {
            anonymousClass1.setItems(arrayList2, arrayList);
        } else {
            anonymousClass1.mObservable.notifyChanged();
        }
    }

    public final class ItemInternal extends AdapterWithDiffUtils.Item {
        public final TL_stories.Boost booster;
        public final boolean isLast;
        public final TL_stories.PrepaidGiveaway prepaidGiveaway;
        public final int tab;
        public final String title;

        public ItemInternal(int i, String str) {
            super(i, false);
            this.title = str;
        }

        public final boolean equals(Object obj) {
            TL_stories.Boost boost;
            TL_stories.PrepaidGiveaway prepaidGiveaway;
            if (this == obj) {
                return true;
            }
            if (obj == null || ItemInternal.class != obj.getClass()) {
                return false;
            }
            ItemInternal itemInternal = (ItemInternal) obj;
            boolean z = this.isLast;
            boolean z2 = itemInternal.isLast;
            TL_stories.PrepaidGiveaway prepaidGiveaway2 = this.prepaidGiveaway;
            if (prepaidGiveaway2 != null && (prepaidGiveaway = itemInternal.prepaidGiveaway) != null) {
                return prepaidGiveaway2.id == prepaidGiveaway.id && z == z2;
            }
            TL_stories.Boost boost2 = this.booster;
            if (boost2 == null || (boost = itemInternal.booster) == null) {
                return true;
            }
            return boost2.id.hashCode() == boost.id.hashCode() && z == z2 && this.tab == itemInternal.tab;
        }

        public final int hashCode() {
            return Objects.hash(this.title, this.booster, this.prepaidGiveaway, Boolean.valueOf(this.isLast), Integer.valueOf(this.tab));
        }

        public ItemInternal(TL_stories.Boost boost, boolean z, int i) {
            super(5, true);
            this.booster = boost;
            this.isLast = z;
            this.tab = i;
        }

        public ItemInternal(TL_stories.PrepaidGiveaway prepaidGiveaway, boolean z) {
            super(11, true);
            this.prepaidGiveaway = prepaidGiveaway;
            this.isLast = z;
        }
    }

    public final class AnonymousClass3 extends View {
        public final int $r8$classId = 0;
        public final CircularProgressDrawable drawable;

        public AnonymousClass3(Activity activity) {
            super(activity);
            this.drawable = new CircularProgressDrawable(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(3.0f), Theme.getColor(null, Theme.key_dialogTextBlue, false));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    CircularProgressDrawable circularProgressDrawable = this.drawable;
                    circularProgressDrawable.setBounds(0, 0, getWidth(), getHeight());
                    circularProgressDrawable.paint.setAlpha(255);
                    circularProgressDrawable.draw(canvas);
                    invalidate();
                    super.onDraw(canvas);
                    break;
                default:
                    int iDp = AndroidUtilities.dp(1.0f);
                    CircularProgressDrawable circularProgressDrawable2 = this.drawable;
                    circularProgressDrawable2.setBounds(iDp, iDp, (getWidth() - iDp) - iDp, (getHeight() - iDp) - iDp);
                    circularProgressDrawable2.draw(canvas);
                    invalidate();
                    break;
            }
        }

        public AnonymousClass3(Context context) {
            super(context);
            this.drawable = new CircularProgressDrawable(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(2.0f), -13522392);
        }
    }
}
