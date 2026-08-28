package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class hh1 extends FrameLayout {
    public float f38817a;
    public float f38818b;
    public boolean f38819c;
    public long d;
    public final mh1 f38820e;

    public hh1(mh1 mh1Var, Activity activity) {
        super(activity);
        this.f38820e = mh1Var;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        mh1 mh1Var = this.f38820e;
        org.telegram.ui.Components.voip.b3 b3Var = mh1Var.v;
        if (view == b3Var && (mh1Var.f40451j0 || mh1Var.f40449i0)) {
            return false;
        }
        if ((view != b3Var && view != mh1Var.Y && (view != mh1Var.U || !mh1Var.W)) || (!mh1Var.f40436c1 && mh1Var.f40441e1 == null)) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f10 = mh1Var.f40433b1;
        canvas.scale(f10, f10, mh1Var.X0, mh1Var.Y0);
        canvas.translate(mh1Var.U0, mh1Var.V0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mh1 mh1Var = this.f38820e;
        wg1 wg1Var = mh1Var.P0;
        if (motionEvent.getActionMasked() == 1) {
            mh1Var.f40470y.b(false, false);
            mh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(wg1Var);
            if (mh1Var.f40453l0 == 3) {
                AndroidUtilities.runOnUIThread(wg1Var, 10000L);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.voip.r2 r2Var;
        org.telegram.ui.Components.voip.c3 c3Var;
        mh1 mh1Var = this.f38820e;
        wg1 wg1Var = mh1Var.P0;
        if (motionEvent.getActionMasked() == 1) {
            mh1Var.f40470y.b(false, false);
            mh1Var.v.a();
            AndroidUtilities.cancelRunOnUIThread(wg1Var);
            if (mh1Var.f40453l0 == 3) {
                AndroidUtilities.runOnUIThread(wg1Var, 10000L);
            }
        }
        if (!mh1Var.f40438d1 && !mh1Var.W0 && !mh1Var.f40436c1 && motionEvent.getActionMasked() != 0) {
            mh1.j(mh1Var);
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            mh1Var.f40438d1 = false;
            mh1Var.W0 = false;
            mh1Var.f40436c1 = false;
        }
        if (mh1Var.f40449i0) {
            r2Var = mh1Var.Y;
        } else {
            r2Var = mh1Var.Z;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && mh1Var.W0) {
                int i9 = -1;
                int i10 = -1;
                for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                    if (mh1Var.Z0 == motionEvent.getPointerId(i11)) {
                        i9 = i11;
                    }
                    if (mh1Var.f40430a1 == motionEvent.getPointerId(i11)) {
                        i10 = i11;
                    }
                }
                if (i9 != -1 && i10 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i9), motionEvent.getY(i10) - motionEvent.getY(i9))) / mh1Var.T0;
                    mh1Var.f40433b1 = hypot;
                    if (hypot > 1.005f && !mh1Var.f40436c1) {
                        mh1Var.T0 = (float) Math.hypot(motionEvent.getX(i10) - motionEvent.getX(i9), motionEvent.getY(i10) - motionEvent.getY(i9));
                        float x10 = (motionEvent.getX(i10) + motionEvent.getX(i9)) / 2.0f;
                        mh1Var.X0 = x10;
                        mh1Var.R0 = x10;
                        float y10 = (motionEvent.getY(i10) + motionEvent.getY(i9)) / 2.0f;
                        mh1Var.Y0 = y10;
                        mh1Var.S0 = y10;
                        mh1Var.f40433b1 = 1.0f;
                        mh1Var.U0 = 0.0f;
                        mh1Var.V0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        mh1Var.f40436c1 = true;
                        mh1Var.W0 = true;
                    }
                    float x11 = motionEvent.getX(i9);
                    float y11 = motionEvent.getY(i9);
                    float x12 = mh1Var.R0 - ((motionEvent.getX(i10) + x11) / 2.0f);
                    float y12 = mh1Var.S0 - ((motionEvent.getY(i10) + y11) / 2.0f);
                    float f10 = mh1Var.f40433b1;
                    mh1Var.U0 = (-x12) / f10;
                    mh1Var.V0 = (-y12) / f10;
                    invalidate();
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    mh1.j(mh1Var);
                }
            } else if (motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((mh1Var.Z0 == motionEvent.getPointerId(0) && mh1Var.f40430a1 == motionEvent.getPointerId(1)) || (mh1Var.Z0 == motionEvent.getPointerId(1) && mh1Var.f40430a1 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) {
                getParent().requestDisallowInterceptTouchEvent(false);
                mh1.j(mh1Var);
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(r2Var.getX(), r2Var.getY(), r2Var.getX() + r2Var.getMeasuredWidth(), r2Var.getY() + r2Var.getMeasuredHeight());
                rectF.inset(((r2Var.getMeasuredHeight() * r2Var.P) - r2Var.getMeasuredHeight()) / 2.0f, ((r2Var.getMeasuredWidth() * r2Var.P) - r2Var.getMeasuredWidth()) / 2.0f);
                if (!o50.B3) {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.bottom = Math.min(rectF.bottom, r2Var.getMeasuredHeight() - AndroidUtilities.dp(90.0f));
                } else {
                    rectF.top = Math.max(rectF.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                    rectF.right = Math.min(rectF.right, r2Var.getMeasuredWidth() - AndroidUtilities.dp(90.0f));
                }
                boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
                mh1Var.f40438d1 = contains;
                if (!contains) {
                    mh1.j(mh1Var);
                }
            }
            if (mh1Var.f40438d1 && !mh1Var.W0 && motionEvent.getPointerCount() == 2) {
                mh1Var.T0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                mh1Var.X0 = x13;
                mh1Var.R0 = x13;
                float y13 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                mh1Var.Y0 = y13;
                mh1Var.S0 = y13;
                mh1Var.f40433b1 = 1.0f;
                mh1Var.Z0 = motionEvent.getPointerId(0);
                mh1Var.f40430a1 = motionEvent.getPointerId(1);
                mh1Var.W0 = true;
            }
        }
        mh1Var.f40461s.invalidate();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    this.f38819c = false;
                }
            } else if (this.f38819c) {
                float x14 = motionEvent.getX() - this.f38817a;
                float y14 = motionEvent.getY() - this.f38818b;
                long currentTimeMillis = System.currentTimeMillis();
                float f11 = (y14 * y14) + (x14 * x14);
                float f12 = mh1Var.f40457p0;
                if (f11 < f12 * f12 && currentTimeMillis - this.d < 300 && currentTimeMillis - mh1Var.G0 > 300) {
                    mh1Var.G0 = System.currentTimeMillis();
                    if (mh1Var.f40471y0) {
                        mh1Var.m(false);
                    } else if (mh1Var.f40465v0) {
                        mh1Var.A(!mh1Var.f40463t0);
                        mh1Var.m0 = mh1Var.f40453l0;
                        if (!mh1Var.f40463t0 && (c3Var = mh1Var.J0) != null && c3Var.R) {
                            c3Var.e(true);
                        }
                        mh1Var.H();
                    }
                }
                this.f38819c = false;
            }
        } else {
            this.f38817a = motionEvent.getX();
            this.f38818b = motionEvent.getY();
            this.f38819c = true;
            this.d = System.currentTimeMillis();
        }
        if (!mh1Var.f40438d1 && !this.f38819c) {
            return false;
        }
        return true;
    }
}
