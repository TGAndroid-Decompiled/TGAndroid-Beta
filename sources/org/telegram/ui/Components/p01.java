package org.telegram.ui.Components;

import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class p01 implements ki.l0, NotificationCenter.NotificationCenterDelegate {
    public final int f27106a;
    public final boolean f27107b;
    public final HashMap f27108c = new HashMap();
    public boolean d;

    public p01(int i10, boolean z10) {
        this.f27106a = i10;
        this.f27107b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3) {
        n01 n01Var = (n01) this.f27108c.remove(Long.valueOf(j3));
        if (n01Var == null) {
            return;
        }
        n01Var.e = true;
        if (n01Var.d) {
            FileLoader.getInstance(this.f27106a).cancelFileUpload(n01Var.f26527a.getAbsolutePath(), this.f27107b);
        }
    }

    public final synchronized void b(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f27106a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f27108c.values().iterator();
                while (it.hasNext()) {
                    n01 n01Var = (n01) it.next();
                    if (n01Var.d && !n01Var.e) {
                        FileLoader.getInstance(this.f27106a).cancelFileUpload(n01Var.f26527a.getAbsolutePath(), this.f27107b);
                    }
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(n01 n01Var) {
        if (n01Var.d) {
            return;
        }
        n01Var.d = true;
        FileLoader.getInstance(this.f27106a).uploadFile(n01Var.f26527a.getAbsolutePath(), this.f27107b, false, 1L, 33554432, false);
    }

    @Override
    public final synchronized void didReceivedNotification(int r4, int r5, java.lang.Object... r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p01.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
