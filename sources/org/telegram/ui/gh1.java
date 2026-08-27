package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

public final class gh1 extends FrameLayout {

    public float f38416a;

    public float f38417b;

    public boolean f38418c;
    public long d;

    public final lh1 f38419e;

    public gh1(lh1 lh1Var, Activity activity) {
        super(activity);
        this.f38419e = lh1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        lh1 lh1Var = this.f38419e;
        org.telegram.ui.Components.voip.b3 b3Var = lh1Var.v;
        if (view == b3Var && (lh1Var.f40112j0 || lh1Var.f40110i0)) {
            return false;
        }
        if ((view != b3Var && view != lh1Var.Y && (view != lh1Var.U || !lh1Var.W)) || (!lh1Var.f40097c1 && lh1Var.f40102e1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f10 = lh1Var.f40094b1;
        canvas.scale(f10, f10, lh1Var.X0, lh1Var.Y0);
        canvas.translate(lh1Var.U0, lh1Var.V0);
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        lh1 lh1Var = this.f38419e;
        vg1 vg1Var = lh1Var.P0;
        if (motionEvent.getActionMasked() == 1) {
            lh1Var.f40131y.b(false, false);
            lh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(vg1Var);
            if (lh1Var.f40114l0 == 3) {
                AndroidUtilities.runOnUIThread(vg1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.c3 c3Var;
        lh1 lh1Var = this.f38419e;
        vg1 vg1Var = lh1Var.P0;
        if (motionEvent.getActionMasked() == 1) {
            lh1Var.f40131y.b(false, false);
            lh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(vg1Var);
            if (lh1Var.f40114l0 == 3) {
                AndroidUtilities.runOnUIThread(vg1Var, 10000L);
            }
        }
        if (!lh1Var.f40099d1 && !lh1Var.W0 && !lh1Var.f40097c1 && motionEvent.getActionMasked() != 0) {
            lh1.j(lh1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            lh1Var.f40099d1 = false;
            lh1Var.W0 = false;
            lh1Var.f40097c1 = false;
        }
        org.telegram.ui.Components.voip.r2 r2Var = lh1Var.f40110i0 ? lh1Var.Y : lh1Var.Z;
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(r2Var.getX(), r2Var.getY(), r2Var.getX() + r2Var.getMeasuredWidth(), r2Var.getY() + r2Var.getMeasuredHeight());
                rectF.inset(((r2Var.getMeasuredHeight() * r2Var.P) - r2Var.getMeasuredHeight()) / 2.0f, ((r2Var.getMeasuredWidth() * r2Var.P) - r2Var.getMeasuredWidth()) / 2.0f);
                if (s50.B3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, r2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, r2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                }
                boolean zContains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                lh1Var.f40099d1 = zContains;
                if (!zContains) {
                    lh1.j(lh1Var);
                }
            }
            if (lh1Var.f40099d1 && !lh1Var.W0 && motionEvent.getPointerCount() == 2) {
                lh1Var.T0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x8 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                lh1Var.X0 = x8;
                lh1Var.R0 = x8;
                float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                lh1Var.Y0 = y10;
                lh1Var.S0 = y10;
                lh1Var.f40094b1 = 1.0f;
                lh1Var.Z0 = motionEvent.getPointerId(0);
                lh1Var.f40091a1 = motionEvent.getPointerId(1);
                lh1Var.W0 = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && lh1Var.W0) {
            int i10 = -1;
            int i11 = -1;
            for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                if (lh1Var.Z0 == motionEvent.getPointerId(i12)) {
                    i10 = i12;
                }
                if (lh1Var.f40091a1 == motionEvent.getPointerId(i12)) {
                    i11 = i12;
                }
            }
            if (i10 == -1 || i11 == -1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                lh1.j(lh1Var);
            } else {
                float fHypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / lh1Var.T0;
                lh1Var.f40094b1 = fHypot;
                if (fHypot > 1.005f && !lh1Var.f40097c1) {
                    lh1Var.T0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                    float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    lh1Var.X0 = x10;
                    lh1Var.R0 = x10;
                    float y11 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    lh1Var.Y0 = y11;
                    lh1Var.S0 = y11;
                    lh1Var.f40094b1 = 1.0f;
                    lh1Var.U0 = 0.0f;
                    lh1Var.V0 = 0.0f;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    lh1Var.f40097c1 = true;
                    lh1Var.W0 = true;
                }
                float x11 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                float y12 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                float f10 = lh1Var.R0 - x11;
                float f11 = lh1Var.S0 - y12;
                float f12 = lh1Var.f40094b1;
                lh1Var.U0 = (-f10) / f12;
                lh1Var.V0 = (-f11) / f12;
                invalidate();
            }
        } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((lh1Var.Z0 == motionEvent.getPointerId(0) && lh1Var.f40091a1 == motionEvent.getPointerId(1)) || (lh1Var.Z0 == motionEvent.getPointerId(1) && lh1Var.f40091a1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
            getParent().requestDisallowInterceptTouchEvent(false);
            lh1.j(lh1Var);
        }
        lh1Var.f40122s.invalidate();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f38416a = motionEvent.getX();
            this.f38417b = motionEvent.getY();
            this.f38418c = true;
            this.d = System.currentTimeMillis();
        } else if (action != 1) {
            if (action == 3) {
                this.f38418c = false;
            }
        } else if (this.f38418c) {
            float x12 = motionEvent.getX() - this.f38416a;
            float y13 = motionEvent.getY() - this.f38417b;
            long jCurrentTimeMillis = System.currentTimeMillis();
            float f13 = (y13 * y13) + (x12 * x12);
            float f14 = lh1Var.f40118p0;
            if (f13 < f14 * f14 && jCurrentTimeMillis - this.d < 300 && jCurrentTimeMillis - lh1Var.G0 > 300) {
                lh1Var.G0 = System.currentTimeMillis();
                if (lh1Var.f40132y0) {
                    lh1Var.m(false);
                } else if (lh1Var.f40126v0) {
                    lh1Var.A(!lh1Var.f40124t0);
                    lh1Var.m0 = lh1Var.f40114l0;
                    if (!lh1Var.f40124t0 && (c3Var = lh1Var.J0) != null && c3Var.R) {
                        c3Var.e(true);
                    }
                    lh1Var.H();
                }
            }
            this.f38418c = false;
        }
        return lh1Var.f40099d1 || this.f38418c;
    }
}
