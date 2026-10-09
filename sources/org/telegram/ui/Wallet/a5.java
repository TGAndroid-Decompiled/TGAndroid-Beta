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
import org.telegram.messenger.bi;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.nd;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.r01;
import org.telegram.ui.Components.y9;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.fd0;
import org.telegram.ui.ft;
import org.telegram.ui.ih1;
import org.telegram.ui.ii1;
import org.telegram.ui.nu0;
import org.telegram.ui.v9;
import org.telegram.ui.vy0;
public final class a5 extends f71 implements NotificationCenter.NotificationCenterDelegate {
    public static Typeface I0;
    public c0 A0;
    public ci.m6 E;
    public SpannableString E0;
    public boolean F;
    public boolean F0;
    public boolean G;
    public boolean G0;
    public nd H0;
    public ai.f0 S;
    public i4 T;
    public FrameLayout U;
    public TextView V;
    public FrameLayout W;
    public TextView X;
    public FrameLayout Y;
    public TextView Z;
    public ea0 f34617a0;
    public j4 f34618b0;
    public boolean f34619c0;
    public m4 d;
    public FrameLayout f34620d0;
    public j4 f34621e;
    public FrameLayout f34622e0;
    public int f34623f;
    public boolean f34625g0;
    public n4 h;
    public n91 f34626h0;
    public x3 f34627i0;
    public float f34628j0;
    public ValueAnimator f34629k0;
    public LinearLayout f34630l0;
    public boolean m0;
    public int f34631n;
    public ci.h1 f34632n0;
    public v4 f34633o0;
    public LinearLayout f34635q0;
    public boolean f34636r;
    public org.telegram.ui.Components.r6 f34637r0;
    public org.telegram.ui.Components.r6 f34639s0;
    public h5 f34640t0;
    public p4 f34641u0;
    public float f34642v0;
    public LinearLayout f34644w0;
    public FrameLayout f34645x;
    public ci.d f34646x0;
    public View f34647y;
    public ci.d f34648y0;
    public j0 f34649z0;
    public final org.telegram.ui.Cells.t6 f34638s = new org.telegram.ui.Cells.t6(this, 28);
    public final k3 v = new cu() {
        @Override
        public final void a(int i10, boolean z10) {
            e71 e71Var;
            a5 a5Var = a5.this;
            org.telegram.ui.Cells.t6 t6Var = a5Var.f34638s;
            if ((i10 != 1 && i10 != 3) || (e71Var = a5Var.f26290a) == null) {
                return;
            }
            a5Var.f34636r = z10;
            e71Var.removeCallbacks(t6Var);
            t6Var.run();
        }
    };
    public boolean f34643w = false;
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
    public int f34624f0 = 0;
    public final k71[] f34634p0 = new k71[2];
    public final f3 B0 = new f3(this, 4);
    public final CharSequence[] C0 = new CharSequence[2];
    public final HashSet D0 = new HashSet();

