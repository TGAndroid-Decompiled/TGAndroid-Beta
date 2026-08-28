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
public abstract class h31 extends FrameLayout {
    public static long M;
    public static final int N = 0;
    public fx A;
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
    public fx f38661a;
    public View f38662b;
    public m0 f38663c;
    public org.telegram.ui.ActionBar.k d;
    public float f38664e;
    public boolean f38665f;
    public ValueAnimator h;
    public AnimationNotificationsLocker f38666n;
    public boolean f38667r;
    public int f38668s;
    public boolean v;
    public org.telegram.ui.ActionBar.b5 f38669w;
    public o1.j f38670x;
    public float f38671y;

    public static void f(org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.o2 o2Var2, float f10) {
        int measuredWidth;
        if (o2Var != null || o2Var2 != null) {
            if (o2Var != null) {
                measuredWidth = o2Var.getFragmentView().getMeasuredWidth();
            } else {
                measuredWidth = o2Var2.getFragmentView().getMeasuredWidth();
            }
            if (o2Var != null) {
                if (o2Var.getFragmentView() != null) {
                    o2Var.getFragmentView().setAlpha(1.0f - f10);
                    o2Var.getFragmentView().setTranslationX(measuredWidth * 0.6f * f10);
                }
                o2Var.setPreviewOpenedProgress(1.0f - f10);
            }
            if (o2Var2 != null) {
                if (o2Var2.getFragmentView() != null) {
                    o2Var2.getFragmentView().setAlpha(1.0f);
                    o2Var2.getFragmentView().setTranslationX((1.0f - f10) * measuredWidth);
                }
                o2Var2.setPreviewReplaceProgress(f10);
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
        if (!this.f38665f) {
            return;
        }
        e(false);
        b();
    }

    public final void b() {
        this.f38665f = false;
        if (!SharedConfig.animationsEnabled()) {
            this.f38664e = 0.0f;
            g();
            fx fxVar = this.f38661a;
            if (fxVar != null) {
                fxVar.onPause();
                this.f38661a.onFragmentDestroy();
                removeAllViews();
                this.f38661a = null;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
            d(false);
            return;
        }
        this.f38666n.lock();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38664e, 0.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new e31(this, 0));
        this.h.addListener(new g31(this, 0));
        this.h.setDuration(250L);
        this.h.setInterpolator(org.telegram.ui.Components.gr.f28844f);
        this.h.start();
    }

    public final boolean c() {
        if (this.f38661a != null) {
            return true;
        }
        return false;
    }

    public abstract void d(boolean z10);

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        if (this.v) {
            f(this.A, this.f38661a, this.f38671y);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f12 = this.f38664e;
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (kVar != null && kVar.getActionMode() != null) {
            f10 = this.d.getActionMode().getAlpha();
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.ActionBar.k kVar2 = this.d;
        if (kVar2 == null) {
            f11 = 0.0f;
        } else {
            f11 = kVar2.f23579k0;
        }
        float max = Math.max(f10, f11) * f12;
        if (this.f38661a != null && this.d != null && max > 0.0f) {
            if (this.L == null) {
                this.L = new Paint();
            }
            this.L.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.w8, false));
            if (max == 1.0f) {
                canvas.save();
            } else {
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.K, (int) (max * 255.0f), 31);
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.K, this.L);
            canvas.translate(this.d.getX(), this.d.getY());
            canvas.save();
            canvas.translate(this.d.getBackButton().getX(), this.d.getBackButton().getY());
            this.d.getBackButton().draw(canvas);
            canvas.restore();
            if (this.d.getActionMode() != null) {
                if (max != this.d.getActionMode().getAlpha() * this.f38664e) {
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
        if (!this.v && c()) {
            setOpenProgress(this.f38664e);
            View view = this.f38662b;
            if (view != null) {
                view.setTranslationX((1.0f - this.f38664e) * (getMeasuredWidth() - AndroidUtilities.dp(getRightPaddingSize())));
            }
            org.telegram.ui.ActionBar.k kVar = this.d;
            if (kVar != null) {
                kVar.setTranslationX((1.0f - this.f38664e) * AndroidUtilities.dp(48.0f));
            }
            fx fxVar = this.f38661a;
            if (fxVar != null) {
                fxVar.setPreviewOpenedProgress(this.f38664e);
            }
            invalidate();
        }
    }

    public long getCurrentFragmetDialogId() {
        return M;
    }

    public org.telegram.ui.ActionBar.o2 getFragment() {
        return this.f38661a;
    }

    public View getFragmentView() {
        return this.f38662b;
    }

    public abstract boolean getOccupyStatusbar();

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        if (getOccupyStatusbar()) {
            i11 = AndroidUtilities.statusBarHeight;
        } else {
            i11 = 0;
        }
        View view = this.f38662b;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(getRightPaddingSize());
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11 + this.f38668s;
        }
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (kVar != null) {
            ((FrameLayout.LayoutParams) kVar.getLayoutParams()).topMargin = i11;
        }
        super.onMeasure(i9, i10);
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (this.B != measuredWidth) {
            this.B = measuredWidth;
            g();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b5 b5Var = this.f38669w;
        if ((b5Var != null && ((ActionBarLayout) b5Var).y()) || !c() || !this.I) {
            return false;
        }
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
            int max = Math.max(0, (int) (motionEvent.getX() - this.F));
            int abs = Math.abs(((int) motionEvent.getY()) - this.G);
            this.H.addMovement(motionEvent);
            if (this.D && !this.E && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs) {
                if (ActionBarLayout.u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                    this.D = false;
                    this.E = true;
                    this.F = (int) motionEvent.getX();
                    e(false);
                } else {
                    this.D = false;
                }
            } else if (this.E) {
                float f10 = max;
                this.J = f10;
                this.f38664e = Utilities.clamp(1.0f - (f10 / getMeasuredWidth()), 1.0f, 0.0f);
                g();
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
                if (f11 < getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38664e, 1.0f);
                    this.h = ofFloat;
                    ofFloat.addUpdateListener(new e31(this, 2));
                    this.h.addListener(new g31(this, 1));
                    this.h.setDuration(250L);
                    this.h.setInterpolator(org.telegram.ui.Components.gr.f28844f);
                    this.h.start();
                } else {
                    b();
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
        if (view == this.f38662b) {
            a();
        }
    }

    @Override
    public final void removeViewInLayout(View view) {
        super.removeViewInLayout(view);
        if (view == this.f38662b) {
            a();
        }
    }

    public void setCurrentTop(int i9) {
        this.K = i9;
        View view = this.f38662b;
        if (view != null) {
            view.setTranslationY((i9 - view.getTop()) + this.f38668s);
        }
        m0 m0Var = this.f38663c;
        if (m0Var != null) {
            m0Var.setTranslationY(i9 - m0Var.getTop());
        }
    }

    public void setFragmentViewPadding(int i9) {
        this.f38668s = i9;
    }

    public void setTransitionPaddingBottom(int i9) {
        fx fxVar = this.f38661a;
        if (e2.c.v(fxVar)) {
            float f10 = i9;
            fxVar.T0 = f10;
            fxVar.h.setTranslationY(((-f10) - fxVar.f43743a1) - fxVar.Z0);
        }
    }

    public void setOpenProgress(float f10) {
    }
}
