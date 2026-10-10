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
public final class ke extends org.telegram.ui.Components.tw0 implements r0.m {
    public static ke f39275x1;
    public static HashMap f39276y1;
    public TL_stories.TL_premium_boostsStatus A0;
    public int B0;
    public final CharSequence C0;
    public final CharSequence D0;
    public final CharSequence E0;
    public final CharSequence F0;
    public final yd G0;
    public final RelativeSizeSpan H0;
    public final org.telegram.ui.Components.r6 I0;
    public final org.telegram.ui.Components.r6 J0;
    public final ci.d K0;
    public int L0;
    public final yd M0;
    public TL_stars.StarsAmount N0;
    public final org.telegram.ui.Components.r6 O0;
    public final org.telegram.ui.Components.r6 P0;
    public final be Q0;
    public final org.telegram.ui.Components.er[] R0;
    public final LinearLayout S0;
    public final ci.d T0;
    public final zd U0;
    public boolean V0;
    public boolean W0;
    public long X0;
    public final fi.o Y0;
    public org.telegram.ui.Components.tc Z0;
    public final org.telegram.ui.Components.l71 f39277a1;
    public ah.n f39278b1;
    public final FrameLayout f39279c1;
    public DecimalFormat f39280d1;
    public final ge f39281e1;
    public final boolean f39282f1;
    public final boolean f39283g1;
    public SpannableStringBuilder f39284h1;
    public final nd f39285i1;
    public double f39286j1;
    public double f39287k1;
    public org.telegram.ui.ActionBar.k l1;
    public boolean f39288m1;
    public boolean f39289n1;
    public na1 f39290o1;
    public na1 f39291p1;
    public na1 f39292q1;
    public boolean f39293r1;
    public final he f39294s1;
    public final he f39295t1;
    public final he f39296u1;
    public final od f39297v1;
    public final bb1 f39298w0;
    public final b2.q0 f39299w1;
    public final org.telegram.ui.ActionBar.e6 f39300x0;
    public final int f39301y0;
    public final long f39302z0;

