package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
public final class jy0 implements zi.s0, org.telegram.messenger.is {
    public final int f36201a;
    public final boolean f36202b;
    public final HashMap f36203c = new HashMap();
    public boolean d;

    public jy0(int i7, boolean z10) {
        this.f36201a = i7;
        this.f36202b = z10;
        org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.U1);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        hy0 hy0Var = (hy0) this.f36203c.get(Long.valueOf(j3));
        if (!this.d && hy0Var != null && !hy0Var.f35373e) {
            e(hy0Var);
            hy0Var.f35371b = Math.max(hy0Var.f35371b, j10 + j11);
            org.telegram.messenger.w7.G(this.f36201a).n(file.getAbsolutePath(), this.f36202b, hy0Var.f35371b, 0L, null);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        hy0 hy0Var = (hy0) this.f36203c.get(Long.valueOf(j3));
        if (!this.d && hy0Var != null && !hy0Var.f35373e) {
            e(hy0Var);
            hy0Var.f35371b = Math.max(hy0Var.f35371b, j10);
            hy0Var.f35372c = j10;
            org.telegram.messenger.w7.G(this.f36201a).n(file.getAbsolutePath(), this.f36202b, hy0Var.f35371b, j10, null);
        }
    }

    public final synchronized void c(long j3) {
        hy0 hy0Var = (hy0) this.f36203c.remove(Long.valueOf(j3));
        if (hy0Var == null) {
            return;
        }
        hy0Var.f35373e = true;
        if (hy0Var.d) {
            org.telegram.messenger.w7.G(this.f36201a).b(hy0Var.f35370a.getAbsolutePath(), this.f36202b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            org.telegram.messenger.ns.f(this.f36201a).n(this, org.telegram.messenger.ns.U1);
            if (z10) {
                Iterator it = this.f36203c.values().iterator();
                while (it.hasNext()) {
                    hy0 hy0Var = (hy0) it.next();
                    if (hy0Var.d && !hy0Var.f35373e) {
                        org.telegram.messenger.w7.G(this.f36201a).b(hy0Var.f35370a.getAbsolutePath(), this.f36202b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jy0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(hy0 hy0Var) {
        if (hy0Var.d) {
            return;
        }
        hy0Var.d = true;
        org.telegram.messenger.w7.G(this.f36201a).g0(hy0Var.f35370a.getAbsolutePath(), this.f36202b, false, 1L, 33554432, false);
    }
}
