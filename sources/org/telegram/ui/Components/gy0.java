package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
public final class gy0 implements wi.q0, org.telegram.messenger.ls {
    public final int f34099a;
    public final boolean f34100b;
    public final HashMap f34101c = new HashMap();
    public boolean d;

    public gy0(int i7, boolean z9) {
        this.f34099a = i7;
        this.f34100b = z9;
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.U1);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        ey0 ey0Var = (ey0) this.f34101c.get(Long.valueOf(j3));
        if (!this.d && ey0Var != null && !ey0Var.f33367e) {
            e(ey0Var);
            ey0Var.f33365b = Math.max(ey0Var.f33365b, j10 + j11);
            org.telegram.messenger.w7.G(this.f34099a).n(file.getAbsolutePath(), this.f34100b, ey0Var.f33365b, 0L, null);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        ey0 ey0Var = (ey0) this.f34101c.get(Long.valueOf(j3));
        if (!this.d && ey0Var != null && !ey0Var.f33367e) {
            e(ey0Var);
            ey0Var.f33365b = Math.max(ey0Var.f33365b, j10);
            ey0Var.f33366c = j10;
            org.telegram.messenger.w7.G(this.f34099a).n(file.getAbsolutePath(), this.f34100b, ey0Var.f33365b, j10, null);
        }
    }

    public final synchronized void c(long j3) {
        ey0 ey0Var = (ey0) this.f34101c.remove(Long.valueOf(j3));
        if (ey0Var == null) {
            return;
        }
        ey0Var.f33367e = true;
        if (ey0Var.d) {
            org.telegram.messenger.w7.G(this.f34099a).b(ey0Var.f33364a.getAbsolutePath(), this.f34100b);
        }
    }

    public final synchronized void d(boolean z9) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            org.telegram.messenger.qs.f(this.f34099a).n(this, org.telegram.messenger.qs.U1);
            if (z9) {
                Iterator it = this.f34101c.values().iterator();
                while (it.hasNext()) {
                    ey0 ey0Var = (ey0) it.next();
                    if (ey0Var.d && !ey0Var.f33367e) {
                        org.telegram.messenger.w7.G(this.f34099a).b(ey0Var.f33364a.getAbsolutePath(), this.f34100b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gy0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(ey0 ey0Var) {
        if (ey0Var.d) {
            return;
        }
        ey0Var.d = true;
        org.telegram.messenger.w7.G(this.f34099a).h0(ey0Var.f33364a.getAbsolutePath(), this.f34100b, false, 1L, 33554432, false);
    }
}
