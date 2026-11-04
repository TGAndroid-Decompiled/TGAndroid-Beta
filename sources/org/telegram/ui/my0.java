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
public abstract class my0 extends FrameLayout {
    public static long R;
    public static final int S = 0;
    public float E;
    public wv F;
    public int G;
    public int H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public VelocityTracker M;
    public boolean N;
    public float O;
    public float P;
    public Paint Q;
    public wv f47825a;
    public View f47826b;
    public l0 f47827c;
    public org.telegram.ui.ActionBar.k d;
    public float f47828e;
    public boolean f47829f;
    public ValueAnimator h;
    public g2.g f47830n;
    public boolean f47831r;
    public int f47832s;
    public boolean f47833w;
    public org.telegram.ui.ActionBar.q4 f47834x;
    public q1.g f47835y;

    public static void f(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.d2 d2Var2, float f10) {
        int measuredWidth;
        if (d2Var != null || d2Var2 != null) {
            if (d2Var != null) {
                measuredWidth = d2Var.getFragmentView().getMeasuredWidth();
            } else {
                measuredWidth = d2Var2.getFragmentView().getMeasuredWidth();
            }
            if (d2Var != null) {
                if (d2Var.getFragmentView() != null) {
                    d2Var.getFragmentView().setAlpha(1.0f - f10);
                    d2Var.getFragmentView().setTranslationX(measuredWidth * 0.6f * f10);
                }
                d2Var.setPreviewOpenedProgress(1.0f - f10);
            }
            if (d2Var2 != null) {
                if (d2Var2.getFragmentView() != null) {
                    d2Var2.getFragmentView().setAlpha(1.0f);
                    d2Var2.getFragmentView().setTranslationX((1.0f - f10) * measuredWidth);
                }
                d2Var2.setPreviewReplaceProgress(f10);
            }
        }
    }

    public static int getRightPaddingSize() {
        if (org.telegram.messenger.az.f21654p1) {
            return 74;
        }
        return 76;
    }

    public final void a() {
        if (!this.f47829f) {
            return;
        }
        e(false);
        b();
    }

