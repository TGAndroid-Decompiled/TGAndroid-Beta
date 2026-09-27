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
public final class me extends org.telegram.ui.Components.cw0 implements r0.m {
    public static me f35639x1;
    public static HashMap f35640y1;
    public TL_stories.TL_premium_boostsStatus A0;
    public int B0;
    public final CharSequence C0;
    public final CharSequence D0;
    public final CharSequence E0;
    public final CharSequence F0;
    public final zd G0;
    public final RelativeSizeSpan H0;
    public final org.telegram.ui.Components.p6 I0;
    public final org.telegram.ui.Components.p6 J0;
    public final ci.d K0;
    public int L0;
    public final zd M0;
    public TL_stars.StarsAmount N0;
    public final org.telegram.ui.Components.p6 O0;
    public final org.telegram.ui.Components.p6 P0;
    public final ce Q0;
    public final org.telegram.ui.Components.qq[] R0;
    public final LinearLayout S0;
    public final ci.d T0;
    public final ae U0;
    public boolean V0;
    public boolean W0;
    public long X0;
    public final fi.o Y0;
    public org.telegram.ui.Components.qc Z0;
    public final de f35641a1;
    public final FrameLayout f35642b1;
    public DecimalFormat f35643c1;
    public final ie f35644d1;
    public final boolean f35645e1;
    public final boolean f35646f1;
    public final li.l f35647g1;
    public SpannableStringBuilder f35648h1;
    public final qd f35649i1;
    public double f35650j1;
    public double f35651k1;
    public org.telegram.ui.ActionBar.l l1;
    public boolean f35652m1;
    public boolean f35653n1;
    public da1 f35654o1;
    public da1 f35655p1;
    public da1 f35656q1;
    public boolean f35657r1;
    public final je f35658s1;
    public final je f35659t1;
    public final je f35660u1;
    public final pd f35661v1;
    public final ra1 f35662w0;
    public final b2.q0 f35663w1;
    public final org.telegram.ui.ActionBar.e6 f35664x0;
    public final int f35665y0;
    public final long f35666z0;

