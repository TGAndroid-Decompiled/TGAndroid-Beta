package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class dy extends kn0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final wz D0;
    public final int f24501u0;
    public boolean f24502v0;
    public float f24503w0;
    public boolean f24504x0;
    public float f24505y0;
    public float f24506z0;

    public dy(wz wzVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, wzVar.f31034i2);
        this.D0 = wzVar;
        this.f24504x0 = true;
        this.f24501u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26757s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f24505y0 = motionEvent.getRawX();
            this.f24506z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0) {
            wz wzVar = this.D0;
            if (wzVar.O0 != null && Math.abs(motionEvent.getRawY() - this.f24506z0) >= this.f24501u0) {
                this.A0 = true;
                this.f24506z0 = motionEvent.getRawY();
                ((c5.f) wzVar.O0).e();
                if (this.f24502v0) {
                    wzVar.h.i();
                    this.f24502v0 = false;
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
        wz wzVar = this.D0;
        org.telegram.ui.Cells.t6 t6Var = wzVar.f31025f2;
        kx kxVar = wzVar.h;
        if (this.f26757s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f24504x0) {
            this.f24504x0 = false;
            this.f24503w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            wzVar.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f24505y0 = motionEvent.getRawX();
            this.f24506z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && wzVar.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f24505y0);
            float f7 = this.f24501u0;
            if (abs >= f7 && canScrollHorizontally((int) (this.f24505y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                AndroidUtilities.cancelRunOnUIThread(t6Var);
                wzVar.X1 = true;
                wzVar.Y();
            } else if (Math.abs(motionEvent.getRawY() - this.f24506z0) >= f7) {
                this.A0 = true;
                this.f24506z0 = motionEvent.getRawY();
                ((c5.f) wzVar.O0).e();
                if (this.f24502v0) {
                    kxVar.i();
                    this.f24502v0 = false;
                }
            }
        }
        if (wzVar.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(t6Var, 1500L);
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = VelocityTracker.obtain();
            }
            this.C0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                cy cyVar = wzVar.O0;
                int round = Math.round(motionEvent.getRawY() - this.f24506z0);
                c5.f fVar = (c5.f) cyVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) fVar.f4359c;
                if (fVar.d()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i10 = chatActivityEnterView.f22991y2;
                    } else {
                        i10 = chatActivityEnterView.f22985x2;
                    }
                    int max = Math.max(Math.min(round + fVar.f4357a, 0), -(chatActivityEnterView.D3 - i10));
                    if (chatActivityEnterView.f22875d5 == null) {
                        float f10 = max;
                        chatActivityEnterView.U0.setTranslationY(f10);
                        chatActivityEnterView.setTranslationY(f10);
                    }
                    chatActivityEnterView.C3 = max / (-(chatActivityEnterView.D3 - i10));
                    chatActivityEnterView.f22923m1.invalidate();
                }
            } else {
                this.C0.computeCurrentVelocity(1000);
                float yVelocity = this.C0.getYVelocity();
                this.C0.recycle();
                this.C0 = null;
                if (motionEvent.getAction() == 1) {
                    c5.f fVar2 = (c5.f) wzVar.O0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) fVar2.f4359c;
                    if (fVar2.d()) {
                        chatActivityEnterView2.E3 = false;
                        if ((fVar2.f4358b && yVelocity >= AndroidUtilities.dp(200.0f)) || ((!fVar2.f4358b && yVelocity <= AndroidUtilities.dp(-200.0f)) || (((z10 = fVar2.f4358b) && chatActivityEnterView2.C3 <= 0.6f) || (!z10 && chatActivityEnterView2.C3 >= 0.4f)))) {
                            chatActivityEnterView2.l1(!fVar2.f4358b, true, true, true);
                        } else {
                            chatActivityEnterView2.l1(z10, true, true, true);
                        }
                    }
                } else {
                    c5.f fVar3 = (c5.f) wzVar.O0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) fVar3.f4359c;
                    if (chatActivityEnterView3.f22986x3) {
                        chatActivityEnterView3.E3 = false;
                        chatActivityEnterView3.l1(fVar3.f4358b, true, false, true);
                    }
                }
                this.f24504x0 = true;
                this.B0 = false;
                this.A0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f24502v0 && this.f24503w0 - motionEvent.getX() < 0.0f) {
                if (!kxVar.M) {
                    kxVar.f49301e0 = true;
                    kxVar.setScrollState(1);
                    kxVar.R = 0.0f;
                    kxVar.T = 0.0f;
                    VelocityTracker velocityTracker = kxVar.W;
                    if (velocityTracker == null) {
                        kxVar.W = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    kxVar.W.addMovement(obtain);
                    obtain.recycle();
                    this.f24502v0 = true;
                    getTranslationX();
                }
            } else if (this.f24502v0 && this.f24503w0 - motionEvent.getX() > 0.0f && kxVar.f49301e0) {
                kxVar.i();
                this.f24502v0 = false;
            }
        }
        if (this.f24502v0) {
            motionEvent.getX();
        }
        this.f24503w0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f24504x0 = true;
            this.B0 = false;
            this.A0 = false;
            if (this.f24502v0) {
                kxVar.i();
                this.f24502v0 = false;
            }
        }
        if (!this.f24502v0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
