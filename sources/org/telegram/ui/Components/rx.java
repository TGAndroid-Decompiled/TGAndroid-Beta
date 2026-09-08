package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class rx extends im0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final kz D0;
    public final int f30135u0;
    public boolean f30136v0;
    public float f30137w0;
    public boolean f30138x0;
    public float f30139y0;
    public float f30140z0;

    public rx(kz kzVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, kzVar.f27980i2);
        this.D0 = kzVar;
        this.f30138x0 = true;
        this.f30135u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27215s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f30139y0 = motionEvent.getRawX();
            this.f30140z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0) {
            kz kzVar = this.D0;
            if (kzVar.O0 != null && Math.abs(motionEvent.getRawY() - this.f30140z0) >= this.f30135u0) {
                this.A0 = true;
                this.f30140z0 = motionEvent.getRawY();
                ((c2.a) kzVar.O0).e();
                if (this.f30136v0) {
                    kzVar.h.i();
                    this.f30136v0 = false;
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
        kz kzVar = this.D0;
        org.telegram.ui.Cells.l7 l7Var = kzVar.f27971f2;
        zw zwVar = kzVar.h;
        if (this.f27215s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f30138x0) {
            this.f30138x0 = false;
            this.f30137w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            kzVar.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f30139y0 = motionEvent.getRawX();
            this.f30140z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && kzVar.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f30139y0);
            float f7 = this.f30135u0;
            if (abs >= f7 && canScrollHorizontally((int) (this.f30139y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                AndroidUtilities.cancelRunOnUIThread(l7Var);
                kzVar.X1 = true;
                kzVar.a0();
            } else if (Math.abs(motionEvent.getRawY() - this.f30140z0) >= f7) {
                this.A0 = true;
                this.f30140z0 = motionEvent.getRawY();
                ((c2.a) kzVar.O0).e();
                if (this.f30136v0) {
                    zwVar.i();
                    this.f30136v0 = false;
                }
            }
        }
        if (kzVar.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(l7Var, 1500L);
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = VelocityTracker.obtain();
            }
            this.C0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                qx qxVar = kzVar.O0;
                int round = Math.round(motionEvent.getRawY() - this.f30140z0);
                c2.a aVar = (c2.a) qxVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f4167c;
                if (aVar.d()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i10 = chatActivityEnterView.f23823x2;
                    } else {
                        i10 = chatActivityEnterView.f23817w2;
                    }
                    int max = Math.max(Math.min(round + aVar.f4166b, 0), -(chatActivityEnterView.C3 - i10));
                    if (chatActivityEnterView.f23708c5 == null) {
                        float f10 = max;
                        chatActivityEnterView.U0.setTranslationY(f10);
                        chatActivityEnterView.setTranslationY(f10);
                    }
                    chatActivityEnterView.B3 = max / (-(chatActivityEnterView.C3 - i10));
                    chatActivityEnterView.l1.invalidate();
                }
            } else {
                this.C0.computeCurrentVelocity(1000);
                float yVelocity = this.C0.getYVelocity();
                this.C0.recycle();
                this.C0 = null;
                if (motionEvent.getAction() == 1) {
                    c2.a aVar2 = (c2.a) kzVar.O0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) aVar2.f4167c;
                    if (aVar2.d()) {
                        chatActivityEnterView2.D3 = false;
                        if ((aVar2.f4165a && yVelocity >= AndroidUtilities.dp(200.0f)) || ((!aVar2.f4165a && yVelocity <= AndroidUtilities.dp(-200.0f)) || (((z10 = aVar2.f4165a) && chatActivityEnterView2.B3 <= 0.6f) || (!z10 && chatActivityEnterView2.B3 >= 0.4f)))) {
                            chatActivityEnterView2.n1(!aVar2.f4165a, true, true, true);
                        } else {
                            chatActivityEnterView2.n1(z10, true, true, true);
                        }
                    }
                } else {
                    c2.a aVar3 = (c2.a) kzVar.O0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) aVar3.f4167c;
                    if (chatActivityEnterView3.f23818w3) {
                        chatActivityEnterView3.D3 = false;
                        chatActivityEnterView3.n1(aVar3.f4165a, true, false, true);
                    }
                }
                this.f30138x0 = true;
                this.B0 = false;
                this.A0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f30136v0 && this.f30137w0 - motionEvent.getX() < 0.0f) {
                if (!zwVar.M) {
                    zwVar.f50769e0 = true;
                    zwVar.setScrollState(1);
                    zwVar.R = 0.0f;
                    zwVar.T = 0.0f;
                    VelocityTracker velocityTracker = zwVar.W;
                    if (velocityTracker == null) {
                        zwVar.W = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    zwVar.W.addMovement(obtain);
                    obtain.recycle();
                    this.f30136v0 = true;
                    getTranslationX();
                }
            } else if (this.f30136v0 && this.f30137w0 - motionEvent.getX() > 0.0f && zwVar.f50769e0) {
                zwVar.i();
                this.f30136v0 = false;
            }
        }
        if (this.f30136v0) {
            motionEvent.getX();
        }
        this.f30137w0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f30138x0 = true;
            this.B0 = false;
            this.A0 = false;
            if (this.f30136v0) {
                zwVar.i();
                this.f30136v0 = false;
            }
        }
        if (!this.f30136v0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
