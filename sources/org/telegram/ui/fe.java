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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;

public final class fe extends org.telegram.ui.Components.zu0 implements r0.n {

    public static fe f38078t1;

    public static HashMap f38079u1;
    public final CharSequence A0;
    public final CharSequence B0;
    public final hh.m C0;
    public final RelativeSizeSpan D0;
    public final org.telegram.ui.Components.j6 E0;
    public final org.telegram.ui.Components.j6 F0;
    public final lh.d G0;
    public int H0;
    public final hh.m I0;
    public TL_stars.StarsAmount J0;
    public final org.telegram.ui.Components.j6 K0;
    public final org.telegram.ui.Components.j6 L0;
    public final wd M0;
    public final org.telegram.ui.Components.cq[] N0;
    public final LinearLayout O0;
    public final lh.d P0;
    public final hh.n Q0;
    public boolean R0;
    public boolean S0;
    public long T0;
    public final hh.o U0;
    public org.telegram.ui.Components.ec V0;
    public final org.telegram.ui.Components.k51 W0;
    public jg.k X0;
    public final FrameLayout Y0;
    public DecimalFormat Z0;

    public final be f38080a1;

    public final boolean f38081b1;

    public final boolean f38082c1;

    public SpannableStringBuilder f38083d1;

    public final jd f38084e1;

    public double f38085f1;

    public double f38086g1;

    public org.telegram.ui.ActionBar.k f38087h1;

    public boolean f38088i1;

    public boolean f38089j1;

    public c91 f38090k1;
    public c91 l1;

    public c91 f38091m1;

    public boolean f38092n1;

    public final ce f38093o1;

    public final ce f38094p1;

    public final ce f38095q1;

    public final kd f38096r1;

    public final q91 f38097s0;

    public final d5.p f38098s1;

    public final org.telegram.ui.ActionBar.c6 f38099t0;

    public final int f38100u0;

    public final long f38101v0;

    public TL_stories.TL_premium_boostsStatus f38102w0;

    public int f38103x0;

    public final CharSequence f38104y0;

    public final CharSequence f38105z0;

