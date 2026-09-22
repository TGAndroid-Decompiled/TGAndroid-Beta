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
public abstract class za extends org.telegram.ui.ActionBar.f3 {
    public boolean E;
    public final RectF F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public c6 N;
    public boolean O;
    public boolean P;
    public ju Q;
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final Drawable f30522b;
    public final gg.b0 f30523c;
    public final ll0 d;
    public final va e;
    public boolean f30524f;
    public int h;
    public final org.telegram.ui.ActionBar.n2 f30525n;
    public final boolean f30526r;
    public final ta f30527s;
    public float v;
    public boolean f30528w;
    public float f30529x;
    public boolean f30530y;

    public za(org.telegram.ui.ActionBar.n2 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.<init>(org.telegram.ui.ActionBar.n2, boolean):void");
    }

    public static ViewGroup r(za zaVar) {
        return zaVar.containerView;
    }

    public final void H(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.H(android.graphics.Canvas, android.widget.FrameLayout):void");
    }

    public void I(Canvas canvas, View view) {
        int i10;
        float f7;
        ImageView imageView;
        Paint paint;
        float f10;
        int i11;
        this.S = false;
        if (!this.f30526r) {
            boolean z10 = this.P;
            boolean z11 = true;
            ll0 ll0Var = this.d;
            if (z10) {
                int height = ll0Var.getHeight();
                for (int i12 = 0; i12 < ll0Var.getChildCount(); i12++) {
                    View childAt = ll0Var.getChildAt(i12);
                    int R = RecyclerView.R(childAt);
                    if (R != -1 && R != ll0Var.getAdapter().h() - 1) {
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
                s4.c1 K = ll0Var.K(0);
                int i13 = -AndroidUtilities.dp(16.0f);
                if (K != null) {
                    View view2 = K.f42671a;
                    i13 = view2.getBottom() - AndroidUtilities.dp(16.0f);
                    if (this.O) {
                        i10 = ((int) view2.getTranslationY()) + i13;
                    }
                }
                i10 = i13;
            }
            int i14 = (i10 - ((this.H + this.I) + this.J)) + this.K;
            if (this.f30530y && this.E) {
                if (this.W == 2) {
                    f10 = 8.0f;
                } else {
                    f10 = 16.0f;
                }
                i14 -= AndroidUtilities.dp(f10);
            }
            float f11 = i14;
            this.T = f11;
            F(f11);
            int i15 = this.W;
            float f12 = 1.0f;
            va vaVar = this.e;
            if (i15 == 1) {
                float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i14) / x());
                if (dp < 0.0f) {
                    dp = 0.0f;
                }
                if (dp == 0.0f) {
                    z11 = false;
                }
                AndroidUtilities.updateViewVisibilityAnimated(vaVar, z11, 1.0f, this.f30524f);
            } else if (i15 == 2) {
                float max = Math.max(((AndroidUtilities.dp(8.0f) + (i14 - this.K)) + this.I) - AndroidUtilities.statusBarHeight, 0.0f);
                c6 c6Var = this.N;
                if (max == 0.0f) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = c6Var.d(f7, false);
                if (d != 0.0f && d != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                    this.S = true;
                }
                this.f30529x = d;
                f12 = AndroidUtilities.lerp(1.0f, 0.5f, d);
                vaVar.e.setAlpha(d);
                A(d);
                vaVar.e.setScaleX(d);
                vaVar.e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                vaVar.e.setScaleY(d);
                org.telegram.ui.ActionBar.j5 titleTextView = vaVar.getTitleTextView();
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
                if (!(this instanceof tg.b0)) {
                    this.shadowDrawable.setBounds(0, i14, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), i14, AndroidUtilities.dp(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                u();
                this.shadowDrawable.draw(canvas);
                if (this.f30530y && f12 > 0.0f) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    int dp3 = AndroidUtilities.dp(20.0f) + i14;
                    RectF rectF = this.F;
                    rectF.set((view.getMeasuredWidth() - dp2) / 2.0f, dp3, (view.getMeasuredWidth() + dp2) / 2.0f, AndroidUtilities.dp(4.0f) + dp3);
                    org.telegram.ui.ActionBar.i6.f19121t0.setColor(getThemedColor(org.telegram.ui.ActionBar.i6.Ii));
                    org.telegram.ui.ActionBar.i6.f19121t0.setAlpha((int) (paint.getAlpha() * f12));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.f19121t0);
                }
            }
            B(canvas, i14);
        }
    }

