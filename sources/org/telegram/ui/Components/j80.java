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
    public final org.telegram.ui.y90 f35912a;
    public SurfaceView d;
    public Bitmap f35915e;
    public Bitmap f35916f;
    public boolean f35917g;
    public boolean h;
    public boolean f35918i;
    public boolean f35919j;
    public boolean f35920k;
    public long f35921l;
    public final Handler f35913b = new Handler(Looper.getMainLooper());
    public final Paint f35914c = new Paint(2);
    public final h80 f35922m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j3) {
            j80 j80Var = j80.this;
            j80Var.f35919j = false;
            j80Var.c();
        }
    };
    public final fo f35923n = new fo(this, 25);

    public j80(org.telegram.ui.y90 y90Var) {
        this.f35912a = y90Var;
    }

    public final void a() {
        this.f35921l = SystemClock.uptimeMillis() + 1500;
        if (this.f35920k) {
            this.f35913b.removeCallbacks(this.f35923n);
            this.f35920k = false;
        }
        b();
    }

    public final void b() {
        if (this.f35917g && !this.f35918i && this.d != null && !this.f35919j && !this.f35920k) {
            if (SystemClock.uptimeMillis() < this.f35921l) {
                this.f35919j = true;
                Choreographer.getInstance().postFrameCallback(this.f35922m);
                return;
            }
            this.f35920k = true;
            this.f35913b.postDelayed(this.f35923n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f35917g && !this.f35918i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f35916f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f35916f.getHeight() != max2) {
                        this.f35916f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f35916f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i7) {
                                j80 j80Var = j80.this;
                                Bitmap bitmap3 = bitmap2;
                                j80Var.h = false;
                                if (!j80Var.f35918i && i7 == 0) {
                                    j80Var.f35916f = j80Var.f35915e;
                                    j80Var.f35915e = bitmap3;
                                    j80Var.f35912a.run();
                                }
                            }
                        }, this.f35913b);
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
        if (this.f35919j) {
            Choreographer.getInstance().removeFrameCallback(this.f35922m);
            this.f35919j = false;
        }
        if (this.f35920k) {
            this.f35913b.removeCallbacks(this.f35923n);
            this.f35920k = false;
        }
    }
}
