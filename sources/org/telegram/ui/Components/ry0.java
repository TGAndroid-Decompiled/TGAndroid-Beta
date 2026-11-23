package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
public final class ry0 implements zi.r0, org.telegram.messenger.fs {
    public final int f39434a;
    public final boolean f39435b;
    public final HashMap f39436c = new HashMap();
    public boolean d;

    public ry0(int i7, boolean z10) {
        this.f39434a = i7;
        this.f39435b = z10;
        org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.U1);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        py0 py0Var = (py0) this.f39436c.get(Long.valueOf(j3));
        if (!this.d && py0Var != null && !py0Var.f38616e) {
            e(py0Var);
            py0Var.f38614b = Math.max(py0Var.f38614b, j10 + j11);
            org.telegram.messenger.w7.G(this.f39434a).n(file.getAbsolutePath(), this.f39435b, py0Var.f38614b, 0L, null);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        py0 py0Var = (py0) this.f39436c.get(Long.valueOf(j3));
        if (!this.d && py0Var != null && !py0Var.f38616e) {
            e(py0Var);
            py0Var.f38614b = Math.max(py0Var.f38614b, j10);
            py0Var.f38615c = j10;
            org.telegram.messenger.w7.G(this.f39434a).n(file.getAbsolutePath(), this.f39435b, py0Var.f38614b, j10, null);
        }
    }

    public final synchronized void c(long j3) {
        py0 py0Var = (py0) this.f39436c.remove(Long.valueOf(j3));
        if (py0Var == null) {
            return;
        }
        py0Var.f38616e = true;
        if (py0Var.d) {
            org.telegram.messenger.w7.G(this.f39434a).b(py0Var.f38613a.getAbsolutePath(), this.f39435b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            org.telegram.messenger.ks.f(this.f39434a).n(this, org.telegram.messenger.ks.U1);
            if (z10) {
                Iterator it = this.f39436c.values().iterator();
                while (it.hasNext()) {
                    py0 py0Var = (py0) it.next();
                    if (py0Var.d && !py0Var.f38616e) {
                        org.telegram.messenger.w7.G(this.f39434a).b(py0Var.f38613a.getAbsolutePath(), this.f39435b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ry0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(py0 py0Var) {
        if (py0Var.d) {
            return;
        }
        py0Var.d = true;
        org.telegram.messenger.w7.G(this.f39434a).g0(py0Var.f38613a.getAbsolutePath(), this.f39435b, false, 1L, 33554432, false);
    }
}
