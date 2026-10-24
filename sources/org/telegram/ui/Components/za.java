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
public abstract class za extends org.telegram.ui.ActionBar.h3 {
    public boolean E;
    public final RectF F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public d6 N;
    public boolean O;
    public boolean P;
    public ou Q;
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final Drawable f33209b;
    public final hg.a0 f33210c;
    public final lm0 d;
    public final va e;
    public boolean f33211f;
    public int h;
    public final org.telegram.ui.ActionBar.o2 f33212n;
    public final boolean f33213r;
    public final ta f33214s;
    public float v;
    public boolean f33215w;
    public float f33216x;
    public boolean f33217y;

    public za(org.telegram.ui.ActionBar.o2 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.<init>(org.telegram.ui.ActionBar.o2, boolean):void");
    }

    public static ViewGroup s(za zaVar) {
        return zaVar.containerView;
    }

    public final boolean A() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21255h5, this.resourcesProvider)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void G(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.G(android.graphics.Canvas, android.widget.FrameLayout):void");
    }

    public void I(Canvas canvas, View view) {
        int i10;
        float f7;
        ImageView imageView;
        Paint paint;
        float f10;
        int i11;
        this.S = false;
        if (!this.f33213r) {
            boolean z10 = this.P;
            boolean z11 = true;
            lm0 lm0Var = this.d;
            if (z10) {
                int height = lm0Var.getHeight();
                for (int i12 = 0; i12 < lm0Var.getChildCount(); i12++) {
                    View childAt = lm0Var.getChildAt(i12);
                    int R = RecyclerView.R(childAt);
                    if (R != -1 && R != lm0Var.getAdapter().h() - 1) {
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
                s4.b1 K = lm0Var.K(0);
                int i13 = -AndroidUtilities.dp(16.0f);
                if (K != null) {
                    View view2 = K.f46342a;
                    i13 = view2.getBottom() - AndroidUtilities.dp(16.0f);
                    if (this.O) {
                        i10 = ((int) view2.getTranslationY()) + i13;
                    }
                }
                i10 = i13;
            }
            int i14 = (i10 - ((this.H + this.I) + this.J)) + this.K;
            if (this.f33217y && this.E) {
                if (this.W == 2) {
                    f10 = 8.0f;
                } else {
                    f10 = 16.0f;
                }
                i14 -= AndroidUtilities.dp(f10);
            }
            float f11 = i14;
            this.T = f11;
            E(f11);
            int i15 = this.W;
            float f12 = 1.0f;
            va vaVar = this.e;
            if (i15 == 1) {
                float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i14) / y());
                if (dp < 0.0f) {
                    dp = 0.0f;
                }
                if (dp == 0.0f) {
                    z11 = false;
                }
                AndroidUtilities.updateViewVisibilityAnimated(vaVar, z11, 1.0f, this.f33211f);
            } else if (i15 == 2) {
                float max = Math.max(((AndroidUtilities.dp(8.0f) + (i14 - this.K)) + this.I) - AndroidUtilities.statusBarHeight, 0.0f);
                d6 d6Var = this.N;
                if (max == 0.0f) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = d6Var.d(f7, false);
                if (d != 0.0f && d != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                    this.S = true;
                }
                this.f33216x = d;
                f12 = AndroidUtilities.lerp(1.0f, 0.5f, d);
                vaVar.e.setAlpha(d);
                B(d);
                vaVar.e.setScaleX(d);
                vaVar.e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                vaVar.e.setScaleY(d);
                org.telegram.ui.ActionBar.n5 titleTextView = vaVar.getTitleTextView();
                titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
                if (this.R) {
                    titleTextView.setTranslationX(((vaVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                vaVar.setTranslationY(max);
                i14 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.G - this.H) - this.I) - this.J), d);
                vaVar.getBackground().setBounds(0, AndroidUtilities.lerp(vaVar.getHeight(), 0, d), vaVar.getWidth(), vaVar.getHeight());
                if (d > 0.5f) {
                    if (this.M) {
                        this.M = false;
                        vaVar.setTag(1);
                    }
                } else if (!this.M) {
                    this.M = true;
                    vaVar.setTag(null);
                }
            }
            if (L()) {
                if (!(this instanceof ug.y)) {
                    this.shadowDrawable.setBounds(0, i14, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), i14, AndroidUtilities.dp(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                v();
                this.shadowDrawable.draw(canvas);
                if (this.f33217y && f12 > 0.0f) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    int dp3 = AndroidUtilities.dp(20.0f) + i14;
                    RectF rectF = this.F;
                    rectF.set((view.getMeasuredWidth() - dp2) / 2.0f, dp3, (view.getMeasuredWidth() + dp2) / 2.0f, AndroidUtilities.dp(4.0f) + dp3);
                    org.telegram.ui.ActionBar.k6.f21474t0.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ii));
                    org.telegram.ui.ActionBar.k6.f21474t0.setAlpha((int) (paint.getAlpha() * f12));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.f21474t0);
                }
            }
            C(canvas, i14);
        }
    }

    public final void J() {
        lm0 lm0Var = this.d;
        if (lm0Var != null && this.f33210c != null && lm0Var.getChildCount() > 0) {
            View view = null;
            int i10 = -1;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < lm0Var.getChildCount(); i12++) {
                View childAt = lm0Var.getChildAt(i12);
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

    public final void K() {
        if (this.f33213r) {
            return;
        }
        this.W = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.H = currentActionBarHeight;
        this.G = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.I = AndroidUtilities.dp(16.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.N = new d6(this.containerView, 0L, 350L, zr.h);
        this.e.e.setPivotX(0.0f);
        this.d.setClipToPadding(true);
    }

    public boolean L() {
        return true;
    }

    public final void M() {
        if (this.attachedFragment != null) {
            LaunchActivity.I1.H(true, true, true);
            return;
        }
        va vaVar = this.e;
        if (vaVar != null && vaVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, A());
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f33212n;
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
    }

    public final void N() {
        va vaVar = this.e;
        if (vaVar != null) {
            vaVar.setTitle(z());
        }
    }

    public final void O() {
        va vaVar = this.e;
        if (vaVar != null && !TextUtils.equals(z(), vaVar.getTitle())) {
            vaVar.I(z(), false, 350L, zr.h);
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        va vaVar = this.e;
        if (vaVar != null && vaVar.getTag() != null) {
            return A();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f33212n;
        if (o2Var != null) {
            return o2Var.isLightStatusBar();
        }
        return A();
    }

    @Override
    public void onContainerViewTranslation() {
        E(this.T);
        v();
    }

    public final void t() {
        lm0 lm0Var = this.d;
        if (lm0Var != null && lm0Var.getLayoutManager() != null && this.U >= 0) {
            int top = (this.V - this.containerView.getTop()) - lm0Var.getPaddingTop();
            if (lm0Var.getLayoutManager() instanceof s4.b0) {
                ((s4.b0) lm0Var.getLayoutManager()).h1(this.U, top);
            }
            this.U = -1;
        }
    }

    public boolean u(View view, float f7, float f10) {
        return true;
    }

    public final void v() {
        if (this.backDrawable != null && this.containerView != null && this.shadowDrawable != null && L() && !this.f33213r) {
            Rect bounds = this.shadowDrawable.getBounds();
            if (this.containerView.getMeasuredWidth() >= this.container.getMeasuredWidth()) {
                this.backDrawable.a(((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY()));
            } else {
                this.backDrawable.a(0);
            }
        }
    }

    public abstract km0 w(lm0 lm0Var);

    public lm0 x(Context context) {
        return new ai.u1(this, context, this.resourcesProvider, 11);
    }

    public int y() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence z();

    public za(org.telegram.ui.ActionBar.o2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.g6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.<init>(org.telegram.ui.ActionBar.o2, boolean, boolean, org.telegram.ui.ActionBar.g6):void");
    }

    public za(android.content.Context r2, org.telegram.ui.ActionBar.o2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.g6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.<init>(android.content.Context, org.telegram.ui.ActionBar.o2, boolean, boolean, org.telegram.ui.ActionBar.g6):void");
    }

    public za(int r2, android.content.Context r3, org.telegram.ui.ActionBar.g6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.<init>(int, android.content.Context, org.telegram.ui.ActionBar.g6, boolean):void");
    }

    public void B(float f7) {
    }

    public void E(float f7) {
    }

    public void F(nw0 nw0Var) {
    }

    public za(android.content.Context r2, org.telegram.ui.ActionBar.o2 r3, boolean r4, boolean r5, int r6, org.telegram.ui.ActionBar.g6 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.<init>(android.content.Context, org.telegram.ui.ActionBar.o2, boolean, boolean, int, org.telegram.ui.ActionBar.g6):void");
    }

    public za(android.content.Context r3, org.telegram.ui.ActionBar.g6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.<init>(android.content.Context, org.telegram.ui.ActionBar.g6, boolean):void");
    }

    public void C(Canvas canvas, int i10) {
    }

    public void D(int i10, int i11) {
    }

    public za(Context context, org.telegram.ui.ActionBar.o2 o2Var, ya yaVar) {
        super(yaVar.f32868b, context, yaVar.f32871g, yaVar.f32867a);
        ta taVar;
        this.v = 0.4f;
        this.f33215w = true;
        this.f33216x = 1.0f;
        this.f33217y = false;
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
        boolean z10 = yaVar.f32869c;
        boolean z11 = yaVar.d;
        boolean z12 = yaVar.e;
        int i10 = yaVar.f32870f;
        this.f33212n = o2Var;
        this.f33213r = z10;
        this.f33209b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            ta taVar2 = new ta(this, context, z12, z10);
            this.f33214s = taVar2;
            taVar = taVar2;
        } else {
            taVar = new ua(this, context, z12, z10);
        }
        lm0 x10 = x(context);
        this.d = x10;
        hg.a0 a0Var = new hg.a0(6);
        this.f33210c = a0Var;
        if (z12) {
            a0Var.l1(true);
        }
        x10.setLayoutManager(a0Var);
        ta taVar3 = this.f33214s;
        if (taVar3 != null) {
            taVar3.setBottomSheetContainerView(getContainer());
            this.f33214s.setTargetListView(x10);
        }
        if (z10) {
            x10.setHasFixedSize(true);
            x10.setAdapter(w(x10));
            setCustomView(taVar);
            taVar.addView(x10, w7.z5.c(-2.0f, -1));
        } else {
            x10.setAdapter(new xa(this, w(x10), context));
            this.containerView = taVar;
            va vaVar = new va(this, context, taVar);
            this.e = vaVar;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21255h5, vaVar, this.resourcesProvider);
            org.telegram.ui.ActionBar.r6.m(vaVar, 5, org.telegram.ui.ActionBar.k6.G6, this.resourcesProvider);
            org.telegram.ui.ActionBar.r6.m(vaVar, 3, org.telegram.ui.ActionBar.k6.f21591z8, this.resourcesProvider);
            vaVar.setBackButtonImage(R.drawable.ic_ab_back);
            org.telegram.ui.ActionBar.r6.m(vaVar, 1, org.telegram.ui.ActionBar.k6.f21574y8, this.resourcesProvider);
            vaVar.setCastShadows(true);
            vaVar.setTitle(z());
            vaVar.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 10));
            taVar.addView(x10);
            taVar.addView(vaVar, w7.z5.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            x10.j(new ah.d0(taVar, 20));
        }
        if (i10 == 2) {
            K();
        }
        F(taVar);
        M();
    }
}
