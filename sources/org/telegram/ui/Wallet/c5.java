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
import org.telegram.messenger.ai;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.y9;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ed0;
import org.telegram.ui.et;
import org.telegram.ui.hh1;
import org.telegram.ui.mu0;
import org.telegram.ui.u9;
import org.telegram.ui.uy0;
public final class c5 extends h71 implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface I0;
    public d0 A0;
    public ci.m6 E;
    public SpannableString E0;
    public boolean F;
    public boolean F0;
    public boolean G;
    public boolean G0;
    public j H0;
    public ai.f0 S;
    public k4 T;
    public FrameLayout U;
    public TextView V;
    public FrameLayout W;
    public TextView X;
    public FrameLayout Y;
    public TextView Z;
    public fa0 f34739a0;
    public l4 f34740b0;
    public boolean f34741c0;
    public o4 d;
    public FrameLayout f34742d0;
    public l4 f34743e;
    public FrameLayout f34744e0;
    public int f34745f;
    public boolean f34747g0;
    public p4 h;
    public p91 f34748h0;
    public z3 f34749i0;
    public float f34750j0;
    public ValueAnimator f34751k0;
    public LinearLayout f34752l0;
    public boolean m0;
    public int f34753n;
    public ci.h1 f34754n0;
    public x4 f34755o0;
    public LinearLayout f34757q0;
    public boolean f34758r;
    public org.telegram.ui.Components.r6 f34759r0;
    public org.telegram.ui.Components.r6 f34761s0;
    public j5 f34762t0;
    public r4 f34763u0;
    public float f34764v0;
    public LinearLayout f34766w0;
    public FrameLayout f34767x;
    public ci.d f34768x0;
    public View f34769y;
    public ci.d f34770y0;
    public k0 f34771z0;
    public final org.telegram.ui.Cells.t6 f34760s = new org.telegram.ui.Cells.t6(this, 28);
    public final m3 v = new du() {
        @Override
        public final void a(int i10, boolean z10) {
            g71 g71Var;
            c5 c5Var = c5.this;
            org.telegram.ui.Cells.t6 t6Var = c5Var.f34760s;
            if ((i10 != 1 && i10 != 3) || (g71Var = c5Var.f26922a) == null) {
                return;
            }
            c5Var.f34758r = z10;
            g71Var.removeCallbacks(t6Var);
            t6Var.run();
        }
    };
    public boolean f34765w = false;
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
    public int f34746f0 = 0;
    public final m71[] f34756p0 = new m71[2];
    public final h3 B0 = new h3(this, 4);
    public final CharSequence[] C0 = new CharSequence[2];
    public final HashSet D0 = new HashSet();

    public static void Y(c5 c5Var, Context context, View view) {
        boolean z10;
        int i10;
        l0 v = l0.v(c5Var.currentAccount);
        final q80 I = q80.I(c5Var, view);
        I.a0(0.0f, -AndroidUtilities.dp(48.0f));
        I.f30083s = 0;
        I.V(5);
        q80 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.WalletBack), new mu0(I, 26), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        o6 o6Var = new o6(c5Var, linearLayout, v, I, 9);
        J.r(scrollView, w7.x5.n(-1, 350));
        I.c(R.drawable.wallet_globe, LocaleController.getString(R.string.WalletCurrency), new m(o6Var, I, J, 8), false);
        org.telegram.ui.ActionBar.e1 y3 = I.y();
        f fVar = v.h;
        String i11 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i11);
        String str = i11;
        if (isEmpty) {
            y3.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Loading));
            spannableStringBuilder.setSpan(new ka0(AndroidUtilities.dp(75.0f), y3.f20549b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y3.setSubtext(str);
        if (fVar.f() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        o6 o6Var2 = new o6(v, new boolean[]{z10}, y3, o6Var, 10);
        c5Var.D0.add(o6Var2);
        o6Var.run();
        I.c(R.drawable.wallet_lock, LocaleController.getString(R.string.Passcode), new Runnable(c5Var) {
            public final c5 f35501b;

            {
                this.f35501b = c5Var;
            }

            @Override
            public final void run() {
                o4 o4Var;
                switch (r3) {
                    case 0:
                        c5 c5Var2 = this.f35501b;
                        c5Var2.getClass();
                        I.u();
                        c5Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        c5 c5Var3 = this.f35501b;
                        c5Var3.getClass();
                        I.u();
                        c5Var3.presentFragment(new n7());
                        return;
                    case 2:
                        c5 c5Var4 = this.f35501b;
                        c5Var4.getClass();
                        I.u();
                        c5Var4.presentFragment(new h71());
                        return;
                    case 3:
                        I.u();
                        c5 c5Var5 = this.f35501b;
                        c5.t0(c5Var5.getParentActivity(), c5Var5.getResourceProvider());
                        return;
                    default:
                        I.u();
                        c5 c5Var6 = this.f35501b;
                        boolean z11 = c5Var6.f34765w;
                        boolean z12 = !z11;
                        if (z11 != z12 && (o4Var = c5Var6.d) != null) {
                            c5Var6.f34765w = z12;
                            o4Var.setUse2D(z12);
                            c5Var6.f34743e.requestLayout();
                            c5Var6.d.post(new h3(c5Var6, 11));
                            return;
                        }
                        return;
                }
            }
        }, false);
        I.c(R.drawable.wallet_key, LocaleController.getString(R.string.WalletKeysAndBackup), new Runnable(c5Var) {
            public final c5 f35501b;

            {
                this.f35501b = c5Var;
            }

            @Override
            public final void run() {
                o4 o4Var;
                switch (r3) {
                    case 0:
                        c5 c5Var2 = this.f35501b;
                        c5Var2.getClass();
                        I.u();
                        c5Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        c5 c5Var3 = this.f35501b;
                        c5Var3.getClass();
                        I.u();
                        c5Var3.presentFragment(new n7());
                        return;
                    case 2:
                        c5 c5Var4 = this.f35501b;
                        c5Var4.getClass();
                        I.u();
                        c5Var4.presentFragment(new h71());
                        return;
                    case 3:
                        I.u();
                        c5 c5Var5 = this.f35501b;
                        c5.t0(c5Var5.getParentActivity(), c5Var5.getResourceProvider());
                        return;
                    default:
                        I.u();
                        c5 c5Var6 = this.f35501b;
                        boolean z11 = c5Var6.f34765w;
                        boolean z12 = !z11;
                        if (z11 != z12 && (o4Var = c5Var6.d) != null) {
                            c5Var6.f34765w = z12;
                            o4Var.setUse2D(z12);
                            c5Var6.f34743e.requestLayout();
                            c5Var6.d.post(new h3(c5Var6, 11));
                            return;
                        }
                        return;
                }
            }
        }, false);
        I.l(R.drawable.wallet_apps, LocaleController.getString(R.string.WalletConnectedApps), new Runnable(c5Var) {
            public final c5 f35501b;

            {
                this.f35501b = c5Var;
            }

            @Override
            public final void run() {
                o4 o4Var;
                switch (r3) {
                    case 0:
                        c5 c5Var2 = this.f35501b;
                        c5Var2.getClass();
                        I.u();
                        c5Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        c5 c5Var3 = this.f35501b;
                        c5Var3.getClass();
                        I.u();
                        c5Var3.presentFragment(new n7());
                        return;
                    case 2:
                        c5 c5Var4 = this.f35501b;
                        c5Var4.getClass();
                        I.u();
                        c5Var4.presentFragment(new h71());
                        return;
                    case 3:
                        I.u();
                        c5 c5Var5 = this.f35501b;
                        c5.t0(c5Var5.getParentActivity(), c5Var5.getResourceProvider());
                        return;
                    default:
                        I.u();
                        c5 c5Var6 = this.f35501b;
                        boolean z11 = c5Var6.f34765w;
                        boolean z12 = !z11;
                        if (z11 != z12 && (o4Var = c5Var6.d) != null) {
                            c5Var6.f34765w = z12;
                            o4Var.setUse2D(z12);
                            c5Var6.f34743e.requestLayout();
                            c5Var6.d.post(new h3(c5Var6, 11));
                            return;
                        }
                        return;
                }
            }
        }, true ^ v.f35190g.d.isEmpty());
        I.k();
        I.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsWallet), new Runnable(c5Var) {
            public final c5 f35501b;

            {
                this.f35501b = c5Var;
            }

            @Override
            public final void run() {
                o4 o4Var;
                switch (r3) {
                    case 0:
                        c5 c5Var2 = this.f35501b;
                        c5Var2.getClass();
                        I.u();
                        c5Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        c5 c5Var3 = this.f35501b;
                        c5Var3.getClass();
                        I.u();
                        c5Var3.presentFragment(new n7());
                        return;
                    case 2:
                        c5 c5Var4 = this.f35501b;
                        c5Var4.getClass();
                        I.u();
                        c5Var4.presentFragment(new h71());
                        return;
                    case 3:
                        I.u();
                        c5 c5Var5 = this.f35501b;
                        c5.t0(c5Var5.getParentActivity(), c5Var5.getResourceProvider());
                        return;
                    default:
                        I.u();
                        c5 c5Var6 = this.f35501b;
                        boolean z11 = c5Var6.f34765w;
                        boolean z12 = !z11;
                        if (z11 != z12 && (o4Var = c5Var6.d) != null) {
                            c5Var6.f34765w = z12;
                            o4Var.setUse2D(z12);
                            c5Var6.f34743e.requestLayout();
                            c5Var6.d.post(new h3(c5Var6, 11));
                            return;
                        }
                        return;
                }
            }
        }, false);
        if (BuildVars.DEBUG_VERSION) {
            I.k();
            if (c5Var.f34765w) {
                i10 = R.string.WalletCard3D;
            } else {
                i10 = R.string.WalletCard2D;
            }
            I.c(0, LocaleController.getString(i10), new Runnable(c5Var) {
                public final c5 f35501b;

                {
                    this.f35501b = c5Var;
                }

                @Override
                public final void run() {
                    o4 o4Var;
                    switch (r3) {
                        case 0:
                            c5 c5Var2 = this.f35501b;
                            c5Var2.getClass();
                            I.u();
                            c5Var2.presentFragment(PasscodeActivity.e0());
                            return;
                        case 1:
                            c5 c5Var3 = this.f35501b;
                            c5Var3.getClass();
                            I.u();
                            c5Var3.presentFragment(new n7());
                            return;
                        case 2:
                            c5 c5Var4 = this.f35501b;
                            c5Var4.getClass();
                            I.u();
                            c5Var4.presentFragment(new h71());
                            return;
                        case 3:
                            I.u();
                            c5 c5Var5 = this.f35501b;
                            c5.t0(c5Var5.getParentActivity(), c5Var5.getResourceProvider());
                            return;
                        default:
                            I.u();
                            c5 c5Var6 = this.f35501b;
                            boolean z11 = c5Var6.f34765w;
                            boolean z12 = !z11;
                            if (z11 != z12 && (o4Var = c5Var6.d) != null) {
                                c5Var6.f34765w = z12;
                                o4Var.setUse2D(z12);
                                c5Var6.f34743e.requestLayout();
                                c5Var6.d.post(new h3(c5Var6, 11));
                                return;
                            }
                            return;
                    }
                }
            }, false);
        }
        I.f30078p = new i(7, c5Var, o6Var2);
        I.Z();
    }

    public static void Z(c5 c5Var, String str, l0 l0Var, q80 q80Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        String str2;
        float f7;
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, c5Var.getParentActivity(), c5Var.resourceProvider, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(currencyrate.currency);
        if (!TextUtils.isEmpty(currencyrate.translatedTitle)) {
            str2 = currencyrate.translatedTitle;
        } else {
            str2 = currencyrate.title;
        }
        e1Var.setSubtext(str2);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        TextView textView = e1Var.f20549b;
        if (equals) {
            f7 = 42.0f;
        } else {
            f7 = 0.0f;
        }
        textView.setPadding(0, 0, AndroidUtilities.dp(f7), 0);
        e1Var.setChecked(equals);
        e1Var.setOnClickListener(new n1(l0Var, currencyrate, q80Var, 1));
        linearLayout.addView(e1Var, w7.x5.n(200, -2));
    }

    public static void a0(c5 c5Var) {
        l0 v = l0.v(c5Var.currentAccount);
        ci.d dVar = c5Var.f34770y0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        v.h0(new org.telegram.messenger.camera.i((Object) v, (Object) new et(29, c5Var, v), false, false, 2));
    }

    public static void b0(c5 c5Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (c5Var.E != null && (kVar = c5Var.actionBar) != null && (kVar.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) c5Var.actionBar.getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (c5Var.E.getParent() != c5Var.actionBar) {
                AndroidUtilities.removeFromParent(c5Var.E);
                c5Var.actionBar.addView(c5Var.E, w7.x5.d(-1.0f, -1));
            }
            c5Var.E.bringToFront();
            c5Var.actionBar.bringToFront();
            c5Var.E.post(new h3(c5Var, 11));
        }
    }

    public static void c0(c5 c5Var) {
        u0(c5Var.getParentActivity(), c5Var.currentAccount, c5Var.getResourceProvider());
    }

    public static void d0(c5 c5Var, LinearLayout linearLayout, l0 l0Var, q80 q80Var) {
        TL_wallet.currencyRate currencyrate;
        c5 c5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        l0 l0Var2 = l0Var;
        linearLayout2.removeAllViews();
        String g10 = l0Var2.h.g();
        TL_wallet.currencyRates f7 = l0Var2.h.f();
        if (f7 == null) {
            for (int i10 = 0; i10 < 3; i10++) {
                k10 k10Var = new k10(c5Var.getParentActivity(), c5Var.getResourceProvider());
                k10Var.setIsSingleCell(true);
                k10Var.setViewType(31);
                linearLayout2.addView(k10Var, w7.x5.n(200, -2));
            }
            return;
        }
        f fVar = l0Var2.h;
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            f.a(linkedHashSet, MessagesController.getInstance(fVar.f34877a).config.phoneCountryIso2.get());
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
                Z(c5Var, g10, l0Var2, q80Var, linearLayout2, currencyrate7);
            }
            i13++;
            l0Var2 = l0Var;
        }
        if (!hashSet.isEmpty() && !f7.rates.isEmpty()) {
            c5Var2 = c5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.j1(c5Var.getParentActivity(), c5Var2.resourceProvider), w7.x5.n(-1, 8));
        } else {
            c5Var2 = c5Var;
        }
        int i14 = 0;
        while (i14 < f7.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f7.rates.get(i14);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                Z(c5Var2, g10, l0Var, q80Var, linearLayout2, currencyrate8);
            }
            i14++;
            c5Var2 = c5Var;
            linearLayout2 = linearLayout;
        }
    }

    public static void e0(c5 c5Var) {
        of.f.s(c5Var.getParentActivity(), l0.v(c5Var.currentAccount).f35192j);
    }

    public static void f0(c5 c5Var) {
        u0(c5Var.getParentActivity(), c5Var.currentAccount, c5Var.getResourceProvider());
    }

    public static Typeface h0(Context context) {
        if (I0 == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                I0 = new Typeface.Builder(context.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                I0 = AndroidUtilities.getTypeface("fonts/rmono.ttf");
            }
        }
        return I0;
    }

    public static android.widget.LinearLayout i0(final android.content.Context r42, int r43, org.telegram.tgnet.tl.TL_wallet.walletTransaction r44, org.telegram.messenger.Utilities.Callback3 r45, org.telegram.messenger.Utilities.Callback2 r46, byte[] r47, java.lang.Runnable r48, org.telegram.ui.ActionBar.d6 r49, org.telegram.ui.Wallet.k2[] r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.c5.i0(android.content.Context, int, org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.messenger.Utilities$Callback3, org.telegram.messenger.Utilities$Callback2, byte[], java.lang.Runnable, org.telegram.ui.ActionBar.d6, org.telegram.ui.Wallet.k2[]):android.widget.LinearLayout");
    }

    public static String k0(String str) {
        StringBuilder sb2 = new StringBuilder((str.length() / 4) + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 > 0 && i10 % 4 == 0) {
                sb2.append(' ');
            }
            sb2.append(str.charAt(i10));
        }
        return sb2.toString();
    }

    public static SpannableStringBuilder l0(int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var) {
        BigDecimal stripTrailingZeros;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        er erVar = new er(R.drawable.wallet_gram_small, 2);
        erVar.recolorDrawable = false;
        erVar.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(erVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j3).movePointLeft(9);
        if (movePointLeft.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = movePointLeft.stripTrailingZeros();
        }
        spannableStringBuilder.append((CharSequence) stripTrailingZeros.toPlainString());
        CharSequence l4 = l0.v(i10).l(j3, true);
        if (!TextUtils.isEmpty(l4)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(l4);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21189z6, d6Var)), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static void s0(Context context, int i10, TL_wallet.walletTransaction wallettransaction, Utilities.Callback3 callback3, Utilities.Callback2 callback2, byte[] bArr, org.telegram.ui.Cells.p0 p0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        View[] viewArr;
        ?? r10;
        TL_wallet.walletTransaction wallettransaction2;
        k2[] k2VarArr;
        Utilities.Callback2 callback22;
        LinearLayout linearLayout;
        if (context == null) {
            return;
        }
        boolean z10 = true;
        k2[] k2VarArr2 = new k2[1];
        View[] viewArr2 = new View[1];
        k0 z11 = l0.v(i10).z();
        ArrayList arrayList = new ArrayList(z11.f35142c);
        int i11 = 0;
        while (true) {
            if (i11 < arrayList.size()) {
                if (arrayList.get(i11) == wallettransaction || l0.d0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i11))) {
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
            ?? c4Var = new c4(context, d6Var, z11, arrayList, i10, rect, viewArr);
            c4Var.setPosition(i11);
            k2VarArr = k2VarArr2;
            c4Var.setAdapter(new d4(arrayList, context, d6Var, rect, i10, k2VarArr));
            r10 = 0;
            wallettransaction2 = wallettransaction;
            linearLayout = c4Var;
            callback22 = callback2;
        } else {
            viewArr = viewArr2;
            r10 = 0;
            LinearLayout i02 = i0(context, i10, wallettransaction, callback3, callback2, bArr, p0Var, d6Var, k2VarArr2);
            wallettransaction2 = wallettransaction;
            k2VarArr = k2VarArr2;
            callback22 = callback2;
            linearLayout = i02;
        }
        e4 e4Var = new e4(context, linearLayout, d6Var, linearLayout, viewArr, context);
        k2VarArr[r10] = e4Var;
        if ((linearLayout instanceof q91) && callback22 != null) {
            e4Var.setOnDismissListener(new i(8, callback22, wallettransaction2));
        }
        k2 k2Var = k2VarArr[r10];
        if (callback3 == null) {
            z10 = r10;
        }
        k2Var.setFocusable(z10);
        k2 k2Var2 = k2VarArr[r10];
        k2Var2.useBackgroundTopPadding = r10;
        k2Var2.show();
    }

    public static void t0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        org.telegram.ui.ActionBar.e3 i10 = ai.i(1, context, d6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20857h5, d6Var)));
        frameLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, w7.x5.d(-2.0f, -1));
        linearLayout.addView(new e6(160, context, false), w7.x5.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.WalletHowItWorks));
        ai.o(org.telegram.ui.ActionBar.h6.f20894j5, d6Var, textView, 1, 17.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-1, -2, 1, 0, 0, 0, 6), context);
        h.setText(LocaleController.getString(R.string.WalletHowItWorksInfo));
        int i11 = org.telegram.ui.ActionBar.h6.f21189z6;
        ai.o(i11, d6Var, h, 1, 14.0f);
        h.setGravity(17);
        h.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
        linearLayout.addView(h, w7.x5.t(-1, -2, 1, 0, 0, 0, 24));
        t4 t4Var = new t4(context, d6Var);
        t4Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        t4Var.a(LocaleController.getString(R.string.WalletSendInstantly), LocaleController.getString(R.string.WalletSendInstantlyInfo), R.drawable.wallet_learn_instant);
        linearLayout.addView(t4Var, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        t4 t4Var2 = new t4(context, d6Var);
        t4Var2.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        t4Var2.a(LocaleController.getString(R.string.WalletNoFees), LocaleController.getString(R.string.WalletNoFeesInfo), R.drawable.wallet_learn_fees);
        linearLayout.addView(t4Var2, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        t4 t4Var3 = new t4(context, d6Var);
        t4Var3.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        t4Var3.a(LocaleController.getString(R.string.WalletBlockchainVerified), LocaleController.getString(R.string.WalletBlockchainVerifiedInfo), R.drawable.wallet_learn_verified);
        linearLayout.addView(t4Var3, w7.x5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        ci.d f7 = ai.f(24, context, d6Var, true);
        f7.setText(LocaleController.getString(R.string.WalletGotIt));
        linearLayout.addView(f7, w7.x5.t(-1, 48, 1, 0, 0, 0, 0));
        w7.z5.b(f7, 0.02f, 1.1f);
        fa0 fa0Var = new fa0(context, null);
        fa0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        fa0Var.setTextSize(1, 13.0f);
        fa0Var.setGravity(17);
        fa0Var.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, d6Var), new i3(context, 1)));
        linearLayout.addView(fa0Var, w7.x5.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        i10.customView = frameLayout;
        org.telegram.ui.ActionBar.e3[] e3VarArr = {i10};
        e3VarArr[0].setAllowNestedScroll(true);
        e3VarArr[0].fixNavigationBar();
        f7.setOnClickListener(new s3(e3VarArr, 1));
        e3VarArr[0].show();
    }

    public static void u0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        l0 v = l0.v(i10);
        if (v.D()) {
            String r10 = v.r();
            if (TextUtils.isEmpty(r10)) {
                return;
            }
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, context, d6Var, false);
            e3Var.setBackgroundColor(-12207881);
            e3Var.fixNavigationBar(-12207881);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(new b5());
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, w7.x5.f(-2.0f, 55, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
            a5 a5Var = new a5(context, r10);
            linearLayout.addView(a5Var, w7.x5.q(288, 302, 1));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.WalletReceiveInfo));
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
            linearLayout.addView(textView, w7.x5.t(-1, -2, 1, 24, 0, 24, 20));
            ci.d dVar = new ci.d(context, null, true);
            dVar.setRoundRadius(24);
            dVar.setColor(-1);
            dVar.setTextColor(-15556886);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new er(R.drawable.wallet_buy, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.WalletBuyWithCashOrCrypto));
            dVar.setText(spannableStringBuilder);
            linearLayout.addView(dVar, w7.x5.t(-1, 48, 1, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.ic_close_white);
            imageView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            w7.z5.a(imageView);
            frameLayout.addView(imageView, w7.x5.a(48.0f, 4.0f, 2.0f, 0.0f, 0.0f, 48, 51));
            e3Var.customView = frameLayout;
            e3Var.occupyNavigationBar = true;
            e3Var.setApplyTopPadding(false);
            e3Var.setApplyBottomPadding(false);
            e3Var.fixNavigationBar(-12207881);
            imageView.setOnClickListener(new g3(e3Var, 0));
            a5Var.f34658e = new r0(r10, 1);
            e3Var.show();
            e3Var.setOverlayNavBarColor(-12207881);
            AndroidUtilities.setNavigationBarColor((Dialog) e3Var, -12207881, false);
            AndroidUtilities.setLightNavigationBar((Dialog) e3Var, false);
            if (Build.VERSION.SDK_INT >= 29 && e3Var.getWindow() != null) {
                e3Var.getWindow().setNavigationBarContrastEnforced(false);
            }
            dVar.setOnClickListener(new ai.u7(dVar, i10, e3Var, d6Var, 7));
        }
    }

    public final void A0() {
        boolean z10;
        l0 v = l0.v(this.currentAccount);
        G0();
        ci.d dVar = this.f34770y0;
        if (v.D() && v.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (!v.D()) {
            this.f34759r0.setText(r0(0));
            this.f34761s0.setText(r0(1));
            return;
        }
        long t10 = v.t();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.E0 == null) {
            this.E0 = new SpannableString("G");
            o4 o4Var = this.d;
            o4Var.getClass();
            j5 j5Var = new j5(o4Var, R.drawable.wallet_gram_large);
            this.f34762t0 = j5Var;
            SpannableString spannableString = this.E0;
            spannableString.setSpan(j5Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.E0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) k5.c(t10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        if (this.f34763u0 == null) {
            ?? characterStyle = new CharacterStyle();
            characterStyle.f35503a = -9577217;
            this.f34763u0 = characterStyle;
        }
        spannableStringBuilder.setSpan(this.f34763u0, length, spannableStringBuilder.length(), 33);
        this.f34759r0.setText(spannableStringBuilder);
        CharSequence l4 = l0.v(this.currentAccount).l(t10, false);
        if (TextUtils.isEmpty(l4)) {
            this.f34761s0.setText(r0(1));
        } else {
            this.f34761s0.setText(l4);
        }
        D0(this.f34764v0);
        d0 d0Var = this.A0;
        if (d0Var != null && !d0Var.h && !d0Var.f34793i && d0Var.f34795k == null) {
            d0Var.d();
        }
        String r10 = v.r();
        if (!TextUtils.isEmpty(r10)) {
            this.d.setCardNumber(k0(r10.toUpperCase()));
        }
    }

    public final void B0() {
        float[] fArr;
        float[] fArr2;
        float f7;
        Rect rect = this.H;
        if (!rect.isEmpty() && this.f34769y.isAttachedToWindow()) {
            o4 o4Var = this.d;
            ci.m6 m6Var = this.E;
            Matrix matrix = o4Var.f35166y;
            Matrix matrix2 = o4Var.f35165x;
            Matrix matrix3 = o4Var.f35164w;
            if (o4Var.isAttachedToWindow() && m6Var.isAttachedToWindow() && o4Var.getRootView() == m6Var.getRootView()) {
                View view = (View) o4Var.F.getParent();
                FrameLayout frameLayout = o4Var.E;
                if (frameLayout instanceof f5) {
                    matrix3.set((Matrix) ((f5) frameLayout).f34938b.f1911b);
                } else {
                    matrix3.set(((s5) frameLayout).v.f35473a);
                }
                Matrix matrix4 = this.I;
                k5.f(view, matrix4);
                matrix4.preConcat(matrix3);
                matrix4.preTranslate(o4Var.F.getLeft() - view.getScrollX(), o4Var.F.getTop() - view.getScrollY());
                matrix4.preConcat(o4Var.F.getMatrix());
                k5.f(m6Var, matrix2);
                if (matrix2.invert(matrix)) {
                    matrix4.postConcat(matrix);
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
                    matrix4.mapPoints(fArr2);
                    ci.m6 m6Var2 = this.E;
                    int[] iArr = this.P;
                    m6Var2.getLocationInWindow(iArr);
                    View view2 = this.f34769y;
                    int[] iArr2 = this.O;
                    view2.getLocationInWindow(iArr2);
                    this.d.e(this.f34764v0, this.f34767x.getWidth() / 0.75f);
                    float f11 = iArr2[0] - iArr[0];
                    float f12 = (iArr2[1] - iArr[1]) - ((height * 0.75f) * 0.5f);
                    for (int i13 = 0; i13 < 4; i13++) {
                        int i14 = i13 * 2;
                        float lerp = AndroidUtilities.lerp(fArr2[i14], (fArr[i14] * 0.75f) + f11, this.f34764v0);
                        float[] fArr3 = this.N;
                        fArr3[i14] = lerp;
                        int i15 = i14 + 1;
                        fArr3[i15] = AndroidUtilities.lerp(fArr2[i15], (fArr[i15] * 0.75f) + f12, this.f34764v0);
                    }
                    Matrix matrix5 = this.K;
                    boolean polyToPoly = matrix5.setPolyToPoly(this.L, 0, this.N, 0, 4);
                    Matrix matrix6 = this.J;
                    if (polyToPoly && !matrix6.equals(matrix5)) {
                        matrix6.set(matrix5);
                        this.E.invalidate();
                    }
                    o4 o4Var2 = this.d;
                    Matrix matrix7 = o4Var2.f35158c;
                    Matrix matrix8 = o4Var2.f35159e;
                    Matrix matrix9 = o4Var2.d;
                    if (matrix4.invert(matrix9)) {
                        matrix8.setConcat(matrix9, matrix6);
                        if (!o4Var2.h || !matrix7.equals(matrix8)) {
                            matrix7.set(matrix8);
                            o4Var2.h = true;
                            o4Var2.L.invalidate();
                        }
                    }
                    float lerp2 = AndroidUtilities.lerp(1.0f, 1.1428572f, this.f34764v0);
                    this.f34761s0.setPivotX(0.0f);
                    this.f34761s0.setPivotY(0.0f);
                    this.f34761s0.setScaleX(lerp2);
                    this.f34761s0.setScaleY(lerp2);
                }
            }
        }
    }

    public final void C0() {
        ci.m6 m6Var;
        float clamp;
        float f7;
        o4 o4Var;
        int i10;
        boolean z10;
        LinearLayout linearLayout;
        int[] iArr;
        int[] iArr2;
        if (this.f26922a != null && this.d != null && this.f34757q0 != null && this.f34769y != null && (m6Var = this.E) != null && this.actionBar != null) {
            m6Var.bringToFront();
            View m10 = this.f26922a.V2.m(this.f34745f);
            if (m10 == null) {
                if (this.f26922a.V2.L0() > this.f34745f) {
                    clamp = 1.0f;
                } else {
                    clamp = 0.0f;
                }
            } else {
                clamp = Utilities.clamp((this.f26922a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
            }
            this.f34764v0 = clamp;
            E0();
            if (m10 != null) {
                f7 = Math.max(0.0f, (m10.getHeight() / 2.0f) + AndroidUtilities.dp(24.0f)) * this.f34764v0;
            } else {
                f7 = 0.0f;
            }
            float lerp = AndroidUtilities.lerp(1.0f, 0.8f, this.f34764v0);
            this.d.setPivotX(o4Var.getWidth() * 0.5f);
            this.d.setPivotY(0.0f);
            this.d.setScaleX(lerp);
            this.d.setScaleY(lerp);
            this.d.setAlpha(1.0f - Utilities.clamp01(AndroidUtilities.ilerp(clamp, 0.75f, 1.0f)));
            o4 o4Var2 = this.d;
            if (m10 != null && clamp < 1.0f && m10.getBottom() > this.f26922a.getPaddingTop() && m10.getTop() < this.f26922a.getHeight() - this.f26922a.getPaddingBottom()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            o4Var2.setVisibility(i10);
            if (m10 != null) {
                this.f26922a.getLocationInWindow(this.Q);
                this.h.getLocationInWindow(this.R);
                this.d.setTranslationX(((this.f34743e.getWidth() - this.d.getWidth()) / 2.0f) + this.f34743e.getX() + m10.getX() + (iArr[0] - iArr2[0]));
                this.d.setTranslationY(this.f34743e.getY() + m10.getY() + (iArr[1] - iArr2[1]) + f7);
            }
            if (clamp > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.F != z10 && (linearLayout = this.f34757q0) != null) {
                Rect rect = this.H;
                if (z10) {
                    if (linearLayout.getWidth() != 0 && this.f34757q0.getHeight() != 0) {
                        rect.set(this.f34757q0.getLeft(), this.f34757q0.getTop(), this.f34757q0.getRight(), this.f34757q0.getBottom());
                    }
                }
                this.d.setOnFrontContentPresented(null);
                this.G = false;
                AndroidUtilities.removeFromParent(this.f34757q0);
                this.F = z10;
                if (z10) {
                    this.E.addView(this.f34757q0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                    this.f34757q0.layout(0, 0, rect.width(), rect.height());
                    B0();
                } else {
                    o4 o4Var3 = this.d;
                    o4Var3.e(0.0f, 0.0f);
                    LinearLayout linearLayout2 = o4Var3.K;
                    AndroidUtilities.removeFromParent(linearLayout2);
                    linearLayout2.setScaleX(1.0f);
                    linearLayout2.setScaleY(1.0f);
                    linearLayout2.setRotationX(0.0f);
                    linearLayout2.setRotationY(0.0f);
                    linearLayout2.setTranslationX(0.0f);
                    linearLayout2.setTranslationY(0.0f);
                    org.telegram.ui.Components.r6 r6Var = o4Var3.M;
                    r6Var.setScaleX(1.0f);
                    r6Var.setScaleY(1.0f);
                    o4Var3.F.addView(linearLayout2, o4Var3.N);
                    this.f34757q0.layout(rect.left, rect.top, rect.right, rect.bottom);
                    this.G = !this.d.f35161n;
                    B0();
                    if (this.G) {
                        this.d.setOnFrontContentPresented(new h3(this, 9));
                    }
                }
                this.E.invalidate();
            }
            D0(clamp);
            if (this.F) {
                B0();
            }
            float f10 = 1.0f - clamp;
            float f11 = (1.0f - f10) * (-AndroidUtilities.dp(8.0f));
            if (this.actionBar.getTitleTextView() != null) {
                this.actionBar.getTitleTextView().setAlpha(f10);
                this.actionBar.getTitleTextView().setTranslationY(f11);
            }
            if (this.actionBar.getTitleTextView2() != null) {
                this.actionBar.getTitleTextView2().setAlpha(f10);
                this.actionBar.getTitleTextView2().setTranslationY(f11);
            }
        }
    }

    public final void D0(float f7) {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.G6);
        this.f34759r0.setTextColor(AndroidUtilities.lerpColor(-1, themedColor, f7));
        this.f34761s0.setTextColor(AndroidUtilities.lerpColor(-7868417, i0.a.k(themedColor, Math.round(142.8f)), f7));
        j5 j5Var = this.f34762t0;
        if (j5Var != null) {
            j5Var.setOverrideColor(AndroidUtilities.lerpColor(-1, getThemedColor(org.telegram.ui.ActionBar.h6.Oh), f7));
        }
        r4 r4Var = this.f34763u0;
        if (r4Var != null) {
            r4Var.f35503a = i0.a.k(-9577217, Math.round((1.0f - f7) * 255.0f));
        }
        this.f34759r0.invalidate();
    }

    public final void E0() {
        g71 g71Var = this.f26922a;
        if (g71Var != null && this.d != null) {
            float b10 = g71Var.C2.b(1);
            float min = Math.min(10.0f, this.f26922a.C2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f));
            this.d.setAdditionalTilt(Math.max(0.0f, (this.f34764v0 * 10.0f) + ((((float) Math.sqrt(Utilities.clamp01(this.f34764v0))) * 90.0f) - 10.0f)) + min);
            this.d.setUseGyroscope(1.0f - ((float) Math.pow(this.f34764v0, 0.33000001311302185d)));
        }
    }

    public final void F0(boolean z10) {
        boolean y02 = y0();
        g71 g71Var = this.f26922a;
        m71[] m71VarArr = this.f34756p0;
        if (g71Var != null && this.m0 != y02) {
            this.m0 = y02;
            g71Var.B0();
            for (m71 m71Var : m71VarArr) {
                if (m71Var != null) {
                    m71Var.B0();
                }
            }
            this.f26922a.W2.N(false);
            this.f26922a.V2.h1(0, 0);
            this.f26922a.post(new h3(this, 11));
        }
        if (!y02) {
            for (m71 m71Var2 : m71VarArr) {
                if (m71Var2 != null) {
                    boolean canScrollVertically = m71Var2.canScrollVertically(-1);
                    m71Var2.W2.N(z10);
                    m71Var2.a0();
                    if (!canScrollVertically) {
                        m71Var2.V2.h1(0, 0);
                    }
                }
            }
            LinearLayout linearLayout = this.f34752l0;
            if (linearLayout != null) {
                linearLayout.post(new h3(this, 5));
                this.f34752l0.post(new h3(this, 6));
            }
        }
    }

    public final void G0() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.T == null) {
            return;
        }
        l0 v = l0.v(this.currentAccount);
        boolean z13 = false;
        if (this.T.isAttachedToWindow() && this.T.isLaidOut()) {
            z10 = true;
        } else {
            z10 = false;
        }
        k4 k4Var = this.T;
        FrameLayout frameLayout = this.U;
        Boolean bool = v.f35191i;
        if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(v.f35192j)) {
            z11 = true;
        } else {
            z11 = false;
        }
        k4Var.i(frameLayout, z11, z10);
        ArrayList arrayList = v.C;
        int size = arrayList.size();
        int i10 = 0;
        long j3 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h0 h0Var = (h0) obj;
            if (!h0Var.f35010e) {
                long j10 = h0Var.f35009c;
                if (j10 >= 0) {
                    j3 += j10;
                }
            }
        }
        if (j3 > 500000000) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            this.X.setText(m0(R.string.WalletOldWalletsBalance, j3));
        }
        this.T.i(this.W, z12, z10);
        long j11 = yh.n5.y(this.currentAccount, true).p().amount;
        if (j11 > 500000000) {
            z13 = true;
        }
        if (z13) {
            this.Z.setText(m0(R.string.WalletGramEarningsBalance, j11));
        }
        this.T.i(this.Y, z13, z10);
    }

    @Override
    public final void U(ArrayList arrayList, e71 e71Var) {
        l0 v = l0.v(this.currentAccount);
        G0();
        arrayList.add(r61.l(this.S));
        this.f34745f = arrayList.size();
        l4 l4Var = this.f34743e;
        r61 r61Var = new r61(-4);
        r61Var.f30354c = l4Var;
        r61Var.f30374z = -1;
        r61Var.f30355e = true;
        arrayList.add(r61Var);
        arrayList.add(r61.l(this.f34766w0));
        boolean y02 = y0();
        this.m0 = y02;
        if (y02) {
            int i10 = R.drawable.wallet_learn_instant;
            String string = LocaleController.getString(R.string.WalletSendInstantly);
            String string2 = LocaleController.getString(R.string.WalletSendInstantlyInfo);
            int i11 = s4.f35534a;
            r61 J = r61.J(s4.class);
            J.f30360k = i10;
            J.f30361l = string;
            J.f30362m = string2;
            arrayList.add(J);
            int i12 = R.drawable.wallet_learn_fees;
            String string3 = LocaleController.getString(R.string.WalletNoFees);
            String string4 = LocaleController.getString(R.string.WalletNoFeesInfo);
            r61 J2 = r61.J(s4.class);
            J2.f30360k = i12;
            J2.f30361l = string3;
            J2.f30362m = string4;
            arrayList.add(J2);
            int i13 = R.drawable.wallet_learn_verified;
            String string5 = LocaleController.getString(R.string.WalletBlockchainVerified);
            String string6 = LocaleController.getString(R.string.WalletBlockchainVerifiedInfo);
            r61 J3 = r61.J(s4.class);
            J3.f30360k = i13;
            J3.f30361l = string5;
            J3.f30362m = string6;
            arrayList.add(J3);
            arrayList.add(r61.l(this.f34740b0));
        } else if (this.f34752l0 != null) {
            if (this.F0 && !this.G0 && v.t() > 500000000) {
                arrayList.add(r61.k(this.f34742d0));
            }
            arrayList.add(r61.p(this.f34752l0, 0, true));
        }
        fa0 fa0Var = this.f34739a0;
        if (fa0Var != null) {
            this.f34741c0 = false;
            fa0Var.animate().cancel();
            this.f34739a0.setAlpha(0.0f);
            this.f34739a0.setVisibility(4);
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletTitle);
    }

    @Override
    public final void W(r61 r61Var, View view) {
        d0 d0Var;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj = r61Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            Activity parentActivity = getParentActivity();
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) r61Var.G;
            org.telegram.ui.ActionBar.d6 resourceProvider = getResourceProvider();
            if (parentActivity != null && nftitem != null) {
                int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20730a7, resourceProvider);
                int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, resourceProvider);
                a4 a4Var = new a4(parentActivity, resourceProvider);
                a4Var.setBackgroundColor(w02);
                a4Var.fixNavigationBar(w02);
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.setFillViewport(true);
                scrollView.setVerticalScrollBarEnabled(false);
                LinearLayout linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
                y9 y9Var = new y9(parentActivity);
                y9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
                y9Var.setContentDescription(nftitem.name);
                Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
                int i15 = org.telegram.ui.ActionBar.h6.f21189z6;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i15, resourceProvider), PorterDuff.Mode.SRC_IN));
                ImageLocation b10 = c.b(nftitem, false);
                if (b10 != null) {
                    y9Var.h(b10, "120_120", mutate, nftitem);
                } else {
                    y9Var.setImageDrawable(mutate);
                }
                linearLayout.addView(y9Var, w7.x5.q(120, 120, 1));
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
                linearLayout.addView(textView, w7.x5.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
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
                linearLayout.addView(textView2, w7.x5.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                linearLayout2.setOrientation(0);
                linearLayout.addView(linearLayout2, w7.x5.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
                int i17 = 0;
                while (i17 < 2) {
                    LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                    linearLayout3.setOrientation(1);
                    linearLayout3.setGravity(i16);
                    int dp = AndroidUtilities.dp(16.0f);
                    int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20786d6, resourceProvider);
                    int w05 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20877i6, resourceProvider);
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
                    linearLayout3.addView(imageView, w7.x5.n(24, 24));
                    TextView textView3 = new TextView(parentActivity);
                    textView3.setText(string);
                    textView3.setTextColor(w03);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setTypeface(AndroidUtilities.bold());
                    textView3.setGravity(17);
                    linearLayout3.addView(textView3, w7.x5.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
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
                    linearLayout2.addView(linearLayout3, w7.x5.m(1.0f, 0, -1, i13, i14, 0));
                    i17++;
                    i16 = 17;
                }
                ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
                if (arrayList != null && !arrayList.isEmpty()) {
                    t01 t01Var = new t01(parentActivity, resourceProvider);
                    t01Var.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20786d6, resourceProvider)));
                    ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                    int size = arrayList2.size();
                    int i18 = 0;
                    while (i18 < size) {
                        TL_wallet.nftAttribute nftattribute = arrayList2.get(i18);
                        i18++;
                        TL_wallet.nftAttribute nftattribute2 = nftattribute;
                        t01Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                    }
                    linearLayout.addView(t01Var, w7.x5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
                }
                ci.d dVar = new ci.d(parentActivity, resourceProvider, true);
                dVar.setRoundRadius(24);
                dVar.setText(LocaleController.getString(R.string.WalletOK));
                linearLayout.addView(dVar, w7.x5.n(-1, 48));
                a4Var.setCustomView(scrollView);
                a4Var.useBackgroundTopPadding = false;
                linearLayout2.getChildAt(0).setOnClickListener(new uy0(13, a4Var, nftitem));
                linearLayout2.getChildAt(1).setOnClickListener(new l3(parentActivity, 0));
                dVar.setOnClickListener(new l3(a4Var, 1));
                a4Var.show();
                a4Var.fixNavigationBar(w02);
                AndroidUtilities.setNavigationBarColor((Dialog) a4Var, w02, false);
            }
        } else if (r61Var.d == -10001 && (d0Var = this.A0) != null) {
            d0Var.d();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            s0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) r61Var.G, null, null, null, null, getResourceProvider());
        }
    }

    @Override
    public final boolean X(r61 r61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        ValueAnimator valueAnimator = this.f34751k0;
        if (valueAnimator != null) {
            this.f34751k0 = null;
            valueAnimator.cancel();
        }
        z0();
        x4 x4Var = this.f34755o0;
        if (x4Var != null) {
            x4Var.b(null);
        }
        this.f34743e = null;
        this.T = null;
        this.S = null;
        this.f34752l0 = null;
        this.f34754n0 = null;
        m71[] m71VarArr = this.f34756p0;
        m71VarArr[0] = null;
        m71VarArr[1] = null;
        d0 d0Var = this.A0;
        if (d0Var != null && !d0Var.f34787a.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34747g0 = z10;
        if (!z10) {
            this.f34746f0 = 0;
        }
        View createView = super.createView(context);
        ed0 ed0Var = new ed0(this, context);
        ed0Var.addView(createView, w7.x5.d(-1.0f, -1));
        this.fragmentView = ed0Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20730a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.y o9 = this.actionBar.o();
        o9.a(2, R.drawable.scan_qr).setOnClickListener(new View.OnClickListener(this) {
            public final c5 f35106b;

            {
                this.f35106b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c5 c5Var = this.f35106b;
                        c5Var.getClass();
                        c5Var.presentFragment(new hh1(6, null));
                        return;
                    case 1:
                        c5.c0(this.f35106b);
                        return;
                    case 2:
                        c5.f0(this.f35106b);
                        return;
                    case 3:
                        this.f35106b.v0();
                        return;
                    default:
                        c5.a0(this.f35106b);
                        return;
                }
            }
        });
        o9.a(1, R.drawable.ic_ab_other).setOnClickListener(new uy0(15, this, context));
        ai.f0 f0Var = new ai.f0(this, context, 24);
        this.S = f0Var;
        f0Var.setClipToPadding(false);
        this.S.setClipChildren(false);
        this.S.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        k4 k4Var = new k4(this, context);
        this.T = k4Var;
        k4Var.setDefaultRadiusDp(22);
        this.T.setOnAnimatedHeightChangedListener(new h3(this, 0));
        TextView textView = new TextView(context);
        this.V = textView;
        textView.setText(LocaleController.getString(R.string.WalletWaltFunds));
        this.U = j0(this.V, new h3(this, 1));
        TextView textView2 = new TextView(context);
        this.X = textView2;
        this.W = j0(textView2, new h3(this, 2));
        TextView textView3 = new TextView(context);
        this.Z = textView3;
        this.Y = j0(textView3, new h3(this, 3));
        this.S.addView(this.T, w7.x5.d(-2.0f, -1));
        fa0 fa0Var = new fa0(context, null);
        this.f34739a0 = fa0Var;
        this.f34741c0 = false;
        fa0Var.setAlpha(0.0f);
        fa0 fa0Var2 = this.f34739a0;
        int i11 = org.telegram.ui.ActionBar.h6.f21189z6;
        fa0Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, this.resourceProvider));
        this.f34739a0.setTextSize(1, 13.0f);
        this.f34739a0.setGravity(17);
        this.f34739a0.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, this.resourceProvider), new i3(context, 0)));
        this.f34739a0.setVisibility(4);
        ((FrameLayout) createView).addView(this.f34739a0, w7.x5.a(-2.0f, 12.0f, 0.0f, 12.0f, 24.0f, -1, 81));
        l4 l4Var = new l4(this, context, 0);
        this.f34740b0 = l4Var;
        l4Var.setImportantForAccessibility(2);
        this.f34742d0 = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34744e0 = frameLayout;
        int i12 = org.telegram.ui.ActionBar.h6.f20786d6;
        int themedColor = getThemedColor(i12);
        int themedColor2 = getThemedColor(i12);
        int i13 = org.telegram.ui.ActionBar.h6.f20877i6;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.a0(themedColor, org.telegram.ui.ActionBar.h6.v(themedColor2, getThemedColor(i13)), 16, 16));
        this.f34742d0.addView(this.f34744e0, w7.x5.a(-2.0f, 12.0f, 0.0f, 12.0f, 12.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        float dpf2 = AndroidUtilities.dpf2(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2}, null, null));
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.f34744e0.addView(imageView, w7.x5.a(28.0f, 14.0f, 11.0f, 16.0f, 11.0f, 28, 19));
        TextView textView4 = new TextView(context);
        ai.o(org.telegram.ui.ActionBar.h6.f21026q7, this.resourceProvider, textView4, 1, 16.0f);
        textView4.setText(LocaleController.getString(R.string.WalletProtectAccount));
        this.f34744e0.addView(textView4, w7.x5.a(-2.0f, 58.0f, 0.0f, 32.0f, 0.0f, -1, 19));
        this.f34744e0.setOnClickListener(new View.OnClickListener(this) {
            public final c5 f35106b;

            {
                this.f35106b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c5 c5Var = this.f35106b;
                        c5Var.getClass();
                        c5Var.presentFragment(new hh1(6, null));
                        return;
                    case 1:
                        c5.c0(this.f35106b);
                        return;
                    case 2:
                        c5.f0(this.f35106b);
                        return;
                    case 3:
                        this.f35106b.v0();
                        return;
                    default:
                        c5.a0(this.f35106b);
                        return;
                }
            }
        });
        w7.z5.b(this.f34744e0, 0.02f, 1.2f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f34767x = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.f34767x.setClipToPadding(false);
        this.actionBar.addView(this.f34767x, w7.x5.a(56.0f, 64.0f, 0.0f, 96.0f, 0.0f, -1, 87));
        View view = new View(context);
        this.f34769y = view;
        this.f34767x.addView(view, w7.x5.e(1, 1, 19));
        this.F = false;
        this.G = false;
        this.H.setEmpty();
        this.J.reset();
        ci.m6 m6Var = new ci.m6(this, context);
        this.E = m6Var;
        m6Var.setClipChildren(false);
        this.E.setClipToPadding(false);
        o4 o4Var = new o4(this, context, this.f34765w);
        this.d = o4Var;
        o4Var.setDiamondOnCard(true);
        this.d.setCardOnClickListener(new View.OnClickListener(this) {
            public final c5 f35106b;

            {
                this.f35106b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        c5 c5Var = this.f35106b;
                        c5Var.getClass();
                        c5Var.presentFragment(new hh1(6, null));
                        return;
                    case 1:
                        c5.c0(this.f35106b);
                        return;
                    case 2:
                        c5.f0(this.f35106b);
                        return;
                    case 3:
                        this.f35106b.v0();
                        return;
                    default:
                        c5.a0(this.f35106b);
                        return;
                }
            }
        });
        this.f26922a.C2.f26493b.add(this.v);
        l4 l4Var2 = new l4(this, context, 1);
        this.f34743e = l4Var2;
        l4Var2.setImportantForAccessibility(2);
        p4 p4Var = new p4(this, context);
        this.h = p4Var;
        p4Var.setClipChildren(false);
        this.h.setClipToPadding(false);
        this.h.addView(this.d, w7.x5.d(-2.0f, -1));
        ed0Var.addView(this.h, w7.x5.d(-1.0f, -1));
        this.f26922a.setClipChildren(false);
        this.f26922a.setClipToPadding(false);
        this.f34757q0 = this.d.getBalanceLayout();
        this.f34759r0 = this.d.getBalanceView();
        this.f34761s0 = this.d.getUsdBalanceView();
        this.d.setCardHolder(UserObject.getUserName(getUserConfig().getCurrentUser()).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34766w0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f34766w0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.f34768x0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletAddFunds));
        this.f34766w0.addView(this.f34768x0, w7.x5.m(1.0f, 0, 48, 0, 4, 0));
        this.f34768x0.setOnClickListener(new View.OnClickListener(this) {
            public final c5 f35106b;

            {
                this.f35106b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        c5 c5Var = this.f35106b;
                        c5Var.getClass();
                        c5Var.presentFragment(new hh1(6, null));
                        return;
                    case 1:
                        c5.c0(this.f35106b);
                        return;
                    case 2:
                        c5.f0(this.f35106b);
                        return;
                    case 3:
                        this.f35106b.v0();
                        return;
                    default:
                        c5.a0(this.f35106b);
                        return;
                }
            }
        });
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f34770y0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.WalletSend));
        this.f34770y0.setEnabled(l0.v(this.currentAccount).e());
        this.f34770y0.setOnClickListener(new View.OnClickListener(this) {
            public final c5 f35106b;

            {
                this.f35106b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        c5 c5Var = this.f35106b;
                        c5Var.getClass();
                        c5Var.presentFragment(new hh1(6, null));
                        return;
                    case 1:
                        c5.c0(this.f35106b);
                        return;
                    case 2:
                        c5.f0(this.f35106b);
                        return;
                    case 3:
                        this.f35106b.v0();
                        return;
                    default:
                        c5.a0(this.f35106b);
                        return;
                }
            }
        });
        this.f34766w0.addView(this.f34770y0, w7.x5.m(1.0f, 0, 48, 4, 0, 0));
        this.f34771z0 = l0.v(this.currentAccount).z();
        this.f26922a.setDescendantFocusability(131072);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f34752l0 = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f34752l0.setBackgroundColor(getThemedColor(i10));
        ci.h1 h1Var = new ci.h1(this, context, this.resourceProvider, 10);
        this.f34754n0 = h1Var;
        h1Var.setAllowDisallowInterceptTouch(false);
        this.f34754n0.setAdapter(new y3(this));
        p91 n10 = this.f34754n0.n(-2, true);
        this.f34748h0 = n10;
        int i14 = org.telegram.ui.ActionBar.h6.Oh;
        n10.g(i14, i14, i11, i13, i12);
        this.f34748h0.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), getThemedColor(i12)));
        z3 z3Var = new z3(this, context);
        this.f34749i0 = z3Var;
        z3Var.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
        this.f34749i0.addView(this.f34748h0, w7.x5.e(-2, 36, 49));
        this.f34754n0.setPosition(this.f34746f0);
        this.f34752l0.addView(this.f34749i0, w7.x5.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 48));
        this.f34752l0.addView(this.f34754n0, w7.x5.l(1.0f, -1, 0));
        w0(this.f34747g0);
        this.f26922a.j(new oh0(this, 9));
        e71 e71Var = this.f26922a.W2;
        e71Var.f25890r = false;
        e71Var.N(false);
        x4 x4Var2 = new x4(this);
        this.f34755o0 = x4Var2;
        x4Var2.b(this.f26922a);
        A0();
        this.f34771z0.e();
        this.actionBar.post(new h3(this, 10));
        this.f26922a.post(new h3(this, 11));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g71 g71Var;
        e71 e71Var;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.walletUpdate && this.f34759r0 != null) {
                A0();
                Iterator it = this.D0.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            } else if (i10 == NotificationCenter.starBalanceUpdated) {
                G0();
            } else if (i10 == NotificationCenter.didSetOrRemoveTwoStepPassword) {
                if (objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof TL_account.Password) {
                        this.F0 = true;
                        this.G0 = ((TL_account.Password) obj).has_password;
                        g71 g71Var2 = this.f26922a;
                        if (g71Var2 != null && (e71Var = g71Var2.W2) != null) {
                            e71Var.N(true);
                            return;
                        }
                        return;
                    }
                }
                getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new Object(), new d(this, 7));
            } else if (i10 == NotificationCenter.walletTransactionsUpdate && objArr.length > 0) {
                Object obj2 = objArr[0];
                k0 k0Var = this.f34771z0;
                if (obj2 == k0Var && (g71Var = this.f26922a) != null && g71Var.W2 != null) {
                    if (k0Var.f35141b.isEmpty()) {
                        k0 k0Var2 = this.f34771z0;
                        if (!k0Var2.f35145g) {
                            k0Var2.e();
                        }
                    }
                    F0(true);
                }
            }
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final FrameLayout j0(TextView textView, Runnable runnable) {
        Context context = textView.getContext();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f20877i6), 2, -1));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 42.0f, 0.0f, -1, 3));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21189z6), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.x5.e(-2, -2, 21));
        frameLayout.setOnClickListener(new l3(runnable, 2));
        textView.setDuplicateParentStateEnabled(true);
        w7.z5.b(textView, 0.02f, 1.2f);
        this.T.addView(frameLayout, w7.x5.n(-1, -2));
        return frameLayout;
    }

    public final CharSequence m0(int i10, long j3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        er erVar = new er(R.drawable.mini_gram_16, 0);
        erVar.recolorDrawable = false;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.Oh);
        spannableStringBuilder.setSpan(erVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) l0.n(j3, false));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(themedColor), length2, spannableStringBuilder.length(), 33);
        return LocaleController.formatSpannable(i10, spannableStringBuilder);
    }

    public final m71 n0() {
        View currentView;
        if (o0()) {
            ci.h1 h1Var = this.f34754n0;
            if (h1Var == null) {
                currentView = null;
            } else {
                currentView = h1Var.getCurrentView();
            }
            if (currentView instanceof m71) {
                return (m71) currentView;
            }
        }
        return null;
    }

    public final boolean o0() {
        LinearLayout linearLayout;
        if (!this.m0 && (linearLayout = this.f34752l0) != null && linearLayout.isAttachedToWindow()) {
            ViewParent parent = this.f34752l0.getParent();
            g71 g71Var = this.f26922a;
            if (parent == g71Var.V2.m(g71Var.W2.f25893x.size() - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onBeginSlide() {
        x4 x4Var = this.f34755o0;
        if (x4Var != null) {
            x4Var.c();
        }
        g71 g71Var = this.f26922a;
        if (g71Var != null) {
            g71Var.B0();
        }
        m71 n02 = n0();
        if (n02 != null) {
            n02.B0();
        }
        super.onBeginSlide();
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().addObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        l0 v = l0.v(this.currentAccount);
        if (v.f35197o == null) {
            v.f35197o = new d0(v);
        }
        d0 d0Var = v.f35197o;
        this.A0 = d0Var;
        ArrayList arrayList = d0Var.d;
        h3 h3Var = this.B0;
        if (!arrayList.contains(h3Var)) {
            arrayList.add(h3Var);
        }
        j jVar = this.H0;
        if (jVar != null) {
            jVar.run();
        }
        int i10 = v.f35207z;
        v.f35207z = i10 + 1;
        HashSet hashSet = v.A;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i10));
        if (isEmpty) {
            v.P();
        }
        this.H0 = new j(v, i10, 0);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new Object(), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        o4 o4Var = this.d;
        if (o4Var != null) {
            o4Var.setOnFrontContentPresented(null);
        }
        this.G = false;
        ValueAnimator valueAnimator = this.f34751k0;
        if (valueAnimator != null) {
            this.f34751k0 = null;
            valueAnimator.cancel();
        }
        d0 d0Var = this.A0;
        if (d0Var != null) {
            d0Var.d.remove(this.B0);
        }
        z0();
        x4 x4Var = this.f34755o0;
        if (x4Var != null) {
            x4Var.b(null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        AndroidUtilities.removeFromParent(this.E);
        k0 k0Var = this.f34771z0;
        if (k0Var != null) {
            k0Var.a();
        }
        super.onFragmentDestroy();
        j jVar = this.H0;
        if (jVar != null) {
            jVar.run();
            this.H0 = null;
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f26922a.setPadding(0, 0, 0, i13);
        this.f26922a.setClipToPadding(false);
        fa0 fa0Var = this.f34739a0;
        if (fa0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fa0Var.getLayoutParams();
            layoutParams.bottomMargin = AndroidUtilities.dp(24.0f) + i13;
            this.f34739a0.setLayoutParams(layoutParams);
        }
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        if (i10 == 44 && getParentActivity() != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                v0();
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            alertDialog$Builder.f20368a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new k3(this));
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
            kVar.post(new h3(this, 10));
        }
        l0.v(this.currentAccount).B();
        if (this.A0 != null && l0.v(this.currentAccount).D()) {
            d0 d0Var = this.A0;
            if (!d0Var.f34794j) {
                d0Var.b();
                d0Var.e(true);
            }
        }
        A0();
        if (this.f26922a != null) {
            F0(true);
        }
    }

    public final void p0() {
        d0 d0Var;
        m71 m71Var = this.f34756p0[1];
        if (this.f34746f0 == 1 && m71Var != null && m71Var.G && (d0Var = this.A0) != null && !d0Var.f34793i && !d0Var.f34792g && d0Var.f34795k == null && m71Var.V2.N0() >= m71Var.W2.f25893x.size() - 3) {
            this.A0.d();
        }
    }

    public final void q0() {
        k0 k0Var;
        m71 m71Var = this.f34756p0[0];
        if (m71Var != null && m71Var.G && (k0Var = this.f34771z0) != null && !k0Var.f35145g && m71Var.V2.N0() >= m71Var.W2.f25893x.size() - 3) {
            this.f34771z0.e();
        }
    }

    public final CharSequence r0(int i10) {
        org.telegram.ui.Components.r6 r6Var;
        float f7;
        CharSequence[] charSequenceArr = this.C0;
        if (charSequenceArr[i10] == null) {
            charSequenceArr[i10] = new SpannableString("l");
            if (i10 == 0) {
                r6Var = this.f34759r0;
            } else {
                r6Var = this.f34761s0;
            }
            if (i10 == 0) {
                f7 = 100.0f;
            } else {
                f7 = 50.0f;
            }
            ka0 ka0Var = new ka0(AndroidUtilities.dp(f7), r6Var);
            ka0Var.a(org.telegram.ui.ActionBar.h6.m1(0.45f, -1), org.telegram.ui.ActionBar.h6.m1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i10];
            ((SpannableString) charSequence).setSpan(ka0Var, 0, charSequence.length(), 33);
        }
        return charSequenceArr[i10];
    }

    public final void v0() {
        if (getParentActivity() == null) {
            return;
        }
        if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 44);
            return;
        }
        u9.e0(getParentActivity(), true, 1, new l2.f(this, 15));
    }

    public final void w0(boolean z10) {
        float f7;
        boolean z11;
        this.f34747g0 = z10;
        if (!z10) {
            this.f34746f0 = 0;
        }
        ci.h1 h1Var = this.f34754n0;
        if (h1Var != null && this.f34749i0 != null) {
            if (!z10) {
                h1Var.setPosition(0);
            }
            ValueAnimator valueAnimator = this.f34751k0;
            if (valueAnimator != null) {
                this.f34751k0 = null;
                valueAnimator.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (this.f34752l0.isAttachedToWindow() && this.f34752l0.isLaidOut()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                this.f34754n0.o(false);
            }
            if (z11 && this.f34750j0 != f7) {
                this.f34749i0.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f34750j0, f7);
                this.f34751k0 = ofFloat;
                ofFloat.setDuration(250L);
                this.f34751k0.setInterpolator(is.h);
                this.f34751k0.addUpdateListener(new u2(this, 1));
                this.f34751k0.addListener(new org.telegram.ui.ActionBar.y0(this, f7, 6));
                this.f34751k0.start();
            } else {
                x0(f7);
                this.f34754n0.o(false);
            }
            if (this.f26922a != null && this.m0 != y0()) {
                F0(false);
            }
        }
    }

    public final void x0(float f7) {
        int i10;
        this.f34750j0 = f7;
        z3 z3Var = this.f34749i0;
        if (f7 <= 0.0f && this.f34751k0 == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        z3Var.setVisibility(i10);
        this.f34749i0.setAlpha(f7);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f34749i0.getLayoutParams();
        layoutParams.height = Math.round(AndroidUtilities.dp(48.0f) * f7);
        layoutParams.bottomMargin = -Math.round(AndroidUtilities.dp(6.0f) * f7);
        this.f34749i0.setLayoutParams(layoutParams);
    }

    public final boolean y0() {
        k0 k0Var;
        if (!this.f34747g0 && (k0Var = this.f34771z0) != null && k0Var.f35142c.isEmpty()) {
            k0 k0Var2 = this.f34771z0;
            k0Var2.getClass();
            if (k0Var2.f35145g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void z0() {
        this.f34758r = false;
        g71 g71Var = this.f26922a;
        if (g71Var != null) {
            g71Var.C2.f26493b.remove(this.v);
            this.f26922a.removeCallbacks(this.f34760s);
        }
        o4 o4Var = this.d;
        if (o4Var != null) {
            o4Var.setAdditionalTilt(0.0f);
        }
    }
}
