package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class sr extends GestureDetector.SimpleOnGestureListener {
    public final int f31157a;
    public final int f31158b;
    public final ViewGroup f31159c;

    public sr(ViewGroup viewGroup, int i10, int i11) {
        this.f31157a = i11;
        this.f31159c = viewGroup;
        this.f31158b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f31157a) {
            case 0:
                ur urVar = (ur) this.f31159c;
                qr qrVar = urVar.f31720r;
                if (urVar.f31719n) {
                    urVar.removeCallbacks(qrVar);
                }
                urVar.f31719n = true;
                urVar.postDelayed(qrVar, 200L);
                urVar.h.run();
                return true;
            case 1:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        org.telegram.ui.web.x0 x0Var;
        switch (this.f31157a) {
            case 1:
                ch0 ch0Var = (ch0) this.f31159c;
                if (!ch0Var.f25967f && !ch0Var.h && f10 >= 600.0f) {
                    ch0Var.f25966e = false;
                    ch0Var.h = false;
                    ch0Var.a(0.0f, f10 / 6000.0f);
                }
                return false;
            case 2:
                sh.m3 m3Var = (sh.m3) this.f31159c;
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
                if (f11 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((x0Var = m3Var.f47536x) == null || x0Var.getScrollY() == 0))) {
                    m3Var.f47535w = true;
                    float f12 = m3Var.f47533r;
                    int i10 = m3Var.E;
                    if (f12 < i10 && !m3Var.G) {
                        m3Var.e(0.0f);
                    } else if (m3Var.G && m3Var.I && (m3Var.N == (-m3Var.f47531f) + m3Var.f47530e || (f12 <= (-i10) && f11 < AndroidUtilities.dp(1200.0f)))) {
                        m3Var.e((-m3Var.f47531f) + m3Var.f47530e);
                    } else {
                        sh.l3 l3Var = m3Var.C;
                        if (l3Var != null) {
                            l3Var.g(false);
                        }
                    }
                } else if (f11 > -700.0f) {
                    return false;
                } else {
                    float f13 = m3Var.f47533r;
                    float f14 = (-m3Var.f47531f) + m3Var.f47530e;
                    if (f13 <= f14) {
                        return false;
                    }
                    m3Var.f47535w = true;
                    m3Var.e(f14);
                }
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f10, f11);
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sr.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
