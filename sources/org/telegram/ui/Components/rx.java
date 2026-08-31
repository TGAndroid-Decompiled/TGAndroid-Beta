package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class rx extends qm0 {
    public final mz A0;
    public final int f30888r0;
    public boolean f30889s0;
    public float f30890t0;
    public boolean f30891u0;
    public float f30892v0;
    public float f30893w0;
    public boolean f30894x0;
    public boolean f30895y0;
    public VelocityTracker f30896z0;

    public rx(mz mzVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, mzVar.f29284f2);
        this.A0 = mzVar;
        this.f30891u0 = true;
        this.f30888r0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30444s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.f30895y0 = false;
            this.f30894x0 = false;
            this.f30892v0 = motionEvent.getRawX();
            this.f30893w0 = motionEvent.getRawY();
        } else if (!this.f30894x0 && !this.f30895y0) {
            mz mzVar = this.A0;
            if (mzVar.L0 != null && Math.abs(motionEvent.getRawY() - this.f30893w0) >= this.f30888r0) {
                this.f30894x0 = true;
                this.f30893w0 = motionEvent.getRawY();
                ((b7.l0) mzVar.L0).e();
                if (this.f30889s0) {
                    mzVar.h.i();
                    this.f30889s0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        int i10;
        mz mzVar = this.A0;
        m2.b bVar = mzVar.f29273c2;
        xw xwVar = mzVar.h;
        if (this.f30444s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f30891u0) {
            this.f30891u0 = false;
            this.f30890t0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            mzVar.T1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.f30895y0 = false;
            this.f30894x0 = false;
            this.f30892v0 = motionEvent.getRawX();
            this.f30893w0 = motionEvent.getRawY();
        } else if (!this.f30894x0 && !this.f30895y0 && mzVar.L0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f30892v0);
            float f10 = this.f30888r0;
            if (abs >= f10 && canScrollHorizontally((int) (this.f30892v0 - motionEvent.getRawX()))) {
                this.f30895y0 = true;
                AndroidUtilities.cancelRunOnUIThread(bVar);
                mzVar.U1 = true;
                mzVar.a0();
            } else if (Math.abs(motionEvent.getRawY() - this.f30893w0) >= f10) {
                this.f30894x0 = true;
                this.f30893w0 = motionEvent.getRawY();
                ((b7.l0) mzVar.L0).e();
                if (this.f30889s0) {
                    xwVar.i();
                    this.f30889s0 = false;
                }
            }
        }
        if (mzVar.U1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(bVar, 1500L);
        }
        if (this.f30894x0) {
            if (this.f30896z0 == null) {
                this.f30896z0 = VelocityTracker.obtain();
            }
            this.f30896z0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                qx qxVar = mzVar.L0;
                int round = Math.round(motionEvent.getRawY() - this.f30893w0);
                b7.l0 l0Var = (b7.l0) qxVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) l0Var.f1840c;
                if (l0Var.d()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i10 = chatActivityEnterView.f24684u2;
                    } else {
                        i10 = chatActivityEnterView.f24679t2;
                    }
                    int max = Math.max(Math.min(round + l0Var.f1839b, 0), -(chatActivityEnterView.f24713z3 - i10));
                    if (chatActivityEnterView.Z4 == null) {
                        float f11 = max;
                        chatActivityEnterView.R0.setTranslationY(f11);
                        chatActivityEnterView.setTranslationY(f11);
                    }
                    chatActivityEnterView.f24708y3 = max / (-(chatActivityEnterView.f24713z3 - i10));
                    chatActivityEnterView.f24621i1.invalidate();
                }
            } else {
                this.f30896z0.computeCurrentVelocity(1000);
                float yVelocity = this.f30896z0.getYVelocity();
                this.f30896z0.recycle();
                this.f30896z0 = null;
                if (motionEvent.getAction() == 1) {
                    b7.l0 l0Var2 = (b7.l0) mzVar.L0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) l0Var2.f1840c;
                    if (l0Var2.d()) {
                        chatActivityEnterView2.A3 = false;
                        if ((l0Var2.f1838a && yVelocity >= AndroidUtilities.dp(200.0f)) || ((!l0Var2.f1838a && yVelocity <= AndroidUtilities.dp(-200.0f)) || (((z4 = l0Var2.f1838a) && chatActivityEnterView2.f24708y3 <= 0.6f) || (!z4 && chatActivityEnterView2.f24708y3 >= 0.4f)))) {
                            chatActivityEnterView2.n1(!l0Var2.f1838a, true, true, true);
                        } else {
                            chatActivityEnterView2.n1(z4, true, true, true);
                        }
                    }
                } else {
                    b7.l0 l0Var3 = (b7.l0) mzVar.L0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) l0Var3.f1840c;
                    if (chatActivityEnterView3.f24680t3) {
                        chatActivityEnterView3.A3 = false;
                        chatActivityEnterView3.n1(l0Var3.f1838a, true, false, true);
                    }
                }
                this.f30891u0 = true;
                this.f30895y0 = false;
                this.f30894x0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f30889s0 && this.f30890t0 - motionEvent.getX() < 0.0f) {
                if (!xwVar.J) {
                    xwVar.f13440b0 = true;
                    xwVar.setScrollState(1);
                    xwVar.O = 0.0f;
                    xwVar.Q = 0.0f;
                    VelocityTracker velocityTracker = xwVar.T;
                    if (velocityTracker == null) {
                        xwVar.T = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    xwVar.T.addMovement(obtain);
                    obtain.recycle();
                    this.f30889s0 = true;
                    getTranslationX();
                }
            } else if (this.f30889s0 && this.f30890t0 - motionEvent.getX() > 0.0f && xwVar.f13440b0) {
                xwVar.i();
                this.f30889s0 = false;
            }
        }
        if (this.f30889s0) {
            motionEvent.getX();
        }
        this.f30890t0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f30891u0 = true;
            this.f30895y0 = false;
            this.f30894x0 = false;
            if (this.f30889s0) {
                xwVar.i();
                this.f30889s0 = false;
            }
        }
        if (!this.f30889s0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
