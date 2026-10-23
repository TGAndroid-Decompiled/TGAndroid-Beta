package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class yx extends kn0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final tz D0;
    public final int f33055u0;
    public boolean f33056v0;
    public float f33057w0;
    public boolean f33058x0;
    public float f33059y0;
    public float f33060z0;

    public yx(tz tzVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, tzVar.f30986i2);
        this.D0 = tzVar;
        this.f33058x0 = true;
        this.f33055u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f28091s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f33059y0 = motionEvent.getRawX();
            this.f33060z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0) {
            tz tzVar = this.D0;
            if (tzVar.O0 != null && Math.abs(motionEvent.getRawY() - this.f33060z0) >= this.f33055u0) {
                this.A0 = true;
                this.f33060z0 = motionEvent.getRawY();
                ((c5.f) tzVar.O0).e();
                if (this.f33056v0) {
                    tzVar.h.i();
                    this.f33056v0 = false;
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
        tz tzVar = this.D0;
        org.telegram.ui.Cells.u5 u5Var = tzVar.f30977f2;
        gx gxVar = tzVar.h;
        if (this.f28091s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f33058x0) {
            this.f33058x0 = false;
            this.f33057w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            tzVar.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f33059y0 = motionEvent.getRawX();
            this.f33060z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && tzVar.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f33059y0);
            float f7 = this.f33055u0;
            if (abs >= f7 && canScrollHorizontally((int) (this.f33059y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                AndroidUtilities.cancelRunOnUIThread(u5Var);
                tzVar.X1 = true;
                tzVar.Y();
            } else if (Math.abs(motionEvent.getRawY() - this.f33060z0) >= f7) {
                this.A0 = true;
                this.f33060z0 = motionEvent.getRawY();
                ((c5.f) tzVar.O0).e();
                if (this.f33056v0) {
                    gxVar.i();
                    this.f33056v0 = false;
                }
            }
        }
        if (tzVar.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(u5Var, 1500L);
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = VelocityTracker.obtain();
            }
            this.C0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                xx xxVar = tzVar.O0;
                int round = Math.round(motionEvent.getRawY() - this.f33060z0);
                c5.f fVar = (c5.f) xxVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) fVar.f4735c;
                if (fVar.d()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i10 = chatActivityEnterView.f24195y2;
                    } else {
                        i10 = chatActivityEnterView.f24189x2;
                    }
                    int max = Math.max(Math.min(round + fVar.f4733a, 0), -(chatActivityEnterView.D3 - i10));
                    if (chatActivityEnterView.f24101h5 == null) {
                        float f10 = max;
                        chatActivityEnterView.U0.setTranslationY(f10);
                        chatActivityEnterView.setTranslationY(f10);
                    }
                    chatActivityEnterView.C3 = max / (-(chatActivityEnterView.D3 - i10));
                    chatActivityEnterView.f24124m1.invalidate();
                }
            } else {
                this.C0.computeCurrentVelocity(1000);
                float yVelocity = this.C0.getYVelocity();
                this.C0.recycle();
                this.C0 = null;
                if (motionEvent.getAction() == 1) {
                    c5.f fVar2 = (c5.f) tzVar.O0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) fVar2.f4735c;
                    if (fVar2.d()) {
                        chatActivityEnterView2.E3 = false;
                        if ((fVar2.f4734b && yVelocity >= AndroidUtilities.dp(200.0f)) || ((!fVar2.f4734b && yVelocity <= AndroidUtilities.dp(-200.0f)) || (((z10 = fVar2.f4734b) && chatActivityEnterView2.C3 <= 0.6f) || (!z10 && chatActivityEnterView2.C3 >= 0.4f)))) {
                            chatActivityEnterView2.k1(!fVar2.f4734b, true, true, true);
                        } else {
                            chatActivityEnterView2.k1(z10, true, true, true);
                        }
                    }
                } else {
                    c5.f fVar3 = (c5.f) tzVar.O0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) fVar3.f4735c;
                    if (chatActivityEnterView3.f24190x3) {
                        chatActivityEnterView3.E3 = false;
                        chatActivityEnterView3.k1(fVar3.f4734b, true, false, true);
                    }
                }
                this.f33058x0 = true;
                this.B0 = false;
                this.A0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f33056v0 && this.f33057w0 - motionEvent.getX() < 0.0f) {
                if (!gxVar.M) {
                    gxVar.f51155e0 = true;
                    gxVar.setScrollState(1);
                    gxVar.R = 0.0f;
                    gxVar.T = 0.0f;
                    VelocityTracker velocityTracker = gxVar.W;
                    if (velocityTracker == null) {
                        gxVar.W = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    gxVar.W.addMovement(obtain);
                    obtain.recycle();
                    this.f33056v0 = true;
                    getTranslationX();
                }
            } else if (this.f33056v0 && this.f33057w0 - motionEvent.getX() > 0.0f && gxVar.f51155e0) {
                gxVar.i();
                this.f33056v0 = false;
            }
        }
        if (this.f33056v0) {
            motionEvent.getX();
        }
        this.f33057w0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f33058x0 = true;
            this.B0 = false;
            this.A0 = false;
            if (this.f33056v0) {
                gxVar.i();
                this.f33056v0 = false;
            }
        }
        if (!this.f33056v0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
