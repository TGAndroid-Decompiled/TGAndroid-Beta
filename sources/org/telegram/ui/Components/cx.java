package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
public class cx extends ul0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final vy D0;
    public final int f25190u0;
    public boolean f25191v0;
    public float f25192w0;
    public boolean f25193x0;
    public float f25194y0;
    public float f25195z0;

    public cx(vy vyVar, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var, vyVar.f31885i2);
        this.D0 = vyVar;
        this.f25193x0 = true;
        this.f25190u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f30987s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f25194y0 = motionEvent.getRawX();
            this.f25195z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0) {
            vy vyVar = this.D0;
            if (vyVar.O0 != null && Math.abs(motionEvent.getRawY() - this.f25195z0) >= this.f25190u0) {
                this.A0 = true;
                this.f25195z0 = motionEvent.getRawY();
                ((c5.e) vyVar.O0).e();
                if (this.f25191v0) {
                    vyVar.h.i();
                    this.f25191v0 = false;
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
        vy vyVar = this.D0;
        ew ewVar = vyVar.f31876f2;
        iw iwVar = vyVar.h;
        if (this.f30987s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f25193x0) {
            this.f25193x0 = false;
            this.f25192w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            vyVar.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f25194y0 = motionEvent.getRawX();
            this.f25195z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && vyVar.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f25194y0);
            float f7 = this.f25190u0;
            if (abs >= f7 && canScrollHorizontally((int) (this.f25194y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                org.telegram.messenger.i0.r(ewVar);
                vyVar.X1 = true;
                vyVar.Z();
            } else if (Math.abs(motionEvent.getRawY() - this.f25195z0) >= f7) {
                this.A0 = true;
                this.f25195z0 = motionEvent.getRawY();
                ((c5.e) vyVar.O0).e();
                if (this.f25191v0) {
                    iwVar.i();
                    this.f25191v0 = false;
                }
            }
        }
        if (vyVar.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            org.telegram.messenger.i0.h3(ewVar, 1500L);
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = VelocityTracker.obtain();
            }
            this.C0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                bx bxVar = vyVar.O0;
                int round = Math.round(motionEvent.getRawY() - this.f25195z0);
                c5.e eVar = (c5.e) bxVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) eVar.f3777c;
                if (eVar.d()) {
                    Point point = org.telegram.messenger.i0.f16026q;
                    if (point.x > point.y) {
                        i10 = chatActivityEnterView.f23818y2;
                    } else {
                        i10 = chatActivityEnterView.f23812x2;
                    }
                    int max = Math.max(Math.min(round + eVar.f3775a, 0), -(chatActivityEnterView.D3 - i10));
                    if (chatActivityEnterView.f23723h5 == null) {
                        float f10 = max;
                        chatActivityEnterView.U0.setTranslationY(f10);
                        chatActivityEnterView.setTranslationY(f10);
                    }
                    chatActivityEnterView.C3 = max / (-(chatActivityEnterView.D3 - i10));
                    chatActivityEnterView.f23746m1.invalidate();
                }
            } else {
                this.C0.computeCurrentVelocity(1000);
                float yVelocity = this.C0.getYVelocity();
                this.C0.recycle();
                this.C0 = null;
                if (motionEvent.getAction() == 1) {
                    c5.e eVar2 = (c5.e) vyVar.O0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) eVar2.f3777c;
                    if (eVar2.d()) {
                        chatActivityEnterView2.E3 = false;
                        if ((eVar2.f3776b && yVelocity >= org.telegram.messenger.i0.L(200.0f)) || ((!eVar2.f3776b && yVelocity <= org.telegram.messenger.i0.L(-200.0f)) || (((z10 = eVar2.f3776b) && chatActivityEnterView2.C3 <= 0.6f) || (!z10 && chatActivityEnterView2.C3 >= 0.4f)))) {
                            chatActivityEnterView2.l1(!eVar2.f3776b, true, true, true);
                        } else {
                            chatActivityEnterView2.l1(z10, true, true, true);
                        }
                    }
                } else {
                    c5.e eVar3 = (c5.e) vyVar.O0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) eVar3.f3777c;
                    if (chatActivityEnterView3.f23813x3) {
                        chatActivityEnterView3.E3 = false;
                        chatActivityEnterView3.l1(eVar3.f3776b, true, false, true);
                    }
                }
                this.f25193x0 = true;
                this.B0 = false;
                this.A0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f25191v0 && this.f25192w0 - motionEvent.getX() < 0.0f) {
                if (!iwVar.M) {
                    iwVar.f54601e0 = true;
                    iwVar.setScrollState(1);
                    iwVar.R = 0.0f;
                    iwVar.T = 0.0f;
                    VelocityTracker velocityTracker = iwVar.W;
                    if (velocityTracker == null) {
                        iwVar.W = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    iwVar.W.addMovement(obtain);
                    obtain.recycle();
                    this.f25191v0 = true;
                    getTranslationX();
                }
            } else if (this.f25191v0 && this.f25192w0 - motionEvent.getX() > 0.0f && iwVar.f54601e0) {
                iwVar.i();
                this.f25191v0 = false;
            }
        }
        if (this.f25191v0) {
            motionEvent.getX();
        }
        this.f25192w0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f25193x0 = true;
            this.B0 = false;
            this.A0 = false;
            if (this.f25191v0) {
                iwVar.i();
                this.f25191v0 = false;
            }
        }
        if (!this.f25191v0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
