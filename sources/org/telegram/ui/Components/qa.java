package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

public abstract class qa extends org.telegram.ui.ActionBar.e3 {
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
    public tt L;
    public boolean M;
    public boolean N;
    public boolean O;
    public float P;
    public int Q;
    public int R;
    public int S;

    public final Drawable f31851b;

    public final org.telegram.ui.j f31852c;
    public final zk0 d;

    public final na f31853e;

    public boolean f31854f;
    public int h;

    public final org.telegram.ui.ActionBar.n2 f31855n;

    public final boolean f31856r;

    public final la f31857s;
    public float v;

    public boolean f31858w;

    public float f31859x;

    public boolean f31860y;

    public qa(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        this(n2Var, z10, false, n2Var == null ? null : n2Var.getResourceProvider());
    }

    public final boolean B() {
        return i0.b.f(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, this.resourcesProvider)) > 0.699999988079071d;
    }

    public final void H(Canvas canvas, FrameLayout frameLayout) {
        float f10;
        int i10 = this.S;
        Drawable drawable = this.f31851b;
        na naVar = this.f31853e;
        if (i10 == 1) {
            boolean z10 = this.f31858w;
            if (z10) {
                float f11 = this.f31859x;
                if (f11 != 1.0f) {
                    this.f31859x = f11 + 0.10666667f;
                    frameLayout.invalidate();
                } else if (!z10) {
                    f10 = this.f31859x;
                    if (f10 != 0.0f) {
                        this.f31859x = f10 - 0.10666667f;
                        frameLayout.invalidate();
                    }
                }
            } else if (!z10) {
                f10 = this.f31859x;
                if (f10 != 0.0f) {
                    this.f31859x = f10 - 0.10666667f;
                    frameLayout.invalidate();
                }
            }
            this.f31859x = Utilities.clamp(this.f31859x, 1.0f, 0.0f);
            if (naVar != null && naVar.getVisibility() == 0 && naVar.getAlpha() != 0.0f && this.f31859x != 0.0f) {
                drawable.setBounds(this.backgroundPaddingLeft, naVar.getBottom(), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + naVar.getBottom());
                drawable.setAlpha((int) (naVar.getAlpha() * 255.0f * this.f31859x));
                drawable.draw(canvas);
                if (drawable.getAlpha() < 255) {
                    frameLayout.invalidate();
                }
            }
            this.f31854f = true;
        } else if (i10 == 2 && ((int) (this.f31859x * 255.0f)) != 0 && this.f31858w) {
            drawable.setBounds(this.backgroundPaddingLeft, naVar.getBottom() + ((int) naVar.getTranslationY()), frameLayout.getMeasuredWidth() - this.backgroundPaddingLeft, drawable.getIntrinsicHeight() + naVar.getBottom() + ((int) naVar.getTranslationY()));
            drawable.setAlpha((int) (this.f31859x * 255.0f));
            drawable.draw(canvas);
        }
        if (this.O) {
            canvas.restore();
            this.O = false;
        }
    }

    public void I(Canvas canvas, View view) {
        int translationY;
        this.O = false;
        if (this.f31856r) {
            return;
        }
        boolean z10 = this.M;
        zk0 zk0Var = this.d;
        if (z10) {
            int height = zk0Var.getHeight();
            for (int i10 = 0; i10 < zk0Var.getChildCount(); i10++) {
                View childAt = zk0Var.getChildAt(i10);
                int iR = RecyclerView.R(childAt);
                if (iR != -1 && iR != zk0Var.getAdapter().h() - 1) {
                    height = Math.min(height, childAt.getTop() + (this.K ? (int) childAt.getTranslationY() : 0));
                }
            }
            translationY = height - AndroidUtilities.dp(16.0f);
        } else {
            f2.o1 o1VarK = zk0Var.K(0);
            int bottom = -AndroidUtilities.dp(16.0f);
            if (o1VarK != null) {
                View view2 = o1VarK.f5789a;
                bottom = view2.getBottom() - AndroidUtilities.dp(16.0f);
                if (this.K) {
                    translationY = ((int) view2.getTranslationY()) + bottom;
                } else {
                    translationY = bottom;
                }
            } else {
                translationY = bottom;
            }
        }
        int iLerp = (translationY - ((this.D + this.E) + this.F)) + this.G;
        if (this.f31860y && this.A) {
            iLerp -= AndroidUtilities.dp(this.S == 2 ? 8.0f : 16.0f);
        }
        float f10 = iLerp;
        this.P = f10;
        F(f10);
        int i11 = this.S;
        float fLerp = 1.0f;
        na naVar = this.f31853e;
        if (i11 == 1) {
            float fDp = 1.0f - ((AndroidUtilities.dp(16.0f) + iLerp) / y());
            if (fDp < 0.0f) {
                fDp = 0.0f;
            }
            AndroidUtilities.updateViewVisibilityAnimated(naVar, fDp != 0.0f, 1.0f, this.f31854f);
        } else if (i11 == 2) {
            float fMax = Math.max(((AndroidUtilities.dp(8.0f) + (iLerp - this.G)) + this.E) - AndroidUtilities.statusBarHeight, 0.0f);
            float fD = this.J.d(fMax == 0.0f ? 1.0f : 0.0f, false);
            if (fD != 0.0f && fD != 1.0f) {
                canvas.save();
                canvas.clipRect(0.0f, fMax, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                this.O = true;
            }
            this.f31859x = fD;
            fLerp = AndroidUtilities.lerp(1.0f, 0.5f, fD);
            naVar.f23566e.setAlpha(fD);
            C(fD);
            naVar.f23566e.setScaleX(fD);
            ImageView imageView = naVar.f23566e;
            imageView.setPivotY(imageView.getMeasuredHeight() / 2.0f);
            naVar.f23566e.setScaleY(fD);
            org.telegram.ui.ActionBar.h5 titleTextView = naVar.getTitleTextView();
            titleTextView.setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(21.0f) - titleTextView.getLeft(), 0.0f, fD) + 0);
            if (this.N) {
                titleTextView.setTranslationX(((naVar.getMeasuredWidth() - titleTextView.getTextWidth()) / 2.0f) - titleTextView.getLeft());
            }
            naVar.setTranslationY(fMax);
            iLerp -= AndroidUtilities.lerp(0, AndroidUtilities.dp(13.0f) + (((this.C - this.D) - this.E) - this.F), fD);
            naVar.getBackground().setBounds(0, AndroidUtilities.lerp(naVar.getHeight(), 0, fD), naVar.getWidth(), naVar.getHeight());
            if (fD > 0.5f) {
                if (this.I) {
                    this.I = false;
                    naVar.setTag(1);
                }
            } else if (!this.I) {
                this.I = true;
                naVar.setTag(null);
            }
        }
        if (L()) {
            if (this instanceof cg.d1) {
                this.shadowDrawable.setBounds(-AndroidUtilities.dp(6.0f), iLerp, AndroidUtilities.dp(6.0f) + view.getMeasuredWidth(), view.getMeasuredHeight());
            } else {
                this.shadowDrawable.setBounds(0, iLerp, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            v();
            this.shadowDrawable.draw(canvas);
            if (this.f31860y && fLerp > 0.0f) {
                int iDp = AndroidUtilities.dp(36.0f);
                int iDp2 = AndroidUtilities.dp(20.0f) + iLerp;
                float measuredWidth = (view.getMeasuredWidth() - iDp) / 2.0f;
                float f11 = iDp2;
                float measuredWidth2 = (view.getMeasuredWidth() + iDp) / 2.0f;
                float fDp2 = AndroidUtilities.dp(4.0f) + iDp2;
                RectF rectF = this.B;
                rectF.set(measuredWidth, f11, measuredWidth2, fDp2);
                org.telegram.ui.ActionBar.g6.f23333t0.setColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
                Paint paint = org.telegram.ui.ActionBar.g6.f23333t0;
                paint.setAlpha((int) (paint.getAlpha() * fLerp));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f23333t0);
            }
        }
        D(canvas, iLerp);
    }

    public final void J() {
        zk0 zk0Var = this.d;
        if (zk0Var == null || this.f31852c == null || zk0Var.getChildCount() <= 0) {
            return;
        }
        View view = null;
        int i10 = -1;
        int top = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < zk0Var.getChildCount(); i11++) {
            View childAt = zk0Var.getChildAt(i11);
            int iR = RecyclerView.R(childAt);
            if (iR >= 0 && childAt.getTop() < top) {
                top = childAt.getTop();
                view = childAt;
                i10 = iR;
            }
        }
        if (view != null) {
            this.Q = i10;
            this.R = this.containerView.getTop() + view.getTop();
            smoothContainerViewLayout();
        }
    }

    public final void K() {
        if (this.f31856r) {
            return;
        }
        this.S = 2;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        this.D = currentActionBarHeight;
        this.C = currentActionBarHeight + AndroidUtilities.statusBarHeight;
        this.E = AndroidUtilities.dp(16.0f);
        this.F = AndroidUtilities.dp(-20.0f);
        this.J = new y5(this.containerView, 0L, 350L, er.h);
        this.f31853e.f23566e.setPivotX(0.0f);
        this.d.setClipToPadding(true);
    }

    public boolean L() {
        return true;
    }

    public final void M() {
        if (this.attachedFragment != null) {
            LaunchActivity.C1.H(true, true, true);
            return;
        }
        na naVar = this.f31853e;
        if (naVar != null && naVar.getTag() != null) {
            AndroidUtilities.setLightStatusBar(this, B());
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f31855n;
        if (n2Var != null) {
            AndroidUtilities.setLightStatusBar(this, n2Var.isLightStatusBar());
        }
    }

    public final void N() {
        na naVar = this.f31853e;
        if (naVar != null) {
            naVar.setTitle(z());
        }
    }

    public final void O() {
        na naVar = this.f31853e;
        if (naVar == null || TextUtils.equals(z(), naVar.getTitle())) {
            return;
        }
        naVar.J(z(), false, 350L, er.h);
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean isAttachedLightStatusBar() {
        na naVar = this.f31853e;
        if (naVar != null && naVar.getTag() != null) {
            return B();
        }
        org.telegram.ui.ActionBar.n2 n2Var = this.f31855n;
        return n2Var != null ? n2Var.isLightStatusBar() : B();
    }

    @Override
    public void onContainerViewTranslation() {
        F(this.P);
        v();
    }

    public final void t() {
        zk0 zk0Var = this.d;
        if (zk0Var == null || zk0Var.getLayoutManager() == null || this.Q < 0) {
            return;
        }
        int top = (this.R - this.containerView.getTop()) - zk0Var.getPaddingTop();
        if (zk0Var.getLayoutManager() instanceof f2.k0) {
            ((f2.k0) zk0Var.getLayoutManager()).h1(this.Q, top);
        }
        this.Q = -1;
    }

    public boolean u(View view, float f10, float f11) {
        return true;
    }

    public final void v() {
        if (this.backDrawable == null || this.containerView == null || this.shadowDrawable == null || !L() || this.f31856r) {
            return;
        }
        Rect bounds = this.shadowDrawable.getBounds();
        if (this.containerView.getMeasuredWidth() >= this.container.getMeasuredWidth()) {
            this.backDrawable.a(((this.containerView.getMeasuredHeight() - bounds.top) - AndroidUtilities.dp(30.0f)) - ((int) this.containerView.getTranslationY()));
        } else {
            this.backDrawable.a(0);
        }
    }

    public abstract yk0 w(zk0 zk0Var);

    public zk0 x(Context context) {
        return new hh.f1(this, context, this.resourcesProvider, 10);
    }

    public int y() {
        return AndroidUtilities.dp(56.0f);
    }

    public abstract CharSequence z();

    public qa(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, org.telegram.ui.ActionBar.c6 c6Var) {
        this(n2Var.getParentActivity(), n2Var, false, z10, z11, 1, c6Var);
    }

    public qa(org.telegram.ui.ActionBar.n2 n2Var) {
        this(n2Var.getParentActivity(), n2Var, false, false, false, 2, n2Var.getResourceProvider());
    }

    public qa(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, n2Var, z10, false, z11, z12, false, i10, c6Var);
    }

    public qa(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        zu0 maVar;
        super(context, c6Var, z10, z11);
        this.v = 0.4f;
        this.f31858w = true;
        this.f31859x = 1.0f;
        this.f31860y = false;
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
        this.f31855n = n2Var;
        this.f31856r = z12;
        this.f31851b = context.getDrawable(R.drawable.header_shadow).mutate();
        if (z13) {
            la laVar = new la(this, context, z14, z12);
            this.f31857s = laVar;
            maVar = laVar;
        } else {
            maVar = new ma(this, context, z14, z12);
        }
        zk0 zk0VarX = x(context);
        this.d = zk0VarX;
        org.telegram.ui.j jVar = new org.telegram.ui.j(4);
        this.f31852c = jVar;
        if (z14) {
            jVar.l1(true);
        }
        zk0VarX.setLayoutManager(jVar);
        la laVar2 = this.f31857s;
        if (laVar2 != null) {
            laVar2.setBottomSheetContainerView(getContainer());
            this.f31857s.setTargetListView(zk0VarX);
        }
        if (z12) {
            zk0VarX.setHasFixedSize(true);
            zk0VarX.setAdapter(w(zk0VarX));
            setCustomView(maVar);
            maVar.addView(zk0VarX, h7.z5.c(-2.0f, -1));
        } else {
            zk0VarX.setAdapter(new pa(this, w(zk0VarX), context));
            this.containerView = maVar;
            na naVar = new na(this, context, maVar);
            this.f31853e = naVar;
            naVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
            naVar.setTitleColor(getThemedColor(org.telegram.ui.ActionBar.g6.G6));
            naVar.C(getThemedColor(org.telegram.ui.ActionBar.g6.f23443z8), false);
            naVar.setBackButtonImage(R.drawable.ic_ab_back);
            naVar.D(getThemedColor(org.telegram.ui.ActionBar.g6.f23425y8), false);
            naVar.setCastShadows(true);
            naVar.setTitle(z());
            naVar.setActionBarMenuOnItemClick(new org.telegram.ui.zp(this, 3));
            maVar.addView(zk0VarX);
            maVar.addView(naVar, h7.z5.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
            zk0VarX.j(new ag.z2(maVar, 23));
        }
        if (i10 == 2) {
            K();
        }
        G(maVar);
        M();
    }

    public void C(float f10) {
    }

    public void F(float f10) {
    }

    public void G(zu0 zu0Var) {
    }

    public void D(Canvas canvas, int i10) {
    }

    public void E(int i10, int i11) {
    }
}
