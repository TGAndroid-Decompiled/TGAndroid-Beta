package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f26576a;
    public final Runnable f26577b;
    public int f26578c;
    public int d;
    public boolean f26579e;
    public final long f26580f;
    public final TimeInterpolator f26581g;
    public boolean h;
    public long f26582i;
    public int f26583j;

    public h5(View view) {
        this.f26580f = 200L;
        this.f26581g = pr.f29466f;
        this.f26576a = view;
        this.f26579e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f26580f;
        if (!z10 && j3 > 0 && !this.f26579e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f26583j = this.f26578c;
                this.f26582i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f26578c = i10;
            this.h = false;
            this.f26579e = false;
        }
        if (this.h) {
            float a2 = w7.p.a(((float) (elapsedRealtime - this.f26582i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f26582i >= 0) {
                TimeInterpolator timeInterpolator = this.f26581g;
                if (timeInterpolator == null) {
                    this.f26578c = i0.a.d(a2, this.f26583j, this.d);
                } else {
                    this.f26578c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f26583j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f26576a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f26577b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f26578c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f26580f = 200L;
        pr prVar = pr.f29466f;
        this.f26576a = view;
        this.f26580f = j3;
        this.f26581g = timeInterpolator;
        this.f26579e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f26580f = 200L;
        pr prVar = pr.f29466f;
        this.f26576a = view;
        this.f26580f = j3;
        this.f26581g = timeInterpolator;
        this.f26579e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f26580f = 200L;
        pr prVar = pr.f29466f;
        this.f26577b = runnable;
        this.f26580f = j3;
        this.f26581g = timeInterpolator;
        this.f26579e = true;
    }
}
