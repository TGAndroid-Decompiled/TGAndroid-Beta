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
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
public class t2 extends Dialog implements z1 {
    public static final int f28582i1 = 0;
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
    public mi.b0 H;
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
    public final g2.g M0;
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
    public final pi.q Y0;
    public final s2 Z;
    public int Z0;
    public int f28583a;
    public boolean f28584a0;
    public int f28585a1;
    public ViewGroup f28586b;
    public int f28587b0;
    public int f28588b1;
    public final j2 f28589c;
    public boolean f28590c0;
    public PorterDuffColorFilter f28591c1;
    public boolean d;
    public boolean f28592d0;
    public boolean f28593d1;
    public int f28594e;
    public boolean f28595e0;
    public int f28596e1;
    public int f28597f;
    public boolean f28598f0;
    public long f28599f1;
    public boolean f28600g0;
    public d2 f28601g1;
    public WindowInsets h;
    public int f28602h0;
    public cg.v0 f28603h1;
    public boolean f28604i0;
    public final int f28605j0;
    public final int f28606k0;
    public Interpolator f28607l0;
    public k2 m0;
    public boolean f28608n;
    public boolean f28609n0;
    public final int f28610o0;
    public boolean f28611p0;
    public int f28612q0;
    public boolean f28613r;
    public boolean f28614r0;
    public boolean f28615s;
    public Drawable f28616s0;
    public int f28617t0;
    public int f28618u0;
    public boolean f28619v0;
    public boolean f28620w;
    public boolean f28621w0;
    public boolean f28622x;
    public final ArrayList f28623x0;
    public boolean f28624y;
    public final e2 f28625y0;
    public n2 f28626z0;

    public t2(Context context, e6 e6Var, boolean z10, boolean z11) {
        this(z11 ? 2 : 1, context, e6Var, z10);
    }

