package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class z4 {
    public final View f40893a;
    public final Runnable f40894b;
    public int f40895c;
    public int d;
    public boolean f40896e;
    public final long f40897f;
    public final TimeInterpolator f40898g;
    public boolean h;
    public long f40899i;
    public int f40900j;

    public z4(View view) {
        this.f40897f = 200L;
        this.f40898g = xq.f40458f;
        this.f40893a = view;
        this.f40896e = true;
    }

    public final int a(int i7, boolean z9) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f40897f;
        if (!z9 && j3 > 0 && !this.f40896e) {
            if (this.d != i7) {
                this.h = true;
                this.d = i7;
                this.f40900j = this.f40895c;
                this.f40899i = elapsedRealtime;
            }
        } else {
            this.d = i7;
            this.f40895c = i7;
            this.h = false;
            this.f40896e = false;
        }
        if (this.h) {
            float a10 = c8.j9.a(((float) (elapsedRealtime - this.f40899i)) / ((float) j3), 0.0f, 1.0f);
            if (elapsedRealtime - this.f40899i >= 0) {
                TimeInterpolator timeInterpolator = this.f40898g;
                if (timeInterpolator == null) {
                    this.f40895c = i0.a.f(a10, this.f40900j, this.d);
                } else {
                    this.f40895c = i0.a.f(timeInterpolator.getInterpolation(a10), this.f40900j, this.d);
                }
            }
            if (a10 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f40893a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f40894b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f40895c;
    }

    public z4(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f40897f = 200L;
        xq xqVar = xq.f40458f;
        this.f40893a = view;
        this.f40897f = j3;
        this.f40898g = timeInterpolator;
        this.f40896e = true;
    }

    public z4(View view, long j3, TimeInterpolator timeInterpolator, int i7) {
        this.f40897f = 200L;
        xq xqVar = xq.f40458f;
        this.f40893a = view;
        this.f40897f = j3;
        this.f40898g = timeInterpolator;
        this.f40896e = true;
    }

    public z4(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f40897f = 200L;
        xq xqVar = xq.f40458f;
        this.f40894b = runnable;
        this.f40897f = j3;
        this.f40898g = timeInterpolator;
        this.f40896e = true;
    }
}
