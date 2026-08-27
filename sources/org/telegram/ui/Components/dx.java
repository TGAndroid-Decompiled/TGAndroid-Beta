package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;

public class dx extends vl0 {

    public final int f27860q0;

    public boolean f27861r0;

    public float f27862s0;

    public boolean f27863t0;

    public float f27864u0;

    public float f27865v0;

    public boolean f27866w0;

    public boolean f27867x0;

    public VelocityTracker f27868y0;

    public final yy f27869z0;

    public dx(yy yyVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, yyVar.f34993e2);
        this.f27869z0 = yyVar;
        this.f27863t0 = true;
        this.f27860q0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f33462s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.f27867x0 = false;
            this.f27866w0 = false;
            this.f27864u0 = motionEvent.getRawX();
            this.f27865v0 = motionEvent.getRawY();
        } else if (!this.f27866w0 && !this.f27867x0) {
            yy yyVar = this.f27869z0;
            if (yyVar.K0 != null && Math.abs(motionEvent.getRawY() - this.f27865v0) >= this.f27860q0) {
                this.f27866w0 = true;
                this.f27865v0 = motionEvent.getRawY();
                ((m.a) yyVar.K0).e();
                if (this.f27861r0) {
                    yyVar.h.i();
                    this.f27861r0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        yy yyVar = this.f27869z0;
        m.i3 i3Var = yyVar.f34982b2;
        kw kwVar = yyVar.h;
        if (this.f33462s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f27863t0) {
            this.f27863t0 = false;
            this.f27862s0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            yyVar.S1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.f27867x0 = false;
            this.f27866w0 = false;
            this.f27864u0 = motionEvent.getRawX();
            this.f27865v0 = motionEvent.getRawY();
        } else if (!this.f27866w0 && !this.f27867x0 && yyVar.K0 != null) {
            float fAbs = Math.abs(motionEvent.getRawX() - this.f27864u0);
            float f10 = this.f27860q0;
            if (fAbs >= f10 && canScrollHorizontally((int) (this.f27864u0 - motionEvent.getRawX()))) {
                this.f27867x0 = true;
                AndroidUtilities.cancelRunOnUIThread(i3Var);
                yyVar.T1 = true;
                yyVar.a0();
            } else if (Math.abs(motionEvent.getRawY() - this.f27865v0) >= f10) {
                this.f27866w0 = true;
                this.f27865v0 = motionEvent.getRawY();
                ((m.a) yyVar.K0).e();
                if (this.f27861r0) {
                    kwVar.i();
                    this.f27861r0 = false;
                }
            }
        }
        if (yyVar.T1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(i3Var, 1500L);
        }
        if (!this.f27866w0) {
            float translationX = getTranslationX();
            if (getScrollX() == 0 && translationX == 0.0f) {
                if (this.f27861r0 || this.f27862s0 - motionEvent.getX() >= 0.0f) {
                    if (this.f27861r0 && this.f27862s0 - motionEvent.getX() > 0.0f && kwVar.f17562a0) {
                        kwVar.i();
                        this.f27861r0 = false;
                    }
                } else if (!kwVar.I) {
                    kwVar.f17562a0 = true;
                    kwVar.setScrollState(1);
                    kwVar.N = 0.0f;
                    kwVar.P = 0.0f;
                    VelocityTracker velocityTracker = kwVar.S;
                    if (velocityTracker == null) {
                        kwVar.S = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
                    kwVar.S.addMovement(motionEventObtain);
                    motionEventObtain.recycle();
                    this.f27861r0 = true;
                    getTranslationX();
                }
            }
            if (this.f27861r0) {
                motionEvent.getX();
            }
            this.f27862s0 = motionEvent.getX();
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                this.f27863t0 = true;
                this.f27867x0 = false;
                this.f27866w0 = false;
                if (this.f27861r0) {
                    kwVar.i();
                    this.f27861r0 = false;
                }
            }
            return this.f27861r0 || super.onTouchEvent(motionEvent);
        }
        if (this.f27868y0 == null) {
            this.f27868y0 = VelocityTracker.obtain();
        }
        this.f27868y0.addMovement(motionEvent);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f27868y0.computeCurrentVelocity(1000);
            float yVelocity = this.f27868y0.getYVelocity();
            this.f27868y0.recycle();
            this.f27868y0 = null;
            if (motionEvent.getAction() == 1) {
                m.a aVar = (m.a) yyVar.K0;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f17259c;
                if (aVar.d()) {
                    chatActivityEnterView.f26213z3 = false;
                    if ((!aVar.f17257a || yVelocity < AndroidUtilities.dp(200.0f)) && ((aVar.f17257a || yVelocity > AndroidUtilities.dp(-200.0f)) && ((!(z10 = aVar.f17257a) || chatActivityEnterView.f26202x3 > 0.6f) && (z10 || chatActivityEnterView.f26202x3 < 0.4f)))) {
                        chatActivityEnterView.m1(z10, true, true, true);
                    } else {
                        chatActivityEnterView.m1(!aVar.f17257a, true, true, true);
                    }
                }
            } else {
                m.a aVar2 = (m.a) yyVar.K0;
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) aVar2.f17259c;
                if (chatActivityEnterView2.f26176s3) {
                    chatActivityEnterView2.f26213z3 = false;
                    chatActivityEnterView2.m1(aVar2.f17257a, true, false, true);
                }
            }
            this.f27863t0 = true;
            this.f27867x0 = false;
            this.f27866w0 = false;
        } else {
            cx cxVar = yyVar.K0;
            int iRound = Math.round(motionEvent.getRawY() - this.f27865v0);
            m.a aVar3 = (m.a) cxVar;
            ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) aVar3.f17259c;
            if (aVar3.d()) {
                Point point = AndroidUtilities.displaySize;
                int i10 = point.x > point.y ? chatActivityEnterView3.f26180t2 : chatActivityEnterView3.f26175s2;
                int iMax = Math.max(Math.min(iRound + aVar3.f17258b, 0), -(chatActivityEnterView3.f26208y3 - i10));
                if (chatActivityEnterView3.Y4 == null) {
                    float f11 = iMax;
                    chatActivityEnterView3.Q0.setTranslationY(f11);
                    chatActivityEnterView3.setTranslationY(f11);
                }
                chatActivityEnterView3.f26202x3 = iMax / (-(chatActivityEnterView3.f26208y3 - i10));
                chatActivityEnterView3.f26117h1.invalidate();
            }
        }
        cancelLongPress();
        return true;
    }
}
