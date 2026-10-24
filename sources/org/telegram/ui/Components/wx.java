package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class wx extends jn0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final rz D0;
    public final int f32427u0;
    public boolean f32428v0;
    public float f32429w0;
    public boolean f32430x0;
    public float f32431y0;
    public float f32432z0;

    public wx(rz rzVar, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, rzVar.f30330i2);
        this.D0 = rzVar;
        this.f32430x0 = true;
        this.f32427u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27752s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f32431y0 = motionEvent.getRawX();
            this.f32432z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0) {
            rz rzVar = this.D0;
            if (rzVar.O0 != null && Math.abs(motionEvent.getRawY() - this.f32432z0) >= this.f32427u0) {
                this.A0 = true;
                this.f32432z0 = motionEvent.getRawY();
                ((c5.f) rzVar.O0).e();
                if (this.f32428v0) {
                    rzVar.h.i();
                    this.f32428v0 = false;
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
        rz rzVar = this.D0;
        org.telegram.ui.Cells.u5 u5Var = rzVar.f30321f2;
        ex exVar = rzVar.h;
        if (this.f27752s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f32430x0) {
            this.f32430x0 = false;
            this.f32429w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            rzVar.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f32431y0 = motionEvent.getRawX();
            this.f32432z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && rzVar.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f32431y0);
            float f7 = this.f32427u0;
            if (abs >= f7 && canScrollHorizontally((int) (this.f32431y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                AndroidUtilities.cancelRunOnUIThread(u5Var);
                rzVar.X1 = true;
                rzVar.Y();
            } else if (Math.abs(motionEvent.getRawY() - this.f32432z0) >= f7) {
                this.A0 = true;
                this.f32432z0 = motionEvent.getRawY();
                ((c5.f) rzVar.O0).e();
                if (this.f32428v0) {
                    exVar.i();
                    this.f32428v0 = false;
                }
            }
        }
        if (rzVar.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(u5Var, 1500L);
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = VelocityTracker.obtain();
            }
            this.C0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                vx vxVar = rzVar.O0;
                int round = Math.round(motionEvent.getRawY() - this.f32432z0);
                c5.f fVar = (c5.f) vxVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) fVar.f4735c;
                if (fVar.d()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i10 = chatActivityEnterView.f24196y2;
                    } else {
                        i10 = chatActivityEnterView.f24190x2;
                    }
                    int max = Math.max(Math.min(round + fVar.f4733a, 0), -(chatActivityEnterView.D3 - i10));
                    if (chatActivityEnterView.f24102h5 == null) {
                        float f10 = max;
                        chatActivityEnterView.U0.setTranslationY(f10);
                        chatActivityEnterView.setTranslationY(f10);
                    }
                    chatActivityEnterView.C3 = max / (-(chatActivityEnterView.D3 - i10));
                    chatActivityEnterView.f24125m1.invalidate();
                }
            } else {
                this.C0.computeCurrentVelocity(1000);
                float yVelocity = this.C0.getYVelocity();
                this.C0.recycle();
                this.C0 = null;
                if (motionEvent.getAction() == 1) {
                    c5.f fVar2 = (c5.f) rzVar.O0;
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
                    c5.f fVar3 = (c5.f) rzVar.O0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) fVar3.f4735c;
                    if (chatActivityEnterView3.f24191x3) {
                        chatActivityEnterView3.E3 = false;
                        chatActivityEnterView3.k1(fVar3.f4734b, true, false, true);
                    }
                }
                this.f32430x0 = true;
                this.B0 = false;
                this.A0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f32428v0 && this.f32429w0 - motionEvent.getX() < 0.0f) {
                if (!exVar.M) {
                    exVar.f51154e0 = true;
                    exVar.setScrollState(1);
                    exVar.R = 0.0f;
                    exVar.T = 0.0f;
                    VelocityTracker velocityTracker = exVar.W;
                    if (velocityTracker == null) {
                        exVar.W = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    exVar.W.addMovement(obtain);
                    obtain.recycle();
                    this.f32428v0 = true;
                    getTranslationX();
                }
            } else if (this.f32428v0 && this.f32429w0 - motionEvent.getX() > 0.0f && exVar.f51154e0) {
                exVar.i();
                this.f32428v0 = false;
            }
        }
        if (this.f32428v0) {
            motionEvent.getX();
        }
        this.f32429w0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f32430x0 = true;
            this.B0 = false;
            this.A0 = false;
            if (this.f32428v0) {
                exVar.i();
                this.f32428v0 = false;
            }
        }
        if (!this.f32428v0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