    public me(Activity activity, ra1 ra1Var, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var, li.l lVar, boolean z10, boolean z11) {
        super(activity, null);
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.N0 = TL_stars.StarsAmount.ofStars(0L);
        this.R0 = new org.telegram.ui.Components.qq[1];
        this.V0 = false;
        this.W0 = true;
        this.f35652m1 = false;
        this.f35653n1 = false;
        this.f35657r1 = false;
        String string = LocaleController.getString(R.string.MonetizationOverviewAvailable);
        je jeVar = new je();
        jeVar.f34709a = false;
        jeVar.f34710b = "TON";
        jeVar.h = "XTR";
        jeVar.f34711c = string;
        this.f35658s1 = jeVar;
        String string2 = LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal);
        je jeVar2 = new je();
        jeVar2.f34709a = false;
        jeVar2.f34710b = "TON";
        jeVar2.h = "XTR";
        jeVar2.f34711c = string2;
        this.f35659t1 = jeVar2;
        String string3 = LocaleController.getString(R.string.MonetizationOverviewTotal);
        je jeVar3 = new je();
        jeVar3.f34709a = false;
        jeVar3.f34710b = "TON";
        jeVar3.h = "XTR";
        jeVar3.f34711c = string3;
        this.f35660u1 = jeVar3;
        this.f35661v1 = new pd(this, 8);
        this.f35663w1 = new Object();
        this.f35647g1 = lVar;
        this.f35645e1 = z10;
        this.f35646f1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f35643c1 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.f35643c1.setMaximumFractionDigits(12);
        this.f35643c1.setGroupingUsed(false);
        this.f35662w0 = ra1Var;
        this.f35664x0 = e6Var;
        this.f35665y0 = i10;
        this.f35666z0 = j3;
        long j10 = -j3;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        if (chat != null) {
            this.B0 = chat.level;
        }
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j3, new u3(this, 2));
        c0(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.i6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
            if (chatFull != null) {
                boolean z12 = chatFull.restricted_sponsored;
                this.f35652m1 = z12;
                this.f35653n1 = z12;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new wd(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.C0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new s1(ra1Var, activity, e6Var, 12), e6Var), true);
        if (MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled) {
            i11 = R.string.MonetizationBalanceInfo;
        } else {
            i11 = R.string.MonetizationBalanceInfoNotAvailable;
        }
        this.D0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new pd(this, 0)), true);
        if (z11 && z10) {
            i12 = R.string.MonetizationProceedsStarsTONInfo;
        } else if (z11) {
            i12 = R.string.MonetizationProceedsStarsInfo;
        } else {
            i12 = R.string.MonetizationProceedsTONInfo;
        }
        if (z11 && z10) {
            i13 = R.string.MonetizationProceedsStarsTONInfoLink;
        } else if (z11) {
            i13 = R.string.MonetizationProceedsStarsInfoLink;
        } else {
            i13 = R.string.MonetizationProceedsTONInfoLink;
        }
        this.E0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i12), -1, 3, new qd(this, i13, 0), e6Var), true);
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            i14 = R.string.MonetizationStarsInfo;
        } else {
            i14 = R.string.MonetizationStarsInfoGroup;
        }
        this.F0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i14), new pd(this, 1)), true);
        int i16 = org.telegram.ui.ActionBar.i6.f19001a7;
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i16, e6Var));
        this.f35644d1 = new ie(this, activity, i10, j3, ra1Var.getClassGuid(), new pd(this, 2), e6Var);
        zd zdVar = new zd(activity, 0);
        this.G0 = zdVar;
        zdVar.setOrientation(1);
        int i17 = org.telegram.ui.ActionBar.i6.f19057d6;
        zdVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i17, e6Var));
        zdVar.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(activity, false, true, true);
        this.I0 = p6Var;
        p6Var.setTypeface(AndroidUtilities.bold());
        int i18 = org.telegram.ui.ActionBar.i6.G6;
        p6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i18, e6Var));
        p6Var.setTextSize(AndroidUtilities.dp(32.0f));
        p6Var.setGravity(17);
        this.H0 = new RelativeSizeSpan(0.6770833f);
        zdVar.addView(p6Var, w7.y5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(activity, true, true, true);
        this.J0 = p6Var2;
        p6Var2.setGravity(17);
        int i19 = org.telegram.ui.ActionBar.i6.f19442y6;
        p6Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i19, e6Var));
        p6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        zdVar.addView(p6Var2, w7.y5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ci.d dVar = new ci.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        this.K0 = dVar;
        dVar.setEnabled(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled);
        dVar.g(LocaleController.getString(R.string.MonetizationWithdraw), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new ai.f2(28, this, ra1Var));
        zdVar.addView(dVar, w7.y5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        zd zdVar2 = new zd(activity, 1);
        this.M0 = zdVar2;
        zdVar2.setOrientation(1);
        zdVar2.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i17, e6Var));
        zdVar2.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.p6 p6Var3 = new org.telegram.ui.Components.p6(activity, false, true, true);
        this.O0 = p6Var3;
        p6Var3.setTypeface(AndroidUtilities.bold());
        p6Var3.setTextColor(org.telegram.ui.ActionBar.i6.v0(i18, e6Var));
        p6Var3.setTextSize(AndroidUtilities.dp(32.0f));
        p6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        zdVar2.addView(p6Var3, w7.y5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.p6 p6Var4 = new org.telegram.ui.Components.p6(activity, true, true, true);
        this.P0 = p6Var4;
        p6Var4.setGravity(17);
        p6Var4.setTextColor(org.telegram.ui.ActionBar.i6.v0(i19, e6Var));
        p6Var4.setTextSize(AndroidUtilities.dp(14.0f));
        zdVar2.addView(p6Var4, w7.y5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ae aeVar = new ae(this, activity, 0);
        this.U0 = aeVar;
        aeVar.setVisibility(8);
        aeVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        aeVar.setLeftPadding(AndroidUtilities.dp(36.0f));
        fi.o oVar = new fi.o(activity, 1);
        this.Y0 = oVar;
        oVar.setFocusable(false);
        oVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i18, e6Var));
        oVar.setCursorSize(AndroidUtilities.dp(20.0f));
        oVar.setCursorWidth(1.5f);
        oVar.setBackground(null);
        oVar.setTextSize(1, 18.0f);
        oVar.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        oVar.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        oVar.setInputType(2);
        oVar.setTypeface(Typeface.DEFAULT);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19381uf, e6Var));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19398vf, e6Var));
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        oVar.setGravity(i15);
        oVar.setOnFocusChangeListener(new rd(this, 0));
        oVar.addTextChangedListener(new be(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.y5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(oVar, w7.y5.o(-1, -2, 1.0f, 119));
        aeVar.e(oVar);
        aeVar.addView(linearLayout, w7.y5.e(-1, -2, 48));
        zdVar2.addView(aeVar, w7.y5.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.S0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? dVar2 = new ci.d(activity, e6Var, true);
        dVar2.setRoundRadius(24);
        this.Q0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.g(LocaleController.formatPluralString("MonetizationStarsWithdraw", 0, new Object[0]), false, true);
        dVar2.setVisibility(0);
        dVar2.setOnClickListener(new org.telegram.ui.Cells.ua(this, i10, ra1Var, 2));
        ci.d dVar3 = new ci.d(activity, e6Var, true);
        dVar3.setRoundRadius(24);
        this.T0 = dVar3;
        dVar3.setEnabled(false);
        dVar3.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        dVar3.setOnClickListener(new sd(this, i10, j3, activity));
        linearLayout2.addView((View) dVar2, w7.y5.o(-1, 48, 1.0f, 119));
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            linearLayout2.addView(new Space(activity), w7.y5.o(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar3, w7.y5.o(-1, 48, 1.0f, 119));
        }
        zdVar2.addView(linearLayout2, w7.y5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        oVar.setOnEditorActionListener(new yd(0, this, ra1Var));
        this.f35649i1 = new qd(this, i10, 2);
        ?? t61Var = new org.telegram.ui.Components.t61(ra1Var, new d5(this, 2), new od(this), new od(this));
        this.f35641a1 = t61Var;
        t61Var.setClipToPadding(false);
        t61Var.q1();
        addView(t61Var);
        if (lVar != 0) {
            lVar.b(t61Var);
        }
        LinearLayout e = org.telegram.messenger.l0.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f35642b1 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i16, e6Var));
        frameLayout.addView(e, w7.y5.e(-2, -2, 17));
        ?? imageView2 = new ImageView(activity);
        imageView2.setAutoRepeat(true);
        imageView2.f(R.raw.statistic_preload, 120, 120, null);
        imageView2.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i20 = org.telegram.ui.ActionBar.i6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i20, false));
        textView.setTag(Integer.valueOf(i20));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i21 = org.telegram.ui.ActionBar.i6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i21, false));
        textView2.setTag(Integer.valueOf(i21));
        org.telegram.messenger.qk.l(R.string.LoadingStatsDescription, textView2, 1);
        e.addView((View) imageView2, w7.y5.t(120, 120, 1, 0, 0, 0, 20));
        e.addView(textView, w7.y5.t(-2, -2, 1, 0, 0, 0, 10));
        e.addView(textView2, w7.y5.q(-2, -2, 1));
        addView(frameLayout, w7.y5.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.g3 d0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.g3 j3 = org.telegram.messenger.qk.j(1, context, e6Var, false);
        LinearLayout f7 = org.telegram.messenger.qk.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_monetize);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
        f7.addView(imageView, w7.y5.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        int i19 = org.telegram.ui.ActionBar.i6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i19, e6Var));
        if (z10) {
            i10 = R.string.BotMonetizationInfoTitle;
        } else {
            i10 = R.string.MonetizationInfoTitle;
        }
        textView.setText(LocaleController.getString(i10));
        f7.addView(textView, w7.y5.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
        int i20 = R.drawable.msg_channel;
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
        f7.addView(new ai.w5(context, i20, string, LocaleController.getString(i12), e6Var), w7.y5.t(-1, -2, 49, 8, 0, 8, 16));
        int i21 = R.drawable.menu_feature_split;
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
        f7.addView(new ai.w5(context, i21, string2, LocaleController.getString(i14), e6Var), w7.y5.t(-1, -2, 49, 8, 0, 8, 16));
        int i22 = R.drawable.menu_feature_withdrawals;
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
        f7.addView(new ai.w5(context, i22, string3, LocaleController.getString(i16), e6Var), w7.y5.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19058d7, e6Var));
        f7.addView(view, w7.y5.s(-1, 55, 12, 0, 12, 1.0f / AndroidUtilities.density, 0));
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(context);
        y5Var.setGravity(17);
        y5Var.setTextSize(1, 20.0f);
        y5Var.setTypeface(AndroidUtilities.bold());
        y5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i19, e6Var));
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(R.drawable.mini_gram_72, 0);
        qqVar.setScale(0.9f, 0.9f);
        qqVar.setColorKey(org.telegram.ui.ActionBar.i6.f19259o6);
        qqVar.setRelativeSize(y5Var.getPaint().getFontMetricsInt());
        qqVar.spaceScaleX = 0.9f;
        spannableString.setSpan(qqVar, 0, spannableString.length(), 33);
        if (z10) {
            i17 = R.string.BotMonetizationInfoTONTitle;
        } else {
            i17 = R.string.MonetizationInfoTONTitle;
        }
        y5Var.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(i17), spannableString));
        f7.addView(y5Var, w7.y5.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.p90 p90Var = new org.telegram.ui.Components.p90(context, e6Var);
        p90Var.setGravity(17);
        p90Var.setTextSize(1, 14.0f);
        p90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i19, e6Var));
        p90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        if (z10) {
            i18 = R.string.BotMonetizationInfoTONText;
        } else {
            i18 = R.string.MonetizationInfoTONText;
        }
        p90Var.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(i18)), new bi.f(19, context, z10)));
        f7.addView(p90Var, w7.y5.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        ci.d g10 = org.telegram.messenger.qk.g(24, context, e6Var, true);
        g10.g(LocaleController.getString(R.string.GotIt), false, true);
        g10.setOnClickListener(new td(j3, 0));
        f7.addView(g10, w7.y5.t(-1, 48, 55, 10, 25, 10, 14));
        j3.setCustomView(f7);
        return j3;
    }

    public static CharSequence f0(CharSequence charSequence, TextPaint textPaint, float f7, float f10, boolean z10) {
        int i10;
        if (f35640y1 == null) {
            f35640y1 = new HashMap();
        }
        int i11 = textPaint.getFontMetricsInt().bottom;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = ((i11 * i10) * ((int) (f7 * 100.0f))) - ((int) (100.0f * f10));
        SpannableString spannableString = (SpannableString) f35640y1.get(Integer.valueOf(i12));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(R.drawable.mini_gram_72, 0);
                qqVar.setScale(f7, f7);
                qqVar.setColorKey(org.telegram.ui.ActionBar.i6.f19259o6);
                qqVar.setRelativeSize(textPaint.getFontMetricsInt());
                qqVar.spaceScaleX = 0.9f;
                spannableString.setSpan(qqVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.qq qqVar2 = new org.telegram.ui.Components.qq(R.drawable.mini_gram_16, 0);
                qqVar2.setScale(f7, f7);
                qqVar2.setTranslateY(f10);
                qqVar2.spaceScaleX = 0.95f;
                spannableString.setSpan(qqVar2, 0, spannableString.length(), 33);
            }
            f35640y1.put(Integer.valueOf(i12), spannableString);
        }
        return AndroidUtilities.replaceMultipleCharSequence("TON", charSequence, spannableString);
    }

    public static void h0(Context context, int i10, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        long j10;
        org.telegram.ui.ActionBar.g3 g3Var;
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
        org.telegram.ui.ActionBar.g3 g3Var2;
        String userName;
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.g3 j14 = org.telegram.messenger.qk.j(1, context, e6Var, false);
        LinearLayout f7 = org.telegram.messenger.qk.f(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            String string2 = LocaleController.getString(R.string.MonetizationTransactionDetailWithdraw);
            j10 = 0;
            j11 = tL_broadcastRevenueTransactionWithdrawal.amount;
            z10 = tL_broadcastRevenueTransactionWithdrawal.pending;
            g3Var = j14;
            j12 = tL_broadcastRevenueTransactionWithdrawal.date;
            j13 = 0;
            c10 = 65535;
            str = string2;
            z11 = tL_broadcastRevenueTransactionWithdrawal.failed;
        } else {
            j10 = 0;
            if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
                TL_stats.TL_broadcastRevenueTransactionProceeds tL_broadcastRevenueTransactionProceeds = (TL_stats.TL_broadcastRevenueTransactionProceeds) broadcastRevenueTransaction;
                string = LocaleController.getString(R.string.MonetizationTransactionDetailProceed);
                long j15 = tL_broadcastRevenueTransactionProceeds.from_date;
                long j16 = tL_broadcastRevenueTransactionProceeds.to_date;
                g3Var = j14;
                j11 = tL_broadcastRevenueTransactionProceeds.amount;
                j13 = j16;
                j12 = j15;
            } else {
                g3Var = j14;
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
        long j17 = j13;
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        org.telegram.messenger.qk.k(18.0f, 1, textView);
        if (c10 < 0) {
            i11 = org.telegram.ui.ActionBar.i6.f19297q7;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.f19205l8;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
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
        f7.addView(textView, w7.y5.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19442y6, e6Var));
        if (z13) {
            textView2.setText(LocaleController.getString(R.string.MonetizationTransactionPending));
        } else if (j12 == j10) {
            textView2.setText(LocaleController.formatShortDateTime(j17));
        } else if (j17 == j10) {
            textView2.setText(LocaleController.formatShortDateTime(j12));
        } else {
            textView2.setText(LocaleController.formatShortDateTime(j12) + " - " + LocaleController.formatShortDateTime(j17));
        }
        if (z11) {
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19297q7, e6Var));
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        f7.addView(textView2, w7.y5.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.qk.k(14.0f, 1, textView3);
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        textView3.setText(str);
        f7.addView(textView3, w7.y5.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19050ci, e6Var)));
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
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.e6) null);
            h9Var.p(chat);
            w9Var.e(chat, h9Var);
            frameLayout.addView(w9Var, w7.y5.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            textView4.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19164j5, e6Var));
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, w7.y5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            f7.addView(frameLayout, w7.y5.t(-2, 28, 1, 42, 10, 42, 0));
        }
        ci.d g10 = org.telegram.messenger.qk.g(24, context, e6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                g10.g(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false, true);
                g10.setOnClickListener(new ai.f2(context, tL_broadcastRevenueTransactionWithdrawal2));
                g3Var2 = g3Var;
                f7.addView(g10, w7.y5.t(-1, 48, 55, 18, 30, 18, 14));
                g3Var2.setCustomView(f7);
                g3Var2.show();
            }
        }
        g10.g(LocaleController.getString(R.string.OK), false, true);
        g3Var2 = g3Var;
        g10.setOnClickListener(new td(g3Var2, 1));
        f7.addView(g10, w7.y5.t(-1, 48, 55, 18, 30, 18, 14));
        g3Var2.setCustomView(f7);
        g3Var2.show();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        int max;
        boolean z10;
        de deVar = this.f35641a1;
        if (viewGroup == deVar) {
            ie ieVar = this.f35644d1;
            if (ieVar.isAttachedToWindow()) {
                ((View) ieVar.getParent()).getTop();
                int i13 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
                org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int bottom = ((View) ieVar.getParent()).getBottom();
                if (i11 < 0) {
                    org.telegram.ui.ActionBar.l lVar = this.l1;
                    if (lVar != null) {
                        if (isAttachedToWindow() && deVar.getHeight() - bottom >= 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        lVar.setCastShadows(z10);
                    }
                    if (deVar.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + deVar.getPaddingBottom()) {
                        org.telegram.ui.Components.yl0 currentListView = ieVar.getCurrentListView();
                        int L0 = ((s4.c0) currentListView.getLayoutManager()).L0();
                        int i14 = -1;
                        if (L0 != -1) {
                            s4.c1 L = currentListView.L(L0);
                            if (L != null) {
                                i14 = L.f43005a.getTop();
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
                    org.telegram.ui.Components.yl0 currentListView2 = ieVar.getCurrentListView();
                    if (deVar.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + deVar.getPaddingBottom() && currentListView2 != null && !currentListView2.canScrollVertically(1)) {
                        iArr[1] = i11;
                        deVar.C0();
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
        if (this.f35656q1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f35651k1 = tL_payments_starsRevenueStats.usd_rate;
        da1 d02 = ra1.d0(tL_payments_starsRevenueStats.revenue_graph, LocaleController.getString(R.string.MonetizationGraphStarsRevenue), 2, false);
        this.f35656q1 = d02;
        if (d02 != null && (bVar = d02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f35656q1.d.d.get(0) != null) {
            ((jg.a) this.f35656q1.d.d.get(0)).f12991g = org.telegram.ui.ActionBar.i6.kj;
            this.f35656q1.d.h = (float) ((1.0d / this.f35651k1) / 100.0d);
        }
        g0(false, tL_payments_starsRevenueStats.status);
        if (!this.f35645e1 && (frameLayout = this.f35642b1) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.sr.h).withEndAction(new pd(this, 6)).start();
        }
        de deVar = this.f35641a1;
        if (deVar != null) {
            deVar.Y2.N(!z10);
            if (z10) {
                deVar.v0(0);
            }
        }
    }

    public final void a0() {
        if (isAttachedToWindow() && this.f35645e1 && this.f35657r1 && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            this.f35662w0.showDialog(d0(getContext(), this.f35664x0, false));
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void b0(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        ra1 ra1Var = this.f35662w0;
        if (ra1Var != null) {
            Activity parentActivity = ra1Var.getParentActivity();
            int i10 = this.f35665y0;
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            if (parentActivity != null && currentUser != null) {
                long j3 = this.f35666z0;
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
                ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new ci.t1(this, twoStepVerificationActivity, parentActivity, z10, 1));
            }
        }
    }

    public final void c0(boolean z10) {
        if (!this.f35646f1) {
            return;
        }
        int i10 = this.f35665y0;
        yh.o g10 = yh.o.g(i10);
        long j3 = this.f35666z0;
        TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, z10);
        if (h != null) {
            AndroidUtilities.runOnUIThread(new n(22, this, h));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.i6.I.q();
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new wd(this, 2));
    }

    public final void e0() {
        ie ieVar = this.f35644d1;
        pd pdVar = ieVar.e;
        boolean[] zArr = ieVar.f34454s;
        boolean a2 = ieVar.a();
        for (int i10 = 0; i10 < 2; i10++) {
            if (!zArr[i10]) {
                if (i10 == 1) {
                    ieVar.h.clear();
                    ieVar.f34451f = "";
                } else {
                    ieVar.f34452n.clear();
                    ieVar.f34453r = "";
                }
                zArr[i10] = false;
                ieVar.c(i10);
            } else {
                return;
            }
        }
        if (ieVar.a() != a2 && pdVar != null) {
            ieVar.e();
            pdVar.run();
        }
    }

    public final void g0(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        je jeVar;
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.l61 l61Var;
        je jeVar2;
        int i13;
        int i14;
        me meVar = this;
        je jeVar3 = meVar.f35660u1;
        je jeVar4 = meVar.f35659t1;
        org.telegram.ui.Components.p6 p6Var = meVar.J0;
        RelativeSizeSpan relativeSizeSpan = meVar.H0;
        org.telegram.ui.Components.p6 p6Var2 = meVar.I0;
        je jeVar5 = meVar.f35658s1;
        if (z10) {
            jeVar5.f34709a = true;
            long j3 = tL_starsRevenueStatus.available_balance.amount;
            jeVar5.d = j3;
            double d = j3 / 1.0E9d;
            long j10 = (long) (meVar.f35650j1 * d * 100.0d);
            jeVar5.e = j10;
            if (meVar.f35643c1 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                jeVar2 = jeVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                meVar.f35643c1 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i13 = 6;
                meVar.f35643c1.setMaximumFractionDigits(6);
                meVar.f35643c1.setGroupingUsed(false);
            } else {
                jeVar2 = jeVar3;
                i13 = 6;
            }
            DecimalFormat decimalFormat2 = meVar.f35643c1;
            if (d > 1.5d) {
                i13 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i13);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f0("TON " + meVar.f35643c1.format(d), p6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            p6Var2.setText(spannableStringBuilder);
            p6Var.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
            jeVar5.f34712f = "USD";
            jeVar4.f34709a = true;
            long j11 = tL_starsRevenueStatus.current_balance.amount;
            jeVar4.d = j11;
            meVar = this;
            double d10 = meVar.f35650j1;
            jeVar4.e = (long) ((j11 / 1.0E9d) * d10 * 100.0d);
            jeVar4.f34712f = "USD";
            je jeVar6 = jeVar2;
            jeVar6.f34709a = true;
            long j12 = tL_starsRevenueStatus.overall_revenue.amount;
            jeVar6.d = j12;
            jeVar6.e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            jeVar6.f34712f = "USD";
            meVar.f35657r1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            meVar.K0.setVisibility(i14);
        } else {
            double d11 = meVar.f35651k1;
            if (d11 != 0.0d) {
                jeVar5.f34713g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
                jeVar5.f34714i = starsAmount;
                jeVar5.f34715j = (long) (starsAmount.amount * d11 * 100.0d);
                int i15 = tL_starsRevenueStatus.next_withdrawal_at;
                ce ceVar = meVar.Q0;
                if (p6Var2 == null || p6Var == null) {
                    jeVar = jeVar3;
                } else {
                    jeVar = jeVar3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(yh.v7.X0(false, TextUtils.concat("XTR ", yh.v7.J0(starsAmount, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    meVar.N0 = starsAmount;
                    meVar.O0.setText(spannableStringBuilder2);
                    meVar.P0.setText("≈" + BillingController.getInstance().formatCurrency((long) (meVar.f35651k1 * starsAmount.amount * 100.0d), "USD"));
                    if (starsAmount.amount > 0) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    meVar.U0.setVisibility(i12);
                    if (meVar.W0) {
                        meVar.V0 = true;
                        long j13 = starsAmount.amount;
                        meVar.X0 = j13;
                        String l4 = Long.toString(j13);
                        fi.o oVar = meVar.Y0;
                        oVar.setText(l4);
                        oVar.setSelection(oVar.getText().length());
                        meVar.V0 = false;
                        if (meVar.X0 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        ceVar.setEnabled(z12);
                    }
                    ci.d dVar = meVar.T0;
                    if (dVar != null) {
                        if (starsAmount.amount > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        dVar.setEnabled(z11);
                    }
                    meVar.L0 = i15;
                    qd qdVar = meVar.f35649i1;
                    AndroidUtilities.cancelRunOnUIThread(qdVar);
                    qdVar.run();
                }
                jeVar5.f34712f = "USD";
                jeVar4.f34713g = true;
                TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus.current_balance;
                jeVar4.f34714i = starsAmount2;
                double d12 = meVar.f35651k1;
                jeVar4.f34715j = (long) (starsAmount2.amount * d12 * 100.0d);
                jeVar4.f34712f = "USD";
                je jeVar7 = jeVar;
                jeVar7.f34713g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.overall_revenue;
                jeVar7.f34714i = starsAmount3;
                jeVar7.f34715j = (long) (starsAmount3.amount * d12 * 100.0d);
                jeVar7.f34712f = "USD";
                meVar.f35657r1 = true;
                LinearLayout linearLayout = meVar.S0;
                if (linearLayout != null) {
                    if (tL_starsRevenueStatus.withdrawal_enabled) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    linearLayout.setVisibility(i11);
                }
                if (ceVar != null) {
                    if (tL_starsRevenueStatus.available_balance.amount <= 0 && !BuildVars.DEBUG_PRIVATE_VERSION) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    ceVar.setVisibility(i10);
                }
            } else {
                return;
            }
        }
        de deVar = meVar.f35641a1;
        if (deVar != null && (l61Var = deVar.Y2) != null) {
            l61Var.N(true);
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        boolean z10;
        ie ieVar = this.f35644d1;
        de deVar = this.f35641a1;
        if (viewGroup == deVar) {
            try {
                if (ieVar.isAttachedToWindow()) {
                    org.telegram.ui.Components.yl0 currentListView = ieVar.getCurrentListView();
                    int bottom = ((View) ieVar.getParent()).getBottom();
                    org.telegram.ui.ActionBar.l lVar = this.l1;
                    if (lVar != null) {
                        if (isAttachedToWindow() && deVar.getHeight() - bottom >= 0) {
                            z10 = false;
                            lVar.setCastShadows(z10);
                        }
                        z10 = true;
                        lVar.setCastShadows(z10);
                    }
                    if (deVar.getHeight() - bottom >= deVar.getPaddingBottom() + AndroidUtilities.dp(8.0f)) {
                        iArr[1] = i13;
                        currentListView.scrollBy(0, i13);
                    }
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
                AndroidUtilities.runOnUIThread(new pd(this, 7));
            }
        }
    }

    @Override
    public final void o(int i10, View view) {
        this.f35663w1.f3197a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        f35639x1 = this;
        super.onAttachedToWindow();
        a0();
    }

    @Override
    public final void onDetachedFromWindow() {
        f35639x1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.l lVar = this.l1;
        if (lVar != null) {
            lVar.setCastShadows(true);
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
        this.f35663w1.f3197a = i10;
    }

    public void setActionBar(org.telegram.ui.ActionBar.l lVar) {
        this.l1 = lVar;
    }

    @Override
    public final void onStopNestedScroll(View view) {
    }

    @Override
    public final void c(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
