package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;

public final class b5 {

    public final View f26920a;

    public final Runnable f26921b;

    public int f26922c;
    public int d;

    public boolean f26923e;

    public final long f26924f;

    public final TimeInterpolator f26925g;
    public boolean h;

    public long f26926i;

    public int f26927j;

    public b5(View view) {
        this.f26924f = 200L;
        this.f26925g = er.f28122f;
        this.f26920a = view;
        this.f26923e = true;
    }

    public final int a(int i10, boolean z10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f26924f;
        if (z10 || j10 <= 0 || this.f26923e) {
            this.d = i10;
            this.f26922c = i10;
            this.h = false;
            this.f26923e = false;
        } else if (this.d != i10) {
            this.h = true;
            this.d = i10;
            this.f26927j = this.f26922c;
            this.f26926i = jElapsedRealtime;
        }
        if (this.h) {
            float fA = h7.n.a((jElapsedRealtime - this.f26926i) / j10, 0.0f, 1.0f);
            if (jElapsedRealtime - this.f26926i >= 0) {
                TimeInterpolator timeInterpolator = this.f26925g;
                if (timeInterpolator == null) {
                    this.f26922c = i0.b.d(fA, this.f26927j, this.d);
                } else {
                    this.f26922c = i0.b.d(timeInterpolator.getInterpolation(fA), this.f26927j, this.d);
                }
            }
            if (fA >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f26920a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f26921b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f26922c;
    }

    public b5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f26924f = 200L;
        er erVar = er.f28122f;
        this.f26920a = view;
        this.f26924f = j10;
        this.f26925g = timeInterpolator;
        this.f26923e = true;
    }

    public b5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f26924f = 200L;
        er erVar = er.f28122f;
        this.f26920a = view;
        this.f26924f = j10;
        this.f26925g = timeInterpolator;
        this.f26923e = true;
    }

    public b5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f26924f = 200L;
        er erVar = er.f28122f;
        this.f26921b = runnable;
        this.f26924f = j10;
        this.f26925g = timeInterpolator;
        this.f26923e = true;
    }
}
