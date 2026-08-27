package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

public abstract class g31 extends FrameLayout {
    public static long M;
    public ix A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public VelocityTracker H;
    public boolean I;
    public float J;
    public float K;
    public Paint L;

    public ix f38296a;

    public View f38297b;

    public n0 f38298c;
    public org.telegram.ui.ActionBar.k d;

    public float f38299e;

    public boolean f38300f;
    public ValueAnimator h;

    public AnimationNotificationsLocker f38301n;

    public boolean f38302r;

    public int f38303s;
    public boolean v;

    public org.telegram.ui.ActionBar.b5 f38304w;

    public o1.j f38305x;

    public float f38306y;

    public static void f(org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.n2 n2Var2, float f10) {
        if (n2Var == null && n2Var2 == null) {
            return;
        }
        int measuredWidth = n2Var != null ? n2Var.getFragmentView().getMeasuredWidth() : n2Var2.getFragmentView().getMeasuredWidth();
        if (n2Var != null) {
            if (n2Var.getFragmentView() != null) {
                n2Var.getFragmentView().setAlpha(1.0f - f10);
                n2Var.getFragmentView().setTranslationX(measuredWidth * 0.6f * f10);
            }
            n2Var.setPreviewOpenedProgress(1.0f - f10);
        }
        if (n2Var2 != null) {
            if (n2Var2.getFragmentView() != null) {
                n2Var2.getFragmentView().setAlpha(1.0f);
                n2Var2.getFragmentView().setTranslationX((1.0f - f10) * measuredWidth);
            }
            n2Var2.setPreviewReplaceProgress(f10);
        }
    }

    public static int getRightPaddingSize() {
        return SharedConfig.useThreeLinesLayout ? 74 : 76;
    }

    public final void a() {
        if (this.f38300f) {
            e(false);
            b();
        }
    }

