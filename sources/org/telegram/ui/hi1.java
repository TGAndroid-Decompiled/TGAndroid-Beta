package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hi1 extends FrameLayout {
    public float f33863a;
    public float f33864b;
    public boolean f33865c;
    public long d;
    public final mi1 e;

    public hi1(mi1 mi1Var, Activity activity) {
        super(activity);
        this.e = mi1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        mi1 mi1Var = this.e;
        org.telegram.ui.Components.voip.c3 c3Var = mi1Var.v;
        if (view == c3Var && (mi1Var.f35330n0 || mi1Var.m0)) {
            return false;
        }
        if ((view != c3Var && view != mi1Var.f35308c0 && (view != mi1Var.Y || !mi1Var.f35302a0)) || (!mi1Var.f35318g1 && mi1Var.f35322i1 == null)) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f7 = mi1Var.f35316f1;
        canvas.scale(f7, f7, mi1Var.f35306b1, mi1Var.f35309c1);
        canvas.translate(mi1Var.Y0, mi1Var.Z0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mi1 mi1Var = this.e;
        wh1 wh1Var = mi1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            mi1Var.f35345y.b(false, false);
            mi1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(wh1Var);
            if (mi1Var.f35332p0 == 3) {
                AndroidUtilities.runOnUIThread(wh1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.s2 s2Var;
        org.telegram.ui.Components.voip.d3 d3Var;
        mi1 mi1Var = this.e;
        wh1 wh1Var = mi1Var.T0;
        if (motionEvent.getActionMasked() == 1) {
            mi1Var.f35345y.b(false, false);
            mi1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(wh1Var);
            if (mi1Var.f35332p0 == 3) {
                AndroidUtilities.runOnUIThread(wh1Var, 10000L);
            }
        }
        if (!mi1Var.f35320h1 && !mi1Var.f35303a1 && !mi1Var.f35318g1 && motionEvent.getActionMasked() != 0) {
            mi1.j(mi1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            mi1Var.f35320h1 = false;
            mi1Var.f35303a1 = false;
            mi1Var.f35318g1 = false;
        }
        if (mi1Var.m0) {
            s2Var = mi1Var.f35308c0;
        } else {
            s2Var = mi1Var.f35310d0;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && mi1Var.f35303a1) {
                int i10 = -1;
                int i11 = -1;
                for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                    if (mi1Var.f35311d1 == motionEvent.getPointerId(i12)) {
                        i10 = i12;
                    }
                    if (mi1Var.f35313e1 == motionEvent.getPointerId(i12)) {
                        i11 = i12;
                    }
                }
                if (i10 != -1 && i11 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / mi1Var.X0;
                    mi1Var.f35316f1 = hypot;
                    if (hypot > 1.005f && !mi1Var.f35318g1) {
                        mi1Var.X0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x10 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        mi1Var.f35306b1 = x10;
                        mi1Var.V0 = x10;
                        float y3 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        mi1Var.f35309c1 = y3;
                        mi1Var.W0 = y3;
                        mi1Var.f35316f1 = 1.0f;
                        mi1Var.Y0 = 0.0f;
                        mi1Var.Z0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        mi1Var.f35318g1 = true;
                        mi1Var.f35303a1 = true;
                    }
                    float x11 = motionEvent.getX(i10);
                    float y10 = motionEvent.getY(i10);
                    float x12 = mi1Var.V0 - ((motionEvent.getX(i11) + x11) / 2.0f);
                    float y11 = mi1Var.W0 - ((motionEvent.getY(i11) + y10) / 2.0f);
                    float f7 = mi1Var.f35316f1;
                    mi1Var.Y0 = (-x12) / f7;
                    mi1Var.Z0 = (-y11) / f7;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    mi1.j(mi1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((mi1Var.f35311d1 == motionEvent.getPointerId(0) && mi1Var.f35313e1 == motionEvent.getPointerId(1)) || (mi1Var.f35311d1 == motionEvent.getPointerId(1) && mi1Var.f35313e1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                mi1.j(mi1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(s2Var.getX(), s2Var.getY(), s2Var.getX() + s2Var.getMeasuredWidth(), s2Var.getY() + s2Var.getMeasuredHeight());
                rectF.inset(((s2Var.getMeasuredHeight() * s2Var.T) - s2Var.getMeasuredHeight()) / 2.0f, ((s2Var.getMeasuredWidth() * s2Var.T) - s2Var.getMeasuredWidth()) / 2.0f);
                if (!f60.F3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, s2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, s2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                mi1Var.f35320h1 = contains;
                if (!contains) {
                    mi1.j(mi1Var);
                }
            }
            if (mi1Var.f35320h1 && !mi1Var.f35303a1 && motionEvent.getPointerCount() == 2) {
                mi1Var.X0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                mi1Var.f35306b1 = x13;
                mi1Var.V0 = x13;
                float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                mi1Var.f35309c1 = y12;
                mi1Var.W0 = y12;
                mi1Var.f35316f1 = 1.0f;
                mi1Var.f35311d1 = motionEvent.getPointerId(0);
                mi1Var.f35313e1 = motionEvent.getPointerId(1);
                mi1Var.f35303a1 = true;
            }
        }
        mi1Var.f35336s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f33865c = false;
                }
            } else if (this.f33865c) {
                float x14 = motionEvent.getX() - this.f33863a;
                float y13 = motionEvent.getY() - this.f33864b;
                long currentTimeMillis = System.currentTimeMillis();
                float f10 = (y13 * y13) + (x14 * x14);
                float f11 = mi1Var.f35338t0;
                if (f10 < f11 * f11 && currentTimeMillis - this.d < 300 && currentTimeMillis - mi1Var.K0 > 300) {
                    mi1Var.K0 = System.currentTimeMillis();
                    if (mi1Var.C0) {
                        mi1Var.m(false);
                    } else if (mi1Var.f35347z0) {
                        mi1Var.A(!mi1Var.f35344x0);
                        mi1Var.f35333q0 = mi1Var.f35332p0;
                        if (!mi1Var.f35344x0 && (d3Var = mi1Var.N0) != null && d3Var.V) {
                            d3Var.e(true);
                        }
                        mi1Var.H();
                    }
                }
                this.f33865c = false;
            }
        } else {
            this.f33863a = motionEvent.getX();
            this.f33864b = motionEvent.getY();
            this.f33865c = true;
            this.d = System.currentTimeMillis();
        }
        if (!mi1Var.f35320h1 && !this.f33865c) {
            return false;
        }
        return true;
    }
}
