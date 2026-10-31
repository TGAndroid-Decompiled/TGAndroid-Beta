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
    public final org.telegram.ui.cb0 f32974a;
    public SurfaceView d;
    public Bitmap e;
    public Bitmap f32977f;
    public boolean f32978g;
    public boolean h;
    public boolean f32979i;
    public boolean f32980j;
    public boolean f32981k;
    public long f32982l;
    public final Handler f32975b = new Handler(Looper.getMainLooper());
    public final Paint f32976c = new Paint(2);
    public final x80 f32983m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j10) {
            z80 z80Var = z80.this;
            z80Var.f32980j = false;
            z80Var.c();
        }
    };
    public final ho f32984n = new ho(this, 26);

    public z80(org.telegram.ui.cb0 cb0Var) {
        this.f32974a = cb0Var;
    }

    public final void a() {
        this.f32982l = SystemClock.uptimeMillis() + 1500;
        if (this.f32981k) {
            this.f32975b.removeCallbacks(this.f32984n);
            this.f32981k = false;
        }
        b();
    }

    public final void b() {
        if (this.f32978g && !this.f32979i && this.d != null && !this.f32980j && !this.f32981k) {
            if (SystemClock.uptimeMillis() < this.f32982l) {
                this.f32980j = true;
                Choreographer.getInstance().postFrameCallback(this.f32983m);
                return;
            }
            this.f32981k = true;
            this.f32975b.postDelayed(this.f32984n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f32978g && !this.f32979i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f32977f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f32977f.getHeight() != max2) {
                        this.f32977f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f32977f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i10) {
                                z80 z80Var = z80.this;
                                Bitmap bitmap3 = bitmap2;
                                z80Var.h = false;
                                if (!z80Var.f32979i && i10 == 0) {
                                    z80Var.f32977f = z80Var.e;
                                    z80Var.e = bitmap3;
                                    z80Var.f32974a.run();
                                }
                            }
                        }, this.f32975b);
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
        if (this.f32980j) {
            Choreographer.getInstance().removeFrameCallback(this.f32983m);
            this.f32980j = false;
        }
        if (this.f32981k) {
            this.f32975b.removeCallbacks(this.f32984n);
            this.f32981k = false;
        }
    }
}
