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
public abstract class db extends org.telegram.ui.ActionBar.e3 {
    public boolean E;
    public final RectF F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public g6 N;
    public boolean O;
    public boolean P;
    public vu Q;
    public boolean R;
    public boolean S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final Drawable f24067b;
    public final hg.a0 f24068c;
    public final mm0 d;
    public final za e;
    public boolean f24069f;
    public int h;
    public final org.telegram.ui.ActionBar.m2 f24070n;
    public final boolean f24071r;
    public final xa f24072s;
    public float v;
    public boolean f24073w;
    public float f24074x;
    public boolean f24075y;

    public db(org.telegram.ui.ActionBar.m2 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.db.<init>(org.telegram.ui.ActionBar.m2, boolean):void");
    }

    public static ViewGroup t(db dbVar) {
        return dbVar.containerView;
    }

    public abstract CharSequence B();

    public final boolean C() {
        if (i0.a.f(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19672h5, this.resourcesProvider)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void I(android.graphics.Canvas r11, android.widget.FrameLayout r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.db.I(android.graphics.Canvas, android.widget.FrameLayout):void");
    }

    public void J(Canvas canvas, View view) {
        int i10;
        float f7;
        ImageView imageView;
        Paint paint;
        float f10;
        int i11;
        this.S = false;
        if (!this.f24071r) {
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
                    View view2 = K.f44838a;
                    i13 = view2.getBottom() - AndroidUtilities.dp(16.0f);
                    if (this.O) {
                        i10 = ((int) view2.getTranslationY()) + i13;
                    }
                }
                i10 = i13;
            }
            int i14 = (i10 - ((this.H + this.I) + this.J)) + this.K;
            if (this.f24075y && this.E) {
                if (this.W == 2) {
                    f10 = 8.0f;
                } else {
                    f10 = 16.0f;
                }
                i14 -= AndroidUtilities.dp(f10);
            }
            float f11 = i14;
            this.T = f11;
            G(f11);
            int i15 = this.W;
            float f12 = 1.0f;
            za zaVar = this.e;
            if (i15 == 1) {
                float dp = 1.0f - ((AndroidUtilities.dp(16.0f) + i14) / z());
                if (dp < 0.0f) {
                    dp = 0.0f;
                }
                if (dp == 0.0f) {
                    z11 = false;
                }
                AndroidUtilities.updateViewVisibilityAnimated(zaVar, z11, 1.0f, this.f24069f);
            } else if (i15 == 2) {
                float max = Math.max(((AndroidUtilities.dp(8.0f) + (i14 - this.K)) + this.I) - AndroidUtilities.statusBarHeight, 0.0f);
                g6 g6Var = this.N;
                if (max == 0.0f) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = g6Var.d(f7, false);
                if (d != 0.0f && d != 1.0f) {
                    canvas.save();
                    canvas.clipRect(0.0f, max, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                    this.S = true;
                }
                this.f24074x = d;
                f12 = AndroidUtilities.lerp(1.0f, 0.5f, d);
                zaVar.e.setAlpha(d);
                D(d);
                zaVar.e.setScaleX(d);
                zaVar.e.setPivotY(imageView.getMeasuredHeight() / 2.0f);
                zaVar.e.setScaleY(d);
                org.telegram.ui.ActionBar.h5 titleTextView = zaVar.getTitleTextView();
                titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, d) + 0);
                if (this.R) {
                    titleTextView.setTranslationX(((zaVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
                }
                zaVar.setTranslationY(max);
                i14 -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.G - this.H) - this.I) - this.J), d);
                zaVar.getBackground().setBounds(0, AndroidUtilities.lerp(zaVar.getHeight(), 0, d), zaVar.getWidth(), zaVar.getHeight());
                if (d > 0.5f) {
                    if (this.M) {
                        this.M = false;
                        zaVar.setTag(1);
                    }
                } else if (!this.M) {
                    this.M = true;
                    zaVar.setTag(null);
                }
            }
            if (M()) {
                if (!(this instanceof ug.a0)) {
                    this.shadowDrawable.setBounds(0, i14, view.getMeasuredWidth(), view.getMeasuredHeight());
                } else {
                    this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), i14, AndroidUtilities.dp(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
                }
                w();
                this.shadowDrawable.draw(canvas);
                if (this.f24075y && f12 > 0.0f) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    int dp3 = AndroidUtilities.dp(20.0f) + i14;
                    RectF rectF = this.F;
                    rectF.set((view.getMeasuredWidth() - dp2) / 2.0f, dp3, (view.getMeasuredWidth() + dp2) / 2.0f, AndroidUtilities.dp(4.0f) + dp3);
                    org.telegram.ui.ActionBar.g6.f19891t0.setColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
                    org.telegram.ui.ActionBar.g6.f19891t0.setAlpha((int) (paint.getAlpha() * f12));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f19891t0);
                }
            }
            E(canvas, i14);
        }
    }

    public final void K() {
        mm0 mm0Var = this.d;
        if (mm0Var != null && this.f24068c != null && mm0Var.getChildCount() > 0) {
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

    public final void L() {
        if (this.f24071r) {
            return;
        }
        this.W = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.H = currentActionBarHeight;
        this.G = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.I = AndroidUtilities.dp(16.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.N = new g6(this.containerView, 0L, 350L, es.h);
        this.e.e.setPivotX(0.0f);
        this.d.setClipToPadding(true);
    }

    public boolean M() {
        return true;
    }

    public final void N() {
        if (this.attachedFragment != null) {
            LaunchActivity.G1.H(true, true, true);
            return;
        }
        za zaVar = this.e;
        if (zaVar != null && zaVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, C());
            return;
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f24070n;
        if (m2Var != null) {
            AndroidUtilities.setLightStatusBar(this, m2Var.isLightStatusBar());
        }
    }

    public final void O() {
        za zaVar = this.e;
        if (zaVar != null) {
            zaVar.setTitle(B());
        }
    }

    public final void P() {
        za zaVar = this.e;
        if (zaVar != null && !TextUtils.equals(B(), zaVar.getTitle())) {
            zaVar.J(B(), false, 350L, es.h);
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        za zaVar = this.e;
        if (zaVar != null && zaVar.getTag() != null) {
            return C();
        }
        org.telegram.ui.ActionBar.m2 m2Var = this.f24070n;
        if (m2Var != null) {
            return m2Var.isLightStatusBar();
        }
        return C();
    }

    @Override
    public void onContainerViewTranslation() {
        G(this.T);
        w();
    }

    public final void u() {
        mm0 mm0Var = this.d;
        if (mm0Var != null && mm0Var.getLayoutManager() != null && this.U >= 0) {
            int top = (this.V - this.containerView.getTop()) - mm0Var.getPaddingTop();
            if (mm0Var.getLayoutManager() instanceof s4.b0) {
                ((s4.b0) mm0Var.getLayoutManager()).h1(this.U, top);
            }
            this.U = -1;
        }
    }

    public boolean v(View view, float f7, float f10) {
        return true;
    }

    public final void w() {
        if (this.backDrawable != null && this.containerView != null && this.shadowDrawable != null && M() && !this.f24071r) {
            Rect bounds = this.shadowDrawable.getBounds();
            if (this.containerView.getMeasuredWidth() >= this.container.getMeasuredWidth()) {
                this.backDrawable.a(((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY()));
            } else {
                this.backDrawable.a(0);
            }
        }
    }

    public abstract lm0 x(mm0 mm0Var);

    public mm0 y(Context context) {
        return new bi.o0(this, context, this.resourcesProvider, 10);
    }

    public int z() {
        return AndroidUtilities.dp(56.0f);
    }

    public db(org.telegram.ui.ActionBar.m2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.c6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.db.<init>(org.telegram.ui.ActionBar.m2, boolean, boolean, org.telegram.ui.ActionBar.c6):void");
    }

    public db(android.content.Context r2, org.telegram.ui.ActionBar.m2 r3, boolean r4, boolean r5, org.telegram.ui.ActionBar.c6 r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.db.<init>(android.content.Context, org.telegram.ui.ActionBar.m2, boolean, boolean, org.telegram.ui.ActionBar.c6):void");
    }

    public db(int r2, android.content.Context r3, org.telegram.ui.ActionBar.c6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.db.<init>(int, android.content.Context, org.telegram.ui.ActionBar.c6, boolean):void");
    }

    public void D(float f7) {
    }

    public void G(float f7) {
    }

    public void H(ow0 ow0Var) {
    }

    public db(android.content.Context r2, org.telegram.ui.ActionBar.m2 r3, boolean r4, boolean r5, int r6, org.telegram.ui.ActionBar.c6 r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.db.<init>(android.content.Context, org.telegram.ui.ActionBar.m2, boolean, boolean, int, org.telegram.ui.ActionBar.c6):void");
    }

    public db(android.content.Context r3, org.telegram.ui.ActionBar.c6 r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.db.<init>(android.content.Context, org.telegram.ui.ActionBar.c6, boolean):void");
    }

    public void E(Canvas canvas, int i10) {
    }

    public void F(int i10, int i11) {
    }

    public db(Context context, org.telegram.ui.ActionBar.m2 m2Var, cb cbVar) {
        super(cbVar.f23666b, context, cbVar.f23669g, cbVar.f23665a);
        xa xaVar;
        this.v = 0.4f;
        this.f24073w = true;
        this.f24074x = 1.0f;
        this.f24075y = false;
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
        boolean z10 = cbVar.f23667c;
        boolean z11 = cbVar.d;
        boolean z12 = cbVar.e;
        int i10 = cbVar.f23668f;
        this.f24070n = m2Var;
        this.f24071r = z10;
        this.f24067b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z11) {
            xa xaVar2 = new xa(this, context, z12, z10);
            this.f24072s = xaVar2;
            xaVar = xaVar2;
        } else {
            xaVar = new ya(this, context, z12, z10);
        }
        mm0 y3 = y(context);
        this.d = y3;
        hg.a0 a0Var = new hg.a0(6);
        this.f24068c = a0Var;
        if (z12) {
            a0Var.l1(true);
        }
        y3.setLayoutManager(a0Var);
        xa xaVar3 = this.f24072s;
        if (xaVar3 != null) {
            xaVar3.setBottomSheetContainerView(getContainer());
            this.f24072s.setTargetListView(y3);
        }
        if (z10) {
            y3.setHasFixedSize(true);
            y3.setAdapter(x(y3));
            setCustomView(xaVar);
            xaVar.addView(y3, w7.z5.d(-2.0f, -1));
        } else {
            y3.setAdapter(new bb(this, x(y3), context));
            this.containerView = xaVar;
            za zaVar = new za(this, context, xaVar);
            this.e = zaVar;
            zaVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f19672h5));
            zaVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
            zaVar.C(getThemedColor(org.telegram.ui.ActionBar.g6.f20007z8), false);
            zaVar.setBackButtonImage(R.drawable.ic_ab_back);
            zaVar.D(getThemedColor(org.telegram.ui.ActionBar.g6.f19990y8), false);
            zaVar.setCastShadows(true);
            zaVar.setTitle(B());
            zaVar.setActionBarMenuOnItemClick(new org.telegram.ui.nb(this, 9));
            xaVar.addView(y3);
            xaVar.addView(zaVar, w7.z5.a(-2.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 0));
            y3.j(new ah.d0(xaVar, 16));
        }
        if (i10 == 2) {
            L();
        }
        H(xaVar);
        N();
    }
}
