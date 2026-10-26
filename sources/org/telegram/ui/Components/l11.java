package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class l11 implements vi.p0, NotificationCenter.NotificationCenterDelegate {
    public final int f30027a;
    public final boolean f30028b;
    public final HashMap f30029c = new HashMap();
    public boolean d;

    public l11(int i10, boolean z10) {
        this.f30027a = i10;
        this.f30028b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j10, File file, long j11, long j12) {
        j11 j11Var = (j11) this.f30029c.get(Long.valueOf(j10));
        if (!this.d && j11Var != null && !j11Var.e) {
            e(j11Var);
            j11Var.f29448b = Math.max(j11Var.f29448b, j11 + j12);
            FileLoader.getInstance(this.f30027a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f30028b, j11Var.f29448b, 0L);
        }
    }

    public final synchronized void b(long j10, long j11, File file) {
        j11 j11Var = (j11) this.f30029c.get(Long.valueOf(j10));
        if (!this.d && j11Var != null && !j11Var.e) {
            e(j11Var);
            j11Var.f29448b = Math.max(j11Var.f29448b, j11);
            j11Var.f29449c = j11;
            FileLoader.getInstance(this.f30027a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f30028b, j11Var.f29448b, j11);
        }
    }

    public final synchronized void c(long j10) {
        j11 j11Var = (j11) this.f30029c.remove(Long.valueOf(j10));
        if (j11Var == null) {
            return;
        }
        j11Var.e = true;
        if (j11Var.d) {
            FileLoader.getInstance(this.f30027a).cancelFileUpload(j11Var.f29447a.getAbsolutePath(), this.f30028b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f30027a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f30029c.values().iterator();
                while (it.hasNext()) {
                    j11 j11Var = (j11) it.next();
                    if (j11Var.d && !j11Var.e) {
                        FileLoader.getInstance(this.f30027a).cancelFileUpload(j11Var.f29447a.getAbsolutePath(), this.f30028b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l11.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(j11 j11Var) {
        if (j11Var.d) {
            return;
        }
        j11Var.d = true;
        FileLoader.getInstance(this.f30027a).uploadFile(j11Var.f29447a.getAbsolutePath(), this.f30028b, false, 1L, 33554432, false);
    }
}
