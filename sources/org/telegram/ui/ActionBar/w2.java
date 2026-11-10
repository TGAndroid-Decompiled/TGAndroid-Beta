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
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.wq;
import org.telegram.ui.LaunchActivity;
public class w2 extends Dialog implements b2 {
    public static final int f28668k1 = 0;
    public int A0;
    public ValueAnimator B0;
    public float C0;
    public boolean D;
    public boolean D0;
    public FrameLayout E;
    public float E0;
    public boolean F;
    public int F0;
    public m.f3 G;
    public int G0;
    public int H;
    public DialogInterface.OnDismissListener H0;
    public boolean I;
    public h6 I0;
    public final boolean J;
    public boolean J0;
    public DialogInterface.OnClickListener K;
    public boolean K0;
    public CharSequence[] L;
    public final h2.f L0;
    public int[] M;
    public int M0;
    public ViewGroup N;
    public boolean N0;
    public CharSequence O;
    public ValueAnimator O0;
    public boolean P;
    public boolean P0;
    public boolean Q;
    public boolean Q0;
    public int R;
    public boolean R0;
    public int S;
    public float S0;
    public int T;
    public boolean T0;
    public boolean U;
    public int U0;
    public boolean V;
    public boolean V0;
    public int W;
    public boolean W0;
    public Integer X;
    public final oi.q X0;
    public final v2 Y;
    public j5 Y0;
    public boolean Z;
    public oi.a Z0;
    public int f28669a;
    public int f28670a0;
    public k5 f28671a1;
    public ViewGroup f28672b;
    public boolean f28673b0;
    public int f28674b1;
    public final m2 f28675c;
    public boolean f28676c0;
    public int f28677c1;
    public boolean d;
    public boolean f28678d0;
    public int f28679d1;
    public int f28680e;
    public boolean f28681e0;
    public PorterDuffColorFilter f28682e1;
    public int f28683f;
    public boolean f28684f0;
    public boolean f28685f1;
    public int f28686g0;
    public int f28687g1;
    public WindowInsets h;
    public boolean f28688h0;
    public long f28689h1;
    public final int f28690i0;
    public f2 f28691i1;
    public final int f28692j0;
    public bg.w0 f28693j1;
    public Interpolator f28694k0;
    public n2 f28695l0;
    public boolean m0;
    public boolean f28696n;
    public final int f28697n0;
    public boolean f28698o0;
    public int f28699p0;
    public boolean f28700q0;
    public boolean f28701r;
    public Drawable f28702r0;
    public boolean f28703s;
    public int f28704s0;
    public int f28705t0;
    public boolean f28706u0;
    public boolean f28707v0;
    public boolean f28708w;
    public final ArrayList f28709w0;
    public boolean f28710x;
    public final g2 f28711x0;
    public boolean f28712y;
    public q2 f28713y0;
    public AnimatorSet f28714z0;

    public w2(Context context, h6 h6Var, boolean z9, boolean z10) {
        this(z10 ? 2 : 1, context, h6Var, z9);
    }

