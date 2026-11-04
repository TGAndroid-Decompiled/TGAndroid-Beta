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
public final class c80 {
    public final org.telegram.ui.u90 f32593a;
    public SurfaceView d;
    public Bitmap f32596e;
    public Bitmap f32597f;
    public boolean f32598g;
    public boolean h;
    public boolean f32599i;
    public boolean f32600j;
    public boolean f32601k;
    public long f32602l;
    public final Handler f32594b = new Handler(Looper.getMainLooper());
    public final Paint f32595c = new Paint(2);
    public final a80 f32603m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j10) {
            c80 c80Var = c80.this;
            c80Var.f32600j = false;
            c80Var.c();
        }
    };
    public final gp f32604n = new gp(this, 23);

    public c80(org.telegram.ui.u90 u90Var) {
        this.f32593a = u90Var;
    }

    public final void a() {
        this.f32602l = SystemClock.uptimeMillis() + 1500;
        if (this.f32601k) {
            this.f32594b.removeCallbacks(this.f32604n);
            this.f32601k = false;
        }
        b();
    }

    public final void b() {
        if (this.f32598g && !this.f32599i && this.d != null && !this.f32600j && !this.f32601k) {
            if (SystemClock.uptimeMillis() < this.f32602l) {
                this.f32600j = true;
                Choreographer.getInstance().postFrameCallback(this.f32603m);
                return;
            }
            this.f32601k = true;
            this.f32594b.postDelayed(this.f32604n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f32598g && !this.f32599i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f32597f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f32597f.getHeight() != max2) {
                        this.f32597f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f32597f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i3) {
                                c80 c80Var = c80.this;
                                Bitmap bitmap3 = bitmap2;
                                c80Var.h = false;
                                if (!c80Var.f32599i && i3 == 0) {
                                    c80Var.f32597f = c80Var.f32596e;
                                    c80Var.f32596e = bitmap3;
                                    c80Var.f32593a.run();
                                }
                            }
                        }, this.f32594b);
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
        if (this.f32600j) {
            Choreographer.getInstance().removeFrameCallback(this.f32603m);
            this.f32600j = false;
        }
        if (this.f32601k) {
            this.f32594b.removeCallbacks(this.f32604n);
            this.f32601k = false;
        }
    }
}