    public ke(Activity activity, bb1 bb1Var, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(activity, null);
        int i11;
        int i12;
        this.N0 = TL_stars.StarsAmount.ofStars(0L);
        this.R0 = new org.telegram.ui.Components.er[1];
        this.V0 = false;
        this.W0 = true;
        this.f39288m1 = false;
        this.f39289n1 = false;
        this.f39293r1 = false;
        String string = LocaleController.getString(R.string.MonetizationOverviewAvailable);
        he heVar = new he();
        heVar.f38337a = false;
        heVar.f38338b = "TON";
        heVar.h = "XTR";
        heVar.f38339c = string;
        this.f39294s1 = heVar;
        String string2 = LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal);
        he heVar2 = new he();
        heVar2.f38337a = false;
        heVar2.f38338b = "TON";
        heVar2.h = "XTR";
        heVar2.f38339c = string2;
        this.f39295t1 = heVar2;
        String string3 = LocaleController.getString(R.string.MonetizationOverviewTotal);
        he heVar3 = new he();
        heVar3.f38337a = false;
        heVar3.f38338b = "TON";
        heVar3.h = "XTR";
        heVar3.f38339c = string3;
        this.f39296u1 = heVar3;
        this.f39297v1 = new od(this, 3);
        this.f39299w1 = new Object();
        this.f39282f1 = z10;
        this.f39283g1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f39280d1 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.f39280d1.setMaximumFractionDigits(12);
        this.f39280d1.setGroupingUsed(false);
        this.f39298w0 = bb1Var;
        this.f39300x0 = e6Var;
        this.f39301y0 = i10;
        this.f39302z0 = j3;
        long j10 = -j3;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        if (chat != null) {
            this.B0 = chat.level;
        }
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j3, new t3(this, 2));
        c0(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.i6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
            if (chatFull != null) {
                boolean z12 = chatFull.restricted_sponsored;
                this.f39288m1 = z12;
                this.f39289n1 = z12;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new ud(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.C0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new r1(bb1Var, activity, e6Var, 13), e6Var), true);
        this.D0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled ? R.string.MonetizationBalanceInfo : R.string.MonetizationBalanceInfoNotAvailable), -1, 3, new od(this, 8)), true);
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
        this.E0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new nd(this, i12, 0), e6Var), true);
        this.F0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat2) ? R.string.MonetizationStarsInfo : R.string.MonetizationStarsInfoGroup), new od(this, 0)), true);
        int i13 = org.telegram.ui.ActionBar.i6.f20745a7;
        setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
        this.f39281e1 = new ge(this, activity, i10, j3, bb1Var.getClassGuid(), new od(this, 1), e6Var);
        yd ydVar = new yd(activity, 0);
        this.G0 = ydVar;
        ydVar.setOrientation(1);
        int i14 = org.telegram.ui.ActionBar.i6.f20801d6;
        ydVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i14, e6Var));
        ydVar.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(activity, false, true, true);
        this.I0 = r6Var;
        r6Var.setTypeface(AndroidUtilities.bold());
        int i15 = org.telegram.ui.ActionBar.i6.G6;
        r6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i15, e6Var));
        r6Var.setTextSize(AndroidUtilities.dp(32.0f));
        r6Var.setGravity(17);
        this.H0 = new RelativeSizeSpan(0.6770833f);
        ydVar.addView(r6Var, w7.x5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(activity, true, true, true);
        this.J0 = r6Var2;
        r6Var2.setGravity(17);
        int i16 = org.telegram.ui.ActionBar.i6.f21185y6;
        r6Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i16, e6Var));
        r6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        ydVar.addView(r6Var2, w7.x5.a(17.0f, 22.0f, 4.0f, 22.0f, 0.0f, -1, 49));
        ci.d dVar = new ci.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        this.K0 = dVar;
        dVar.setEnabled(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled);
        dVar.g(LocaleController.getString(R.string.MonetizationWithdraw), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new ai.f2(28, this, bb1Var));
        ydVar.addView(dVar, w7.x5.a(48.0f, 18.0f, 13.0f, 18.0f, 0.0f, -1, 55));
        yd ydVar2 = new yd(activity, 1);
        this.M0 = ydVar2;
        ydVar2.setOrientation(1);
        ydVar2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i14, e6Var));
        ydVar2.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.r6 r6Var3 = new org.telegram.ui.Components.r6(activity, false, true, true);
        this.O0 = r6Var3;
        r6Var3.setTypeface(AndroidUtilities.bold());
        r6Var3.setTextColor(org.telegram.ui.ActionBar.i6.w0(i15, e6Var));
        r6Var3.setTextSize(AndroidUtilities.dp(32.0f));
        r6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        ydVar2.addView(r6Var3, w7.x5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.r6 r6Var4 = new org.telegram.ui.Components.r6(activity, true, true, true);
        this.P0 = r6Var4;
        r6Var4.setGravity(17);
        r6Var4.setTextColor(org.telegram.ui.ActionBar.i6.w0(i16, e6Var));
        r6Var4.setTextSize(AndroidUtilities.dp(14.0f));
        ydVar2.addView(r6Var4, w7.x5.a(17.0f, 22.0f, 4.0f, 22.0f, 0.0f, -1, 49));
        zd zdVar = new zd(this, activity, 0);
        this.U0 = zdVar;
        zdVar.setVisibility(8);
        zdVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        zdVar.setLeftPadding(AndroidUtilities.dp(36.0f));
        fi.o oVar = new fi.o(activity, 1);
        this.Y0 = oVar;
        oVar.setFocusable(false);
        oVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(i15, e6Var));
        oVar.setCursorSize(AndroidUtilities.dp(20.0f));
        oVar.setCursorWidth(1.5f);
        oVar.setBackground(null);
        oVar.setTextSize(1, 18.0f);
        oVar.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        oVar.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        oVar.setInputType(2);
        oVar.setTypeface(Typeface.DEFAULT);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21123uf, e6Var));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21140vf, e6Var));
        oVar.setGravity(LocaleController.isRTL ? 5 : 3);
        oVar.setOnFocusChangeListener(new pd(this, 0));
        oVar.addTextChangedListener(new ae(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.x5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(oVar, w7.x5.o(-1, -2, 1.0f, 119));
        zdVar.e(oVar);
        zdVar.addView(linearLayout, w7.x5.e(-1, -2, 48));
        ydVar2.addView(zdVar, w7.x5.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.S0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? dVar2 = new ci.d(activity, e6Var, true);
        dVar2.setRoundRadius(24);
        this.Q0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.g(LocaleController.formatPluralString("MonetizationStarsWithdraw", 0, new Object[0]), false, true);
        dVar2.setVisibility(0);
        dVar2.setOnClickListener(new org.telegram.ui.Cells.sa(this, i10, bb1Var, 2));
        ci.d dVar3 = new ci.d(activity, e6Var, true);
        dVar3.setRoundRadius(24);
        this.T0 = dVar3;
        dVar3.setEnabled(false);
        dVar3.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        dVar3.setOnClickListener(new qd(this, i10, j3, activity));
        linearLayout2.addView((View) dVar2, w7.x5.o(-1, 48, 1.0f, 119));
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            linearLayout2.addView(new Space(activity), w7.x5.o(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar3, w7.x5.o(-1, 48, 1.0f, 119));
        }
        ydVar2.addView(linearLayout2, w7.x5.a(48.0f, 18.0f, 13.0f, 18.0f, 0.0f, -1, 55));
        oVar.setOnEditorActionListener(new wd(0, this, bb1Var));
        this.f39285i1 = new nd(this, i10, 2);
        org.telegram.ui.Components.l71 l71Var = new org.telegram.ui.Components.l71(bb1Var, new b5(this, 2), new xd(this), new xd(this));
        this.f39277a1 = l71Var;
        l71Var.setClipToPadding(false);
        l71Var.p1();
        addView(l71Var);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f39279c1 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
        frameLayout.addView(linearLayout3, w7.x5.e(-2, -2, 17));
        ?? imageView2 = new ImageView(activity);
        imageView2.setAutoRepeat(true);
        imageView2.f(R.raw.statistic_preload, 120, 120, null);
        imageView2.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i17 = org.telegram.ui.ActionBar.i6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i17, false));
        textView.setTag(Integer.valueOf(i17));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i18 = org.telegram.ui.ActionBar.i6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i18, false));
        textView2.setTag(Integer.valueOf(i18));
        org.telegram.messenger.bi.m(R.string.LoadingStatsDescription, textView2, 1);
        linearLayout3.addView((View) imageView2, w7.x5.t(120, 120, 1, 0, 0, 0, 20));
        linearLayout3.addView(textView, w7.x5.t(-2, -2, 1, 0, 0, 0, 10));
        linearLayout3.addView(textView2, w7.x5.q(-2, -2, 1));
        addView(frameLayout, w7.x5.e(-1, -1, 119));
    }

    public static org.telegram.ui.ActionBar.f3 d0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.f3 i19 = org.telegram.messenger.bi.i(1, context, e6Var, false);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        e7.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_monetize);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
        e7.addView(imageView, w7.x5.t(80, 80, 1, 0, 16, 0, 16));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        int i20 = org.telegram.ui.ActionBar.i6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i20, e6Var));
        if (z10) {
            i10 = R.string.BotMonetizationInfoTitle;
        } else {
            i10 = R.string.MonetizationInfoTitle;
        }
        textView.setText(LocaleController.getString(i10));
        e7.addView(textView, w7.x5.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
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
        e7.addView(new ai.x5(context, i21, string, LocaleController.getString(i12), e6Var), w7.x5.t(-1, -2, 49, 8, 0, 8, 16));
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
        e7.addView(new ai.x5(context, i22, string2, LocaleController.getString(i14), e6Var), w7.x5.t(-1, -2, 49, 8, 0, 8, 16));
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
        e7.addView(new ai.x5(context, i23, string3, LocaleController.getString(i16), e6Var), w7.x5.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20802d7, e6Var));
        e7.addView(view, w7.x5.s(-1, 55, 12, 0, 12, 1.0f / AndroidUtilities.density, 0));
        org.telegram.ui.Components.a6 a6Var = new org.telegram.ui.Components.a6(context);
        a6Var.setGravity(17);
        a6Var.setTextSize(1, 20.0f);
        a6Var.setTypeface(AndroidUtilities.bold());
        a6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i20, e6Var));
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(R.drawable.mini_gram_72, 0);
        erVar.recolorDrawable = false;
        erVar.setScale(0.9f, 0.9f);
        erVar.setRelativeSize(a6Var.getPaint().getFontMetricsInt());
        erVar.spaceScaleX = 0.9f;
        spannableString.setSpan(erVar, 0, spannableString.length(), 33);
        if (z10) {
            i17 = R.string.BotMonetizationInfoTONTitle;
        } else {
            i17 = R.string.MonetizationInfoTONTitle;
        }
        a6Var.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(i17), spannableString));
        e7.addView(a6Var, w7.x5.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.fa0 fa0Var = new org.telegram.ui.Components.fa0(context, e6Var);
        fa0Var.setGravity(17);
        fa0Var.setTextSize(1, 14.0f);
        fa0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i20, e6Var));
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        if (z10) {
            i18 = R.string.BotMonetizationInfoTONText;
        } else {
            i18 = R.string.MonetizationInfoTONText;
        }
        fa0Var.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(i18)), new bi.f(20, context, z10)));
        e7.addView(fa0Var, w7.x5.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        ci.d f7 = org.telegram.messenger.bi.f(24, context, e6Var, true);
        f7.g(LocaleController.getString(R.string.GotIt), false, true);
        f7.setOnClickListener(new rd(i19, 1));
        e7.addView(f7, w7.x5.t(-1, 48, 55, 10, 25, 10, 14));
        i19.setCustomView(e7);
        return i19;
    }

    public static CharSequence f0(CharSequence charSequence, TextPaint textPaint, float f7, float f10, boolean z10) {
        int i10;
        if (f39276y1 == null) {
            f39276y1 = new HashMap();
        }
        int i11 = textPaint.getFontMetricsInt().bottom;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = ((i11 * i10) * ((int) (f7 * 100.0f))) - ((int) (100.0f * f10));
        SpannableString spannableString = (SpannableString) f39276y1.get(Integer.valueOf(i12));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(R.drawable.mini_gram_72, 0);
                erVar.recolorDrawable = false;
                erVar.setScale(f7, f7);
                erVar.setColorKey(org.telegram.ui.ActionBar.i6.f21004o6);
                erVar.setRelativeSize(textPaint.getFontMetricsInt());
                erVar.spaceScaleX = 0.9f;
                spannableString.setSpan(erVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.er erVar2 = new org.telegram.ui.Components.er(R.drawable.mini_gram_16, 0);
                erVar2.recolorDrawable = false;
                erVar2.setScale(f7, f7);
                erVar2.setTranslateY(f10);
                erVar2.spaceScaleX = 0.95f;
                spannableString.setSpan(erVar2, 0, spannableString.length(), 33);
            }
            f39276y1.put(Integer.valueOf(i12), spannableString);
        }
        return AndroidUtilities.replaceMultipleCharSequence("TON", charSequence, spannableString);
    }

    public static void h0(Context context, int i10, TL_stats.BroadcastRevenueTransaction broadcastRevenueTransaction, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
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
        org.telegram.ui.ActionBar.f3 i12 = org.telegram.messenger.bi.i(1, context, e6Var, false);
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        boolean z12 = broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionWithdrawal;
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            String string2 = LocaleController.getString(R.string.MonetizationTransactionDetailWithdraw);
            j10 = 0;
            j11 = tL_broadcastRevenueTransactionWithdrawal.amount;
            z10 = tL_broadcastRevenueTransactionWithdrawal.pending;
            j12 = tL_broadcastRevenueTransactionWithdrawal.date;
            c10 = 65535;
            f3Var = i12;
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
        org.telegram.messenger.bi.k(18.0f, 1, textView);
        if (c10 < 0) {
            i11 = org.telegram.ui.ActionBar.i6.f21041q7;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.f20949l8;
        }
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
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
        e7.addView(textView, w7.x5.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21185y6, e6Var));
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
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21041q7, e6Var));
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        e7.addView(textView2, w7.x5.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.bi.k(14.0f, 1, textView3);
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        textView3.setText(str);
        e7.addView(textView3, w7.x5.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.i6.d0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20794ci, e6Var)));
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
            org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
            j9Var.p(chat);
            y9Var.e(chat, j9Var);
            frameLayout.addView(y9Var, w7.x5.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            textView4.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20909j5, e6Var));
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, w7.x5.a(-2.0f, 37.0f, 0.0f, 10.0f, 0.0f, -2, 19));
            e7.addView(frameLayout, w7.x5.t(-2, 28, 1, 42, 10, 42, 0));
        }
        ci.d f7 = org.telegram.messenger.bi.f(24, context, e6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                f7.g(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false, true);
                f7.setOnClickListener(new ai.f2(context, tL_broadcastRevenueTransactionWithdrawal2));
                f3Var2 = f3Var;
                e7.addView(f7, w7.x5.t(-1, 48, 55, 18, 30, 18, 14));
                f3Var2.setCustomView(e7);
                f3Var2.show();
            }
        }
        f7.g(LocaleController.getString(R.string.OK), false, true);
        f3Var2 = f3Var;
        f7.setOnClickListener(new rd(f3Var2, 0));
        e7.addView(f7, w7.x5.t(-1, 48, 55, 18, 30, 18, 14));
        f3Var2.setCustomView(e7);
        f3Var2.show();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        int max;
        boolean z10;
        org.telegram.ui.Components.l71 l71Var = this.f39277a1;
        if (viewGroup == l71Var) {
            ge geVar = this.f39281e1;
            if (geVar.isAttachedToWindow()) {
                ((View) geVar.getParent()).getTop();
                int i13 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
                org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int bottom = ((View) geVar.getParent()).getBottom();
                if (i11 < 0) {
                    org.telegram.ui.ActionBar.k kVar = this.l1;
                    if (kVar != null) {
                        if (isAttachedToWindow() && l71Var.getHeight() - bottom >= 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        kVar.setCastShadows(z10);
                    }
                    if (l71Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + l71Var.getPaddingBottom()) {
                        org.telegram.ui.Components.rm0 currentListView = geVar.getCurrentListView();
                        int L0 = ((s4.d0) currentListView.getLayoutManager()).L0();
                        int i14 = -1;
                        if (L0 != -1) {
                            s4.d1 K = currentListView.K(L0);
                            if (K != null) {
                                i14 = K.f47702a.getTop();
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
                    org.telegram.ui.Components.rm0 currentListView2 = geVar.getCurrentListView();
                    if (l71Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + l71Var.getPaddingBottom() && currentListView2 != null && !currentListView2.canScrollVertically(1)) {
                        iArr[1] = i11;
                        l71Var.B0();
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
        if (this.f39292q1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39287k1 = tL_payments_starsRevenueStats.usd_rate;
        na1 f02 = bb1.f0(tL_payments_starsRevenueStats.revenue_graph, LocaleController.getString(R.string.MonetizationGraphStarsRevenue), 2, false);
        this.f39292q1 = f02;
        if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f39292q1.d.d.get(0) != null) {
            ((jg.a) this.f39292q1.d.d.get(0)).f14156g = org.telegram.ui.ActionBar.i6.kj;
            this.f39292q1.d.h = (float) ((1.0d / this.f39287k1) / 100.0d);
        }
        g0(false, tL_payments_starsRevenueStats.status);
        if (!this.f39282f1 && (frameLayout = this.f39279c1) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.is.h).withEndAction(new od(this, 7)).start();
        }
        org.telegram.ui.Components.l71 l71Var = this.f39277a1;
        if (l71Var != null) {
            l71Var.W2.N(!z10);
            if (z10) {
                l71Var.u0(0);
            }
        }
    }

    public final void a0() {
        if (isAttachedToWindow() && this.f39282f1 && this.f39293r1 && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            this.f39298w0.showDialog(d0(getContext(), this.f39300x0, false));
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void b0(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        bb1 bb1Var = this.f39298w0;
        if (bb1Var != null) {
            Activity parentActivity = bb1Var.getParentActivity();
            int i10 = this.f39301y0;
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            if (parentActivity != null && currentUser != null) {
                long j3 = this.f39302z0;
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
        if (!this.f39283g1) {
            return;
        }
        int i10 = this.f39301y0;
        yh.o g10 = yh.o.g(i10);
        long j3 = this.f39302z0;
        TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, z10);
        if (h != null) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(26, this, h));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.i6.I.q();
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new ud(this, 2));
    }

    public final void e0() {
        ge geVar = this.f39281e1;
        od odVar = geVar.f38032e;
        boolean[] zArr = geVar.f38036s;
        boolean a2 = geVar.a();
        for (int i10 = 0; i10 < 2; i10++) {
            if (!zArr[i10]) {
                if (i10 == 1) {
                    geVar.h.clear();
                    geVar.f38033f = "";
                } else {
                    geVar.f38034n.clear();
                    geVar.f38035r = "";
                }
                zArr[i10] = false;
                geVar.c(i10);
            } else {
                return;
            }
        }
        if (geVar.a() != a2 && odVar != null) {
            geVar.e();
            odVar.run();
        }
    }

    public final void g0(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        he heVar;
        int i10;
        TL_stars.StarsAmount starsAmount;
        TL_stars.StarsAmount starsAmount2;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.d71 d71Var;
        long j3;
        he heVar2;
        int i14;
        int i15;
        ke keVar = this;
        he heVar3 = keVar.f39296u1;
        he heVar4 = keVar.f39295t1;
        org.telegram.ui.Components.r6 r6Var = keVar.J0;
        RelativeSizeSpan relativeSizeSpan = keVar.H0;
        org.telegram.ui.Components.r6 r6Var2 = keVar.I0;
        he heVar5 = keVar.f39294s1;
        if (z10) {
            heVar5.f38337a = true;
            long j10 = tL_starsRevenueStatus.available_balance.amount;
            heVar5.d = j10;
            double d = j10 / 1.0E9d;
            heVar5.f38340e = (long) (keVar.f39286j1 * d * 100.0d);
            if (keVar.f39280d1 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                heVar2 = heVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                keVar.f39280d1 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i14 = 6;
                keVar.f39280d1.setMaximumFractionDigits(6);
                keVar.f39280d1.setGroupingUsed(false);
            } else {
                heVar2 = heVar3;
                i14 = 6;
            }
            DecimalFormat decimalFormat2 = keVar.f39280d1;
            if (d > 1.5d) {
                i14 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i14);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f0("TON " + keVar.f39280d1.format(d), r6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            r6Var2.setText(spannableStringBuilder);
            r6Var.setText("≈" + BillingController.getInstance().formatCurrency(j3, "USD"));
            heVar5.f38341f = "USD";
            heVar4.f38337a = true;
            long j11 = tL_starsRevenueStatus.current_balance.amount;
            heVar4.d = j11;
            keVar = this;
            double d10 = keVar.f39286j1;
            heVar4.f38340e = (long) ((j11 / 1.0E9d) * d10 * 100.0d);
            heVar4.f38341f = "USD";
            he heVar6 = heVar2;
            heVar6.f38337a = true;
            long j12 = tL_starsRevenueStatus.overall_revenue.amount;
            heVar6.d = j12;
            heVar6.f38340e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            heVar6.f38341f = "USD";
            keVar.f39293r1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            keVar.K0.setVisibility(i15);
        } else {
            double d11 = keVar.f39287k1;
            if (d11 != 0.0d) {
                heVar5.f38342g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.available_balance;
                heVar5.f38343i = starsAmount3;
                heVar5.f38344j = (long) (starsAmount3.amount * d11 * 100.0d);
                int i16 = tL_starsRevenueStatus.next_withdrawal_at;
                be beVar = keVar.Q0;
                if (r6Var2 == null || r6Var == null) {
                    heVar = heVar3;
                    i10 = 0;
                } else {
                    heVar = heVar3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(yh.p7.Y0(false, TextUtils.concat("XTR ", yh.p7.K0(starsAmount3, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    keVar.N0 = starsAmount3;
                    keVar.O0.setText(spannableStringBuilder2);
                    keVar.P0.setText("≈" + BillingController.getInstance().formatCurrency((long) (keVar.f39287k1 * starsAmount3.amount * 100.0d), "USD"));
                    if (starsAmount3.amount > 0) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    keVar.U0.setVisibility(i13);
                    if (keVar.W0) {
                        keVar.V0 = true;
                        long j13 = starsAmount3.amount;
                        keVar.X0 = j13;
                        String l4 = Long.toString(j13);
                        fi.o oVar = keVar.Y0;
                        oVar.setText(l4);
                        oVar.setSelection(oVar.getText().length());
                        i10 = 0;
                        keVar.V0 = false;
                        if (keVar.X0 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        beVar.setEnabled(z12);
                    } else {
                        i10 = 0;
                    }
                    ci.d dVar = keVar.T0;
                    if (dVar != null) {
                        if (starsAmount3.amount > 0) {
                            z11 = 1;
                        } else {
                            z11 = i10;
                        }
                        dVar.setEnabled(z11);
                    }
                    keVar.L0 = i16;
                    nd ndVar = keVar.f39285i1;
                    AndroidUtilities.cancelRunOnUIThread(ndVar);
                    ndVar.run();
                }
                heVar5.f38341f = "USD";
                heVar4.f38342g = true;
                heVar4.f38343i = tL_starsRevenueStatus.current_balance;
                double d12 = keVar.f39287k1;
                heVar4.f38344j = (long) (starsAmount.amount * d12 * 100.0d);
                heVar4.f38341f = "USD";
                he heVar7 = heVar;
                heVar7.f38342g = true;
                heVar7.f38343i = tL_starsRevenueStatus.overall_revenue;
                heVar7.f38344j = (long) (starsAmount2.amount * d12 * 100.0d);
                heVar7.f38341f = "USD";
                keVar.f39293r1 = true;
                LinearLayout linearLayout = keVar.S0;
                if (linearLayout != null) {
                    if (tL_starsRevenueStatus.withdrawal_enabled) {
                        i12 = i10;
                    } else {
                        i12 = 8;
                    }
                    linearLayout.setVisibility(i12);
                }
                if (beVar != null) {
                    if (tL_starsRevenueStatus.available_balance.amount <= 0 && !BuildVars.DEBUG_PRIVATE_VERSION) {
                        i11 = 8;
                    } else {
                        i11 = i10;
                    }
                    beVar.setVisibility(i11);
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Components.l71 l71Var = keVar.f39277a1;
        if (l71Var != null && (d71Var = l71Var.W2) != null) {
            d71Var.N(true);
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        boolean z10;
        ge geVar = this.f39281e1;
        org.telegram.ui.Components.l71 l71Var = this.f39277a1;
        if (viewGroup == l71Var) {
            try {
                if (geVar.isAttachedToWindow()) {
                    org.telegram.ui.Components.rm0 currentListView = geVar.getCurrentListView();
                    int bottom = ((View) geVar.getParent()).getBottom();
                    org.telegram.ui.ActionBar.k kVar = this.l1;
                    if (kVar != null) {
                        if (isAttachedToWindow() && l71Var.getHeight() - bottom >= 0) {
                            z10 = false;
                            kVar.setCastShadows(z10);
                        }
                        z10 = true;
                        kVar.setCastShadows(z10);
                    }
                    if (l71Var.getHeight() - bottom >= l71Var.getPaddingBottom() + AndroidUtilities.dp(8.0f)) {
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
    public final void o(int i10, View view) {
        this.f39299w1.f3533a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        f39275x1 = this;
        super.onAttachedToWindow();
        a0();
    }

    @Override
    public final void onDetachedFromWindow() {
        f39275x1 = null;
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
        this.f39299w1.f3533a = i10;
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
