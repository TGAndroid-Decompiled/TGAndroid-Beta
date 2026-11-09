package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class dc1 extends FrameLayout {
    public float f44914a;
    public float f44915b;
    public boolean f44916c;
    public long d;
    public final ic1 f44917e;

    public dc1(ic1 ic1Var, Activity activity) {
        super(activity);
        this.f44917e = ic1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ic1 ic1Var = this.f44917e;
        org.telegram.ui.Components.voip.u2 u2Var = ic1Var.f46611w;
        if (view == u2Var && (ic1Var.m0 || ic1Var.f46598l0)) {
            return false;
        }
        if ((view != u2Var && view != ic1Var.f46578c0 && (view != ic1Var.Y || !ic1Var.f46572a0)) || (!ic1Var.f46587f1 && ic1Var.f46591h1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = ic1Var.f46584e1;
        canvas.scale(f10, f10, ic1Var.f46573a1, ic1Var.f46576b1);
        canvas.translate(ic1Var.X0, ic1Var.Y0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ic1 ic1Var = this.f44917e;
        tb1 tb1Var = ic1Var.S0;
        if (motionEvent.getActionMasked() == 1) {
            ic1Var.D.b(false, false);
            ic1Var.f46611w.a();
            org.telegram.messenger.g0.r(tb1Var);
            if (ic1Var.f46601o0 == 3) {
                org.telegram.messenger.g0.i3(tb1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.k2 k2Var;
        org.telegram.ui.Components.zo zoVar;
        ic1 ic1Var = this.f44917e;
        tb1 tb1Var = ic1Var.S0;
        if (motionEvent.getActionMasked() == 1) {
            ic1Var.D.b(false, false);
            ic1Var.f46611w.a();
            org.telegram.messenger.g0.r(tb1Var);
            if (ic1Var.f46601o0 == 3) {
                org.telegram.messenger.g0.i3(tb1Var, 10000L);
            }
        }
        if (!ic1Var.f46589g1 && !ic1Var.Z0 && !ic1Var.f46587f1 && motionEvent.getActionMasked() != 0) {
            ic1.a(ic1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ic1Var.f46589g1 = false;
            ic1Var.Z0 = false;
            ic1Var.f46587f1 = false;
        }
        if (ic1Var.f46598l0) {
            k2Var = ic1Var.f46578c0;
        } else {
            k2Var = ic1Var.f46580d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && ic1Var.Z0) {
                int i7 = -1;
                int i10 = -1;
                for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                    if (ic1Var.f46579c1 == motionEvent.getPointerId(i11)) {
                        i7 = i11;
                    }
                    if (ic1Var.f46581d1 == motionEvent.getPointerId(i11)) {
                        i10 = i11;
                    }
                }
                if (i7 != -1 && i10 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / ic1Var.W0;
                    ic1Var.f46584e1 = hypot;
                    if (hypot > 1.005f && !ic1Var.f46587f1) {
                        ic1Var.W0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7));
                        float x10 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                        ic1Var.f46573a1 = x10;
                        ic1Var.U0 = x10;
                        float y10 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                        ic1Var.f46576b1 = y10;
                        ic1Var.V0 = y10;
                        ic1Var.f46584e1 = 1.0f;
                        ic1Var.X0 = 0.0f;
                        ic1Var.Y0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        ic1Var.f46587f1 = true;
                        ic1Var.Z0 = true;
                    }
                    float x11 = motionEvent.getX(i7);
                    float y11 = motionEvent.getY(i7);
                    float x12 = ic1Var.U0 - ((motionEvent.getX(i10) + x11) / 2.0f);
                    float y12 = ic1Var.V0 - ((motionEvent.getY(i10) + y11) / 2.0f);
                    float f10 = ic1Var.f46584e1;
                    ic1Var.X0 = (-x12) / f10;
                    ic1Var.Y0 = (-y12) / f10;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    ic1.a(ic1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ic1Var.f46579c1 == motionEvent.getPointerId(0) && ic1Var.f46581d1 == motionEvent.getPointerId(1)) || (ic1Var.f46579c1 == motionEvent.getPointerId(1) && ic1Var.f46581d1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ic1.a(ic1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(k2Var.getX(), k2Var.getY(), k2Var.getX() + k2Var.getMeasuredWidth(), k2Var.getY() + k2Var.getMeasuredHeight());
                rectF.inset(((k2Var.getMeasuredHeight() * k2Var.T) - k2Var.getMeasuredHeight()) / 2.0f, ((k2Var.getMeasuredWidth() * k2Var.T) - k2Var.getMeasuredWidth()) / 2.0f);
                if (!e40.f45184w5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, k2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, k2Var.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ic1Var.f46589g1 = contains;
                if (!contains) {
                    ic1.a(ic1Var);
                }
            }
            if (ic1Var.f46589g1 && !ic1Var.Z0 && motionEvent.getPointerCount() == 2) {
                ic1Var.W0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ic1Var.f46573a1 = x13;
                ic1Var.U0 = x13;
                float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ic1Var.f46576b1 = y13;
                ic1Var.V0 = y13;
                ic1Var.f46584e1 = 1.0f;
                ic1Var.f46579c1 = motionEvent.getPointerId(0);
                ic1Var.f46581d1 = motionEvent.getPointerId(1);
                ic1Var.Z0 = true;
            }
        }
        ic1Var.f46606s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f44916c = false;
                }
            } else if (this.f44916c) {
                float x14 = motionEvent.getX() - this.f44914a;
                float y14 = motionEvent.getY() - this.f44915b;
                long currentTimeMillis = System.currentTimeMillis();
                float f11 = (y14 * y14) + (x14 * x14);
                float f12 = ic1Var.f46607s0;
                if (f11 < f12 * f12 && currentTimeMillis - this.d < 300 && currentTimeMillis - ic1Var.J0 > 300) {
                    ic1Var.J0 = System.currentTimeMillis();
                    if (ic1Var.B0) {
                        ic1Var.d(false);
                    } else if (ic1Var.f46616y0) {
                        ic1Var.r(!ic1Var.f46612w0);
                        ic1Var.f46602p0 = ic1Var.f46601o0;
                        if (!ic1Var.f46612w0 && (zoVar = ic1Var.M0) != null && zoVar.V) {
                            zoVar.f(true);
                        }
                        ic1Var.y();
                    }
                }
                this.f44916c = false;
            }
        } else {
            this.f44914a = motionEvent.getX();
            this.f44915b = motionEvent.getY();
            this.f44916c = true;
            this.d = System.currentTimeMillis();
        }
        if (!ic1Var.f46589g1 && !this.f44916c) {
            return false;
        }
        return true;
    }
}
