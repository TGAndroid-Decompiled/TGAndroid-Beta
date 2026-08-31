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
public abstract class sa extends org.telegram.ui.ActionBar.h3 {
    public boolean B;
    public final RectF C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public z5 K;
    public boolean L;
    public fu M;
    public boolean N;
    public boolean O;
    public boolean P;
    public float Q;
    public int R;
    public int S;
    public int T;
    public final Drawable f31013b;
    public final org.telegram.ui.k f31014c;
    public final tl0 d;
    public final pa f31015e;
    public boolean f31016f;
    public int h;
    public final org.telegram.ui.ActionBar.p2 f31017n;
    public final boolean f31018r;
    public final na f31019s;
    public float v;
    public boolean f31020w;
    public float f31021x;
    public boolean f31022y;

    public sa(org.telegram.ui.ActionBar.p2 p2Var, boolean z4) {
        this(p2Var, z4, false, p2Var == null ? null : p2Var.getResourceProvider());
    }

    public static ViewGroup r(sa saVar) {
        return saVar.containerView;
    }

    public final boolean A() {
        if (i0.a.f(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, this.resourcesProvider)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void G(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sa.G(android.graphics.Canvas, android.widget.FrameLayout):void");
    }

    public void H(Canvas canvas, View view) {
        int i10;
        float f10;
        ImageView imageView;
        Paint paint;
        float f11;
        int i11;
        this.P = false;
        if (!this.f31018r) {
            boolean z4 = this.N;
            boolean z10 = true;
            tl0 tl0Var = this.d;
            if (z4) {
                int height = tl0Var.getHeight();
                for (int i12 = 0; i12 < tl0Var.getChildCount(); i12++) {
                    View childAt = tl0Var.getChildAt(i12);
                    int R = RecyclerView.R(childAt);
                    if (R != -1 && R != tl0Var.getAdapter().h() - 1) {
                        int top = childAt.getTop();
                        if (this.L) {
                            i11 = (int) childAt.getTranslationY();
                        } else {
                            i11 = 0;
                        }
                        height = Math.min(height, top + i11);
                    }
                }
                i10 = height - AndroidUtilities.dp(16.0f);
            } else {
                f2.m1 K = tl0Var.K(0);
                int i13 = -AndroidUtilities.dp(16.0f);
                if (K != null) {
                    View view2 = K.f5875a;
                    i13 = view2.getBottom() - AndroidUtilities.dp(16.0f);
                    if (this.L) {
                        i10 = ((int) view2.getTranslationY()) + i13;
                    }
                }
                i10 = i13;
            }
            int i14 = (i10 - ((this.E + this.F) + this.G)) + this.H;
            if (this.f31022y && this.B) {
                if (this.T == 2) {
                    f11 = 8.0f;
                } else {
                    f11 = 16.0f;
                }
                i14 -= AndroidUtilities.dp(f11);
            }
            float f12 = i14;
            this.Q = f12;
            E(f12);
            int i15 = this.T;
            float f13 = 1.0f;
            pa paVar = this.f31015e;
            if (i15 == 1) {
                float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i14) / x());
                if (dp < 0.0f) {
                    dp = 0.0f;
                }
                if (dp == 0.0f) {
                    z10 = false;
                }
                AndroidUtilities.updateViewVisibilityAnimated(paVar, z10, 1.0f, this.f31016f);
            } else if (i15 == 2) {
                float max = Math.max(((AndroidUtilities.dp(8.0f) + (i14 - this.H)) + this.F) - AndroidUtilities.statusBarHeight, 0.0f);
                z5 z5Var = this.K;
                if (max == 0.0f) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d = z5Var.d(f10, false);
                if (d != 0.0f && d != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                    this.P = true;
                }
                this.f31021x = d;
                f13 = AndroidUtilities.lerp(1.0f, 0.5f, d);
                paVar.f21532e.setAlpha(d);
                B(d);
                paVar.f21532e.setScaleX(d);
                paVar.f21532e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                paVar.f21532e.setScaleY(d);
                org.telegram.ui.ActionBar.l5 titleTextView = paVar.getTitleTextView();
                titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
                if (this.O) {
                    titleTextView.setTranslationX(((paVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                paVar.setTranslationY(max);
                i14 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.D - this.E) - this.F) - this.G), d);
                paVar.getBackground().setBounds(0, AndroidUtilities.lerp(paVar.getHeight(), 0, d), paVar.getWidth(), paVar.getHeight());
                if (d > 0.5f) {
                    if (this.J) {
                        this.J = false;
                        paVar.setTag(1);
                    }
                } else if (!this.J) {
                    this.J = true;
                    paVar.setTag(null);
                }
            }
            if (K()) {
                if (!(this instanceof hg.b1)) {
                    this.shadowDrawable.setBounds(0, i14, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), i14, AndroidUtilities.dp(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                u();
                this.shadowDrawable.draw(canvas);
                if (this.f31022y && f13 > 0.0f) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    int dp3 = AndroidUtilities.dp(20.0f) + i14;
                    RectF rectF = this.C;
                    rectF.set((view.getMeasuredWidth() - dp2) / 2.0f, dp3, (view.getMeasuredWidth() + dp2) / 2.0f, AndroidUtilities.dp(4.0f) + dp3);
                    org.telegram.ui.ActionBar.k6.f21939t0.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ii));
                    org.telegram.ui.ActionBar.k6.f21939t0.setAlpha((int) (paint.getAlpha() * f13));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.f21939t0);
                }
            }
            C(canvas, i14);
        }
    }

    public final void I() {
        tl0 tl0Var = this.d;
        if (tl0Var != null && this.f31014c != null && tl0Var.getChildCount() > 0) {
            View view = null;
            int i10 = -1;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < tl0Var.getChildCount(); i12++) {
                View childAt = tl0Var.getChildAt(i12);
                int R = RecyclerView.R(childAt);
                if (R >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                    view = childAt;
                    i10 = R;
                }
            }
            if (view != null) {
                this.R = i10;
                this.S = this.containerView.getTop() + view.getTop();
                smoothContainerViewLayout();
            }
        }
    }

    public final void J() {
        if (this.f31018r) {
            return;
        }
        this.T = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.E = currentActionBarHeight;
        this.D = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.F = AndroidUtilities.dp(16.0f);
        this.G = AndroidUtilities.dp(-20.0f);
        this.K = new z5(this.containerView, 0L, 350L, pr.h);
        this.f31015e.f21532e.setPivotX(0.0f);
        this.d.setClipToPadding(true);
    }

    public boolean K() {
        return true;
    }

    public final void M() {
        if (this.attachedFragment != null) {
            LaunchActivity.D1.H(true, true, true);
            return;
        }
        pa paVar = this.f31015e;
        if (paVar != null && paVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, A());
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f31017n;
        if (p2Var != null) {
            AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        }
    }

    public final void N() {
        pa paVar = this.f31015e;
        if (paVar != null) {
            paVar.setTitle(y());
        }
    }

    public final void O() {
        pa paVar = this.f31015e;
        if (paVar != null && !TextUtils.equals(y(), paVar.getTitle())) {
            paVar.I(y(), false, 350L, pr.h);
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        pa paVar = this.f31015e;
        if (paVar != null && paVar.getTag() != null) {
            return A();
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f31017n;
        if (p2Var != null) {
            return p2Var.isLightStatusBar();
        }
        return A();
    }

    @Override
    public void onContainerViewTranslation() {
        E(this.Q);
        u();
    }

    public final void s() {
        tl0 tl0Var = this.d;
        if (tl0Var != null && tl0Var.getLayoutManager() != null && this.R >= 0) {
            int top = (this.S - this.containerView.getTop()) - tl0Var.getPaddingTop();
            if (tl0Var.getLayoutManager() instanceof f2.j0) {
                ((f2.j0) tl0Var.getLayoutManager()).h1(this.R, top);
            }
            this.R = -1;
        }
    }

    public boolean t(View view, float f10, float f11) {
        return true;
    }

    public final void u() {
        if (this.backDrawable != null && this.containerView != null && this.shadowDrawable != null && K() && !this.f31018r) {
            Rect bounds = this.shadowDrawable.getBounds();
            if (this.containerView.getMeasuredWidth() >= this.container.getMeasuredWidth()) {
                this.backDrawable.a(((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY()));
            } else {
                this.backDrawable.a(0);
            }
        }
    }

    public abstract sl0 v(tl0 tl0Var);

    public tl0 w(Context context) {
        return new mh.d1(this, context, this.resourcesProvider, 8);
    }

    public int x() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence y();

    public sa(org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        this(p2Var.getParentActivity(), p2Var, false, z4, z10, 1, g6Var);
    }

    public sa(org.telegram.ui.ActionBar.p2 p2Var) {
        this(p2Var.getParentActivity(), p2Var, false, false, false, 2, p2Var.getResourceProvider());
    }

    public sa(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10, boolean z11, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, p2Var, z4, false, z10, z11, false, i10, g6Var);
    }

    public sa(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, boolean z10, boolean z11, boolean z12, boolean z13, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, z4, z10);
        na naVar;
        this.v = 0.4f;
        this.f31020w = true;
        this.f31021x = 1.0f;
        this.f31022y = false;
        this.C = new RectF();
        this.T = 1;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        this.I = true;
        this.J = false;
        this.L = false;
        this.R = -1;
        this.f31017n = p2Var;
        this.f31018r = z11;
        this.f31013b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z12) {
            na naVar2 = new na(this, context, z13, z11);
            this.f31019s = naVar2;
            naVar = naVar2;
        } else {
            naVar = new oa(this, context, z13, z11);
        }
        tl0 w10 = w(context);
        this.d = w10;
        org.telegram.ui.k kVar = new org.telegram.ui.k(4);
        this.f31014c = kVar;
        if (z13) {
            kVar.l1(true);
        }
        w10.setLayoutManager(kVar);
        na naVar3 = this.f31019s;
        if (naVar3 != null) {
            naVar3.setBottomSheetContainerView(getContainer());
            this.f31019s.setTargetListView(w10);
        }
        if (z11) {
            w10.setHasFixedSize(true);
            w10.setAdapter(v(w10));
            setCustomView(naVar);
            naVar.addView(w10, k7.c6.c(-2.0f, -1));
        } else {
            w10.setAdapter(new ra(this, v(w10), context));
            this.containerView = naVar;
            pa paVar = new pa(this, context, naVar);
            this.f31015e = paVar;
            paVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21731h5));
            paVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.k6.G6));
            paVar.B(getThemedColor(org.telegram.ui.ActionBar.k6.f22055z8), false);
            paVar.setBackButtonImage(R.drawable.ic_ab_back);
            paVar.C(getThemedColor(org.telegram.ui.ActionBar.k6.f22038y8), false);
            paVar.setCastShadows(true);
            paVar.setTitle(y());
            paVar.setActionBarMenuOnItemClick(new fg.l1(this, 24));
            naVar.addView(w10);
            naVar.addView(paVar, k7.c6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            w10.j(new fg.e2(naVar, 16));
        }
        if (i10 == 2) {
            J();
        }
        F(naVar);
        M();
    }

    public void B(float f10) {
    }

    public void E(float f10) {
    }

    public void F(qv0 qv0Var) {
    }

    public void C(Canvas canvas, int i10) {
    }

    public void D(int i10, int i11) {
    }
}
