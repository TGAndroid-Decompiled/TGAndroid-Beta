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
public abstract class sa extends org.telegram.ui.ActionBar.f3 {
    public boolean A;
    public final RectF B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public y5 J;
    public boolean K;
    public ut L;
    public boolean M;
    public boolean N;
    public boolean O;
    public float P;
    public int Q;
    public int R;
    public int S;
    public final Drawable f32406b;
    public final of.y f32407c;
    public final wk0 d;
    public final pa f32408e;
    public boolean f32409f;
    public int h;
    public final org.telegram.ui.ActionBar.o2 f32410n;
    public final boolean f32411r;
    public final na f32412s;
    public float v;
    public boolean f32413w;
    public float f32414x;
    public boolean f32415y;

    public sa(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        this(o2Var, z10, false, o2Var == null ? null : o2Var.getResourceProvider());
    }

    public static ViewGroup r(sa saVar) {
        return saVar.containerView;
    }

    public final void G(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sa.G(android.graphics.Canvas, android.widget.FrameLayout):void");
    }

    public void H(Canvas canvas, View view) {
        int i9;
        float f10;
        ImageView imageView;
        Paint paint;
        float f11;
        int i10;
        this.O = false;
        if (!this.f32411r) {
            boolean z10 = this.M;
            boolean z11 = true;
            wk0 wk0Var = this.d;
            if (z10) {
                int height = wk0Var.getHeight();
                for (int i11 = 0; i11 < wk0Var.getChildCount(); i11++) {
                    View childAt = wk0Var.getChildAt(i11);
                    int R = RecyclerView.R(childAt);
                    if (R != -1 && R != wk0Var.getAdapter().h() - 1) {
                        int top = childAt.getTop();
                        if (this.K) {
                            i10 = (int) childAt.getTranslationY();
                        } else {
                            i10 = 0;
                        }
                        height = Math.min(height, top + i10);
                    }
                }
                i9 = height - AndroidUtilities.dp(16.0f);
            } else {
                f2.q1 K = wk0Var.K(0);
                int i12 = -AndroidUtilities.dp(16.0f);
                if (K != null) {
                    View view2 = K.f5501a;
                    i12 = view2.getBottom() - AndroidUtilities.dp(16.0f);
                    if (this.K) {
                        i9 = ((int) view2.getTranslationY()) + i12;
                    }
                }
                i9 = i12;
            }
            int i13 = (i9 - ((this.D + this.E) + this.F)) + this.G;
            if (this.f32415y && this.A) {
                if (this.S == 2) {
                    f11 = 8.0f;
                } else {
                    f11 = 16.0f;
                }
                i13 -= AndroidUtilities.dp(f11);
            }
            float f12 = i13;
            this.P = f12;
            E(f12);
            int i14 = this.S;
            float f13 = 1.0f;
            pa paVar = this.f32408e;
            if (i14 == 1) {
                float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i13) / x());
                if (dp < 0.0f) {
                    dp = 0.0f;
                }
                if (dp == 0.0f) {
                    z11 = false;
                }
                AndroidUtilities.updateViewVisibilityAnimated(paVar, z11, 1.0f, this.f32409f);
            } else if (i14 == 2) {
                float max = Math.max(((AndroidUtilities.dp(8.0f) + (i13 - this.G)) + this.E) - AndroidUtilities.statusBarHeight, 0.0f);
                y5 y5Var = this.J;
                if (max == 0.0f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d = y5Var.d(f10, false);
                if (d != 0.0f && d != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                    this.O = true;
                }
                this.f32414x = d;
                f13 = AndroidUtilities.lerp(1.0f, 0.5f, d);
                paVar.f23565e.setAlpha(d);
                A(d);
                paVar.f23565e.setScaleX(d);
                paVar.f23565e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                paVar.f23565e.setScaleY(d);
                org.telegram.ui.ActionBar.h5 titleTextView = paVar.getTitleTextView();
                titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
                if (this.N) {
                    titleTextView.setTranslationX(((paVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                paVar.setTranslationY(max);
                i13 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.C - this.D) - this.E) - this.F), d);
                paVar.getBackground().setBounds(0, AndroidUtilities.lerp(paVar.getHeight(), 0, d), paVar.getWidth(), paVar.getHeight());
                if (d > 0.5f) {
                    if (this.I) {
                        this.I = false;
                        paVar.setTag(1);
                    }
                } else if (!this.I) {
                    this.I = true;
                    paVar.setTag(null);
                }
            }
            if (K()) {
                if (!(this instanceof bg.h1)) {
                    this.shadowDrawable.setBounds(0, i13, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                u();
                this.shadowDrawable.draw(canvas);
                if (this.f32415y && f13 > 0.0f) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    int dp3 = AndroidUtilities.dp(20.0f) + i13;
                    RectF rectF = this.B;
                    rectF.set((view.getMeasuredWidth() - dp2) / 2.0f, dp3, (view.getMeasuredWidth() + dp2) / 2.0f, AndroidUtilities.dp(4.0f) + dp3);
                    org.telegram.ui.ActionBar.f6.f23279t0.setColor(getThemedColor(org.telegram.ui.ActionBar.f6.Ii));
                    org.telegram.ui.ActionBar.f6.f23279t0.setAlpha((int) (paint.getAlpha() * f13));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.f23279t0);
                }
            }
            C(canvas, i13);
        }
    }

    public final void I() {
        wk0 wk0Var = this.d;
        if (wk0Var != null && this.f32407c != null && wk0Var.getChildCount() > 0) {
            View view = null;
            int i9 = -1;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < wk0Var.getChildCount(); i11++) {
                View childAt = wk0Var.getChildAt(i11);
                int R = RecyclerView.R(childAt);
                if (R >= 0 && childAt.getTop() < i10) {
                    i10 = childAt.getTop();
                    view = childAt;
                    i9 = R;
                }
            }
            if (view != null) {
                this.Q = i9;
                this.R = this.containerView.getTop() + view.getTop();
                smoothContainerViewLayout();
            }
        }
    }

    public final void J() {
        if (this.f32411r) {
            return;
        }
        this.S = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.D = currentActionBarHeight;
        this.C = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.E = AndroidUtilities.dp(16.0f);
        this.F = AndroidUtilities.dp(-20.0f);
        this.J = new y5(this.containerView, 0L, 350L, gr.h);
        this.f32408e.f23565e.setPivotX(0.0f);
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
        pa paVar = this.f32408e;
        if (paVar != null && paVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, z());
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f32410n;
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
    }

    public final void M() {
        pa paVar = this.f32408e;
        if (paVar != null) {
            paVar.setTitle(y());
        }
    }

    public final void N() {
        pa paVar = this.f32408e;
        if (paVar != null && !TextUtils.equals(y(), paVar.getTitle())) {
            paVar.I(y(), false, 350L, gr.h);
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        pa paVar = this.f32408e;
        if (paVar != null && paVar.getTag() != null) {
            return z();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f32410n;
        if (o2Var != null) {
            return o2Var.isLightStatusBar();
        }
        return z();
    }

    @Override
    public void onContainerViewTranslation() {
        E(this.P);
        u();
    }

    public final void s() {
        wk0 wk0Var = this.d;
        if (wk0Var != null && wk0Var.getLayoutManager() != null && this.Q >= 0) {
            int top = (this.R - this.containerView.getTop()) - wk0Var.getPaddingTop();
            if (wk0Var.getLayoutManager() instanceof f2.m0) {
                ((f2.m0) wk0Var.getLayoutManager()).h1(this.Q, top);
            }
            this.Q = -1;
        }
    }

    public boolean t(View view, float f10, float f11) {
        return true;
    }

    public final void u() {
        if (this.backDrawable != null && this.containerView != null && this.shadowDrawable != null && K() && !this.f32411r) {
            Rect bounds = this.shadowDrawable.getBounds();
            if (this.containerView.getMeasuredWidth() >= this.container.getMeasuredWidth()) {
                this.backDrawable.a(((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY()));
            } else {
                this.backDrawable.a(0);
            }
        }
    }

    public abstract vk0 v(wk0 wk0Var);

    public wk0 w(Context context) {
        return new gh.f1(this, context, this.resourcesProvider, 10);
    }

    public int x() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence y();

    public final boolean z() {
        if (i0.a.f(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, this.resourcesProvider)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public sa(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.b6 b6Var) {
        this(o2Var.getParentActivity(), o2Var, false, z10, z11, 1, b6Var);
    }

    public sa(org.telegram.ui.ActionBar.o2 o2Var) {
        this(o2Var.getParentActivity(), o2Var, false, false, false, 2, o2Var.getResourceProvider());
    }

    public sa(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, o2Var, z10, false, z11, z12, false, i9, b6Var);
    }

    public sa(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, z10, z11);
        na naVar;
        this.v = 0.4f;
        this.f32413w = true;
        this.f32414x = 1.0f;
        this.f32415y = false;
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
        this.f32410n = o2Var;
        this.f32411r = z12;
        this.f32406b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z13) {
            na naVar2 = new na(this, context, z14, z12);
            this.f32412s = naVar2;
            naVar = naVar2;
        } else {
            naVar = new oa(this, context, z14, z12);
        }
        wk0 w8 = w(context);
        this.d = w8;
        of.y yVar = new of.y(5);
        this.f32407c = yVar;
        if (z14) {
            yVar.l1(true);
        }
        w8.setLayoutManager(yVar);
        na naVar3 = this.f32412s;
        if (naVar3 != null) {
            naVar3.setBottomSheetContainerView(getContainer());
            this.f32412s.setTargetListView(w8);
        }
        if (z12) {
            w8.setHasFixedSize(true);
            w8.setAdapter(v(w8));
            setCustomView(naVar);
            naVar.addView(w8, g7.e6.c(-2.0f, -1));
        } else {
            w8.setAdapter(new ra(this, v(w8), context));
            this.containerView = naVar;
            pa paVar = new pa(this, context, naVar);
            this.f32408e = paVar;
            paVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
            paVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.f6.G6));
            paVar.A(getThemedColor(org.telegram.ui.ActionBar.f6.f23388z8), false);
            paVar.setBackButtonImage(R.drawable.ic_ab_back);
            paVar.C(getThemedColor(org.telegram.ui.ActionBar.f6.f23371y8), false);
            paVar.setCastShadows(true);
            paVar.setTitle(y());
            paVar.setActionBarMenuOnItemClick(new org.telegram.ui.tq(this, 2));
            naVar.addView(w8);
            naVar.addView(paVar, g7.e6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            w8.j(new bg.o2(naVar, 22));
        }
        if (i9 == 2) {
            J();
        }
        F(naVar);
        L();
    }

    public void A(float f10) {
    }

    public void E(float f10) {
    }

    public void F(xu0 xu0Var) {
    }

    public void C(Canvas canvas, int i9) {
    }

    public void D(int i9, int i10) {
    }
}
