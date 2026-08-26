package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.core.view.NestedScrollingParent3;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzhr;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.mlkit_vision_common.zzkh;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import com.google.zxing.qrcode.decoder.Version;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Components.AlertsCreator$$ExternalSyntheticLambda26;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TagEditCell$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Stars.BotStarsActivity;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda3;
import org.telegram.ui.web.WebActionBar;

public final class ChannelMonetizationLayout extends SizeNotifierFrameLayout implements NestedScrollingParent3 {
    public static ChannelMonetizationLayout instance;
    public static HashMap tonString;
    public ActionBar actionBar;
    public final ProceedOverview availableValue;
    public final ButtonWithCounterView balanceButton;
    public final CharSequence balanceInfo;
    public final GLIconSettingsView balanceLayout;
    public final AnimatedTextView balanceSubtitle;
    public final AnimatedTextView balanceTitle;
    public final RelativeSizeSpan balanceTitleSizeSpan;
    public TL_stories.TL_premium_boostsStatus boostsStatus;
    public final int currentAccount;
    public int currentBoostLevel;
    public final long dialogId;
    public DecimalFormat formatter;
    public final StatisticActivity fragment;
    public ViewGroupPartRenderer iBlur3Capture;
    public StatisticActivity.ChartViewData impressionsChart;
    public boolean initialSwitchOffValue;
    public final ProceedOverview lastWithdrawalValue;
    public final ProceedOverview lifetimeValue;
    public final UniversalRecyclerView listView;
    public SpannableStringBuilder lock;
    public final Version.ECB nestedScrollingParentHelper;
    public boolean proceedsAvailable;
    public final CharSequence proceedsInfo;
    public final FrameLayout progress;
    public final Theme.ResourcesProvider resourcesProvider;
    public StatisticActivity.ChartViewData revenueChart;
    public final ChannelMonetizationLayout$$ExternalSyntheticLambda3 sendCpmUpdateRunnable;
    public final ChannelMonetizationLayout$$ExternalSyntheticLambda8 setStarsBalanceButtonText;
    public final ColoredImageSpan[] starRef;
    public final ButtonWithCounterView starsAdsButton;
    public TL_stars.StarsAmount starsBalance;
    public int starsBalanceBlockedUntil;
    public final AnonymousClass6 starsBalanceButton;
    public final LinearLayout starsBalanceButtonsLayout;
    public final WebActionBar.AnonymousClass4 starsBalanceEditText;
    public boolean starsBalanceEditTextAll;
    public final BotStarsActivity.AnonymousClass3 starsBalanceEditTextContainer;
    public boolean starsBalanceEditTextIgnore;
    public long starsBalanceEditTextValue;
    public final CharSequence starsBalanceInfo;
    public final GLIconSettingsView starsBalanceLayout;
    public final AnimatedTextView starsBalanceSubtitle;
    public final AnimatedTextView starsBalanceTitle;
    public final boolean starsRevenueAvailable;
    public StatisticActivity.ChartViewData starsRevenueChart;
    public double stars_rate;
    public boolean switchOffValue;
    public final CharSequence titleInfo;
    public final boolean tonRevenueAvailable;
    public double ton_rate;
    public final ChannelTransactionsView transactionsLayout;
    public Bulletin withdrawalBulletin;

    public final class AnonymousClass6 extends ButtonWithCounterView {
    }

    public final class ChannelTransactionsView extends LinearLayout {
        public final PageAdapter adapter;
        public final int currentAccount;
        public final long dialogId;
        public final boolean[] loadingTransactions;
        public String starsLastOffset;
        public final ArrayList starsTransactions;
        public final ArrayList tonTransactions;
        public String tonTransactionsLastOffset;
        public final ChannelMonetizationLayout$$ExternalSyntheticLambda3 updateParentList;
        public final ViewPagerFixed viewPager;

        public final class Page extends FrameLayout {
            public final int currentAccount;
            public final UniversalRecyclerView listView;
            public final ArticleViewer$$ExternalSyntheticLambda74 loadMore;
            public final Theme.ResourcesProvider resourcesProvider;
            public final int type;

            public Page(Activity activity, int i, int i2, int i3, ArticleViewer$$ExternalSyntheticLambda74 articleViewer$$ExternalSyntheticLambda74, Theme.ResourcesProvider resourcesProvider) {
                super(activity);
                this.type = i;
                this.currentAccount = i2;
                this.resourcesProvider = resourcesProvider;
                this.loadMore = articleViewer$$ExternalSyntheticLambda74;
                UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(activity, i2, i3, true, new CallLogActivity$$ExternalSyntheticLambda3(this, 13), new ChatActivity$$ExternalSyntheticLambda356(this, 10), null, resourcesProvider, -1, 1);
                this.listView = universalRecyclerView;
                addView(universalRecyclerView, LayoutHelper.createFrame(-1.0f, -1));
                universalRecyclerView.setOnScrollListener(new ChatActivity.AnonymousClass35(1, this, articleViewer$$ExternalSyntheticLambda74));
            }

            @Override
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                this.listView.adapter.update(false);
            }
        }

