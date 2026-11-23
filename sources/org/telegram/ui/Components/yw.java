package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public class yw extends gl0 {
    public float A0;
    public boolean B0;
    public boolean C0;
    public VelocityTracker D0;
    public final qy E0;
    public final int f42568v0;
    public boolean f42569w0;
    public float f42570x0;
    public boolean f42571y0;
    public float f42572z0;

    public yw(qy qyVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var, qyVar.f39067j2);
        this.E0 = qyVar;
        this.f42571y0 = true;
        this.f42568v0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f35493s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.f42572z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0) {
            qy qyVar = this.E0;
            if (qyVar.P0 != null && Math.abs(motionEvent.getRawY() - this.A0) >= this.f42568v0) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((bg.w0) qyVar.P0).e();
                if (this.f42569w0) {
                    qyVar.h.i();
                    this.f42569w0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i7;
        qy qyVar = this.E0;
        rc rcVar = qyVar.f39058g2;
        gw gwVar = qyVar.h;
        if (this.f35493s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f42571y0) {
            this.f42571y0 = false;
            this.f42570x0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            qyVar.X1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.f42572z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0 && qyVar.P0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f42572z0);
            float f10 = this.f42568v0;
            if (abs >= f10 && canScrollHorizontally((int) (this.f42572z0 - motionEvent.getRawX()))) {
                this.C0 = true;
                org.telegram.messenger.g0.r(rcVar);
                qyVar.Y1 = true;
                qyVar.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.A0) >= f10) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((bg.w0) qyVar.P0).e();
                if (this.f42569w0) {
                    gwVar.i();
                    this.f42569w0 = false;
                }
            }
        }
        if (qyVar.Y1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            org.telegram.messenger.g0.h3(rcVar, 1500L);
        }
        if (this.B0) {
            if (this.D0 == null) {
                this.D0 = VelocityTracker.obtain();
            }
            this.D0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                xw xwVar = qyVar.P0;
                int round = Math.round(motionEvent.getRawY() - this.A0);
                bg.w0 w0Var = (bg.w0) xwVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) w0Var.f3326c;
                if (w0Var.d()) {
                    Point point = org.telegram.messenger.g0.f24226q;
                    if (point.x > point.y) {
                        i7 = chatActivityEnterView.f32748o3;
                    } else {
                        i7 = chatActivityEnterView.f32740n3;
                    }
                    int max = Math.max(Math.min(round + w0Var.f3325b, 0), -(chatActivityEnterView.f32788t4 - i7));
                    if (chatActivityEnterView.f32676e7 == null) {
                        float f11 = max;
                        chatActivityEnterView.V0.setTranslationY(f11);
                        chatActivityEnterView.setTranslationY(f11);
                    }
                    chatActivityEnterView.f32782s4 = max / (-(chatActivityEnterView.f32788t4 - i7));
                    chatActivityEnterView.f32655c2.invalidate();
                }
            } else {
                this.D0.computeCurrentVelocity(1000);
                float yVelocity = this.D0.getYVelocity();
                this.D0.recycle();
                this.D0 = null;
                if (motionEvent.getAction() == 1) {
                    bg.w0 w0Var2 = (bg.w0) qyVar.P0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) w0Var2.f3326c;
                    if (w0Var2.d()) {
                        chatActivityEnterView2.f32794u4 = false;
                        if ((w0Var2.f3324a && yVelocity >= org.telegram.messenger.g0.L(200.0f)) || ((!w0Var2.f3324a && yVelocity <= org.telegram.messenger.g0.L(-200.0f)) || (((z10 = w0Var2.f3324a) && chatActivityEnterView2.f32782s4 <= 0.6f) || (!z10 && chatActivityEnterView2.f32782s4 >= 0.4f)))) {
                            chatActivityEnterView2.S1(!w0Var2.f3324a, true, true, true);
                        } else {
                            chatActivityEnterView2.S1(z10, true, true, true);
                        }
                    }
                } else {
                    bg.w0 w0Var3 = (bg.w0) qyVar.P0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) w0Var3.f3326c;
                    if (chatActivityEnterView3.f32741n4) {
                        chatActivityEnterView3.f32794u4 = false;
                        chatActivityEnterView3.S1(w0Var3.f3324a, true, false, true);
                    }
                }
                this.f42571y0 = true;
                this.C0 = false;
                this.B0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f42569w0 && this.f42570x0 - motionEvent.getX() < 0.0f) {
                if (!gwVar.N) {
                    gwVar.f4436f0 = true;
                    gwVar.setScrollState(1);
                    gwVar.S = 0.0f;
                    gwVar.U = 0.0f;
                    VelocityTracker velocityTracker = gwVar.f4427a0;
                    if (velocityTracker == null) {
                        gwVar.f4427a0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    gwVar.f4427a0.addMovement(obtain);
                    obtain.recycle();
                    this.f42569w0 = true;
                    getTranslationX();
                }
            } else if (this.f42569w0 && this.f42570x0 - motionEvent.getX() > 0.0f && gwVar.f4436f0) {
                gwVar.i();
                this.f42569w0 = false;
            }
        }
        if (this.f42569w0) {
            motionEvent.getX();
        }
        this.f42570x0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f42571y0 = true;
            this.C0 = false;
            this.B0 = false;
            if (this.f42569w0) {
                gwVar.i();
                this.f42569w0 = false;
            }
        }
        if (!this.f42569w0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
