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
public final class me extends org.telegram.ui.Components.aw0 {
    public static me f38541w2;
    public static HashMap f38542x2;
    public final RelativeSizeSpan A1;
    public final org.telegram.ui.Components.p6 B1;
    public final org.telegram.ui.Components.p6 C1;
    public final ci.d D1;
    public int E1;
    public final zd F1;
    public TL_stars.StarsAmount G1;
    public final org.telegram.ui.Components.p6 H1;
    public final org.telegram.ui.Components.p6 I1;
    public final ce J1;
    public final org.telegram.ui.Components.rq[] K1;
    public final LinearLayout L1;
    public final ci.d M1;
    public final ae N1;
    public boolean O1;
    public boolean P1;
    public long Q1;
    public final fi.o R1;
    public org.telegram.ui.Components.rc S1;
    public boolean T1;
    public int U1;
    public Runnable V1;
    public final ci.ab W1;
    public int X1;
    public int Y1;
    public int Z1;
    public final org.telegram.ui.Components.c71 a2;
    public final FrameLayout f38543b2;
    public DecimalFormat f38544c2;
    public final ie f38545d2;
    public final boolean f38546e2;
    public final boolean f38547f2;
    public final li.m f38548g2;
    public SpannableStringBuilder f38549h2;
    public final qd f38550i2;
    public double f38551j2;
    public double f38552k2;
    public org.telegram.ui.ActionBar.k f38553l2;
    public boolean f38554m2;
    public boolean f38555n2;
    public ha1 f38556o2;
    public final va1 f38557p1;
    public ha1 f38558p2;
    public final org.telegram.ui.ActionBar.d6 f38559q1;
    public ha1 f38560q2;
    public final int f38561r1;
    public boolean f38562r2;
    public final long f38563s1;
    public final je f38564s2;
    public TL_stories.TL_premium_boostsStatus f38565t1;
    public final je f38566t2;
    public int f38567u1;
    public final je f38568u2;
    public final CharSequence f38569v1;
    public final pd f38570v2;
    public final CharSequence f38571w1;
    public final CharSequence f38572x1;
    public final CharSequence f38573y1;
    public final zd f38574z1;

