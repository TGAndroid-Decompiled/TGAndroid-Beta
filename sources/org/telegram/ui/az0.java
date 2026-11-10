package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public abstract class az0 extends FrameLayout {
    public static long Q;
    public static final int R = 0;
    public float D;
    public cw E;
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
    public cw f43844a;
    public View f43845b;
    public k0 f43846c;
    public org.telegram.ui.ActionBar.l d;
    public float f43847e;
    public boolean f43848f;
    public ValueAnimator h;
    public h2.f f43849n;
    public boolean f43850r;
    public int f43851s;
    public boolean f43852w;
    public org.telegram.ui.ActionBar.r4 f43853x;
    public r1.g f43854y;

    public static void f(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f2 f2Var2, float f10) {
        int measuredWidth;
        if (f2Var != null || f2Var2 != null) {
            if (f2Var != null) {
                measuredWidth = f2Var.getFragmentView().getMeasuredWidth();
            } else {
                measuredWidth = f2Var2.getFragmentView().getMeasuredWidth();
            }
            if (f2Var != null) {
                if (f2Var.getFragmentView() != null) {
                    f2Var.getFragmentView().setAlpha(1.0f - f10);
                    f2Var.getFragmentView().setTranslationX(measuredWidth * 0.6f * f10);
                }
                f2Var.setPreviewOpenedProgress(1.0f - f10);
            }
            if (f2Var2 != null) {
                if (f2Var2.getFragmentView() != null) {
                    f2Var2.getFragmentView().setAlpha(1.0f);
                    f2Var2.getFragmentView().setTranslationX((1.0f - f10) * measuredWidth);
                }
                f2Var2.setPreviewReplaceProgress(f10);
            }
        }
    }

    public static int getRightPaddingSize() {
        if (org.telegram.messenger.iz.f23431p1) {
            return 74;
        }
        return 76;
    }

    public final void a() {
        if (!this.f43848f) {
            return;
        }
        e(false);
        b();
    }

    public final void b() {
        this.f43848f = false;
        if (!org.telegram.messenger.iz.c()) {
            this.f43847e = 0.0f;
            g();
            cw cwVar = this.f43844a;
            if (cwVar != null) {
                cwVar.onPause();
                this.f43844a.onFragmentDestroy();
                removeAllViews();
                this.f43844a = null;
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25072r4, new Object[0]);
            }
            d(false);
            return;
        }
        this.f43849n.d();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f43847e, 0.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new xy0(this, 0));
        this.h.addListener(new zy0(this, 0));
        this.h.setDuration(250L);
        this.h.setInterpolator(org.telegram.ui.Components.wq.f40046f);
        this.h.start();
    }

    public final boolean c() {
        if (this.f43844a != null) {
            return true;
        }
        return false;
    }

    public abstract void d(boolean z9);

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        if (this.f43852w) {
            f(this.E, this.f43844a, this.D);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f12 = this.f43847e;
        org.telegram.ui.ActionBar.l lVar = this.d;
        if (lVar != null && lVar.getActionMode() != null) {
            f10 = this.d.getActionMode().getAlpha();
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.ActionBar.l lVar2 = this.d;
        if (lVar2 == null) {
            f11 = 0.0f;
        } else {
            f11 = lVar2.f27692o0;
        }
        float max = Math.max(f10, f11) * f12;
        if (this.f43844a != null && this.d != null && max > 0.0f) {
            if (this.P == null) {
                this.P = new Paint();
            }
            this.P.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28246w8, false));
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
                if (max != this.d.getActionMode().getAlpha() * this.f43847e) {
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
        org.telegram.ui.ActionBar.l lVar = this.d;
        if (view == lVar && lVar.getActionMode() != null && this.d.getActionMode().getAlpha() == 1.0f) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public abstract void e(boolean z9);

    public final void g() {
        if (!this.f43852w && c()) {
            setOpenProgress(this.f43847e);
            View view = this.f43845b;
            if (view != null) {
                view.setTranslationX((1.0f - this.f43847e) * (getMeasuredWidth() - org.telegram.messenger.g0.L(getRightPaddingSize())));
            }
            org.telegram.ui.ActionBar.l lVar = this.d;
            if (lVar != null) {
                lVar.setTranslationX((1.0f - this.f43847e) * org.telegram.messenger.g0.L(48.0f));
            }
            cw cwVar = this.f43844a;
            if (cwVar != null) {
                cwVar.setPreviewOpenedProgress(this.f43847e);
            }
            invalidate();
        }
    }

    public long getCurrentFragmetDialogId() {
        return Q;
    }

    public org.telegram.ui.ActionBar.f2 getFragment() {
        return this.f43844a;
    }

    public View getFragmentView() {
        return this.f43845b;
    }

    public abstract boolean getOccupyStatusbar();

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        if (getOccupyStatusbar()) {
            i11 = org.telegram.messenger.g0.f22561m;
        } else {
            i11 = 0;
        }
        View view = this.f43845b;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(getRightPaddingSize());
            layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11 + this.f43851s;
        }
        org.telegram.ui.ActionBar.l lVar = this.d;
        if (lVar != null) {
            ((FrameLayout.LayoutParams) lVar.getLayoutParams()).topMargin = i11;
        }
        super.onMeasure(i7, i10);
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (this.F != measuredWidth) {
            this.F = measuredWidth;
            g();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.r4 r4Var = this.f43853x;
        if ((r4Var != null && ((ActionBarLayout) r4Var).y()) || !c() || !this.M) {
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
            if (this.H && !this.I && max >= org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(max) / 3 > abs) {
                if (ActionBarLayout.u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                    this.H = false;
                    this.I = true;
                    this.J = (int) motionEvent.getX();
                    e(false);
                } else {
                    this.H = false;
                }
            } else if (this.I) {
                float f10 = max;
                this.N = f10;
                this.f43847e = Utilities.i(1.0f - (f10 / getMeasuredWidth()), 1.0f, 0.0f);
                g();
            }
        } else if (motionEvent != null && motionEvent.getPointerId(0) == this.G && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
            if (this.L == null) {
                this.L = VelocityTracker.obtain();
            }
            this.L.computeCurrentVelocity(1000);
            if (this.I) {
                float f11 = this.N;
                float xVelocity = this.L.getXVelocity();
                float yVelocity = this.L.getYVelocity();
                if (f11 < getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f43847e, 1.0f);
                    this.h = ofFloat;
                    ofFloat.addUpdateListener(new xy0(this, 2));
                    this.h.addListener(new zy0(this, 1));
                    this.h.setDuration(250L);
                    this.h.setInterpolator(org.telegram.ui.Components.wq.f40046f);
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
        if (view == this.f43845b) {
            a();
        }
    }

    @Override
    public final void removeViewInLayout(View view) {
        super.removeViewInLayout(view);
        if (view == this.f43845b) {
            a();
        }
    }

    public void setCurrentTop(int i7) {
        this.O = i7;
        View view = this.f43845b;
        if (view != null) {
            view.setTranslationY((i7 - view.getTop()) + this.f43851s);
        }
        k0 k0Var = this.f43846c;
        if (k0Var != null) {
            k0Var.setTranslationY(i7 - k0Var.getTop());
        }
    }

    public void setFragmentViewPadding(int i7) {
        this.f43851s = i7;
    }

    public void setTransitionPaddingBottom(int i7) {
        cw cwVar = this.f43844a;
        if (com.google.android.recaptcha.internal.a.u(cwVar)) {
            float f10 = i7;
            cwVar.X0 = f10;
            cwVar.h.setTranslationY(((-f10) - cwVar.f52359f1) - cwVar.f52356e1);
        }
    }

    public void setOpenProgress(float f10) {
    }
}
