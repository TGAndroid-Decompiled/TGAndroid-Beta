package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class g6 {
    public View f26597a;
    public final Runnable f26598b;
    public float f26599c;
    public float d;
    public boolean f26600e;
    public long f26601f;
    public long f26602g;
    public TimeInterpolator h;
    public boolean f26603i;
    public long f26604j;
    public float f26605k;

    public g6(long j3, TimeInterpolator timeInterpolator) {
        this.f26601f = 0L;
        this.f26602g = 200L;
        hs hsVar = hs.f27118f;
        this.f26597a = null;
        this.f26602g = j3;
        this.h = timeInterpolator;
        this.f26600e = true;
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
        if (!this.f26603i) {
            return 0.0f;
        }
        return w7.o.a(((float) ((SystemClock.elapsedRealtime() - this.f26604j) - this.f26601f)) / ((float) this.f26602g), 0.0f, 1.0f);
    }

    public final float c() {
        if (this.f26603i) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float a2 = w7.o.a(((float) ((elapsedRealtime - this.f26604j) - this.f26601f)) / ((float) this.f26602g), 0.0f, 1.0f);
            if (elapsedRealtime - this.f26604j >= this.f26601f) {
                TimeInterpolator timeInterpolator = this.h;
                if (timeInterpolator == null) {
                    this.f26599c = AndroidUtilities.lerp(this.f26605k, this.d, a2);
                } else {
                    this.f26599c = AndroidUtilities.lerp(this.f26605k, this.d, timeInterpolator.getInterpolation(a2));
                }
            }
            if (a2 >= 1.0f) {
                this.f26603i = false;
            } else {
                View view = this.f26597a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.f26598b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.f26599c;
    }

    public final float d(float f7, boolean z10) {
        if (!z10 && this.f26602g > 0 && !this.f26600e) {
            if (Math.abs(this.d - f7) > 1.0E-4f) {
                this.f26603i = true;
                this.d = f7;
                this.f26605k = this.f26599c;
                this.f26604j = SystemClock.elapsedRealtime();
            }
        } else {
            this.d = f7;
            this.f26599c = f7;
            this.f26603i = false;
            this.f26600e = false;
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

    public g6(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26601f = 0L;
        this.f26602g = 200L;
        hs hsVar = hs.f27118f;
        this.f26597a = null;
        this.f26601f = j3;
        this.f26602g = j10;
        this.h = timeInterpolator;
        this.f26600e = true;
    }

    public g6(View view) {
        this.f26601f = 0L;
        this.f26602g = 200L;
        this.h = hs.f27118f;
        this.f26597a = view;
        this.f26600e = true;
    }

    public g6(View view, long j3, TimeInterpolator timeInterpolator) {
        this.f26601f = 0L;
        this.f26602g = 200L;
        hs hsVar = hs.f27118f;
        this.f26597a = view;
        this.f26602g = j3;
        this.h = timeInterpolator;
        this.f26600e = true;
    }

    public g6(View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26601f = 0L;
        this.f26602g = 200L;
        hs hsVar = hs.f27118f;
        this.f26597a = view;
        this.f26601f = j3;
        this.f26602g = j10;
        this.h = timeInterpolator;
        this.f26600e = true;
    }

    public g6(Runnable runnable) {
        this.f26601f = 0L;
        this.f26602g = 200L;
        this.h = hs.f27118f;
        this.f26598b = runnable;
        this.f26600e = true;
    }

    public g6(Runnable runnable, long j3, TimeInterpolator timeInterpolator) {
        this.f26601f = 0L;
        this.f26602g = 200L;
        hs hsVar = hs.f27118f;
        this.f26598b = runnable;
        this.f26602g = j3;
        this.h = timeInterpolator;
        this.f26600e = true;
    }

    public g6(Runnable runnable, long j3, TimeInterpolator timeInterpolator, int i10) {
        this.f26601f = 0L;
        this.f26602g = 200L;
        hs hsVar = hs.f27118f;
        this.f26598b = runnable;
        this.f26601f = 0L;
        this.f26602g = j3;
        this.h = timeInterpolator;
        this.f26600e = true;
    }

    public g6(float f7, View view, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26601f = 0L;
        this.f26602g = 200L;
        hs hsVar = hs.f27118f;
        this.f26597a = view;
        this.d = f7;
        this.f26599c = f7;
        this.f26601f = j3;
        this.f26602g = j10;
        this.h = timeInterpolator;
        this.f26600e = false;
    }

    public g6(float f7, Runnable runnable, long j3, long j10, TimeInterpolator timeInterpolator) {
        this.f26601f = 0L;
        this.f26602g = 200L;
        hs hsVar = hs.f27118f;
        this.f26598b = runnable;
        this.d = f7;
        this.f26599c = f7;
        this.f26601f = j3;
        this.f26602g = j10;
        this.h = timeInterpolator;
        this.f26600e = false;
    }
}
