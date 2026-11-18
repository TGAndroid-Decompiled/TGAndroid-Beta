package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public class zw extends el0 {
    public float A0;
    public boolean B0;
    public boolean C0;
    public VelocityTracker D0;
    public final ry E0;
    public final int f42953v0;
    public boolean f42954w0;
    public float f42955x0;
    public boolean f42956y0;
    public float f42957z0;

    public zw(ry ryVar, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var, ryVar.f39365j2);
        this.E0 = ryVar;
        this.f42956y0 = true;
        this.f42953v0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f34759s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.f42957z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0) {
            ry ryVar = this.E0;
            if (ryVar.P0 != null && Math.abs(motionEvent.getRawY() - this.A0) >= this.f42953v0) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((bg.w0) ryVar.P0).e();
                if (this.f42954w0) {
                    ryVar.h.i();
                    this.f42954w0 = false;
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
        ry ryVar = this.E0;
        gk gkVar = ryVar.f39356g2;
        hw hwVar = ryVar.h;
        if (this.f34759s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f42956y0) {
            this.f42956y0 = false;
            this.f42955x0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            ryVar.X1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.f42957z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0 && ryVar.P0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f42957z0);
            float f10 = this.f42953v0;
            if (abs >= f10 && canScrollHorizontally((int) (this.f42957z0 - motionEvent.getRawX()))) {
                this.C0 = true;
                org.telegram.messenger.g0.r(gkVar);
                ryVar.Y1 = true;
                ryVar.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.A0) >= f10) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((bg.w0) ryVar.P0).e();
                if (this.f42954w0) {
                    hwVar.i();
                    this.f42954w0 = false;
                }
            }
        }
        if (ryVar.Y1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            org.telegram.messenger.g0.h3(gkVar, 1500L);
        }
        if (this.B0) {
            if (this.D0 == null) {
                this.D0 = VelocityTracker.obtain();
            }
            this.D0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                yw ywVar = ryVar.P0;
                int round = Math.round(motionEvent.getRawY() - this.A0);
                bg.w0 w0Var = (bg.w0) ywVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) w0Var.f3356c;
                if (w0Var.d()) {
                    Point point = org.telegram.messenger.g0.f24118q;
                    if (point.x > point.y) {
                        i7 = chatActivityEnterView.f32637m3;
                    } else {
                        i7 = chatActivityEnterView.f32630l3;
                    }
                    int max = Math.max(Math.min(round + w0Var.f3355b, 0), -(chatActivityEnterView.f32674r4 - i7));
                    if (chatActivityEnterView.f32565c7 == null) {
                        float f11 = max;
                        chatActivityEnterView.V0.setTranslationY(f11);
                        chatActivityEnterView.setTranslationY(f11);
                    }
                    chatActivityEnterView.f32666q4 = max / (-(chatActivityEnterView.f32674r4 - i7));
                    chatActivityEnterView.f32542a2.invalidate();
                }
            } else {
                this.D0.computeCurrentVelocity(1000);
                float yVelocity = this.D0.getYVelocity();
                this.D0.recycle();
                this.D0 = null;
                if (motionEvent.getAction() == 1) {
                    bg.w0 w0Var2 = (bg.w0) ryVar.P0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) w0Var2.f3356c;
                    if (w0Var2.d()) {
                        chatActivityEnterView2.f32682s4 = false;
                        if ((w0Var2.f3354a && yVelocity >= org.telegram.messenger.g0.L(200.0f)) || ((!w0Var2.f3354a && yVelocity <= org.telegram.messenger.g0.L(-200.0f)) || (((z10 = w0Var2.f3354a) && chatActivityEnterView2.f32666q4 <= 0.6f) || (!z10 && chatActivityEnterView2.f32666q4 >= 0.4f)))) {
                            chatActivityEnterView2.M1(!w0Var2.f3354a, true, true, true);
                        } else {
                            chatActivityEnterView2.M1(z10, true, true, true);
                        }
                    }
                } else {
                    bg.w0 w0Var3 = (bg.w0) ryVar.P0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) w0Var3.f3356c;
                    if (chatActivityEnterView3.f32631l4) {
                        chatActivityEnterView3.f32682s4 = false;
                        chatActivityEnterView3.M1(w0Var3.f3354a, true, false, true);
                    }
                }
                this.f42956y0 = true;
                this.C0 = false;
                this.B0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f42954w0 && this.f42955x0 - motionEvent.getX() < 0.0f) {
                if (!hwVar.N) {
                    hwVar.f4441f0 = true;
                    hwVar.setScrollState(1);
                    hwVar.S = 0.0f;
                    hwVar.U = 0.0f;
                    VelocityTracker velocityTracker = hwVar.f4432a0;
                    if (velocityTracker == null) {
                        hwVar.f4432a0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    hwVar.f4432a0.addMovement(obtain);
                    obtain.recycle();
                    this.f42954w0 = true;
                    getTranslationX();
                }
            } else if (this.f42954w0 && this.f42955x0 - motionEvent.getX() > 0.0f && hwVar.f4441f0) {
                hwVar.i();
                this.f42954w0 = false;
            }
        }
        if (this.f42954w0) {
            motionEvent.getX();
        }
        this.f42955x0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f42956y0 = true;
            this.C0 = false;
            this.B0 = false;
            if (this.f42954w0) {
                hwVar.i();
                this.f42954w0 = false;
            }
        }
        if (!this.f42954w0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
