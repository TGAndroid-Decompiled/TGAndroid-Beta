package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class f5 {
    public final View f23769a;
    public final Runnable f23770b;
    public int f23771c;
    public int d;
    public boolean e;
    public final long f23772f;
    public final TimeInterpolator f23773g;
    public boolean h;
    public long f23774i;
    public int f23775j;

    public f5(View view) {
        this.f23772f = 200L;
        this.f23773g = qr.f27380f;
        this.f23769a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f23772f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f23775j = this.f23771c;
                this.f23774i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f23771c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.p.a(((float) (elapsedRealtime - this.f23774i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f23774i >= 0) {
                TimeInterpolator timeInterpolator = this.f23773g;
                if (timeInterpolator == null) {
                    this.f23771c = i0.a.d(a2, this.f23775j, this.d);
                } else {
                    this.f23771c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f23775j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f23769a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f23770b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f23771c;
    }

    public f5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f23772f = 200L;
        qr qrVar = qr.f27380f;
        this.f23769a = view;
        this.f23772f = j3;
        this.f23773g = timeInterpolator;
        this.e = true;
    }

    public f5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f23772f = 200L;
        qr qrVar = qr.f27380f;
        this.f23769a = view;
        this.f23772f = j3;
        this.f23773g = timeInterpolator;
        this.e = true;
    }

    public f5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f23772f = 200L;
        qr qrVar = qr.f27380f;
        this.f23770b = runnable;
        this.f23772f = j3;
        this.f23773g = timeInterpolator;
        this.e = true;
    }
}
