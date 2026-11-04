package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public class mw extends vk0 {
    public float A0;
    public boolean B0;
    public boolean C0;
    public VelocityTracker D0;
    public final ey E0;
    public final int f36259v0;
    public boolean f36260w0;
    public float f36261x0;
    public boolean f36262y0;
    public float f36263z0;

    public mw(ey eyVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, eyVar.f33550j2);
        this.E0 = eyVar;
        this.f36262y0 = true;
        this.f36259v0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f39169s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.f36263z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0) {
            ey eyVar = this.E0;
            if (eyVar.P0 != null && Math.abs(motionEvent.getRawY() - this.A0) >= this.f36259v0) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((cg.v0) eyVar.P0).e();
                if (this.f36260w0) {
                    eyVar.h.i();
                    this.f36260w0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i3;
        ey eyVar = this.E0;
        lt ltVar = eyVar.f33541g2;
        uv uvVar = eyVar.h;
        if (this.f39169s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f36262y0) {
            this.f36262y0 = false;
            this.f36261x0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            eyVar.X1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.f36263z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0 && eyVar.P0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f36263z0);
            float f10 = this.f36259v0;
            if (abs >= f10 && canScrollHorizontally((int) (this.f36263z0 - motionEvent.getRawX()))) {
                this.C0 = true;
                org.telegram.messenger.g0.r(ltVar);
                eyVar.Y1 = true;
                eyVar.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.A0) >= f10) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((cg.v0) eyVar.P0).e();
                if (this.f36260w0) {
                    uvVar.i();
                    this.f36260w0 = false;
                }
            }
        }
        if (eyVar.Y1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            org.telegram.messenger.g0.i3(ltVar, 1500L);
        }
        if (this.B0) {
            if (this.D0 == null) {
                this.D0 = VelocityTracker.obtain();
            }
            this.D0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                lw lwVar = eyVar.P0;
                int round = Math.round(motionEvent.getRawY() - this.A0);
                cg.v0 v0Var = (cg.v0) lwVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) v0Var.f4759c;
                if (v0Var.d()) {
                    Point point = org.telegram.messenger.g0.f22608q;
                    if (point.x > point.y) {
                        i3 = chatActivityEnterView.f31233z2;
                    } else {
                        i3 = chatActivityEnterView.f31228y2;
                    }
                    int max = Math.max(Math.min(round + v0Var.f4758b, 0), -(chatActivityEnterView.E3 - i3));
                    if (chatActivityEnterView.f31139i5 == null) {
                        float f11 = max;
                        chatActivityEnterView.V0.setTranslationY(f11);
                        chatActivityEnterView.setTranslationY(f11);
                    }
                    chatActivityEnterView.D3 = max / (-(chatActivityEnterView.E3 - i3));
                    chatActivityEnterView.f31163n1.invalidate();
                }
            } else {
                this.D0.computeCurrentVelocity(1000);
                float yVelocity = this.D0.getYVelocity();
                this.D0.recycle();
                this.D0 = null;
                if (motionEvent.getAction() == 1) {
                    cg.v0 v0Var2 = (cg.v0) eyVar.P0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) v0Var2.f4759c;
                    if (v0Var2.d()) {
                        chatActivityEnterView2.F3 = false;
                        if ((v0Var2.f4757a && yVelocity >= org.telegram.messenger.g0.L(200.0f)) || ((!v0Var2.f4757a && yVelocity <= org.telegram.messenger.g0.L(-200.0f)) || (((z10 = v0Var2.f4757a) && chatActivityEnterView2.D3 <= 0.6f) || (!z10 && chatActivityEnterView2.D3 >= 0.4f)))) {
                            chatActivityEnterView2.m1(!v0Var2.f4757a, true, true, true);
                        } else {
                            chatActivityEnterView2.m1(z10, true, true, true);
                        }
                    }
                } else {
                    cg.v0 v0Var3 = (cg.v0) eyVar.P0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) v0Var3.f4759c;
                    if (chatActivityEnterView3.f31229y3) {
                        chatActivityEnterView3.F3 = false;
                        chatActivityEnterView3.m1(v0Var3.f4757a, true, false, true);
                    }
                }
                this.f36262y0 = true;
                this.C0 = false;
                this.B0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f36260w0 && this.f36261x0 - motionEvent.getX() < 0.0f) {
                if (!uvVar.N) {
                    uvVar.f2425f0 = true;
                    uvVar.setScrollState(1);
                    uvVar.S = 0.0f;
                    uvVar.U = 0.0f;
                    VelocityTracker velocityTracker = uvVar.f2416a0;
                    if (velocityTracker == null) {
                        uvVar.f2416a0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    uvVar.f2416a0.addMovement(obtain);
                    obtain.recycle();
                    this.f36260w0 = true;
                    getTranslationX();
                }
            } else if (this.f36260w0 && this.f36261x0 - motionEvent.getX() > 0.0f && uvVar.f2425f0) {
                uvVar.i();
                this.f36260w0 = false;
            }
        }
        if (this.f36260w0) {
            motionEvent.getX();
        }
        this.f36261x0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f36262y0 = true;
            this.C0 = false;
            this.B0 = false;
            if (this.f36260w0) {
                uvVar.i();
                this.f36260w0 = false;
            }
        }
        if (!this.f36260w0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
