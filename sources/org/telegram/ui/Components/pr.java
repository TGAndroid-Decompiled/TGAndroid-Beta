package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class pr extends GestureDetector.SimpleOnGestureListener {
    public final int f27987a;
    public final int f27988b;
    public final ViewGroup f27989c;

    public pr(ViewGroup viewGroup, int i10, int i11) {
        this.f27987a = i11;
        this.f27989c = viewGroup;
        this.f27988b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f27987a) {
            case 0:
                rr rrVar = (rr) this.f27989c;
                nr nrVar = rrVar.f28573r;
                if (rrVar.f28572n) {
                    rrVar.removeCallbacks(nrVar);
                }
                rrVar.f28572n = true;
                rrVar.postDelayed(nrVar, 200L);
                rrVar.h.run();
                return true;
            case 1:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        org.telegram.ui.web.y0 y0Var;
        switch (this.f27987a) {
            case 1:
                bh0 bh0Var = (bh0) this.f27989c;
                if (!bh0Var.f23685f && !bh0Var.h && f10 >= 600.0f) {
                    bh0Var.e = false;
                    bh0Var.h = false;
                    bh0Var.a(0.0f, f10 / 6000.0f);
                }
                return false;
            case 2:
                rh.m3 m3Var = (rh.m3) this.f27989c;
                if (m3Var.d || !m3Var.J) {
                    return false;
                }
                if (m3Var.G && !m3Var.I) {
                    return false;
                }
                if (m3Var.K && !m3Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f11 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((y0Var = m3Var.f43687x) == null || y0Var.getScrollY() == 0))) {
                    m3Var.f43686w = true;
                    float f12 = m3Var.f43684r;
                    int i10 = m3Var.E;
                    if (f12 < i10 && !m3Var.G) {
                        m3Var.e(0.0f);
                    } else if (m3Var.G && m3Var.I && (m3Var.N == (-m3Var.f43682f) + m3Var.e || (f12 <= (-i10) && f11 < AndroidUtilities.dp(1200.0f)))) {
                        m3Var.e((-m3Var.f43682f) + m3Var.e);
                    } else {
                        rh.l3 l3Var = m3Var.C;
                        if (l3Var != null) {
                            l3Var.i(false);
                        }
                    }
                } else if (f11 > -700.0f) {
                    return false;
                } else {
                    float f13 = m3Var.f43684r;
                    float f14 = (-m3Var.f43682f) + m3Var.e;
                    if (f13 <= f14) {
                        return false;
                    }
                    m3Var.f43686w = true;
                    m3Var.e(f14);
                }
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pr.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
