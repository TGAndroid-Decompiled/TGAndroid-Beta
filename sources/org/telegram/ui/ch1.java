package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ch1 extends FrameLayout {
    public float f36003a;
    public float f36004b;
    public boolean f36005c;
    public long d;
    public final hh1 e;

    public ch1(hh1 hh1Var, Activity activity) {
        super(activity);
        this.e = hh1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        hh1 hh1Var = this.e;
        org.telegram.ui.Components.voip.a3 a3Var = hh1Var.v;
        if (view == a3Var && (hh1Var.f37681n0 || hh1Var.m0)) {
            return false;
        }
        if ((view != a3Var && view != hh1Var.f37659c0 && (view != hh1Var.Y || !hh1Var.f37653a0)) || (!hh1Var.f37669g1 && hh1Var.f37673i1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = hh1Var.f37667f1;
        canvas.scale(f7, f7, hh1Var.f37657b1, hh1Var.f37660c1);
        canvas.translate(hh1Var.Y0, hh1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hh1 hh1Var = this.e;
        rg1 rg1Var = hh1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            hh1Var.f37696y.b(false, false);
            hh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(rg1Var);
            if (hh1Var.f37683p0 == 3) {
                AndroidUtilities.runOnUIThread(rg1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.q2 q2Var;
        org.telegram.ui.Components.voip.b3 b3Var;
        hh1 hh1Var = this.e;
        rg1 rg1Var = hh1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            hh1Var.f37696y.b(false, false);
            hh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(rg1Var);
            if (hh1Var.f37683p0 == 3) {
                AndroidUtilities.runOnUIThread(rg1Var, 10000L);
            }
        }
        if (!hh1Var.f37671h1 && !hh1Var.f37654a1 && !hh1Var.f37669g1 && motionEvent.getActionMasked() != 0) {
            hh1.i(hh1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            hh1Var.f37671h1 = false;
            hh1Var.f37654a1 = false;
            hh1Var.f37669g1 = false;
        }
        if (hh1Var.m0) {
            q2Var = hh1Var.f37659c0;
        } else {
            q2Var = hh1Var.f37661d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && hh1Var.f37654a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (hh1Var.f37662d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (hh1Var.f37664e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / hh1Var.X0;
                    hh1Var.f37667f1 = hypot;
                    if (hypot > 1.005f && !hh1Var.f37669g1) {
                        hh1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        hh1Var.f37657b1 = x10;
                        hh1Var.V0 = x10;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        hh1Var.f37660c1 = y3;
                        hh1Var.W0 = y3;
                        hh1Var.f37667f1 = 1.0f;
                        hh1Var.Y0 = 0.0f;
                        hh1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        hh1Var.f37669g1 = true;
                        hh1Var.f37654a1 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x12 = hh1Var.V0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y11 = hh1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = hh1Var.f37667f1;
                    hh1Var.Y0 = (-x12) / f7;
                    hh1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    hh1.i(hh1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((hh1Var.f37662d1 == motionEvent.getPointerId(0) && hh1Var.f37664e1 == motionEvent.getPointerId(1)) || (hh1Var.f37662d1 == motionEvent.getPointerId(1) && hh1Var.f37664e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                hh1.i(hh1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(q2Var.getX(), q2Var.getY(), q2Var.getX() + q2Var.getMeasuredWidth(), q2Var.getY() + q2Var.getMeasuredHeight());
                rectF.inset(((q2Var.getMeasuredHeight() * q2Var.T) - q2Var.getMeasuredHeight()) / 2.0f, ((q2Var.getMeasuredWidth() * q2Var.T) - q2Var.getMeasuredWidth()) / 2.0f);
                if (!q50.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, q2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, q2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                hh1Var.f37671h1 = contains;
                if (!contains) {
                    hh1.i(hh1Var);
                }
            }
            if (hh1Var.f37671h1 && !hh1Var.f37654a1 && motionEvent.getPointerCount() == 2) {
                hh1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                hh1Var.f37657b1 = x13;
                hh1Var.V0 = x13;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                hh1Var.f37660c1 = y12;
                hh1Var.W0 = y12;
                hh1Var.f37667f1 = 1.0f;
                hh1Var.f37662d1 = motionEvent.getPointerId(0);
                hh1Var.f37664e1 = motionEvent.getPointerId(1);
                hh1Var.f37654a1 = true;
            }
        }
        hh1Var.f37687s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f36005c = false;
                }
            } else if (this.f36005c) {
                float x14 = motionEvent.getX() - this.f36003a;
                float y13 = motionEvent.getY() - this.f36004b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x14 * x14);
                float f11 = hh1Var.f37689t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - hh1Var.K0 > 300) {
                    hh1Var.K0 = System.currentTimeMillis();
                    if (hh1Var.C0) {
                        hh1Var.l(false);
                    } else if (hh1Var.f37698z0) {
                        hh1Var.z(!hh1Var.f37695x0);
                        hh1Var.f37684q0 = hh1Var.f37683p0;
                        if (!hh1Var.f37695x0 && (b3Var = hh1Var.N0) != null && b3Var.V) {
                            b3Var.e(true);
                        }
                        hh1Var.G();
                    }
                }
                this.f36005c = false;
            }
        } else {
            this.f36003a = motionEvent.getX();
            this.f36004b = motionEvent.getY();
            this.f36005c = true;
            this.d = System.currentTimeMillis();
        }
        if (!hh1Var.f37671h1 && !this.f36005c) {
            return false;
        }
        return true;
    }
}
