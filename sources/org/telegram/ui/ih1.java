package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ih1 extends FrameLayout {
    public float f38308a;
    public float f38309b;
    public boolean f38310c;
    public long d;
    public final nh1 e;

    public ih1(nh1 nh1Var, Activity activity) {
        super(activity);
        this.e = nh1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        nh1 nh1Var = this.e;
        org.telegram.ui.Components.voip.a3 a3Var = nh1Var.v;
        if (view == a3Var && (nh1Var.f39855n0 || nh1Var.m0)) {
            return false;
        }
        if ((view != a3Var && view != nh1Var.f39833c0 && (view != nh1Var.Y || !nh1Var.f39827a0)) || (!nh1Var.f39843g1 && nh1Var.f39847i1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = nh1Var.f39841f1;
        canvas.scale(f7, f7, nh1Var.f39831b1, nh1Var.f39834c1);
        canvas.translate(nh1Var.Y0, nh1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        nh1 nh1Var = this.e;
        xg1 xg1Var = nh1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            nh1Var.f39870y.b(false, false);
            nh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(xg1Var);
            if (nh1Var.f39857p0 == 3) {
                AndroidUtilities.runOnUIThread(xg1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.q2 q2Var;
        org.telegram.ui.Components.voip.b3 b3Var;
        nh1 nh1Var = this.e;
        xg1 xg1Var = nh1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            nh1Var.f39870y.b(false, false);
            nh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(xg1Var);
            if (nh1Var.f39857p0 == 3) {
                AndroidUtilities.runOnUIThread(xg1Var, 10000L);
            }
        }
        if (!nh1Var.f39845h1 && !nh1Var.f39828a1 && !nh1Var.f39843g1 && motionEvent.getActionMasked() != 0) {
            nh1.i(nh1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            nh1Var.f39845h1 = false;
            nh1Var.f39828a1 = false;
            nh1Var.f39843g1 = false;
        }
        if (nh1Var.m0) {
            q2Var = nh1Var.f39833c0;
        } else {
            q2Var = nh1Var.f39835d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && nh1Var.f39828a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (nh1Var.f39836d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (nh1Var.f39838e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / nh1Var.X0;
                    nh1Var.f39841f1 = hypot;
                    if (hypot > 1.005f && !nh1Var.f39843g1) {
                        nh1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        nh1Var.f39831b1 = x10;
                        nh1Var.V0 = x10;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        nh1Var.f39834c1 = y3;
                        nh1Var.W0 = y3;
                        nh1Var.f39841f1 = 1.0f;
                        nh1Var.Y0 = 0.0f;
                        nh1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        nh1Var.f39843g1 = true;
                        nh1Var.f39828a1 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x12 = nh1Var.V0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y11 = nh1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = nh1Var.f39841f1;
                    nh1Var.Y0 = (-x12) / f7;
                    nh1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    nh1.i(nh1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((nh1Var.f39836d1 == motionEvent.getPointerId(0) && nh1Var.f39838e1 == motionEvent.getPointerId(1)) || (nh1Var.f39836d1 == motionEvent.getPointerId(1) && nh1Var.f39838e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                nh1.i(nh1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(q2Var.getX(), q2Var.getY(), q2Var.getX() + q2Var.getMeasuredWidth(), q2Var.getY() + q2Var.getMeasuredHeight());
                rectF.inset(((q2Var.getMeasuredHeight() * q2Var.T) - q2Var.getMeasuredHeight()) / 2.0f, ((q2Var.getMeasuredWidth() * q2Var.T) - q2Var.getMeasuredWidth()) / 2.0f);
                if (!u50.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, q2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, q2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                nh1Var.f39845h1 = contains;
                if (!contains) {
                    nh1.i(nh1Var);
                }
            }
            if (nh1Var.f39845h1 && !nh1Var.f39828a1 && motionEvent.getPointerCount() == 2) {
                nh1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                nh1Var.f39831b1 = x13;
                nh1Var.V0 = x13;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                nh1Var.f39834c1 = y12;
                nh1Var.W0 = y12;
                nh1Var.f39841f1 = 1.0f;
                nh1Var.f39836d1 = motionEvent.getPointerId(0);
                nh1Var.f39838e1 = motionEvent.getPointerId(1);
                nh1Var.f39828a1 = true;
            }
        }
        nh1Var.f39861s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f38310c = false;
                }
            } else if (this.f38310c) {
                float x14 = motionEvent.getX() - this.f38308a;
                float y13 = motionEvent.getY() - this.f38309b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x14 * x14);
                float f11 = nh1Var.f39863t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - nh1Var.K0 > 300) {
                    nh1Var.K0 = System.currentTimeMillis();
                    if (nh1Var.C0) {
                        nh1Var.l(false);
                    } else if (nh1Var.f39872z0) {
                        nh1Var.z(!nh1Var.f39869x0);
                        nh1Var.f39858q0 = nh1Var.f39857p0;
                        if (!nh1Var.f39869x0 && (b3Var = nh1Var.N0) != null && b3Var.V) {
                            b3Var.e(true);
                        }
                        nh1Var.G();
                    }
                }
                this.f38310c = false;
            }
        } else {
            this.f38308a = motionEvent.getX();
            this.f38309b = motionEvent.getY();
            this.f38310c = true;
            this.d = System.currentTimeMillis();
        }
        if (!nh1Var.f39845h1 && !this.f38310c) {
            return false;
        }
        return true;
    }
}
