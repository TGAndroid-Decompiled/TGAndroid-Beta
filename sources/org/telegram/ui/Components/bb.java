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
public abstract class bb extends org.telegram.ui.ActionBar.e3 {
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
    public ku Q;
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final Drawable f22955b;
    public final gg.b0 f22956c;
    public final wl0 d;
    public final xa e;
    public boolean f22957f;
    public int h;
    public final org.telegram.ui.ActionBar.m2 f22958n;
    public final boolean f22959r;
    public final va f22960s;
    public float v;
    public boolean f22961w;
    public float f22962x;
    public boolean f22963y;

    public bb(org.telegram.ui.ActionBar.m2 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bb.<init>(org.telegram.ui.ActionBar.m2, boolean):void");
    }

    public static ViewGroup r(bb bbVar) {
        return bbVar.containerView;
    }

    public final void H(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bb.H(android.graphics.Canvas, android.widget.FrameLayout):void");
    }

    public void I(Canvas canvas, View view) {
        int i10;
        float f7;
        ImageView imageView;
        Paint paint;
        float f10;
        int i11;
        this.S = false;
        if (!this.f22959r) {
            boolean z10 = this.P;
            boolean z11 = true;
            wl0 wl0Var = this.d;
            if (z10) {
                int height = wl0Var.getHeight();
                for (int i12 = 0; i12 < wl0Var.getChildCount(); i12++) {
                    View childAt = wl0Var.getChildAt(i12);
                    int R = RecyclerView.R(childAt);
                    if (R != -1 && R != wl0Var.getAdapter().h() - 1) {
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
                s4.c1 K = wl0Var.K(0);
                int i13 = -AndroidUtilities.dp(16.0f);
                if (K != null) {
                    View view2 = K.f42961a;
                    i13 = view2.getBottom() - AndroidUtilities.dp(16.0f);
                    if (this.O) {
                        i10 = ((int) view2.getTranslationY()) + i13;
                    }
                }
                i10 = i13;
            }
            int i14 = (i10 - ((this.H + this.I) + this.J)) + this.K;
            if (this.f22963y && this.E) {
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
            xa xaVar = this.e;
            if (i15 == 1) {
                float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i14) / x());
                if (dp < 0.0f) {
                    dp = 0.0f;
                }
                if (dp == 0.0f) {
                    z11 = false;
                }
                AndroidUtilities.updateViewVisibilityAnimated(xaVar, z11, 1.0f, this.f22957f);
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
                this.f22962x = d;
                f12 = AndroidUtilities.lerp(1.0f, 0.5f, d);
                xaVar.e.setAlpha(d);
                A(d);
                xaVar.e.setScaleX(d);
                xaVar.e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                xaVar.e.setScaleY(d);
                org.telegram.ui.ActionBar.h5 titleTextView = xaVar.getTitleTextView();
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
                if (!(this instanceof tg.a0)) {
                    this.shadowDrawable.setBounds(0, i14, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), i14, AndroidUtilities.dp(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                u();
                this.shadowDrawable.draw(canvas);
                if (this.f22963y && f12 > 0.0f) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    int dp3 = AndroidUtilities.dp(20.0f) + i14;
                    RectF rectF = this.F;
                    rectF.set((view.getMeasuredWidth() - dp2) / 2.0f, dp3, (view.getMeasuredWidth() + dp2) / 2.0f, AndroidUtilities.dp(4.0f) + dp3);
                    org.telegram.ui.ActionBar.h6.f19349t0.setColor(getThemedColor(org.telegram.ui.ActionBar.h6.Ii));
                    org.telegram.ui.ActionBar.h6.f19349t0.setAlpha((int) (paint.getAlpha() * f12));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f19349t0);
                }
            }
            B(canvas, i14);
        }
    }

    public final void J() {
        wl0 wl0Var = this.d;
        if (wl0Var != null && this.f22956c != null && wl0Var.getChildCount() > 0) {
            View view = null;
            int i10 = -1;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < wl0Var.getChildCount(); i12++) {
                View childAt = wl0Var.getChildAt(i12);
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
        if (this.f22959r) {
            return;
        }
        this.W = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.H = currentActionBarHeight;
        this.G = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.I = AndroidUtilities.dp(16.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.N = new e6(this.containerView, 0L, 350L, rr.h);
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
        xa xaVar = this.e;
        if (xaVar != null && xaVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, z());
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f22958n;
        if (m2Var != null) {
            AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        }
    }

    public final void N() {
        xa xaVar = this.e;
        if (xaVar != null) {
            xaVar.setTitle(y());
        }
    }

    public final void O() {
        xa xaVar = this.e;
        if (xaVar != null && !TextUtils.equals(y(), xaVar.getTitle())) {
            xaVar.J(y(), false, 350L, rr.h);
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
            return z();
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f22958n;
        if (m2Var != null) {
            return m2Var.isLightStatusBar();
        }
        return z();
    }

    @Override
    public void onContainerViewTranslation() {
        F(this.T);
        u();
    }

    public final void s() {
        wl0 wl0Var = this.d;
        if (wl0Var != null && wl0Var.getLayoutManager() != null && this.U >= 0) {
            int top = (this.V - this.containerView.getTop()) - wl0Var.getPaddingTop();
            if (wl0Var.getLayoutManager() instanceof s4.c0) {
                ((s4.c0) wl0Var.getLayoutManager()).h1(this.U, top);
            }
            this.U = -1;
        }
    }

    public boolean t(View view, float f7, float f10) {
        return true;
    }

    public final void u() {
        if (this.backDrawable != null && this.containerView != null && this.shadowDrawable != null && L() && !this.f22959r) {
            Rect bounds = this.shadowDrawable.getBounds();
            if (this.containerView.getMeasuredWidth() >= this.container.getMeasuredWidth()) {
                this.backDrawable.a(((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY()));
            } else {
                this.backDrawable.a(0);
            }
        }
    }

    public abstract vl0 v(wl0 wl0Var);

    public wl0 w(Context context) {
        return new ai.w0(this, context, this.resourcesProvider, 10);
    }

    public int x() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence y();

    public final boolean z() {
        if (i0.a.f(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19130h5, this.resourcesProvider)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public bb(org.telegram.ui.ActionBar.m2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.d6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bb.<init>(org.telegram.ui.ActionBar.m2, boolean, boolean, org.telegram.ui.ActionBar.d6):void");
    }

    public bb(android.content.Context r2, org.telegram.ui.ActionBar.m2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.d6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bb.<init>(android.content.Context, org.telegram.ui.ActionBar.m2, boolean, boolean, org.telegram.ui.ActionBar.d6):void");
    }

    public bb(int r2, android.content.Context r3, org.telegram.ui.ActionBar.d6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bb.<init>(int, android.content.Context, org.telegram.ui.ActionBar.d6, boolean):void");
    }

    public void A(float f7) {
    }

    public void F(float f7) {
    }

    public void G(aw0 aw0Var) {
    }

    public bb(android.content.Context r2, org.telegram.ui.ActionBar.m2 r3, boolean r4, boolean r5, int r6, org.telegram.ui.ActionBar.d6 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bb.<init>(android.content.Context, org.telegram.ui.ActionBar.m2, boolean, boolean, int, org.telegram.ui.ActionBar.d6):void");
    }

    public bb(android.content.Context r3, org.telegram.ui.ActionBar.d6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bb.<init>(android.content.Context, org.telegram.ui.ActionBar.d6, boolean):void");
    }

    public void B(Canvas canvas, int i10) {
    }

    public void E(int i10, int i11) {
    }

    public bb(Context context, org.telegram.ui.ActionBar.m2 m2Var, ab abVar) {
        super(abVar.f22646b, context, abVar.f22649g, abVar.f22645a);
        va vaVar;
        this.v = 0.4f;
        this.f22961w = true;
        this.f22962x = 1.0f;
        this.f22963y = false;
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
        boolean z10 = abVar.f22647c;
        boolean z11 = abVar.d;
        boolean z12 = abVar.e;
        int i10 = abVar.f22648f;
        this.f22958n = m2Var;
        this.f22959r = z10;
        this.f22955b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            va vaVar2 = new va(this, context, z12, z10);
            this.f22960s = vaVar2;
            vaVar = vaVar2;
        } else {
            vaVar = new wa(this, context, z12, z10);
        }
        wl0 w10 = w(context);
        this.d = w10;
        gg.b0 b0Var = new gg.b0(6);
        this.f22956c = b0Var;
        if (z12) {
            b0Var.l1(true);
        }
        w10.setLayoutManager(b0Var);
        va vaVar3 = this.f22960s;
        if (vaVar3 != null) {
            vaVar3.setBottomSheetContainerView(getContainer());
            this.f22960s.setTargetListView(w10);
        }
        if (z10) {
            w10.setHasFixedSize(true);
            w10.setAdapter(v(w10));
            setCustomView(vaVar);
            vaVar.addView(w10, w7.y5.c(-2.0f, -1));
        } else {
            w10.setAdapter(new za(this, v(w10), context));
            this.containerView = vaVar;
            xa xaVar = new xa(this, context, vaVar);
            this.e = xaVar;
            xaVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19130h5));
            xaVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.h6.G6));
            xaVar.A(getThemedColor(org.telegram.ui.ActionBar.h6.f19464z8), false);
            xaVar.setBackButtonImage(R.drawable.ic_ab_back);
            xaVar.B(getThemedColor(org.telegram.ui.ActionBar.h6.f19445y8), false);
            xaVar.setCastShadows(true);
            xaVar.setTitle(y());
            xaVar.setActionBarMenuOnItemClick(new org.telegram.ui.oo(this, 7));
            vaVar.addView(w10);
            vaVar.addView(xaVar, w7.y5.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            w10.j(new ai.r(vaVar, 15));
        }
        if (i10 == 2) {
            K();
        }
        G(vaVar);
        M();
    }
}
