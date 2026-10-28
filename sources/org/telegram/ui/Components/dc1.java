package org.telegram.ui.Components;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Choreographer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class dc1 {
    public boolean A;
    public boolean B;
    public volatile boolean C;
    public int D;
    public ac1 E;
    public ac1 F;
    public JSONObject G;
    public boolean H;
    public cc1 I;
    public volatile b3 J;
    public volatile b3 K;
    public cc1 L;
    public String M;
    public final oa1 N;
    public final oa1 O;
    public final oa1 P;
    public final xb1 Q;
    public final Context f27398c;
    public final String d;
    public final int e;
    public final String f27399f;
    public final String f27400g;
    public final float f27401i;
    public volatile int f27409q;
    public volatile boolean f27410r;
    public volatile long f27411s;
    public volatile boolean f27412t;
    public volatile boolean f27413u;
    public volatile boolean v;
    public volatile boolean f27414w;
    public volatile boolean f27415x;
    public String f27416y;
    public boolean f27417z;
    public final Handler f27396a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend f27397b = new WidgetSandboxBackend(this);
    public volatile String h = "{}";
    public final long f27402j = System.nanoTime();
    public final AtomicBoolean f27403k = new AtomicBoolean();
    public final AtomicBoolean f27404l = new AtomicBoolean();
    public final AtomicBoolean f27405m = new AtomicBoolean();
    public final AtomicBoolean f27406n = new AtomicBoolean();
    public final AtomicBoolean f27407o = new AtomicBoolean();
    public final Object f27408p = new Object();

    public dc1(Context context, String str, String str2, int i10, String str3, String str4) {
        new JSONObject();
        this.N = new oa1(this, 3);
        this.O = new oa1(this, 4);
        this.P = new oa1(this, 5);
        this.Q = new Choreographer.FrameCallback() {
            @Override
            public final void doFrame(long j10) {
                boolean z10;
                dc1 dc1Var = dc1.this;
                dc1Var.A = false;
                long j11 = dc1Var.f27411s;
                if (!dc1Var.f27412t && j11 != 0) {
                    boolean z11 = true;
                    if (dc1Var.f27404l.compareAndSet(false, true)) {
                        if (dc1Var.C && (dc1Var.f27407o.getAndSet(false) | dc1Var.f27406n.get())) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!dc1Var.C || !dc1Var.f27405m.getAndSet(false)) {
                            z11 = false;
                        }
                        WidgetSandboxNative.tick(j11, ((float) (j10 - dc1Var.f27402j)) / 1000000.0f, z11, z10, dc1Var.f27403k.getAndSet(false));
                    }
                }
            }
        };
        if (i10 >= 1 && i10 <= 4) {
            this.f27398c = context.getApplicationContext();
            this.d = str;
            this.f27416y = str2;
            str2.contains("\"dark\"");
            this.e = i10;
            this.f27399f = str3 == null ? "en-US" : str3;
            this.f27400g = str4 == null ? "{}" : str4;
            this.f27401i = context.getResources().getDisplayMetrics().density;
            return;
        }
        throw new IllegalArgumentException("CPU multiplier must be 1..4");
    }

    public final void a(int i10, String str, long j10) {
        byte[] bytes;
        long j11 = this.f27411s;
        if (!this.f27412t && j11 != 0) {
            if (str == null) {
                bytes = null;
            } else {
                bytes = str.getBytes(StandardCharsets.UTF_8);
            }
            WidgetSandboxNative.answerRequest(j11, j10, i10, bytes);
        }
    }

    public final void b() {
        if (!this.f27412t) {
            this.f27412t = true;
            this.I = null;
            this.f27396a.removeCallbacks(this.O);
            this.f27396a.removeCallbacks(this.N);
            this.f27396a.removeCallbacks(this.P);
            if (this.A) {
                Choreographer.getInstance().removeFrameCallback(this.Q);
            }
            this.A = false;
            synchronized (this.f27408p) {
                try {
                    ac1 ac1Var = this.F;
                    if (ac1Var != null) {
                        ac1Var.f26505a.c();
                    }
                    this.F = null;
                    this.G = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j10 = this.f27411s;
            this.f27411s = 0L;
            if (j10 != 0) {
                vb1.f33663a.execute(new zb1(j10));
            }
        }
    }

    public final void c(db1 db1Var, bc1[] bc1VarArr, double d, int i10, int i11, float f7, float f10, int i12, int i13, int i14, ic1 ic1Var) {
        Object obj;
        boolean z10 = this.v;
        Object obj2 = this.f27408p;
        synchronized (obj2) {
            try {
                try {
                    if (this.f27412t) {
                        db1Var.c();
                        return;
                    }
                    ac1 ac1Var = this.F;
                    if (ac1Var != null) {
                        ac1Var.f26505a.c();
                    }
                    try {
                        this.F = new ac1(db1Var, bc1VarArr, d, i10, i11, f7, f10, i12, i13, i14, ic1Var, z10, this.f27415x);
                        if (!this.H) {
                            this.H = true;
                            this.f27396a.post(this.N);
                        }
                        this.f27409q = i11;
                        this.f27410r = true;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void d() {
        if (!this.f27412t && this.f27411s != 0 && !this.A && !this.f27404l.get()) {
            if (!this.f27403k.get()) {
                if (this.C) {
                    if (!this.f27405m.get() && !this.f27406n.get() && !this.f27407o.get()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.A = true;
            Choreographer.getInstance().postFrameCallback(this.Q);
        }
    }

    public final void e(String str) {
        if (!this.f27412t && str != null && !str.equals(this.f27416y)) {
            this.f27416y = str;
            str.contains("\"dark\"");
            long j10 = this.f27411s;
            if (j10 != 0) {
                WidgetSandboxNative.theme(j10, str.getBytes(StandardCharsets.UTF_8));
            }
        }
    }

    public final void f(boolean z10) {
        if (!this.f27412t && this.C != z10) {
            this.C = z10;
            long j10 = this.f27411s;
            if (j10 != 0) {
                WidgetSandboxNative.visible(j10, z10);
            }
            if (z10) {
                d();
            }
        }
    }

    public final void g(final int i10) {
        final long j10;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (this.D == 0) {
                this.D = i10;
            }
            Trace.beginSection("WidgetSandbox:Create");
            try {
                try {
                    String absolutePath = vb1.a(this.f27398c).getAbsolutePath();
                    if (this.f27412t) {
                        return;
                    }
                    Charset charset = StandardCharsets.UTF_8;
                    byte[] bytes = absolutePath.getBytes(charset);
                    byte[] bytes2 = this.d.getBytes(charset);
                    byte[] bytes3 = this.f27416y.getBytes(charset);
                    float f7 = this.f27401i;
                    j10 = WidgetSandboxNative.create(bytes, bytes2, bytes3, i10 / f7, f7, this.e, this.f27399f.getBytes(charset), this.f27400g.getBytes(charset), this.h.getBytes(charset), LocaleController.getString(R.string.WidgetStopped).getBytes(charset), this.C, this.f27397b);
                    try {
                        final String str = this.f27416y;
                        this.f27396a.post(new Runnable() {
                            @Override
                            public final void run() {
                                dc1 dc1Var = dc1.this;
                                long j11 = j10;
                                int i11 = i10;
                                String str2 = str;
                                if (dc1Var.f27412t) {
                                    vb1.f33663a.execute(new zb1(j11));
                                    return;
                                }
                                dc1Var.f27411s = j11;
                                int i12 = dc1Var.D;
                                if (i12 != i11 && i12 > 0) {
                                    WidgetSandboxNative.width(j11, i12 / dc1Var.f27401i);
                                }
                                if (!dc1Var.f27416y.equals(str2)) {
                                    WidgetSandboxNative.theme(j11, dc1Var.f27416y.getBytes(StandardCharsets.UTF_8));
                                }
                                dc1Var.f27417z = true;
                                WidgetSandboxNative.visible(j11, dc1Var.C);
                                dc1Var.d();
                            }
                        });
                    } catch (Exception e) {
                        e = e;
                        if (j10 != 0) {
                            vb1.f33663a.execute(new zb1(j10));
                        }
                        this.f27396a.post(new d71(13, this, e));
                        throw e;
                    }
                } catch (Exception e10) {
                    e = e10;
                    j10 = 0;
                }
            } finally {
                Trace.endSection();
            }
        } else {
            throw new IllegalStateException("Start WidgetSandboxSession off UI");
        }
    }
}
