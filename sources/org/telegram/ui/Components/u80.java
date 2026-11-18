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
public final class u80 {
    public final org.telegram.ui.z90 f40255a;
    public SurfaceView d;
    public Bitmap f40258e;
    public Bitmap f40259f;
    public boolean f40260g;
    public boolean h;
    public boolean f40261i;
    public boolean f40262j;
    public boolean f40263k;
    public long f40264l;
    public final Handler f40256b = new Handler(Looper.getMainLooper());
    public final Paint f40257c = new Paint(2);
    public final s80 f40265m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j3) {
            u80 u80Var = u80.this;
            u80Var.f40262j = false;
            u80Var.c();
        }
    };
    public final mo f40266n = new mo(this, 25);

    public u80(org.telegram.ui.z90 z90Var) {
        this.f40255a = z90Var;
    }

    public final void a() {
        this.f40264l = SystemClock.uptimeMillis() + 1500;
        if (this.f40263k) {
            this.f40256b.removeCallbacks(this.f40266n);
            this.f40263k = false;
        }
        b();
    }

    public final void b() {
        if (this.f40260g && !this.f40261i && this.d != null && !this.f40262j && !this.f40263k) {
            if (SystemClock.uptimeMillis() < this.f40264l) {
                this.f40262j = true;
                Choreographer.getInstance().postFrameCallback(this.f40265m);
                return;
            }
            this.f40263k = true;
            this.f40256b.postDelayed(this.f40266n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f40260g && !this.f40261i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f40259f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f40259f.getHeight() != max2) {
                        this.f40259f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f40259f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i7) {
                                u80 u80Var = u80.this;
                                Bitmap bitmap3 = bitmap2;
                                u80Var.h = false;
                                if (!u80Var.f40261i && i7 == 0) {
                                    u80Var.f40259f = u80Var.f40258e;
                                    u80Var.f40258e = bitmap3;
                                    u80Var.f40255a.run();
                                }
                            }
                        }, this.f40256b);
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
        if (this.f40262j) {
            Choreographer.getInstance().removeFrameCallback(this.f40265m);
            this.f40262j = false;
        }
        if (this.f40263k) {
            this.f40256b.removeCallbacks(this.f40266n);
            this.f40263k = false;
        }
    }
}
