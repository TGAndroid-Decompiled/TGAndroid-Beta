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
import org.telegram.messenger.yh;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zt;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.bz0;
import org.telegram.ui.je1;
import org.telegram.ui.ld0;
import org.telegram.ui.li1;
import org.telegram.ui.mt;
import org.telegram.ui.oh1;
import org.telegram.ui.tu0;
public final class z4 extends c71 implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface I0;
    public b0 A0;
    public ah.v E;
    public SpannableString E0;
    public boolean F;
    public boolean F0;
    public boolean G;
    public boolean G0;
    public li1 H0;
    public ah.x S;
    public i4 T;
    public FrameLayout U;
    public TextView V;
    public FrameLayout W;
    public TextView X;
    public FrameLayout Y;
    public TextView Z;
    public da0 f33919a0;
    public j4 f33920b0;
    public boolean f33921c0;
    public m4 d;
    public FrameLayout f33922d0;
    public j4 e;
    public FrameLayout f33923e0;
    public int f33924f;
    public boolean f33926g0;
    public n4 h;
    public j91 f33927h0;
    public x3 f33928i0;
    public float f33929j0;
    public ValueAnimator f33930k0;
    public LinearLayout f33931l0;
    public boolean m0;
    public int f33932n;
    public di.h1 f33933n0;
    public v4 f33934o0;
    public LinearLayout f33936q0;
    public boolean f33937r;
    public org.telegram.ui.Components.s6 f33938r0;
    public org.telegram.ui.Components.s6 f33940s0;
    public g5 f33941t0;
    public p4 f33942u0;
    public float f33943v0;
    public LinearLayout f33945w0;
    public FrameLayout f33946x;
    public di.d f33947x0;
    public View f33948y;
    public di.d f33949y0;
    public i0 f33950z0;
    public final org.telegram.ui.Cells.t6 f33939s = new org.telegram.ui.Cells.t6(this, 28);
    public final k3 v = new zt() {
        @Override
        public final void a(int i10, boolean z10) {
            b71 b71Var;
            z4 z4Var = z4.this;
            org.telegram.ui.Cells.t6 t6Var = z4Var.f33939s;
            if ((i10 != 1 && i10 != 3) || (b71Var = z4Var.f23964a) == null) {
                return;
            }
            z4Var.f33937r = z10;
            b71Var.removeCallbacks(t6Var);
            t6Var.run();
        }
    };
    public boolean f33944w = false;
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
    public int f33925f0 = 0;
    public final h71[] f33935p0 = new h71[2];
    public final f3 B0 = new f3(this, 4);
    public final CharSequence[] C0 = new CharSequence[2];
    public final HashSet D0 = new HashSet();

    public static void Y(z4 z4Var, Context context, View view) {
        boolean z10;
        int i10;
        j0 v = j0.v(z4Var.currentAccount);
        final m80 I = m80.I(z4Var, view);
        I.a0(0.0f, -AndroidUtilities.dp(48.0f));
        I.f27298s = 0;
        I.V(5);
        m80 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.WalletBack), new tu0(I, 26), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        l6 l6Var = new l6(z4Var, linearLayout, v, I, 9);
        J.r(scrollView, w7.a6.n(-1, 350));
        I.c(R.drawable.wallet_globe, LocaleController.getString(R.string.WalletCurrency), new k(l6Var, I, J, 8), false);
        org.telegram.ui.ActionBar.e1 y3 = I.y();
        f fVar = v.h;
        String i11 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i11);
        String str = i11;
        if (isEmpty) {
            y3.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Loading));
            spannableStringBuilder.setSpan(new ia0(AndroidUtilities.dp(75.0f), y3.f19720b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y3.setSubtext(str);
        if (fVar.f() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        l6 l6Var2 = new l6(v, new boolean[]{z10}, y3, l6Var, 10);
        z4Var.D0.add(l6Var2);
        l6Var.run();
        I.c(R.drawable.wallet_lock, LocaleController.getString(R.string.Passcode), new Runnable(z4Var) {
            public final z4 f33593b;

            {
                this.f33593b = z4Var;
            }

            @Override
            public final void run() {
                m4 m4Var;
                switch (r3) {
                    case 0:
                        z4 z4Var2 = this.f33593b;
                        z4Var2.getClass();
                        I.u();
                        z4Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        z4 z4Var3 = this.f33593b;
                        z4Var3.getClass();
                        I.u();
                        z4Var3.presentFragment(new k7());
                        return;
                    case 2:
                        z4 z4Var4 = this.f33593b;
                        z4Var4.getClass();
                        I.u();
                        z4Var4.presentFragment(new c71());
                        return;
                    case 3:
                        I.u();
                        z4 z4Var5 = this.f33593b;
                        z4.t0(z4Var5.getParentActivity(), z4Var5.getResourceProvider());
                        return;
                    default:
                        I.u();
                        z4 z4Var6 = this.f33593b;
                        boolean z11 = z4Var6.f33944w;
                        boolean z12 = !z11;
                        if (z11 != z12 && (m4Var = z4Var6.d) != null) {
                            z4Var6.f33944w = z12;
                            m4Var.setUse2D(z12);
                            z4Var6.e.requestLayout();
                            z4Var6.d.post(new f3(z4Var6, 11));
                            return;
                        }
                        return;
                }
            }
        }, false);
        I.c(R.drawable.wallet_key, LocaleController.getString(R.string.WalletKeysAndBackup), new Runnable(z4Var) {
            public final z4 f33593b;

            {
                this.f33593b = z4Var;
            }

            @Override
            public final void run() {
                m4 m4Var;
                switch (r3) {
                    case 0:
                        z4 z4Var2 = this.f33593b;
                        z4Var2.getClass();
                        I.u();
                        z4Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        z4 z4Var3 = this.f33593b;
                        z4Var3.getClass();
                        I.u();
                        z4Var3.presentFragment(new k7());
                        return;
                    case 2:
                        z4 z4Var4 = this.f33593b;
                        z4Var4.getClass();
                        I.u();
                        z4Var4.presentFragment(new c71());
                        return;
                    case 3:
                        I.u();
                        z4 z4Var5 = this.f33593b;
                        z4.t0(z4Var5.getParentActivity(), z4Var5.getResourceProvider());
                        return;
                    default:
                        I.u();
                        z4 z4Var6 = this.f33593b;
                        boolean z11 = z4Var6.f33944w;
                        boolean z12 = !z11;
                        if (z11 != z12 && (m4Var = z4Var6.d) != null) {
                            z4Var6.f33944w = z12;
                            m4Var.setUse2D(z12);
                            z4Var6.e.requestLayout();
                            z4Var6.d.post(new f3(z4Var6, 11));
                            return;
                        }
                        return;
                }
            }
        }, false);
        I.l(R.drawable.wallet_apps, LocaleController.getString(R.string.WalletConnectedApps), new Runnable(z4Var) {
            public final z4 f33593b;

            {
                this.f33593b = z4Var;
            }

            @Override
            public final void run() {
                m4 m4Var;
                switch (r3) {
                    case 0:
                        z4 z4Var2 = this.f33593b;
                        z4Var2.getClass();
                        I.u();
                        z4Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        z4 z4Var3 = this.f33593b;
                        z4Var3.getClass();
                        I.u();
                        z4Var3.presentFragment(new k7());
                        return;
                    case 2:
                        z4 z4Var4 = this.f33593b;
                        z4Var4.getClass();
                        I.u();
                        z4Var4.presentFragment(new c71());
                        return;
                    case 3:
                        I.u();
                        z4 z4Var5 = this.f33593b;
                        z4.t0(z4Var5.getParentActivity(), z4Var5.getResourceProvider());
                        return;
                    default:
                        I.u();
                        z4 z4Var6 = this.f33593b;
                        boolean z11 = z4Var6.f33944w;
                        boolean z12 = !z11;
                        if (z11 != z12 && (m4Var = z4Var6.d) != null) {
                            z4Var6.f33944w = z12;
                            m4Var.setUse2D(z12);
                            z4Var6.e.requestLayout();
                            z4Var6.d.post(new f3(z4Var6, 11));
                            return;
                        }
                        return;
                }
            }
        }, true ^ v.f33323g.d.isEmpty());
        I.k();
        I.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsWallet), new Runnable(z4Var) {
            public final z4 f33593b;

            {
                this.f33593b = z4Var;
            }

            @Override
            public final void run() {
                m4 m4Var;
                switch (r3) {
                    case 0:
                        z4 z4Var2 = this.f33593b;
                        z4Var2.getClass();
                        I.u();
                        z4Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        z4 z4Var3 = this.f33593b;
                        z4Var3.getClass();
                        I.u();
                        z4Var3.presentFragment(new k7());
                        return;
                    case 2:
                        z4 z4Var4 = this.f33593b;
                        z4Var4.getClass();
                        I.u();
                        z4Var4.presentFragment(new c71());
                        return;
                    case 3:
                        I.u();
                        z4 z4Var5 = this.f33593b;
                        z4.t0(z4Var5.getParentActivity(), z4Var5.getResourceProvider());
                        return;
                    default:
                        I.u();
                        z4 z4Var6 = this.f33593b;
                        boolean z11 = z4Var6.f33944w;
                        boolean z12 = !z11;
                        if (z11 != z12 && (m4Var = z4Var6.d) != null) {
                            z4Var6.f33944w = z12;
                            m4Var.setUse2D(z12);
                            z4Var6.e.requestLayout();
                            z4Var6.d.post(new f3(z4Var6, 11));
                            return;
                        }
                        return;
                }
            }
        }, false);
        if (BuildVars.DEBUG_VERSION) {
            I.k();
            if (z4Var.f33944w) {
                i10 = R.string.WalletCard3D;
            } else {
                i10 = R.string.WalletCard2D;
            }
            I.c(0, LocaleController.getString(i10), new Runnable(z4Var) {
                public final z4 f33593b;

                {
                    this.f33593b = z4Var;
                }

                @Override
                public final void run() {
                    m4 m4Var;
                    switch (r3) {
                        case 0:
                            z4 z4Var2 = this.f33593b;
                            z4Var2.getClass();
                            I.u();
                            z4Var2.presentFragment(PasscodeActivity.e0());
                            return;
                        case 1:
                            z4 z4Var3 = this.f33593b;
                            z4Var3.getClass();
                            I.u();
                            z4Var3.presentFragment(new k7());
                            return;
                        case 2:
                            z4 z4Var4 = this.f33593b;
                            z4Var4.getClass();
                            I.u();
                            z4Var4.presentFragment(new c71());
                            return;
                        case 3:
                            I.u();
                            z4 z4Var5 = this.f33593b;
                            z4.t0(z4Var5.getParentActivity(), z4Var5.getResourceProvider());
                            return;
                        default:
                            I.u();
                            z4 z4Var6 = this.f33593b;
                            boolean z11 = z4Var6.f33944w;
                            boolean z12 = !z11;
                            if (z11 != z12 && (m4Var = z4Var6.d) != null) {
                                z4Var6.f33944w = z12;
                                m4Var.setUse2D(z12);
                                z4Var6.e.requestLayout();
                                z4Var6.d.post(new f3(z4Var6, 11));
                                return;
                            }
                            return;
                    }
                }
            }, false);
        }
        I.f27293p = new je1(19, z4Var, l6Var2);
        I.Z();
    }

    public static void Z(z4 z4Var, String str, j0 j0Var, m80 m80Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        String str2;
        float f7;
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(2, z4Var.getParentActivity(), z4Var.resourceProvider, false, false);
        e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        e1Var.setText(currencyrate.currency);
        if (!TextUtils.isEmpty(currencyrate.translatedTitle)) {
            str2 = currencyrate.translatedTitle;
        } else {
            str2 = currencyrate.title;
        }
        e1Var.setSubtext(str2);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        TextView textView = e1Var.f19720b;
        if (equals) {
            f7 = 42.0f;
        } else {
            f7 = 0.0f;
        }
        textView.setPadding(0, 0, AndroidUtilities.dp(f7), 0);
        e1Var.setChecked(equals);
        e1Var.setOnClickListener(new l1(j0Var, currencyrate, m80Var, 1));
        linearLayout.addView(e1Var, w7.a6.n(200, -2));
    }

    public static void a0(z4 z4Var) {
        j0 v = j0.v(z4Var.currentAccount);
        di.d dVar = z4Var.f33949y0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        v.h0(new e2.o0((Object) v, (Object) new mt(29, z4Var, v), false, false, 3));
    }

    public static void b0(z4 z4Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (z4Var.E != null && (kVar = z4Var.actionBar) != null && (kVar.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) z4Var.actionBar.getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (z4Var.E.getParent() != z4Var.actionBar) {
                AndroidUtilities.removeFromParent(z4Var.E);
                z4Var.actionBar.addView(z4Var.E, w7.a6.d(-1.0f, -1));
            }
            z4Var.E.bringToFront();
            z4Var.actionBar.bringToFront();
            z4Var.E.post(new f3(z4Var, 11));
        }
    }

    public static void c0(z4 z4Var) {
        u0(z4Var.getParentActivity(), z4Var.currentAccount, z4Var.getResourceProvider());
    }

    public static void d0(z4 z4Var, LinearLayout linearLayout, j0 j0Var, m80 m80Var) {
        TL_wallet.currencyRate currencyrate;
        z4 z4Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        j0 j0Var2 = j0Var;
        linearLayout2.removeAllViews();
        String g10 = j0Var2.h.g();
        TL_wallet.currencyRates f7 = j0Var2.h.f();
        if (f7 == null) {
            for (int i10 = 0; i10 < 3; i10++) {
                f10 f10Var = new f10(z4Var.getParentActivity(), z4Var.getResourceProvider());
                f10Var.setIsSingleCell(true);
                f10Var.setViewType(31);
                linearLayout2.addView(f10Var, w7.a6.n(200, -2));
            }
            return;
        }
        f fVar = j0Var2.h;
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
            f.a(linkedHashSet, MessagesController.getInstance(fVar.f33159a).config.phoneCountryIso2.get());
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
                Z(z4Var, g10, j0Var2, m80Var, linearLayout2, currencyrate7);
            }
            i13++;
            j0Var2 = j0Var;
        }
        if (!hashSet.isEmpty() && !f7.rates.isEmpty()) {
            z4Var2 = z4Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.j1(z4Var.getParentActivity(), z4Var2.resourceProvider), w7.a6.n(-1, 8));
        } else {
            z4Var2 = z4Var;
        }
        int i14 = 0;
        while (i14 < f7.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f7.rates.get(i14);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                Z(z4Var2, g10, j0Var, m80Var, linearLayout2, currencyrate8);
            }
            i14++;
            z4Var2 = z4Var;
            linearLayout2 = linearLayout;
        }
    }

    public static void e0(z4 z4Var) {
        pf.d.s(z4Var.getParentActivity(), j0.v(z4Var.currentAccount).f33325j);
    }

    public static void f0(z4 z4Var) {
        u0(z4Var.getParentActivity(), z4Var.currentAccount, z4Var.getResourceProvider());
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

    public static android.widget.LinearLayout i0(final android.content.Context r43, int r44, org.telegram.tgnet.tl.TL_wallet.walletTransaction r45, org.telegram.messenger.Utilities.Callback3 r46, org.telegram.messenger.Utilities.Callback2 r47, byte[] r48, java.lang.Runnable r49, org.telegram.ui.ActionBar.c6 r50, org.telegram.ui.Wallet.i2[] r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.z4.i0(android.content.Context, int, org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.messenger.Utilities$Callback3, org.telegram.messenger.Utilities$Callback2, byte[], java.lang.Runnable, org.telegram.ui.ActionBar.c6, org.telegram.ui.Wallet.i2[]):android.widget.LinearLayout");
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

    public static SpannableStringBuilder l0(int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var) {
        BigDecimal stripTrailingZeros;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ");
        br brVar = new br(R.drawable.wallet_gram_small, 2);
        brVar.recolorDrawable = false;
        brVar.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(brVar, 0, 1, 33);
        BigDecimal movePointLeft = new BigDecimal(j10).movePointLeft(9);
        if (movePointLeft.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = movePointLeft.stripTrailingZeros();
        }
        spannableStringBuilder.append((CharSequence) stripTrailingZeros.toPlainString());
        CharSequence l4 = j0.v(i10).l(j10, true);
        if (!TextUtils.isEmpty(l4)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(l4);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20305z6, c6Var)), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static void s0(Context context, int i10, TL_wallet.walletTransaction wallettransaction, Utilities.Callback3 callback3, Utilities.Callback2 callback2, byte[] bArr, org.telegram.ui.Cells.q0 q0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        View[] viewArr;
        ?? r10;
        TL_wallet.walletTransaction wallettransaction2;
        i2[] i2VarArr;
        Utilities.Callback2 callback22;
        LinearLayout linearLayout;
        if (context == null) {
            return;
        }
        boolean z10 = true;
        i2[] i2VarArr2 = new i2[1];
        View[] viewArr2 = new View[1];
        i0 z11 = j0.v(i10).z();
        ArrayList arrayList = new ArrayList(z11.f33275c);
        int i11 = 0;
        while (true) {
            if (i11 < arrayList.size()) {
                if (arrayList.get(i11) == wallettransaction || j0.d0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i11))) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (callback3 == null && q0Var == null && i11 >= 0) {
            Rect rect = new Rect();
            context.getResources().getDrawable(R.drawable.sheet_shadow_round).getPadding(rect);
            viewArr = viewArr2;
            ?? a4Var = new a4(context, c6Var, z11, arrayList, i10, rect, viewArr);
            a4Var.setPosition(i11);
            i2VarArr = i2VarArr2;
            a4Var.setAdapter(new b4(arrayList, context, c6Var, rect, i10, i2VarArr));
            r10 = 0;
            wallettransaction2 = wallettransaction;
            linearLayout = a4Var;
            callback22 = callback2;
        } else {
            viewArr = viewArr2;
            r10 = 0;
            LinearLayout i02 = i0(context, i10, wallettransaction, callback3, callback2, bArr, q0Var, c6Var, i2VarArr2);
            wallettransaction2 = wallettransaction;
            i2VarArr = i2VarArr2;
            callback22 = callback2;
            linearLayout = i02;
        }
        c4 c4Var = new c4(context, linearLayout, c6Var, linearLayout, viewArr, context);
        i2VarArr[r10] = c4Var;
        if ((linearLayout instanceof k91) && callback22 != null) {
            c4Var.setOnDismissListener(new je1(20, callback22, wallettransaction2));
        }
        i2 i2Var = i2VarArr[r10];
        if (callback3 == null) {
            z10 = r10;
        }
        i2Var.setFocusable(z10);
        i2 i2Var2 = i2VarArr[r10];
        i2Var2.useBackgroundTopPadding = r10;
        i2Var2.show();
    }

    public static void t0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        org.telegram.ui.ActionBar.e3 i10 = yh.i(1, context, c6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19972h5, c6Var)));
        frameLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, w7.a6.d(-2.0f, -1));
        linearLayout.addView(new b6(160, context, false), w7.a6.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.WalletHowItWorks));
        yh.n(org.telegram.ui.ActionBar.g6.f20007j5, c6Var, textView, 1, 17.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView i11 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.a6.t(-1, -2, 1, 0, 0, 0, 6), context);
        i11.setText(LocaleController.getString(R.string.WalletHowItWorksInfo));
        int i12 = org.telegram.ui.ActionBar.g6.f20305z6;
        yh.n(i12, c6Var, i11, 1, 14.0f);
        i11.setGravity(17);
        i11.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
        linearLayout.addView(i11, w7.a6.t(-1, -2, 1, 0, 0, 0, 24));
        r4 r4Var = new r4(context, c6Var);
        r4Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        r4Var.a(LocaleController.getString(R.string.WalletSendInstantly), LocaleController.getString(R.string.WalletSendInstantlyInfo), R.drawable.wallet_learn_instant);
        linearLayout.addView(r4Var, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        r4 r4Var2 = new r4(context, c6Var);
        r4Var2.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        r4Var2.a(LocaleController.getString(R.string.WalletNoFees), LocaleController.getString(R.string.WalletNoFeesInfo), R.drawable.wallet_learn_fees);
        linearLayout.addView(r4Var2, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        r4 r4Var3 = new r4(context, c6Var);
        r4Var3.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        r4Var3.a(LocaleController.getString(R.string.WalletBlockchainVerified), LocaleController.getString(R.string.WalletBlockchainVerifiedInfo), R.drawable.wallet_learn_verified);
        linearLayout.addView(r4Var3, w7.a6.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        di.d f7 = yh.f(24, context, c6Var, true);
        f7.setText(LocaleController.getString(R.string.WalletGotIt));
        linearLayout.addView(f7, w7.a6.t(-1, 48, 1, 0, 0, 0, 0));
        w7.c6.b(f7, 0.02f, 1.1f);
        da0 da0Var = new da0(context, null);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        da0Var.setTextSize(1, 13.0f);
        da0Var.setGravity(17);
        da0Var.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19960gc, c6Var), new g3(context, 1)));
        linearLayout.addView(da0Var, w7.a6.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        i10.customView = frameLayout;
        org.telegram.ui.ActionBar.e3[] e3VarArr = {i10};
        e3VarArr[0].setAllowNestedScroll(true);
        e3VarArr[0].fixNavigationBar();
        f7.setOnClickListener(new q3(e3VarArr, 1));
        e3VarArr[0].show();
    }

    public static void u0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        j0 v = j0.v(i10);
        if (v.D()) {
            String r10 = v.r();
            if (TextUtils.isEmpty(r10)) {
                return;
            }
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, context, c6Var, false);
            e3Var.setBackgroundColor(-12207881);
            e3Var.fixNavigationBar(-12207881);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(new y4());
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, w7.a6.f(-2.0f, 55, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
            x4 x4Var = new x4(context, r10);
            linearLayout.addView(x4Var, w7.a6.q(288, 302, 1));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.WalletReceiveInfo));
            textView.setTextColor(-1);
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
            linearLayout.addView(textView, w7.a6.t(-1, -2, 1, 24, 0, 24, 20));
            di.d dVar = new di.d(context, null, true);
            dVar.setRoundRadius(24);
            dVar.setColor(-1);
            dVar.setTextColor(-15556886);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "$");
            spannableStringBuilder.setSpan(new br(R.drawable.wallet_buy, 0), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.WalletBuyWithCashOrCrypto));
            dVar.setText(spannableStringBuilder);
            linearLayout.addView(dVar, w7.a6.t(-1, 48, 1, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.ic_close_white);
            imageView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
            imageView.setContentDescription(LocaleController.getString(R.string.Close));
            w7.c6.a(imageView);
            frameLayout.addView(imageView, w7.a6.a(48.0f, 4.0f, 2.0f, 0.0f, 0.0f, 48, 51));
            e3Var.customView = frameLayout;
            e3Var.occupyNavigationBar = true;
            e3Var.setApplyTopPadding(false);
            e3Var.setApplyBottomPadding(false);
            e3Var.fixNavigationBar(-12207881);
            imageView.setOnClickListener(new e3(e3Var, 0));
            x4Var.e = new p0(r10, 1);
            e3Var.show();
            e3Var.setOverlayNavBarColor(-12207881);
            AndroidUtilities.setNavigationBarColor((Dialog) e3Var, -12207881, false);
            AndroidUtilities.setLightNavigationBar((Dialog) e3Var, false);
            if (Build.VERSION.SDK_INT >= 29 && e3Var.getWindow() != null) {
                e3Var.getWindow().setNavigationBarContrastEnforced(false);
            }
            dVar.setOnClickListener(new bi.f7(dVar, i10, e3Var, c6Var, 7));
        }
    }

    public final void A0() {
        boolean z10;
        j0 v = j0.v(this.currentAccount);
        G0();
        di.d dVar = this.f33949y0;
        if (v.D() && v.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (!v.D()) {
            this.f33938r0.setText(r0(0));
            this.f33940s0.setText(r0(1));
            return;
        }
        long t10 = v.t();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.E0 == null) {
            this.E0 = new SpannableString("G");
            m4 m4Var = this.d;
            m4Var.getClass();
            g5 g5Var = new g5(m4Var, R.drawable.wallet_gram_large);
            this.f33941t0 = g5Var;
            SpannableString spannableString = this.E0;
            spannableString.setSpan(g5Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.E0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) h5.c(t10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        if (this.f33942u0 == null) {
            ?? characterStyle = new CharacterStyle();
            characterStyle.f33595a = -9577217;
            this.f33942u0 = characterStyle;
        }
        spannableStringBuilder.setSpan(this.f33942u0, length, spannableStringBuilder.length(), 33);
        this.f33938r0.setText(spannableStringBuilder);
        CharSequence l4 = j0.v(this.currentAccount).l(t10, false);
        if (TextUtils.isEmpty(l4)) {
            this.f33940s0.setText(r0(1));
        } else {
            this.f33940s0.setText(l4);
        }
        D0(this.f33943v0);
        b0 b0Var = this.A0;
        if (b0Var != null && !b0Var.h && !b0Var.f32945i && b0Var.f32947k == null) {
            b0Var.d();
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
        if (!rect.isEmpty() && this.f33948y.isAttachedToWindow()) {
            m4 m4Var = this.d;
            ah.v vVar = this.E;
            Matrix matrix = m4Var.f33244y;
            Matrix matrix2 = m4Var.f33243x;
            Matrix matrix3 = m4Var.f33242w;
            if (m4Var.isAttachedToWindow() && vVar.isAttachedToWindow() && m4Var.getRootView() == vVar.getRootView()) {
                View view = (View) m4Var.F.getParent();
                FrameLayout frameLayout = m4Var.E;
                if (frameLayout instanceof c5) {
                    matrix3.set((Matrix) ((c5) frameLayout).f33011b.f3174b);
                } else {
                    matrix3.set(((p5) frameLayout).v.f33514a);
                }
                Matrix matrix4 = this.I;
                h5.f(view, matrix4);
                matrix4.preConcat(matrix3);
                matrix4.preTranslate(m4Var.F.getLeft() - view.getScrollX(), m4Var.F.getTop() - view.getScrollY());
                matrix4.preConcat(m4Var.F.getMatrix());
                h5.f(vVar, matrix2);
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
                    ah.v vVar2 = this.E;
                    int[] iArr = this.P;
                    vVar2.getLocationInWindow(iArr);
                    View view2 = this.f33948y;
                    int[] iArr2 = this.O;
                    view2.getLocationInWindow(iArr2);
                    this.d.e(this.f33943v0, this.f33946x.getWidth() / 0.75f);
                    float f11 = iArr2[0] - iArr[0];
                    float f12 = (iArr2[1] - iArr[1]) - ((height * 0.75f) * 0.5f);
                    for (int i13 = 0; i13 < 4; i13++) {
                        int i14 = i13 * 2;
                        float lerp = AndroidUtilities.lerp(fArr2[i14], (fArr[i14] * 0.75f) + f11, this.f33943v0);
                        float[] fArr3 = this.N;
                        fArr3[i14] = lerp;
                        int i15 = i14 + 1;
                        fArr3[i15] = AndroidUtilities.lerp(fArr2[i15], (fArr[i15] * 0.75f) + f12, this.f33943v0);
                    }
                    Matrix matrix5 = this.K;
                    boolean polyToPoly = matrix5.setPolyToPoly(this.L, 0, this.N, 0, 4);
                    Matrix matrix6 = this.J;
                    if (polyToPoly && !matrix6.equals(matrix5)) {
                        matrix6.set(matrix5);
                        this.E.invalidate();
                    }
                    m4 m4Var2 = this.d;
                    Matrix matrix7 = m4Var2.f33237c;
                    Matrix matrix8 = m4Var2.e;
                    Matrix matrix9 = m4Var2.d;
                    if (matrix4.invert(matrix9)) {
                        matrix8.setConcat(matrix9, matrix6);
                        if (!m4Var2.h || !matrix7.equals(matrix8)) {
                            matrix7.set(matrix8);
                            m4Var2.h = true;
                            m4Var2.L.invalidate();
                        }
                    }
                    float lerp2 = AndroidUtilities.lerp(1.0f, 1.1428572f, this.f33943v0);
                    this.f33940s0.setPivotX(0.0f);
                    this.f33940s0.setPivotY(0.0f);
                    this.f33940s0.setScaleX(lerp2);
                    this.f33940s0.setScaleY(lerp2);
                }
            }
        }
    }

    public final void C0() {
        ah.v vVar;
        float clamp;
        float f7;
        m4 m4Var;
        int i10;
        boolean z10;
        LinearLayout linearLayout;
        int[] iArr;
        int[] iArr2;
        if (this.f23964a != null && this.d != null && this.f33936q0 != null && this.f33948y != null && (vVar = this.E) != null && this.actionBar != null) {
            vVar.bringToFront();
            View m10 = this.f23964a.V2.m(this.f33924f);
            if (m10 == null) {
                if (this.f23964a.V2.L0() > this.f33924f) {
                    clamp = 1.0f;
                } else {
                    clamp = 0.0f;
                }
            } else {
                clamp = Utilities.clamp((this.f23964a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
            }
            this.f33943v0 = clamp;
            E0();
            if (m10 != null) {
                f7 = Math.max(0.0f, (m10.getHeight() / 2.0f) + AndroidUtilities.dp(24.0f)) * this.f33943v0;
            } else {
                f7 = 0.0f;
            }
            float lerp = AndroidUtilities.lerp(1.0f, 0.8f, this.f33943v0);
            this.d.setPivotX(m4Var.getWidth() * 0.5f);
            this.d.setPivotY(0.0f);
            this.d.setScaleX(lerp);
            this.d.setScaleY(lerp);
            this.d.setAlpha(1.0f - Utilities.clamp01(AndroidUtilities.ilerp(clamp, 0.75f, 1.0f)));
            m4 m4Var2 = this.d;
            if (m10 != null && clamp < 1.0f && m10.getBottom() > this.f23964a.getPaddingTop() && m10.getTop() < this.f23964a.getHeight() - this.f23964a.getPaddingBottom()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            m4Var2.setVisibility(i10);
            if (m10 != null) {
                this.f23964a.getLocationInWindow(this.Q);
                this.h.getLocationInWindow(this.R);
                this.d.setTranslationX(((this.e.getWidth() - this.d.getWidth()) / 2.0f) + this.e.getX() + m10.getX() + (iArr[0] - iArr2[0]));
                this.d.setTranslationY(this.e.getY() + m10.getY() + (iArr[1] - iArr2[1]) + f7);
            }
            if (clamp > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.F != z10 && (linearLayout = this.f33936q0) != null) {
                Rect rect = this.H;
                if (z10) {
                    if (linearLayout.getWidth() != 0 && this.f33936q0.getHeight() != 0) {
                        rect.set(this.f33936q0.getLeft(), this.f33936q0.getTop(), this.f33936q0.getRight(), this.f33936q0.getBottom());
                    }
                }
                this.d.setOnFrontContentPresented(null);
                this.G = false;
                AndroidUtilities.removeFromParent(this.f33936q0);
                this.F = z10;
                if (z10) {
                    this.E.addView(this.f33936q0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                    this.f33936q0.layout(0, 0, rect.width(), rect.height());
                    B0();
                } else {
                    m4 m4Var3 = this.d;
                    m4Var3.e(0.0f, 0.0f);
                    LinearLayout linearLayout2 = m4Var3.K;
                    AndroidUtilities.removeFromParent(linearLayout2);
                    linearLayout2.setScaleX(1.0f);
                    linearLayout2.setScaleY(1.0f);
                    linearLayout2.setRotationX(0.0f);
                    linearLayout2.setRotationY(0.0f);
                    linearLayout2.setTranslationX(0.0f);
                    linearLayout2.setTranslationY(0.0f);
                    org.telegram.ui.Components.s6 s6Var = m4Var3.M;
                    s6Var.setScaleX(1.0f);
                    s6Var.setScaleY(1.0f);
                    m4Var3.F.addView(linearLayout2, m4Var3.N);
                    this.f33936q0.layout(rect.left, rect.top, rect.right, rect.bottom);
                    this.G = !this.d.f33239n;
                    B0();
                    if (this.G) {
                        this.d.setOnFrontContentPresented(new f3(this, 9));
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
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.G6);
        this.f33938r0.setTextColor(AndroidUtilities.lerpColor(-1, themedColor, f7));
        this.f33940s0.setTextColor(AndroidUtilities.lerpColor(-7868417, i0.a.k(themedColor, Math.round(142.8f)), f7));
        g5 g5Var = this.f33941t0;
        if (g5Var != null) {
            g5Var.setOverrideColor(AndroidUtilities.lerpColor(-1, getThemedColor(org.telegram.ui.ActionBar.g6.Oh), f7));
        }
        p4 p4Var = this.f33942u0;
        if (p4Var != null) {
            p4Var.f33595a = i0.a.k(-9577217, Math.round((1.0f - f7) * 255.0f));
        }
        this.f33938r0.invalidate();
    }

    public final void E0() {
        b71 b71Var = this.f23964a;
        if (b71Var != null && this.d != null) {
            float b10 = b71Var.C2.b(1);
            float min = Math.min(10.0f, this.f23964a.C2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f));
            this.d.setAdditionalTilt(Math.max(0.0f, (this.f33943v0 * 10.0f) + ((((float) Math.sqrt(Utilities.clamp01(this.f33943v0))) * 90.0f) - 10.0f)) + min);
            this.d.setUseGyroscope(1.0f - ((float) Math.pow(this.f33943v0, 0.33000001311302185d)));
        }
    }

    public final void F0(boolean z10) {
        boolean y02 = y0();
        b71 b71Var = this.f23964a;
        h71[] h71VarArr = this.f33935p0;
        if (b71Var != null && this.m0 != y02) {
            this.m0 = y02;
            b71Var.B0();
            for (h71 h71Var : h71VarArr) {
                if (h71Var != null) {
                    h71Var.B0();
                }
            }
            this.f23964a.W2.N(false);
            this.f23964a.V2.h1(0, 0);
            this.f23964a.post(new f3(this, 11));
        }
        if (!y02) {
            for (h71 h71Var2 : h71VarArr) {
                if (h71Var2 != null) {
                    boolean canScrollVertically = h71Var2.canScrollVertically(-1);
                    h71Var2.W2.N(z10);
                    h71Var2.a0();
                    if (!canScrollVertically) {
                        h71Var2.V2.h1(0, 0);
                    }
                }
            }
            LinearLayout linearLayout = this.f33931l0;
            if (linearLayout != null) {
                linearLayout.post(new f3(this, 5));
                this.f33931l0.post(new f3(this, 6));
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
        j0 v = j0.v(this.currentAccount);
        boolean z13 = false;
        if (this.T.isAttachedToWindow() && this.T.isLaidOut()) {
            z10 = true;
        } else {
            z10 = false;
        }
        i4 i4Var = this.T;
        FrameLayout frameLayout = this.U;
        Boolean bool = v.f33324i;
        if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(v.f33325j)) {
            z11 = true;
        } else {
            z11 = false;
        }
        i4Var.i(frameLayout, z11, z10);
        ArrayList arrayList = v.C;
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            f0 f0Var = (f0) obj;
            if (!f0Var.e) {
                long j11 = f0Var.f33165c;
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
            this.X.setText(m0(R.string.WalletOldWalletsBalance, j10));
        }
        this.T.i(this.W, z12, z10);
        long j12 = zh.n5.y(this.currentAccount, true).p().amount;
        if (j12 > 500000000) {
            z13 = true;
        }
        if (z13) {
            this.Z.setText(m0(R.string.WalletGramEarningsBalance, j12));
        }
        this.T.i(this.Y, z13, z10);
    }

    @Override
    public final void U(ArrayList arrayList, z61 z61Var) {
        j0 v = j0.v(this.currentAccount);
        G0();
        arrayList.add(l61.l(this.S));
        this.f33924f = arrayList.size();
        j4 j4Var = this.e;
        l61 l61Var = new l61(-4);
        l61Var.f26948c = j4Var;
        l61Var.f26967z = -1;
        l61Var.e = true;
        arrayList.add(l61Var);
        arrayList.add(l61.l(this.f33945w0));
        boolean y02 = y0();
        this.m0 = y02;
        if (y02) {
            int i10 = R.drawable.wallet_learn_instant;
            String string = LocaleController.getString(R.string.WalletSendInstantly);
            String string2 = LocaleController.getString(R.string.WalletSendInstantlyInfo);
            int i11 = q4.f33623a;
            l61 J = l61.J(q4.class);
            J.f26953k = i10;
            J.f26954l = string;
            J.f26955m = string2;
            arrayList.add(J);
            int i12 = R.drawable.wallet_learn_fees;
            String string3 = LocaleController.getString(R.string.WalletNoFees);
            String string4 = LocaleController.getString(R.string.WalletNoFeesInfo);
            l61 J2 = l61.J(q4.class);
            J2.f26953k = i12;
            J2.f26954l = string3;
            J2.f26955m = string4;
            arrayList.add(J2);
            int i13 = R.drawable.wallet_learn_verified;
            String string5 = LocaleController.getString(R.string.WalletBlockchainVerified);
            String string6 = LocaleController.getString(R.string.WalletBlockchainVerifiedInfo);
            l61 J3 = l61.J(q4.class);
            J3.f26953k = i13;
            J3.f26954l = string5;
            J3.f26955m = string6;
            arrayList.add(J3);
            arrayList.add(l61.l(this.f33920b0));
        } else if (this.f33931l0 != null) {
            if (this.F0 && !this.G0 && v.t() > 500000000) {
                arrayList.add(l61.k(this.f33922d0));
            }
            arrayList.add(l61.p(this.f33931l0, 0, true));
        }
        da0 da0Var = this.f33919a0;
        if (da0Var != null) {
            this.f33921c0 = false;
            da0Var.animate().cancel();
            this.f33919a0.setAlpha(0.0f);
            this.f33919a0.setVisibility(4);
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletTitle);
    }

    @Override
    public final void W(l61 l61Var, View view) {
        b0 b0Var;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj = l61Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            Activity parentActivity = getParentActivity();
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) l61Var.G;
            org.telegram.ui.ActionBar.c6 resourceProvider = getResourceProvider();
            if (parentActivity != null && nftitem != null) {
                int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19843a7, resourceProvider);
                int w03 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, resourceProvider);
                y3 y3Var = new y3(parentActivity, resourceProvider);
                y3Var.setBackgroundColor(w02);
                y3Var.fixNavigationBar(w02);
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.setFillViewport(true);
                scrollView.setVerticalScrollBarEnabled(false);
                LinearLayout linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(1);
                linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
                z9 z9Var = new z9(parentActivity);
                z9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
                z9Var.setContentDescription(nftitem.name);
                Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
                int i15 = org.telegram.ui.ActionBar.g6.f20305z6;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i15, resourceProvider), PorterDuff.Mode.SRC_IN));
                ImageLocation b10 = c.b(nftitem, false);
                if (b10 != null) {
                    z9Var.h(b10, "120_120", mutate, nftitem);
                } else {
                    z9Var.setImageDrawable(mutate);
                }
                linearLayout.addView(z9Var, w7.a6.q(120, 120, 1));
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
                linearLayout.addView(textView, w7.a6.k(12.0f, 16.0f, 12.0f, 0.0f, -1, -2));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText(nftitem.description);
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i15, resourceProvider));
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                if (TextUtils.isEmpty(nftitem.description)) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                textView2.setVisibility(i10);
                linearLayout.addView(textView2, w7.a6.k(12.0f, 4.0f, 12.0f, 0.0f, -1, -2));
                LinearLayout linearLayout2 = new LinearLayout(parentActivity);
                linearLayout2.setOrientation(0);
                linearLayout.addView(linearLayout2, w7.a6.k(0.0f, 20.0f, 0.0f, 16.0f, -1, 54));
                int i17 = 0;
                while (i17 < 2) {
                    LinearLayout linearLayout3 = new LinearLayout(parentActivity);
                    linearLayout3.setOrientation(1);
                    linearLayout3.setGravity(i16);
                    int dp = AndroidUtilities.dp(16.0f);
                    int w04 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, resourceProvider);
                    int w05 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, resourceProvider);
                    linearLayout3.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, w04, w05, w05));
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
                    linearLayout3.addView(imageView, w7.a6.n(24, 24));
                    TextView textView3 = new TextView(parentActivity);
                    textView3.setText(string);
                    textView3.setTextColor(w03);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setTypeface(AndroidUtilities.bold());
                    textView3.setGravity(17);
                    linearLayout3.addView(textView3, w7.a6.k(0.0f, 2.0f, 0.0f, 0.0f, -2, -2));
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
                    linearLayout2.addView(linearLayout3, w7.a6.m(1.0f, 0, -1, i13, i14, 0));
                    i17++;
                    i16 = 17;
                }
                ArrayList<TL_wallet.nftAttribute> arrayList = nftitem.attributes;
                if (arrayList != null && !arrayList.isEmpty()) {
                    n01 n01Var = new n01(parentActivity, resourceProvider);
                    n01Var.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, resourceProvider)));
                    ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                    int size = arrayList2.size();
                    int i18 = 0;
                    while (i18 < size) {
                        TL_wallet.nftAttribute nftattribute = arrayList2.get(i18);
                        i18++;
                        TL_wallet.nftAttribute nftattribute2 = nftattribute;
                        n01Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                    }
                    linearLayout.addView(n01Var, w7.a6.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
                }
                di.d dVar = new di.d(parentActivity, resourceProvider, true);
                dVar.setRoundRadius(24);
                dVar.setText(LocaleController.getString(R.string.WalletOK));
                linearLayout.addView(dVar, w7.a6.n(-1, 48));
                y3Var.setCustomView(scrollView);
                y3Var.useBackgroundTopPadding = false;
                linearLayout2.getChildAt(0).setOnClickListener(new bz0(13, y3Var, nftitem));
                linearLayout2.getChildAt(1).setOnClickListener(new j3(parentActivity, 0));
                dVar.setOnClickListener(new j3(y3Var, 1));
                y3Var.show();
                y3Var.fixNavigationBar(w02);
                AndroidUtilities.setNavigationBarColor((Dialog) y3Var, w02, false);
            }
        } else if (l61Var.d == -10001 && (b0Var = this.A0) != null) {
            b0Var.d();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            s0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) l61Var.G, null, null, null, null, getResourceProvider());
        }
    }

    @Override
    public final boolean X(l61 l61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        ValueAnimator valueAnimator = this.f33930k0;
        if (valueAnimator != null) {
            this.f33930k0 = null;
            valueAnimator.cancel();
        }
        z0();
        v4 v4Var = this.f33934o0;
        if (v4Var != null) {
            v4Var.b(null);
        }
        this.e = null;
        this.T = null;
        this.S = null;
        this.f33931l0 = null;
        this.f33933n0 = null;
        h71[] h71VarArr = this.f33935p0;
        h71VarArr[0] = null;
        h71VarArr[1] = null;
        b0 b0Var = this.A0;
        if (b0Var != null && !b0Var.f32940a.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33926g0 = z10;
        if (!z10) {
            this.f33925f0 = 0;
        }
        View createView = super.createView(context);
        ld0 ld0Var = new ld0(this, context);
        ld0Var.addView(createView, w7.a6.d(-1.0f, -1));
        this.fragmentView = ld0Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f19843a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        n10.a(2, R.drawable.scan_qr).setOnClickListener(new View.OnClickListener(this) {
            public final z4 f33229b;

            {
                this.f33229b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z4 z4Var = this.f33229b;
                        z4Var.getClass();
                        z4Var.presentFragment(new oh1(6, null));
                        return;
                    case 1:
                        z4.c0(this.f33229b);
                        return;
                    case 2:
                        z4.f0(this.f33229b);
                        return;
                    case 3:
                        this.f33229b.v0();
                        return;
                    default:
                        z4.a0(this.f33229b);
                        return;
                }
            }
        });
        n10.a(1, R.drawable.ic_ab_other).setOnClickListener(new bz0(15, this, context));
        ah.x xVar = new ah.x(this, context, 25);
        this.S = xVar;
        xVar.setClipToPadding(false);
        this.S.setClipChildren(false);
        this.S.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        i4 i4Var = new i4(this, context);
        this.T = i4Var;
        i4Var.setDefaultRadiusDp(22);
        this.T.setOnAnimatedHeightChangedListener(new f3(this, 0));
        TextView textView = new TextView(context);
        this.V = textView;
        textView.setText(LocaleController.getString(R.string.WalletWaltFunds));
        this.U = j0(this.V, new f3(this, 1));
        TextView textView2 = new TextView(context);
        this.X = textView2;
        this.W = j0(textView2, new f3(this, 2));
        TextView textView3 = new TextView(context);
        this.Z = textView3;
        this.Y = j0(textView3, new f3(this, 3));
        this.S.addView(this.T, w7.a6.d(-2.0f, -1));
        da0 da0Var = new da0(context, null);
        this.f33919a0 = da0Var;
        this.f33921c0 = false;
        da0Var.setAlpha(0.0f);
        da0 da0Var2 = this.f33919a0;
        int i11 = org.telegram.ui.ActionBar.g6.f20305z6;
        da0Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, this.resourceProvider));
        this.f33919a0.setTextSize(1, 13.0f);
        this.f33919a0.setGravity(17);
        this.f33919a0.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19960gc, this.resourceProvider), new g3(context, 0)));
        this.f33919a0.setVisibility(4);
        ((FrameLayout) createView).addView(this.f33919a0, w7.a6.a(-2.0f, 12.0f, 0.0f, 12.0f, 24.0f, -1, 81));
        j4 j4Var = new j4(this, context, 0);
        this.f33920b0 = j4Var;
        j4Var.setImportantForAccessibility(2);
        this.f33922d0 = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f33923e0 = frameLayout;
        int i12 = org.telegram.ui.ActionBar.g6.f19901d6;
        int themedColor = getThemedColor(i12);
        int themedColor2 = getThemedColor(i12);
        int i13 = org.telegram.ui.ActionBar.g6.f19990i6;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.a0(themedColor, org.telegram.ui.ActionBar.g6.v(themedColor2, getThemedColor(i13)), 16, 16));
        this.f33922d0.addView(this.f33923e0, w7.a6.a(-2.0f, 12.0f, 0.0f, 12.0f, 12.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        float dpf2 = AndroidUtilities.dpf2(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2}, null, null));
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.f33923e0.addView(imageView, w7.a6.a(28.0f, 14.0f, 11.0f, 16.0f, 11.0f, 28, 19));
        TextView textView4 = new TextView(context);
        yh.n(org.telegram.ui.ActionBar.g6.f20139q7, this.resourceProvider, textView4, 1, 16.0f);
        textView4.setText(LocaleController.getString(R.string.WalletProtectAccount));
        this.f33923e0.addView(textView4, w7.a6.a(-2.0f, 58.0f, 0.0f, 32.0f, 0.0f, -1, 19));
        this.f33923e0.setOnClickListener(new View.OnClickListener(this) {
            public final z4 f33229b;

            {
                this.f33229b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z4 z4Var = this.f33229b;
                        z4Var.getClass();
                        z4Var.presentFragment(new oh1(6, null));
                        return;
                    case 1:
                        z4.c0(this.f33229b);
                        return;
                    case 2:
                        z4.f0(this.f33229b);
                        return;
                    case 3:
                        this.f33229b.v0();
                        return;
                    default:
                        z4.a0(this.f33229b);
                        return;
                }
            }
        });
        w7.c6.b(this.f33923e0, 0.02f, 1.2f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f33946x = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.f33946x.setClipToPadding(false);
        this.actionBar.addView(this.f33946x, w7.a6.a(56.0f, 64.0f, 0.0f, 96.0f, 0.0f, -1, 87));
        View view = new View(context);
        this.f33948y = view;
        this.f33946x.addView(view, w7.a6.e(1, 1, 19));
        this.F = false;
        this.G = false;
        this.H.setEmpty();
        this.J.reset();
        ah.v vVar = new ah.v(this, context);
        this.E = vVar;
        vVar.setClipChildren(false);
        this.E.setClipToPadding(false);
        m4 m4Var = new m4(this, context, this.f33944w);
        this.d = m4Var;
        m4Var.setDiamondOnCard(true);
        this.d.setCardOnClickListener(new View.OnClickListener(this) {
            public final z4 f33229b;

            {
                this.f33229b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        z4 z4Var = this.f33229b;
                        z4Var.getClass();
                        z4Var.presentFragment(new oh1(6, null));
                        return;
                    case 1:
                        z4.c0(this.f33229b);
                        return;
                    case 2:
                        z4.f0(this.f33229b);
                        return;
                    case 3:
                        this.f33229b.v0();
                        return;
                    default:
                        z4.a0(this.f33229b);
                        return;
                }
            }
        });
        this.f23964a.C2.f23854b.add(this.v);
        j4 j4Var2 = new j4(this, context, 1);
        this.e = j4Var2;
        j4Var2.setImportantForAccessibility(2);
        n4 n4Var = new n4(this, context);
        this.h = n4Var;
        n4Var.setClipChildren(false);
        this.h.setClipToPadding(false);
        this.h.addView(this.d, w7.a6.d(-2.0f, -1));
        ld0Var.addView(this.h, w7.a6.d(-1.0f, -1));
        this.f23964a.setClipChildren(false);
        this.f23964a.setClipToPadding(false);
        this.f33936q0 = this.d.getBalanceLayout();
        this.f33938r0 = this.d.getBalanceView();
        this.f33940s0 = this.d.getUsdBalanceView();
        this.d.setCardHolder(UserObject.getUserName(getUserConfig().getCurrentUser()).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33945w0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f33945w0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        di.d dVar = new di.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.f33947x0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletAddFunds));
        this.f33945w0.addView(this.f33947x0, w7.a6.m(1.0f, 0, 48, 0, 4, 0));
        this.f33947x0.setOnClickListener(new View.OnClickListener(this) {
            public final z4 f33229b;

            {
                this.f33229b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        z4 z4Var = this.f33229b;
                        z4Var.getClass();
                        z4Var.presentFragment(new oh1(6, null));
                        return;
                    case 1:
                        z4.c0(this.f33229b);
                        return;
                    case 2:
                        z4.f0(this.f33229b);
                        return;
                    case 3:
                        this.f33229b.v0();
                        return;
                    default:
                        z4.a0(this.f33229b);
                        return;
                }
            }
        });
        di.d dVar2 = new di.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f33949y0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.WalletSend));
        this.f33949y0.setEnabled(j0.v(this.currentAccount).e());
        this.f33949y0.setOnClickListener(new View.OnClickListener(this) {
            public final z4 f33229b;

            {
                this.f33229b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        z4 z4Var = this.f33229b;
                        z4Var.getClass();
                        z4Var.presentFragment(new oh1(6, null));
                        return;
                    case 1:
                        z4.c0(this.f33229b);
                        return;
                    case 2:
                        z4.f0(this.f33229b);
                        return;
                    case 3:
                        this.f33229b.v0();
                        return;
                    default:
                        z4.a0(this.f33229b);
                        return;
                }
            }
        });
        this.f33945w0.addView(this.f33949y0, w7.a6.m(1.0f, 0, 48, 4, 0, 0));
        this.f33950z0 = j0.v(this.currentAccount).z();
        this.f23964a.setDescendantFocusability(131072);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f33931l0 = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f33931l0.setBackgroundColor(getThemedColor(i10));
        di.h1 h1Var = new di.h1(this, context, this.resourceProvider, 10);
        this.f33933n0 = h1Var;
        h1Var.setAllowDisallowInterceptTouch(false);
        this.f33933n0.setAdapter(new w3(this));
        j91 n11 = this.f33933n0.n(-2, true);
        this.f33927h0 = n11;
        int i14 = org.telegram.ui.ActionBar.g6.Oh;
        n11.g(i14, i14, i11, i13, i12);
        this.f33927h0.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(18.0f), getThemedColor(i12)));
        x3 x3Var = new x3(this, context);
        this.f33928i0 = x3Var;
        x3Var.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
        this.f33928i0.addView(this.f33927h0, w7.a6.e(-2, 36, 49));
        this.f33933n0.setPosition(this.f33925f0);
        this.f33931l0.addView(this.f33928i0, w7.a6.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 48));
        this.f33931l0.addView(this.f33933n0, w7.a6.l(1.0f, -1, 0));
        w0(this.f33926g0);
        this.f23964a.j(new kc0(this, 10));
        z61 z61Var = this.f23964a.W2;
        z61Var.f31780r = false;
        z61Var.N(false);
        v4 v4Var2 = new v4(this);
        this.f33934o0 = v4Var2;
        v4Var2.b(this.f23964a);
        A0();
        this.f33950z0.e();
        this.actionBar.post(new f3(this, 10));
        this.f23964a.post(new f3(this, 11));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b71 b71Var;
        z61 z61Var;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.walletUpdate && this.f33938r0 != null) {
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
                        b71 b71Var2 = this.f23964a;
                        if (b71Var2 != null && (z61Var = b71Var2.W2) != null) {
                            z61Var.N(true);
                            return;
                        }
                        return;
                    }
                }
                getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new Object(), new d(this, 7));
            } else if (i10 == NotificationCenter.walletTransactionsUpdate && objArr.length > 0) {
                Object obj2 = objArr[0];
                i0 i0Var = this.f33950z0;
                if (obj2 == i0Var && (b71Var = this.f23964a) != null && b71Var.W2 != null) {
                    if (i0Var.f33274b.isEmpty()) {
                        i0 i0Var2 = this.f33950z0;
                        if (!i0Var2.f33277g) {
                            i0Var2.e();
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
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(org.telegram.ui.ActionBar.g6.f19990i6), 2, -1));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        frameLayout.addView(textView, w7.a6.a(-2.0f, 0.0f, 0.0f, 42.0f, 0.0f, -1, 3));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f20305z6), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.a6.e(-2, -2, 21));
        frameLayout.setOnClickListener(new j3(runnable, 2));
        textView.setDuplicateParentStateEnabled(true);
        w7.c6.b(textView, 0.02f, 1.2f);
        this.T.addView(frameLayout, w7.a6.n(-1, -2));
        return frameLayout;
    }

    public final CharSequence m0(int i10, long j10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((char) 65532);
        br brVar = new br(R.drawable.mini_gram_16, 0);
        brVar.recolorDrawable = false;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.Oh);
        spannableStringBuilder.setSpan(brVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) j0.n(j10, false));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(themedColor), length2, spannableStringBuilder.length(), 33);
        return LocaleController.formatSpannable(i10, spannableStringBuilder);
    }

    public final h71 n0() {
        View currentView;
        if (o0()) {
            di.h1 h1Var = this.f33933n0;
            if (h1Var == null) {
                currentView = null;
            } else {
                currentView = h1Var.getCurrentView();
            }
            if (currentView instanceof h71) {
                return (h71) currentView;
            }
        }
        return null;
    }

    public final boolean o0() {
        LinearLayout linearLayout;
        if (!this.m0 && (linearLayout = this.f33931l0) != null && linearLayout.isAttachedToWindow()) {
            ViewParent parent = this.f33931l0.getParent();
            b71 b71Var = this.f23964a;
            if (parent == b71Var.V2.m(b71Var.W2.f31783x.size() - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onBeginSlide() {
        v4 v4Var = this.f33934o0;
        if (v4Var != null) {
            v4Var.c();
        }
        b71 b71Var = this.f23964a;
        if (b71Var != null) {
            b71Var.B0();
        }
        h71 n02 = n0();
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
        j0 v = j0.v(this.currentAccount);
        if (v.f33330o == null) {
            v.f33330o = new b0(v);
        }
        b0 b0Var = v.f33330o;
        this.A0 = b0Var;
        ArrayList arrayList = b0Var.d;
        f3 f3Var = this.B0;
        if (!arrayList.contains(f3Var)) {
            arrayList.add(f3Var);
        }
        li1 li1Var = this.H0;
        if (li1Var != null) {
            li1Var.run();
        }
        int i10 = v.f33340z;
        v.f33340z = i10 + 1;
        HashSet hashSet = v.A;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i10));
        if (isEmpty) {
            v.P();
        }
        this.H0 = new li1(v, i10, 1);
        getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new Object(), new d(this, 7));
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        m4 m4Var = this.d;
        if (m4Var != null) {
            m4Var.setOnFrontContentPresented(null);
        }
        this.G = false;
        ValueAnimator valueAnimator = this.f33930k0;
        if (valueAnimator != null) {
            this.f33930k0 = null;
            valueAnimator.cancel();
        }
        b0 b0Var = this.A0;
        if (b0Var != null) {
            b0Var.d.remove(this.B0);
        }
        z0();
        v4 v4Var = this.f33934o0;
        if (v4Var != null) {
            v4Var.b(null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        AndroidUtilities.removeFromParent(this.E);
        i0 i0Var = this.f33950z0;
        if (i0Var != null) {
            i0Var.a();
        }
        super.onFragmentDestroy();
        li1 li1Var = this.H0;
        if (li1Var != null) {
            li1Var.run();
            this.H0 = null;
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f23964a.setPadding(0, 0, 0, i13);
        this.f23964a.setClipToPadding(false);
        da0 da0Var = this.f33919a0;
        if (da0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) da0Var.getLayoutParams();
            layoutParams.bottomMargin = AndroidUtilities.dp(24.0f) + i13;
            this.f33919a0.setLayoutParams(layoutParams);
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
            alertDialog$Builder.f19548a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new i3(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.L5, false), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.post(new f3(this, 10));
        }
        j0.v(this.currentAccount).B();
        if (this.A0 != null && j0.v(this.currentAccount).D()) {
            b0 b0Var = this.A0;
            if (!b0Var.f32946j) {
                b0Var.b();
                b0Var.e(true);
            }
        }
        A0();
        if (this.f23964a != null) {
            F0(true);
        }
    }

    public final void p0() {
        b0 b0Var;
        h71 h71Var = this.f33935p0[1];
        if (this.f33925f0 == 1 && h71Var != null && h71Var.G && (b0Var = this.A0) != null && !b0Var.f32945i && !b0Var.f32944g && b0Var.f32947k == null && h71Var.V2.N0() >= h71Var.W2.f31783x.size() - 3) {
            this.A0.d();
        }
    }

    public final void q0() {
        i0 i0Var;
        h71 h71Var = this.f33935p0[0];
        if (h71Var != null && h71Var.G && (i0Var = this.f33950z0) != null && !i0Var.f33277g && h71Var.V2.N0() >= h71Var.W2.f31783x.size() - 3) {
            this.f33950z0.e();
        }
    }

    public final CharSequence r0(int i10) {
        org.telegram.ui.Components.s6 s6Var;
        float f7;
        CharSequence[] charSequenceArr = this.C0;
        if (charSequenceArr[i10] == null) {
            charSequenceArr[i10] = new SpannableString("l");
            if (i10 == 0) {
                s6Var = this.f33938r0;
            } else {
                s6Var = this.f33940s0;
            }
            if (i10 == 0) {
                f7 = 100.0f;
            } else {
                f7 = 50.0f;
            }
            ia0 ia0Var = new ia0(AndroidUtilities.dp(f7), s6Var);
            ia0Var.a(org.telegram.ui.ActionBar.g6.m1(0.45f, -1), org.telegram.ui.ActionBar.g6.m1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i10];
            ((SpannableString) charSequence).setSpan(ia0Var, 0, charSequence.length(), 33);
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
        org.telegram.ui.z9.e0(getParentActivity(), true, 1, new ji.w4(this, 19));
    }

    public final void w0(boolean z10) {
        float f7;
        boolean z11;
        this.f33926g0 = z10;
        if (!z10) {
            this.f33925f0 = 0;
        }
        di.h1 h1Var = this.f33933n0;
        if (h1Var != null && this.f33928i0 != null) {
            if (!z10) {
                h1Var.setPosition(0);
            }
            ValueAnimator valueAnimator = this.f33930k0;
            if (valueAnimator != null) {
                this.f33930k0 = null;
                valueAnimator.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (this.f33931l0.isAttachedToWindow() && this.f33931l0.isLaidOut()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                this.f33933n0.o(false);
            }
            if (z11 && this.f33929j0 != f7) {
                this.f33928i0.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f33929j0, f7);
                this.f33930k0 = ofFloat;
                ofFloat.setDuration(250L);
                this.f33930k0.setInterpolator(es.h);
                this.f33930k0.addUpdateListener(new s2(this, 1));
                this.f33930k0.addListener(new org.telegram.ui.ActionBar.y0(this, f7, 6));
                this.f33930k0.start();
            } else {
                x0(f7);
                this.f33933n0.o(false);
            }
            if (this.f23964a != null && this.m0 != y0()) {
                F0(false);
            }
        }
    }

    public final void x0(float f7) {
        int i10;
        this.f33929j0 = f7;
        x3 x3Var = this.f33928i0;
        if (f7 <= 0.0f && this.f33930k0 == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        x3Var.setVisibility(i10);
        this.f33928i0.setAlpha(f7);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f33928i0.getLayoutParams();
        layoutParams.height = Math.round(AndroidUtilities.dp(48.0f) * f7);
        layoutParams.bottomMargin = -Math.round(AndroidUtilities.dp(6.0f) * f7);
        this.f33928i0.setLayoutParams(layoutParams);
    }

    public final boolean y0() {
        i0 i0Var;
        if (!this.f33926g0 && (i0Var = this.f33950z0) != null && i0Var.f33275c.isEmpty()) {
            i0 i0Var2 = this.f33950z0;
            i0Var2.getClass();
            if (i0Var2.f33277g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void z0() {
        this.f33937r = false;
        b71 b71Var = this.f23964a;
        if (b71Var != null) {
            b71Var.C2.f23854b.remove(this.v);
            this.f23964a.removeCallbacks(this.f33939s);
        }
        m4 m4Var = this.d;
        if (m4Var != null) {
            m4Var.setAdditionalTilt(0.0f);
        }
    }
}
