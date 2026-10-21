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
public final class ie extends org.telegram.ui.Components.lw0 implements r0.m {
    public static ie f37929x1;
    public static HashMap f37930y1;
    public TL_stories.TL_premium_boostsStatus A0;
    public int B0;
    public final CharSequence C0;
    public final CharSequence D0;
    public final CharSequence E0;
    public final CharSequence F0;
    public final ai.r G0;
    public final RelativeSizeSpan H0;
    public final org.telegram.ui.Components.q6 I0;
    public final org.telegram.ui.Components.q6 J0;
    public final ei.d K0;
    public int L0;
    public final ai.r M0;
    public TL_stars.StarsAmount N0;
    public final org.telegram.ui.Components.q6 O0;
    public final org.telegram.ui.Components.q6 P0;
    public final zd Q0;
    public final org.telegram.ui.Components.yq[] R0;
    public final LinearLayout S0;
    public final ei.d T0;
    public final ai.s U0;
    public boolean V0;
    public boolean W0;
    public long X0;
    public final ai.t Y0;
    public org.telegram.ui.Components.qc Z0;
    public final org.telegram.ui.Components.c71 f37931a1;
    public bh.l f37932b1;
    public final FrameLayout f37933c1;
    public DecimalFormat f37934d1;
    public final ee f37935e1;
    public final boolean f37936f1;
    public final boolean f37937g1;
    public SpannableStringBuilder f37938h1;
    public final nd f37939i1;
    public double f37940j1;
    public double f37941k1;
    public org.telegram.ui.ActionBar.k l1;
    public boolean f37942m1;
    public boolean f37943n1;
    public b91 f37944o1;
    public b91 f37945p1;
    public b91 f37946q1;
    public boolean f37947r1;
    public final fe f37948s1;
    public final fe f37949t1;
    public final fe f37950u1;
    public final od f37951v1;
    public final p91 f37952w0;
    public final b2.u0 f37953w1;
    public final org.telegram.ui.ActionBar.d6 f37954x0;
    public final int f37955y0;
    public final long f37956z0;

