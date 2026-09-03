package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class di1 extends FrameLayout {
    public float f36214a;
    public float f36215b;
    public boolean f36216c;
    public long d;
    public final ii1 f36217e;

    public di1(ii1 ii1Var, Activity activity) {
        super(activity);
        this.f36217e = ii1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ii1 ii1Var = this.f36217e;
        org.telegram.ui.Components.voip.d3 d3Var = ii1Var.v;
        if (view == d3Var && (ii1Var.f37695k0 || ii1Var.f37693j0)) {
            return false;
        }
        if ((view != d3Var && view != ii1Var.Z && (view != ii1Var.V || !ii1Var.X)) || (!ii1Var.f37680d1 && ii1Var.f37686f1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f10 = ii1Var.f37678c1;
        canvas.scale(f10, f10, ii1Var.Y0, ii1Var.Z0);
        canvas.translate(ii1Var.V0, ii1Var.W0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ii1 ii1Var = this.f36217e;
        sh1 sh1Var = ii1Var.Q0;
        if (motionEvent.getActionMasked() == 1) {
            ii1Var.f37713y.b(false, false);
            ii1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(sh1Var);
            if (ii1Var.m0 == 3) {
                AndroidUtilities.runOnUIThread(sh1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.t2 t2Var;
        org.telegram.ui.Components.voip.e3 e3Var;
        ii1 ii1Var = this.f36217e;
        sh1 sh1Var = ii1Var.Q0;
        if (motionEvent.getActionMasked() == 1) {
            ii1Var.f37713y.b(false, false);
            ii1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(sh1Var);
            if (ii1Var.m0 == 3) {
                AndroidUtilities.runOnUIThread(sh1Var, 10000L);
            }
        }
        if (!ii1Var.f37683e1 && !ii1Var.X0 && !ii1Var.f37680d1 && motionEvent.getActionMasked() != 0) {
            ii1.j(ii1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ii1Var.f37683e1 = false;
            ii1Var.X0 = false;
            ii1Var.f37680d1 = false;
        }
        if (ii1Var.f37693j0) {
            t2Var = ii1Var.Z;
        } else {
            t2Var = ii1Var.f37671a0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && ii1Var.X0) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (ii1Var.f37672a1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (ii1Var.f37675b1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / ii1Var.U0;
                    ii1Var.f37678c1 = hypot;
                    if (hypot > 1.005f && !ii1Var.f37680d1) {
                        ii1Var.U0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        ii1Var.Y0 = x10;
                        ii1Var.S0 = x10;
                        float y10 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        ii1Var.Z0 = y10;
                        ii1Var.T0 = y10;
                        ii1Var.f37678c1 = 1.0f;
                        ii1Var.V0 = 0.0f;
                        ii1Var.W0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        ii1Var.f37680d1 = true;
                        ii1Var.X0 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y11 = motionEvent.getY(i10);
                    float x12 = ii1Var.S0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y12 = ii1Var.T0 - ((motionEvent.getY(i11) + y11) / 2.0f);
                    float f10 = ii1Var.f37678c1;
                    ii1Var.V0 = (-x12) / f10;
                    ii1Var.W0 = (-y12) / f10;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    ii1.j(ii1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ii1Var.f37672a1 == motionEvent.getPointerId(0) && ii1Var.f37675b1 == motionEvent.getPointerId(1)) || (ii1Var.f37672a1 == motionEvent.getPointerId(1) && ii1Var.f37675b1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ii1.j(ii1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(t2Var.getX(), t2Var.getY(), t2Var.getX() + t2Var.getMeasuredWidth(), t2Var.getY() + t2Var.getMeasuredHeight());
                rectF.inset(((t2Var.getMeasuredHeight() * t2Var.Q) - t2Var.getMeasuredHeight()) / 2.0f, ((t2Var.getMeasuredWidth() * t2Var.Q) - t2Var.getMeasuredWidth()) / 2.0f);
                if (!d60.C3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, t2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, t2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ii1Var.f37683e1 = contains;
                if (!contains) {
                    ii1.j(ii1Var);
                }
            }
            if (ii1Var.f37683e1 && !ii1Var.X0 && motionEvent.getPointerCount() == 2) {
                ii1Var.U0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ii1Var.Y0 = x13;
                ii1Var.S0 = x13;
                float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ii1Var.Z0 = y13;
                ii1Var.T0 = y13;
                ii1Var.f37678c1 = 1.0f;
                ii1Var.f37672a1 = motionEvent.getPointerId(0);
                ii1Var.f37675b1 = motionEvent.getPointerId(1);
                ii1Var.X0 = true;
            }
        }
        ii1Var.f37704s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f36216c = false;
                }
            } else if (this.f36216c) {
                float x14 = motionEvent.getX() - this.f36214a;
                float y14 = motionEvent.getY() - this.f36215b;
                long currentTimeMillis = System.currentTimeMillis();
                float f11 = (y14 * y14) + (x14 * x14);
                float f12 = ii1Var.f37701q0;
                if (f11 < f12 * f12 && currentTimeMillis - this.d < 300 && currentTimeMillis - ii1Var.H0 > 300) {
                    ii1Var.H0 = System.currentTimeMillis();
                    if (ii1Var.f37715z0) {
                        ii1Var.m(false);
                    } else if (ii1Var.f37710w0) {
                        ii1Var.A(!ii1Var.f37707u0);
                        ii1Var.f37698n0 = ii1Var.m0;
                        if (!ii1Var.f37707u0 && (e3Var = ii1Var.K0) != null && e3Var.S) {
                            e3Var.e(true);
                        }
                        ii1Var.H();
                    }
                }
                this.f36216c = false;
            }
        } else {
            this.f36214a = motionEvent.getX();
            this.f36215b = motionEvent.getY();
            this.f36216c = true;
            this.d = System.currentTimeMillis();
        }
        if (!ii1Var.f37683e1 && !this.f36216c) {
            return false;
        }
        return true;
    }
}
