package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class f5 {
    public final View f23813a;
    public final Runnable f23814b;
    public int f23815c;
    public int d;
    public boolean e;
    public final long f23816f;
    public final TimeInterpolator f23817g;
    public boolean h;
    public long f23818i;
    public int f23819j;

    public f5(View view) {
        this.f23816f = 200L;
        this.f23817g = qr.f27423f;
        this.f23813a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f23816f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f23819j = this.f23815c;
                this.f23818i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f23815c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.p.a(((float) (elapsedRealtime - this.f23818i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f23818i >= 0) {
                TimeInterpolator timeInterpolator = this.f23817g;
                if (timeInterpolator == null) {
                    this.f23815c = i0.a.d(a2, this.f23819j, this.d);
                } else {
                    this.f23815c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f23819j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f23813a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f23814b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f23815c;
    }

    public f5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f23816f = 200L;
        qr qrVar = qr.f27423f;
        this.f23813a = view;
        this.f23816f = j3;
        this.f23817g = timeInterpolator;
        this.e = true;
    }

    public f5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f23816f = 200L;
        qr qrVar = qr.f27423f;
        this.f23813a = view;
        this.f23816f = j3;
        this.f23817g = timeInterpolator;
        this.e = true;
    }

    public f5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f23816f = 200L;
        qr qrVar = qr.f27423f;
        this.f23814b = runnable;
        this.f23816f = j3;
        this.f23817g = timeInterpolator;
        this.e = true;
    }
}
