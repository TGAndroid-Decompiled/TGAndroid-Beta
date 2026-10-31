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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.LaunchActivity;
public class z2 extends Dialog implements g2 {
    public static final int f21582h1 = 0;
    public int A0;
    public ValueAnimator B0;
    public float C0;
    public boolean D;
    public boolean D0;
    public FrameLayout E;
    public float E0;
    public boolean F;
    public int F0;
    public mg.c2 G;
    public int G0;
    public int H;
    public DialogInterface.OnDismissListener H0;
    public boolean I;
    public p6 I0;
    public final boolean J;
    public boolean J0;
    public DialogInterface.OnClickListener K;
    public boolean K0;
    public CharSequence[] L;
    public final e2.f L0;
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
    public final ei.r X0;
    public final y2 Y;
    public int Y0;
    public boolean Z;
    public int Z0;
    public int f21583a;
    public int f21584a0;
    public int f21585a1;
    public ViewGroup f21586b;
    public boolean f21587b0;
    public PorterDuffColorFilter f21588b1;
    public final p2 f21589c;
    public boolean f21590c0;
    public boolean f21591c1;
    public boolean d;
    public boolean f21592d0;
    public int f21593d1;
    public int e;
    public boolean f21594e0;
    public long f21595e1;
    public int f21596f;
    public boolean f21597f0;
    public k2 f21598f1;
    public int f21599g0;
    public c5.e f21600g1;
    public WindowInsets h;
    public boolean f21601h0;
    public final int f21602i0;
    public final int f21603j0;
    public Interpolator f21604k0;
    public q2 f21605l0;
    public boolean m0;
    public boolean f21606n;
    public final int f21607n0;
    public boolean f21608o0;
    public int f21609p0;
    public boolean f21610q0;
    public boolean f21611r;
    public Drawable f21612r0;
    public boolean f21613s;
    public int f21614s0;
    public int f21615t0;
    public boolean f21616u0;
    public boolean f21617v0;
    public boolean f21618w;
    public final ArrayList f21619w0;
    public boolean f21620x;
    public final mg.l1 f21621x0;
    public boolean f21622y;
    public t2 f21623y0;
    public AnimatorSet f21624z0;

    public z2(Context context, p6 p6Var, boolean z10, boolean z11) {
        this(z11 ? 2 : 1, context, p6Var, z10);
    }

    public static WindowInsets A(z2 z2Var, WindowInsets windowInsets) {
        z2Var.t0(windowInsets);
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public static void B(z2 z2Var) {
        int w02;
        boolean z10;
        Drawable drawable;
        int w03;
        p2 p2Var = z2Var.f21589c;
        if (z2Var.f21585a1 >= 0 && (drawable = z2Var.f21612r0) != null && z2Var.f21588b1 != null && drawable.getColorFilter() == z2Var.f21588b1 && (w03 = t6.w0(z2Var.f21585a1, z2Var.I0)) != z2Var.Z0) {
            Drawable drawable2 = z2Var.f21612r0;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, PorterDuff.Mode.MULTIPLY);
            z2Var.f21588b1 = porterDuffColorFilter;
            drawable2.setColorFilter(porterDuffColorFilter);
            z2Var.Z0 = w03;
            if (p2Var != null) {
                p2Var.invalidate();
            }
            ViewGroup viewGroup = z2Var.f21586b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        int i10 = z2Var.Y0;
        if (i10 >= 0 && z2Var.F0 < 0 && z2Var.f21593d1 == z2Var.G0 && (w02 = t6.w0(i10, z2Var.I0)) != z2Var.G0) {
            z2Var.G0 = w02;
            z2Var.f21593d1 = w02;
            if (p2Var != null) {
                p2Var.invalidate();
            }
            if (org.telegram.messenger.i0.B(w02) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z2Var.f21598f1 != null) {
                org.telegram.messenger.i0.n3(p2Var, z10);
                return;
            }
            org.telegram.messenger.i0.t3(z2Var, w02, false, null);
            org.telegram.messenger.i0.m3(z2Var, z10);
        }
    }

    public static int D(z2 z2Var) {
        WindowInsets windowInsets;
        int i10;
        int i11;
        int i12;
        if (z2Var.f21601h0 && (windowInsets = z2Var.h) != null) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            if (!z2Var.d && z2Var.f21606n && systemGestureInsets != null) {
                i10 = systemGestureInsets.left;
                if (i10 == 0) {
                    i12 = systemGestureInsets.right;
                    if (i12 == 0) {
                        return 0;
                    }
                }
                i11 = systemGestureInsets.bottom;
                return i11;
            }
            return 0;
        }
        return 0;
    }

