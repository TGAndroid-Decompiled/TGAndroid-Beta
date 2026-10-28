package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class m11 implements vi.r0, NotificationCenter.NotificationCenterDelegate {
    public final int f30337a;
    public final boolean f30338b;
    public final HashMap f30339c = new HashMap();
    public boolean d;

    public m11(int i10, boolean z10) {
        this.f30337a = i10;
        this.f30338b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j10, File file, long j11, long j12) {
        k11 k11Var = (k11) this.f30339c.get(Long.valueOf(j10));
        if (!this.d && k11Var != null && !k11Var.e) {
            e(k11Var);
            k11Var.f29823b = Math.max(k11Var.f29823b, j11 + j12);
            FileLoader.getInstance(this.f30337a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f30338b, k11Var.f29823b, 0L);
        }
    }

    public final synchronized void b(long j10, long j11, File file) {
        k11 k11Var = (k11) this.f30339c.get(Long.valueOf(j10));
        if (!this.d && k11Var != null && !k11Var.e) {
            e(k11Var);
            k11Var.f29823b = Math.max(k11Var.f29823b, j11);
            k11Var.f29824c = j11;
            FileLoader.getInstance(this.f30337a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f30338b, k11Var.f29823b, j11);
        }
    }

    public final synchronized void c(long j10) {
        k11 k11Var = (k11) this.f30339c.remove(Long.valueOf(j10));
        if (k11Var == null) {
            return;
        }
        k11Var.e = true;
        if (k11Var.d) {
            FileLoader.getInstance(this.f30337a).cancelFileUpload(k11Var.f29822a.getAbsolutePath(), this.f30338b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f30337a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f30339c.values().iterator();
                while (it.hasNext()) {
                    k11 k11Var = (k11) it.next();
                    if (k11Var.d && !k11Var.e) {
                        FileLoader.getInstance(this.f30337a).cancelFileUpload(k11Var.f29822a.getAbsolutePath(), this.f30338b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m11.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(k11 k11Var) {
        if (k11Var.d) {
            return;
        }
        k11Var.d = true;
        FileLoader.getInstance(this.f30337a).uploadFile(k11Var.f29822a.getAbsolutePath(), this.f30338b, false, 1L, 33554432, false);
    }
}
