package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class j5 {
    public final View f29476a;
    public final Runnable f29477b;
    public int f29478c;
    public int d;
    public boolean e;
    public final long f29479f;
    public final TimeInterpolator f29480g;
    public boolean h;
    public long f29481i;
    public int f29482j;

    public j5(View view) {
        this.f29479f = 200L;
        this.f29480g = ds.f27584f;
        this.f29476a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f29479f;
        if (!z10 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f29482j = this.f29478c;
                this.f29481i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f29478c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = a8.ee.a(((float) (elapsedRealtime - this.f29481i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f29481i >= 0) {
                TimeInterpolator timeInterpolator = this.f29480g;
                if (timeInterpolator == null) {
                    this.f29478c = i0.a.f(a2, this.f29482j, this.d);
                } else {
                    this.f29478c = i0.a.f(timeInterpolator.getInterpolation(a2), this.f29482j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f29476a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f29477b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f29478c;
    }

    public j5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f29479f = 200L;
        ds dsVar = ds.f27584f;
        this.f29476a = view;
        this.f29479f = j10;
        this.f29480g = timeInterpolator;
        this.e = true;
    }

    public j5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f29479f = 200L;
        ds dsVar = ds.f27584f;
        this.f29476a = view;
        this.f29479f = j10;
        this.f29480g = timeInterpolator;
        this.e = true;
    }

    public j5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f29479f = 200L;
        ds dsVar = ds.f27584f;
        this.f29477b = runnable;
        this.f29479f = j10;
        this.f29480g = timeInterpolator;
        this.e = true;
    }
}
