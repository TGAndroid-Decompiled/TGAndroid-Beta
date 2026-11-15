package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public class tw extends wk0 {
    public float A0;
    public boolean B0;
    public boolean C0;
    public VelocityTracker D0;
    public final ly E0;
    public final int f39819v0;
    public boolean f39820w0;
    public float f39821x0;
    public boolean f39822y0;
    public float f39823z0;

    public tw(ly lyVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, lyVar.f36961j2);
        this.E0 = lyVar;
        this.f39822y0 = true;
        this.f39819v0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f41397s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.f39823z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0) {
            ly lyVar = this.E0;
            if (lyVar.P0 != null && Math.abs(motionEvent.getRawY() - this.A0) >= this.f39819v0) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((bg.v0) lyVar.P0).e();
                if (this.f39820w0) {
                    lyVar.h.i();
                    this.f39820w0 = false;
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
        ly lyVar = this.E0;
        zj zjVar = lyVar.f36952g2;
        bw bwVar = lyVar.h;
        if (this.f41397s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f39822y0) {
            this.f39822y0 = false;
            this.f39821x0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            lyVar.X1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.C0 = false;
            this.B0 = false;
            this.f39823z0 = motionEvent.getRawX();
            this.A0 = motionEvent.getRawY();
        } else if (!this.B0 && !this.C0 && lyVar.P0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f39823z0);
            float f10 = this.f39819v0;
            if (abs >= f10 && canScrollHorizontally((int) (this.f39823z0 - motionEvent.getRawX()))) {
                this.C0 = true;
                org.telegram.messenger.g0.r(zjVar);
                lyVar.Y1 = true;
                lyVar.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.A0) >= f10) {
                this.B0 = true;
                this.A0 = motionEvent.getRawY();
                ((bg.v0) lyVar.P0).e();
                if (this.f39820w0) {
                    bwVar.i();
                    this.f39820w0 = false;
                }
            }
        }
        if (lyVar.Y1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            org.telegram.messenger.g0.i3(zjVar, 1500L);
        }
        if (this.B0) {
            if (this.D0 == null) {
                this.D0 = VelocityTracker.obtain();
            }
            this.D0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                sw swVar = lyVar.P0;
                int round = Math.round(motionEvent.getRawY() - this.A0);
                bg.v0 v0Var = (bg.v0) swVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) v0Var.f3345c;
                if (v0Var.d()) {
                    Point point = org.telegram.messenger.g0.f23609q;
                    if (point.x > point.y) {
                        i7 = chatActivityEnterView.f32202g3;
                    } else {
                        i7 = chatActivityEnterView.f32195f3;
                    }
                    int max = Math.max(Math.min(round + v0Var.f3344b, 0), -(chatActivityEnterView.f32236l4 - i7));
                    if (chatActivityEnterView.C6 == null) {
                        float f11 = max;
                        chatActivityEnterView.V0.setTranslationY(f11);
                        chatActivityEnterView.setTranslationY(f11);
                    }
                    chatActivityEnterView.f32230k4 = max / (-(chatActivityEnterView.f32236l4 - i7));
                    chatActivityEnterView.U1.invalidate();
                }
            } else {
                this.D0.computeCurrentVelocity(1000);
                float yVelocity = this.D0.getYVelocity();
                this.D0.recycle();
                this.D0 = null;
                if (motionEvent.getAction() == 1) {
                    bg.v0 v0Var2 = (bg.v0) lyVar.P0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) v0Var2.f3345c;
                    if (v0Var2.d()) {
                        chatActivityEnterView2.f32242m4 = false;
                        if ((v0Var2.f3343a && yVelocity >= org.telegram.messenger.g0.L(200.0f)) || ((!v0Var2.f3343a && yVelocity <= org.telegram.messenger.g0.L(-200.0f)) || (((z10 = v0Var2.f3343a) && chatActivityEnterView2.f32230k4 <= 0.6f) || (!z10 && chatActivityEnterView2.f32230k4 >= 0.4f)))) {
                            chatActivityEnterView2.E1(!v0Var2.f3343a, true, true, true);
                        } else {
                            chatActivityEnterView2.E1(z10, true, true, true);
                        }
                    }
                } else {
                    bg.v0 v0Var3 = (bg.v0) lyVar.P0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) v0Var3.f3345c;
                    if (chatActivityEnterView3.f32196f4) {
                        chatActivityEnterView3.f32242m4 = false;
                        chatActivityEnterView3.E1(v0Var3.f3343a, true, false, true);
                    }
                }
                this.f39822y0 = true;
                this.C0 = false;
                this.B0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f39820w0 && this.f39821x0 - motionEvent.getX() < 0.0f) {
                if (!bwVar.N) {
                    bwVar.f4160f0 = true;
                    bwVar.setScrollState(1);
                    bwVar.S = 0.0f;
                    bwVar.U = 0.0f;
                    VelocityTracker velocityTracker = bwVar.f4151a0;
                    if (velocityTracker == null) {
                        bwVar.f4151a0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    bwVar.f4151a0.addMovement(obtain);
                    obtain.recycle();
                    this.f39820w0 = true;
                    getTranslationX();
                }
            } else if (this.f39820w0 && this.f39821x0 - motionEvent.getX() > 0.0f && bwVar.f4160f0) {
                bwVar.i();
                this.f39820w0 = false;
            }
        }
        if (this.f39820w0) {
            motionEvent.getX();
        }
        this.f39821x0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f39822y0 = true;
            this.C0 = false;
            this.B0 = false;
            if (this.f39820w0) {
                bwVar.i();
                this.f39820w0 = false;
            }
        }
        if (!this.f39820w0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
