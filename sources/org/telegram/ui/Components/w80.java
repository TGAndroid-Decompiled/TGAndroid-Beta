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
    public final org.telegram.ui.aa0 f41674a;
    public SurfaceView d;
    public Bitmap f41677e;
    public Bitmap f41678f;
    public boolean f41679g;
    public boolean h;
    public boolean f41680i;
    public boolean f41681j;
    public boolean f41682k;
    public long f41683l;
    public final Handler f41675b = new Handler(Looper.getMainLooper());
    public final Paint f41676c = new Paint(2);
    public final u80 f41684m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j3) {
            w80 w80Var = w80.this;
            w80Var.f41681j = false;
            w80Var.c();
        }
    };
    public final oo f41685n = new oo(this, 25);

    public w80(org.telegram.ui.aa0 aa0Var) {
        this.f41674a = aa0Var;
    }

    public final void a() {
        this.f41683l = SystemClock.uptimeMillis() + 1500;
        if (this.f41682k) {
            this.f41675b.removeCallbacks(this.f41685n);
            this.f41682k = false;
        }
        b();
    }

    public final void b() {
        if (this.f41679g && !this.f41680i && this.d != null && !this.f41681j && !this.f41682k) {
            if (SystemClock.uptimeMillis() < this.f41683l) {
                this.f41681j = true;
                Choreographer.getInstance().postFrameCallback(this.f41684m);
                return;
            }
            this.f41682k = true;
            this.f41675b.postDelayed(this.f41685n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f41679g && !this.f41680i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f41678f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f41678f.getHeight() != max2) {
                        this.f41678f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f41678f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i7) {
                                w80 w80Var = w80.this;
                                Bitmap bitmap3 = bitmap2;
                                w80Var.h = false;
                                if (!w80Var.f41680i && i7 == 0) {
                                    w80Var.f41678f = w80Var.f41677e;
                                    w80Var.f41677e = bitmap3;
                                    w80Var.f41674a.run();
                                }
                            }
                        }, this.f41675b);
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
        if (this.f41681j) {
            Choreographer.getInstance().removeFrameCallback(this.f41684m);
            this.f41681j = false;
        }
        if (this.f41682k) {
            this.f41675b.removeCallbacks(this.f41685n);
            this.f41682k = false;
        }
    }
}
