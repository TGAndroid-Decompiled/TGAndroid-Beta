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
public final class j80 {
    public final org.telegram.ui.y90 f35899a;
    public SurfaceView d;
    public Bitmap f35902e;
    public Bitmap f35903f;
    public boolean f35904g;
    public boolean h;
    public boolean f35905i;
    public boolean f35906j;
    public boolean f35907k;
    public long f35908l;
    public final Handler f35900b = new Handler(Looper.getMainLooper());
    public final Paint f35901c = new Paint(2);
    public final h80 f35909m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j3) {
            j80 j80Var = j80.this;
            j80Var.f35906j = false;
            j80Var.c();
        }
    };
    public final fo f35910n = new fo(this, 25);

    public j80(org.telegram.ui.y90 y90Var) {
        this.f35899a = y90Var;
    }

    public final void a() {
        this.f35908l = SystemClock.uptimeMillis() + 1500;
        if (this.f35907k) {
            this.f35900b.removeCallbacks(this.f35910n);
            this.f35907k = false;
        }
        b();
    }

    public final void b() {
        if (this.f35904g && !this.f35905i && this.d != null && !this.f35906j && !this.f35907k) {
            if (SystemClock.uptimeMillis() < this.f35908l) {
                this.f35906j = true;
                Choreographer.getInstance().postFrameCallback(this.f35909m);
                return;
            }
            this.f35907k = true;
            this.f35900b.postDelayed(this.f35910n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f35904g && !this.f35905i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f35903f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f35903f.getHeight() != max2) {
                        this.f35903f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f35903f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i7) {
                                j80 j80Var = j80.this;
                                Bitmap bitmap3 = bitmap2;
                                j80Var.h = false;
                                if (!j80Var.f35905i && i7 == 0) {
                                    j80Var.f35903f = j80Var.f35902e;
                                    j80Var.f35902e = bitmap3;
                                    j80Var.f35899a.run();
                                }
                            }
                        }, this.f35900b);
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
        if (this.f35906j) {
            Choreographer.getInstance().removeFrameCallback(this.f35909m);
            this.f35906j = false;
        }
        if (this.f35907k) {
            this.f35900b.removeCallbacks(this.f35910n);
            this.f35907k = false;
        }
    }
}
