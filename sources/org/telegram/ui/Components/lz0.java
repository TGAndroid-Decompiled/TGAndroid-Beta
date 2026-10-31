package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
public final class lz0 implements li.u0, org.telegram.messenger.us {
    public final int f28228a;
    public final boolean f28229b;
    public final HashMap f28230c = new HashMap();
    public boolean d;

    public lz0(int i10, boolean z10) {
        this.f28228a = i10;
        this.f28229b = z10;
        org.telegram.messenger.zs.f(i10).b(this, org.telegram.messenger.zs.U1);
    }

    public final synchronized void a(long j10, File file, long j11, long j12) {
        jz0 jz0Var = (jz0) this.f28230c.get(Long.valueOf(j10));
        if (!this.d && jz0Var != null && !jz0Var.e) {
            e(jz0Var);
            jz0Var.f27579b = Math.max(jz0Var.f27579b, j11 + j12);
            org.telegram.messenger.b8.G(this.f28228a).n(file.getAbsolutePath(), this.f28229b, jz0Var.f27579b, 0L, null);
        }
    }

    public final synchronized void b(long j10, long j11, File file) {
        jz0 jz0Var = (jz0) this.f28230c.get(Long.valueOf(j10));
        if (!this.d && jz0Var != null && !jz0Var.e) {
            e(jz0Var);
            jz0Var.f27579b = Math.max(jz0Var.f27579b, j11);
            jz0Var.f27580c = j11;
            org.telegram.messenger.b8.G(this.f28228a).n(file.getAbsolutePath(), this.f28229b, jz0Var.f27579b, j11, null);
        }
    }

    public final synchronized void c(long j10) {
        jz0 jz0Var = (jz0) this.f28230c.remove(Long.valueOf(j10));
        if (jz0Var == null) {
            return;
        }
        jz0Var.e = true;
        if (jz0Var.d) {
            org.telegram.messenger.b8.G(this.f28228a).b(jz0Var.f27578a.getAbsolutePath(), this.f28229b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            org.telegram.messenger.zs.f(this.f28228a).n(this, org.telegram.messenger.zs.U1);
            if (z10) {
                Iterator it = this.f28230c.values().iterator();
                while (it.hasNext()) {
                    jz0 jz0Var = (jz0) it.next();
                    if (jz0Var.d && !jz0Var.e) {
                        org.telegram.messenger.b8.G(this.f28228a).b(jz0Var.f27578a.getAbsolutePath(), this.f28229b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lz0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(jz0 jz0Var) {
        if (jz0Var.d) {
            return;
        }
        jz0Var.d = true;
        org.telegram.messenger.b8.G(this.f28228a).h0(jz0Var.f27578a.getAbsolutePath(), this.f28229b, false, 1L, 33554432, false);
    }
}
