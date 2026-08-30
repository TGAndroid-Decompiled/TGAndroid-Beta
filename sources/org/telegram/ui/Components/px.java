package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class px extends pm0 {
    public final kz A0;
    public final int f28003r0;
    public boolean f28004s0;
    public float f28005t0;
    public boolean f28006u0;
    public float f28007v0;
    public float f28008w0;
    public boolean f28009x0;
    public boolean f28010y0;
    public VelocityTracker f28011z0;

    public px(kz kzVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, kzVar.f26429f2);
        this.A0 = kzVar;
        this.f28006u0 = true;
        this.f28003r0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27955s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.f28010y0 = false;
            this.f28009x0 = false;
            this.f28007v0 = motionEvent.getRawX();
            this.f28008w0 = motionEvent.getRawY();
        } else if (!this.f28009x0 && !this.f28010y0) {
            kz kzVar = this.A0;
            if (kzVar.L0 != null && Math.abs(motionEvent.getRawY() - this.f28008w0) >= this.f28003r0) {
                this.f28009x0 = true;
                this.f28008w0 = motionEvent.getRawY();
                ((b7.l0) kzVar.L0).e();
                if (this.f28004s0) {
                    kzVar.h.i();
                    this.f28004s0 = false;
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
        kz kzVar = this.A0;
        m2.b bVar = kzVar.f26419c2;
        vw vwVar = kzVar.h;
        if (this.f27955s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f28006u0) {
            this.f28006u0 = false;
            this.f28005t0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            kzVar.T1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.f28010y0 = false;
            this.f28009x0 = false;
            this.f28007v0 = motionEvent.getRawX();
            this.f28008w0 = motionEvent.getRawY();
        } else if (!this.f28009x0 && !this.f28010y0 && kzVar.L0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f28007v0);
            float f10 = this.f28003r0;
            if (abs >= f10 && canScrollHorizontally((int) (this.f28007v0 - motionEvent.getRawX()))) {
                this.f28010y0 = true;
                AndroidUtilities.cancelRunOnUIThread(bVar);
                kzVar.U1 = true;
                kzVar.a0();
            } else if (Math.abs(motionEvent.getRawY() - this.f28008w0) >= f10) {
                this.f28009x0 = true;
                this.f28008w0 = motionEvent.getRawY();
                ((b7.l0) kzVar.L0).e();
                if (this.f28004s0) {
                    vwVar.i();
                    this.f28004s0 = false;
                }
            }
        }
        if (kzVar.U1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(bVar, 1500L);
        }
        if (this.f28009x0) {
            if (this.f28011z0 == null) {
                this.f28011z0 = VelocityTracker.obtain();
            }
            this.f28011z0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                ox oxVar = kzVar.L0;
                int round = Math.round(motionEvent.getRawY() - this.f28008w0);
                b7.l0 l0Var = (b7.l0) oxVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) l0Var.f1701c;
                if (l0Var.d()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i10 = chatActivityEnterView.f22844u2;
                    } else {
                        i10 = chatActivityEnterView.f22839t2;
                    }
                    int max = Math.max(Math.min(round + l0Var.f1700b, 0), -(chatActivityEnterView.f22873z3 - i10));
                    if (chatActivityEnterView.Z4 == null) {
                        float f11 = max;
                        chatActivityEnterView.R0.setTranslationY(f11);
                        chatActivityEnterView.setTranslationY(f11);
                    }
                    chatActivityEnterView.f22868y3 = max / (-(chatActivityEnterView.f22873z3 - i10));
                    chatActivityEnterView.f22781i1.invalidate();
                }
            } else {
                this.f28011z0.computeCurrentVelocity(1000);
                float yVelocity = this.f28011z0.getYVelocity();
                this.f28011z0.recycle();
                this.f28011z0 = null;
                if (motionEvent.getAction() == 1) {
                    b7.l0 l0Var2 = (b7.l0) kzVar.L0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) l0Var2.f1701c;
                    if (l0Var2.d()) {
                        chatActivityEnterView2.A3 = false;
                        if ((l0Var2.f1699a && yVelocity >= AndroidUtilities.dp(200.0f)) || ((!l0Var2.f1699a && yVelocity <= AndroidUtilities.dp(-200.0f)) || (((z4 = l0Var2.f1699a) && chatActivityEnterView2.f22868y3 <= 0.6f) || (!z4 && chatActivityEnterView2.f22868y3 >= 0.4f)))) {
                            chatActivityEnterView2.n1(!l0Var2.f1699a, true, true, true);
                        } else {
                            chatActivityEnterView2.n1(z4, true, true, true);
                        }
                    }
                } else {
                    b7.l0 l0Var3 = (b7.l0) kzVar.L0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) l0Var3.f1701c;
                    if (chatActivityEnterView3.f22840t3) {
                        chatActivityEnterView3.A3 = false;
                        chatActivityEnterView3.n1(l0Var3.f1699a, true, false, true);
                    }
                }
                this.f28006u0 = true;
                this.f28010y0 = false;
                this.f28009x0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f28004s0 && this.f28005t0 - motionEvent.getX() < 0.0f) {
                if (!vwVar.J) {
                    vwVar.f13730b0 = true;
                    vwVar.setScrollState(1);
                    vwVar.O = 0.0f;
                    vwVar.Q = 0.0f;
                    VelocityTracker velocityTracker = vwVar.T;
                    if (velocityTracker == null) {
                        vwVar.T = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    vwVar.T.addMovement(obtain);
                    obtain.recycle();
                    this.f28004s0 = true;
                    getTranslationX();
                }
            } else if (this.f28004s0 && this.f28005t0 - motionEvent.getX() > 0.0f && vwVar.f13730b0) {
                vwVar.i();
                this.f28004s0 = false;
            }
        }
        if (this.f28004s0) {
            motionEvent.getX();
        }
        this.f28005t0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f28006u0 = true;
            this.f28010y0 = false;
            this.f28009x0 = false;
            if (this.f28004s0) {
                vwVar.i();
                this.f28004s0 = false;
            }
        }
        if (!this.f28004s0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
