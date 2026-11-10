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
    public final org.telegram.ui.aa0 f33832a;
    public SurfaceView d;
    public Bitmap f33835e;
    public Bitmap f33836f;
    public boolean f33837g;
    public boolean h;
    public boolean f33838i;
    public boolean f33839j;
    public boolean f33840k;
    public long f33841l;
    public final Handler f33833b = new Handler(Looper.getMainLooper());
    public final Paint f33834c = new Paint(2);
    public final e80 f33842m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j3) {
            g80 g80Var = g80.this;
            g80Var.f33839j = false;
            g80Var.c();
        }
    };
    public final gp f33843n = new gp(this, 23);

    public g80(org.telegram.ui.aa0 aa0Var) {
        this.f33832a = aa0Var;
    }

    public final void a() {
        this.f33841l = SystemClock.uptimeMillis() + 1500;
        if (this.f33840k) {
            this.f33833b.removeCallbacks(this.f33843n);
            this.f33840k = false;
        }
        b();
    }

    public final void b() {
        if (this.f33837g && !this.f33838i && this.d != null && !this.f33839j && !this.f33840k) {
            if (SystemClock.uptimeMillis() < this.f33841l) {
                this.f33839j = true;
                Choreographer.getInstance().postFrameCallback(this.f33842m);
                return;
            }
            this.f33840k = true;
            this.f33833b.postDelayed(this.f33843n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f33837g && !this.f33838i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f33836f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f33836f.getHeight() != max2) {
                        this.f33836f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f33836f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i7) {
                                g80 g80Var = g80.this;
                                Bitmap bitmap3 = bitmap2;
                                g80Var.h = false;
                                if (!g80Var.f33838i && i7 == 0) {
                                    g80Var.f33836f = g80Var.f33835e;
                                    g80Var.f33835e = bitmap3;
                                    g80Var.f33832a.run();
                                }
                            }
                        }, this.f33833b);
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
        if (this.f33839j) {
            Choreographer.getInstance().removeFrameCallback(this.f33842m);
            this.f33839j = false;
        }
        if (this.f33840k) {
            this.f33833b.removeCallbacks(this.f33843n);
            this.f33840k = false;
        }
    }
}