    public ie(Activity activity, p91 p91Var, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(activity, null);
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.N0 = TL_stars.StarsAmount.ofStars(0L);
        this.R0 = new org.telegram.ui.Components.yq[1];
        this.V0 = false;
        this.W0 = true;
        this.f37942m1 = false;
        this.f37943n1 = false;
        this.f37947r1 = false;
        String string = LocaleController.getString(R.string.MonetizationOverviewAvailable);
        fe feVar = new fe();
        feVar.f36977a = false;
        feVar.f36978b = "TON";
        feVar.h = "XTR";
        feVar.f36979c = string;
        this.f37948s1 = feVar;
        String string2 = LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal);
        fe feVar2 = new fe();
        feVar2.f36977a = false;
        feVar2.f36978b = "TON";
        feVar2.h = "XTR";
        feVar2.f36979c = string2;
        this.f37949t1 = feVar2;
        String string3 = LocaleController.getString(R.string.MonetizationOverviewTotal);
        fe feVar3 = new fe();
        feVar3.f36977a = false;
        feVar3.f36978b = "TON";
        feVar3.h = "XTR";
        feVar3.f36979c = string3;
        this.f37950u1 = feVar3;
        this.f37951v1 = new od(this, 3);
        this.f37953w1 = new Object();
        this.f37936f1 = z10;
        this.f37937g1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f37934d1 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.f37934d1.setMaximumFractionDigits(12);
        this.f37934d1.setGroupingUsed(false);
        this.f37952w0 = p91Var;
        this.f37954x0 = d6Var;
        this.f37955y0 = i10;
        this.f37956z0 = j10;
        long j11 = -j10;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
        if (chat != null) {
            this.B0 = chat.level;
        }
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j10, new v3(this, 2));
        c0(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.h6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j11);
            if (chatFull != null) {
                boolean z12 = chatFull.restricted_sponsored;
                this.f37942m1 = z12;
                this.f37943n1 = z12;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new ud(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j11));
        this.C0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new t1(p91Var, activity, d6Var, 13), d6Var), true);
        if (MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled) {
            i11 = R.string.MonetizationBalanceInfo;
        } else {
            i11 = R.string.MonetizationBalanceInfoNotAvailable;
        }
        this.D0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new od(this, 8)), true);
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
        this.E0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i12), -1, 3, new nd(this, i13, 0), d6Var), true);
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            i14 = R.string.MonetizationStarsInfo;
        } else {
            i14 = R.string.MonetizationStarsInfoGroup;
        }
        this.F0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i14), new od(this, 0)), true);
        int i16 = org.telegram.ui.ActionBar.h6.f20932a7;
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i16, d6Var));
        this.f37935e1 = new ee(this, activity, i10, j10, p91Var.getClassGuid(), new od(this, 1), d6Var);
        ai.r rVar = new ai.r(activity, 2);
        this.G0 = rVar;
        rVar.setOrientation(1);
        int i17 = org.telegram.ui.ActionBar.h6.f20990d6;
        rVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i17, d6Var));
        rVar.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(activity, false, true, true);
        this.I0 = q6Var;
        q6Var.setTypeface(AndroidUtilities.bold());
        int i18 = org.telegram.ui.ActionBar.h6.G6;
        q6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, d6Var));
        q6Var.setTextSize(AndroidUtilities.dp(32.0f));
        q6Var.setGravity(17);
        this.H0 = new RelativeSizeSpan(0.6770833f);
        rVar.addView(q6Var, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(activity, true, true, true);
        this.J0 = q6Var2;
        q6Var2.setGravity(17);
        int i19 = org.telegram.ui.ActionBar.h6.f21378y6;
        q6Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i19, d6Var));
        q6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        rVar.addView(q6Var2, w7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ei.d dVar = new ei.d(activity, d6Var, true);
        dVar.setRoundRadius(24);
        this.K0 = dVar;
        dVar.setEnabled(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled);
        dVar.g(LocaleController.getString(R.string.MonetizationWithdraw), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new org.telegram.ui.ActionBar.s1(8, this, p91Var));
        rVar.addView(dVar, w7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        ai.r rVar2 = new ai.r(activity, 3);
        this.M0 = rVar2;
        rVar2.setOrientation(1);
        rVar2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i17, d6Var));
        rVar2.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.q6 q6Var3 = new org.telegram.ui.Components.q6(activity, false, true, true);
        this.O0 = q6Var3;
        q6Var3.setTypeface(AndroidUtilities.bold());
        q6Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, d6Var));
        q6Var3.setTextSize(AndroidUtilities.dp(32.0f));
        q6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        rVar2.addView(q6Var3, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.q6 q6Var4 = new org.telegram.ui.Components.q6(activity, true, true, true);
        this.P0 = q6Var4;
        q6Var4.setGravity(17);
        q6Var4.setTextColor(org.telegram.ui.ActionBar.h6.w0(i19, d6Var));
        q6Var4.setTextSize(AndroidUtilities.dp(14.0f));
        rVar2.addView(q6Var4, w7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ai.s sVar = new ai.s(this, activity, 1);
        this.U0 = sVar;
        sVar.setVisibility(8);
        sVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        sVar.setLeftPadding(AndroidUtilities.dp(36.0f));
        ai.t tVar = new ai.t(activity, 2);
        this.Y0 = tVar;
        tVar.setFocusable(false);
        tVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, d6Var));
        tVar.setCursorSize(AndroidUtilities.dp(20.0f));
        tVar.setCursorWidth(1.5f);
        tVar.setBackground(null);
        tVar.setTextSize(1, 18.0f);
        tVar.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        tVar.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        tVar.setInputType(2);
        tVar.setTypeface(Typeface.DEFAULT);
        tVar.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21314uf, d6Var));
        tVar.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21332vf, d6Var));
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        tVar.setGravity(i15);
        tVar.setOnFocusChangeListener(new pd(this, 0));
        tVar.addTextChangedListener(new yd(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(tVar, w7.z5.o(-1, -2, 1.0f, 119));
        sVar.e(tVar);
        sVar.addView(linearLayout, w7.z5.e(-1, -2, 48));
        rVar2.addView(sVar, w7.z5.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.S0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? dVar2 = new ei.d(activity, d6Var, true);
        dVar2.setRoundRadius(24);
        this.Q0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.g(LocaleController.formatPluralString("MonetizationStarsWithdraw", 0, new Object[0]), false, true);
        dVar2.setVisibility(0);
        dVar2.setOnClickListener(new ai.ha(this, i10, p91Var, 3));
        ei.d dVar3 = new ei.d(activity, d6Var, true);
        dVar3.setRoundRadius(24);
        this.T0 = dVar3;
        dVar3.setEnabled(false);
        dVar3.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        dVar3.setOnClickListener(new qd(this, i10, j10, activity));
        linearLayout2.addView((View) dVar2, w7.z5.o(-1, 48, 1.0f, 119));
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            linearLayout2.addView(new Space(activity), w7.z5.o(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar3, w7.z5.o(-1, 48, 1.0f, 119));
        }
        rVar2.addView(linearLayout2, w7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        tVar.setOnEditorActionListener(new wd(0, this, p91Var));
        this.f37939i1 = new nd(this, i10, 2);
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(p91Var, new g5(this, 2), new xd(this), new xd(this));
        this.f37931a1 = c71Var;
        c71Var.setClipToPadding(false);
        c71Var.p1();
        addView(c71Var);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f37933c1 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i16, d6Var));
        frameLayout.addView(linearLayout3, w7.z5.e(-2, -2, 17));
        ?? imageView2 = new ImageView(activity);
        imageView2.setAutoRepeat(true);
        imageView2.f(R.raw.statistic_preload, 120, 120, null);
        imageView2.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i20 = org.telegram.ui.ActionBar.h6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i20, false));
        textView.setTag(Integer.valueOf(i20));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i21 = org.telegram.ui.ActionBar.h6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i21, false));
        textView2.setTag(Integer.valueOf(i21));
        org.telegram.messenger.mk.m(R.string.LoadingStatsDescription, textView2, 1);
        linearLayout3.addView((View) imageView2, w7.z5.t(120, 120, 1, 0, 0, 0, 20));
        linearLayout3.addView(textView, w7.z5.t(-2, -2, 1, 0, 0, 0, 10));
        linearLayout3.addView(textView2, w7.z5.q(-2, -2, 1));
        addView(frameLayout, w7.z5.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.f3 d0(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.f3 i19 = org.telegram.messenger.mk.i(1, context, d6Var, false);
        LinearLayout e = org.telegram.messenger.mk.e(context, 1);
        e.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_monetize);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
        e.addView(imageView, w7.z5.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
        int i20 = org.telegram.ui.ActionBar.h6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i20, d6Var));
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
        e.addView(new ci.i4(context, i21, string, LocaleController.getString(i12), d6Var), w7.z5.t(-1, -2, 49, 8, 0, 8, 16));
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
        e.addView(new ci.i4(context, i22, string2, LocaleController.getString(i14), d6Var), w7.z5.t(-1, -2, 49, 8, 0, 8, 16));
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
        e.addView(new ci.i4(context, i23, string3, LocaleController.getString(i16), d6Var), w7.z5.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20991d7, d6Var));
        e.addView(view, w7.z5.s(-1, 55, 12, 0, 12, 1.0f / AndroidUtilities.density, 0));
        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(context);
        z5Var.setGravity(17);
        z5Var.setTextSize(1, 20.0f);
        z5Var.setTypeface(AndroidUtilities.bold());
        z5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i20, d6Var));
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.mini_gram_72, 0);
        yqVar.recolorDrawable = false;
        yqVar.setScale(0.9f, 0.9f);
        yqVar.setRelativeSize(z5Var.getPaint().getFontMetricsInt());
        yqVar.spaceScaleX = 0.9f;
        spannableString.setSpan(yqVar, 0, spannableString.length(), 33);
        if (z10) {
            i17 = R.string.BotMonetizationInfoTONTitle;
        } else {
            i17 = R.string.MonetizationInfoTONTitle;
        }
        z5Var.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(i17), spannableString));
        e.addView(z5Var, w7.z5.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(context, d6Var);
        x90Var.setGravity(17);
        x90Var.setTextSize(1, 14.0f);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i20, d6Var));
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21049gc, d6Var));
        if (z10) {
            i18 = R.string.BotMonetizationInfoTONText;
        } else {
            i18 = R.string.MonetizationInfoTONText;
        }
        x90Var.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(i18)), new ah.t(23, context, z10)));
        e.addView(x90Var, w7.z5.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        ei.d f7 = org.telegram.messenger.mk.f(24, context, d6Var, true);
        f7.g(LocaleController.getString(R.string.GotIt), false, true);
        f7.setOnClickListener(new rd(i19, 1));
        e.addView(f7, w7.z5.t(-1, 48, 55, 10, 25, 10, 14));
        i19.setCustomView(e);
        return i19;
    }

    public static CharSequence f0(CharSequence charSequence, TextPaint textPaint, float f7, float f10, boolean z10) {
        int i10;
        if (f37930y1 == null) {
            f37930y1 = new HashMap();
        }
        int i11 = textPaint.getFontMetricsInt().bottom;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = ((i11 * i10) * ((int) (f7 * 100.0f))) - ((int) (100.0f * f10));
        SpannableString spannableString = (SpannableString) f37930y1.get(Integer.valueOf(i12));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.mini_gram_72, 0);
                yqVar.recolorDrawable = false;
                yqVar.setScale(f7, f7);
                yqVar.setColorKey(org.telegram.ui.ActionBar.h6.f21193o6);
                yqVar.setRelativeSize(textPaint.getFontMetricsInt());
                yqVar.spaceScaleX = 0.9f;
                spannableString.setSpan(yqVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.yq yqVar2 = new org.telegram.ui.Components.yq(R.drawable.mini_gram_16, 0);
                yqVar2.recolorDrawable = false;
                yqVar2.setScale(f7, f7);
                yqVar2.setTranslateY(f10);
                yqVar2.spaceScaleX = 0.95f;
                spannableString.setSpan(yqVar2, 0, spannableString.length(), 33);
            }
            f37930y1.put(Integer.valueOf(i12), spannableString);
        }
        return AndroidUtilities.replaceMultipleCharSequence("TON", charSequence, spannableString);
    }

    public static void h0(Context context, int i10, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j10, org.telegram.ui.ActionBar.d6 d6Var) {
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
        int i11;
        String str2;
        org.telegram.ui.ActionBar.f3 f3Var2;
        String userName;
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.f3 i12 = org.telegram.messenger.mk.i(1, context, d6Var, false);
        LinearLayout e = org.telegram.messenger.mk.e(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            String string2 = LocaleController.getString(R.string.MonetizationTransactionDetailWithdraw);
            j11 = 0;
            j12 = tL_broadcastRevenueTransactionWithdrawal.amount;
            z10 = tL_broadcastRevenueTransactionWithdrawal.pending;
            j13 = tL_broadcastRevenueTransactionWithdrawal.date;
            c10 = 65535;
            f3Var = i12;
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
                f3Var = i12;
                j12 = tL_broadcastRevenueTransactionProceeds.amount;
                j14 = j16;
                j13 = j15;
            } else {
                f3Var = i12;
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
        org.telegram.messenger.mk.k(18.0f, 1, textView);
        if (c10 < 0) {
            i11 = org.telegram.ui.ActionBar.h6.f21228q7;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.f21136l8;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
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
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21378y6, d6Var));
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
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21228q7, d6Var));
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        e.addView(textView2, w7.z5.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.mk.k(14.0f, 1, textView3);
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        textView3.setText(str);
        e.addView(textView3, w7.z5.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20983ci, d6Var)));
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
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
            h9Var.p(chat);
            w9Var.e(chat, h9Var);
            frameLayout.addView(w9Var, w7.z5.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            textView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21096j5, d6Var));
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, w7.z5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            e.addView(frameLayout, w7.z5.t(-2, 28, 1, 42, 10, 42, 0));
        }
        ei.d f7 = org.telegram.messenger.mk.f(24, context, d6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                f7.g(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false, true);
                f7.setOnClickListener(new org.telegram.ui.ActionBar.s1(9, context, tL_broadcastRevenueTransactionWithdrawal2));
                f3Var2 = f3Var;
                e.addView(f7, w7.z5.t(-1, 48, 55, 18, 30, 18, 14));
                f3Var2.setCustomView(e);
                f3Var2.show();
            }
        }
        f7.g(LocaleController.getString(R.string.OK), false, true);
        f3Var2 = f3Var;
        f7.setOnClickListener(new rd(f3Var2, 0));
        e.addView(f7, w7.z5.t(-1, 48, 55, 18, 30, 18, 14));
        f3Var2.setCustomView(e);
        f3Var2.show();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        int max;
        boolean z10;
        org.telegram.ui.Components.c71 c71Var = this.f37931a1;
        if (viewGroup == c71Var) {
            ee eeVar = this.f37935e1;
            if (eeVar.isAttachedToWindow()) {
                ((View) eeVar.getParent()).getTop();
                int i13 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
                org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int bottom = ((View) eeVar.getParent()).getBottom();
                if (i11 < 0) {
                    org.telegram.ui.ActionBar.k kVar = this.l1;
                    if (kVar != null) {
                        if (isAttachedToWindow() && c71Var.getHeight() - bottom >= 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        kVar.setCastShadows(z10);
                    }
                    if (c71Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + c71Var.getPaddingBottom()) {
                        org.telegram.ui.Components.jm0 currentListView = eeVar.getCurrentListView();
                        int L0 = ((s4.b0) currentListView.getLayoutManager()).L0();
                        int i14 = -1;
                        if (L0 != -1) {
                            s4.b1 K = currentListView.K(L0);
                            if (K != null) {
                                i14 = K.f45917a.getTop();
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
                    org.telegram.ui.Components.jm0 currentListView2 = eeVar.getCurrentListView();
                    if (c71Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + c71Var.getPaddingBottom() && currentListView2 != null && !currentListView2.canScrollVertically(1)) {
                        iArr[1] = i11;
                        c71Var.B0();
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
        if (this.f37946q1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f37941k1 = tL_payments_starsRevenueStats.usd_rate;
        b91 f02 = p91.f0(tL_payments_starsRevenueStats.revenue_graph, LocaleController.getString(R.string.MonetizationGraphStarsRevenue), 2, false);
        this.f37946q1 = f02;
        if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f37946q1.d.d.get(0) != null) {
            ((kg.a) this.f37946q1.d.d.get(0)).f15050g = org.telegram.ui.ActionBar.h6.kj;
            this.f37946q1.d.h = (float) ((1.0d / this.f37941k1) / 100.0d);
        }
        g0(false, tL_payments_starsRevenueStats.status);
        if (!this.f37936f1 && (frameLayout = this.f37933c1) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.bs.h).withEndAction(new od(this, 7)).start();
        }
        org.telegram.ui.Components.c71 c71Var = this.f37931a1;
        if (c71Var != null) {
            c71Var.W2.N(!z10);
            if (z10) {
                c71Var.u0(0);
            }
        }
    }

    public final void a0() {
        if (isAttachedToWindow() && this.f37936f1 && this.f37947r1 && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            this.f37952w0.showDialog(d0(getContext(), this.f37954x0, false));
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void b0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        p91 p91Var = this.f37952w0;
        if (p91Var != null) {
            Activity parentActivity = p91Var.getParentActivity();
            int i10 = this.f37955y0;
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            if (parentActivity != null && currentUser != null) {
                long j10 = this.f37956z0;
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
                ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueWithdrawalUrl, new ai.i4(this, twoStepVerificationActivity, parentActivity, z10));
            }
        }
    }

    public final void c0(boolean z10) {
        if (!this.f37937g1) {
            return;
        }
        int i10 = this.f37955y0;
        ai.k0 g10 = ai.k0.g(i10);
        long j10 = this.f37956z0;
        TLRPC.TL_payments_starsRevenueStats h = g10.h(j10, z10);
        if (h != null) {
            AndroidUtilities.runOnUIThread(new i0(21, this, h));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.h6.I.q();
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new ud(this, 2));
    }

    public final void e0() {
        ee eeVar = this.f37935e1;
        od odVar = eeVar.e;
        boolean[] zArr = eeVar.f36646s;
        boolean a2 = eeVar.a();
        for (int i10 = 0; i10 < 2; i10++) {
            if (!zArr[i10]) {
                if (i10 == 1) {
                    eeVar.h.clear();
                    eeVar.f36643f = "";
                } else {
                    eeVar.f36644n.clear();
                    eeVar.f36645r = "";
                }
                zArr[i10] = false;
                eeVar.c(i10);
            } else {
                return;
            }
        }
        if (eeVar.a() != a2 && odVar != null) {
            eeVar.e();
            odVar.run();
        }
    }

    public final void g0(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        fe feVar;
        int i10;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.u61 u61Var;
        long j10;
        fe feVar2;
        int i14;
        int i15;
        ie ieVar = this;
        fe feVar3 = ieVar.f37950u1;
        fe feVar4 = ieVar.f37949t1;
        org.telegram.ui.Components.q6 q6Var = ieVar.J0;
        RelativeSizeSpan relativeSizeSpan = ieVar.H0;
        org.telegram.ui.Components.q6 q6Var2 = ieVar.I0;
        fe feVar5 = ieVar.f37948s1;
        if (z10) {
            feVar5.f36977a = true;
            long j11 = tL_starsRevenueStatus.available_balance.amount;
            feVar5.d = j11;
            double d = j11 / 1.0E9d;
            feVar5.e = (long) (ieVar.f37940j1 * d * 100.0d);
            if (ieVar.f37934d1 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                feVar2 = feVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                ieVar.f37934d1 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i14 = 6;
                ieVar.f37934d1.setMaximumFractionDigits(6);
                ieVar.f37934d1.setGroupingUsed(false);
            } else {
                feVar2 = feVar3;
                i14 = 6;
            }
            DecimalFormat decimalFormat2 = ieVar.f37934d1;
            if (d > 1.5d) {
                i14 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i14);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f0("TON " + ieVar.f37934d1.format(d), q6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            q6Var2.setText(spannableStringBuilder);
            q6Var.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
            feVar5.f36980f = "USD";
            feVar4.f36977a = true;
            long j12 = tL_starsRevenueStatus.current_balance.amount;
            feVar4.d = j12;
            ieVar = this;
            double d10 = ieVar.f37940j1;
            feVar4.e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            feVar4.f36980f = "USD";
            fe feVar6 = feVar2;
            feVar6.f36977a = true;
            long j13 = tL_starsRevenueStatus.overall_revenue.amount;
            feVar6.d = j13;
            feVar6.e = (long) ((j13 / 1.0E9d) * d10 * 100.0d);
            feVar6.f36980f = "USD";
            ieVar.f37947r1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            ieVar.K0.setVisibility(i15);
        } else {
            double d11 = ieVar.f37941k1;
            if (d11 != 0.0d) {
                feVar5.f36981g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.available_balance;
                feVar5.f36982i = starsAmount3;
                feVar5.f36983j = (long) (starsAmount3.amount * d11 * 100.0d);
                int i16 = tL_starsRevenueStatus.next_withdrawal_at;
                zd zdVar = ieVar.Q0;
                if (q6Var2 == null || q6Var == null) {
                    feVar = feVar3;
                    i10 = 0;
                } else {
                    feVar = feVar3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ai.md.Y0(false, TextUtils.concat("XTR ", ai.md.K0(starsAmount3, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    ieVar.N0 = starsAmount3;
                    ieVar.O0.setText(spannableStringBuilder2);
                    ieVar.P0.setText("≈" + BillingController.getInstance().formatCurrency((long) (ieVar.f37941k1 * starsAmount3.amount * 100.0d), "USD"));
                    if (starsAmount3.amount > 0) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    ieVar.U0.setVisibility(i13);
                    if (ieVar.W0) {
                        ieVar.V0 = true;
                        long j14 = starsAmount3.amount;
                        ieVar.X0 = j14;
                        String l4 = Long.toString(j14);
                        ai.t tVar = ieVar.Y0;
                        tVar.setText(l4);
                        tVar.setSelection(tVar.getText().length());
                        i10 = 0;
                        ieVar.V0 = false;
                        if (ieVar.X0 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        zdVar.setEnabled(z12);
                    } else {
                        i10 = 0;
                    }
                    ei.d dVar = ieVar.T0;
                    if (dVar != null) {
                        if (starsAmount3.amount > 0) {
                            z11 = 1;
                        } else {
                            z11 = i10;
                        }
                        dVar.setEnabled(z11);
                    }
                    ieVar.L0 = i16;
                    nd ndVar = ieVar.f37939i1;
                    AndroidUtilities.cancelRunOnUIThread(ndVar);
                    ndVar.run();
                }
                feVar5.f36980f = "USD";
                feVar4.f36981g = true;
                feVar4.f36982i = tL_starsRevenueStatus.current_balance;
                double d12 = ieVar.f37941k1;
                feVar4.f36983j = (long) (starsAmount.amount * d12 * 100.0d);
                feVar4.f36980f = "USD";
                fe feVar7 = feVar;
                feVar7.f36981g = true;
                feVar7.f36982i = tL_starsRevenueStatus.overall_revenue;
                feVar7.f36983j = (long) (starsAmount2.amount * d12 * 100.0d);
                feVar7.f36980f = "USD";
                ieVar.f37947r1 = true;
                LinearLayout linearLayout = ieVar.S0;
                if (linearLayout != null) {
                    if (tL_starsRevenueStatus.withdrawal_enabled) {
                        i12 = i10;
                    } else {
                        i12 = 8;
                    }
                    linearLayout.setVisibility(i12);
                }
                if (zdVar != null) {
                    if (tL_starsRevenueStatus.available_balance.amount <= 0 && !BuildVars.DEBUG_PRIVATE_VERSION) {
                        i11 = 8;
                    } else {
                        i11 = i10;
                    }
                    zdVar.setVisibility(i11);
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Components.c71 c71Var = ieVar.f37931a1;
        if (c71Var != null && (u61Var = c71Var.W2) != null) {
            u61Var.N(true);
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        boolean z10;
        ee eeVar = this.f37935e1;
        org.telegram.ui.Components.c71 c71Var = this.f37931a1;
        if (viewGroup == c71Var) {
            try {
                if (eeVar.isAttachedToWindow()) {
                    org.telegram.ui.Components.jm0 currentListView = eeVar.getCurrentListView();
                    int bottom = ((View) eeVar.getParent()).getBottom();
                    org.telegram.ui.ActionBar.k kVar = this.l1;
                    if (kVar != null) {
                        if (isAttachedToWindow() && c71Var.getHeight() - bottom >= 0) {
                            z10 = false;
                            kVar.setCastShadows(z10);
                        }
                        z10 = true;
                        kVar.setCastShadows(z10);
                    }
                    if (c71Var.getHeight() - bottom >= c71Var.getPaddingBottom() + AndroidUtilities.dp(8.0f)) {
                        iArr[1] = i13;
                        currentListView.scrollBy(0, i13);
                    }
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
                AndroidUtilities.runOnUIThread(new od(this, 2));
            }
        }
    }

    @Override
    public final void n(int i10, View view) {
        this.f37953w1.f4053a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        f37929x1 = this;
        super.onAttachedToWindow();
        a0();
    }

    @Override
    public final void onDetachedFromWindow() {
        f37929x1 = null;
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
        this.f37953w1.f4053a = i10;
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
