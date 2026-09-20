package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class rx extends um0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final kz D0;
    public final int f27964u0;
    public boolean f27965v0;
    public float f27966w0;
    public boolean f27967x0;
    public float f27968y0;
    public float f27969z0;

    public rx(kz kzVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, kzVar.f25918i2);
        this.D0 = kzVar;
        this.f27967x0 = true;
        this.f27964u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f28728s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f27968y0 = motionEvent.getRawX();
            this.f27969z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0) {
            kz kzVar = this.D0;
            if (kzVar.O0 != null && Math.abs(motionEvent.getRawY() - this.f27969z0) >= this.f27964u0) {
                this.A0 = true;
                this.f27969z0 = motionEvent.getRawY();
                ((c2.a) kzVar.O0).e();
                if (this.f27965v0) {
                    kzVar.h.i();
                    this.f27965v0 = false;
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
        kz kzVar = this.D0;
        org.telegram.ui.Cells.u6 u6Var = kzVar.f25909f2;
        zw zwVar = kzVar.h;
        if (this.f28728s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f27967x0) {
            this.f27967x0 = false;
            this.f27966w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            kzVar.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f27968y0 = motionEvent.getRawX();
            this.f27969z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && kzVar.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f27968y0);
            float f7 = this.f27964u0;
            if (abs >= f7 && canScrollHorizontally((int) (this.f27968y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                AndroidUtilities.cancelRunOnUIThread(u6Var);
                kzVar.X1 = true;
                kzVar.Y();
            } else if (Math.abs(motionEvent.getRawY() - this.f27969z0) >= f7) {
                this.A0 = true;
                this.f27969z0 = motionEvent.getRawY();
                ((c2.a) kzVar.O0).e();
                if (this.f27965v0) {
                    zwVar.i();
                    this.f27965v0 = false;
                }
            }
        }
        if (kzVar.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(u6Var, 1500L);
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = VelocityTracker.obtain();
            }
            this.C0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                qx qxVar = kzVar.O0;
                int round = Math.round(motionEvent.getRawY() - this.f27969z0);
                c2.a aVar = (c2.a) qxVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f3658c;
                if (aVar.d()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i10 = chatActivityEnterView.f22086x2;
                    } else {
                        i10 = chatActivityEnterView.f22080w2;
                    }
                    int max = Math.max(Math.min(round + aVar.f3657b, 0), -(chatActivityEnterView.C3 - i10));
                    if (chatActivityEnterView.f21972c5 == null) {
                        float f10 = max;
                        chatActivityEnterView.U0.setTranslationY(f10);
                        chatActivityEnterView.setTranslationY(f10);
                    }
                    chatActivityEnterView.B3 = max / (-(chatActivityEnterView.C3 - i10));
                    chatActivityEnterView.l1.invalidate();
                }
            } else {
                this.C0.computeCurrentVelocity(1000);
                float yVelocity = this.C0.getYVelocity();
                this.C0.recycle();
                this.C0 = null;
                if (motionEvent.getAction() == 1) {
                    c2.a aVar2 = (c2.a) kzVar.O0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) aVar2.f3658c;
                    if (aVar2.d()) {
                        chatActivityEnterView2.D3 = false;
                        if ((aVar2.f3656a && yVelocity >= AndroidUtilities.dp(200.0f)) || ((!aVar2.f3656a && yVelocity <= AndroidUtilities.dp(-200.0f)) || (((z10 = aVar2.f3656a) && chatActivityEnterView2.B3 <= 0.6f) || (!z10 && chatActivityEnterView2.B3 >= 0.4f)))) {
                            chatActivityEnterView2.m1(!aVar2.f3656a, true, true, true);
                        } else {
                            chatActivityEnterView2.m1(z10, true, true, true);
                        }
                    }
                } else {
                    c2.a aVar3 = (c2.a) kzVar.O0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) aVar3.f3658c;
                    if (chatActivityEnterView3.f22081w3) {
                        chatActivityEnterView3.D3 = false;
                        chatActivityEnterView3.m1(aVar3.f3656a, true, false, true);
                    }
                }
                this.f27967x0 = true;
                this.B0 = false;
                this.A0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f27965v0 && this.f27966w0 - motionEvent.getX() < 0.0f) {
                if (!zwVar.M) {
                    zwVar.f48432e0 = true;
                    zwVar.setScrollState(1);
                    zwVar.R = 0.0f;
                    zwVar.T = 0.0f;
                    VelocityTracker velocityTracker = zwVar.W;
                    if (velocityTracker == null) {
                        zwVar.W = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    zwVar.W.addMovement(obtain);
                    obtain.recycle();
                    this.f27965v0 = true;
                    getTranslationX();
                }
            } else if (this.f27965v0 && this.f27966w0 - motionEvent.getX() > 0.0f && zwVar.f48432e0) {
                zwVar.i();
                this.f27965v0 = false;
            }
        }
        if (this.f27965v0) {
            motionEvent.getX();
        }
        this.f27966w0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f27967x0 = true;
            this.B0 = false;
            this.A0 = false;
            if (this.f27965v0) {
                zwVar.i();
                this.f27965v0 = false;
            }
        }
        if (!this.f27965v0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
