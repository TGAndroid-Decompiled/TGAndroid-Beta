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
public final class t80 {
    public final org.telegram.ui.z90 f39859a;
    public SurfaceView d;
    public Bitmap f39862e;
    public Bitmap f39863f;
    public boolean f39864g;
    public boolean h;
    public boolean f39865i;
    public boolean f39866j;
    public boolean f39867k;
    public long f39868l;
    public final Handler f39860b = new Handler(Looper.getMainLooper());
    public final Paint f39861c = new Paint(2);
    public final r80 f39869m = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j3) {
            t80 t80Var = t80.this;
            t80Var.f39866j = false;
            t80Var.c();
        }
    };
    public final lo f39870n = new lo(this, 25);

    public t80(org.telegram.ui.z90 z90Var) {
        this.f39859a = z90Var;
    }

    public final void a() {
        this.f39868l = SystemClock.uptimeMillis() + 1500;
        if (this.f39867k) {
            this.f39860b.removeCallbacks(this.f39870n);
            this.f39867k = false;
        }
        b();
    }

    public final void b() {
        if (this.f39864g && !this.f39865i && this.d != null && !this.f39866j && !this.f39867k) {
            if (SystemClock.uptimeMillis() < this.f39868l) {
                this.f39866j = true;
                Choreographer.getInstance().postFrameCallback(this.f39869m);
                return;
            }
            this.f39867k = true;
            this.f39860b.postDelayed(this.f39870n, 400L);
        }
    }

    public final void c() {
        Surface surface;
        if (this.f39864g && !this.f39865i) {
            if (!this.h) {
                SurfaceView surfaceView = this.d;
                if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.isAttachedToWindow() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0 && (surface = surfaceView.getHolder().getSurface()) != null && surface.isValid()) {
                    int max = Math.max(1, surfaceView.getWidth() / 4);
                    int max2 = Math.max(1, surfaceView.getHeight() / 4);
                    Bitmap bitmap = this.f39863f;
                    if (bitmap == null || bitmap.getWidth() != max || this.f39863f.getHeight() != max2) {
                        this.f39863f = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                    }
                    final Bitmap bitmap2 = this.f39863f;
                    this.h = true;
                    try {
                        PixelCopy.request(surfaceView, bitmap2, new PixelCopy.OnPixelCopyFinishedListener() {
                            @Override
                            public final void onPixelCopyFinished(int i7) {
                                t80 t80Var = t80.this;
                                Bitmap bitmap3 = bitmap2;
                                t80Var.h = false;
                                if (!t80Var.f39865i && i7 == 0) {
                                    t80Var.f39863f = t80Var.f39862e;
                                    t80Var.f39862e = bitmap3;
                                    t80Var.f39859a.run();
                                }
                            }
                        }, this.f39860b);
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
        if (this.f39866j) {
            Choreographer.getInstance().removeFrameCallback(this.f39869m);
            this.f39866j = false;
        }
        if (this.f39867k) {
            this.f39860b.removeCallbacks(this.f39870n);
            this.f39867k = false;
        }
    }
}