    public final void b() {
        int i10 = 0;
        this.f38300f = false;
        if (SharedConfig.animationsEnabled()) {
            this.f38301n.lock();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f38299e, 0.0f);
            this.h = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new d31(this, 0));
            this.h.addListener(new f31(this, i10));
            this.h.setDuration(250L);
            this.h.setInterpolator(org.telegram.ui.Components.er.f28122f);
            this.h.start();
            return;
        }
        this.f38299e = 0.0f;
        g();
        ix ixVar = this.f38296a;
        if (ixVar != null) {
            ixVar.onPause();
            this.f38296a.onFragmentDestroy();
            removeAllViews();
            this.f38296a = null;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        }
        d(false);
    }

    public final boolean c() {
        return this.f38296a != null;
    }

    public abstract void d(boolean z10);

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.v) {
            f(this.A, this.f38296a, this.f38306y);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f10 = this.f38299e;
        org.telegram.ui.ActionBar.k kVar = this.d;
        float alpha = (kVar == null || kVar.getActionMode() == null) ? 0.0f : this.d.getActionMode().getAlpha();
        org.telegram.ui.ActionBar.k kVar2 = this.d;
        float fMax = Math.max(alpha, kVar2 == null ? 0.0f : kVar2.f23580k0) * f10;
        if (this.f38296a == null || this.d == null || fMax <= 0.0f) {
            return;
        }
        if (this.L == null) {
            this.L = new Paint();
        }
        this.L.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23393w8, false));
        if (fMax == 1.0f) {
            canvas.save();
        } else {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.K, (int) (fMax * 255.0f), 31);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.K, this.L);
        canvas.translate(this.d.getX(), this.d.getY());
        canvas.save();
        canvas.translate(this.d.getBackButton().getX(), this.d.getBackButton().getY());
        this.d.getBackButton().draw(canvas);
        canvas.restore();
        if (this.d.getActionMode() != null) {
            if (fMax != this.d.getActionMode().getAlpha() * this.f38299e) {
                this.d.draw(canvas);
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.K, (int) (this.d.getActionMode().getAlpha() * 255.0f), 31);
                this.d.getActionMode().draw(canvas);
                canvas.restore();
            } else {
                this.d.getActionMode().draw(canvas);
            }
        } else {
            this.d.draw(canvas);
        }
        canvas.restore();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (view == kVar && kVar.getActionMode() != null && this.d.getActionMode().getAlpha() == 1.0f) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public abstract void e(boolean z10);

    public final void g() {
        if (this.v || !c()) {
            return;
        }
        setOpenProgress(this.f38299e);
        View view = this.f38297b;
        if (view != null) {
            view.setTranslationX((1.0f - this.f38299e) * (getMeasuredWidth() - AndroidUtilities.dp(getRightPaddingSize())));
        }
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (kVar != null) {
            kVar.setTranslationX((1.0f - this.f38299e) * AndroidUtilities.dp(48.0f));
        }
        ix ixVar = this.f38296a;
        if (ixVar != null) {
            ixVar.setPreviewOpenedProgress(this.f38299e);
        }
        invalidate();
    }

    public long getCurrentFragmetDialogId() {
        return M;
    }

    public org.telegram.ui.ActionBar.n2 getFragment() {
        return this.f38296a;
    }

    public View getFragmentView() {
        return this.f38297b;
    }

    public abstract boolean getOccupyStatusbar();

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = getOccupyStatusbar() ? AndroidUtilities.statusBarHeight : 0;
        View view = this.f38297b;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(getRightPaddingSize());
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + this.f38303s;
        }
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (kVar != null) {
            ((FrameLayout.LayoutParams) kVar.getLayoutParams()).topMargin = i12;
        }
        super.onMeasure(i10, i11);
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (this.B != measuredWidth) {
            this.B = measuredWidth;
            g();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b5 b5Var = this.f38304w;
        if ((b5Var != null && ((ActionBarLayout) b5Var).y()) || !c() || !this.I) {
            return false;
        }
        int i10 = 1;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.C = motionEvent.getPointerId(0);
            this.D = true;
            this.F = (int) motionEvent.getX();
            this.G = (int) motionEvent.getY();
            VelocityTracker velocityTracker = this.H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.C) {
            if (this.H == null) {
                this.H = VelocityTracker.obtain();
            }
            int iMax = Math.max(0, (int) (motionEvent.getX() - this.F));
            int iAbs = Math.abs(((int) motionEvent.getY()) - this.G);
            this.H.addMovement(motionEvent);
            if (!this.D || this.E || iMax < AndroidUtilities.getPixelsInCM(0.4f, true) || Math.abs(iMax) / 3 <= iAbs) {
                if (this.E) {
                    float f10 = iMax;
                    this.J = f10;
                    this.f38299e = Utilities.clamp(1.0f - (f10 / getMeasuredWidth()), 1.0f, 0.0f);
                    g();
                }
            } else if (ActionBarLayout.u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                this.D = false;
                this.E = true;
                this.F = (int) motionEvent.getX();
                e(false);
            } else {
                this.D = false;
            }
        } else if (motionEvent != null && motionEvent.getPointerId(0) == this.C && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
            if (this.H == null) {
                this.H = VelocityTracker.obtain();
            }
            this.H.computeCurrentVelocity(1000);
            if (this.E) {
                float f11 = this.J;
                float xVelocity = this.H.getXVelocity();
                float yVelocity = this.H.getYVelocity();
                if (f11 >= getMeasuredWidth() / 3.0f || (xVelocity >= 3500.0f && xVelocity >= yVelocity)) {
                    b();
                } else {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f38299e, 1.0f);
                    this.h = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new d31(this, 2));
                    this.h.addListener(new f31(this, i10));
                    this.h.setDuration(250L);
                    this.h.setInterpolator(org.telegram.ui.Components.er.f28122f);
                    this.h.start();
                }
            }
            this.D = false;
            this.E = false;
            VelocityTracker velocityTracker2 = this.H;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.H = null;
            }
        } else if (motionEvent == null) {
            this.D = false;
            this.E = false;
            VelocityTracker velocityTracker3 = this.H;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.H = null;
            }
        }
        return this.E;
    }

    @Override
    public final void removeView(View view) {
        super.removeView(view);
        if (view == this.f38297b) {
            a();
        }
    }

    @Override
    public final void removeViewInLayout(View view) {
        super.removeViewInLayout(view);
        if (view == this.f38297b) {
            a();
        }
    }

    public void setCurrentTop(int i10) {
        this.K = i10;
        View view = this.f38297b;
        if (view != null) {
            view.setTranslationY((i10 - view.getTop()) + this.f38303s);
        }
        n0 n0Var = this.f38298c;
        if (n0Var != null) {
            n0Var.setTranslationY(i10 - n0Var.getTop());
        }
    }

    public void setFragmentViewPadding(int i10) {
        this.f38303s = i10;
    }

    public void setTransitionPaddingBottom(int i10) {
        ix ixVar = this.f38296a;
        if (com.google.android.recaptcha.internal.a.u(ixVar)) {
            float f10 = i10;
            ixVar.T0 = f10;
            ixVar.h.setTranslationY(((-f10) - ixVar.f43721a1) - ixVar.Z0);
        }
    }

    public void setOpenProgress(float f10) {
    }
}
