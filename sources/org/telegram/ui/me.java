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
public final class me extends org.telegram.ui.Components.bw0 {
    public static me f38578t1;
    public static HashMap f38579u1;
    public final ci.d A0;
    public int B0;
    public final zd C0;
    public TL_stars.StarsAmount D0;
    public final org.telegram.ui.Components.p6 E0;
    public final org.telegram.ui.Components.p6 F0;
    public final ce G0;
    public final org.telegram.ui.Components.rq[] H0;
    public final LinearLayout I0;
    public final ci.d J0;
    public final ae K0;
    public boolean L0;
    public boolean M0;
    public long N0;
    public final fi.o O0;
    public org.telegram.ui.Components.rc P0;
    public boolean Q0;
    public int R0;
    public Runnable S0;
    public final ci.ab T0;
    public int U0;
    public int V0;
    public int W0;
    public final org.telegram.ui.Components.e71 X0;
    public final FrameLayout Y0;
    public DecimalFormat Z0;
    public final ie f38580a1;
    public final boolean f38581b1;
    public final boolean f38582c1;
    public final li.p f38583d1;
    public SpannableStringBuilder f38584e1;
    public final qd f38585f1;
    public double f38586g1;
    public double f38587h1;
    public org.telegram.ui.ActionBar.k f38588i1;
    public boolean f38589j1;
    public boolean f38590k1;
    public fa1 l1;
    public final ta1 m0;
    public fa1 f38591m1;
    public final org.telegram.ui.ActionBar.d6 f38592n0;
    public fa1 f38593n1;
    public final int f38594o0;
    public boolean f38595o1;
    public final long f38596p0;
    public final je f38597p1;
    public TL_stories.TL_premium_boostsStatus f38598q0;
    public final je f38599q1;
    public int f38600r0;
    public final je f38601r1;
    public final CharSequence f38602s0;
    public final pd f38603s1;
    public final CharSequence f38604t0;
    public final CharSequence f38605u0;
    public final CharSequence f38606v0;
    public final zd f38607w0;
    public final RelativeSizeSpan f38608x0;
    public final org.telegram.ui.Components.p6 f38609y0;
    public final org.telegram.ui.Components.p6 f38610z0;