    public fe(Activity activity, q91 q91Var, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(activity, null);
        this.J0 = TL_stars.StarsAmount.ofStars(0L);
        int i11 = 1;
        this.N0 = new org.telegram.ui.Components.cq[1];
        int i12 = 0;
        this.R0 = false;
        this.S0 = true;
        this.f38088i1 = false;
        this.f38089j1 = false;
        this.f38092n1 = false;
        String string = LocaleController.getString(R.string.MonetizationOverviewAvailable);
        ce ceVar = new ce();
        ceVar.f37054a = false;
        ceVar.f37055b = "TON";
        ceVar.h = "XTR";
        ceVar.f37056c = string;
        this.f38093o1 = ceVar;
        String string2 = LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal);
        ce ceVar2 = new ce();
        ceVar2.f37054a = false;
        ceVar2.f37055b = "TON";
        ceVar2.h = "XTR";
        ceVar2.f37056c = string2;
        this.f38094p1 = ceVar2;
        String string3 = LocaleController.getString(R.string.MonetizationOverviewTotal);
        ce ceVar3 = new ce();
        ceVar3.f37054a = false;
        ceVar3.f37055b = "TON";
        ceVar3.h = "XTR";
        ceVar3.f37056c = string3;
        this.f38095q1 = ceVar3;
        this.f38096r1 = new kd(this, 3);
        this.f38098s1 = new d5.p();
        this.f38081b1 = z10;
        this.f38082c1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.Z0 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.Z0.setMaximumFractionDigits(12);
        this.Z0.setGroupingUsed(false);
        this.f38097s0 = q91Var;
        this.f38099t0 = c6Var;
        this.f38100u0 = i10;
        this.f38101v0 = j10;
        long j11 = -j10;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
        if (chat != null) {
            this.f38103x0 = chat.level;
        }
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j10, new tb(this, i11));
        c0(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.g6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j11);
            if (chatFull != null) {
                boolean z12 = chatFull.restricted_sponsored;
                this.f38088i1 = z12;
                this.f38089j1 = z12;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new qd(this, i11), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
        this.f38104y0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new u1(q91Var, activity, c6Var, 13), c6Var), true);
        this.f38105z0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled ? R.string.MonetizationBalanceInfo : R.string.MonetizationBalanceInfoNotAvailable), -1, 3, new kd(this, 8)), true);
        this.A0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString((z11 && z10) ? R.string.MonetizationProceedsStarsTONInfo : z11 ? R.string.MonetizationProceedsStarsInfo : R.string.MonetizationProceedsTONInfo), -1, 3, new jd(this, (z11 && z10) ? R.string.MonetizationProceedsStarsTONInfoLink : z11 ? R.string.MonetizationProceedsStarsInfoLink : R.string.MonetizationProceedsTONInfoLink, i12), c6Var), true);
        this.B0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat2) ? R.string.MonetizationStarsInfo : R.string.MonetizationStarsInfoGroup), new kd(this, i12)), true);
        int i13 = org.telegram.ui.ActionBar.g6.f22999a7;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        this.f38080a1 = new be(this, activity, i10, j10, q91Var.getClassGuid(), new kd(this, i11), c6Var);
        hh.m mVar = new hh.m(activity, 2);
        this.C0 = mVar;
        mVar.setOrientation(1);
        int i14 = org.telegram.ui.ActionBar.g6.f23053d6;
        mVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        mVar.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(activity, false, true, true);
        this.E0 = j6Var;
        j6Var.setTypeface(AndroidUtilities.bold());
        int i15 = org.telegram.ui.ActionBar.g6.G6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
        j6Var.setTextSize(AndroidUtilities.dp(32.0f));
        j6Var.setGravity(17);
        this.D0 = new RelativeSizeSpan(0.6770833f);
        mVar.addView(j6Var, h7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(activity, true, true, true);
        this.F0 = j6Var2;
        j6Var2.setGravity(17);
        int i16 = org.telegram.ui.ActionBar.g6.f23423y6;
        j6Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var));
        j6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        mVar.addView(j6Var2, h7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        lh.d dVar = new lh.d(activity, c6Var, true);
        dVar.setRoundRadius(24);
        this.G0 = dVar;
        dVar.setEnabled(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled);
        dVar.g(LocaleController.getString(R.string.MonetizationWithdraw), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new nh.x1(16, this, q91Var));
        mVar.addView(dVar, h7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        hh.m mVar2 = new hh.m(activity, 3);
        this.I0 = mVar2;
        mVar2.setOrientation(1);
        mVar2.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        mVar2.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(activity, false, true, true);
        this.K0 = j6Var3;
        j6Var3.setTypeface(AndroidUtilities.bold());
        j6Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
        j6Var3.setTextSize(AndroidUtilities.dp(32.0f));
        j6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        mVar2.addView(j6Var3, h7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.j6 j6Var4 = new org.telegram.ui.Components.j6(activity, true, true, true);
        this.L0 = j6Var4;
        j6Var4.setGravity(17);
        j6Var4.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var));
        j6Var4.setTextSize(AndroidUtilities.dp(14.0f));
        mVar2.addView(j6Var4, h7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        hh.n nVar = new hh.n(this, activity, i11);
        this.Q0 = nVar;
        nVar.setVisibility(8);
        nVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        nVar.setLeftPadding(AndroidUtilities.dp(36.0f));
        hh.o oVar = new hh.o(activity, 2);
        this.U0 = oVar;
        oVar.setFocusable(false);
        oVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
        oVar.setCursorSize(AndroidUtilities.dp(20.0f));
        oVar.setCursorWidth(1.5f);
        oVar.setBackground(null);
        oVar.setTextSize(1, 18.0f);
        oVar.setMaxLines(1);
        int iDp = AndroidUtilities.dp(16.0f);
        oVar.setPadding(AndroidUtilities.dp(6.0f), iDp, iDp, iDp);
        oVar.setInputType(2);
        oVar.setTypeface(Typeface.DEFAULT);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23366uf, c6Var));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23382vf, c6Var));
        oVar.setGravity(LocaleController.isRTL ? 5 : 3);
        oVar.setOnFocusChangeListener(new ld(this, i12));
        oVar.addTextChangedListener(new vd(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, h7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(oVar, h7.z5.o(-1, -2, 1.0f, 119));
        nVar.e(oVar);
        nVar.addView(linearLayout, h7.z5.e(-1, -2, 48));
        mVar2.addView(nVar, h7.z5.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.O0 = linearLayout2;
        linearLayout2.setOrientation(0);
        wd wdVar = new wd(activity, c6Var, true);
        wdVar.setRoundRadius(24);
        this.M0 = wdVar;
        wdVar.setEnabled(false);
        wdVar.g(LocaleController.formatPluralString("MonetizationStarsWithdraw", 0, new Object[0]), false, true);
        wdVar.setVisibility(0);
        wdVar.setOnClickListener(new gh.v2(this, i10, q91Var, 5));
        lh.d dVar2 = new lh.d(activity, c6Var, true);
        dVar2.setRoundRadius(24);
        this.P0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        dVar2.setOnClickListener(new md(this, i10, j10, activity));
        linearLayout2.addView(wdVar, h7.z5.o(-1, 48, 1.0f, 119));
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            linearLayout2.addView(new Space(activity), h7.z5.o(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar2, h7.z5.o(-1, 48, 1.0f, 119));
        }
        mVar2.addView(linearLayout2, h7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        oVar.setOnEditorActionListener(new td(0, this, q91Var));
        int i17 = 2;
        this.f38084e1 = new jd(this, i10, i17);
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(q91Var, new b5(this, i17), new ud(this), new ud(this));
        this.W0 = k51Var;
        k51Var.setClipToPadding(false);
        k51Var.p1();
        addView(k51Var);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Y0 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        frameLayout.addView(linearLayout3, h7.z5.e(-2, -2, 17));
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(activity);
        ri0Var.setAutoRepeat(true);
        ri0Var.f(R.raw.statistic_preload, 120, 120, null);
        ri0Var.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i18 = org.telegram.ui.ActionBar.g6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
        textView.setTag(Integer.valueOf(i18));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i19 = org.telegram.ui.ActionBar.g6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
        textView2.setTag(Integer.valueOf(i19));
        org.telegram.messenger.rl.i(R.string.LoadingStatsDescription, textView2, 1);
        linearLayout3.addView(ri0Var, h7.z5.t(120, 120, 1, 0, 0, 0, 20));
        linearLayout3.addView(textView, h7.z5.t(-2, -2, 1, 0, 0, 0, 10));
        linearLayout3.addView(textView2, h7.z5.q(-2, -2, 1));
        addView(frameLayout, h7.z5.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.e3 d0(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, c6Var, false, false);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        linearLayoutG.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        ri0Var.setImageResource(R.drawable.large_monetize);
        ri0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        ri0Var.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
        linearLayoutG.addView(ri0Var, h7.z5.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        org.telegram.ui.Cells.pa.m(20.0f, 1, textView);
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        textView.setText(LocaleController.getString(z10 ? R.string.BotMonetizationInfoTitle : R.string.MonetizationInfoTitle));
        linearLayoutG.addView(textView, h7.z5.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        linearLayoutG.addView(new ag.d(context, R.drawable.msg_channel, LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature1Name : R.string.MonetizationInfoFeature1Name), LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature1Text : R.string.MonetizationInfoFeature1Text), c6Var), h7.z5.t(-1, -2, 49, 8, 0, 8, 16));
        linearLayoutG.addView(new ag.d(context, R.drawable.menu_feature_split, LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature2Name : R.string.MonetizationInfoFeature2Name), LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature2Text : R.string.MonetizationInfoFeature2Text), c6Var), h7.z5.t(-1, -2, 49, 8, 0, 8, 16));
        linearLayoutG.addView(new ag.d(context, R.drawable.menu_feature_withdrawals, LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature3Name : R.string.MonetizationInfoFeature3Name), LocaleController.getString(z10 ? R.string.BotMonetizationInfoFeature3Text : R.string.MonetizationInfoFeature3Text), c6Var), h7.z5.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, c6Var));
        linearLayoutG.addView(view, h7.z5.s(-1, 55, 12, 0, 12, 1.0f / AndroidUtilities.density, 0));
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        s5Var.setGravity(17);
        s5Var.setTextSize(1, 20.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.mini_gram_72, 0);
        cqVar.setScale(0.9f, 0.9f);
        cqVar.setColorKey(org.telegram.ui.ActionBar.g6.f23251o6);
        cqVar.setRelativeSize(s5Var.getPaint().getFontMetricsInt());
        cqVar.spaceScaleX = 0.9f;
        spannableString.setSpan(cqVar, 0, spannableString.length(), 33);
        s5Var.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONTitle : R.string.MonetizationInfoTONTitle), spannableString));
        linearLayoutG.addView(s5Var, h7.z5.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, c6Var);
        p80Var.setGravity(17);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        p80Var.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(z10 ? R.string.BotMonetizationInfoTONText : R.string.MonetizationInfoTONText)), new fh.f(23, context, z10)));
        linearLayoutG.addView(p80Var, h7.z5.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        lh.d dVarG = org.telegram.messenger.rl.g(24, context, c6Var, true);
        dVarG.g(LocaleController.getString(R.string.GotIt), false, true);
        dVarG.setOnClickListener(new nd(e3VarO, 1));
        linearLayoutG.addView(dVarG, h7.z5.t(-1, 48, 55, 10, 25, 10, 14));
        e3VarO.setCustomView(linearLayoutG);
        return e3VarO;
    }

    public static CharSequence f0(CharSequence charSequence, TextPaint textPaint, float f10, float f11, boolean z10) {
        if (f38079u1 == null) {
            f38079u1 = new HashMap();
        }
        int i10 = ((textPaint.getFontMetricsInt().bottom * (z10 ? 1 : -1)) * ((int) (f10 * 100.0f))) - ((int) (100.0f * f11));
        SpannableString spannableString = (SpannableString) f38079u1.get(Integer.valueOf(i10));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.mini_gram_72, 0);
                cqVar.setScale(f10, f10);
                cqVar.setColorKey(org.telegram.ui.ActionBar.g6.f23251o6);
                cqVar.setRelativeSize(textPaint.getFontMetricsInt());
                cqVar.spaceScaleX = 0.9f;
                spannableString.setSpan(cqVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.cq cqVar2 = new org.telegram.ui.Components.cq(R.drawable.mini_gram_16, 0);
                cqVar2.setScale(f10, f10);
                cqVar2.setTranslateY(f11);
                cqVar2.spaceScaleX = 0.95f;
                spannableString.setSpan(cqVar2, 0, spannableString.length(), 33);
            }
            f38079u1.put(Integer.valueOf(i10), spannableString);
        }
        return AndroidUtilities.replaceMultipleCharSequence("TON", charSequence, spannableString);
    }

    public static void h0(Context context, int i10, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        long j11;
        String string;
        long j12;
        long j13;
        long j14;
        boolean z10;
        byte b10;
        String str;
        boolean z11;
        org.telegram.ui.ActionBar.e3 e3Var;
        String userName;
        TLObject tLObject;
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, c6Var, false, false);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            String string2 = LocaleController.getString(R.string.MonetizationTransactionDetailWithdraw);
            long j15 = tL_broadcastRevenueTransactionWithdrawal.date;
            j11 = 0;
            j12 = tL_broadcastRevenueTransactionWithdrawal.amount;
            z10 = tL_broadcastRevenueTransactionWithdrawal.pending;
            e3VarO = e3VarO;
            j13 = j15;
            j14 = 0;
            b10 = -1;
            str = string2;
            z11 = tL_broadcastRevenueTransactionWithdrawal.failed;
        } else {
            j11 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                string = LocaleController.getString(R.string.MonetizationTransactionDetailProceed);
                long j16 = tL_broadcastRevenueTransactionProceeds.from_date;
                long j17 = tL_broadcastRevenueTransactionProceeds.to_date;
                j12 = tL_broadcastRevenueTransactionProceeds.amount;
                j14 = j17;
                j13 = j16;
            } else {
                if (!(broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund)) {
                    return;
                }
                TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                string = LocaleController.getString(R.string.MonetizationTransactionDetailRefund);
                long j18 = tL_broadcastRevenueTransactionRefund.from_date;
                j12 = tL_broadcastRevenueTransactionRefund.amount;
                j13 = j18;
                j14 = 0;
            }
            z10 = false;
            b10 = 1;
            str = string;
            z11 = false;
        }
        long j19 = j14;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        boolean z13 = z10;
        org.telegram.messenger.rl.h(18.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, b10 < 0 ? org.telegram.ui.ActionBar.g6.f23284q7 : org.telegram.ui.ActionBar.g6.f23200l8, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) (b10 < 0 ? "-" : "+"));
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j12) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int iIndexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, iIndexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        linearLayoutG.addView(textView, h7.z5.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
        if (z13) {
            textView2.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
        } else if (j13 == j11) {
            textView2.setText(LocaleController.formatShortDateTime(j19));
        } else if (j19 == j11) {
            textView2.setText(LocaleController.formatShortDateTime(j13));
        } else {
            textView2.setText(LocaleController.formatShortDateTime(j13) + " - " + LocaleController.formatShortDateTime(j19));
        }
        if (z11) {
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, c6Var));
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        linearLayoutG.addView(textView2, h7.z5.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.rl.h(14.0f, 1, textView3);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        textView3.setText(str);
        linearLayoutG.addView(textView3, h7.z5.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ci, c6Var)));
            if (j10 < j11) {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                if (chat == null) {
                    userName = "";
                    tLObject = chat;
                } else {
                    userName = chat.title;
                    tLObject = chat;
                }
            } else {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                userName = UserObject.getUserName(user);
                tLObject = user;
            }
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
            n9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
            y8Var.p(tLObject);
            n9Var.e(tLObject, y8Var);
            frameLayout.addView(n9Var, h7.z5.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, c6Var));
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, h7.z5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            linearLayoutG.addView(frameLayout, h7.z5.t(-2, 28, 1, 42, 10, 42, 0));
        }
        lh.d dVarG = org.telegram.messenger.rl.g(24, context, c6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                dVarG.g(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false, true);
                dVarG.setOnClickListener(new nh.x1(17, context, tL_broadcastRevenueTransactionWithdrawal2));
                e3Var = e3VarO;
            } else {
                dVarG.g(LocaleController.getString(R.string.OK), false, true);
                org.telegram.ui.ActionBar.e3 e3Var2 = e3VarO;
                dVarG.setOnClickListener(new nd(e3Var2, 0));
                e3Var = e3Var2;
            }
        } else {
            dVarG.g(LocaleController.getString(R.string.OK), false, true);
            org.telegram.ui.ActionBar.e3 e3Var3 = e3VarO;
            dVarG.setOnClickListener(new nd(e3Var3, 0));
            e3Var = e3Var3;
        }
        linearLayoutG.addView(dVarG, h7.z5.t(-1, 48, 55, 18, 30, 18, 14));
        e3Var.setCustomView(linearLayoutG);
        e3Var.show();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.Components.k51 k51Var = this.W0;
        if (viewGroup == k51Var) {
            be beVar = this.f38080a1;
            if (beVar.isAttachedToWindow()) {
                ((View) beVar.getParent()).getTop();
                int i13 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
                org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int bottom = ((View) beVar.getParent()).getBottom();
                if (i11 >= 0) {
                    if (i11 > 0) {
                        org.telegram.ui.Components.zk0 currentListView = beVar.getCurrentListView();
                        if (k51Var.getHeight() - bottom < AndroidUtilities.dp(8.0f) + k51Var.getPaddingBottom() || currentListView == null || currentListView.canScrollVertically(1)) {
                            return;
                        }
                        iArr[1] = i11;
                        k51Var.B0();
                        return;
                    }
                    return;
                }
                org.telegram.ui.ActionBar.k kVar = this.f38087h1;
                if (kVar != null) {
                    kVar.setCastShadows(!isAttachedToWindow() || k51Var.getHeight() - bottom < 0);
                }
                if (k51Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + k51Var.getPaddingBottom()) {
                    org.telegram.ui.Components.zk0 currentListView2 = beVar.getCurrentListView();
                    int iL0 = ((f2.k0) currentListView2.getLayoutManager()).L0();
                    if (iL0 != -1) {
                        f2.o1 o1VarK = currentListView2.K(iL0);
                        int top = o1VarK != null ? o1VarK.f5789a.getTop() : -1;
                        int paddingTop = currentListView2.getPaddingTop();
                        if (top == paddingTop && iL0 == 0) {
                            return;
                        }
                        iArr[1] = iL0 != 0 ? i11 : Math.max(i11, top - paddingTop);
                        currentListView2.scrollBy(0, i11);
                    }
                }
            }
        }
    }

    public final void Z(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        FrameLayout frameLayout;
        sf.b bVar;
        ArrayList arrayList;
        boolean z10 = this.f38091m1 == null;
        this.f38086g1 = tL_payments_starsRevenueStats.usd_rate;
        c91 c91VarF0 = q91.f0(tL_payments_starsRevenueStats.revenue_graph, LocaleController.getString(R.string.MonetizationGraphStarsRevenue), 2, false);
        this.f38091m1 = c91VarF0;
        if (c91VarF0 != null && (bVar = c91VarF0.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f38091m1.d.d.get(0) != null) {
            ((sf.a) this.f38091m1.d.d.get(0)).f47879g = org.telegram.ui.ActionBar.g6.kj;
            this.f38091m1.d.h = (float) ((1.0d / this.f38086g1) / 100.0d);
        }
        g0(false, tL_payments_starsRevenueStats.status);
        if (!this.f38081b1 && (frameLayout = this.Y0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.er.h).withEndAction(new kd(this, 7)).start();
        }
        org.telegram.ui.Components.k51 k51Var = this.W0;
        if (k51Var != null) {
            k51Var.U2.N(!z10);
            if (z10) {
                k51Var.u0(0);
            }
        }
    }

    public final void a0() {
        if (isAttachedToWindow() && this.f38081b1 && this.f38092n1 && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            this.f38097s0.showDialog(d0(getContext(), this.f38099t0, false));
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void b0(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        q91 q91Var = this.f38097s0;
        if (q91Var == null) {
            return;
        }
        Activity parentActivity = q91Var.getParentActivity();
        int i10 = this.f38100u0;
        TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
        if (parentActivity == null || currentUser == null) {
            return;
        }
        long j10 = this.f38101v0;
        if (z10) {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
            tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
            tL_payments_getStarsRevenueWithdrawalUrl.amount = this.T0;
        } else {
            tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
            tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
            tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            if (inputCheckPasswordSRP == null) {
                inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new lh.r1(this, twoStepVerificationActivity, parentActivity, z10, 1));
    }

    public final void c0(boolean z10) {
        if (this.f38082c1) {
            int i10 = this.f38100u0;
            hh.c0 c0VarG = hh.c0.g(i10);
            long j10 = this.f38101v0;
            TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStatsH = c0VarG.h(j10, z10);
            if (tL_payments_starsRevenueStatsH != null) {
                AndroidUtilities.runOnUIThread(new rd(1, this, tL_payments_starsRevenueStatsH));
                return;
            }
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.g6.I.q();
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new qd(this, 2));
        }
    }

    public final void e0() {
        be beVar = this.f38080a1;
        kd kdVar = beVar.f36788e;
        boolean[] zArr = beVar.f36792s;
        boolean zA = beVar.a();
        for (int i10 = 0; i10 < 2; i10++) {
            if (zArr[i10]) {
                return;
            }
            if (i10 == 1) {
                beVar.h.clear();
                beVar.f36789f = "";
            } else {
                beVar.f36790n.clear();
                beVar.f36791r = "";
            }
            zArr[i10] = false;
            beVar.c(i10);
        }
        if (beVar.a() == zA || kdVar == null) {
            return;
        }
        beVar.e();
        kdVar.run();
    }

    public final void g0(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        org.telegram.ui.Components.b51 b51Var;
        int i10;
        fe feVar = this;
        ce ceVar = feVar.f38095q1;
        ce ceVar2 = feVar.f38094p1;
        org.telegram.ui.Components.j6 j6Var = feVar.F0;
        RelativeSizeSpan relativeSizeSpan = feVar.D0;
        org.telegram.ui.Components.j6 j6Var2 = feVar.E0;
        ce ceVar3 = feVar.f38093o1;
        if (z10) {
            ceVar3.f37054a = true;
            long j10 = tL_starsRevenueStatus.available_balance.amount;
            ceVar3.d = j10;
            double d = j10 / 1.0E9d;
            long j11 = (long) (feVar.f38085f1 * d * 100.0d);
            ceVar3.f37057e = j11;
            if (feVar.Z0 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                feVar.Z0 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i10 = 6;
                feVar.Z0.setMaximumFractionDigits(6);
                feVar.Z0.setGroupingUsed(false);
            } else {
                i10 = 6;
            }
            DecimalFormat decimalFormat2 = feVar.Z0;
            if (d > 1.5d) {
                i10 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f0("TON " + feVar.Z0.format(d), j6Var2.getPaint(), 0.9f, 0.0f, true));
            int iIndexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (iIndexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, iIndexOf, spannableStringBuilder.length(), 33);
            }
            j6Var2.setText(spannableStringBuilder);
            j6Var.setText("≈" + BillingController.getInstance().formatCurrency(j11, "USD"));
            ceVar3.f37058f = "USD";
            ceVar2.f37054a = true;
            long j12 = tL_starsRevenueStatus.current_balance.amount;
            ceVar2.d = j12;
            feVar = this;
            double d10 = feVar.f38085f1;
            ceVar2.f37057e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            ceVar2.f37058f = "USD";
            ceVar.f37054a = true;
            long j13 = tL_starsRevenueStatus.overall_revenue.amount;
            ceVar.d = j13;
            ceVar.f37057e = (long) ((j13 / 1.0E9d) * d10 * 100.0d);
            ceVar.f37058f = "USD";
            feVar.f38092n1 = true;
            feVar.G0.setVisibility((tL_starsRevenueStatus.available_balance.amount <= 0 || !tL_starsRevenueStatus.withdrawal_enabled) ? 8 : 0);
        } else {
            double d11 = feVar.f38086g1;
            if (d11 == 0.0d) {
                return;
            }
            ceVar3.f37059g = true;
            TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
            ceVar3.f37060i = starsAmount;
            ceVar3.f37061j = (long) (starsAmount.amount * d11 * 100.0d);
            int i11 = tL_starsRevenueStatus.next_withdrawal_at;
            wd wdVar = feVar.M0;
            if (j6Var2 != null && j6Var != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hh.oa.X0(false, TextUtils.concat("XTR ", hh.oa.J0(starsAmount, 0.8f, ' ')), 1.0f, null));
                int iIndexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                if (iIndexOf2 >= 0) {
                    spannableStringBuilder2.setSpan(relativeSizeSpan, iIndexOf2, spannableStringBuilder2.length(), 33);
                }
                feVar.J0 = starsAmount;
                feVar.K0.setText(spannableStringBuilder2);
                feVar.L0.setText("≈" + BillingController.getInstance().formatCurrency((long) (feVar.f38086g1 * starsAmount.amount * 100.0d), "USD"));
                feVar.Q0.setVisibility(starsAmount.amount > 0 ? 0 : 8);
                if (feVar.S0) {
                    feVar.R0 = true;
                    long j14 = starsAmount.amount;
                    feVar.T0 = j14;
                    String string = Long.toString(j14);
                    hh.o oVar = feVar.U0;
                    oVar.setText(string);
                    oVar.setSelection(oVar.getText().length());
                    feVar.R0 = false;
                    wdVar.setEnabled(feVar.T0 > 0);
                }
                lh.d dVar = feVar.P0;
                if (dVar != null) {
                    dVar.setEnabled(starsAmount.amount > 0);
                }
                feVar.H0 = i11;
                jd jdVar = feVar.f38084e1;
                AndroidUtilities.cancelRunOnUIThread(jdVar);
                jdVar.run();
            }
            ceVar3.f37058f = "USD";
            ceVar2.f37059g = true;
            TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus.current_balance;
            ceVar2.f37060i = starsAmount2;
            double d12 = starsAmount2.amount;
            double d13 = feVar.f38086g1;
            ceVar2.f37061j = (long) (d12 * d13 * 100.0d);
            ceVar2.f37058f = "USD";
            ceVar.f37059g = true;
            TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.overall_revenue;
            ceVar.f37060i = starsAmount3;
            ceVar.f37061j = (long) (starsAmount3.amount * d13 * 100.0d);
            ceVar.f37058f = "USD";
            feVar.f38092n1 = true;
            LinearLayout linearLayout = feVar.O0;
            if (linearLayout != null) {
                linearLayout.setVisibility(tL_starsRevenueStatus.withdrawal_enabled ? 0 : 8);
            }
            if (wdVar != null) {
                wdVar.setVisibility((tL_starsRevenueStatus.available_balance.amount > 0 || BuildVars.DEBUG_PRIVATE_VERSION) ? 0 : 8);
            }
        }
        org.telegram.ui.Components.k51 k51Var = feVar.W0;
        if (k51Var == null || (b51Var = k51Var.U2) == null) {
            return;
        }
        b51Var.N(true);
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        be beVar = this.f38080a1;
        org.telegram.ui.Components.k51 k51Var = this.W0;
        if (viewGroup == k51Var) {
            try {
                if (beVar.isAttachedToWindow()) {
                    org.telegram.ui.Components.zk0 currentListView = beVar.getCurrentListView();
                    int bottom = ((View) beVar.getParent()).getBottom();
                    org.telegram.ui.ActionBar.k kVar = this.f38087h1;
                    if (kVar != null) {
                        kVar.setCastShadows(!isAttachedToWindow() || k51Var.getHeight() - bottom < 0);
                    }
                    if (k51Var.getHeight() - bottom >= k51Var.getPaddingBottom() + AndroidUtilities.dp(8.0f)) {
                        iArr[1] = i13;
                        currentListView.scrollBy(0, i13);
                    }
                }
            } catch (Throwable th) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new kd(this, 2));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        f38078t1 = this;
        super.onAttachedToWindow();
        a0();
    }

    @Override
    public final void onDetachedFromWindow() {
        f38078t1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.k kVar = this.f38087h1;
        if (kVar != null) {
            kVar.setCastShadows(true);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override
    public final void p(int i10, View view) {
        this.f38098s1.f4821a = 0;
    }

    @Override
    public final boolean q(View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f38087h1 = kVar;
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        this.f38098s1.f4821a = i10;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
