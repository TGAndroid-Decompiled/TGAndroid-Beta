package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class j5 {
    public final View f26182a;
    public final Runnable f26183b;
    public int f26184c;
    public int d;
    public boolean e;
    public final long f26185f;
    public final TimeInterpolator f26186g;
    public boolean h;
    public long f26187i;
    public int f26188j;

    public j5(View view) {
        this.f26185f = 200L;
        this.f26186g = es.f24771f;
        this.f26182a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f26185f;
        if (!z10 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f26188j = this.f26184c;
                this.f26187i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f26184c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.s.a(((float) (elapsedRealtime - this.f26187i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f26187i >= 0) {
                TimeInterpolator timeInterpolator = this.f26186g;
                if (timeInterpolator == null) {
                    this.f26184c = i0.a.d(a2, this.f26188j, this.d);
                } else {
                    this.f26184c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f26188j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f26182a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f26183b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f26184c;
    }

    public j5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f26185f = 200L;
        es esVar = es.f24771f;
        this.f26182a = view;
        this.f26185f = j10;
        this.f26186g = timeInterpolator;
        this.e = true;
    }

    public j5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f26185f = 200L;
        es esVar = es.f24771f;
        this.f26182a = view;
        this.f26185f = j10;
        this.f26186g = timeInterpolator;
        this.e = true;
    }

    public j5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f26185f = 200L;
        es esVar = es.f24771f;
        this.f26183b = runnable;
        this.f26185f = j10;
        this.f26186g = timeInterpolator;
        this.e = true;
    }
}
