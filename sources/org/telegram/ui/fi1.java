package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class fi1 extends FrameLayout {
    public float f36339a;
    public float f36340b;
    public boolean f36341c;
    public long d;
    public final ki1 f36342e;

    public fi1(ki1 ki1Var, Activity activity) {
        super(activity);
        this.f36342e = ki1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        ki1 ki1Var = this.f36342e;
        org.telegram.ui.Components.voip.d3 d3Var = ki1Var.v;
        if (view == d3Var && (ki1Var.f38048n0 || ki1Var.m0)) {
            return false;
        }
        if ((view != d3Var && view != ki1Var.f38025c0 && (view != ki1Var.Y || !ki1Var.f38019a0)) || (!ki1Var.f38036g1 && ki1Var.f38040i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f7 = ki1Var.f38034f1;
        canvas.scale(f7, f7, ki1Var.f38023b1, ki1Var.f38026c1);
        canvas.translate(ki1Var.Y0, ki1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ki1 ki1Var = this.f36342e;
        uh1 uh1Var = ki1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ki1Var.f38063y.b(false, false);
            ki1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(uh1Var);
            if (ki1Var.f38050p0 == 3) {
                AndroidUtilities.runOnUIThread(uh1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.t2 t2Var;
        org.telegram.ui.Components.voip.e3 e3Var;
        ki1 ki1Var = this.f36342e;
        uh1 uh1Var = ki1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            ki1Var.f38063y.b(false, false);
            ki1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(uh1Var);
            if (ki1Var.f38050p0 == 3) {
                AndroidUtilities.runOnUIThread(uh1Var, 10000L);
            }
        }
        if (!ki1Var.f38038h1 && !ki1Var.f38020a1 && !ki1Var.f38036g1 && motionEvent.getActionMasked() != 0) {
            ki1.j(ki1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            ki1Var.f38038h1 = false;
            ki1Var.f38020a1 = false;
            ki1Var.f38036g1 = false;
        }
        if (ki1Var.m0) {
            t2Var = ki1Var.f38025c0;
        } else {
            t2Var = ki1Var.f38027d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && ki1Var.f38020a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (ki1Var.f38028d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (ki1Var.f38031e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / ki1Var.X0;
                    ki1Var.f38034f1 = hypot;
                    if (hypot > 1.005f && !ki1Var.f38036g1) {
                        ki1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        ki1Var.f38023b1 = x10;
                        ki1Var.V0 = x10;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        ki1Var.f38026c1 = y3;
                        ki1Var.W0 = y3;
                        ki1Var.f38034f1 = 1.0f;
                        ki1Var.Y0 = 0.0f;
                        ki1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        ki1Var.f38036g1 = true;
                        ki1Var.f38020a1 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x12 = ki1Var.V0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y11 = ki1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = ki1Var.f38034f1;
                    ki1Var.Y0 = (-x12) / f7;
                    ki1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    ki1.j(ki1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((ki1Var.f38028d1 == motionEvent.getPointerId(0) && ki1Var.f38031e1 == motionEvent.getPointerId(1)) || (ki1Var.f38028d1 == motionEvent.getPointerId(1) && ki1Var.f38031e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                ki1.j(ki1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(t2Var.getX(), t2Var.getY(), t2Var.getX() + t2Var.getMeasuredWidth(), t2Var.getY() + t2Var.getMeasuredHeight());
                rectF.inset(((t2Var.getMeasuredHeight() * t2Var.T) - t2Var.getMeasuredHeight()) / 2.0f, ((t2Var.getMeasuredWidth() * t2Var.T) - t2Var.getMeasuredWidth()) / 2.0f);
                if (!h60.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, t2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, t2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                ki1Var.f38038h1 = contains;
                if (!contains) {
                    ki1.j(ki1Var);
                }
            }
            if (ki1Var.f38038h1 && !ki1Var.f38020a1 && motionEvent.getPointerCount() == 2) {
                ki1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                ki1Var.f38023b1 = x13;
                ki1Var.V0 = x13;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                ki1Var.f38026c1 = y12;
                ki1Var.W0 = y12;
                ki1Var.f38034f1 = 1.0f;
                ki1Var.f38028d1 = motionEvent.getPointerId(0);
                ki1Var.f38031e1 = motionEvent.getPointerId(1);
                ki1Var.f38020a1 = true;
            }
        }
        ki1Var.f38054s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f36341c = false;
                }
            } else if (this.f36341c) {
                float x14 = motionEvent.getX() - this.f36339a;
                float y13 = motionEvent.getY() - this.f36340b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x14 * x14);
                float f11 = ki1Var.f38056t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - ki1Var.K0 > 300) {
                    ki1Var.K0 = System.currentTimeMillis();
                    if (ki1Var.C0) {
                        ki1Var.m(false);
                    } else if (ki1Var.f38065z0) {
                        ki1Var.A(!ki1Var.f38062x0);
                        ki1Var.f38051q0 = ki1Var.f38050p0;
                        if (!ki1Var.f38062x0 && (e3Var = ki1Var.N0) != null && e3Var.V) {
                            e3Var.e(true);
                        }
                        ki1Var.H();
                    }
                }
                this.f36341c = false;
            }
        } else {
            this.f36339a = motionEvent.getX();
            this.f36340b = motionEvent.getY();
            this.f36341c = true;
            this.d = System.currentTimeMillis();
        }
        if (!ki1Var.f38038h1 && !this.f36341c) {
            return false;
        }
        return true;
    }
}