    public static void Y(a5 a5Var, Context context, View view) {
        boolean z10;
        int i10;
        k0 v = k0.v(a5Var.currentAccount);
        final p80 I = p80.I(a5Var, view);
        I.a0(0.0f, -AndroidUtilities.dp(48.0f));
        I.f29789s = 0;
        I.V(5);
        p80 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.WalletBack), new nu0(I, 26), false);
        J.k();
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        m6 m6Var = new m6(a5Var, linearLayout, v, I, 9);
        J.r(scrollView, w7.x5.n(-1, 350));
        I.c(R.drawable.wallet_globe, LocaleController.getString(R.string.WalletCurrency), new k(m6Var, I, J, 8), false);
        org.telegram.ui.ActionBar.f1 y3 = I.y();
        f fVar = v.h;
        String i11 = fVar.i();
        boolean isEmpty = TextUtils.isEmpty(i11);
        String str = i11;
        if (isEmpty) {
            y3.setSubtext("USD");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Loading));
            spannableStringBuilder.setSpan(new ja0(AndroidUtilities.dp(75.0f), y3.f20576b), 0, spannableStringBuilder.length(), 33);
            str = spannableStringBuilder;
        }
        y3.setSubtext(str);
        if (fVar.f() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        m6 m6Var2 = new m6(v, new boolean[]{z10}, y3, m6Var, 10);
        a5Var.D0.add(m6Var2);
        m6Var.run();
        I.c(R.drawable.wallet_lock, LocaleController.getString(R.string.Passcode), new Runnable(a5Var) {
            public final a5 f35381b;

            {
                this.f35381b = a5Var;
            }

            @Override
            public final void run() {
                m4 m4Var;
                switch (r3) {
                    case 0:
                        a5 a5Var2 = this.f35381b;
                        a5Var2.getClass();
                        I.u();
                        a5Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        a5 a5Var3 = this.f35381b;
                        a5Var3.getClass();
                        I.u();
                        a5Var3.presentFragment(new l7());
                        return;
                    case 2:
                        a5 a5Var4 = this.f35381b;
                        a5Var4.getClass();
                        I.u();
                        a5Var4.presentFragment(new f71());
                        return;
                    case 3:
                        I.u();
                        a5 a5Var5 = this.f35381b;
                        a5.t0(a5Var5.getParentActivity(), a5Var5.getResourceProvider());
                        return;
                    default:
                        I.u();
                        a5 a5Var6 = this.f35381b;
                        boolean z11 = a5Var6.f34643w;
                        boolean z12 = !z11;
                        if (z11 != z12 && (m4Var = a5Var6.d) != null) {
                            a5Var6.f34643w = z12;
                            m4Var.setUse2D(z12);
                            a5Var6.f34621e.requestLayout();
                            a5Var6.d.post(new f3(a5Var6, 11));
                            return;
                        }
                        return;
                }
            }
        }, false);
        I.c(R.drawable.wallet_key, LocaleController.getString(R.string.WalletKeysAndBackup), new Runnable(a5Var) {
            public final a5 f35381b;

            {
                this.f35381b = a5Var;
            }

            @Override
            public final void run() {
                m4 m4Var;
                switch (r3) {
                    case 0:
                        a5 a5Var2 = this.f35381b;
                        a5Var2.getClass();
                        I.u();
                        a5Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        a5 a5Var3 = this.f35381b;
                        a5Var3.getClass();
                        I.u();
                        a5Var3.presentFragment(new l7());
                        return;
                    case 2:
                        a5 a5Var4 = this.f35381b;
                        a5Var4.getClass();
                        I.u();
                        a5Var4.presentFragment(new f71());
                        return;
                    case 3:
                        I.u();
                        a5 a5Var5 = this.f35381b;
                        a5.t0(a5Var5.getParentActivity(), a5Var5.getResourceProvider());
                        return;
                    default:
                        I.u();
                        a5 a5Var6 = this.f35381b;
                        boolean z11 = a5Var6.f34643w;
                        boolean z12 = !z11;
                        if (z11 != z12 && (m4Var = a5Var6.d) != null) {
                            a5Var6.f34643w = z12;
                            m4Var.setUse2D(z12);
                            a5Var6.f34621e.requestLayout();
                            a5Var6.d.post(new f3(a5Var6, 11));
                            return;
                        }
                        return;
                }
            }
        }, false);
        I.l(R.drawable.wallet_apps, LocaleController.getString(R.string.WalletConnectedApps), new Runnable(a5Var) {
            public final a5 f35381b;

            {
                this.f35381b = a5Var;
            }

            @Override
            public final void run() {
                m4 m4Var;
                switch (r3) {
                    case 0:
                        a5 a5Var2 = this.f35381b;
                        a5Var2.getClass();
                        I.u();
                        a5Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        a5 a5Var3 = this.f35381b;
                        a5Var3.getClass();
                        I.u();
                        a5Var3.presentFragment(new l7());
                        return;
                    case 2:
                        a5 a5Var4 = this.f35381b;
                        a5Var4.getClass();
                        I.u();
                        a5Var4.presentFragment(new f71());
                        return;
                    case 3:
                        I.u();
                        a5 a5Var5 = this.f35381b;
                        a5.t0(a5Var5.getParentActivity(), a5Var5.getResourceProvider());
                        return;
                    default:
                        I.u();
                        a5 a5Var6 = this.f35381b;
                        boolean z11 = a5Var6.f34643w;
                        boolean z12 = !z11;
                        if (z11 != z12 && (m4Var = a5Var6.d) != null) {
                            a5Var6.f34643w = z12;
                            m4Var.setUse2D(z12);
                            a5Var6.f34621e.requestLayout();
                            a5Var6.d.post(new f3(a5Var6, 11));
                            return;
                        }
                        return;
                }
            }
        }, true ^ v.f35122g.d.isEmpty());
        I.k();
        I.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsWallet), new Runnable(a5Var) {
            public final a5 f35381b;

            {
                this.f35381b = a5Var;
            }

            @Override
            public final void run() {
                m4 m4Var;
                switch (r3) {
                    case 0:
                        a5 a5Var2 = this.f35381b;
                        a5Var2.getClass();
                        I.u();
                        a5Var2.presentFragment(PasscodeActivity.e0());
                        return;
                    case 1:
                        a5 a5Var3 = this.f35381b;
                        a5Var3.getClass();
                        I.u();
                        a5Var3.presentFragment(new l7());
                        return;
                    case 2:
                        a5 a5Var4 = this.f35381b;
                        a5Var4.getClass();
                        I.u();
                        a5Var4.presentFragment(new f71());
                        return;
                    case 3:
                        I.u();
                        a5 a5Var5 = this.f35381b;
                        a5.t0(a5Var5.getParentActivity(), a5Var5.getResourceProvider());
                        return;
                    default:
                        I.u();
                        a5 a5Var6 = this.f35381b;
                        boolean z11 = a5Var6.f34643w;
                        boolean z12 = !z11;
                        if (z11 != z12 && (m4Var = a5Var6.d) != null) {
                            a5Var6.f34643w = z12;
                            m4Var.setUse2D(z12);
                            a5Var6.f34621e.requestLayout();
                            a5Var6.d.post(new f3(a5Var6, 11));
                            return;
                        }
                        return;
                }
            }
        }, false);
        if (BuildVars.DEBUG_VERSION) {
            I.k();
            if (a5Var.f34643w) {
                i10 = R.string.WalletCard3D;
            } else {
                i10 = R.string.WalletCard2D;
            }
            I.c(0, LocaleController.getString(i10), new Runnable(a5Var) {
                public final a5 f35381b;

                {
                    this.f35381b = a5Var;
                }

                @Override
                public final void run() {
                    m4 m4Var;
                    switch (r3) {
                        case 0:
                            a5 a5Var2 = this.f35381b;
                            a5Var2.getClass();
                            I.u();
                            a5Var2.presentFragment(PasscodeActivity.e0());
                            return;
                        case 1:
                            a5 a5Var3 = this.f35381b;
                            a5Var3.getClass();
                            I.u();
                            a5Var3.presentFragment(new l7());
                            return;
                        case 2:
                            a5 a5Var4 = this.f35381b;
                            a5Var4.getClass();
                            I.u();
                            a5Var4.presentFragment(new f71());
                            return;
                        case 3:
                            I.u();
                            a5 a5Var5 = this.f35381b;
                            a5.t0(a5Var5.getParentActivity(), a5Var5.getResourceProvider());
                            return;
                        default:
                            I.u();
                            a5 a5Var6 = this.f35381b;
                            boolean z11 = a5Var6.f34643w;
                            boolean z12 = !z11;
                            if (z11 != z12 && (m4Var = a5Var6.d) != null) {
                                a5Var6.f34643w = z12;
                                m4Var.setUse2D(z12);
                                a5Var6.f34621e.requestLayout();
                                a5Var6.d.post(new f3(a5Var6, 11));
                                return;
                            }
                            return;
                    }
                }
            }, false);
        }
        I.f29784p = new ii1(8, a5Var, m6Var2);
        I.Z();
    }

    public static void Z(a5 a5Var, String str, k0 k0Var, p80 p80Var, LinearLayout linearLayout, TL_wallet.currencyRate currencyrate) {
        String str2;
        float f7;
        if (currencyrate == null) {
            return;
        }
        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(2, a5Var.getParentActivity(), a5Var.resourceProvider, false, false);
        f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        f1Var.setText(currencyrate.currency);
        if (!TextUtils.isEmpty(currencyrate.translatedTitle)) {
            str2 = currencyrate.translatedTitle;
        } else {
            str2 = currencyrate.title;
        }
        f1Var.setSubtext(str2);
        boolean equals = TextUtils.equals(str, currencyrate.currency);
        TextView textView = f1Var.f20576b;
        if (equals) {
            f7 = 42.0f;
        } else {
            f7 = 0.0f;
        }
        textView.setPadding(0, 0, AndroidUtilities.dp(f7), 0);
        f1Var.setChecked(equals);
        f1Var.setOnClickListener(new l1(k0Var, currencyrate, p80Var, 1));
        linearLayout.addView(f1Var, w7.x5.n(200, -2));
    }

    public static void a0(a5 a5Var) {
        k0 v = k0.v(a5Var.currentAccount);
        ci.d dVar = a5Var.f34648y0;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        v.h0(new org.telegram.messenger.camera.i((Object) v, (Object) new ft(29, a5Var, v), false, false, 2));
    }

    public static void b0(a5 a5Var) {
        org.telegram.ui.ActionBar.k kVar;
        if (a5Var.E != null && (kVar = a5Var.actionBar) != null && (kVar.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) a5Var.actionBar.getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (a5Var.E.getParent() != a5Var.actionBar) {
                AndroidUtilities.removeFromParent(a5Var.E);
                a5Var.actionBar.addView(a5Var.E, w7.x5.d(-1.0f, -1));
            }
            a5Var.E.bringToFront();
            a5Var.actionBar.bringToFront();
            a5Var.E.post(new f3(a5Var, 11));
        }
    }

    public static void c0(a5 a5Var) {
        u0(a5Var.getParentActivity(), a5Var.currentAccount, a5Var.getResourceProvider());
    }

    public static void d0(a5 a5Var, LinearLayout linearLayout, k0 k0Var, p80 p80Var) {
        TL_wallet.currencyRate currencyrate;
        a5 a5Var2;
        ArrayList<TL_wallet.currencyRate> arrayList;
        LinearLayout linearLayout2 = linearLayout;
        k0 k0Var2 = k0Var;
        linearLayout2.removeAllViews();
        String g10 = k0Var2.h.g();
        TL_wallet.currencyRates f7 = k0Var2.h.f();
        if (f7 == null) {
            for (int i10 = 0; i10 < 3; i10++) {
                j10 j10Var = new j10(a5Var.getParentActivity(), a5Var.getResourceProvider());
                j10Var.setIsSingleCell(true);
                j10Var.setViewType(31);
                linearLayout2.addView(j10Var, w7.x5.n(200, -2));
            }
            return;
        }
        f fVar = k0Var2.h;
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
            f.a(linkedHashSet, MessagesController.getInstance(fVar.f34883a).config.phoneCountryIso2.get());
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
                Z(a5Var, g10, k0Var2, p80Var, linearLayout2, currencyrate7);
            }
            i13++;
            k0Var2 = k0Var;
        }
        if (!hashSet.isEmpty() && !f7.rates.isEmpty()) {
            a5Var2 = a5Var;
            linearLayout2.addView(new org.telegram.ui.ActionBar.k1(a5Var.getParentActivity(), a5Var2.resourceProvider), w7.x5.n(-1, 8));
        } else {
            a5Var2 = a5Var;
        }
        int i14 = 0;
        while (i14 < f7.rates.size()) {
            TL_wallet.currencyRate currencyrate8 = f7.rates.get(i14);
            if (currencyrate8 != null && !hashSet.contains(currencyrate8.currency)) {
                Z(a5Var2, g10, k0Var, p80Var, linearLayout2, currencyrate8);
            }
            i14++;
            a5Var2 = a5Var;
            linearLayout2 = linearLayout;
        }
    }

    public static void e0(a5 a5Var) {
        of.f.s(a5Var.getParentActivity(), k0.v(a5Var.currentAccount).f35124j);
    }

    public static void f0(a5 a5Var) {
        u0(a5Var.getParentActivity(), a5Var.currentAccount, a5Var.getResourceProvider());
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

    public static android.widget.LinearLayout i0(final android.content.Context r42, int r43, org.telegram.tgnet.tl.TL_wallet.walletTransaction r44, org.telegram.messenger.Utilities.Callback3 r45, org.telegram.messenger.Utilities.Callback2 r46, byte[] r47, java.lang.Runnable r48, org.telegram.ui.ActionBar.e6 r49, org.telegram.ui.Wallet.i2[] r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.a5.i0(android.content.Context, int, org.telegram.tgnet.tl.TL_wallet$walletTransaction, org.telegram.messenger.Utilities$Callback3, org.telegram.messenger.Utilities$Callback2, byte[], java.lang.Runnable, org.telegram.ui.ActionBar.e6, org.telegram.ui.Wallet.i2[]):android.widget.LinearLayout");
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

    public static SpannableStringBuilder l0(int i10, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
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
        CharSequence l4 = k0.v(i10).l(j3, true);
        if (!TextUtils.isEmpty(l4)) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "  ~\u2009").append(l4);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21199z6, e6Var)), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public static void s0(Context context, int i10, TL_wallet.walletTransaction wallettransaction, Utilities.Callback3 callback3, Utilities.Callback2 callback2, byte[] bArr, org.telegram.ui.Cells.p0 p0Var, org.telegram.ui.ActionBar.e6 e6Var) {
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
        j0 z11 = k0.v(i10).z();
        ArrayList arrayList = new ArrayList(z11.f35061c);
        int i11 = 0;
        while (true) {
            if (i11 < arrayList.size()) {
                if (arrayList.get(i11) == wallettransaction || k0.d0(wallettransaction, (TL_wallet.walletTransaction) arrayList.get(i11))) {
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
            ?? a4Var = new a4(context, e6Var, z11, arrayList, i10, rect, viewArr);
            a4Var.setPosition(i11);
            i2VarArr = i2VarArr2;
            a4Var.setAdapter(new b4(arrayList, context, e6Var, rect, i10, i2VarArr));
            r10 = 0;
            wallettransaction2 = wallettransaction;
            linearLayout = a4Var;
            callback22 = callback2;
        } else {
            viewArr = viewArr2;
            r10 = 0;
            LinearLayout i02 = i0(context, i10, wallettransaction, callback3, callback2, bArr, p0Var, e6Var, i2VarArr2);
            wallettransaction2 = wallettransaction;
            i2VarArr = i2VarArr2;
            callback22 = callback2;
            linearLayout = i02;
        }
        c4 c4Var = new c4(context, linearLayout, e6Var, linearLayout, viewArr, context);
        i2VarArr[r10] = c4Var;
        if ((linearLayout instanceof o91) && callback22 != null) {
            c4Var.setOnDismissListener(new ii1(9, callback22, wallettransaction2));
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

    public static void t0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        org.telegram.ui.ActionBar.f3 i10 = bi.i(1, context, e6Var, false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20868h5, e6Var)));
        frameLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(14.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        frameLayout.addView(linearLayout, w7.x5.d(-2.0f, -1));
        linearLayout.addView(new c6(160, context, false), w7.x5.t(160, 160, 1, 0, -12, 0, -8));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.WalletHowItWorks));
        bi.o(org.telegram.ui.ActionBar.i6.f20905j5, e6Var, textView, 1, 17.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        textView.setGravity(17);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-1, -2, 1, 0, 0, 0, 6), context);
        h.setText(LocaleController.getString(R.string.WalletHowItWorksInfo));
        int i11 = org.telegram.ui.ActionBar.i6.f21199z6;
        bi.o(i11, e6Var, h, 1, 14.0f);
        h.setGravity(17);
        h.setLineSpacing(AndroidUtilities.dp(1.0f), 1.0f);
        linearLayout.addView(h, w7.x5.t(-1, -2, 1, 0, 0, 0, 24));
        r4 r4Var = new r4(context, e6Var);
        r4Var.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        r4Var.a(LocaleController.getString(R.string.WalletSendInstantly), LocaleController.getString(R.string.WalletSendInstantlyInfo), R.drawable.wallet_learn_instant);
        linearLayout.addView(r4Var, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        r4 r4Var2 = new r4(context, e6Var);
        r4Var2.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        r4Var2.a(LocaleController.getString(R.string.WalletNoFees), LocaleController.getString(R.string.WalletNoFeesInfo), R.drawable.wallet_learn_fees);
        linearLayout.addView(r4Var2, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        r4 r4Var3 = new r4(context, e6Var);
        r4Var3.setPadding(AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f));
        r4Var3.a(LocaleController.getString(R.string.WalletBlockchainVerified), LocaleController.getString(R.string.WalletBlockchainVerifiedInfo), R.drawable.wallet_learn_verified);
        linearLayout.addView(r4Var3, w7.x5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
        ci.d f7 = bi.f(24, context, e6Var, true);
        f7.setText(LocaleController.getString(R.string.WalletGotIt));
        linearLayout.addView(f7, w7.x5.t(-1, 48, 1, 0, 0, 0, 0));
        w7.z5.b(f7, 0.02f, 1.1f);
        ea0 ea0Var = new ea0(context, null);
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        ea0Var.setTextSize(1, 13.0f);
        ea0Var.setGravity(17);
        ea0Var.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var), new g3(context, 1)));
        linearLayout.addView(ea0Var, w7.x5.k(0.0f, 12.0f, 0.0f, 6.0f, -1, -2));
        i10.customView = frameLayout;
        org.telegram.ui.ActionBar.f3[] f3VarArr = {i10};
        f3VarArr[0].setAllowNestedScroll(true);
        f3VarArr[0].fixNavigationBar();
        f7.setOnClickListener(new q3(f3VarArr, 1));
        f3VarArr[0].show();
    }

    public static void u0(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        k0 v = k0.v(i10);
        if (v.D()) {
            String r10 = v.r();
            if (TextUtils.isEmpty(r10)) {
                return;
            }
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, e6Var, false);
            f3Var.setBackgroundColor(-12207881);
            f3Var.fixNavigationBar(-12207881);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackground(new z4());
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout.addView(linearLayout, w7.x5.f(-2.0f, 55, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
            y4 y4Var = new y4(context, r10);
            linearLayout.addView(y4Var, w7.x5.q(288, 302, 1));
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
            f3Var.customView = frameLayout;
            f3Var.occupyNavigationBar = true;
            f3Var.setApplyTopPadding(false);
            f3Var.setApplyBottomPadding(false);
            f3Var.fixNavigationBar(-12207881);
            imageView.setOnClickListener(new e3(f3Var, 0));
            y4Var.f35693e = new q0(r10, 1);
            f3Var.show();
            f3Var.setOverlayNavBarColor(-12207881);
            AndroidUtilities.setNavigationBarColor((Dialog) f3Var, -12207881, false);
            AndroidUtilities.setLightNavigationBar((Dialog) f3Var, false);
            if (Build.VERSION.SDK_INT >= 29 && f3Var.getWindow() != null) {
                f3Var.getWindow().setNavigationBarContrastEnforced(false);
            }
            dVar.setOnClickListener(new ai.u7(dVar, i10, f3Var, e6Var, 7));
        }
    }

    public final void A0() {
        boolean z10;
        k0 v = k0.v(this.currentAccount);
        G0();
        ci.d dVar = this.f34648y0;
        if (v.D() && v.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        if (!v.D()) {
            this.f34637r0.setText(r0(0));
            this.f34639s0.setText(r0(1));
            return;
        }
        long t10 = v.t();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.E0 == null) {
            this.E0 = new SpannableString("G");
            m4 m4Var = this.d;
            m4Var.getClass();
            h5 h5Var = new h5(m4Var, R.drawable.wallet_gram_large);
            this.f34640t0 = h5Var;
            SpannableString spannableString = this.E0;
            spannableString.setSpan(h5Var, 0, spannableString.length(), 33);
        }
        spannableStringBuilder.append((CharSequence) this.E0);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) i5.c(t10));
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
        if (this.f34641u0 == null) {
            ?? characterStyle = new CharacterStyle();
            characterStyle.f35383a = -9577217;
            this.f34641u0 = characterStyle;
        }
        spannableStringBuilder.setSpan(this.f34641u0, length, spannableStringBuilder.length(), 33);
        this.f34637r0.setText(spannableStringBuilder);
        CharSequence l4 = k0.v(this.currentAccount).l(t10, false);
        if (TextUtils.isEmpty(l4)) {
            this.f34639s0.setText(r0(1));
        } else {
            this.f34639s0.setText(l4);
        }
        D0(this.f34642v0);
        c0 c0Var = this.A0;
        if (c0Var != null && !c0Var.h && !c0Var.f34709i && c0Var.f34711k == null) {
            c0Var.d();
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
        if (!rect.isEmpty() && this.f34647y.isAttachedToWindow()) {
            m4 m4Var = this.d;
            ci.m6 m6Var = this.E;
            Matrix matrix = m4Var.f35040y;
            Matrix matrix2 = m4Var.f35039x;
            Matrix matrix3 = m4Var.f35038w;
            if (m4Var.isAttachedToWindow() && m6Var.isAttachedToWindow() && m4Var.getRootView() == m6Var.getRootView()) {
                View view = (View) m4Var.F.getParent();
                FrameLayout frameLayout = m4Var.E;
                if (frameLayout instanceof d5) {
                    matrix3.set((Matrix) ((d5) frameLayout).f34815b.f1911b);
                } else {
                    matrix3.set(((q5) frameLayout).v.f35348a);
                }
                Matrix matrix4 = this.I;
                i5.f(view, matrix4);
                matrix4.preConcat(matrix3);
                matrix4.preTranslate(m4Var.F.getLeft() - view.getScrollX(), m4Var.F.getTop() - view.getScrollY());
                matrix4.preConcat(m4Var.F.getMatrix());
                i5.f(m6Var, matrix2);
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
                    View view2 = this.f34647y;
                    int[] iArr2 = this.O;
                    view2.getLocationInWindow(iArr2);
                    this.d.e(this.f34642v0, this.f34645x.getWidth() / 0.75f);
                    float f11 = iArr2[0] - iArr[0];
                    float f12 = (iArr2[1] - iArr[1]) - ((height * 0.75f) * 0.5f);
                    for (int i13 = 0; i13 < 4; i13++) {
                        int i14 = i13 * 2;
                        float lerp = AndroidUtilities.lerp(fArr2[i14], (fArr[i14] * 0.75f) + f11, this.f34642v0);
                        float[] fArr3 = this.N;
                        fArr3[i14] = lerp;
                        int i15 = i14 + 1;
                        fArr3[i15] = AndroidUtilities.lerp(fArr2[i15], (fArr[i15] * 0.75f) + f12, this.f34642v0);
                    }
                    Matrix matrix5 = this.K;
                    boolean polyToPoly = matrix5.setPolyToPoly(this.L, 0, this.N, 0, 4);
                    Matrix matrix6 = this.J;
                    if (polyToPoly && !matrix6.equals(matrix5)) {
                        matrix6.set(matrix5);
                        this.E.invalidate();
                    }
                    m4 m4Var2 = this.d;
                    Matrix matrix7 = m4Var2.f35032c;
                    Matrix matrix8 = m4Var2.f35033e;
                    Matrix matrix9 = m4Var2.d;
                    if (matrix4.invert(matrix9)) {
                        matrix8.setConcat(matrix9, matrix6);
                        if (!m4Var2.h || !matrix7.equals(matrix8)) {
                            matrix7.set(matrix8);
                            m4Var2.h = true;
                            m4Var2.L.invalidate();
                        }
                    }
                    float lerp2 = AndroidUtilities.lerp(1.0f, 1.1428572f, this.f34642v0);
                    this.f34639s0.setPivotX(0.0f);
                    this.f34639s0.setPivotY(0.0f);
                    this.f34639s0.setScaleX(lerp2);
                    this.f34639s0.setScaleY(lerp2);
                }
            }
        }
    }

    public final void C0() {
        ci.m6 m6Var;
        float clamp;
        float f7;
        m4 m4Var;
        int i10;
        boolean z10;
        LinearLayout linearLayout;
        int[] iArr;
        int[] iArr2;
        if (this.f26290a != null && this.d != null && this.f34635q0 != null && this.f34647y != null && (m6Var = this.E) != null && this.actionBar != null) {
            m6Var.bringToFront();
            View m10 = this.f26290a.V2.m(this.f34623f);
            if (m10 == null) {
                if (this.f26290a.V2.L0() > this.f34623f) {
                    clamp = 1.0f;
                } else {
                    clamp = 0.0f;
                }
            } else {
                clamp = Utilities.clamp((this.f26290a.getPaddingTop() - m10.getTop()) / m10.getHeight(), 1.0f, 0.0f);
            }
            this.f34642v0 = clamp;
            E0();
            if (m10 != null) {
                f7 = Math.max(0.0f, (m10.getHeight() / 2.0f) + AndroidUtilities.dp(24.0f)) * this.f34642v0;
            } else {
                f7 = 0.0f;
            }
            float lerp = AndroidUtilities.lerp(1.0f, 0.8f, this.f34642v0);
            this.d.setPivotX(m4Var.getWidth() * 0.5f);
            this.d.setPivotY(0.0f);
            this.d.setScaleX(lerp);
            this.d.setScaleY(lerp);
            this.d.setAlpha(1.0f - Utilities.clamp01(AndroidUtilities.ilerp(clamp, 0.75f, 1.0f)));
            m4 m4Var2 = this.d;
            if (m10 != null && clamp < 1.0f && m10.getBottom() > this.f26290a.getPaddingTop() && m10.getTop() < this.f26290a.getHeight() - this.f26290a.getPaddingBottom()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            m4Var2.setVisibility(i10);
            if (m10 != null) {
                this.f26290a.getLocationInWindow(this.Q);
                this.h.getLocationInWindow(this.R);
                this.d.setTranslationX(((this.f34621e.getWidth() - this.d.getWidth()) / 2.0f) + this.f34621e.getX() + m10.getX() + (iArr[0] - iArr2[0]));
                this.d.setTranslationY(this.f34621e.getY() + m10.getY() + (iArr[1] - iArr2[1]) + f7);
            }
            if (clamp > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.F != z10 && (linearLayout = this.f34635q0) != null) {
                Rect rect = this.H;
                if (z10) {
                    if (linearLayout.getWidth() != 0 && this.f34635q0.getHeight() != 0) {
                        rect.set(this.f34635q0.getLeft(), this.f34635q0.getTop(), this.f34635q0.getRight(), this.f34635q0.getBottom());
                    }
                }
                this.d.setOnFrontContentPresented(null);
                this.G = false;
                AndroidUtilities.removeFromParent(this.f34635q0);
                this.F = z10;
                if (z10) {
                    this.E.addView(this.f34635q0, new FrameLayout.LayoutParams(rect.width(), rect.height(), 51));
                    this.f34635q0.layout(0, 0, rect.width(), rect.height());
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
                    org.telegram.ui.Components.r6 r6Var = m4Var3.M;
                    r6Var.setScaleX(1.0f);
                    r6Var.setScaleY(1.0f);
                    m4Var3.F.addView(linearLayout2, m4Var3.N);
                    this.f34635q0.layout(rect.left, rect.top, rect.right, rect.bottom);
                    this.G = !this.d.f35035n;
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
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.G6);
        this.f34637r0.setTextColor(AndroidUtilities.lerpColor(-1, themedColor, f7));
        this.f34639s0.setTextColor(AndroidUtilities.lerpColor(-7868417, i0.a.k(themedColor, Math.round(142.8f)), f7));
        h5 h5Var = this.f34640t0;
        if (h5Var != null) {
            h5Var.setOverrideColor(AndroidUtilities.lerpColor(-1, getThemedColor(org.telegram.ui.ActionBar.i6.Oh), f7));
        }
        p4 p4Var = this.f34641u0;
        if (p4Var != null) {
            p4Var.f35383a = i0.a.k(-9577217, Math.round((1.0f - f7) * 255.0f));
        }
        this.f34637r0.invalidate();
    }

    public final void E0() {
        e71 e71Var = this.f26290a;
        if (e71Var != null && this.d != null) {
            float b10 = e71Var.C2.b(1);
            float min = Math.min(10.0f, this.f26290a.C2.b(3) * 40.0f) + (-Math.min(10.0f, b10 * 40.0f));
            this.d.setAdditionalTilt(Math.max(0.0f, (this.f34642v0 * 10.0f) + ((((float) Math.sqrt(Utilities.clamp01(this.f34642v0))) * 90.0f) - 10.0f)) + min);
            this.d.setUseGyroscope(1.0f - ((float) Math.pow(this.f34642v0, 0.33000001311302185d)));
        }
    }

    public final void F0(boolean z10) {
        boolean y02 = y0();
        e71 e71Var = this.f26290a;
        k71[] k71VarArr = this.f34634p0;
        if (e71Var != null && this.m0 != y02) {
            this.m0 = y02;
            e71Var.B0();
            for (k71 k71Var : k71VarArr) {
                if (k71Var != null) {
                    k71Var.B0();
                }
            }
            this.f26290a.W2.N(false);
            this.f26290a.V2.h1(0, 0);
            this.f26290a.post(new f3(this, 11));
        }
        if (!y02) {
            for (k71 k71Var2 : k71VarArr) {
                if (k71Var2 != null) {
                    boolean canScrollVertically = k71Var2.canScrollVertically(-1);
                    k71Var2.W2.N(z10);
                    k71Var2.a0();
                    if (!canScrollVertically) {
                        k71Var2.V2.h1(0, 0);
                    }
                }
            }
            LinearLayout linearLayout = this.f34630l0;
            if (linearLayout != null) {
                linearLayout.post(new f3(this, 5));
                this.f34630l0.post(new f3(this, 6));
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
        k0 v = k0.v(this.currentAccount);
        boolean z13 = false;
        if (this.T.isAttachedToWindow() && this.T.isLaidOut()) {
            z10 = true;
        } else {
            z10 = false;
        }
        i4 i4Var = this.T;
        FrameLayout frameLayout = this.U;
        Boolean bool = v.f35123i;
        if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(v.f35124j)) {
            z11 = true;
        } else {
            z11 = false;
        }
        i4Var.i(frameLayout, z11, z10);
        ArrayList arrayList = v.C;
        int size = arrayList.size();
        int i10 = 0;
        long j3 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g0 g0Var = (g0) obj;
            if (!g0Var.f34949e) {
                long j10 = g0Var.f34948c;
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
        long j11 = yh.m5.y(this.currentAccount, true).p().amount;
        if (j11 > 500000000) {
            z13 = true;
        }
        if (z13) {
            this.Z.setText(m0(R.string.WalletGramEarningsBalance, j11));
        }
        this.T.i(this.Y, z13, z10);
    }

    @Override
    public final void U(ArrayList arrayList, c71 c71Var) {
        k0 v = k0.v(this.currentAccount);
        G0();
        arrayList.add(p61.l(this.S));
        this.f34623f = arrayList.size();
        j4 j4Var = this.f34621e;
        p61 p61Var = new p61(-4);
        p61Var.f29727c = j4Var;
        p61Var.f29747z = -1;
        p61Var.f29728e = true;
        arrayList.add(p61Var);
        arrayList.add(p61.l(this.f34644w0));
        boolean y02 = y0();
        this.m0 = y02;
        if (y02) {
            int i10 = R.drawable.wallet_learn_instant;
            String string = LocaleController.getString(R.string.WalletSendInstantly);
            String string2 = LocaleController.getString(R.string.WalletSendInstantlyInfo);
            int i11 = q4.f35414a;
            p61 J = p61.J(q4.class);
            J.f29733k = i10;
            J.f29734l = string;
            J.f29735m = string2;
            arrayList.add(J);
            int i12 = R.drawable.wallet_learn_fees;
            String string3 = LocaleController.getString(R.string.WalletNoFees);
            String string4 = LocaleController.getString(R.string.WalletNoFeesInfo);
            p61 J2 = p61.J(q4.class);
            J2.f29733k = i12;
            J2.f29734l = string3;
            J2.f29735m = string4;
            arrayList.add(J2);
            int i13 = R.drawable.wallet_learn_verified;
            String string5 = LocaleController.getString(R.string.WalletBlockchainVerified);
            String string6 = LocaleController.getString(R.string.WalletBlockchainVerifiedInfo);
            p61 J3 = p61.J(q4.class);
            J3.f29733k = i13;
            J3.f29734l = string5;
            J3.f29735m = string6;
            arrayList.add(J3);
            arrayList.add(p61.l(this.f34618b0));
        } else if (this.f34630l0 != null) {
            if (this.F0 && !this.G0 && v.t() > 500000000) {
                arrayList.add(p61.k(this.f34620d0));
            }
            arrayList.add(p61.p(this.f34630l0, 0, true));
        }
        ea0 ea0Var = this.f34617a0;
        if (ea0Var != null) {
            this.f34619c0 = false;
            ea0Var.animate().cancel();
            this.f34617a0.setAlpha(0.0f);
            this.f34617a0.setVisibility(4);
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletTitle);
    }

    @Override
    public final void W(p61 p61Var, View view) {
        c0 c0Var;
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj = p61Var.G;
        if (obj instanceof TL_wallet.nftItem) {
            Activity parentActivity = getParentActivity();
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) p61Var.G;
            org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
            if (parentActivity != null && nftitem != null) {
                int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20741a7, resourceProvider);
                int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, resourceProvider);
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
                y9 y9Var = new y9(parentActivity);
                y9Var.setRoundRadius(AndroidUtilities.dp(12.0f));
                y9Var.setContentDescription(nftitem.name);
                Drawable mutate = parentActivity.getResources().getDrawable(R.drawable.wallet_nft_placeholder).mutate();
                int i15 = org.telegram.ui.ActionBar.i6.f21199z6;
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i15, resourceProvider), PorterDuff.Mode.SRC_IN));
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
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i15, resourceProvider));
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
                    int w04 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, resourceProvider);
                    int w05 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, resourceProvider);
                    linearLayout3.setBackground(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, w04, w05, w05));
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
                    r01 r01Var = new r01(parentActivity, resourceProvider);
                    r01Var.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, resourceProvider)));
                    ArrayList<TL_wallet.nftAttribute> arrayList2 = nftitem.attributes;
                    int size = arrayList2.size();
                    int i18 = 0;
                    while (i18 < size) {
                        TL_wallet.nftAttribute nftattribute = arrayList2.get(i18);
                        i18++;
                        TL_wallet.nftAttribute nftattribute2 = nftattribute;
                        r01Var.c(nftattribute2.trait_type, nftattribute2.value, null, null);
                    }
                    linearLayout.addView(r01Var, w7.x5.k(0.0f, 0.0f, 0.0f, 14.0f, -1, -2));
                }
                ci.d dVar = new ci.d(parentActivity, resourceProvider, true);
                dVar.setRoundRadius(24);
                dVar.setText(LocaleController.getString(R.string.WalletOK));
                linearLayout.addView(dVar, w7.x5.n(-1, 48));
                y3Var.setCustomView(scrollView);
                y3Var.useBackgroundTopPadding = false;
                linearLayout2.getChildAt(0).setOnClickListener(new vy0(13, y3Var, nftitem));
                linearLayout2.getChildAt(1).setOnClickListener(new j3(parentActivity, 0));
                dVar.setOnClickListener(new j3(y3Var, 1));
                y3Var.show();
                y3Var.fixNavigationBar(w02);
                AndroidUtilities.setNavigationBarColor((Dialog) y3Var, w02, false);
            }
        } else if (p61Var.d == -10001 && (c0Var = this.A0) != null) {
            c0Var.d();
        } else if (obj instanceof TL_wallet.walletTransaction) {
            s0(getParentActivity(), this.currentAccount, (TL_wallet.walletTransaction) p61Var.G, null, null, null, null, getResourceProvider());
        }
    }

    @Override
    public final boolean X(p61 p61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        boolean z10;
        ValueAnimator valueAnimator = this.f34629k0;
        if (valueAnimator != null) {
            this.f34629k0 = null;
            valueAnimator.cancel();
        }
        z0();
        v4 v4Var = this.f34633o0;
        if (v4Var != null) {
            v4Var.b(null);
        }
        this.f34621e = null;
        this.T = null;
        this.S = null;
        this.f34630l0 = null;
        this.f34632n0 = null;
        k71[] k71VarArr = this.f34634p0;
        k71VarArr[0] = null;
        k71VarArr[1] = null;
        c0 c0Var = this.A0;
        if (c0Var != null && !c0Var.f34703a.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34625g0 = z10;
        if (!z10) {
            this.f34624f0 = 0;
        }
        View createView = super.createView(context);
        fd0 fd0Var = new fd0(this, context);
        fd0Var.addView(createView, w7.x5.d(-1.0f, -1));
        this.fragmentView = fd0Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f20741a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setClipChildren(false);
        this.actionBar.setClipToPadding(false);
        org.telegram.ui.ActionBar.z o9 = this.actionBar.o();
        o9.a(2, R.drawable.scan_qr).setOnClickListener(new View.OnClickListener(this) {
            public final a5 f34985b;

            {
                this.f34985b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var = this.f34985b;
                        a5Var.getClass();
                        a5Var.presentFragment(new ih1(6, null));
                        return;
                    case 1:
                        a5.c0(this.f34985b);
                        return;
                    case 2:
                        a5.f0(this.f34985b);
                        return;
                    case 3:
                        this.f34985b.v0();
                        return;
                    default:
                        a5.a0(this.f34985b);
                        return;
                }
            }
        });
        o9.a(1, R.drawable.ic_ab_other).setOnClickListener(new vy0(15, this, context));
        ai.f0 f0Var = new ai.f0(this, context, 24);
        this.S = f0Var;
        f0Var.setClipToPadding(false);
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
        this.S.addView(this.T, w7.x5.d(-2.0f, -1));
        ea0 ea0Var = new ea0(context, null);
        this.f34617a0 = ea0Var;
        this.f34619c0 = false;
        ea0Var.setAlpha(0.0f);
        ea0 ea0Var2 = this.f34617a0;
        int i11 = org.telegram.ui.ActionBar.i6.f21199z6;
        ea0Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, this.resourceProvider));
        this.f34617a0.setTextSize(1, 13.0f);
        this.f34617a0.setGravity(17);
        this.f34617a0.setText(AndroidUtilities.replaceSingleLink(LocaleController.getString(R.string.WalletTermsOfService), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, this.resourceProvider), new g3(context, 0)));
        this.f34617a0.setVisibility(4);
        ((FrameLayout) createView).addView(this.f34617a0, w7.x5.a(-2.0f, 12.0f, 0.0f, 12.0f, 24.0f, -1, 81));
        j4 j4Var = new j4(this, context, 0);
        this.f34618b0 = j4Var;
        j4Var.setImportantForAccessibility(2);
        this.f34620d0 = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34622e0 = frameLayout;
        int i12 = org.telegram.ui.ActionBar.i6.f20797d6;
        int themedColor = getThemedColor(i12);
        int themedColor2 = getThemedColor(i12);
        int i13 = org.telegram.ui.ActionBar.i6.f20888i6;
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.a0(themedColor, org.telegram.ui.ActionBar.i6.v(themedColor2, getThemedColor(i13)), 16, 16));
        this.f34620d0.addView(this.f34622e0, w7.x5.a(-2.0f, 12.0f, 0.0f, 12.0f, 12.0f, -1, 55));
        ImageView imageView = new ImageView(context);
        float dpf2 = AndroidUtilities.dpf2(10.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2, dpf2}, null, null));
        shapeDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory());
        imageView.setBackground(shapeDrawable);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.wallet_protect);
        this.f34622e0.addView(imageView, w7.x5.a(28.0f, 14.0f, 11.0f, 16.0f, 11.0f, 28, 19));
        TextView textView4 = new TextView(context);
        bi.o(org.telegram.ui.ActionBar.i6.f21037q7, this.resourceProvider, textView4, 1, 16.0f);
        textView4.setText(LocaleController.getString(R.string.WalletProtectAccount));
        this.f34622e0.addView(textView4, w7.x5.a(-2.0f, 58.0f, 0.0f, 32.0f, 0.0f, -1, 19));
        this.f34622e0.setOnClickListener(new View.OnClickListener(this) {
            public final a5 f34985b;

            {
                this.f34985b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        a5 a5Var = this.f34985b;
                        a5Var.getClass();
                        a5Var.presentFragment(new ih1(6, null));
                        return;
                    case 1:
                        a5.c0(this.f34985b);
                        return;
                    case 2:
                        a5.f0(this.f34985b);
                        return;
                    case 3:
                        this.f34985b.v0();
                        return;
                    default:
                        a5.a0(this.f34985b);
                        return;
                }
            }
        });
        w7.z5.b(this.f34622e0, 0.02f, 1.2f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f34645x = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.f34645x.setClipToPadding(false);
        this.actionBar.addView(this.f34645x, w7.x5.a(56.0f, 64.0f, 0.0f, 96.0f, 0.0f, -1, 87));
        View view = new View(context);
        this.f34647y = view;
        this.f34645x.addView(view, w7.x5.e(1, 1, 19));
        this.F = false;
        this.G = false;
        this.H.setEmpty();
        this.J.reset();
        ci.m6 m6Var = new ci.m6(this, context);
        this.E = m6Var;
        m6Var.setClipChildren(false);
        this.E.setClipToPadding(false);
        m4 m4Var = new m4(this, context, this.f34643w);
        this.d = m4Var;
        m4Var.setDiamondOnCard(true);
        this.d.setCardOnClickListener(new View.OnClickListener(this) {
            public final a5 f34985b;

            {
                this.f34985b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        a5 a5Var = this.f34985b;
                        a5Var.getClass();
                        a5Var.presentFragment(new ih1(6, null));
                        return;
                    case 1:
                        a5.c0(this.f34985b);
                        return;
                    case 2:
                        a5.f0(this.f34985b);
                        return;
                    case 3:
                        this.f34985b.v0();
                        return;
                    default:
                        a5.a0(this.f34985b);
                        return;
                }
            }
        });
        this.f26290a.C2.f26169b.add(this.v);
        j4 j4Var2 = new j4(this, context, 1);
        this.f34621e = j4Var2;
        j4Var2.setImportantForAccessibility(2);
        n4 n4Var = new n4(this, context);
        this.h = n4Var;
        n4Var.setClipChildren(false);
        this.h.setClipToPadding(false);
        this.h.addView(this.d, w7.x5.d(-2.0f, -1));
        fd0Var.addView(this.h, w7.x5.d(-1.0f, -1));
        this.f26290a.setClipChildren(false);
        this.f26290a.setClipToPadding(false);
        this.f34635q0 = this.d.getBalanceLayout();
        this.f34637r0 = this.d.getBalanceView();
        this.f34639s0 = this.d.getUsdBalanceView();
        this.d.setCardHolder(UserObject.getUserName(getUserConfig().getCurrentUser()).toUpperCase());
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34644w0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f34644w0.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.f34646x0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletAddFunds));
        this.f34644w0.addView(this.f34646x0, w7.x5.m(1.0f, 0, 48, 0, 4, 0));
        this.f34646x0.setOnClickListener(new View.OnClickListener(this) {
            public final a5 f34985b;

            {
                this.f34985b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        a5 a5Var = this.f34985b;
                        a5Var.getClass();
                        a5Var.presentFragment(new ih1(6, null));
                        return;
                    case 1:
                        a5.c0(this.f34985b);
                        return;
                    case 2:
                        a5.f0(this.f34985b);
                        return;
                    case 3:
                        this.f34985b.v0();
                        return;
                    default:
                        a5.a0(this.f34985b);
                        return;
                }
            }
        });
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        dVar2.setRoundRadius(24);
        this.f34648y0 = dVar2;
        dVar2.setText(LocaleController.getString(R.string.WalletSend));
        this.f34648y0.setEnabled(k0.v(this.currentAccount).e());
        this.f34648y0.setOnClickListener(new View.OnClickListener(this) {
            public final a5 f34985b;

            {
                this.f34985b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        a5 a5Var = this.f34985b;
                        a5Var.getClass();
                        a5Var.presentFragment(new ih1(6, null));
                        return;
                    case 1:
                        a5.c0(this.f34985b);
                        return;
                    case 2:
                        a5.f0(this.f34985b);
                        return;
                    case 3:
                        this.f34985b.v0();
                        return;
                    default:
                        a5.a0(this.f34985b);
                        return;
                }
            }
        });
        this.f34644w0.addView(this.f34648y0, w7.x5.m(1.0f, 0, 48, 4, 0, 0));
        this.f34649z0 = k0.v(this.currentAccount).z();
        this.f26290a.setDescendantFocusability(131072);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f34630l0 = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f34630l0.setBackgroundColor(getThemedColor(i10));
        ci.h1 h1Var = new ci.h1(this, context, this.resourceProvider, 10);
        this.f34632n0 = h1Var;
        h1Var.setAllowDisallowInterceptTouch(false);
        this.f34632n0.setAdapter(new w3(this));
        n91 n10 = this.f34632n0.n(-2, true);
        this.f34626h0 = n10;
        int i14 = org.telegram.ui.ActionBar.i6.Oh;
        n10.g(i14, i14, i11, i13, i12);
        this.f34626h0.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(18.0f), getThemedColor(i12)));
        x3 x3Var = new x3(this, context);
        this.f34627i0 = x3Var;
        x3Var.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
        this.f34627i0.addView(this.f34626h0, w7.x5.e(-2, 36, 49));
        this.f34632n0.setPosition(this.f34624f0);
        this.f34630l0.addView(this.f34627i0, w7.x5.k(0.0f, 0.0f, 0.0f, -6.0f, -1, 48));
        this.f34630l0.addView(this.f34632n0, w7.x5.l(1.0f, -1, 0));
        w0(this.f34625g0);
        this.f26290a.j(new mh0(this, 9));
        c71 c71Var = this.f26290a.W2;
        c71Var.f25280r = false;
        c71Var.N(false);
        v4 v4Var2 = new v4(this);
        this.f34633o0 = v4Var2;
        v4Var2.b(this.f26290a);
        A0();
        this.f34649z0.e();
        this.actionBar.post(new f3(this, 10));
        this.f26290a.post(new f3(this, 11));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e71 e71Var;
        c71 c71Var;
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.walletUpdate && this.f34637r0 != null) {
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
                        e71 e71Var2 = this.f26290a;
                        if (e71Var2 != null && (c71Var = e71Var2.W2) != null) {
                            c71Var.N(true);
                            return;
                        }
                        return;
                    }
                }
                getConnectionsManager().sendRequestTyped(new TL_account.getPassword(), new Object(), new d(this, 7));
            } else if (i10 == NotificationCenter.walletTransactionsUpdate && objArr.length > 0) {
                Object obj2 = objArr[0];
                j0 j0Var = this.f34649z0;
                if (obj2 == j0Var && (e71Var = this.f26290a) != null && e71Var.W2 != null) {
                    if (j0Var.f35060b.isEmpty()) {
                        j0 j0Var2 = this.f34649z0;
                        if (!j0Var2.f35064g) {
                            j0Var2.e();
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
        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(org.telegram.ui.ActionBar.i6.f20888i6), 2, -1));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.G6));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(19);
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 42.0f, 0.0f, -1, 3));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f21199z6), PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.x5.e(-2, -2, 21));
        frameLayout.setOnClickListener(new j3(runnable, 2));
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
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.Oh);
        spannableStringBuilder.setSpan(erVar, length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) k0.n(j3, false));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(themedColor), length2, spannableStringBuilder.length(), 33);
        return LocaleController.formatSpannable(i10, spannableStringBuilder);
    }

    public final k71 n0() {
        View currentView;
        if (o0()) {
            ci.h1 h1Var = this.f34632n0;
            if (h1Var == null) {
                currentView = null;
            } else {
                currentView = h1Var.getCurrentView();
            }
            if (currentView instanceof k71) {
                return (k71) currentView;
            }
        }
        return null;
    }

    public final boolean o0() {
        LinearLayout linearLayout;
        if (!this.m0 && (linearLayout = this.f34630l0) != null && linearLayout.isAttachedToWindow()) {
            ViewParent parent = this.f34630l0.getParent();
            e71 e71Var = this.f26290a;
            if (parent == e71Var.V2.m(e71Var.W2.f25283x.size() - 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onBeginSlide() {
        v4 v4Var = this.f34633o0;
        if (v4Var != null) {
            v4Var.c();
        }
        e71 e71Var = this.f26290a;
        if (e71Var != null) {
            e71Var.B0();
        }
        k71 n02 = n0();
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
        k0 v = k0.v(this.currentAccount);
        if (v.f35129o == null) {
            v.f35129o = new c0(v);
        }
        c0 c0Var = v.f35129o;
        this.A0 = c0Var;
        ArrayList arrayList = c0Var.d;
        f3 f3Var = this.B0;
        if (!arrayList.contains(f3Var)) {
            arrayList.add(f3Var);
        }
        nd ndVar = this.H0;
        if (ndVar != null) {
            ndVar.run();
        }
        int i10 = v.f35139z;
        v.f35139z = i10 + 1;
        HashSet hashSet = v.A;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(Integer.valueOf(i10));
        if (isEmpty) {
            v.P();
        }
        this.H0 = new nd(v, i10, 29);
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
        ValueAnimator valueAnimator = this.f34629k0;
        if (valueAnimator != null) {
            this.f34629k0 = null;
            valueAnimator.cancel();
        }
        c0 c0Var = this.A0;
        if (c0Var != null) {
            c0Var.d.remove(this.B0);
        }
        z0();
        v4 v4Var = this.f34633o0;
        if (v4Var != null) {
            v4Var.b(null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.walletTransactionsUpdate);
        getNotificationCenter().removeObserver(this, NotificationCenter.didSetOrRemoveTwoStepPassword);
        AndroidUtilities.removeFromParent(this.E);
        j0 j0Var = this.f34649z0;
        if (j0Var != null) {
            j0Var.a();
        }
        super.onFragmentDestroy();
        nd ndVar = this.H0;
        if (ndVar != null) {
            ndVar.run();
            this.H0 = null;
        }
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f26290a.setPadding(0, 0, 0, i13);
        this.f26290a.setClipToPadding(false);
        ea0 ea0Var = this.f34617a0;
        if (ea0Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ea0Var.getLayoutParams();
            layoutParams.bottomMargin = AndroidUtilities.dp(24.0f) + i13;
            this.f34617a0.setLayoutParams(layoutParams);
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
            alertDialog$Builder.f20374a.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint));
            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new i3(this));
            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
            alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.L5, false), null);
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
        k0.v(this.currentAccount).B();
        if (this.A0 != null && k0.v(this.currentAccount).D()) {
            c0 c0Var = this.A0;
            if (!c0Var.f34710j) {
                c0Var.b();
                c0Var.e(true);
            }
        }
        A0();
        if (this.f26290a != null) {
            F0(true);
        }
    }

    public final void p0() {
        c0 c0Var;
        k71 k71Var = this.f34634p0[1];
        if (this.f34624f0 == 1 && k71Var != null && k71Var.G && (c0Var = this.A0) != null && !c0Var.f34709i && !c0Var.f34708g && c0Var.f34711k == null && k71Var.V2.N0() >= k71Var.W2.f25283x.size() - 3) {
            this.A0.d();
        }
    }

    public final void q0() {
        j0 j0Var;
        k71 k71Var = this.f34634p0[0];
        if (k71Var != null && k71Var.G && (j0Var = this.f34649z0) != null && !j0Var.f35064g && k71Var.V2.N0() >= k71Var.W2.f25283x.size() - 3) {
            this.f34649z0.e();
        }
    }

    public final CharSequence r0(int i10) {
        org.telegram.ui.Components.r6 r6Var;
        float f7;
        CharSequence[] charSequenceArr = this.C0;
        if (charSequenceArr[i10] == null) {
            charSequenceArr[i10] = new SpannableString("l");
            if (i10 == 0) {
                r6Var = this.f34637r0;
            } else {
                r6Var = this.f34639s0;
            }
            if (i10 == 0) {
                f7 = 100.0f;
            } else {
                f7 = 50.0f;
            }
            ja0 ja0Var = new ja0(AndroidUtilities.dp(f7), r6Var);
            ja0Var.a(org.telegram.ui.ActionBar.i6.m1(0.45f, -1), org.telegram.ui.ActionBar.i6.m1(0.2f, -1));
            CharSequence charSequence = charSequenceArr[i10];
            ((SpannableString) charSequence).setSpan(ja0Var, 0, charSequence.length(), 33);
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
        v9.e0(getParentActivity(), true, 1, new l2.f(this, 15));
    }

    public final void w0(boolean z10) {
        float f7;
        boolean z11;
        this.f34625g0 = z10;
        if (!z10) {
            this.f34624f0 = 0;
        }
        ci.h1 h1Var = this.f34632n0;
        if (h1Var != null && this.f34627i0 != null) {
            if (!z10) {
                h1Var.setPosition(0);
            }
            ValueAnimator valueAnimator = this.f34629k0;
            if (valueAnimator != null) {
                this.f34629k0 = null;
                valueAnimator.cancel();
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (this.f34630l0.isAttachedToWindow() && this.f34630l0.isLaidOut()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                this.f34632n0.o(false);
            }
            if (z11 && this.f34628j0 != f7) {
                this.f34627i0.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f34628j0, f7);
                this.f34629k0 = ofFloat;
                ofFloat.setDuration(250L);
                this.f34629k0.setInterpolator(hs.h);
                this.f34629k0.addUpdateListener(new s2(this, 1));
                this.f34629k0.addListener(new org.telegram.ui.ActionBar.z0(this, f7, 6));
                this.f34629k0.start();
            } else {
                x0(f7);
                this.f34632n0.o(false);
            }
            if (this.f26290a != null && this.m0 != y0()) {
                F0(false);
            }
        }
    }

    public final void x0(float f7) {
        int i10;
        this.f34628j0 = f7;
        x3 x3Var = this.f34627i0;
        if (f7 <= 0.0f && this.f34629k0 == null) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        x3Var.setVisibility(i10);
        this.f34627i0.setAlpha(f7);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f34627i0.getLayoutParams();
        layoutParams.height = Math.round(AndroidUtilities.dp(48.0f) * f7);
        layoutParams.bottomMargin = -Math.round(AndroidUtilities.dp(6.0f) * f7);
        this.f34627i0.setLayoutParams(layoutParams);
    }

    public final boolean y0() {
        j0 j0Var;
        if (!this.f34625g0 && (j0Var = this.f34649z0) != null && j0Var.f35061c.isEmpty()) {
            j0 j0Var2 = this.f34649z0;
            j0Var2.getClass();
            if (j0Var2.f35064g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void z0() {
        this.f34636r = false;
        e71 e71Var = this.f26290a;
        if (e71Var != null) {
            e71Var.C2.f26169b.remove(this.v);
            this.f26290a.removeCallbacks(this.f34638s);
        }
        m4 m4Var = this.d;
        if (m4Var != null) {
            m4Var.setAdditionalTilt(0.0f);
        }
    }
}
