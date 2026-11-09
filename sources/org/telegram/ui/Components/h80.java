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
public final class h80 {
    public final org.telegram.ui.z90 f34232a;
    public SurfaceView d;
    public Bitmap f34235e;
    public Bitmap f34236f;
    public boolean f34237g;
    public boolean h;
    public boolean f34238i;
    public boolean f34239j;
    public boolean f34240k;
    public long f34241l;
    public final Handler f34233b = new Handler(Looper.getMainLooper());
    public final Paint f34234c = new Paint(2);
    public final f80 f34242m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j3) {
            h80 h80Var = h80.this;
            h80Var.f34239j = false;
            h80Var.c();
        }
    };
    public final gp f34243n = new gp(this, 23);

    public h80(org.telegram.ui.z90 z90Var) {
        this.f34232a = z90Var;
    }

    public final void a() {
        this.f34241l = SystemClock.uptimeMillis() + 1500;
        if (this.f34240k) {
            this.f34233b.removeCallbacks(this.f34243n);
            this.f34240k = false;
        }
        b();
    }

    public final void b() {
        if (this.f34237g && !this.f34238i && this.d != null && !this.f34239j && !this.f34240k) {
            if (SystemClock.uptimeMillis() < this.f34241l) {
                this.f34239j = true;
                Choreographer.getInstance().postFrameCallback(this.f34242m);
                return;
            }
            this.f34240k = true;
            this.f34233b.postDelayed(this.f34243n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f34237g && !this.f34238i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f34236f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f34236f.getHeight() != max2) {
                        this.f34236f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f34236f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i7) {
                                h80 h80Var = h80.this;
                                Bitmap bitmap3 = bitmap2;
                                h80Var.h = false;
                                if (!h80Var.f34238i && i7 == 0) {
                                    h80Var.f34236f = h80Var.f34235e;
                                    h80Var.f34235e = bitmap3;
                                    h80Var.f34232a.run();
                                }
                            }
                        }, this.f34233b);
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
        if (this.f34239j) {
            Choreographer.getInstance().removeFrameCallback(this.f34242m);
            this.f34239j = false;
        }
        if (this.f34240k) {
            this.f34233b.removeCallbacks(this.f34243n);
            this.f34240k = false;
        }
    }
}
