package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
public final class mz0 implements li.u0, org.telegram.messenger.vs {
    public final int f28615a;
    public final boolean f28616b;
    public final HashMap f28617c = new HashMap();
    public boolean d;

    public mz0(int i10, boolean z10) {
        this.f28615a = i10;
        this.f28616b = z10;
        org.telegram.messenger.at.f(i10).b(this, org.telegram.messenger.at.U1);
    }

    public final synchronized void a(long j10, File file, long j11, long j12) {
        kz0 kz0Var = (kz0) this.f28617c.get(Long.valueOf(j10));
        if (!this.d && kz0Var != null && !kz0Var.e) {
            e(kz0Var);
            kz0Var.f27991b = Math.max(kz0Var.f27991b, j11 + j12);
            org.telegram.messenger.b8.G(this.f28615a).n(file.getAbsolutePath(), this.f28616b, kz0Var.f27991b, 0L, null);
        }
    }

    public final synchronized void b(long j10, long j11, File file) {
        kz0 kz0Var = (kz0) this.f28617c.get(Long.valueOf(j10));
        if (!this.d && kz0Var != null && !kz0Var.e) {
            e(kz0Var);
            kz0Var.f27991b = Math.max(kz0Var.f27991b, j11);
            kz0Var.f27992c = j11;
            org.telegram.messenger.b8.G(this.f28615a).n(file.getAbsolutePath(), this.f28616b, kz0Var.f27991b, j11, null);
        }
    }

    public final synchronized void c(long j10) {
        kz0 kz0Var = (kz0) this.f28617c.remove(Long.valueOf(j10));
        if (kz0Var == null) {
            return;
        }
        kz0Var.e = true;
        if (kz0Var.d) {
            org.telegram.messenger.b8.G(this.f28615a).b(kz0Var.f27990a.getAbsolutePath(), this.f28616b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            org.telegram.messenger.at.f(this.f28615a).n(this, org.telegram.messenger.at.U1);
            if (z10) {
                Iterator it = this.f28617c.values().iterator();
                while (it.hasNext()) {
                    kz0 kz0Var = (kz0) it.next();
                    if (kz0Var.d && !kz0Var.e) {
                        org.telegram.messenger.b8.G(this.f28615a).b(kz0Var.f27990a.getAbsolutePath(), this.f28616b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mz0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(kz0 kz0Var) {
        if (kz0Var.d) {
            return;
        }
        kz0Var.d = true;
        org.telegram.messenger.b8.G(this.f28615a).h0(kz0Var.f27990a.getAbsolutePath(), this.f28616b, false, 1L, 33554432, false);
    }
}
