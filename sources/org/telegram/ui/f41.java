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
public abstract class f41 extends FrameLayout {
    public static long Q;
    public static final int R = 0;
    public tx E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public VelocityTracker L;
    public boolean M;
    public float N;
    public float O;
    public Paint P;
    public tx f36177a;
    public View f36178b;
    public k0 f36179c;
    public org.telegram.ui.ActionBar.k d;
    public float f36180e;
    public boolean f36181f;
    public ValueAnimator h;
    public AnimationNotificationsLocker f36182n;
    public boolean f36183r;
    public int f36184s;
    public boolean v;
    public org.telegram.ui.ActionBar.c5 f36185w;
    public o1.k f36186x;
    public float f36187y;

    public static void f(org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.n2 n2Var2, float f7) {
        int measuredWidth;
        if (n2Var != null || n2Var2 != null) {
            if (n2Var != null) {
                measuredWidth = n2Var.getFragmentView().getMeasuredWidth();
            } else {
                measuredWidth = n2Var2.getFragmentView().getMeasuredWidth();
            }
            if (n2Var != null) {
                if (n2Var.getFragmentView() != null) {
                    n2Var.getFragmentView().setAlpha(1.0f - f7);
                    n2Var.getFragmentView().setTranslationX(measuredWidth * 0.6f * f7);
                }
                n2Var.setPreviewOpenedProgress(1.0f - f7);
            }
            if (n2Var2 != null) {
                if (n2Var2.getFragmentView() != null) {
                    n2Var2.getFragmentView().setAlpha(1.0f);
                    n2Var2.getFragmentView().setTranslationX((1.0f - f7) * measuredWidth);
                }
                n2Var2.setPreviewReplaceProgress(f7);
            }
        }
    }

    public static int getRightPaddingSize() {
        if (SharedConfig.useThreeLinesLayout) {
            return 74;
        }
        return 76;
    }

    public final void a() {
        if (!this.f36181f) {
            return;
        }
        e(false);
        b();
    }

    public final void b() {
        this.f36181f = false;
        if (!SharedConfig.animationsEnabled()) {
            this.f36180e = 0.0f;
            g();
            tx txVar = this.f36177a;
            if (txVar != null) {
                txVar.onPause();
                this.f36177a.onFragmentDestroy();
                removeAllViews();
                this.f36177a = null;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
            d(false);
            return;
        }
        this.f36182n.lock();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36180e, 0.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new c41(this, 0));
        this.h.addListener(new e41(this, 0));
        this.h.setDuration(250L);
        this.h.setInterpolator(org.telegram.ui.Components.tr.f31140f);
        this.h.start();
    }

    public final boolean c() {
        if (this.f36177a != null) {
            return true;
        }
        return false;
    }

