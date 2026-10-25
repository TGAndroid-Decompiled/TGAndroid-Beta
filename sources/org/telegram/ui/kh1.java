package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kh1 extends FrameLayout {
    public float f40945a;
    public float f40946b;
    public boolean f40947c;
    public long d;
    public final ph1 e;

    public kh1(ph1 ph1Var, Activity activity) {
        super(activity);
        this.e = ph1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ph1 ph1Var = this.e;
        org.telegram.ui.Components.voip.d3 d3Var = ph1Var.v;
        if (view == d3Var && (ph1Var.f42536n0 || ph1Var.m0)) {
            return false;
        }
        if ((view != d3Var && view != ph1Var.f42514c0 && (view != ph1Var.Y || !ph1Var.f42508a0)) || (!ph1Var.f42524g1 && ph1Var.f42528i1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = ph1Var.f42522f1;
        canvas.scale(f7, f7, ph1Var.f42512b1, ph1Var.f42515c1);
        canvas.translate(ph1Var.Y0, ph1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ph1 ph1Var = this.e;
        yg1 yg1Var = ph1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ph1Var.f42551y.b(false, false);
            ph1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(yg1Var);
            if (ph1Var.f42538p0 == 3) {
                AndroidUtilities.runOnUIThread(yg1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.t2 t2Var;
        org.telegram.ui.Components.voip.e3 e3Var;
        ph1 ph1Var = this.e;
        yg1 yg1Var = ph1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ph1Var.f42551y.b(false, false);
            ph1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(yg1Var);
            if (ph1Var.f42538p0 == 3) {
                AndroidUtilities.runOnUIThread(yg1Var, 10000L);
            }
        }
        if (!ph1Var.f42526h1 && !ph1Var.f42509a1 && !ph1Var.f42524g1 && motionEvent.getActionMasked() != 0) {
            ph1.i(ph1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ph1Var.f42526h1 = false;
            ph1Var.f42509a1 = false;
            ph1Var.f42524g1 = false;
        }
        if (ph1Var.m0) {
            t2Var = ph1Var.f42514c0;
        } else {
            t2Var = ph1Var.f42516d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && ph1Var.f42509a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (ph1Var.f42517d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (ph1Var.f42519e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / ph1Var.X0;
                    ph1Var.f42522f1 = hypot;
                    if (hypot > 1.005f && !ph1Var.f42524g1) {
                        ph1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x9 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        ph1Var.f42512b1 = x9;
                        ph1Var.V0 = x9;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        ph1Var.f42515c1 = y3;
                        ph1Var.W0 = y3;
                        ph1Var.f42522f1 = 1.0f;
                        ph1Var.Y0 = 0.0f;
                        ph1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        ph1Var.f42524g1 = true;
                        ph1Var.f42509a1 = true;
                    }
                    float x10 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x11 = ph1Var.V0 - ((motionEvent.getX(i11) + x10) / 2.0f);
                    float y11 = ph1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = ph1Var.f42522f1;
                    ph1Var.Y0 = (-x11) / f7;
                    ph1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    ph1.i(ph1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ph1Var.f42517d1 == motionEvent.getPointerId(0) && ph1Var.f42519e1 == motionEvent.getPointerId(1)) || (ph1Var.f42517d1 == motionEvent.getPointerId(1) && ph1Var.f42519e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ph1.i(ph1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(t2Var.getX(), t2Var.getY(), t2Var.getX() + t2Var.getMeasuredWidth(), t2Var.getY() + t2Var.getMeasuredHeight());
                rectF.inset(((t2Var.getMeasuredHeight() * t2Var.T) - t2Var.getMeasuredHeight()) / 2.0f, ((t2Var.getMeasuredWidth() * t2Var.T) - t2Var.getMeasuredWidth()) / 2.0f);
                if (!v50.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, t2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, t2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ph1Var.f42526h1 = contains;
                if (!contains) {
                    ph1.i(ph1Var);
                }
            }
            if (ph1Var.f42526h1 && !ph1Var.f42509a1 && motionEvent.getPointerCount() == 2) {
                ph1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x12 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ph1Var.f42512b1 = x12;
                ph1Var.V0 = x12;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ph1Var.f42515c1 = y12;
                ph1Var.W0 = y12;
                ph1Var.f42522f1 = 1.0f;
                ph1Var.f42517d1 = motionEvent.getPointerId(0);
                ph1Var.f42519e1 = motionEvent.getPointerId(1);
                ph1Var.f42509a1 = true;
            }
        }
        ph1Var.f42542s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f40947c = false;
                }
            } else if (this.f40947c) {
                float x13 = motionEvent.getX() - this.f40945a;
                float y13 = motionEvent.getY() - this.f40946b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x13 * x13);
                float f11 = ph1Var.f42544t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - ph1Var.K0 > 300) {
                    ph1Var.K0 = System.currentTimeMillis();
                    if (ph1Var.C0) {
                        ph1Var.l(false);
                    } else if (ph1Var.f42553z0) {
                        ph1Var.z(!ph1Var.f42550x0);
                        ph1Var.f42539q0 = ph1Var.f42538p0;
                        if (!ph1Var.f42550x0 && (e3Var = ph1Var.N0) != null && e3Var.V) {
                            e3Var.e(true);
                        }
                        ph1Var.G();
                    }
                }
                this.f40947c = false;
            }
        } else {
            this.f40945a = motionEvent.getX();
            this.f40946b = motionEvent.getY();
            this.f40947c = true;
            this.d = System.currentTimeMillis();
        }
        if (!ph1Var.f42526h1 && !this.f40947c) {
            return false;
        }
        return true;
    }
}
