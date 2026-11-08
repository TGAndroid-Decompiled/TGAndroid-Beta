package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceView;
public final class g80 {
    public final org.telegram.ui.x90 f33878a;
    public SurfaceView d;
    public Bitmap f33881e;
    public Bitmap f33882f;
    public boolean f33883g;
    public boolean h;
    public boolean f33884i;
    public boolean f33885j;
    public boolean f33886k;
    public long f33887l;
    public final Handler f33879b = new Handler(Looper.getMainLooper());
    public final Paint f33880c = new Paint(2);
    public final e80 f33888m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j3) {
            g80 g80Var = g80.this;
            g80Var.f33885j = false;
            g80Var.c();
        }
    };
    public final gp f33889n = new gp(this, 23);

    public g80(org.telegram.ui.x90 x90Var) {
        this.f33878a = x90Var;
    }

    public final void a() {
        this.f33887l = SystemClock.uptimeMillis() + 1500;
        if (this.f33886k) {
            this.f33879b.removeCallbacks(this.f33889n);
            this.f33886k = false;
        }
        b();
    }

    public final void b() {
        if (this.f33883g && !this.f33884i && this.d != null && !this.f33885j && !this.f33886k) {
            if (SystemClock.uptimeMillis() < this.f33887l) {
                this.f33885j = true;
                Choreographer.getInstance().postFrameCallback(this.f33888m);
                return;
            }
            this.f33886k = true;
            this.f33879b.postDelayed(this.f33889n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f33883g && !this.f33884i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f33882f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f33882f.getHeight() != max2) {
                        this.f33882f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f33882f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i7) {
                                g80 g80Var = g80.this;
                                Bitmap bitmap3 = bitmap2;
                                g80Var.h = false;
                                if (!g80Var.f33884i && i7 == 0) {
                                    g80Var.f33882f = g80Var.f33881e;
                                    g80Var.f33881e = bitmap3;
                                    g80Var.f33878a.run();
                                }
                            }
                        }, this.f33879b);
                    } catch (Exception e10) {
                        this.h = false;
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
            }
            b();
        }
    }

    public final void d() {
        if (this.f33885j) {
            Choreographer.getInstance().removeFrameCallback(this.f33888m);
            this.f33885j = false;
        }
        if (this.f33886k) {
            this.f33879b.removeCallbacks(this.f33889n);
            this.f33886k = false;
        }
    }
}
