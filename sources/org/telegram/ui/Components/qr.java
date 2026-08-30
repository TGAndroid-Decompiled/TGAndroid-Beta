package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class qr extends GestureDetector.SimpleOnGestureListener {
    public final int f28225a;
    public final int f28226b;
    public final ViewGroup f28227c;

    public qr(ViewGroup viewGroup, int i10, int i11) {
        this.f28225a = i11;
        this.f28227c = viewGroup;
        this.f28226b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f28225a) {
            case 0:
                sr srVar = (sr) this.f28227c;
                or orVar = srVar.f28807r;
                if (srVar.f28806n) {
                    srVar.removeCallbacks(orVar);
                }
                srVar.f28806n = true;
                srVar.postDelayed(orVar, 200L);
                srVar.h.run();
                return true;
            case 1:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        org.telegram.ui.web.w0 w0Var;
        switch (this.f28225a) {
            case 1:
                ah0 ah0Var = (ah0) this.f28227c;
                if (!ah0Var.f23396f && !ah0Var.h && f10 >= 600.0f) {
                    ah0Var.e = false;
                    ah0Var.h = false;
                    ah0Var.a(0.0f, f10 / 6000.0f);
                }
                return false;
            case 2:
                rh.n3 n3Var = (rh.n3) this.f28227c;
                if (n3Var.d || !n3Var.J) {
                    return false;
                }
                if (n3Var.G && !n3Var.I) {
                    return false;
                }
                if (n3Var.K && !n3Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f11 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((w0Var = n3Var.f43635x) == null || w0Var.getScrollY() == 0))) {
                    n3Var.f43634w = true;
                    float f12 = n3Var.f43632r;
                    int i10 = n3Var.E;
                    if (f12 < i10 && !n3Var.G) {
                        n3Var.e(0.0f);
                    } else if (n3Var.G && n3Var.I && (n3Var.N == (-n3Var.f43630f) + n3Var.e || (f12 <= (-i10) && f11 < AndroidUtilities.dp(1200.0f)))) {
                        n3Var.e((-n3Var.f43630f) + n3Var.e);
                    } else {
                        rh.m3 m3Var = n3Var.C;
                        if (m3Var != null) {
                            m3Var.g(false);
                        }
                    }
                } else if (f11 > -700.0f) {
                    return false;
                } else {
                    float f13 = n3Var.f43632r;
                    float f14 = (-n3Var.f43630f) + n3Var.e;
                    if (f13 <= f14) {
                        return false;
                    }
                    n3Var.f43634w = true;
                    n3Var.e(f14);
                }
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qr.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