    public me(Activity activity, ta1 ta1Var, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var, li.p pVar, boolean z10, boolean z11) {
        super(activity);
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.D0 = TL_stars.StarsAmount.ofStars(0L);
        this.H0 = new org.telegram.ui.Components.rq[1];
        this.L0 = false;
        this.M0 = true;
        this.Q0 = true;
        this.R0 = -1;
        this.f38589j1 = false;
        this.f38590k1 = false;
        this.f38595o1 = false;
        String string = LocaleController.getString(R.string.MonetizationOverviewAvailable);
        je jeVar = new je();
        jeVar.f37669a = false;
        jeVar.f37670b = "TON";
        jeVar.h = "XTR";
        jeVar.f37671c = string;
        this.f38597p1 = jeVar;
        String string2 = LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal);
        je jeVar2 = new je();
        jeVar2.f37669a = false;
        jeVar2.f37670b = "TON";
        jeVar2.h = "XTR";
        jeVar2.f37671c = string2;
        this.f38599q1 = jeVar2;
        String string3 = LocaleController.getString(R.string.MonetizationOverviewTotal);
        je jeVar3 = new je();
        jeVar3.f37669a = false;
        jeVar3.f37670b = "TON";
        jeVar3.h = "XTR";
        jeVar3.f37671c = string3;
        this.f38601r1 = jeVar3;
        this.f38603s1 = new pd(this, 7);
        this.f38583d1 = pVar;
        this.f38581b1 = z10;
        this.f38582c1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.Z0 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.Z0.setMaximumFractionDigits(12);
        this.Z0.setGroupingUsed(false);
        this.m0 = ta1Var;
        this.f38592n0 = d6Var;
        this.f38594o0 = i10;
        this.f38596p0 = j3;
        long j10 = -j3;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        if (chat != null) {
            this.f38600r0 = chat.level;
        }
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j3, new t3(this, 2));
        H(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.i6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
            if (chatFull != null) {
                boolean z12 = chatFull.restricted_sponsored;
                this.f38589j1 = z12;
                this.f38590k1 = z12;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new wd(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.f38602s0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new r1(ta1Var, activity, d6Var, 12), d6Var), true);
        if (MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled) {
            i11 = R.string.MonetizationBalanceInfo;
        } else {
            i11 = R.string.MonetizationBalanceInfoNotAvailable;
        }
        this.f38604t0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new pd(this, 0)), true);
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
        this.f38605u0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i12), -1, 3, new qd(this, i13, 0), d6Var), true);
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            i14 = R.string.MonetizationStarsInfo;
        } else {
            i14 = R.string.MonetizationStarsInfoGroup;
        }
        this.f38606v0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i14), new pd(this, 1)), true);
        setCommonInsetsManagedExternally(true);
        setGeometry(new g(this, 12));
        this.T0 = new ci.ab(this, activity, 24);
        ie ieVar = new ie(this, activity, i10, j3, ta1Var.getClassGuid(), new pd(this, 2), d6Var);
        this.f38580a1 = ieVar;
        zd zdVar = new zd(activity, 0);
        this.f38607w0 = zdVar;
        zdVar.setOrientation(1);
        int i16 = org.telegram.ui.ActionBar.i6.f20827d6;
        zdVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i16, d6Var));
        zdVar.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(activity, false, true, true);
        this.f38609y0 = p6Var;
        p6Var.setTypeface(AndroidUtilities.bold());
        int i17 = org.telegram.ui.ActionBar.i6.G6;
        p6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i17, d6Var));
        p6Var.setTextSize(AndroidUtilities.dp(32.0f));
        p6Var.setGravity(17);
        this.f38608x0 = new RelativeSizeSpan(0.6770833f);
        zdVar.addView(p6Var, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(activity, true, true, true);
        this.f38610z0 = p6Var2;
        p6Var2.setGravity(17);
        int i18 = org.telegram.ui.ActionBar.i6.f21214y6;
        p6Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i18, d6Var));
        p6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        zdVar.addView(p6Var2, w7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ci.d dVar = new ci.d(activity, d6Var, true);
        dVar.setRoundRadius(24);
        this.A0 = dVar;
        dVar.setEnabled(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled);
        dVar.g(LocaleController.getString(R.string.MonetizationWithdraw), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new ai.f2(28, this, ta1Var));
        zdVar.addView(dVar, w7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        zd zdVar2 = new zd(activity, 1);
        this.C0 = zdVar2;
        zdVar2.setOrientation(1);
        zdVar2.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i16, d6Var));
        zdVar2.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.p6 p6Var3 = new org.telegram.ui.Components.p6(activity, false, true, true);
        this.E0 = p6Var3;
        p6Var3.setTypeface(AndroidUtilities.bold());
        p6Var3.setTextColor(org.telegram.ui.ActionBar.i6.v0(i17, d6Var));
        p6Var3.setTextSize(AndroidUtilities.dp(32.0f));
        p6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        zdVar2.addView(p6Var3, w7.z5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.p6 p6Var4 = new org.telegram.ui.Components.p6(activity, true, true, true);
        this.F0 = p6Var4;
        p6Var4.setGravity(17);
        p6Var4.setTextColor(org.telegram.ui.ActionBar.i6.v0(i18, d6Var));
        p6Var4.setTextSize(AndroidUtilities.dp(14.0f));
        zdVar2.addView(p6Var4, w7.z5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ae aeVar = new ae(this, activity, 0);
        this.K0 = aeVar;
        aeVar.setVisibility(8);
        aeVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        aeVar.setLeftPadding(AndroidUtilities.dp(36.0f));
        fi.o oVar = new fi.o(activity, 1);
        this.O0 = oVar;
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
        oVar.setHighlightColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21153uf, d6Var));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21170vf, d6Var));
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
        this.I0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? dVar2 = new ci.d(activity, d6Var, true);
        dVar2.setRoundRadius(24);
        this.G0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.g(LocaleController.formatPluralString("MonetizationStarsWithdraw", 0, new Object[0]), false, true);
        dVar2.setVisibility(0);
        dVar2.setOnClickListener(new org.telegram.ui.Cells.ua(this, i10, ta1Var, 2));
        ci.d dVar3 = new ci.d(activity, d6Var, true);
        dVar3.setRoundRadius(24);
        this.J0 = dVar3;
        dVar3.setEnabled(false);
        dVar3.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        dVar3.setOnClickListener(new td(this, i10, j3, activity));
        linearLayout2.addView((View) dVar2, w7.z5.o(-1, 48, 1.0f, 119));
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            linearLayout2.addView(new Space(activity), w7.z5.o(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar3, w7.z5.o(-1, 48, 1.0f, 119));
        }
        zdVar2.addView(linearLayout2, w7.z5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        oVar.setOnEditorActionListener(new yd(0, this, ta1Var));
        this.f38585f1 = new qd(this, i10, 2);
        org.telegram.ui.Components.e71 e71Var = new org.telegram.ui.Components.e71(ta1Var, new c5(this, 2), new od(this), new od(this));
        this.X0 = e71Var;
        gg.j0 j0Var = new gg.j0(5, this, false);
        e71Var.f26033e3 = j0Var;
        e71Var.setLayoutManager(j0Var);
        e71Var.setClipToPadding(false);
        e71Var.r1();
        e71Var.setCaptureSectionsDecoratorAllowed(true);
        e71Var.f26034f3.f32531r = false;
        u(e71Var, new od(this));
        x(ieVar, ieVar.f37389b, new m4(6));
        View view = ieVar.d;
        y(view);
        view.setLayoutParams(w7.z5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        if (pVar != null) {
            pVar.b(e71Var);
        }
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.Y0 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20771a7, d6Var));
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
        org.telegram.messenger.bi.k(R.string.LoadingStatsDescription, textView2, 1);
        e7.addView((View) imageView2, w7.z5.t(120, 120, 1, 0, 0, 0, 20));
        e7.addView(textView, w7.z5.t(-2, -2, 1, 0, 0, 0, 10));
        e7.addView(textView2, w7.z5.q(-2, -2, 1));
        addView(frameLayout, w7.z5.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.f3 I(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.f3 i19 = org.telegram.messenger.bi.i(1, context, d6Var, false);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        e7.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_monetize);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var)));
        e7.addView(imageView, w7.z5.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        int i20 = org.telegram.ui.ActionBar.i6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i20, d6Var));
        if (z10) {
            i10 = R.string.BotMonetizationInfoTitle;
        } else {
            i10 = R.string.MonetizationInfoTitle;
        }
        textView.setText(LocaleController.getString(i10));
        e7.addView(textView, w7.z5.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
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
        e7.addView(new ai.w5(context, i21, string, LocaleController.getString(i12), d6Var), w7.z5.t(-1, -2, 49, 8, 0, 8, 16));
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
        e7.addView(new ai.w5(context, i22, string2, LocaleController.getString(i14), d6Var), w7.z5.t(-1, -2, 49, 8, 0, 8, 16));
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
        e7.addView(new ai.w5(context, i23, string3, LocaleController.getString(i16), d6Var), w7.z5.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20828d7, d6Var));
        e7.addView(view, w7.z5.s(-1, 55, 12, 0, 12, 1.0f / AndroidUtilities.density, 0));
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(context);
        y5Var.setGravity(17);
        y5Var.setTextSize(1, 20.0f);
        y5Var.setTypeface(AndroidUtilities.bold());
        y5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i20, d6Var));
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(R.drawable.mini_gram_72, 0);
        rqVar.setScale(0.9f, 0.9f);
        rqVar.setColorKey(org.telegram.ui.ActionBar.i6.f21030o6);
        rqVar.setRelativeSize(y5Var.getPaint().getFontMetricsInt());
        rqVar.spaceScaleX = 0.9f;
        spannableString.setSpan(rqVar, 0, spannableString.length(), 33);
        if (z10) {
            i17 = R.string.BotMonetizationInfoTONTitle;
        } else {
            i17 = R.string.MonetizationInfoTONTitle;
        }
        y5Var.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(i17), spannableString));
        e7.addView(y5Var, w7.z5.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(context, d6Var);
        q90Var.setGravity(17);
        q90Var.setTextSize(1, 14.0f);
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i20, d6Var));
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var));
        if (z10) {
            i18 = R.string.BotMonetizationInfoTONText;
        } else {
            i18 = R.string.MonetizationInfoTONText;
        }
        q90Var.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(i18)), new bi.f(19, context, z10)));
        e7.addView(q90Var, w7.z5.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        ci.d f7 = org.telegram.messenger.bi.f(24, context, d6Var, true);
        f7.g(LocaleController.getString(R.string.GotIt), false, true);
        f7.setOnClickListener(new sd(i19, 0));
        e7.addView(f7, w7.z5.t(-1, 48, 55, 10, 25, 10, 14));
        i19.setCustomView(e7);
        return i19;
    }

    public static CharSequence K(CharSequence charSequence, TextPaint textPaint, float f7, float f10, boolean z10) {
        int i10;
        if (f38579u1 == null) {
            f38579u1 = new HashMap();
        }
        int i11 = textPaint.getFontMetricsInt().bottom;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = ((i11 * i10) * ((int) (f7 * 100.0f))) - ((int) (100.0f * f10));
        SpannableString spannableString = (SpannableString) f38579u1.get(Integer.valueOf(i12));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(R.drawable.mini_gram_72, 0);
                rqVar.setScale(f7, f7);
                rqVar.setColorKey(org.telegram.ui.ActionBar.i6.f21030o6);
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
            f38579u1.put(Integer.valueOf(i12), spannableString);
        }
        return AndroidUtilities.replaceMultipleCharSequence("TON", charSequence, spannableString);
    }

    public static void M(Context context, int i10, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j3, org.telegram.ui.ActionBar.d6 d6Var) {
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
        org.telegram.ui.ActionBar.f3 i12 = org.telegram.messenger.bi.i(1, context, d6Var, false);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            String string2 = LocaleController.getString(R.string.MonetizationTransactionDetailWithdraw);
            j10 = 0;
            j11 = tL_broadcastRevenueTransactionWithdrawal.amount;
            z10 = tL_broadcastRevenueTransactionWithdrawal.pending;
            f3Var = i12;
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
                long j14 = tL_broadcastRevenueTransactionProceeds.from_date;
                long j15 = tL_broadcastRevenueTransactionProceeds.to_date;
                f3Var = i12;
                j11 = tL_broadcastRevenueTransactionProceeds.amount;
                j13 = j15;
                j12 = j14;
            } else {
                f3Var = i12;
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
        org.telegram.messenger.bi.j(18.0f, 1, textView);
        if (c10 < 0) {
            i11 = org.telegram.ui.ActionBar.i6.f21068q7;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.f20976l8;
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
        e7.addView(textView, w7.z5.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21214y6, d6Var));
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
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21068q7, d6Var));
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        e7.addView(textView2, w7.z5.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.bi.j(14.0f, 1, textView3);
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var));
        textView3.setText(str);
        e7.addView(textView3, w7.z5.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20820ci, d6Var)));
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
            textView4.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20935j5, d6Var));
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, w7.z5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            e7.addView(frameLayout, w7.z5.t(-2, 28, 1, 42, 10, 42, 0));
        }
        ci.d f7 = org.telegram.messenger.bi.f(24, context, d6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                f7.g(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false, true);
                f7.setOnClickListener(new ai.f2(context, tL_broadcastRevenueTransactionWithdrawal2));
                f3Var2 = f3Var;
                e7.addView(f7, w7.z5.t(-1, 48, 55, 18, 30, 18, 14));
                f3Var2.setCustomView(e7);
                f3Var2.show();
            }
        }
        f7.g(LocaleController.getString(R.string.OK), false, true);
        f3Var2 = f3Var;
        f7.setOnClickListener(new sd(f3Var2, 1));
        e7.addView(f7, w7.z5.t(-1, 48, 55, 18, 30, 18, 14));
        f3Var2.setCustomView(e7);
        f3Var2.show();
    }

    public final void D(TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats) {
        boolean z10;
        FrameLayout frameLayout;
        jg.b bVar;
        ArrayList arrayList;
        if (this.f38593n1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38587h1 = tL_payments_starsRevenueStats.usd_rate;
        fa1 d02 = ta1.d0(tL_payments_starsRevenueStats.revenue_graph, LocaleController.getString(R.string.MonetizationGraphStarsRevenue), 2, false);
        this.f38593n1 = d02;
        if (d02 != null && (bVar = d02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f38593n1.d.d.get(0) != null) {
            ((jg.a) this.f38593n1.d.d.get(0)).f14120g = org.telegram.ui.ActionBar.i6.kj;
            this.f38593n1.d.h = (float) ((1.0d / this.f38587h1) / 100.0d);
        }
        L(false, tL_payments_starsRevenueStats.status);
        if (!this.f38581b1 && (frameLayout = this.Y0) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.tr.h).withEndAction(new pd(this, 6)).start();
        }
        org.telegram.ui.Components.e71 e71Var = this.X0;
        if (e71Var != null) {
            e71Var.f26034f3.N(!z10);
            if (z10) {
                e71Var.v0(0);
            }
        }
    }

    public final void E() {
        if (isAttachedToWindow() && this.f38581b1 && this.f38595o1 && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            this.m0.showDialog(I(getContext(), this.f38592n0, false));
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void F(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        ta1 ta1Var = this.m0;
        if (ta1Var != null) {
            Activity parentActivity = ta1Var.getParentActivity();
            int i10 = this.f38594o0;
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            if (parentActivity != null && currentUser != null) {
                long j3 = this.f38596p0;
                if (z10) {
                    tL_payments_getStarsRevenueWithdrawalUrl = new TLRPC.TL_payments_getStarsRevenueWithdrawalUrl();
                    tL_payments_getStarsRevenueWithdrawalUrl.ton = false;
                    tL_payments_getStarsRevenueWithdrawalUrl.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                    if (inputCheckPasswordSRP == null) {
                        inputCheckPasswordSRP = new TLRPC.TL_inputCheckPasswordEmpty();
                    }
                    tL_payments_getStarsRevenueWithdrawalUrl.password = inputCheckPasswordSRP;
                    tL_payments_getStarsRevenueWithdrawalUrl.flags |= 2;
                    tL_payments_getStarsRevenueWithdrawalUrl.amount = this.N0;
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

    public final boolean G(float f7, float f10) {
        if (this.Y0.getVisibility() != 0 && c() && f7 >= 0.0f && f7 < getWidth() && f10 >= getTabsTop() && f10 < getHeight()) {
            return true;
        }
        return false;
    }

    public final void H(boolean z10) {
        if (!this.f38582c1) {
            return;
        }
        int i10 = this.f38594o0;
        yh.p g10 = yh.p.g(i10);
        long j3 = this.f38596p0;
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

    public final void J() {
        ie ieVar = this.f38580a1;
        pd pdVar = ieVar.f37392f;
        boolean[] zArr = ieVar.v;
        boolean a2 = ieVar.a();
        for (int i10 = 0; i10 < 2; i10++) {
            if (!zArr[i10]) {
                if (i10 == 1) {
                    ieVar.f37393n.clear();
                    ieVar.h = "";
                } else {
                    ieVar.f37394r.clear();
                    ieVar.f37395s = "";
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

    public final void L(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        je jeVar;
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.w61 w61Var;
        je jeVar2;
        int i13;
        int i14;
        me meVar = this;
        je jeVar3 = meVar.f38601r1;
        je jeVar4 = meVar.f38599q1;
        org.telegram.ui.Components.p6 p6Var = meVar.f38610z0;
        RelativeSizeSpan relativeSizeSpan = meVar.f38608x0;
        org.telegram.ui.Components.p6 p6Var2 = meVar.f38609y0;
        je jeVar5 = meVar.f38597p1;
        if (z10) {
            jeVar5.f37669a = true;
            long j3 = tL_starsRevenueStatus.available_balance.amount;
            jeVar5.d = j3;
            double d = j3 / 1.0E9d;
            long j10 = (long) (meVar.f38586g1 * d * 100.0d);
            jeVar5.f37672e = j10;
            if (meVar.Z0 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                jeVar2 = jeVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                meVar.Z0 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i13 = 6;
                meVar.Z0.setMaximumFractionDigits(6);
                meVar.Z0.setGroupingUsed(false);
            } else {
                jeVar2 = jeVar3;
                i13 = 6;
            }
            DecimalFormat decimalFormat2 = meVar.Z0;
            if (d > 1.5d) {
                i13 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i13);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(K("TON " + meVar.Z0.format(d), p6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            p6Var2.setText(spannableStringBuilder);
            p6Var.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
            jeVar5.f37673f = "USD";
            jeVar4.f37669a = true;
            long j11 = tL_starsRevenueStatus.current_balance.amount;
            jeVar4.d = j11;
            meVar = this;
            double d10 = meVar.f38586g1;
            jeVar4.f37672e = (long) ((j11 / 1.0E9d) * d10 * 100.0d);
            jeVar4.f37673f = "USD";
            je jeVar6 = jeVar2;
            jeVar6.f37669a = true;
            long j12 = tL_starsRevenueStatus.overall_revenue.amount;
            jeVar6.d = j12;
            jeVar6.f37672e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            jeVar6.f37673f = "USD";
            meVar.f38595o1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            meVar.A0.setVisibility(i14);
        } else {
            double d11 = meVar.f38587h1;
            if (d11 != 0.0d) {
                jeVar5.f37674g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
                jeVar5.f37675i = starsAmount;
                jeVar5.f37676j = (long) (starsAmount.amount * d11 * 100.0d);
                int i15 = tL_starsRevenueStatus.next_withdrawal_at;
                ce ceVar = meVar.G0;
                if (p6Var2 == null || p6Var == null) {
                    jeVar = jeVar3;
                } else {
                    jeVar = jeVar3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(yh.z7.d1(false, TextUtils.concat("XTR ", yh.z7.P0(starsAmount, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    meVar.D0 = starsAmount;
                    meVar.E0.setText(spannableStringBuilder2);
                    meVar.F0.setText("≈" + BillingController.getInstance().formatCurrency((long) (meVar.f38587h1 * starsAmount.amount * 100.0d), "USD"));
                    if (starsAmount.amount > 0) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    meVar.K0.setVisibility(i12);
                    if (meVar.M0) {
                        meVar.L0 = true;
                        long j13 = starsAmount.amount;
                        meVar.N0 = j13;
                        String l4 = Long.toString(j13);
                        fi.o oVar = meVar.O0;
                        oVar.setText(l4);
                        oVar.setSelection(oVar.getText().length());
                        meVar.L0 = false;
                        if (meVar.N0 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        ceVar.setEnabled(z12);
                    }
                    ci.d dVar = meVar.J0;
                    if (dVar != null) {
                        if (starsAmount.amount > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        dVar.setEnabled(z11);
                    }
                    meVar.B0 = i15;
                    qd qdVar = meVar.f38585f1;
                    AndroidUtilities.cancelRunOnUIThread(qdVar);
                    qdVar.run();
                }
                jeVar5.f37673f = "USD";
                jeVar4.f37674g = true;
                TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus.current_balance;
                jeVar4.f37675i = starsAmount2;
                double d12 = meVar.f38587h1;
                jeVar4.f37676j = (long) (starsAmount2.amount * d12 * 100.0d);
                jeVar4.f37673f = "USD";
                je jeVar7 = jeVar;
                jeVar7.f37674g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.overall_revenue;
                jeVar7.f37675i = starsAmount3;
                jeVar7.f37676j = (long) (starsAmount3.amount * d12 * 100.0d);
                jeVar7.f37673f = "USD";
                meVar.f38595o1 = true;
                LinearLayout linearLayout = meVar.I0;
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
        org.telegram.ui.Components.e71 e71Var = meVar.X0;
        if (e71Var != null && (w61Var = e71Var.f26034f3) != null) {
            w61Var.N(true);
        }
    }

    public View getTransactionTabs() {
        return this.f38580a1.d;
    }

    @Override
    public final void onAttachedToWindow() {
        f38578t1 = this;
        super.onAttachedToWindow();
        E();
    }

    @Override
    public final void onDetachedFromWindow() {
        f38578t1 = null;
        super.onDetachedFromWindow();
        org.telegram.ui.ActionBar.k kVar = this.f38588i1;
        if (kVar != null) {
            kVar.setCastShadows(true);
        }
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.f38588i1 = kVar;
    }

    public void setTabsPinnedChangedListener(Runnable runnable) {
        this.S0 = runnable;
    }
}
