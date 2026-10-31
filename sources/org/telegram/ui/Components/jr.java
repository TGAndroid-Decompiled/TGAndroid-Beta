package org.telegram.ui.Components;

import android.graphics.Typeface;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
public final class jr extends GestureDetector.SimpleOnGestureListener {
    public final int f27475a;
    public final int f27476b;
    public final ViewGroup f27477c;

    public jr(ViewGroup viewGroup, int i10, int i11) {
        this.f27475a = i11;
        this.f27477c = viewGroup;
        this.f27476b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f27475a) {
            case 0:
                lr lrVar = (lr) this.f27477c;
                hr hrVar = lrVar.f28173r;
                if (lrVar.f28172n) {
                    lrVar.removeCallbacks(hrVar);
                }
                lrVar.f28172n = true;
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
        int i10 = this.f27475a;
        ViewGroup viewGroup = this.f27477c;
        switch (i10) {
            case 1:
                yf0 yf0Var = (yf0) viewGroup;
                if (!yf0Var.f32721f && !yf0Var.h && f7 >= 600.0f) {
                    yf0Var.e = false;
                    yf0Var.h = false;
                    yf0Var.a(0.0f, f7 / 6000.0f);
                }
                return false;
            case 2:
                xh.h3 h3Var = (xh.h3) viewGroup;
                if (h3Var.d || !h3Var.M) {
                    return false;
                }
                if (h3Var.J && !h3Var.L) {
                    return false;
                }
                if (h3Var.N && !h3Var.b(false)) {
                    return false;
                }
                float x10 = motionEvent.getX();
                float y3 = motionEvent.getY();
                float x11 = motionEvent2.getX();
                float y10 = motionEvent2.getY();
                Typeface typeface = org.telegram.messenger.i0.f15999a;
                float f11 = x11 - x10;
                float f12 = y10 - y3;
                float sqrt = (float) Math.sqrt((f12 * f12) + (f11 * f11));
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f10 >= org.telegram.messenger.i0.L(650.0f) && ((sqrt > org.telegram.messenger.i0.L(200.0f) || eventTime > 250.0f) && ((v0Var = h3Var.f53795y) == null || v0Var.getScrollY() == 0))) {
                    h3Var.f53794x = true;
                    float f13 = h3Var.f53791r;
                    int i11 = h3Var.H;
                    if (f13 < i11 && !h3Var.J) {
                        h3Var.e(0.0f);
                    } else if (h3Var.J && h3Var.L && (h3Var.Q == (-h3Var.f53789f) + h3Var.e || (f13 <= (-i11) && f10 < org.telegram.messenger.i0.L(1200.0f)))) {
                        h3Var.e((-h3Var.f53789f) + h3Var.e);
                    } else {
                        xh.g3 g3Var = h3Var.F;
                        if (g3Var != null) {
                            g3Var.a(false);
                        }
                    }
                } else if (f10 > -700.0f) {
                    return false;
                } else {
                    float f14 = h3Var.f53791r;
                    float f15 = (-h3Var.f53789f) + h3Var.e;
                    if (f14 <= f15) {
                        return false;
                    }
                    h3Var.f53794x = true;
                    h3Var.e(f15);
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