    public final void A0(boolean z10) {
        if (this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.m0) {
            attributes.softInputMode = this.f21607n0;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void B0(boolean z10) {
        float f7;
        float f10 = this.S0;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f7).setDuration(180L);
        duration.setInterpolator(gr.f26495f);
        duration.addUpdateListener(new l2(this, 4));
        duration.start();
    }

    public final void C0(int i10, int i11, int i12) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f21619w0;
            if (i10 < arrayList.size()) {
                s2 s2Var = (s2) arrayList.get(i10);
                s2Var.f20764a.setTextColor(i11);
                s2Var.f20765b.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void D0() {
        this.R0 = true;
    }

    public void E0(int i10) {
        this.f21593d1 = i10;
        p2 p2Var = this.f21589c;
        if (p2Var != null) {
            p2Var.invalidate();
        }
        boolean z10 = false;
        if (this.f21598f1 != null) {
            LaunchActivity.I1.F(true, true, true);
            if (org.telegram.messenger.i0.B(e(t6.w0(t6.f20872a7, this.I0))) >= 0.721f) {
                z10 = true;
            }
            org.telegram.messenger.i0.n3(p2Var, z10);
            return;
        }
        org.telegram.messenger.i0.t3(this, this.f21593d1, true, null);
        if (org.telegram.messenger.i0.B(this.f21593d1) > 0.721d) {
            z10 = true;
        }
        org.telegram.messenger.i0.m3(this, z10);
    }

    public final void F0(boolean z10) {
        if (this.f21597f0 != z10) {
            this.f21597f0 = z10;
            if (this.M0 > 0) {
                if (z10) {
                    zs.e().k(zs.f19633j1, Integer.valueOf(this.M0));
                } else {
                    zs.e().k(zs.f19639k1, Integer.valueOf(this.M0));
                }
            }
        }
    }

    public final void G0(boolean z10) {
        int i10;
        this.Z = z10;
        int x02 = t6.x0(null, t6.f21206s8, true);
        p2 p2Var = this.f21589c;
        int systemUiVisibility = p2Var.getSystemUiVisibility();
        if (this.Z && x02 == -1) {
            i10 = systemUiVisibility | 8192;
        } else {
            i10 = systemUiVisibility & (-8193);
        }
        p2Var.setSystemUiVisibility(i10);
        if (this.f21598f1 != null) {
            LaunchActivity.I1.F(true, true, true);
        }
    }

    public boolean H() {
        return this.f21587b0;
    }

    public boolean H0() {
        return false;
    }

    public boolean I() {
        return this.f21590c0;
    }

    public boolean J(MotionEvent motionEvent) {
        return false;
    }

    public void K() {
        AnimatorSet animatorSet = this.f21624z0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f21624z0 = null;
        }
        this.A0 = 0;
    }

    public void L() {
        k2 k2Var = this.f21598f1;
        if (k2Var != null) {
            k2Var.removeSheet(this);
            org.telegram.messenger.i0.E2(this.f21589c);
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            f8.g(e, false);
        }
    }

    public void N(int i10) {
        long j10;
        Integer num;
        if (!this.I) {
            this.I = true;
            K();
            this.A0 = 2;
            this.f21624z0 = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21586b, View.TRANSLATION_Y, Math.max(0, Math.min(org.telegram.messenger.i0.f16021n, R())) + org.telegram.messenger.i0.L(10.0f) + S() + this.f21596f);
            ofFloat.addUpdateListener(new l2(this, 2));
            this.f21624z0.playTogether(ofFloat, ObjectAnimator.ofInt(this.Y, org.telegram.ui.Components.i6.d, 0));
            AnimatorSet animatorSet = this.f21624z0;
            if (this.W == 4) {
                j10 = 330;
            } else {
                j10 = 180;
            }
            animatorSet.setDuration(j10);
            this.f21624z0.setInterpolator(gr.f26496g);
            this.f21624z0.addListener(new bi.d5(this, i10, 3));
            zs.e().k(zs.f19633j1, 512);
            this.f21624z0.start();
            if (this.W == 4 && (num = this.X) != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.f21619w0;
                int currentTextColor = ((s2) arrayList.get(intValue)).getTextView().getCurrentTextColor();
                int currentTextColor2 = ((s2) arrayList.get(i10)).getTextView().getCurrentTextColor();
                ValueAnimator ofArgb = ValueAnimator.ofArgb(currentTextColor, currentTextColor2);
                ofArgb.addUpdateListener(new l2(this, 3));
                ofArgb.setDuration(130L);
                gr grVar = gr.f26495f;
                ofArgb.setInterpolator(grVar);
                ofArgb.start();
                ValueAnimator ofArgb2 = ValueAnimator.ofArgb(currentTextColor2, currentTextColor);
                ofArgb2.addUpdateListener(new nh.b(this, i10, 1));
                ofArgb2.setDuration(130L);
                ofArgb2.setInterpolator(grVar);
                ofArgb2.start();
            }
        }
    }

