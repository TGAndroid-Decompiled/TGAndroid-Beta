package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e6 {
    public View f23874a;
    public final Runnable f23875b;
    public float f23876c;
    public float d;
    public boolean e;
    public long f23877f;
    public long f23878g;
    public TimeInterpolator h;
    public boolean f23879i;
    public long f23880j;
    public float f23881k;

    public e6(long j3, TimeInterpolator timeInterpolator) {
        this.f23877f = 0L;
        this.f23878g = 200L;
        sr srVar = sr.f28349f;
        this.f23874a = null;
        this.f23878g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public final void a(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        d(f7, true);
    }

    public final float b() {
        if (!this.f23879i) {
            return 0.0f;
        }
        return w7.q.a(((float) ((SystemClock.elapsedRealtime() - this.f23880j) - this.f23877f)) / ((float) this.f23878g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f23879i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.q.a(((float) ((elapsedRealtime - this.f23880j) - this.f23877f)) / ((float) this.f23878g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f23880j >= this.f23877f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f23876c = AndroidUtilities.lerp(this.f23881k, this.d, a2);
                } else {
                    this.f23876c = AndroidUtilities.lerp(this.f23881k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f23879i = false;
            } else {
                View view = this.f23874a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f23875b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f23876c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f23878g > 0 && !this.e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f23879i = true;
                this.d = f7;
                this.f23881k = this.f23876c;
                this.f23880j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f23876c = f7;
            this.f23879i = false;
            this.e = false;
        }
        return c();
    }

    public final float e(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        return d(f7, false);
    }

    public final float f(boolean z10, boolean z11) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        return d(f7, z11);
    }

    public e6(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23877f = 0L;
        this.f23878g = 200L;
        sr srVar = sr.f28349f;
        this.f23874a = null;
        this.f23877f = j3;
        this.f23878g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(View view) {
        this.f23877f = 0L;
        this.f23878g = 200L;
        this.h = sr.f28349f;
        this.f23874a = view;
        this.e = true;
    }

    public e6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f23877f = 0L;
        this.f23878g = 200L;
        sr srVar = sr.f28349f;
        this.f23874a = view;
        this.f23878g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23877f = 0L;
        this.f23878g = 200L;
        sr srVar = sr.f28349f;
        this.f23874a = view;
        this.f23877f = j3;
        this.f23878g = j10;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(Runnable runnable) {
        this.f23877f = 0L;
        this.f23878g = 200L;
        this.h = sr.f28349f;
        this.f23875b = runnable;
        this.e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f23877f = 0L;
        this.f23878g = 200L;
        sr srVar = sr.f28349f;
        this.f23875b = runnable;
        this.f23878g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f23877f = 0L;
        this.f23878g = 200L;
        sr srVar = sr.f28349f;
        this.f23875b = runnable;
        this.f23877f = 0L;
        this.f23878g = j3;
        this.h = timeInterpolator;
        this.e = true;
    }

    public e6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23877f = 0L;
        this.f23878g = 200L;
        sr srVar = sr.f28349f;
        this.f23874a = view;
        this.d = f7;
        this.f23876c = f7;
        this.f23877f = j3;
        this.f23878g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }

    public e6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f23877f = 0L;
        this.f23878g = 200L;
        sr srVar = sr.f28349f;
        this.f23875b = runnable;
        this.d = f7;
        this.f23876c = f7;
        this.f23877f = j3;
        this.f23878g = j10;
        this.h = timeInterpolator;
        this.e = false;
    }
}
