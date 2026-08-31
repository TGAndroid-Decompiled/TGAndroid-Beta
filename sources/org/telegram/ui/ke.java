package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
public final class ke extends org.telegram.ui.Components.qv0 implements r0.n {
    public static ke f38356u1;
    public static HashMap f38357v1;
    public final CharSequence A0;
    public final CharSequence B0;
    public final CharSequence C0;
    public final eg.s3 D0;
    public final RelativeSizeSpan E0;
    public final org.telegram.ui.Components.k6 F0;
    public final org.telegram.ui.Components.k6 G0;
    public final qh.d H0;
    public int I0;
    public final eg.s3 J0;
    public TL_stars.StarsAmount K0;
    public final org.telegram.ui.Components.k6 L0;
    public final org.telegram.ui.Components.k6 M0;
    public final be N0;
    public final org.telegram.ui.Components.oq[] O0;
    public final LinearLayout P0;
    public final qh.d Q0;
    public final mh.l R0;
    public boolean S0;
    public boolean T0;
    public long U0;
    public final mh.m V0;
    public org.telegram.ui.Components.ic W0;
    public final org.telegram.ui.Components.i61 X0;
    public og.k Y0;
    public final FrameLayout Z0;
    public DecimalFormat f38358a1;
    public final ge f38359b1;
    public final boolean f38360c1;
    public final boolean f38361d1;
    public SpannableStringBuilder f38362e1;
    public final od f38363f1;
    public double f38364g1;
    public double f38365h1;
    public org.telegram.ui.ActionBar.k f38366i1;
    public boolean f38367j1;
    public boolean f38368k1;
    public t91 l1;
    public t91 f38369m1;
    public t91 f38370n1;
    public boolean f38371o1;
    public final he f38372p1;
    public final he f38373q1;
    public final he f38374r1;
    public final pd f38375s1;
    public final ha1 f38376t0;
    public final c5.e f38377t1;
    public final org.telegram.ui.ActionBar.g6 f38378u0;
    public final int f38379v0;
    public final long f38380w0;
    public TL_stories.TL_premium_boostsStatus f38381x0;
    public int f38382y0;
    public final CharSequence f38383z0;