    public me(Activity activity, va1 va1Var, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var, li.m mVar, boolean z10, boolean z11) {
        super(activity);
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.G1 = TL_stars.StarsAmount.ofStars(0L);
        this.K1 = new org.telegram.ui.Components.rq[1];
        this.O1 = false;
        this.P1 = true;
        this.T1 = true;
        this.U1 = -1;
        this.f38554m2 = false;
        this.f38555n2 = false;
        this.f38562r2 = false;
        String string = LocaleController.getString(R.string.MonetizationOverviewAvailable);
        je jeVar = new je();
        jeVar.f37656a = false;
        jeVar.f37657b = "TON";
        jeVar.h = "XTR";
        jeVar.f37658c = string;
        this.f38564s2 = jeVar;
        String string2 = LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal);
        je jeVar2 = new je();
        jeVar2.f37656a = false;
        jeVar2.f37657b = "TON";
        jeVar2.h = "XTR";
        jeVar2.f37658c = string2;
        this.f38566t2 = jeVar2;
        String string3 = LocaleController.getString(R.string.MonetizationOverviewTotal);
        je jeVar3 = new je();
        jeVar3.f37656a = false;
        jeVar3.f37657b = "TON";
        jeVar3.h = "XTR";
        jeVar3.f37658c = string3;
        this.f38568u2 = jeVar3;
        this.f38570v2 = new pd(this, 7);
        this.f38548g2 = mVar;
        this.f38546e2 = z10;
        this.f38547f2 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f38544c2 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.f38544c2.setMaximumFractionDigits(12);
        this.f38544c2.setGroupingUsed(false);
        this.f38557p1 = va1Var;
        this.f38559q1 = d6Var;
        this.f38561r1 = i10;
        this.f38563s1 = j3;
        long j10 = -j3;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        if (chat != null) {
            this.f38567u1 = chat.level;
        }
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j3, new t3(this, 2));
        A0(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.i6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
            if (chatFull != null) {
                boolean z12 = chatFull.restricted_sponsored;
                this.f38554m2 = z12;
                this.f38555n2 = z12;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new wd(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.f38569v1 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new r1(va1Var, activity, d6Var, 12), d6Var), true);
        if (MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled) {
            i11 = R.string.MonetizationBalanceInfo;
        } else {
            i11 = R.string.MonetizationBalanceInfoNotAvailable;
        }
        this.f38571w1 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new pd(this, 0)), true);
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
        this.f38572x1 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i12), -1, 3, new qd(this, i13, 0), d6Var), true);
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            i14 = R.string.MonetizationStarsInfo;
        } else {
            i14 = R.string.MonetizationStarsInfoGroup;
        }
        this.f38573y1 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i14), new pd(this, 1)), true);
        setCommonInsetsManagedExternally(true);
        setGeometry(new g(this, 12));
        this.W1 = new ci.ab(this, activity, 24);
        ie ieVar = new ie(this, activity, i10, j3, va1Var.getClassGuid(), new pd(this, 2), d6Var);
        this.f38545d2 = ieVar;
        zd zdVar = new zd(activity, 0);
        this.f38574z1 = zdVar;
        zdVar.setOrientation(1);
        int i16 = org.telegram.ui.ActionBar.i6.f20817d6;
        zdVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i16, d6Var));
        zdVar.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(activity, false, true, true);
        this.B1 = p6Var;
        p6Var.setTypeface(AndroidUtilities.bold());
        int i17 = org.telegram.ui.ActionBar.i6.G6;
        p6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i17, d6Var));
        p6Var.setTextSize(AndroidUtilities.dp(32.0f));
        p6Var.setGravity(17);
        this.A1 = new RelativeSizeSpan(0.6770833f);
        zdVar.addView(p6Var, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(activity, true, true, true);
        this.C1 = p6Var2;
        p6Var2.setGravity(17);
        int i18 = org.telegram.ui.ActionBar.i6.f21204y6;
        p6Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i18, d6Var));
        p6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        zdVar.addView(p6Var2, w7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ci.d dVar = new ci.d(activity, d6Var, true);
        dVar.setRoundRadius(24);
        this.D1 = dVar;
        dVar.setEnabled(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled);
        dVar.g(LocaleController.getString(R.string.MonetizationWithdraw), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new ai.f2(28, this, va1Var));
        zdVar.addView(dVar, w7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        zd zdVar2 = new zd(activity, 1);
        this.F1 = zdVar2;
        zdVar2.setOrientation(1);
        zdVar2.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i16, d6Var));
        zdVar2.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.p6 p6Var3 = new org.telegram.ui.Components.p6(activity, false, true, true);
        this.H1 = p6Var3;
        p6Var3.setTypeface(AndroidUtilities.bold());
        p6Var3.setTextColor(org.telegram.ui.ActionBar.i6.v0(i17, d6Var));
        p6Var3.setTextSize(AndroidUtilities.dp(32.0f));
        p6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        zdVar2.addView(p6Var3, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.p6 p6Var4 = new org.telegram.ui.Components.p6(activity, true, true, true);
        this.I1 = p6Var4;
        p6Var4.setGravity(17);
        p6Var4.setTextColor(org.telegram.ui.ActionBar.i6.v0(i18, d6Var));
        p6Var4.setTextSize(AndroidUtilities.dp(14.0f));
        zdVar2.addView(p6Var4, w7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ae aeVar = new ae(this, activity, 0);
        this.N1 = aeVar;
        aeVar.setVisibility(8);
        aeVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        aeVar.setLeftPadding(AndroidUtilities.dp(36.0f));
        fi.o oVar = new fi.o(activity, 1);
        this.R1 = oVar;
        oVar.setFocusable(false);
        oVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i17, d6Var));
        oVar.setCursorSize(AndroidUtilities.dp(20.0f));
        oVar.setCursorWidth(1.5f);
        oVar.setBackground(null);
        oVar.setTextSize(1, 18.0f);
        oVar.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        oVar.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        oVar.setInputType(2);
        oVar.setTypeface(Typeface.DEFAULT);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21143uf, d6Var));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21160vf, d6Var));
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
        linearLayout.addView(imageView, w7.z5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(oVar, w7.z5.o(-1, -2, 1.0f, 119));
        aeVar.e(oVar);
        aeVar.addView(linearLayout, w7.z5.e(-1, -2, 48));
        zdVar2.addView(aeVar, w7.z5.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.L1 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? dVar2 = new ci.d(activity, d6Var, true);
        dVar2.setRoundRadius(24);
        this.J1 = dVar2;
        dVar2.setEnabled(false);
        dVar2.g(LocaleController.formatPluralString("MonetizationStarsWithdraw", 0, new Object[0]), false, true);
        dVar2.setVisibility(0);
        dVar2.setOnClickListener(new org.telegram.ui.Cells.ua(this, i10, va1Var, 2));
        ci.d dVar3 = new ci.d(activity, d6Var, true);
        dVar3.setRoundRadius(24);
        this.M1 = dVar3;
        dVar3.setEnabled(false);
        dVar3.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        dVar3.setOnClickListener(new td(this, i10, j3, activity));
        linearLayout2.addView((View) dVar2, w7.z5.o(-1, 48, 1.0f, 119));
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            linearLayout2.addView(new Space(activity), w7.z5.o(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar3, w7.z5.o(-1, 48, 1.0f, 119));
        }
        zdVar2.addView(linearLayout2, w7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        oVar.setOnEditorActionListener(new yd(0, this, va1Var));
        this.f38550i2 = new qd(this, i10, 2);
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(va1Var, new c5(this, 2), new od(this), new od(this));
        this.a2 = c71Var;
        gg.j0 j0Var = new gg.j0(5, this, false);
        c71Var.f25243e3 = j0Var;
        c71Var.setLayoutManager(j0Var);
        c71Var.setClipToPadding(false);
        c71Var.s1();
        c71Var.setCaptureSectionsDecoratorAllowed(true);
        c71Var.f25244f3.f31306r = false;
        n0(c71Var, new od(this));
        q0(ieVar, ieVar.f37400b, new m4(6));
        View view = ieVar.d;
        r0(view);
        view.setLayoutParams(w7.z5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        if (mVar != null) {
            mVar.b(c71Var);
        }
        LinearLayout e7 = org.telegram.messenger.f0.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f38543b2 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20761a7, d6Var));
        frameLayout.addView(e7, w7.z5.e(-2, -2, 17));
        ?? imageView2 = new ImageView(activity);
        imageView2.setAutoRepeat(true);
        imageView2.f(R.raw.statistic_preload, 120, 120, null);
        imageView2.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i19 = org.telegram.ui.ActionBar.i6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i19, false));
        textView.setTag(Integer.valueOf(i19));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i20 = org.telegram.ui.ActionBar.i6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i20, false));
        textView2.setTag(Integer.valueOf(i20));
        org.telegram.messenger.ok.l(R.string.LoadingStatsDescription, textView2, 1);
        e7.addView((View) imageView2, w7.z5.t(120, 120, 1, 0, 0, 0, 20));
        e7.addView(textView, w7.z5.t(-2, -2, 1, 0, 0, 0, 10));
        e7.addView(textView2, w7.z5.q(-2, -2, 1));
        addView(frameLayout, w7.z5.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.f3 B0(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.f3 j3 = org.telegram.messenger.ok.j(1, context, d6Var, false);
        LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_monetize);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var)));
        f7.addView(imageView, w7.z5.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        int i19 = org.telegram.ui.ActionBar.i6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i19, d6Var));
        if (z10) {
            i10 = R.string.BotMonetizationInfoTitle;
        } else {
            i10 = R.string.MonetizationInfoTitle;
        }
        textView.setText(LocaleController.getString(i10));
        f7.addView(textView, w7.z5.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
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
        f7.addView(new ai.w5(context, i20, string, LocaleController.getString(i12), d6Var), w7.z5.t(-1, -2, 49, 8, 0, 8, 16));
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
        f7.addView(new ai.w5(context, i21, string2, LocaleController.getString(i14), d6Var), w7.z5.t(-1, -2, 49, 8, 0, 8, 16));
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
        f7.addView(new ai.w5(context, i22, string3, LocaleController.getString(i16), d6Var), w7.z5.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20818d7, d6Var));
        f7.addView(view, w7.z5.s(-1, 55, 12, 0, 12, 1.0f / AndroidUtilities.density, 0));
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(context);
        y5Var.setGravity(17);
        y5Var.setTextSize(1, 20.0f);
        y5Var.setTypeface(AndroidUtilities.bold());
        y5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i19, d6Var));
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(R.drawable.mini_gram_72, 0);
        rqVar.setScale(0.9f, 0.9f);
        rqVar.setColorKey(org.telegram.ui.ActionBar.i6.f21020o6);
        rqVar.setRelativeSize(y5Var.getPaint().getFontMetricsInt());
        rqVar.spaceScaleX = 0.9f;
        spannableString.setSpan(rqVar, 0, spannableString.length(), 33);
        if (z10) {
            i17 = R.string.BotMonetizationInfoTONTitle;
        } else {
            i17 = R.string.MonetizationInfoTONTitle;
        }
        y5Var.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(i17), spannableString));
        f7.addView(y5Var, w7.z5.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(context, d6Var);
        q90Var.setGravity(17);
        q90Var.setTextSize(1, 14.0f);
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i19, d6Var));
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var));
        if (z10) {
            i18 = R.string.BotMonetizationInfoTONText;
        } else {
            i18 = R.string.MonetizationInfoTONText;
        }
        q90Var.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(i18)), new bi.f(19, context, z10)));
        f7.addView(q90Var, w7.z5.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        ci.d g10 = org.telegram.messenger.ok.g(24, context, d6Var, true);
        g10.g(LocaleController.getString(R.string.GotIt), false, true);
        g10.setOnClickListener(new sd(j3, 0));
        f7.addView(g10, w7.z5.t(-1, 48, 55, 10, 25, 10, 14));
        j3.setCustomView(f7);
        return j3;
    }

    public static CharSequence D0(CharSequence charSequence, TextPaint textPaint, float f7, float f10, boolean z10) {
        int i10;
        if (f38542x2 == null) {
            f38542x2 = new HashMap();
        }
        int i11 = textPaint.getFontMetricsInt().bottom;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = ((i11 * i10) * ((int) (f7 * 100.0f))) - ((int) (100.0f * f10));
        SpannableString spannableString = (SpannableString) f38542x2.get(Integer.valueOf(i12));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(R.drawable.mini_gram_72, 0);
                rqVar.setScale(f7, f7);
                rqVar.setColorKey(org.telegram.ui.ActionBar.i6.f21020o6);
                rqVar.setRelativeSize(textPaint.getFontMetricsInt());
                rqVar.spaceScaleX = 0.9f;
                spannableString.setSpan(rqVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.rq rqVar2 = new org.telegram.ui.Components.rq(R.drawable.mini_gram_16, 0);
                rqVar2.setScale(f7, f7);
                rqVar2.setTranslateY(f10);
                rqVar2.spaceScaleX = 0.95f;
                spannableString.setSpan(rqVar2, 0, spannableString.length(), 33);
            }
            f38542x2.put(Integer.valueOf(i12), spannableString);
        }
        return AndroidUtilities.replaceMultipleCharSequence("TON", charSequence, spannableString);
    }

    public static void F0(Context context, int i10, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j3, org.telegram.ui.ActionBar.d6 d6Var) {
        long j10;
        org.telegram.ui.ActionBar.f3 f3Var;
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
        org.telegram.ui.ActionBar.f3 f3Var2;
        String userName;
        TLRPC.Chat chat;
        org.telegram.ui.ActionBar.f3 j14 = org.telegram.messenger.ok.j(1, context, d6Var, false);
        LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            String string2 = LocaleController.getString(R.string.MonetizationTransactionDetailWithdraw);
            j10 = 0;
            j11 = tL_broadcastRevenueTransactionWithdrawal.amount;
            z10 = tL_broadcastRevenueTransactionWithdrawal.pending;
            f3Var = j14;
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
                f3Var = j14;
                j11 = tL_broadcastRevenueTransactionProceeds.amount;
                j13 = j16;
                j12 = j15;
            } else {
                f3Var = j14;
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
        org.telegram.messenger.ok.k(18.0f, 1, textView);
        if (c10 < 0) {
            i11 = org.telegram.ui.ActionBar.i6.f21058q7;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.f20966l8;
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
        f7.addView(textView, w7.z5.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21204y6, d6Var));
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
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21058q7, d6Var));
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        f7.addView(textView2, w7.z5.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.ok.k(14.0f, 1, textView3);
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
        textView3.setText(str);
        f7.addView(textView3, w7.z5.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20810ci, d6Var)));
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
            org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
            h9Var.p(chat);
            w9Var.e(chat, h9Var);
            frameLayout.addView(w9Var, w7.z5.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            textView4.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20925j5, d6Var));
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, w7.z5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            f7.addView(frameLayout, w7.z5.t(-2, 28, 1, 42, 10, 42, 0));
        }
        ci.d g10 = org.telegram.messenger.ok.g(24, context, d6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                g10.g(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false, true);
                g10.setOnClickListener(new ai.f2(context, tL_broadcastRevenueTransactionWithdrawal2));
                f3Var2 = f3Var;
                f7.addView(g10, w7.z5.t(-1, 48, 55, 18, 30, 18, 14));
                f3Var2.setCustomView(f7);
                f3Var2.show();
            }
        }
        g10.g(LocaleController.getString(R.string.OK), false, true);
        f3Var2 = f3Var;
        g10.setOnClickListener(new sd(f3Var2, 1));
        f7.addView(g10, w7.z5.t(-1, 48, 55, 18, 30, 18, 14));
        f3Var2.setCustomView(f7);
        f3Var2.show();
    }

    public final void A0(boolean z10) {
        if (!this.f38547f2) {
            return;
        }
        int i10 = this.f38561r1;
        yh.o g10 = yh.o.g(i10);
        long j3 = this.f38563s1;
        TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, z10);
        if (h != null) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(23, this, h));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.i6.I.q();
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new wd(this, 2));
    }

    public final void C0() {
        ie ieVar = this.f38545d2;
        pd pdVar = ieVar.f37403f;
        boolean[] zArr = ieVar.v;
        boolean a2 = ieVar.a();
        for (int i10 = 0; i10 < 2; i10++) {
            if (!zArr[i10]) {
                if (i10 == 1) {
                    ieVar.f37404n.clear();
                    ieVar.h = "";
                } else {
                    ieVar.f37405r.clear();
                    ieVar.f37406s = "";
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

    public final void E0(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        je jeVar;
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.u61 u61Var;
        je jeVar2;
        int i13;
        int i14;
        me meVar = this;
        je jeVar3 = meVar.f38568u2;
        je jeVar4 = meVar.f38566t2;
        org.telegram.ui.Components.p6 p6Var = meVar.C1;
        RelativeSizeSpan relativeSizeSpan = meVar.A1;
        org.telegram.ui.Components.p6 p6Var2 = meVar.B1;
        je jeVar5 = meVar.f38564s2;
        if (z10) {
            jeVar5.f37656a = true;
            long j3 = tL_starsRevenueStatus.available_balance.amount;
            jeVar5.d = j3;
            double d = j3 / 1.0E9d;
            long j10 = (long) (meVar.f38551j2 * d * 100.0d);
            jeVar5.f37659e = j10;
            if (meVar.f38544c2 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                jeVar2 = jeVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                meVar.f38544c2 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i13 = 6;
                meVar.f38544c2.setMaximumFractionDigits(6);
                meVar.f38544c2.setGroupingUsed(false);
            } else {
                jeVar2 = jeVar3;
                i13 = 6;
            }
            DecimalFormat decimalFormat2 = meVar.f38544c2;
            if (d > 1.5d) {
                i13 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i13);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(D0("TON " + meVar.f38544c2.format(d), p6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            p6Var2.setText(spannableStringBuilder);
            p6Var.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
            jeVar5.f37660f = "USD";
            jeVar4.f37656a = true;
            long j11 = tL_starsRevenueStatus.current_balance.amount;
            jeVar4.d = j11;
            meVar = this;
            double d10 = meVar.f38551j2;
            jeVar4.f37659e = (long) ((j11 / 1.0E9d) * d10 * 100.0d);
            jeVar4.f37660f = "USD";
            je jeVar6 = jeVar2;
            jeVar6.f37656a = true;
            long j12 = tL_starsRevenueStatus.overall_revenue.amount;
            jeVar6.d = j12;
            jeVar6.f37659e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            jeVar6.f37660f = "USD";
            meVar.f38562r2 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            meVar.D1.setVisibility(i14);
        } else {
            double d11 = meVar.f38552k2;
            if (d11 != 0.0d) {
                jeVar5.f37661g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
                jeVar5.f37662i = starsAmount;
                jeVar5.f37663j = (long) (starsAmount.amount * d11 * 100.0d);
                int i15 = tL_starsRevenueStatus.next_withdrawal_at;
                ce ceVar = meVar.J1;
                if (p6Var2 == null || p6Var == null) {
                    jeVar = jeVar3;
                } else {
                    jeVar = jeVar3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(yh.x7.d1(false, TextUtils.concat("XTR ", yh.x7.P0(starsAmount, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    meVar.G1 = starsAmount;
                    meVar.H1.setText(spannableStringBuilder2);
                    meVar.I1.setText("≈" + BillingController.getInstance().formatCurrency((long) (meVar.f38552k2 * starsAmount.amount * 100.0d), "USD"));
                    if (starsAmount.amount > 0) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    meVar.N1.setVisibility(i12);
                    if (meVar.P1) {
                        meVar.O1 = true;
                        long j13 = starsAmount.amount;
                        meVar.Q1 = j13;
                        String l4 = Long.toString(j13);
                        fi.o oVar = meVar.R1;
                        oVar.setText(l4);
                        oVar.setSelection(oVar.getText().length());
                        meVar.O1 = false;
                        if (meVar.Q1 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        ceVar.setEnabled(z12);
                    }
                    ci.d dVar = meVar.M1;
                    if (dVar != null) {
                        if (starsAmount.amount > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        dVar.setEnabled(z11);
                    }
                    meVar.E1 = i15;
                    qd qdVar = meVar.f38550i2;
                    AndroidUtilities.cancelRunOnUIThread(qdVar);
                    qdVar.run();
                }
                jeVar5.f37660f = "USD";
                jeVar4.f37661g = true;
                TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus.current_balance;
                jeVar4.f37662i = starsAmount2;
                double d12 = meVar.f38552k2;
                jeVar4.f37663j = (long) (starsAmount2.amount * d12 * 100.0d);
                jeVar4.f37660f = "USD";
                je jeVar7 = jeVar;
                jeVar7.f37661g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.overall_revenue;
                jeVar7.f37662i = starsAmount3;
                jeVar7.f37663j = (long) (starsAmount3.amount * d12 * 100.0d);
                jeVar7.f37660f = "USD";
                meVar.f38562r2 = true;
                LinearLayout linearLayout = meVar.L1;
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
        org.telegram.ui.Components.c71 c71Var = meVar.a2;
        if (c71Var != null && (u61Var = c71Var.f25244f3) != null) {
            u61Var.N(true);
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public View getTransactionTabs() {
        return this.f38545d2.d;
    }

    @Override
    public final void onAttachedToWindow() {
        f38541w2 = this;
        super.onAttachedToWindow();
        x0();
    }

    @Override
    public final void onDetachedFromWindow() {
        f38541w2 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.k kVar = this.f38553l2;
        if (kVar != null) {
            kVar.setCastShadows(true);
        }
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f38553l2 = kVar;
    }

    public void setTabsPinnedChangedListener(Runnable runnable) {
        this.V1 = runnable;
    }

    public final void w0(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        boolean z10;
        FrameLayout frameLayout;
        jg.b bVar;
        ArrayList arrayList;
        if (this.f38560q2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38552k2 = tL_payments_starsRevenueStats.usd_rate;
        ha1 d02 = va1.d0(tL_payments_starsRevenueStats.revenue_graph, LocaleController.getString(R.string.MonetizationGraphStarsRevenue), 2, false);
        this.f38560q2 = d02;
        if (d02 != null && (bVar = d02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f38560q2.d.d.get(0) != null) {
            ((jg.a) this.f38560q2.d.d.get(0)).f14119g = org.telegram.ui.ActionBar.i6.kj;
            this.f38560q2.d.h = (float) ((1.0d / this.f38552k2) / 100.0d);
        }
        E0(false, tL_payments_starsRevenueStats.status);
        if (!this.f38546e2 && (frameLayout = this.f38543b2) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.tr.h).withEndAction(new pd(this, 6)).start();
        }
        org.telegram.ui.Components.c71 c71Var = this.a2;
        if (c71Var != null) {
            c71Var.f25244f3.N(!z10);
            if (z10) {
                c71Var.v0(0);
            }
        }
    }

    public final void x0() {
        if (isAttachedToWindow() && this.f38546e2 && this.f38562r2 && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            this.f38557p1.showDialog(B0(getContext(), this.f38559q1, false));
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void y0(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        va1 va1Var = this.f38557p1;
        if (va1Var != null) {
            Activity parentActivity = va1Var.getParentActivity();
            int i10 = this.f38561r1;
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            if (parentActivity != null && currentUser != null) {
                long j3 = this.f38563s1;
                if (z10) {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                    tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                    tL_payments_getStarsRevenueWithdrawalUrl.amount = this.Q1;
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

    public final boolean z0(float f7, float f10) {
        if (this.f38543b2.getVisibility() != 0 && b0() && f7 >= 0.0f && f7 < getWidth() && f10 >= getTabsTop() && f10 < getHeight()) {
            return true;
        }
        return false;
    }
}
