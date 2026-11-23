package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class ac1 extends FrameLayout {
    public float f45654a;
    public float f45655b;
    public boolean f45656c;
    public long d;
    public final fc1 f45657e;

    public ac1(fc1 fc1Var, Activity activity) {
        super(activity);
        this.f45657e = fc1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        fc1 fc1Var = this.f45657e;
        org.telegram.ui.Components.voip.y2 y2Var = fc1Var.f47792w;
        if (view == y2Var && (fc1Var.f47781n0 || fc1Var.m0)) {
            return false;
        }
        if ((view != y2Var && view != fc1Var.f47761d0 && (view != fc1Var.Z || !fc1Var.f47756b0)) || (!fc1Var.f47770g1 && fc1Var.f47774i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = fc1Var.f47768f1;
        canvas.scale(f10, f10, fc1Var.f47757b1, fc1Var.f47760c1);
        canvas.translate(fc1Var.Y0, fc1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fc1 fc1Var = this.f45657e;
        rb1 rb1Var = fc1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            fc1Var.E.b(false, false);
            fc1Var.f47792w.a();
            org.telegram.messenger.g0.r(rb1Var);
            if (fc1Var.f47783p0 == 3) {
                org.telegram.messenger.g0.h3(rb1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.o2 o2Var;
        org.telegram.ui.Components.op opVar;
        fc1 fc1Var = this.f45657e;
        rb1 rb1Var = fc1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            fc1Var.E.b(false, false);
            fc1Var.f47792w.a();
            org.telegram.messenger.g0.r(rb1Var);
            if (fc1Var.f47783p0 == 3) {
                org.telegram.messenger.g0.h3(rb1Var, 10000L);
            }
        }
        if (!fc1Var.f47772h1 && !fc1Var.f47754a1 && !fc1Var.f47770g1 && motionEvent.getActionMasked() != 0) {
            fc1.a(fc1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            fc1Var.f47772h1 = false;
            fc1Var.f47754a1 = false;
            fc1Var.f47770g1 = false;
        }
        if (fc1Var.m0) {
            o2Var = fc1Var.f47761d0;
        } else {
            o2Var = fc1Var.f47764e0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && fc1Var.f47754a1) {
                int i7 = -1;
                int i10 = -1;
                for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                    if (fc1Var.f47762d1 == motionEvent.getPointerId(i11)) {
                        i7 = i11;
                    }
                    if (fc1Var.f47765e1 == motionEvent.getPointerId(i11)) {
                        i10 = i11;
                    }
                }
                if (i7 != -1 && i10 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / fc1Var.X0;
                    fc1Var.f47768f1 = hypot;
                    if (hypot > 1.005f && !fc1Var.f47770g1) {
                        fc1Var.X0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7));
                        float x10 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                        fc1Var.f47757b1 = x10;
                        fc1Var.V0 = x10;
                        float y10 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                        fc1Var.f47760c1 = y10;
                        fc1Var.W0 = y10;
                        fc1Var.f47768f1 = 1.0f;
                        fc1Var.Y0 = 0.0f;
                        fc1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        fc1Var.f47770g1 = true;
                        fc1Var.f47754a1 = true;
                    }
                    float x11 = motionEvent.getX(i7);
                    float y11 = motionEvent.getY(i7);
                    float x12 = fc1Var.V0 - ((motionEvent.getX(i10) + x11) / 2.0f);
                    float y12 = fc1Var.W0 - ((motionEvent.getY(i10) + y11) / 2.0f);
                    float f10 = fc1Var.f47768f1;
                    fc1Var.Y0 = (-x12) / f10;
                    fc1Var.Z0 = (-y12) / f10;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    fc1.a(fc1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((fc1Var.f47762d1 == motionEvent.getPointerId(0) && fc1Var.f47765e1 == motionEvent.getPointerId(1)) || (fc1Var.f47762d1 == motionEvent.getPointerId(1) && fc1Var.f47765e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                fc1.a(fc1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(o2Var.getX(), o2Var.getY(), o2Var.getX() + o2Var.getMeasuredWidth(), o2Var.getY() + o2Var.getMeasuredHeight());
                rectF.inset(((o2Var.getMeasuredHeight() * o2Var.U) - o2Var.getMeasuredHeight()) / 2.0f, ((o2Var.getMeasuredWidth() * o2Var.U) - o2Var.getMeasuredWidth()) / 2.0f);
                if (!e40.E5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, o2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, o2Var.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                fc1Var.f47772h1 = contains;
                if (!contains) {
                    fc1.a(fc1Var);
                }
            }
            if (fc1Var.f47772h1 && !fc1Var.f47754a1 && motionEvent.getPointerCount() == 2) {
                fc1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                fc1Var.f47757b1 = x13;
                fc1Var.V0 = x13;
                float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                fc1Var.f47760c1 = y13;
                fc1Var.W0 = y13;
                fc1Var.f47768f1 = 1.0f;
                fc1Var.f47762d1 = motionEvent.getPointerId(0);
                fc1Var.f47765e1 = motionEvent.getPointerId(1);
                fc1Var.f47754a1 = true;
            }
        }
        fc1Var.f47787s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f45656c = false;
                }
            } else if (this.f45656c) {
                float x14 = motionEvent.getX() - this.f45654a;
                float y14 = motionEvent.getY() - this.f45655b;
                long currentTimeMillis = System.currentTimeMillis();
                float f11 = (y14 * y14) + (x14 * x14);
                float f12 = fc1Var.f47789t0;
                if (f11 < f12 * f12 && currentTimeMillis - this.d < 300 && currentTimeMillis - fc1Var.K0 > 300) {
                    fc1Var.K0 = System.currentTimeMillis();
                    if (fc1Var.C0) {
                        fc1Var.d(false);
                    } else if (fc1Var.f47798z0) {
                        fc1Var.r(!fc1Var.f47795x0);
                        fc1Var.f47784q0 = fc1Var.f47783p0;
                        if (!fc1Var.f47795x0 && (opVar = fc1Var.N0) != null && opVar.W) {
                            opVar.f(true);
                        }
                        fc1Var.y();
                    }
                }
                this.f45656c = false;
            }
        } else {
            this.f45654a = motionEvent.getX();
            this.f45655b = motionEvent.getY();
            this.f45656c = true;
            this.d = System.currentTimeMillis();
        }
        if (!fc1Var.f47772h1 && !this.f45656c) {
            return false;
        }
        return true;
    }
}
