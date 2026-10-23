package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class i5 {
    public final View f27204a;
    public final Runnable f27205b;
    public int f27206c;
    public int d;
    public boolean e;
    public final long f27207f;
    public final TimeInterpolator f27208g;
    public boolean h;
    public long f27209i;
    public int f27210j;

    public i5(View view) {
        this.f27207f = 200L;
        this.f27208g = bs.f25133f;
        this.f27204a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f27207f;
        if (!z10 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f27210j = this.f27206c;
                this.f27209i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f27206c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.r.a(((float) (elapsedRealtime - this.f27209i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f27209i >= 0) {
                TimeInterpolator timeInterpolator = this.f27208g;
                if (timeInterpolator == null) {
                    this.f27206c = i0.a.f(a2, this.f27210j, this.d);
                } else {
                    this.f27206c = i0.a.f(timeInterpolator.getInterpolation(a2), this.f27210j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f27204a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f27205b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f27206c;
    }

    public i5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f27207f = 200L;
        bs bsVar = bs.f25133f;
        this.f27204a = view;
        this.f27207f = j10;
        this.f27208g = timeInterpolator;
        this.e = true;
    }

    public i5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f27207f = 200L;
        bs bsVar = bs.f25133f;
        this.f27204a = view;
        this.f27207f = j10;
        this.f27208g = timeInterpolator;
        this.e = true;
    }

    public i5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f27207f = 200L;
        bs bsVar = bs.f25133f;
        this.f27205b = runnable;
        this.f27207f = j10;
        this.f27208g = timeInterpolator;
        this.e = true;
    }
}
