package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class ec1 extends FrameLayout {
    public float f45233a;
    public float f45234b;
    public boolean f45235c;
    public long d;
    public final jc1 f45236e;

    public ec1(jc1 jc1Var, Activity activity) {
        super(activity);
        this.f45236e = jc1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        jc1 jc1Var = this.f45236e;
        org.telegram.ui.Components.voip.u2 u2Var = jc1Var.f46947w;
        if (view == u2Var && (jc1Var.m0 || jc1Var.f46934l0)) {
            return false;
        }
        if ((view != u2Var && view != jc1Var.f46914c0 && (view != jc1Var.Y || !jc1Var.f46908a0)) || (!jc1Var.f46923f1 && jc1Var.f46927h1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = jc1Var.f46920e1;
        canvas.scale(f10, f10, jc1Var.f46909a1, jc1Var.f46912b1);
        canvas.translate(jc1Var.X0, jc1Var.Y0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        jc1 jc1Var = this.f45236e;
        vb1 vb1Var = jc1Var.S0;
        if (motionEvent.getActionMasked() == 1) {
            jc1Var.D.b(false, false);
            jc1Var.f46947w.a();
            org.telegram.messenger.g0.r(vb1Var);
            if (jc1Var.f46937o0 == 3) {
                org.telegram.messenger.g0.i3(vb1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.k2 k2Var;
        org.telegram.ui.Components.zo zoVar;
        jc1 jc1Var = this.f45236e;
        vb1 vb1Var = jc1Var.S0;
        if (motionEvent.getActionMasked() == 1) {
            jc1Var.D.b(false, false);
            jc1Var.f46947w.a();
            org.telegram.messenger.g0.r(vb1Var);
            if (jc1Var.f46937o0 == 3) {
                org.telegram.messenger.g0.i3(vb1Var, 10000L);
            }
        }
        if (!jc1Var.f46925g1 && !jc1Var.Z0 && !jc1Var.f46923f1 && motionEvent.getActionMasked() != 0) {
            jc1.a(jc1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            jc1Var.f46925g1 = false;
            jc1Var.Z0 = false;
            jc1Var.f46923f1 = false;
        }
        if (jc1Var.f46934l0) {
            k2Var = jc1Var.f46914c0;
        } else {
            k2Var = jc1Var.f46916d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && jc1Var.Z0) {
                int i7 = -1;
                int i10 = -1;
                for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                    if (jc1Var.f46915c1 == motionEvent.getPointerId(i11)) {
                        i7 = i11;
                    }
                    if (jc1Var.f46917d1 == motionEvent.getPointerId(i11)) {
                        i10 = i11;
                    }
                }
                if (i7 != -1 && i10 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / jc1Var.W0;
                    jc1Var.f46920e1 = hypot;
                    if (hypot > 1.005f && !jc1Var.f46923f1) {
                        jc1Var.W0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7));
                        float x10 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                        jc1Var.f46909a1 = x10;
                        jc1Var.U0 = x10;
                        float y10 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                        jc1Var.f46912b1 = y10;
                        jc1Var.V0 = y10;
                        jc1Var.f46920e1 = 1.0f;
                        jc1Var.X0 = 0.0f;
                        jc1Var.Y0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        jc1Var.f46923f1 = true;
                        jc1Var.Z0 = true;
                    }
                    float x11 = motionEvent.getX(i7);
                    float y11 = motionEvent.getY(i7);
                    float x12 = jc1Var.U0 - ((motionEvent.getX(i10) + x11) / 2.0f);
                    float y12 = jc1Var.V0 - ((motionEvent.getY(i10) + y11) / 2.0f);
                    float f10 = jc1Var.f46920e1;
                    jc1Var.X0 = (-x12) / f10;
                    jc1Var.Y0 = (-y12) / f10;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    jc1.a(jc1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((jc1Var.f46915c1 == motionEvent.getPointerId(0) && jc1Var.f46917d1 == motionEvent.getPointerId(1)) || (jc1Var.f46915c1 == motionEvent.getPointerId(1) && jc1Var.f46917d1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                jc1.a(jc1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(k2Var.getX(), k2Var.getY(), k2Var.getX() + k2Var.getMeasuredWidth(), k2Var.getY() + k2Var.getMeasuredHeight());
                rectF.inset(((k2Var.getMeasuredHeight() * k2Var.T) - k2Var.getMeasuredHeight()) / 2.0f, ((k2Var.getMeasuredWidth() * k2Var.T) - k2Var.getMeasuredWidth()) / 2.0f);
                if (!f40.f45503z5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, k2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, k2Var.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                jc1Var.f46925g1 = contains;
                if (!contains) {
                    jc1.a(jc1Var);
                }
            }
            if (jc1Var.f46925g1 && !jc1Var.Z0 && motionEvent.getPointerCount() == 2) {
                jc1Var.W0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                jc1Var.f46909a1 = x13;
                jc1Var.U0 = x13;
                float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                jc1Var.f46912b1 = y13;
                jc1Var.V0 = y13;
                jc1Var.f46920e1 = 1.0f;
                jc1Var.f46915c1 = motionEvent.getPointerId(0);
                jc1Var.f46917d1 = motionEvent.getPointerId(1);
                jc1Var.Z0 = true;
            }
        }
        jc1Var.f46942s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f45235c = false;
                }
            } else if (this.f45235c) {
                float x14 = motionEvent.getX() - this.f45233a;
                float y14 = motionEvent.getY() - this.f45234b;
                long currentTimeMillis = System.currentTimeMillis();
                float f11 = (y14 * y14) + (x14 * x14);
                float f12 = jc1Var.f46943s0;
                if (f11 < f12 * f12 && currentTimeMillis - this.d < 300 && currentTimeMillis - jc1Var.J0 > 300) {
                    jc1Var.J0 = System.currentTimeMillis();
                    if (jc1Var.B0) {
                        jc1Var.d(false);
                    } else if (jc1Var.f46952y0) {
                        jc1Var.r(!jc1Var.f46948w0);
                        jc1Var.f46938p0 = jc1Var.f46937o0;
                        if (!jc1Var.f46948w0 && (zoVar = jc1Var.M0) != null && zoVar.V) {
                            zoVar.f(true);
                        }
                        jc1Var.y();
                    }
                }
                this.f45235c = false;
            }
        } else {
            this.f45233a = motionEvent.getX();
            this.f45234b = motionEvent.getY();
            this.f45235c = true;
            this.d = System.currentTimeMillis();
        }
        if (!jc1Var.f46925g1 && !this.f45235c) {
            return false;
        }
        return true;
    }
}
