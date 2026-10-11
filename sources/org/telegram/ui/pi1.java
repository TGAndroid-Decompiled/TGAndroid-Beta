package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class pi1 extends FrameLayout {
    public float f40878a;
    public float f40879b;
    public boolean f40880c;
    public long d;
    public final ui1 f40881e;

    public pi1(ui1 ui1Var, Activity activity) {
        super(activity);
        this.f40881e = ui1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ui1 ui1Var = this.f40881e;
        org.telegram.ui.Components.voip.d3 d3Var = ui1Var.v;
        if (view == d3Var && (ui1Var.f42607n0 || ui1Var.m0)) {
            return false;
        }
        if ((view != d3Var && view != ui1Var.f42584c0 && (view != ui1Var.Y || !ui1Var.f42578a0)) || (!ui1Var.f42595g1 && ui1Var.f42599i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f7 = ui1Var.f42593f1;
        canvas.scale(f7, f7, ui1Var.f42582b1, ui1Var.f42585c1);
        canvas.translate(ui1Var.Y0, ui1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ui1 ui1Var = this.f40881e;
        ei1 ei1Var = ui1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ui1Var.f42622y.b(false, false);
            ui1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ei1Var);
            if (ui1Var.f42609p0 == 3) {
                AndroidUtilities.runOnUIThread(ei1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.t2 t2Var;
        org.telegram.ui.Components.voip.e3 e3Var;
        ui1 ui1Var = this.f40881e;
        ei1 ei1Var = ui1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ui1Var.f42622y.b(false, false);
            ui1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ei1Var);
            if (ui1Var.f42609p0 == 3) {
                AndroidUtilities.runOnUIThread(ei1Var, 10000L);
            }
        }
        if (!ui1Var.f42597h1 && !ui1Var.f42579a1 && !ui1Var.f42595g1 && motionEvent.getActionMasked() != 0) {
            ui1.i(ui1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ui1Var.f42597h1 = false;
            ui1Var.f42579a1 = false;
            ui1Var.f42595g1 = false;
        }
        if (ui1Var.m0) {
            t2Var = ui1Var.f42584c0;
        } else {
            t2Var = ui1Var.f42586d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && ui1Var.f42579a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (ui1Var.f42587d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (ui1Var.f42590e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / ui1Var.X0;
                    ui1Var.f42593f1 = hypot;
                    if (hypot > 1.005f && !ui1Var.f42595g1) {
                        ui1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        ui1Var.f42582b1 = x10;
                        ui1Var.V0 = x10;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        ui1Var.f42585c1 = y3;
                        ui1Var.W0 = y3;
                        ui1Var.f42593f1 = 1.0f;
                        ui1Var.Y0 = 0.0f;
                        ui1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        ui1Var.f42595g1 = true;
                        ui1Var.f42579a1 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x12 = ui1Var.V0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y11 = ui1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = ui1Var.f42593f1;
                    ui1Var.Y0 = (-x12) / f7;
                    ui1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    ui1.i(ui1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ui1Var.f42587d1 == motionEvent.getPointerId(0) && ui1Var.f42590e1 == motionEvent.getPointerId(1)) || (ui1Var.f42587d1 == motionEvent.getPointerId(1) && ui1Var.f42590e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ui1.i(ui1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(t2Var.getX(), t2Var.getY(), t2Var.getX() + t2Var.getMeasuredWidth(), t2Var.getY() + t2Var.getMeasuredHeight());
                rectF.inset(((t2Var.getMeasuredHeight() * t2Var.T) - t2Var.getMeasuredHeight()) / 2.0f, ((t2Var.getMeasuredWidth() * t2Var.T) - t2Var.getMeasuredWidth()) / 2.0f);
                if (!g60.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, t2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, t2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ui1Var.f42597h1 = contains;
                if (!contains) {
                    ui1.i(ui1Var);
                }
            }
            if (ui1Var.f42597h1 && !ui1Var.f42579a1 && motionEvent.getPointerCount() == 2) {
                ui1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ui1Var.f42582b1 = x13;
                ui1Var.V0 = x13;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ui1Var.f42585c1 = y12;
                ui1Var.W0 = y12;
                ui1Var.f42593f1 = 1.0f;
                ui1Var.f42587d1 = motionEvent.getPointerId(0);
                ui1Var.f42590e1 = motionEvent.getPointerId(1);
                ui1Var.f42579a1 = true;
            }
        }
        ui1Var.f42613s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f40880c = false;
                }
            } else if (this.f40880c) {
                float x14 = motionEvent.getX() - this.f40878a;
                float y13 = motionEvent.getY() - this.f40879b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x14 * x14);
                float f11 = ui1Var.f42615t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - ui1Var.K0 > 300) {
                    ui1Var.K0 = System.currentTimeMillis();
                    if (ui1Var.C0) {
                        ui1Var.l(false);
                    } else if (ui1Var.f42624z0) {
                        ui1Var.z(!ui1Var.f42621x0);
                        ui1Var.f42610q0 = ui1Var.f42609p0;
                        if (!ui1Var.f42621x0 && (e3Var = ui1Var.N0) != null && e3Var.V) {
                            e3Var.e(true);
                        }
                        ui1Var.G();
                    }
                }
                this.f40880c = false;
            }
        } else {
            this.f40878a = motionEvent.getX();
            this.f40879b = motionEvent.getY();
            this.f40880c = true;
            this.d = System.currentTimeMillis();
        }
        if (!ui1Var.f42597h1 && !this.f40880c) {
            return false;
        }
        return true;
    }
}
