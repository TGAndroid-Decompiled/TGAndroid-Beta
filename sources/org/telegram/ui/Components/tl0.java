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
    public final int f28988a;
    public final Object f28989b;

    public tl0(Object obj, int i10) {
        this.f28988a = i10;
        this.f28989b = obj;
    }

    @Override
    public final void run() {
        long j10 = 17;
        switch (this.f28988a) {
            case 0:
                vl0 vl0Var = (vl0) this.f28989b;
                RecyclerView recyclerView = vl0Var.f29508a;
                if (recyclerView != null) {
                    if (vl0Var.f29512g) {
                        recyclerView.scrollBy(0, -vl0Var.f29513i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (vl0Var.h) {
                        recyclerView.scrollBy(0, vl0Var.f29513i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f28989b;
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
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f23154a0);
                        return;
                    }
                    scrollSlidingTextTabStrip.E = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    tm0 tm0Var = scrollSlidingTextTabStrip.f23155b;
                    if (tm0Var != null) {
                        tm0Var.v0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ShutterButton shutterButton = (ShutterButton) this.f28989b;
                dv0 dv0Var = shutterButton.e;
                if (dv0Var != null && !((nl) dv0Var).a()) {
                    shutterButton.v = false;
                    return;
                }
                return;
            case 3:
                zw0 zw0Var = (zw0) this.f28989b;
                View view = zw0Var.f31460s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        zw0Var.f31460s.setVisibility(0);
                        zw0Var.f31460s.setAlpha(0.0f);
                    }
                    zw0Var.f31460s.animate().setListener(null).cancel();
                    zw0Var.f31460s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                zw0Var.f31456c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 4:
                k81 k81Var = (k81) this.f28989b;
                if (k81Var.G) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 <= 17) {
                        j10 = elapsedRealtime2;
                    }
                    float f11 = k81Var.f26211c0 + (((float) j10) / 200.0f);
                    k81Var.f26211c0 = f11;
                    k81Var.setAnimationIdicatorProgress(k81Var.U.getInterpolation(f11));
                    if (k81Var.f26211c0 > 1.0f) {
                        k81Var.f26211c0 = 1.0f;
                    }
                    if (k81Var.f26211c0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(k81Var.f26215f0);
                        return;
                    }
                    k81Var.G = false;
                    k81Var.setEnabled(true);
                    j81 j81Var = k81Var.f26229y;
                    if (j81Var != null) {
                        ((o2.o) j81Var).q(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                org.telegram.ui.v30 v30Var = (org.telegram.ui.v30) this.f28989b;
                if (v30Var.f29713b && v30Var.N0.f33189w0 == null) {
                    v30Var.f29717d0 = false;
                    org.telegram.ui.Components.voip.k0.a(v30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(v30Var.f29718e0, 3000L);
                return;
            case 6:
                p2.u uVar = (p2.u) this.f28989b;
                p2.b bVar = uVar.d;
                bVar.k(0);
                p2.h hVar = p2.b0.f40968i;
                bVar.j(24, hVar);
                uVar.c(hVar);
                return;
            case 7:
                dg.j jVar = ((ph.h9) this.f28989b).G0;
                if (jVar instanceof dg.b4) {
                    ((dg.b4) jVar).getEditText();
                    return;
                }
                return;
            case 8:
                ((t5.h) this.f28989b).g(false);
                return;
            case 9:
                u0.d dVar = (u0.d) this.f28989b;
                m.s1 s1Var = dVar.f44971c;
                u0.a aVar = dVar.f44969a;
                if (dVar.B) {
                    if (dVar.f44977x) {
                        dVar.f44977x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.e = currentAnimationTimeMillis;
                        aVar.f44967g = -1L;
                        aVar.f44966f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f44967g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f44967g + aVar.f44968i) || !dVar.e()) {
                        dVar.B = false;
                        return;
                    }
                    if (dVar.f44978y) {
                        dVar.f44978y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        s1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f44966f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a2 = aVar.a(currentAnimationTimeMillis2);
                        aVar.f44966f = currentAnimationTimeMillis2;
                        m.s1 s1Var2 = dVar.D;
                        s1Var2.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - aVar.f44966f)) * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                        WeakHashMap weakHashMap = r0.j0.f43118a;
                        s1Var.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 10:
                u5.p pVar = (u5.p) this.f28989b;
                synchronized (u5.p.f45125i) {
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
                if (((TaskCompletionSource) this.f28989b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            default:
                xf.e eVar = (xf.e) this.f28989b;
                eVar.f46942f.animate().setDuration(120L).alpha(0.0f);
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
