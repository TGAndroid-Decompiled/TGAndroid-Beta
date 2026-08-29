package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.LaunchActivity;
public abstract class xa extends org.telegram.ui.ActionBar.f3 {
    public boolean A;
    public final RectF B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public d6 J;
    public boolean K;
    public au L;
    public boolean M;
    public boolean N;
    public boolean O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public final Drawable f34658b;
    public final org.telegram.ui.k f34659c;
    public final jl0 d;
    public final ua f34660e;
    public boolean f34661f;
    public int h;
    public final org.telegram.ui.ActionBar.o2 f34662n;
    public final boolean f34663r;
    public final sa f34664s;
    public float v;
    public boolean f34665w;
    public float f34666x;
    public boolean f34667y;

    public xa(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        this(o2Var, z10, false, o2Var == null ? null : o2Var.getResourceProvider());
    }

    public static ViewGroup r(xa xaVar) {
        return xaVar.containerView;
    }

    public final boolean A() {
        if (i0.a.f(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, this.resourcesProvider)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void G(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xa.G(android.graphics.Canvas, android.widget.FrameLayout):void");
    }

    public void H(Canvas canvas, View view) {
        int i10;
        float f9;
        ImageView imageView;
        Paint paint;
        float f10;
        int i11;
        this.O = false;
        if (!this.f34663r) {
            boolean z10 = this.M;
            boolean z11 = true;
            jl0 jl0Var = this.d;
            if (z10) {
                int height = jl0Var.getHeight();
                for (int i12 = 0; i12 < jl0Var.getChildCount(); i12++) {
                    View childAt = jl0Var.getChildAt(i12);
                    int R = RecyclerView.R(childAt);
                    if (R != -1 && R != jl0Var.getAdapter().h() - 1) {
                        int top = childAt.getTop();
                        if (this.K) {
                            i11 = (int) childAt.getTranslationY();
                        } else {
                            i11 = 0;
                        }
                        height = Math.min(height, top + i11);
                    }
                }
                i10 = height - AndroidUtilities.dp(16.0f);
            } else {
                f2.n1 K = jl0Var.K(0);
                int i13 = -AndroidUtilities.dp(16.0f);
                if (K != null) {
                    View view2 = K.f6432a;
                    i13 = view2.getBottom() - AndroidUtilities.dp(16.0f);
                    if (this.K) {
                        i10 = ((int) view2.getTranslationY()) + i13;
                    }
                }
                i10 = i13;
            }
            int i14 = (i10 - ((this.D + this.E) + this.F)) + this.G;
            if (this.f34667y && this.A) {
                if (this.S == 2) {
                    f10 = 8.0f;
                } else {
                    f10 = 16.0f;
                }
                i14 -= AndroidUtilities.dp(f10);
            }
            float f11 = i14;
            this.P = f11;
            E(f11);
            int i15 = this.S;
            float f12 = 1.0f;
            ua uaVar = this.f34660e;
            if (i15 == 1) {
                float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i14) / x());
                if (dp < 0.0f) {
                    dp = 0.0f;
                }
                if (dp == 0.0f) {
                    z11 = false;
                }
                AndroidUtilities.updateViewVisibilityAnimated(uaVar, z11, 1.0f, this.f34661f);
            } else if (i15 == 2) {
                float max = Math.max(((AndroidUtilities.dp(8.0f) + (i14 - this.G)) + this.E) - AndroidUtilities.statusBarHeight, 0.0f);
                d6 d6Var = this.J;
                if (max == 0.0f) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                float d = d6Var.d(f9, false);
                if (d != 0.0f && d != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                    this.O = true;
                }
                this.f34666x = d;
                f12 = AndroidUtilities.lerp(1.0f, 0.5f, d);
                uaVar.f23600e.setAlpha(d);
                B(d);
                uaVar.f23600e.setScaleX(d);
                uaVar.f23600e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                uaVar.f23600e.setScaleY(d);
                org.telegram.ui.ActionBar.h5 titleTextView = uaVar.getTitleTextView();
                titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
                if (this.N) {
                    titleTextView.setTranslationX(((uaVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                uaVar.setTranslationY(max);
                i14 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.C - this.D) - this.E) - this.F), d);
                uaVar.getBackground().setBounds(0, AndroidUtilities.lerp(uaVar.getHeight(), 0, d), uaVar.getWidth(), uaVar.getHeight());
                if (d > 0.5f) {
                    if (this.I) {
                        this.I = false;
                        uaVar.setTag(1);
                    }
                } else if (!this.I) {
                    this.I = true;
                    uaVar.setTag(null);
                }
            }
            if (K()) {
                if (!(this instanceof eg.c1)) {
                    this.shadowDrawable.setBounds(0, i14, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), i14, AndroidUtilities.dp(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                u();
                this.shadowDrawable.draw(canvas);
                if (this.f34667y && f12 > 0.0f) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    int dp3 = AndroidUtilities.dp(20.0f) + i14;
                    RectF rectF = this.B;
                    rectF.set((view.getMeasuredWidth() - dp2) / 2.0f, dp3, (view.getMeasuredWidth() + dp2) / 2.0f, AndroidUtilities.dp(4.0f) + dp3);
                    org.telegram.ui.ActionBar.g6.f23340t0.setColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
                    org.telegram.ui.ActionBar.g6.f23340t0.setAlpha((int) (paint.getAlpha() * f12));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23340t0);
                }
            }
            C(canvas, i14);
        }
    }

