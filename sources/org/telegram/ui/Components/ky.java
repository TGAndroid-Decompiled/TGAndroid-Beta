package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class ky extends un0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final d00 D0;
    public final int f27941u0;
    public boolean f27942v0;
    public float f27943w0;
    public boolean f27944x0;
    public float f27945y0;
    public float f27946z0;

    public ky(d00 d00Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, d00Var.f25093i2);
        this.D0 = d00Var;
        this.f27944x0 = true;
        this.f27941u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f31223s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f27945y0 = motionEvent.getRawX();
            this.f27946z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0) {
            d00 d00Var = this.D0;
            if (d00Var.O0 != null && Math.abs(motionEvent.getRawY() - this.f27946z0) >= this.f27941u0) {
                this.A0 = true;
                this.f27946z0 = motionEvent.getRawY();
                ((c2.a) d00Var.O0).e();
                if (this.f27942v0) {
                    d00Var.h.i();
                    this.f27942v0 = false;
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
        d00 d00Var = this.D0;
        org.telegram.ui.Cells.l7 l7Var = d00Var.f25084f2;
        rx rxVar = d00Var.h;
        if (this.f31223s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f27944x0) {
            this.f27944x0 = false;
            this.f27943w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            d00Var.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f27945y0 = motionEvent.getRawX();
            this.f27946z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && d00Var.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f27945y0);
            float f7 = this.f27941u0;
            if (abs >= f7 && canScrollHorizontally((int) (this.f27945y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                AndroidUtilities.cancelRunOnUIThread(l7Var);
                d00Var.X1 = true;
                d00Var.Y();
            } else if (Math.abs(motionEvent.getRawY() - this.f27946z0) >= f7) {
                this.A0 = true;
                this.f27946z0 = motionEvent.getRawY();
                ((c2.a) d00Var.O0).e();
                if (this.f27942v0) {
                    rxVar.i();
                    this.f27942v0 = false;
                }
            }
        }
        if (d00Var.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(l7Var, 1500L);
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = VelocityTracker.obtain();
            }
            this.C0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                jy jyVar = d00Var.O0;
                int round = Math.round(motionEvent.getRawY() - this.f27946z0);
                c2.a aVar = (c2.a) jyVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f3994c;
                if (aVar.d()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i10 = chatActivityEnterView.f23768y2;
                    } else {
                        i10 = chatActivityEnterView.f23761x2;
                    }
                    int max = Math.max(Math.min(round + aVar.f3993b, 0), -(chatActivityEnterView.f23655f4 - i10));
                    if (chatActivityEnterView.G5 == null) {
                        float f10 = max;
                        chatActivityEnterView.U0.setTranslationY(f10);
                        chatActivityEnterView.setTranslationY(f10);
                    }
                    chatActivityEnterView.f23648e4 = max / (-(chatActivityEnterView.f23655f4 - i10));
                    chatActivityEnterView.f23690m1.invalidate();
                }
            } else {
                this.C0.computeCurrentVelocity(1000);
                float yVelocity = this.C0.getYVelocity();
                this.C0.recycle();
                this.C0 = null;
                if (motionEvent.getAction() == 1) {
                    c2.a aVar2 = (c2.a) d00Var.O0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) aVar2.f3994c;
                    if (aVar2.d()) {
                        chatActivityEnterView2.f23661g4 = false;
                        if ((aVar2.f3992a && yVelocity >= AndroidUtilities.dp(200.0f)) || ((!aVar2.f3992a && yVelocity <= AndroidUtilities.dp(-200.0f)) || (((z10 = aVar2.f3992a) && chatActivityEnterView2.f23648e4 <= 0.6f) || (!z10 && chatActivityEnterView2.f23648e4 >= 0.4f)))) {
                            chatActivityEnterView2.p1(!aVar2.f3992a, true, true, true);
                        } else {
                            chatActivityEnterView2.p1(z10, true, true, true);
                        }
                    }
                } else {
                    c2.a aVar3 = (c2.a) d00Var.O0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) aVar3.f3994c;
                    if (chatActivityEnterView3.Z3) {
                        chatActivityEnterView3.f23661g4 = false;
                        chatActivityEnterView3.p1(aVar3.f3992a, true, false, true);
                    }
                }
                this.f27944x0 = true;
                this.B0 = false;
                this.A0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f27942v0 && this.f27943w0 - motionEvent.getX() < 0.0f) {
                if (!rxVar.M) {
                    rxVar.f53775e0 = true;
                    rxVar.setScrollState(1);
                    rxVar.R = 0.0f;
                    rxVar.T = 0.0f;
                    VelocityTracker velocityTracker = rxVar.W;
                    if (velocityTracker == null) {
                        rxVar.W = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    rxVar.W.addMovement(obtain);
                    obtain.recycle();
                    this.f27942v0 = true;
                    getTranslationX();
                }
            } else if (this.f27942v0 && this.f27943w0 - motionEvent.getX() > 0.0f && rxVar.f53775e0) {
                rxVar.i();
                this.f27942v0 = false;
            }
        }
        if (this.f27942v0) {
            motionEvent.getX();
        }
        this.f27943w0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f27944x0 = true;
            this.B0 = false;
            this.A0 = false;
            if (this.f27942v0) {
                rxVar.i();
                this.f27942v0 = false;
            }
        }
        if (!this.f27942v0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
