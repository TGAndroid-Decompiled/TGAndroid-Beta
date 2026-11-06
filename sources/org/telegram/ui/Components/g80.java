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
    public final org.telegram.ui.x90 f33844a;
    public SurfaceView d;
    public Bitmap f33847e;
    public Bitmap f33848f;
    public boolean f33849g;
    public boolean h;
    public boolean f33850i;
    public boolean f33851j;
    public boolean f33852k;
    public long f33853l;
    public final Handler f33845b = new Handler(Looper.getMainLooper());
    public final Paint f33846c = new Paint(2);
    public final e80 f33854m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j3) {
            g80 g80Var = g80.this;
            g80Var.f33851j = false;
            g80Var.c();
        }
    };
    public final gp f33855n = new gp(this, 23);

    public g80(org.telegram.ui.x90 x90Var) {
        this.f33844a = x90Var;
    }

    public final void a() {
        this.f33853l = SystemClock.uptimeMillis() + 1500;
        if (this.f33852k) {
            this.f33845b.removeCallbacks(this.f33855n);
            this.f33852k = false;
        }
        b();
    }

    public final void b() {
        if (this.f33849g && !this.f33850i && this.d != null && !this.f33851j && !this.f33852k) {
            if (SystemClock.uptimeMillis() < this.f33853l) {
                this.f33851j = true;
                Choreographer.getInstance().postFrameCallback(this.f33854m);
                return;
            }
            this.f33852k = true;
            this.f33845b.postDelayed(this.f33855n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f33849g && !this.f33850i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f33848f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f33848f.getHeight() != max2) {
                        this.f33848f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f33848f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i7) {
                                g80 g80Var = g80.this;
                                Bitmap bitmap3 = bitmap2;
                                g80Var.h = false;
                                if (!g80Var.f33850i && i7 == 0) {
                                    g80Var.f33848f = g80Var.f33847e;
                                    g80Var.f33847e = bitmap3;
                                    g80Var.f33844a.run();
                                }
                            }
                        }, this.f33845b);
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
        if (this.f33851j) {
            Choreographer.getInstance().removeFrameCallback(this.f33854m);
            this.f33851j = false;
        }
        if (this.f33852k) {
            this.f33845b.removeCallbacks(this.f33855n);
            this.f33852k = false;
        }
    }
}
