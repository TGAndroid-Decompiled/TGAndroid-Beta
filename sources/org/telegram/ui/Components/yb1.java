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
public final class yb1 {
    public boolean A;
    public volatile boolean B;
    public int C;
    public vb1 D;
    public vb1 E;
    public JSONObject F;
    public boolean G;
    public xb1 H;
    public volatile b3 I;
    public volatile b3 J;
    public xb1 K;
    public String L;
    public final na1 M;
    public final na1 N;
    public final na1 O;
    public final sb1 P;
    public final Context f35005c;
    public final String d;
    public final int e;
    public final String f35006f;
    public final String f35007g;
    public final float h;
    public volatile int f35015p;
    public volatile boolean f35016q;
    public volatile long f35017r;
    public volatile boolean f35018s;
    public volatile boolean f35019t;
    public volatile boolean f35020u;
    public volatile boolean v;
    public volatile boolean f35021w;
    public String f35022x;
    public boolean f35023y;
    public boolean f35024z;
    public final Handler f35003a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend f35004b = new WidgetSandboxBackend(this);
    public final long f35008i = System.nanoTime();
    public final AtomicBoolean f35009j = new AtomicBoolean();
    public final AtomicBoolean f35010k = new AtomicBoolean();
    public final AtomicBoolean f35011l = new AtomicBoolean();
    public final AtomicBoolean f35012m = new AtomicBoolean();
    public final AtomicBoolean f35013n = new AtomicBoolean();
    public final Object f35014o = new Object();

