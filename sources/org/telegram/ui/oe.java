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
public final class oe extends org.telegram.ui.Components.yw0 implements r0.m {
    public static oe f40653x1;
    public static HashMap f40654y1;
    public TL_stories.TL_premium_boostsStatus A0;
    public int B0;
    public final CharSequence C0;
    public final CharSequence D0;
    public final CharSequence E0;
    public final CharSequence F0;
    public final ce G0;
    public final RelativeSizeSpan H0;
    public final org.telegram.ui.Components.r6 I0;
    public final org.telegram.ui.Components.r6 J0;
    public final ci.d K0;
    public int L0;
    public final ce M0;
    public TL_stars.StarsAmount N0;
    public final org.telegram.ui.Components.r6 O0;
    public final org.telegram.ui.Components.r6 P0;
    public final fe Q0;
    public final org.telegram.ui.Components.gr[] R0;
    public final LinearLayout S0;
    public final ci.d T0;
    public final de U0;
    public boolean V0;
    public boolean W0;
    public long X0;
    public final fi.o Y0;
    public org.telegram.ui.Components.sc Z0;
    public final org.telegram.ui.Components.p71 f40655a1;
    public ah.n f40656b1;
    public final FrameLayout f40657c1;
    public DecimalFormat f40658d1;
    public final ke f40659e1;
    public final boolean f40660f1;
    public final boolean f40661g1;
    public SpannableStringBuilder f40662h1;
    public final rd f40663i1;
    public double f40664j1;
    public double f40665k1;
    public org.telegram.ui.ActionBar.k l1;
    public boolean f40666m1;
    public boolean f40667n1;
    public pa1 f40668o1;
    public pa1 f40669p1;
    public pa1 f40670q1;
    public boolean f40671r1;
    public final le f40672s1;
    public final le f40673t1;
    public final le f40674u1;
    public final sd f40675v1;
    public final db1 f40676w0;
    public final b2.q0 f40677w1;
    public final org.telegram.ui.ActionBar.c6 f40678x0;
    public final int f40679y0;
    public final long f40680z0;

