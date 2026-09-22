package org.telegram.ui.Components;

import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class r01 implements ki.n0, NotificationCenter.NotificationCenterDelegate {
    public final int f27746a;
    public final boolean f27747b;
    public final HashMap f27748c = new HashMap();
    public boolean d;

    public r01(int i10, boolean z10) {
        this.f27746a = i10;
        this.f27747b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3) {
        p01 p01Var = (p01) this.f27748c.remove(Long.valueOf(j3));
        if (p01Var == null) {
            return;
        }
        p01Var.e = true;
        if (p01Var.d) {
            FileLoader.getInstance(this.f27746a).cancelFileUpload(p01Var.f27217a.getAbsolutePath(), this.f27747b);
        }
    }

    public final synchronized void b(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f27746a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f27748c.values().iterator();
                while (it.hasNext()) {
                    p01 p01Var = (p01) it.next();
                    if (p01Var.d && !p01Var.e) {
                        FileLoader.getInstance(this.f27746a).cancelFileUpload(p01Var.f27217a.getAbsolutePath(), this.f27747b);
                    }
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(p01 p01Var) {
        if (p01Var.d) {
            return;
        }
        p01Var.d = true;
        FileLoader.getInstance(this.f27746a).uploadFile(p01Var.f27217a.getAbsolutePath(), this.f27747b, false, 1L, 33554432, false);
    }

    @Override
    public final synchronized void didReceivedNotification(int r4, int r5, java.lang.Object... r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r01.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
