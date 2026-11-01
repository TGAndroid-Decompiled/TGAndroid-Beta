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
public final class z80 {
    public final org.telegram.ui.bb0 f33070a;
    public SurfaceView d;
    public Bitmap e;
    public Bitmap f33073f;
    public boolean f33074g;
    public boolean h;
    public boolean f33075i;
    public boolean f33076j;
    public boolean f33077k;
    public long f33078l;
    public final Handler f33071b = new Handler(Looper.getMainLooper());
    public final Paint f33072c = new Paint(2);
    public final x80 f33079m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j10) {
            z80 z80Var = z80.this;
            z80Var.f33076j = false;
            z80Var.c();
        }
    };
    public final ho f33080n = new ho(this, 26);

    public z80(org.telegram.ui.bb0 bb0Var) {
        this.f33070a = bb0Var;
    }

    public final void a() {
        this.f33078l = SystemClock.uptimeMillis() + 1500;
        if (this.f33077k) {
            this.f33071b.removeCallbacks(this.f33080n);
            this.f33077k = false;
        }
        b();
    }

    public final void b() {
        if (this.f33074g && !this.f33075i && this.d != null && !this.f33076j && !this.f33077k) {
            if (SystemClock.uptimeMillis() < this.f33078l) {
                this.f33076j = true;
                Choreographer.getInstance().postFrameCallback(this.f33079m);
                return;
            }
            this.f33077k = true;
            this.f33071b.postDelayed(this.f33080n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f33074g && !this.f33075i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f33073f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f33073f.getHeight() != max2) {
                        this.f33073f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f33073f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i10) {
                                z80 z80Var = z80.this;
                                Bitmap bitmap3 = bitmap2;
                                z80Var.h = false;
                                if (!z80Var.f33075i && i10 == 0) {
                                    z80Var.f33073f = z80Var.e;
                                    z80Var.e = bitmap3;
                                    z80Var.f33070a.run();
                                }
                            }
                        }, this.f33071b);
                    } catch (Exception e) {
                        this.h = false;
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
            }
            b();
        }
    }

    public final void d() {
        if (this.f33076j) {
            Choreographer.getInstance().removeFrameCallback(this.f33079m);
            this.f33076j = false;
        }
        if (this.f33077k) {
            this.f33071b.removeCallbacks(this.f33080n);
            this.f33077k = false;
        }
    }
}
