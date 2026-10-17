package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yq;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ef0;
import org.telegram.ui.nc0;
import org.telegram.ui.sa1;
import org.telegram.ui.ut0;
import org.telegram.ui.vf1;
import org.telegram.ui.xf1;
public final class l5 extends v61 implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface T0;
    public sa1 A0;
    public float B0;
    public ei.d C0;
    public ei.d D0;
    public ah.v E;
    public l0 E0;
    public boolean F;
    public e0 F0;
    public boolean G;
    public boolean G0;
    public float I0;
    public float J0;
    public ValueAnimator K0;
    public int M0;
    public SpannableString P0;
    public boolean Q0;
    public boolean R0;
    public ah.x S;
    public j S0;
    public u4 T;
    public FrameLayout U;
    public TextView V;
    public FrameLayout W;
    public TextView X;
    public FrameLayout Y;
    public TextView Z;
    public x90 f34480a0;
    public v4 f34481b0;
    public boolean f34482c0;
    public y4 d;
    public FrameLayout f34483d0;
    public v4 e;
    public FrameLayout f34484e0;
    public int f34485f;
    public boolean f34487g0;
    public z4 h;
    public b91 f34488h0;
    public FrameLayout f34489i0;
    public q8 f34490j0;
    public w7 f34491k0;
    public float m0;
    public int f34493n;
    public ValueAnimator f34494n0;
    public ai.r f34495o0;
    public boolean f34496p0;
    public ei.h1 f34497q0;
    public boolean f34498r;
    public h5 f34499r0;
    public LinearLayout f34502t0;
    public org.telegram.ui.Components.q6 f34503u0;
    public org.telegram.ui.Components.q6 f34504v0;
    public u5 f34506w0;
    public FrameLayout f34507x;
    public b5 f34508x0;
    public View f34509y;
    public float f34510y0;
    public float f34511z0;
    public final org.telegram.ui.Cells.k7 f34500s = new org.telegram.ui.Cells.k7(this, 27);
    public final r3 v = new ut() {
        @Override
        public final void a(int i10, boolean z10) {
            u61 u61Var;
            l5 l5Var = l5.this;
            org.telegram.ui.Cells.k7 k7Var = l5Var.f34500s;
            if ((i10 != 1 && i10 != 3) || (u61Var = l5Var.f31190a) == null) {
                return;
            }
            l5Var.f34498r = z10;
            u61Var.removeCallbacks(k7Var);
            k7Var.run();
        }
    };
    public boolean f34505w = false;
    public final Rect H = new Rect();
    public final Matrix I = new Matrix();
    public final Matrix J = new Matrix();
    public final Matrix K = new Matrix();
    public final float[] L = new float[8];
    public final float[] M = new float[8];
    public final float[] N = new float[8];
    public final int[] O = new int[2];
    public final int[] P = new int[2];
    public final int[] Q = new int[2];
    public final int[] R = new int[2];
    public int f34486f0 = 0;
    public String f34492l0 = "";
    public final a71[] f34501s0 = new a71[2];
    public final m3 H0 = new m3(this, 3);
    public final m3 L0 = new m3(this, 4);
    public final CharSequence[] N0 = new CharSequence[2];
    public final HashSet O0 = new HashSet();

    public static void B0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        org.telegram.ui.ActionBar.f3 i10 = wh.i(1, context, d6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21057h5, d6Var)));
        frameLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, w7.z5.d(-2.0f, -1));
        linearLayout.addView(new p6(160, context, false), w7.z5.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.WalletHowItWorks));
        wh.o(org.telegram.ui.ActionBar.h6.f21092j5, d6Var, textView, 1, 17.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView i11 = com.google.android.gms.internal.cast.a6.i(linearLayout, textView, w7.z5.t(-1, -2, 1, 0, 0, 0, 6), context);
        i11.setText(LocaleController.getString(R.string.WalletHowItWorksInfo));
        int i12 = org.telegram.ui.ActionBar.h6.f21391z6;
        wh.o(i12, d6Var, i11, 1, 14.0f);
        i11.setGravity(17);
        i11.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
        linearLayout.addView(i11, w7.z5.t(-1, -2, 1, 0, 0, 0, 24));
        d5 d5Var = new d5(context, d6Var);
        d5Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        d5Var.a(LocaleController.getString(R.string.WalletSendInstantly), LocaleController.getString(R.string.WalletSendInstantlyInfo), R.drawable.wallet_learn_instant);
        linearLayout.addView(d5Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        d5 d5Var2 = new d5(context, d6Var);
        d5Var2.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        d5Var2.a(LocaleController.getString(R.string.WalletNoFees), LocaleController.getString(R.string.WalletNoFeesInfo), R.drawable.wallet_learn_fees);
        linearLayout.addView(d5Var2, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        d5 d5Var3 = new d5(context, d6Var);
        d5Var3.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        d5Var3.a(LocaleController.getString(R.string.WalletBlockchainVerified), LocaleController.getString(R.string.WalletBlockchainVerifiedInfo), R.drawable.wallet_learn_verified);
        linearLayout.addView(d5Var3, w7.z5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        ei.d f7 = wh.f(24, context, d6Var, true);
        f7.setText(LocaleController.getString(R.string.WalletGotIt));
        linearLayout.addView(f7, w7.z5.t(-1, 48, 1, 0, 0, 0, 0));
        w7.b6.b(f7, 0.02f, 1.1f);
        x90 x90Var = new x90(context, null);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        x90Var.setTextSize(1, 13.0f);
        x90Var.setGravity(17);
        x90Var.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, d6Var), new n3(context, 1)));
        linearLayout.addView(x90Var, w7.z5.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        i10.customView = frameLayout;
        org.telegram.ui.ActionBar.f3[] f3VarArr = {i10};
        f3VarArr[0].setAllowNestedScroll(true);
        f3VarArr[0].fixNavigationBar();
        f7.setOnClickListener(new z3(f3VarArr, 1));
        f3VarArr[0].show();
    }

    public static void C0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        m0 w9 = m0.w(i10);
        if (w9.E()) {
            String s10 = w9.s();
            if (TextUtils.isEmpty(s10)) {
                return;
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, d6Var, false);
            f3Var.setBackgroundColor(-12207881);
            f3Var.fixNavigationBar(-12207881);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(new k5(0));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, w7.z5.f(-2.0f, 55, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
            j5 j5Var = new j5(context, s10);
            linearLayout.addView(j5Var, w7.z5.q(288, 302, 1));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.WalletReceiveInfo));
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
            linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 24, 0, 24, 20));
            ei.d dVar = new ei.d(context, null, true);
            dVar.setRoundRadius(24);
            dVar.setColor(-1);
            dVar.setTextColor(-15556886);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new yq(R.drawable.wallet_buy, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.WalletBuyWithCashOrCrypto));
            dVar.setText(spannableStringBuilder);
            linearLayout.addView(dVar, w7.z5.t(-1, 48, 1, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.ic_close_white);
            imageView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            w7.b6.a(imageView);
            frameLayout.addView(imageView, w7.z5.a(48.0f, 4.0f, 2.0f, 0.0f, 0.0f, 48, 51));
            f3Var.customView = frameLayout;
            f3Var.occupyNavigationBar = true;
            f3Var.setApplyTopPadding(false);
            f3Var.setApplyBottomPadding(false);
            f3Var.fixNavigationBar(-12207881);
            imageView.setOnClickListener(new l3(f3Var, 0));
            j5Var.e = new r0(s10, 1);
            f3Var.show();
            f3Var.setOverlayNavBarColor(-12207881);
            AndroidUtilities.setNavigationBarColor((Dialog) f3Var, -12207881, false);
            AndroidUtilities.setLightNavigationBar((Dialog) f3Var, false);
            if (Build.VERSION.SDK_INT >= 29 && f3Var.getWindow() != null) {
                f3Var.getWindow().setNavigationBarContrastEnforced(false);
            }
            dVar.setOnClickListener(new ci.d6(dVar, i10, f3Var, d6Var, 7));
        }
    }

    public static void R0(a71 a71Var, boolean z10) {
        boolean canScrollVertically = a71Var.canScrollVertically(-1);
        a71Var.W2.N(z10);
        a71Var.a0();
        if (!canScrollVertically) {
            a71Var.V2.h1(0, 0);
        }
    }

    public static void Y(l5 l5Var, Context context, View view) {
        boolean z10;
        int i10;
        m0 w9 = m0.w(l5Var.currentAccount);
        final i80 I = i80.I(l5Var, view);
        I.a0(0.0f, -AndroidUtilities.dp(48.0f));
        I.f27134s = 0;
        I.V(5);
        i80 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.WalletBack), new ut0(I, 26), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        z6 z6Var = new z6(l5Var, linearLayout, w9, I, 10);
        J.r(scrollView, w7.z5.n(-1, 350));
        I.c(R.drawable.wallet_globe, LocaleController.getString(R.string.WalletCurrency), new h(z6Var, I, J, 8), false);
        org.telegram.ui.ActionBar.e1 y3 = I.y();
        f fVar = w9.h;
        String i11 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i11);
        String str = i11;
        if (isEmpty) {
            y3.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Loading));
            spannableStringBuilder.setSpan(new ca0(AndroidUtilities.dp(75.0f), y3.f20758b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y3.setSubtext(str);
        if (fVar.f() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        z6 z6Var2 = new z6(w9, new boolean[]{z10}, y3, z6Var, 11);
        l5Var.O0.add(z6Var2);
        z6Var.run();
        I.c(R.drawable.wallet_lock, LocaleController.getString(R.string.Passcode), new Runnable(l5Var) {
            public final l5 f35035b;

            {
                this.f35035b = l5Var;
            }

            @Override
            public final void run() {
                y4 y4Var;
                switch (r3) {
                    case 0:
                        l5 l5Var2 = this.f35035b;
                        l5Var2.getClass();
                        I.u();
                        l5Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        l5 l5Var3 = this.f35035b;
                        l5Var3.getClass();
                        I.u();
                        l5Var3.presentFragment(new k8());
                        return;
                    case 2:
                        l5 l5Var4 = this.f35035b;
                        l5Var4.getClass();
                        I.u();
                        l5Var4.presentFragment(new v61());
                        return;
                    case 3:
                        I.u();
                        l5 l5Var5 = this.f35035b;
                        l5.B0(l5Var5.getParentActivity(), l5Var5.getResourceProvider());
                        return;
                    default:
                        I.u();
                        l5 l5Var6 = this.f35035b;
                        boolean z11 = l5Var6.f34505w;
                        boolean z12 = !z11;
                        if (z11 != z12 && (y4Var = l5Var6.d) != null) {
                            l5Var6.f34505w = z12;
                            y4Var.setUse2D(z12);
                            l5Var6.e.requestLayout();
                            l5Var6.d.post(new m3(l5Var6, 11));
                            return;
                        }
                        return;
                }
            }
        }, false);
        I.c(R.drawable.wallet_key, LocaleController.getString(R.string.WalletKeysAndBackup), new Runnable(l5Var) {
            public final l5 f35035b;

            {
                this.f35035b = l5Var;
            }

            @Override
            public final void run() {
                y4 y4Var;
                switch (r3) {
                    case 0:
                        l5 l5Var2 = this.f35035b;
                        l5Var2.getClass();
                        I.u();
                        l5Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        l5 l5Var3 = this.f35035b;
                        l5Var3.getClass();
                        I.u();
                        l5Var3.presentFragment(new k8());
                        return;
                    case 2:
                        l5 l5Var4 = this.f35035b;
                        l5Var4.getClass();
                        I.u();
                        l5Var4.presentFragment(new v61());
                        return;
                    case 3:
                        I.u();
                        l5 l5Var5 = this.f35035b;
                        l5.B0(l5Var5.getParentActivity(), l5Var5.getResourceProvider());
                        return;
                    default:
                        I.u();
                        l5 l5Var6 = this.f35035b;
                        boolean z11 = l5Var6.f34505w;
                        boolean z12 = !z11;
                        if (z11 != z12 && (y4Var = l5Var6.d) != null) {
                            l5Var6.f34505w = z12;
                            y4Var.setUse2D(z12);
                            l5Var6.e.requestLayout();
                            l5Var6.d.post(new m3(l5Var6, 11));
                            return;
                        }
                        return;
                }
            }
        }, false);
        I.l(R.drawable.wallet_apps, LocaleController.getString(R.string.WalletConnectedApps), new Runnable(l5Var) {
            public final l5 f35035b;

            {
                this.f35035b = l5Var;
            }

            @Override
            public final void run() {
                y4 y4Var;
                switch (r3) {
                    case 0:
                        l5 l5Var2 = this.f35035b;
                        l5Var2.getClass();
                        I.u();
                        l5Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        l5 l5Var3 = this.f35035b;
                        l5Var3.getClass();
                        I.u();
                        l5Var3.presentFragment(new k8());
                        return;
                    case 2:
                        l5 l5Var4 = this.f35035b;
                        l5Var4.getClass();
                        I.u();
                        l5Var4.presentFragment(new v61());
                        return;
                    case 3:
                        I.u();
                        l5 l5Var5 = this.f35035b;
                        l5.B0(l5Var5.getParentActivity(), l5Var5.getResourceProvider());
                        return;
                    default:
                        I.u();
                        l5 l5Var6 = this.f35035b;
                        boolean z11 = l5Var6.f34505w;
                        boolean z12 = !z11;
                        if (z11 != z12 && (y4Var = l5Var6.d) != null) {
                            l5Var6.f34505w = z12;
                            y4Var.setUse2D(z12);
                            l5Var6.e.requestLayout();
                            l5Var6.d.post(new m3(l5Var6, 11));
                            return;
                        }
                        return;
                }
            }
        }, true ^ w9.f34555g.d.isEmpty());
        I.k();
        I.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsWallet), new Runnable(l5Var) {
            public final l5 f35035b;

            {
                this.f35035b = l5Var;
            }

            @Override
            public final void run() {
                y4 y4Var;
                switch (r3) {
                    case 0:
                        l5 l5Var2 = this.f35035b;
                        l5Var2.getClass();
                        I.u();
                        l5Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        l5 l5Var3 = this.f35035b;
                        l5Var3.getClass();
                        I.u();
                        l5Var3.presentFragment(new k8());
                        return;
                    case 2:
                        l5 l5Var4 = this.f35035b;
                        l5Var4.getClass();
                        I.u();
                        l5Var4.presentFragment(new v61());
                        return;
                    case 3:
                        I.u();
                        l5 l5Var5 = this.f35035b;
                        l5.B0(l5Var5.getParentActivity(), l5Var5.getResourceProvider());
                        return;
                    default:
                        I.u();
                        l5 l5Var6 = this.f35035b;
                        boolean z11 = l5Var6.f34505w;
                        boolean z12 = !z11;
                        if (z11 != z12 && (y4Var = l5Var6.d) != null) {
                            l5Var6.f34505w = z12;
                            y4Var.setUse2D(z12);
                            l5Var6.e.requestLayout();
                            l5Var6.d.post(new m3(l5Var6, 11));
                            return;
                        }
                        return;
                }
            }
        }, false);
        if (BuildVars.DEBUG_VERSION) {
            I.k();
            if (l5Var.f34505w) {
                i10 = R.string.WalletCard3D;
            } else {
                i10 = R.string.WalletCard2D;
            }
            I.c(0, LocaleController.getString(i10), new Runnable(l5Var) {
                public final l5 f35035b;

                {
                    this.f35035b = l5Var;
                }

                @Override
                public final void run() {
                    y4 y4Var;
                    switch (r3) {
                        case 0:
                            l5 l5Var2 = this.f35035b;
                            l5Var2.getClass();
                            I.u();
                            l5Var2.presentFragment(PasscodeActivity.e0());
                            return;
                        case 1:
                            l5 l5Var3 = this.f35035b;
                            l5Var3.getClass();
                            I.u();
                            l5Var3.presentFragment(new k8());
                            return;
                        case 2:
                            l5 l5Var4 = this.f35035b;
                            l5Var4.getClass();
                            I.u();
                            l5Var4.presentFragment(new v61());
                            return;
                        case 3:
                            I.u();
                            l5 l5Var5 = this.f35035b;
                            l5.B0(l5Var5.getParentActivity(), l5Var5.getResourceProvider());
                            return;
                        default:
                            I.u();
                            l5 l5Var6 = this.f35035b;
                            boolean z11 = l5Var6.f34505w;
                            boolean z12 = !z11;
                            if (z11 != z12 && (y4Var = l5Var6.d) != null) {
                                l5Var6.f34505w = z12;
                                y4Var.setUse2D(z12);
                                l5Var6.e.requestLayout();
                                l5Var6.d.post(new m3(l5Var6, 11));
                                return;
                            }
                            return;
                    }
                }
            }, false);
        }
        I.f27129p = new t3(3, l5Var, z6Var2);
        I.Z();
    }

    public static void Z(l5 l5Var, String str, m0 m0Var, i80 i80Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        String str2;
        float f7;
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, l5Var.getParentActivity(), l5Var.resourceProvider, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(currencyrate.currency);
        if (!TextUtils.isEmpty(currencyrate.translatedTitle)) {
            str2 = currencyrate.translatedTitle;
        } else {
            str2 = currencyrate.title;
        }
        e1Var.setSubtext(str2);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        TextView textView = e1Var.f20758b;
        if (equals) {
            f7 = 42.0f;
        } else {
            f7 = 0.0f;
        }
        textView.setPadding(0, 0, AndroidUtilities.dp(f7), 0);
        e1Var.setChecked(equals);
        e1Var.setOnClickListener(new n1(m0Var, currencyrate, i80Var, 2));
        linearLayout.addView(e1Var, w7.z5.n(200, -2));
    }

    public static void a0(l5 l5Var) {
        m0 w9 = m0.w(l5Var.currentAccount);
        ei.d dVar = l5Var.D0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        w9.j0(new e2.o0((Object) w9, (Object) new x(6, l5Var, w9), false, false, 3));
    }

    public static void b0(l5 l5Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (l5Var.E != null && (kVar = l5Var.actionBar) != null && (kVar.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) l5Var.actionBar.getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (l5Var.E.getParent() != l5Var.actionBar) {
                AndroidUtilities.removeFromParent(l5Var.E);
                l5Var.actionBar.addView(l5Var.E, w7.z5.d(-1.0f, -1));
            }
            l5Var.E.bringToFront();
            l5Var.actionBar.bringToFront();
            l5Var.E.post(new m3(l5Var, 11));
        }
    }

    public static void c0(l5 l5Var) {
        C0(l5Var.getParentActivity(), l5Var.currentAccount, l5Var.getResourceProvider());
    }

    public static void d0(l5 l5Var, LinearLayout linearLayout, m0 m0Var, i80 i80Var) {
        TL_wallet.currencyRate currencyrate;
        l5 l5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        m0 m0Var2 = m0Var;
        linearLayout2.removeAllViews();
        String g10 = m0Var2.h.g();
        TL_wallet.currencyRates f7 = m0Var2.h.f();
        if (f7 == null) {
            for (int i10 = 0; i10 < 3; i10++) {
                b10 b10Var = new b10(l5Var.getParentActivity(), l5Var.getResourceProvider());
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(31);
                linearLayout2.addView(b10Var, w7.z5.n(200, -2));
            }
            return;
        }
        f fVar = m0Var2.h;
        fVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        TL_wallet.currencyRates f10 = fVar.f();
        TL_wallet.currencyRate currencyrate2 = null;
        if (f10 != null && (arrayList = f10.rates) != null) {
            int size = arrayList.size();
            currencyrate = null;
            int i11 = 0;
            while (i11 < size) {
                TL_wallet.currencyRate currencyrate3 = arrayList.get(i11);
                i11++;
                TL_wallet.currencyRate currencyrate4 = currencyrate3;
                if (currencyrate4 != null && TextUtils.equals(currencyrate4.currency, "USD")) {
                    currencyrate2 = currencyrate4;
                } else if (currencyrate4 != null && TextUtils.equals(currencyrate4.currency, "EUR")) {
                    currencyrate = currencyrate4;
                }
            }
        } else {
            currencyrate = null;
        }
        if (currencyrate2 == null) {
            currencyrate2 = f.e();
        }
        arrayList2.add(currencyrate2);
        if (currencyrate != null) {
            arrayList2.add(currencyrate);
        }
        if (f10 != null && f10.rates != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(fVar.g());
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) ApplicationLoader.applicationContext.getSystemService("input_method");
                if (inputMethodManager != null) {
                    f.b(linkedHashSet, inputMethodManager.getCurrentInputMethodSubtype());
                    for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                        for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                            f.b(linkedHashSet, inputMethodSubtype);
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            f.a(linkedHashSet, MessagesController.getInstance(fVar.f34181a).config.phoneCountryIso2.get());
            f.c(linkedHashSet, LocaleController.getInstance().getCurrentLocale());
            f.c(linkedHashSet, LocaleController.getInstance().getSystemDefaultLocale());
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.equals(str, "USD") && !TextUtils.equals(str, "EUR")) {
                    ArrayList<TL_wallet.currencyRate> arrayList3 = f10.rates;
                    int size2 = arrayList3.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            TL_wallet.currencyRate currencyrate5 = arrayList3.get(i12);
                            i12++;
                            TL_wallet.currencyRate currencyrate6 = currencyrate5;
                            if (currencyrate6 != null && TextUtils.equals(currencyrate6.currency, str)) {
                                arrayList2.add(currencyrate6);
                                break;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        int i13 = 0;
        while (i13 < arrayList2.size()) {
            TL_wallet.currencyRate currencyrate7 = (TL_wallet.currencyRate) arrayList2.get(i13);
            if (currencyrate7 != null && hashSet.add(currencyrate7.currency)) {
                Z(l5Var, g10, m0Var2, i80Var, linearLayout2, currencyrate7);
            }
            i13++;
            m0Var2 = m0Var;
        }
        if (!hashSet.isEmpty() && !f7.rates.isEmpty()) {
            l5Var2 = l5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.j1(l5Var.getParentActivity(), l5Var2.resourceProvider), w7.z5.n(-1, 8));
        } else {
            l5Var2 = l5Var;
        }
        int i14 = 0;
        while (i14 < f7.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f7.rates.get(i14);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                Z(l5Var2, g10, m0Var, i80Var, linearLayout2, currencyrate8);
            }
            i14++;
            l5Var2 = l5Var;
            linearLayout2 = linearLayout;
        }
    }

    public static void e0(l5 l5Var) {
        pf.d.r(l5Var.getParentActivity(), m0.w(l5Var.currentAccount).f34557j);
    }

    public static void f0(l5 l5Var) {
        C0(l5Var.getParentActivity(), l5Var.currentAccount, l5Var.getResourceProvider());
    }

    public static void g0(l5 l5Var, long j10) {
        m3 m3Var = l5Var.L0;
        if (l5Var.f31190a != null) {
            q8 q8Var = l5Var.f34490j0;
            if (q8Var != null) {
                q8Var.a();
            }
            if (l5Var.J0 <= 0.0f && l5Var.v0()) {
                int top = l5Var.f31190a.V2.m(l5Var.f34485f).getTop() - l5Var.f31190a.getPaddingTop();
                l5Var.f31190a.B0();
                if (top < 0) {
                    l5Var.f31190a.v0(0, top, bs.h);
                    return;
                }
                return;
            }
            l5Var.f31190a.B0();
            l5Var.n0(true);
            AndroidUtilities.cancelRunOnUIThread(m3Var);
            if (j10 > 0) {
                AndroidUtilities.runOnUIThread(m3Var, j10 + 260);
            }
        }
    }

    public static int l0(l5 l5Var) {
        return l5Var.currentAccount;
    }

    public static Typeface m0(Context context) {
        if (T0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                T0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                T0 = AndroidUtilities.getTypeface("fonts/rmono.ttf");
            }
        }
        return T0;
    }

    public static android.widget.LinearLayout o0(android.content.Context r40, int r41, org.telegram.tgnet.tl.TL_wallet.walletTransaction r42, org.telegram.messenger.Utilities.Callback3 r43, org.telegram.messenger.Utilities.Callback2 r44, byte[] r45, java.lang.Runnable r46, org.telegram.ui.ActionBar.d6 r47, org.telegram.ui.Wallet.k2[] r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.l5.o0(android.content.Context, int, org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.messenger.Utilities$Callback3, org.telegram.messenger.Utilities$Callback2, byte[], java.lang.Runnable, org.telegram.ui.ActionBar.d6, org.telegram.ui.Wallet.k2[]):android.widget.LinearLayout");
    }

    public static String q0(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 > 0 && i10 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i10));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder r0(int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var) {
        BigDecimal stripTrailingZeros;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        yq yqVar = new yq(R.drawable.wallet_gram_small, 2);
        yqVar.recolorDrawable = false;
        yqVar.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j10).movePointLeft(9);
        if (movePointLeft.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = movePointLeft.stripTrailingZeros();
        }
        spannableStringBuilder.append((CharSequence) stripTrailingZeros.toPlainString());
        CharSequence l4 = m0.w(i10).l(j10, true);
        if (!TextUtils.isEmpty(l4)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(l4);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21391z6, d6Var)), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static void z0(Context context, int i10, TL_wallet.walletTransaction wallettransaction, Utilities.Callback3 callback3, Utilities.Callback2 callback2, byte[] bArr, org.telegram.ui.Cells.p0 p0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        View[] viewArr;
        k2[] k2VarArr;
        Utilities.Callback2 callback22;
        LinearLayout o02;
        TL_wallet.nftItem nftitem;
        if (context == null) {
            return;
        }
        if ((wallettransaction.peer instanceof TL_wallet.walletTransactionPeerTelegramGift) && (nftitem = wallettransaction.nft) != null) {
            TL_stars.StarGift starGift = nftitem.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                ai.k7 k7Var = new ai.k7(context, i10, 0L, d6Var, null);
                k7Var.f1682i1 = wallettransaction;
                k7Var.A2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
                k7Var.show();
                return;
            }
        }
        boolean z10 = true;
        k2[] k2VarArr2 = new k2[1];
        View[] viewArr2 = new View[1];
        l0 A = m0.w(i10).A();
        ArrayList arrayList = new ArrayList(A.f34457c);
        int i11 = 0;
        while (true) {
            if (i11 < arrayList.size()) {
                if (arrayList.get(i11) == wallettransaction || m0.f0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i11))) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (callback3 == null && p0Var == null && i11 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(R.drawable.sheet_shadow_round).getPadding(rect);
            viewArr = viewArr2;
            ?? k4Var = new k4(context, d6Var, A, arrayList, i10, rect, viewArr);
            k4Var.setPosition(i11);
            l4 l4Var = new l4(arrayList, context, d6Var, rect, i10, k2VarArr2);
            k2VarArr = k2VarArr2;
            k4Var.setAdapter(l4Var);
            callback22 = callback2;
            o02 = k4Var;
        } else {
            viewArr = viewArr2;
            k2VarArr = k2VarArr2;
            callback22 = callback2;
            o02 = o0(context, i10, wallettransaction, callback3, callback2, bArr, p0Var, d6Var, k2VarArr);
        }
        k2[] k2VarArr3 = k2VarArr;
        m4 m4Var = new m4(context, o02, d6Var, o02, viewArr, context);
        k2VarArr3[0] = m4Var;
        if ((o02 instanceof c91) && callback22 != null) {
            m4Var.setOnDismissListener(new t3(2, callback22, wallettransaction));
        }
        k2 k2Var = k2VarArr3[0];
        if (callback3 == null) {
            z10 = false;
        }
        k2Var.setFocusable(z10);
        k2 k2Var2 = k2VarArr3[0];
        k2Var2.useBackgroundTopPadding = false;
        k2Var2.show();
    }

    public final void A0(TL_wallet.nftItem nftitem) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TL_stars.StarGift starGift = nftitem.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            ai.k7 k7Var = new ai.k7(getParentActivity(), this.currentAccount, 0L, getResourceProvider(), null);
            k7Var.f1676f1 = nftitem;
            if (this.f34491k0 != null) {
                k7Var.f1678g1 = new s4(this, tL_starGiftUnique, nftitem);
                k7Var.f1680h1 = new t4(this, nftitem);
            }
            k7Var.A2(tL_starGiftUnique.slug, tL_starGiftUnique, null);
            showDialog(k7Var);
            return;
        }
        Activity parentActivity = getParentActivity();
        org.telegram.ui.ActionBar.d6 resourceProvider = getResourceProvider();
        if (parentActivity != null) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20928a7, resourceProvider);
            int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, resourceProvider);
            i4 i4Var = new i4(parentActivity, resourceProvider);
            i4Var.setBackgroundColor(w02);
            i4Var.fixNavigationBar(w02);
            ScrollView scrollView = new ScrollView(parentActivity);
            scrollView.setFillViewport(true);
            scrollView.setVerticalScrollBarEnabled(false);
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(parentActivity);
            w9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
            w9Var.setContentDescription(nftitem.name);
            Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
            int i15 = org.telegram.ui.ActionBar.h6.f21391z6;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i15, resourceProvider), PorterDuff.Mode.SRC_IN));
            ImageLocation c10 = c.c(nftitem, false);
            if (c10 != null) {
                w9Var.h(c10, "120_120", mutate, nftitem);
            } else {
                w9Var.setImageDrawable(mutate);
            }
            linearLayout.addView(w9Var, w7.z5.q(120, 120, 1));
            TextView textView = new TextView(parentActivity);
            if (TextUtils.isEmpty(nftitem.name)) {
                str = LocaleController.getString(R.string.WalletCollectible);
            } else {
                str = nftitem.name;
            }
            textView.setText(str);
            textView.setTextColor(w03);
            textView.setTextSize(1, 17.0f);
            textView.setTypeface(AndroidUtilities.bold());
            int i16 = 17;
            textView.setGravity(17);
            linearLayout.addView(textView, w7.z5.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
            TextView textView2 = new TextView(parentActivity);
            textView2.setText(nftitem.description);
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, resourceProvider));
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(17);
            if (TextUtils.isEmpty(nftitem.description)) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            textView2.setVisibility(i10);
            linearLayout.addView(textView2, w7.z5.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(parentActivity);
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
            int i17 = 0;
            while (i17 < 2) {
                LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(i16);
                int dp = AndroidUtilities.dp(16.0f);
                int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, resourceProvider);
                int w05 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, resourceProvider);
                linearLayout3.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, w04, w05, w05));
                linearLayout3.setClickable(true);
                linearLayout3.setFocusable(true);
                if (i17 == 0) {
                    i11 = R.string.WalletTransfer;
                } else {
                    i11 = R.string.WalletSell;
                }
                String string = LocaleController.getString(i11);
                linearLayout3.setContentDescription(string);
                ImageView imageView = new ImageView(parentActivity);
                if (i17 == 0) {
                    i12 = R.drawable.wallet_transfer;
                } else {
                    i12 = R.drawable.wallet_sell;
                }
                imageView.setImageResource(i12);
                imageView.setImportantForAccessibility(2);
                imageView.setColorFilter(new PorterDuffColorFilter(w03, PorterDuff.Mode.SRC_IN));
                linearLayout3.addView(imageView, w7.z5.n(24, 24));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText(string);
                textView3.setTextColor(w03);
                textView3.setTextSize(1, 12.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setGravity(17);
                linearLayout3.addView(textView3, w7.z5.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
                if (i17 == 0) {
                    i13 = 0;
                } else {
                    i13 = 4;
                }
                if (i17 == 0) {
                    i14 = 4;
                } else {
                    i14 = 0;
                }
                linearLayout2.addView(linearLayout3, w7.z5.m(1.0f, 0, -1, i13, i14, 0));
                i17++;
                i16 = 17;
            }
            ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
            if (arrayList != null && !arrayList.isEmpty()) {
                j01 j01Var = new j01(parentActivity, resourceProvider);
                j01Var.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, resourceProvider)));
                ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    TL_wallet.nftAttribute nftattribute = arrayList2.get(i18);
                    i18++;
                    TL_wallet.nftAttribute nftattribute2 = nftattribute;
                    j01Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                }
                linearLayout.addView(j01Var, w7.z5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
            }
            ei.d dVar = new ei.d(parentActivity, resourceProvider, true);
            dVar.setRoundRadius(24);
            dVar.setText(LocaleController.getString(R.string.WalletOK));
            linearLayout.addView(dVar, w7.z5.n(-1, 48));
            i4Var.setCustomView(scrollView);
            i4Var.useBackgroundTopPadding = false;
            linearLayout2.getChildAt(0).setOnClickListener(new ef0(24, i4Var, nftitem));
            linearLayout2.getChildAt(1).setOnClickListener(new t2(parentActivity, 1));
            dVar.setOnClickListener(new t2(i4Var, 2));
            i4Var.show();
            i4Var.fixNavigationBar(w02);
            AndroidUtilities.setNavigationBarColor((Dialog) i4Var, w02, false);
        }
    }

    public final void D0() {
        if (getParentActivity() == null) {
            return;
        }
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            return;
        }
        org.telegram.ui.y9.e0(getParentActivity(), true, 1, new ki.t1(this, 19));
    }

    public final void E0(boolean z10) {
        float f7;
        boolean z11;
        this.f34487g0 = z10;
        if (!z10) {
            this.f34486f0 = 0;
        }
        if (this.f34497q0 != null && this.f34489i0 != null) {
            if (!z10) {
                this.f34490j0.b(false);
                this.f34497q0.setPosition(0);
            }
            S0();
            ValueAnimator valueAnimator = this.f34494n0;
            if (valueAnimator != null) {
                this.f34494n0 = null;
                valueAnimator.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (this.f34495o0.isAttachedToWindow() && this.f34495o0.isLaidOut()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                this.f34497q0.o(false);
            }
            if (z11 && this.m0 != f7) {
                this.f34489i0.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.m0, f7);
                this.f34494n0 = ofFloat;
                ofFloat.setDuration(250L);
                this.f34494n0.setInterpolator(bs.h);
                this.f34494n0.addUpdateListener(new x3(this, 0));
                this.f34494n0.addListener(new org.telegram.ui.ActionBar.y0(this, f7, 7));
                this.f34494n0.start();
            } else {
                F0(f7);
                this.f34497q0.o(false);
            }
            if (this.f31190a != null && this.f34496p0 != G0()) {
                Q0(false);
            }
        }
    }

    public final void F0(float f7) {
        int i10;
        this.m0 = f7;
        FrameLayout frameLayout = this.f34489i0;
        if (f7 <= 0.0f && this.f34494n0 == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        frameLayout.setVisibility(i10);
        this.f34489i0.setAlpha(f7);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f34489i0.getLayoutParams();
        layoutParams.height = Math.round(AndroidUtilities.dp(52.0f) * f7);
        layoutParams.bottomMargin = -Math.round(AndroidUtilities.dp(6.0f) * f7);
        this.f34489i0.setLayoutParams(layoutParams);
    }

    public final boolean G0() {
        l0 l0Var;
        if (!this.f34487g0 && (l0Var = this.E0) != null && l0Var.f34457c.isEmpty()) {
            l0 l0Var2 = this.E0;
            l0Var2.getClass();
            if (l0Var2.h) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H0() {
        q8 q8Var = this.f34490j0;
        if (q8Var != null) {
            q8Var.b(false);
        }
        if (!this.f34487g0) {
            this.G0 = true;
            return;
        }
        this.G0 = false;
        this.f34486f0 = 1;
        ei.h1 h1Var = this.f34497q0;
        if (h1Var != null) {
            h1Var.setPosition(1);
        }
    }

    public final void I0() {
        this.G0 = false;
        q8 q8Var = this.f34490j0;
        if (q8Var != null) {
            q8Var.b(false);
        }
        this.f34486f0 = 0;
        ei.h1 h1Var = this.f34497q0;
        if (h1Var != null) {
            h1Var.setPosition(0);
        }
    }

    public final void J0() {
        this.f34498r = false;
        u61 u61Var = this.f31190a;
        if (u61Var != null) {
            u61Var.C2.f32212b.remove(this.v);
            this.f31190a.removeCallbacks(this.f34500s);
        }
        y4 y4Var = this.d;
        if (y4Var != null) {
            y4Var.setAdditionalTilt(0.0f);
        }
    }

    public final void K0() {
        boolean z10;
        m0 w9 = m0.w(this.currentAccount);
        T0();
        ei.d dVar = this.D0;
        if (w9.E() && w9.d()) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (!w9.E()) {
            this.f34503u0.setText(y0(0));
            this.f34504v0.setText(y0(1));
            return;
        }
        long u10 = w9.u();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.P0 == null) {
            this.P0 = new SpannableString("G");
            y4 y4Var = this.d;
            y4Var.getClass();
            u5 u5Var = new u5(y4Var, R.drawable.wallet_gram_large);
            this.f34506w0 = u5Var;
            SpannableString spannableString = this.P0;
            spannableString.setSpan(u5Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.P0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) v5.f(u10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        if (this.f34508x0 == null) {
            ?? characterStyle = new CharacterStyle();
            characterStyle.f34038a = -9577217;
            this.f34508x0 = characterStyle;
        }
        spannableStringBuilder.setSpan(this.f34508x0, length, spannableStringBuilder.length(), 33);
        this.f34503u0.setText(spannableStringBuilder);
        CharSequence l4 = m0.w(this.currentAccount).l(u10, false);
        if (TextUtils.isEmpty(l4)) {
            this.f34504v0.setText(y0(1));
        } else {
            this.f34504v0.setText(l4);
        }
        N0(this.f34510y0);
        e0 e0Var = this.F0;
        if (e0Var != null && !e0Var.h && !e0Var.f34151i && e0Var.f34153k == null) {
            e0Var.e();
        }
        String s10 = w9.s();
        if (!TextUtils.isEmpty(s10)) {
            this.d.setCardNumber(q0(s10.toUpperCase()));
        }
    }

    public final void L0() {
        float[] fArr;
        float[] fArr2;
        float f7;
        Rect rect = this.H;
        if (!rect.isEmpty() && this.f34509y.isAttachedToWindow()) {
            y4 y4Var = this.d;
            ah.v vVar = this.E;
            Matrix matrix = this.I;
            if (y4Var.i(vVar, matrix)) {
                float width = rect.width();
                float height = rect.height();
                int i10 = 0;
                while (true) {
                    fArr = this.L;
                    fArr2 = this.M;
                    float f10 = 0.0f;
                    if (i10 >= 4) {
                        break;
                    }
                    if (i10 != 1 && i10 != 2) {
                        f7 = 0.0f;
                    } else {
                        f7 = width;
                    }
                    if (i10 >= 2) {
                        f10 = height;
                    }
                    int i11 = i10 * 2;
                    fArr[i11] = f7;
                    int i12 = i11 + 1;
                    fArr[i12] = f10;
                    fArr2[i11] = rect.left + f7;
                    fArr2[i12] = rect.top + f10;
                    i10++;
                }
                matrix.mapPoints(fArr2);
                ah.v vVar2 = this.E;
                int[] iArr = this.P;
                vVar2.getLocationInWindow(iArr);
                View view = this.f34509y;
                int[] iArr2 = this.O;
                view.getLocationInWindow(iArr2);
                this.d.k(this.f34510y0, this.f34507x.getWidth() / 0.7826087f);
                float f11 = iArr2[0] - iArr[0];
                float z10 = org.telegram.ui.Cells.t0.z(height, 0.7826087f, 0.5f, iArr2[1] - iArr[1]);
                for (int i13 = 0; i13 < 4; i13++) {
                    int i14 = i13 * 2;
                    float lerp = AndroidUtilities.lerp(fArr2[i14], (fArr[i14] * 0.7826087f) + f11, this.f34510y0);
                    float[] fArr3 = this.N;
                    fArr3[i14] = lerp;
                    int i15 = i14 + 1;
                    fArr3[i15] = AndroidUtilities.lerp(fArr2[i15], (fArr[i15] * 0.7826087f) + z10, this.f34510y0);
                }
                Matrix matrix2 = this.K;
                boolean polyToPoly = matrix2.setPolyToPoly(this.L, 0, this.N, 0, 4);
                Matrix matrix3 = this.J;
                if (polyToPoly && !matrix3.equals(matrix2)) {
                    matrix3.set(matrix2);
                    this.E.invalidate();
                }
                y4 y4Var2 = this.d;
                Matrix matrix4 = y4Var2.f34971c;
                Matrix matrix5 = y4Var2.e;
                Matrix matrix6 = y4Var2.d;
                if (matrix.invert(matrix6)) {
                    matrix5.setConcat(matrix6, matrix3);
                    if (!y4Var2.f34986r || !matrix4.equals(matrix5)) {
                        matrix4.set(matrix5);
                        y4Var2.f34986r = true;
                        y4Var2.R.invalidate();
                    }
                }
                float lerp2 = AndroidUtilities.lerp(1.0f, 1.0952381f, this.f34510y0);
                this.f34504v0.setPivotX(0.0f);
                this.f34504v0.setPivotY(0.0f);
                this.f34504v0.setScaleX(lerp2);
                this.f34504v0.setScaleY(lerp2);
            }
        }
    }

    public final void M0() {
        ah.v vVar;
        float clamp;
        boolean z10;
        float f7;
        y4 y4Var;
        int i10;
        ?? r16;
        boolean z11;
        LinearLayout linearLayout;
        boolean z12;
        float min;
        float f10;
        float height;
        y4 y4Var2;
        if (this.f31190a != null && this.d != null && this.f34502t0 != null && this.f34509y != null && (vVar = this.E) != null && this.actionBar != null) {
            vVar.bringToFront();
            View m10 = this.f31190a.V2.m(this.f34485f);
            if (m10 == null) {
                if (this.f31190a.V2.L0() > this.f34485f) {
                    clamp = 1.0f;
                } else {
                    clamp = 0.0f;
                }
            } else {
                clamp = Utilities.clamp((this.f31190a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
            }
            this.f34511z0 = clamp;
            int i11 = (this.J0 > 0.0f ? 1 : (this.J0 == 0.0f ? 0 : -1));
            if (i11 <= 0 && this.I0 <= 0.0f) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (i11 > 0) {
                    clamp = 0.0f;
                } else {
                    clamp = (1.0f - this.I0) * clamp;
                }
            }
            this.f34510y0 = clamp;
            P0();
            if (m10 != null) {
                f7 = Math.max(0.0f, (m10.getHeight() / 2.0f) + AndroidUtilities.dp(24.0f)) * this.f34510y0;
            } else {
                f7 = 0.0f;
            }
            float lerp = AndroidUtilities.lerp(1.0f, 0.8f, this.f34510y0);
            this.d.setPivotX(y4Var.getWidth() * 0.5f);
            this.d.setPivotY(0.0f);
            this.d.setScaleX(lerp);
            this.d.setScaleY(lerp);
            this.d.setAlpha(1.0f - Utilities.clamp01(AndroidUtilities.ilerp(clamp, 0.75f, 1.0f)));
            y4 y4Var3 = this.d;
            if (m10 != null && clamp < 1.0f && m10.getBottom() > this.f31190a.getPaddingTop() && m10.getTop() < this.f31190a.getHeight() - this.f31190a.getPaddingBottom()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            y4Var3.setVisibility(i10);
            int[] iArr = this.R;
            int[] iArr2 = this.Q;
            if (m10 != null) {
                this.f31190a.getLocationInWindow(iArr2);
                this.h.getLocationInWindow(iArr);
                r16 = 1;
                this.d.setTranslationX(((this.e.getWidth() - this.d.getWidth()) / 2.0f) + this.e.getX() + m10.getX() + (iArr2[0] - iArr[0]));
                this.d.setTranslationY(this.e.getY() + m10.getY() + (iArr2[1] - iArr[1]) + f7);
            } else {
                r16 = 1;
            }
            if (z10) {
                if (this.J0 == 0.0f) {
                    z12 = r16;
                } else {
                    z12 = false;
                }
                float f11 = this.I0;
                if (z12) {
                    min = 0.3f * f11;
                    f10 = 0.6f;
                } else {
                    min = Math.min(1.0f, 1.8f * f11) * 0.06f;
                    f10 = 0.84f;
                }
                float f12 = min + f10;
                this.actionBar.getLocationInWindow(iArr2);
                this.h.getLocationInWindow(iArr);
                float dp = AndroidUtilities.dp(4.0f) + this.actionBar.getHeight() + (iArr2[r16] - iArr[r16]);
                float f13 = 1.0f - f11;
                if (z12) {
                    height = 0.0f;
                } else {
                    height = this.d.getHeight() * 0.35f;
                }
                float f14 = dp - (f13 * height);
                if (z12) {
                    f14 = a1.g.B(0.9f - f12, this.d.getHeight(), 2.0f, f14);
                }
                float width = (this.h.getWidth() - this.d.getWidth()) / 2.0f;
                if (!z12) {
                    f11 = Math.min(1.0f, f11 * 2.0f);
                }
                if (m10 != null) {
                    this.f31190a.getLocationInWindow(iArr2);
                    float width2 = ((this.e.getWidth() - this.d.getWidth()) / 2.0f) + this.e.getX() + m10.getX() + (iArr2[0] - iArr[0]);
                    float y3 = this.e.getY() + m10.getY() + (iArr2[r16] - iArr[r16]);
                    float clamp01 = Utilities.clamp01(1.0f - ((f14 - y3) / (this.d.getHeight() * 0.5f)));
                    if (clamp01 >= 1.0f) {
                        AndroidUtilities.cancelRunOnUIThread(this.L0);
                        ValueAnimator valueAnimator = this.K0;
                        if (valueAnimator != null) {
                            this.K0 = null;
                            valueAnimator.cancel();
                        }
                        this.I0 = 0.0f;
                        this.J0 = 0.0f;
                        M0();
                        return;
                    }
                    width = AndroidUtilities.lerp(width, width2, clamp01);
                    f14 = AndroidUtilities.lerp(f14, y3, clamp01);
                    f12 = AndroidUtilities.lerp(f12, 1.0f, clamp01);
                    f11 = AndroidUtilities.lerp(f11, 1.0f, clamp01);
                }
                this.d.setPivotX(y4Var2.getWidth() * 0.5f);
                this.d.setPivotY(0.0f);
                this.d.setScaleX(f12);
                this.d.setScaleY(f12);
                this.d.setTranslationX(width);
                this.d.setTranslationY(f14);
                this.d.setAlpha(f11);
                this.d.setVisibility(0);
            }
            if (clamp > 0.0f) {
                z11 = r16;
            } else {
                z11 = false;
            }
            if (this.F != z11 && (linearLayout = this.f34502t0) != null) {
                Rect rect = this.H;
                if (z11) {
                    if (linearLayout.getWidth() != 0 && this.f34502t0.getHeight() != 0) {
                        rect.set(this.f34502t0.getLeft(), this.f34502t0.getTop(), this.f34502t0.getRight(), this.f34502t0.getBottom());
                    }
                }
                this.d.setOnFrontContentPresented(null);
                this.G = false;
                AndroidUtilities.removeFromParent(this.f34502t0);
                this.F = z11;
                if (z11) {
                    this.E.addView(this.f34502t0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                    this.f34502t0.layout(0, 0, rect.width(), rect.height());
                    L0();
                } else {
                    y4 y4Var4 = this.d;
                    y4Var4.k(0.0f, 0.0f);
                    LinearLayout linearLayout2 = y4Var4.Q;
                    AndroidUtilities.removeFromParent(linearLayout2);
                    linearLayout2.setScaleX(1.0f);
                    linearLayout2.setScaleY(1.0f);
                    linearLayout2.setRotationX(0.0f);
                    linearLayout2.setRotationY(0.0f);
                    linearLayout2.setTranslationX(0.0f);
                    linearLayout2.setTranslationY(0.0f);
                    t5 t5Var = y4Var4.S;
                    t5Var.setScaleX(1.0f);
                    t5Var.setScaleY(1.0f);
                    y4Var4.H.addView(linearLayout2, y4Var4.T);
                    this.f34502t0.layout(rect.left, rect.top, rect.right, rect.bottom);
                    this.G = !this.d.f34987s;
                    L0();
                    if (this.G) {
                        this.d.setOnFrontContentPresented(new m3(this, 9));
                    }
                }
                this.E.invalidate();
            }
            N0(clamp);
            if (this.F) {
                L0();
            }
            float f15 = 1.0f - clamp;
            float f16 = (1.0f - f15) * (-AndroidUtilities.dp(8.0f));
            if (this.actionBar.getTitleTextView() != null) {
                this.actionBar.getTitleTextView().setAlpha(f15);
                this.actionBar.getTitleTextView().setTranslationY(f16);
            }
            if (this.actionBar.getTitleTextView2() != null) {
                this.actionBar.getTitleTextView2().setAlpha(f15);
                this.actionBar.getTitleTextView2().setTranslationY(f16);
            }
        }
    }

    public final void N0(float f7) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.G6);
        this.f34503u0.setTextColor(AndroidUtilities.lerpColor(-1, themedColor, f7));
        org.telegram.ui.Components.q6 q6Var = this.f34504v0;
        float[] fArr = this.d.f34974e0;
        int i10 = -7868417;
        if (fArr != null) {
            i10 = i0.b.f(fArr[8], k7.m(fArr, -7868417, 0), k7.m(fArr, -7868417, 3));
        }
        q6Var.setTextColor(AndroidUtilities.lerpColor(i10, i0.b.o(themedColor, Math.round(142.8f)), f7));
        u5 u5Var = this.f34506w0;
        if (u5Var != null) {
            u5Var.setOverrideColor(AndroidUtilities.lerpColor(-1, getThemedColor(org.telegram.ui.ActionBar.h6.Oh), f7));
        }
        b5 b5Var = this.f34508x0;
        if (b5Var != null) {
            float[] fArr2 = this.d.f34974e0;
            int i11 = -9577217;
            if (fArr2 != null) {
                i11 = i0.b.f(fArr2[8], k7.m(fArr2, -9577217, 0), k7.m(fArr2, -9577217, 3));
            }
            b5Var.f34038a = i0.b.o(i11, Math.round((1.0f - f7) * 255.0f));
        }
        this.f34503u0.invalidate();
    }

    public final void O0(float[] fArr) {
        boolean z10;
        float f7;
        int l4;
        if (this.C0 != null && this.D0 != null) {
            float f10 = k7.h(getThemedColor(org.telegram.ui.ActionBar.h6.f20928a7))[0];
            if (f10 < 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Oh);
            float f11 = 0.0f;
            if (fArr != null && fArr.length >= 18) {
                int[] iArr = new int[2];
                for (int i10 = 0; i10 < 2; i10++) {
                    int i11 = i10 * 4;
                    float f12 = fArr[i11 + 10];
                    if (f12 < 0.0f) {
                        l4 = themedColor;
                    } else {
                        l4 = k7.l(themedColor, (int) f12, (int) fArr[i11 + 11]);
                    }
                    iArr[i10] = l4;
                }
                themedColor = i0.b.f(fArr[8], iArr[0], iArr[1]);
            }
            if (z10) {
                f11 = f10 + 0.25f;
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = f10 - 0.2f;
            }
            float[] h = k7.h(themedColor);
            float f13 = h[0];
            int i12 = -16777216;
            if (f13 < f11 || f13 > f7) {
                themedColor = (themedColor & (-16777216)) | (k7.j(Math.max(f11, Math.min(f7, f13)), h[1], h[2]) & 16777215);
            }
            if (themedColor != this.M0) {
                this.M0 = themedColor;
                if (i0.b.h(themedColor) <= 0.550000011920929d) {
                    i12 = getThemedColor(org.telegram.ui.ActionBar.h6.Sh);
                }
                ei.d[] dVarArr = {this.C0, this.D0};
                for (int i13 = 0; i13 < 2; i13++) {
                    ei.d dVar = dVarArr[i13];
                    dVar.setColor(themedColor);
                    dVar.setTextColor(i12);
                }
            }
        }
    }

    public final void P0() {
        u61 u61Var = this.f31190a;
        if (u61Var != null && this.d != null) {
            float b10 = u61Var.C2.b(1);
            float min = Math.min(10.0f, this.f31190a.C2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f));
            this.d.setAdditionalTilt(Math.max(0.0f, (this.f34510y0 * 10.0f) + ((((float) Math.sqrt(Utilities.clamp01(this.f34510y0))) * 90.0f) - 10.0f)) + min);
            this.d.setUseGyroscope(1.0f - ((float) Math.pow(this.f34510y0, 0.33000001311302185d)));
        }
    }

    public final void Q0(boolean z10) {
        boolean G0 = G0();
        u61 u61Var = this.f31190a;
        a71[] a71VarArr = this.f34501s0;
        if (u61Var != null && this.f34496p0 != G0) {
            this.f34496p0 = G0;
            u61Var.B0();
            for (a71 a71Var : a71VarArr) {
                if (a71Var != null) {
                    a71Var.B0();
                }
            }
            this.f31190a.W2.N(false);
            this.f31190a.V2.h1(0, 0);
            this.f31190a.post(new m3(this, 11));
        }
        if (!G0) {
            for (a71 a71Var2 : a71VarArr) {
                if (a71Var2 != null) {
                    R0(a71Var2, z10);
                }
            }
            ai.r rVar = this.f34495o0;
            if (rVar != null) {
                rVar.post(new m3(this, 5));
                this.f34495o0.post(new m3(this, 6));
            }
        }
    }

    public final void S0() {
        q8 q8Var = this.f34490j0;
        if (q8Var != null && this.f34497q0 != null && q8Var.f34814w != 0.0f) {
            q8Var.f34814w = 0.0f;
            q8Var.f34809c.setVisibility(8);
            q8Var.invalidate();
        }
    }

    public final void T0() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.T == null) {
            return;
        }
        m0 w9 = m0.w(this.currentAccount);
        boolean z13 = false;
        if (this.T.isAttachedToWindow() && this.T.isLaidOut()) {
            z10 = true;
        } else {
            z10 = false;
        }
        u4 u4Var = this.T;
        FrameLayout frameLayout = this.U;
        Boolean bool = w9.f34556i;
        if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(w9.f34557j)) {
            z11 = true;
        } else {
            z11 = false;
        }
        u4Var.i(frameLayout, z11, z10);
        ArrayList arrayList = w9.G;
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i0 i0Var = (i0) obj;
            if (!i0Var.e) {
                long j11 = i0Var.f34302c;
                if (j11 >= 0) {
                    j10 += j11;
                }
            }
        }
        if (j10 > 500000000) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            this.X.setText(s0(R.string.WalletOldWalletsBalance, j10));
        }
        this.T.i(this.W, z12, z10);
        long j12 = ai.fa.y(this.currentAccount, true).p().amount;
        if (j12 > 500000000) {
            z13 = true;
        }
        if (z13) {
            this.Z.setText(s0(R.string.WalletGramEarningsBalance, j12));
        }
        this.T.i(this.Y, z13, z10);
    }

    @Override
    public final void U(ArrayList arrayList, s61 s61Var) {
        m0 w9 = m0.w(this.currentAccount);
        T0();
        arrayList.add(f61.l(this.S));
        this.f34485f = arrayList.size();
        v4 v4Var = this.e;
        f61 f61Var = new f61(-4);
        f61Var.f26134c = v4Var;
        f61Var.f26153z = -1;
        f61Var.e = true;
        arrayList.add(f61Var);
        arrayList.add(f61.l(this.A0));
        boolean G0 = G0();
        this.f34496p0 = G0;
        if (G0) {
            int i10 = R.drawable.wallet_learn_instant;
            String string = LocaleController.getString(R.string.WalletSendInstantly);
            String string2 = LocaleController.getString(R.string.WalletSendInstantlyInfo);
            int i11 = c5.f34079a;
            f61 J = f61.J(c5.class);
            J.f26139k = i10;
            J.f26140l = string;
            J.f26141m = string2;
            arrayList.add(J);
            int i12 = R.drawable.wallet_learn_fees;
            String string3 = LocaleController.getString(R.string.WalletNoFees);
            String string4 = LocaleController.getString(R.string.WalletNoFeesInfo);
            f61 J2 = f61.J(c5.class);
            J2.f26139k = i12;
            J2.f26140l = string3;
            J2.f26141m = string4;
            arrayList.add(J2);
            int i13 = R.drawable.wallet_learn_verified;
            String string5 = LocaleController.getString(R.string.WalletBlockchainVerified);
            String string6 = LocaleController.getString(R.string.WalletBlockchainVerifiedInfo);
            f61 J3 = f61.J(c5.class);
            J3.f26139k = i13;
            J3.f26140l = string5;
            J3.f26141m = string6;
            arrayList.add(J3);
            arrayList.add(f61.l(this.f34481b0));
        } else if (this.f34495o0 != null) {
            if (this.Q0 && !this.R0 && w9.u() > 500000000) {
                arrayList.add(f61.k(this.f34483d0));
            }
            arrayList.add(f61.p(this.f34495o0, 0, true));
        }
        x90 x90Var = this.f34480a0;
        if (x90Var != null) {
            this.f34482c0 = false;
            x90Var.animate().cancel();
            this.f34480a0.setAlpha(0.0f);
            this.f34480a0.setVisibility(4);
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletTitle);
    }

    @Override
    public final void W(f61 f61Var, View view) {
        e0 e0Var;
        Object obj = f61Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            A0((TL_wallet.nftItem) obj);
        } else if (f61Var.d == -10001 && (e0Var = this.F0) != null) {
            e0Var.e();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            z0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) f61Var.G, null, null, null, null, getResourceProvider());
        }
    }

    @Override
    public final boolean X(f61 f61Var, View view) {
        w7 w7Var;
        if ((view instanceof j7) && (w7Var = this.f34491k0) != null) {
            w7Var.U((j7) view);
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        w7 w7Var = this.f34491k0;
        if ((w7Var == null || !w7Var.f35066k0) && super.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        ValueAnimator valueAnimator = this.f34494n0;
        if (valueAnimator != null) {
            this.f34494n0 = null;
            valueAnimator.cancel();
        }
        J0();
        h5 h5Var = this.f34499r0;
        if (h5Var != null) {
            h5Var.b(null);
        }
        this.e = null;
        this.T = null;
        this.S = null;
        this.f34495o0 = null;
        this.f34497q0 = null;
        a71[] a71VarArr = this.f34501s0;
        a71VarArr[0] = null;
        a71VarArr[1] = null;
        e0 e0Var = this.F0;
        if (e0Var != null && !e0Var.f34146a.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34487g0 = z10;
        if (!z10) {
            this.f34486f0 = 0;
        } else if (this.G0) {
            this.f34486f0 = 1;
        }
        w7 w7Var = this.f34491k0;
        if (w7Var != null) {
            w7Var.p();
        }
        this.f34491k0 = null;
        View createView = super.createView(context);
        nc0 nc0Var = new nc0(this, context);
        nc0Var.addView(createView, w7.z5.d(-1.0f, -1));
        this.fragmentView = nc0Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20928a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        n10.a(2, R.drawable.scan_qr).setOnClickListener(new View.OnClickListener(this) {
            public final l5 f34669b;

            {
                this.f34669b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l5 l5Var = this.f34669b;
                        l5Var.getClass();
                        l5Var.presentFragment(new xf1(6, null));
                        return;
                    case 1:
                        l5.c0(this.f34669b);
                        return;
                    case 2:
                        l5.f0(this.f34669b);
                        return;
                    case 3:
                        this.f34669b.D0();
                        return;
                    default:
                        l5.a0(this.f34669b);
                        return;
                }
            }
        });
        n10.a(1, R.drawable.ic_ab_other).setOnClickListener(new ef0(26, this, context));
        ah.x xVar = new ah.x(this, context, 27);
        this.S = xVar;
        xVar.setClipToPadding(false);
        this.S.setClipChildren(false);
        this.S.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        u4 u4Var = new u4(this, context);
        this.T = u4Var;
        u4Var.setDefaultRadiusDp(22);
        this.T.setOnAnimatedHeightChangedListener(new m3(this, 12));
        TextView textView = new TextView(context);
        this.V = textView;
        textView.setText(LocaleController.getString(R.string.WalletWaltFunds));
        this.U = p0(this.V, new m3(this, 0));
        TextView textView2 = new TextView(context);
        this.X = textView2;
        this.W = p0(textView2, new m3(this, 1));
        TextView textView3 = new TextView(context);
        this.Z = textView3;
        this.Y = p0(textView3, new m3(this, 2));
        this.S.addView(this.T, w7.z5.d(-2.0f, -1));
        x90 x90Var = new x90(context, null);
        this.f34480a0 = x90Var;
        this.f34482c0 = false;
        x90Var.setAlpha(0.0f);
        x90 x90Var2 = this.f34480a0;
        int i11 = org.telegram.ui.ActionBar.h6.f21391z6;
        x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, this.resourceProvider));
        this.f34480a0.setTextSize(1, 13.0f);
        this.f34480a0.setGravity(17);
        this.f34480a0.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, this.resourceProvider), new n3(context, 0)));
        this.f34480a0.setVisibility(4);
        ((FrameLayout) createView).addView(this.f34480a0, w7.z5.a(-2.0f, 12.0f, 0.0f, 12.0f, 24.0f, -1, 81));
        v4 v4Var = new v4(this, context, 0);
        this.f34481b0 = v4Var;
        v4Var.setImportantForAccessibility(2);
        this.f34483d0 = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34484e0 = frameLayout;
        int i12 = org.telegram.ui.ActionBar.h6.f20986d6;
        int themedColor = getThemedColor(i12);
        int themedColor2 = getThemedColor(i12);
        int i13 = org.telegram.ui.ActionBar.h6.f21075i6;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.a0(themedColor, org.telegram.ui.ActionBar.h6.v(themedColor2, getThemedColor(i13)), 16, 16));
        this.f34483d0.addView(this.f34484e0, w7.z5.a(-2.0f, 12.0f, 0.0f, 12.0f, 12.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        float dpf2 = AndroidUtilities.dpf2(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2}, null, null));
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.f34484e0.addView(imageView, w7.z5.a(28.0f, 14.0f, 11.0f, 16.0f, 11.0f, 28, 19));
        TextView textView4 = new TextView(context);
        wh.o(org.telegram.ui.ActionBar.h6.f21224q7, this.resourceProvider, textView4, 1, 16.0f);
        textView4.setText(LocaleController.getString(R.string.WalletProtectAccount));
        this.f34484e0.addView(textView4, w7.z5.a(-2.0f, 58.0f, 0.0f, 32.0f, 0.0f, -1, 19));
        this.f34484e0.setOnClickListener(new View.OnClickListener(this) {
            public final l5 f34669b;

            {
                this.f34669b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        l5 l5Var = this.f34669b;
                        l5Var.getClass();
                        l5Var.presentFragment(new xf1(6, null));
                        return;
                    case 1:
                        l5.c0(this.f34669b);
                        return;
                    case 2:
                        l5.f0(this.f34669b);
                        return;
                    case 3:
                        this.f34669b.D0();
                        return;
                    default:
                        l5.a0(this.f34669b);
                        return;
                }
            }
        });
        w7.b6.b(this.f34484e0, 0.02f, 1.2f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f34507x = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.f34507x.setClipToPadding(false);
        this.actionBar.addView(this.f34507x, w7.z5.a(56.0f, 64.0f, 0.0f, 96.0f, 0.0f, -1, 87));
        View view = new View(context);
        this.f34509y = view;
        this.f34507x.addView(view, w7.z5.e(1, 1, 19));
        this.F = false;
        this.G = false;
        this.H.setEmpty();
        this.J.reset();
        ah.v vVar = new ah.v(this, context);
        this.E = vVar;
        vVar.setClipChildren(false);
        this.E.setClipToPadding(false);
        y4 y4Var = new y4(this, context, this.f34505w);
        this.d = y4Var;
        y4Var.setDiamondOnCard(true);
        this.d.setCardOnClickListener(new View.OnClickListener(this) {
            public final l5 f34669b;

            {
                this.f34669b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        l5 l5Var = this.f34669b;
                        l5Var.getClass();
                        l5Var.presentFragment(new xf1(6, null));
                        return;
                    case 1:
                        l5.c0(this.f34669b);
                        return;
                    case 2:
                        l5.f0(this.f34669b);
                        return;
                    case 3:
                        this.f34669b.D0();
                        return;
                    default:
                        l5.a0(this.f34669b);
                        return;
                }
            }
        });
        this.f31190a.C2.f32212b.add(this.v);
        v4 v4Var2 = new v4(this, context, 1);
        this.e = v4Var2;
        v4Var2.setImportantForAccessibility(2);
        z4 z4Var = new z4(this, context);
        this.h = z4Var;
        z4Var.setClipChildren(false);
        this.h.setClipToPadding(false);
        this.h.addView(this.d, w7.z5.d(-2.0f, -1));
        nc0Var.addView(this.h, w7.z5.d(-1.0f, -1));
        this.f31190a.setClipChildren(false);
        this.f31190a.setClipToPadding(false);
        this.f34502t0 = this.d.getBalanceLayout();
        this.f34503u0 = this.d.getBalanceView();
        this.f34504v0 = this.d.getUsdBalanceView();
        this.d.setCardHolder(UserObject.getUserName(getUserConfig().getCurrentUser()).toUpperCase());
        this.B0 = 0.0f;
        sa1 sa1Var = new sa1(this, context, 19);
        this.A0 = sa1Var;
        sa1Var.setOrientation(0);
        this.A0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.C0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletAddFunds));
        this.A0.addView(this.C0, w7.z5.m(1.0f, 0, 48, 0, 4, 0));
        this.C0.setOnClickListener(new View.OnClickListener(this) {
            public final l5 f34669b;

            {
                this.f34669b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        l5 l5Var = this.f34669b;
                        l5Var.getClass();
                        l5Var.presentFragment(new xf1(6, null));
                        return;
                    case 1:
                        l5.c0(this.f34669b);
                        return;
                    case 2:
                        l5.f0(this.f34669b);
                        return;
                    case 3:
                        this.f34669b.D0();
                        return;
                    default:
                        l5.a0(this.f34669b);
                        return;
                }
            }
        });
        ei.d dVar2 = new ei.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.D0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.WalletSend));
        this.D0.setEnabled(m0.w(this.currentAccount).d());
        this.D0.setOnClickListener(new View.OnClickListener(this) {
            public final l5 f34669b;

            {
                this.f34669b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        l5 l5Var = this.f34669b;
                        l5Var.getClass();
                        l5Var.presentFragment(new xf1(6, null));
                        return;
                    case 1:
                        l5.c0(this.f34669b);
                        return;
                    case 2:
                        l5.f0(this.f34669b);
                        return;
                    case 3:
                        this.f34669b.D0();
                        return;
                    default:
                        l5.a0(this.f34669b);
                        return;
                }
            }
        });
        this.A0.addView(this.D0, w7.z5.m(1.0f, 0, 48, 4, 0, 0));
        O0(this.d.getStickerStyle());
        this.E0 = m0.w(this.currentAccount).A();
        this.f31190a.setDescendantFocusability(131072);
        w7 w7Var2 = new w7(this, this.d, new n2.e(this, nc0Var, false, 12), null);
        this.f34491k0 = w7Var2;
        nc0Var.addView(w7Var2, w7.z5.d(-1.0f, -1));
        this.f34492l0 = "";
        ai.r rVar = new ai.r(context, 8);
        this.f34495o0 = rVar;
        rVar.setOrientation(1);
        this.f34495o0.setBackgroundColor(getThemedColor(i10));
        ei.h1 h1Var = new ei.h1(this, context, this.resourceProvider, 10);
        this.f34497q0 = h1Var;
        h1Var.setAllowDisallowInterceptTouch(false);
        this.f34497q0.setAdapter(new h4(this, context));
        b91 n11 = this.f34497q0.n(-2, true);
        this.f34488h0 = n11;
        n11.g(i11, org.telegram.ui.ActionBar.h6.G6, i11, i13, i12);
        this.f34488h0.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(20.0f), getThemedColor(i12)));
        this.f34489i0 = new FrameLayout(context);
        q8 q8Var = new q8(context, this.f34488h0, this.resourceProvider, new y3(this, 0), new y3(this, 1), new y3(this, 2));
        this.f34490j0 = q8Var;
        this.f34489i0.addView(q8Var, w7.z5.a(40.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 48));
        this.f34497q0.setPosition(this.f34486f0);
        S0();
        this.f34495o0.addView(this.f34489i0, w7.z5.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 52));
        this.f34495o0.addView(this.f34497q0, w7.z5.l(1.0f, -1, 0));
        E0(this.f34487g0);
        e0 e0Var2 = this.F0;
        if (e0Var2 != null) {
            this.f34491k0.a0(e0Var2);
        }
        this.f31190a.j(new kv(this, 14));
        s61 s61Var = this.f31190a.W2;
        s61Var.f30200r = false;
        s61Var.N(false);
        h5 h5Var2 = new h5(this);
        this.f34499r0 = h5Var2;
        h5Var2.b(this.f31190a);
        K0();
        this.E0.g();
        this.actionBar.post(new m3(this, 10));
        this.f31190a.post(new m3(this, 11));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u61 u61Var;
        s61 s61Var;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.walletUpdate && this.f34503u0 != null) {
                K0();
                Iterator it = this.O0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } else if (i10 == NotificationCenter.starBalanceUpdated) {
                T0();
            } else if (i10 == NotificationCenter.didSetOrRemoveTwoStepPassword) {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof TL_account.Password) {
                        this.Q0 = true;
                        this.R0 = ((TL_account.Password) obj).has_password;
                        u61 u61Var2 = this.f31190a;
                        if (u61Var2 != null && (s61Var = u61Var2.W2) != null) {
                            s61Var.N(true);
                            return;
                        }
                        return;
                    }
                }
                getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new Object(), new d(this, 7));
            } else if (i10 == NotificationCenter.walletTransactionsUpdate && objArr.length > 0) {
                Object obj2 = objArr[0];
                l0 l0Var = this.E0;
                if (obj2 == l0Var && (u61Var = this.f31190a) != null && u61Var.W2 != null) {
                    if (l0Var.f34456b.isEmpty()) {
                        l0 l0Var2 = this.E0;
                        if (!l0Var2.h) {
                            l0Var2.g();
                        }
                    }
                    Q0(true);
                }
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void n0(boolean z10) {
        float f7;
        long j10;
        bs bsVar;
        AndroidUtilities.cancelRunOnUIThread(this.L0);
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (this.J0 == f7) {
            return;
        }
        this.J0 = f7;
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        M0();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I0, f7);
        this.K0 = ofFloat;
        if (z10) {
            j10 = 260;
        } else {
            j10 = 120;
        }
        ofFloat.setDuration(j10);
        ValueAnimator valueAnimator2 = this.K0;
        if (z10) {
            bsVar = new bs(0.05d, 0.7d, 0.1d, 1.0d);
        } else {
            bsVar = new bs(0.4d, 0.0d, 0.2d, 1.0d);
        }
        valueAnimator2.setInterpolator(bsVar);
        this.K0.addUpdateListener(new x3(this, 1));
        this.K0.addListener(new vf1(this, 4));
        this.K0.start();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        q8 q8Var = this.f34490j0;
        if (q8Var != null && q8Var.f34815x) {
            if (z10) {
                q8Var.b(false);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBeginSlide() {
        h5 h5Var = this.f34499r0;
        if (h5Var != null) {
            h5Var.c();
        }
        u61 u61Var = this.f31190a;
        if (u61Var != null) {
            u61Var.B0();
        }
        a71 t02 = t0();
        if (t02 != null) {
            t02.B0();
        }
        super.onBeginSlide();
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().addObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        m0 w9 = m0.w(this.currentAccount);
        if (w9.f34562o == null) {
            w9.f34562o = new e0(w9);
        }
        e0 e0Var = w9.f34562o;
        this.F0 = e0Var;
        ArrayList arrayList = e0Var.d;
        m3 m3Var = this.H0;
        if (!arrayList.contains(m3Var)) {
            arrayList.add(m3Var);
        }
        j jVar = this.S0;
        if (jVar != null) {
            jVar.run();
        }
        int i10 = w9.D;
        w9.D = i10 + 1;
        HashSet hashSet = w9.E;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i10));
        if (isEmpty) {
            w9.Q();
        }
        this.S0 = new j(w9, i10, 0);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new Object(), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        AndroidUtilities.cancelRunOnUIThread(this.L0);
        ValueAnimator valueAnimator = this.K0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        w7 w7Var = this.f34491k0;
        if (w7Var != null) {
            w7Var.p();
        }
        y4 y4Var = this.d;
        if (y4Var != null) {
            y4Var.setOnFrontContentPresented(null);
        }
        this.G = false;
        ValueAnimator valueAnimator2 = this.f34494n0;
        if (valueAnimator2 != null) {
            this.f34494n0 = null;
            valueAnimator2.cancel();
        }
        e0 e0Var = this.F0;
        if (e0Var != null) {
            e0Var.d.remove(this.H0);
        }
        J0();
        h5 h5Var = this.f34499r0;
        if (h5Var != null) {
            h5Var.b(null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        AndroidUtilities.removeFromParent(this.E);
        l0 l0Var = this.E0;
        if (l0Var != null) {
            l0Var.a();
        }
        super.onFragmentDestroy();
        j jVar = this.S0;
        if (jVar != null) {
            jVar.run();
            this.S0 = null;
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f31190a.setPadding(0, 0, 0, i13);
        this.f31190a.setClipToPadding(false);
        x90 x90Var = this.f34480a0;
        if (x90Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x90Var.getLayoutParams();
            layoutParams.bottomMargin = AndroidUtilities.dp(24.0f) + i13;
            this.f34480a0.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                D0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20601a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new p3(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.post(new m3(this, 10));
        }
        m0.w(this.currentAccount).C();
        if (this.F0 != null && m0.w(this.currentAccount).E()) {
            e0 e0Var = this.F0;
            if (!e0Var.f34152j) {
                e0Var.b();
                e0Var.f(true);
            }
        }
        K0();
        if (this.f31190a != null) {
            Q0(true);
        }
    }

    public final FrameLayout p0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21075i6), 2, -1));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 0.0f, 42.0f, 0.0f, -1, 3));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21391z6), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.z5.e(-2, -2, 21));
        frameLayout.setOnClickListener(new t2(runnable, 3));
        textView.setDuplicateParentStateEnabled(true);
        w7.b6.b(textView, 0.02f, 1.2f);
        this.T.addView(frameLayout, w7.z5.n(-1, -2));
        return frameLayout;
    }

    public final CharSequence s0(int i10, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        yq yqVar = new yq(R.drawable.mini_gram_16, 0);
        yqVar.recolorDrawable = false;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Oh);
        spannableStringBuilder.setSpan(yqVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) m0.n(j10, false));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(themedColor), length2, spannableStringBuilder.length(), 33);
        return LocaleController.formatSpannable(i10, spannableStringBuilder);
    }

    public final a71 t0() {
        View currentView;
        if (u0()) {
            ei.h1 h1Var = this.f34497q0;
            if (h1Var == null) {
                currentView = null;
            } else {
                currentView = h1Var.getCurrentView();
            }
            if (currentView instanceof a71) {
                return (a71) currentView;
            }
        }
        return null;
    }

    public final boolean u0() {
        ai.r rVar;
        if (!this.f34496p0 && (rVar = this.f34495o0) != null && rVar.isAttachedToWindow()) {
            ViewParent parent = this.f34495o0.getParent();
            u61 u61Var = this.f31190a;
            if (parent == u61Var.V2.m(u61Var.W2.f30203x.size() - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean v0() {
        View m10;
        u61 u61Var = this.f31190a;
        if (u61Var != null && (m10 = u61Var.V2.m(this.f34485f)) != null && this.f34511z0 < 0.5f && m10.getBottom() > this.f31190a.getPaddingTop()) {
            return true;
        }
        return false;
    }

    public final void w0() {
        e0 e0Var;
        a71 a71Var = this.f34501s0[1];
        if (this.f34486f0 == 1 && a71Var != null && a71Var.G && (e0Var = this.F0) != null && !e0Var.f34151i && !e0Var.f34150g && e0Var.f34153k == null && a71Var.V2.N0() >= a71Var.W2.f30203x.size() - 3) {
            this.F0.e();
        }
    }

    public final void x0() {
        l0 l0Var;
        a71 a71Var = this.f34501s0[0];
        if (a71Var != null && a71Var.G && (l0Var = this.E0) != null && !l0Var.h && a71Var.V2.N0() >= a71Var.W2.f30203x.size() - 3) {
            this.E0.g();
        }
    }

    public final CharSequence y0(int i10) {
        org.telegram.ui.Components.q6 q6Var;
        float f7;
        CharSequence[] charSequenceArr = this.N0;
        if (charSequenceArr[i10] == null) {
            charSequenceArr[i10] = new SpannableString("l");
            if (i10 == 0) {
                q6Var = this.f34503u0;
            } else {
                q6Var = this.f34504v0;
            }
            if (i10 == 0) {
                f7 = 100.0f;
            } else {
                f7 = 50.0f;
            }
            ca0 ca0Var = new ca0(AndroidUtilities.dp(f7), q6Var);
            ca0Var.a(org.telegram.ui.ActionBar.h6.m1(0.45f, -1), org.telegram.ui.ActionBar.h6.m1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i10];
            ((SpannableString) charSequence).setSpan(ca0Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i10];
    }
}
