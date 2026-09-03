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
public final class sl0 implements Runnable {
    public final int f28760a;
    public final Object f28761b;

    public sl0(Object obj, int i10) {
        this.f28760a = i10;
        this.f28761b = obj;
    }

    @Override
    public final void run() {
        long j10 = 17;
        switch (this.f28760a) {
            case 0:
                ul0 ul0Var = (ul0) this.f28761b;
                RecyclerView recyclerView = ul0Var.f29234a;
                if (recyclerView != null) {
                    if (ul0Var.f29238g) {
                        recyclerView.scrollBy(0, -ul0Var.f29239i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (ul0Var.h) {
                        recyclerView.scrollBy(0, ul0Var.f29239i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 1:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f28761b;
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
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.f23127a0);
                        return;
                    }
                    scrollSlidingTextTabStrip.E = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    sm0 sm0Var = scrollSlidingTextTabStrip.f23128b;
                    if (sm0Var != null) {
                        sm0Var.u0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ShutterButton shutterButton = (ShutterButton) this.f28761b;
                dv0 dv0Var = shutterButton.e;
                if (dv0Var != null && !((ml) dv0Var).a()) {
                    shutterButton.v = false;
                    return;
                }
                return;
            case 3:
                zw0 zw0Var = (zw0) this.f28761b;
                View view = zw0Var.f31488s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        zw0Var.f31488s.setVisibility(0);
                        zw0Var.f31488s.setAlpha(0.0f);
                    }
                    zw0Var.f31488s.animate().setListener(null).cancel();
                    zw0Var.f31488s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                zw0Var.f31484c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 4:
                k81 k81Var = (k81) this.f28761b;
                if (k81Var.G) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 <= 17) {
                        j10 = elapsedRealtime2;
                    }
                    float f11 = k81Var.f26213c0 + (((float) j10) / 200.0f);
                    k81Var.f26213c0 = f11;
                    k81Var.setAnimationIdicatorProgress(k81Var.U.getInterpolation(f11));
                    if (k81Var.f26213c0 > 1.0f) {
                        k81Var.f26213c0 = 1.0f;
                    }
                    if (k81Var.f26213c0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(k81Var.f26217f0);
                        return;
                    }
                    k81Var.G = false;
                    k81Var.setEnabled(true);
                    j81 j81Var = k81Var.f26231y;
                    if (j81Var != null) {
                        ((tp0) j81Var).n(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                org.telegram.ui.x30 x30Var = (org.telegram.ui.x30) this.f28761b;
                if (x30Var.f29685b && x30Var.N0.f33708w0 == null) {
                    x30Var.f29689d0 = false;
                    org.telegram.ui.Components.voip.k0.a(x30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(x30Var.f29690e0, 3000L);
                return;
            case 6:
                p2.u uVar = (p2.u) this.f28761b;
                p2.b bVar = uVar.d;
                bVar.k(0);
                p2.h hVar = p2.b0.f40990i;
                bVar.j(24, hVar);
                uVar.c(hVar);
                return;
            case 7:
                dg.j jVar = ((ph.h9) this.f28761b).G0;
                if (jVar instanceof dg.b4) {
                    ((dg.b4) jVar).getEditText();
                    return;
                }
                return;
            case 8:
                ((t5.h) this.f28761b).g(false);
                return;
            case 9:
                u0.d dVar = (u0.d) this.f28761b;
                m.s1 s1Var = dVar.f45033c;
                u0.a aVar = dVar.f45031a;
                if (dVar.B) {
                    if (dVar.f45039x) {
                        dVar.f45039x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.e = currentAnimationTimeMillis;
                        aVar.f45029g = -1L;
                        aVar.f45028f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f45029g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f45029g + aVar.f45030i) || !dVar.e()) {
                        dVar.B = false;
                        return;
                    }
                    if (dVar.f45040y) {
                        dVar.f45040y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        s1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f45028f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a2 = aVar.a(currentAnimationTimeMillis2);
                        aVar.f45028f = currentAnimationTimeMillis2;
                        m.s1 s1Var2 = dVar.D;
                        s1Var2.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - aVar.f45028f)) * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                        WeakHashMap weakHashMap = r0.j0.f43142a;
                        s1Var.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 10:
                u5.p pVar = (u5.p) this.f28761b;
                synchronized (u5.p.f45187i) {
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
                if (((TaskCompletionSource) this.f28761b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            default:
                xf.e eVar = (xf.e) this.f28761b;
                eVar.f47038f.animate().setDuration(120L).alpha(0.0f);
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
