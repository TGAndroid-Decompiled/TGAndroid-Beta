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
import c8.ja;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.er;
import org.telegram.ui.LaunchActivity;
public class u2 extends Dialog implements a2 {
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
    public e6 J0;
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
    public final t2 Z;
    public g5 Z0;
    public int f29679a;
    public boolean f29680a0;
    public ri.a f29681a1;
    public ViewGroup f29682b;
    public int f29683b0;
    public h5 f29684b1;
    public final k2 f29685c;
    public boolean f29686c0;
    public int f29687c1;
    public boolean d;
    public boolean f29688d0;
    public int f29689d1;
    public int f29690e;
    public boolean f29691e0;
    public int f29692e1;
    public int f29693f;
    public boolean f29694f0;
    public PorterDuffColorFilter f29695f1;
    public boolean f29696g0;
    public boolean f29697g1;
    public WindowInsets h;
    public int f29698h0;
    public int f29699h1;
    public boolean f29700i0;
    public long f29701i1;
    public final int f29702j0;
    public e2 f29703j1;
    public final int f29704k0;
    public bg.v0 f29705k1;
    public Interpolator f29706l0;
    public l2 m0;
    public boolean f29707n;
    public boolean f29708n0;
    public final int f29709o0;
    public boolean f29710p0;
    public int f29711q0;
    public boolean f29712r;
    public boolean f29713r0;
    public boolean f29714s;
    public Drawable f29715s0;
    public int f29716t0;
    public int f29717u0;
    public boolean f29718v0;
    public boolean f29719w;
    public boolean f29720w0;
    public boolean f29721x;
    public final ArrayList f29722x0;
    public boolean f29723y;
    public final f2 f29724y0;
    public o2 f29725z0;

    public u2(Context context, e6 e6Var, boolean z10, boolean z11) {
        this(z11 ? 2 : 1, context, e6Var, z10);
    }

