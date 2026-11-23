package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class cc1 extends FrameLayout {
    public float f46513a;
    public float f46514b;
    public boolean f46515c;
    public long d;
    public final hc1 f46516e;

    public cc1(hc1 hc1Var, Activity activity) {
        super(activity);
        this.f46516e = hc1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        hc1 hc1Var = this.f46516e;
        org.telegram.ui.Components.voip.x2 x2Var = hc1Var.f48370w;
        if (view == x2Var && (hc1Var.f48359n0 || hc1Var.m0)) {
            return false;
        }
        if ((view != x2Var && view != hc1Var.f48339d0 && (view != hc1Var.Z || !hc1Var.f48334b0)) || (!hc1Var.f48348g1 && hc1Var.f48352i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = hc1Var.f48346f1;
        canvas.scale(f10, f10, hc1Var.f48335b1, hc1Var.f48338c1);
        canvas.translate(hc1Var.Y0, hc1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hc1 hc1Var = this.f46516e;
        tb1 tb1Var = hc1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            hc1Var.E.b(false, false);
            hc1Var.f48370w.a();
            org.telegram.messenger.g0.r(tb1Var);
            if (hc1Var.f48361p0 == 3) {
                org.telegram.messenger.g0.h3(tb1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.n2 n2Var;
        org.telegram.ui.Components.rp rpVar;
        hc1 hc1Var = this.f46516e;
        tb1 tb1Var = hc1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            hc1Var.E.b(false, false);
            hc1Var.f48370w.a();
            org.telegram.messenger.g0.r(tb1Var);
            if (hc1Var.f48361p0 == 3) {
                org.telegram.messenger.g0.h3(tb1Var, 10000L);
            }
        }
        if (!hc1Var.f48350h1 && !hc1Var.f48332a1 && !hc1Var.f48348g1 && motionEvent.getActionMasked() != 0) {
            hc1.a(hc1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            hc1Var.f48350h1 = false;
            hc1Var.f48332a1 = false;
            hc1Var.f48348g1 = false;
        }
        if (hc1Var.m0) {
            n2Var = hc1Var.f48339d0;
        } else {
            n2Var = hc1Var.f48342e0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && hc1Var.f48332a1) {
                int i7 = -1;
                int i10 = -1;
                for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                    if (hc1Var.f48340d1 == motionEvent.getPointerId(i11)) {
                        i7 = i11;
                    }
                    if (hc1Var.f48343e1 == motionEvent.getPointerId(i11)) {
                        i10 = i11;
                    }
                }
                if (i7 != -1 && i10 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / hc1Var.X0;
                    hc1Var.f48346f1 = hypot;
                    if (hypot > 1.005f && !hc1Var.f48348g1) {
                        hc1Var.X0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7));
                        float x10 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                        hc1Var.f48335b1 = x10;
                        hc1Var.V0 = x10;
                        float y10 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                        hc1Var.f48338c1 = y10;
                        hc1Var.W0 = y10;
                        hc1Var.f48346f1 = 1.0f;
                        hc1Var.Y0 = 0.0f;
                        hc1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        hc1Var.f48348g1 = true;
                        hc1Var.f48332a1 = true;
                    }
                    float x11 = motionEvent.getX(i7);
                    float y11 = motionEvent.getY(i7);
                    float x12 = hc1Var.V0 - ((motionEvent.getX(i10) + x11) / 2.0f);
                    float y12 = hc1Var.W0 - ((motionEvent.getY(i10) + y11) / 2.0f);
                    float f10 = hc1Var.f48346f1;
                    hc1Var.Y0 = (-x12) / f10;
                    hc1Var.Z0 = (-y12) / f10;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    hc1.a(hc1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((hc1Var.f48340d1 == motionEvent.getPointerId(0) && hc1Var.f48343e1 == motionEvent.getPointerId(1)) || (hc1Var.f48340d1 == motionEvent.getPointerId(1) && hc1Var.f48343e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                hc1.a(hc1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(n2Var.getX(), n2Var.getY(), n2Var.getX() + n2Var.getMeasuredWidth(), n2Var.getY() + n2Var.getMeasuredHeight());
                rectF.inset(((n2Var.getMeasuredHeight() * n2Var.U) - n2Var.getMeasuredHeight()) / 2.0f, ((n2Var.getMeasuredWidth() * n2Var.U) - n2Var.getMeasuredWidth()) / 2.0f);
                if (!f40.E5) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, n2Var.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, n2Var.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                hc1Var.f48350h1 = contains;
                if (!contains) {
                    hc1.a(hc1Var);
                }
            }
            if (hc1Var.f48350h1 && !hc1Var.f48332a1 && motionEvent.getPointerCount() == 2) {
                hc1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                hc1Var.f48335b1 = x13;
                hc1Var.V0 = x13;
                float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                hc1Var.f48338c1 = y13;
                hc1Var.W0 = y13;
                hc1Var.f48346f1 = 1.0f;
                hc1Var.f48340d1 = motionEvent.getPointerId(0);
                hc1Var.f48343e1 = motionEvent.getPointerId(1);
                hc1Var.f48332a1 = true;
            }
        }
        hc1Var.f48365s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f46515c = false;
                }
            } else if (this.f46515c) {
                float x14 = motionEvent.getX() - this.f46513a;
                float y14 = motionEvent.getY() - this.f46514b;
                long currentTimeMillis = System.currentTimeMillis();
                float f11 = (y14 * y14) + (x14 * x14);
                float f12 = hc1Var.f48367t0;
                if (f11 < f12 * f12 && currentTimeMillis - this.d < 300 && currentTimeMillis - hc1Var.K0 > 300) {
                    hc1Var.K0 = System.currentTimeMillis();
                    if (hc1Var.C0) {
                        hc1Var.d(false);
                    } else if (hc1Var.f48376z0) {
                        hc1Var.r(!hc1Var.f48373x0);
                        hc1Var.f48362q0 = hc1Var.f48361p0;
                        if (!hc1Var.f48373x0 && (rpVar = hc1Var.N0) != null && rpVar.W) {
                            rpVar.f(true);
                        }
                        hc1Var.y();
                    }
                }
                this.f46515c = false;
            }
        } else {
            this.f46513a = motionEvent.getX();
            this.f46514b = motionEvent.getY();
            this.f46515c = true;
            this.d = System.currentTimeMillis();
        }
        if (!hc1Var.f48350h1 && !this.f46515c) {
            return false;
        }
        return true;
    }
}
