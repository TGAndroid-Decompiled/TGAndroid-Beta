package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import bi.c7;
import c8.ma;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LaunchActivity;
public class x2 extends Dialog implements d2 {
    public static final int l1 = 0;
    public AnimatorSet A0;
    public int B0;
    public ValueAnimator C0;
    public float D0;
    public boolean E;
    public boolean E0;
    public FrameLayout F;
    public float F0;
    public boolean G;
    public int G0;
    public j6.o H;
    public int H0;
    public int I;
    public DialogInterface.OnDismissListener I0;
    public boolean J;
    public i6 J0;
    public final boolean K;
    public boolean K0;
    public DialogInterface.OnClickListener L;
    public boolean L0;
    public CharSequence[] M;
    public final h2.f M0;
    public int[] N;
    public int N0;
    public ViewGroup O;
    public boolean O0;
    public CharSequence P;
    public ValueAnimator P0;
    public boolean Q;
    public boolean Q0;
    public boolean R;
    public boolean R0;
    public int S;
    public boolean S0;
    public int T;
    public float T0;
    public int U;
    public boolean U0;
    public boolean V;
    public int V0;
    public boolean W;
    public boolean W0;
    public int X;
    public boolean X0;
    public Integer Y;
    public final ri.q Y0;
    public final w2 Z;
    public k5 Z0;
    public int f30189a;
    public boolean f30190a0;
    public ri.a f30191a1;
    public ViewGroup f30192b;
    public int f30193b0;
    public l5 f30194b1;
    public final n2 f30195c;
    public boolean f30196c0;
    public int f30197c1;
    public boolean d;
    public boolean f30198d0;
    public int f30199d1;
    public int f30200e;
    public boolean f30201e0;
    public int f30202e1;
    public int f30203f;
    public boolean f30204f0;
    public PorterDuffColorFilter f30205f1;
    public boolean f30206g0;
    public boolean f30207g1;
    public WindowInsets h;
    public int f30208h0;
    public int f30209h1;
    public boolean f30210i0;
    public long f30211i1;
    public final int f30212j0;
    public h2 f30213j1;
    public final int f30214k0;
    public bg.w0 f30215k1;
    public Interpolator f30216l0;
    public o2 m0;
    public boolean f30217n;
    public boolean f30218n0;
    public final int f30219o0;
    public boolean f30220p0;
    public int f30221q0;
    public boolean f30222r;
    public boolean f30223r0;
    public boolean f30224s;
    public Drawable f30225s0;
    public int f30226t0;
    public int f30227u0;
    public boolean f30228v0;
    public boolean f30229w;
    public boolean f30230w0;
    public boolean f30231x;
    public final ArrayList f30232x0;
    public boolean f30233y;
    public final i2 f30234y0;
    public r2 f30235z0;

    public x2(Context context, i6 i6Var, boolean z10, boolean z11) {
        this(z11 ? 2 : 1, context, i6Var, z10);
    }

