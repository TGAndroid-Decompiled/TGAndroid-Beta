package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class g5 {
    public final View f35420a;
    public final Runnable f35421b;
    public int f35422c;
    public int d;
    public boolean f35423e;
    public final long f35424f;
    public final TimeInterpolator f35425g;
    public boolean h;
    public long f35426i;
    public int f35427j;

    public g5(View view) {
        this.f35424f = 200L;
        this.f35425g = nr.f37960f;
        this.f35420a = view;
        this.f35423e = true;
    }

    public final int a(int i7, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f35424f;
        if (!z10 && j3 > 0 && !this.f35423e) {
            if (this.d != i7) {
                this.h = true;
                this.d = i7;
                this.f35427j = this.f35422c;
                this.f35426i = elapsedRealtime;
            }
        } else {
            this.d = i7;
            this.f35422c = i7;
            this.h = false;
            this.f35423e = false;
        }
        if (this.h) {
            float a10 = c8.l9.a(((float) (elapsedRealtime - this.f35426i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f35426i >= 0) {
                TimeInterpolator timeInterpolator = this.f35425g;
                if (timeInterpolator == null) {
                    this.f35422c = i0.a.f(a10, this.f35427j, this.d);
                } else {
                    this.f35422c = i0.a.f(timeInterpolator.getInterpolation(a10), this.f35427j, this.d);
                }
            }
            if (a10 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f35420a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f35421b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f35422c;
    }

    public g5(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f35424f = 200L;
        nr nrVar = nr.f37960f;
        this.f35420a = view;
        this.f35424f = j3;
        this.f35425g = timeInterpolator;
        this.f35423e = true;
    }

    public g5(View view, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f35424f = 200L;
        nr nrVar = nr.f37960f;
        this.f35420a = view;
        this.f35424f = j3;
        this.f35425g = timeInterpolator;
        this.f35423e = true;
    }

    public g5(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f35424f = 200L;
        nr nrVar = nr.f37960f;
        this.f35421b = runnable;
        this.f35424f = j3;
        this.f35425g = timeInterpolator;
        this.f35423e = true;
    }
}
