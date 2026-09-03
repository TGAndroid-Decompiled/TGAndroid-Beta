package org.telegram.ui.Components;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class tl0 implements Runnable {
    public final int f31371a;
    public final Object f31372b;

    public tl0(Object obj, int i10) {
        this.f31371a = i10;
        this.f31372b = obj;
    }

    @Override
    public final void run() {
        long j10 = 17;
        switch (this.f31371a) {
            case 0:
                vl0 vl0Var = (vl0) this.f31372b;
                RecyclerView recyclerView = vl0Var.f31905a;
                if (recyclerView != null) {
                    if (vl0Var.f31910g) {
                        recyclerView.scrollBy(0, -vl0Var.f31911i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (vl0Var.h) {
                        recyclerView.scrollBy(0, vl0Var.f31911i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f31372b;
                if (scrollSlidingTextTabStrip.E) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime <= 17) {
                        j10 = elapsedRealtime;
                    }
                    float f10 = scrollSlidingTextTabStrip.P + (((float) j10) / ((float) scrollSlidingTextTabStrip.V));
                    scrollSlidingTextTabStrip.P = f10;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.K.getInterpolation(f10));
                    if (scrollSlidingTextTabStrip.P > 1.0f) {
                        scrollSlidingTextTabStrip.P = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.P < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f25013a0);
                        return;
                    }
                    scrollSlidingTextTabStrip.E = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    tm0 tm0Var = scrollSlidingTextTabStrip.f25014b;
                    if (tm0Var != null) {
                        tm0Var.w0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ShutterButton shutterButton = (ShutterButton) this.f31372b;
                dv0 dv0Var = shutterButton.f25037e;
                if (dv0Var != null && !((ol) dv0Var).a()) {
                    shutterButton.v = false;
                    return;
                }
                return;
            case 3:
                zw0 zw0Var = (zw0) this.f31372b;
                View view = zw0Var.f34037s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        zw0Var.f34037s.setVisibility(0);
                        zw0Var.f34037s.setAlpha(0.0f);
                    }
                    zw0Var.f34037s.animate().setListener(null).cancel();
                    zw0Var.f34037s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                zw0Var.f34032c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 4:
                k81 k81Var = (k81) this.f31372b;
                if (k81Var.G) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 <= 17) {
                        j10 = elapsedRealtime2;
                    }
                    float f11 = k81Var.f28327c0 + (((float) j10) / 200.0f);
                    k81Var.f28327c0 = f11;
                    k81Var.setAnimationIdicatorProgress(k81Var.U.getInterpolation(f11));
                    if (k81Var.f28327c0 > 1.0f) {
                        k81Var.f28327c0 = 1.0f;
                    }
                    if (k81Var.f28327c0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(k81Var.f28332f0);
                        return;
                    }
                    k81Var.G = false;
                    k81Var.setEnabled(true);
                    j81 j81Var = k81Var.f28346y;
                    if (j81Var != null) {
                        ((oh.h4) j81Var).f0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                org.telegram.ui.w30 w30Var = (org.telegram.ui.w30) this.f31372b;
                if (w30Var.f32145b && w30Var.N0.f36082w0 == null) {
                    w30Var.f32149d0 = false;
                    org.telegram.ui.Components.voip.l0.a(w30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(w30Var.f32151e0, 3000L);
                return;
            case 6:
                p2.t tVar = (p2.t) this.f31372b;
                p2.b bVar = tVar.d;
                bVar.k(0);
                p2.h hVar = p2.a0.f44126i;
                bVar.j(24, hVar);
                tVar.c(hVar);
                return;
            case 7:
                eg.j jVar = ((qh.e9) this.f31372b).G0;
                if (jVar instanceof eg.z3) {
                    ((eg.z3) jVar).getEditText();
                    return;
                }
                return;
            case 8:
                ((t5.h) this.f31372b).g(false);
                return;
            case 9:
                u0.d dVar = (u0.d) this.f31372b;
                m.r1 r1Var = dVar.f48247c;
                u0.a aVar = dVar.f48245a;
                if (dVar.B) {
                    if (dVar.f48254x) {
                        dVar.f48254x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f48241e = currentAnimationTimeMillis;
                        aVar.f48243g = -1L;
                        aVar.f48242f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f48243g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f48243g + aVar.f48244i) || !dVar.e()) {
                        dVar.B = false;
                        return;
                    }
                    if (dVar.f48255y) {
                        dVar.f48255y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        r1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f48242f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a2 = aVar.a(currentAnimationTimeMillis2);
                        aVar.f48242f = currentAnimationTimeMillis2;
                        m.r1 r1Var2 = dVar.D;
                        r1Var2.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - aVar.f48242f)) * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                        WeakHashMap weakHashMap = r0.j0.f46469a;
                        r1Var.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 10:
                u5.p pVar = (u5.p) this.f31372b;
                synchronized (u5.p.f48414i) {
                    try {
                        if (pVar.d()) {
                            pVar.f(15);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 11:
                if (((TaskCompletionSource) this.f31372b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            default:
                yf.e eVar = (yf.e) this.f31372b;
                eVar.f50951f.animate().setDuration(120L).alpha(0.0f);
                eVar.h.animate().setListener(null).start();
                if (eVar.h.getVisibility() != 0) {
                    eVar.h.setVisibility(0);
                    eVar.h.setAlpha(0.0f);
                }
                eVar.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
        }
    }
}
