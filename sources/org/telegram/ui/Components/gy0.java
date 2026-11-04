package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
public final class gy0 implements wi.q0, org.telegram.messenger.cs {
    public final int f34230a;
    public final boolean f34231b;
    public final HashMap f34232c = new HashMap();
    public boolean d;

    public gy0(int i3, boolean z10) {
        this.f34230a = i3;
        this.f34231b = z10;
        org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.U1);
    }

    public final synchronized void a(long j10, File file, long j11, long j12) {
        ey0 ey0Var = (ey0) this.f34232c.get(Long.valueOf(j10));
        if (!this.d && ey0Var != null && !ey0Var.f33605e) {
            e(ey0Var);
            ey0Var.f33603b = Math.max(ey0Var.f33603b, j11 + j12);
            org.telegram.messenger.w7.G(this.f34230a).n(file.getAbsolutePath(), this.f34231b, ey0Var.f33603b, 0L, null);
        }
    }

    public final synchronized void b(long j10, long j11, File file) {
        ey0 ey0Var = (ey0) this.f34232c.get(Long.valueOf(j10));
        if (!this.d && ey0Var != null && !ey0Var.f33605e) {
            e(ey0Var);
            ey0Var.f33603b = Math.max(ey0Var.f33603b, j11);
            ey0Var.f33604c = j11;
            org.telegram.messenger.w7.G(this.f34230a).n(file.getAbsolutePath(), this.f34231b, ey0Var.f33603b, j11, null);
        }
    }

    public final synchronized void c(long j10) {
        ey0 ey0Var = (ey0) this.f34232c.remove(Long.valueOf(j10));
        if (ey0Var == null) {
            return;
        }
        ey0Var.f33605e = true;
        if (ey0Var.d) {
            org.telegram.messenger.w7.G(this.f34230a).b(ey0Var.f33602a.getAbsolutePath(), this.f34231b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            org.telegram.messenger.hs.f(this.f34230a).n(this, org.telegram.messenger.hs.U1);
            if (z10) {
                Iterator it = this.f34232c.values().iterator();
                while (it.hasNext()) {
                    ey0 ey0Var = (ey0) it.next();
                    if (ey0Var.d && !ey0Var.f33605e) {
                        org.telegram.messenger.w7.G(this.f34230a).b(ey0Var.f33602a.getAbsolutePath(), this.f34231b);
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
        org.telegram.messenger.w7.G(this.f34230a).h0(ey0Var.f33602a.getAbsolutePath(), this.f34231b, false, 1L, 33554432, false);
    }
}