    public static void A(x2 x2Var) {
        int w02;
        boolean z10;
        Drawable drawable;
        int w03;
        n2 n2Var = x2Var.f30195c;
        if (x2Var.f30202e1 >= 0 && (drawable = x2Var.f30225s0) != null && x2Var.f30205f1 != null && drawable.getColorFilter() == x2Var.f30205f1 && (w03 = n6.w0(x2Var.f30202e1, x2Var.J0)) != x2Var.f30199d1) {
            Drawable drawable2 = x2Var.f30225s0;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            x2Var.f30205f1 = porterDuffColorFilter;
            drawable2.setColorFilter(porterDuffColorFilter);
            x2Var.f30199d1 = w03;
            if (n2Var != null) {
                n2Var.invalidate();
            }
            ViewGroup viewGroup = x2Var.f30192b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        int i7 = x2Var.f30197c1;
        if (i7 >= 0 && x2Var.G0 < 0 && x2Var.f30209h1 == x2Var.H0 && (w02 = n6.w0(i7, x2Var.J0)) != x2Var.H0) {
            x2Var.H0 = w02;
            x2Var.f30209h1 = w02;
            if (n2Var != null) {
                n2Var.invalidate();
            }
            if (org.telegram.messenger.g0.B(w02) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (x2Var.f30213j1 != null) {
                org.telegram.messenger.g0.n3(n2Var, z10);
                return;
            }
            org.telegram.messenger.g0.s3(x2Var, w02, false, null);
            org.telegram.messenger.g0.m3(x2Var, z10);
        }
    }

    public static int B(x2 x2Var) {
        WindowInsets windowInsets;
        int i7;
        int i10;
        int i11;
        if (x2Var.f30210i0 && (windowInsets = x2Var.h) != null) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            if (!x2Var.d && x2Var.f30217n && systemGestureInsets != null) {
                i7 = systemGestureInsets.left;
                if (i7 == 0) {
                    i11 = systemGestureInsets.right;
                    if (i11 == 0) {
                        return 0;
                    }
                }
                i10 = systemGestureInsets.bottom;
                return i10;
            }
            return 0;
        }
        return 0;
    }

    public static WindowInsets z(x2 x2Var, WindowInsets windowInsets) {
        x2Var.t0(windowInsets);
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public final void A0(boolean z10) {
        if (this.f30218n0 == z10) {
            return;
        }
        this.f30218n0 = z10;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.f30218n0) {
            attributes.softInputMode = this.f30219o0;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void B0(boolean z10) {
        float f10;
        float f11 = this.T0;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f11, f10).setDuration(180L);
        duration.setInterpolator(lr.f37208f);
        duration.addUpdateListener(new j2(this, 4));
        duration.start();
    }

    public final void C0(int i7, int i10, int i11) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f30232x0;
            if (i7 < arrayList.size()) {
                q2 q2Var = (q2) arrayList.get(i7);
                q2Var.f29895a.setTextColor(i10);
                q2Var.f29896b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void D0() {
        this.S0 = true;
    }

    public void E0(int i7) {
        this.f30209h1 = i7;
        n2 n2Var = this.f30195c;
        if (n2Var != null) {
            n2Var.invalidate();
        }
        boolean z10 = false;
        if (this.f30213j1 != null) {
            LaunchActivity.H1.F(true, true, true);
            if (org.telegram.messenger.g0.B(e(n6.w0(n6.f29339a7, this.J0))) >= 0.721f) {
                z10 = true;
            }
            org.telegram.messenger.g0.n3(n2Var, z10);
            return;
        }
        org.telegram.messenger.g0.s3(this, this.f30209h1, true, null);
        if (org.telegram.messenger.g0.B(this.f30209h1) > 0.721d) {
            z10 = true;
        }
        org.telegram.messenger.g0.m3(this, z10);
    }

    public final void F0(boolean z10) {
        if (this.f30206g0 != z10) {
            this.f30206g0 = z10;
            if (this.N0 > 0) {
                if (z10) {
                    ks.e().k(ks.f25137j1, Integer.valueOf(this.N0));
                } else {
                    ks.e().k(ks.f25142k1, Integer.valueOf(this.N0));
                }
            }
        }
    }

    public boolean G() {
        return this.f30196c0;
    }

    public final void G0(boolean z10) {
        int i7;
        this.f30190a0 = z10;
        int x02 = n6.x0(null, n6.f29676s8, true);
        n2 n2Var = this.f30195c;
        int systemUiVisibility = n2Var.getSystemUiVisibility();
        if (this.f30190a0 && x02 == -1) {
            i7 = systemUiVisibility | 8192;
        } else {
            i7 = systemUiVisibility & (-8193);
        }
        n2Var.setSystemUiVisibility(i7);
        if (this.f30213j1 != null) {
            LaunchActivity.H1.F(true, true, true);
        }
    }

    public boolean H0() {
        return false;
    }

    public boolean I() {
        return this.f30198d0;
    }

    public final void I0(View view, y60 y60Var, boolean z10) {
        if ((y60Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) && view.isLaidOut()) {
            n2 n2Var = this.f30195c;
            if (n2Var.isAttachedToWindow()) {
                if (this.Z0 == null) {
                    ri.q qVar = new ri.q();
                    qVar.i(n2Var);
                    ri.a aVar = new ri.a(qVar, new m2(this));
                    this.f30191a1 = aVar;
                    i6 i6Var = this.J0;
                    aVar.f56624m = n2Var;
                    aVar.f56625n = null;
                    aVar.g(n2Var, null, i6Var);
                    this.f30191a1.f56626o = new hi.s6(this, 1);
                    k5 k5Var = new k5(getContext());
                    this.Z0 = k5Var;
                    n2Var.addView(k5Var, ma.c(-1.0f, -1));
                }
                k5 k5Var2 = this.Z0;
                if (k5Var2.I) {
                    return;
                }
                if (this.f30194b1 == null) {
                    this.f30194b1 = new l5(k5Var2, this.f30191a1, this.J0);
                }
                l5 l5Var = this.f30194b1;
                boolean z11 = l5Var.f29202c;
                if (!z11) {
                    l5Var.f29206r = view;
                }
                if (!z11) {
                    l5Var.d = z10;
                }
                y60Var.f42369p = new c7(k5Var2, 1);
                k5Var2.d(l5Var, null, (ActionBarPopupWindow$ActionBarPopupWindowLayout) y60Var.A);
                return;
            }
        }
        y60Var.a0();
    }

    public boolean J(MotionEvent motionEvent) {
        return false;
    }

    public void K() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.A0 = null;
        }
        this.B0 = 0;
    }

    public void L() {
        h2 h2Var = this.f30213j1;
        if (h2Var != null) {
            h2Var.removeSheet(this);
            org.telegram.messenger.g0.E2(this.f30195c);
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e10) {
            a8.g(e10, false);
        }
    }

    public void M(int i7) {
        long j3;
        Integer num;
        if (!this.J) {
            this.J = true;
            K();
            this.B0 = 2;
            this.A0 = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f30192b, View.TRANSLATION_Y, Math.max(0, Math.min(org.telegram.messenger.g0.f24116n, R())) + org.telegram.messenger.g0.L(10.0f) + S() + this.f30203f);
            ofFloat.addUpdateListener(new j2(this, 2));
            this.A0.playTogether(ofFloat, ObjectAnimator.ofInt(this.Z, org.telegram.ui.Components.q6.d, 0));
            AnimatorSet animatorSet = this.A0;
            if (this.X == 4) {
                j3 = 330;
            } else {
                j3 = 180;
            }
            animatorSet.setDuration(j3);
            this.A0.setInterpolator(lr.f37209g);
            this.A0.addListener(new ki.f2(this, i7, 5));
            ks.e().k(ks.f25137j1, 512);
            this.A0.start();
            if (this.X == 4 && (num = this.Y) != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.f30232x0;
                int currentTextColor = ((q2) arrayList.get(intValue)).getTextView().getCurrentTextColor();
                int currentTextColor2 = ((q2) arrayList.get(i7)).getTextView().getCurrentTextColor();
                ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
                ofArgb.addUpdateListener(new j2(this, 3));
                ofArgb.setDuration(130L);
                lr lrVar = lr.f37208f;
                ofArgb.setInterpolator(lrVar);
                ofArgb.start();
                ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
                ofArgb2.addUpdateListener(new k2(this, i7, 0));
                ofArgb2.setDuration(130L);
                ofArgb2.setInterpolator(lrVar);
                ofArgb2.start();
            }
        }
    }

