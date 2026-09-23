package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class cg0 extends m20 {
    public float f23023a;
    public float f23024b;
    public final int f23025c;
    public final eg0 d;

    public cg0(eg0 eg0Var, int i10) {
        this.d = eg0Var;
        this.f23025c = i10;
    }

    @Override
    public final boolean a() {
        eg0 eg0Var = this.d;
        PhotoViewer photoViewer = eg0Var.V;
        if (photoViewer != null) {
            if ((photoViewer.F2 != null || eg0Var.f23679r != null) && !eg0Var.f23667c0 && !eg0Var.Y && !eg0Var.f23681w && !eg0Var.f23680s.isInProgress() && eg0Var.f23671f0) {
                long l4 = eg0Var.l();
                long m10 = eg0Var.m();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cg0.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        eg0 eg0Var = this.d;
        if (eg0Var.E) {
            for (int i10 = 1; i10 < eg0Var.e.getChildCount(); i10++) {
                View childAt = eg0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    eg0Var.f23683y = childAt;
                    return true;
                }
            }
        }
        this.f23023a = eg0Var.K;
        this.f23024b = eg0Var.L;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        eg0 eg0Var = this.d;
        if (eg0Var.f23681w && !eg0Var.f23682x) {
            o1.k kVar = eg0Var.M;
            kVar.f15316a = f7;
            float f12 = eg0Var.K;
            kVar.f15317b = f12;
            kVar.f15318c = true;
            o1.l lVar = kVar.f15326u;
            int i10 = eg0Var.H;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f15332i = dp;
            eg0Var.M.f();
            o1.k kVar2 = eg0Var.N;
            kVar2.f15316a = f7;
            kVar2.f15317b = eg0Var.L;
            kVar2.f15318c = true;
            kVar2.f15326u.f15332i = w7.p.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - eg0Var.I) - AndroidUtilities.dp(16.0f));
            eg0Var.N.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        eg0 eg0Var = this.d;
        if (!eg0Var.f23681w && eg0Var.F == null && !eg0Var.f23682x) {
            float abs = Math.abs(f7);
            float f11 = this.f23025c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                eg0Var.f23681w = true;
                eg0Var.M.c();
                eg0Var.N.c();
                eg0Var.f23671f0 = false;
                eg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(eg0Var.f23673h0);
            }
        }
        if (eg0Var.f23681w) {
            float f12 = eg0Var.K;
            float rawX = (motionEvent2.getRawX() + this.f23023a) - motionEvent.getRawX();
            eg0Var.L = (motionEvent2.getRawY() + this.f23024b) - motionEvent.getRawY();
            int i10 = eg0Var.H;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = eg0Var.f23668d0;
                if (z10) {
                    if (z10) {
                        eg0Var.M.a(new ci.sa(this, rawX, 2));
                        o1.k kVar = eg0Var.M;
                        kVar.f15317b = f12;
                        kVar.f15318c = true;
                        kVar.f15326u.f15332i = rawX;
                        kVar.f();
                    }
                    eg0Var.f23668d0 = false;
                    return true;
                }
                o1.k kVar2 = eg0Var.M;
                if (kVar2.f15319f) {
                    kVar2.f15326u.f15332i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = eg0Var.f23666c;
                    eg0Var.K = rawX;
                    layoutParams.x = (int) rawX;
                    eg0Var.n().f7340a.edit().putFloat("x", rawX).apply();
                }
                eg0Var.f23666c.y = (int) eg0Var.L;
                eg0Var.n().f7340a.edit().putFloat("y", eg0Var.L).apply();
                AndroidUtilities.updateViewLayout(eg0Var.f23664b, eg0Var.d, eg0Var.f23666c);
                return true;
            }
            if (!eg0Var.f23668d0) {
                o1.k kVar3 = eg0Var.M;
                kVar3.f15317b = f12;
                kVar3.f15318c = true;
                o1.l lVar = kVar3.f15326u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - eg0Var.H;
                }
                lVar.f15332i = dp;
                eg0Var.M.f();
            }
            eg0Var.f23668d0 = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        eg0 eg0Var = this.d;
        ValueAnimator valueAnimator = eg0Var.F;
        zf0 zf0Var = eg0Var.f23675j0;
        if (valueAnimator == null) {
            if (eg0Var.f23674i0) {
                AndroidUtilities.cancelRunOnUIThread(zf0Var);
                eg0Var.f23674i0 = false;
            }
            boolean z10 = !eg0Var.E;
            eg0Var.E = z10;
            eg0Var.y(z10);
            if (eg0Var.E && !eg0Var.f23674i0) {
                AndroidUtilities.runOnUIThread(zf0Var, 2500L);
                eg0Var.f23674i0 = true;
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
