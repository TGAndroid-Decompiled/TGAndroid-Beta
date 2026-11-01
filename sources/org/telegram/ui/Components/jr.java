package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class jr extends GestureDetector.SimpleOnGestureListener {
    public final int f27554a;
    public final int f27555b;
    public final ViewGroup f27556c;

    public jr(ViewGroup viewGroup, int i10, int i11) {
        this.f27554a = i11;
        this.f27556c = viewGroup;
        this.f27555b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f27554a) {
            case 0:
                lr lrVar = (lr) this.f27556c;
                hr hrVar = lrVar.f28250r;
                if (lrVar.f28249n) {
                    lrVar.removeCallbacks(hrVar);
                }
                lrVar.f28249n = true;
                lrVar.postDelayed(hrVar, 200L);
                lrVar.h.run();
                return true;
            case 1:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        org.telegram.ui.web.v0 v0Var;
        int i10 = this.f27554a;
        ViewGroup viewGroup = this.f27556c;
        switch (i10) {
            case 1:
                yf0 yf0Var = (yf0) viewGroup;
                if (!yf0Var.f32837f && !yf0Var.h && f7 >= 600.0f) {
                    yf0Var.e = false;
                    yf0Var.h = false;
                    yf0Var.a(0.0f, f7 / 6000.0f);
                }
                return false;
            case 2:
                xh.i3 i3Var = (xh.i3) viewGroup;
                if (i3Var.d || !i3Var.M) {
                    return false;
                }
                if (i3Var.J && !i3Var.L) {
                    return false;
                }
                if (i3Var.N && !i3Var.b(false)) {
                    return false;
                }
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                float x11 = motionEvent2.getX();
                float y10 = motionEvent2.getY();
                Typeface typeface = org.telegram.messenger.i0.f16145a;
                float f11 = x11 - x10;
                float f12 = y10 - y3;
                float sqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11));
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f10 >= org.telegram.messenger.i0.L(650.0f) && ((sqrt > org.telegram.messenger.i0.L(200.0f) || eventTime > 250.0f) && ((v0Var = i3Var.f53829y) == null || v0Var.getScrollY() == 0))) {
                    i3Var.f53828x = true;
                    float f13 = i3Var.f53825r;
                    int i11 = i3Var.H;
                    if (f13 < i11 && !i3Var.J) {
                        i3Var.e(0.0f);
                    } else if (i3Var.J && i3Var.L && (i3Var.Q == (-i3Var.f53823f) + i3Var.e || (f13 <= (-i11) && f10 < org.telegram.messenger.i0.L(1200.0f)))) {
                        i3Var.e((-i3Var.f53823f) + i3Var.e);
                    } else {
                        xh.h3 h3Var = i3Var.F;
                        if (h3Var != null) {
                            h3Var.a(false);
                        }
                    }
                } else if (f10 > -700.0f) {
                    return false;
                } else {
                    float f14 = i3Var.f53825r;
                    float f15 = (-i3Var.f53823f) + i3Var.e;
                    if (f14 <= f15) {
                        return false;
                    }
                    i3Var.f53828x = true;
                    i3Var.e(f15);
                }
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f7, f10);
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jr.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
