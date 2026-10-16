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
public final class qe extends org.telegram.ui.Components.ow0 implements r0.m {
    public static qe f39115x1;
    public static HashMap f39116y1;
    public TL_stories.TL_premium_boostsStatus A0;
    public int B0;
    public final CharSequence C0;
    public final CharSequence D0;
    public final CharSequence E0;
    public final CharSequence F0;
    public final ee G0;
    public final RelativeSizeSpan H0;
    public final org.telegram.ui.Components.s6 I0;
    public final org.telegram.ui.Components.s6 J0;
    public final di.d K0;
    public int L0;
    public final ee M0;
    public TL_stars.StarsAmount N0;
    public final org.telegram.ui.Components.s6 O0;
    public final org.telegram.ui.Components.s6 P0;
    public final he Q0;
    public final org.telegram.ui.Components.br[] R0;
    public final LinearLayout S0;
    public final di.d T0;
    public final fe U0;
    public boolean V0;
    public boolean W0;
    public long X0;
    public final gi.o Y0;
    public org.telegram.ui.Components.sc Z0;
    public final org.telegram.ui.Components.i71 f39117a1;
    public bh.l f39118b1;
    public final FrameLayout f39119c1;
    public DecimalFormat f39120d1;
    public final me f39121e1;
    public final boolean f39122f1;
    public final boolean f39123g1;
    public SpannableStringBuilder f39124h1;
    public final td f39125i1;
    public double f39126j1;
    public double f39127k1;
    public org.telegram.ui.ActionBar.k l1;
    public boolean f39128m1;
    public boolean f39129n1;
    public ta1 f39130o1;
    public ta1 f39131p1;
    public ta1 f39132q1;
    public boolean f39133r1;
    public final ne f39134s1;
    public final ne f39135t1;
    public final ne f39136u1;
    public final ud f39137v1;
    public final hb1 f39138w0;
    public final b2.v0 f39139w1;
    public final org.telegram.ui.ActionBar.c6 f39140x0;
    public final int f39141y0;
    public final long f39142z0;

