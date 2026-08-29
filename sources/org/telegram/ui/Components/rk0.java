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
public final class rk0 implements Runnable {
    public final int f32333a;
    public final Object f32334b;

    public rk0(Object obj, int i10) {
        this.f32333a = i10;
        this.f32334b = obj;
    }

    @Override
    public final void run() {
        long j10 = 17;
        switch (this.f32333a) {
            case 0:
                sk0 sk0Var = (sk0) this.f32334b;
                rk0 rk0Var = sk0Var.f32672e0;
                if (sk0Var.f32680n) {
                    AndroidUtilities.cancelRunOnUIThread(rk0Var);
                    AndroidUtilities.runOnUIThread(rk0Var, 4000L);
                    return;
                }
                sk0Var.Q = false;
                sk0Var.invalidate();
                return;
            case 1:
                ll0 ll0Var = (ll0) this.f32334b;
                RecyclerView recyclerView = ll0Var.f30361a;
                if (recyclerView != null) {
                    if (ll0Var.f30366g) {
                        recyclerView.scrollBy(0, -ll0Var.f30367i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else if (ll0Var.h) {
                        recyclerView.scrollBy(0, ll0Var.f30367i);
                        AndroidUtilities.runOnUIThread(this);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = (ScrollSlidingTextTabStrip) this.f32334b;
                if (scrollSlidingTextTabStrip.D) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime <= 17) {
                        j10 = elapsedRealtime;
                    }
                    float f9 = scrollSlidingTextTabStrip.O + (((float) j10) / ((float) scrollSlidingTextTabStrip.U));
                    scrollSlidingTextTabStrip.O = f9;
                    scrollSlidingTextTabStrip.setAnimationIdicatorProgress(scrollSlidingTextTabStrip.J.getInterpolation(f9));
                    if (scrollSlidingTextTabStrip.O > 1.0f) {
                        scrollSlidingTextTabStrip.O = 1.0f;
                    }
                    if (scrollSlidingTextTabStrip.O < 1.0f) {
                        AndroidUtilities.runOnUIThread(scrollSlidingTextTabStrip.W);
                        return;
                    }
                    scrollSlidingTextTabStrip.D = false;
                    scrollSlidingTextTabStrip.setEnabled(true);
                    jm0 jm0Var = scrollSlidingTextTabStrip.f26525b;
                    if (jm0Var != null) {
                        jm0Var.u0(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ShutterButton shutterButton = (ShutterButton) this.f32334b;
                vu0 vu0Var = shutterButton.f26547e;
                if (vu0Var != null && !((ml) vu0Var).a()) {
                    shutterButton.v = false;
                    return;
                }
                return;
            case 4:
                qw0 qw0Var = (qw0) this.f32334b;
                View view = qw0Var.f32126s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        qw0Var.f32126s.setVisibility(0);
                        qw0Var.f32126s.setAlpha(0.0f);
                    }
                    qw0Var.f32126s.animate().setListener(null).cancel();
                    qw0Var.f32126s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                qw0Var.f32121c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 5:
                y71 y71Var = (y71) this.f32334b;
                if (y71Var.F) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (elapsedRealtime2 <= 17) {
                        j10 = elapsedRealtime2;
                    }
                    float f10 = y71Var.f34943b0 + (((float) j10) / 200.0f);
                    y71Var.f34943b0 = f10;
                    y71Var.setAnimationIdicatorProgress(y71Var.T.getInterpolation(f10));
                    if (y71Var.f34943b0 > 1.0f) {
                        y71Var.f34943b0 = 1.0f;
                    }
                    if (y71Var.f34943b0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(y71Var.f34948e0);
                        return;
                    }
                    y71Var.F = false;
                    y71Var.setEnabled(true);
                    x71 x71Var = y71Var.f34963y;
                    if (x71Var != null) {
                        ((n) x71Var).j(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                org.telegram.ui.j30 j30Var = (org.telegram.ui.j30) this.f32334b;
                if (j30Var.f33796b && j30Var.M0.f41955v0 == null) {
                    j30Var.f33799c0 = false;
                    org.telegram.ui.Components.voip.l0.a(j30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(j30Var.f33800d0, 3000L);
                return;
            case 7:
                p2.s sVar = (p2.s) this.f32334b;
                p2.b bVar = sVar.d;
                bVar.k(0);
                p2.g gVar = p2.z.f45505i;
                bVar.j(24, gVar);
                sVar.c(gVar);
                return;
            case 8:
                ((r5.h) this.f32334b).g(false);
                return;
            case 9:
                s5.p pVar = (s5.p) this.f32334b;
                synchronized (s5.p.f47609i) {
                    try {
                        if (pVar.d()) {
                            pVar.f(15);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                u0.d dVar = (u0.d) this.f32334b;
                m.s1 s1Var = dVar.f48942c;
                u0.a aVar = dVar.f48940a;
                if (dVar.A) {
                    if (dVar.f48949x) {
                        dVar.f48949x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f48936e = currentAnimationTimeMillis;
                        aVar.f48938g = -1L;
                        aVar.f48937f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f48938g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f48938g + aVar.f48939i) || !dVar.e()) {
                        dVar.A = false;
                        return;
                    }
                    if (dVar.f48950y) {
                        dVar.f48950y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        s1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f48937f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a2 = aVar.a(currentAnimationTimeMillis2);
                        aVar.f48937f = currentAnimationTimeMillis2;
                        m.s1 s1Var2 = dVar.C;
                        s1Var2.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - aVar.f48937f)) * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                        WeakHashMap weakHashMap = r0.j0.f46829a;
                        s1Var.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 11:
                if (((TaskCompletionSource) this.f32334b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            default:
                vf.e eVar = (vf.e) this.f32334b;
                eVar.f49565f.animate().setDuration(120L).alpha(0.0f);
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
