package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class hy extends on0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final a00 D0;
    public final int f27150u0;
    public boolean f27151v0;
    public float f27152w0;
    public boolean f27153x0;
    public float f27154y0;
    public float f27155z0;

    public hy(a00 a00Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, a00Var.f24422i2);
        this.D0 = a00Var;
        this.f27153x0 = true;
        this.f27150u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f29542s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f27154y0 = motionEvent.getRawX();
            this.f27155z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0) {
            a00 a00Var = this.D0;
            if (a00Var.O0 != null && Math.abs(motionEvent.getRawY() - this.f27155z0) >= this.f27150u0) {
                this.A0 = true;
                this.f27155z0 = motionEvent.getRawY();
                ((c2.a) a00Var.O0).e();
                if (this.f27151v0) {
                    a00Var.h.i();
                    this.f27151v0 = false;
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
        a00 a00Var = this.D0;
        org.telegram.ui.Cells.t6 t6Var = a00Var.f24413f2;
        ox oxVar = a00Var.h;
        if (this.f29542s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f27153x0) {
            this.f27153x0 = false;
            this.f27152w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            a00Var.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f27154y0 = motionEvent.getRawX();
            this.f27155z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && a00Var.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f27154y0);
            float f7 = this.f27150u0;
            if (abs >= f7 && canScrollHorizontally((int) (this.f27154y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                AndroidUtilities.cancelRunOnUIThread(t6Var);
                a00Var.X1 = true;
                a00Var.Y();
            } else if (Math.abs(motionEvent.getRawY() - this.f27155z0) >= f7) {
                this.A0 = true;
                this.f27155z0 = motionEvent.getRawY();
                ((c2.a) a00Var.O0).e();
                if (this.f27151v0) {
                    oxVar.i();
                    this.f27151v0 = false;
                }
            }
        }
        if (a00Var.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(t6Var, 1500L);
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = VelocityTracker.obtain();
            }
            this.C0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                gy gyVar = a00Var.O0;
                int round = Math.round(motionEvent.getRawY() - this.f27155z0);
                c2.a aVar = (c2.a) gyVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f3995c;
                if (aVar.d()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i10 = chatActivityEnterView.f23992y2;
                    } else {
                        i10 = chatActivityEnterView.f23986x2;
                    }
                    int max = Math.max(Math.min(round + aVar.f3994b, 0), -(chatActivityEnterView.D3 - i10));
                    if (chatActivityEnterView.f23876d5 == null) {
                        float f10 = max;
                        chatActivityEnterView.U0.setTranslationY(f10);
                        chatActivityEnterView.setTranslationY(f10);
                    }
                    chatActivityEnterView.C3 = max / (-(chatActivityEnterView.D3 - i10));
                    chatActivityEnterView.f23924m1.invalidate();
                }
            } else {
                this.C0.computeCurrentVelocity(1000);
                float yVelocity = this.C0.getYVelocity();
                this.C0.recycle();
                this.C0 = null;
                if (motionEvent.getAction() == 1) {
                    c2.a aVar2 = (c2.a) a00Var.O0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) aVar2.f3995c;
                    if (aVar2.d()) {
                        chatActivityEnterView2.E3 = false;
                        if ((aVar2.f3993a && yVelocity >= AndroidUtilities.dp(200.0f)) || ((!aVar2.f3993a && yVelocity <= AndroidUtilities.dp(-200.0f)) || (((z10 = aVar2.f3993a) && chatActivityEnterView2.C3 <= 0.6f) || (!z10 && chatActivityEnterView2.C3 >= 0.4f)))) {
                            chatActivityEnterView2.l1(!aVar2.f3993a, true, true, true);
                        } else {
                            chatActivityEnterView2.l1(z10, true, true, true);
                        }
                    }
                } else {
                    c2.a aVar3 = (c2.a) a00Var.O0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) aVar3.f3995c;
                    if (chatActivityEnterView3.f23987x3) {
                        chatActivityEnterView3.E3 = false;
                        chatActivityEnterView3.l1(aVar3.f3993a, true, false, true);
                    }
                }
                this.f27153x0 = true;
                this.B0 = false;
                this.A0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f27151v0 && this.f27152w0 - motionEvent.getX() < 0.0f) {
                if (!oxVar.M) {
                    oxVar.f53541e0 = true;
                    oxVar.setScrollState(1);
                    oxVar.R = 0.0f;
                    oxVar.T = 0.0f;
                    VelocityTracker velocityTracker = oxVar.W;
                    if (velocityTracker == null) {
                        oxVar.W = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    oxVar.W.addMovement(obtain);
                    obtain.recycle();
                    this.f27151v0 = true;
                    getTranslationX();
                }
            } else if (this.f27151v0 && this.f27152w0 - motionEvent.getX() > 0.0f && oxVar.f53541e0) {
                oxVar.i();
                this.f27151v0 = false;
            }
        }
        if (this.f27151v0) {
            motionEvent.getX();
        }
        this.f27152w0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f27153x0 = true;
            this.B0 = false;
            this.A0 = false;
            if (this.f27151v0) {
                oxVar.i();
                this.f27151v0 = false;
            }
        }
        if (!this.f27151v0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
