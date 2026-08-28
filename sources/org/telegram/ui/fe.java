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
public final class fe extends org.telegram.ui.Components.xu0 implements r0.n {
    public static fe f38216t1;
    public static HashMap f38217u1;
    public final CharSequence A0;
    public final CharSequence B0;
    public final gh.m C0;
    public final RelativeSizeSpan D0;
    public final org.telegram.ui.Components.j6 E0;
    public final org.telegram.ui.Components.j6 F0;
    public final kh.d G0;
    public int H0;
    public final gh.m I0;
    public TL_stars.StarsAmount J0;
    public final org.telegram.ui.Components.j6 K0;
    public final org.telegram.ui.Components.j6 L0;
    public final wd M0;
    public final org.telegram.ui.Components.eq[] N0;
    public final LinearLayout O0;
    public final kh.d P0;
    public final gh.n Q0;
    public boolean R0;
    public boolean S0;
    public long T0;
    public final gh.o U0;
    public org.telegram.ui.Components.gc V0;
    public final org.telegram.ui.Components.i51 W0;
    public ig.k X0;
    public final FrameLayout Y0;
    public DecimalFormat Z0;
    public final be f38218a1;
    public final boolean f38219b1;
    public final boolean f38220c1;
    public SpannableStringBuilder f38221d1;
    public final jd f38222e1;
    public double f38223f1;
    public double f38224g1;
    public org.telegram.ui.ActionBar.k f38225h1;
    public boolean f38226i1;
    public boolean f38227j1;
    public e91 f38228k1;
    public e91 l1;
    public e91 f38229m1;
    public boolean f38230n1;
    public final ce f38231o1;
    public final ce f38232p1;
    public final ce f38233q1;
    public final kd f38234r1;
    public final s91 f38235s0;
    public final d5.p f38236s1;
    public final org.telegram.ui.ActionBar.b6 f38237t0;
    public final int f38238u0;
    public final long f38239v0;
    public TL_stories.TL_premium_boostsStatus f38240w0;
    public int f38241x0;
    public final CharSequence f38242y0;
    public final CharSequence f38243z0;

