package org.telegram.ui.Components;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
public final class ju0 implements Runnable {
    public final int f29843a;
    public final Object f29844b;

    public ju0(Object obj, int i9) {
        this.f29843a = i9;
        this.f29844b = obj;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ju0.a():void");
    }

    private final void b() {
        z7.a aVar = (z7.a) this.f29844b;
        synchronized (aVar.f50346a) {
            try {
                if (!aVar.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(aVar.f50353j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.d();
                if (!aVar.b()) {
                    return;
                }
                aVar.f50348c = 1;
                aVar.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void run() {
        int R;
        switch (this.f29843a) {
            case 0:
                ShutterButton shutterButton = (ShutterButton) this.f29844b;
                ku0 ku0Var = shutterButton.f26536e;
                if (ku0Var != null && !((il) ku0Var).a()) {
                    shutterButton.v = false;
                    return;
                }
                return;
            case 1:
                gw0 gw0Var = (gw0) this.f29844b;
                View view = gw0Var.f28889s;
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        gw0Var.f28889s.setVisibility(0);
                        gw0Var.f28889s.setAlpha(0.0f);
                    }
                    gw0Var.f28889s.animate().setListener(null).cancel();
                    gw0Var.f28889s.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                gw0Var.f28884c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                return;
            case 2:
                m71 m71Var = (m71) this.f29844b;
                if (m71Var.F) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f10 = m71Var.f30739b0 + (((float) elapsedRealtime) / 200.0f);
                    m71Var.f30739b0 = f10;
                    m71Var.setAnimationIdicatorProgress(m71Var.T.getInterpolation(f10));
                    if (m71Var.f30739b0 > 1.0f) {
                        m71Var.f30739b0 = 1.0f;
                    }
                    if (m71Var.f30739b0 < 1.0f) {
                        AndroidUtilities.runOnUIThread(m71Var.f30744e0);
                        return;
                    }
                    m71Var.F = false;
                    m71Var.setEnabled(true);
                    l71 l71Var = m71Var.f30759y;
                    if (l71Var != null) {
                        ((n2.p) l71Var).F(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                org.telegram.ui.g30 g30Var = (org.telegram.ui.g30) this.f29844b;
                if (g30Var.f33598b && g30Var.M0.f40968v0 == null) {
                    g30Var.f33601c0 = false;
                    org.telegram.ui.Components.voip.k0.a(g30Var);
                    return;
                }
                AndroidUtilities.runOnUIThread(g30Var.f33602d0, 3000L);
                return;
            case 4:
                ((p5.h) this.f29844b).g(false);
                return;
            case 5:
                q5.p pVar = (q5.p) this.f29844b;
                synchronized (q5.p.f46038i) {
                    try {
                        if (pVar.d()) {
                            pVar.f(15);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 6:
                sf.e eVar = (sf.e) this.f29844b;
                eVar.f47539f.animate().setDuration(120L).alpha(0.0f);
                eVar.h.animate().setListener(null).start();
                if (eVar.h.getVisibility() != 0) {
                    eVar.h.setVisibility(0);
                    eVar.h.setAlpha(0.0f);
                }
                eVar.h.animate().setDuration(120L).alpha(1.0f).start();
                return;
            case 7:
                if (((TaskCompletionSource) this.f29844b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 8:
                u0.d dVar = (u0.d) this.f29844b;
                m.s1 s1Var = dVar.f47944c;
                u0.a aVar = dVar.f47942a;
                if (dVar.A) {
                    if (dVar.f47951x) {
                        dVar.f47951x = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f47938e = currentAnimationTimeMillis;
                        aVar.f47940g = -1L;
                        aVar.f47939f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.f47940g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f47940g + aVar.f47941i) || !dVar.e()) {
                        dVar.A = false;
                        return;
                    }
                    if (dVar.f47952y) {
                        dVar.f47952y = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        s1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f47939f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a2 = aVar.a(currentAnimationTimeMillis2);
                        aVar.f47939f = currentAnimationTimeMillis2;
                        dVar.C.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - aVar.f47939f)) * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.d));
                        WeakHashMap weakHashMap = r0.j0.f46915a;
                        s1Var.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 9:
                a();
                return;
            case 10:
                yf.j jVar = ((org.telegram.ui.xs0) this.f29844b).O0;
                if (jVar instanceof yf.v2) {
                    ((yf.v2) jVar).getEditText();
                    return;
                }
                return;
            case 11:
                b();
                return;
            default:
                zf.s0 s0Var = (zf.s0) this.f29844b;
                ArrayList arrayList = s0Var.f50634c3;
                if (s0Var.f50641j3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((zf.n1) j3.r0.j(1, arrayList))) >= 0) {
                        View m10 = s0Var.U2.m(R + 1);
                        if (m10 != null) {
                            s0Var.Z2 = false;
                            s0Var.w1(m10, true);
                            s0Var.v0(0, m10.getTop() - ((s0Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                    }
                    s0Var.x1();
                    return;
                }
                return;
        }
    }
}