    public static void A(t2 t2Var) {
        int w02;
        boolean z10;
        Drawable drawable;
        int w03;
        j2 j2Var = t2Var.f28589c;
        if (t2Var.f28588b1 >= 0 && (drawable = t2Var.f28616s0) != null && t2Var.f28591c1 != null && drawable.getColorFilter() == t2Var.f28591c1 && (w03 = k6.w0(t2Var.f28588b1, t2Var.J0)) != t2Var.f28585a1) {
            Drawable drawable2 = t2Var.f28616s0;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            t2Var.f28591c1 = porterDuffColorFilter;
            drawable2.setColorFilter(porterDuffColorFilter);
            t2Var.f28585a1 = w03;
            if (j2Var != null) {
                j2Var.invalidate();
            }
            ViewGroup viewGroup = t2Var.f28586b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        int i3 = t2Var.Z0;
        if (i3 >= 0 && t2Var.G0 < 0 && t2Var.f28596e1 == t2Var.H0 && (w02 = k6.w0(i3, t2Var.J0)) != t2Var.H0) {
            t2Var.H0 = w02;
            t2Var.f28596e1 = w02;
            if (j2Var != null) {
                j2Var.invalidate();
            }
            if (org.telegram.messenger.g0.B(w02) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (t2Var.f28601g1 != null) {
                org.telegram.messenger.g0.o3(j2Var, z10);
                return;
            }
            org.telegram.messenger.g0.u3(t2Var, w02, false, null);
            org.telegram.messenger.g0.n3(t2Var, z10);
        }
    }

    public static int B(t2 t2Var) {
        WindowInsets windowInsets;
        int i3;
        int i10;
        int i11;
        if (t2Var.f28604i0 && (windowInsets = t2Var.h) != null) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            if (!t2Var.d && t2Var.f28608n && systemGestureInsets != null) {
                i3 = systemGestureInsets.left;
                if (i3 == 0) {
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

    public static WindowInsets z(t2 t2Var, WindowInsets windowInsets) {
        t2Var.t0(windowInsets);
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public final void A0(boolean z10) {
        if (this.f28609n0 == z10) {
            return;
        }
        this.f28609n0 = z10;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.f28609n0) {
            attributes.softInputMode = this.f28610o0;
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
        duration.setInterpolator(xq.f40452f);
        duration.addUpdateListener(new f2(this, 4));
        duration.start();
    }

    public final void C0(int i3, int i10, int i11) {
        if (i3 >= 0) {
            ArrayList arrayList = this.f28623x0;
            if (i3 < arrayList.size()) {
                m2 m2Var = (m2) arrayList.get(i3);
                m2Var.f28332a.setTextColor(i10);
                m2Var.f28333b.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void D0() {
        this.S0 = true;
    }

    public void E0(int i3) {
        this.f28596e1 = i3;
        j2 j2Var = this.f28589c;
        if (j2Var != null) {
            j2Var.invalidate();
        }
        boolean z10 = false;
        if (this.f28601g1 != null) {
            LaunchActivity.K1.F(true, true, true);
            if (org.telegram.messenger.g0.B(e(k6.w0(k6.f27824a7, this.J0))) >= 0.721f) {
                z10 = true;
            }
            org.telegram.messenger.g0.o3(j2Var, z10);
            return;
        }
        org.telegram.messenger.g0.u3(this, this.f28596e1, true, null);
        if (org.telegram.messenger.g0.B(this.f28596e1) > 0.721d) {
            z10 = true;
        }
        org.telegram.messenger.g0.n3(this, z10);
    }

    public final void F0(boolean z10) {
        if (this.f28600g0 != z10) {
            this.f28600g0 = z10;
            if (this.N0 > 0) {
                if (z10) {
                    hs.e().k(hs.f23249j1, Integer.valueOf(this.N0));
                } else {
                    hs.e().k(hs.k1, Integer.valueOf(this.N0));
                }
            }
        }
    }

    public boolean G() {
        return this.f28590c0;
    }

    public final void G0(boolean z10) {
        int i3;
        this.f28584a0 = z10;
        int x02 = k6.x0(null, k6.f28160s8, true);
        j2 j2Var = this.f28589c;
        int systemUiVisibility = j2Var.getSystemUiVisibility();
        if (this.f28584a0 && x02 == -1) {
            i3 = systemUiVisibility | 8192;
        } else {
            i3 = systemUiVisibility & (-8193);
        }
        j2Var.setSystemUiVisibility(i3);
        if (this.f28601g1 != null) {
            LaunchActivity.K1.F(true, true, true);
        }
    }

    public boolean H() {
        return this.f28592d0;
    }

    public boolean H0() {
        return false;
    }

    public boolean I(MotionEvent motionEvent) {
        return false;
    }

    public void J() {
        AnimatorSet animatorSet = this.A0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.A0 = null;
        }
        this.B0 = 0;
    }

    public void K() {
        d2 d2Var = this.f28601g1;
        if (d2Var != null) {
            d2Var.removeSheet(this);
            org.telegram.messenger.g0.E2(this.f28589c);
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e10) {
            a8.g(e10, false);
        }
    }

    public void L(int i3) {
        long j10;
        Integer num;
        if (!this.J) {
            this.J = true;
            J();
            this.B0 = 2;
            this.A0 = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f28586b, View.TRANSLATION_Y, Math.max(0, Math.min(org.telegram.messenger.g0.f22603n, Q())) + org.telegram.messenger.g0.L(10.0f) + R() + this.f28597f);
            ofFloat.addUpdateListener(new f2(this, 2));
            this.A0.playTogether(ofFloat, ObjectAnimator.ofInt(this.Z, org.telegram.ui.Components.k6.d, 0));
            AnimatorSet animatorSet = this.A0;
            if (this.X == 4) {
                j10 = 330;
            } else {
                j10 = 180;
            }
            animatorSet.setDuration(j10);
            this.A0.setInterpolator(xq.f40453g);
            this.A0.addListener(new ii.m2(this, i3, 5));
            hs.e().k(hs.f23249j1, 512);
            this.A0.start();
            if (this.X == 4 && (num = this.Y) != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.f28623x0;
                int currentTextColor = ((m2) arrayList.get(intValue)).getTextView().getCurrentTextColor();
                int currentTextColor2 = ((m2) arrayList.get(i3)).getTextView().getCurrentTextColor();
                ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
                ofArgb.addUpdateListener(new f2(this, 3));
                ofArgb.setDuration(130L);
                xq xqVar = xq.f40452f;
                ofArgb.setInterpolator(xqVar);
                ofArgb.start();
                ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
                ofArgb2.addUpdateListener(new g2(this, i3, 0));
                ofArgb2.setDuration(130L);
                ofArgb2.setInterpolator(xqVar);
                ofArgb2.start();
            }
        }
    }

    public final void N() {
        P(k6.f27824a7);
    }

    public final void O(int i3) {
        this.f28608n = !this.f28622x;
        this.f28615s = true;
        this.f28620w = true;
        this.G0 = -1;
        this.Z0 = -1;
        this.H0 = i3;
        E0(i3);
    }

    public final void P(int i3) {
        O(k6.w0(i3, this.J0));
        this.Z0 = i3;
    }

    public int Q() {
        return (int) ((1.0f - this.T0) * this.S);
    }

    public int R() {
        ViewGroup viewGroup = this.f28586b;
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getMeasuredHeight();
    }

    public final int S() {
        WindowInsets windowInsets = this.h;
        if (windowInsets != null) {
            return (int) ((1.0f - this.T0) * windowInsets.getSystemWindowInsetLeft());
        }
        return 0;
    }

    public final int T() {
        WindowInsets windowInsets = this.h;
        if (windowInsets != null) {
            return (int) ((1.0f - this.T0) * windowInsets.getSystemWindowInsetRight());
        }
        return 0;
    }

    public ArrayList U() {
        return null;
    }

    public final int V(int i3) {
        return k6.w0(i3, this.J0);
    }

    public final boolean W() {
        return this.J;
    }

    public boolean X(float f10, float f11) {
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
        if (f11 >= this.f28586b.getTop() && f10 >= this.f28586b.getLeft() && f10 <= this.f28586b.getRight()) {
            return false;
        }
        return true;
    }

    @Override
    public void a(boolean z10) {
        dismiss();
    }

    public final void a0(d2 d2Var) {
        if (!org.telegram.messenger.g0.Q1()) {
            if (d2Var == null || !d2Var.isSupportEdgeToEdge()) {
                this.f28601g1 = d2Var;
                s2 s2Var = this.Z;
                if (s2Var != null) {
                    ((Paint) s2Var.f28571b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                }
            }
        }
    }

    @Override
    public final View d() {
        return this.f28589c;
    }

    @Override
    public void dismiss() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.t2.dismiss():void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.J) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int e(int i3) {
        float f10;
        ViewGroup viewGroup;
        if (y() && (viewGroup = this.f28586b) != null) {
            if (this.W0) {
                f10 = viewGroup.getAlpha();
            } else {
                int L = org.telegram.messenger.g0.L(10.0f) + R() + this.f28597f;
                int i10 = 0;
                if (this.f28620w) {
                    i10 = Math.max(0, Math.min(org.telegram.messenger.g0.f22603n, Q()));
                }
                f10 = Utilities.l(1.0f - (this.f28586b.getTranslationY() / (L + i10)));
            }
        } else {
            f10 = 0.0f;
        }
        return i0.a.f(f10, i3, this.H0);
    }

    @Override
    public boolean f() {
        return this.f28584a0;
    }

    public boolean f0(MotionEvent motionEvent) {
        return false;
    }

    public void g0(float f10) {
        j2 j2Var = this.f28589c;
        if (j2Var != null) {
            j2Var.invalidate();
        }
    }

    public final void i0() {
        Window window;
        int i3;
        int i10;
        float f10;
        float f11;
        float f12;
        int i11;
        int i12;
        d2 d2Var = this.f28601g1;
        j2 j2Var = this.f28589c;
        if (d2Var != null) {
            d2Var.addSheet(this);
            if (this.f28601g1.getLayoutContainer() != null) {
                if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f28601g1.getLayoutContainer().getWindowToken(), 2)) {
                    org.telegram.messenger.g0.i3(new e2(this, 0), 80L);
                } else {
                    org.telegram.messenger.g0.E2(j2Var);
                    this.f28601g1.getLayoutContainer().addView(j2Var);
                }
                window = null;
            } else {
                return;
            }
        } else {
            window = getWindow();
            window.setWindowAnimations(2131755178);
            setContentView(j2Var, new ViewGroup.LayoutParams(-1, -1));
        }
        if (this.f28584a0 && k6.x0(null, k6.f28160s8, true) == -1) {
            j2Var.setSystemUiVisibility(j2Var.getSystemUiVisibility() | 8192);
        }
        if (this.f28586b == null) {
            ai.o2 o2Var = new ai.o2(11, getContext(), this);
            this.f28586b = o2Var;
            o2Var.setBackgroundDrawable(this.f28616s0);
            ViewGroup viewGroup = this.f28586b;
            int i13 = this.f28618u0;
            if (this.f28619v0) {
                i11 = org.telegram.messenger.g0.L(8.0f);
            } else {
                i11 = 0;
            }
            int i14 = (i11 + this.f28617t0) - 1;
            int i15 = this.f28618u0;
            if (this.f28621w0) {
                i12 = org.telegram.messenger.g0.L(8.0f);
            } else {
                i12 = 0;
            }
            viewGroup.setPadding(i13, i14, i15, i12);
        }
        this.f28586b.setVisibility(4);
        j2Var.addView(this.f28586b, 0, mf.e(-1, -2, 80));
        if (this.F == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.F = frameLayout;
            j2Var.addView(frameLayout, j2Var.indexOfChild(this.f28586b) + 1, mf.e(-1, -2, 80));
        }
        if (this.P != null) {
            k2 k2Var = new k2(0, getContext(), this);
            this.m0 = k2Var;
            k2Var.setText(this.P);
            if (this.Q) {
                r6.V(this.m0, k6.f27988j5, this.J0);
                this.m0.setTextSize(1, 20.0f);
                this.m0.setTypeface(org.telegram.messenger.g0.o());
                k2 k2Var2 = this.m0;
                int L = org.telegram.messenger.g0.L(21.0f);
                if (this.R) {
                    f12 = 14.0f;
                } else {
                    f12 = 6.0f;
                }
                k2Var2.setPadding(L, org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(8.0f));
            } else {
                r6.V(this.m0, k6.f28120q5, this.J0);
                this.m0.setTextSize(1, 16.0f);
                k2 k2Var3 = this.m0;
                int L2 = org.telegram.messenger.g0.L(16.0f);
                if (this.R) {
                    f10 = 8.0f;
                } else {
                    f10 = 0.0f;
                }
                k2Var3.setPadding(L2, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
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
            ViewGroup viewGroup2 = this.f28586b;
            k2 k2Var4 = this.m0;
            i3 = 48;
            if (this.R) {
                f11 = -2.0f;
            } else {
                f11 = 48;
            }
            viewGroup2.addView(k2Var4, mf.c(f11, -1));
            this.m0.setOnTouchListener(new fi.a(1));
        } else {
            i3 = 0;
        }
        ViewGroup viewGroup3 = this.O;
        if (viewGroup3 != null) {
            if (viewGroup3.getParent() != null) {
                ((ViewGroup) this.O.getParent()).removeView(this.O);
            }
            if (!this.U0) {
                this.f28586b.setClipToPadding(false);
                this.f28586b.setClipChildren(false);
                j2Var.setClipToPadding(false);
                j2Var.setClipChildren(false);
                float f13 = i3;
                this.f28586b.addView(this.O, mf.d(-1, -2.0f, this.V0, 0.0f, f13, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(f13) + (-this.f28617t0);
            } else {
                this.f28586b.addView(this.O, mf.d(-1, -2.0f, this.V0, 0.0f, i3, 0.0f, 0.0f));
            }
        } else if (this.M != null) {
            int i16 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.M;
                if (i16 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i16] != null) {
                    m2 m2Var = new m2(this.X, getContext(), this.J0);
                    CharSequence charSequence = this.M[i16];
                    int[] iArr = this.N;
                    if (iArr != null) {
                        i10 = iArr[i16];
                    } else {
                        i10 = 0;
                    }
                    m2Var.a(charSequence, i10, null, this.Q);
                    this.f28586b.addView(m2Var, mf.d(-1, 48.0f, 51, 0.0f, i3, 0.0f, 0.0f));
                    i3 += 48;
                    m2Var.setTag(Integer.valueOf(i16));
                    m2Var.setOnClickListener(new ii.m(this, 18));
                    this.f28623x0.add(m2Var);
                }
                i16++;
            }
        }
        if (this.f28601g1 == null && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            int i17 = attributes.flags & (-3);
            attributes.flags = i17;
            if (this.f28609n0) {
                attributes.softInputMode = this.f28610o0;
            } else {
                attributes.flags = i17 | 131072;
            }
            if (this.W) {
                attributes.flags |= -2147416832;
                j2Var.setSystemUiVisibility(1284);
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

    public fc k() {
        return new fc(this.F, this.J0);
    }

    public boolean k0(View view, int i3, int i10, int i11, int i12) {
        return false;
    }

    public boolean l0(View view, int i3, int i10) {
        return false;
    }

    public boolean m0() {
        return false;
    }

    @Override
    public void n(Runnable runnable) {
        this.I0 = new h2(0, runnable);
    }

    public void o0() {
        dismiss();
    }

    @Override
    public void onBackPressed() {
        if (this.f28601g1 == null) {
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
        j2 j2Var = this.f28589c;
        if (j2Var != null) {
            j2Var.invalidate();
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
        long j10;
        if (!org.telegram.messenger.g0.M1(getContext())) {
            return;
        }
        if (this.f28601g1 != null) {
            i0();
        } else {
            super.show();
        }
        F0(true);
        if (this.f28609n0) {
            getWindow().setSoftInputMode(this.f28610o0);
        }
        int i3 = 0;
        this.J = false;
        J();
        ViewGroup viewGroup = this.f28586b;
        Point point = org.telegram.messenger.g0.f22608q;
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((this.f28618u0 * 2) + point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        boolean z10 = this.f28598f0;
        s2 s2Var = this.Z;
        if (z10) {
            if (this.f28611p0) {
                i3 = this.f28612q0;
            }
            s2Var.setAlpha(i3);
            this.f28586b.setTranslationY(0.0f);
            h0();
            return;
        }
        s2Var.setAlpha(0);
        this.I = 2;
        ViewGroup viewGroup2 = this.f28586b;
        float measuredHeight = ((1.0f - this.T0) * org.telegram.messenger.g0.f22602m) + viewGroup2.getMeasuredHeight();
        if (this.f28620w) {
            i3 = Math.max(0, Math.min(org.telegram.messenger.g0.f22603n, Q()));
        }
        viewGroup2.setTranslationY(measuredHeight + i3);
        h0();
        if (this.S0) {
            j10 = 0;
        } else {
            j10 = 150;
        }
        if (this.E) {
            j10 = 500;
        }
        mi.b0 b0Var = new mi.b0(this, 15);
        this.H = b0Var;
        org.telegram.messenger.g0.i3(b0Var, j10);
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
        if ((systemWindowInsetTop != 0 || org.telegram.messenger.g0.E) && this.f28602h0 != systemWindowInsetTop) {
            this.f28602h0 = systemWindowInsetTop;
        }
        this.h = windowInsets;
        this.f28589c.requestLayout();
        p0();
    }

    public void u0(boolean z10) {
        this.f28614r0 = z10;
        if (!z10) {
            this.f28586b.setTranslationY(0.0f);
            h0();
        }
    }

    public final void v0(int i3) {
        this.f28616s0.setColorFilter(i3, PorterDuff.Mode.MULTIPLY);
        if (this.f28585a1 != i3) {
            this.f28585a1 = i3;
            j2 j2Var = this.f28589c;
            if (j2Var != null) {
                j2Var.invalidate(0, j2Var.getMeasuredHeight() - j2Var.f28485x, j2Var.getMeasuredWidth(), j2Var.getMeasuredHeight());
            }
        }
    }

    public final void w0(int i3) {
        v0(k6.w0(i3, this.J0));
        Drawable drawable = this.f28616s0;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f28585a1, PorterDuff.Mode.MULTIPLY);
        this.f28591c1 = porterDuffColorFilter;
        drawable.setColorFilter(porterDuffColorFilter);
        this.f28588b1 = i3;
    }

    public final void x0(boolean z10) {
        this.f28604i0 = z10;
        this.f28608n = z10;
    }

    @Override
    public final boolean y() {
        j2 j2Var = this.f28589c;
        if (j2Var != null && j2Var.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    public final void y0() {
        this.f28611p0 = false;
    }

    public final void z0() {
        this.f28612q0 = 75;
    }

    public t2(Context context, boolean z10) {
        this(1, context, (e6) null, z10);
    }

    public t2(int i3, Context context, e6 e6Var, boolean z10) {
        super(context, 2131755352);
        this.f28583a = h10.f22829t0;
        this.K = true;
        s2 s2Var = new s2();
        this.Z = s2Var;
        this.f28584a0 = true;
        int i10 = k6.f27954h5;
        this.f28587b0 = i10;
        this.f28590c0 = true;
        this.f28592d0 = true;
        this.f28595e0 = true;
        this.f28602h0 = org.telegram.messenger.g0.f22602m;
        this.f28606k0 = 400;
        this.f28607l0 = xq.h;
        this.f28610o0 = 16;
        this.f28611p0 = true;
        this.f28612q0 = 51;
        this.f28614r0 = true;
        this.f28619v0 = true;
        this.f28621w0 = true;
        this.f28623x0 = new ArrayList();
        this.f28625y0 = new e2(this, 1);
        this.D0 = 0.0f;
        this.G0 = k6.f27824a7;
        this.L0 = true;
        this.M0 = new g2.g((int[]) null);
        this.U0 = true;
        this.V0 = 51;
        this.Y0 = new pi.q();
        this.Z0 = -1;
        this.f28588b1 = i10;
        this.f28599f1 = -1L;
        this.J0 = e6Var;
        if (i3 == 3) {
            org.telegram.messenger.g0.S(getWindow());
            this.f28608n = false;
            this.f28613r = false;
            this.f28615s = false;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            getWindow().addFlags(-2147483392);
            if (i3 != 1) {
                this.f28610o0 = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.f28605j0 = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        DrawableWrapper drawableWrapper = new DrawableWrapper(k2.p1.g(context, 2131232726));
        this.f28616s0 = drawableWrapper;
        int w02 = k6.w0(i10, this.J0);
        this.f28585a1 = w02;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        this.f28591c1 = porterDuffColorFilter;
        drawableWrapper.setColorFilter(porterDuffColorFilter);
        this.f28616s0.getPadding(rect);
        this.f28618u0 = rect.left;
        this.f28617t0 = rect.top;
        j2 j2Var = new j2(this, getContext());
        this.f28589c = j2Var;
        j2Var.setClipChildren(false);
        j2Var.setClipToPadding(false);
        j2Var.setBackground(s2Var);
        this.f28609n0 = z10;
        if (i3 == 1) {
            j2Var.setFitsSystemWindows(true);
            j2Var.setOnApplyWindowInsetsListener(new ii.b2(this, 1));
        }
        if (i11 >= 30) {
            j2Var.setSystemUiVisibility(1792);
        } else {
            j2Var.setSystemUiVisibility(1280);
        }
        s2Var.setAlpha(0);
        if (i3 == 3) {
            i2 i2Var = new i2(this);
            WeakHashMap weakHashMap = r0.i0.f54015a;
            r0.a0.i(j2Var, i2Var);
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
    public final void h(int i3) {
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

    public void E(ArrayList arrayList, boolean z10) {
    }
}
