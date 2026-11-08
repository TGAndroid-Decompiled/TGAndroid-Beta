package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class ac1 extends FrameLayout {
    public float f43627a;
    public float f43628b;
    public boolean f43629c;
    public long d;
    public final fc1 f43630e;

    public ac1(fc1 fc1Var, Activity activity) {
        super(activity);
        this.f43630e = fc1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        fc1 fc1Var = this.f43630e;
        org.telegram.ui.Components.voip.u2 u2Var = fc1Var.f45579w;
        if (view == u2Var && (fc1Var.m0 || fc1Var.f45566l0)) {
            return false;
        }
        if ((view != u2Var && view != fc1Var.f45546c0 && (view != fc1Var.Y || !fc1Var.f45540a0)) || (!fc1Var.f45555f1 && fc1Var.f45559h1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = fc1Var.f45552e1;
        canvas.scale(f10, f10, fc1Var.f45541a1, fc1Var.f45544b1);
        canvas.translate(fc1Var.X0, fc1Var.Y0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fc1 fc1Var = this.f43630e;
        rb1 rb1Var = fc1Var.S0;
        if (motionEvent.getActionMasked() == 1) {
            fc1Var.D.b(false, false);
            fc1Var.f45579w.a();
            org.telegram.messenger.g0.r(rb1Var);
            if (fc1Var.f45569o0 == 3) {
                org.telegram.messenger.g0.i3(rb1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.k2 k2Var;
        org.telegram.ui.Components.zo zoVar;
        fc1 fc1Var = this.f43630e;
        rb1 rb1Var = fc1Var.S0;
        if (motionEvent.getActionMasked() == 1) {
            fc1Var.D.b(false, false);
            fc1Var.f45579w.a();
            org.telegram.messenger.g0.r(rb1Var);
            if (fc1Var.f45569o0 == 3) {
                org.telegram.messenger.g0.i3(rb1Var, 10000L);
            }
        }
        if (!fc1Var.f45557g1 && !fc1Var.Z0 && !fc1Var.f45555f1 && motionEvent.getActionMasked() != 0) {
            fc1.a(fc1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            fc1Var.f45557g1 = false;
            fc1Var.Z0 = false;
            fc1Var.f45555f1 = false;
        }
        if (fc1Var.f45566l0) {
            k2Var = fc1Var.f45546c0;
        } else {
            k2Var = fc1Var.f45548d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && fc1Var.Z0) {
                int i7 = -1;
                int i10 = -1;
                for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                    if (fc1Var.f45547c1 == motionEvent.getPointerId(i11)) {
                        i7 = i11;
                    }
                    if (fc1Var.f45549d1 == motionEvent.getPointerId(i11)) {
                        i10 = i11;
                    }
                }
                if (i7 != -1 && i10 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / fc1Var.W0;
                    fc1Var.f45552e1 = hypot;
                    if (hypot > 1.005f && !fc1Var.f45555f1) {
                        fc1Var.W0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7));
                        float x10 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                        fc1Var.f45541a1 = x10;
                        fc1Var.U0 = x10;
                        float y10 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                        fc1Var.f45544b1 = y10;
                        fc1Var.V0 = y10;
                        fc1Var.f45552e1 = 1.0f;
                        fc1Var.X0 = 0.0f;
                        fc1Var.Y0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        fc1Var.f45555f1 = true;
                        fc1Var.Z0 = true;
                    }
                    float x11 = motionEvent.getX(i7);
                    float y11 = motionEvent.getY(i7);
                    float x12 = fc1Var.U0 - ((motionEvent.getX(i10) + x11) / 2.0f);
                    float y12 = fc1Var.V0 - ((motionEvent.getY(i10) + y11) / 2.0f);
                    float f10 = fc1Var.f45552e1;
                    fc1Var.X0 = (-x12) / f10;
                    fc1Var.Y0 = (-y12) / f10;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    fc1.a(fc1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((fc1Var.f45547c1 == motionEvent.getPointerId(0) && fc1Var.f45549d1 == motionEvent.getPointerId(1)) || (fc1Var.f45547c1 == motionEvent.getPointerId(1) && fc1Var.f45549d1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                fc1.a(fc1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(k2Var.getX(), k2Var.getY(), k2Var.getX() + k2Var.getMeasuredWidth(), k2Var.getY() + k2Var.getMeasuredHeight());
                rectF.inset(((k2Var.getMeasuredHeight() * k2Var.T) - k2Var.getMeasuredHeight()) / 2.0f, ((k2Var.getMeasuredWidth() * k2Var.T) - k2Var.getMeasuredWidth()) / 2.0f);
                if (!c40.f44544w5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, k2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, k2Var.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                fc1Var.f45557g1 = contains;
                if (!contains) {
                    fc1.a(fc1Var);
                }
            }
            if (fc1Var.f45557g1 && !fc1Var.Z0 && motionEvent.getPointerCount() == 2) {
                fc1Var.W0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                fc1Var.f45541a1 = x13;
                fc1Var.U0 = x13;
                float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                fc1Var.f45544b1 = y13;
                fc1Var.V0 = y13;
                fc1Var.f45552e1 = 1.0f;
                fc1Var.f45547c1 = motionEvent.getPointerId(0);
                fc1Var.f45549d1 = motionEvent.getPointerId(1);
                fc1Var.Z0 = true;
            }
        }
        fc1Var.f45574s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f43629c = false;
                }
            } else if (this.f43629c) {
                float x14 = motionEvent.getX() - this.f43627a;
                float y14 = motionEvent.getY() - this.f43628b;
                long currentTimeMillis = System.currentTimeMillis();
                float f11 = (y14 * y14) + (x14 * x14);
                float f12 = fc1Var.f45575s0;
                if (f11 < f12 * f12 && currentTimeMillis - this.d < 300 && currentTimeMillis - fc1Var.J0 > 300) {
                    fc1Var.J0 = System.currentTimeMillis();
                    if (fc1Var.B0) {
                        fc1Var.d(false);
                    } else if (fc1Var.f45584y0) {
                        fc1Var.r(!fc1Var.f45580w0);
                        fc1Var.f45570p0 = fc1Var.f45569o0;
                        if (!fc1Var.f45580w0 && (zoVar = fc1Var.M0) != null && zoVar.V) {
                            zoVar.f(true);
                        }
                        fc1Var.y();
                    }
                }
                this.f43629c = false;
            }
        } else {
            this.f43627a = motionEvent.getX();
            this.f43628b = motionEvent.getY();
            this.f43629c = true;
            this.d = System.currentTimeMillis();
        }
        if (!fc1Var.f45557g1 && !this.f43629c) {
            return false;
        }
        return true;
    }
}
