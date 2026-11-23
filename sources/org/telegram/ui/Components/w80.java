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
    public final org.telegram.ui.aa0 f41701a;
    public SurfaceView d;
    public Bitmap f41704e;
    public Bitmap f41705f;
    public boolean f41706g;
    public boolean h;
    public boolean f41707i;
    public boolean f41708j;
    public boolean f41709k;
    public long f41710l;
    public final Handler f41702b = new Handler(Looper.getMainLooper());
    public final Paint f41703c = new Paint(2);
    public final u80 f41711m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j3) {
            w80 w80Var = w80.this;
            w80Var.f41708j = false;
            w80Var.c();
        }
    };
    public final oo f41712n = new oo(this, 25);

    public w80(org.telegram.ui.aa0 aa0Var) {
        this.f41701a = aa0Var;
    }

    public final void a() {
        this.f41710l = SystemClock.uptimeMillis() + 1500;
        if (this.f41709k) {
            this.f41702b.removeCallbacks(this.f41712n);
            this.f41709k = false;
        }
        b();
    }

    public final void b() {
        if (this.f41706g && !this.f41707i && this.d != null && !this.f41708j && !this.f41709k) {
            if (SystemClock.uptimeMillis() < this.f41710l) {
                this.f41708j = true;
                Choreographer.getInstance().postFrameCallback(this.f41711m);
                return;
            }
            this.f41709k = true;
            this.f41702b.postDelayed(this.f41712n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f41706g && !this.f41707i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f41705f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f41705f.getHeight() != max2) {
                        this.f41705f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f41705f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i7) {
                                w80 w80Var = w80.this;
                                Bitmap bitmap3 = bitmap2;
                                w80Var.h = false;
                                if (!w80Var.f41707i && i7 == 0) {
                                    w80Var.f41705f = w80Var.f41704e;
                                    w80Var.f41704e = bitmap3;
                                    w80Var.f41701a.run();
                                }
                            }
                        }, this.f41702b);
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
        if (this.f41708j) {
            Choreographer.getInstance().removeFrameCallback(this.f41711m);
            this.f41708j = false;
        }
        if (this.f41709k) {
            this.f41702b.removeCallbacks(this.f41712n);
            this.f41709k = false;
        }
    }
}