    public final void I() {
        jl0 jl0Var = this.d;
        if (jl0Var != null && this.f34659c != null && jl0Var.getChildCount() > 0) {
            View view = null;
            int i10 = -1;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < jl0Var.getChildCount(); i12++) {
                View childAt = jl0Var.getChildAt(i12);
                int R = RecyclerView.R(childAt);
                if (R >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                    view = childAt;
                    i10 = R;
                }
            }
            if (view != null) {
                this.Q = i10;
                this.R = this.containerView.getTop() + view.getTop();
                smoothContainerViewLayout();
            }
        }
    }

    public final void J() {
        if (this.f34663r) {
            return;
        }
        this.S = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.D = currentActionBarHeight;
        this.C = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.E = AndroidUtilities.dp(16.0f);
        this.F = AndroidUtilities.dp(-20.0f);
        this.J = new d6(this.containerView, 0L, 350L, jr.h);
        this.f34660e.f23600e.setPivotX(0.0f);
        this.d.setClipToPadding(true);
    }

    public boolean K() {
        return true;
    }

    public final void L() {
        if (this.attachedFragment != null) {
            LaunchActivity.C1.H(true, true, true);
            return;
        }
        ua uaVar = this.f34660e;
        if (uaVar != null && uaVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, A());
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f34662n;
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
    }

    public final void M() {
        ua uaVar = this.f34660e;
        if (uaVar != null) {
            uaVar.setTitle(y());
        }
    }

    public final void O() {
        ua uaVar = this.f34660e;
        if (uaVar != null && !TextUtils.equals(y(), uaVar.getTitle())) {
            uaVar.I(y(), false, 350L, jr.h);
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        ua uaVar = this.f34660e;
        if (uaVar != null && uaVar.getTag() != null) {
            return A();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f34662n;
        if (o2Var != null) {
            return o2Var.isLightStatusBar();
        }
        return A();
    }

    @Override
    public void onContainerViewTranslation() {
        E(this.P);
        u();
    }

    public final void s() {
        jl0 jl0Var = this.d;
        if (jl0Var != null && jl0Var.getLayoutManager() != null && this.Q >= 0) {
            int top = (this.R - this.containerView.getTop()) - jl0Var.getPaddingTop();
            if (jl0Var.getLayoutManager() instanceof f2.j0) {
                ((f2.j0) jl0Var.getLayoutManager()).h1(this.Q, top);
            }
            this.Q = -1;
        }
    }

    public boolean t(View view, float f9, float f10) {
        return true;
    }

    public final void u() {
        if (this.backDrawable != null && this.containerView != null && this.shadowDrawable != null && K() && !this.f34663r) {
            Rect bounds = this.shadowDrawable.getBounds();
            if (this.containerView.getMeasuredWidth() >= this.container.getMeasuredWidth()) {
                this.backDrawable.a(((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY()));
            } else {
                this.backDrawable.a(0);
            }
        }
    }

    public abstract il0 v(jl0 jl0Var);

    public jl0 w(Context context) {
        return new jh.e1(this, context, this.resourcesProvider, 9);
    }

    public int x() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence y();

    public xa(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        this(o2Var.getParentActivity(), o2Var, false, z10, z11, 1, c6Var);
    }

    public xa(org.telegram.ui.ActionBar.o2 o2Var) {
        this(o2Var.getParentActivity(), o2Var, false, false, false, 2, o2Var.getResourceProvider());
    }

    public xa(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, o2Var, z10, false, z11, z12, false, i10, c6Var);
    }

    public xa(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, z10, z11);
        sa saVar;
        this.v = 0.4f;
        this.f34665w = true;
        this.f34666x = 1.0f;
        this.f34667y = false;
        this.B = new RectF();
        this.S = 1;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = true;
        this.I = false;
        this.K = false;
        this.Q = -1;
        this.f34662n = o2Var;
        this.f34663r = z12;
        this.f34658b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z13) {
            sa saVar2 = new sa(this, context, z14, z12);
            this.f34664s = saVar2;
            saVar = saVar2;
        } else {
            saVar = new ta(this, context, z14, z12);
        }
        jl0 w10 = w(context);
        this.d = w10;
        org.telegram.ui.k kVar = new org.telegram.ui.k(4);
        this.f34659c = kVar;
        if (z14) {
            kVar.l1(true);
        }
        w10.setLayoutManager(kVar);
        sa saVar3 = this.f34664s;
        if (saVar3 != null) {
            saVar3.setBottomSheetContainerView(getContainer());
            this.f34664s.setTargetListView(w10);
        }
        if (z12) {
            w10.setHasFixedSize(true);
            w10.setAdapter(v(w10));
            setCustomView(saVar);
            saVar.addView(w10, i7.f6.c(-2.0f, -1));
        } else {
            w10.setAdapter(new wa(this, v(w10), context));
            this.containerView = saVar;
            ua uaVar = new ua(this, context, saVar);
            this.f34660e = uaVar;
            uaVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
            uaVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
            uaVar.B(getThemedColor(org.telegram.ui.ActionBar.g6.f23452z8), false);
            uaVar.setBackButtonImage(R.drawable.ic_ab_back);
            uaVar.C(getThemedColor(org.telegram.ui.ActionBar.g6.y8), false);
            uaVar.setCastShadows(true);
            uaVar.setTitle(y());
            uaVar.setActionBarMenuOnItemClick(new cg.n1(this, 24));
            saVar.addView(w10);
            saVar.addView(uaVar, i7.f6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            w10.j(new cg.g2(saVar, 18));
        }
        if (i10 == 2) {
            J();
        }
        F(saVar);
        L();
    }

    public void B(float f9) {
    }

    public void E(float f9) {
    }

    public void F(hv0 hv0Var) {
    }

    public void C(Canvas canvas, int i10) {
    }

    public void D(int i10, int i11) {
    }
}