    public yb1(Context context, String str, String str2, int i10, String str3, String str4) {
        new JSONObject();
        this.M = new na1(this, 5);
        this.N = new na1(this, 3);
        this.O = new na1(this, 4);
        this.P = new Choreographer.FrameCallback() {
            @Override
            public final void doFrame(long j10) {
                boolean z10;
                yb1 yb1Var = yb1.this;
                yb1Var.f35024z = false;
                long j11 = yb1Var.f35017r;
                if (!yb1Var.f35018s && j11 != 0) {
                    boolean z11 = true;
                    if (yb1Var.f35010k.compareAndSet(false, true)) {
                        if (yb1Var.B && (yb1Var.f35013n.getAndSet(false) | yb1Var.f35012m.get())) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!yb1Var.B || !yb1Var.f35011l.getAndSet(false)) {
                            z11 = false;
                        }
                        WidgetSandboxNative.tick(j11, ((float) (j10 - yb1Var.f35008i)) / 1000000.0f, z11, z10, yb1Var.f35009j.getAndSet(false));
                    }
                }
            }
        };
        if (i10 >= 1 && i10 <= 4) {
            this.f35005c = context.getApplicationContext();
            this.d = str;
            this.f35022x = str2;
            str2.contains("\"dark\"");
            this.e = i10;
            this.f35006f = str3 == null ? "en-US" : str3;
            this.f35007g = str4 == null ? "{}" : str4;
            this.h = context.getResources().getDisplayMetrics().density;
            return;
        }
        throw new IllegalArgumentException("CPU multiplier must be 1..4");
    }

    public final void a() {
        if (!this.f35018s) {
            this.f35018s = true;
            this.H = null;
            this.f35003a.removeCallbacks(this.N);
            this.f35003a.removeCallbacks(this.M);
            this.f35003a.removeCallbacks(this.O);
            if (this.f35024z) {
                Choreographer.getInstance().removeFrameCallback(this.P);
            }
            this.f35024z = false;
            synchronized (this.f35014o) {
                try {
                    vb1 vb1Var = this.E;
                    if (vb1Var != null) {
                        vb1Var.f33623a.c();
                    }
                    this.E = null;
                    this.F = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j10 = this.f35017r;
            this.f35017r = 0L;
            if (j10 != 0) {
                qb1.f31880a.execute(new ub1(j10));
            }
        }
    }

    public final void b(cb1 cb1Var, wb1[] wb1VarArr, double d, int i10, int i11, float f7, float f10, int i12, int i13, int i14, dc1 dc1Var) {
        Object obj;
        boolean z10 = this.f35020u;
        Object obj2 = this.f35014o;
        synchronized (obj2) {
            try {
                try {
                    if (this.f35018s) {
                        cb1Var.c();
                        return;
                    }
                    vb1 vb1Var = this.E;
                    if (vb1Var != null) {
                        vb1Var.f33623a.c();
                    }
                    try {
                        this.E = new vb1(cb1Var, wb1VarArr, d, i10, i11, f7, f10, i12, i13, i14, dc1Var, z10, this.f35021w);
                        if (!this.G) {
                            this.G = true;
                            this.f35003a.post(this.M);
                        }
                        this.f35015p = i11;
                        this.f35016q = true;
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

    public final void c() {
        if (!this.f35018s && this.f35017r != 0 && !this.f35024z && !this.f35010k.get()) {
            if (!this.f35009j.get()) {
                if (this.B) {
                    if (!this.f35011l.get() && !this.f35012m.get() && !this.f35013n.get()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f35024z = true;
            Choreographer.getInstance().postFrameCallback(this.P);
        }
    }

    public final void d(String str) {
        if (!this.f35018s && str != null && !str.equals(this.f35022x)) {
            this.f35022x = str;
            str.contains("\"dark\"");
            long j10 = this.f35017r;
            if (j10 != 0) {
                WidgetSandboxNative.theme(j10, str.getBytes(StandardCharsets.UTF_8));
            }
        }
    }

    public final void e(boolean z10) {
        if (!this.f35018s && this.B != z10) {
            this.B = z10;
            long j10 = this.f35017r;
            if (j10 != 0) {
                WidgetSandboxNative.visible(j10, z10);
            }
            if (z10) {
                c();
            }
        }
    }

    public final void f(final int i10) {
        final long j10;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (this.C == 0) {
                this.C = i10;
            }
            Trace.beginSection("WidgetSandbox:Create");
            try {
                try {
                    String absolutePath = qb1.a(this.f35005c).getAbsolutePath();
                    if (this.f35018s) {
                        return;
                    }
                    Charset charset = StandardCharsets.UTF_8;
                    byte[] bytes = absolutePath.getBytes(charset);
                    byte[] bytes2 = this.d.getBytes(charset);
                    byte[] bytes3 = this.f35022x.getBytes(charset);
                    float f7 = this.h;
                    j10 = WidgetSandboxNative.create(bytes, bytes2, bytes3, i10 / f7, f7, this.e, this.f35006f.getBytes(charset), this.f35007g.getBytes(charset), LocaleController.getString(R.string.WidgetStopped).getBytes(charset), this.B, this.f35004b);
                    try {
                        final String str = this.f35022x;
                        this.f35003a.post(new Runnable() {
                            @Override
                            public final void run() {
                                yb1 yb1Var = yb1.this;
                                long j11 = j10;
                                int i11 = i10;
                                String str2 = str;
                                if (yb1Var.f35018s) {
                                    qb1.f31880a.execute(new ub1(j11));
                                    return;
                                }
                                yb1Var.f35017r = j11;
                                int i12 = yb1Var.C;
                                if (i12 != i11 && i12 > 0) {
                                    WidgetSandboxNative.width(j11, i12 / yb1Var.h);
                                }
                                if (!yb1Var.f35022x.equals(str2)) {
                                    WidgetSandboxNative.theme(j11, yb1Var.f35022x.getBytes(StandardCharsets.UTF_8));
                                }
                                yb1Var.f35023y = true;
                                WidgetSandboxNative.visible(j11, yb1Var.B);
                                yb1Var.c();
                            }
                        });
                    } catch (Exception e) {
                        e = e;
                        if (j10 != 0) {
                            qb1.f31880a.execute(new ub1(j10));
                        }
                        this.f35003a.post(new c71(12, this, e));
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
