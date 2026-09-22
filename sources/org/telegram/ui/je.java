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
public final class je extends org.telegram.ui.Components.pv0 implements r0.m {
    public static je f34868x1;
    public static HashMap f34869y1;
    public TL_stories.TL_premium_boostsStatus A0;
    public int B0;
    public final CharSequence C0;
    public final CharSequence D0;
    public final CharSequence E0;
    public final CharSequence F0;
    public final xd G0;
    public final RelativeSizeSpan H0;
    public final org.telegram.ui.Components.n6 I0;
    public final org.telegram.ui.Components.n6 J0;
    public final ci.d K0;
    public int L0;
    public final xd M0;
    public TL_stars.StarsAmount N0;
    public final org.telegram.ui.Components.n6 O0;
    public final org.telegram.ui.Components.n6 P0;
    public final ae Q0;
    public final org.telegram.ui.Components.oq[] R0;
    public final LinearLayout S0;
    public final ci.d T0;
    public final yd U0;
    public boolean V0;
    public boolean W0;
    public long X0;
    public final fi.o Y0;
    public org.telegram.ui.Components.oc Z0;
    public final org.telegram.ui.Components.e61 f34870a1;
    public ah.n f34871b1;
    public final FrameLayout f34872c1;
    public DecimalFormat f34873d1;
    public final fe f34874e1;
    public final boolean f34875f1;
    public final boolean f34876g1;
    public SpannableStringBuilder f34877h1;
    public final md f34878i1;
    public double f34879j1;
    public double f34880k1;
    public org.telegram.ui.ActionBar.k l1;
    public boolean f34881m1;
    public boolean f34882n1;
    public la1 f34883o1;
    public la1 f34884p1;
    public la1 f34885q1;
    public boolean f34886r1;
    public final ge f34887s1;
    public final ge f34888t1;
    public final ge f34889u1;
    public final nd f34890v1;
    public final za1 f34891w0;
    public final b2.q0 f34892w1;
    public final org.telegram.ui.ActionBar.e6 f34893x0;
    public final int f34894y0;
    public final long f34895z0;

