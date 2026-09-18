package org.telegram.ui.Components;

import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class q01 implements ki.f0, NotificationCenter.NotificationCenterDelegate {
    public final int f27399a;
    public final boolean f27400b;
    public final HashMap f27401c = new HashMap();
    public boolean d;

    public q01(int i10, boolean z10) {
        this.f27399a = i10;
        this.f27400b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3) {
        o01 o01Var = (o01) this.f27401c.remove(Long.valueOf(j3));
        if (o01Var == null) {
            return;
        }
        o01Var.e = true;
        if (o01Var.d) {
            FileLoader.getInstance(this.f27399a).cancelFileUpload(o01Var.f26805a.getAbsolutePath(), this.f27400b);
        }
    }

    public final synchronized void b(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f27399a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f27401c.values().iterator();
                while (it.hasNext()) {
                    o01 o01Var = (o01) it.next();
                    if (o01Var.d && !o01Var.e) {
                        FileLoader.getInstance(this.f27399a).cancelFileUpload(o01Var.f26805a.getAbsolutePath(), this.f27400b);
                    }
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c(o01 o01Var) {
        if (o01Var.d) {
            return;
        }
        o01Var.d = true;
        FileLoader.getInstance(this.f27399a).uploadFile(o01Var.f26805a.getAbsolutePath(), this.f27400b, false, 1L, 33554432, false);
    }

    @Override
    public final synchronized void didReceivedNotification(int r4, int r5, java.lang.Object... r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q01.didReceivedNotification(int, int, java.lang.Object[]):void");
    }
}
