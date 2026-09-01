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
public final class ul0 implements Runnable {
    public final int f31689a;
    public final Object f31690b;

    public ul0(Object obj, int i10) {
        this.f31689a = i10;
        this.f31690b = obj;
    }

    @Override
    public final void run() {
        long j10 = 17;
        switch (this.f31689a) {
            case 0:
                wl0 wl0Var = (wl0) this.f31690b;
                RecyclerView recyclerView = wl0Var.f32787a;
                if (recyclerView != null) {
                    if (wl0Var.f32792g) {
                        recyclerView.scrollBy(0, -wl0Var.f32793i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (wl0Var.h) {
                        recyclerView.scrollBy(0, wl0Var.f32793i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f31690b;
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
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f25011a0);
                        return;
                    }
                    scrollSlidingTextTabStrip.E = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    um0 um0Var = scrollSlidingTextTabStrip.f25012b;
                    if (um0Var != null) {
                        um0Var.w0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ShutterButton shutterButton = (ShutterButton) this.f31690b;
                ev0 ev0Var = shutterButton.f25035e;
                if (ev0Var != null && !((ol) ev0Var).a()) {
                    shutterButton.v = false;
                    return;
                }
                return;
            case 3:
                ax0 ax0Var = (ax0) this.f31690b;
                View view = ax0Var.f25368s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        ax0Var.f25368s.setVisibility(0);
                        ax0Var.f25368s.setAlpha(0.0f);
                    }
                    ax0Var.f25368s.animate().setListener(null).cancel();
                    ax0Var.f25368s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                ax0Var.f25363c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 4:
                l81 l81Var = (l81) this.f31690b;
                if (l81Var.G) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 <= 17) {
                        j10 = elapsedRealtime2;
                    }
                    float f11 = l81Var.f28652c0 + (((float) j10) / 200.0f);
                    l81Var.f28652c0 = f11;
                    l81Var.setAnimationIdicatorProgress(l81Var.U.getInterpolation(f11));
                    if (l81Var.f28652c0 > 1.0f) {
                        l81Var.f28652c0 = 1.0f;
                    }
                    if (l81Var.f28652c0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(l81Var.f28657f0);
                        return;
                    }
                    l81Var.G = false;
                    l81Var.setEnabled(true);
                    k81 k81Var = l81Var.f28671y;
                    if (k81Var != null) {
                        ((oh.h4) k81Var).f0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                org.telegram.ui.w30 w30Var = (org.telegram.ui.w30) this.f31690b;
                if (w30Var.f32140b && w30Var.N0.f36103w0 == null) {
                    w30Var.f32144d0 = false;
                    org.telegram.ui.Components.voip.l0.a(w30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(w30Var.f32146e0, 3000L);
                return;
            case 6:
                p2.t tVar = (p2.t) this.f31690b;
                p2.b bVar = tVar.d;
                bVar.k(0);
                p2.h hVar = p2.a0.f44095i;
                bVar.j(24, hVar);
                tVar.c(hVar);
                return;
            case 7:
                eg.j jVar = ((qh.f9) this.f31690b).G0;
                if (jVar instanceof eg.z3) {
                    ((eg.z3) jVar).getEditText();
                    return;
                }
                return;
            case 8:
                ((t5.h) this.f31690b).g(false);
                return;
            case 9:
                u0.d dVar = (u0.d) this.f31690b;
                m.r1 r1Var = dVar.f48211c;
                u0.a aVar = dVar.f48209a;
                if (dVar.B) {
                    if (dVar.f48218x) {
                        dVar.f48218x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f48205e = currentAnimationTimeMillis;
                        aVar.f48207g = -1L;
                        aVar.f48206f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f48207g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f48207g + aVar.f48208i) || !dVar.e()) {
                        dVar.B = false;
                        return;
                    }
                    if (dVar.f48219y) {
                        dVar.f48219y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        r1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f48206f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a2 = aVar.a(currentAnimationTimeMillis2);
                        aVar.f48206f = currentAnimationTimeMillis2;
                        m.r1 r1Var2 = dVar.D;
                        r1Var2.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - aVar.f48206f)) * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                        WeakHashMap weakHashMap = r0.j0.f46438a;
                        r1Var.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 10:
                u5.p pVar = (u5.p) this.f31690b;
                synchronized (u5.p.f48378i) {
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
                if (((TaskCompletionSource) this.f31690b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            default:
                yf.e eVar = (yf.e) this.f31690b;
                eVar.f50915f.animate().setDuration(120L).alpha(0.0f);
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
