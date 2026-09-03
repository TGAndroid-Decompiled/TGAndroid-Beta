package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class di1 extends FrameLayout {
    public float f33483a;
    public float f33484b;
    public boolean f33485c;
    public long d;
    public final ii1 e;

    public di1(ii1 ii1Var, Activity activity) {
        super(activity);
        this.e = ii1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ii1 ii1Var = this.e;
        org.telegram.ui.Components.voip.c3 c3Var = ii1Var.v;
        if (view == c3Var && (ii1Var.f34968k0 || ii1Var.f34966j0)) {
            return false;
        }
        if ((view != c3Var && view != ii1Var.Z && (view != ii1Var.V || !ii1Var.X)) || (!ii1Var.f34954d1 && ii1Var.f34959f1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f10 = ii1Var.f34952c1;
        canvas.scale(f10, f10, ii1Var.Y0, ii1Var.Z0);
        canvas.translate(ii1Var.V0, ii1Var.W0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ii1 ii1Var = this.e;
        sh1 sh1Var = ii1Var.Q0;
        if (motionEvent.getActionMasked() == 1) {
            ii1Var.f34986y.b(false, false);
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
        org.telegram.ui.Components.voip.s2 s2Var;
        org.telegram.ui.Components.voip.d3 d3Var;
        ii1 ii1Var = this.e;
        sh1 sh1Var = ii1Var.Q0;
        if (motionEvent.getActionMasked() == 1) {
            ii1Var.f34986y.b(false, false);
            ii1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(sh1Var);
            if (ii1Var.m0 == 3) {
                AndroidUtilities.runOnUIThread(sh1Var, 10000L);
            }
        }
        if (!ii1Var.f34956e1 && !ii1Var.X0 && !ii1Var.f34954d1 && motionEvent.getActionMasked() != 0) {
            ii1.j(ii1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ii1Var.f34956e1 = false;
            ii1Var.X0 = false;
            ii1Var.f34954d1 = false;
        }
        if (ii1Var.f34966j0) {
            s2Var = ii1Var.Z;
        } else {
            s2Var = ii1Var.f34945a0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && ii1Var.X0) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (ii1Var.f34946a1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (ii1Var.f34949b1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / ii1Var.U0;
                    ii1Var.f34952c1 = hypot;
                    if (hypot > 1.005f && !ii1Var.f34954d1) {
                        ii1Var.U0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        ii1Var.Y0 = x10;
                        ii1Var.S0 = x10;
                        float y10 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        ii1Var.Z0 = y10;
                        ii1Var.T0 = y10;
                        ii1Var.f34952c1 = 1.0f;
                        ii1Var.V0 = 0.0f;
                        ii1Var.W0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        ii1Var.f34954d1 = true;
                        ii1Var.X0 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y11 = motionEvent.getY(i10);
                    float x12 = ii1Var.S0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y12 = ii1Var.T0 - ((motionEvent.getY(i11) + y11) / 2.0f);
                    float f10 = ii1Var.f34952c1;
                    ii1Var.V0 = (-x12) / f10;
                    ii1Var.W0 = (-y12) / f10;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    ii1.j(ii1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ii1Var.f34946a1 == motionEvent.getPointerId(0) && ii1Var.f34949b1 == motionEvent.getPointerId(1)) || (ii1Var.f34946a1 == motionEvent.getPointerId(1) && ii1Var.f34949b1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ii1.j(ii1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(s2Var.getX(), s2Var.getY(), s2Var.getX() + s2Var.getMeasuredWidth(), s2Var.getY() + s2Var.getMeasuredHeight());
                rectF.inset(((s2Var.getMeasuredHeight() * s2Var.Q) - s2Var.getMeasuredHeight()) / 2.0f, ((s2Var.getMeasuredWidth() * s2Var.Q) - s2Var.getMeasuredWidth()) / 2.0f);
                if (!e60.C3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, s2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, s2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ii1Var.f34956e1 = contains;
                if (!contains) {
                    ii1.j(ii1Var);
                }
            }
            if (ii1Var.f34956e1 && !ii1Var.X0 && motionEvent.getPointerCount() == 2) {
                ii1Var.U0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ii1Var.Y0 = x13;
                ii1Var.S0 = x13;
                float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ii1Var.Z0 = y13;
                ii1Var.T0 = y13;
                ii1Var.f34952c1 = 1.0f;
                ii1Var.f34946a1 = motionEvent.getPointerId(0);
                ii1Var.f34949b1 = motionEvent.getPointerId(1);
                ii1Var.X0 = true;
            }
        }
        ii1Var.f34977s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f33485c = false;
                }
            } else if (this.f33485c) {
                float x14 = motionEvent.getX() - this.f33483a;
                float y14 = motionEvent.getY() - this.f33484b;
                long currentTimeMillis = System.currentTimeMillis();
                float f11 = (y14 * y14) + (x14 * x14);
                float f12 = ii1Var.f34974q0;
                if (f11 < f12 * f12 && currentTimeMillis - this.d < 300 && currentTimeMillis - ii1Var.H0 > 300) {
                    ii1Var.H0 = System.currentTimeMillis();
                    if (ii1Var.f34988z0) {
                        ii1Var.m(false);
                    } else if (ii1Var.f34983w0) {
                        ii1Var.A(!ii1Var.f34980u0);
                        ii1Var.f34971n0 = ii1Var.m0;
                        if (!ii1Var.f34980u0 && (d3Var = ii1Var.K0) != null && d3Var.S) {
                            d3Var.e(true);
                        }
                        ii1Var.H();
                    }
                }
                this.f33485c = false;
            }
        } else {
            this.f33483a = motionEvent.getX();
            this.f33484b = motionEvent.getY();
            this.f33485c = true;
            this.d = System.currentTimeMillis();
        }
        if (!ii1Var.f34956e1 && !this.f33485c) {
            return false;
        }
        return true;
    }
}
