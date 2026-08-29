package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class kx extends fm0 {
    public final int f30161q0;
    public boolean f30162r0;
    public float f30163s0;
    public boolean f30164t0;
    public float f30165u0;
    public float f30166v0;
    public boolean f30167w0;
    public boolean f30168x0;
    public VelocityTracker f30169y0;
    public final fz f30170z0;

    public kx(fz fzVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, fzVar.f28591e2);
        this.f30170z0 = fzVar;
        this.f30164t0 = true;
        this.f30161q0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f28504s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.f30168x0 = false;
            this.f30167w0 = false;
            this.f30165u0 = motionEvent.getRawX();
            this.f30166v0 = motionEvent.getRawY();
        } else if (!this.f30167w0 && !this.f30168x0) {
            fz fzVar = this.f30170z0;
            if (fzVar.K0 != null && Math.abs(motionEvent.getRawY() - this.f30166v0) >= this.f30161q0) {
                this.f30167w0 = true;
                this.f30166v0 = motionEvent.getRawY();
                ((m.a) fzVar.K0).e();
                if (this.f30162r0) {
                    fzVar.h.i();
                    this.f30162r0 = false;
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
        fz fzVar = this.f30170z0;
        lh.m7 m7Var = fzVar.f28580b2;
        rw rwVar = fzVar.h;
        if (this.f28504s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f30164t0) {
            this.f30164t0 = false;
            this.f30163s0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            fzVar.S1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.f30168x0 = false;
            this.f30167w0 = false;
            this.f30165u0 = motionEvent.getRawX();
            this.f30166v0 = motionEvent.getRawY();
        } else if (!this.f30167w0 && !this.f30168x0 && fzVar.K0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f30165u0);
            float f9 = this.f30161q0;
            if (abs >= f9 && canScrollHorizontally((int) (this.f30165u0 - motionEvent.getRawX()))) {
                this.f30168x0 = true;
                AndroidUtilities.cancelRunOnUIThread(m7Var);
                fzVar.T1 = true;
                fzVar.a0();
            } else if (Math.abs(motionEvent.getRawY() - this.f30166v0) >= f9) {
                this.f30167w0 = true;
                this.f30166v0 = motionEvent.getRawY();
                ((m.a) fzVar.K0).e();
                if (this.f30162r0) {
                    rwVar.i();
                    this.f30162r0 = false;
                }
            }
        }
        if (fzVar.T1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(m7Var, 1500L);
        }
        if (this.f30167w0) {
            if (this.f30169y0 == null) {
                this.f30169y0 = VelocityTracker.obtain();
            }
            this.f30169y0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                jx jxVar = fzVar.K0;
                int round = Math.round(motionEvent.getRawY() - this.f30166v0);
                m.a aVar = (m.a) jxVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f16483c;
                if (aVar.d()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i10 = chatActivityEnterView.f26195t2;
                    } else {
                        i10 = chatActivityEnterView.f26190s2;
                    }
                    int max = Math.max(Math.min(round + aVar.f16482b, 0), -(chatActivityEnterView.f26223y3 - i10));
                    if (chatActivityEnterView.Y4 == null) {
                        float f10 = max;
                        chatActivityEnterView.Q0.setTranslationY(f10);
                        chatActivityEnterView.setTranslationY(f10);
                    }
                    chatActivityEnterView.f26218x3 = max / (-(chatActivityEnterView.f26223y3 - i10));
                    chatActivityEnterView.f26132h1.invalidate();
                }
            } else {
                this.f30169y0.computeCurrentVelocity(1000);
                float yVelocity = this.f30169y0.getYVelocity();
                this.f30169y0.recycle();
                this.f30169y0 = null;
                if (motionEvent.getAction() == 1) {
                    m.a aVar2 = (m.a) fzVar.K0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) aVar2.f16483c;
                    if (aVar2.d()) {
                        chatActivityEnterView2.f26228z3 = false;
                        if ((aVar2.f16481a && yVelocity >= AndroidUtilities.dp(200.0f)) || ((!aVar2.f16481a && yVelocity <= AndroidUtilities.dp(-200.0f)) || (((z10 = aVar2.f16481a) && chatActivityEnterView2.f26218x3 <= 0.6f) || (!z10 && chatActivityEnterView2.f26218x3 >= 0.4f)))) {
                            chatActivityEnterView2.n1(!aVar2.f16481a, true, true, true);
                        } else {
                            chatActivityEnterView2.n1(z10, true, true, true);
                        }
                    }
                } else {
                    m.a aVar3 = (m.a) fzVar.K0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) aVar3.f16483c;
                    if (chatActivityEnterView3.f26191s3) {
                        chatActivityEnterView3.f26228z3 = false;
                        chatActivityEnterView3.n1(aVar3.f16481a, true, false, true);
                    }
                }
                this.f30164t0 = true;
                this.f30168x0 = false;
                this.f30167w0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f30162r0 && this.f30163s0 - motionEvent.getX() < 0.0f) {
                if (!rwVar.I) {
                    rwVar.f16784a0 = true;
                    rwVar.setScrollState(1);
                    rwVar.N = 0.0f;
                    rwVar.P = 0.0f;
                    VelocityTracker velocityTracker = rwVar.S;
                    if (velocityTracker == null) {
                        rwVar.S = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    rwVar.S.addMovement(obtain);
                    obtain.recycle();
                    this.f30162r0 = true;
                    getTranslationX();
                }
            } else if (this.f30162r0 && this.f30163s0 - motionEvent.getX() > 0.0f && rwVar.f16784a0) {
                rwVar.i();
                this.f30162r0 = false;
            }
        }
        if (this.f30162r0) {
            motionEvent.getX();
        }
        this.f30163s0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f30164t0 = true;
            this.f30168x0 = false;
            this.f30167w0 = false;
            if (this.f30162r0) {
                rwVar.i();
                this.f30162r0 = false;
            }
        }
        if (!this.f30162r0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
