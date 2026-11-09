package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
public final class iy0 implements wi.q0, org.telegram.messenger.ls {
    public final int f34880a;
    public final boolean f34881b;
    public final HashMap f34882c = new HashMap();
    public boolean d;

    public iy0(int i7, boolean z9) {
        this.f34880a = i7;
        this.f34881b = z9;
        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.U1);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        gy0 gy0Var = (gy0) this.f34882c.get(Long.valueOf(j3));
        if (!this.d && gy0Var != null && !gy0Var.f34093e) {
            e(gy0Var);
            gy0Var.f34091b = Math.max(gy0Var.f34091b, j10 + j11);
            org.telegram.messenger.w7.G(this.f34880a).n(file.getAbsolutePath(), this.f34881b, gy0Var.f34091b, 0L, null);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        gy0 gy0Var = (gy0) this.f34882c.get(Long.valueOf(j3));
        if (!this.d && gy0Var != null && !gy0Var.f34093e) {
            e(gy0Var);
            gy0Var.f34091b = Math.max(gy0Var.f34091b, j10);
            gy0Var.f34092c = j10;
            org.telegram.messenger.w7.G(this.f34880a).n(file.getAbsolutePath(), this.f34881b, gy0Var.f34091b, j10, null);
        }
    }

    public final synchronized void c(long j3) {
        gy0 gy0Var = (gy0) this.f34882c.remove(Long.valueOf(j3));
        if (gy0Var == null) {
            return;
        }
        gy0Var.f34093e = true;
        if (gy0Var.d) {
            org.telegram.messenger.w7.G(this.f34880a).b(gy0Var.f34090a.getAbsolutePath(), this.f34881b);
        }
    }

    public final synchronized void d(boolean z9) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            org.telegram.messenger.qs.f(this.f34880a).n(this, org.telegram.messenger.qs.U1);
            if (z9) {
                Iterator it = this.f34882c.values().iterator();
                while (it.hasNext()) {
                    gy0 gy0Var = (gy0) it.next();
                    if (gy0Var.d && !gy0Var.f34093e) {
                        org.telegram.messenger.w7.G(this.f34880a).b(gy0Var.f34090a.getAbsolutePath(), this.f34881b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.iy0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(gy0 gy0Var) {
        if (gy0Var.d) {
            return;
        }
        gy0Var.d = true;
        org.telegram.messenger.w7.G(this.f34880a).g0(gy0Var.f34090a.getAbsolutePath(), this.f34881b, false, 1L, 33554432, false);
    }
}
