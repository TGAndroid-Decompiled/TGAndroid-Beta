package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class g5 {
    public final View f26556a;
    public final Runnable f26557b;
    public int f26558c;
    public int d;
    public boolean e;
    public final long f26559f;
    public final TimeInterpolator f26560g;
    public boolean h;
    public long f26561i;
    public int f26562j;

    public g5(View view) {
        this.f26559f = 200L;
        this.f26560g = zr.f33337f;
        this.f26556a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f26559f;
        if (!z10 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f26562j = this.f26558c;
                this.f26561i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f26558c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.r.a(((float) (elapsedRealtime - this.f26561i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f26561i >= 0) {
                TimeInterpolator timeInterpolator = this.f26560g;
                if (timeInterpolator == null) {
                    this.f26558c = i0.a.f(a2, this.f26562j, this.d);
                } else {
                    this.f26558c = i0.a.f(timeInterpolator.getInterpolation(a2), this.f26562j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f26556a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f26557b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f26558c;
    }

    public g5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f26559f = 200L;
        zr zrVar = zr.f33337f;
        this.f26556a = view;
        this.f26559f = j10;
        this.f26560g = timeInterpolator;
        this.e = true;
    }

    public g5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f26559f = 200L;
        zr zrVar = zr.f33337f;
        this.f26556a = view;
        this.f26559f = j10;
        this.f26560g = timeInterpolator;
        this.e = true;
    }

    public g5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f26559f = 200L;
        zr zrVar = zr.f33337f;
        this.f26557b = runnable;
        this.f26559f = j10;
        this.f26560g = timeInterpolator;
        this.e = true;
    }
}
