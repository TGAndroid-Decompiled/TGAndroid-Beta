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
public abstract class ab extends org.telegram.ui.ActionBar.h3 {
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
    public nu Q;
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final Drawable f21449b;
    public final fg.a0 f21450c;
    public final vl0 d;
    public final wa e;
    public boolean f21451f;
    public int h;
    public final org.telegram.ui.ActionBar.p2 f21452n;
    public final boolean f21453r;
    public final ua f21454s;
    public float v;
    public boolean f21455w;
    public float f21456x;
    public boolean f21457y;

    public ab(org.telegram.ui.ActionBar.p2 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ab.<init>(org.telegram.ui.ActionBar.p2, boolean):void");
    }

    public static ViewGroup r(ab abVar) {
        return abVar.containerView;
    }

    public final void H(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ab.H(android.graphics.Canvas, android.widget.FrameLayout):void");
    }

    public void I(Canvas canvas, View view) {
        int i10;
        float f7;
        ImageView imageView;
        Paint paint;
        float f10;
        int i11;
        this.S = false;
        if (!this.f21453r) {
            boolean z10 = this.P;
            boolean z11 = true;
            vl0 vl0Var = this.d;
            if (z10) {
                int height = vl0Var.getHeight();
                for (int i12 = 0; i12 < vl0Var.getChildCount(); i12++) {
                    View childAt = vl0Var.getChildAt(i12);
                    int R = RecyclerView.R(childAt);
                    if (R != -1 && R != vl0Var.getAdapter().h() - 1) {
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
                s4.c1 K = vl0Var.K(0);
                int i13 = -AndroidUtilities.dp(16.0f);
                if (K != null) {
                    View view2 = K.f41610a;
                    i13 = view2.getBottom() - AndroidUtilities.dp(16.0f);
                    if (this.O) {
                        i10 = ((int) view2.getTranslationY()) + i13;
                    }
                }
                i10 = i13;
            }
            int i14 = (i10 - ((this.H + this.I) + this.J)) + this.K;
            if (this.f21457y && this.E) {
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
            wa waVar = this.e;
            if (i15 == 1) {
                float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i14) / x());
                if (dp < 0.0f) {
                    dp = 0.0f;
                }
                if (dp == 0.0f) {
                    z11 = false;
                }
                AndroidUtilities.updateViewVisibilityAnimated(waVar, z11, 1.0f, this.f21451f);
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
                this.f21456x = d;
                f12 = AndroidUtilities.lerp(1.0f, 0.5f, d);
                waVar.e.setAlpha(d);
                A(d);
                waVar.e.setScaleX(d);
                waVar.e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                waVar.e.setScaleY(d);
                org.telegram.ui.ActionBar.l5 titleTextView = waVar.getTitleTextView();
                titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
                if (this.R) {
                    titleTextView.setTranslationX(((waVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                waVar.setTranslationY(max);
                i14 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.G - this.H) - this.I) - this.J), d);
                waVar.getBackground().setBounds(0, AndroidUtilities.lerp(waVar.getHeight(), 0, d), waVar.getWidth(), waVar.getHeight());
                if (d > 0.5f) {
                    if (this.M) {
                        this.M = false;
                        waVar.setTag(1);
                    }
                } else if (!this.M) {
                    this.M = true;
                    waVar.setTag(null);
                }
            }
            if (L()) {
                if (!(this instanceof sg.a0)) {
                    this.shadowDrawable.setBounds(0, i14, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), i14, AndroidUtilities.dp(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                u();
                this.shadowDrawable.draw(canvas);
                if (this.f21457y && f12 > 0.0f) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    int dp3 = AndroidUtilities.dp(20.0f) + i14;
                    RectF rectF = this.F;
                    rectF.set((view.getMeasuredWidth() - dp2) / 2.0f, dp3, (view.getMeasuredWidth() + dp2) / 2.0f, AndroidUtilities.dp(4.0f) + dp3);
                    org.telegram.ui.ActionBar.j6.f18212t0.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
                    org.telegram.ui.ActionBar.j6.f18212t0.setAlpha((int) (paint.getAlpha() * f12));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f18212t0);
                }
            }
            C(canvas, i14);
        }
    }

    public final void J() {
        vl0 vl0Var = this.d;
        if (vl0Var != null && this.f21450c != null && vl0Var.getChildCount() > 0) {
            View view = null;
            int i10 = -1;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < vl0Var.getChildCount(); i12++) {
                View childAt = vl0Var.getChildAt(i12);
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
        if (this.f21453r) {
            return;
        }
        this.W = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        this.H = currentActionBarHeight;
        this.G = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.I = AndroidUtilities.dp(16.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.N = new d6(this.containerView, 0L, 350L, wr.h);
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
        wa waVar = this.e;
        if (waVar != null && waVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, z());
            return;
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f21452n;
        if (p2Var != null) {
            AndroidUtilities.setLightStatusBar(this, p2Var.isLightStatusBar());
        }
    }

    public final void N() {
        wa waVar = this.e;
        if (waVar != null) {
            waVar.setTitle(y());
        }
    }

    public final void O() {
        wa waVar = this.e;
        if (waVar != null && !TextUtils.equals(y(), waVar.getTitle())) {
            waVar.J(y(), false, 350L, wr.h);
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        wa waVar = this.e;
        if (waVar != null && waVar.getTag() != null) {
            return z();
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.f21452n;
        if (p2Var != null) {
            return p2Var.isLightStatusBar();
        }
        return z();
    }

    @Override
    public void onContainerViewTranslation() {
        E(this.T);
        u();
    }

    public final void s() {
        vl0 vl0Var = this.d;
        if (vl0Var != null && vl0Var.getLayoutManager() != null && this.U >= 0) {
            int top = (this.V - this.containerView.getTop()) - vl0Var.getPaddingTop();
            if (vl0Var.getLayoutManager() instanceof s4.c0) {
                ((s4.c0) vl0Var.getLayoutManager()).h1(this.U, top);
            }
            this.U = -1;
        }
    }

    public boolean t(View view, float f7, float f10) {
        return true;
    }

    public final void u() {
        if (this.backDrawable != null && this.containerView != null && this.shadowDrawable != null && L() && !this.f21453r) {
            Rect bounds = this.shadowDrawable.getBounds();
            if (this.containerView.getMeasuredWidth() >= this.container.getMeasuredWidth()) {
                this.backDrawable.a(((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY()));
            } else {
                this.backDrawable.a(0);
            }
        }
    }

    public abstract ul0 v(vl0 vl0Var);

    public vl0 w(Context context) {
        return new bi.y1(this, context, this.resourcesProvider, 9);
    }

    public int x() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence y();

    public final boolean z() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, this.resourcesProvider)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public ab(org.telegram.ui.ActionBar.p2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.f6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ab.<init>(org.telegram.ui.ActionBar.p2, boolean, boolean, org.telegram.ui.ActionBar.f6):void");
    }

    public ab(android.content.Context r2, org.telegram.ui.ActionBar.p2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.f6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ab.<init>(android.content.Context, org.telegram.ui.ActionBar.p2, boolean, boolean, org.telegram.ui.ActionBar.f6):void");
    }

    public ab(int r2, android.content.Context r3, org.telegram.ui.ActionBar.f6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ab.<init>(int, android.content.Context, org.telegram.ui.ActionBar.f6, boolean):void");
    }

    public void A(float f7) {
    }

    public void E(float f7) {
    }

    public void F(aw0 aw0Var) {
    }

    public ab(android.content.Context r2, org.telegram.ui.ActionBar.p2 r3, boolean r4, boolean r5, int r6, org.telegram.ui.ActionBar.f6 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ab.<init>(android.content.Context, org.telegram.ui.ActionBar.p2, boolean, boolean, int, org.telegram.ui.ActionBar.f6):void");
    }

    public ab(android.content.Context r3, org.telegram.ui.ActionBar.f6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ab.<init>(android.content.Context, org.telegram.ui.ActionBar.f6, boolean):void");
    }

    public void C(Canvas canvas, int i10) {
    }

    public void D(int i10, int i11) {
    }

    public ab(Context context, org.telegram.ui.ActionBar.p2 p2Var, za zaVar) {
        super(zaVar.f29623b, context, zaVar.f29626g, zaVar.f29622a);
        ua uaVar;
        this.v = 0.4f;
        this.f21455w = true;
        this.f21456x = 1.0f;
        this.f21457y = false;
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
        boolean z10 = zaVar.f29624c;
        boolean z11 = zaVar.d;
        boolean z12 = zaVar.e;
        int i10 = zaVar.f29625f;
        this.f21452n = p2Var;
        this.f21453r = z10;
        this.f21449b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            ua uaVar2 = new ua(this, context, z12, z10);
            this.f21454s = uaVar2;
            uaVar = uaVar2;
        } else {
            uaVar = new va(this, context, z12, z10);
        }
        vl0 w10 = w(context);
        this.d = w10;
        fg.a0 a0Var = new fg.a0(6);
        this.f21450c = a0Var;
        if (z12) {
            a0Var.l1(true);
        }
        w10.setLayoutManager(a0Var);
        ua uaVar3 = this.f21454s;
        if (uaVar3 != null) {
            uaVar3.setBottomSheetContainerView(getContainer());
            this.f21454s.setTargetListView(w10);
        }
        if (z10) {
            w10.setHasFixedSize(true);
            w10.setAdapter(v(w10));
            setCustomView(uaVar);
            uaVar.addView(w10, w7.a6.c(-2.0f, -1));
        } else {
            w10.setAdapter(new ya(this, v(w10), context));
            this.containerView = uaVar;
            wa waVar = new wa(this, context, uaVar);
            this.e = waVar;
            waVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f17998h5));
            waVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
            waVar.A(getThemedColor(org.telegram.ui.ActionBar.j6.f18327z8), false);
            waVar.setBackButtonImage(R.drawable.ic_ab_back);
            waVar.C(getThemedColor(org.telegram.ui.ActionBar.j6.f18308y8), false);
            waVar.setCastShadows(true);
            waVar.setTitle(y());
            waVar.setActionBarMenuOnItemClick(new org.telegram.ui.vo(this, 7));
            uaVar.addView(w10);
            uaVar.addView(waVar, w7.a6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            w10.j(new bi.a2(uaVar, 13));
        }
        if (i10 == 2) {
            K();
        }
        F(uaVar);
        M();
    }
}
