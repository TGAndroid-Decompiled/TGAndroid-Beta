package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f24548a;
    public final Runnable f24549b;
    public int f24550c;
    public int d;
    public boolean e;
    public final long f24551f;
    public final TimeInterpolator f24552g;
    public boolean h;
    public long f24553i;
    public int f24554j;

    public h5(View view) {
        this.f24551f = 200L;
        this.f24552g = qr.f27715f;
        this.f24548a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f24551f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f24554j = this.f24550c;
                this.f24553i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f24550c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.q.a(((float) (elapsedRealtime - this.f24553i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f24553i >= 0) {
                TimeInterpolator timeInterpolator = this.f24552g;
                if (timeInterpolator == null) {
                    this.f24550c = i0.a.d(a2, this.f24554j, this.d);
                } else {
                    this.f24550c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f24554j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f24548a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f24549b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f24550c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f24551f = 200L;
        qr qrVar = qr.f27715f;
        this.f24548a = view;
        this.f24551f = j3;
        this.f24552g = timeInterpolator;
        this.e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f24551f = 200L;
        qr qrVar = qr.f27715f;
        this.f24548a = view;
        this.f24551f = j3;
        this.f24552g = timeInterpolator;
        this.e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f24551f = 200L;
        qr qrVar = qr.f27715f;
        this.f24549b = runnable;
        this.f24551f = j3;
        this.f24552g = timeInterpolator;
        this.e = true;
    }
}
