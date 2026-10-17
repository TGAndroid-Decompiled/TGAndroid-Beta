package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class eh1 extends FrameLayout {
    public float f36541a;
    public float f36542b;
    public boolean f36543c;
    public long d;
    public final jh1 e;

    public eh1(jh1 jh1Var, Activity activity) {
        super(activity);
        this.e = jh1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        jh1 jh1Var = this.e;
        org.telegram.ui.Components.voip.a3 a3Var = jh1Var.v;
        if (view == a3Var && (jh1Var.f38201n0 || jh1Var.m0)) {
            return false;
        }
        if ((view != a3Var && view != jh1Var.f38179c0 && (view != jh1Var.Y || !jh1Var.f38173a0)) || (!jh1Var.f38189g1 && jh1Var.f38193i1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = jh1Var.f38187f1;
        canvas.scale(f7, f7, jh1Var.f38177b1, jh1Var.f38180c1);
        canvas.translate(jh1Var.Y0, jh1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        jh1 jh1Var = this.e;
        tg1 tg1Var = jh1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            jh1Var.f38216y.b(false, false);
            jh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(tg1Var);
            if (jh1Var.f38203p0 == 3) {
                AndroidUtilities.runOnUIThread(tg1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.q2 q2Var;
        org.telegram.ui.Components.voip.b3 b3Var;
        jh1 jh1Var = this.e;
        tg1 tg1Var = jh1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            jh1Var.f38216y.b(false, false);
            jh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(tg1Var);
            if (jh1Var.f38203p0 == 3) {
                AndroidUtilities.runOnUIThread(tg1Var, 10000L);
            }
        }
        if (!jh1Var.f38191h1 && !jh1Var.f38174a1 && !jh1Var.f38189g1 && motionEvent.getActionMasked() != 0) {
            jh1.i(jh1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            jh1Var.f38191h1 = false;
            jh1Var.f38174a1 = false;
            jh1Var.f38189g1 = false;
        }
        if (jh1Var.m0) {
            q2Var = jh1Var.f38179c0;
        } else {
            q2Var = jh1Var.f38181d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && jh1Var.f38174a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (jh1Var.f38182d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (jh1Var.f38184e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / jh1Var.X0;
                    jh1Var.f38187f1 = hypot;
                    if (hypot > 1.005f && !jh1Var.f38189g1) {
                        jh1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        jh1Var.f38177b1 = x10;
                        jh1Var.V0 = x10;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        jh1Var.f38180c1 = y3;
                        jh1Var.W0 = y3;
                        jh1Var.f38187f1 = 1.0f;
                        jh1Var.Y0 = 0.0f;
                        jh1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        jh1Var.f38189g1 = true;
                        jh1Var.f38174a1 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x12 = jh1Var.V0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y11 = jh1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = jh1Var.f38187f1;
                    jh1Var.Y0 = (-x12) / f7;
                    jh1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    jh1.i(jh1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((jh1Var.f38182d1 == motionEvent.getPointerId(0) && jh1Var.f38184e1 == motionEvent.getPointerId(1)) || (jh1Var.f38182d1 == motionEvent.getPointerId(1) && jh1Var.f38184e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                jh1.i(jh1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(q2Var.getX(), q2Var.getY(), q2Var.getX() + q2Var.getMeasuredWidth(), q2Var.getY() + q2Var.getMeasuredHeight());
                rectF.inset(((q2Var.getMeasuredHeight() * q2Var.T) - q2Var.getMeasuredHeight()) / 2.0f, ((q2Var.getMeasuredWidth() * q2Var.T) - q2Var.getMeasuredWidth()) / 2.0f);
                if (!s50.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, q2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, q2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                jh1Var.f38191h1 = contains;
                if (!contains) {
                    jh1.i(jh1Var);
                }
            }
            if (jh1Var.f38191h1 && !jh1Var.f38174a1 && motionEvent.getPointerCount() == 2) {
                jh1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                jh1Var.f38177b1 = x13;
                jh1Var.V0 = x13;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                jh1Var.f38180c1 = y12;
                jh1Var.W0 = y12;
                jh1Var.f38187f1 = 1.0f;
                jh1Var.f38182d1 = motionEvent.getPointerId(0);
                jh1Var.f38184e1 = motionEvent.getPointerId(1);
                jh1Var.f38174a1 = true;
            }
        }
        jh1Var.f38207s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f36543c = false;
                }
            } else if (this.f36543c) {
                float x14 = motionEvent.getX() - this.f36541a;
                float y13 = motionEvent.getY() - this.f36542b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x14 * x14);
                float f11 = jh1Var.f38209t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - jh1Var.K0 > 300) {
                    jh1Var.K0 = System.currentTimeMillis();
                    if (jh1Var.C0) {
                        jh1Var.l(false);
                    } else if (jh1Var.f38218z0) {
                        jh1Var.z(!jh1Var.f38215x0);
                        jh1Var.f38204q0 = jh1Var.f38203p0;
                        if (!jh1Var.f38215x0 && (b3Var = jh1Var.N0) != null && b3Var.V) {
                            b3Var.e(true);
                        }
                        jh1Var.G();
                    }
                }
                this.f36543c = false;
            }
        } else {
            this.f36541a = motionEvent.getX();
            this.f36542b = motionEvent.getY();
            this.f36543c = true;
            this.d = System.currentTimeMillis();
        }
        if (!jh1Var.f38191h1 && !this.f36543c) {
            return false;
        }
        return true;
    }
}
