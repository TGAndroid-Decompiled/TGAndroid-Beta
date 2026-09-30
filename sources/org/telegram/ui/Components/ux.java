package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class ux extends xm0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final nz D0;
    public final int f28933u0;
    public boolean f28934v0;
    public float f28935w0;
    public boolean f28936x0;
    public float f28937y0;
    public float f28938z0;

    public ux(nz nzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, nzVar.f26838i2);
        this.D0 = nzVar;
        this.f28936x0 = true;
        this.f28933u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30378s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f28937y0 = motionEvent.getRawX();
            this.f28938z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0) {
            nz nzVar = this.D0;
            if (nzVar.O0 != null && Math.abs(motionEvent.getRawY() - this.f28938z0) >= this.f28933u0) {
                this.A0 = true;
                this.f28938z0 = motionEvent.getRawY();
                ((c2.a) nzVar.O0).e();
                if (this.f28934v0) {
                    nzVar.h.i();
                    this.f28934v0 = false;
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
        nz nzVar = this.D0;
        org.telegram.ui.Cells.t6 t6Var = nzVar.f26829f2;
        cx cxVar = nzVar.h;
        if (this.f30378s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f28936x0) {
            this.f28936x0 = false;
            this.f28935w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            nzVar.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f28937y0 = motionEvent.getRawX();
            this.f28938z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && nzVar.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f28937y0);
            float f7 = this.f28933u0;
            if (abs >= f7 && canScrollHorizontally((int) (this.f28937y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                AndroidUtilities.cancelRunOnUIThread(t6Var);
                nzVar.X1 = true;
                nzVar.Y();
            } else if (Math.abs(motionEvent.getRawY() - this.f28938z0) >= f7) {
                this.A0 = true;
                this.f28938z0 = motionEvent.getRawY();
                ((c2.a) nzVar.O0).e();
                if (this.f28934v0) {
                    cxVar.i();
                    this.f28934v0 = false;
                }
            }
        }
        if (nzVar.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(t6Var, 1500L);
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = VelocityTracker.obtain();
            }
            this.C0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                tx txVar = nzVar.O0;
                int round = Math.round(motionEvent.getRawY() - this.f28938z0);
                c2.a aVar = (c2.a) txVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f3657c;
                if (aVar.d()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i10 = chatActivityEnterView.f22115y2;
                    } else {
                        i10 = chatActivityEnterView.f22109x2;
                    }
                    int max = Math.max(Math.min(round + aVar.f3656b, 0), -(chatActivityEnterView.D3 - i10));
                    if (chatActivityEnterView.f22000d5 == null) {
                        float f10 = max;
                        chatActivityEnterView.U0.setTranslationY(f10);
                        chatActivityEnterView.setTranslationY(f10);
                    }
                    chatActivityEnterView.C3 = max / (-(chatActivityEnterView.D3 - i10));
                    chatActivityEnterView.f22047m1.invalidate();
                }
            } else {
                this.C0.computeCurrentVelocity(1000);
                float yVelocity = this.C0.getYVelocity();
                this.C0.recycle();
                this.C0 = null;
                if (motionEvent.getAction() == 1) {
                    c2.a aVar2 = (c2.a) nzVar.O0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) aVar2.f3657c;
                    if (aVar2.d()) {
                        chatActivityEnterView2.E3 = false;
                        if ((aVar2.f3655a && yVelocity >= AndroidUtilities.dp(200.0f)) || ((!aVar2.f3655a && yVelocity <= AndroidUtilities.dp(-200.0f)) || (((z10 = aVar2.f3655a) && chatActivityEnterView2.C3 <= 0.6f) || (!z10 && chatActivityEnterView2.C3 >= 0.4f)))) {
                            chatActivityEnterView2.n1(!aVar2.f3655a, true, true, true);
                        } else {
                            chatActivityEnterView2.n1(z10, true, true, true);
                        }
                    }
                } else {
                    c2.a aVar3 = (c2.a) nzVar.O0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) aVar3.f3657c;
                    if (chatActivityEnterView3.f22110x3) {
                        chatActivityEnterView3.E3 = false;
                        chatActivityEnterView3.n1(aVar3.f3655a, true, false, true);
                    }
                }
                this.f28936x0 = true;
                this.B0 = false;
                this.A0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f28934v0 && this.f28935w0 - motionEvent.getX() < 0.0f) {
                if (!cxVar.M) {
                    cxVar.f48511e0 = true;
                    cxVar.setScrollState(1);
                    cxVar.R = 0.0f;
                    cxVar.T = 0.0f;
                    VelocityTracker velocityTracker = cxVar.W;
                    if (velocityTracker == null) {
                        cxVar.W = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    cxVar.W.addMovement(obtain);
                    obtain.recycle();
                    this.f28934v0 = true;
                    getTranslationX();
                }
            } else if (this.f28934v0 && this.f28935w0 - motionEvent.getX() > 0.0f && cxVar.f48511e0) {
                cxVar.i();
                this.f28934v0 = false;
            }
        }
        if (this.f28934v0) {
            motionEvent.getX();
        }
        this.f28935w0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f28936x0 = true;
            this.B0 = false;
            this.A0 = false;
            if (this.f28934v0) {
                cxVar.i();
                this.f28934v0 = false;
            }
        }
        if (!this.f28934v0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
