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
import bi.h7;
import c8.na;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.LaunchActivity;
public class w2 extends Dialog implements c2 {
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
    public h6 J0;
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
    public final v2 Z;
    public j5 Z0;
    public int f30139a;
    public boolean f30140a0;
    public ri.a f30141a1;
    public ViewGroup f30142b;
    public int f30143b0;
    public k5 f30144b1;
    public final m2 f30145c;
    public boolean f30146c0;
    public int f30147c1;
    public boolean d;
    public boolean f30148d0;
    public int f30149d1;
    public int f30150e;
    public boolean f30151e0;
    public int f30152e1;
    public int f30153f;
    public boolean f30154f0;
    public PorterDuffColorFilter f30155f1;
    public boolean f30156g0;
    public boolean f30157g1;
    public WindowInsets h;
    public int f30158h0;
    public int f30159h1;
    public boolean f30160i0;
    public long f30161i1;
    public final int f30162j0;
    public g2 f30163j1;
    public final int f30164k0;
    public bg.w0 f30165k1;
    public Interpolator f30166l0;
    public n2 m0;
    public boolean f30167n;
    public boolean f30168n0;
    public final int f30169o0;
    public boolean f30170p0;
    public int f30171q0;
    public boolean f30172r;
    public boolean f30173r0;
    public boolean f30174s;
    public Drawable f30175s0;
    public int f30176t0;
    public int f30177u0;
    public boolean f30178v0;
    public boolean f30179w;
    public boolean f30180w0;
    public boolean f30181x;
    public final ArrayList f30182x0;
    public boolean f30183y;
    public final h2 f30184y0;
    public q2 f30185z0;

    public w2(Context context, h6 h6Var, boolean z10, boolean z11) {
        this(z11 ? 2 : 1, context, h6Var, z10);
    }