    public fe(Activity activity, s91 s91Var, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(activity, null);
        int i10;
        int i11;
        this.J0 = TL_stars.StarsAmount.ofStars(0L);
        this.N0 = new org.telegram.ui.Components.eq[1];
        this.R0 = false;
        this.S0 = true;
        this.f38226i1 = false;
        this.f38227j1 = false;
        this.f38230n1 = false;
        String string = LocaleController.getString(R.string.MonetizationOverviewAvailable);
        ce ceVar = new ce();
        ceVar.f37173a = false;
        ceVar.f37174b = "TON";
        ceVar.h = "XTR";
        ceVar.f37175c = string;
        this.f38231o1 = ceVar;
        String string2 = LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal);
        ce ceVar2 = new ce();
        ceVar2.f37173a = false;
        ceVar2.f37174b = "TON";
        ceVar2.h = "XTR";
        ceVar2.f37175c = string2;
        this.f38232p1 = ceVar2;
        String string3 = LocaleController.getString(R.string.MonetizationOverviewTotal);
        ce ceVar3 = new ce();
        ceVar3.f37173a = false;
        ceVar3.f37174b = "TON";
        ceVar3.h = "XTR";
        ceVar3.f37175c = string3;
        this.f38233q1 = ceVar3;
        this.f38234r1 = new kd(this, 3);
        this.f38236s1 = new Object();
        this.f38219b1 = z10;
        this.f38220c1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.Z0 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.Z0.setMaximumFractionDigits(12);
        this.Z0.setGroupingUsed(false);
        this.f38235s0 = s91Var;
        this.f38237t0 = b6Var;
        this.f38238u0 = i9;
        this.f38239v0 = j10;
        long j11 = -j10;
        TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(j11));
        if (chat != null) {
            this.f38241x0 = chat.level;
        }
        MessagesController.getInstance(i9).getBoostsController().getBoostsStats(j10, new sb(this, 1));
        c0(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.f6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i9).getInputPeer(j10);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i9).getChatFull(j11);
            if (chatFull != null) {
                boolean z12 = chatFull.restricted_sponsored;
                this.f38226i1 = z12;
                this.f38227j1 = z12;
            }
            ConnectionsManager.getInstance(i9).sendRequest(tL_payments_getStarsRevenueStats, new qd(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i9).getChat(Long.valueOf(j11));
        this.f38242y0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new t1(s91Var, activity, b6Var, 13), b6Var), true);
        this.f38243z0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(i9).channelRevenueWithdrawalEnabled ? R.string.MonetizationBalanceInfo : R.string.MonetizationBalanceInfoNotAvailable), -1, 3, new kd(this, 8)), true);
        if (z11 && z10) {
            i10 = R.string.MonetizationProceedsStarsTONInfo;
        } else {
            i10 = z11 ? R.string.MonetizationProceedsStarsInfo : R.string.MonetizationProceedsTONInfo;
        }
        if (z11 && z10) {
            i11 = R.string.MonetizationProceedsStarsTONInfoLink;
        } else {
            i11 = z11 ? R.string.MonetizationProceedsStarsInfoLink : R.string.MonetizationProceedsTONInfoLink;
        }
        this.A0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i10), -1, 3, new jd(this, i11, 0), b6Var), true);
        this.B0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat2) ? R.string.MonetizationStarsInfo : R.string.MonetizationStarsInfoGroup), new kd(this, 0)), true);
        int i12 = org.telegram.ui.ActionBar.f6.f22947a7;
        setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        this.f38218a1 = new be(this, activity, i9, j10, s91Var.getClassGuid(), new kd(this, 1), b6Var);
        gh.m mVar = new gh.m(activity, 2);
        this.C0 = mVar;
        mVar.setOrientation(1);
        int i13 = org.telegram.ui.ActionBar.f6.f23001d6;
        mVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
        mVar.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(activity, false, true, true);
        this.E0 = j6Var;
        j6Var.setTypeface(AndroidUtilities.bold());
        int i14 = org.telegram.ui.ActionBar.f6.G6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, b6Var));
        j6Var.setTextSize(AndroidUtilities.dp(32.0f));
        j6Var.setGravity(17);
        this.D0 = new RelativeSizeSpan(0.6770833f);
        mVar.addView(j6Var, g7.e6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(activity, true, true, true);
        this.F0 = j6Var2;
        j6Var2.setGravity(17);
        int i15 = org.telegram.ui.ActionBar.f6.f23369y6;
        j6Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i15, b6Var));
        j6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        mVar.addView(j6Var2, g7.e6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        kh.d dVar = new kh.d(activity, b6Var, true);
        dVar.setRoundRadius(24);
        this.G0 = dVar;
        dVar.setEnabled(MessagesController.getInstance(i9).channelRevenueWithdrawalEnabled);
        dVar.g(LocaleController.getString(R.string.MonetizationWithdraw), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new mh.k3(15, this, s91Var));
        mVar.addView(dVar, g7.e6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        gh.m mVar2 = new gh.m(activity, 3);
        this.I0 = mVar2;
        mVar2.setOrientation(1);
        mVar2.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
        mVar2.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(activity, false, true, true);
        this.K0 = j6Var3;
        j6Var3.setTypeface(AndroidUtilities.bold());
        j6Var3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, b6Var));
        j6Var3.setTextSize(AndroidUtilities.dp(32.0f));
        j6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        mVar2.addView(j6Var3, g7.e6.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.j6 j6Var4 = new org.telegram.ui.Components.j6(activity, true, true, true);
        this.L0 = j6Var4;
        j6Var4.setGravity(17);
        j6Var4.setTextColor(org.telegram.ui.ActionBar.f6.v0(i15, b6Var));
        j6Var4.setTextSize(AndroidUtilities.dp(14.0f));
        mVar2.addView(j6Var4, g7.e6.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        gh.n nVar = new gh.n(this, activity, 1);
        this.Q0 = nVar;
        nVar.setVisibility(8);
        nVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        nVar.setLeftPadding(AndroidUtilities.dp(36.0f));
        gh.o oVar = new gh.o(activity, 2);
        this.U0 = oVar;
        oVar.setFocusable(false);
        oVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, b6Var));
        oVar.setCursorSize(AndroidUtilities.dp(20.0f));
        oVar.setCursorWidth(1.5f);
        oVar.setBackground(null);
        oVar.setTextSize(1, 18.0f);
        oVar.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        oVar.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        oVar.setInputType(2);
        oVar.setTypeface(Typeface.DEFAULT);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23312uf, b6Var));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23325vf, b6Var));
        oVar.setGravity(LocaleController.isRTL ? 5 : 3);
        oVar.setOnFocusChangeListener(new ld(this, 0));
        oVar.addTextChangedListener(new vd(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, g7.e6.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(oVar, g7.e6.o(-1, -2, 1.0f, 119));
        nVar.e(oVar);
        nVar.addView(linearLayout, g7.e6.e(-1, -2, 48));
        mVar2.addView(nVar, g7.e6.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.O0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? dVar2 = new kh.d(activity, b6Var, true);
        dVar2.setRoundRadius(24);
        this.M0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.g(LocaleController.formatPluralString("MonetizationStarsWithdraw", 0, new Object[0]), false, true);
        dVar2.setVisibility(0);
        dVar2.setOnClickListener(new fh.a3(this, i9, s91Var, 5));
        kh.d dVar3 = new kh.d(activity, b6Var, true);
        dVar3.setRoundRadius(24);
        this.P0 = dVar3;
        dVar3.setEnabled(false);
        dVar3.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        dVar3.setOnClickListener(new md(this, i9, j10, activity));
        linearLayout2.addView((View) dVar2, g7.e6.o(-1, 48, 1.0f, 119));
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            linearLayout2.addView(new Space(activity), g7.e6.o(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar3, g7.e6.o(-1, 48, 1.0f, 119));
        }
        mVar2.addView(linearLayout2, g7.e6.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        oVar.setOnEditorActionListener(new td(0, this, s91Var));
        this.f38222e1 = new jd(this, i9, 2);
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(s91Var, new a5(this, 2), new ud(this), new ud(this));
        this.W0 = i51Var;
        i51Var.setClipToPadding(false);
        i51Var.p1();
        addView(i51Var);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Y0 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        frameLayout.addView(linearLayout3, g7.e6.e(-2, -2, 17));
        ?? imageView2 = new ImageView(activity);
        imageView2.setAutoRepeat(true);
        imageView2.f(R.raw.statistic_preload, 120, 120, null);
        imageView2.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i16 = org.telegram.ui.ActionBar.f6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        textView.setTag(Integer.valueOf(i16));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i17 = org.telegram.ui.ActionBar.f6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i17, false));
        textView2.setTag(Integer.valueOf(i17));
        org.telegram.messenger.ll.l(R.string.LoadingStatsDescription, textView2, 1);
        linearLayout3.addView((View) imageView2, g7.e6.t(120, 120, 1, 0, 0, 0, 20));
        linearLayout3.addView(textView, g7.e6.t(-2, -2, 1, 0, 0, 0, 10));
        linearLayout3.addView(textView2, g7.e6.q(-2, -2, 1));
        addView(frameLayout, g7.e6.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.f3 d0(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.ActionBar.f3 j10 = org.telegram.messenger.ll.j(context, b6Var, false, false);
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        f10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_monetize);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var)));
        f10.addView(imageView, g7.e6.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        j3.r0.u(20.0f, 1, textView);
        int i18 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i18, b6Var));
        if (z10) {
            i9 = R.string.BotMonetizationInfoTitle;
        } else {
            i9 = R.string.MonetizationInfoTitle;
        }
        textView.setText(LocaleController.getString(i9));
        f10.addView(textView, g7.e6.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        int i19 = R.drawable.msg_channel;
        if (z10) {
            i10 = R.string.BotMonetizationInfoFeature1Name;
        } else {
            i10 = R.string.MonetizationInfoFeature1Name;
        }
        String string = LocaleController.getString(i10);
        if (z10) {
            i11 = R.string.BotMonetizationInfoFeature1Text;
        } else {
            i11 = R.string.MonetizationInfoFeature1Text;
        }
        f10.addView(new dh.g(context, i19, string, LocaleController.getString(i11), b6Var), g7.e6.t(-1, -2, 49, 8, 0, 8, 16));
        int i20 = R.drawable.menu_feature_split;
        if (z10) {
            i12 = R.string.BotMonetizationInfoFeature2Name;
        } else {
            i12 = R.string.MonetizationInfoFeature2Name;
        }
        String string2 = LocaleController.getString(i12);
        if (z10) {
            i13 = R.string.BotMonetizationInfoFeature2Text;
        } else {
            i13 = R.string.MonetizationInfoFeature2Text;
        }
        f10.addView(new dh.g(context, i20, string2, LocaleController.getString(i13), b6Var), g7.e6.t(-1, -2, 49, 8, 0, 8, 16));
        int i21 = R.drawable.menu_feature_withdrawals;
        if (z10) {
            i14 = R.string.BotMonetizationInfoFeature3Name;
        } else {
            i14 = R.string.MonetizationInfoFeature3Name;
        }
        String string3 = LocaleController.getString(i14);
        if (z10) {
            i15 = R.string.BotMonetizationInfoFeature3Text;
        } else {
            i15 = R.string.MonetizationInfoFeature3Text;
        }
        f10.addView(new dh.g(context, i21, string3, LocaleController.getString(i15), b6Var), g7.e6.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, b6Var));
        f10.addView(view, g7.e6.s(-1, 55, 12, 0, 12, 1.0f / AndroidUtilities.density, 0));
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        s5Var.setGravity(17);
        s5Var.setTextSize(1, 20.0f);
        s5Var.setTypeface(AndroidUtilities.bold());
        s5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i18, b6Var));
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.mini_gram_72, 0);
        eqVar.setScale(0.9f, 0.9f);
        eqVar.setColorKey(org.telegram.ui.ActionBar.f6.o6);
        eqVar.setRelativeSize(s5Var.getPaint().getFontMetricsInt());
        eqVar.spaceScaleX = 0.9f;
        spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
        if (z10) {
            i16 = R.string.BotMonetizationInfoTONTitle;
        } else {
            i16 = R.string.MonetizationInfoTONTitle;
        }
        s5Var.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(i16), spannableString));
        f10.addView(s5Var, g7.e6.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(context, b6Var);
        l80Var.setGravity(17);
        l80Var.setTextSize(1, 14.0f);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i18, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, b6Var));
        if (z10) {
            i17 = R.string.BotMonetizationInfoTONText;
        } else {
            i17 = R.string.MonetizationInfoTONText;
        }
        l80Var.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(i17)), new eh.f(23, context, z10)));
        f10.addView(l80Var, g7.e6.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        kh.d i22 = org.telegram.messenger.ll.i(24, context, b6Var, true);
        i22.g(LocaleController.getString(R.string.GotIt), false, true);
        i22.setOnClickListener(new nd(j10, 1));
        f10.addView(i22, g7.e6.t(-1, 48, 55, 10, 25, 10, 14));
        j10.setCustomView(f10);
        return j10;
    }

    public static CharSequence f0(CharSequence charSequence, TextPaint textPaint, float f10, float f11, boolean z10) {
        int i9;
        if (f38217u1 == null) {
            f38217u1 = new HashMap();
        }
        int i10 = textPaint.getFontMetricsInt().bottom;
        if (z10) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        int i11 = ((i10 * i9) * ((int) (f10 * 100.0f))) - ((int) (100.0f * f11));
        SpannableString spannableString = (SpannableString) f38217u1.get(Integer.valueOf(i11));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.mini_gram_72, 0);
                eqVar.setScale(f10, f10);
                eqVar.setColorKey(org.telegram.ui.ActionBar.f6.o6);
                eqVar.setRelativeSize(textPaint.getFontMetricsInt());
                eqVar.spaceScaleX = 0.9f;
                spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.eq eqVar2 = new org.telegram.ui.Components.eq(R.drawable.mini_gram_16, 0);
                eqVar2.setScale(f10, f10);
                eqVar2.setTranslateY(f11);
                eqVar2.spaceScaleX = 0.95f;
                spannableString.setSpan(eqVar2, 0, spannableString.length(), 33);
            }
            f38217u1.put(Integer.valueOf(i11), spannableString);
        }
        return AndroidUtilities.replaceMultipleCharSequence("TON", charSequence, spannableString);
    }

    public static void h0(Context context, int i9, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j10, org.telegram.ui.ActionBar.b6 b6Var) {
        long j11;
        org.telegram.ui.ActionBar.f3 f3Var;
        String string;
        long j12;
        long j13;
        long j14;
        boolean z10;
        char c10;
        String str;
        boolean z11;
        int i10;
        String str2;
        org.telegram.ui.ActionBar.f3 f3Var2;
        String userName;
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.f3 j15 = org.telegram.messenger.ll.j(context, b6Var, false, false);
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            String string2 = LocaleController.getString(R.string.MonetizationTransactionDetailWithdraw);
            j11 = 0;
            j12 = tL_broadcastRevenueTransactionWithdrawal.amount;
            z10 = tL_broadcastRevenueTransactionWithdrawal.pending;
            f3Var = j15;
            j13 = tL_broadcastRevenueTransactionWithdrawal.date;
            j14 = 0;
            c10 = 65535;
            str = string2;
            z11 = tL_broadcastRevenueTransactionWithdrawal.failed;
        } else {
            j11 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                string = LocaleController.getString(R.string.MonetizationTransactionDetailProceed);
                long j16 = tL_broadcastRevenueTransactionProceeds.from_date;
                long j17 = tL_broadcastRevenueTransactionProceeds.to_date;
                f3Var = j15;
                j12 = tL_broadcastRevenueTransactionProceeds.amount;
                j14 = j17;
                j13 = j16;
            } else {
                f3Var = j15;
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
        long j18 = j14;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        boolean z13 = z10;
        org.telegram.messenger.ll.k(18.0f, 1, textView);
        if (c10 < 0) {
            i10 = org.telegram.ui.ActionBar.f6.f23230q7;
        } else {
            i10 = org.telegram.ui.ActionBar.f6.f23146l8;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
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
        f10.addView(textView, g7.e6.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23369y6, b6Var));
        if (z13) {
            textView2.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
        } else if (j13 == j11) {
            textView2.setText(LocaleController.formatShortDateTime(j18));
        } else if (j18 == j11) {
            textView2.setText(LocaleController.formatShortDateTime(j13));
        } else {
            textView2.setText(LocaleController.formatShortDateTime(j13) + " - " + LocaleController.formatShortDateTime(j18));
        }
        if (z11) {
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, b6Var));
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        f10.addView(textView2, g7.e6.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.ll.k(14.0f, 1, textView3);
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        textView3.setText(str);
        f10.addView(textView3, g7.e6.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.f6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ci, b6Var)));
            if (j10 < j11) {
                TLRPC.Chat chat2 = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
                if (chat2 == null) {
                    userName = "";
                    chat = chat2;
                } else {
                    userName = chat2.title;
                    chat = chat2;
                }
            } else {
                TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
                userName = UserObject.getUserName(user);
                chat = user;
            }
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
            o9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
            z8Var.p(chat);
            o9Var.e(chat, z8Var);
            frameLayout.addView(o9Var, g7.e6.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            textView4.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, b6Var));
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, g7.e6.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            f10.addView(frameLayout, g7.e6.t(-2, 28, 1, 42, 10, 42, 0));
        }
        kh.d i11 = org.telegram.messenger.ll.i(24, context, b6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                i11.g(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false, true);
                i11.setOnClickListener(new mh.k3(16, context, tL_broadcastRevenueTransactionWithdrawal2));
                f3Var2 = f3Var;
                f10.addView(i11, g7.e6.t(-1, 48, 55, 18, 30, 18, 14));
                f3Var2.setCustomView(f10);
                f3Var2.show();
            }
        }
        i11.g(LocaleController.getString(R.string.OK), false, true);
        f3Var2 = f3Var;
        i11.setOnClickListener(new nd(f3Var2, 0));
        f10.addView(i11, g7.e6.t(-1, 48, 55, 18, 30, 18, 14));
        f3Var2.setCustomView(f10);
        f3Var2.show();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i9, int i10, int[] iArr, int i11) {
        int max;
        boolean z10;
        org.telegram.ui.Components.i51 i51Var = this.W0;
        if (viewGroup == i51Var) {
            be beVar = this.f38218a1;
            if (beVar.isAttachedToWindow()) {
                ((View) beVar.getParent()).getTop();
                int i12 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
                org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int bottom = ((View) beVar.getParent()).getBottom();
                if (i10 < 0) {
                    org.telegram.ui.ActionBar.k kVar = this.f38225h1;
                    if (kVar != null) {
                        if (isAttachedToWindow() && i51Var.getHeight() - bottom >= 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        kVar.setCastShadows(z10);
                    }
                    if (i51Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + i51Var.getPaddingBottom()) {
                        org.telegram.ui.Components.wk0 currentListView = beVar.getCurrentListView();
                        int L0 = ((f2.m0) currentListView.getLayoutManager()).L0();
                        int i13 = -1;
                        if (L0 != -1) {
                            f2.q1 K = currentListView.K(L0);
                            if (K != null) {
                                i13 = K.f5501a.getTop();
                            }
                            int paddingTop = currentListView.getPaddingTop();
                            if (i13 != paddingTop || L0 != 0) {
                                if (L0 != 0) {
                                    max = i10;
                                } else {
                                    max = Math.max(i10, i13 - paddingTop);
                                }
                                iArr[1] = max;
                                currentListView.scrollBy(0, i10);
                            }
                        }
                    }
                } else if (i10 > 0) {
                    org.telegram.ui.Components.wk0 currentListView2 = beVar.getCurrentListView();
                    if (i51Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + i51Var.getPaddingBottom() && currentListView2 != null && !currentListView2.canScrollVertically(1)) {
                        iArr[1] = i10;
                        i51Var.B0();
                    }
                }
            }
        }
    }

    public final void Z(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        boolean z10;
        FrameLayout frameLayout;
        rf.b bVar;
        ArrayList arrayList;
        if (this.f38229m1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38224g1 = tL_payments_starsRevenueStats.usd_rate;
        e91 e02 = s91.e0(tL_payments_starsRevenueStats.revenue_graph, LocaleController.getString(R.string.MonetizationGraphStarsRevenue), 2, false);
        this.f38229m1 = e02;
        if (e02 != null && (bVar = e02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f38229m1.d.d.get(0) != null) {
            ((rf.a) this.f38229m1.d.d.get(0)).f47158g = org.telegram.ui.ActionBar.f6.kj;
            this.f38229m1.d.h = (float) ((1.0d / this.f38224g1) / 100.0d);
        }
        g0(false, tL_payments_starsRevenueStats.status);
        if (!this.f38219b1 && (frameLayout = this.Y0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.gr.h).withEndAction(new kd(this, 7)).start();
        }
        org.telegram.ui.Components.i51 i51Var = this.W0;
        if (i51Var != null) {
            i51Var.U2.N(!z10);
            if (z10) {
                i51Var.u0(0);
            }
        }
    }

    public final void a0() {
        if (isAttachedToWindow() && this.f38219b1 && this.f38230n1 && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            this.f38235s0.showDialog(d0(getContext(), this.f38237t0, false));
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void b0(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        s91 s91Var = this.f38235s0;
        if (s91Var != null) {
            Activity parentActivity = s91Var.getParentActivity();
            int i9 = this.f38238u0;
            TLRPC.User currentUser = UserConfig.getInstance(i9).getCurrentUser();
            if (parentActivity != null && currentUser != null) {
                long j10 = this.f38239v0;
                if (z10) {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i9).getInputPeer(j10);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                    tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                    tL_payments_getStarsRevenueWithdrawalUrl.amount = this.T0;
                } else {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i9).getInputPeer(j10);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                }
                ConnectionsManager.getInstance(i9).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new kh.t1(this, twoStepVerificationActivity, parentActivity, z10, 1));
            }
        }
    }

    public final void c0(boolean z10) {
        if (!this.f38220c1) {
            return;
        }
        int i9 = this.f38238u0;
        gh.c0 g10 = gh.c0.g(i9);
        long j10 = this.f38239v0;
        TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, z10);
        if (h != null) {
            AndroidUtilities.runOnUIThread(new rd(1, this, h));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i9).getInputPeer(j10);
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.f6.I.q();
        ConnectionsManager.getInstance(i9).sendRequest(tL_payments_getStarsRevenueStats, new qd(this, 2));
    }

    public final void e0() {
        be beVar = this.f38218a1;
        kd kdVar = beVar.f36834e;
        boolean[] zArr = beVar.f36838s;
        boolean a2 = beVar.a();
        for (int i9 = 0; i9 < 2; i9++) {
            if (!zArr[i9]) {
                if (i9 == 1) {
                    beVar.h.clear();
                    beVar.f36835f = "";
                } else {
                    beVar.f36836n.clear();
                    beVar.f36837r = "";
                }
                zArr[i9] = false;
                beVar.c(i9);
            } else {
                return;
            }
        }
        if (beVar.a() != a2 && kdVar != null) {
            beVar.e();
            kdVar.run();
        }
    }

    public final void g0(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        ce ceVar;
        int i9;
        int i10;
        int i11;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.z41 z41Var;
        ce ceVar2;
        int i12;
        int i13;
        fe feVar = this;
        ce ceVar3 = feVar.f38233q1;
        ce ceVar4 = feVar.f38232p1;
        org.telegram.ui.Components.j6 j6Var = feVar.F0;
        RelativeSizeSpan relativeSizeSpan = feVar.D0;
        org.telegram.ui.Components.j6 j6Var2 = feVar.E0;
        ce ceVar5 = feVar.f38231o1;
        if (z10) {
            ceVar5.f37173a = true;
            long j10 = tL_starsRevenueStatus.available_balance.amount;
            ceVar5.d = j10;
            double d = j10 / 1.0E9d;
            long j11 = (long) (feVar.f38223f1 * d * 100.0d);
            ceVar5.f37176e = j11;
            if (feVar.Z0 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                ceVar2 = ceVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                feVar.Z0 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i12 = 6;
                feVar.Z0.setMaximumFractionDigits(6);
                feVar.Z0.setGroupingUsed(false);
            } else {
                ceVar2 = ceVar3;
                i12 = 6;
            }
            DecimalFormat decimalFormat2 = feVar.Z0;
            if (d > 1.5d) {
                i12 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f0("TON " + feVar.Z0.format(d), j6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            j6Var2.setText(spannableStringBuilder);
            j6Var.setText("≈" + BillingController.getInstance().formatCurrency(j11, "USD"));
            ceVar5.f37177f = "USD";
            ceVar4.f37173a = true;
            long j12 = tL_starsRevenueStatus.current_balance.amount;
            ceVar4.d = j12;
            feVar = this;
            double d9 = feVar.f38223f1;
            ceVar4.f37176e = (long) ((j12 / 1.0E9d) * d9 * 100.0d);
            ceVar4.f37177f = "USD";
            ce ceVar6 = ceVar2;
            ceVar6.f37173a = true;
            long j13 = tL_starsRevenueStatus.overall_revenue.amount;
            ceVar6.d = j13;
            ceVar6.f37176e = (long) ((j13 / 1.0E9d) * d9 * 100.0d);
            ceVar6.f37177f = "USD";
            feVar.f38230n1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            feVar.G0.setVisibility(i13);
        } else {
            double d10 = feVar.f38224g1;
            if (d10 != 0.0d) {
                ceVar5.f37178g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
                ceVar5.f37179i = starsAmount;
                ceVar5.f37180j = (long) (starsAmount.amount * d10 * 100.0d);
                int i14 = tL_starsRevenueStatus.next_withdrawal_at;
                wd wdVar = feVar.M0;
                if (j6Var2 == null || j6Var == null) {
                    ceVar = ceVar3;
                } else {
                    ceVar = ceVar3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(gh.oa.X0(false, TextUtils.concat("XTR ", gh.oa.I0(starsAmount, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    feVar.J0 = starsAmount;
                    feVar.K0.setText(spannableStringBuilder2);
                    feVar.L0.setText("≈" + BillingController.getInstance().formatCurrency((long) (feVar.f38224g1 * starsAmount.amount * 100.0d), "USD"));
                    if (starsAmount.amount > 0) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    feVar.Q0.setVisibility(i11);
                    if (feVar.S0) {
                        feVar.R0 = true;
                        long j14 = starsAmount.amount;
                        feVar.T0 = j14;
                        String l10 = Long.toString(j14);
                        gh.o oVar = feVar.U0;
                        oVar.setText(l10);
                        oVar.setSelection(oVar.getText().length());
                        feVar.R0 = false;
                        if (feVar.T0 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        wdVar.setEnabled(z12);
                    }
                    kh.d dVar = feVar.P0;
                    if (dVar != null) {
                        if (starsAmount.amount > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        dVar.setEnabled(z11);
                    }
                    feVar.H0 = i14;
                    jd jdVar = feVar.f38222e1;
                    AndroidUtilities.cancelRunOnUIThread(jdVar);
                    jdVar.run();
                }
                ceVar5.f37177f = "USD";
                ceVar4.f37178g = true;
                TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus.current_balance;
                ceVar4.f37179i = starsAmount2;
                double d11 = feVar.f38224g1;
                ceVar4.f37180j = (long) (starsAmount2.amount * d11 * 100.0d);
                ceVar4.f37177f = "USD";
                ce ceVar7 = ceVar;
                ceVar7.f37178g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.overall_revenue;
                ceVar7.f37179i = starsAmount3;
                ceVar7.f37180j = (long) (starsAmount3.amount * d11 * 100.0d);
                ceVar7.f37177f = "USD";
                feVar.f38230n1 = true;
                LinearLayout linearLayout = feVar.O0;
                if (linearLayout != null) {
                    if (tL_starsRevenueStatus.withdrawal_enabled) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    linearLayout.setVisibility(i10);
                }
                if (wdVar != null) {
                    if (tL_starsRevenueStatus.available_balance.amount <= 0 && !BuildVars.DEBUG_PRIVATE_VERSION) {
                        i9 = 8;
                    } else {
                        i9 = 0;
                    }
                    wdVar.setVisibility(i9);
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Components.i51 i51Var = feVar.W0;
        if (i51Var != null && (z41Var = i51Var.U2) != null) {
            z41Var.N(true);
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void i(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        boolean z10;
        be beVar = this.f38218a1;
        org.telegram.ui.Components.i51 i51Var = this.W0;
        if (viewGroup == i51Var) {
            try {
                if (beVar.isAttachedToWindow()) {
                    org.telegram.ui.Components.wk0 currentListView = beVar.getCurrentListView();
                    int bottom = ((View) beVar.getParent()).getBottom();
                    org.telegram.ui.ActionBar.k kVar = this.f38225h1;
                    if (kVar != null) {
                        if (isAttachedToWindow() && i51Var.getHeight() - bottom >= 0) {
                            z10 = false;
                            kVar.setCastShadows(z10);
                        }
                        z10 = true;
                        kVar.setCastShadows(z10);
                    }
                    if (i51Var.getHeight() - bottom >= i51Var.getPaddingBottom() + AndroidUtilities.dp(8.0f)) {
                        iArr[1] = i12;
                        currentListView.scrollBy(0, i12);
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
        f38216t1 = this;
        super.onAttachedToWindow();
        a0();
    }

    @Override
    public final void onDetachedFromWindow() {
        f38216t1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.k kVar = this.f38225h1;
        if (kVar != null) {
            kVar.setCastShadows(true);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
    }

    @Override
    public final void p(int i9, View view) {
        this.f38236s1.f4376a = 0;
    }

    @Override
    public final boolean q(View view, View view2, int i9, int i10) {
        if (i9 == 2) {
            return true;
        }
        return false;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f38225h1 = kVar;
    }

    @Override
    public final void t(View view, View view2, int i9, int i10) {
        this.f38236s1.f4376a = i9;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13) {
    }
}
