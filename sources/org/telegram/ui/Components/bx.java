package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public class bx extends gl0 {
    public float A0;
    public boolean B0;
    public boolean C0;
    public VelocityTracker D0;
    public final ty E0;
    public final int f33933v0;
    public boolean f33934w0;
    public float f33935x0;
    public boolean f33936y0;
    public float f33937z0;

    public bx(ty tyVar, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var, tyVar.f40112j2);
        this.E0 = tyVar;
        this.f33936y0 = true;
        this.f33933v0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f35629s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.f33937z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0) {
            ty tyVar = this.E0;
            if (tyVar.P0 != null && Math.abs(motionEvent.getRawY() - this.A0) >= this.f33933v0) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((bg.w0) tyVar.P0).e();
                if (this.f33934w0) {
                    tyVar.h.i();
                    this.f33934w0 = false;
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
        ty tyVar = this.E0;
        ik ikVar = tyVar.f40103g2;
        jw jwVar = tyVar.h;
        if (this.f35629s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f33936y0) {
            this.f33936y0 = false;
            this.f33935x0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            tyVar.X1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.f33937z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0 && tyVar.P0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f33937z0);
            float f10 = this.f33933v0;
            if (abs >= f10 && canScrollHorizontally((int) (this.f33937z0 - motionEvent.getRawX()))) {
                this.C0 = true;
                org.telegram.messenger.g0.r(ikVar);
                tyVar.Y1 = true;
                tyVar.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.A0) >= f10) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((bg.w0) tyVar.P0).e();
                if (this.f33934w0) {
                    jwVar.i();
                    this.f33934w0 = false;
                }
            }
        }
        if (tyVar.Y1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            org.telegram.messenger.g0.h3(ikVar, 1500L);
        }
        if (this.B0) {
            if (this.D0 == null) {
                this.D0 = VelocityTracker.obtain();
            }
            this.D0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                ax axVar = tyVar.P0;
                int round = Math.round(motionEvent.getRawY() - this.A0);
                bg.w0 w0Var = (bg.w0) axVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) w0Var.f3375c;
                if (w0Var.d()) {
                    Point point = org.telegram.messenger.g0.f24046q;
                    if (point.x > point.y) {
                        i7 = chatActivityEnterView.f32684o3;
                    } else {
                        i7 = chatActivityEnterView.f32676n3;
                    }
                    int max = Math.max(Math.min(round + w0Var.f3374b, 0), -(chatActivityEnterView.f32724t4 - i7));
                    if (chatActivityEnterView.f32612e7 == null) {
                        float f11 = max;
                        chatActivityEnterView.V0.setTranslationY(f11);
                        chatActivityEnterView.setTranslationY(f11);
                    }
                    chatActivityEnterView.f32718s4 = max / (-(chatActivityEnterView.f32724t4 - i7));
                    chatActivityEnterView.f32591c2.invalidate();
                }
            } else {
                this.D0.computeCurrentVelocity(1000);
                float yVelocity = this.D0.getYVelocity();
                this.D0.recycle();
                this.D0 = null;
                if (motionEvent.getAction() == 1) {
                    bg.w0 w0Var2 = (bg.w0) tyVar.P0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) w0Var2.f3375c;
                    if (w0Var2.d()) {
                        chatActivityEnterView2.f32730u4 = false;
                        if ((w0Var2.f3373a && yVelocity >= org.telegram.messenger.g0.L(200.0f)) || ((!w0Var2.f3373a && yVelocity <= org.telegram.messenger.g0.L(-200.0f)) || (((z10 = w0Var2.f3373a) && chatActivityEnterView2.f32718s4 <= 0.6f) || (!z10 && chatActivityEnterView2.f32718s4 >= 0.4f)))) {
                            chatActivityEnterView2.Q1(!w0Var2.f3373a, true, true, true);
                        } else {
                            chatActivityEnterView2.Q1(z10, true, true, true);
                        }
                    }
                } else {
                    bg.w0 w0Var3 = (bg.w0) tyVar.P0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) w0Var3.f3375c;
                    if (chatActivityEnterView3.f32677n4) {
                        chatActivityEnterView3.f32730u4 = false;
                        chatActivityEnterView3.Q1(w0Var3.f3373a, true, false, true);
                    }
                }
                this.f33936y0 = true;
                this.C0 = false;
                this.B0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f33934w0 && this.f33935x0 - motionEvent.getX() < 0.0f) {
                if (!jwVar.N) {
                    jwVar.f4473f0 = true;
                    jwVar.setScrollState(1);
                    jwVar.S = 0.0f;
                    jwVar.U = 0.0f;
                    VelocityTracker velocityTracker = jwVar.f4464a0;
                    if (velocityTracker == null) {
                        jwVar.f4464a0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    jwVar.f4464a0.addMovement(obtain);
                    obtain.recycle();
                    this.f33934w0 = true;
                    getTranslationX();
                }
            } else if (this.f33934w0 && this.f33935x0 - motionEvent.getX() > 0.0f && jwVar.f4473f0) {
                jwVar.i();
                this.f33934w0 = false;
            }
        }
        if (this.f33934w0) {
            motionEvent.getX();
        }
        this.f33935x0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f33936y0 = true;
            this.C0 = false;
            this.B0 = false;
            if (this.f33934w0) {
                jwVar.i();
                this.f33934w0 = false;
            }
        }
        if (!this.f33934w0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
