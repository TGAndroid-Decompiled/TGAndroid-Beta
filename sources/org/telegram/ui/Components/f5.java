package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class f5 {
    public final View f23772a;
    public final Runnable f23773b;
    public int f23774c;
    public int d;
    public boolean e;
    public final long f23775f;
    public final TimeInterpolator f23776g;
    public boolean h;
    public long f23777i;
    public int f23778j;

    public f5(View view) {
        this.f23775f = 200L;
        this.f23776g = qr.f27383f;
        this.f23772a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f23775f;
        if (!z10 && j3 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f23778j = this.f23774c;
                this.f23777i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f23774c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.p.a(((float) (elapsedRealtime - this.f23777i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f23777i >= 0) {
                TimeInterpolator timeInterpolator = this.f23776g;
                if (timeInterpolator == null) {
                    this.f23774c = i0.a.d(a2, this.f23778j, this.d);
                } else {
                    this.f23774c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f23778j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f23772a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f23773b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f23774c;
    }

    public f5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f23775f = 200L;
        qr qrVar = qr.f27383f;
        this.f23772a = view;
        this.f23775f = j3;
        this.f23776g = timeInterpolator;
        this.e = true;
    }

    public f5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f23775f = 200L;
        qr qrVar = qr.f27383f;
        this.f23772a = view;
        this.f23775f = j3;
        this.f23776g = timeInterpolator;
        this.e = true;
    }

    public f5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f23775f = 200L;
        qr qrVar = qr.f27383f;
        this.f23773b = runnable;
        this.f23775f = j3;
        this.f23776g = timeInterpolator;
        this.e = true;
    }
}
