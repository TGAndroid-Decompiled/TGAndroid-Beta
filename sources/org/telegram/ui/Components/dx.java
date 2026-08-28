package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class dx extends sl0 {
    public final int f27828q0;
    public boolean f27829r0;
    public float f27830s0;
    public boolean f27831t0;
    public float f27832u0;
    public float f27833v0;
    public boolean f27834w0;
    public boolean f27835x0;
    public VelocityTracker f27836y0;
    public final wy f27837z0;

    public dx(wy wyVar, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var, wyVar.f34400e2);
        this.f27837z0 = wyVar;
        this.f27831t0 = true;
        this.f27828q0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f32514s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.f27835x0 = false;
            this.f27834w0 = false;
            this.f27832u0 = motionEvent.getRawX();
            this.f27833v0 = motionEvent.getRawY();
        } else if (!this.f27834w0 && !this.f27835x0) {
            wy wyVar = this.f27837z0;
            if (wyVar.K0 != null && Math.abs(motionEvent.getRawY() - this.f27833v0) >= this.f27828q0) {
                this.f27834w0 = true;
                this.f27833v0 = motionEvent.getRawY();
                ((m.a) wyVar.K0).e();
                if (this.f27829r0) {
                    wyVar.h.i();
                    this.f27829r0 = false;
                }
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int i9;
        wy wyVar = this.f27837z0;
        m.i3 i3Var = wyVar.f34389b2;
        lw lwVar = wyVar.h;
        if (this.f32514s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f27831t0) {
            this.f27831t0 = false;
            this.f27830s0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            wyVar.S1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.f27835x0 = false;
            this.f27834w0 = false;
            this.f27832u0 = motionEvent.getRawX();
            this.f27833v0 = motionEvent.getRawY();
        } else if (!this.f27834w0 && !this.f27835x0 && wyVar.K0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f27832u0);
            float f10 = this.f27828q0;
            if (abs >= f10 && canScrollHorizontally((int) (this.f27832u0 - motionEvent.getRawX()))) {
                this.f27835x0 = true;
                AndroidUtilities.cancelRunOnUIThread(i3Var);
                wyVar.T1 = true;
                wyVar.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.f27833v0) >= f10) {
                this.f27834w0 = true;
                this.f27833v0 = motionEvent.getRawY();
                ((m.a) wyVar.K0).e();
                if (this.f27829r0) {
                    lwVar.i();
                    this.f27829r0 = false;
                }
            }
        }
        if (wyVar.T1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(i3Var, 1500L);
        }
        if (this.f27834w0) {
            if (this.f27836y0 == null) {
                this.f27836y0 = VelocityTracker.obtain();
            }
            this.f27836y0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                cx cxVar = wyVar.K0;
                int round = Math.round(motionEvent.getRawY() - this.f27833v0);
                m.a aVar = (m.a) cxVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f16884c;
                if (aVar.d()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i9 = chatActivityEnterView.f26184t2;
                    } else {
                        i9 = chatActivityEnterView.f26179s2;
                    }
                    int max = Math.max(Math.min(round + aVar.f16883b, 0), -(chatActivityEnterView.f26212y3 - i9));
                    if (chatActivityEnterView.Y4 == null) {
                        float f11 = max;
                        chatActivityEnterView.Q0.setTranslationY(f11);
                        chatActivityEnterView.setTranslationY(f11);
                    }
                    chatActivityEnterView.f26206x3 = max / (-(chatActivityEnterView.f26212y3 - i9));
                    chatActivityEnterView.f26121h1.invalidate();
                }
            } else {
                this.f27836y0.computeCurrentVelocity(1000);
                float yVelocity = this.f27836y0.getYVelocity();
                this.f27836y0.recycle();
                this.f27836y0 = null;
                if (motionEvent.getAction() == 1) {
                    m.a aVar2 = (m.a) wyVar.K0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) aVar2.f16884c;
                    if (aVar2.d()) {
                        chatActivityEnterView2.f26217z3 = false;
                        if ((aVar2.f16882a && yVelocity >= AndroidUtilities.dp(200.0f)) || ((!aVar2.f16882a && yVelocity <= AndroidUtilities.dp(-200.0f)) || (((z10 = aVar2.f16882a) && chatActivityEnterView2.f26206x3 <= 0.6f) || (!z10 && chatActivityEnterView2.f26206x3 >= 0.4f)))) {
                            chatActivityEnterView2.n1(!aVar2.f16882a, true, true, true);
                        } else {
                            chatActivityEnterView2.n1(z10, true, true, true);
                        }
                    }
                } else {
                    m.a aVar3 = (m.a) wyVar.K0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) aVar3.f16884c;
                    if (chatActivityEnterView3.f26180s3) {
                        chatActivityEnterView3.f26217z3 = false;
                        chatActivityEnterView3.n1(aVar3.f16882a, true, false, true);
                    }
                }
                this.f27831t0 = true;
                this.f27835x0 = false;
                this.f27834w0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f27829r0 && this.f27830s0 - motionEvent.getX() < 0.0f) {
                if (!lwVar.I) {
                    lwVar.f17186a0 = true;
                    lwVar.setScrollState(1);
                    lwVar.N = 0.0f;
                    lwVar.P = 0.0f;
                    VelocityTracker velocityTracker = lwVar.S;
                    if (velocityTracker == null) {
                        lwVar.S = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    lwVar.S.addMovement(obtain);
                    obtain.recycle();
                    this.f27829r0 = true;
                    getTranslationX();
                }
            } else if (this.f27829r0 && this.f27830s0 - motionEvent.getX() > 0.0f && lwVar.f17186a0) {
                lwVar.i();
                this.f27829r0 = false;
            }
        }
        if (this.f27829r0) {
            motionEvent.getX();
        }
        this.f27830s0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f27831t0 = true;
            this.f27835x0 = false;
            this.f27834w0 = false;
            if (this.f27829r0) {
                lwVar.i();
                this.f27829r0 = false;
            }
        }
        if (!this.f27829r0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
