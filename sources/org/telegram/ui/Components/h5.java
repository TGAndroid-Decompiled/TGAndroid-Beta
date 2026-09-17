package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class h5 {
    public final View f26577a;
    public final Runnable f26578b;
    public int f26579c;
    public int d;
    public boolean f26580e;
    public final long f26581f;
    public final TimeInterpolator f26582g;
    public boolean h;
    public long f26583i;
    public int f26584j;

    public h5(View view) {
        this.f26581f = 200L;
        this.f26582g = pr.f29467f;
        this.f26577a = view;
        this.f26580e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f26581f;
        if (!z10 && j3 > 0 && !this.f26580e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f26584j = this.f26579c;
                this.f26583i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f26579c = i10;
            this.h = false;
            this.f26580e = false;
        }
        if (this.h) {
            float a2 = w7.p.a(((float) (elapsedRealtime - this.f26583i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f26583i >= 0) {
                TimeInterpolator timeInterpolator = this.f26582g;
                if (timeInterpolator == null) {
                    this.f26579c = i0.a.d(a2, this.f26584j, this.d);
                } else {
                    this.f26579c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f26584j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f26577a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f26578b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f26579c;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f26581f = 200L;
        pr prVar = pr.f29467f;
        this.f26577a = view;
        this.f26581f = j3;
        this.f26582g = timeInterpolator;
        this.f26580e = true;
    }

    public h5(View view, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f26581f = 200L;
        pr prVar = pr.f29467f;
        this.f26577a = view;
        this.f26581f = j3;
        this.f26582g = timeInterpolator;
        this.f26580e = true;
    }

    public h5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f26581f = 200L;
        pr prVar = pr.f29467f;
        this.f26578b = runnable;
        this.f26581f = j3;
        this.f26582g = timeInterpolator;
        this.f26580e = true;
    }
}
