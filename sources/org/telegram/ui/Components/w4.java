package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
public final class w4 {
    public final View f32066a;
    public final Runnable f32067b;
    public int f32068c;
    public int d;
    public boolean e;
    public final long f32069f;
    public final TimeInterpolator f32070g;
    public boolean h;
    public long f32071i;
    public int f32072j;

    public w4(View view) {
        this.f32069f = 200L;
        this.f32070g = gr.f26523f;
        this.f32066a = view;
        this.e = true;
    }

    public final int a(int i10, boolean z10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f32069f;
        if (!z10 && j10 > 0 && !this.e) {
            if (this.d != i10) {
                this.h = true;
                this.d = i10;
                this.f32072j = this.f32068c;
                this.f32071i = elapsedRealtime;
            }
        } else {
            this.d = i10;
            this.f32068c = i10;
            this.h = false;
            this.e = false;
        }
        if (this.h) {
            float a2 = w7.u.a(((float) (elapsedRealtime - this.f32071i)) / ((float) j10), 0.0f, 1.0f);
            if (elapsedRealtime - this.f32071i >= 0) {
                TimeInterpolator timeInterpolator = this.f32070g;
                if (timeInterpolator == null) {
                    this.f32068c = i0.b.f(a2, this.f32072j, this.d);
                } else {
                    this.f32068c = i0.b.f(timeInterpolator.getInterpolation(a2), this.f32072j, this.d);
                }
            }
            if (a2 >= 1.0f) {
                this.h = false;
            } else {
                View view = this.f32066a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f32067b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f32068c;
    }

    public w4(View view, long j10, TimeInterpolator timeInterpolator) {
        this.f32069f = 200L;
        gr grVar = gr.f26523f;
        this.f32066a = view;
        this.f32069f = j10;
        this.f32070g = timeInterpolator;
        this.e = true;
    }

    public w4(View view, long j10, TimeInterpolator timeInterpolator, int i10) {
        this.f32069f = 200L;
        gr grVar = gr.f26523f;
        this.f32066a = view;
        this.f32069f = j10;
        this.f32070g = timeInterpolator;
        this.e = true;
    }

    public w4(Runnable runnable, long j10, TimeInterpolator timeInterpolator) {
        this.f32069f = 200L;
        gr grVar = gr.f26523f;
        this.f32067b = runnable;
        this.f32069f = j10;
        this.f32070g = timeInterpolator;
        this.e = true;
    }
}
