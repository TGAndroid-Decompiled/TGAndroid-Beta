package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class f5 {
    public final View f28307a;
    public final Runnable f28308b;
    public int f28309c;
    public int d;
    public boolean f28310e;
    public final long f28311f;
    public final TimeInterpolator f28312g;
    public boolean h;
    public long f28313i;
    public int f28314j;

    public f5(View view) {
        this.f28311f = 200L;
        this.f28312g = jr.f29800f;
        this.f28307a = view;
        this.f28310e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f28311f;
        if (!z10 && j10 > 0 && !this.f28310e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f28314j = this.f28309c;
                this.f28313i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f28309c = i10;
            this.h = false;
            this.f28310e = false;
        }
        if (this.h) {
            float a2 = i7.w.a(((float) (elapsedRealtime - this.f28313i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f28313i >= 0) {
                TimeInterpolator timeInterpolator = this.f28312g;
                if (timeInterpolator == null) {
                    this.f28309c = i0.a.d(a2, this.f28314j, this.d);
                } else {
                    this.f28309c = i0.a.d(timeInterpolator.getInterpolation(a2), this.f28314j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f28307a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f28308b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f28309c;
    }

    public f5(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f28311f = 200L;
        jr jrVar = jr.f29800f;
        this.f28307a = view;
        this.f28311f = j10;
        this.f28312g = timeInterpolator;
        this.f28310e = true;
    }

    public f5(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f28311f = 200L;
        jr jrVar = jr.f29800f;
        this.f28307a = view;
        this.f28311f = j10;
        this.f28312g = timeInterpolator;
        this.f28310e = true;
    }

    public f5(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f28311f = 200L;
        jr jrVar = jr.f29800f;
        this.f28308b = runnable;
        this.f28311f = j10;
        this.f28312g = timeInterpolator;
        this.f28310e = true;
    }
}