    public oe(Activity activity, db1 db1Var, int i10, long j3, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(activity, null);
        int i11;
        int i12;
        this.N0 = TL_stars.StarsAmount.ofStars(0L);
        this.R0 = new org.telegram.ui.Components.gr[1];
        this.V0 = false;
        this.W0 = true;
        this.f40666m1 = false;
        this.f40667n1 = false;
        this.f40671r1 = false;
        String string = LocaleController.getString(R.string.MonetizationOverviewAvailable);
        le leVar = new le();
        leVar.f39714a = false;
        leVar.f39715b = "TON";
        leVar.h = "XTR";
        leVar.f39716c = string;
        this.f40672s1 = leVar;
        String string2 = LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal);
        le leVar2 = new le();
        leVar2.f39714a = false;
        leVar2.f39715b = "TON";
        leVar2.h = "XTR";
        leVar2.f39716c = string2;
        this.f40673t1 = leVar2;
        String string3 = LocaleController.getString(R.string.MonetizationOverviewTotal);
        le leVar3 = new le();
        leVar3.f39714a = false;
        leVar3.f39715b = "TON";
        leVar3.h = "XTR";
        leVar3.f39716c = string3;
        this.f40674u1 = leVar3;
        this.f40675v1 = new sd(this, 3);
        this.f40677w1 = new Object();
        this.f40660f1 = z10;
        this.f40661g1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f40658d1 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.f40658d1.setMaximumFractionDigits(12);
        this.f40658d1.setGroupingUsed(false);
        this.f40676w0 = db1Var;
        this.f40678x0 = c6Var;
        this.f40679y0 = i10;
        this.f40680z0 = j3;
        long j10 = -j3;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        if (chat != null) {
            this.B0 = chat.level;
        }
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j3, new t3(this, 2));
        c0(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.h6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
            if (chatFull != null) {
                boolean z12 = chatFull.restricted_sponsored;
                this.f40666m1 = z12;
                this.f40667n1 = z12;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new yd(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.C0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new r1(db1Var, activity, c6Var, 13), c6Var), true);
        this.D0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled ? R.string.MonetizationBalanceInfo : R.string.MonetizationBalanceInfoNotAvailable), -1, 3, new sd(this, 8)), true);
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
        this.E0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new rd(this, i12, 0), c6Var), true);
        this.F0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat2) ? R.string.MonetizationStarsInfo : R.string.MonetizationStarsInfoGroup), new sd(this, 0)), true);
        int i13 = org.telegram.ui.ActionBar.h6.f20503a7;
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i13, c6Var));
        this.f40659e1 = new ke(this, activity, i10, j3, db1Var.getClassGuid(), new sd(this, 1), c6Var);
        ce ceVar = new ce(activity, 0);
        this.G0 = ceVar;
        ceVar.setOrientation(1);
        int i14 = org.telegram.ui.ActionBar.h6.f20559d6;
        ceVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i14, c6Var));
        ceVar.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(activity, false, true, true);
        this.I0 = r6Var;
        r6Var.setTypeface(AndroidUtilities.bold());
        int i15 = org.telegram.ui.ActionBar.h6.G6;
        r6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, c6Var));
        r6Var.setTextSize(AndroidUtilities.dp(32.0f));
        r6Var.setGravity(17);
        this.H0 = new RelativeSizeSpan(0.6770833f);
        ceVar.addView(r6Var, w7.w5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(activity, true, true, true);
        this.J0 = r6Var2;
        r6Var2.setGravity(17);
        int i16 = org.telegram.ui.ActionBar.h6.f20945y6;
        r6Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, c6Var));
        r6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        ceVar.addView(r6Var2, w7.w5.a(17.0f, 22.0f, 4.0f, 22.0f, 0.0f, -1, 49));
        ci.d dVar = new ci.d(activity, c6Var, true);
        dVar.setRoundRadius(24);
        this.K0 = dVar;
        dVar.setEnabled(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled);
        dVar.g(LocaleController.getString(R.string.MonetizationWithdraw), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new ai.f2(28, this, db1Var));
        ceVar.addView(dVar, w7.w5.a(48.0f, 18.0f, 13.0f, 18.0f, 0.0f, -1, 55));
        ce ceVar2 = new ce(activity, 1);
        this.M0 = ceVar2;
        ceVar2.setOrientation(1);
        ceVar2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i14, c6Var));
        ceVar2.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.r6 r6Var3 = new org.telegram.ui.Components.r6(activity, false, true, true);
        this.O0 = r6Var3;
        r6Var3.setTypeface(AndroidUtilities.bold());
        r6Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, c6Var));
        r6Var3.setTextSize(AndroidUtilities.dp(32.0f));
        r6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        ceVar2.addView(r6Var3, w7.w5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.r6 r6Var4 = new org.telegram.ui.Components.r6(activity, true, true, true);
        this.P0 = r6Var4;
        r6Var4.setGravity(17);
        r6Var4.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, c6Var));
        r6Var4.setTextSize(AndroidUtilities.dp(14.0f));
        ceVar2.addView(r6Var4, w7.w5.a(17.0f, 22.0f, 4.0f, 22.0f, 0.0f, -1, 49));
        de deVar = new de(this, activity, 0);
        this.U0 = deVar;
        deVar.setVisibility(8);
        deVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        deVar.setLeftPadding(AndroidUtilities.dp(36.0f));
        fi.o oVar = new fi.o(activity, 1);
        this.Y0 = oVar;
        oVar.setFocusable(false);
        oVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, c6Var));
        oVar.setCursorSize(AndroidUtilities.dp(20.0f));
        oVar.setCursorWidth(1.5f);
        oVar.setBackground(null);
        oVar.setTextSize(1, 18.0f);
        oVar.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        oVar.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        oVar.setInputType(2);
        oVar.setTypeface(Typeface.DEFAULT);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20883uf, c6Var));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20900vf, c6Var));
        oVar.setGravity(LocaleController.isRTL ? 5 : 3);
        oVar.setOnFocusChangeListener(new td(this, 0));
        oVar.addTextChangedListener(new ee(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.w5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(oVar, w7.w5.o(-1, -2, 1.0f, 119));
        deVar.e(oVar);
        deVar.addView(linearLayout, w7.w5.e(-1, -2, 48));
        ceVar2.addView(deVar, w7.w5.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.S0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? dVar2 = new ci.d(activity, c6Var, true);
        dVar2.setRoundRadius(24);
        this.Q0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.g(LocaleController.formatPluralString("MonetizationStarsWithdraw", 0, new Object[0]), false, true);
        dVar2.setVisibility(0);
        dVar2.setOnClickListener(new org.telegram.ui.Cells.sa(this, i10, db1Var, 2));
        ci.d dVar3 = new ci.d(activity, c6Var, true);
        dVar3.setRoundRadius(24);
        this.T0 = dVar3;
        dVar3.setEnabled(false);
        dVar3.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        dVar3.setOnClickListener(new ud(this, i10, j3, activity));
        linearLayout2.addView((View) dVar2, w7.w5.o(-1, 48, 1.0f, 119));
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            linearLayout2.addView(new Space(activity), w7.w5.o(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar3, w7.w5.o(-1, 48, 1.0f, 119));
        }
        ceVar2.addView(linearLayout2, w7.w5.a(48.0f, 18.0f, 13.0f, 18.0f, 0.0f, -1, 55));
        oVar.setOnEditorActionListener(new ae(0, this, db1Var));
        this.f40663i1 = new rd(this, i10, 2);
        org.telegram.ui.Components.p71 p71Var = new org.telegram.ui.Components.p71(db1Var, new e5(this, 2), new be(this), new be(this));
        this.f40655a1 = p71Var;
        p71Var.setClipToPadding(false);
        p71Var.p1();
        addView(p71Var);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f40657c1 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i13, c6Var));
        frameLayout.addView(linearLayout3, w7.w5.e(-2, -2, 17));
        ?? imageView2 = new ImageView(activity);
        imageView2.setAutoRepeat(true);
        imageView2.f(R.raw.statistic_preload, 120, 120, null);
        imageView2.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i17 = org.telegram.ui.ActionBar.h6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
        textView.setTag(Integer.valueOf(i17));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i18 = org.telegram.ui.ActionBar.h6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
        textView2.setTag(Integer.valueOf(i18));
        org.telegram.messenger.am.m(R.string.LoadingStatsDescription, textView2, 1);
        linearLayout3.addView((View) imageView2, w7.w5.t(120, 120, 1, 0, 0, 0, 20));
        linearLayout3.addView(textView, w7.w5.t(-2, -2, 1, 0, 0, 0, 10));
        linearLayout3.addView(textView2, w7.w5.q(-2, -2, 1));
        addView(frameLayout, w7.w5.e(-1, -1, 119));
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
        org.telegram.ui.ActionBar.e3 i19 = org.telegram.messenger.am.i(1, context, c6Var, false);
        LinearLayout e7 = org.telegram.messenger.am.e(context, 1);
        e7.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_monetize);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, c6Var)));
        e7.addView(imageView, w7.w5.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        int i20 = org.telegram.ui.ActionBar.h6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i20, c6Var));
        if (z10) {
            i10 = R.string.BotMonetizationInfoTitle;
        } else {
            i10 = R.string.MonetizationInfoTitle;
        }
        textView.setText(LocaleController.getString(i10));
        e7.addView(textView, w7.w5.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
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
        e7.addView(new ai.x5(context, i21, string, LocaleController.getString(i12), c6Var), w7.w5.t(-1, -2, 49, 8, 0, 8, 16));
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
        e7.addView(new ai.x5(context, i22, string2, LocaleController.getString(i14), c6Var), w7.w5.t(-1, -2, 49, 8, 0, 8, 16));
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
        e7.addView(new ai.x5(context, i23, string3, LocaleController.getString(i16), c6Var), w7.w5.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d7, c6Var));
        e7.addView(view, w7.w5.s(-1, 55, 12, 0, 12, 1.0f / AndroidUtilities.density, 0));
        org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(context);
        a6Var.setGravity(17);
        a6Var.setTextSize(1, 20.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i20, c6Var));
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.gr grVar = new org.telegram.ui.Components.gr(R.drawable.mini_gram_72, 0);
        grVar.recolorDrawable = false;
        grVar.setScale(0.9f, 0.9f);
        grVar.setRelativeSize(a6Var.getPaint().getFontMetricsInt());
        grVar.spaceScaleX = 0.9f;
        spannableString.setSpan(grVar, 0, spannableString.length(), 33);
        if (z10) {
            i17 = R.string.BotMonetizationInfoTONTitle;
        } else {
            i17 = R.string.MonetizationInfoTONTitle;
        }
        a6Var.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(i17), spannableString));
        e7.addView(a6Var, w7.w5.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.ia0 ia0Var = new org.telegram.ui.Components.ia0(context, c6Var);
        ia0Var.setGravity(17);
        ia0Var.setTextSize(1, 14.0f);
        ia0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i20, c6Var));
        ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, c6Var));
        if (z10) {
            i18 = R.string.BotMonetizationInfoTONText;
        } else {
            i18 = R.string.MonetizationInfoTONText;
        }
        ia0Var.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(i18)), new bi.f(20, context, z10)));
        e7.addView(ia0Var, w7.w5.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        ci.d f7 = org.telegram.messenger.am.f(24, context, c6Var, true);
        f7.g(LocaleController.getString(R.string.GotIt), false, true);
        f7.setOnClickListener(new vd(i19, 1));
        e7.addView(f7, w7.w5.t(-1, 48, 55, 10, 25, 10, 14));
        i19.setCustomView(e7);
        return i19;
    }

    public static CharSequence f0(CharSequence charSequence, TextPaint textPaint, float f7, float f10, boolean z10) {
        int i10;
        if (f40654y1 == null) {
            f40654y1 = new HashMap();
        }
        int i11 = textPaint.getFontMetricsInt().bottom;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = ((i11 * i10) * ((int) (f7 * 100.0f))) - ((int) (100.0f * f10));
        SpannableString spannableString = (SpannableString) f40654y1.get(Integer.valueOf(i12));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.gr grVar = new org.telegram.ui.Components.gr(R.drawable.mini_gram_72, 0);
                grVar.recolorDrawable = false;
                grVar.setScale(f7, f7);
                grVar.setColorKey(org.telegram.ui.ActionBar.h6.f20762o6);
                grVar.setRelativeSize(textPaint.getFontMetricsInt());
                grVar.spaceScaleX = 0.9f;
                spannableString.setSpan(grVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.gr grVar2 = new org.telegram.ui.Components.gr(R.drawable.mini_gram_16, 0);
                grVar2.recolorDrawable = false;
                grVar2.setScale(f7, f7);
                grVar2.setTranslateY(f10);
                grVar2.spaceScaleX = 0.95f;
                spannableString.setSpan(grVar2, 0, spannableString.length(), 33);
            }
            f40654y1.put(Integer.valueOf(i12), spannableString);
        }
        return AndroidUtilities.replaceMultipleCharSequence("TON", charSequence, spannableString);
    }

    public static void h0(Context context, int i10, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j3, org.telegram.ui.ActionBar.c6 c6Var) {
        long j10;
        org.telegram.ui.ActionBar.e3 e3Var;
        String string;
        long j11;
        long j12;
        long j13;
        boolean z10;
        char c10;
        String str;
        boolean z11;
        int i11;
        String str2;
        org.telegram.ui.ActionBar.e3 e3Var2;
        String userName;
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.e3 i12 = org.telegram.messenger.am.i(1, context, c6Var, false);
        LinearLayout e7 = org.telegram.messenger.am.e(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            String string2 = LocaleController.getString(R.string.MonetizationTransactionDetailWithdraw);
            j10 = 0;
            j11 = tL_broadcastRevenueTransactionWithdrawal.amount;
            z10 = tL_broadcastRevenueTransactionWithdrawal.pending;
            j12 = tL_broadcastRevenueTransactionWithdrawal.date;
            c10 = 65535;
            e3Var = i12;
            str = string2;
            j13 = 0;
            z11 = tL_broadcastRevenueTransactionWithdrawal.failed;
        } else {
            j10 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                string = LocaleController.getString(R.string.MonetizationTransactionDetailProceed);
                long j14 = tL_broadcastRevenueTransactionProceeds.from_date;
                long j15 = tL_broadcastRevenueTransactionProceeds.to_date;
                e3Var = i12;
                j11 = tL_broadcastRevenueTransactionProceeds.amount;
                j13 = j15;
                j12 = j14;
            } else {
                e3Var = i12;
                if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionRefund) {
                    TL_stats.TL_broadcastRevenueTransactionRefund tL_broadcastRevenueTransactionRefund = (TL_stats.TL_broadcastRevenueTransactionRefund) broadcastRevenueTransaction;
                    string = LocaleController.getString(R.string.MonetizationTransactionDetailRefund);
                    j11 = tL_broadcastRevenueTransactionRefund.amount;
                    j12 = tL_broadcastRevenueTransactionRefund.from_date;
                    j13 = 0;
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
        long j16 = j13;
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        org.telegram.messenger.am.k(18.0f, 1, textView);
        if (c10 < 0) {
            i11 = org.telegram.ui.ActionBar.h6.f20799q7;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.f20707l8;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (c10 < 0) {
            str2 = "-";
        } else {
            str2 = "+";
        }
        spannableStringBuilder.append((CharSequence) str2);
        spannableStringBuilder.append((CharSequence) decimalFormat.format(Math.round((Math.abs(j11) / 1.0E9d) * 100000.0d) / 100000.0d));
        spannableStringBuilder.append((CharSequence) " TON");
        int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.3333334f), 0, indexOf, 33);
        }
        textView.setText(spannableStringBuilder);
        e7.addView(textView, w7.w5.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20945y6, c6Var));
        if (z13) {
            textView2.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
        } else if (j12 == j10) {
            textView2.setText(LocaleController.formatShortDateTime(j16));
        } else if (j16 == j10) {
            textView2.setText(LocaleController.formatShortDateTime(j12));
        } else {
            textView2.setText(LocaleController.formatShortDateTime(j12) + " - " + LocaleController.formatShortDateTime(j16));
        }
        if (z11) {
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20799q7, c6Var));
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        e7.addView(textView2, w7.w5.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.am.k(14.0f, 1, textView3);
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, c6Var));
        textView3.setText(str);
        e7.addView(textView3, w7.w5.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20552ci, c6Var)));
            if (j3 < j10) {
                TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
                if (chat2 == null) {
                    userName = "";
                    chat = chat2;
                } else {
                    userName = chat2.title;
                    chat = chat2;
                }
            } else {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                userName = UserObject.getUserName(user);
                chat = user;
            }
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.c6) null);
            j9Var.p(chat);
            y9Var.e(chat, j9Var);
            frameLayout.addView(y9Var, w7.w5.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            textView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20667j5, c6Var));
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, w7.w5.a(-2.0f, 37.0f, 0.0f, 10.0f, 0.0f, -2, 19));
            e7.addView(frameLayout, w7.w5.t(-2, 28, 1, 42, 10, 42, 0));
        }
        ci.d f7 = org.telegram.messenger.am.f(24, context, c6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                f7.g(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false, true);
                f7.setOnClickListener(new ai.f2(context, tL_broadcastRevenueTransactionWithdrawal2));
                e3Var2 = e3Var;
                e7.addView(f7, w7.w5.t(-1, 48, 55, 18, 30, 18, 14));
                e3Var2.setCustomView(e7);
                e3Var2.show();
            }
        }
        f7.g(LocaleController.getString(R.string.OK), false, true);
        e3Var2 = e3Var;
        f7.setOnClickListener(new vd(e3Var2, 0));
        e7.addView(f7, w7.w5.t(-1, 48, 55, 18, 30, 18, 14));
        e3Var2.setCustomView(e7);
        e3Var2.show();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        int max;
        boolean z10;
        org.telegram.ui.Components.p71 p71Var = this.f40655a1;
        if (viewGroup == p71Var) {
            ke keVar = this.f40659e1;
            if (keVar.isAttachedToWindow()) {
                ((View) keVar.getParent()).getTop();
                int i13 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
                org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int bottom = ((View) keVar.getParent()).getBottom();
                if (i11 < 0) {
                    org.telegram.ui.ActionBar.k kVar = this.l1;
                    if (kVar != null) {
                        if (isAttachedToWindow() && p71Var.getHeight() - bottom >= 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        kVar.setCastShadows(z10);
                    }
                    if (p71Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + p71Var.getPaddingBottom()) {
                        org.telegram.ui.Components.wm0 currentListView = keVar.getCurrentListView();
                        int L0 = ((s4.d0) currentListView.getLayoutManager()).L0();
                        int i14 = -1;
                        if (L0 != -1) {
                            s4.d1 K = currentListView.K(L0);
                            if (K != null) {
                                i14 = K.f47889a.getTop();
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
                    org.telegram.ui.Components.wm0 currentListView2 = keVar.getCurrentListView();
                    if (p71Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + p71Var.getPaddingBottom() && currentListView2 != null && !currentListView2.canScrollVertically(1)) {
                        iArr[1] = i11;
                        p71Var.B0();
                    }
                }
            }
        }
    }

    public final void Z(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        boolean z10;
        FrameLayout frameLayout;
        jg.b bVar;
        ArrayList arrayList;
        if (this.f40670q1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40665k1 = tL_payments_starsRevenueStats.usd_rate;
        pa1 f02 = db1.f0(tL_payments_starsRevenueStats.revenue_graph, LocaleController.getString(R.string.MonetizationGraphStarsRevenue), 2, false);
        this.f40670q1 = f02;
        if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f40670q1.d.d.get(0) != null) {
            ((jg.a) this.f40670q1.d.d.get(0)).f14153g = org.telegram.ui.ActionBar.h6.kj;
            this.f40670q1.d.h = (float) ((1.0d / this.f40665k1) / 100.0d);
        }
        g0(false, tL_payments_starsRevenueStats.status);
        if (!this.f40660f1 && (frameLayout = this.f40657c1) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.js.h).withEndAction(new sd(this, 7)).start();
        }
        org.telegram.ui.Components.p71 p71Var = this.f40655a1;
        if (p71Var != null) {
            p71Var.W2.N(!z10);
            if (z10) {
                p71Var.u0(0);
            }
        }
    }

    public final void a0() {
        if (isAttachedToWindow() && this.f40660f1 && this.f40671r1 && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            this.f40676w0.showDialog(d0(getContext(), this.f40678x0, false));
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void b0(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        db1 db1Var = this.f40676w0;
        if (db1Var != null) {
            Activity parentActivity = db1Var.getParentActivity();
            int i10 = this.f40679y0;
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            if (parentActivity != null && currentUser != null) {
                long j3 = this.f40680z0;
                if (z10) {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                    tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                    tL_payments_getStarsRevenueWithdrawalUrl.amount = this.X0;
                } else {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = true;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                }
                ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new ci.s1(this, twoStepVerificationActivity, parentActivity, z10, 1));
            }
        }
    }

    public final void c0(boolean z10) {
        if (!this.f40661g1) {
            return;
        }
        int i10 = this.f40679y0;
        yh.o g10 = yh.o.g(i10);
        long j3 = this.f40680z0;
        TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, z10);
        if (h != null) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.f6(23, this, h));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.h6.I.q();
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new yd(this, 2));
    }

    public final void e0() {
        ke keVar = this.f40659e1;
        sd sdVar = keVar.f39460e;
        boolean[] zArr = keVar.f39464s;
        boolean a2 = keVar.a();
        for (int i10 = 0; i10 < 2; i10++) {
            if (!zArr[i10]) {
                if (i10 == 1) {
                    keVar.h.clear();
                    keVar.f39461f = "";
                } else {
                    keVar.f39462n.clear();
                    keVar.f39463r = "";
                }
                zArr[i10] = false;
                keVar.c(i10);
            } else {
                return;
            }
        }
        if (keVar.a() != a2 && sdVar != null) {
            keVar.e();
            sdVar.run();
        }
    }

    public final void g0(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        le leVar;
        int i10;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.h71 h71Var;
        long j3;
        le leVar2;
        int i14;
        int i15;
        oe oeVar = this;
        le leVar3 = oeVar.f40674u1;
        le leVar4 = oeVar.f40673t1;
        org.telegram.ui.Components.r6 r6Var = oeVar.J0;
        RelativeSizeSpan relativeSizeSpan = oeVar.H0;
        org.telegram.ui.Components.r6 r6Var2 = oeVar.I0;
        le leVar5 = oeVar.f40672s1;
        if (z10) {
            leVar5.f39714a = true;
            long j10 = tL_starsRevenueStatus.available_balance.amount;
            leVar5.d = j10;
            double d = j10 / 1.0E9d;
            leVar5.f39717e = (long) (oeVar.f40664j1 * d * 100.0d);
            if (oeVar.f40658d1 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                leVar2 = leVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                oeVar.f40658d1 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i14 = 6;
                oeVar.f40658d1.setMaximumFractionDigits(6);
                oeVar.f40658d1.setGroupingUsed(false);
            } else {
                leVar2 = leVar3;
                i14 = 6;
            }
            DecimalFormat decimalFormat2 = oeVar.f40658d1;
            if (d > 1.5d) {
                i14 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i14);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f0("TON " + oeVar.f40658d1.format(d), r6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            r6Var2.setText(spannableStringBuilder);
            r6Var.setText("≈" + BillingController.getInstance().formatCurrency(j3, "USD"));
            leVar5.f39718f = "USD";
            leVar4.f39714a = true;
            long j11 = tL_starsRevenueStatus.current_balance.amount;
            leVar4.d = j11;
            oeVar = this;
            double d10 = oeVar.f40664j1;
            leVar4.f39717e = (long) ((j11 / 1.0E9d) * d10 * 100.0d);
            leVar4.f39718f = "USD";
            le leVar6 = leVar2;
            leVar6.f39714a = true;
            long j12 = tL_starsRevenueStatus.overall_revenue.amount;
            leVar6.d = j12;
            leVar6.f39717e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            leVar6.f39718f = "USD";
            oeVar.f40671r1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            oeVar.K0.setVisibility(i15);
        } else {
            double d11 = oeVar.f40665k1;
            if (d11 != 0.0d) {
                leVar5.f39719g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.available_balance;
                leVar5.f39720i = starsAmount3;
                leVar5.f39721j = (long) (starsAmount3.amount * d11 * 100.0d);
                int i16 = tL_starsRevenueStatus.next_withdrawal_at;
                fe feVar = oeVar.Q0;
                if (r6Var2 == null || r6Var == null) {
                    leVar = leVar3;
                    i10 = 0;
                } else {
                    leVar = leVar3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(yh.p7.Y0(false, TextUtils.concat("XTR ", yh.p7.K0(starsAmount3, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    oeVar.N0 = starsAmount3;
                    oeVar.O0.setText(spannableStringBuilder2);
                    oeVar.P0.setText("≈" + BillingController.getInstance().formatCurrency((long) (oeVar.f40665k1 * starsAmount3.amount * 100.0d), "USD"));
                    if (starsAmount3.amount > 0) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    oeVar.U0.setVisibility(i13);
                    if (oeVar.W0) {
                        oeVar.V0 = true;
                        long j13 = starsAmount3.amount;
                        oeVar.X0 = j13;
                        String l4 = Long.toString(j13);
                        fi.o oVar = oeVar.Y0;
                        oVar.setText(l4);
                        oVar.setSelection(oVar.getText().length());
                        i10 = 0;
                        oeVar.V0 = false;
                        if (oeVar.X0 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        feVar.setEnabled(z12);
                    } else {
                        i10 = 0;
                    }
                    ci.d dVar = oeVar.T0;
                    if (dVar != null) {
                        if (starsAmount3.amount > 0) {
                            z11 = 1;
                        } else {
                            z11 = i10;
                        }
                        dVar.setEnabled(z11);
                    }
                    oeVar.L0 = i16;
                    rd rdVar = oeVar.f40663i1;
                    AndroidUtilities.cancelRunOnUIThread(rdVar);
                    rdVar.run();
                }
                leVar5.f39718f = "USD";
                leVar4.f39719g = true;
                leVar4.f39720i = tL_starsRevenueStatus.current_balance;
                double d12 = oeVar.f40665k1;
                leVar4.f39721j = (long) (starsAmount.amount * d12 * 100.0d);
                leVar4.f39718f = "USD";
                le leVar7 = leVar;
                leVar7.f39719g = true;
                leVar7.f39720i = tL_starsRevenueStatus.overall_revenue;
                leVar7.f39721j = (long) (starsAmount2.amount * d12 * 100.0d);
                leVar7.f39718f = "USD";
                oeVar.f40671r1 = true;
                LinearLayout linearLayout = oeVar.S0;
                if (linearLayout != null) {
                    if (tL_starsRevenueStatus.withdrawal_enabled) {
                        i12 = i10;
                    } else {
                        i12 = 8;
                    }
                    linearLayout.setVisibility(i12);
                }
                if (feVar != null) {
                    if (tL_starsRevenueStatus.available_balance.amount <= 0 && !BuildVars.DEBUG_PRIVATE_VERSION) {
                        i11 = 8;
                    } else {
                        i11 = i10;
                    }
                    feVar.setVisibility(i11);
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Components.p71 p71Var = oeVar.f40655a1;
        if (p71Var != null && (h71Var = p71Var.W2) != null) {
            h71Var.N(true);
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        boolean z10;
        ke keVar = this.f40659e1;
        org.telegram.ui.Components.p71 p71Var = this.f40655a1;
        if (viewGroup == p71Var) {
            try {
                if (keVar.isAttachedToWindow()) {
                    org.telegram.ui.Components.wm0 currentListView = keVar.getCurrentListView();
                    int bottom = ((View) keVar.getParent()).getBottom();
                    org.telegram.ui.ActionBar.k kVar = this.l1;
                    if (kVar != null) {
                        if (isAttachedToWindow() && p71Var.getHeight() - bottom >= 0) {
                            z10 = false;
                            kVar.setCastShadows(z10);
                        }
                        z10 = true;
                        kVar.setCastShadows(z10);
                    }
                    if (p71Var.getHeight() - bottom >= p71Var.getPaddingBottom() + AndroidUtilities.dp(8.0f)) {
                        iArr[1] = i13;
                        currentListView.scrollBy(0, i13);
                    }
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
                AndroidUtilities.runOnUIThread(new sd(this, 2));
            }
        }
    }

    @Override
    public final void o(int i10, View view) {
        this.f40677w1.f3531a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        f40653x1 = this;
        super.onAttachedToWindow();
        a0();
    }

    @Override
    public final void onDetachedFromWindow() {
        f40653x1 = null;
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
        this.f40677w1.f3531a = i10;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.l1 = kVar;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