    public static void A(u2 u2Var) {
        int w02;
        boolean z10;
        Drawable drawable;
        int w03;
        k2 k2Var = u2Var.f29685c;
        if (u2Var.f29692e1 >= 0 && (drawable = u2Var.f29715s0) != null && u2Var.f29695f1 != null && drawable.getColorFilter() == u2Var.f29695f1 && (w03 = j6.w0(u2Var.f29692e1, u2Var.J0)) != u2Var.f29689d1) {
            Drawable drawable2 = u2Var.f29715s0;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            u2Var.f29695f1 = porterDuffColorFilter;
            drawable2.setColorFilter(porterDuffColorFilter);
            u2Var.f29689d1 = w03;
            if (k2Var != null) {
                k2Var.invalidate();
            }
            ViewGroup viewGroup = u2Var.f29682b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        int i7 = u2Var.f29687c1;
        if (i7 >= 0 && u2Var.G0 < 0 && u2Var.f29699h1 == u2Var.H0 && (w02 = j6.w0(i7, u2Var.J0)) != u2Var.H0) {
            u2Var.H0 = w02;
            u2Var.f29699h1 = w02;
            if (k2Var != null) {
                k2Var.invalidate();
            }
            if (org.telegram.messenger.g0.B(w02) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (u2Var.f29703j1 != null) {
                org.telegram.messenger.g0.o3(k2Var, z10);
                return;
            }
            org.telegram.messenger.g0.t3(u2Var, w02, false, null);
            org.telegram.messenger.g0.n3(u2Var, z10);
        }
    }

    public static int B(u2 u2Var) {
        WindowInsets windowInsets;
        int i7;
        int i10;
        int i11;
        if (u2Var.f29700i0 && (windowInsets = u2Var.h) != null) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            if (!u2Var.d && u2Var.f29707n && systemGestureInsets != null) {
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

    public static WindowInsets z(u2 u2Var, WindowInsets windowInsets) {
        u2Var.t0(windowInsets);
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public final void A0(boolean z10) {
        if (this.f29708n0 == z10) {
            return;
        }
        this.f29708n0 = z10;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.f29708n0) {
            attributes.softInputMode = this.f29709o0;
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
        duration.setInterpolator(er.f34420f);
        duration.addUpdateListener(new g2(this, 4));
        duration.start();
    }

    public final void C0(int i7, int i10, int i11) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f29722x0;
            if (i7 < arrayList.size()) {
                n2 n2Var = (n2) arrayList.get(i7);
                n2Var.f29398a.setTextColor(i10);
                n2Var.f29399b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void D0() {
        this.S0 = true;
    }

    public void E0(int i7) {
        this.f29699h1 = i7;
        k2 k2Var = this.f29685c;
        if (k2Var != null) {
            k2Var.invalidate();
        }
        boolean z10 = false;
        if (this.f29703j1 != null) {
            LaunchActivity.H1.F(true, true, true);
            if (org.telegram.messenger.g0.B(e(j6.w0(j6.f28792a7, this.J0))) >= 0.721f) {
                z10 = true;
            }
            org.telegram.messenger.g0.o3(k2Var, z10);
            return;
        }
        org.telegram.messenger.g0.t3(this, this.f29699h1, true, null);
        if (org.telegram.messenger.g0.B(this.f29699h1) > 0.721d) {
            z10 = true;
        }
        org.telegram.messenger.g0.n3(this, z10);
    }

    public final void F0(boolean z10) {
        if (this.f29696g0 != z10) {
            this.f29696g0 = z10;
            if (this.N0 > 0) {
                if (z10) {
                    ns.e().k(ns.f25517j1, Integer.valueOf(this.N0));
                } else {
                    ns.e().k(ns.f25522k1, Integer.valueOf(this.N0));
                }
            }
        }
    }

    public final void G0(boolean z10) {
        int i7;
        this.f29680a0 = z10;
        int x02 = j6.x0(null, j6.f29129s8, true);
        k2 k2Var = this.f29685c;
        int systemUiVisibility = k2Var.getSystemUiVisibility();
        if (this.f29680a0 && x02 == -1) {
            i7 = systemUiVisibility | 8192;
        } else {
            i7 = systemUiVisibility & (-8193);
        }
        k2Var.setSystemUiVisibility(i7);
        if (this.f29703j1 != null) {
            LaunchActivity.H1.F(true, true, true);
        }
    }

    public boolean H() {
        return this.f29686c0;
    }

    public boolean H0() {
        return false;
    }

    public boolean I() {
        return this.f29688d0;
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
        e2 e2Var = this.f29703j1;
        if (e2Var != null) {
            e2Var.removeSheet(this);
            org.telegram.messenger.g0.E2(this.f29685c);
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f29682b, View.TRANSLATION_Y, Math.max(0, Math.min(org.telegram.messenger.g0.f23604n, R())) + org.telegram.messenger.g0.L(10.0f) + S() + this.f29693f);
            ofFloat.addUpdateListener(new g2(this, 2));
            this.A0.playTogether(ofFloat, ObjectAnimator.ofInt(this.Z, org.telegram.ui.Components.k6.d, 0));
            AnimatorSet animatorSet = this.A0;
            if (this.X == 4) {
                j3 = 330;
            } else {
                j3 = 180;
            }
            animatorSet.setDuration(j3);
            this.A0.setInterpolator(er.f34421g);
            this.A0.addListener(new ki.j2(this, i7, 5));
            ns.e().k(ns.f25517j1, 512);
            this.A0.start();
            if (this.X == 4 && (num = this.Y) != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.f29722x0;
                int currentTextColor = ((n2) arrayList.get(intValue)).getTextView().getCurrentTextColor();
                int currentTextColor2 = ((n2) arrayList.get(i7)).getTextView().getCurrentTextColor();
                ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
                ofArgb.addUpdateListener(new g2(this, 3));
                ofArgb.setDuration(130L);
                er erVar = er.f34420f;
                ofArgb.setInterpolator(erVar);
                ofArgb.start();
                ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
                ofArgb2.addUpdateListener(new h2(this, i7, 0));
                ofArgb2.setDuration(130L);
                ofArgb2.setInterpolator(erVar);
                ofArgb2.start();
            }
        }
    }

    public final void O() {
        Q(j6.f28792a7);
    }

    public final void P(int i7) {
        this.f29707n = !this.f29721x;
        this.f29714s = true;
        this.f29719w = true;
        this.G0 = -1;
        this.f29687c1 = -1;
        this.H0 = i7;
        E0(i7);
    }

    public final void Q(int i7) {
        P(j6.w0(i7, this.J0));
        this.f29687c1 = i7;
    }

    public int R() {
        return (int) ((1.0f - this.T0) * this.S);
    }

    public int S() {
        ViewGroup viewGroup = this.f29682b;
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
        return j6.w0(i7, this.J0);
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
        if (f11 >= this.f29682b.getTop() && f10 >= this.f29682b.getLeft() && f10 <= this.f29682b.getRight()) {
            return false;
        }
        return true;
    }

    @Override
    public void a(boolean z10) {
        dismiss();
    }

    public final void a0(e2 e2Var) {
        if (!org.telegram.messenger.g0.Q1()) {
            if (e2Var == null || !e2Var.isSupportEdgeToEdge()) {
                this.f29703j1 = e2Var;
                t2 t2Var = this.Z;
                if (t2Var != null) {
                    ((Paint) t2Var.f29661b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                }
            }
        }
    }

    @Override
    public final View d() {
        return this.f29685c;
    }

    @Override
    public void dismiss() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.u2.dismiss():void");
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
        if (y() && (viewGroup = this.f29682b) != null) {
            if (this.W0) {
                f10 = viewGroup.getAlpha();
            } else {
                int L = org.telegram.messenger.g0.L(10.0f) + S() + this.f29693f;
                int i10 = 0;
                if (this.f29719w) {
                    i10 = Math.max(0, Math.min(org.telegram.messenger.g0.f23604n, R()));
                }
                f10 = Utilities.l(1.0f - (this.f29682b.getTranslationY() / (L + i10)));
            }
        } else {
            f10 = 0.0f;
        }
        return i0.a.f(f10, i7, this.H0);
    }

    @Override
    public boolean f() {
        return this.f29680a0;
    }

    public boolean f0(MotionEvent motionEvent) {
        return false;
    }

    public void g0(float f10) {
        k2 k2Var = this.f29685c;
        if (k2Var != null) {
            k2Var.invalidate();
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
        e2 e2Var = this.f29703j1;
        k2 k2Var = this.f29685c;
        if (e2Var != null) {
            e2Var.addSheet(this);
            if (this.f29703j1.getLayoutContainer() != null) {
                if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f29703j1.getLayoutContainer().getWindowToken(), 2)) {
                    org.telegram.messenger.g0.i3(new f2(this, 0), 80L);
                } else {
                    org.telegram.messenger.g0.E2(k2Var);
                    this.f29703j1.getLayoutContainer().addView(k2Var);
                }
                window = null;
            } else {
                return;
            }
        } else {
            window = getWindow();
            window.setWindowAnimations(2131755178);
            setContentView(k2Var, new ViewGroup.LayoutParams(-1, -1));
        }
        if (this.f29680a0 && j6.x0(null, j6.f29129s8, true) == -1) {
            k2Var.setSystemUiVisibility(k2Var.getSystemUiVisibility() | 8192);
        }
        if (this.f29682b == null) {
            bi.g2 g2Var = new bi.g2(11, getContext(), this);
            this.f29682b = g2Var;
            g2Var.setBackgroundDrawable(this.f29715s0);
            ViewGroup viewGroup = this.f29682b;
            int i13 = this.f29717u0;
            if (this.f29718v0) {
                i11 = org.telegram.messenger.g0.L(8.0f);
            } else {
                i11 = 0;
            }
            int i14 = (i11 + this.f29716t0) - 1;
            int i15 = this.f29717u0;
            if (this.f29720w0) {
                i12 = org.telegram.messenger.g0.L(8.0f);
            } else {
                i12 = 0;
            }
            viewGroup.setPadding(i13, i14, i15, i12);
        }
        this.f29682b.setVisibility(4);
        k2Var.addView(this.f29682b, 0, ja.e(-1, -2, 80));
        if (this.F == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.F = frameLayout;
            k2Var.addView(frameLayout, k2Var.indexOfChild(this.f29682b) + 1, ja.e(-1, -2, 80));
        }
        if (this.P != null) {
            l2 l2Var = new l2(0, getContext(), this);
            this.m0 = l2Var;
            l2Var.setText(this.P);
            if (this.Q) {
                q6.U(this.m0, j6.f28957j5, this.J0);
                this.m0.setTextSize(1, 20.0f);
                this.m0.setTypeface(org.telegram.messenger.g0.o());
                l2 l2Var2 = this.m0;
                int L = org.telegram.messenger.g0.L(21.0f);
                if (this.R) {
                    f12 = 14.0f;
                } else {
                    f12 = 6.0f;
                }
                l2Var2.setPadding(L, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
            } else {
                q6.U(this.m0, j6.f29088q5, this.J0);
                this.m0.setTextSize(1, 16.0f);
                l2 l2Var3 = this.m0;
                int L2 = org.telegram.messenger.g0.L(16.0f);
                if (this.R) {
                    f10 = 8.0f;
                } else {
                    f10 = 0.0f;
                }
                l2Var3.setPadding(L2, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
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
            ViewGroup viewGroup2 = this.f29682b;
            l2 l2Var4 = this.m0;
            i7 = 48;
            if (this.R) {
                f11 = -2.0f;
            } else {
                f11 = 48;
            }
            viewGroup2.addView(l2Var4, ja.c(f11, -1));
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
                this.f29682b.setClipToPadding(false);
                this.f29682b.setClipChildren(false);
                k2Var.setClipToPadding(false);
                k2Var.setClipChildren(false);
                float f13 = i7;
                this.f29682b.addView(this.O, ja.d(-1, -2.0f, this.V0, 0.0f, f13, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(f13) + (-this.f29716t0);
            } else {
                this.f29682b.addView(this.O, ja.d(-1, -2.0f, this.V0, 0.0f, i7, 0.0f, 0.0f));
            }
        } else if (this.M != null) {
            int i16 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.M;
                if (i16 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i16] != null) {
                    n2 n2Var = new n2(this.X, getContext(), this.J0);
                    CharSequence charSequence = this.M[i16];
                    int[] iArr = this.N;
                    if (iArr != null) {
                        i10 = iArr[i16];
                    } else {
                        i10 = 0;
                    }
                    n2Var.a(charSequence, i10, null, this.Q);
                    this.f29682b.addView(n2Var, ja.d(-1, 48.0f, 51, 0.0f, i7, 0.0f, 0.0f));
                    i7 += 48;
                    n2Var.setTag(Integer.valueOf(i16));
                    n2Var.setOnClickListener(new hi.p5(this, 21));
                    this.f29722x0.add(n2Var);
                }
                i16++;
            }
        }
        if (this.f29703j1 == null && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            int i17 = attributes.flags & (-3);
            attributes.flags = i17;
            if (this.f29708n0) {
                attributes.softInputMode = this.f29709o0;
            } else {
                attributes.flags = i17 | 131072;
            }
            if (this.W) {
                attributes.flags |= -2147416832;
                k2Var.setSystemUiVisibility(1284);
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

    public cc k() {
        return new cc(this.F, this.J0);
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
        this.I0 = new i2(0, runnable);
    }

    public void o0() {
        dismiss();
    }

    @Override
    public void onBackPressed() {
        g5 g5Var = this.Z0;
        if (g5Var != null && g5Var.E) {
            g5Var.a(true);
        } else if (this.f29703j1 == null) {
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
        k2 k2Var = this.f29685c;
        if (k2Var != null) {
            k2Var.invalidate();
        }
    }

    @Override
    public final boolean s() {
        return !this.J;
    }

    public void s0() {
        if ((this instanceof z5) && !this.X0) {
            this.X0 = true;
            try {
                ((z5) this).updateColors();
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
        if (this.f29703j1 != null) {
            i0();
        } else {
            super.show();
        }
        F0(true);
        if (this.f29708n0) {
            getWindow().setSoftInputMode(this.f29709o0);
        }
        int i7 = 0;
        this.J = false;
        K();
        ViewGroup viewGroup = this.f29682b;
        Point point = org.telegram.messenger.g0.f23609q;
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((this.f29717u0 * 2) + point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        boolean z10 = this.f29694f0;
        t2 t2Var = this.Z;
        if (z10) {
            if (this.f29710p0) {
                i7 = this.f29711q0;
            }
            t2Var.setAlpha(i7);
            this.f29682b.setTranslationY(0.0f);
            h0();
            return;
        }
        t2Var.setAlpha(0);
        this.I = 2;
        ViewGroup viewGroup2 = this.f29682b;
        float measuredHeight = ((1.0f - this.T0) * org.telegram.messenger.g0.f23603m) + viewGroup2.getMeasuredHeight();
        if (this.f29719w) {
            i7 = Math.max(0, Math.min(org.telegram.messenger.g0.f23604n, R()));
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
        org.telegram.messenger.g0.i3(oVar, j3);
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
        if ((systemWindowInsetTop != 0 || org.telegram.messenger.g0.E) && this.f29698h0 != systemWindowInsetTop) {
            this.f29698h0 = systemWindowInsetTop;
        }
        this.h = windowInsets;
        this.f29685c.requestLayout();
        p0();
    }

    public void u0(boolean z10) {
        this.f29713r0 = z10;
        if (!z10) {
            this.f29682b.setTranslationY(0.0f);
            h0();
        }
    }

    public final void v0(int i7) {
        this.f29715s0.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
        if (this.f29689d1 != i7) {
            this.f29689d1 = i7;
            k2 k2Var = this.f29685c;
            if (k2Var != null) {
                k2Var.invalidate(0, k2Var.getMeasuredHeight() - k2Var.f29551x, k2Var.getMeasuredWidth(), k2Var.getMeasuredHeight());
            }
        }
    }

    public final void w0(int i7) {
        v0(j6.w0(i7, this.J0));
        Drawable drawable = this.f29715s0;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f29689d1, PorterDuff.Mode.MULTIPLY);
        this.f29695f1 = porterDuffColorFilter;
        drawable.setColorFilter(porterDuffColorFilter);
        this.f29692e1 = i7;
    }

    public final void x0(boolean z10) {
        this.f29700i0 = z10;
        this.f29707n = z10;
    }

    @Override
    public final boolean y() {
        k2 k2Var = this.f29685c;
        if (k2Var != null && k2Var.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    public final void y0() {
        this.f29710p0 = false;
    }

    public final void z0() {
        this.f29711q0 = 75;
    }

    public u2(Context context, boolean z10) {
        this(1, context, (e6) null, z10);
    }

    public u2(int i7, Context context, e6 e6Var, boolean z10) {
        super(context, 2131755352);
        this.f29679a = m10.f24934t0;
        this.K = true;
        t2 t2Var = new t2();
        this.Z = t2Var;
        this.f29680a0 = true;
        int i10 = j6.f28922h5;
        this.f29683b0 = i10;
        this.f29686c0 = true;
        this.f29688d0 = true;
        this.f29691e0 = true;
        this.f29698h0 = org.telegram.messenger.g0.f23603m;
        this.f29704k0 = 400;
        this.f29706l0 = er.h;
        this.f29709o0 = 16;
        this.f29710p0 = true;
        this.f29711q0 = 51;
        this.f29713r0 = true;
        this.f29718v0 = true;
        this.f29720w0 = true;
        this.f29722x0 = new ArrayList();
        this.f29724y0 = new f2(this, 1);
        this.D0 = 0.0f;
        this.G0 = j6.f28792a7;
        this.L0 = true;
        this.M0 = new h2.f((int[]) null);
        this.U0 = true;
        this.V0 = 51;
        this.Y0 = new ri.q();
        this.f29687c1 = -1;
        this.f29692e1 = i10;
        this.f29701i1 = -1L;
        this.J0 = e6Var;
        if (i7 == 3) {
            org.telegram.messenger.g0.S(getWindow());
            this.f29707n = false;
            this.f29712r = false;
            this.f29714s = false;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            getWindow().addFlags(-2147483392);
            if (i7 != 1) {
                this.f29709o0 = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.f29702j0 = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        DrawableWrapper drawableWrapper = new DrawableWrapper(i5.c.g(context, 2131232729));
        this.f29715s0 = drawableWrapper;
        int w02 = j6.w0(i10, this.J0);
        this.f29689d1 = w02;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        this.f29695f1 = porterDuffColorFilter;
        drawableWrapper.setColorFilter(porterDuffColorFilter);
        this.f29715s0.getPadding(rect);
        this.f29717u0 = rect.left;
        this.f29716t0 = rect.top;
        k2 k2Var = new k2(this, getContext());
        this.f29685c = k2Var;
        k2Var.setClipChildren(false);
        k2Var.setClipToPadding(false);
        k2Var.setBackground(t2Var);
        this.f29708n0 = z10;
        if (i7 == 1) {
            k2Var.setFitsSystemWindows(true);
            k2Var.setOnApplyWindowInsetsListener(new ki.b2(this, 1));
        }
        if (i11 >= 30) {
            k2Var.setSystemUiVisibility(1792);
        } else {
            k2Var.setSystemUiVisibility(1280);
        }
        t2Var.setAlpha(0);
        if (i7 == 3) {
            j2 j2Var = new j2(this);
            WeakHashMap weakHashMap = r0.i0.f55671a;
            r0.a0.i(k2Var, j2Var);
        }
    }

    public void D(HashSet hashSet) {
    }

    public void Z(Canvas canvas) {
    }

    @Override
    public final void b(boolean z10) {
    }

    public r0.k1 b0(r0.k1 k1Var) {
        return k1Var;
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
