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
    public final org.telegram.ui.x90 f33852a;
    public SurfaceView d;
    public Bitmap f33855e;
    public Bitmap f33856f;
    public boolean f33857g;
    public boolean h;
    public boolean f33858i;
    public boolean f33859j;
    public boolean f33860k;
    public long f33861l;
    public final Handler f33853b = new Handler(Looper.getMainLooper());
    public final Paint f33854c = new Paint(2);
    public final e80 f33862m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j3) {
            g80 g80Var = g80.this;
            g80Var.f33859j = false;
            g80Var.c();
        }
    };
    public final gp f33863n = new gp(this, 23);

    public g80(org.telegram.ui.x90 x90Var) {
        this.f33852a = x90Var;
    }

    public final void a() {
        this.f33861l = SystemClock.uptimeMillis() + 1500;
        if (this.f33860k) {
            this.f33853b.removeCallbacks(this.f33863n);
            this.f33860k = false;
        }
        b();
    }

    public final void b() {
        if (this.f33857g && !this.f33858i && this.d != null && !this.f33859j && !this.f33860k) {
            if (SystemClock.uptimeMillis() < this.f33861l) {
                this.f33859j = true;
                Choreographer.getInstance().postFrameCallback(this.f33862m);
                return;
            }
            this.f33860k = true;
            this.f33853b.postDelayed(this.f33863n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f33857g && !this.f33858i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f33856f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f33856f.getHeight() != max2) {
                        this.f33856f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f33856f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i7) {
                                g80 g80Var = g80.this;
                                Bitmap bitmap3 = bitmap2;
                                g80Var.h = false;
                                if (!g80Var.f33858i && i7 == 0) {
                                    g80Var.f33856f = g80Var.f33855e;
                                    g80Var.f33855e = bitmap3;
                                    g80Var.f33852a.run();
                                }
                            }
                        }, this.f33853b);
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
        if (this.f33859j) {
            Choreographer.getInstance().removeFrameCallback(this.f33862m);
            this.f33859j = false;
        }
        if (this.f33860k) {
            this.f33853b.removeCallbacks(this.f33863n);
            this.f33860k = false;
        }
    }
}