    public final void O() {
        Q(t6.f20872a7);
    }

    public final void P(int i10) {
        this.f21606n = !this.f21620x;
        this.f21613s = true;
        this.f21618w = true;
        this.F0 = -1;
        this.Y0 = -1;
        this.G0 = i10;
        E0(i10);
    }

    public final void Q(int i10) {
        P(t6.w0(i10, this.I0));
        this.Y0 = i10;
    }

    public int R() {
        return (int) ((1.0f - this.S0) * this.R);
    }

    public int S() {
        ViewGroup viewGroup = this.f21586b;
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getMeasuredHeight();
    }

    public final int T() {
        WindowInsets windowInsets = this.h;
        if (windowInsets != null) {
            return (int) ((1.0f - this.S0) * windowInsets.getSystemWindowInsetLeft());
        }
        return 0;
    }

    public final int U() {
        WindowInsets windowInsets = this.h;
        if (windowInsets != null) {
            return (int) ((1.0f - this.S0) * windowInsets.getSystemWindowInsetRight());
        }
        return 0;
    }

    public ArrayList V() {
        return null;
    }

    public final int W(int i10) {
        return t6.w0(i10, this.I0);
    }

    public final boolean X() {
        return this.I;
    }

    public boolean Y(float f7, float f10) {
        FrameLayout frameLayout = this.E;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            View childAt = this.E.getChildAt(0);
            if (f10 >= childAt.getY() + this.E.getY()) {
                if (f10 <= childAt.getY() + this.E.getY() + childAt.getHeight()) {
                    if (f7 >= childAt.getX() + this.E.getX()) {
                        if (f7 <= childAt.getX() + this.E.getX() + childAt.getWidth()) {
                            return false;
                        }
                    }
                }
            }
        }
        if (f10 >= this.f21586b.getTop() && f7 >= this.f21586b.getLeft() && f7 <= this.f21586b.getRight()) {
            return false;
        }
        return true;
    }

    @Override
    public void a(boolean z10) {
        dismiss();
    }

    public final void a0(k2 k2Var) {
        if (!org.telegram.messenger.i0.Q1()) {
            if (k2Var == null || !k2Var.isSupportEdgeToEdge()) {
                this.f21598f1 = k2Var;
                y2 y2Var = this.Y;
                if (y2Var != null) {
                    ((Paint) y2Var.f21556b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
                }
            }
        }
    }

    @Override
    public final View d() {
        return this.f21589c;
    }

    @Override
    public void dismiss() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.z2.dismiss():void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.I) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int e(int i10) {
        float f7;
        ViewGroup viewGroup;
        if (z() && (viewGroup = this.f21586b) != null) {
            if (this.V0) {
                f7 = viewGroup.getAlpha();
            } else {
                int L = org.telegram.messenger.i0.L(10.0f) + S() + this.f21596f;
                int i11 = 0;
                if (this.f21618w) {
                    i11 = Math.max(0, Math.min(org.telegram.messenger.i0.f16021n, R()));
                }
                f7 = Utilities.l(1.0f - (this.f21586b.getTranslationY() / (L + i11)));
            }
        } else {
            f7 = 0.0f;
        }
        return i0.b.f(f7, i10, this.G0);
    }

    @Override
    public boolean f() {
        return this.Z;
    }

    public boolean f0(MotionEvent motionEvent) {
        return false;
    }

    public void g0(float f7) {
        p2 p2Var = this.f21589c;
        if (p2Var != null) {
            p2Var.invalidate();
        }
    }

    public final void i0() {
        Window window;
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        int i12;
        int i13;
        k2 k2Var = this.f21598f1;
        p2 p2Var = this.f21589c;
        if (k2Var != null) {
            k2Var.addSheet(this);
            if (this.f21598f1.getLayoutContainer() != null) {
                if (((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f21598f1.getLayoutContainer().getWindowToken(), 2)) {
                    org.telegram.messenger.i0.h3(new mg.l1(this, 1), 80L);
                } else {
                    org.telegram.messenger.i0.E2(p2Var);
                    this.f21598f1.getLayoutContainer().addView(p2Var);
                }
                window = null;
            } else {
                return;
            }
        } else {
            window = getWindow();
            window.setWindowAnimations(2131755178);
            setContentView(p2Var, new ViewGroup.LayoutParams(-1, -1));
        }
        if (this.Z && t6.x0(null, t6.f21206s8, true) == -1) {
            p2Var.setSystemUiVisibility(p2Var.getSystemUiVisibility() | 8192);
        }
        if (this.f21586b == null) {
            jg.l0 l0Var = new jg.l0(this, getContext(), 8);
            this.f21586b = l0Var;
            l0Var.setBackgroundDrawable(this.f21612r0);
            ViewGroup viewGroup = this.f21586b;
            int i14 = this.f21615t0;
            if (this.f21616u0) {
                i12 = org.telegram.messenger.i0.L(8.0f);
            } else {
                i12 = 0;
            }
            int i15 = (i12 + this.f21614s0) - 1;
            int i16 = this.f21615t0;
            if (this.f21617v0) {
                i13 = org.telegram.messenger.i0.L(8.0f);
            } else {
                i13 = 0;
            }
            viewGroup.setPadding(i14, i15, i16, i13);
        }
        this.f21586b.setVisibility(4);
        p2Var.addView(this.f21586b, 0, w7.b6.e(-1, -2, 80));
        if (this.E == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.E = frameLayout;
            p2Var.addView(frameLayout, p2Var.indexOfChild(this.f21586b) + 1, w7.b6.e(-1, -2, 80));
        }
        if (this.O != null) {
            q2 q2Var = new q2(this, getContext(), 0);
            this.f21605l0 = q2Var;
            q2Var.setText(this.O);
            if (this.P) {
                a7.V(this.f21605l0, t6.f21037j5, this.I0);
                this.f21605l0.setTextSize(1, 20.0f);
                this.f21605l0.setTypeface(org.telegram.messenger.i0.o());
                q2 q2Var2 = this.f21605l0;
                int L = org.telegram.messenger.i0.L(21.0f);
                if (this.Q) {
                    f11 = 14.0f;
                } else {
                    f11 = 6.0f;
                }
                q2Var2.setPadding(L, org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(8.0f));
            } else {
                a7.V(this.f21605l0, t6.f21169q5, this.I0);
                this.f21605l0.setTextSize(1, 16.0f);
                q2 q2Var3 = this.f21605l0;
                int L2 = org.telegram.messenger.i0.L(16.0f);
                if (this.Q) {
                    f7 = 8.0f;
                } else {
                    f7 = 0.0f;
                }
                q2Var3.setPadding(L2, org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
            }
            if (this.Q) {
                this.f21605l0.setSingleLine(false);
                this.f21605l0.setMaxLines(5);
                this.f21605l0.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                this.f21605l0.setLines(1);
                this.f21605l0.setSingleLine(true);
                this.f21605l0.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
            this.f21605l0.setGravity(16);
            ViewGroup viewGroup2 = this.f21586b;
            q2 q2Var4 = this.f21605l0;
            i10 = 48;
            if (this.Q) {
                f10 = -2.0f;
            } else {
                f10 = 48;
            }
            viewGroup2.addView(q2Var4, w7.b6.c(f10, -1));
            this.f21605l0.setOnTouchListener(new n2(0));
        } else {
            i10 = 0;
        }
        ViewGroup viewGroup3 = this.N;
        if (viewGroup3 != null) {
            if (viewGroup3.getParent() != null) {
                ((ViewGroup) this.N.getParent()).removeView(this.N);
            }
            if (!this.T0) {
                this.f21586b.setClipToPadding(false);
                this.f21586b.setClipChildren(false);
                p2Var.setClipToPadding(false);
                p2Var.setClipChildren(false);
                float f12 = i10;
                this.f21586b.addView(this.N, w7.b6.d(-1, -2.0f, this.U0, 0.0f, f12, 0.0f, 0.0f));
                ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(f12) + (-this.f21614s0);
            } else {
                this.f21586b.addView(this.N, w7.b6.d(-1, -2.0f, this.U0, 0.0f, i10, 0.0f, 0.0f));
            }
        } else if (this.L != null) {
            int i17 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.L;
                if (i17 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i17] != null) {
                    s2 s2Var = new s2(this.W, getContext(), this.I0);
                    CharSequence charSequence = this.L[i17];
                    int[] iArr = this.M;
                    if (iArr != null) {
                        i11 = iArr[i17];
                    } else {
                        i11 = 0;
                    }
                    s2Var.a(charSequence, i11, null, this.P);
                    this.f21586b.addView(s2Var, w7.b6.d(-1, 48.0f, 51, 0.0f, i10, 0.0f, 0.0f));
                    i10 += 48;
                    s2Var.setTag(Integer.valueOf(i17));
                    s2Var.setOnClickListener(new ag.g(this, 18));
                    this.f21619w0.add(s2Var);
                }
                i17++;
            }
        }
        if (this.f21598f1 == null && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            int i18 = attributes.flags & (-3);
            attributes.flags = i18;
            if (this.m0) {
                attributes.softInputMode = this.f21607n0;
            } else {
                attributes.flags = i18 | 131072;
            }
            if (this.V) {
                attributes.flags |= -2147416832;
                p2Var.setSystemUiVisibility(1284);
            }
            attributes.height = -1;
            org.telegram.messenger.i0.m(attributes);
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

    @Override
    public cc k() {
        return new cc(this.E, this.I0);
    }

    public boolean k0(View view, int i10, int i11, int i12, int i13) {
        return false;
    }

    public boolean l0(View view, int i10, int i11) {
        return false;
    }

    public boolean m0() {
        return false;
    }

    @Override
    public void o(Runnable runnable) {
        this.H0 = new m2(0, runnable);
    }

    public void o0() {
        dismiss();
    }

    @Override
    public void onBackPressed() {
        if (this.f21598f1 == null) {
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

    public void q0(float f7) {
        p2 p2Var = this.f21589c;
        if (p2Var != null) {
            p2Var.invalidate();
        }
    }

    @Override
    public final boolean s() {
        return !this.I;
    }

    public void s0() {
        if ((this instanceof k6) && !this.W0) {
            this.W0 = true;
            try {
                ((k6) this).updateColors();
            } catch (Exception e) {
                f8.g(e, true);
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
        long j10;
        if (!org.telegram.messenger.i0.M1(getContext())) {
            return;
        }
        if (this.f21598f1 != null) {
            i0();
        } else {
            super.show();
        }
        F0(true);
        if (this.m0) {
            getWindow().setSoftInputMode(this.f21607n0);
        }
        int i10 = 0;
        this.I = false;
        K();
        ViewGroup viewGroup = this.f21586b;
        Point point = org.telegram.messenger.i0.f16026q;
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec((this.f21615t0 * 2) + point.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(point.y, Integer.MIN_VALUE));
        boolean z10 = this.f21594e0;
        y2 y2Var = this.Y;
        if (z10) {
            if (this.f21608o0) {
                i10 = this.f21609p0;
            }
            y2Var.setAlpha(i10);
            this.f21586b.setTranslationY(0.0f);
            h0();
            return;
        }
        y2Var.setAlpha(0);
        this.H = 2;
        ViewGroup viewGroup2 = this.f21586b;
        float measuredHeight = ((1.0f - this.S0) * org.telegram.messenger.i0.f16020m) + viewGroup2.getMeasuredHeight();
        if (this.f21618w) {
            i10 = Math.max(0, Math.min(org.telegram.messenger.i0.f16021n, R()));
        }
        viewGroup2.setTranslationY(measuredHeight + i10);
        h0();
        if (this.R0) {
            j10 = 0;
        } else {
            j10 = 150;
        }
        if (this.D) {
            j10 = 500;
        }
        mg.c2 c2Var = new mg.c2(this, 14);
        this.G = c2Var;
        org.telegram.messenger.i0.h3(c2Var, j10);
    }

    public boolean t(Dialog dialog) {
        return false;
    }

    public final void t0(WindowInsets windowInsets) {
        if (windowInsets == null) {
            return;
        }
        int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
        if ((systemWindowInsetTop != 0 || org.telegram.messenger.i0.E) && this.f21599g0 != systemWindowInsetTop) {
            this.f21599g0 = systemWindowInsetTop;
        }
        this.h = windowInsets;
        this.f21589c.requestLayout();
        p0();
    }

    public void u0(boolean z10) {
        this.f21610q0 = z10;
        if (!z10) {
            this.f21586b.setTranslationY(0.0f);
            h0();
        }
    }

    public final void v0(int i10) {
        this.f21612r0.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
        if (this.Z0 != i10) {
            this.Z0 = i10;
            p2 p2Var = this.f21589c;
            if (p2Var != null) {
                p2Var.invalidate(0, p2Var.getMeasuredHeight() - p2Var.f21440x, p2Var.getMeasuredWidth(), p2Var.getMeasuredHeight());
            }
        }
    }

    public final void w0(int i10) {
        v0(t6.w0(i10, this.I0));
        Drawable drawable = this.f21612r0;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.Z0, PorterDuff.Mode.MULTIPLY);
        this.f21588b1 = porterDuffColorFilter;
        drawable.setColorFilter(porterDuffColorFilter);
        this.f21585a1 = i10;
    }

    public final void x0(boolean z10) {
        this.f21601h0 = z10;
        this.f21606n = z10;
    }

    public final void y0() {
        this.f21608o0 = false;
    }

    @Override
    public final boolean z() {
        p2 p2Var = this.f21589c;
        if (p2Var != null && p2Var.isAttachedToWindow()) {
            return true;
        }
        return false;
    }

    public final void z0() {
        this.f21609p0 = 75;
    }

    public z2(Context context, boolean z10) {
        this(1, context, (p6) null, z10);
    }

    public z2(int i10, Context context, p6 p6Var, boolean z10) {
        super(context, 2131755352);
        this.f21583a = d20.f15147s0;
        this.J = true;
        y2 y2Var = new y2();
        this.Y = y2Var;
        this.Z = true;
        int i11 = t6.f21001h5;
        this.f21584a0 = i11;
        this.f21587b0 = true;
        this.f21590c0 = true;
        this.f21592d0 = true;
        this.f21599g0 = org.telegram.messenger.i0.f16020m;
        this.f21603j0 = 400;
        this.f21604k0 = gr.h;
        this.f21607n0 = 16;
        this.f21608o0 = true;
        this.f21609p0 = 51;
        this.f21610q0 = true;
        this.f21616u0 = true;
        this.f21617v0 = true;
        this.f21619w0 = new ArrayList();
        this.f21621x0 = new mg.l1(this, 2);
        this.C0 = 0.0f;
        this.F0 = t6.f20872a7;
        this.K0 = true;
        this.L0 = new e2.f(null);
        this.T0 = true;
        this.U0 = 51;
        this.X0 = new ei.r();
        this.Y0 = -1;
        this.f21585a1 = i11;
        this.f21595e1 = -1L;
        this.I0 = p6Var;
        if (i10 == 3) {
            org.telegram.messenger.i0.S(getWindow());
            this.f21606n = false;
            this.f21611r = false;
            this.f21613s = false;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            getWindow().addFlags(-2147483392);
            if (i10 != 1) {
                this.f21607n0 = 48;
            }
        } else {
            getWindow().addFlags(-2147417856);
        }
        this.f21602i0 = ViewConfiguration.get(context).getScaledTouchSlop();
        Rect rect = new Rect();
        DrawableWrapper drawableWrapper = new DrawableWrapper(i0.a.f(context, 2131232725));
        this.f21612r0 = drawableWrapper;
        int w02 = t6.w0(i11, this.I0);
        this.Z0 = w02;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        this.f21588b1 = porterDuffColorFilter;
        drawableWrapper.setColorFilter(porterDuffColorFilter);
        this.f21612r0.getPadding(rect);
        this.f21615t0 = rect.left;
        this.f21614s0 = rect.top;
        p2 p2Var = new p2(this, getContext());
        this.f21589c = p2Var;
        p2Var.setClipChildren(false);
        p2Var.setClipToPadding(false);
        p2Var.setBackground(y2Var);
        this.m0 = z10;
        if (i10 == 1) {
            p2Var.setFitsSystemWindows(true);
            p2Var.setOnApplyWindowInsetsListener(new o2(this, 0));
        }
        if (i12 >= 30) {
            p2Var.setSystemUiVisibility(1792);
        } else {
            p2Var.setSystemUiVisibility(1280);
        }
        y2Var.setAlpha(0);
        if (i10 == 3) {
            mg.c cVar = new mg.c(this);
            WeakHashMap weakHashMap = r0.h0.f46123a;
            r0.z.i(p2Var, cVar);
        }
    }

    public void F(HashSet hashSet) {
    }

    public void Z(Canvas canvas) {
    }

    @Override
    public final void b(boolean z10) {
    }

    public r0.j1 b0(r0.j1 j1Var) {
        return j1Var;
    }

    public void c0(Configuration configuration) {
    }

    @Override
    public final void h(int i10) {
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

    public void w() {
    }

    public void G(ArrayList arrayList, boolean z10) {
    }
}
