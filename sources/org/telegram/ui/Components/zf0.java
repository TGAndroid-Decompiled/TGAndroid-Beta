package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;
public final class zf0 extends h20 {
    public float f35333a;
    public float f35334b;
    public final int f35335c;
    public final bg0 d;

    public zf0(bg0 bg0Var, int i10) {
        this.d = bg0Var;
        this.f35335c = i10;
    }

    @Override
    public final boolean a() {
        bg0 bg0Var = this.d;
        PhotoViewer photoViewer = bg0Var.R;
        if (photoViewer != null) {
            if ((photoViewer.B2 != null || bg0Var.f27092r != null) && !bg0Var.Y && !bg0Var.U && !bg0Var.f27094w && !bg0Var.f27093s.isInProgress() && bg0Var.f27080b0) {
                long l10 = bg0Var.l();
                long m10 = bg0Var.m();
                if (l10 != -9223372036854775807L && m10 >= 15000) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zf0.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        bg0 bg0Var = this.d;
        if (bg0Var.A) {
            for (int i10 = 1; i10 < bg0Var.f27084e.getChildCount(); i10++) {
                View childAt = bg0Var.f27084e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    bg0Var.f27096y = childAt;
                    return true;
                }
            }
        }
        this.f35333a = bg0Var.G;
        this.f35334b = bg0Var.H;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        float dp;
        float f11;
        bg0 bg0Var = this.d;
        if (bg0Var.f27094w && !bg0Var.f27095x) {
            o1.k kVar = bg0Var.I;
            kVar.f19035a = f9;
            float f12 = bg0Var.G;
            kVar.f19036b = f12;
            kVar.f19037c = true;
            o1.l lVar = kVar.f19045u;
            int i10 = bg0Var.D;
            float f13 = (f9 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f19052i = dp;
            bg0Var.I.f();
            o1.k kVar2 = bg0Var.J;
            kVar2.f19035a = f9;
            kVar2.f19036b = bg0Var.H;
            kVar2.f19037c = true;
            kVar2.f19045u.f19052i = i7.w.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - bg0Var.E) - AndroidUtilities.dp(16.0f));
            bg0Var.J.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        float dp;
        bg0 bg0Var = this.d;
        if (!bg0Var.f27094w && bg0Var.B == null && !bg0Var.f27095x) {
            float abs = Math.abs(f9);
            float f11 = this.f35335c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                bg0Var.f27094w = true;
                bg0Var.I.c();
                bg0Var.J.c();
                bg0Var.f27080b0 = false;
                bg0Var.i();
                AndroidUtilities.cancelRunOnUIThread(bg0Var.f27083d0);
            }
        }
        if (bg0Var.f27094w) {
            float f12 = bg0Var.G;
            float rawX = (motionEvent2.getRawX() + this.f35333a) - motionEvent.getRawX();
            bg0Var.H = (motionEvent2.getRawY() + this.f35334b) - motionEvent.getRawY();
            int i10 = bg0Var.D;
            if (rawX > (-i10) * 0.25f && rawX < AndroidUtilities.displaySize.x - (i10 * 0.75f)) {
                boolean z10 = bg0Var.Z;
                if (z10) {
                    if (z10) {
                        bg0Var.I.a(new nh.r9(this, rawX, 1));
                        o1.k kVar = bg0Var.I;
                        kVar.f19036b = f12;
                        kVar.f19037c = true;
                        kVar.f19045u.f19052i = rawX;
                        kVar.f();
                    }
                    bg0Var.Z = false;
                    return true;
                }
                o1.k kVar2 = bg0Var.I;
                if (kVar2.f19039f) {
                    kVar2.f19045u.f19052i = rawX;
                } else {
                    WindowManager.LayoutParams layoutParams = bg0Var.f27081c;
                    bg0Var.G = rawX;
                    layoutParams.x = (int) rawX;
                    bg0Var.n().f5191a.edit().putFloat("x", rawX).apply();
                }
                bg0Var.f27081c.y = (int) bg0Var.H;
                bg0Var.n().f5191a.edit().putFloat("y", bg0Var.H).apply();
                AndroidUtilities.updateViewLayout(bg0Var.f27079b, bg0Var.d, bg0Var.f27081c);
                return true;
            }
            if (!bg0Var.Z) {
                o1.k kVar3 = bg0Var.I;
                kVar3.f19036b = f12;
                kVar3.f19037c = true;
                o1.l lVar = kVar3.f19045u;
                int i11 = AndroidUtilities.displaySize.x;
                if ((i10 / 2.0f) + rawX >= i11 / 2.0f) {
                    dp = i11 - AndroidUtilities.dp(16.0f);
                } else {
                    dp = AndroidUtilities.dp(16.0f) - bg0Var.D;
                }
                lVar.f19052i = dp;
                bg0Var.I.f();
            }
            bg0Var.Z = true;
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        bg0 bg0Var = this.d;
        ValueAnimator valueAnimator = bg0Var.B;
        vf0 vf0Var = bg0Var.f27087f0;
        if (valueAnimator == null) {
            if (bg0Var.f27085e0) {
                AndroidUtilities.cancelRunOnUIThread(vf0Var);
                bg0Var.f27085e0 = false;
            }
            boolean z10 = !bg0Var.A;
            bg0Var.A = z10;
            bg0Var.y(z10);
            if (bg0Var.A && !bg0Var.f27085e0) {
                AndroidUtilities.runOnUIThread(vf0Var, 2500L);
                bg0Var.f27085e0 = true;
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