    public static void A(w2 w2Var) {
        int w02;
        boolean z9;
        Drawable drawable;
        int w03;
        m2 m2Var = w2Var.f28675c;
        if (w2Var.f28679d1 >= 0 && (drawable = w2Var.f28702r0) != null && w2Var.f28682e1 != null && drawable.getColorFilter() == w2Var.f28682e1 && (w03 = m6.w0(w2Var.f28679d1, w2Var.I0)) != w2Var.f28677c1) {
            Drawable drawable2 = w2Var.f28702r0;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            w2Var.f28682e1 = porterDuffColorFilter;
            drawable2.setColorFilter(porterDuffColorFilter);
            w2Var.f28677c1 = w03;
            if (m2Var != null) {
                m2Var.invalidate();
            }
            ViewGroup viewGroup = w2Var.f28672b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        int i7 = w2Var.f28674b1;
        if (i7 >= 0 && w2Var.F0 < 0 && w2Var.f28687g1 == w2Var.G0 && (w02 = m6.w0(i7, w2Var.I0)) != w2Var.G0) {
            w2Var.G0 = w02;
            w2Var.f28687g1 = w02;
            if (m2Var != null) {
                m2Var.invalidate();
            }
            if (org.telegram.messenger.g0.B(w02) > 0.721d) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (w2Var.f28691i1 != null) {
                org.telegram.messenger.g0.o3(m2Var, z9);
                return;
            }
            org.telegram.messenger.g0.u3(w2Var, w02, false, null);
            org.telegram.messenger.g0.n3(w2Var, z9);
        }
    }

    public static int B(w2 w2Var) {
        WindowInsets windowInsets;
        int i7;
        int i10;
        int i11;
        if (w2Var.f28688h0 && (windowInsets = w2Var.h) != null) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            if (!w2Var.d && w2Var.f28696n && systemGestureInsets != null) {
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

    public final void A0(boolean z9) {
        if (this.m0 == z9) {
            return;
        }
        this.m0 = z9;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.m0) {
            attributes.softInputMode = this.f28697n0;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void B0(boolean z9) {
        float f10;
        float f11 = this.S0;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f11, f10).setDuration(180L);
        duration.setInterpolator(wq.f40046f);
        duration.addUpdateListener(new h2(this, 4));
        duration.start();
    }

    public final void C0(int i7, int i10, int i11) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f28709w0;
            if (i7 < arrayList.size()) {
                p2 p2Var = (p2) arrayList.get(i7);
                p2Var.f28371a.setTextColor(i10);
                p2Var.f28372b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void D0() {
        this.R0 = true;
    }

    public void E0(int i7) {
        this.f28687g1 = i7;
        m2 m2Var = this.f28675c;
        if (m2Var != null) {
            m2Var.invalidate();
        }
        boolean z9 = false;
        if (this.f28691i1 != null) {
            LaunchActivity.G1.F(true, true, true);
            if (org.telegram.messenger.g0.B(e(m6.w0(m6.f27834a7, this.I0))) >= 0.721f) {
                z9 = true;
            }
            org.telegram.messenger.g0.o3(m2Var, z9);
            return;
        }
        org.telegram.messenger.g0.u3(this, this.f28687g1, true, null);
        if (org.telegram.messenger.g0.B(this.f28687g1) > 0.721d) {
            z9 = true;
        }
        org.telegram.messenger.g0.n3(this, z9);
    }

    public final void F0(boolean z9) {
        if (this.f28684f0 != z9) {
            this.f28684f0 = z9;
            if (this.M0 > 0) {
                if (z9) {
                    qs.e().k(qs.f25025j1, Integer.valueOf(this.M0));
                } else {
                    qs.e().k(qs.f25030k1, Integer.valueOf(this.M0));
                }
            }
        }
    }

    public boolean G() {
        return this.f28673b0;
    }

    public final void G0(boolean z9) {
        int i7;
        this.Z = z9;
        int x02 = m6.x0(null, m6.f28170s8, true);
        m2 m2Var = this.f28675c;
        int systemUiVisibility = m2Var.getSystemUiVisibility();
        if (this.Z && x02 == -1) {
            i7 = systemUiVisibility | 8192;
        } else {
            i7 = systemUiVisibility & (-8193);
        }
        m2Var.setSystemUiVisibility(i7);
        if (this.f28691i1 != null) {
            LaunchActivity.G1.F(true, true, true);
        }
    }

    public boolean H() {
        return this.f28676c0;
    }

    public boolean H0() {
        return false;
    }

    public boolean I(MotionEvent motionEvent) {
        return false;
    }

    public void J() {
        AnimatorSet animatorSet = this.f28714z0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f28714z0 = null;
        }
        this.A0 = 0;
    }

    public void K() {
        f2 f2Var = this.f28691i1;
        if (f2Var != null) {
            f2Var.removeSheet(this);
            org.telegram.messenger.g0.E2(this.f28675c);
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e10) {
            a8.g(e10, false);
        }
    }

    public void L(int i7) {
        long j3;
        Integer num;
        if (!this.I) {
            this.I = true;
            J();
            this.A0 = 2;
            this.f28714z0 = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f28672b, View.TRANSLATION_Y, Math.max(0, Math.min(org.telegram.messenger.g0.f22562n, Q())) + org.telegram.messenger.g0.L(10.0f) + R() + this.f28683f);
            ofFloat.addUpdateListener(new h2(this, 2));
            this.f28714z0.playTogether(ofFloat, ObjectAnimator.ofInt(this.Y, org.telegram.ui.Components.l6.d, 0));
            AnimatorSet animatorSet = this.f28714z0;
            if (this.W == 4) {
                j3 = 330;
            } else {
                j3 = 180;
            }
            animatorSet.setDuration(j3);
            this.f28714z0.setInterpolator(wq.f40047g);
            this.f28714z0.addListener(new hi.m2(this, i7, 5));
            qs.e().k(qs.f25025j1, 512);
            this.f28714z0.start();
            if (this.W == 4 && (num = this.X) != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.f28709w0;
                int currentTextColor = ((p2) arrayList.get(intValue)).getTextView().getCurrentTextColor();
                int currentTextColor2 = ((p2) arrayList.get(i7)).getTextView().getCurrentTextColor();
                ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
                ofArgb.addUpdateListener(new h2(this, 3));
                ofArgb.setDuration(130L);
                wq wqVar = wq.f40046f;
                ofArgb.setInterpolator(wqVar);
                ofArgb.start();
                ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
                ofArgb2.addUpdateListener(new i2(this, i7, 0));
                ofArgb2.setDuration(130L);
                ofArgb2.setInterpolator(wqVar);
                ofArgb2.start();
            }
        }
    }

    public final void N() {
        P(m6.f27834a7);
    }

    public final void O(int i7) {
        this.f28696n = !this.f28710x;
        this.f28703s = true;
        this.f28708w = true;
        this.F0 = -1;
        this.f28674b1 = -1;
        this.G0 = i7;
        E0(i7);
    }

    public final void P(int i7) {
        O(m6.w0(i7, this.I0));
        this.f28674b1 = i7;
    }

    public int Q() {
        return (int) ((1.0f - this.S0) * this.R);
    }

    public int R() {
        ViewGroup viewGroup = this.f28672b;
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getMeasuredHeight();
    }

    public final int S() {
        WindowInsets windowInsets = this.h;
        if (windowInsets != null) {
            return (int) ((1.0f - this.S0) * windowInsets.getSystemWindowInsetLeft());
        }
        return 0;
    }

    public final int T() {
        WindowInsets windowInsets = this.h;
        if (windowInsets != null) {
            return (int) ((1.0f - this.S0) * windowInsets.getSystemWindowInsetRight());
        }
        return 0;
    }

    public ArrayList U() {
        return null;
    }

    public final int V(int i7) {
        return m6.w0(i7, this.I0);
    }

    public final boolean W() {
        return this.I;
    }

    public boolean X(float f10, float f11) {
        FrameLayout frameLayout = this.E;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.E.getChildAt(0);
            if (f11 >= childAt.getY() + this.E.getY()) {
                if (f11 <= childAt.getY() + this.E.getY() + childAt.getHeight()) {
                    if (f10 >= childAt.getX() + this.E.getX()) {
                        if (f10 <= childAt.getX() + this.E.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        if (f11 >= this.f28672b.getTop() && f10 >= this.f28672b.getLeft() && f10 <= this.f28672b.getRight()) {
            return false;
        }
        return true;
    }

    @Override
    public void a(boolean z9) {
        dismiss();
    }

    public final void a0(f2 f2Var) {
        if (!org.telegram.messenger.g0.Q1()) {
            if (f2Var == null || !f2Var.isSupportEdgeToEdge()) {
                this.f28691i1 = f2Var;
                v2 v2Var = this.Y;
                if (v2Var != null) {
                    ((Paint) v2Var.f28616b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                }
            }
        }
    }

    @Override
    public final View d() {
        return this.f28675c;
    }

    @Override
    public void dismiss() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.w2.dismiss():void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.I) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int e(int i7) {
        float f10;
        ViewGroup viewGroup;
        if (y() && (viewGroup = this.f28672b) != null) {
            if (this.V0) {
                f10 = viewGroup.getAlpha();
            } else {
                int L = org.telegram.messenger.g0.L(10.0f) + R() + this.f28683f;
                int i10 = 0;
                if (this.f28708w) {
                    i10 = Math.max(0, Math.min(org.telegram.messenger.g0.f22562n, Q()));
                }
                f10 = Utilities.l(1.0f - (this.f28672b.getTranslationY() / (L + i10)));
            }
        } else {
            f10 = 0.0f;
        }
        return i0.a.f(f10, i7, this.G0);
    }

    @Override
    public boolean f() {
        return this.Z;
    }

    public boolean f0(MotionEvent motionEvent) {
        return false;
    }

    public void g0(float f10) {
        m2 m2Var = this.f28675c;
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
        f2 f2Var = this.f28691i1;
        m2 m2Var = this.f28675c;
        if (f2Var != null) {
            f2Var.addSheet(this);
            if (this.f28691i1.getLayoutContainer() != null) {
                if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f28691i1.getLayoutContainer().getWindowToken(), 2)) {
                    org.telegram.messenger.g0.i3(new g2(this, 0), 80L);
                } else {
                    org.telegram.messenger.g0.E2(m2Var);
                    this.f28691i1.getLayoutContainer().addView(m2Var);
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
        if (this.Z && m6.x0(null, m6.f28170s8, true) == -1) {
            m2Var.setSystemUiVisibility(m2Var.getSystemUiVisibility() | 8192);
        }
        if (this.f28672b == null) {
            bi.e5 e5Var = new bi.e5(10, getContext(), this);
            this.f28672b = e5Var;
            e5Var.setBackgroundDrawable(this.f28702r0);
            ViewGroup viewGroup = this.f28672b;
            int i13 = this.f28705t0;
            if (this.f28706u0) {
                i11 = org.telegram.messenger.g0.L(8.0f);
            } else {
                i11 = 0;
            }
            int i14 = (i11 + this.f28704s0) - 1;
            int i15 = this.f28705t0;
            if (this.f28707v0) {
                i12 = org.telegram.messenger.g0.L(8.0f);
            } else {
                i12 = 0;
            }
            viewGroup.setPadding(i13, i14, i15, i12);
        }
        this.f28672b.setVisibility(4);
        m2Var.addView(this.f28672b, 0, ha.e(-1, -2, 80));
        if (this.E == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.E = frameLayout;
            m2Var.addView(frameLayout, m2Var.indexOfChild(this.f28672b) + 1, ha.e(-1, -2, 80));
        }
        if (this.O != null) {
            n2 n2Var = new n2(0, getContext(), this);
            this.f28695l0 = n2Var;
            n2Var.setText(this.O);
            if (this.P) {
                t6.U(this.f28695l0, m6.f27998j5, this.I0);
                this.f28695l0.setTextSize(1, 20.0f);
                this.f28695l0.setTypeface(org.telegram.messenger.g0.o());
                n2 n2Var2 = this.f28695l0;
                int L = org.telegram.messenger.g0.L(21.0f);
                if (this.Q) {
                    f12 = 14.0f;
                } else {
                    f12 = 6.0f;
                }
                n2Var2.setPadding(L, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
            } else {
                t6.U(this.f28695l0, m6.f28129q5, this.I0);
                this.f28695l0.setTextSize(1, 16.0f);
                n2 n2Var3 = this.f28695l0;
                int L2 = org.telegram.messenger.g0.L(16.0f);
                if (this.Q) {
                    f10 = 8.0f;
                } else {
                    f10 = 0.0f;
                }
                n2Var3.setPadding(L2, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
            }
            if (this.Q) {
                this.f28695l0.setSingleLine(false);
                this.f28695l0.setMaxLines(5);
                this.f28695l0.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                this.f28695l0.setLines(1);
                this.f28695l0.setSingleLine(true);
                this.f28695l0.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
            this.f28695l0.setGravity(16);
            ViewGroup viewGroup2 = this.f28672b;
            n2 n2Var4 = this.f28695l0;
            i7 = 48;
            if (this.Q) {
                f11 = -2.0f;
            } else {
                f11 = 48;
            }
            viewGroup2.addView(n2Var4, ha.c(f11, -1));
            this.f28695l0.setOnTouchListener(new ei.b(1));
        } else {
            i7 = 0;
        }
        ViewGroup viewGroup3 = this.N;
        if (viewGroup3 != null) {
            if (viewGroup3.getParent() != null) {
                ((ViewGroup) this.N.getParent()).removeView(this.N);
            }
            if (!this.T0) {
                this.f28672b.setClipToPadding(false);
                this.f28672b.setClipChildren(false);
                m2Var.setClipToPadding(false);
                m2Var.setClipChildren(false);
                float f13 = i7;
                this.f28672b.addView(this.N, ha.d(-1, -2.0f, this.U0, 0.0f, f13, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(f13) + (-this.f28704s0);
            } else {
                this.f28672b.addView(this.N, ha.d(-1, -2.0f, this.U0, 0.0f, i7, 0.0f, 0.0f));
            }
        } else if (this.L != null) {
            int i16 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.L;
                if (i16 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i16] != null) {
                    p2 p2Var = new p2(this.W, getContext(), this.I0);
                    CharSequence charSequence = this.L[i16];
                    int[] iArr = this.M;
                    if (iArr != null) {
                        i10 = iArr[i16];
                    } else {
                        i10 = 0;
                    }
                    p2Var.a(charSequence, i10, null, this.P);
                    this.f28672b.addView(p2Var, ha.d(-1, 48.0f, 51, 0.0f, i7, 0.0f, 0.0f));
                    i7 += 48;
                    p2Var.setTag(Integer.valueOf(i16));
                    p2Var.setOnClickListener(new ii.g(this, 15));
                    this.f28709w0.add(p2Var);
                }
                i16++;
            }
        }
        if (this.f28691i1 == null && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            int i17 = attributes.flags & (-3);
            attributes.flags = i17;
            if (this.m0) {
                attributes.softInputMode = this.f28697n0;
            } else {
                attributes.flags = i17 | 131072;
            }
            if (this.V) {
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

    public gc k() {
        return new gc(this.E, this.I0);
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
        this.H0 = new j2(0, runnable);
    }

    public void o0() {
        dismiss();
    }

    @Override
    public void onBackPressed() {
        j5 j5Var = this.Y0;
        if (j5Var != null && j5Var.D) {
            j5Var.a(true);
        } else if (this.f28691i1 == null) {
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
        m2 m2Var = this.f28675c;
        if (m2Var != null) {
            m2Var.invalidate();
        }
    }

    @Override
    public final boolean s() {
        return !this.I;
    }

    public void s0() {
        if ((this instanceof c6) && !this.W0) {
            this.W0 = true;
            try {
                ((c6) this).updateColors();
            } catch (Exception e10) {
                a8.g(e10, true);
            } finally {
                this.W0 = false;
            }
        }
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        this.O = charSequence;
        this.P = false;
    }

    @Override
    public void show() {
        long j3;
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        if (this.f28691i1 != null) {
            i0();
        } else {
            super.show();
        }
        F0(true);
        if (this.m0) {
            getWindow().setSoftInputMode(this.f28697n0);
        }
        int i7 = 0;
        this.I = false;
        J();
        ViewGroup viewGroup = this.f28672b;
        Point point = org.telegram.messenger.g0.f22567q;
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((this.f28705t0 * 2) + point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        boolean z9 = this.f28681e0;
        v2 v2Var = this.Y;
        if (z9) {
            if (this.f28698o0) {
                i7 = this.f28699p0;
            }
            v2Var.setAlpha(i7);
            this.f28672b.setTranslationY(0.0f);
            h0();
            return;
        }
        v2Var.setAlpha(0);
        this.H = 2;
        ViewGroup viewGroup2 = this.f28672b;
        float measuredHeight = ((1.0f - this.S0) * org.telegram.messenger.g0.f22561m) + viewGroup2.getMeasuredHeight();
        if (this.f28708w) {
            i7 = Math.max(0, Math.min(org.telegram.messenger.g0.f22562n, Q()));
        }
        viewGroup2.setTranslationY(measuredHeight + i7);
        h0();
        if (this.R0) {
            j3 = 0;
        } else {
            j3 = 150;
        }
        if (this.D) {
            j3 = 500;
        }
        m.f3 f3Var = new m.f3(this, 16);
        this.G = f3Var;
        org.telegram.messenger.g0.i3(f3Var, j3);
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
        if ((systemWindowInsetTop != 0 || org.telegram.messenger.g0.E) && this.f28686g0 != systemWindowInsetTop) {
            this.f28686g0 = systemWindowInsetTop;
        }
        this.h = windowInsets;
        this.f28675c.requestLayout();
        p0();
    }

    public void u0(boolean z9) {
        this.f28700q0 = z9;
        if (!z9) {
            this.f28672b.setTranslationY(0.0f);
            h0();
        }
    }

    public final void v0(int i7) {
        this.f28702r0.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
        if (this.f28677c1 != i7) {
            this.f28677c1 = i7;
            m2 m2Var = this.f28675c;
            if (m2Var != null) {
                m2Var.invalidate(0, m2Var.getMeasuredHeight() - m2Var.f28527x, m2Var.getMeasuredWidth(), m2Var.getMeasuredHeight());
            }
        }
    }

    public final void w0(int i7) {
        v0(m6.w0(i7, this.I0));
        Drawable drawable = this.f28702r0;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f28677c1, PorterDuff.Mode.MULTIPLY);
        this.f28682e1 = porterDuffColorFilter;
        drawable.setColorFilter(porterDuffColorFilter);
        this.f28679d1 = i7;
    }

    public final void x0(boolean z9) {
        this.f28688h0 = z9;
        this.f28696n = z9;
    }

    @Override
    public final boolean y() {
        m2 m2Var = this.f28675c;
        if (m2Var != null && m2Var.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    public final void y0() {
        this.f28698o0 = false;
    }

    public final void z0() {
        this.f28699p0 = 75;
    }

    public w2(Context context, boolean z9) {
        this(1, context, (h6) null, z9);
    }

    public w2(int i7, Context context, h6 h6Var, boolean z9) {
        super(context, 2131755352);
        this.f28669a = p10.f24474s0;
        this.J = true;
        v2 v2Var = new v2();
        this.Y = v2Var;
        this.Z = true;
        int i10 = m6.f27963h5;
        this.f28670a0 = i10;
        this.f28673b0 = true;
        this.f28676c0 = true;
        this.f28678d0 = true;
        this.f28686g0 = org.telegram.messenger.g0.f22561m;
        this.f28692j0 = 400;
        this.f28694k0 = wq.h;
        this.f28697n0 = 16;
        this.f28698o0 = true;
        this.f28699p0 = 51;
        this.f28700q0 = true;
        this.f28706u0 = true;
        this.f28707v0 = true;
        this.f28709w0 = new ArrayList();
        this.f28711x0 = new g2(this, 1);
        this.C0 = 0.0f;
        this.F0 = m6.f27834a7;
        this.K0 = true;
        this.L0 = new h2.f((int[]) null);
        this.T0 = true;
        this.U0 = 51;
        this.X0 = new oi.q();
        this.f28674b1 = -1;
        this.f28679d1 = i10;
        this.f28689h1 = -1L;
        this.I0 = h6Var;
        if (i7 == 3) {
            org.telegram.messenger.g0.S(getWindow());
            this.f28696n = false;
            this.f28701r = false;
            this.f28703s = false;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            getWindow().addFlags(-2147483392);
            if (i7 != 1) {
                this.f28697n0 = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.f28690i0 = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        DrawableWrapper drawableWrapper = new DrawableWrapper(jg.g.h(context, 2131232728));
        this.f28702r0 = drawableWrapper;
        int w02 = m6.w0(i10, this.I0);
        this.f28677c1 = w02;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        this.f28682e1 = porterDuffColorFilter;
        drawableWrapper.setColorFilter(porterDuffColorFilter);
        this.f28702r0.getPadding(rect);
        this.f28705t0 = rect.left;
        this.f28704s0 = rect.top;
        m2 m2Var = new m2(this, getContext());
        this.f28675c = m2Var;
        m2Var.setClipChildren(false);
        m2Var.setClipToPadding(false);
        m2Var.setBackground(v2Var);
        this.m0 = z9;
        if (i7 == 1) {
            m2Var.setFitsSystemWindows(true);
            m2Var.setOnApplyWindowInsetsListener(new hi.b2(this, 1));
        }
        if (i11 >= 30) {
            m2Var.setSystemUiVisibility(1792);
        } else {
            m2Var.setSystemUiVisibility(1280);
        }
        v2Var.setAlpha(0);
        if (i7 == 3) {
            l2 l2Var = new l2(this);
            WeakHashMap weakHashMap = r0.i0.f54202a;
            r0.a0.i(m2Var, l2Var);
        }
    }

    public void D(HashSet hashSet) {
    }

    public void Z(Canvas canvas) {
    }

    @Override
    public final void b(boolean z9) {
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

    public void E(ArrayList arrayList, boolean z9) {
    }
}