    public abstract void d(boolean z10);

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        if (this.v) {
            f(this.E, this.f36177a, this.f36187y);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f11 = this.f36180e;
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (kVar != null && kVar.getActionMode() != null) {
            f7 = this.d.getActionMode().getAlpha();
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.ActionBar.k kVar2 = this.d;
        if (kVar2 == null) {
            f10 = 0.0f;
        } else {
            f10 = kVar2.f21278o0;
        }
        float max = Math.max(f7, f10) * f11;
        if (this.f36177a != null && this.d != null && max > 0.0f) {
            if (this.P == null) {
                this.P = new Paint();
            }
            this.P.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21172w8, false));
            if (max == 1.0f) {
                canvas.save();
            } else {
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.O, (int) (max * 255.0f), 31);
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.O, this.P);
            canvas.translate(this.d.getX(), this.d.getY());
            canvas.save();
            canvas.translate(this.d.getBackButton().getX(), this.d.getBackButton().getY());
            this.d.getBackButton().draw(canvas);
            canvas.restore();
            if (this.d.getActionMode() != null) {
                if (max != this.d.getActionMode().getAlpha() * this.f36180e) {
                    this.d.draw(canvas);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.O, (int) (this.d.getActionMode().getAlpha() * 255.0f), 31);
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
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (view == kVar && kVar.getActionMode() != null && this.d.getActionMode().getAlpha() == 1.0f) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public abstract void e(boolean z10);

    public final void g() {
        if (!this.v && c()) {
            setOpenProgress(this.f36180e);
            View view = this.f36178b;
            if (view != null) {
                view.setTranslationX((1.0f - this.f36180e) * (getMeasuredWidth() - AndroidUtilities.dp(getRightPaddingSize())));
            }
            org.telegram.ui.ActionBar.k kVar = this.d;
            if (kVar != null) {
                kVar.setTranslationX((1.0f - this.f36180e) * AndroidUtilities.dp(48.0f));
            }
            tx txVar = this.f36177a;
            if (txVar != null) {
                txVar.setPreviewOpenedProgress(this.f36180e);
            }
            invalidate();
        }
    }

    public long getCurrentFragmetDialogId() {
        return Q;
    }

    public org.telegram.ui.ActionBar.n2 getFragment() {
        return this.f36177a;
    }

    public View getFragmentView() {
        return this.f36178b;
    }

    public abstract boolean getOccupyStatusbar();

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (getOccupyStatusbar()) {
            i12 = AndroidUtilities.statusBarHeight;
        } else {
            i12 = 0;
        }
        View view = this.f36178b;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(getRightPaddingSize());
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + this.f36184s;
        }
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (kVar != null) {
            ((FrameLayout.LayoutParams) kVar.getLayoutParams()).topMargin = i12;
        }
        super.onMeasure(i10, i11);
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (this.F != measuredWidth) {
            this.F = measuredWidth;
            g();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.c5 c5Var = this.f36185w;
        if ((c5Var != null && ((ActionBarLayout) c5Var).y()) || !c() || !this.M) {
            return false;
        }
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.G = motionEvent.getPointerId(0);
            this.H = true;
            this.J = (int) motionEvent.getX();
            this.K = (int) motionEvent.getY();
            VelocityTracker velocityTracker = this.L;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.G) {
            if (this.L == null) {
                this.L = VelocityTracker.obtain();
            }
            int max = Math.max(0, (int) (motionEvent.getX() - this.J));
            int abs = Math.abs(((int) motionEvent.getY()) - this.K);
            this.L.addMovement(motionEvent);
            if (this.H && !this.I && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs) {
                if (ActionBarLayout.u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                    this.H = false;
                    this.I = true;
                    this.J = (int) motionEvent.getX();
                    e(false);
                } else {
                    this.H = false;
                }
            } else if (this.I) {
                float f7 = max;
                this.N = f7;
                this.f36180e = Utilities.clamp(1.0f - (f7 / getMeasuredWidth()), 1.0f, 0.0f);
                g();
            }
        } else if (motionEvent != null && motionEvent.getPointerId(0) == this.G && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
            if (this.L == null) {
                this.L = VelocityTracker.obtain();
            }
            this.L.computeCurrentVelocity(1000);
            if (this.I) {
                float f10 = this.N;
                float xVelocity = this.L.getXVelocity();
                float yVelocity = this.L.getYVelocity();
                if (f10 < getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f36180e, 1.0f);
                    this.h = ofFloat;
                    ofFloat.addUpdateListener(new c41(this, 2));
                    this.h.addListener(new e41(this, 1));
                    this.h.setDuration(250L);
                    this.h.setInterpolator(org.telegram.ui.Components.tr.f31140f);
                    this.h.start();
                } else {
                    b();
                }
            }
            this.H = false;
            this.I = false;
            VelocityTracker velocityTracker2 = this.L;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.L = null;
            }
        } else if (motionEvent == null) {
            this.H = false;
            this.I = false;
            VelocityTracker velocityTracker3 = this.L;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.L = null;
            }
        }
        return this.I;
    }

    @Override
    public final void removeView(View view) {
        super.removeView(view);
        if (view == this.f36178b) {
            a();
        }
    }

    @Override
    public final void removeViewInLayout(View view) {
        super.removeViewInLayout(view);
        if (view == this.f36178b) {
            a();
        }
    }

    public void setCurrentTop(int i10) {
        this.O = i10;
        View view = this.f36178b;
        if (view != null) {
            view.setTranslationY((i10 - view.getTop()) + this.f36184s);
        }
        k0 k0Var = this.f36179c;
        if (k0Var != null) {
            k0Var.setTranslationY(i10 - k0Var.getTop());
        }
    }

    public void setFragmentViewPadding(int i10) {
        this.f36184s = i10;
    }

    public void setTransitionPaddingBottom(int i10) {
        tx txVar = this.f36177a;
        if (com.google.android.gms.internal.vision.e2.u(txVar)) {
            float f7 = i10;
            txVar.X0 = f7;
            txVar.h.setTranslationY(((-f7) - txVar.f43175e1) - txVar.f43172d1);
        }
    }

    public void setOpenProgress(float f7) {
    }
}