    public je(Activity activity, za1 za1Var, int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(activity, null);
        int i11;
        int i12;
        this.N0 = TL_stars.StarsAmount.ofStars(0L);
        this.R0 = new org.telegram.ui.Components.oq[1];
        this.V0 = false;
        this.W0 = true;
        this.f34881m1 = false;
        this.f34882n1 = false;
        this.f34886r1 = false;
        String string = LocaleController.getString(R.string.MonetizationOverviewAvailable);
        ge geVar = new ge();
        geVar.f33820a = false;
        geVar.f33821b = "TON";
        geVar.h = "XTR";
        geVar.f33822c = string;
        this.f34887s1 = geVar;
        String string2 = LocaleController.getString(R.string.MonetizationOverviewLastWithdrawal);
        ge geVar2 = new ge();
        geVar2.f33820a = false;
        geVar2.f33821b = "TON";
        geVar2.h = "XTR";
        geVar2.f33822c = string2;
        this.f34888t1 = geVar2;
        String string3 = LocaleController.getString(R.string.MonetizationOverviewTotal);
        ge geVar3 = new ge();
        geVar3.f33820a = false;
        geVar3.f33821b = "TON";
        geVar3.h = "XTR";
        geVar3.f33822c = string3;
        this.f34889u1 = geVar3;
        this.f34890v1 = new nd(this, 3);
        this.f34892w1 = new Object();
        this.f34875f1 = z10;
        this.f34876g1 = z11;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f34873d1 = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        this.f34873d1.setMaximumFractionDigits(12);
        this.f34873d1.setGroupingUsed(false);
        this.f34891w0 = za1Var;
        this.f34893x0 = e6Var;
        this.f34894y0 = i10;
        this.f34895z0 = j3;
        long j10 = -j3;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        if (chat != null) {
            this.B0 = chat.level;
        }
        MessagesController.getInstance(i10).getBoostsController().getBoostsStats(j3, new xb(this, 1));
        c0(false);
        if (z10) {
            TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
            tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.i6.I.q();
            tL_payments_getStarsRevenueStats.ton = true;
            tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(j10);
            if (chatFull != null) {
                boolean z12 = chatFull.restricted_sponsored;
                this.f34881m1 = z12;
                this.f34882n1 = z12;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new td(this, 1), null, null, 0, Integer.MAX_VALUE, 1, true);
        }
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.C0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.MonetizationInfo, 50), -1, 3, new q1(za1Var, activity, e6Var, 13), e6Var), true);
        this.D0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled ? R.string.MonetizationBalanceInfo : R.string.MonetizationBalanceInfoNotAvailable), -1, 3, new nd(this, 8)), true);
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
        this.E0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i11), -1, 3, new md(this, i12, 0), e6Var), true);
        this.F0 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat2) ? R.string.MonetizationStarsInfo : R.string.MonetizationStarsInfoGroup), new nd(this, 0)), true);
        int i13 = org.telegram.ui.ActionBar.i6.f18778a7;
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i13, e6Var));
        this.f34874e1 = new fe(this, activity, i10, j3, za1Var.getClassGuid(), new nd(this, 1), e6Var);
        xd xdVar = new xd(activity, 0);
        this.G0 = xdVar;
        xdVar.setOrientation(1);
        int i14 = org.telegram.ui.ActionBar.i6.f18834d6;
        xdVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i14, e6Var));
        xdVar.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(activity, false, true, true);
        this.I0 = n6Var;
        n6Var.setTypeface(AndroidUtilities.bold());
        int i15 = org.telegram.ui.ActionBar.i6.G6;
        n6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i15, e6Var));
        n6Var.setTextSize(AndroidUtilities.dp(32.0f));
        n6Var.setGravity(17);
        this.H0 = new RelativeSizeSpan(0.6770833f);
        xdVar.addView(n6Var, w7.x5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(activity, true, true, true);
        this.J0 = n6Var2;
        n6Var2.setGravity(17);
        int i16 = org.telegram.ui.ActionBar.i6.f19215y6;
        n6Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i16, e6Var));
        n6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        xdVar.addView(n6Var2, w7.x5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        ci.d dVar = new ci.d(activity, e6Var, true);
        dVar.setRoundRadius(24);
        this.K0 = dVar;
        dVar.setEnabled(MessagesController.getInstance(i10).channelRevenueWithdrawalEnabled);
        dVar.g(LocaleController.getString(R.string.MonetizationWithdraw), false, true);
        dVar.setVisibility(8);
        dVar.setOnClickListener(new ai.f2(28, this, za1Var));
        xdVar.addView(dVar, w7.x5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        xd xdVar2 = new xd(activity, 1);
        this.M0 = xdVar2;
        xdVar2.setOrientation(1);
        xdVar2.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i14, e6Var));
        xdVar2.setPadding(0, 0, 0, AndroidUtilities.dp(17.0f));
        org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(activity, false, true, true);
        this.O0 = n6Var3;
        n6Var3.setTypeface(AndroidUtilities.bold());
        n6Var3.setTextColor(org.telegram.ui.ActionBar.i6.v0(i15, e6Var));
        n6Var3.setTextSize(AndroidUtilities.dp(32.0f));
        n6Var3.setGravity(17);
        new RelativeSizeSpan(0.6770833f);
        xdVar2.addView(n6Var3, w7.x5.t(-1, 38, 49, 22, 15, 22, 0));
        org.telegram.ui.Components.n6 n6Var4 = new org.telegram.ui.Components.n6(activity, true, true, true);
        this.P0 = n6Var4;
        n6Var4.setGravity(17);
        n6Var4.setTextColor(org.telegram.ui.ActionBar.i6.v0(i16, e6Var));
        n6Var4.setTextSize(AndroidUtilities.dp(14.0f));
        xdVar2.addView(n6Var4, w7.x5.d(-1, 17.0f, 49, 22.0f, 4.0f, 22.0f, 0.0f));
        yd ydVar = new yd(this, activity, 0);
        this.U0 = ydVar;
        ydVar.setVisibility(8);
        ydVar.setText(LocaleController.getString(R.string.BotStarsWithdrawPlaceholder));
        ydVar.setLeftPadding(AndroidUtilities.dp(36.0f));
        fi.o oVar = new fi.o(activity, 1);
        this.Y0 = oVar;
        oVar.setFocusable(false);
        oVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i15, e6Var));
        oVar.setCursorSize(AndroidUtilities.dp(20.0f));
        oVar.setCursorWidth(1.5f);
        oVar.setBackground(null);
        oVar.setTextSize(1, 18.0f);
        oVar.setMaxLines(1);
        int dp = AndroidUtilities.dp(16.0f);
        oVar.setPadding(AndroidUtilities.dp(6.0f), dp, dp, dp);
        oVar.setInputType(2);
        oVar.setTypeface(Typeface.DEFAULT);
        oVar.setHighlightColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19154uf, e6Var));
        oVar.setHandlesColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19171vf, e6Var));
        oVar.setGravity(LocaleController.isRTL ? 5 : 3);
        oVar.setOnFocusChangeListener(new od(this, 0));
        oVar.addTextChangedListener(new zd(this));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.star_small_inner);
        linearLayout.addView(imageView, w7.x5.p(-2, -2, 0.0f, 19, 14, 0, 0, 0));
        linearLayout.addView(oVar, w7.x5.o(-1, -2, 1.0f, 119));
        ydVar.e(oVar);
        ydVar.addView(linearLayout, w7.x5.e(-1, -2, 48));
        xdVar2.addView(ydVar, w7.x5.t(-1, -2, 1, 18, 14, 18, 2));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        this.S0 = linearLayout2;
        linearLayout2.setOrientation(0);
        ?? dVar2 = new ci.d(activity, e6Var, true);
        dVar2.setRoundRadius(24);
        this.Q0 = dVar2;
        dVar2.setEnabled(false);
        dVar2.g(LocaleController.formatPluralString("MonetizationStarsWithdraw", 0, new Object[0]), false, true);
        dVar2.setVisibility(0);
        dVar2.setOnClickListener(new org.telegram.ui.Cells.va(this, i10, za1Var, 2));
        ci.d dVar3 = new ci.d(activity, e6Var, true);
        dVar3.setRoundRadius(24);
        this.T0 = dVar3;
        dVar3.setEnabled(false);
        dVar3.g(LocaleController.getString(R.string.MonetizationStarsAds), false, true);
        dVar3.setOnClickListener(new pd(this, i10, j3, activity));
        linearLayout2.addView((View) dVar2, w7.x5.o(-1, 48, 1.0f, 119));
        if (ChatObject.isChannelAndNotMegaGroup(chat2)) {
            linearLayout2.addView(new Space(activity), w7.x5.o(8, 48, 0.0f, 119));
            linearLayout2.addView(dVar3, w7.x5.o(-1, 48, 1.0f, 119));
        }
        xdVar2.addView(linearLayout2, w7.x5.d(-1, 48.0f, 55, 18.0f, 13.0f, 18.0f, 0.0f));
        oVar.setOnEditorActionListener(new vd(0, this, za1Var));
        this.f34878i1 = new md(this, i10, 2);
        org.telegram.ui.Components.e61 e61Var = new org.telegram.ui.Components.e61(za1Var, new b5(this, 2), new wd(this), new wd(this));
        this.f34870a1 = e61Var;
        e61Var.setClipToPadding(false);
        e61Var.p1();
        addView(e61Var);
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f34872c1 = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i13, e6Var));
        frameLayout.addView(linearLayout3, w7.x5.e(-2, -2, 17));
        ?? imageView2 = new ImageView(activity);
        imageView2.setAutoRepeat(true);
        imageView2.f(R.raw.statistic_preload, 120, 120, null);
        imageView2.d();
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i17 = org.telegram.ui.ActionBar.i6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
        textView.setTag(Integer.valueOf(i17));
        textView.setText(LocaleController.getString("LoadingStats", R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 15.0f);
        int i18 = org.telegram.ui.ActionBar.i6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i18, false));
        textView2.setTag(Integer.valueOf(i18));
        org.telegram.messenger.vl.l(R.string.LoadingStatsDescription, textView2, 1);
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
        org.telegram.ui.ActionBar.f3 j3 = org.telegram.messenger.vl.j(1, context, e6Var, false);
        LinearLayout f7 = org.telegram.messenger.vl.f(context, 1);
        f7.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_monetize);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var)));
        f7.addView(imageView, w7.x5.t(80, 80, 1, 0, 16, 0, 16));
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
        f7.addView(textView, w7.x5.k(8.0f, 0.0f, 8.0f, 25.0f, -1, -2));
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
        f7.addView(new ai.x5(context, i20, string, LocaleController.getString(i12), e6Var), w7.x5.t(-1, -2, 49, 8, 0, 8, 16));
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
        f7.addView(new ai.x5(context, i21, string2, LocaleController.getString(i14), e6Var), w7.x5.t(-1, -2, 49, 8, 0, 8, 16));
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
        f7.addView(new ai.x5(context, i22, string3, LocaleController.getString(i16), e6Var), w7.x5.t(-1, -2, 49, 8, 0, 8, 16));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18835d7, e6Var));
        f7.addView(view, w7.x5.s(-1, 55, 12, 0, 12, 1.0f / AndroidUtilities.density, 0));
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(context);
        w5Var.setGravity(17);
        w5Var.setTextSize(1, 20.0f);
        w5Var.setTypeface(AndroidUtilities.bold());
        w5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i19, e6Var));
        SpannableString spannableString = new SpannableString("💎");
        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.mini_gram_72, 0);
        oqVar.setScale(0.9f, 0.9f);
        oqVar.setColorKey(org.telegram.ui.ActionBar.i6.f19035o6);
        oqVar.setRelativeSize(w5Var.getPaint().getFontMetricsInt());
        oqVar.spaceScaleX = 0.9f;
        spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
        if (z10) {
            i17 = R.string.BotMonetizationInfoTONTitle;
        } else {
            i17 = R.string.MonetizationInfoTONTitle;
        }
        w5Var.setText(AndroidUtilities.replaceCharSequence("💎", LocaleController.getString(i17), spannableString));
        f7.addView(w5Var, w7.x5.k(8.0f, 20.0f, 8.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90(context, e6Var);
        c90Var.setGravity(17);
        c90Var.setTextSize(1, 14.0f);
        c90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i19, e6Var));
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        if (z10) {
            i18 = R.string.BotMonetizationInfoTONText;
        } else {
            i18 = R.string.MonetizationInfoTONText;
        }
        c90Var.setText(AndroidUtilities.withLearnMore(AndroidUtilities.replaceTags(LocaleController.getString(i18)), new bi.f(18, context, z10)));
        f7.addView(c90Var, w7.x5.k(28.0f, 9.0f, 28.0f, 0.0f, -1, -2));
        ci.d g10 = org.telegram.messenger.vl.g(24, context, e6Var, true);
        g10.g(LocaleController.getString(R.string.GotIt), false, true);
        g10.setOnClickListener(new qd(j3, 1));
        f7.addView(g10, w7.x5.t(-1, 48, 55, 10, 25, 10, 14));
        j3.setCustomView(f7);
        return j3;
    }

    public static CharSequence f0(CharSequence charSequence, TextPaint textPaint, float f7, float f10, boolean z10) {
        int i10;
        if (f34869y1 == null) {
            f34869y1 = new HashMap();
        }
        int i11 = textPaint.getFontMetricsInt().bottom;
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i12 = ((i11 * i10) * ((int) (f7 * 100.0f))) - ((int) (100.0f * f10));
        SpannableString spannableString = (SpannableString) f34869y1.get(Integer.valueOf(i12));
        if (spannableString == null) {
            spannableString = new SpannableString("T");
            if (z10) {
                org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.mini_gram_72, 0);
                oqVar.setScale(f7, f7);
                oqVar.setColorKey(org.telegram.ui.ActionBar.i6.f19035o6);
                oqVar.setRelativeSize(textPaint.getFontMetricsInt());
                oqVar.spaceScaleX = 0.9f;
                spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
            } else {
                org.telegram.ui.Components.oq oqVar2 = new org.telegram.ui.Components.oq(R.drawable.mini_gram_16, 0);
                oqVar2.setScale(f7, f7);
                oqVar2.setTranslateY(f10);
                oqVar2.spaceScaleX = 0.95f;
                spannableString.setSpan(oqVar2, 0, spannableString.length(), 33);
            }
            f34869y1.put(Integer.valueOf(i12), spannableString);
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
        org.telegram.ui.ActionBar.f3 j14 = org.telegram.messenger.vl.j(1, context, e6Var, false);
        LinearLayout f7 = org.telegram.messenger.vl.f(context, 1);
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
        org.telegram.messenger.vl.k(18.0f, 1, textView);
        if (c10 < 0) {
            i11 = org.telegram.ui.ActionBar.i6.f19071q7;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.f18981l8;
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
        f7.addView(textView, w7.x5.t(-1, -2, 49, 0, 24, 0, 6));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19215y6, e6Var));
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
            textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19071q7, e6Var));
            textView2.setText(TextUtils.concat(textView2.getText(), " — ", LocaleController.getString(R.string.MonetizationTransactionNotCompleted)));
        }
        f7.addView(textView2, w7.x5.t(-1, -2, 49, 0, 0, 0, 0));
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        org.telegram.messenger.vl.k(14.0f, 1, textView3);
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        textView3.setText(str);
        f7.addView(textView3, w7.x5.t(-1, -2, 49, 0, 27, 0, 0));
        if (broadcastRevenueTransaction instanceof TL_stats.TL_broadcastRevenueTransactionProceeds) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18827ci, e6Var)));
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
            org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
            u9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
            org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
            f9Var.p(chat);
            u9Var.e(chat, f9Var);
            frameLayout.addView(u9Var, w7.x5.e(28, 28, 51));
            TextView textView4 = new TextView(context);
            textView4.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18940j5, e6Var));
            textView4.setTextSize(1, 13.0f);
            textView4.setSingleLine();
            textView4.setText(userName);
            frameLayout.addView(textView4, w7.x5.d(-2, -2.0f, 19, 37.0f, 0.0f, 10.0f, 0.0f));
            f7.addView(frameLayout, w7.x5.t(-2, 28, 1, 42, 10, 42, 0));
        }
        ci.d g10 = org.telegram.messenger.vl.g(24, context, e6Var, true);
        if (z12) {
            TL_stats.TL_broadcastRevenueTransactionWithdrawal tL_broadcastRevenueTransactionWithdrawal2 = (TL_stats.TL_broadcastRevenueTransactionWithdrawal) broadcastRevenueTransaction;
            if ((tL_broadcastRevenueTransactionWithdrawal2.flags & 2) != 0) {
                g10.g(LocaleController.getString(R.string.MonetizationTransactionDetailWithdrawButton), false, true);
                g10.setOnClickListener(new ai.f2(context, tL_broadcastRevenueTransactionWithdrawal2));
                f3Var2 = f3Var;
                f7.addView(g10, w7.x5.t(-1, 48, 55, 18, 30, 18, 14));
                f3Var2.setCustomView(f7);
                f3Var2.show();
            }
        }
        g10.g(LocaleController.getString(R.string.OK), false, true);
        f3Var2 = f3Var;
        g10.setOnClickListener(new qd(f3Var2, 0));
        f7.addView(g10, w7.x5.t(-1, 48, 55, 18, 30, 18, 14));
        f3Var2.setCustomView(f7);
        f3Var2.show();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        int max;
        boolean z10;
        org.telegram.ui.Components.e61 e61Var = this.f34870a1;
        if (viewGroup == e61Var) {
            fe feVar = this.f34874e1;
            if (feVar.isAttachedToWindow()) {
                ((View) feVar.getParent()).getTop();
                int i13 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
                org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int bottom = ((View) feVar.getParent()).getBottom();
                if (i11 < 0) {
                    org.telegram.ui.ActionBar.k kVar = this.l1;
                    if (kVar != null) {
                        if (isAttachedToWindow() && e61Var.getHeight() - bottom >= 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        kVar.setCastShadows(z10);
                    }
                    if (e61Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + e61Var.getPaddingBottom()) {
                        org.telegram.ui.Components.ll0 currentListView = feVar.getCurrentListView();
                        int L0 = ((s4.c0) currentListView.getLayoutManager()).L0();
                        int i14 = -1;
                        if (L0 != -1) {
                            s4.c1 K = currentListView.K(L0);
                            if (K != null) {
                                i14 = K.f42671a.getTop();
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
                    org.telegram.ui.Components.ll0 currentListView2 = feVar.getCurrentListView();
                    if (e61Var.getHeight() - bottom >= AndroidUtilities.dp(8.0f) + e61Var.getPaddingBottom() && currentListView2 != null && !currentListView2.canScrollVertically(1)) {
                        iArr[1] = i11;
                        e61Var.B0();
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
        if (this.f34885q1 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34880k1 = tL_payments_starsRevenueStats.usd_rate;
        la1 f02 = za1.f0(tL_payments_starsRevenueStats.revenue_graph, LocaleController.getString(R.string.MonetizationGraphStarsRevenue), 2, false);
        this.f34885q1 = f02;
        if (f02 != null && (bVar = f02.d) != null && (arrayList = bVar.d) != null && !arrayList.isEmpty() && this.f34885q1.d.d.get(0) != null) {
            ((jg.a) this.f34885q1.d.d.get(0)).f12998g = org.telegram.ui.ActionBar.i6.kj;
            this.f34885q1.d.h = (float) ((1.0d / this.f34880k1) / 100.0d);
        }
        g0(false, tL_payments_starsRevenueStats.status);
        if (!this.f34875f1 && (frameLayout = this.f34872c1) != null) {
            frameLayout.animate().alpha(0.0f).setDuration(380L).setInterpolator(org.telegram.ui.Components.qr.h).withEndAction(new nd(this, 7)).start();
        }
        org.telegram.ui.Components.e61 e61Var = this.f34870a1;
        if (e61Var != null) {
            e61Var.Y2.N(!z10);
            if (z10) {
                e61Var.u0(0);
            }
        }
    }

    public final void a0() {
        if (isAttachedToWindow() && this.f34875f1 && this.f34886r1 && MessagesController.getGlobalMainSettings().getBoolean("monetizationadshint", true)) {
            this.f34891w0.showDialog(d0(getContext(), this.f34893x0, false));
            MessagesController.getGlobalMainSettings().edit().putBoolean("monetizationadshint", false).apply();
        }
    }

    public final void b0(boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TLRPC.TL_payments_getStarsRevenueWithdrawalUrl tL_payments_getStarsRevenueWithdrawalUrl;
        za1 za1Var = this.f34891w0;
        if (za1Var != null) {
            Activity parentActivity = za1Var.getParentActivity();
            int i10 = this.f34894y0;
            TLRPC.User currentUser = UserConfig.getInstance(i10).getCurrentUser();
            if (parentActivity != null && currentUser != null) {
                long j3 = this.f34895z0;
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
        if (!this.f34876g1) {
            return;
        }
        int i10 = this.f34894y0;
        yh.o g10 = yh.o.g(i10);
        long j3 = this.f34895z0;
        TLRPC.TL_payments_starsRevenueStats h = g10.h(j3, z10);
        if (h != null) {
            AndroidUtilities.runOnUIThread(new l4(19, this, h));
            return;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.i6.I.q();
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new td(this, 2));
    }

    public final void e0() {
        fe feVar = this.f34874e1;
        nd ndVar = feVar.e;
        boolean[] zArr = feVar.f33580s;
        boolean a2 = feVar.a();
        for (int i10 = 0; i10 < 2; i10++) {
            if (!zArr[i10]) {
                if (i10 == 1) {
                    feVar.h.clear();
                    feVar.f33577f = "";
                } else {
                    feVar.f33578n.clear();
                    feVar.f33579r = "";
                }
                zArr[i10] = false;
                feVar.c(i10);
            } else {
                return;
            }
        }
        if (feVar.a() != a2 && ndVar != null) {
            feVar.e();
            ndVar.run();
        }
    }

    public final void g0(boolean z10, TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus) {
        ge geVar;
        int i10;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.w51 w51Var;
        ge geVar2;
        int i13;
        int i14;
        je jeVar = this;
        ge geVar3 = jeVar.f34889u1;
        ge geVar4 = jeVar.f34888t1;
        org.telegram.ui.Components.n6 n6Var = jeVar.J0;
        RelativeSizeSpan relativeSizeSpan = jeVar.H0;
        org.telegram.ui.Components.n6 n6Var2 = jeVar.I0;
        ge geVar5 = jeVar.f34887s1;
        if (z10) {
            geVar5.f33820a = true;
            long j3 = tL_starsRevenueStatus.available_balance.amount;
            geVar5.d = j3;
            double d = j3 / 1.0E9d;
            long j10 = (long) (jeVar.f34879j1 * d * 100.0d);
            geVar5.e = j10;
            if (jeVar.f34873d1 == null) {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                decimalFormatSymbols.setDecimalSeparator('.');
                geVar2 = geVar3;
                DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                jeVar.f34873d1 = decimalFormat;
                decimalFormat.setMinimumFractionDigits(2);
                i13 = 6;
                jeVar.f34873d1.setMaximumFractionDigits(6);
                jeVar.f34873d1.setGroupingUsed(false);
            } else {
                geVar2 = geVar3;
                i13 = 6;
            }
            DecimalFormat decimalFormat2 = jeVar.f34873d1;
            if (d > 1.5d) {
                i13 = 2;
            }
            decimalFormat2.setMaximumFractionDigits(i13);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f0("TON " + jeVar.f34873d1.format(d), n6Var2.getPaint(), 0.9f, 0.0f, true));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, ".");
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(relativeSizeSpan, indexOf, spannableStringBuilder.length(), 33);
            }
            n6Var2.setText(spannableStringBuilder);
            n6Var.setText("≈" + BillingController.getInstance().formatCurrency(j10, "USD"));
            geVar5.f33823f = "USD";
            geVar4.f33820a = true;
            long j11 = tL_starsRevenueStatus.current_balance.amount;
            geVar4.d = j11;
            jeVar = this;
            double d10 = jeVar.f34879j1;
            geVar4.e = (long) ((j11 / 1.0E9d) * d10 * 100.0d);
            geVar4.f33823f = "USD";
            ge geVar6 = geVar2;
            geVar6.f33820a = true;
            long j12 = tL_starsRevenueStatus.overall_revenue.amount;
            geVar6.d = j12;
            geVar6.e = (long) ((j12 / 1.0E9d) * d10 * 100.0d);
            geVar6.f33823f = "USD";
            jeVar.f34886r1 = true;
            if (tL_starsRevenueStatus.available_balance.amount > 0 && tL_starsRevenueStatus.withdrawal_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            jeVar.K0.setVisibility(i14);
        } else {
            double d11 = jeVar.f34880k1;
            if (d11 != 0.0d) {
                geVar5.f33824g = true;
                TL_stars.StarsAmount starsAmount = tL_starsRevenueStatus.available_balance;
                geVar5.f33825i = starsAmount;
                geVar5.f33826j = (long) (starsAmount.amount * d11 * 100.0d);
                int i15 = tL_starsRevenueStatus.next_withdrawal_at;
                ae aeVar = jeVar.Q0;
                if (n6Var2 == null || n6Var == null) {
                    geVar = geVar3;
                } else {
                    geVar = geVar3;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(yh.x7.X0(false, TextUtils.concat("XTR ", yh.x7.J0(starsAmount, 0.8f, ' ')), 1.0f, null));
                    int indexOf2 = TextUtils.indexOf(spannableStringBuilder2, ".");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2.setSpan(relativeSizeSpan, indexOf2, spannableStringBuilder2.length(), 33);
                    }
                    jeVar.N0 = starsAmount;
                    jeVar.O0.setText(spannableStringBuilder2);
                    jeVar.P0.setText("≈" + BillingController.getInstance().formatCurrency((long) (jeVar.f34880k1 * starsAmount.amount * 100.0d), "USD"));
                    if (starsAmount.amount > 0) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    jeVar.U0.setVisibility(i12);
                    if (jeVar.W0) {
                        jeVar.V0 = true;
                        long j13 = starsAmount.amount;
                        jeVar.X0 = j13;
                        String l4 = Long.toString(j13);
                        fi.o oVar = jeVar.Y0;
                        oVar.setText(l4);
                        oVar.setSelection(oVar.getText().length());
                        jeVar.V0 = false;
                        if (jeVar.X0 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        aeVar.setEnabled(z12);
                    }
                    ci.d dVar = jeVar.T0;
                    if (dVar != null) {
                        if (starsAmount.amount > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        dVar.setEnabled(z11);
                    }
                    jeVar.L0 = i15;
                    md mdVar = jeVar.f34878i1;
                    AndroidUtilities.cancelRunOnUIThread(mdVar);
                    mdVar.run();
                }
                geVar5.f33823f = "USD";
                geVar4.f33824g = true;
                TL_stars.StarsAmount starsAmount2 = tL_starsRevenueStatus.current_balance;
                geVar4.f33825i = starsAmount2;
                double d12 = jeVar.f34880k1;
                geVar4.f33826j = (long) (starsAmount2.amount * d12 * 100.0d);
                geVar4.f33823f = "USD";
                ge geVar7 = geVar;
                geVar7.f33824g = true;
                TL_stars.StarsAmount starsAmount3 = tL_starsRevenueStatus.overall_revenue;
                geVar7.f33825i = starsAmount3;
                geVar7.f33826j = (long) (starsAmount3.amount * d12 * 100.0d);
                geVar7.f33823f = "USD";
                jeVar.f34886r1 = true;
                LinearLayout linearLayout = jeVar.S0;
                if (linearLayout != null) {
                    if (tL_starsRevenueStatus.withdrawal_enabled) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    linearLayout.setVisibility(i11);
                }
                if (aeVar != null) {
                    if (tL_starsRevenueStatus.available_balance.amount <= 0 && !BuildVars.DEBUG_PRIVATE_VERSION) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    aeVar.setVisibility(i10);
                }
            } else {
                return;
            }
        }
        org.telegram.ui.Components.e61 e61Var = jeVar.f34870a1;
        if (e61Var != null && (w51Var = e61Var.Y2) != null) {
            w51Var.N(true);
        }
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void j(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        boolean z10;
        fe feVar = this.f34874e1;
        org.telegram.ui.Components.e61 e61Var = this.f34870a1;
        if (viewGroup == e61Var) {
            try {
                if (feVar.isAttachedToWindow()) {
                    org.telegram.ui.Components.ll0 currentListView = feVar.getCurrentListView();
                    int bottom = ((View) feVar.getParent()).getBottom();
                    org.telegram.ui.ActionBar.k kVar = this.l1;
                    if (kVar != null) {
                        if (isAttachedToWindow() && e61Var.getHeight() - bottom >= 0) {
                            z10 = false;
                            kVar.setCastShadows(z10);
                        }
                        z10 = true;
                        kVar.setCastShadows(z10);
                    }
                    if (e61Var.getHeight() - bottom >= e61Var.getPaddingBottom() + AndroidUtilities.dp(8.0f)) {
                        iArr[1] = i13;
                        currentListView.scrollBy(0, i13);
                    }
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
                AndroidUtilities.runOnUIThread(new nd(this, 2));
            }
        }
    }

    @Override
    public final void o(int i10, View view) {
        this.f34892w1.f3200a = 0;
    }

    @Override
    public final void onAttachedToWindow() {
        f34868x1 = this;
        super.onAttachedToWindow();
        a0();
    }

    @Override
    public final void onDetachedFromWindow() {
        f34868x1 = null;
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
        this.f34892w1.f3200a = i10;
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
