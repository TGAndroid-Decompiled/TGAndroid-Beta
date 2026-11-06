package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public class nw extends rk0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final gy D0;
    public final int f36498u0;
    public boolean f36499v0;
    public float f36500w0;
    public boolean f36501x0;
    public float f36502y0;
    public float f36503z0;

    public nw(gy gyVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, gyVar.f34096i2);
        this.D0 = gyVar;
        this.f36501x0 = true;
        this.f36498u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f37793s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f36502y0 = motionEvent.getRawX();
            this.f36503z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0) {
            gy gyVar = this.D0;
            if (gyVar.O0 != null && Math.abs(motionEvent.getRawY() - this.f36503z0) >= this.f36498u0) {
                this.A0 = true;
                this.f36503z0 = motionEvent.getRawY();
                ((bg.w0) gyVar.O0).e();
                if (this.f36499v0) {
                    gyVar.h.i();
                    this.f36499v0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        int i7;
        gy gyVar = this.D0;
        dt dtVar = gyVar.f34087f2;
        vv vvVar = gyVar.h;
        if (this.f37793s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f36501x0) {
            this.f36501x0 = false;
            this.f36500w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            gyVar.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f36502y0 = motionEvent.getRawX();
            this.f36503z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && gyVar.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f36502y0);
            float f10 = this.f36498u0;
            if (abs >= f10 && canScrollHorizontally((int) (this.f36502y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                org.telegram.messenger.g0.r(dtVar);
                gyVar.X1 = true;
                gyVar.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.f36503z0) >= f10) {
                this.A0 = true;
                this.f36503z0 = motionEvent.getRawY();
                ((bg.w0) gyVar.O0).e();
                if (this.f36499v0) {
                    vvVar.i();
                    this.f36499v0 = false;
                }
            }
        }
        if (gyVar.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            org.telegram.messenger.g0.i3(dtVar, 1500L);
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = VelocityTracker.obtain();
            }
            this.C0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                mw mwVar = gyVar.O0;
                int round = Math.round(motionEvent.getRawY() - this.f36503z0);
                bg.w0 w0Var = (bg.w0) mwVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) w0Var.f3394c;
                if (w0Var.d()) {
                    Point point = org.telegram.messenger.g0.f22537q;
                    if (point.x > point.y) {
                        i7 = chatActivityEnterView.f31153y2;
                    } else {
                        i7 = chatActivityEnterView.f31147x2;
                    }
                    int max = Math.max(Math.min(round + w0Var.f3393b, 0), -(chatActivityEnterView.D3 - i7));
                    if (chatActivityEnterView.f31059h5 == null) {
                        float f11 = max;
                        chatActivityEnterView.U0.setTranslationY(f11);
                        chatActivityEnterView.setTranslationY(f11);
                    }
                    chatActivityEnterView.C3 = max / (-(chatActivityEnterView.D3 - i7));
                    chatActivityEnterView.f31082m1.invalidate();
                }
            } else {
                this.C0.computeCurrentVelocity(1000);
                float yVelocity = this.C0.getYVelocity();
                this.C0.recycle();
                this.C0 = null;
                if (motionEvent.getAction() == 1) {
                    bg.w0 w0Var2 = (bg.w0) gyVar.O0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) w0Var2.f3394c;
                    if (w0Var2.d()) {
                        chatActivityEnterView2.E3 = false;
                        if ((w0Var2.f3392a && yVelocity >= org.telegram.messenger.g0.L(200.0f)) || ((!w0Var2.f3392a && yVelocity <= org.telegram.messenger.g0.L(-200.0f)) || (((z9 = w0Var2.f3392a) && chatActivityEnterView2.C3 <= 0.6f) || (!z9 && chatActivityEnterView2.C3 >= 0.4f)))) {
                            chatActivityEnterView2.n1(!w0Var2.f3392a, true, true, true);
                        } else {
                            chatActivityEnterView2.n1(z9, true, true, true);
                        }
                    }
                } else {
                    bg.w0 w0Var3 = (bg.w0) gyVar.O0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) w0Var3.f3394c;
                    if (chatActivityEnterView3.f31148x3) {
                        chatActivityEnterView3.E3 = false;
                        chatActivityEnterView3.n1(w0Var3.f3392a, true, false, true);
                    }
                }
                this.f36501x0 = true;
                this.B0 = false;
                this.A0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f36499v0 && this.f36500w0 - motionEvent.getX() < 0.0f) {
                if (!vvVar.M) {
                    vvVar.f5335e0 = true;
                    vvVar.setScrollState(1);
                    vvVar.R = 0.0f;
                    vvVar.T = 0.0f;
                    VelocityTracker velocityTracker = vvVar.W;
                    if (velocityTracker == null) {
                        vvVar.W = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    vvVar.W.addMovement(obtain);
                    obtain.recycle();
                    this.f36499v0 = true;
                    getTranslationX();
                }
            } else if (this.f36499v0 && this.f36500w0 - motionEvent.getX() > 0.0f && vvVar.f5335e0) {
                vvVar.i();
                this.f36499v0 = false;
            }
        }
        if (this.f36499v0) {
            motionEvent.getX();
        }
        this.f36500w0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f36501x0 = true;
            this.B0 = false;
            this.A0 = false;
            if (this.f36499v0) {
                vvVar.i();
                this.f36499v0 = false;
            }
        }
        if (!this.f36499v0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
