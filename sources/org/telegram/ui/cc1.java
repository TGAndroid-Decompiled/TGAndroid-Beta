package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
public final class cc1 extends FrameLayout {
    public float f46480a;
    public float f46481b;
    public boolean f46482c;
    public long d;
    public final hc1 f46483e;

    public cc1(hc1 hc1Var, Activity activity) {
        super(activity);
        this.f46483e = hc1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        hc1 hc1Var = this.f46483e;
        org.telegram.ui.Components.voip.x2 x2Var = hc1Var.f48292w;
        if (view == x2Var && (hc1Var.f48281n0 || hc1Var.m0)) {
            return false;
        }
        if ((view != x2Var && view != hc1Var.f48261d0 && (view != hc1Var.Z || !hc1Var.f48256b0)) || (!hc1Var.f48270g1 && hc1Var.f48274i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = hc1Var.f48268f1;
        canvas.scale(f10, f10, hc1Var.f48257b1, hc1Var.f48260c1);
        canvas.translate(hc1Var.Y0, hc1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hc1 hc1Var = this.f46483e;
        tb1 tb1Var = hc1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            hc1Var.E.b(false, false);
            hc1Var.f48292w.a();
            org.telegram.messenger.g0.r(tb1Var);
            if (hc1Var.f48283p0 == 3) {
                org.telegram.messenger.g0.h3(tb1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.n2 n2Var;
        org.telegram.ui.Components.pp ppVar;
        hc1 hc1Var = this.f46483e;
        tb1 tb1Var = hc1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            hc1Var.E.b(false, false);
            hc1Var.f48292w.a();
            org.telegram.messenger.g0.r(tb1Var);
            if (hc1Var.f48283p0 == 3) {
                org.telegram.messenger.g0.h3(tb1Var, 10000L);
            }
        }
        if (!hc1Var.f48272h1 && !hc1Var.f48254a1 && !hc1Var.f48270g1 && motionEvent.getActionMasked() != 0) {
            hc1.a(hc1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            hc1Var.f48272h1 = false;
            hc1Var.f48254a1 = false;
            hc1Var.f48270g1 = false;
        }
        if (hc1Var.m0) {
            n2Var = hc1Var.f48261d0;
        } else {
            n2Var = hc1Var.f48264e0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && hc1Var.f48254a1) {
                int i7 = -1;
                int i10 = -1;
                for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                    if (hc1Var.f48262d1 == motionEvent.getPointerId(i11)) {
                        i7 = i11;
                    }
                    if (hc1Var.f48265e1 == motionEvent.getPointerId(i11)) {
                        i10 = i11;
                    }
                }
                if (i7 != -1 && i10 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7))) / hc1Var.X0;
                    hc1Var.f48268f1 = hypot;
                    if (hypot > 1.005f && !hc1Var.f48270g1) {
                        hc1Var.X0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i7), motionEvent.getY(i10) - motionEvent.getY(i7));
                        float x10 = (motionEvent.getX(i10) + motionEvent.getX(i7)) / 2.0f;
                        hc1Var.f48257b1 = x10;
                        hc1Var.V0 = x10;
                        float y10 = (motionEvent.getY(i10) + motionEvent.getY(i7)) / 2.0f;
                        hc1Var.f48260c1 = y10;
                        hc1Var.W0 = y10;
                        hc1Var.f48268f1 = 1.0f;
                        hc1Var.Y0 = 0.0f;
                        hc1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        hc1Var.f48270g1 = true;
                        hc1Var.f48254a1 = true;
                    }
                    float x11 = motionEvent.getX(i7);
                    float y11 = motionEvent.getY(i7);
                    float x12 = hc1Var.V0 - ((motionEvent.getX(i10) + x11) / 2.0f);
                    float y12 = hc1Var.W0 - ((motionEvent.getY(i10) + y11) / 2.0f);
                    float f10 = hc1Var.f48268f1;
                    hc1Var.Y0 = (-x12) / f10;
                    hc1Var.Z0 = (-y12) / f10;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    hc1.a(hc1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((hc1Var.f48262d1 == motionEvent.getPointerId(0) && hc1Var.f48265e1 == motionEvent.getPointerId(1)) || (hc1Var.f48262d1 == motionEvent.getPointerId(1) && hc1Var.f48265e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
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
                hc1Var.f48272h1 = contains;
                if (!contains) {
                    hc1.a(hc1Var);
                }
            }
            if (hc1Var.f48272h1 && !hc1Var.f48254a1 && motionEvent.getPointerCount() == 2) {
                hc1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                hc1Var.f48257b1 = x13;
                hc1Var.V0 = x13;
                float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                hc1Var.f48260c1 = y13;
                hc1Var.W0 = y13;
                hc1Var.f48268f1 = 1.0f;
                hc1Var.f48262d1 = motionEvent.getPointerId(0);
                hc1Var.f48265e1 = motionEvent.getPointerId(1);
                hc1Var.f48254a1 = true;
            }
        }
        hc1Var.f48287s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f46482c = false;
                }
            } else if (this.f46482c) {
                float x14 = motionEvent.getX() - this.f46480a;
                float y14 = motionEvent.getY() - this.f46481b;
                long currentTimeMillis = System.currentTimeMillis();
                float f11 = (y14 * y14) + (x14 * x14);
                float f12 = hc1Var.f48289t0;
                if (f11 < f12 * f12 && currentTimeMillis - this.d < 300 && currentTimeMillis - hc1Var.K0 > 300) {
                    hc1Var.K0 = System.currentTimeMillis();
                    if (hc1Var.C0) {
                        hc1Var.d(false);
                    } else if (hc1Var.f48298z0) {
                        hc1Var.r(!hc1Var.f48295x0);
                        hc1Var.f48284q0 = hc1Var.f48283p0;
                        if (!hc1Var.f48295x0 && (ppVar = hc1Var.N0) != null && ppVar.W) {
                            ppVar.f(true);
                        }
                        hc1Var.y();
                    }
                }
                this.f46482c = false;
            }
        } else {
            this.f46480a = motionEvent.getX();
            this.f46481b = motionEvent.getY();
            this.f46482c = true;
            this.d = System.currentTimeMillis();
        }
        if (!hc1Var.f48272h1 && !this.f46482c) {
            return false;
        }
        return true;
    }
}
