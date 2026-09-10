package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class wx extends sm0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final rz D0;
    public final int f28855u0;
    public boolean f28856v0;
    public float f28857w0;
    public boolean f28858x0;
    public float f28859y0;
    public float f28860z0;

    public wx(rz rzVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, rzVar.f26825i2);
        this.D0 = rzVar;
        this.f28858x0 = true;
        this.f28855u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f27123s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f28859y0 = motionEvent.getRawX();
            this.f28860z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0) {
            rz rzVar = this.D0;
            if (rzVar.O0 != null && Math.abs(motionEvent.getRawY() - this.f28860z0) >= this.f28855u0) {
                this.A0 = true;
                this.f28860z0 = motionEvent.getRawY();
                ((c2.a) rzVar.O0).e();
                if (this.f28856v0) {
                    rzVar.h.i();
                    this.f28856v0 = false;
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
        org.telegram.ui.Cells.l9 l9Var = rzVar.f26816f2;
        ex exVar = rzVar.h;
        if (this.f27123s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f28858x0) {
            this.f28858x0 = false;
            this.f28857w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            rzVar.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f28859y0 = motionEvent.getRawX();
            this.f28860z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && rzVar.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f28859y0);
            float f7 = this.f28855u0;
            if (abs >= f7 && canScrollHorizontally((int) (this.f28859y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                AndroidUtilities.cancelRunOnUIThread(l9Var);
                rzVar.X1 = true;
                rzVar.a0();
            } else if (Math.abs(motionEvent.getRawY() - this.f28860z0) >= f7) {
                this.A0 = true;
                this.f28860z0 = motionEvent.getRawY();
                ((c2.a) rzVar.O0).e();
                if (this.f28856v0) {
                    exVar.i();
                    this.f28856v0 = false;
                }
            }
        }
        if (rzVar.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(l9Var, 1500L);
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = VelocityTracker.obtain();
            }
            this.C0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                vx vxVar = rzVar.O0;
                int round = Math.round(motionEvent.getRawY() - this.f28860z0);
                c2.a aVar = (c2.a) vxVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f4072c;
                if (aVar.d()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i10 = chatActivityEnterView.f20950x2;
                    } else {
                        i10 = chatActivityEnterView.f20944w2;
                    }
                    int max = Math.max(Math.min(round + aVar.f4071b, 0), -(chatActivityEnterView.C3 - i10));
                    if (chatActivityEnterView.f20836c5 == null) {
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
                    c2.a aVar2 = (c2.a) rzVar.O0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) aVar2.f4072c;
                    if (aVar2.d()) {
                        chatActivityEnterView2.D3 = false;
                        if ((aVar2.f4070a && yVelocity >= AndroidUtilities.dp(200.0f)) || ((!aVar2.f4070a && yVelocity <= AndroidUtilities.dp(-200.0f)) || (((z10 = aVar2.f4070a) && chatActivityEnterView2.B3 <= 0.6f) || (!z10 && chatActivityEnterView2.B3 >= 0.4f)))) {
                            chatActivityEnterView2.n1(!aVar2.f4070a, true, true, true);
                        } else {
                            chatActivityEnterView2.n1(z10, true, true, true);
                        }
                    }
                } else {
                    c2.a aVar3 = (c2.a) rzVar.O0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) aVar3.f4072c;
                    if (chatActivityEnterView3.f20945w3) {
                        chatActivityEnterView3.D3 = false;
                        chatActivityEnterView3.n1(aVar3.f4070a, true, false, true);
                    }
                }
                this.f28858x0 = true;
                this.B0 = false;
                this.A0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f28856v0 && this.f28857w0 - motionEvent.getX() < 0.0f) {
                if (!exVar.M) {
                    exVar.f47248e0 = true;
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
                    this.f28856v0 = true;
                    getTranslationX();
                }
            } else if (this.f28856v0 && this.f28857w0 - motionEvent.getX() > 0.0f && exVar.f47248e0) {
                exVar.i();
                this.f28856v0 = false;
            }
        }
        if (this.f28856v0) {
            motionEvent.getX();
        }
        this.f28857w0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f28858x0 = true;
            this.B0 = false;
            this.A0 = false;
            if (this.f28856v0) {
                exVar.i();
                this.f28856v0 = false;
            }
        }
        if (!this.f28856v0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
