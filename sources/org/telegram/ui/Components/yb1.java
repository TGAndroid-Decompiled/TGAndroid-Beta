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
    public final Context f35002c;
    public final String d;
    public final int e;
    public final String f35003f;
    public final String f35004g;
    public final float h;
    public volatile int f35012p;
    public volatile boolean f35013q;
    public volatile long f35014r;
    public volatile boolean f35015s;
    public volatile boolean f35016t;
    public volatile boolean f35017u;
    public volatile boolean v;
    public volatile boolean f35018w;
    public String f35019x;
    public boolean f35020y;
    public boolean f35021z;
    public final Handler f35000a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend f35001b = new WidgetSandboxBackend(this);
    public final long f35005i = System.nanoTime();
    public final AtomicBoolean f35006j = new AtomicBoolean();
    public final AtomicBoolean f35007k = new AtomicBoolean();
    public final AtomicBoolean f35008l = new AtomicBoolean();
    public final AtomicBoolean f35009m = new AtomicBoolean();
    public final AtomicBoolean f35010n = new AtomicBoolean();
    public final Object f35011o = new Object();

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
                yb1Var.f35021z = false;
                long j11 = yb1Var.f35014r;
                if (!yb1Var.f35015s && j11 != 0) {
                    boolean z11 = true;
                    if (yb1Var.f35007k.compareAndSet(false, true)) {
                        if (yb1Var.B && (yb1Var.f35010n.getAndSet(false) | yb1Var.f35009m.get())) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!yb1Var.B || !yb1Var.f35008l.getAndSet(false)) {
                            z11 = false;
                        }
                        WidgetSandboxNative.tick(j11, ((float) (j10 - yb1Var.f35005i)) / 1000000.0f, z11, z10, yb1Var.f35006j.getAndSet(false));
                    }
                }
            }
        };
        if (i10 >= 1 && i10 <= 4) {
            this.f35002c = context.getApplicationContext();
            this.d = str;
            this.f35019x = str2;
            str2.contains("\"dark\"");
            this.e = i10;
            this.f35003f = str3 == null ? "en-US" : str3;
            this.f35004g = str4 == null ? "{}" : str4;
            this.h = context.getResources().getDisplayMetrics().density;
            return;
        }
        throw new IllegalArgumentException("CPU multiplier must be 1..4");
    }

    public final void a() {
        if (!this.f35015s) {
            this.f35015s = true;
            this.H = null;
            this.f35000a.removeCallbacks(this.N);
            this.f35000a.removeCallbacks(this.M);
            this.f35000a.removeCallbacks(this.O);
            if (this.f35021z) {
                Choreographer.getInstance().removeFrameCallback(this.P);
            }
            this.f35021z = false;
            synchronized (this.f35011o) {
                try {
                    vb1 vb1Var = this.E;
                    if (vb1Var != null) {
                        vb1Var.f33620a.c();
                    }
                    this.E = null;
                    this.F = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j10 = this.f35014r;
            this.f35014r = 0L;
            if (j10 != 0) {
                qb1.f31878a.execute(new ub1(j10));
            }
        }
    }

    public final void b(cb1 cb1Var, wb1[] wb1VarArr, double d, int i10, int i11, float f7, float f10, int i12, int i13, int i14, dc1 dc1Var) {
        Object obj;
        boolean z10 = this.f35017u;
        Object obj2 = this.f35011o;
        synchronized (obj2) {
            try {
                try {
                    if (this.f35015s) {
                        cb1Var.c();
                        return;
                    }
                    vb1 vb1Var = this.E;
                    if (vb1Var != null) {
                        vb1Var.f33620a.c();
                    }
                    try {
                        this.E = new vb1(cb1Var, wb1VarArr, d, i10, i11, f7, f10, i12, i13, i14, dc1Var, z10, this.f35018w);
                        if (!this.G) {
                            this.G = true;
                            this.f35000a.post(this.M);
                        }
                        this.f35012p = i11;
                        this.f35013q = true;
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
        if (!this.f35015s && this.f35014r != 0 && !this.f35021z && !this.f35007k.get()) {
            if (!this.f35006j.get()) {
                if (this.B) {
                    if (!this.f35008l.get() && !this.f35009m.get() && !this.f35010n.get()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f35021z = true;
            Choreographer.getInstance().postFrameCallback(this.P);
        }
    }

    public final void d(String str) {
        if (!this.f35015s && str != null && !str.equals(this.f35019x)) {
            this.f35019x = str;
            str.contains("\"dark\"");
            long j10 = this.f35014r;
            if (j10 != 0) {
                WidgetSandboxNative.theme(j10, str.getBytes(StandardCharsets.UTF_8));
            }
        }
    }

    public final void e(boolean z10) {
        if (!this.f35015s && this.B != z10) {
            this.B = z10;
            long j10 = this.f35014r;
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
                    String absolutePath = qb1.a(this.f35002c).getAbsolutePath();
                    if (this.f35015s) {
                        return;
                    }
                    Charset charset = StandardCharsets.UTF_8;
                    byte[] bytes = absolutePath.getBytes(charset);
                    byte[] bytes2 = this.d.getBytes(charset);
                    byte[] bytes3 = this.f35019x.getBytes(charset);
                    float f7 = this.h;
                    j10 = WidgetSandboxNative.create(bytes, bytes2, bytes3, i10 / f7, f7, this.e, this.f35003f.getBytes(charset), this.f35004g.getBytes(charset), LocaleController.getString(R.string.WidgetStopped).getBytes(charset), this.B, this.f35001b);
                    try {
                        final String str = this.f35019x;
                        this.f35000a.post(new Runnable() {
                            @Override
                            public final void run() {
                                yb1 yb1Var = yb1.this;
                                long j11 = j10;
                                int i11 = i10;
                                String str2 = str;
                                if (yb1Var.f35015s) {
                                    qb1.f31878a.execute(new ub1(j11));
                                    return;
                                }
                                yb1Var.f35014r = j11;
                                int i12 = yb1Var.C;
                                if (i12 != i11 && i12 > 0) {
                                    WidgetSandboxNative.width(j11, i12 / yb1Var.h);
                                }
                                if (!yb1Var.f35019x.equals(str2)) {
                                    WidgetSandboxNative.theme(j11, yb1Var.f35019x.getBytes(StandardCharsets.UTF_8));
                                }
                                yb1Var.f35020y = true;
                                WidgetSandboxNative.visible(j11, yb1Var.B);
                                yb1Var.c();
                            }
                        });
                    } catch (Exception e) {
                        e = e;
                        if (j10 != 0) {
                            qb1.f31878a.execute(new ub1(j10));
                        }
                        this.f35000a.post(new c71(12, this, e));
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
