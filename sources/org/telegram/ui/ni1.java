package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class ni1 extends FrameLayout {
    public float f35953a;
    public float f35954b;
    public boolean f35955c;
    public long d;
    public final si1 e;

    public ni1(si1 si1Var, Activity activity) {
        super(activity);
        this.e = si1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        si1 si1Var = this.e;
        org.telegram.ui.Components.voip.c3 c3Var = si1Var.v;
        if (view == c3Var && (si1Var.f37324n0 || si1Var.m0)) {
            return false;
        }
        if ((view != c3Var && view != si1Var.f37302c0 && (view != si1Var.Y || !si1Var.f37296a0)) || (!si1Var.f37312g1 && si1Var.f37316i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f7 = si1Var.f37310f1;
        canvas.scale(f7, f7, si1Var.f37300b1, si1Var.f37303c1);
        canvas.translate(si1Var.Y0, si1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        si1 si1Var = this.e;
        ci1 ci1Var = si1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            si1Var.f37339y.b(false, false);
            si1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ci1Var);
            if (si1Var.f37326p0 == 3) {
                AndroidUtilities.runOnUIThread(ci1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.s2 s2Var;
        org.telegram.ui.Components.voip.d3 d3Var;
        si1 si1Var = this.e;
        ci1 ci1Var = si1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            si1Var.f37339y.b(false, false);
            si1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(ci1Var);
            if (si1Var.f37326p0 == 3) {
                AndroidUtilities.runOnUIThread(ci1Var, 10000L);
            }
        }
        if (!si1Var.f37314h1 && !si1Var.f37297a1 && !si1Var.f37312g1 && motionEvent.getActionMasked() != 0) {
            si1.j(si1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            si1Var.f37314h1 = false;
            si1Var.f37297a1 = false;
            si1Var.f37312g1 = false;
        }
        if (si1Var.m0) {
            s2Var = si1Var.f37302c0;
        } else {
            s2Var = si1Var.f37304d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && si1Var.f37297a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (si1Var.f37305d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (si1Var.f37307e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / si1Var.X0;
                    si1Var.f37310f1 = hypot;
                    if (hypot > 1.005f && !si1Var.f37312g1) {
                        si1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        si1Var.f37300b1 = x10;
                        si1Var.V0 = x10;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        si1Var.f37303c1 = y3;
                        si1Var.W0 = y3;
                        si1Var.f37310f1 = 1.0f;
                        si1Var.Y0 = 0.0f;
                        si1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        si1Var.f37312g1 = true;
                        si1Var.f37297a1 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x12 = si1Var.V0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y11 = si1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = si1Var.f37310f1;
                    si1Var.Y0 = (-x12) / f7;
                    si1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    si1.j(si1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((si1Var.f37305d1 == motionEvent.getPointerId(0) && si1Var.f37307e1 == motionEvent.getPointerId(1)) || (si1Var.f37305d1 == motionEvent.getPointerId(1) && si1Var.f37307e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                si1.j(si1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(s2Var.getX(), s2Var.getY(), s2Var.getX() + s2Var.getMeasuredWidth(), s2Var.getY() + s2Var.getMeasuredHeight());
                rectF.inset(((s2Var.getMeasuredHeight() * s2Var.T) - s2Var.getMeasuredHeight()) / 2.0f, ((s2Var.getMeasuredWidth() * s2Var.T) - s2Var.getMeasuredWidth()) / 2.0f);
                if (!i60.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, s2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, s2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                si1Var.f37314h1 = contains;
                if (!contains) {
                    si1.j(si1Var);
                }
            }
            if (si1Var.f37314h1 && !si1Var.f37297a1 && motionEvent.getPointerCount() == 2) {
                si1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                si1Var.f37300b1 = x13;
                si1Var.V0 = x13;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                si1Var.f37303c1 = y12;
                si1Var.W0 = y12;
                si1Var.f37310f1 = 1.0f;
                si1Var.f37305d1 = motionEvent.getPointerId(0);
                si1Var.f37307e1 = motionEvent.getPointerId(1);
                si1Var.f37297a1 = true;
            }
        }
        si1Var.f37330s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f35955c = false;
                }
            } else if (this.f35955c) {
                float x14 = motionEvent.getX() - this.f35953a;
                float y13 = motionEvent.getY() - this.f35954b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x14 * x14);
                float f11 = si1Var.f37332t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - si1Var.K0 > 300) {
                    si1Var.K0 = System.currentTimeMillis();
                    if (si1Var.C0) {
                        si1Var.m(false);
                    } else if (si1Var.f37341z0) {
                        si1Var.A(!si1Var.f37338x0);
                        si1Var.f37327q0 = si1Var.f37326p0;
                        if (!si1Var.f37338x0 && (d3Var = si1Var.N0) != null && d3Var.V) {
                            d3Var.e(true);
                        }
                        si1Var.H();
                    }
                }
                this.f35955c = false;
            }
        } else {
            this.f35953a = motionEvent.getX();
            this.f35954b = motionEvent.getY();
            this.f35955c = true;
            this.d = System.currentTimeMillis();
        }
        if (!si1Var.f37314h1 && !this.f35955c) {
            return false;
        }
        return true;
    }
}
