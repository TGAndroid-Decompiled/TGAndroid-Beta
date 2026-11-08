package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
public final class hy0 implements wi.q0, org.telegram.messenger.ls {
    public final int f34475a;
    public final boolean f34476b;
    public final HashMap f34477c = new HashMap();
    public boolean d;

    public hy0(int i7, boolean z9) {
        this.f34475a = i7;
        this.f34476b = z9;
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.U1);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        fy0 fy0Var = (fy0) this.f34477c.get(Long.valueOf(j3));
        if (!this.d && fy0Var != null && !fy0Var.f33694e) {
            e(fy0Var);
            fy0Var.f33692b = Math.max(fy0Var.f33692b, j10 + j11);
            org.telegram.messenger.w7.G(this.f34475a).n(file.getAbsolutePath(), this.f34476b, fy0Var.f33692b, 0L, null);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        fy0 fy0Var = (fy0) this.f34477c.get(Long.valueOf(j3));
        if (!this.d && fy0Var != null && !fy0Var.f33694e) {
            e(fy0Var);
            fy0Var.f33692b = Math.max(fy0Var.f33692b, j10);
            fy0Var.f33693c = j10;
            org.telegram.messenger.w7.G(this.f34475a).n(file.getAbsolutePath(), this.f34476b, fy0Var.f33692b, j10, null);
        }
    }

    public final synchronized void c(long j3) {
        fy0 fy0Var = (fy0) this.f34477c.remove(Long.valueOf(j3));
        if (fy0Var == null) {
            return;
        }
        fy0Var.f33694e = true;
        if (fy0Var.d) {
            org.telegram.messenger.w7.G(this.f34475a).b(fy0Var.f33691a.getAbsolutePath(), this.f34476b);
        }
    }

    public final synchronized void d(boolean z9) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            org.telegram.messenger.qs.f(this.f34475a).n(this, org.telegram.messenger.qs.U1);
            if (z9) {
                Iterator it = this.f34477c.values().iterator();
                while (it.hasNext()) {
                    fy0 fy0Var = (fy0) it.next();
                    if (fy0Var.d && !fy0Var.f33694e) {
                        org.telegram.messenger.w7.G(this.f34475a).b(fy0Var.f33691a.getAbsolutePath(), this.f34476b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hy0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(fy0 fy0Var) {
        if (fy0Var.d) {
            return;
        }
        fy0Var.d = true;
        org.telegram.messenger.w7.G(this.f34475a).g0(fy0Var.f33691a.getAbsolutePath(), this.f34476b, false, 1L, 33554432, false);
    }
}