    public final void b() {
        this.f47829f = false;
        if (!org.telegram.messenger.az.c()) {
            this.f47828e = 0.0f;
            g();
            wv wvVar = this.f47825a;
            if (wvVar != null) {
                wvVar.onPause();
                this.f47825a.onFragmentDestroy();
                removeAllViews();
                this.f47825a = null;
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23297r4, new Object[0]);
            }
            d(false);
            return;
        }
        this.f47830n.d();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f47828e, 0.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new jy0(this, 0));
        this.h.addListener(new ly0(this, 0));
        this.h.setDuration(250L);
        this.h.setInterpolator(org.telegram.ui.Components.xq.f40452f);
        this.h.start();
    }

    public final boolean c() {
        if (this.f47825a != null) {
            return true;
        }
        return false;
    }

    public abstract void d(boolean z10);

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        if (this.f47833w) {
            f(this.F, this.f47825a, this.E);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f12 = this.f47828e;
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
            f11 = kVar2.f27730p0;
        }
        float max = Math.max(f10, f11) * f12;
        if (this.f47825a != null && this.d != null && max > 0.0f) {
            if (this.Q == null) {
                this.Q = new Paint();
            }
            this.Q.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28236w8, false));
            if (max == 1.0f) {
                canvas.save();
            } else {
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.P, (int) (max * 255.0f), 31);
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.P, this.Q);
            canvas.translate(this.d.getX(), this.d.getY());
            canvas.save();
            canvas.translate(this.d.getBackButton().getX(), this.d.getBackButton().getY());
            this.d.getBackButton().draw(canvas);
            canvas.restore();
            if (this.d.getActionMode() != null) {
                if (max != this.d.getActionMode().getAlpha() * this.f47828e) {
                    this.d.draw(canvas);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), this.P, (int) (this.d.getActionMode().getAlpha() * 255.0f), 31);
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
        if (!this.f47833w && c()) {
            setOpenProgress(this.f47828e);
            View view = this.f47826b;
            if (view != null) {
                view.setTranslationX((1.0f - this.f47828e) * (getMeasuredWidth() - org.telegram.messenger.g0.L(getRightPaddingSize())));
            }
            org.telegram.ui.ActionBar.k kVar = this.d;
            if (kVar != null) {
                kVar.setTranslationX((1.0f - this.f47828e) * org.telegram.messenger.g0.L(48.0f));
            }
            wv wvVar = this.f47825a;
            if (wvVar != null) {
                wvVar.setPreviewOpenedProgress(this.f47828e);
            }
            invalidate();
        }
    }

    public long getCurrentFragmetDialogId() {
        return R;
    }

    public org.telegram.ui.ActionBar.d2 getFragment() {
        return this.f47825a;
    }

    public View getFragmentView() {
        return this.f47826b;
    }

    public abstract boolean getOccupyStatusbar();

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        if (getOccupyStatusbar()) {
            i11 = org.telegram.messenger.g0.f22602m;
        } else {
            i11 = 0;
        }
        View view = this.f47826b;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(getRightPaddingSize());
            layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11 + this.f47832s;
        }
        org.telegram.ui.ActionBar.k kVar = this.d;
        if (kVar != null) {
            ((FrameLayout.LayoutParams) kVar.getLayoutParams()).topMargin = i11;
        }
        super.onMeasure(i3, i10);
        int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
        if (this.G != measuredWidth) {
            this.G = measuredWidth;
            g();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.q4 q4Var = this.f47834x;
        if ((q4Var != null && ((ActionBarLayout) q4Var).y()) || !c() || !this.N) {
            return false;
        }
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.H = motionEvent.getPointerId(0);
            this.I = true;
            this.K = (int) motionEvent.getX();
            this.L = (int) motionEvent.getY();
            VelocityTracker velocityTracker = this.M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.H) {
            if (this.M == null) {
                this.M = VelocityTracker.obtain();
            }
            int max = Math.max(0, (int) (motionEvent.getX() - this.K));
            int abs = Math.abs(((int) motionEvent.getY()) - this.L);
            this.M.addMovement(motionEvent);
            if (this.I && !this.J && max >= org.telegram.messenger.g0.a1(true, 0.4f) && Math.abs(max) / 3 > abs) {
                if (ActionBarLayout.u(this, motionEvent.getX(), motionEvent.getY()) == null) {
                    this.I = false;
                    this.J = true;
                    this.K = (int) motionEvent.getX();
                    e(false);
                } else {
                    this.I = false;
                }
            } else if (this.J) {
                float f10 = max;
                this.O = f10;
                this.f47828e = Utilities.i(1.0f - (f10 / getMeasuredWidth()), 1.0f, 0.0f);
                g();
            }
        } else if (motionEvent != null && motionEvent.getPointerId(0) == this.H && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
            if (this.M == null) {
                this.M = VelocityTracker.obtain();
            }
            this.M.computeCurrentVelocity(1000);
            if (this.J) {
                float f11 = this.O;
                float xVelocity = this.M.getXVelocity();
                float yVelocity = this.M.getYVelocity();
                if (f11 < getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f47828e, 1.0f);
                    this.h = ofFloat;
                    ofFloat.addUpdateListener(new jy0(this, 2));
                    this.h.addListener(new ly0(this, 1));
                    this.h.setDuration(250L);
                    this.h.setInterpolator(org.telegram.ui.Components.xq.f40452f);
                    this.h.start();
                } else {
                    b();
                }
            }
            this.I = false;
            this.J = false;
            VelocityTracker velocityTracker2 = this.M;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.M = null;
            }
        } else if (motionEvent == null) {
            this.I = false;
            this.J = false;
            VelocityTracker velocityTracker3 = this.M;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.M = null;
            }
        }
        return this.J;
    }

    @Override
    public final void removeView(View view) {
        super.removeView(view);
        if (view == this.f47826b) {
            a();
        }
    }

    @Override
    public final void removeViewInLayout(View view) {
        super.removeViewInLayout(view);
        if (view == this.f47826b) {
            a();
        }
    }

    public void setCurrentTop(int i3) {
        this.P = i3;
        View view = this.f47826b;
        if (view != null) {
            view.setTranslationY((i3 - view.getTop()) + this.f47832s);
        }
        l0 l0Var = this.f47827c;
        if (l0Var != null) {
            l0Var.setTranslationY(i3 - l0Var.getTop());
        }
    }

    public void setFragmentViewPadding(int i3) {
        this.f47832s = i3;
    }

    public void setTransitionPaddingBottom(int i3) {
        wv wvVar = this.f47825a;
        if (com.google.android.recaptcha.internal.a.u(wvVar)) {
            float f10 = i3;
            wvVar.Y0 = f10;
            wvVar.h.setTranslationY(((-f10) - wvVar.f47593g1) - wvVar.f47591f1);
        }
    }

    public void setOpenProgress(float f10) {
    }
}
