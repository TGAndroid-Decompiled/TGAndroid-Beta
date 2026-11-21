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
public final class w80 {
    public final org.telegram.ui.aa0 f41707a;
    public SurfaceView d;
    public Bitmap f41710e;
    public Bitmap f41711f;
    public boolean f41712g;
    public boolean h;
    public boolean f41713i;
    public boolean f41714j;
    public boolean f41715k;
    public long f41716l;
    public final Handler f41708b = new Handler(Looper.getMainLooper());
    public final Paint f41709c = new Paint(2);
    public final u80 f41717m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j3) {
            w80 w80Var = w80.this;
            w80Var.f41714j = false;
            w80Var.c();
        }
    };
    public final oo f41718n = new oo(this, 25);

    public w80(org.telegram.ui.aa0 aa0Var) {
        this.f41707a = aa0Var;
    }

    public final void a() {
        this.f41716l = SystemClock.uptimeMillis() + 1500;
        if (this.f41715k) {
            this.f41708b.removeCallbacks(this.f41718n);
            this.f41715k = false;
        }
        b();
    }

    public final void b() {
        if (this.f41712g && !this.f41713i && this.d != null && !this.f41714j && !this.f41715k) {
            if (SystemClock.uptimeMillis() < this.f41716l) {
                this.f41714j = true;
                Choreographer.getInstance().postFrameCallback(this.f41717m);
                return;
            }
            this.f41715k = true;
            this.f41708b.postDelayed(this.f41718n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f41712g && !this.f41713i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f41711f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f41711f.getHeight() != max2) {
                        this.f41711f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f41711f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i7) {
                                w80 w80Var = w80.this;
                                Bitmap bitmap3 = bitmap2;
                                w80Var.h = false;
                                if (!w80Var.f41713i && i7 == 0) {
                                    w80Var.f41711f = w80Var.f41710e;
                                    w80Var.f41710e = bitmap3;
                                    w80Var.f41707a.run();
                                }
                            }
                        }, this.f41708b);
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
        if (this.f41714j) {
            Choreographer.getInstance().removeFrameCallback(this.f41717m);
            this.f41714j = false;
        }
        if (this.f41715k) {
            this.f41708b.removeCallbacks(this.f41718n);
            this.f41715k = false;
        }
    }
}
