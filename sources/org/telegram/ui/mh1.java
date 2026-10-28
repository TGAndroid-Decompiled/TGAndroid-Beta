package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class mh1 extends FrameLayout {
    public float f41445a;
    public float f41446b;
    public boolean f41447c;
    public long d;
    public final rh1 e;

    public mh1(rh1 rh1Var, Activity activity) {
        super(activity);
        this.e = rh1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        rh1 rh1Var = this.e;
        org.telegram.ui.Components.voip.d3 d3Var = rh1Var.v;
        if (view == d3Var && (rh1Var.f43029n0 || rh1Var.m0)) {
            return false;
        }
        if ((view != d3Var && view != rh1Var.f43007c0 && (view != rh1Var.Y || !rh1Var.f43001a0)) || (!rh1Var.f43017g1 && rh1Var.f43021i1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = rh1Var.f43015f1;
        canvas.scale(f7, f7, rh1Var.f43005b1, rh1Var.f43008c1);
        canvas.translate(rh1Var.Y0, rh1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        rh1 rh1Var = this.e;
        ah1 ah1Var = rh1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            rh1Var.f43044y.b(false, false);
            rh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ah1Var);
            if (rh1Var.f43031p0 == 3) {
                AndroidUtilities.runOnUIThread(ah1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.t2 t2Var;
        org.telegram.ui.Components.voip.e3 e3Var;
        rh1 rh1Var = this.e;
        ah1 ah1Var = rh1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            rh1Var.f43044y.b(false, false);
            rh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ah1Var);
            if (rh1Var.f43031p0 == 3) {
                AndroidUtilities.runOnUIThread(ah1Var, 10000L);
            }
        }
        if (!rh1Var.f43019h1 && !rh1Var.f43002a1 && !rh1Var.f43017g1 && motionEvent.getActionMasked() != 0) {
            rh1.i(rh1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            rh1Var.f43019h1 = false;
            rh1Var.f43002a1 = false;
            rh1Var.f43017g1 = false;
        }
        if (rh1Var.m0) {
            t2Var = rh1Var.f43007c0;
        } else {
            t2Var = rh1Var.f43009d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && rh1Var.f43002a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (rh1Var.f43010d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (rh1Var.f43012e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / rh1Var.X0;
                    rh1Var.f43015f1 = hypot;
                    if (hypot > 1.005f && !rh1Var.f43017g1) {
                        rh1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x9 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        rh1Var.f43005b1 = x9;
                        rh1Var.V0 = x9;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        rh1Var.f43008c1 = y3;
                        rh1Var.W0 = y3;
                        rh1Var.f43015f1 = 1.0f;
                        rh1Var.Y0 = 0.0f;
                        rh1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        rh1Var.f43017g1 = true;
                        rh1Var.f43002a1 = true;
                    }
                    float x10 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x11 = rh1Var.V0 - ((motionEvent.getX(i11) + x10) / 2.0f);
                    float y11 = rh1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = rh1Var.f43015f1;
                    rh1Var.Y0 = (-x11) / f7;
                    rh1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    rh1.i(rh1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((rh1Var.f43010d1 == motionEvent.getPointerId(0) && rh1Var.f43012e1 == motionEvent.getPointerId(1)) || (rh1Var.f43010d1 == motionEvent.getPointerId(1) && rh1Var.f43012e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                rh1.i(rh1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(t2Var.getX(), t2Var.getY(), t2Var.getX() + t2Var.getMeasuredWidth(), t2Var.getY() + t2Var.getMeasuredHeight());
                rectF.inset(((t2Var.getMeasuredHeight() * t2Var.T) - t2Var.getMeasuredHeight()) / 2.0f, ((t2Var.getMeasuredWidth() * t2Var.T) - t2Var.getMeasuredWidth()) / 2.0f);
                if (!x50.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, t2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, t2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                rh1Var.f43019h1 = contains;
                if (!contains) {
                    rh1.i(rh1Var);
                }
            }
            if (rh1Var.f43019h1 && !rh1Var.f43002a1 && motionEvent.getPointerCount() == 2) {
                rh1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x12 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                rh1Var.f43005b1 = x12;
                rh1Var.V0 = x12;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                rh1Var.f43008c1 = y12;
                rh1Var.W0 = y12;
                rh1Var.f43015f1 = 1.0f;
                rh1Var.f43010d1 = motionEvent.getPointerId(0);
                rh1Var.f43012e1 = motionEvent.getPointerId(1);
                rh1Var.f43002a1 = true;
            }
        }
        rh1Var.f43035s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f41447c = false;
                }
            } else if (this.f41447c) {
                float x13 = motionEvent.getX() - this.f41445a;
                float y13 = motionEvent.getY() - this.f41446b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x13 * x13);
                float f11 = rh1Var.f43037t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - rh1Var.K0 > 300) {
                    rh1Var.K0 = System.currentTimeMillis();
                    if (rh1Var.C0) {
                        rh1Var.l(false);
                    } else if (rh1Var.f43046z0) {
                        rh1Var.z(!rh1Var.f43043x0);
                        rh1Var.f43032q0 = rh1Var.f43031p0;
                        if (!rh1Var.f43043x0 && (e3Var = rh1Var.N0) != null && e3Var.V) {
                            e3Var.e(true);
                        }
                        rh1Var.G();
                    }
                }
                this.f41447c = false;
            }
        } else {
            this.f41445a = motionEvent.getX();
            this.f41446b = motionEvent.getY();
            this.f41447c = true;
            this.d = System.currentTimeMillis();
        }
        if (!rh1Var.f43019h1 && !this.f41447c) {
            return false;
        }
        return true;
    }
}
