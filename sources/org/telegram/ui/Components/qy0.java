package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
public final class qy0 implements zi.r0, org.telegram.messenger.fs {
    public final int f38939a;
    public final boolean f38940b;
    public final HashMap f38941c = new HashMap();
    public boolean d;

    public qy0(int i7, boolean z10) {
        this.f38939a = i7;
        this.f38940b = z10;
        org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.U1);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        oy0 oy0Var = (oy0) this.f38941c.get(Long.valueOf(j3));
        if (!this.d && oy0Var != null && !oy0Var.f38192e) {
            e(oy0Var);
            oy0Var.f38190b = Math.max(oy0Var.f38190b, j10 + j11);
            org.telegram.messenger.w7.G(this.f38939a).n(file.getAbsolutePath(), this.f38940b, oy0Var.f38190b, 0L, null);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        oy0 oy0Var = (oy0) this.f38941c.get(Long.valueOf(j3));
        if (!this.d && oy0Var != null && !oy0Var.f38192e) {
            e(oy0Var);
            oy0Var.f38190b = Math.max(oy0Var.f38190b, j10);
            oy0Var.f38191c = j10;
            org.telegram.messenger.w7.G(this.f38939a).n(file.getAbsolutePath(), this.f38940b, oy0Var.f38190b, j10, null);
        }
    }

    public final synchronized void c(long j3) {
        oy0 oy0Var = (oy0) this.f38941c.remove(Long.valueOf(j3));
        if (oy0Var == null) {
            return;
        }
        oy0Var.f38192e = true;
        if (oy0Var.d) {
            org.telegram.messenger.w7.G(this.f38939a).b(oy0Var.f38189a.getAbsolutePath(), this.f38940b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            org.telegram.messenger.ks.f(this.f38939a).n(this, org.telegram.messenger.ks.U1);
            if (z10) {
                Iterator it = this.f38941c.values().iterator();
                while (it.hasNext()) {
                    oy0 oy0Var = (oy0) it.next();
                    if (oy0Var.d && !oy0Var.f38192e) {
                        org.telegram.messenger.w7.G(this.f38939a).b(oy0Var.f38189a.getAbsolutePath(), this.f38940b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qy0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(oy0 oy0Var) {
        if (oy0Var.d) {
            return;
        }
        oy0Var.d = true;
        org.telegram.messenger.w7.G(this.f38939a).g0(oy0Var.f38189a.getAbsolutePath(), this.f38940b, false, 1L, 33554432, false);
    }
}
