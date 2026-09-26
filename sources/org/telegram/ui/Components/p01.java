package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class p01 implements ki.p0, NotificationCenter.NotificationCenterDelegate {
    public final int f27179a;
    public final boolean f27180b;
    public final HashMap f27181c = new HashMap();
    public boolean d;

    public p01(int i10, boolean z10) {
        this.f27179a = i10;
        this.f27180b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        n01 n01Var = (n01) this.f27181c.get(Long.valueOf(j3));
        if (!this.d && n01Var != null && !n01Var.e) {
            e(n01Var);
            n01Var.f26636b = Math.max(n01Var.f26636b, j10 + j11);
            FileLoader.getInstance(this.f27179a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f27180b, n01Var.f26636b, 0L);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        n01 n01Var = (n01) this.f27181c.get(Long.valueOf(j3));
        if (!this.d && n01Var != null && !n01Var.e) {
            e(n01Var);
            n01Var.f26636b = Math.max(n01Var.f26636b, j10);
            n01Var.f26637c = j10;
            FileLoader.getInstance(this.f27179a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f27180b, n01Var.f26636b, j10);
        }
    }

    public final synchronized void c(long j3) {
        n01 n01Var = (n01) this.f27181c.remove(Long.valueOf(j3));
        if (n01Var == null) {
            return;
        }
        n01Var.e = true;
        if (n01Var.d) {
            FileLoader.getInstance(this.f27179a).cancelFileUpload(n01Var.f26635a.getAbsolutePath(), this.f27180b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f27179a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f27181c.values().iterator();
                while (it.hasNext()) {
                    n01 n01Var = (n01) it.next();
                    if (n01Var.d && !n01Var.e) {
                        FileLoader.getInstance(this.f27179a).cancelFileUpload(n01Var.f26635a.getAbsolutePath(), this.f27180b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p01.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(n01 n01Var) {
        if (n01Var.d) {
            return;
        }
        n01Var.d = true;
        FileLoader.getInstance(this.f27179a).uploadFile(n01Var.f26635a.getAbsolutePath(), this.f27180b, false, 1L, 33554432, false);
    }
}
