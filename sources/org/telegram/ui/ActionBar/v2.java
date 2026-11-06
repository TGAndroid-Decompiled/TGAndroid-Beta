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
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
public class v2 extends Dialog implements b2 {
    public static final int f28611h1 = 0;
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
    public f6 I0;
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
    public final u2 Y;
    public int Y0;
    public boolean Z;
    public int Z0;
    public int f28612a;
    public int f28613a0;
    public int f28614a1;
    public ViewGroup f28615b;
    public boolean f28616b0;
    public PorterDuffColorFilter f28617b1;
    public final l2 f28618c;
    public boolean f28619c0;
    public boolean f28620c1;
    public boolean d;
    public boolean f28621d0;
    public int f28622d1;
    public int f28623e;
    public boolean f28624e0;
    public long f28625e1;
    public int f28626f;
    public boolean f28627f0;
    public f2 f28628f1;
    public int f28629g0;
    public bg.w0 f28630g1;
    public WindowInsets h;
    public boolean f28631h0;
    public final int f28632i0;
    public final int f28633j0;
    public Interpolator f28634k0;
    public m2 f28635l0;
    public boolean m0;
    public boolean f28636n;
    public final int f28637n0;
    public boolean f28638o0;
    public int f28639p0;
    public boolean f28640q0;
    public boolean f28641r;
    public Drawable f28642r0;
    public boolean f28643s;
    public int f28644s0;
    public int f28645t0;
    public boolean f28646u0;
    public boolean f28647v0;
    public boolean f28648w;
    public final ArrayList f28649w0;
    public boolean f28650x;
    public final g2 f28651x0;
    public boolean f28652y;
    public p2 f28653y0;
    public AnimatorSet f28654z0;

    public v2(Context context, f6 f6Var, boolean z9, boolean z10) {
        this(z10 ? 2 : 1, context, f6Var, z9);
    }

