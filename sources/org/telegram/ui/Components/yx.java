package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class yx extends gn0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final tz D0;
    public final int f32759u0;
    public boolean f32760v0;
    public float f32761w0;
    public boolean f32762x0;
    public float f32763y0;
    public float f32764z0;

    public yx(tz tzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, tzVar.f30788i2);
        this.D0 = tzVar;
        this.f32762x0 = true;
        this.f32759u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f26645s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f32763y0 = motionEvent.getRawX();
            this.f32764z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0) {
            tz tzVar = this.D0;
            if (tzVar.O0 != null && Math.abs(motionEvent.getRawY() - this.f32764z0) >= this.f32759u0) {
                this.A0 = true;
                this.f32764z0 = motionEvent.getRawY();
                ((c5.f) tzVar.O0).e();
                if (this.f32760v0) {
                    tzVar.h.i();
                    this.f32760v0 = false;
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
        org.telegram.ui.Cells.k7 k7Var = tzVar.f30779f2;
        gx gxVar = tzVar.h;
        if (this.f26645s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f32762x0) {
            this.f32762x0 = false;
            this.f32761w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            tzVar.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f32763y0 = motionEvent.getRawX();
            this.f32764z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && tzVar.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f32763y0);
            float f7 = this.f32759u0;
            if (abs >= f7 && canScrollHorizontally((int) (this.f32763y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                AndroidUtilities.cancelRunOnUIThread(k7Var);
                tzVar.X1 = true;
                tzVar.Y();
            } else if (Math.abs(motionEvent.getRawY() - this.f32764z0) >= f7) {
                this.A0 = true;
                this.f32764z0 = motionEvent.getRawY();
                ((c5.f) tzVar.O0).e();
                if (this.f32760v0) {
                    gxVar.i();
                    this.f32760v0 = false;
                }
            }
        }
        if (tzVar.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(k7Var, 1500L);
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = VelocityTracker.obtain();
            }
            this.C0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                xx xxVar = tzVar.O0;
                int round = Math.round(motionEvent.getRawY() - this.f32764z0);
                c5.f fVar = (c5.f) xxVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) fVar.f4730c;
                if (fVar.d()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i10 = chatActivityEnterView.f24047y2;
                    } else {
                        i10 = chatActivityEnterView.f24041x2;
                    }
                    int max = Math.max(Math.min(round + fVar.f4728a, 0), -(chatActivityEnterView.D3 - i10));
                    if (chatActivityEnterView.f23931d5 == null) {
                        float f10 = max;
                        chatActivityEnterView.U0.setTranslationY(f10);
                        chatActivityEnterView.setTranslationY(f10);
                    }
                    chatActivityEnterView.C3 = max / (-(chatActivityEnterView.D3 - i10));
                    chatActivityEnterView.f23979m1.invalidate();
                }
            } else {
                this.C0.computeCurrentVelocity(1000);
                float yVelocity = this.C0.getYVelocity();
                this.C0.recycle();
                this.C0 = null;
                if (motionEvent.getAction() == 1) {
                    c5.f fVar2 = (c5.f) tzVar.O0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) fVar2.f4730c;
                    if (fVar2.d()) {
                        chatActivityEnterView2.E3 = false;
                        if ((fVar2.f4729b && yVelocity >= AndroidUtilities.dp(200.0f)) || ((!fVar2.f4729b && yVelocity <= AndroidUtilities.dp(-200.0f)) || (((z10 = fVar2.f4729b) && chatActivityEnterView2.C3 <= 0.6f) || (!z10 && chatActivityEnterView2.C3 >= 0.4f)))) {
                            chatActivityEnterView2.k1(!fVar2.f4729b, true, true, true);
                        } else {
                            chatActivityEnterView2.k1(z10, true, true, true);
                        }
                    }
                } else {
                    c5.f fVar3 = (c5.f) tzVar.O0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) fVar3.f4730c;
                    if (chatActivityEnterView3.f24042x3) {
                        chatActivityEnterView3.E3 = false;
                        chatActivityEnterView3.k1(fVar3.f4729b, true, false, true);
                    }
                }
                this.f32762x0 = true;
                this.B0 = false;
                this.A0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f32760v0 && this.f32761w0 - motionEvent.getX() < 0.0f) {
                if (!gxVar.M) {
                    gxVar.f50685e0 = true;
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
                    this.f32760v0 = true;
                    getTranslationX();
                }
            } else if (this.f32760v0 && this.f32761w0 - motionEvent.getX() > 0.0f && gxVar.f50685e0) {
                gxVar.i();
                this.f32760v0 = false;
            }
        }
        if (this.f32760v0) {
            motionEvent.getX();
        }
        this.f32761w0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f32762x0 = true;
            this.B0 = false;
            this.A0 = false;
            if (this.f32760v0) {
                gxVar.i();
                this.f32760v0 = false;
            }
        }
        if (!this.f32760v0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
