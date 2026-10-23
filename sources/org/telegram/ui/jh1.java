package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class jh1 extends FrameLayout {
    public float f38584a;
    public float f38585b;
    public boolean f38586c;
    public long d;
    public final oh1 e;

    public jh1(oh1 oh1Var, Activity activity) {
        super(activity);
        this.e = oh1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        oh1 oh1Var = this.e;
        org.telegram.ui.Components.voip.a3 a3Var = oh1Var.v;
        if (view == a3Var && (oh1Var.f40192n0 || oh1Var.m0)) {
            return false;
        }
        if ((view != a3Var && view != oh1Var.f40170c0 && (view != oh1Var.Y || !oh1Var.f40164a0)) || (!oh1Var.f40180g1 && oh1Var.f40184i1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = oh1Var.f40178f1;
        canvas.scale(f7, f7, oh1Var.f40168b1, oh1Var.f40171c1);
        canvas.translate(oh1Var.Y0, oh1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        oh1 oh1Var = this.e;
        yg1 yg1Var = oh1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            oh1Var.f40207y.b(false, false);
            oh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(yg1Var);
            if (oh1Var.f40194p0 == 3) {
                AndroidUtilities.runOnUIThread(yg1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.q2 q2Var;
        org.telegram.ui.Components.voip.b3 b3Var;
        oh1 oh1Var = this.e;
        yg1 yg1Var = oh1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            oh1Var.f40207y.b(false, false);
            oh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(yg1Var);
            if (oh1Var.f40194p0 == 3) {
                AndroidUtilities.runOnUIThread(yg1Var, 10000L);
            }
        }
        if (!oh1Var.f40182h1 && !oh1Var.f40165a1 && !oh1Var.f40180g1 && motionEvent.getActionMasked() != 0) {
            oh1.i(oh1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            oh1Var.f40182h1 = false;
            oh1Var.f40165a1 = false;
            oh1Var.f40180g1 = false;
        }
        if (oh1Var.m0) {
            q2Var = oh1Var.f40170c0;
        } else {
            q2Var = oh1Var.f40172d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && oh1Var.f40165a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (oh1Var.f40173d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (oh1Var.f40175e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / oh1Var.X0;
                    oh1Var.f40178f1 = hypot;
                    if (hypot > 1.005f && !oh1Var.f40180g1) {
                        oh1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        oh1Var.f40168b1 = x10;
                        oh1Var.V0 = x10;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        oh1Var.f40171c1 = y3;
                        oh1Var.W0 = y3;
                        oh1Var.f40178f1 = 1.0f;
                        oh1Var.Y0 = 0.0f;
                        oh1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        oh1Var.f40180g1 = true;
                        oh1Var.f40165a1 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x12 = oh1Var.V0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y11 = oh1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = oh1Var.f40178f1;
                    oh1Var.Y0 = (-x12) / f7;
                    oh1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    oh1.i(oh1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((oh1Var.f40173d1 == motionEvent.getPointerId(0) && oh1Var.f40175e1 == motionEvent.getPointerId(1)) || (oh1Var.f40173d1 == motionEvent.getPointerId(1) && oh1Var.f40175e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                oh1.i(oh1Var);
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
                oh1Var.f40182h1 = contains;
                if (!contains) {
                    oh1.i(oh1Var);
                }
            }
            if (oh1Var.f40182h1 && !oh1Var.f40165a1 && motionEvent.getPointerCount() == 2) {
                oh1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                oh1Var.f40168b1 = x13;
                oh1Var.V0 = x13;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                oh1Var.f40171c1 = y12;
                oh1Var.W0 = y12;
                oh1Var.f40178f1 = 1.0f;
                oh1Var.f40173d1 = motionEvent.getPointerId(0);
                oh1Var.f40175e1 = motionEvent.getPointerId(1);
                oh1Var.f40165a1 = true;
            }
        }
        oh1Var.f40198s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f38586c = false;
                }
            } else if (this.f38586c) {
                float x14 = motionEvent.getX() - this.f38584a;
                float y13 = motionEvent.getY() - this.f38585b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x14 * x14);
                float f11 = oh1Var.f40200t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - oh1Var.K0 > 300) {
                    oh1Var.K0 = System.currentTimeMillis();
                    if (oh1Var.C0) {
                        oh1Var.l(false);
                    } else if (oh1Var.f40209z0) {
                        oh1Var.z(!oh1Var.f40206x0);
                        oh1Var.f40195q0 = oh1Var.f40194p0;
                        if (!oh1Var.f40206x0 && (b3Var = oh1Var.N0) != null && b3Var.V) {
                            b3Var.e(true);
                        }
                        oh1Var.G();
                    }
                }
                this.f38586c = false;
            }
        } else {
            this.f38584a = motionEvent.getX();
            this.f38585b = motionEvent.getY();
            this.f38586c = true;
            this.d = System.currentTimeMillis();
        }
        if (!oh1Var.f40182h1 && !this.f38586c) {
            return false;
        }
        return true;
    }
}