    public static void A(v2 v2Var) {
        int w02;
        boolean z9;
        Drawable drawable;
        int w03;
        l2 l2Var = v2Var.f28618c;
        if (v2Var.f28614a1 >= 0 && (drawable = v2Var.f28642r0) != null && v2Var.f28617b1 != null && drawable.getColorFilter() == v2Var.f28617b1 && (w03 = k6.w0(v2Var.f28614a1, v2Var.I0)) != v2Var.Z0) {
            Drawable drawable2 = v2Var.f28642r0;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            v2Var.f28617b1 = porterDuffColorFilter;
            drawable2.setColorFilter(porterDuffColorFilter);
            v2Var.Z0 = w03;
            if (l2Var != null) {
                l2Var.invalidate();
            }
            ViewGroup viewGroup = v2Var.f28615b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        int i7 = v2Var.Y0;
        if (i7 >= 0 && v2Var.F0 < 0 && v2Var.f28622d1 == v2Var.G0 && (w02 = k6.w0(i7, v2Var.I0)) != v2Var.G0) {
            v2Var.G0 = w02;
            v2Var.f28622d1 = w02;
            if (l2Var != null) {
                l2Var.invalidate();
            }
            if (org.telegram.messenger.g0.B(w02) > 0.721d) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (v2Var.f28628f1 != null) {
                org.telegram.messenger.g0.o3(l2Var, z9);
                return;
            }
            org.telegram.messenger.g0.u3(v2Var, w02, false, null);
            org.telegram.messenger.g0.n3(v2Var, z9);
        }
    }

    public static int B(v2 v2Var) {
        WindowInsets windowInsets;
        int i7;
        int i10;
        int i11;
        if (v2Var.f28631h0 && (windowInsets = v2Var.h) != null) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            if (!v2Var.d && v2Var.f28636n && systemGestureInsets != null) {
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

    public static WindowInsets z(v2 v2Var, WindowInsets windowInsets) {
        v2Var.t0(windowInsets);
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
            attributes.softInputMode = this.f28637n0;
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
        duration.setInterpolator(xq.f40310f);
        duration.addUpdateListener(new h2(this, 4));
        duration.start();
    }

    public final void C0(int i7, int i10, int i11) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f28649w0;
            if (i7 < arrayList.size()) {
                o2 o2Var = (o2) arrayList.get(i7);
                o2Var.f28330a.setTextColor(i10);
                o2Var.f28331b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void D0() {
        this.R0 = true;
    }

    public void E0(int i7) {
        this.f28622d1 = i7;
        l2 l2Var = this.f28618c;
        if (l2Var != null) {
            l2Var.invalidate();
        }
        boolean z9 = false;
        if (this.f28628f1 != null) {
            LaunchActivity.G1.F(true, true, true);
            if (org.telegram.messenger.g0.B(e(k6.w0(k6.f27792a7, this.I0))) >= 0.721f) {
                z9 = true;
            }
            org.telegram.messenger.g0.o3(l2Var, z9);
            return;
        }
        org.telegram.messenger.g0.u3(this, this.f28622d1, true, null);
        if (org.telegram.messenger.g0.B(this.f28622d1) > 0.721d) {
            z9 = true;
        }
        org.telegram.messenger.g0.n3(this, z9);
    }

    public final void F0(boolean z9) {
        if (this.f28627f0 != z9) {
            this.f28627f0 = z9;
            if (this.M0 > 0) {
                if (z9) {
                    qs.e().k(qs.f25004j1, Integer.valueOf(this.M0));
                } else {
                    qs.e().k(qs.f25009k1, Integer.valueOf(this.M0));
                }
            }
        }
    }

    public boolean G() {
        return this.f28616b0;
    }

    public final void G0(boolean z9) {
        int i7;
        this.Z = z9;
        int x02 = k6.x0(null, k6.f28128s8, true);
        l2 l2Var = this.f28618c;
        int systemUiVisibility = l2Var.getSystemUiVisibility();
        if (this.Z && x02 == -1) {
            i7 = systemUiVisibility | 8192;
        } else {
            i7 = systemUiVisibility & (-8193);
        }
        l2Var.setSystemUiVisibility(i7);
        if (this.f28628f1 != null) {
            LaunchActivity.G1.F(true, true, true);
        }
    }

    public boolean H() {
        return this.f28619c0;
    }

    public boolean H0() {
        return false;
    }

    public boolean I(MotionEvent motionEvent) {
        return false;
    }

    public void J() {
        AnimatorSet animatorSet = this.f28654z0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f28654z0 = null;
        }
        this.A0 = 0;
    }

    public void K() {
        f2 f2Var = this.f28628f1;
        if (f2Var != null) {
            f2Var.removeSheet(this);
            org.telegram.messenger.g0.E2(this.f28618c);
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
            this.f28654z0 = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f28615b, View.TRANSLATION_Y, Math.max(0, Math.min(org.telegram.messenger.g0.f22532n, Q())) + org.telegram.messenger.g0.L(10.0f) + R() + this.f28626f);
            ofFloat.addUpdateListener(new h2(this, 2));
            this.f28654z0.playTogether(ofFloat, ObjectAnimator.ofInt(this.Y, org.telegram.ui.Components.m6.d, 0));
            AnimatorSet animatorSet = this.f28654z0;
            if (this.W == 4) {
                j3 = 330;
            } else {
                j3 = 180;
            }
            animatorSet.setDuration(j3);
            this.f28654z0.setInterpolator(xq.f40311g);
            this.f28654z0.addListener(new hi.m2(this, i7, 5));
            qs.e().k(qs.f25004j1, 512);
            this.f28654z0.start();
            if (this.W == 4 && (num = this.X) != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.f28649w0;
                int currentTextColor = ((o2) arrayList.get(intValue)).getTextView().getCurrentTextColor();
                int currentTextColor2 = ((o2) arrayList.get(i7)).getTextView().getCurrentTextColor();
                ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
                ofArgb.addUpdateListener(new h2(this, 3));
                ofArgb.setDuration(130L);
                xq xqVar = xq.f40310f;
                ofArgb.setInterpolator(xqVar);
                ofArgb.start();
                ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
                ofArgb2.addUpdateListener(new i2(this, i7, 0));
                ofArgb2.setDuration(130L);
                ofArgb2.setInterpolator(xqVar);
                ofArgb2.start();
            }
        }
    }

    public final void N() {
        P(k6.f27792a7);
    }

    public final void O(int i7) {
        this.f28636n = !this.f28650x;
        this.f28643s = true;
        this.f28648w = true;
        this.F0 = -1;
        this.Y0 = -1;
        this.G0 = i7;
        E0(i7);
    }

    public final void P(int i7) {
        O(k6.w0(i7, this.I0));
        this.Y0 = i7;
    }

    public int Q() {
        return (int) ((1.0f - this.S0) * this.R);
    }

    public int R() {
        ViewGroup viewGroup = this.f28615b;
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
        return k6.w0(i7, this.I0);
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
        if (f11 >= this.f28615b.getTop() && f10 >= this.f28615b.getLeft() && f10 <= this.f28615b.getRight()) {
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
                this.f28628f1 = f2Var;
                u2 u2Var = this.Y;
                if (u2Var != null) {
                    ((Paint) u2Var.f28593b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                }
            }
        }
    }

    @Override
    public final View d() {
        return this.f28618c;
    }

    @Override
    public void dismiss() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.v2.dismiss():void");
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
        if (y() && (viewGroup = this.f28615b) != null) {
            if (this.V0) {
                f10 = viewGroup.getAlpha();
            } else {
                int L = org.telegram.messenger.g0.L(10.0f) + R() + this.f28626f;
                int i10 = 0;
                if (this.f28648w) {
                    i10 = Math.max(0, Math.min(org.telegram.messenger.g0.f22532n, Q()));
                }
                f10 = Utilities.l(1.0f - (this.f28615b.getTranslationY() / (L + i10)));
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
        l2 l2Var = this.f28618c;
        if (l2Var != null) {
            l2Var.invalidate();
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
        f2 f2Var = this.f28628f1;
        l2 l2Var = this.f28618c;
        if (f2Var != null) {
            f2Var.addSheet(this);
            if (this.f28628f1.getLayoutContainer() != null) {
                if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f28628f1.getLayoutContainer().getWindowToken(), 2)) {
                    org.telegram.messenger.g0.i3(new g2(this, 0), 80L);
                } else {
                    org.telegram.messenger.g0.E2(l2Var);
                    this.f28628f1.getLayoutContainer().addView(l2Var);
                }
                window = null;
            } else {
                return;
            }
        } else {
            window = getWindow();
            window.setWindowAnimations(2131755178);
            setContentView(l2Var, new ViewGroup.LayoutParams(-1, -1));
        }
        if (this.Z && k6.x0(null, k6.f28128s8, true) == -1) {
            l2Var.setSystemUiVisibility(l2Var.getSystemUiVisibility() | 8192);
        }
        if (this.f28615b == null) {
            bi.e5 e5Var = new bi.e5(10, getContext(), this);
            this.f28615b = e5Var;
            e5Var.setBackgroundDrawable(this.f28642r0);
            ViewGroup viewGroup = this.f28615b;
            int i13 = this.f28645t0;
            if (this.f28646u0) {
                i11 = org.telegram.messenger.g0.L(8.0f);
            } else {
                i11 = 0;
            }
            int i14 = (i11 + this.f28644s0) - 1;
            int i15 = this.f28645t0;
            if (this.f28647v0) {
                i12 = org.telegram.messenger.g0.L(8.0f);
            } else {
                i12 = 0;
            }
            viewGroup.setPadding(i13, i14, i15, i12);
        }
        this.f28615b.setVisibility(4);
        l2Var.addView(this.f28615b, 0, ha.e(-1, -2, 80));
        if (this.E == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.E = frameLayout;
            l2Var.addView(frameLayout, l2Var.indexOfChild(this.f28615b) + 1, ha.e(-1, -2, 80));
        }
        if (this.O != null) {
            m2 m2Var = new m2(0, getContext(), this);
            this.f28635l0 = m2Var;
            m2Var.setText(this.O);
            if (this.P) {
                r6.V(this.f28635l0, k6.f27956j5, this.I0);
                this.f28635l0.setTextSize(1, 20.0f);
                this.f28635l0.setTypeface(org.telegram.messenger.g0.o());
                m2 m2Var2 = this.f28635l0;
                int L = org.telegram.messenger.g0.L(21.0f);
                if (this.Q) {
                    f12 = 14.0f;
                } else {
                    f12 = 6.0f;
                }
                m2Var2.setPadding(L, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
            } else {
                r6.V(this.f28635l0, k6.f28087q5, this.I0);
                this.f28635l0.setTextSize(1, 16.0f);
                m2 m2Var3 = this.f28635l0;
                int L2 = org.telegram.messenger.g0.L(16.0f);
                if (this.Q) {
                    f10 = 8.0f;
                } else {
                    f10 = 0.0f;
                }
                m2Var3.setPadding(L2, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
            }
            if (this.Q) {
                this.f28635l0.setSingleLine(false);
                this.f28635l0.setMaxLines(5);
                this.f28635l0.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                this.f28635l0.setLines(1);
                this.f28635l0.setSingleLine(true);
                this.f28635l0.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
            this.f28635l0.setGravity(16);
            ViewGroup viewGroup2 = this.f28615b;
            m2 m2Var4 = this.f28635l0;
            i7 = 48;
            if (this.Q) {
                f11 = -2.0f;
            } else {
                f11 = 48;
            }
            viewGroup2.addView(m2Var4, ha.c(f11, -1));
            this.f28635l0.setOnTouchListener(new ei.b(1));
        } else {
            i7 = 0;
        }
        ViewGroup viewGroup3 = this.N;
        if (viewGroup3 != null) {
            if (viewGroup3.getParent() != null) {
                ((ViewGroup) this.N.getParent()).removeView(this.N);
            }
            if (!this.T0) {
                this.f28615b.setClipToPadding(false);
                this.f28615b.setClipChildren(false);
                l2Var.setClipToPadding(false);
                l2Var.setClipChildren(false);
                float f13 = i7;
                this.f28615b.addView(this.N, ha.d(-1, -2.0f, this.U0, 0.0f, f13, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(f13) + (-this.f28644s0);
            } else {
                this.f28615b.addView(this.N, ha.d(-1, -2.0f, this.U0, 0.0f, i7, 0.0f, 0.0f));
            }
        } else if (this.L != null) {
            int i16 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.L;
                if (i16 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i16] != null) {
                    o2 o2Var = new o2(this.W, getContext(), this.I0);
                    CharSequence charSequence = this.L[i16];
                    int[] iArr = this.M;
                    if (iArr != null) {
                        i10 = iArr[i16];
                    } else {
                        i10 = 0;
                    }
                    o2Var.a(charSequence, i10, null, this.P);
                    this.f28615b.addView(o2Var, ha.d(-1, 48.0f, 51, 0.0f, i7, 0.0f, 0.0f));
                    i7 += 48;
                    o2Var.setTag(Integer.valueOf(i16));
                    o2Var.setOnClickListener(new ii.g(this, 15));
                    this.f28649w0.add(o2Var);
                }
                i16++;
            }
        }
        if (this.f28628f1 == null && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            int i17 = attributes.flags & (-3);
            attributes.flags = i17;
            if (this.m0) {
                attributes.softInputMode = this.f28637n0;
            } else {
                attributes.flags = i17 | 131072;
            }
            if (this.V) {
                attributes.flags |= -2147416832;
                l2Var.setSystemUiVisibility(1284);
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

    public hc k() {
        return new hc(this.E, this.I0);
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
        if (this.f28628f1 == null) {
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
        l2 l2Var = this.f28618c;
        if (l2Var != null) {
            l2Var.invalidate();
        }
    }

    @Override
    public final boolean s() {
        return !this.I;
    }

    public void s0() {
        if ((this instanceof a6) && !this.W0) {
            this.W0 = true;
            try {
                ((a6) this).updateColors();
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
        if (this.f28628f1 != null) {
            i0();
        } else {
            super.show();
        }
        F0(true);
        if (this.m0) {
            getWindow().setSoftInputMode(this.f28637n0);
        }
        int i7 = 0;
        this.I = false;
        J();
        ViewGroup viewGroup = this.f28615b;
        Point point = org.telegram.messenger.g0.f22537q;
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((this.f28645t0 * 2) + point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        boolean z9 = this.f28624e0;
        u2 u2Var = this.Y;
        if (z9) {
            if (this.f28638o0) {
                i7 = this.f28639p0;
            }
            u2Var.setAlpha(i7);
            this.f28615b.setTranslationY(0.0f);
            h0();
            return;
        }
        u2Var.setAlpha(0);
        this.H = 2;
        ViewGroup viewGroup2 = this.f28615b;
        float measuredHeight = ((1.0f - this.S0) * org.telegram.messenger.g0.f22531m) + viewGroup2.getMeasuredHeight();
        if (this.f28648w) {
            i7 = Math.max(0, Math.min(org.telegram.messenger.g0.f22532n, Q()));
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
        if ((systemWindowInsetTop != 0 || org.telegram.messenger.g0.E) && this.f28629g0 != systemWindowInsetTop) {
            this.f28629g0 = systemWindowInsetTop;
        }
        this.h = windowInsets;
        this.f28618c.requestLayout();
        p0();
    }

    public void u0(boolean z9) {
        this.f28640q0 = z9;
        if (!z9) {
            this.f28615b.setTranslationY(0.0f);
            h0();
        }
    }

    public final void v0(int i7) {
        this.f28642r0.setColorFilter(i7, PorterDuff.Mode.MULTIPLY);
        if (this.Z0 != i7) {
            this.Z0 = i7;
            l2 l2Var = this.f28618c;
            if (l2Var != null) {
                l2Var.invalidate(0, l2Var.getMeasuredHeight() - l2Var.f28491x, l2Var.getMeasuredWidth(), l2Var.getMeasuredHeight());
            }
        }
    }

    public final void w0(int i7) {
        v0(k6.w0(i7, this.I0));
        Drawable drawable = this.f28642r0;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.Z0, PorterDuff.Mode.MULTIPLY);
        this.f28617b1 = porterDuffColorFilter;
        drawable.setColorFilter(porterDuffColorFilter);
        this.f28614a1 = i7;
    }

    public final void x0(boolean z9) {
        this.f28631h0 = z9;
        this.f28636n = z9;
    }

    @Override
    public final boolean y() {
        l2 l2Var = this.f28618c;
        if (l2Var != null && l2Var.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    public final void y0() {
        this.f28638o0 = false;
    }

    public final void z0() {
        this.f28639p0 = 75;
    }

    public v2(Context context, boolean z9) {
        this(1, context, (f6) null, z9);
    }

    public v2(int i7, Context context, f6 f6Var, boolean z9) {
        super(context, 2131755352);
        this.f28612a = p10.f24459s0;
        this.J = true;
        u2 u2Var = new u2();
        this.Y = u2Var;
        this.Z = true;
        int i10 = k6.f27921h5;
        this.f28613a0 = i10;
        this.f28616b0 = true;
        this.f28619c0 = true;
        this.f28621d0 = true;
        this.f28629g0 = org.telegram.messenger.g0.f22531m;
        this.f28633j0 = 400;
        this.f28634k0 = xq.h;
        this.f28637n0 = 16;
        this.f28638o0 = true;
        this.f28639p0 = 51;
        this.f28640q0 = true;
        this.f28646u0 = true;
        this.f28647v0 = true;
        this.f28649w0 = new ArrayList();
        this.f28651x0 = new g2(this, 1);
        this.C0 = 0.0f;
        this.F0 = k6.f27792a7;
        this.K0 = true;
        this.L0 = new h2.f((int[]) null);
        this.T0 = true;
        this.U0 = 51;
        this.X0 = new oi.q();
        this.Y0 = -1;
        this.f28614a1 = i10;
        this.f28625e1 = -1L;
        this.I0 = f6Var;
        if (i7 == 3) {
            org.telegram.messenger.g0.S(getWindow());
            this.f28636n = false;
            this.f28641r = false;
            this.f28643s = false;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            getWindow().addFlags(-2147483392);
            if (i7 != 1) {
                this.f28637n0 = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.f28632i0 = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        DrawableWrapper drawableWrapper = new DrawableWrapper(jg.g.h(context, 2131232728));
        this.f28642r0 = drawableWrapper;
        int w02 = k6.w0(i10, this.I0);
        this.Z0 = w02;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        this.f28617b1 = porterDuffColorFilter;
        drawableWrapper.setColorFilter(porterDuffColorFilter);
        this.f28642r0.getPadding(rect);
        this.f28645t0 = rect.left;
        this.f28644s0 = rect.top;
        l2 l2Var = new l2(this, getContext());
        this.f28618c = l2Var;
        l2Var.setClipChildren(false);
        l2Var.setClipToPadding(false);
        l2Var.setBackground(u2Var);
        this.m0 = z9;
        if (i7 == 1) {
            l2Var.setFitsSystemWindows(true);
            l2Var.setOnApplyWindowInsetsListener(new hi.b2(this, 1));
        }
        if (i11 >= 30) {
            l2Var.setSystemUiVisibility(1792);
        } else {
            l2Var.setSystemUiVisibility(1280);
        }
        u2Var.setAlpha(0);
        if (i7 == 3) {
            k2 k2Var = new k2(this);
            WeakHashMap weakHashMap = r0.i0.f54073a;
            r0.a0.i(l2Var, k2Var);
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
