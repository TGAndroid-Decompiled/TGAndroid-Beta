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
    public final org.telegram.ui.x90 f33896a;
    public SurfaceView d;
    public Bitmap f33899e;
    public Bitmap f33900f;
    public boolean f33901g;
    public boolean h;
    public boolean f33902i;
    public boolean f33903j;
    public boolean f33904k;
    public long f33905l;
    public final Handler f33897b = new Handler(Looper.getMainLooper());
    public final Paint f33898c = new Paint(2);
    public final e80 f33906m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j3) {
            g80 g80Var = g80.this;
            g80Var.f33903j = false;
            g80Var.c();
        }
    };
    public final gp f33907n = new gp(this, 23);

    public g80(org.telegram.ui.x90 x90Var) {
        this.f33896a = x90Var;
    }

    public final void a() {
        this.f33905l = SystemClock.uptimeMillis() + 1500;
        if (this.f33904k) {
            this.f33897b.removeCallbacks(this.f33907n);
            this.f33904k = false;
        }
        b();
    }

    public final void b() {
        if (this.f33901g && !this.f33902i && this.d != null && !this.f33903j && !this.f33904k) {
            if (SystemClock.uptimeMillis() < this.f33905l) {
                this.f33903j = true;
                Choreographer.getInstance().postFrameCallback(this.f33906m);
                return;
            }
            this.f33904k = true;
            this.f33897b.postDelayed(this.f33907n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f33901g && !this.f33902i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f33900f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f33900f.getHeight() != max2) {
                        this.f33900f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f33900f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i7) {
                                g80 g80Var = g80.this;
                                Bitmap bitmap3 = bitmap2;
                                g80Var.h = false;
                                if (!g80Var.f33902i && i7 == 0) {
                                    g80Var.f33900f = g80Var.f33899e;
                                    g80Var.f33899e = bitmap3;
                                    g80Var.f33896a.run();
                                }
                            }
                        }, this.f33897b);
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
        if (this.f33903j) {
            Choreographer.getInstance().removeFrameCallback(this.f33906m);
            this.f33903j = false;
        }
        if (this.f33904k) {
            this.f33897b.removeCallbacks(this.f33907n);
            this.f33904k = false;
        }
    }
}