    public ke(Activity activity, ha1 ha1Var, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10) {
        super(activity, null);
        int i11;
        int i12;
        this.K0 = TL_stars.StarsAmount.ofStars(0L);
        this.O0 = new org.telegram.ui.Components.oq[1];
        this.S0 = false;
        this.T0 = true;
        this.f38367j1 = false;
        this.f38368k1 = false;
        this.f38371o1 = false;
        String string = LocaleController.getString(R.string.MonetizationOverviewAvailable);
        he heVar = new he();
        heVar.f37467a = false;
        heVar.f37468b = "TON";
        heVar.h = "XTR";
        heVar.f37469c = string;
        this.f38372p1 = heVar;
        String string2 = LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal);
        he heVar2 = new he();
        heVar2.f37467a = false;
        heVar2.f37468b = "TON";
        heVar2.h = "XTR";
        heVar2.f37469c = string2;
        this.f38373q1 = heVar2;
        String string3 = LocaleController.getString(R.string.MonetizationOverviewTotal);
        he heVar3 = new he();
        heVar3.f37467a = false;
        heVar3.f37468b = "TON";
        heVar3.h = "XTR";
        heVar3.f37469c = string3;
        this.f38374r1 = heVar3;
        this.f38375s1 = new pd(this, 3);
        this.f38377t1 = new Object();
        this.f38360c1 = z4;
        this.f38361d1 = z10;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f38358a1 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.f38358a1.setMaximumFractionDigits(12);
        this.f38358a1.setGroupingUsed(false);
        this.f38376t0 = ha1Var;
        this.f38378u0 = g6Var;
        this.f38379v0 = i10;
        this.f38380w0 = j10;
        long j11 = -j10;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
        if (chat != null) {
            this.f38382y0 = chat.level;
        }
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j10, new vb(this, 1));
        c0(false);
        if (z4) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j11);
            if (chatFull != null) {
                boolean z11 = chatFull.restricted_sponsored;
                this.f38367j1 = z11;
                this.f38368k1 = z11;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new vd(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
        this.f38383z0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new s1(ha1Var, activity, g6Var, 13), g6Var), true);
        this.A0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled ? R.string.MonetizationBalanceInfo : R.string.MonetizationBalanceInfoNotAvailable), -1, 3, new pd(this, 8)), true);
        if (z10 && z4) {
            i11 = R.string.MonetizationProceedsStarsTONInfo;
        } else {
            i11 = z10 ? R.string.MonetizationProceedsStarsInfo : R.string.MonetizationProceedsTONInfo;
        }
        if (z10 && z4) {
            i12 = R.string.MonetizationProceedsStarsTONInfoLink;
        } else {
            i12 = z10 ? R.string.MonetizationProceedsStarsInfoLink : R.string.MonetizationProceedsTONInfoLink;
        }
        this.B0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new od(this, i12, 0), g6Var), true);
        this.C0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat2) ? R.string.MonetizationStarsInfo : R.string.MonetizationStarsInfoGroup), new pd(this, 0)), true);
        int i13 = org.telegram.ui.ActionBar.k6.f21605a7;
        setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
        this.f38359b1 = new ge(this, activity, i10, j10, ha1Var.getClassGuid(), new pd(this, 1), g6Var);
        eg.s3 s3Var = new eg.s3(activity, 3);
        this.D0 = s3Var;
        s3Var.setOrientation(1);
        int i14 = org.telegram.ui.ActionBar.k6.f21659d6;
        s3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i14, g6Var));
        s3Var.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(activity, false, true, true);
        this.F0 = k6Var;
        k6Var.setTypeface(AndroidUtilities.bold());
        int i15 = org.telegram.ui.ActionBar.k6.G6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i15, g6Var));
        k6Var.setTextSize(AndroidUtilities.dp(32.0f));
        k6Var.setGravity(17);
        this.E0 = new RelativeSizeSpan(0.6770833f);
        s3Var.addView(k6Var, k7.c6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(activity, true, true, true);
        this.G0 = k6Var2;
        k6Var2.setGravity(17);
        int i16 = org.telegram.ui.ActionBar.k6.f22036y6;
        k6Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i16, g6Var));
        k6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        s3Var.addView(k6Var2, k7.c6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        qh.d dVar = new qh.d(activity, g6Var, true);
        dVar.setRoundRadius(24);
        this.H0 = dVar;
        dVar.setEnabled(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled);
        dVar.g(LocaleController.getString(R.string.MonetizationWithdraw), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new org.telegram.messenger.video.g(13, this, ha1Var));
        s3Var.addView(dVar, k7.c6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        eg.s3 s3Var2 = new eg.s3(activity, 4);
        this.J0 = s3Var2;
        s3Var2.setOrientation(1);
        s3Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i14, g6Var));
        s3Var2.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.k6 k6Var3 = new org.telegram.ui.Components.k6(activity, false, true, true);
        this.L0 = k6Var3;
        k6Var3.setTypeface(AndroidUtilities.bold());
        k6Var3.setTextColor(org.telegram.ui.ActionBar.k6.v0(i15, g6Var));
        k6Var3.setTextSize(AndroidUtilities.dp(32.0f));
        k6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        s3Var2.addView(k6Var3, k7.c6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.k6 k6Var4 = new org.telegram.ui.Components.k6(activity, true, true, true);
        this.M0 = k6Var4;
        k6Var4.setGravity(17);
        k6Var4.setTextColor(org.telegram.ui.ActionBar.k6.v0(i16, g6Var));
        k6Var4.setTextSize(AndroidUtilities.dp(14.0f));
        s3Var2.addView(k6Var4, k7.c6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        mh.l lVar = new mh.l(this, activity, 1);
        this.R0 = lVar;
        lVar.setVisibility(8);
        lVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        lVar.setLeftPadding(AndroidUtilities.dp(36.0f));
        mh.m mVar = new mh.m(activity, 1);
        this.V0 = mVar;
        mVar.setFocusable(false);
        mVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(i15, g6Var));
        mVar.setCursorSize(AndroidUtilities.dp(20.0f));
        mVar.setCursorWidth(1.5f);
        mVar.setBackground(null);
        mVar.setTextSize(1, 18.0f);
        mVar.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        mVar.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        mVar.setInputType(2);
        mVar.setTypeface(Typeface.DEFAULT);
        mVar.setHighlightColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21970uf, g6Var));
        mVar.setHandlesColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21988vf, g6Var));
        mVar.setGravity(LocaleController.isRTL ? 5 : 3);
        mVar.setOnFocusChangeListener(new qd(this, 0));
        mVar.addTextChangedListener(new ae(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, k7.c6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(mVar, k7.c6.o(-1, -2, 1.0f, 119));
        lVar.e(mVar);
        lVar.addView(linearLayout, k7.c6.e(-1, -2, 48));
        s3Var2.addView(lVar, k7.c6.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.P0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? dVar2 = new qh.d(activity, g6Var, true);
        dVar2.setRoundRadius(24);
        this.N0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.g(LocaleController.formatPluralString("MonetizationStarsWithdraw", 0, new Object[0]), false, true);
        dVar2.setVisibility(0);
        dVar2.setOnClickListener(new eg.k2(this, i10, ha1Var, 6));
        qh.d dVar3 = new qh.d(activity, g6Var, true);
        dVar3.setRoundRadius(24);
        this.Q0 = dVar3;
        dVar3.setEnabled(false);
        dVar3.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        dVar3.setOnClickListener(new rd(this, i10, j10, activity));
        linearLayout2.addView((View) dVar2, k7.c6.o(-1, 48, 1.0f, 119));
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            linearLayout2.addView(new Space(activity), k7.c6.o(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar3, k7.c6.o(-1, 48, 1.0f, 119));
        }
        s3Var2.addView(linearLayout2, k7.c6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        mVar.setOnEditorActionListener(new yd(0, this, ha1Var));
        this.f38363f1 = new od(this, i10, 2);
        org.telegram.ui.Components.i61 i61Var = new org.telegram.ui.Components.i61(ha1Var, new d5(this, 2), new zd(this), new zd(this));
        this.X0 = i61Var;
        i61Var.setClipToPadding(false);
        i61Var.p1();
        addView(i61Var);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Z0 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
        frameLayout.addView(linearLayout3, k7.c6.e(-2, -2, 17));
        ?? imageView2 = new ImageView(activity);
        imageView2.setAutoRepeat(true);
        imageView2.f(R.raw.statistic_preload, 120, 120, null);
        imageView2.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i17 = org.telegram.ui.ActionBar.k6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i17, false));
        textView.setTag(Integer.valueOf(i17));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i18 = org.telegram.ui.ActionBar.k6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i18, false));
        textView2.setTag(Integer.valueOf(i18));
        org.telegram.messenger.y3.r(R.string.LoadingStatsDescription, textView2, 1);
        linearLayout3.addView((View) imageView2, k7.c6.t(120, 120, 1, 0, 0, 0, 20));
        linearLayout3.addView(textView, k7.c6.t(-2, -2, 1, 0, 0, 0, 10));
        linearLayout3.addView(textView2, k7.c6.q(-2, -2, 1));
        addView(frameLayout, k7.c6.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.h3 d0(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, g6Var, false, false);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_monetize);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var)));
        f10.addView(imageView, k7.c6.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        yh.p(20.0f, 1, textView);
        int i19 = org.telegram.ui.ActionBar.k6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i19, g6Var));
        if (z4) {
            i10 = R.string.BotMonetizationInfoTitle;
        } else {
            i10 = R.string.MonetizationInfoTitle;
        }
        textView.setText(LocaleController.getString(i10));
        f10.addView(textView, k7.c6.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        int i20 = R.drawable.msg_channel;
        if (z4) {
            i11 = R.string.BotMonetizationInfoFeature1Name;
        } else {
            i11 = R.string.MonetizationInfoFeature1Name;
        }
        String string = LocaleController.getString(i11);
        if (z4) {
            i12 = R.string.BotMonetizationInfoFeature1Text;
        } else {
            i12 = R.string.MonetizationInfoFeature1Text;
        }
        f10.addView(new eh.d(context, i20, string, LocaleController.getString(i12), g6Var), k7.c6.t(-1, -2, 49, 8, 0, 8, 16));
        int i21 = R.drawable.menu_feature_split;
        if (z4) {
            i13 = R.string.BotMonetizationInfoFeature2Name;
        } else {
            i13 = R.string.MonetizationInfoFeature2Name;
        }
        String string2 = LocaleController.getString(i13);
        if (z4) {
            i14 = R.string.BotMonetizationInfoFeature2Text;
        } else {
            i14 = R.string.MonetizationInfoFeature2Text;
        }
        f10.addView(new eh.d(context, i21, string2, LocaleController.getString(i14), g6Var), k7.c6.t(-1, -2, 49, 8, 0, 8, 16));
        int i22 = R.drawable.menu_feature_withdrawals;
        if (z4) {
            i15 = R.string.BotMonetizationInfoFeature3Name;
        } else {
            i15 = R.string.MonetizationInfoFeature3Name;
        }
        String string3 = LocaleController.getString(i15);
        if (z4) {
            i16 = R.string.BotMonetizationInfoFeature3Text;
        } else {
            i16 = R.string.MonetizationInfoFeature3Text;
        }
        f10.addView(new eh.d(context, i22, string3, LocaleController.getString(i16), g6Var), k7.c6.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21660d7, g6Var));
        f10.addView(view, k7.c6.s(-1, 55, 12, 0, 12, 1.0f / AndroidUtilities.density, 0));
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(context);
        t5Var.setGravity(17);
        t5Var.setTextSize(1, 20.0f);
        t5Var.setTypeface(AndroidUtilities.bold());
        t5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i19, g6Var));
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.mini_gram_72, 0);
        oqVar.setScale(0.9f, 0.9f);
        oqVar.setColorKey(org.telegram.ui.ActionBar.k6.f21857o6);
        oqVar.setRelativeSize(t5Var.getPaint().getFontMetricsInt());
        oqVar.spaceScaleX = 0.9f;
        spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
        if (z4) {
            i17 = R.string.BotMonetizationInfoTONTitle;
        } else {
            i17 = R.string.MonetizationInfoTONTitle;
        }
        t5Var.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(i17), spannableString));
        f10.addView(t5Var, k7.c6.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(context, g6Var);
        g90Var.setGravity(17);
        g90Var.setTextSize(1, 14.0f);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i19, g6Var));
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21720gc, g6Var));
        if (z4) {
            i18 = R.string.BotMonetizationInfoTONText;
        } else {
            i18 = R.string.MonetizationInfoTONText;
        }
        g90Var.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(i18)), new kh.f(16, context, z4)));
        f10.addView(g90Var, k7.c6.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        p10.g(LocaleController.getString(R.string.GotIt), false, true);
        p10.setOnClickListener(new sd(o10, 1));
        f10.addView(p10, k7.c6.t(-1, 48, 55, 10, 25, 10, 14));
        o10.setCustomView(f10);
        return o10;
    }

    public static CharSequence f0(CharSequence charSequence, TextPaint textPaint, float f10, float f11, boolean z4) {
        int i10;
        if (f38357v1 == null) {
            f38357v1 = new HashMap();
        }
        int i11 = textPaint.getFontMetricsInt().bottom;
        if (z4) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = ((i11 * i10) * ((int) (f10 * 100.0f))) - ((int) (100.0f * f11));
        SpannableString spannableString = (SpannableString) f38357v1.get(Integer.valueOf(i12));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z4) {
                org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.mini_gram_72, 0);
                oqVar.setScale(f10, f10);
                oqVar.setColorKey(org.telegram.ui.ActionBar.k6.f21857o6);
                oqVar.setRelativeSize(textPaint.getFontMetricsInt());
                oqVar.spaceScaleX = 0.9f;
                spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.oq oqVar2 = new org.telegram.ui.Components.oq(R.drawable.mini_gram_16, 0);
                oqVar2.setScale(f10, f10);
                oqVar2.setTranslateY(f11);
                oqVar2.spaceScaleX = 0.95f;
                spannableString.setSpan(oqVar2, 0, spannableString.length(), 33);
            }
            f38357v1.put(Integer.valueOf(i12), spannableString);
        }
        return AndroidUtilities.replaceMultipleCharSequence("TON", charSequence, spannableString);
    }

    public static void h0(Context context, int i10, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j10, org.telegram.ui.ActionBar.g6 g6Var) {
        long j11;
        org.telegram.ui.ActionBar.h3 h3Var;
        String string;
        long j12;
        long j13;
        long j14;
        boolean z4;
        char c3;
        String str;
        boolean z10;
        int i11;
        String str2;
        org.telegram.ui.ActionBar.h3 h3Var2;
        String userName;
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, g6Var, false, false);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        boolean z11 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z11) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            String string2 = LocaleController.getString(R.string.MonetizationTransactionDetailWithdraw);
            j11 = 0;
            j12 = tL_broadcastRevenueTransactionWithdrawal.amount;
            z4 = tL_broadcastRevenueTransactionWithdrawal.pending;
            h3Var = o10;
            j13 = tL_broadcastRevenueTransactionWithdrawal.date;
            j14 = 0;
            c3 = 65535;
            str = string2;
            z10 = tL_broadcastRevenueTransactionWithdrawal.failed;
        } else {
            j11 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                string = LocaleController.getString(R.string.MonetizationTransactionDetailProceed);
                long j15 = tL_broadcastRevenueTransactionProceeds.from_date;
                long j16 = tL_broadcastRevenueTransactionProceeds.to_date;
                h3Var = o10;
                j12 = tL_broadcastRevenueTransactionProceeds.amount;
                j14 = j16;
                j13 = j15;
            } else {
                h3Var = o10;
                if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                    TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                    string = LocaleController.getString(R.string.MonetizationTransactionDetailRefund);
                    j12 = tL_broadcastRevenueTransactionRefund.amount;
                    j13 = tL_broadcastRevenueTransactionRefund.from_date;
                    j14 = 0;
                } else {
                    return;
                }
            }
            z4 = false;
            c3 = 1;
            str = string;
            z10 = false;
        }
        long j17 = j14;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        boolean z12 = z4;
        b.g(18.0f, 1, textView);
        if (c3 < 0) {
            i11 = org.telegram.ui.ActionBar.k6.f21895q7;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f21805l8;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (c3 < 0) {
            str2 = "-";
        } else {
            str2 = "+";
        }
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j12) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        f10.addView(textView, k7.c6.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f22036y6, g6Var));
        if (z12) {
            textView2.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
        } else if (j13 == j11) {
            textView2.setText(LocaleController.formatShortDateTime(j17));
        } else if (j17 == j11) {
            textView2.setText(LocaleController.formatShortDateTime(j13));
        } else {
            textView2.setText(LocaleController.formatShortDateTime(j13) + " - " + LocaleController.formatShortDateTime(j17));
        }
        if (z10) {
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21895q7, g6Var));
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        f10.addView(textView2, k7.c6.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        b.g(14.0f, 1, textView3);
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        textView3.setText(str);
        f10.addView(textView3, k7.c6.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ci, g6Var)));
            if (j10 < j11) {
                TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                if (chat2 == null) {
                    userName = "";
                    chat = chat2;
                } else {
                    userName = chat2.title;
                    chat = chat2;
                }
            } else {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                userName = UserObject.getUserName(user);
                chat = user;
            }
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
            z8Var.p(chat);
            p9Var.e(chat, z8Var);
            frameLayout.addView(p9Var, k7.c6.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            textView4.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21766j5, g6Var));
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, k7.c6.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            f10.addView(frameLayout, k7.c6.t(-2, 28, 1, 42, 10, 42, 0));
        }
        qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        if (z11) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                p10.g(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false, true);
                p10.setOnClickListener(new org.telegram.messenger.video.g(14, context, tL_broadcastRevenueTransactionWithdrawal2));
                h3Var2 = h3Var;
                f10.addView(p10, k7.c6.t(-1, 48, 55, 18, 30, 18, 14));
                h3Var2.setCustomView(f10);
                h3Var2.show();
            }
        }
        p10.g(LocaleController.getString(R.string.OK), false, true);
        h3Var2 = h3Var;
        p10.setOnClickListener(new sd(h3Var2, 0));
        f10.addView(p10, k7.c6.t(-1, 48, 55, 18, 30, 18, 14));
        h3Var2.setCustomView(f10);
        h3Var2.show();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        int max;
        boolean z4;
        org.telegram.ui.Components.i61 i61Var = this.X0;
        if (viewGroup == i61Var) {
            ge geVar = this.f38359b1;
            if (geVar.isAttachedToWindow()) {
                ((View) geVar.getParent()).getTop();
                int i13 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
                org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int bottom = ((View) geVar.getParent()).getBottom();
                if (i11 < 0) {
                    org.telegram.ui.ActionBar.k kVar = this.f38366i1;
                    if (kVar != null) {
                        if (isAttachedToWindow() && i61Var.getHeight() - bottom >= 0) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        kVar.setCastShadows(z4);
                    }
                    if (i61Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + i61Var.getPaddingBottom()) {
                        org.telegram.ui.Components.tl0 currentListView = geVar.getCurrentListView();
                        int L0 = ((f2.j0) currentListView.getLayoutManager()).L0();
                        int i14 = -1;
                        if (L0 != -1) {
                            f2.m1 K = currentListView.K(L0);
                            if (K != null) {
                                i14 = K.f5875a.getTop();
                            }
                            int paddingTop = currentListView.getPaddingTop();
                            if (i14 != paddingTop || L0 != 0) {
                                if (L0 != 0) {
                                    max = i11;
                                } else {
                                    max = Math.max(i11, i14 - paddingTop);
                                }
                                iArr[1] = max;
                                currentListView.scrollBy(0, i11);
                            }
                        }
                    }
                } else if (i11 > 0) {
                    org.telegram.ui.Components.tl0 currentListView2 = geVar.getCurrentListView();
                    if (i61Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + i61Var.getPaddingBottom() && currentListView2 != null && !currentListView2.canScrollVertically(1)) {
                        iArr[1] = i11;
                        i61Var.B0();
                    }
                }
            }
        }
    }

    public final void Z(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        boolean z4;
        FrameLayout frameLayout;
        xf.b bVar;
        ArrayList arrayList;
        if (this.f38370n1 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f38365h1 = tL_payments_starsRevenueStats.usd_rate;
        t91 f02 = ha1.f0(tL_payments_starsRevenueStats.revenue_graph, LocaleController.getString(R.string.MonetizationGraphStarsRevenue), 2, false);
        this.f38370n1 = f02;
        if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f38370n1.d.d.get(0) != null) {
            ((xf.a) this.f38370n1.d.d.get(0)).f50544g = org.telegram.ui.ActionBar.k6.kj;
            this.f38370n1.d.h = (float) ((1.0d / this.f38365h1) / 100.0d);
        }
        g0(false, tL_payments_starsRevenueStats.status);
        if (!this.f38360c1 && (frameLayout = this.Z0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.pr.h).withEndAction(new pd(this, 7)).start();
        }
        org.telegram.ui.Components.i61 i61Var = this.X0;
        if (i61Var != null) {
            i61Var.V2.N(!z4);
            if (z4) {
                i61Var.u0(0);
            }
        }
    }

    public final void a0() {
        if (isAttachedToWindow() && this.f38360c1 && this.f38371o1 && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            this.f38376t0.showDialog(d0(getContext(), this.f38378u0, false));
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void b0(boolean z4, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        ha1 ha1Var = this.f38376t0;
        if (ha1Var != null) {
            Activity parentActivity = ha1Var.getParentActivity();
            int i10 = this.f38379v0;
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            if (parentActivity != null && currentUser != null) {
                long j10 = this.f38380w0;
                if (z4) {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                    tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                    tL_payments_getStarsRevenueWithdrawalUrl.amount = this.U0;
                } else {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                }
                ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new wd(this, twoStepVerificationActivity, parentActivity, z4, 0));
            }
        }
    }

    public final void c0(boolean z4) {
        if (!this.f38361d1) {
            return;
        }
        int i10 = this.f38379v0;
        mh.a0 g10 = mh.a0.g(i10);
        long j10 = this.f38380w0;
        TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, z4);
        if (h != null) {
            AndroidUtilities.runOnUIThread(new fc(6, this, h));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new vd(this, 2));
    }

    public final void e0() {
        ge geVar = this.f38359b1;
        pd pdVar = geVar.f37170e;
        boolean[] zArr = geVar.f37174s;
        boolean a2 = geVar.a();
        for (int i10 = 0; i10 < 2; i10++) {
            if (!zArr[i10]) {
                if (i10 == 1) {
                    geVar.h.clear();
                    geVar.f37171f = "";
                } else {
                    geVar.f37172n.clear();
                    geVar.f37173r = "";
                }
                zArr[i10] = false;
                geVar.c(i10);
            } else {
                return;
            }
        }
        if (geVar.a() != a2 && pdVar != null) {
            geVar.e();
            pdVar.run();
        }
    }

    public final void g0(boolean z4, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        he heVar;
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.x51 x51Var;
        he heVar2;
        int i13;
        int i14;
        ke keVar = this;
        he heVar3 = keVar.f38374r1;
        he heVar4 = keVar.f38373q1;
        org.telegram.ui.Components.k6 k6Var = keVar.G0;
        RelativeSizeSpan relativeSizeSpan = keVar.E0;
        org.telegram.ui.Components.k6 k6Var2 = keVar.F0;
        he heVar5 = keVar.f38372p1;
        if (z4) {
            heVar5.f37467a = true;
            long j10 = tL_starsRevenueStatus.available_balance.amount;
            heVar5.d = j10;
            double d = j10 / 1.0E9d;
            long j11 = (long) (keVar.f38364g1 * d * 100.0d);
            heVar5.f37470e = j11;
            if (keVar.f38358a1 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                heVar2 = heVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                keVar.f38358a1 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i13 = 6;
                keVar.f38358a1.setMaximumFractionDigits(6);
                keVar.f38358a1.setGroupingUsed(false);
            } else {
                heVar2 = heVar3;
                i13 = 6;
            }
            DecimalFormat decimalFormat2 = keVar.f38358a1;
            if (d > 1.5d) {
                i13 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i13);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f0("TON " + keVar.f38358a1.format(d), k6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            k6Var2.setText(spannableStringBuilder);
            k6Var.setText("≈" + BillingController.getInstance().formatCurrency(j11, "USD"));
            heVar5.f37471f = "USD";
            heVar4.f37467a = true;
            long j12 = tL_starsRevenueStatus.current_balance.amount;
            heVar4.d = j12;
            keVar = this;
            double d10 = keVar.f38364g1;
            heVar4.f37470e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            heVar4.f37471f = "USD";
            he heVar6 = heVar2;
            heVar6.f37467a = true;
            long j13 = tL_starsRevenueStatus.overall_revenue.amount;
            heVar6.d = j13;
            heVar6.f37470e = (long) ((j13 / 1.0E9d) * d10 * 100.0d);
            heVar6.f37471f = "USD";
            keVar.f38371o1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            keVar.H0.setVisibility(i14);
        } else {
            double d11 = keVar.f38365h1;
            if (d11 != 0.0d) {
                heVar5.f37472g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
                heVar5.f37473i = starsAmount;
                heVar5.f37474j = (long) (starsAmount.amount * d11 * 100.0d);
                int i15 = tL_starsRevenueStatus.next_withdrawal_at;
                be beVar = keVar.N0;
                if (k6Var2 == null || k6Var == null) {
                    heVar = heVar3;
                } else {
                    heVar = heVar3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(mh.ja.X0(false, TextUtils.concat("XTR ", mh.ja.J0(starsAmount, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    keVar.K0 = starsAmount;
                    keVar.L0.setText(spannableStringBuilder2);
                    keVar.M0.setText("≈" + BillingController.getInstance().formatCurrency((long) (keVar.f38365h1 * starsAmount.amount * 100.0d), "USD"));
                    if (starsAmount.amount > 0) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    keVar.R0.setVisibility(i12);
                    if (keVar.T0) {
                        keVar.S0 = true;
                        long j14 = starsAmount.amount;
                        keVar.U0 = j14;
                        String l10 = Long.toString(j14);
                        mh.m mVar = keVar.V0;
                        mVar.setText(l10);
                        mVar.setSelection(mVar.getText().length());
                        keVar.S0 = false;
                        if (keVar.U0 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        beVar.setEnabled(z11);
                    }
                    qh.d dVar = keVar.Q0;
                    if (dVar != null) {
                        if (starsAmount.amount > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        dVar.setEnabled(z10);
                    }
                    keVar.I0 = i15;
                    od odVar = keVar.f38363f1;
                    AndroidUtilities.cancelRunOnUIThread(odVar);
                    odVar.run();
                }
                heVar5.f37471f = "USD";
                heVar4.f37472g = true;
                TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus.current_balance;
                heVar4.f37473i = starsAmount2;
                double d12 = keVar.f38365h1;
                heVar4.f37474j = (long) (starsAmount2.amount * d12 * 100.0d);
                heVar4.f37471f = "USD";
                he heVar7 = heVar;
                heVar7.f37472g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.overall_revenue;
                heVar7.f37473i = starsAmount3;
                heVar7.f37474j = (long) (starsAmount3.amount * d12 * 100.0d);
                heVar7.f37471f = "USD";
                keVar.f38371o1 = true;
                LinearLayout linearLayout = keVar.P0;
                if (linearLayout != null) {
                    if (tL_starsRevenueStatus.withdrawal_enabled) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    linearLayout.setVisibility(i11);
                }
                if (beVar != null) {
                    if (tL_starsRevenueStatus.available_balance.amount <= 0 && !BuildVars.DEBUG_PRIVATE_VERSION) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    beVar.setVisibility(i10);
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Components.i61 i61Var = keVar.X0;
        if (i61Var != null && (x51Var = i61Var.V2) != null) {
            x51Var.N(true);
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        boolean z4;
        ge geVar = this.f38359b1;
        org.telegram.ui.Components.i61 i61Var = this.X0;
        if (viewGroup == i61Var) {
            try {
                if (geVar.isAttachedToWindow()) {
                    org.telegram.ui.Components.tl0 currentListView = geVar.getCurrentListView();
                    int bottom = ((View) geVar.getParent()).getBottom();
                    org.telegram.ui.ActionBar.k kVar = this.f38366i1;
                    if (kVar != null) {
                        if (isAttachedToWindow() && i61Var.getHeight() - bottom >= 0) {
                            z4 = false;
                            kVar.setCastShadows(z4);
                        }
                        z4 = true;
                        kVar.setCastShadows(z4);
                    }
                    if (i61Var.getHeight() - bottom >= i61Var.getPaddingBottom() + AndroidUtilities.dp(8.0f)) {
                        iArr[1] = i13;
                        currentListView.scrollBy(0, i13);
                    }
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
                AndroidUtilities.runOnUIThread(new pd(this, 2));
            }
        }
    }

    @Override
    public final void o(int i10, View view) {
        this.f38377t1.f2268a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        f38356u1 = this;
        super.onAttachedToWindow();
        a0();
    }

    @Override
    public final void onDetachedFromWindow() {
        f38356u1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.k kVar = this.f38366i1;
        if (kVar != null) {
            kVar.setCastShadows(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f38377t1.f2268a = i10;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f38366i1 = kVar;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
