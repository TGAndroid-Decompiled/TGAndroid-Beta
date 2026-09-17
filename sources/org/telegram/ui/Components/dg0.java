package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class dg0 extends l20 {
    public float f23348a;
    public float f23349b;
    public final int f23350c;
    public final fg0 d;

    public dg0(fg0 fg0Var, int i10) {
        this.d = fg0Var;
        this.f23350c = i10;
    }

    @Override
    public final boolean a() {
        fg0 fg0Var = this.d;
        PhotoViewer photoViewer = fg0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || fg0Var.f23929r != null) && !fg0Var.f23917c0 && !fg0Var.Y && !fg0Var.f23931w && !fg0Var.f23930s.isInProgress() && fg0Var.f23921f0) {
                long l4 = fg0Var.l();
                long m10 = fg0Var.m();
                if (l4 != -9223372036854775807L && m10 >= 15000) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dg0.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        fg0 fg0Var = this.d;
        if (fg0Var.E) {
            for (int i10 = 1; i10 < fg0Var.e.getChildCount(); i10++) {
                View childAt = fg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    fg0Var.f23933y = childAt;
                    return true;
                }
            }
        }
        this.f23348a = fg0Var.K;
        this.f23349b = fg0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        fg0 fg0Var = this.d;
        if (fg0Var.f23931w && !fg0Var.f23932x) {
            o1.k kVar = fg0Var.M;
            kVar.f15351a = f7;
            float f12 = fg0Var.K;
            kVar.f15352b = f12;
            kVar.f15353c = true;
            o1.l lVar = kVar.f15361u;
            int i10 = fg0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f15367i = dp;
            fg0Var.M.f();
            o1.k kVar2 = fg0Var.N;
            kVar2.f15351a = f7;
            kVar2.f15352b = fg0Var.L;
            kVar2.f15353c = true;
            kVar2.f15361u.f15367i = w7.p.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - fg0Var.I) - AndroidUtilities.dp(16.0f));
            fg0Var.N.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        fg0 fg0Var = this.d;
        if (!fg0Var.f23931w && fg0Var.F == null && !fg0Var.f23932x) {
            float abs = Math.abs(f7);
            float f11 = this.f23350c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                fg0Var.f23931w = true;
                fg0Var.M.c();
                fg0Var.N.c();
                fg0Var.f23921f0 = false;
                fg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(fg0Var.f23923h0);
            }
        }
        if (fg0Var.f23931w) {
            float f12 = fg0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f23348a) - motionEvent.getRawX();
            fg0Var.L = (motionEvent2.getRawY() + this.f23349b) - motionEvent.getRawY();
            int i10 = fg0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = fg0Var.f23918d0;
                if (z10) {
                    if (z10) {
                        fg0Var.M.a(new ci.va(this, rawX, 2));
                        o1.k kVar = fg0Var.M;
                        kVar.f15352b = f12;
                        kVar.f15353c = true;
                        kVar.f15361u.f15367i = rawX;
                        kVar.f();
                    }
                    fg0Var.f23918d0 = false;
                    return true;
                }
                o1.k kVar2 = fg0Var.M;
                if (kVar2.f15354f) {
                    kVar2.f15361u.f15367i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = fg0Var.f23916c;
                    fg0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    fg0Var.n().f7357a.edit().putFloat("x", rawX).apply();
                }
                fg0Var.f23916c.y = (int) fg0Var.L;
                fg0Var.n().f7357a.edit().putFloat("y", fg0Var.L).apply();
                AndroidUtilities.updateViewLayout(fg0Var.f23914b, fg0Var.d, fg0Var.f23916c);
                return true;
            }
            if (!fg0Var.f23918d0) {
                o1.k kVar3 = fg0Var.M;
                kVar3.f15352b = f12;
                kVar3.f15353c = true;
                o1.l lVar = kVar3.f15361u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - fg0Var.H;
                }
                lVar.f15367i = dp;
                fg0Var.M.f();
            }
            fg0Var.f23918d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        fg0 fg0Var = this.d;
        ValueAnimator valueAnimator = fg0Var.F;
        ag0 ag0Var = fg0Var.f23925j0;
        if (valueAnimator == null) {
            if (fg0Var.f23924i0) {
                AndroidUtilities.cancelRunOnUIThread(ag0Var);
                fg0Var.f23924i0 = false;
            }
            boolean z10 = !fg0Var.E;
            fg0Var.E = z10;
            fg0Var.y(z10);
            if (fg0Var.E && !fg0Var.f23924i0) {
                AndroidUtilities.runOnUIThread(ag0Var, 2500L);
                fg0Var.f23924i0 = true;
            }
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (!a()) {
            onSingleTapConfirmed(motionEvent);
            return true;
        }
        return super.onSingleTapUp(motionEvent);
    }
}
