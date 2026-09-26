package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
public class sx extends um0 {
    public boolean A0;
    public boolean B0;
    public VelocityTracker C0;
    public final lz D0;
    public final int f28330u0;
    public boolean f28331v0;
    public float f28332w0;
    public boolean f28333x0;
    public float f28334y0;
    public float f28335z0;

    public sx(lz lzVar, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, lzVar.f26256i2);
        this.D0 = lzVar;
        this.f28333x0 = true;
        this.f28330u0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f28835s != null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f28334y0 = motionEvent.getRawX();
            this.f28335z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0) {
            lz lzVar = this.D0;
            if (lzVar.O0 != null && Math.abs(motionEvent.getRawY() - this.f28335z0) >= this.f28330u0) {
                this.A0 = true;
                this.f28335z0 = motionEvent.getRawY();
                ((c2.a) lzVar.O0).e();
                if (this.f28331v0) {
                    lzVar.h.i();
                    this.f28331v0 = false;
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
        lz lzVar = this.D0;
        org.telegram.ui.Cells.t6 t6Var = lzVar.f26247f2;
        ax axVar = lzVar.h;
        if (this.f28835s != null) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f28333x0) {
            this.f28333x0 = false;
            this.f28332w0 = motionEvent.getX();
        }
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            lzVar.W1 = motionEvent.getRawX();
        }
        if (motionEvent.getAction() == 0) {
            this.B0 = false;
            this.A0 = false;
            this.f28334y0 = motionEvent.getRawX();
            this.f28335z0 = motionEvent.getRawY();
        } else if (!this.A0 && !this.B0 && lzVar.O0 != null) {
            float abs = Math.abs(motionEvent.getRawX() - this.f28334y0);
            float f7 = this.f28330u0;
            if (abs >= f7 && canScrollHorizontally((int) (this.f28334y0 - motionEvent.getRawX()))) {
                this.B0 = true;
                AndroidUtilities.cancelRunOnUIThread(t6Var);
                lzVar.X1 = true;
                lzVar.Y();
            } else if (Math.abs(motionEvent.getRawY() - this.f28335z0) >= f7) {
                this.A0 = true;
                this.f28335z0 = motionEvent.getRawY();
                ((c2.a) lzVar.O0).e();
                if (this.f28331v0) {
                    axVar.i();
                    this.f28331v0 = false;
                }
            }
        }
        if (lzVar.X1 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            AndroidUtilities.runOnUIThread(t6Var, 1500L);
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = VelocityTracker.obtain();
            }
            this.C0.addMovement(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                rx rxVar = lzVar.O0;
                int round = Math.round(motionEvent.getRawY() - this.f28335z0);
                c2.a aVar = (c2.a) rxVar;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) aVar.f3650c;
                if (aVar.d()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i10 = chatActivityEnterView.f22093y2;
                    } else {
                        i10 = chatActivityEnterView.f22087x2;
                    }
                    int max = Math.max(Math.min(round + aVar.f3649b, 0), -(chatActivityEnterView.D3 - i10));
                    if (chatActivityEnterView.f21978d5 == null) {
                        float f10 = max;
                        chatActivityEnterView.U0.setTranslationY(f10);
                        chatActivityEnterView.setTranslationY(f10);
                    }
                    chatActivityEnterView.C3 = max / (-(chatActivityEnterView.D3 - i10));
                    chatActivityEnterView.f22025m1.invalidate();
                }
            } else {
                this.C0.computeCurrentVelocity(1000);
                float yVelocity = this.C0.getYVelocity();
                this.C0.recycle();
                this.C0 = null;
                if (motionEvent.getAction() == 1) {
                    c2.a aVar2 = (c2.a) lzVar.O0;
                    ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) aVar2.f3650c;
                    if (aVar2.d()) {
                        chatActivityEnterView2.E3 = false;
                        if ((aVar2.f3648a && yVelocity >= AndroidUtilities.dp(200.0f)) || ((!aVar2.f3648a && yVelocity <= AndroidUtilities.dp(-200.0f)) || (((z10 = aVar2.f3648a) && chatActivityEnterView2.C3 <= 0.6f) || (!z10 && chatActivityEnterView2.C3 >= 0.4f)))) {
                            chatActivityEnterView2.n1(!aVar2.f3648a, true, true, true);
                        } else {
                            chatActivityEnterView2.n1(z10, true, true, true);
                        }
                    }
                } else {
                    c2.a aVar3 = (c2.a) lzVar.O0;
                    ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) aVar3.f3650c;
                    if (chatActivityEnterView3.f22088x3) {
                        chatActivityEnterView3.E3 = false;
                        chatActivityEnterView3.n1(aVar3.f3648a, true, false, true);
                    }
                }
                this.f28333x0 = true;
                this.B0 = false;
                this.A0 = false;
            }
            cancelLongPress();
            return true;
        }
        float translationX = getTranslationX();
        if (getScrollX() == 0 && translationX == 0.0f) {
            if (!this.f28331v0 && this.f28332w0 - motionEvent.getX() < 0.0f) {
                if (!axVar.M) {
                    axVar.f48403e0 = true;
                    axVar.setScrollState(1);
                    axVar.R = 0.0f;
                    axVar.T = 0.0f;
                    VelocityTracker velocityTracker = axVar.W;
                    if (velocityTracker == null) {
                        axVar.W = VelocityTracker.obtain();
                    } else {
                        velocityTracker.clear();
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
                    axVar.W.addMovement(obtain);
                    obtain.recycle();
                    this.f28331v0 = true;
                    getTranslationX();
                }
            } else if (this.f28331v0 && this.f28332w0 - motionEvent.getX() > 0.0f && axVar.f48403e0) {
                axVar.i();
                this.f28331v0 = false;
            }
        }
        if (this.f28331v0) {
            motionEvent.getX();
        }
        this.f28332w0 = motionEvent.getX();
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            this.f28333x0 = true;
            this.B0 = false;
            this.A0 = false;
            if (this.f28331v0) {
                axVar.i();
                this.f28331v0 = false;
            }
        }
        if (!this.f28331v0 && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