        public ChannelTransactionsView(Activity activity, int i, long j, int i2, ChannelMonetizationLayout$$ExternalSyntheticLambda3 channelMonetizationLayout$$ExternalSyntheticLambda3, Theme.ResourcesProvider resourcesProvider) {
            super(activity);
            this.tonTransactionsLastOffset = "";
            this.tonTransactions = new ArrayList();
            this.starsTransactions = new ArrayList();
            this.starsLastOffset = "";
            this.loadingTransactions = new boolean[]{false, false};
            this.currentAccount = i;
            this.dialogId = j;
            this.updateParentList = channelMonetizationLayout$$ExternalSyntheticLambda3;
            setOrientation(1);
            ViewPagerFixed viewPagerFixed = new ViewPagerFixed(activity, null);
            this.viewPager = viewPagerFixed;
            PageAdapter pageAdapter = new PageAdapter(activity, i, i2, resourcesProvider);
            this.adapter = pageAdapter;
            viewPagerFixed.setAdapter(pageAdapter);
            View viewCreateTabsView = viewPagerFixed.createTabsView(3, true);
            View view = new View(activity);
            view.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
            addView(viewCreateTabsView, LayoutHelper.createLinear(-1, 48));
            addView(view, new LinearLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(1.0f / AndroidUtilities.density)));
            addView(viewPagerFixed, LayoutHelper.createLinear(-1, -1));
            setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            loadTransactions(1);
            loadTransactions(0);
        }

        public RecyclerListView getCurrentListView() {
            View currentView = this.viewPager.getCurrentView();
            if (currentView instanceof Page) {
                return ((Page) currentView).listView;
            }
            return null;
        }

        public final boolean hasTransactions() {
            return (this.tonTransactions.isEmpty() && this.starsTransactions.isEmpty()) ? false : true;
        }

        public final void loadTransactions(final int i) {
            boolean[] zArr = this.loadingTransactions;
            if (zArr[i]) {
                return;
            }
            final boolean zHasTransactions = hasTransactions();
            final boolean zHasTransactions2 = hasTransactions(i);
            long j = this.dialogId;
            ChannelMonetizationLayout channelMonetizationLayout = ChannelMonetizationLayout.this;
            int i2 = this.currentAccount;
            if (i == 1) {
                if (this.tonTransactionsLastOffset == null || !channelMonetizationLayout.tonRevenueAvailable) {
                    return;
                }
                zArr[i] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions.ton = true;
                tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i2).getInputPeer(j);
                tL_payments_getStarsTransactions.offset = this.tonTransactionsLastOffset;
                tL_payments_getStarsTransactions.limit = this.tonTransactions.isEmpty() ? 5 : 20;
                final int i3 = 0;
                ConnectionsManager.getInstance(i2).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) {
                    public final ChannelMonetizationLayout.ChannelTransactionsView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i3) {
                            case 0:
                                final ChannelMonetizationLayout.ChannelTransactionsView channelTransactionsView = this.f$0;
                                channelTransactionsView.getClass();
                                final boolean z = zHasTransactions;
                                final boolean z2 = zHasTransactions2;
                                final int i4 = i;
                                final int i5 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ChannelMonetizationLayout$$ExternalSyntheticLambda3 channelMonetizationLayout$$ExternalSyntheticLambda3;
                                        ChannelMonetizationLayout$$ExternalSyntheticLambda3 channelMonetizationLayout$$ExternalSyntheticLambda4;
                                        switch (i5) {
                                            case 0:
                                                ChannelMonetizationLayout.ChannelTransactionsView channelTransactionsView2 = channelTransactionsView;
                                                channelTransactionsView2.getClass();
                                                TLObject tLObject2 = tLObject;
                                                boolean z3 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i6 = i4;
                                                if (z3) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    int i7 = channelTransactionsView2.currentAccount;
                                                    MessagesController.getInstance(i7).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i7).putChats(starsStatus.chats, false);
                                                    channelTransactionsView2.starsTransactions.addAll(starsStatus.history);
                                                    channelTransactionsView2.starsLastOffset = starsStatus.next_offset;
                                                    channelTransactionsView2.loadingTransactions[i6] = false;
                                                    channelTransactionsView2.updateLists();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        BulletinFactory.showError(tL_error2);
                                                    }
                                                }
                                                if (channelTransactionsView2.hasTransactions() != z && (channelMonetizationLayout$$ExternalSyntheticLambda3 = channelTransactionsView2.updateParentList) != null) {
                                                    channelMonetizationLayout$$ExternalSyntheticLambda3.run();
                                                }
                                                if (channelTransactionsView2.hasTransactions(i6) != z2) {
                                                    channelTransactionsView2.updateTabs();
                                                }
                                                break;
                                            default:
                                                ChannelMonetizationLayout.ChannelTransactionsView channelTransactionsView3 = channelTransactionsView;
                                                channelTransactionsView3.getClass();
                                                TLObject tLObject3 = tLObject;
                                                boolean z4 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i8 = i4;
                                                if (z4) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    int i9 = channelTransactionsView3.currentAccount;
                                                    MessagesController.getInstance(i9).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i9).putChats(starsStatus2.chats, false);
                                                    channelTransactionsView3.tonTransactions.addAll(starsStatus2.history);
                                                    channelTransactionsView3.tonTransactionsLastOffset = starsStatus2.next_offset;
                                                    channelTransactionsView3.loadingTransactions[i8] = false;
                                                    channelTransactionsView3.updateLists();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        BulletinFactory.showError(tL_error3);
                                                    }
                                                }
                                                if (channelTransactionsView3.hasTransactions() != z && (channelMonetizationLayout$$ExternalSyntheticLambda4 = channelTransactionsView3.updateParentList) != null) {
                                                    channelMonetizationLayout$$ExternalSyntheticLambda4.run();
                                                }
                                                if (channelTransactionsView3.hasTransactions(i8) != z2) {
                                                    channelTransactionsView3.updateTabs();
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final ChannelMonetizationLayout.ChannelTransactionsView channelTransactionsView2 = this.f$0;
                                channelTransactionsView2.getClass();
                                final boolean z3 = zHasTransactions;
                                final boolean z4 = zHasTransactions2;
                                final int i6 = i;
                                final int i7 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ChannelMonetizationLayout$$ExternalSyntheticLambda3 channelMonetizationLayout$$ExternalSyntheticLambda3;
                                        ChannelMonetizationLayout$$ExternalSyntheticLambda3 channelMonetizationLayout$$ExternalSyntheticLambda4;
                                        switch (i7) {
                                            case 0:
                                                ChannelMonetizationLayout.ChannelTransactionsView channelTransactionsView3 = channelTransactionsView2;
                                                channelTransactionsView3.getClass();
                                                TLObject tLObject2 = tLObject;
                                                boolean z5 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i8 = i6;
                                                if (z5) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    int i9 = channelTransactionsView3.currentAccount;
                                                    MessagesController.getInstance(i9).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i9).putChats(starsStatus.chats, false);
                                                    channelTransactionsView3.starsTransactions.addAll(starsStatus.history);
                                                    channelTransactionsView3.starsLastOffset = starsStatus.next_offset;
                                                    channelTransactionsView3.loadingTransactions[i8] = false;
                                                    channelTransactionsView3.updateLists();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        BulletinFactory.showError(tL_error2);
                                                    }
                                                }
                                                if (channelTransactionsView3.hasTransactions() != z3 && (channelMonetizationLayout$$ExternalSyntheticLambda3 = channelTransactionsView3.updateParentList) != null) {
                                                    channelMonetizationLayout$$ExternalSyntheticLambda3.run();
                                                }
                                                if (channelTransactionsView3.hasTransactions(i8) != z4) {
                                                    channelTransactionsView3.updateTabs();
                                                }
                                                break;
                                            default:
                                                ChannelMonetizationLayout.ChannelTransactionsView channelTransactionsView4 = channelTransactionsView2;
                                                channelTransactionsView4.getClass();
                                                TLObject tLObject3 = tLObject;
                                                boolean z6 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i10 = i6;
                                                if (z6) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    int i11 = channelTransactionsView4.currentAccount;
                                                    MessagesController.getInstance(i11).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i11).putChats(starsStatus2.chats, false);
                                                    channelTransactionsView4.tonTransactions.addAll(starsStatus2.history);
                                                    channelTransactionsView4.tonTransactionsLastOffset = starsStatus2.next_offset;
                                                    channelTransactionsView4.loadingTransactions[i10] = false;
                                                    channelTransactionsView4.updateLists();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        BulletinFactory.showError(tL_error3);
                                                    }
                                                }
                                                if (channelTransactionsView4.hasTransactions() != z3 && (channelMonetizationLayout$$ExternalSyntheticLambda4 = channelTransactionsView4.updateParentList) != null) {
                                                    channelMonetizationLayout$$ExternalSyntheticLambda4.run();
                                                }
                                                if (channelTransactionsView4.hasTransactions(i10) != z4) {
                                                    channelTransactionsView4.updateTabs();
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
                return;
            }
            if (i == 0 && this.starsLastOffset != null && channelMonetizationLayout.starsRevenueAvailable) {
                zArr[i] = true;
                TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
                tL_payments_getStarsTransactions2.ton = false;
                tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i2).getInputPeer(j);
                tL_payments_getStarsTransactions2.offset = this.starsLastOffset;
                tL_payments_getStarsTransactions2.limit = this.starsTransactions.isEmpty() ? 5 : 20;
                final int i4 = 1;
                ConnectionsManager.getInstance(i2).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) {
                    public final ChannelMonetizationLayout.ChannelTransactionsView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i4) {
                            case 0:
                                final ChannelMonetizationLayout.ChannelTransactionsView channelTransactionsView = this.f$0;
                                channelTransactionsView.getClass();
                                final boolean z = zHasTransactions;
                                final boolean z2 = zHasTransactions2;
                                final int i5 = i;
                                final int i6 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ChannelMonetizationLayout$$ExternalSyntheticLambda3 channelMonetizationLayout$$ExternalSyntheticLambda3;
                                        ChannelMonetizationLayout$$ExternalSyntheticLambda3 channelMonetizationLayout$$ExternalSyntheticLambda4;
                                        switch (i6) {
                                            case 0:
                                                ChannelMonetizationLayout.ChannelTransactionsView channelTransactionsView3 = channelTransactionsView;
                                                channelTransactionsView3.getClass();
                                                TLObject tLObject2 = tLObject;
                                                boolean z5 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i8 = i5;
                                                if (z5) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    int i9 = channelTransactionsView3.currentAccount;
                                                    MessagesController.getInstance(i9).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i9).putChats(starsStatus.chats, false);
                                                    channelTransactionsView3.starsTransactions.addAll(starsStatus.history);
                                                    channelTransactionsView3.starsLastOffset = starsStatus.next_offset;
                                                    channelTransactionsView3.loadingTransactions[i8] = false;
                                                    channelTransactionsView3.updateLists();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        BulletinFactory.showError(tL_error2);
                                                    }
                                                }
                                                if (channelTransactionsView3.hasTransactions() != z && (channelMonetizationLayout$$ExternalSyntheticLambda3 = channelTransactionsView3.updateParentList) != null) {
                                                    channelMonetizationLayout$$ExternalSyntheticLambda3.run();
                                                }
                                                if (channelTransactionsView3.hasTransactions(i8) != z2) {
                                                    channelTransactionsView3.updateTabs();
                                                }
                                                break;
                                            default:
                                                ChannelMonetizationLayout.ChannelTransactionsView channelTransactionsView4 = channelTransactionsView;
                                                channelTransactionsView4.getClass();
                                                TLObject tLObject3 = tLObject;
                                                boolean z6 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i10 = i5;
                                                if (z6) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    int i11 = channelTransactionsView4.currentAccount;
                                                    MessagesController.getInstance(i11).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i11).putChats(starsStatus2.chats, false);
                                                    channelTransactionsView4.tonTransactions.addAll(starsStatus2.history);
                                                    channelTransactionsView4.tonTransactionsLastOffset = starsStatus2.next_offset;
                                                    channelTransactionsView4.loadingTransactions[i10] = false;
                                                    channelTransactionsView4.updateLists();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        BulletinFactory.showError(tL_error3);
                                                    }
                                                }
                                                if (channelTransactionsView4.hasTransactions() != z && (channelMonetizationLayout$$ExternalSyntheticLambda4 = channelTransactionsView4.updateParentList) != null) {
                                                    channelMonetizationLayout$$ExternalSyntheticLambda4.run();
                                                }
                                                if (channelTransactionsView4.hasTransactions(i10) != z2) {
                                                    channelTransactionsView4.updateTabs();
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final ChannelMonetizationLayout.ChannelTransactionsView channelTransactionsView2 = this.f$0;
                                channelTransactionsView2.getClass();
                                final boolean z3 = zHasTransactions;
                                final boolean z4 = zHasTransactions2;
                                final int i7 = i;
                                final int i8 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ChannelMonetizationLayout$$ExternalSyntheticLambda3 channelMonetizationLayout$$ExternalSyntheticLambda3;
                                        ChannelMonetizationLayout$$ExternalSyntheticLambda3 channelMonetizationLayout$$ExternalSyntheticLambda4;
                                        switch (i8) {
                                            case 0:
                                                ChannelMonetizationLayout.ChannelTransactionsView channelTransactionsView3 = channelTransactionsView2;
                                                channelTransactionsView3.getClass();
                                                TLObject tLObject2 = tLObject;
                                                boolean z5 = tLObject2 instanceof TL_stars.StarsStatus;
                                                int i9 = i7;
                                                if (z5) {
                                                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                    int i10 = channelTransactionsView3.currentAccount;
                                                    MessagesController.getInstance(i10).putUsers(starsStatus.users, false);
                                                    MessagesController.getInstance(i10).putChats(starsStatus.chats, false);
                                                    channelTransactionsView3.starsTransactions.addAll(starsStatus.history);
                                                    channelTransactionsView3.starsLastOffset = starsStatus.next_offset;
                                                    channelTransactionsView3.loadingTransactions[i9] = false;
                                                    channelTransactionsView3.updateLists();
                                                } else {
                                                    TLRPC.TL_error tL_error2 = tL_error;
                                                    if (tL_error2 != null) {
                                                        BulletinFactory.showError(tL_error2);
                                                    }
                                                }
                                                if (channelTransactionsView3.hasTransactions() != z3 && (channelMonetizationLayout$$ExternalSyntheticLambda3 = channelTransactionsView3.updateParentList) != null) {
                                                    channelMonetizationLayout$$ExternalSyntheticLambda3.run();
                                                }
                                                if (channelTransactionsView3.hasTransactions(i9) != z4) {
                                                    channelTransactionsView3.updateTabs();
                                                }
                                                break;
                                            default:
                                                ChannelMonetizationLayout.ChannelTransactionsView channelTransactionsView4 = channelTransactionsView2;
                                                channelTransactionsView4.getClass();
                                                TLObject tLObject3 = tLObject;
                                                boolean z6 = tLObject3 instanceof TL_stars.StarsStatus;
                                                int i11 = i7;
                                                if (z6) {
                                                    TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                    int i12 = channelTransactionsView4.currentAccount;
                                                    MessagesController.getInstance(i12).putUsers(starsStatus2.users, false);
                                                    MessagesController.getInstance(i12).putChats(starsStatus2.chats, false);
                                                    channelTransactionsView4.tonTransactions.addAll(starsStatus2.history);
                                                    channelTransactionsView4.tonTransactionsLastOffset = starsStatus2.next_offset;
                                                    channelTransactionsView4.loadingTransactions[i11] = false;
                                                    channelTransactionsView4.updateLists();
                                                } else {
                                                    TLRPC.TL_error tL_error3 = tL_error;
                                                    if (tL_error3 != null) {
                                                        BulletinFactory.showError(tL_error3);
                                                    }
                                                }
                                                if (channelTransactionsView4.hasTransactions() != z3 && (channelMonetizationLayout$$ExternalSyntheticLambda4 = channelTransactionsView4.updateParentList) != null) {
                                                    channelMonetizationLayout$$ExternalSyntheticLambda4.run();
                                                }
                                                if (channelTransactionsView4.hasTransactions(i11) != z4) {
                                                    channelTransactionsView4.updateTabs();
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
            }
        }

        public final void updateLists() {
            int i = 0;
            while (true) {
                ViewPagerFixed viewPagerFixed = this.viewPager;
                if (i >= viewPagerFixed.getViewPages().length) {
                    return;
                }
                View view = viewPagerFixed.getViewPages()[i];
                if (view instanceof Page) {
                    Page page = (Page) view;
                    page.listView.adapter.update(true);
                    UniversalRecyclerView universalRecyclerView = page.listView;
                    if (!universalRecyclerView.canScrollVertically(1)) {
                        page.loadMore.run();
                        break;
                        break;
                    }
                    for (int i2 = 0; i2 < universalRecyclerView.getChildCount(); i2++) {
                        if (universalRecyclerView.getChildAt(i2) instanceof FlickerLoadingView) {
                            page.loadMore.run();
                            break;
                        }
                    }
                }
                i++;
            }
        }

        public final void updateTabs() {
            PageAdapter pageAdapter = this.adapter;
            pageAdapter.items.clear();
            ChannelTransactionsView channelTransactionsView = ChannelTransactionsView.this;
            boolean zIsEmpty = channelTransactionsView.tonTransactions.isEmpty();
            ArrayList arrayList = pageAdapter.items;
            if (!zIsEmpty) {
                UItem uItem = new UItem(28);
                uItem.intValue = 1;
                arrayList.add(uItem);
            }
            if (!channelTransactionsView.starsTransactions.isEmpty()) {
                UItem uItem2 = new UItem(28);
                uItem2.intValue = 0;
                arrayList.add(uItem2);
            }
            ViewPagerFixed viewPagerFixed = this.viewPager;
            viewPagerFixed.fillTabs$1(false);
            int[] iArr = viewPagerFixed.viewTypes;
            if (iArr[0] != viewPagerFixed.adapter.getItemViewType(viewPagerFixed.currentPosition)) {
                viewPagerFixed.updateViewForIndex(0);
                View[] viewArr = viewPagerFixed.viewPages;
                View view = viewArr[1];
                if (view != null) {
                    viewPagerFixed.viewsByType.put(iArr[1], view);
                    viewPagerFixed.removeView(viewArr[1]);
                    viewArr[1] = null;
                }
                viewArr[0].setTranslationX(0.0f);
            }
        }

        public final boolean hasTransactions(int i) {
            boolean zIsEmpty;
            if (i == 1) {
                zIsEmpty = this.tonTransactions.isEmpty();
            } else {
                if (i != 0) {
                    return false;
                }
                zIsEmpty = this.starsTransactions.isEmpty();
            }
            return !zIsEmpty;
        }

        public final class PageAdapter extends ViewPagerFixed.Adapter {
            public final int classGuid;
            public final Activity context;
            public final int currentAccount;
            public final ArrayList items;
            public final Theme.ResourcesProvider resourcesProvider;

            public PageAdapter(Activity activity, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                ArrayList arrayList = new ArrayList();
                this.items = arrayList;
                this.context = activity;
                this.currentAccount = i;
                this.classGuid = i2;
                this.resourcesProvider = resourcesProvider;
                arrayList.clear();
                if (!ChannelTransactionsView.this.tonTransactions.isEmpty()) {
                    UItem uItem = new UItem(28);
                    uItem.intValue = 1;
                    arrayList.add(uItem);
                }
                if (ChannelTransactionsView.this.starsTransactions.isEmpty()) {
                    return;
                }
                UItem uItem2 = new UItem(28);
                uItem2.intValue = 0;
                arrayList.add(uItem2);
            }

            @Override
            public final View createView(int i) {
                ArticleViewer$$ExternalSyntheticLambda74 articleViewer$$ExternalSyntheticLambda74 = new ArticleViewer$$ExternalSyntheticLambda74(this, i, 9);
                return ChannelTransactionsView.this.new Page(this.context, i, this.currentAccount, this.classGuid, articleViewer$$ExternalSyntheticLambda74, this.resourcesProvider);
            }

            @Override
            public final int getItemCount() {
                return this.items.size();
            }

            @Override
            public final CharSequence getItemTitle(int i) {
                int itemViewType = getItemViewType(i);
                if (itemViewType != 0) {
                    return itemViewType != 1 ? "" : LocaleController.getString(R.string.MonetizationTransactionsTON);
                }
                return LocaleController.getString(R.string.MonetizationTransactionsStars);
            }

            @Override
            public final int getItemViewType(int i) {
                if (i < 0) {
                    return 1;
                }
                ArrayList arrayList = this.items;
                if (i >= arrayList.size()) {
                    return 1;
                }
                return ((UItem) arrayList.get(i)).intValue;
            }

            @Override
            public final void bindView(View view, int i, int i2) {
            }
        }
    }

    public final class ProceedOverview {
        public long amount;
        public long amount2;
        public boolean contains2;
        public long crypto_amount;
        public String crypto_currency;
        public String crypto_currency2;
        public String currency;
        public String text;
        public boolean contains1 = true;
        public TL_stars.StarsAmount crypto_amount2 = TL_stars.StarsAmount.ofStars(0);
    }

    public final class ProceedOverviewCell extends LinearLayout {
        public final LinearLayout[] amountContainer;
        public final TextView[] amountView;
        public final AnimatedEmojiSpan.TextViewEmojis[] cryptoAmountView;
        public final DecimalFormat formatter;
        public final LinearLayout layout;
        public final TextView titleView;

        public ProceedOverviewCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.amountContainer = new LinearLayout[2];
            this.cryptoAmountView = new AnimatedEmojiSpan.TextViewEmojis[2];
            this.amountView = new TextView[2];
            setOrientation(1);
            LinearLayout linearLayout = new LinearLayout(context);
            this.layout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createLinear(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
            for (int i = 0; i < 2; i++) {
                this.amountContainer[i] = new LinearLayout(context);
                this.amountContainer[i].setOrientation(0);
                this.layout.addView(this.amountContainer[i], LayoutHelper.createLinear(-1, -2, 1.0f, 119));
                this.cryptoAmountView[i] = new AnimatedEmojiSpan.TextViewEmojis(context);
                this.cryptoAmountView[i].setTypeface(AndroidUtilities.bold());
                this.cryptoAmountView[i].setTextSize(1, 16.0f);
                this.cryptoAmountView[i].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                this.amountContainer[i].addView(this.cryptoAmountView[i], LayoutHelper.createLinear(-2, -2, 80, 0, 0, 5, 0));
                this.amountView[i] = new AnimatedEmojiSpan.TextViewEmojis(context);
                this.amountView[i].setTextSize(1, 11.5f);
                this.amountView[i].setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
                this.amountContainer[i].addView(this.amountView[i], LayoutHelper.createLinear(-2, -2, 80));
            }
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 13.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
            addView(textView, LayoutHelper.createLinear(-1, -2, 55, 22, 5, 22, 9));
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
            decimalFormatSymbols.setDecimalSeparator('.');
            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
            this.formatter = decimalFormat;
            decimalFormat.setMinimumFractionDigits(2);
            decimalFormat.setMaximumFractionDigits(12);
            decimalFormat.setGroupingUsed(false);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public void set(ProceedOverview proceedOverview) {
            CharSequence charSequenceReplaceStarsWithPlain;
            int iIndexOf;
            this.titleView.setText(proceedOverview.text);
            int i = 0;
            while (i < 2) {
                String str = i == 0 ? proceedOverview.crypto_currency : proceedOverview.crypto_currency2;
                long j = i == 0 ? proceedOverview.amount : proceedOverview.amount2;
                LinearLayout[] linearLayoutArr = this.amountContainer;
                if (i != 0 || proceedOverview.contains1) {
                    if (i != 1 || proceedOverview.contains2) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zzhr.m(str, " "));
                        boolean zEqualsIgnoreCase = "TON".equalsIgnoreCase(str);
                        TextView[] textViewArr = this.cryptoAmountView;
                        if (zEqualsIgnoreCase) {
                            String str2 = this.formatter.format(proceedOverview.crypto_amount / 1.0E9d);
                            int iIndexOf2 = str2.indexOf(46);
                            if (iIndexOf2 >= 0) {
                                spannableStringBuilder.append((CharSequence) LocaleController.formatNumber((long) Math.floor(proceedOverview.crypto_amount / 1.0E9d), ' '));
                                spannableStringBuilder.append((CharSequence) str2.substring(iIndexOf2));
                            } else {
                                spannableStringBuilder.append((CharSequence) str2);
                            }
                            charSequenceReplaceStarsWithPlain = ChannelMonetizationLayout.replaceTON(spannableStringBuilder, textViewArr[i].getPaint(), 1.05f, 0.0f, true);
                        } else {
                            i = i;
                            if ("XTR".equalsIgnoreCase(str)) {
                                if (i == 0) {
                                    spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(proceedOverview.crypto_amount, ' '));
                                } else {
                                    spannableStringBuilder.append((CharSequence) StarsIntroActivity.formatStarsAmount(proceedOverview.crypto_amount2, 0.8f, ' '));
                                }
                                charSequenceReplaceStarsWithPlain = StarsIntroActivity.replaceStarsWithPlain(false, spannableStringBuilder, 0.7f, null);
                            } else {
                                spannableStringBuilder.append((CharSequence) Long.toString(proceedOverview.crypto_amount));
                                charSequenceReplaceStarsWithPlain = spannableStringBuilder;
                            }
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequenceReplaceStarsWithPlain);
                        if ("TON".equalsIgnoreCase(str) && (iIndexOf = TextUtils.indexOf(spannableStringBuilder2, ".")) >= 0) {
                            spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.8125f), iIndexOf, spannableStringBuilder2.length(), 33);
                        }
                        linearLayoutArr[i].setVisibility(0);
                        textViewArr[i].setText(spannableStringBuilder2);
                        this.amountView[i].setText("≈" + BillingController.getInstance().formatCurrency(j, proceedOverview.currency));
                    } else {
                        linearLayoutArr[i].setVisibility(8);
                    }
                    i++;
                } else {
                    linearLayoutArr[i].setVisibility(8);
                }
                i = i;
                i++;
            }
        }
    }

    public final class TransactionCell extends FrameLayout {
        public final TextView dateView;
        public final DecimalFormat formatter;
        public boolean needDivider;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView titleView;
        public final AnimatedEmojiSpan.TextViewEmojis valueText;

        public TransactionCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            LinearLayout linearLayoutM = zzkf.m(context, 1);
            addView(linearLayoutM, LayoutHelper.createFrame(-1, -2.0f, 119, 17.0f, 9.0f, 130.0f, 9.0f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayoutM, textView, LayoutHelper.createLinear(-1, -2), context);
            this.dateView = textViewM;
            textViewM.setTextSize(1, 13.0f);
            textViewM.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
            linearLayoutM.addView(textViewM, LayoutHelper.createLinear(0.0f, 4.0f, 0.0f, 0.0f, -1, -2));
            AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(context);
            this.valueText = textViewEmojis;
            textViewEmojis.setTypeface(AndroidUtilities.bold());
            textViewEmojis.setTextSize(1, 13.0f);
            addView(textViewEmojis, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
            decimalFormatSymbols.setDecimalSeparator('.');
            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
            this.formatter = decimalFormat;
            decimalFormat.setMinimumFractionDigits(2);
            decimalFormat.setMaximumFractionDigits(12);
            decimalFormat.setGroupingUsed(false);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : Theme.dividerPaint;
                if (paint != null) {
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(17.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : 0), getMeasuredHeight() - 1, paint);
                }
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    public ChannelMonetizationLayout(Activity activity, StatisticActivity statisticActivity, int i, long j, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
        super(activity, null);
        int i2 = 2;
        this.starsBalance = TL_stars.StarsAmount.ofStars(0L);
        this.starRef = new ColoredImageSpan[1];
        this.starsBalanceEditTextIgnore = false;
        this.starsBalanceEditTextAll = true;
        this.switchOffValue = false;
        this.initialSwitchOffValue = false;
        this.proceedsAvailable = false;
        String string = LocaleController.getString(R.string.MonetizationOverviewAvailable);
        ProceedOverview proceedOverview = new ProceedOverview();
        proceedOverview.contains1 = false;
        proceedOverview.crypto_currency = "TON";
        proceedOverview.crypto_currency2 = "XTR";
        proceedOverview.text = string;
        this.availableValue = proceedOverview;
        String string2 = LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal);
        ProceedOverview proceedOverview2 = new ProceedOverview();
        proceedOverview2.contains1 = false;
        proceedOverview2.crypto_currency = "TON";
        proceedOverview2.crypto_currency2 = "XTR";
        proceedOverview2.text = string2;
        this.lastWithdrawalValue = proceedOverview2;
        String string3 = LocaleController.getString(R.string.MonetizationOverviewTotal);
        ProceedOverview proceedOverview3 = new ProceedOverview();
        proceedOverview3.contains1 = false;
        proceedOverview3.crypto_currency = "TON";
        proceedOverview3.crypto_currency2 = "XTR";
        proceedOverview3.text = string3;
        this.lifetimeValue = proceedOverview3;
        this.sendCpmUpdateRunnable = new ChannelMonetizationLayout$$ExternalSyntheticLambda3(this, 8);
        this.nestedScrollingParentHelper = new Version.ECB();
        this.tonRevenueAvailable = z;
        this.starsRevenueAvailable = z2;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.formatter = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.formatter.setMaximumFractionDigits(12);
        this.formatter.setGroupingUsed(false);
        this.fragment = statisticActivity;
        this.resourcesProvider = resourcesProvider;
        this.currentAccount = i;
        this.dialogId = j;
        long j2 = -j;
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(j2));
        if (chat != null) {
            this.currentBoostLevel = chat.level;
        }
        MessagesController.getInstance(i).getBoostsController().getBoostsStats(j, new QrActivity$5$$ExternalSyntheticLambda0(this, i2));
        loadStarsStats(false);
        if (z) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = Theme.currentTheme.isDark();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i).getInputPeer(j);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(j2);
            if (chatFull != null) {
                boolean z3 = chatFull.restricted_sponsored;
                this.switchOffValue = z3;
                this.initialSwitchOffValue = z3;
            }
            ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new ChannelMonetizationLayout$$ExternalSyntheticLambda29(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i).getChat(Long.valueOf(j2));
        int i3 = 1;
        this.titleInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new ChatActivity$$ExternalSyntheticLambda102(statisticActivity, activity, resourcesProvider, 11), resourcesProvider), true);
        this.balanceInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(i).channelRevenueWithdrawalEnabled ? R.string.MonetizationBalanceInfo : R.string.MonetizationBalanceInfoNotAvailable), -1, 3, new ChannelMonetizationLayout$$ExternalSyntheticLambda3(this, i3)), true);
        this.proceedsInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString((z2 && z) ? R.string.MonetizationProceedsStarsTONInfo : z2 ? R.string.MonetizationProceedsStarsInfo : R.string.MonetizationProceedsTONInfo), -1, 3, new ChannelMonetizationLayout$$ExternalSyntheticLambda8(this, (z2 && z) ? R.string.MonetizationProceedsStarsTONInfoLink : z2 ? R.string.MonetizationProceedsStarsInfoLink : R.string.MonetizationProceedsTONInfoLink, 1), resourcesProvider), true);
        this.starsBalanceInfo = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat2) ? R.string.MonetizationStarsInfo : R.string.MonetizationStarsInfoGroup), new ChannelMonetizationLayout$$ExternalSyntheticLambda3(this, i2)), true);
        int i4 = Theme.key_windowBackgroundGray;
        setBackgroundColor(Theme.getColor(i4, resourcesProvider));
        this.transactionsLayout = new ChannelTransactionsView(activity, i, j, statisticActivity.getClassGuid(), new ChannelMonetizationLayout$$ExternalSyntheticLambda3(this, 3), resourcesProvider);
        GLIconSettingsView gLIconSettingsView = new GLIconSettingsView(activity, 1);
        this.balanceLayout = gLIconSettingsView;
        gLIconSettingsView.setOrientation(1);
        int i5 = Theme.key_windowBackgroundWhite;
        gLIconSettingsView.setBackgroundColor(Theme.getColor(i5, resourcesProvider));
        gLIconSettingsView.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(activity, false, true, true);
        this.balanceTitle = animatedTextView;
        animatedTextView.setTypeface(AndroidUtilities.bold());
        int i6 = Theme.key_windowBackgroundWhiteBlackText;
        animatedTextView.setTextColor(Theme.getColor(i6, resourcesProvider));
        animatedTextView.setTextSize(AndroidUtilities.dp(32.0f));
        animatedTextView.setGravity(17);
        this.balanceTitleSizeSpan = new RelativeSizeSpan(0.6770833f);
        gLIconSettingsView.addView(animatedTextView, LayoutHelper.createLinear(-1, 38, 49, 22, 15, 22, 0));
        AnimatedTextView animatedTextView2 = new AnimatedTextView(activity, true, true, true);
        this.balanceSubtitle = animatedTextView2;
        animatedTextView2.setGravity(17);
        int i7 = Theme.key_windowBackgroundWhiteGrayText;
        animatedTextView2.setTextColor(Theme.getColor(i7, resourcesProvider));
        animatedTextView2.setTextSize(AndroidUtilities.dp(14.0f));
        gLIconSettingsView.addView(animatedTextView2, LayoutHelper.createFrame(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(activity, resourcesProvider, true);
        buttonWithCounterView.setRoundRadius(24);
        this.balanceButton = buttonWithCounterView;
        buttonWithCounterView.setEnabled(MessagesController.getInstance(i).channelRevenueWithdrawalEnabled);
        buttonWithCounterView.setText(LocaleController.getString(R.string.MonetizationWithdraw), false, true);
        buttonWithCounterView.setVisibility(8);
        buttonWithCounterView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda77(19, this, statisticActivity));
        gLIconSettingsView.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        GLIconSettingsView gLIconSettingsView2 = new GLIconSettingsView(activity, i2);
        this.starsBalanceLayout = gLIconSettingsView2;
        gLIconSettingsView2.setOrientation(1);
        gLIconSettingsView2.setBackgroundColor(Theme.getColor(i5, resourcesProvider));
        gLIconSettingsView2.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        AnimatedTextView animatedTextView3 = new AnimatedTextView(activity, false, true, true);
        this.starsBalanceTitle = animatedTextView3;
        animatedTextView3.setTypeface(AndroidUtilities.bold());
        animatedTextView3.setTextColor(Theme.getColor(i6, resourcesProvider));
        animatedTextView3.setTextSize(AndroidUtilities.dp(32.0f));
        animatedTextView3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        gLIconSettingsView2.addView(animatedTextView3, LayoutHelper.createLinear(-1, 38, 49, 22, 15, 22, 0));
        AnimatedTextView animatedTextView4 = new AnimatedTextView(activity, true, true, true);
        this.starsBalanceSubtitle = animatedTextView4;
        animatedTextView4.setGravity(17);
        animatedTextView4.setTextColor(Theme.getColor(i7, resourcesProvider));
        animatedTextView4.setTextSize(AndroidUtilities.dp(14.0f));
        gLIconSettingsView2.addView(animatedTextView4, LayoutHelper.createFrame(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        BotStarsActivity.AnonymousClass3 anonymousClass3 = new BotStarsActivity.AnonymousClass3(this, activity, 1);
        this.starsBalanceEditTextContainer = anonymousClass3;
        anonymousClass3.setVisibility(8);
        anonymousClass3.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        anonymousClass3.setLeftPadding(AndroidUtilities.dp(36.0f));
        WebActionBar.AnonymousClass4 anonymousClass4 = new WebActionBar.AnonymousClass4(activity, 1);
        this.starsBalanceEditText = anonymousClass4;
        anonymousClass4.setFocusable(false);
        anonymousClass4.setTextColor(Theme.getColor(i6, resourcesProvider));
        anonymousClass4.setCursorSize(AndroidUtilities.dp(20.0f));
        anonymousClass4.setCursorWidth(1.5f);
        anonymousClass4.setBackground(null);
        anonymousClass4.setTextSize(1, 18.0f);
        anonymousClass4.setMaxLines(1);
        int iDp = AndroidUtilities.dp(16.0f);
        anonymousClass4.setPadding(AndroidUtilities.dp(6.0f), iDp, iDp, iDp);
        anonymousClass4.setInputType(2);
        anonymousClass4.setTypeface(Typeface.DEFAULT);
        anonymousClass4.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, resourcesProvider));
        anonymousClass4.setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, resourcesProvider));
        anonymousClass4.setGravity(LocaleController.isRTL ? 5 : 3);
        anonymousClass4.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 1));
        anonymousClass4.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                ChannelMonetizationLayout channelMonetizationLayout = ChannelMonetizationLayout.this;
                if (channelMonetizationLayout.starsBalanceEditTextIgnore) {
                    return;
                }
                long j3 = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
                channelMonetizationLayout.starsBalanceEditTextValue = j3;
                long j4 = channelMonetizationLayout.starsBalance.amount;
                if (j3 > j4) {
                    channelMonetizationLayout.starsBalanceEditTextValue = j4;
                    channelMonetizationLayout.starsBalanceEditTextIgnore = true;
                    String string4 = Long.toString(j4);
                    WebActionBar.AnonymousClass4 anonymousClass5 = channelMonetizationLayout.starsBalanceEditText;
                    anonymousClass5.setText(string4);
                    anonymousClass5.setSelection(anonymousClass5.getText().length());
                    channelMonetizationLayout.starsBalanceEditTextIgnore = false;
                }
                channelMonetizationLayout.starsBalanceEditTextAll = channelMonetizationLayout.starsBalanceEditTextValue == channelMonetizationLayout.starsBalance.amount;
                ChannelMonetizationLayout$$ExternalSyntheticLambda8 channelMonetizationLayout$$ExternalSyntheticLambda8 = channelMonetizationLayout.setStarsBalanceButtonText;
                AndroidUtilities.cancelRunOnUIThread(channelMonetizationLayout$$ExternalSyntheticLambda8);
                channelMonetizationLayout$$ExternalSyntheticLambda8.run();
                channelMonetizationLayout.starsBalanceEditTextAll = false;
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            }
        });
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(anonymousClass4, LayoutHelper.createLinear(-1, -2, 1.0f, 119));
        anonymousClass3.attachedEditText = anonymousClass4;
        anonymousClass3.invalidate();
        anonymousClass3.addView(linearLayout, LayoutHelper.createFrame(-1, -2, 48));
        gLIconSettingsView2.addView(anonymousClass3, LayoutHelper.createLinear(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.starsBalanceButtonsLayout = linearLayout2;
        linearLayout2.setOrientation(0);
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(activity, resourcesProvider, true);
        anonymousClass6.setRoundRadius(24);
        this.starsBalanceButton = anonymousClass6;
        anonymousClass6.setEnabled(false);
        anonymousClass6.setText(LocaleController.formatPluralString("MonetizationStarsWithdraw", 0, new Object[0]), false, true);
        anonymousClass6.setVisibility(0);
        anonymousClass6.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda6(this, i, statisticActivity, 3));
        ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(activity, resourcesProvider, true);
        buttonWithCounterView2.setRoundRadius(24);
        this.starsAdsButton = buttonWithCounterView2;
        buttonWithCounterView2.setEnabled(false);
        buttonWithCounterView2.setText(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        buttonWithCounterView2.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda26(this, i, j, activity));
        linearLayout2.addView(anonymousClass6, LayoutHelper.createLinear(-1, 48, 1.0f, 119));
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            linearLayout2.addView(new Space(activity), LayoutHelper.createLinear(8, 48, 0.0f, 119));
            linearLayout2.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 1.0f, 119));
        }
        gLIconSettingsView2.addView(linearLayout2, LayoutHelper.createFrame(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        int i8 = 0;
        anonymousClass4.setOnEditorActionListener(new ChannelMonetizationLayout$$ExternalSyntheticLambda7(i8, this, statisticActivity));
        this.setStarsBalanceButtonText = new ChannelMonetizationLayout$$ExternalSyntheticLambda8(this, i, i8);
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(statisticActivity.getParentActivity(), statisticActivity.getCurrentAccount(), statisticActivity.getClassGuid(), new CallLogActivity$$ExternalSyntheticLambda3(this, 12), new ChannelMonetizationLayout$$ExternalSyntheticLambda10(this), new ChannelMonetizationLayout$$ExternalSyntheticLambda10(this), statisticActivity.getResourceProvider());
        this.listView = universalRecyclerView;
        universalRecyclerView.setClipToPadding(false);
        universalRecyclerView.setSections();
        addView(universalRecyclerView);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.progress = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(i4, resourcesProvider));
        frameLayout.addView(linearLayout3, LayoutHelper.createFrame(-2, -2, 17));
        RLottieImageView rLottieImageView = new RLottieImageView(activity);
        rLottieImageView.setAutoRepeat(true);
        rLottieImageView.setAnimation(R.raw.statistic_preload, 120, 120, null);
        rLottieImageView.playAnimation();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i9 = Theme.key_player_actionBarTitle;
        textView.setTextColor(Theme.getColor(null, i9, false));
        textView.setTag(Integer.valueOf(i9));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i10 = Theme.key_player_actionBarSubtitle;
        textView2.setTextColor(Theme.getColor(null, i10, false));
        textView2.setTag(Integer.valueOf(i10));
        zzkg.m(R.string.LoadingStatsDescription, textView2, 1);
        linearLayout3.addView(rLottieImageView, LayoutHelper.createLinear(120, 120, 1, 0, 0, 0, 20));
        linearLayout3.addView(textView, LayoutHelper.createLinear(-2, -2, 1, 0, 0, 0, 10));
        linearLayout3.addView(textView2, LayoutHelper.createLinear(-2, -2, 1));
        addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
    }

    public static BottomSheet makeLearnSheet(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, resourcesProvider, false, false);
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        linearLayoutM.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setImageResource(R.drawable.large_monetize);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        rLottieImageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
        linearLayoutM.addView(rLottieImageView, LayoutHelper.createLinear(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        zzkk.m(20.0f, 1, textView);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        textView.setText(LocaleController.getString(z ? R.string.BotMonetizationInfoTitle : R.string.MonetizationInfoTitle));
        linearLayoutM.addView(textView, LayoutHelper.createLinear(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        linearLayoutM.addView(new PhotoViewer.AnonymousClass19(context, R.drawable.msg_channel, LocaleController.getString(z ? R.string.BotMonetizationInfoFeature1Name : R.string.MonetizationInfoFeature1Name), LocaleController.getString(z ? R.string.BotMonetizationInfoFeature1Text : R.string.MonetizationInfoFeature1Text), resourcesProvider), LayoutHelper.createLinear(-1, -2, 49, 8, 0, 8, 16));
        linearLayoutM.addView(new PhotoViewer.AnonymousClass19(context, R.drawable.menu_feature_split, LocaleController.getString(z ? R.string.BotMonetizationInfoFeature2Name : R.string.MonetizationInfoFeature2Name), LocaleController.getString(z ? R.string.BotMonetizationInfoFeature2Text : R.string.MonetizationInfoFeature2Text), resourcesProvider), LayoutHelper.createLinear(-1, -2, 49, 8, 0, 8, 16));
        linearLayoutM.addView(new PhotoViewer.AnonymousClass19(context, R.drawable.menu_feature_withdrawals, LocaleController.getString(z ? R.string.BotMonetizationInfoFeature3Name : R.string.MonetizationInfoFeature3Name), LocaleController.getString(z ? R.string.BotMonetizationInfoFeature3Text : R.string.MonetizationInfoFeature3Text), resourcesProvider), LayoutHelper.createLinear(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        view.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
        linearLayoutM.addView(view, LayoutHelper.createLinear(-1, 55, 12, 0, 12, 1.0f / AndroidUtilities.density, 0));
        AnimatedEmojiSpan.TextViewEmojis textViewEmojis = new AnimatedEmojiSpan.TextViewEmojis(context);
        textViewEmojis.setGravity(17);
        textViewEmojis.setTextSize(1, 20.0f);
        textViewEmojis.setTypeface(AndroidUtilities.bold());
        textViewEmojis.setTextColor(Theme.getColor(i, resourcesProvider));
        SpannableString spannableString = new SpannableString("💎");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_gram_72);
        coloredImageSpan.setScale(0.9f, 0.9f);
        coloredImageSpan.setColorKey(Theme.key_windowBackgroundWhiteBlueText2);
        coloredImageSpan.setRelativeSize(textViewEmojis.getPaint().getFontMetricsInt());
        coloredImageSpan.spaceScaleX = 0.9f;
        spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
        textViewEmojis.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(z ? R.string.BotMonetizationInfoTONTitle : R.string.MonetizationInfoTONTitle), spannableString));
        linearLayoutM.addView(textViewEmojis, LayoutHelper.createLinear(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
        linksTextView.setGravity(17);
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setTextColor(Theme.getColor(i, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        linksTextView.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(z ? R.string.BotMonetizationInfoTONText : R.string.MonetizationInfoTONText)), new FileLoader$$ExternalSyntheticLambda1(11, context, z)));
        linearLayoutM.addView(linksTextView, LayoutHelper.createLinear(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        ButtonWithCounterView buttonWithCounterViewM = zzlp.m(context, resourcesProvider, true);
        buttonWithCounterViewM.setText(LocaleController.getString(R.string.GotIt), false, true);
        buttonWithCounterViewM.setOnClickListener(new TagEditCell$$ExternalSyntheticLambda2(bottomSheetM, 2));
        linearLayoutM.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 55, 10, 25, 10, 14));
        bottomSheetM.setCustomView(linearLayoutM);
        return bottomSheetM;
    }

    public static CharSequence replaceTON(CharSequence charSequence, TextPaint textPaint, float f, float f2, boolean z) {
        if (tonString == null) {
            tonString = new HashMap();
        }
        int i = ((textPaint.getFontMetricsInt().bottom * (z ? 1 : -1)) * ((int) (f * 100.0f))) - ((int) (100.0f * f2));
        SpannableString spannableString = (SpannableString) tonString.get(Integer.valueOf(i));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z) {
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_gram_72);
                coloredImageSpan.setScale(f, f);
                coloredImageSpan.setColorKey(Theme.key_windowBackgroundWhiteBlueText2);
                coloredImageSpan.setRelativeSize(textPaint.getFontMetricsInt());
                coloredImageSpan.spaceScaleX = 0.9f;
                spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
            } else {
                ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mini_gram_16);
                coloredImageSpan2.setScale(f, f);
                coloredImageSpan2.setTranslateY(f2);
                coloredImageSpan2.spaceScaleX = 0.95f;
                spannableString.setSpan(coloredImageSpan2, 0, spannableString.length(), 33);
            }
            tonString.put(Integer.valueOf(i), spannableString);
        }
        return AndroidUtilities.replaceMultipleCharSequence("TON", charSequence, spannableString);
    }

    public static void showTransactionSheet(Context context, int i, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j, Theme.ResourcesProvider resourcesProvider) {
        long j2;
        long j3;
        long j4;
        String str;
        long j5;
        boolean z;
        byte b;
        boolean z2;
        BottomSheet bottomSheet;
        String userName;
        TLObject tLObject;
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, resourcesProvider, false, false);
        LinearLayout linearLayoutM = zzkf.m(context, 1);
        boolean z3 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z3) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            String string = LocaleController.getString(R.string.MonetizationTransactionDetailWithdraw);
            j2 = 0;
            j3 = tL_broadcastRevenueTransactionWithdrawal.date;
            j4 = tL_broadcastRevenueTransactionWithdrawal.amount;
            bottomSheetM = bottomSheetM;
            z2 = tL_broadcastRevenueTransactionWithdrawal.pending;
            j5 = 0;
            b = -1;
            str = string;
            z = tL_broadcastRevenueTransactionWithdrawal.failed;
        } else {
            j2 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                String string2 = LocaleController.getString(R.string.MonetizationTransactionDetailProceed);
                j3 = tL_broadcastRevenueTransactionProceeds.from_date;
                j5 = tL_broadcastRevenueTransactionProceeds.to_date;
                j4 = tL_broadcastRevenueTransactionProceeds.amount;
                str = string2;
            } else {
                if (!(broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund)) {
                    return;
                }
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                String string3 = LocaleController.getString(R.string.MonetizationTransactionDetailRefund);
                j3 = tL_broadcastRevenueTransactionRefund.from_date;
                j4 = tL_broadcastRevenueTransactionRefund.amount;
                str = string3;
                j5 = 0;
            }
            z = false;
            b = 1;
            z2 = false;
        }
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        long j6 = j5;
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        zzkh.m(18.0f, textView);
        long j7 = j4;
        textView.setTextColor(Theme.getColor(null, b < 0 ? Theme.key_text_RedBold : Theme.key_avatar_nameInMessageGreen, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (b < 0 ? "-" : "+"));
        boolean z4 = z;
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j7) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int iIndexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, iIndexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        String str2 = str;
        textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
        if (z2) {
            textView2.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
        } else if (j3 == j2) {
            textView2.setText(LocaleController.formatShortDateTime(j6));
        } else if (j6 == j2) {
            textView2.setText(LocaleController.formatShortDateTime(j3));
        } else {
            textView2.setText(LocaleController.formatShortDateTime(j3) + " - " + LocaleController.formatShortDateTime(j6));
        }
        if (z4) {
            textView2.setTextColor(Theme.getColor(Theme.key_text_RedBold, resourcesProvider));
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        linearLayoutM.addView(textView2, LayoutHelper.createLinear(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        zzkh.m(14.0f, textView3);
        textView3.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        textView3.setText(str2);
        linearLayoutM.addView(textView3, LayoutHelper.createLinear(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), Theme.getColor(Theme.key_groupcreate_spanBackground, resourcesProvider)));
            if (j < j2) {
                TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
                if (chat == null) {
                    userName = "";
                    tLObject = chat;
                } else {
                    userName = chat.title;
                    tLObject = chat;
                }
            } else {
                TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
                userName = UserObject.getUserName(user);
                tLObject = user;
            }
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            avatarDrawable.setInfo(tLObject);
            backupImageView.imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
            backupImageView.onNewImageSet();
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(28, 28, 51));
            TextView textView4 = new TextView(context);
            textView4.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, LayoutHelper.createFrame(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            linearLayoutM.addView(frameLayout, LayoutHelper.createLinear(-2, 28, 1, 42, 10, 42, 0));
        }
        int i2 = 1;
        ButtonWithCounterView buttonWithCounterViewM = zzlp.m(context, resourcesProvider, true);
        if (z3) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                buttonWithCounterViewM.setText(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false, true);
                buttonWithCounterViewM.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda77(context, tL_broadcastRevenueTransactionWithdrawal2, false, 20));
                bottomSheet = bottomSheetM;
            } else {
                buttonWithCounterViewM.setText(LocaleController.getString(R.string.OK), false, true);
                BottomSheet bottomSheet2 = bottomSheetM;
                buttonWithCounterViewM.setOnClickListener(new TagEditCell$$ExternalSyntheticLambda2(bottomSheet2, i2));
                bottomSheet = bottomSheet2;
            }
        } else {
            buttonWithCounterViewM.setText(LocaleController.getString(R.string.OK), false, true);
            BottomSheet bottomSheet3 = bottomSheetM;
            buttonWithCounterViewM.setOnClickListener(new TagEditCell$$ExternalSyntheticLambda2(bottomSheet3, i2));
            bottomSheet = bottomSheet3;
        }
        linearLayoutM.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 55, 18, 30, 18, 14));
        bottomSheet.setCustomView(linearLayoutM);
        bottomSheet.show();
    }

    public final void applyStarsStats(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        FrameLayout frameLayout;
        ChartData chartData;
        ArrayList arrayList;
        boolean z = this.starsRevenueChart == null;
        this.stars_rate = tL_payments_starsRevenueStats.usd_rate;
        StatisticActivity.ChartViewData chartViewDataCreateViewData = StatisticActivity.createViewData(tL_payments_starsRevenueStats.revenue_graph, LocaleController.getString(R.string.MonetizationGraphStarsRevenue), 2, false);
        this.starsRevenueChart = chartViewDataCreateViewData;
        if (chartViewDataCreateViewData != null && (chartData = chartViewDataCreateViewData.chartData) != null && (arrayList = chartData.lines) != null && !arrayList.isEmpty() && this.starsRevenueChart.chartData.lines.get(0) != null) {
            ((ChartData.Line) this.starsRevenueChart.chartData.lines.get(0)).colorKey = Theme.key_statisticChartLine_golden;
            this.starsRevenueChart.chartData.yRate = (float) ((1.0d / this.stars_rate) / 100.0d);
        }
        setupBalances(false, tL_payments_starsRevenueStats.status);
        if (!this.tonRevenueAvailable && (frameLayout = this.progress) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new ChannelMonetizationLayout$$ExternalSyntheticLambda3(this, 7)).start();
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (universalRecyclerView != null) {
            universalRecyclerView.adapter.update(!z);
            if (z) {
                universalRecyclerView.scrollToPosition(0);
            }
        }
    }

    public final void checkLearnSheet() {
        if (isAttachedToWindow() && this.tonRevenueAvailable && this.proceedsAvailable && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            this.fragment.showDialog(makeLearnSheet(getContext(), this.resourcesProvider, false));
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void initWithdraw(boolean z, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty;
        TLRPC.InputCheckPasswordSRP tL_inputCheckPasswordEmpty2;
        StatisticActivity statisticActivity = this.fragment;
        if (statisticActivity == null) {
            return;
        }
        Activity parentActivity = statisticActivity.getParentActivity();
        int i = this.currentAccount;
        TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
        if (parentActivity == null || currentUser == null) {
            return;
        }
        long j = this.dialogId;
        if (z) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i).getInputPeer(j);
            if (tL_inputCheckPasswordSRP == null) {
                tL_inputCheckPasswordEmpty2 = tL_inputCheckPasswordSRP;
                tL_inputCheckPasswordEmpty2 = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_inputCheckPasswordEmpty2 = tL_inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.password = tL_inputCheckPasswordEmpty2;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = this.starsBalanceEditTextValue;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i).getInputPeer(j);
            if (tL_inputCheckPasswordSRP == null) {
                tL_inputCheckPasswordEmpty = tL_inputCheckPasswordSRP;
                tL_inputCheckPasswordEmpty = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_inputCheckPasswordEmpty = tL_inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.password = tL_inputCheckPasswordEmpty;
        }
        ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new ChatActivity$$ExternalSyntheticLambda471(this, twoStepVerificationActivity, parentActivity, z, 1));
    }

    public final void loadStarsStats(boolean z) {
        if (this.starsRevenueAvailable) {
            int i = this.currentAccount;
            BotStarsController botStarsController = BotStarsController.getInstance(i);
            long j = this.dialogId;
            TLRPC.TL_payments_starsRevenueStats starsRevenueStats = botStarsController.getStarsRevenueStats(j, z);
            if (starsRevenueStats != null) {
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda7(15, this, starsRevenueStats));
                return;
            }
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i).getInputPeer(j);
            tL_payments_getStarsRevenueStats.dark = Theme.currentTheme.isDark();
            ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new ChannelMonetizationLayout$$ExternalSyntheticLambda29(this, 2));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        instance = this;
        super.onAttachedToWindow();
        checkLearnSheet();
    }

    @Override
    public final void onDetachedFromWindow() {
        instance = null;
        super.onDetachedFromWindow();
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setCastShadows(true);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override
    public final void onNestedPreScroll(ViewGroup viewGroup, int i, int i2, int[] iArr, int i3) {
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (viewGroup == universalRecyclerView) {
            ChannelTransactionsView channelTransactionsView = this.transactionsLayout;
            if (channelTransactionsView.isAttachedToWindow()) {
                ((View) channelTransactionsView.getParent()).getTop();
                int i4 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
                ActionBar.getCurrentActionBarHeight();
                int bottom = ((View) channelTransactionsView.getParent()).getBottom();
                if (i2 >= 0) {
                    if (i2 > 0) {
                        RecyclerListView currentListView = channelTransactionsView.getCurrentListView();
                        if (universalRecyclerView.getHeight() - bottom < AndroidUtilities.dp(8.0f) + universalRecyclerView.getPaddingBottom() || currentListView == null || currentListView.canScrollVertically(1)) {
                            return;
                        }
                        iArr[1] = i2;
                        universalRecyclerView.stopScroll();
                        return;
                    }
                    return;
                }
                ActionBar actionBar = this.actionBar;
                if (actionBar != null) {
                    actionBar.setCastShadows(!isAttachedToWindow() || universalRecyclerView.getHeight() - bottom < 0);
                }
                if (universalRecyclerView.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + universalRecyclerView.getPaddingBottom()) {
                    RecyclerListView currentListView2 = channelTransactionsView.getCurrentListView();
                    int iFindFirstVisibleItemPosition = ((LinearLayoutManager) currentListView2.getLayoutManager()).findFirstVisibleItemPosition();
                    if (iFindFirstVisibleItemPosition != -1) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = currentListView2.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                        int top = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView.getTop() : -1;
                        int paddingTop = currentListView2.getPaddingTop();
                        if (top == paddingTop && iFindFirstVisibleItemPosition == 0) {
                            return;
                        }
                        iArr[1] = iFindFirstVisibleItemPosition != 0 ? i2 : Math.max(i2, top - paddingTop);
                        currentListView2.scrollBy(0, i2);
                    }
                }
            }
        }
    }

    @Override
    public final void onNestedScroll(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
    }

    @Override
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.nestedScrollingParentHelper.count = i;
    }

    @Override
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i == 2;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    public final void reloadTransactions() {
        ChannelMonetizationLayout$$ExternalSyntheticLambda3 channelMonetizationLayout$$ExternalSyntheticLambda3;
        ChannelTransactionsView channelTransactionsView = this.transactionsLayout;
        boolean zHasTransactions = channelTransactionsView.hasTransactions();
        for (int i = 0; i < 2; i++) {
            boolean[] zArr = channelTransactionsView.loadingTransactions;
            if (zArr[i]) {
                return;
            }
            if (i == 1) {
                channelTransactionsView.tonTransactions.clear();
                channelTransactionsView.tonTransactionsLastOffset = "";
            } else {
                channelTransactionsView.starsTransactions.clear();
                channelTransactionsView.starsLastOffset = "";
            }
            zArr[i] = false;
            channelTransactionsView.loadTransactions(i);
        }
        if (channelTransactionsView.hasTransactions() == zHasTransactions || (channelMonetizationLayout$$ExternalSyntheticLambda3 = channelTransactionsView.updateParentList) == null) {
            return;
        }
        channelTransactionsView.updateTabs();
        channelMonetizationLayout$$ExternalSyntheticLambda3.run();
    }

    public void setActionBar(ActionBar actionBar) {
        this.actionBar = actionBar;
    }

    public final void setupBalances(boolean z, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        ChannelMonetizationLayout channelMonetizationLayout;
        UniversalAdapter universalAdapter;
        int i;
        AnimatedTextView animatedTextView = this.balanceSubtitle;
        RelativeSizeSpan relativeSizeSpan = this.balanceTitleSizeSpan;
        AnimatedTextView animatedTextView2 = this.balanceTitle;
        ProceedOverview proceedOverview = this.lifetimeValue;
        ProceedOverview proceedOverview2 = this.lastWithdrawalValue;
        ProceedOverview proceedOverview3 = this.availableValue;
        if (z) {
            proceedOverview3.contains1 = true;
            long j = tL_starsRevenueStatus.available_balance.amount;
            proceedOverview3.crypto_amount = j;
            double d = j / 1.0E9d;
            long j2 = (long) (this.ton_rate * d * 100.0d);
            proceedOverview3.amount = j2;
            if (this.formatter == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                this.formatter = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i = 6;
                this.formatter.setMaximumFractionDigits(6);
                this.formatter.setGroupingUsed(false);
            } else {
                i = 6;
            }
            DecimalFormat decimalFormat2 = this.formatter;
            if (d > 1.5d) {
                i = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replaceTON("TON " + this.formatter.format(d), animatedTextView2.getPaint(), 0.9f, 0.0f, true));
            int iIndexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (iIndexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, iIndexOf, spannableStringBuilder.length(), 33);
            }
            animatedTextView2.setText(spannableStringBuilder);
            animatedTextView.setText("≈" + BillingController.getInstance().formatCurrency(j2, "USD"));
            proceedOverview3.currency = "USD";
            proceedOverview2.contains1 = true;
            long j3 = tL_starsRevenueStatus.current_balance.amount;
            proceedOverview2.crypto_amount = j3;
            channelMonetizationLayout = this;
            double d2 = channelMonetizationLayout.ton_rate;
            proceedOverview2.amount = (long) ((j3 / 1.0E9d) * d2 * 100.0d);
            proceedOverview2.currency = "USD";
            proceedOverview.contains1 = true;
            long j4 = tL_starsRevenueStatus.overall_revenue.amount;
            proceedOverview.crypto_amount = j4;
            proceedOverview.amount = (long) ((j4 / 1.0E9d) * d2 * 100.0d);
            proceedOverview.currency = "USD";
            channelMonetizationLayout.proceedsAvailable = true;
            channelMonetizationLayout.balanceButton.setVisibility((tL_starsRevenueStatus.available_balance.amount <= 0 || !tL_starsRevenueStatus.withdrawal_enabled) ? 8 : 0);
        } else {
            channelMonetizationLayout = this;
            double d3 = channelMonetizationLayout.stars_rate;
            if (d3 == 0.0d) {
                return;
            }
            proceedOverview3.contains2 = true;
            TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
            proceedOverview3.crypto_amount2 = starsAmount;
            proceedOverview3.amount2 = (long) (starsAmount.amount * d3 * 100.0d);
            int i2 = tL_starsRevenueStatus.next_withdrawal_at;
            AnonymousClass6 anonymousClass6 = channelMonetizationLayout.starsBalanceButton;
            if (animatedTextView2 != null && animatedTextView != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(StarsIntroActivity.replaceStarsWithPlain(false, TextUtils.concat("XTR ", StarsIntroActivity.formatStarsAmount(starsAmount, 0.8f, ' ')), 1.0f, null));
                int iIndexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                if (iIndexOf2 >= 0) {
                    spannableStringBuilder2.setSpan(relativeSizeSpan, iIndexOf2, spannableStringBuilder2.length(), 33);
                }
                channelMonetizationLayout.starsBalance = starsAmount;
                channelMonetizationLayout.starsBalanceTitle.setText(spannableStringBuilder2);
                channelMonetizationLayout.starsBalanceSubtitle.setText("≈" + BillingController.getInstance().formatCurrency((long) (channelMonetizationLayout.stars_rate * starsAmount.amount * 100.0d), "USD"));
                channelMonetizationLayout.starsBalanceEditTextContainer.setVisibility(starsAmount.amount > 0 ? 0 : 8);
                if (channelMonetizationLayout.starsBalanceEditTextAll) {
                    channelMonetizationLayout.starsBalanceEditTextIgnore = true;
                    long j5 = starsAmount.amount;
                    channelMonetizationLayout.starsBalanceEditTextValue = j5;
                    String string = Long.toString(j5);
                    WebActionBar.AnonymousClass4 anonymousClass4 = channelMonetizationLayout.starsBalanceEditText;
                    anonymousClass4.setText(string);
                    anonymousClass4.setSelection(anonymousClass4.getText().length());
                    channelMonetizationLayout.starsBalanceEditTextIgnore = false;
                    anonymousClass6.setEnabled(channelMonetizationLayout.starsBalanceEditTextValue > 0);
                }
                ButtonWithCounterView buttonWithCounterView = channelMonetizationLayout.starsAdsButton;
                if (buttonWithCounterView != null) {
                    buttonWithCounterView.setEnabled(starsAmount.amount > 0);
                }
                channelMonetizationLayout.starsBalanceBlockedUntil = i2;
                ChannelMonetizationLayout$$ExternalSyntheticLambda8 channelMonetizationLayout$$ExternalSyntheticLambda8 = channelMonetizationLayout.setStarsBalanceButtonText;
                AndroidUtilities.cancelRunOnUIThread(channelMonetizationLayout$$ExternalSyntheticLambda8);
                channelMonetizationLayout$$ExternalSyntheticLambda8.run();
            }
            proceedOverview3.currency = "USD";
            proceedOverview2.contains2 = true;
            TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus.current_balance;
            proceedOverview2.crypto_amount2 = starsAmount2;
            double d4 = starsAmount2.amount;
            double d5 = channelMonetizationLayout.stars_rate;
            proceedOverview2.amount2 = (long) (d4 * d5 * 100.0d);
            proceedOverview2.currency = "USD";
            proceedOverview.contains2 = true;
            TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.overall_revenue;
            proceedOverview.crypto_amount2 = starsAmount3;
            proceedOverview.amount2 = (long) (starsAmount3.amount * d5 * 100.0d);
            proceedOverview.currency = "USD";
            channelMonetizationLayout.proceedsAvailable = true;
            LinearLayout linearLayout = channelMonetizationLayout.starsBalanceButtonsLayout;
            if (linearLayout != null) {
                linearLayout.setVisibility(tL_starsRevenueStatus.withdrawal_enabled ? 0 : 8);
            }
            if (anonymousClass6 != null) {
                anonymousClass6.setVisibility((tL_starsRevenueStatus.available_balance.amount > 0 || BuildVars.DEBUG_PRIVATE_VERSION) ? 0 : 8);
            }
        }
        UniversalRecyclerView universalRecyclerView = channelMonetizationLayout.listView;
        if (universalRecyclerView == null || (universalAdapter = universalRecyclerView.adapter) == null) {
            return;
        }
        universalAdapter.update(true);
    }

    @Override
    public final void onNestedScroll(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ChannelTransactionsView channelTransactionsView = this.transactionsLayout;
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (viewGroup == universalRecyclerView) {
            try {
                if (channelTransactionsView.isAttachedToWindow()) {
                    RecyclerListView currentListView = channelTransactionsView.getCurrentListView();
                    int bottom = ((View) channelTransactionsView.getParent()).getBottom();
                    ActionBar actionBar = this.actionBar;
                    if (actionBar != null) {
                        actionBar.setCastShadows(!isAttachedToWindow() || universalRecyclerView.getHeight() - bottom < 0);
                    }
                    if (universalRecyclerView.getHeight() - bottom >= universalRecyclerView.getPaddingBottom() + AndroidUtilities.dp(8.0f)) {
                        iArr[1] = i4;
                        currentListView.scrollBy(0, i4);
                    }
                }
            } catch (Throwable th) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new ChannelMonetizationLayout$$ExternalSyntheticLambda3(this, 0));
            }
        }
    }

    @Override
    public final void onStopNestedScroll(int i, View view) {
        this.nestedScrollingParentHelper.count = 0;
    }
}
