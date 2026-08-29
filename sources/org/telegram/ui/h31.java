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
    public hx A;
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
    public hx f38756a;
    public View f38757b;
    public n0 f38758c;
    public org.telegram.ui.ActionBar.l d;
    public float f38759e;
    public boolean f38760f;
    public ValueAnimator h;
    public AnimationNotificationsLocker f38761n;
    public boolean f38762r;
    public int f38763s;
    public boolean v;
    public org.telegram.ui.ActionBar.b5 f38764w;
    public o1.k f38765x;
    public float f38766y;

    public static void f(org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.o2 o2Var2, float f9) {
        int measuredWidth;
        if (o2Var != null || o2Var2 != null) {
            if (o2Var != null) {
                measuredWidth = o2Var.getFragmentView().getMeasuredWidth();
            } else {
                measuredWidth = o2Var2.getFragmentView().getMeasuredWidth();
            }
            if (o2Var != null) {
                if (o2Var.getFragmentView() != null) {
                    o2Var.getFragmentView().setAlpha(1.0f - f9);
                    o2Var.getFragmentView().setTranslationX(measuredWidth * 0.6f * f9);
                }
                o2Var.setPreviewOpenedProgress(1.0f - f9);
            }
            if (o2Var2 != null) {
                if (o2Var2.getFragmentView() != null) {
                    o2Var2.getFragmentView().setAlpha(1.0f);
                    o2Var2.getFragmentView().setTranslationX((1.0f - f9) * measuredWidth);
                }
                o2Var2.setPreviewReplaceProgress(f9);
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
        if (!this.f38760f) {
            return;
        }
        e(false);
        b();
    }

    public final void b() {
        this.f38760f = false;
        if (!SharedConfig.animationsEnabled()) {
            this.f38759e = 0.0f;
            g();
            hx hxVar = this.f38756a;
            if (hxVar != null) {
                hxVar.onPause();
                this.f38756a.onFragmentDestroy();
                removeAllViews();
                this.f38756a = null;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            }
            d(false);
            return;
        }
        this.f38761n.lock();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38759e, 0.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new e31(this, 0));
        this.h.addListener(new g31(this, 0));
        this.h.setDuration(250L);
        this.h.setInterpolator(org.telegram.ui.Components.jr.f29800f);
        this.h.start();
    }

    public final boolean c() {
        if (this.f38756a != null) {
            return true;
        }
        return false;
    }

    public abstract void d(boolean z10);

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        float f10;
        if (this.v) {
            f(this.A, this.f38756a, this.f38766y);
            invalidate();
        }
        super.dispatchDraw(canvas);
        float f11 = this.f38759e;
        org.telegram.ui.ActionBar.l lVar = this.d;
        if (lVar != null && lVar.getActionMode() != null) {
            f9 = this.d.getActionMode().getAlpha();
        } else {
            f9 = 0.0f;
        }
        org.telegram.ui.ActionBar.l lVar2 = this.d;
        if (lVar2 == null) {
            f10 = 0.0f;
        } else {
            f10 = lVar2.f23614k0;
        }
        float max = Math.max(f9, f10) * f11;
        if (this.f38756a != null && this.d != null && max > 0.0f) {
            if (this.L == null) {
                this.L = new Paint();
            }
            this.L.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23403w8, false));
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
                if (max != this.d.getActionMode().getAlpha() * this.f38759e) {
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
        org.telegram.ui.ActionBar.l lVar = this.d;
        if (view == lVar && lVar.getActionMode() != null && this.d.getActionMode().getAlpha() == 1.0f) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public abstract void e(boolean z10);

    public final void g() {
        if (!this.v && c()) {
            setOpenProgress(this.f38759e);
            View view = this.f38757b;
            if (view != null) {
                view.setTranslationX((1.0f - this.f38759e) * (getMeasuredWidth() - AndroidUtilities.dp(getRightPaddingSize())));
            }
            org.telegram.ui.ActionBar.l lVar = this.d;
            if (lVar != null) {
                lVar.setTranslationX((1.0f - this.f38759e) * AndroidUtilities.dp(48.0f));
            }
            hx hxVar = this.f38756a;
            if (hxVar != null) {
                hxVar.setPreviewOpenedProgress(this.f38759e);
            }
            invalidate();
        }
    }

    public long getCurrentFragmetDialogId() {
        return M;
    }

    public org.telegram.ui.ActionBar.o2 getFragment() {
        return this.f38756a;
    }

    public View getFragmentView() {
        return this.f38757b;
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
        View view = this.f38757b;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(getRightPaddingSize());
            layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i12 + this.f38763s;
        }
        org.telegram.ui.ActionBar.l lVar = this.d;
        if (lVar != null) {
            ((FrameLayout.LayoutParams) lVar.getLayoutParams()).topMargin = i12;
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
        org.telegram.ui.ActionBar.b5 b5Var = this.f38764w;
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
                float f9 = max;
                this.J = f9;
                this.f38759e = Utilities.clamp(1.0f - (f9 / getMeasuredWidth()), 1.0f, 0.0f);
                g();
            }
        } else if (motionEvent != null && motionEvent.getPointerId(0) == this.C && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6)) {
            if (this.H == null) {
                this.H = VelocityTracker.obtain();
            }
            this.H.computeCurrentVelocity(1000);
            if (this.E) {
                float f10 = this.J;
                float xVelocity = this.H.getXVelocity();
                float yVelocity = this.H.getYVelocity();
                if (f10 < getMeasuredWidth() / 3.0f && (xVelocity < 3500.0f || xVelocity < yVelocity)) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38759e, 1.0f);
                    this.h = ofFloat;
                    ofFloat.addUpdateListener(new e31(this, 2));
                    this.h.addListener(new g31(this, 1));
                    this.h.setDuration(250L);
                    this.h.setInterpolator(org.telegram.ui.Components.jr.f29800f);
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
        if (view == this.f38757b) {
            a();
        }
    }

    @Override
    public final void removeViewInLayout(View view) {
        super.removeViewInLayout(view);
        if (view == this.f38757b) {
            a();
        }
    }

    public void setCurrentTop(int i10) {
        this.K = i10;
        View view = this.f38757b;
        if (view != null) {
            view.setTranslationY((i10 - view.getTop()) + this.f38763s);
        }
        n0 n0Var = this.f38758c;
        if (n0Var != null) {
            n0Var.setTranslationY(i10 - n0Var.getTop());
        }
    }

    public void setFragmentViewPadding(int i10) {
        this.f38763s = i10;
    }

    public void setTransitionPaddingBottom(int i10) {
        hx hxVar = this.f38756a;
        if (com.google.android.recaptcha.internal.a.u(hxVar)) {
            float f9 = i10;
            hxVar.T0 = f9;
            hxVar.h.setTranslationY(((-f9) - hxVar.f45157a1) - hxVar.Z0);
        }
    }

    public void setOpenProgress(float f9) {
    }
}