    public final void O() {
        Q(n6.f29339a7);
    }

    public final void P(int i7) {
        this.f30217n = !this.f30231x;
        this.f30224s = true;
        this.f30229w = true;
        this.G0 = -1;
        this.f30197c1 = -1;
        this.H0 = i7;
        E0(i7);
    }

    public final void Q(int i7) {
        P(n6.w0(i7, this.J0));
        this.f30197c1 = i7;
    }

    public int R() {
        return (int) ((1.0f - this.T0) * this.S);
    }

    public int S() {
        ViewGroup viewGroup = this.f30192b;
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getMeasuredHeight();
    }

    public final int T() {
        WindowInsets windowInsets = this.h;
        if (windowInsets != null) {
            return (int) ((1.0f - this.T0) * windowInsets.getSystemWindowInsetLeft());
        }
        return 0;
    }

    public final int U() {
        WindowInsets windowInsets = this.h;
        if (windowInsets != null) {
            return (int) ((1.0f - this.T0) * windowInsets.getSystemWindowInsetRight());
        }
        return 0;
    }

    public ArrayList V() {
        return null;
    }

    public final int W(int i7) {
        return n6.w0(i7, this.J0);
    }

    public final boolean X() {
        return this.J;
    }

    public boolean Y(float f10, float f11) {
        FrameLayout frameLayout = this.F;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.F.getChildAt(0);
            if (f11 >= childAt.getY() + this.F.getY()) {
                if (f11 <= childAt.getY() + this.F.getY() + childAt.getHeight()) {
                    if (f10 >= childAt.getX() + this.F.getX()) {
                        if (f10 <= childAt.getX() + this.F.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        if (f11 >= this.f30192b.getTop() && f10 >= this.f30192b.getLeft() && f10 <= this.f30192b.getRight()) {
            return false;
        }
        return true;
    }

    @Override
    public void a(boolean z10) {
        dismiss();
    }

    public final void a0(h2 h2Var) {
        if (!org.telegram.messenger.g0.Q1()) {
            if (h2Var == null || !h2Var.isSupportEdgeToEdge()) {
                this.f30213j1 = h2Var;
                w2 w2Var = this.Z;
                if (w2Var != null) {
                    ((Paint) w2Var.f30144b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                }
            }
        }
    }

    @Override
    public final View d() {
        return this.f30195c;
    }

    @Override
    public void dismiss() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.x2.dismiss():void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.J) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int e(int i7) {
        float f10;
        ViewGroup viewGroup;
        if (y() && (viewGroup = this.f30192b) != null) {
            if (this.W0) {
                f10 = viewGroup.getAlpha();
            } else {
                int L = org.telegram.messenger.g0.L(10.0f) + S() + this.f30203f;
                int i10 = 0;
                if (this.f30229w) {
                    i10 = Math.max(0, Math.min(org.telegram.messenger.g0.f24116n, R()));
                }
                f10 = Utilities.l(1.0f - (this.f30192b.getTranslationY() / (L + i10)));
            }
        } else {
            f10 = 0.0f;
        }
        return i0.a.f(f10, i7, this.H0);
    }

    @Override
    public boolean f() {
        return this.f30190a0;
    }

    public boolean f0(MotionEvent motionEvent) {
        return false;
    }

    public void g0(float f10) {
        n2 n2Var = this.f30195c;
        if (n2Var != null) {
            n2Var.invalidate();
        }
    }

    public final void i0() {
        Window window;
        int i7;
        int i10;
        float f10;
        float f11;
        float f12;
        int i11;
        int i12;
        h2 h2Var = this.f30213j1;
        n2 n2Var = this.f30195c;
        if (h2Var != null) {
            h2Var.addSheet(this);
            if (this.f30213j1.getLayoutContainer() != null) {
                if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f30213j1.getLayoutContainer().getWindowToken(), 2)) {
                    org.telegram.messenger.g0.h3(new i2(this, 0), 80L);
                } else {
                    org.telegram.messenger.g0.E2(n2Var);
                    this.f30213j1.getLayoutContainer().addView(n2Var);
                }
                window = null;
            } else {
                return;
            }
        } else {
            window = getWindow();
            window.setWindowAnimations(2131755178);
            setContentView(n2Var, new ViewGroup.LayoutParams(-1, -1));
        }
        if (this.f30190a0 && n6.x0(null, n6.f29676s8, true) == -1) {
            n2Var.setSystemUiVisibility(n2Var.getSystemUiVisibility() | 8192);
        }
        if (this.f30192b == null) {
            bi.a3 a3Var = new bi.a3(11, getContext(), this);
            this.f30192b = a3Var;
            a3Var.setBackgroundDrawable(this.f30225s0);
            ViewGroup viewGroup = this.f30192b;
            int i13 = this.f30227u0;
            if (this.f30228v0) {
                i11 = org.telegram.messenger.g0.L(8.0f);
            } else {
                i11 = 0;
            }
            int i14 = (i11 + this.f30226t0) - 1;
            int i15 = this.f30227u0;
            if (this.f30230w0) {
                i12 = org.telegram.messenger.g0.L(8.0f);
            } else {
                i12 = 0;
            }
            viewGroup.setPadding(i13, i14, i15, i12);
        }
        this.f30192b.setVisibility(4);
        n2Var.addView(this.f30192b, 0, ma.e(-1, -2, 80));
        if (this.F == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.F = frameLayout;
            n2Var.addView(frameLayout, n2Var.indexOfChild(this.f30192b) + 1, ma.e(-1, -2, 80));
        }
        if (this.P != null) {
            o2 o2Var = new o2(0, getContext(), this);
            this.m0 = o2Var;
            o2Var.setText(this.P);
            if (this.Q) {
                u6.U(this.m0, n6.f29504j5, this.J0);
                this.m0.setTextSize(1, 20.0f);
                this.m0.setTypeface(org.telegram.messenger.g0.o());
                o2 o2Var2 = this.m0;
                int L = org.telegram.messenger.g0.L(21.0f);
                if (this.R) {
                    f12 = 14.0f;
                } else {
                    f12 = 6.0f;
                }
                o2Var2.setPadding(L, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
            } else {
                u6.U(this.m0, n6.f29635q5, this.J0);
                this.m0.setTextSize(1, 16.0f);
                o2 o2Var3 = this.m0;
                int L2 = org.telegram.messenger.g0.L(16.0f);
                if (this.R) {
                    f10 = 8.0f;
                } else {
                    f10 = 0.0f;
                }
                o2Var3.setPadding(L2, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
            }
            if (this.R) {
                this.m0.setSingleLine(false);
                this.m0.setMaxLines(5);
                this.m0.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                this.m0.setLines(1);
                this.m0.setSingleLine(true);
                this.m0.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
            this.m0.setGravity(16);
            ViewGroup viewGroup2 = this.f30192b;
            o2 o2Var4 = this.m0;
            i7 = 48;
            if (this.R) {
                f11 = -2.0f;
            } else {
                f11 = 48;
            }
            viewGroup2.addView(o2Var4, ma.c(f11, -1));
            this.m0.setOnTouchListener(new gi.a(1));
        } else {
            i7 = 0;
        }
        ViewGroup viewGroup3 = this.O;
        if (viewGroup3 != null) {
            if (viewGroup3.getParent() != null) {
                ((ViewGroup) this.O.getParent()).removeView(this.O);
            }
            if (!this.U0) {
                this.f30192b.setClipToPadding(false);
                this.f30192b.setClipChildren(false);
                n2Var.setClipToPadding(false);
                n2Var.setClipChildren(false);
                float f13 = i7;
                this.f30192b.addView(this.O, ma.d(-1, -2.0f, this.V0, 0.0f, f13, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(f13) + (-this.f30226t0);
            } else {
                this.f30192b.addView(this.O, ma.d(-1, -2.0f, this.V0, 0.0f, i7, 0.0f, 0.0f));
            }
        } else if (this.M != null) {
            int i16 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.M;
                if (i16 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i16] != null) {
                    q2 q2Var = new q2(this.X, getContext(), this.J0);
                    CharSequence charSequence = this.M[i16];
                    int[] iArr = this.N;
                    if (iArr != null) {
                        i10 = iArr[i16];
                    } else {
                        i10 = 0;
                    }
                    q2Var.a(charSequence, i10, null, this.Q);
                    this.f30192b.addView(q2Var, ma.d(-1, 48.0f, 51, 0.0f, i7, 0.0f, 0.0f));
                    i7 += 48;
                    q2Var.setTag(Integer.valueOf(i16));
                    q2Var.setOnClickListener(new hi.o0(this, 23));
                    this.f30232x0.add(q2Var);
                }
                i16++;
            }
        }
        if (this.f30213j1 == null && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            int i17 = attributes.flags & (-3);
            attributes.flags = i17;
            if (this.f30218n0) {
                attributes.softInputMode = this.f30219o0;
            } else {
                attributes.flags = i17 | 131072;
            }
            if (this.W) {
                attributes.flags |= -2147416832;
                n2Var.setSystemUiVisibility(1284);
            }
            attributes.height = -1;
            org.telegram.messenger.g0.m(attributes);
            window.setAttributes(attributes);
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    public boolean j0() {
        return false;
    }

    public lc k() {
        return new lc(this.F, this.J0);
    }

    public boolean k0(View view, int i7, int i10, int i11, int i12) {
        return false;
    }

    public boolean l0(View view, int i7, int i10) {
        return false;
    }

    public boolean m0() {
        return false;
    }

    @Override
    public void n(Runnable runnable) {
        this.I0 = new l2(0, runnable);
    }

    public void o0() {
        dismiss();
    }

    @Override
    public void onBackPressed() {
        k5 k5Var = this.Z0;
        if (k5Var != null && k5Var.I) {
            k5Var.a(true);
        } else if (this.f30213j1 == null) {
            super.onBackPressed();
        } else {
            dismiss();
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i0();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public final void p() {
        onBackPressed();
    }

    public void q0(float f10) {
        n2 n2Var = this.f30195c;
        if (n2Var != null) {
            n2Var.invalidate();
        }
    }

    @Override
    public final boolean s() {
        return !this.J;
    }

    public void s0() {
        if ((this instanceof c6) && !this.X0) {
            this.X0 = true;
            try {
                ((c6) this).updateColors();
            } catch (Exception e10) {
                a8.g(e10, true);
            } finally {
                this.X0 = false;
            }
        }
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        this.P = charSequence;
        this.Q = false;
    }

    @Override
    public void show() {
        long j3;
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        if (this.f30213j1 != null) {
            i0();
        } else {
            super.show();
        }
        F0(true);
        if (this.f30218n0) {
            getWindow().setSoftInputMode(this.f30219o0);
        }
        int i7 = 0;
        this.J = false;
        K();
        ViewGroup viewGroup = this.f30192b;
        Point point = org.telegram.messenger.g0.f24121q;
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((this.f30227u0 * 2) + point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        boolean z10 = this.f30204f0;
        w2 w2Var = this.Z;
        if (z10) {
            if (this.f30220p0) {
                i7 = this.f30221q0;
            }
            w2Var.setAlpha(i7);
            this.f30192b.setTranslationY(0.0f);
            h0();
            return;
        }
        w2Var.setAlpha(0);
        this.I = 2;
        ViewGroup viewGroup2 = this.f30192b;
        float measuredHeight = ((1.0f - this.T0) * org.telegram.messenger.g0.f24115m) + viewGroup2.getMeasuredHeight();
        if (this.f30229w) {
            i7 = Math.max(0, Math.min(org.telegram.messenger.g0.f24116n, R()));
        }
        viewGroup2.setTranslationY(measuredHeight + i7);
        h0();
        if (this.S0) {
            j3 = 0;
        } else {
            j3 = 150;
        }
        if (this.E) {
            j3 = 500;
        }
        j6.o oVar = new j6.o(this, 19);
        this.H = oVar;
        org.telegram.messenger.g0.h3(oVar, j3);
    }

    @Override
    public boolean t(Dialog dialog) {
        return false;
    }

    public final void t0(WindowInsets windowInsets) {
        if (windowInsets == null) {
            return;
        }
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        if ((systemWindowInsetTop != 0 || org.telegram.messenger.g0.E) && this.f30208h0 != systemWindowInsetTop) {
            this.f30208h0 = systemWindowInsetTop;
        }
        this.h = windowInsets;
        this.f30195c.requestLayout();
        p0();
    }

    public void u0(boolean z10) {
        this.f30223r0 = z10;
        if (!z10) {
            this.f30192b.setTranslationY(0.0f);
            h0();
        }
    }

    public final void v0(int i7) {
        this.f30225s0.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
        if (this.f30199d1 != i7) {
            this.f30199d1 = i7;
            n2 n2Var = this.f30195c;
            if (n2Var != null) {
                n2Var.invalidate(0, n2Var.getMeasuredHeight() - n2Var.f30081x, n2Var.getMeasuredWidth(), n2Var.getMeasuredHeight());
            }
        }
    }

    public final void w0(int i7) {
        v0(n6.w0(i7, this.J0));
        Drawable drawable = this.f30225s0;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f30199d1, PorterDuff.Mode.MULTIPLY);
        this.f30205f1 = porterDuffColorFilter;
        drawable.setColorFilter(porterDuffColorFilter);
        this.f30202e1 = i7;
    }

    public final void x0(boolean z10) {
        this.f30210i0 = z10;
        this.f30217n = z10;
    }

    @Override
    public final boolean y() {
        n2 n2Var = this.f30195c;
        if (n2Var != null && n2Var.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    public final void y0() {
        this.f30220p0 = false;
    }

    public final void z0() {
        this.f30221q0 = 75;
    }

    public x2(Context context, boolean z10) {
        this(1, context, (i6) null, z10);
    }

    public x2(int i7, Context context, i6 i6Var, boolean z10) {
        super(context, 2131755352);
        this.f30189a = j10.f24773t0;
        this.K = true;
        w2 w2Var = new w2();
        this.Z = w2Var;
        this.f30190a0 = true;
        int i10 = n6.f29469h5;
        this.f30193b0 = i10;
        this.f30196c0 = true;
        this.f30198d0 = true;
        this.f30201e0 = true;
        this.f30208h0 = org.telegram.messenger.g0.f24115m;
        this.f30214k0 = 400;
        this.f30216l0 = lr.h;
        this.f30219o0 = 16;
        this.f30220p0 = true;
        this.f30221q0 = 51;
        this.f30223r0 = true;
        this.f30228v0 = true;
        this.f30230w0 = true;
        this.f30232x0 = new ArrayList();
        this.f30234y0 = new i2(this, 1);
        this.D0 = 0.0f;
        this.G0 = n6.f29339a7;
        this.L0 = true;
        this.M0 = new h2.f((int[]) null);
        this.U0 = true;
        this.V0 = 51;
        this.Y0 = new ri.q();
        this.f30197c1 = -1;
        this.f30202e1 = i10;
        this.f30211i1 = -1L;
        this.J0 = i6Var;
        if (i7 == 3) {
            org.telegram.messenger.g0.S(getWindow());
            this.f30217n = false;
            this.f30222r = false;
            this.f30224s = false;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            getWindow().addFlags(-2147483392);
            if (i7 != 1) {
                this.f30219o0 = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.f30212j0 = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        DrawableWrapper drawableWrapper = new DrawableWrapper(i5.c.g(context, 2131232730));
        this.f30225s0 = drawableWrapper;
        int w02 = n6.w0(i10, this.J0);
        this.f30199d1 = w02;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        this.f30205f1 = porterDuffColorFilter;
        drawableWrapper.setColorFilter(porterDuffColorFilter);
        this.f30225s0.getPadding(rect);
        this.f30227u0 = rect.left;
        this.f30226t0 = rect.top;
        n2 n2Var = new n2(this, getContext());
        this.f30195c = n2Var;
        n2Var.setClipChildren(false);
        n2Var.setClipToPadding(false);
        n2Var.setBackground(w2Var);
        this.f30218n0 = z10;
        if (i7 == 1) {
            n2Var.setFitsSystemWindows(true);
            n2Var.setOnApplyWindowInsetsListener(new ki.x1(this, 1));
        }
        if (i11 >= 30) {
            n2Var.setSystemUiVisibility(1792);
        } else {
            n2Var.setSystemUiVisibility(1280);
        }
        w2Var.setAlpha(0);
        if (i7 == 3) {
            m2 m2Var = new m2(this);
            WeakHashMap weakHashMap = r0.i0.f56244a;
            r0.a0.i(n2Var, m2Var);
        }
    }

    public void E(HashSet hashSet) {
    }

    public void Z(Canvas canvas) {
    }

    @Override
    public final void b(boolean z10) {
    }

    public r0.l1 b0(r0.l1 l1Var) {
        return l1Var;
    }

    public void c0(Configuration configuration) {
    }

    @Override
    public final void h(int i7) {
    }

    public void d0() {
    }

    public void e0() {
    }

    public void h0() {
    }

    public void n0() {
    }

    public void p0() {
    }

    public void r0() {
    }

    public void v() {
    }

    public void F(ArrayList arrayList, boolean z10) {
    }
}