    public static void A(w2 w2Var) {
        int w02;
        boolean z10;
        Drawable drawable;
        int w03;
        m2 m2Var = w2Var.f30145c;
        if (w2Var.f30152e1 >= 0 && (drawable = w2Var.f30175s0) != null && w2Var.f30155f1 != null && drawable.getColorFilter() == w2Var.f30155f1 && (w03 = m6.w0(w2Var.f30152e1, w2Var.J0)) != w2Var.f30149d1) {
            Drawable drawable2 = w2Var.f30175s0;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            w2Var.f30155f1 = porterDuffColorFilter;
            drawable2.setColorFilter(porterDuffColorFilter);
            w2Var.f30149d1 = w03;
            if (m2Var != null) {
                m2Var.invalidate();
            }
            ViewGroup viewGroup = w2Var.f30142b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        int i7 = w2Var.f30147c1;
        if (i7 >= 0 && w2Var.G0 < 0 && w2Var.f30159h1 == w2Var.H0 && (w02 = m6.w0(i7, w2Var.J0)) != w2Var.H0) {
            w2Var.H0 = w02;
            w2Var.f30159h1 = w02;
            if (m2Var != null) {
                m2Var.invalidate();
            }
            if (org.telegram.messenger.g0.B(w02) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (w2Var.f30163j1 != null) {
                org.telegram.messenger.g0.n3(m2Var, z10);
                return;
            }
            org.telegram.messenger.g0.s3(w2Var, w02, false, null);
            org.telegram.messenger.g0.m3(w2Var, z10);
        }
    }

    public static int B(w2 w2Var) {
        WindowInsets windowInsets;
        int i7;
        int i10;
        int i11;
        if (w2Var.f30160i0 && (windowInsets = w2Var.h) != null) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            if (!w2Var.d && w2Var.f30167n && systemGestureInsets != null) {
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

    public static WindowInsets z(w2 w2Var, WindowInsets windowInsets) {
        w2Var.t0(windowInsets);
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public final void A0(boolean z10) {
        if (this.f30168n0 == z10) {
            return;
        }
        this.f30168n0 = z10;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.f30168n0) {
            attributes.softInputMode = this.f30169o0;
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
        duration.setInterpolator(nr.f37917f);
        duration.addUpdateListener(new i2(this, 4));
        duration.start();
    }

    public final void C0(int i7, int i10, int i11) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f30182x0;
            if (i7 < arrayList.size()) {
                p2 p2Var = (p2) arrayList.get(i7);
                p2Var.f29845a.setTextColor(i10);
                p2Var.f29846b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void D0() {
        this.S0 = true;
    }

    public void E0(int i7) {
        this.f30159h1 = i7;
        m2 m2Var = this.f30145c;
        if (m2Var != null) {
            m2Var.invalidate();
        }
        boolean z10 = false;
        if (this.f30163j1 != null) {
            LaunchActivity.H1.F(true, true, true);
            if (org.telegram.messenger.g0.B(e(m6.w0(m6.f29290a7, this.J0))) >= 0.721f) {
                z10 = true;
            }
            org.telegram.messenger.g0.n3(m2Var, z10);
            return;
        }
        org.telegram.messenger.g0.s3(this, this.f30159h1, true, null);
        if (org.telegram.messenger.g0.B(this.f30159h1) > 0.721d) {
            z10 = true;
        }
        org.telegram.messenger.g0.m3(this, z10);
    }

    public final void F0(boolean z10) {
        if (this.f30156g0 != z10) {
            this.f30156g0 = z10;
            if (this.N0 > 0) {
                if (z10) {
                    ls.e().k(ls.f25293j1, Integer.valueOf(this.N0));
                } else {
                    ls.e().k(ls.f25298k1, Integer.valueOf(this.N0));
                }
            }
        }
    }

    public boolean G() {
        return this.f30146c0;
    }

    public final void G0(boolean z10) {
        int i7;
        this.f30140a0 = z10;
        int x02 = m6.x0(null, m6.f29627s8, true);
        m2 m2Var = this.f30145c;
        int systemUiVisibility = m2Var.getSystemUiVisibility();
        if (this.f30140a0 && x02 == -1) {
            i7 = systemUiVisibility | 8192;
        } else {
            i7 = systemUiVisibility & (-8193);
        }
        m2Var.setSystemUiVisibility(i7);
        if (this.f30163j1 != null) {
            LaunchActivity.H1.F(true, true, true);
        }
    }

    public boolean H0() {
        return false;
    }

    public boolean I() {
        return this.f30148d0;
    }

    public final void I0(View view, a70 a70Var, boolean z10) {
        if ((a70Var.A instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) && view.isLaidOut()) {
            m2 m2Var = this.f30145c;
            if (m2Var.isAttachedToWindow()) {
                if (this.Z0 == null) {
                    ri.q qVar = new ri.q();
                    qVar.i(m2Var);
                    ri.a aVar = new ri.a(qVar, new l2(this));
                    this.f30141a1 = aVar;
                    h6 h6Var = this.J0;
                    aVar.f56634m = m2Var;
                    aVar.f56635n = null;
                    aVar.g(m2Var, null, h6Var);
                    this.f30141a1.f56636o = new hi.s6(this, 1);
                    j5 j5Var = new j5(getContext());
                    this.Z0 = j5Var;
                    m2Var.addView(j5Var, na.c(-1.0f, -1));
                }
                j5 j5Var2 = this.Z0;
                if (j5Var2.I) {
                    return;
                }
                if (this.f30144b1 == null) {
                    this.f30144b1 = new k5(j5Var2, this.f30141a1, this.J0);
                }
                k5 k5Var = this.f30144b1;
                boolean z11 = k5Var.f29153c;
                if (!z11) {
                    k5Var.f29157r = view;
                }
                if (!z11) {
                    k5Var.d = z10;
                }
                a70Var.f33357p = new h7(j5Var2, 1);
                j5Var2.d(k5Var, null, (ActionBarPopupWindow$ActionBarPopupWindowLayout) a70Var.A);
                return;
            }
        }
        a70Var.a0();
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
        g2 g2Var = this.f30163j1;
        if (g2Var != null) {
            g2Var.removeSheet(this);
            org.telegram.messenger.g0.E2(this.f30145c);
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
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f30142b, View.TRANSLATION_Y, Math.max(0, Math.min(org.telegram.messenger.g0.f24005n, R())) + org.telegram.messenger.g0.L(10.0f) + S() + this.f30153f);
            ofFloat.addUpdateListener(new i2(this, 2));
            this.A0.playTogether(ofFloat, ObjectAnimator.ofInt(this.Z, org.telegram.ui.Components.r6.d, 0));
            AnimatorSet animatorSet = this.A0;
            if (this.X == 4) {
                j3 = 330;
            } else {
                j3 = 180;
            }
            animatorSet.setDuration(j3);
            this.A0.setInterpolator(nr.f37918g);
            this.A0.addListener(new ki.e2(this, i7, 5));
            ls.e().k(ls.f25293j1, 512);
            this.A0.start();
            if (this.X == 4 && (num = this.Y) != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.f30182x0;
                int currentTextColor = ((p2) arrayList.get(intValue)).getTextView().getCurrentTextColor();
                int currentTextColor2 = ((p2) arrayList.get(i7)).getTextView().getCurrentTextColor();
                ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
                ofArgb.addUpdateListener(new i2(this, 3));
                ofArgb.setDuration(130L);
                nr nrVar = nr.f37917f;
                ofArgb.setInterpolator(nrVar);
                ofArgb.start();
                ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
                ofArgb2.addUpdateListener(new j2(this, i7, 0));
                ofArgb2.setDuration(130L);
                ofArgb2.setInterpolator(nrVar);
                ofArgb2.start();
            }
        }
    }

    public final void O() {
        Q(m6.f29290a7);
    }

    public final void P(int i7) {
        this.f30167n = !this.f30181x;
        this.f30174s = true;
        this.f30179w = true;
        this.G0 = -1;
        this.f30147c1 = -1;
        this.H0 = i7;
        E0(i7);
    }

    public final void Q(int i7) {
        P(m6.w0(i7, this.J0));
        this.f30147c1 = i7;
    }

    public int R() {
        return (int) ((1.0f - this.T0) * this.S);
    }

    public int S() {
        ViewGroup viewGroup = this.f30142b;
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
        return m6.w0(i7, this.J0);
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
        if (f11 >= this.f30142b.getTop() && f10 >= this.f30142b.getLeft() && f10 <= this.f30142b.getRight()) {
            return false;
        }
        return true;
    }

    @Override
    public void a(boolean z10) {
        dismiss();
    }

    public final void a0(g2 g2Var) {
        if (!org.telegram.messenger.g0.Q1()) {
            if (g2Var == null || !g2Var.isSupportEdgeToEdge()) {
                this.f30163j1 = g2Var;
                v2 v2Var = this.Z;
                if (v2Var != null) {
                    ((Paint) v2Var.f30094b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                }
            }
        }
    }

    @Override
    public final View d() {
        return this.f30145c;
    }

    @Override
    public void dismiss() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.w2.dismiss():void");
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
        if (y() && (viewGroup = this.f30142b) != null) {
            if (this.W0) {
                f10 = viewGroup.getAlpha();
            } else {
                int L = org.telegram.messenger.g0.L(10.0f) + S() + this.f30153f;
                int i10 = 0;
                if (this.f30179w) {
                    i10 = Math.max(0, Math.min(org.telegram.messenger.g0.f24005n, R()));
                }
                f10 = Utilities.l(1.0f - (this.f30142b.getTranslationY() / (L + i10)));
            }
        } else {
            f10 = 0.0f;
        }
        return i0.a.f(f10, i7, this.H0);
    }

    @Override
    public boolean f() {
        return this.f30140a0;
    }

    public boolean f0(MotionEvent motionEvent) {
        return false;
    }

    public void g0(float f10) {
        m2 m2Var = this.f30145c;
        if (m2Var != null) {
            m2Var.invalidate();
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
        g2 g2Var = this.f30163j1;
        m2 m2Var = this.f30145c;
        if (g2Var != null) {
            g2Var.addSheet(this);
            if (this.f30163j1.getLayoutContainer() != null) {
                if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f30163j1.getLayoutContainer().getWindowToken(), 2)) {
                    org.telegram.messenger.g0.h3(new h2(this, 0), 80L);
                } else {
                    org.telegram.messenger.g0.E2(m2Var);
                    this.f30163j1.getLayoutContainer().addView(m2Var);
                }
                window = null;
            } else {
                return;
            }
        } else {
            window = getWindow();
            window.setWindowAnimations(2131755178);
            setContentView(m2Var, new ViewGroup.LayoutParams(-1, -1));
        }
        if (this.f30140a0 && m6.x0(null, m6.f29627s8, true) == -1) {
            m2Var.setSystemUiVisibility(m2Var.getSystemUiVisibility() | 8192);
        }
        if (this.f30142b == null) {
            bi.g3 g3Var = new bi.g3(11, getContext(), this);
            this.f30142b = g3Var;
            g3Var.setBackgroundDrawable(this.f30175s0);
            ViewGroup viewGroup = this.f30142b;
            int i13 = this.f30177u0;
            if (this.f30178v0) {
                i11 = org.telegram.messenger.g0.L(8.0f);
            } else {
                i11 = 0;
            }
            int i14 = (i11 + this.f30176t0) - 1;
            int i15 = this.f30177u0;
            if (this.f30180w0) {
                i12 = org.telegram.messenger.g0.L(8.0f);
            } else {
                i12 = 0;
            }
            viewGroup.setPadding(i13, i14, i15, i12);
        }
        this.f30142b.setVisibility(4);
        m2Var.addView(this.f30142b, 0, na.e(-1, -2, 80));
        if (this.F == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.F = frameLayout;
            m2Var.addView(frameLayout, m2Var.indexOfChild(this.f30142b) + 1, na.e(-1, -2, 80));
        }
        if (this.P != null) {
            n2 n2Var = new n2(0, getContext(), this);
            this.m0 = n2Var;
            n2Var.setText(this.P);
            if (this.Q) {
                t6.U(this.m0, m6.f29455j5, this.J0);
                this.m0.setTextSize(1, 20.0f);
                this.m0.setTypeface(org.telegram.messenger.g0.o());
                n2 n2Var2 = this.m0;
                int L = org.telegram.messenger.g0.L(21.0f);
                if (this.R) {
                    f12 = 14.0f;
                } else {
                    f12 = 6.0f;
                }
                n2Var2.setPadding(L, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
            } else {
                t6.U(this.m0, m6.f29586q5, this.J0);
                this.m0.setTextSize(1, 16.0f);
                n2 n2Var3 = this.m0;
                int L2 = org.telegram.messenger.g0.L(16.0f);
                if (this.R) {
                    f10 = 8.0f;
                } else {
                    f10 = 0.0f;
                }
                n2Var3.setPadding(L2, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
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
            ViewGroup viewGroup2 = this.f30142b;
            n2 n2Var4 = this.m0;
            i7 = 48;
            if (this.R) {
                f11 = -2.0f;
            } else {
                f11 = 48;
            }
            viewGroup2.addView(n2Var4, na.c(f11, -1));
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
                this.f30142b.setClipToPadding(false);
                this.f30142b.setClipChildren(false);
                m2Var.setClipToPadding(false);
                m2Var.setClipChildren(false);
                float f13 = i7;
                this.f30142b.addView(this.O, na.d(-1, -2.0f, this.V0, 0.0f, f13, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(f13) + (-this.f30176t0);
            } else {
                this.f30142b.addView(this.O, na.d(-1, -2.0f, this.V0, 0.0f, i7, 0.0f, 0.0f));
            }
        } else if (this.M != null) {
            int i16 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.M;
                if (i16 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i16] != null) {
                    p2 p2Var = new p2(this.X, getContext(), this.J0);
                    CharSequence charSequence = this.M[i16];
                    int[] iArr = this.N;
                    if (iArr != null) {
                        i10 = iArr[i16];
                    } else {
                        i10 = 0;
                    }
                    p2Var.a(charSequence, i10, null, this.Q);
                    this.f30142b.addView(p2Var, na.d(-1, 48.0f, 51, 0.0f, i7, 0.0f, 0.0f));
                    i7 += 48;
                    p2Var.setTag(Integer.valueOf(i16));
                    p2Var.setOnClickListener(new hi.p4(this, 22));
                    this.f30182x0.add(p2Var);
                }
                i16++;
            }
        }
        if (this.f30163j1 == null && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            int i17 = attributes.flags & (-3);
            attributes.flags = i17;
            if (this.f30168n0) {
                attributes.softInputMode = this.f30169o0;
            } else {
                attributes.flags = i17 | 131072;
            }
            if (this.W) {
                attributes.flags |= -2147416832;
                m2Var.setSystemUiVisibility(1284);
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
        this.I0 = new k2(0, runnable);
    }

    public void o0() {
        dismiss();
    }

    @Override
    public void onBackPressed() {
        j5 j5Var = this.Z0;
        if (j5Var != null && j5Var.I) {
            j5Var.a(true);
        } else if (this.f30163j1 == null) {
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
        m2 m2Var = this.f30145c;
        if (m2Var != null) {
            m2Var.invalidate();
        }
    }

    @Override
    public final boolean s() {
        return !this.J;
    }

    public void s0() {
        if ((this instanceof b6) && !this.X0) {
            this.X0 = true;
            try {
                ((b6) this).updateColors();
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
        if (this.f30163j1 != null) {
            i0();
        } else {
            super.show();
        }
        F0(true);
        if (this.f30168n0) {
            getWindow().setSoftInputMode(this.f30169o0);
        }
        int i7 = 0;
        this.J = false;
        K();
        ViewGroup viewGroup = this.f30142b;
        Point point = org.telegram.messenger.g0.f24010q;
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((this.f30177u0 * 2) + point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        boolean z10 = this.f30154f0;
        v2 v2Var = this.Z;
        if (z10) {
            if (this.f30170p0) {
                i7 = this.f30171q0;
            }
            v2Var.setAlpha(i7);
            this.f30142b.setTranslationY(0.0f);
            h0();
            return;
        }
        v2Var.setAlpha(0);
        this.I = 2;
        ViewGroup viewGroup2 = this.f30142b;
        float measuredHeight = ((1.0f - this.T0) * org.telegram.messenger.g0.f24004m) + viewGroup2.getMeasuredHeight();
        if (this.f30179w) {
            i7 = Math.max(0, Math.min(org.telegram.messenger.g0.f24005n, R()));
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
        if ((systemWindowInsetTop != 0 || org.telegram.messenger.g0.E) && this.f30158h0 != systemWindowInsetTop) {
            this.f30158h0 = systemWindowInsetTop;
        }
        this.h = windowInsets;
        this.f30145c.requestLayout();
        p0();
    }

    public void u0(boolean z10) {
        this.f30173r0 = z10;
        if (!z10) {
            this.f30142b.setTranslationY(0.0f);
            h0();
        }
    }

    public final void v0(int i7) {
        this.f30175s0.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
        if (this.f30149d1 != i7) {
            this.f30149d1 = i7;
            m2 m2Var = this.f30145c;
            if (m2Var != null) {
                m2Var.invalidate(0, m2Var.getMeasuredHeight() - m2Var.f30031x, m2Var.getMeasuredWidth(), m2Var.getMeasuredHeight());
            }
        }
    }

    public final void w0(int i7) {
        v0(m6.w0(i7, this.J0));
        Drawable drawable = this.f30175s0;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f30149d1, PorterDuff.Mode.MULTIPLY);
        this.f30155f1 = porterDuffColorFilter;
        drawable.setColorFilter(porterDuffColorFilter);
        this.f30152e1 = i7;
    }

    public final void x0(boolean z10) {
        this.f30160i0 = z10;
        this.f30167n = z10;
    }

    @Override
    public final boolean y() {
        m2 m2Var = this.f30145c;
        if (m2Var != null && m2Var.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    public final void y0() {
        this.f30170p0 = false;
    }

    public final void z0() {
        this.f30171q0 = 75;
    }

    public w2(Context context, boolean z10) {
        this(1, context, (h6) null, z10);
    }

    public w2(int i7, Context context, h6 h6Var, boolean z10) {
        super(context, 2131755352);
        this.f30139a = k10.f24932t0;
        this.K = true;
        v2 v2Var = new v2();
        this.Z = v2Var;
        this.f30140a0 = true;
        int i10 = m6.f29420h5;
        this.f30143b0 = i10;
        this.f30146c0 = true;
        this.f30148d0 = true;
        this.f30151e0 = true;
        this.f30158h0 = org.telegram.messenger.g0.f24004m;
        this.f30164k0 = 400;
        this.f30166l0 = nr.h;
        this.f30169o0 = 16;
        this.f30170p0 = true;
        this.f30171q0 = 51;
        this.f30173r0 = true;
        this.f30178v0 = true;
        this.f30180w0 = true;
        this.f30182x0 = new ArrayList();
        this.f30184y0 = new h2(this, 1);
        this.D0 = 0.0f;
        this.G0 = m6.f29290a7;
        this.L0 = true;
        this.M0 = new h2.f((int[]) null);
        this.U0 = true;
        this.V0 = 51;
        this.Y0 = new ri.q();
        this.f30147c1 = -1;
        this.f30152e1 = i10;
        this.f30161i1 = -1L;
        this.J0 = h6Var;
        if (i7 == 3) {
            org.telegram.messenger.g0.S(getWindow());
            this.f30167n = false;
            this.f30172r = false;
            this.f30174s = false;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            getWindow().addFlags(-2147483392);
            if (i7 != 1) {
                this.f30169o0 = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.f30162j0 = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        DrawableWrapper drawableWrapper = new DrawableWrapper(i5.c.g(context, 2131232730));
        this.f30175s0 = drawableWrapper;
        int w02 = m6.w0(i10, this.J0);
        this.f30149d1 = w02;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        this.f30155f1 = porterDuffColorFilter;
        drawableWrapper.setColorFilter(porterDuffColorFilter);
        this.f30175s0.getPadding(rect);
        this.f30177u0 = rect.left;
        this.f30176t0 = rect.top;
        m2 m2Var = new m2(this, getContext());
        this.f30145c = m2Var;
        m2Var.setClipChildren(false);
        m2Var.setClipToPadding(false);
        m2Var.setBackground(v2Var);
        this.f30168n0 = z10;
        if (i7 == 1) {
            m2Var.setFitsSystemWindows(true);
            m2Var.setOnApplyWindowInsetsListener(new ki.w1(this, 1));
        }
        if (i11 >= 30) {
            m2Var.setSystemUiVisibility(1792);
        } else {
            m2Var.setSystemUiVisibility(1280);
        }
        v2Var.setAlpha(0);
        if (i7 == 3) {
            l2 l2Var = new l2(this);
            WeakHashMap weakHashMap = r0.i0.f56254a;
            r0.a0.i(m2Var, l2Var);
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
