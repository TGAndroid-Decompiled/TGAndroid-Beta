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
    public final org.telegram.ui.aa0 f41700a;
    public SurfaceView d;
    public Bitmap f41703e;
    public Bitmap f41704f;
    public boolean f41705g;
    public boolean h;
    public boolean f41706i;
    public boolean f41707j;
    public boolean f41708k;
    public long f41709l;
    public final Handler f41701b = new Handler(Looper.getMainLooper());
    public final Paint f41702c = new Paint(2);
    public final u80 f41710m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j3) {
            w80 w80Var = w80.this;
            w80Var.f41707j = false;
            w80Var.c();
        }
    };
    public final oo f41711n = new oo(this, 25);

    public w80(org.telegram.ui.aa0 aa0Var) {
        this.f41700a = aa0Var;
    }

    public final void a() {
        this.f41709l = SystemClock.uptimeMillis() + 1500;
        if (this.f41708k) {
            this.f41701b.removeCallbacks(this.f41711n);
            this.f41708k = false;
        }
        b();
    }

    public final void b() {
        if (this.f41705g && !this.f41706i && this.d != null && !this.f41707j && !this.f41708k) {
            if (SystemClock.uptimeMillis() < this.f41709l) {
                this.f41707j = true;
                Choreographer.getInstance().postFrameCallback(this.f41710m);
                return;
            }
            this.f41708k = true;
            this.f41701b.postDelayed(this.f41711n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f41705g && !this.f41706i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f41704f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f41704f.getHeight() != max2) {
                        this.f41704f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f41704f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i7) {
                                w80 w80Var = w80.this;
                                Bitmap bitmap3 = bitmap2;
                                w80Var.h = false;
                                if (!w80Var.f41706i && i7 == 0) {
                                    w80Var.f41704f = w80Var.f41703e;
                                    w80Var.f41703e = bitmap3;
                                    w80Var.f41700a.run();
                                }
                            }
                        }, this.f41701b);
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
        if (this.f41707j) {
            Choreographer.getInstance().removeFrameCallback(this.f41710m);
            this.f41707j = false;
        }
        if (this.f41708k) {
            this.f41701b.removeCallbacks(this.f41711n);
            this.f41708k = false;
        }
    }
}
