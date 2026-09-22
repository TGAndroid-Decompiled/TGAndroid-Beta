package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class f5 {
    public final View f23812a;
    public final Runnable f23813b;
    public int f23814c;
    public int d;
    public boolean e;
    public final long f23815f;
    public final TimeInterpolator f23816g;
    public boolean h;
    public long f23817i;
    public int f23818j;

    public f5(View view) {
        this.f23815f = 200L;
        this.f23816g = qr.f27420f;
        this.f23812a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f23815f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f23818j = this.f23814c;
                this.f23817i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f23814c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.p.a(((float) (elapsedRealtime - this.f23817i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f23817i >= 0) {
                TimeInterpolator timeInterpolator = this.f23816g;
                if (timeInterpolator == null) {
                    this.f23814c = i0.a.d(a2, this.f23818j, this.d);
                } else {
                    this.f23814c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f23818j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f23812a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f23813b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f23814c;
    }

    public f5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f23815f = 200L;
        qr qrVar = qr.f27420f;
        this.f23812a = view;
        this.f23815f = j3;
        this.f23816g = timeInterpolator;
        this.e = true;
    }

    public f5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f23815f = 200L;
        qr qrVar = qr.f27420f;
        this.f23812a = view;
        this.f23815f = j3;
        this.f23816g = timeInterpolator;
        this.e = true;
    }

    public f5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f23815f = 200L;
        qr qrVar = qr.f27420f;
        this.f23813b = runnable;
        this.f23815f = j3;
        this.f23816g = timeInterpolator;
        this.e = true;
    }
}