    public qe(Activity activity, hb1 hb1Var, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(activity, null);
        int i11;
        int i12;
        this.N0 = TL_stars.StarsAmount.ofStars(0L);
        this.R0 = new org.telegram.ui.Components.br[1];
        this.V0 = false;
        this.W0 = true;
        this.f39128m1 = false;
        this.f39129n1 = false;
        this.f39133r1 = false;
        String string = LocaleController.getString(R.string.MonetizationOverviewAvailable);
        ne neVar = new ne();
        neVar.f38368a = false;
        neVar.f38369b = "TON";
        neVar.h = "XTR";
        neVar.f38370c = string;
        this.f39134s1 = neVar;
        String string2 = LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal);
        ne neVar2 = new ne();
        neVar2.f38368a = false;
        neVar2.f38369b = "TON";
        neVar2.h = "XTR";
        neVar2.f38370c = string2;
        this.f39135t1 = neVar2;
        String string3 = LocaleController.getString(R.string.MonetizationOverviewTotal);
        ne neVar3 = new ne();
        neVar3.f38368a = false;
        neVar3.f38369b = "TON";
        neVar3.h = "XTR";
        neVar3.f38370c = string3;
        this.f39136u1 = neVar3;
        this.f39137v1 = new ud(this, 3);
        this.f39139w1 = new Object();
        this.f39122f1 = z10;
        this.f39123g1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f39120d1 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.f39120d1.setMaximumFractionDigits(12);
        this.f39120d1.setGroupingUsed(false);
        this.f39138w0 = hb1Var;
        this.f39140x0 = c6Var;
        this.f39141y0 = i10;
        this.f39142z0 = j10;
        long j11 = -j10;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
        if (chat != null) {
            this.B0 = chat.level;
        }
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j10, new v3(this, 2));
        c0(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.g6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j11);
            if (chatFull != null) {
                boolean z12 = chatFull.restricted_sponsored;
                this.f39128m1 = z12;
                this.f39129n1 = z12;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new ae(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
        this.C0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new t1(hb1Var, activity, c6Var, 13), c6Var), true);
        this.D0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled ? R.string.MonetizationBalanceInfo : R.string.MonetizationBalanceInfoNotAvailable), -1, 3, new ud(this, 8)), true);
        if (z11 && z10) {
            i11 = R.string.MonetizationProceedsStarsTONInfo;
        } else {
            i11 = z11 ? R.string.MonetizationProceedsStarsInfo : R.string.MonetizationProceedsTONInfo;
        }
        if (z11 && z10) {
            i12 = R.string.MonetizationProceedsStarsTONInfoLink;
        } else {
            i12 = z11 ? R.string.MonetizationProceedsStarsInfoLink : R.string.MonetizationProceedsTONInfoLink;
        }
        this.E0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new td(this, i12, 0), c6Var), true);
        this.F0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat2) ? R.string.MonetizationStarsInfo : R.string.MonetizationStarsInfoGroup), new ud(this, 0)), true);
        int i13 = org.telegram.ui.ActionBar.g6.f19543a7;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
        this.f39121e1 = new me(this, activity, i10, j10, hb1Var.getClassGuid(), new ud(this, 1), c6Var);
        ee eeVar = new ee(activity, 0);
        this.G0 = eeVar;
        eeVar.setOrientation(1);
        int i14 = org.telegram.ui.ActionBar.g6.f19601d6;
        eeVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i14, c6Var));
        eeVar.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(activity, false, true, true);
        this.I0 = s6Var;
        s6Var.setTypeface(AndroidUtilities.bold());
        int i15 = org.telegram.ui.ActionBar.g6.G6;
        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i15, c6Var));
        s6Var.setTextSize(AndroidUtilities.dp(32.0f));
        s6Var.setGravity(17);
        this.H0 = new RelativeSizeSpan(0.6770833f);
        eeVar.addView(s6Var, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(activity, true, true, true);
        this.J0 = s6Var2;
        s6Var2.setGravity(17);
        int i16 = org.telegram.ui.ActionBar.g6.f19988y6;
        s6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i16, c6Var));
        s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        eeVar.addView(s6Var2, w7.z5.a(17.0f, 22.0f, 4.0f, 22.0f, 0.0f, -1, 49));
        di.d dVar = new di.d(activity, c6Var, true);
        dVar.setRoundRadius(24);
        this.K0 = dVar;
        dVar.setEnabled(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled);
        dVar.g(LocaleController.getString(R.string.MonetizationWithdraw), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new bi.u1(28, this, hb1Var));
        eeVar.addView(dVar, w7.z5.a(48.0f, 18.0f, 13.0f, 18.0f, 0.0f, -1, 55));
        ee eeVar2 = new ee(activity, 1);
        this.M0 = eeVar2;
        eeVar2.setOrientation(1);
        eeVar2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i14, c6Var));
        eeVar2.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.s6 s6Var3 = new org.telegram.ui.Components.s6(activity, false, true, true);
        this.O0 = s6Var3;
        s6Var3.setTypeface(AndroidUtilities.bold());
        s6Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(i15, c6Var));
        s6Var3.setTextSize(AndroidUtilities.dp(32.0f));
        s6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        eeVar2.addView(s6Var3, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.s6 s6Var4 = new org.telegram.ui.Components.s6(activity, true, true, true);
        this.P0 = s6Var4;
        s6Var4.setGravity(17);
        s6Var4.setTextColor(org.telegram.ui.ActionBar.g6.w0(i16, c6Var));
        s6Var4.setTextSize(AndroidUtilities.dp(14.0f));
        eeVar2.addView(s6Var4, w7.z5.a(17.0f, 22.0f, 4.0f, 22.0f, 0.0f, -1, 49));
        fe feVar = new fe(this, activity, 0);
        this.U0 = feVar;
        feVar.setVisibility(8);
        feVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        feVar.setLeftPadding(AndroidUtilities.dp(36.0f));
        gi.o oVar = new gi.o(activity, 1);
        this.Y0 = oVar;
        oVar.setFocusable(false);
        oVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i15, c6Var));
        oVar.setCursorSize(AndroidUtilities.dp(20.0f));
        oVar.setCursorWidth(1.5f);
        oVar.setBackground(null);
        oVar.setTextSize(1, 18.0f);
        oVar.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        oVar.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        oVar.setInputType(2);
        oVar.setTypeface(Typeface.DEFAULT);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19924uf, c6Var));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19942vf, c6Var));
        oVar.setGravity(LocaleController.isRTL ? 5 : 3);
        oVar.setOnFocusChangeListener(new vd(this, 0));
        oVar.addTextChangedListener(new ge(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(oVar, w7.z5.o(-1, -2, 1.0f, 119));
        feVar.e(oVar);
        feVar.addView(linearLayout, w7.z5.e(-1, -2, 48));
        eeVar2.addView(feVar, w7.z5.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.S0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? dVar2 = new di.d(activity, c6Var, true);
        dVar2.setRoundRadius(24);
        this.Q0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.g(LocaleController.formatPluralString("MonetizationStarsWithdraw", 0, new Object[0]), false, true);
        dVar2.setVisibility(0);
        dVar2.setOnClickListener(new org.telegram.ui.Cells.sa(this, i10, hb1Var, 2));
        di.d dVar3 = new di.d(activity, c6Var, true);
        dVar3.setRoundRadius(24);
        this.T0 = dVar3;
        dVar3.setEnabled(false);
        dVar3.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        dVar3.setOnClickListener(new wd(this, i10, j10, activity));
        linearLayout2.addView((View) dVar2, w7.z5.o(-1, 48, 1.0f, 119));
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            linearLayout2.addView(new Space(activity), w7.z5.o(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar3, w7.z5.o(-1, 48, 1.0f, 119));
        }
        eeVar2.addView(linearLayout2, w7.z5.a(48.0f, 18.0f, 13.0f, 18.0f, 0.0f, -1, 55));
        oVar.setOnEditorActionListener(new ce(0, this, hb1Var));
        this.f39125i1 = new td(this, i10, 2);
        org.telegram.ui.Components.i71 i71Var = new org.telegram.ui.Components.i71(hb1Var, new f5(this, 2), new de(this), new de(this));
        this.f39117a1 = i71Var;
        i71Var.setClipToPadding(false);
        i71Var.p1();
        addView(i71Var);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f39119c1 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(i13, c6Var));
        frameLayout.addView(linearLayout3, w7.z5.e(-2, -2, 17));
        ?? imageView2 = new ImageView(activity);
        imageView2.setAutoRepeat(true);
        imageView2.f(R.raw.statistic_preload, 120, 120, null);
        imageView2.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i17 = org.telegram.ui.ActionBar.g6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i17, false));
        textView.setTag(Integer.valueOf(i17));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i18 = org.telegram.ui.ActionBar.g6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i18, false));
        textView2.setTag(Integer.valueOf(i18));
        org.telegram.messenger.sk.m(R.string.LoadingStatsDescription, textView2, 1);
        linearLayout3.addView((View) imageView2, w7.z5.t(120, 120, 1, 0, 0, 0, 20));
        linearLayout3.addView(textView, w7.z5.t(-2, -2, 1, 0, 0, 0, 10));
        linearLayout3.addView(textView2, w7.z5.q(-2, -2, 1));
        addView(frameLayout, w7.z5.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.e3 d0(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.e3 i19 = org.telegram.messenger.sk.i(1, context, c6Var, false);
        LinearLayout e = org.telegram.messenger.sk.e(context, 1);
        e.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_monetize);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
        e.addView(imageView, w7.z5.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
        int i20 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i20, c6Var));
        if (z10) {
            i10 = R.string.BotMonetizationInfoTitle;
        } else {
            i10 = R.string.MonetizationInfoTitle;
        }
        textView.setText(LocaleController.getString(i10));
        e.addView(textView, w7.z5.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        int i21 = R.drawable.msg_channel;
        if (z10) {
            i11 = R.string.BotMonetizationInfoFeature1Name;
        } else {
            i11 = R.string.MonetizationInfoFeature1Name;
        }
        String string = LocaleController.getString(i11);
        if (z10) {
            i12 = R.string.BotMonetizationInfoFeature1Text;
        } else {
            i12 = R.string.MonetizationInfoFeature1Text;
        }
        e.addView(new bi.i5(context, i21, string, LocaleController.getString(i12), c6Var), w7.z5.t(-1, -2, 49, 8, 0, 8, 16));
        int i22 = R.drawable.menu_feature_split;
        if (z10) {
            i13 = R.string.BotMonetizationInfoFeature2Name;
        } else {
            i13 = R.string.MonetizationInfoFeature2Name;
        }
        String string2 = LocaleController.getString(i13);
        if (z10) {
            i14 = R.string.BotMonetizationInfoFeature2Text;
        } else {
            i14 = R.string.MonetizationInfoFeature2Text;
        }
        e.addView(new bi.i5(context, i22, string2, LocaleController.getString(i14), c6Var), w7.z5.t(-1, -2, 49, 8, 0, 8, 16));
        int i23 = R.drawable.menu_feature_withdrawals;
        if (z10) {
            i15 = R.string.BotMonetizationInfoFeature3Name;
        } else {
            i15 = R.string.MonetizationInfoFeature3Name;
        }
        String string3 = LocaleController.getString(i15);
        if (z10) {
            i16 = R.string.BotMonetizationInfoFeature3Text;
        } else {
            i16 = R.string.MonetizationInfoFeature3Text;
        }
        e.addView(new bi.i5(context, i23, string3, LocaleController.getString(i16), c6Var), w7.z5.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19602d7, c6Var));
        e.addView(view, w7.z5.s(-1, 55, 12, 0, 12, 1.0f / AndroidUtilities.density, 0));
        org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(context);
        a6Var.setGravity(17);
        a6Var.setTextSize(1, 20.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i20, c6Var));
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.mini_gram_72, 0);
        brVar.recolorDrawable = false;
        brVar.setScale(0.9f, 0.9f);
        brVar.setRelativeSize(a6Var.getPaint().getFontMetricsInt());
        brVar.spaceScaleX = 0.9f;
        spannableString.setSpan(brVar, 0, spannableString.length(), 33);
        if (z10) {
            i17 = R.string.BotMonetizationInfoTONTitle;
        } else {
            i17 = R.string.MonetizationInfoTONTitle;
        }
        a6Var.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(i17), spannableString));
        e.addView(a6Var, w7.z5.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(context, c6Var);
        da0Var.setGravity(17);
        da0Var.setTextSize(1, 14.0f);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i20, c6Var));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19660gc, c6Var));
        if (z10) {
            i18 = R.string.BotMonetizationInfoTONText;
        } else {
            i18 = R.string.MonetizationInfoTONText;
        }
        da0Var.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(i18)), new ah.t(20, context, z10)));
        e.addView(da0Var, w7.z5.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        di.d f7 = org.telegram.messenger.sk.f(24, context, c6Var, true);
        f7.g(LocaleController.getString(R.string.GotIt), false, true);
        f7.setOnClickListener(new xd(i19, 1));
        e.addView(f7, w7.z5.t(-1, 48, 55, 10, 25, 10, 14));
        i19.setCustomView(e);
        return i19;
    }

    public static CharSequence f0(CharSequence charSequence, TextPaint textPaint, float f7, float f10, boolean z10) {
        int i10;
        if (f39116y1 == null) {
            f39116y1 = new HashMap();
        }
        int i11 = textPaint.getFontMetricsInt().bottom;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = ((i11 * i10) * ((int) (f7 * 100.0f))) - ((int) (100.0f * f10));
        SpannableString spannableString = (SpannableString) f39116y1.get(Integer.valueOf(i12));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(R.drawable.mini_gram_72, 0);
                brVar.recolorDrawable = false;
                brVar.setScale(f7, f7);
                brVar.setColorKey(org.telegram.ui.ActionBar.g6.f19804o6);
                brVar.setRelativeSize(textPaint.getFontMetricsInt());
                brVar.spaceScaleX = 0.9f;
                spannableString.setSpan(brVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.br brVar2 = new org.telegram.ui.Components.br(R.drawable.mini_gram_16, 0);
                brVar2.recolorDrawable = false;
                brVar2.setScale(f7, f7);
                brVar2.setTranslateY(f10);
                brVar2.spaceScaleX = 0.95f;
                spannableString.setSpan(brVar2, 0, spannableString.length(), 33);
            }
            f39116y1.put(Integer.valueOf(i12), spannableString);
        }
        return AndroidUtilities.replaceMultipleCharSequence("TON", charSequence, spannableString);
    }

    public static void h0(Context context, int i10, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        long j11;
        org.telegram.ui.ActionBar.e3 e3Var;
        String string;
        long j12;
        long j13;
        long j14;
        boolean z10;
        char c10;
        String str;
        boolean z11;
        int i11;
        String str2;
        org.telegram.ui.ActionBar.e3 e3Var2;
        String userName;
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.e3 i12 = org.telegram.messenger.sk.i(1, context, c6Var, false);
        LinearLayout e = org.telegram.messenger.sk.e(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            String string2 = LocaleController.getString(R.string.MonetizationTransactionDetailWithdraw);
            j11 = 0;
            j12 = tL_broadcastRevenueTransactionWithdrawal.amount;
            z10 = tL_broadcastRevenueTransactionWithdrawal.pending;
            j13 = tL_broadcastRevenueTransactionWithdrawal.date;
            c10 = 65535;
            e3Var = i12;
            str = string2;
            j14 = 0;
            z11 = tL_broadcastRevenueTransactionWithdrawal.failed;
        } else {
            j11 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                string = LocaleController.getString(R.string.MonetizationTransactionDetailProceed);
                long j15 = tL_broadcastRevenueTransactionProceeds.from_date;
                long j16 = tL_broadcastRevenueTransactionProceeds.to_date;
                e3Var = i12;
                j12 = tL_broadcastRevenueTransactionProceeds.amount;
                j14 = j16;
                j13 = j15;
            } else {
                e3Var = i12;
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
            z10 = false;
            c10 = 1;
            str = string;
            z11 = false;
        }
        boolean z13 = z10;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        long j17 = j14;
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        org.telegram.messenger.sk.k(18.0f, 1, textView);
        if (c10 < 0) {
            i11 = org.telegram.ui.ActionBar.g6.f19839q7;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.f19747l8;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (c10 < 0) {
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
        e.addView(textView, w7.z5.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19988y6, c6Var));
        if (z13) {
            textView2.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
        } else if (j13 == j11) {
            textView2.setText(LocaleController.formatShortDateTime(j17));
        } else if (j17 == j11) {
            textView2.setText(LocaleController.formatShortDateTime(j13));
        } else {
            textView2.setText(LocaleController.formatShortDateTime(j13) + " - " + LocaleController.formatShortDateTime(j17));
        }
        if (z11) {
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19839q7, c6Var));
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        e.addView(textView2, w7.z5.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.sk.k(14.0f, 1, textView3);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        textView3.setText(str);
        e.addView(textView3, w7.z5.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.d0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19594ci, c6Var)));
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
            org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
            z9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
            k9Var.p(chat);
            z9Var.e(chat, k9Var);
            frameLayout.addView(z9Var, w7.z5.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19707j5, c6Var));
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, w7.z5.a(-2.0f, 37.0f, 0.0f, 10.0f, 0.0f, -2, 19));
            e.addView(frameLayout, w7.z5.t(-2, 28, 1, 42, 10, 42, 0));
        }
        di.d f7 = org.telegram.messenger.sk.f(24, context, c6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                f7.g(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false, true);
                f7.setOnClickListener(new bi.u1(context, tL_broadcastRevenueTransactionWithdrawal2));
                e3Var2 = e3Var;
                e.addView(f7, w7.z5.t(-1, 48, 55, 18, 30, 18, 14));
                e3Var2.setCustomView(e);
                e3Var2.show();
            }
        }
        f7.g(LocaleController.getString(R.string.OK), false, true);
        e3Var2 = e3Var;
        f7.setOnClickListener(new xd(e3Var2, 0));
        e.addView(f7, w7.z5.t(-1, 48, 55, 18, 30, 18, 14));
        e3Var2.setCustomView(e);
        e3Var2.show();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        int max;
        boolean z10;
        org.telegram.ui.Components.i71 i71Var = this.f39117a1;
        if (viewGroup == i71Var) {
            me meVar = this.f39121e1;
            if (meVar.isAttachedToWindow()) {
                ((View) meVar.getParent()).getTop();
                int i13 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
                org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int bottom = ((View) meVar.getParent()).getBottom();
                if (i11 < 0) {
                    org.telegram.ui.ActionBar.k kVar = this.l1;
                    if (kVar != null) {
                        if (isAttachedToWindow() && i71Var.getHeight() - bottom >= 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        kVar.setCastShadows(z10);
                    }
                    if (i71Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + i71Var.getPaddingBottom()) {
                        org.telegram.ui.Components.mm0 currentListView = meVar.getCurrentListView();
                        int L0 = ((s4.b0) currentListView.getLayoutManager()).L0();
                        int i14 = -1;
                        if (L0 != -1) {
                            s4.b1 K = currentListView.K(L0);
                            if (K != null) {
                                i14 = K.f44838a.getTop();
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
                    org.telegram.ui.Components.mm0 currentListView2 = meVar.getCurrentListView();
                    if (i71Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + i71Var.getPaddingBottom() && currentListView2 != null && !currentListView2.canScrollVertically(1)) {
                        iArr[1] = i11;
                        i71Var.B0();
                    }
                }
            }
        }
    }

    public final void Z(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        boolean z10;
        FrameLayout frameLayout;
        kg.b bVar;
        ArrayList arrayList;
        if (this.f39132q1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39127k1 = tL_payments_starsRevenueStats.usd_rate;
        ta1 f02 = hb1.f0(tL_payments_starsRevenueStats.revenue_graph, LocaleController.getString(R.string.MonetizationGraphStarsRevenue), 2, false);
        this.f39132q1 = f02;
        if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f39132q1.d.d.get(0) != null) {
            ((kg.a) this.f39132q1.d.d.get(0)).f14249g = org.telegram.ui.ActionBar.g6.kj;
            this.f39132q1.d.h = (float) ((1.0d / this.f39127k1) / 100.0d);
        }
        g0(false, tL_payments_starsRevenueStats.status);
        if (!this.f39122f1 && (frameLayout = this.f39119c1) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.es.h).withEndAction(new ud(this, 7)).start();
        }
        org.telegram.ui.Components.i71 i71Var = this.f39117a1;
        if (i71Var != null) {
            i71Var.W2.N(!z10);
            if (z10) {
                i71Var.u0(0);
            }
        }
    }

    public final void a0() {
        if (isAttachedToWindow() && this.f39122f1 && this.f39133r1 && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            this.f39138w0.showDialog(d0(getContext(), this.f39140x0, false));
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void b0(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        hb1 hb1Var = this.f39138w0;
        if (hb1Var != null) {
            Activity parentActivity = hb1Var.getParentActivity();
            int i10 = this.f39141y0;
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            if (parentActivity != null && currentUser != null) {
                long j10 = this.f39142z0;
                if (z10) {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                    tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                    tL_payments_getStarsRevenueWithdrawalUrl.amount = this.X0;
                } else {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                }
                ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new di.s1(this, twoStepVerificationActivity, parentActivity, z10, 1));
            }
        }
    }

    public final void c0(boolean z10) {
        if (!this.f39123g1) {
            return;
        }
        int i10 = this.f39141y0;
        zh.p g10 = zh.p.g(i10);
        long j10 = this.f39142z0;
        TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, z10);
        if (h != null) {
            AndroidUtilities.runOnUIThread(new jd(2, this, h));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.g6.I.q();
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new ae(this, 2));
    }

    public final void e0() {
        me meVar = this.f39121e1;
        ud udVar = meVar.e;
        boolean[] zArr = meVar.f37978s;
        boolean a2 = meVar.a();
        for (int i10 = 0; i10 < 2; i10++) {
            if (!zArr[i10]) {
                if (i10 == 1) {
                    meVar.h.clear();
                    meVar.f37975f = "";
                } else {
                    meVar.f37976n.clear();
                    meVar.f37977r = "";
                }
                zArr[i10] = false;
                meVar.c(i10);
            } else {
                return;
            }
        }
        if (meVar.a() != a2 && udVar != null) {
            meVar.e();
            udVar.run();
        }
    }

    public final void g0(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        ne neVar;
        int i10;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.a71 a71Var;
        long j10;
        ne neVar2;
        int i14;
        int i15;
        qe qeVar = this;
        ne neVar3 = qeVar.f39136u1;
        ne neVar4 = qeVar.f39135t1;
        org.telegram.ui.Components.s6 s6Var = qeVar.J0;
        RelativeSizeSpan relativeSizeSpan = qeVar.H0;
        org.telegram.ui.Components.s6 s6Var2 = qeVar.I0;
        ne neVar5 = qeVar.f39134s1;
        if (z10) {
            neVar5.f38368a = true;
            long j11 = tL_starsRevenueStatus.available_balance.amount;
            neVar5.d = j11;
            double d = j11 / 1.0E9d;
            neVar5.e = (long) (qeVar.f39126j1 * d * 100.0d);
            if (qeVar.f39120d1 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                neVar2 = neVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                qeVar.f39120d1 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i14 = 6;
                qeVar.f39120d1.setMaximumFractionDigits(6);
                qeVar.f39120d1.setGroupingUsed(false);
            } else {
                neVar2 = neVar3;
                i14 = 6;
            }
            DecimalFormat decimalFormat2 = qeVar.f39120d1;
            if (d > 1.5d) {
                i14 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i14);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f0("TON " + qeVar.f39120d1.format(d), s6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            s6Var2.setText(spannableStringBuilder);
            s6Var.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
            neVar5.f38371f = "USD";
            neVar4.f38368a = true;
            long j12 = tL_starsRevenueStatus.current_balance.amount;
            neVar4.d = j12;
            qeVar = this;
            double d10 = qeVar.f39126j1;
            neVar4.e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            neVar4.f38371f = "USD";
            ne neVar6 = neVar2;
            neVar6.f38368a = true;
            long j13 = tL_starsRevenueStatus.overall_revenue.amount;
            neVar6.d = j13;
            neVar6.e = (long) ((j13 / 1.0E9d) * d10 * 100.0d);
            neVar6.f38371f = "USD";
            qeVar.f39133r1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            qeVar.K0.setVisibility(i15);
        } else {
            double d11 = qeVar.f39127k1;
            if (d11 != 0.0d) {
                neVar5.f38372g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.available_balance;
                neVar5.f38373i = starsAmount3;
                neVar5.f38374j = (long) (starsAmount3.amount * d11 * 100.0d);
                int i16 = tL_starsRevenueStatus.next_withdrawal_at;
                he heVar = qeVar.Q0;
                if (s6Var2 == null || s6Var == null) {
                    neVar = neVar3;
                    i10 = 0;
                } else {
                    neVar = neVar3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(zh.p7.Y0(false, TextUtils.concat("XTR ", zh.p7.K0(starsAmount3, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    qeVar.N0 = starsAmount3;
                    qeVar.O0.setText(spannableStringBuilder2);
                    qeVar.P0.setText("≈" + BillingController.getInstance().formatCurrency((long) (qeVar.f39127k1 * starsAmount3.amount * 100.0d), "USD"));
                    if (starsAmount3.amount > 0) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    qeVar.U0.setVisibility(i13);
                    if (qeVar.W0) {
                        qeVar.V0 = true;
                        long j14 = starsAmount3.amount;
                        qeVar.X0 = j14;
                        String l4 = Long.toString(j14);
                        gi.o oVar = qeVar.Y0;
                        oVar.setText(l4);
                        oVar.setSelection(oVar.getText().length());
                        i10 = 0;
                        qeVar.V0 = false;
                        if (qeVar.X0 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        heVar.setEnabled(z12);
                    } else {
                        i10 = 0;
                    }
                    di.d dVar = qeVar.T0;
                    if (dVar != null) {
                        if (starsAmount3.amount > 0) {
                            z11 = 1;
                        } else {
                            z11 = i10;
                        }
                        dVar.setEnabled(z11);
                    }
                    qeVar.L0 = i16;
                    td tdVar = qeVar.f39125i1;
                    AndroidUtilities.cancelRunOnUIThread(tdVar);
                    tdVar.run();
                }
                neVar5.f38371f = "USD";
                neVar4.f38372g = true;
                neVar4.f38373i = tL_starsRevenueStatus.current_balance;
                double d12 = qeVar.f39127k1;
                neVar4.f38374j = (long) (starsAmount.amount * d12 * 100.0d);
                neVar4.f38371f = "USD";
                ne neVar7 = neVar;
                neVar7.f38372g = true;
                neVar7.f38373i = tL_starsRevenueStatus.overall_revenue;
                neVar7.f38374j = (long) (starsAmount2.amount * d12 * 100.0d);
                neVar7.f38371f = "USD";
                qeVar.f39133r1 = true;
                LinearLayout linearLayout = qeVar.S0;
                if (linearLayout != null) {
                    if (tL_starsRevenueStatus.withdrawal_enabled) {
                        i12 = i10;
                    } else {
                        i12 = 8;
                    }
                    linearLayout.setVisibility(i12);
                }
                if (heVar != null) {
                    if (tL_starsRevenueStatus.available_balance.amount <= 0 && !BuildVars.DEBUG_PRIVATE_VERSION) {
                        i11 = 8;
                    } else {
                        i11 = i10;
                    }
                    heVar.setVisibility(i11);
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Components.i71 i71Var = qeVar.f39117a1;
        if (i71Var != null && (a71Var = i71Var.W2) != null) {
            a71Var.N(true);
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        boolean z10;
        me meVar = this.f39121e1;
        org.telegram.ui.Components.i71 i71Var = this.f39117a1;
        if (viewGroup == i71Var) {
            try {
                if (meVar.isAttachedToWindow()) {
                    org.telegram.ui.Components.mm0 currentListView = meVar.getCurrentListView();
                    int bottom = ((View) meVar.getParent()).getBottom();
                    org.telegram.ui.ActionBar.k kVar = this.l1;
                    if (kVar != null) {
                        if (isAttachedToWindow() && i71Var.getHeight() - bottom >= 0) {
                            z10 = false;
                            kVar.setCastShadows(z10);
                        }
                        z10 = true;
                        kVar.setCastShadows(z10);
                    }
                    if (i71Var.getHeight() - bottom >= i71Var.getPaddingBottom() + AndroidUtilities.dp(8.0f)) {
                        iArr[1] = i13;
                        currentListView.scrollBy(0, i13);
                    }
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
                AndroidUtilities.runOnUIThread(new ud(this, 2));
            }
        }
    }

    @Override
    public final void n(int i10, View view) {
        this.f39139w1.f2448a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        f39115x1 = this;
        super.onAttachedToWindow();
        a0();
    }

    @Override
    public final void onDetachedFromWindow() {
        f39115x1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.k kVar = this.l1;
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
        this.f39139w1.f2448a = i10;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.l1 = kVar;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
