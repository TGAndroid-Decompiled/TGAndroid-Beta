package org.telegram.ui.Components;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class mr extends GestureDetector.SimpleOnGestureListener {
    public final int f30755a;
    public final int f30756b;
    public final ViewGroup f30757c;

    public mr(ViewGroup viewGroup, int i10, int i11) {
        this.f30755a = i11;
        this.f30757c = viewGroup;
        this.f30756b = i10;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.f30755a) {
            case 0:
                or orVar = (or) this.f30757c;
                kr krVar = orVar.f31463r;
                if (orVar.f31462n) {
                    orVar.removeCallbacks(krVar);
                }
                orVar.f31462n = true;
                orVar.postDelayed(krVar, 200L);
                orVar.h.run();
                return true;
            case 1:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        org.telegram.ui.web.w0 w0Var;
        switch (this.f30755a) {
            case 1:
                qg0 qg0Var = (qg0) this.f30757c;
                if (!qg0Var.f31945f && !qg0Var.h && f9 >= 600.0f) {
                    qg0Var.f31944e = false;
                    qg0Var.h = false;
                    qg0Var.a(0.0f, f9 / 6000.0f);
                }
                return false;
            case 2:
                ph.m3 m3Var = (ph.m3) this.f30757c;
                if (m3Var.d || !m3Var.I) {
                    return false;
                }
                if (m3Var.F && !m3Var.H) {
                    return false;
                }
                if (m3Var.J && !m3Var.b(false)) {
                    return false;
                }
                float distance = AndroidUtilities.distance(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                float eventTime = (float) (motionEvent2.getEventTime() - motionEvent.getEventTime());
                if (f10 >= AndroidUtilities.dp(650.0f) && ((distance > AndroidUtilities.dp(200.0f) || eventTime > 250.0f) && ((w0Var = m3Var.f45911x) == null || w0Var.getScrollY() == 0))) {
                    m3Var.f45910w = true;
                    float f11 = m3Var.f45908r;
                    int i10 = m3Var.D;
                    if (f11 < i10 && !m3Var.F) {
                        m3Var.e(0.0f);
                    } else if (m3Var.F && m3Var.H && (m3Var.M == (-m3Var.f45906f) + m3Var.f45905e || (f11 <= (-i10) && f10 < AndroidUtilities.dp(1200.0f)))) {
                        m3Var.e((-m3Var.f45906f) + m3Var.f45905e);
                    } else {
                        ph.l3 l3Var = m3Var.B;
                        if (l3Var != null) {
                            l3Var.f(false);
                        }
                    }
                } else if (f10 > -700.0f) {
                    return false;
                } else {
                    float f12 = m3Var.f45908r;
                    float f13 = (-m3Var.f45906f) + m3Var.f45905e;
                    if (f12 <= f13) {
                        return false;
                    }
                    m3Var.f45910w = true;
                    m3Var.e(f13);
                }
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f9, f10);
        }
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r18, android.view.MotionEvent r19, float r20, float r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mr.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
