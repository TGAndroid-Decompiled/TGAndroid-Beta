package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class xx extends qn0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final sz D0;
    public final int f34864u0;
    public boolean f34865v0;
    public float f34866w0;
    public boolean f34867x0;
    public float f34868y0;
    public float f34869z0;

    public xx(sz szVar, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var, szVar.f32733i2);
        this.D0 = szVar;
        this.f34867x0 = true;
        this.f34864u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f31970s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f34868y0 = motionEvent.getRawX();
            this.f34869z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0) {
            sz szVar = this.D0;
            if (szVar.O0 != null && Math.abs(motionEvent.getRawY() - this.f34869z0) >= this.f34864u0) {
                this.A0 = true;
                this.f34869z0 = motionEvent.getRawY();
                ((d5.f) szVar.O0).e();
                if (this.f34865v0) {
                    szVar.h.i();
                    this.f34865v0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        sz szVar = this.D0;
        m.g3 g3Var = szVar.f32724f2;
        fx fxVar = szVar.h;
        if (this.f31970s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f34867x0) {
            this.f34867x0 = false;
            this.f34866w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            szVar.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f34868y0 = motionEvent.getRawX();
            this.f34869z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && szVar.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f34868y0);
            float f7 = this.f34864u0;
            if (abs >= f7 && canScrollHorizontally((int) (this.f34868y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                AndroidUtilities.cancelRunOnUIThread(g3Var);
                szVar.X1 = true;
                szVar.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.f34869z0) >= f7) {
                this.A0 = true;
                this.f34869z0 = motionEvent.getRawY();
                ((d5.f) szVar.O0).e();
                if (this.f34865v0) {
                    fxVar.i();
                    this.f34865v0 = false;
                }
            }
        }
        if (szVar.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(g3Var, 1500L);
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = VelocityTracker.obtain();
            }
            this.C0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                wx wxVar = szVar.O0;
                int round = Math.round(motionEvent.getRawY() - this.f34869z0);
                d5.f fVar = (d5.f) wxVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) fVar.f7972c;
                if (fVar.d()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i10 = chatActivityEnterView.f25990y2;
                    } else {
                        i10 = chatActivityEnterView.f25984x2;
                    }
                    int max = Math.max(Math.min(round + fVar.f7970a, 0), -(chatActivityEnterView.D3 - i10));
                    if (chatActivityEnterView.f25896h5 == null) {
                        float f10 = max;
                        chatActivityEnterView.U0.setTranslationY(f10);
                        chatActivityEnterView.setTranslationY(f10);
                    }
                    chatActivityEnterView.C3 = max / (-(chatActivityEnterView.D3 - i10));
                    chatActivityEnterView.f25919m1.invalidate();
                }
            } else {
                this.C0.computeCurrentVelocity(1000);
                float yVelocity = this.C0.getYVelocity();
                this.C0.recycle();
                this.C0 = null;
                if (motionEvent.getAction() == 1) {
                    d5.f fVar2 = (d5.f) szVar.O0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) fVar2.f7972c;
                    if (fVar2.d()) {
                        chatActivityEnterView2.E3 = false;
                        if ((fVar2.f7971b && yVelocity >= AndroidUtilities.dp(200.0f)) || ((!fVar2.f7971b && yVelocity <= AndroidUtilities.dp(-200.0f)) || (((z10 = fVar2.f7971b) && chatActivityEnterView2.C3 <= 0.6f) || (!z10 && chatActivityEnterView2.C3 >= 0.4f)))) {
                            chatActivityEnterView2.j1(!fVar2.f7971b, true, true, true);
                        } else {
                            chatActivityEnterView2.j1(z10, true, true, true);
                        }
                    }
                } else {
                    d5.f fVar3 = (d5.f) szVar.O0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) fVar3.f7972c;
                    if (chatActivityEnterView3.f25985x3) {
                        chatActivityEnterView3.E3 = false;
                        chatActivityEnterView3.j1(fVar3.f7971b, true, false, true);
                    }
                }
                this.f34867x0 = true;
                this.B0 = false;
                this.A0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f34865v0 && this.f34866w0 - motionEvent.getX() < 0.0f) {
                if (!fxVar.M) {
                    fxVar.f308e0 = true;
                    fxVar.setScrollState(1);
                    fxVar.R = 0.0f;
                    fxVar.T = 0.0f;
                    VelocityTracker velocityTracker = fxVar.W;
                    if (velocityTracker == null) {
                        fxVar.W = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    fxVar.W.addMovement(obtain);
                    obtain.recycle();
                    this.f34865v0 = true;
                    getTranslationX();
                }
            } else if (this.f34865v0 && this.f34866w0 - motionEvent.getX() > 0.0f && fxVar.f308e0) {
                fxVar.i();
                this.f34865v0 = false;
            }
        }
        if (this.f34865v0) {
            motionEvent.getX();
        }
        this.f34866w0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f34867x0 = true;
            this.B0 = false;
            this.A0 = false;
            if (this.f34865v0) {
                fxVar.i();
                this.f34865v0 = false;
            }
        }
        if (!this.f34865v0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