    public final void J() {
        ll0 ll0Var = this.d;
        if (ll0Var != null && this.f30523c != null && ll0Var.getChildCount() > 0) {
            View view = null;
            int i10 = -1;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < ll0Var.getChildCount(); i12++) {
                View childAt = ll0Var.getChildAt(i12);
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
        if (this.f30526r) {
            return;
        }
        this.W = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.H = currentActionBarHeight;
        this.G = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.I = AndroidUtilities.dp(16.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.N = new c6(this.containerView, 0L, 350L, qr.h);
        this.e.e.setPivotX(0.0f);
        this.d.setClipToPadding(true);
    }

    public boolean L() {
        return true;
    }

    public final void M() {
        if (this.attachedFragment != null) {
            LaunchActivity.G1.H(true, true, true);
            return;
        }
        va vaVar = this.e;
        if (vaVar != null && vaVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, z());
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f30525n;
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
    }

    public final void N() {
        va vaVar = this.e;
        if (vaVar != null) {
            vaVar.setTitle(y());
        }
    }

    public final void O() {
        va vaVar = this.e;
        if (vaVar != null && !TextUtils.equals(y(), vaVar.getTitle())) {
            vaVar.J(y(), false, 350L, qr.h);
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
            return z();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f30525n;
        if (n2Var != null) {
            return n2Var.isLightStatusBar();
        }
        return z();
    }

    @Override
    public void onContainerViewTranslation() {
        F(this.T);
        u();
    }

    public final void s() {
        ll0 ll0Var = this.d;
        if (ll0Var != null && ll0Var.getLayoutManager() != null && this.U >= 0) {
            int top = (this.V - this.containerView.getTop()) - ll0Var.getPaddingTop();
            if (ll0Var.getLayoutManager() instanceof s4.c0) {
                ((s4.c0) ll0Var.getLayoutManager()).h1(this.U, top);
            }
            this.U = -1;
        }
    }

    public boolean t(View view, float f7, float f10) {
        return true;
    }

    public final void u() {
        if (this.backDrawable != null && this.containerView != null && this.shadowDrawable != null && L() && !this.f30526r) {
            Rect bounds = this.shadowDrawable.getBounds();
            if (this.containerView.getMeasuredWidth() >= this.container.getMeasuredWidth()) {
                this.backDrawable.a(((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY()));
            } else {
                this.backDrawable.a(0);
            }
        }
    }

    public abstract kl0 v(ll0 ll0Var);

    public ll0 w(Context context) {
        return new ai.w0(this, context, this.resourcesProvider, 10);
    }

    public int x() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence y();

    public final boolean z() {
        if (i0.a.f(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18904h5, this.resourcesProvider)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public za(org.telegram.ui.ActionBar.n2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.e6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.<init>(org.telegram.ui.ActionBar.n2, boolean, boolean, org.telegram.ui.ActionBar.e6):void");
    }

    public za(android.content.Context r2, org.telegram.ui.ActionBar.n2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.e6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.<init>(android.content.Context, org.telegram.ui.ActionBar.n2, boolean, boolean, org.telegram.ui.ActionBar.e6):void");
    }

    public za(int r2, android.content.Context r3, org.telegram.ui.ActionBar.e6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.<init>(int, android.content.Context, org.telegram.ui.ActionBar.e6, boolean):void");
    }

    public void A(float f7) {
    }

    public void F(float f7) {
    }

    public void G(pv0 pv0Var) {
    }

    public za(android.content.Context r2, org.telegram.ui.ActionBar.n2 r3, boolean r4, boolean r5, int r6, org.telegram.ui.ActionBar.e6 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.<init>(android.content.Context, org.telegram.ui.ActionBar.n2, boolean, boolean, int, org.telegram.ui.ActionBar.e6):void");
    }

    public za(android.content.Context r3, org.telegram.ui.ActionBar.e6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.za.<init>(android.content.Context, org.telegram.ui.ActionBar.e6, boolean):void");
    }

    public void B(Canvas canvas, int i10) {
    }

    public void E(int i10, int i11) {
    }

    public za(Context context, org.telegram.ui.ActionBar.n2 n2Var, ya yaVar) {
        super(yaVar.f30196b, context, yaVar.f30199g, yaVar.f30195a);
        ta taVar;
        this.v = 0.4f;
        this.f30528w = true;
        this.f30529x = 1.0f;
        this.f30530y = false;
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
        boolean z10 = yaVar.f30197c;
        boolean z11 = yaVar.d;
        boolean z12 = yaVar.e;
        int i10 = yaVar.f30198f;
        this.f30525n = n2Var;
        this.f30526r = z10;
        this.f30522b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            ta taVar2 = new ta(this, context, z12, z10);
            this.f30527s = taVar2;
            taVar = taVar2;
        } else {
            taVar = new ua(this, context, z12, z10);
        }
        ll0 w10 = w(context);
        this.d = w10;
        gg.b0 b0Var = new gg.b0(6);
        this.f30523c = b0Var;
        if (z12) {
            b0Var.l1(true);
        }
        w10.setLayoutManager(b0Var);
        ta taVar3 = this.f30527s;
        if (taVar3 != null) {
            taVar3.setBottomSheetContainerView(getContainer());
            this.f30527s.setTargetListView(w10);
        }
        if (z10) {
            w10.setHasFixedSize(true);
            w10.setAdapter(v(w10));
            setCustomView(taVar);
            taVar.addView(w10, w7.x5.c(-2.0f, -1));
        } else {
            w10.setAdapter(new xa(this, v(w10), context));
            this.containerView = taVar;
            va vaVar = new va(this, context, taVar);
            this.e = vaVar;
            vaVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.i6.f18904h5));
            vaVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.i6.G6));
            vaVar.A(getThemedColor(org.telegram.ui.ActionBar.i6.f19236z8), false);
            vaVar.setBackButtonImage(R.drawable.ic_ab_back);
            vaVar.B(getThemedColor(org.telegram.ui.ActionBar.i6.f19217y8), false);
            vaVar.setCastShadows(true);
            vaVar.setTitle(y());
            vaVar.setActionBarMenuOnItemClick(new org.telegram.ui.to(this, 7));
            taVar.addView(w10);
            taVar.addView(vaVar, w7.x5.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            w10.j(new ai.r(taVar, 16));
        }
        if (i10 == 2) {
            K();
        }
        G(taVar);
        M();
    }
}
