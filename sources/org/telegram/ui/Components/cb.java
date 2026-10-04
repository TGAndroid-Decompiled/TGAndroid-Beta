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
public abstract class cb extends org.telegram.ui.ActionBar.f3 {
    public boolean E;
    public final RectF F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public e6 N;
    public boolean O;
    public boolean P;
    public mu Q;
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final Drawable f25305b;
    public final gg.b0 f25306c;
    public final zl0 d;
    public final ya f25307e;
    public boolean f25308f;
    public int h;
    public final org.telegram.ui.ActionBar.n2 f25309n;
    public final boolean f25310r;
    public final wa f25311s;
    public float v;
    public boolean f25312w;
    public float f25313x;
    public boolean f25314y;

    public cb(org.telegram.ui.ActionBar.n2 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cb.<init>(org.telegram.ui.ActionBar.n2, boolean):void");
    }

    public static ViewGroup r(cb cbVar) {
        return cbVar.containerView;
    }

    public final void F(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cb.F(android.graphics.Canvas, android.widget.FrameLayout):void");
    }

    public void G(Canvas canvas, View view) {
        int i10;
        float f7;
        ImageView imageView;
        Paint paint;
        float f10;
        int i11;
        this.S = false;
        if (!this.f25310r) {
            boolean z10 = this.P;
            boolean z11 = true;
            zl0 zl0Var = this.d;
            if (z10) {
                int height = zl0Var.getHeight();
                for (int i12 = 0; i12 < zl0Var.getChildCount(); i12++) {
                    View childAt = zl0Var.getChildAt(i12);
                    int R = RecyclerView.R(childAt);
                    if (R != -1 && R != zl0Var.getAdapter().h() - 1) {
                        int top = childAt.getTop();
                        if (this.O) {
                            i11 = (int) childAt.getTranslationY();
                        } else {
                            i11 = 0;
                        }
                        height = Math.min(height, top + i11);
                    }
                }
                i10 = height - AndroidUtilities.dp(16.0f);
            } else {
                s4.c1 K = zl0Var.K(0);
                int i13 = -AndroidUtilities.dp(16.0f);
                if (K != null) {
                    View view2 = K.f46531a;
                    i13 = view2.getBottom() - AndroidUtilities.dp(16.0f);
                    if (this.O) {
                        i10 = ((int) view2.getTranslationY()) + i13;
                    }
                }
                i10 = i13;
            }
            int i14 = (i10 - ((this.H + this.I) + this.J)) + this.K;
            if (this.f25314y && this.E) {
                if (this.W == 2) {
                    f10 = 8.0f;
                } else {
                    f10 = 16.0f;
                }
                i14 -= AndroidUtilities.dp(f10);
            }
            float f11 = i14;
            this.T = f11;
            D(f11);
            int i15 = this.W;
            float f12 = 1.0f;
            ya yaVar = this.f25307e;
            if (i15 == 1) {
                float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i14) / x());
                if (dp < 0.0f) {
                    dp = 0.0f;
                }
                if (dp == 0.0f) {
                    z11 = false;
                }
                AndroidUtilities.updateViewVisibilityAnimated(yaVar, z11, 1.0f, this.f25308f);
            } else if (i15 == 2) {
                float max = Math.max(((AndroidUtilities.dp(8.0f) + (i14 - this.K)) + this.I) - AndroidUtilities.statusBarHeight, 0.0f);
                e6 e6Var = this.N;
                if (max == 0.0f) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = e6Var.d(f7, false);
                if (d != 0.0f && d != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                    this.S = true;
                }
                this.f25313x = d;
                f12 = AndroidUtilities.lerp(1.0f, 0.5f, d);
                yaVar.f21262e.setAlpha(d);
                A(d);
                yaVar.f21262e.setScaleX(d);
                yaVar.f21262e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                yaVar.f21262e.setScaleY(d);
                org.telegram.ui.ActionBar.i5 titleTextView = yaVar.getTitleTextView();
                titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
                if (this.R) {
                    titleTextView.setTranslationX(((yaVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                yaVar.setTranslationY(max);
                i14 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.G - this.H) - this.I) - this.J), d);
                yaVar.getBackground().setBounds(0, AndroidUtilities.lerp(yaVar.getHeight(), 0, d), yaVar.getWidth(), yaVar.getHeight());
                if (d > 0.5f) {
                    if (this.M) {
                        this.M = false;
                        yaVar.setTag(1);
                    }
                } else if (!this.M) {
                    this.M = true;
                    yaVar.setTag(null);
                }
            }
            if (J()) {
                if (!(this instanceof tg.a0)) {
                    this.shadowDrawable.setBounds(0, i14, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), i14, AndroidUtilities.dp(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                u();
                this.shadowDrawable.draw(canvas);
                if (this.f25314y && f12 > 0.0f) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    int dp3 = AndroidUtilities.dp(20.0f) + i14;
                    RectF rectF = this.F;
                    rectF.set((view.getMeasuredWidth() - dp2) / 2.0f, dp3, (view.getMeasuredWidth() + dp2) / 2.0f, AndroidUtilities.dp(4.0f) + dp3);
                    org.telegram.ui.ActionBar.i6.f21115t0.setColor(getThemedColor(org.telegram.ui.ActionBar.i6.Ii));
                    org.telegram.ui.ActionBar.i6.f21115t0.setAlpha((int) (paint.getAlpha() * f12));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.f21115t0);
                }
            }
            B(canvas, i14);
        }
    }

    public final void H() {
        zl0 zl0Var = this.d;
        if (zl0Var != null && this.f25306c != null && zl0Var.getChildCount() > 0) {
            View view = null;
            int i10 = -1;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < zl0Var.getChildCount(); i12++) {
                View childAt = zl0Var.getChildAt(i12);
                int R = RecyclerView.R(childAt);
                if (R >= 0 && childAt.getTop() < i11) {
                    i11 = childAt.getTop();
                    view = childAt;
                    i10 = R;
                }
            }
            if (view != null) {
                this.U = i10;
                this.V = this.containerView.getTop() + view.getTop();
                smoothContainerViewLayout();
            }
        }
    }

    public final void I() {
        if (this.f25310r) {
            return;
        }
        this.W = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.H = currentActionBarHeight;
        this.G = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.I = AndroidUtilities.dp(16.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.N = new e6(this.containerView, 0L, 350L, tr.h);
        this.f25307e.f21262e.setPivotX(0.0f);
        this.d.setClipToPadding(true);
    }

    public boolean J() {
        return true;
    }

    public final void K() {
        if (this.attachedFragment != null) {
            LaunchActivity.G1.I(true, true, true);
            return;
        }
        ya yaVar = this.f25307e;
        if (yaVar != null && yaVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, z());
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f25309n;
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
    }

    public final void L() {
        ya yaVar = this.f25307e;
        if (yaVar != null) {
            yaVar.setTitle(y());
        }
    }

    public final void M() {
        ya yaVar = this.f25307e;
        if (yaVar != null && !TextUtils.equals(y(), yaVar.getTitle())) {
            yaVar.H(y(), false, 350L, tr.h);
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        ya yaVar = this.f25307e;
        if (yaVar != null && yaVar.getTag() != null) {
            return z();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f25309n;
        if (n2Var != null) {
            return n2Var.isLightStatusBar();
        }
        return z();
    }

    @Override
    public void onContainerViewTranslation() {
        D(this.T);
        u();
    }

    public final void s() {
        zl0 zl0Var = this.d;
        if (zl0Var != null && zl0Var.getLayoutManager() != null && this.U >= 0) {
            int top = (this.V - this.containerView.getTop()) - zl0Var.getPaddingTop();
            if (zl0Var.getLayoutManager() instanceof s4.c0) {
                ((s4.c0) zl0Var.getLayoutManager()).h1(this.U, top);
            }
            this.U = -1;
        }
    }

    public boolean t(View view, float f7, float f10) {
        return true;
    }

    public final void u() {
        if (this.backDrawable != null && this.containerView != null && this.shadowDrawable != null && J() && !this.f25310r) {
            Rect bounds = this.shadowDrawable.getBounds();
            if (this.containerView.getMeasuredWidth() >= this.container.getMeasuredWidth()) {
                this.backDrawable.a(((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY()));
            } else {
                this.backDrawable.a(0);
            }
        }
    }

    public abstract yl0 v(zl0 zl0Var);

    public zl0 w(Context context) {
        return new ai.w0(this, context, this.resourcesProvider, 10);
    }

    public int x() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence y();

    public final boolean z() {
        if (i0.a.f(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20894h5, this.resourcesProvider)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public cb(org.telegram.ui.ActionBar.n2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.d6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cb.<init>(org.telegram.ui.ActionBar.n2, boolean, boolean, org.telegram.ui.ActionBar.d6):void");
    }

    public cb(android.content.Context r2, org.telegram.ui.ActionBar.n2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.d6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cb.<init>(android.content.Context, org.telegram.ui.ActionBar.n2, boolean, boolean, org.telegram.ui.ActionBar.d6):void");
    }

    public cb(int r2, android.content.Context r3, org.telegram.ui.ActionBar.d6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cb.<init>(int, android.content.Context, org.telegram.ui.ActionBar.d6, boolean):void");
    }

    public void A(float f7) {
    }

    public void D(float f7) {
    }

    public void E(lw0 lw0Var) {
    }

    public cb(android.content.Context r2, org.telegram.ui.ActionBar.n2 r3, boolean r4, boolean r5, int r6, org.telegram.ui.ActionBar.d6 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cb.<init>(android.content.Context, org.telegram.ui.ActionBar.n2, boolean, boolean, int, org.telegram.ui.ActionBar.d6):void");
    }

    public cb(android.content.Context r3, org.telegram.ui.ActionBar.d6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cb.<init>(android.content.Context, org.telegram.ui.ActionBar.d6, boolean):void");
    }

    public void B(Canvas canvas, int i10) {
    }

    public void C(int i10, int i11) {
    }

    public cb(Context context, org.telegram.ui.ActionBar.n2 n2Var, bb bbVar) {
        super(bbVar.f24905b, context, bbVar.f24909g, bbVar.f24904a);
        wa waVar;
        this.v = 0.4f;
        this.f25312w = true;
        this.f25313x = 1.0f;
        this.f25314y = false;
        this.F = new RectF();
        this.W = 1;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = true;
        this.M = false;
        this.O = false;
        this.U = -1;
        boolean z10 = bbVar.f24906c;
        boolean z11 = bbVar.d;
        boolean z12 = bbVar.f24907e;
        int i10 = bbVar.f24908f;
        this.f25309n = n2Var;
        this.f25310r = z10;
        this.f25305b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            wa waVar2 = new wa(this, context, z12, z10);
            this.f25311s = waVar2;
            waVar = waVar2;
        } else {
            waVar = new xa(this, context, z12, z10);
        }
        zl0 w10 = w(context);
        this.d = w10;
        gg.b0 b0Var = new gg.b0(6);
        this.f25306c = b0Var;
        if (z12) {
            b0Var.l1(true);
        }
        w10.setLayoutManager(b0Var);
        wa waVar3 = this.f25311s;
        if (waVar3 != null) {
            waVar3.setBottomSheetContainerView(getContainer());
            this.f25311s.setTargetListView(w10);
        }
        if (z10) {
            w10.setHasFixedSize(true);
            w10.setAdapter(v(w10));
            setCustomView(waVar);
            waVar.addView(w10, w7.z5.c(-2.0f, -1));
        } else {
            w10.setAdapter(new ab(this, v(w10), context));
            this.containerView = waVar;
            ya yaVar = new ya(this, context, waVar);
            this.f25307e = yaVar;
            yaVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20894h5));
            yaVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.i6.G6));
            yaVar.A(getThemedColor(org.telegram.ui.ActionBar.i6.f21230z8), false);
            yaVar.setBackButtonImage(R.drawable.ic_ab_back);
            yaVar.B(getThemedColor(org.telegram.ui.ActionBar.i6.f21211y8), false);
            yaVar.setCastShadows(true);
            yaVar.setTitle(y());
            yaVar.setActionBarMenuOnItemClick(new org.telegram.ui.qo(this, 7));
            waVar.addView(w10);
            waVar.addView(yaVar, w7.z5.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            w10.j(new ai.r(waVar, 16));
        }
        if (i10 == 2) {
            I();
        }
        E(waVar);
        K();
    }
}
