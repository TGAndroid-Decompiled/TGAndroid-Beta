package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
public final class sy0 implements zi.r0, org.telegram.messenger.fs {
    public final int f39731a;
    public final boolean f39732b;
    public final HashMap f39733c = new HashMap();
    public boolean d;

    public sy0(int i7, boolean z10) {
        this.f39731a = i7;
        this.f39732b = z10;
        org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.U1);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        qy0 qy0Var = (qy0) this.f39733c.get(Long.valueOf(j3));
        if (!this.d && qy0Var != null && !qy0Var.f39022e) {
            e(qy0Var);
            qy0Var.f39020b = Math.max(qy0Var.f39020b, j10 + j11);
            org.telegram.messenger.w7.G(this.f39731a).n(file.getAbsolutePath(), this.f39732b, qy0Var.f39020b, 0L, null);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        qy0 qy0Var = (qy0) this.f39733c.get(Long.valueOf(j3));
        if (!this.d && qy0Var != null && !qy0Var.f39022e) {
            e(qy0Var);
            qy0Var.f39020b = Math.max(qy0Var.f39020b, j10);
            qy0Var.f39021c = j10;
            org.telegram.messenger.w7.G(this.f39731a).n(file.getAbsolutePath(), this.f39732b, qy0Var.f39020b, j10, null);
        }
    }

    public final synchronized void c(long j3) {
        qy0 qy0Var = (qy0) this.f39733c.remove(Long.valueOf(j3));
        if (qy0Var == null) {
            return;
        }
        qy0Var.f39022e = true;
        if (qy0Var.d) {
            org.telegram.messenger.w7.G(this.f39731a).b(qy0Var.f39019a.getAbsolutePath(), this.f39732b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            org.telegram.messenger.ks.f(this.f39731a).n(this, org.telegram.messenger.ks.U1);
            if (z10) {
                Iterator it = this.f39733c.values().iterator();
                while (it.hasNext()) {
                    qy0 qy0Var = (qy0) it.next();
                    if (qy0Var.d && !qy0Var.f39022e) {
                        org.telegram.messenger.w7.G(this.f39731a).b(qy0Var.f39019a.getAbsolutePath(), this.f39732b);
                    }
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final synchronized void didReceivedNotification(int r4, int r5, java.lang.Object... r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sy0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(qy0 qy0Var) {
        if (qy0Var.d) {
            return;
        }
        qy0Var.d = true;
        org.telegram.messenger.w7.G(this.f39731a).g0(qy0Var.f39019a.getAbsolutePath(), this.f39732b, false, 1L, 33554432, false);
    }
}
