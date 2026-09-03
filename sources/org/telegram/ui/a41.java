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
public abstract class a41 extends FrameLayout {
    public static long N;
    public static final int O = 0;
    public rx B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public VelocityTracker I;
    public boolean J;
    public float K;
    public float L;
    public Paint M;
    public rx f35012a;
    public View f35013b;
    public l0 f35014c;
    public org.telegram.ui.ActionBar.k d;
    public float f35015e;
    public boolean f35016f;
    public ValueAnimator h;
    public AnimationNotificationsLocker f35017n;
    public boolean f35018r;
    public int f35019s;
    public boolean v;
    public org.telegram.ui.ActionBar.f5 f35020w;
    public o1.j f35021x;
    public float f35022y;

    public static void f(org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.p2 p2Var2, float f10) {
        int measuredWidth;
        if (p2Var != null || p2Var2 != null) {
            if (p2Var != null) {
                measuredWidth = p2Var.getFragmentView().getMeasuredWidth();
            } else {
                measuredWidth = p2Var2.getFragmentView().getMeasuredWidth();
            }
            if (p2Var != null) {
                if (p2Var.getFragmentView() != null) {
                    p2Var.getFragmentView().setAlpha(1.0f - f10);
                    p2Var.getFragmentView().setTranslationX(measuredWidth * 0.6f * f10);
                }
                p2Var.setPreviewOpenedProgress(1.0f - f10);
            }
            if (p2Var2 != null) {
                if (p2Var2.getFragmentView() != null) {
                    p2Var2.getFragmentView().setAlpha(1.0f);
                    p2Var2.getFragmentView().setTranslationX((1.0f - f10) * measuredWidth);
                }
                p2Var2.setPreviewReplaceProgress(f10);
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
        if (!this.f35016f) {
            return;
        }
        e(false);
        b();
    }

    public final void b() {
        this.f35016f = false;
        if (!SharedConfig.animationsEnabled()) {
            this.f35015e = 0.0f;
            g();
            rx rxVar = this.f35012a;
            if (rxVar != null) {
                rxVar.onPause();
                this.f35012a.onFragmentDestroy();
                removeAllViews();
                this.f35012a = null;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
            d(false);
            return;
        }
        this.f35017n.lock();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f35015e, 0.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new x31(this, 0));
        this.h.addListener(new z31(this, 0));
        this.h.setDuration(250L);
        this.h.setInterpolator(org.telegram.ui.Components.pr.f30168f);
        this.h.start();
    }

    public final boolean c() {
        if (this.f35012a != null) {
            return true;
        }
        return false;
    }

    public abstract void d(boolean z4);

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        if (this.v) {
            f(this.B, this.f35012a, this.f35022y);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f12 = this.f35015e;
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
            f11 = kVar2.f21550l0;
        }
        float max = Math.max(f10, f11) * f12;
        if (this.f35012a != null && this.d != null && max > 0.0f) {
            if (this.M == null) {
                this.M = new Paint();
            }
            this.M.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22002w8, false));
            if (max == 1.0f) {
                canvas.save();
            } else {
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.L, (int) (max * 255.0f), 31);
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.L, this.M);
            canvas.translate(this.d.getX(), this.d.getY());
            canvas.save();
            canvas.translate(this.d.getBackButton().getX(), this.d.getBackButton().getY());
            this.d.getBackButton().draw(canvas);
            canvas.restore();
            if (this.d.getActionMode() != null) {
                if (max != this.d.getActionMode().getAlpha() * this.f35015e) {
                    this.d.draw(canvas);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.L, (int) (this.d.getActionMode().getAlpha() * 255.0f), 31);
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

    public abstract void e(boolean z4);

    public final void g() {
        if (!this.v && c()) {
            setOpenProgress(this.f35015e);
            View view = this.f35013b;
            if (view != null) {
                view.setTranslationX((1.0f - this.f35015e) * (getMeasuredWidth() - AndroidUtilities.dp(getRightPaddingSize())));
            }
            org.telegram.ui.ActionBar.k kVar = this.d;
            if (kVar != null) {
                kVar.setTranslationX((1.0f - this.f35015e) * AndroidUtilities.dp(48.0f));
            }
            rx rxVar = this.f35012a;
            if (rxVar != null) {
                rxVar.setPreviewOpenedProgress(this.f35015e);
            }
            invalidate();
        }
    }

    public long getCurrentFragmetDialogId() {
        return N;
    }

    public org.telegram.ui.ActionBar.p2 getFragment() {
        return this.f35012a;
    }

    public View getFragmentView() {
        return this.f35013b;
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
        View view = this.f35013b;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(getRightPaddingSize());
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12 + this.f35019s;
        }
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (kVar != null) {
            ((FrameLayout.LayoutParams) kVar.getLayoutParams()).topMargin = i12;
        }
        super.onMeasure(i10, i11);
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (this.C != measuredWidth) {
            this.C = measuredWidth;
            g();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f5 f5Var = this.f35020w;
        if ((f5Var != null && ((ActionBarLayout) f5Var).y()) || !c() || !this.J) {
            return false;
        }
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.D = motionEvent.getPointerId(0);
            this.E = true;
            this.G = (int) motionEvent.getX();
            this.H = (int) motionEvent.getY();
            VelocityTracker velocityTracker = this.I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.D) {
            if (this.I == null) {
                this.I = VelocityTracker.obtain();
            }
            int max = Math.max(0, (int) (motionEvent.getX() - this.G));
            int abs = Math.abs(((int) motionEvent.getY()) - this.H);
            this.I.addMovement(motionEvent);
            if (this.E && !this.F && max >= AndroidUtilities.getPixelsInCM(0.4f, true) && Math.abs(max) / 3 > abs) {
                if (ActionBarLayout.u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                    this.E = false;
                    this.F = true;
                    this.G = (int) motionEvent.getX();
                    e(false);
                } else {
                    this.E = false;
                }
            } else if (this.F) {
                float f10 = max;
                this.K = f10;
                this.f35015e = Utilities.clamp(1.0f - (f10 / getMeasuredWidth()), 1.0f, 0.0f);
                g();
            }
        } else if (motionEvent != null && motionEvent.getPointerId(0) == this.D && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
            if (this.I == null) {
                this.I = VelocityTracker.obtain();
            }
            this.I.computeCurrentVelocity(1000);
            if (this.F) {
                float f11 = this.K;
                float xVelocity = this.I.getXVelocity();
                float yVelocity = this.I.getYVelocity();
                if (f11 < getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f35015e, 1.0f);
                    this.h = ofFloat;
                    ofFloat.addUpdateListener(new x31(this, 2));
                    this.h.addListener(new z31(this, 1));
                    this.h.setDuration(250L);
                    this.h.setInterpolator(org.telegram.ui.Components.pr.f30168f);
                    this.h.start();
                } else {
                    b();
                }
            }
            this.E = false;
            this.F = false;
            VelocityTracker velocityTracker2 = this.I;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.I = null;
            }
        } else if (motionEvent == null) {
            this.E = false;
            this.F = false;
            VelocityTracker velocityTracker3 = this.I;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.I = null;
            }
        }
        return this.F;
    }

    @Override
    public final void removeView(View view) {
        super.removeView(view);
        if (view == this.f35013b) {
            a();
        }
    }

    @Override
    public final void removeViewInLayout(View view) {
        super.removeViewInLayout(view);
        if (view == this.f35013b) {
            a();
        }
    }

    public void setCurrentTop(int i10) {
        this.L = i10;
        View view = this.f35013b;
        if (view != null) {
            view.setTranslationY((i10 - view.getTop()) + this.f35019s);
        }
        l0 l0Var = this.f35014c;
        if (l0Var != null) {
            l0Var.setTranslationY(i10 - l0Var.getTop());
        }
    }

    public void setFragmentViewPadding(int i10) {
        this.f35019s = i10;
    }

    public void setTransitionPaddingBottom(int i10) {
        rx rxVar = this.f35012a;
        if (e2.c.s(rxVar)) {
            float f10 = i10;
            rxVar.U0 = f10;
            rxVar.h.setTranslationY(((-f10) - rxVar.f41193b1) - rxVar.f41190a1);
        }
    }

    public void setOpenProgress(float f10) {
    }
}
