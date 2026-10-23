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
public abstract class bb extends org.telegram.ui.ActionBar.h3 {
    public boolean E;
    public final RectF F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public f6 N;
    public boolean O;
    public boolean P;
    public qu Q;
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final Drawable f25026b;
    public final hg.a0 f25027c;
    public final mm0 d;
    public final xa e;
    public boolean f25028f;
    public int h;
    public final org.telegram.ui.ActionBar.o2 f25029n;
    public final boolean f25030r;
    public final va f25031s;
    public float v;
    public boolean f25032w;
    public float f25033x;
    public boolean f25034y;

    public bb(org.telegram.ui.ActionBar.o2 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bb.<init>(org.telegram.ui.ActionBar.o2, boolean):void");
    }

    public static ViewGroup s(bb bbVar) {
        return bbVar.containerView;
    }

    public final boolean A() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21254h5, this.resourcesProvider)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void G(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bb.G(android.graphics.Canvas, android.widget.FrameLayout):void");
    }

    public void I(Canvas canvas, View view) {
        int i10;
        float f7;
        ImageView imageView;
        Paint paint;
        float f10;
        int i11;
        this.S = false;
        if (!this.f25030r) {
            boolean z10 = this.P;
            boolean z11 = true;
            mm0 mm0Var = this.d;
            if (z10) {
                int height = mm0Var.getHeight();
                for (int i12 = 0; i12 < mm0Var.getChildCount(); i12++) {
                    View childAt = mm0Var.getChildAt(i12);
                    int R = RecyclerView.R(childAt);
                    if (R != -1 && R != mm0Var.getAdapter().h() - 1) {
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
                s4.b1 K = mm0Var.K(0);
                int i13 = -AndroidUtilities.dp(16.0f);
                if (K != null) {
                    View view2 = K.f46343a;
                    i13 = view2.getBottom() - AndroidUtilities.dp(16.0f);
                    if (this.O) {
                        i10 = ((int) view2.getTranslationY()) + i13;
                    }
                }
                i10 = i13;
            }
            int i14 = (i10 - ((this.H + this.I) + this.J)) + this.K;
            if (this.f25034y && this.E) {
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
            xa xaVar = this.e;
            if (i15 == 1) {
                float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i14) / y());
                if (dp < 0.0f) {
                    dp = 0.0f;
                }
                if (dp == 0.0f) {
                    z11 = false;
                }
                AndroidUtilities.updateViewVisibilityAnimated(xaVar, z11, 1.0f, this.f25028f);
            } else if (i15 == 2) {
                float max = Math.max(((AndroidUtilities.dp(8.0f) + (i14 - this.K)) + this.I) - AndroidUtilities.statusBarHeight, 0.0f);
                f6 f6Var = this.N;
                if (max == 0.0f) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = f6Var.d(f7, false);
                if (d != 0.0f && d != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                    this.S = true;
                }
                this.f25033x = d;
                f12 = AndroidUtilities.lerp(1.0f, 0.5f, d);
                xaVar.e.setAlpha(d);
                B(d);
                xaVar.e.setScaleX(d);
                xaVar.e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                xaVar.e.setScaleY(d);
                org.telegram.ui.ActionBar.n5 titleTextView = xaVar.getTitleTextView();
                titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
                if (this.R) {
                    titleTextView.setTranslationX(((xaVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                xaVar.setTranslationY(max);
                i14 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.G - this.H) - this.I) - this.J), d);
                xaVar.getBackground().setBounds(0, AndroidUtilities.lerp(xaVar.getHeight(), 0, d), xaVar.getWidth(), xaVar.getHeight());
                if (d > 0.5f) {
                    if (this.M) {
                        this.M = false;
                        xaVar.setTag(1);
                    }
                } else if (!this.M) {
                    this.M = true;
                    xaVar.setTag(null);
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
                if (this.f25034y && f12 > 0.0f) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    int dp3 = AndroidUtilities.dp(20.0f) + i14;
                    RectF rectF = this.F;
                    rectF.set((view.getMeasuredWidth() - dp2) / 2.0f, dp3, (view.getMeasuredWidth() + dp2) / 2.0f, AndroidUtilities.dp(4.0f) + dp3);
                    org.telegram.ui.ActionBar.k6.f21473t0.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ii));
                    org.telegram.ui.ActionBar.k6.f21473t0.setAlpha((int) (paint.getAlpha() * f12));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.f21473t0);
                }
            }
            C(canvas, i14);
        }
    }

    public final void J() {
        mm0 mm0Var = this.d;
        if (mm0Var != null && this.f25027c != null && mm0Var.getChildCount() > 0) {
            View view = null;
            int i10 = -1;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < mm0Var.getChildCount(); i12++) {
                View childAt = mm0Var.getChildAt(i12);
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
        if (this.f25030r) {
            return;
        }
        this.W = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.H = currentActionBarHeight;
        this.G = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.I = AndroidUtilities.dp(16.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.N = new f6(this.containerView, 0L, 350L, bs.h);
        this.e.e.setPivotX(0.0f);
        this.d.setClipToPadding(true);
    }

    public boolean L() {
        return true;
    }

    public final void M() {
        if (this.attachedFragment != null) {
            LaunchActivity.J1.H(true, true, true);
            return;
        }
        xa xaVar = this.e;
        if (xaVar != null && xaVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, A());
            return;
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f25029n;
        if (o2Var != null) {
            AndroidUtilities.setLightStatusBar(this, o2Var.isLightStatusBar());
        }
    }

    public final void N() {
        xa xaVar = this.e;
        if (xaVar != null) {
            xaVar.setTitle(z());
        }
    }

    public final void O() {
        xa xaVar = this.e;
        if (xaVar != null && !TextUtils.equals(z(), xaVar.getTitle())) {
            xaVar.I(z(), false, 350L, bs.h);
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        xa xaVar = this.e;
        if (xaVar != null && xaVar.getTag() != null) {
            return A();
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.f25029n;
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
        mm0 mm0Var = this.d;
        if (mm0Var != null && mm0Var.getLayoutManager() != null && this.U >= 0) {
            int top = (this.V - this.containerView.getTop()) - mm0Var.getPaddingTop();
            if (mm0Var.getLayoutManager() instanceof s4.b0) {
                ((s4.b0) mm0Var.getLayoutManager()).h1(this.U, top);
            }
            this.U = -1;
        }
    }

    public boolean u(View view, float f7, float f10) {
        return true;
    }

    public final void v() {
        if (this.backDrawable != null && this.containerView != null && this.shadowDrawable != null && L() && !this.f25030r) {
            Rect bounds = this.shadowDrawable.getBounds();
            if (this.containerView.getMeasuredWidth() >= this.container.getMeasuredWidth()) {
                this.backDrawable.a(((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY()));
            } else {
                this.backDrawable.a(0);
            }
        }
    }

    public abstract lm0 w(mm0 mm0Var);

    public mm0 x(Context context) {
        return new ai.u1(this, context, this.resourcesProvider, 11);
    }

    public int y() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence z();

    public bb(org.telegram.ui.ActionBar.o2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.g6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bb.<init>(org.telegram.ui.ActionBar.o2, boolean, boolean, org.telegram.ui.ActionBar.g6):void");
    }

    public bb(android.content.Context r2, org.telegram.ui.ActionBar.o2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.g6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bb.<init>(android.content.Context, org.telegram.ui.ActionBar.o2, boolean, boolean, org.telegram.ui.ActionBar.g6):void");
    }

    public bb(int r2, android.content.Context r3, org.telegram.ui.ActionBar.g6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bb.<init>(int, android.content.Context, org.telegram.ui.ActionBar.g6, boolean):void");
    }

    public void B(float f7) {
    }

    public void E(float f7) {
    }

    public void F(ow0 ow0Var) {
    }

    public bb(android.content.Context r2, org.telegram.ui.ActionBar.o2 r3, boolean r4, boolean r5, int r6, org.telegram.ui.ActionBar.g6 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bb.<init>(android.content.Context, org.telegram.ui.ActionBar.o2, boolean, boolean, int, org.telegram.ui.ActionBar.g6):void");
    }

    public bb(android.content.Context r3, org.telegram.ui.ActionBar.g6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bb.<init>(android.content.Context, org.telegram.ui.ActionBar.g6, boolean):void");
    }

    public void C(Canvas canvas, int i10) {
    }

    public void D(int i10, int i11) {
    }

    public bb(Context context, org.telegram.ui.ActionBar.o2 o2Var, ab abVar) {
        super(abVar.f24679b, context, abVar.f24682g, abVar.f24678a);
        va vaVar;
        this.v = 0.4f;
        this.f25032w = true;
        this.f25033x = 1.0f;
        this.f25034y = false;
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
        boolean z10 = abVar.f24680c;
        boolean z11 = abVar.d;
        boolean z12 = abVar.e;
        int i10 = abVar.f24681f;
        this.f25029n = o2Var;
        this.f25030r = z10;
        this.f25026b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            va vaVar2 = new va(this, context, z12, z10);
            this.f25031s = vaVar2;
            vaVar = vaVar2;
        } else {
            vaVar = new wa(this, context, z12, z10);
        }
        mm0 x10 = x(context);
        this.d = x10;
        hg.a0 a0Var = new hg.a0(6);
        this.f25027c = a0Var;
        if (z12) {
            a0Var.l1(true);
        }
        x10.setLayoutManager(a0Var);
        va vaVar3 = this.f25031s;
        if (vaVar3 != null) {
            vaVar3.setBottomSheetContainerView(getContainer());
            this.f25031s.setTargetListView(x10);
        }
        if (z10) {
            x10.setHasFixedSize(true);
            x10.setAdapter(w(x10));
            setCustomView(vaVar);
            vaVar.addView(x10, w7.z5.c(-2.0f, -1));
        } else {
            x10.setAdapter(new za(this, w(x10), context));
            this.containerView = vaVar;
            xa xaVar = new xa(this, context, vaVar);
            this.e = xaVar;
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21254h5, xaVar, this.resourcesProvider);
            org.telegram.ui.ActionBar.r6.m(xaVar, 5, org.telegram.ui.ActionBar.k6.G6, this.resourcesProvider);
            org.telegram.ui.ActionBar.r6.m(xaVar, 3, org.telegram.ui.ActionBar.k6.f21590z8, this.resourcesProvider);
            xaVar.setBackButtonImage(R.drawable.ic_ab_back);
            org.telegram.ui.ActionBar.r6.m(xaVar, 1, org.telegram.ui.ActionBar.k6.f21573y8, this.resourcesProvider);
            xaVar.setCastShadows(true);
            xaVar.setTitle(z());
            xaVar.setActionBarMenuOnItemClick(new org.telegram.ui.ea(this, 10));
            vaVar.addView(x10);
            vaVar.addView(xaVar, w7.z5.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            x10.j(new ah.d0(vaVar, 20));
        }
        if (i10 == 2) {
            K();
        }
        F(vaVar);
        M();
    }
}
