package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class j5 {
    public final View f29478a;
    public final Runnable f29479b;
    public int f29480c;
    public int d;
    public boolean e;
    public final long f29481f;
    public final TimeInterpolator f29482g;
    public boolean h;
    public long f29483i;
    public int f29484j;

    public j5(View view) {
        this.f29481f = 200L;
        this.f29482g = ds.f27586f;
        this.f29478a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f29481f;
        if (!z10 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f29484j = this.f29480c;
                this.f29483i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f29480c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = a8.ee.a(((float) (elapsedRealtime - this.f29483i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f29483i >= 0) {
                TimeInterpolator timeInterpolator = this.f29482g;
                if (timeInterpolator == null) {
                    this.f29480c = i0.a.f(a2, this.f29484j, this.d);
                } else {
                    this.f29480c = i0.a.f(timeInterpolator.getInterpolation(a2), this.f29484j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f29478a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f29479b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f29480c;
    }

    public j5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f29481f = 200L;
        ds dsVar = ds.f27586f;
        this.f29478a = view;
        this.f29481f = j10;
        this.f29482g = timeInterpolator;
        this.e = true;
    }

    public j5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f29481f = 200L;
        ds dsVar = ds.f27586f;
        this.f29478a = view;
        this.f29481f = j10;
        this.f29482g = timeInterpolator;
        this.e = true;
    }

    public j5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f29481f = 200L;
        ds dsVar = ds.f27586f;
        this.f29479b = runnable;
        this.f29481f = j10;
        this.f29482g = timeInterpolator;
        this.e = true;
    }
}
