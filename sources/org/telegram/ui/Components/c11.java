package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class c11 implements li.r0, NotificationCenter.NotificationCenterDelegate {
    public final int f23911a;
    public final boolean f23912b;
    public final HashMap f23913c = new HashMap();
    public boolean d;

    public c11(int i10, boolean z10) {
        this.f23911a = i10;
        this.f23912b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j10, File file, long j11, long j12) {
        a11 a11Var = (a11) this.f23913c.get(Long.valueOf(j10));
        if (!this.d && a11Var != null && !a11Var.e) {
            e(a11Var);
            a11Var.f23410b = Math.max(a11Var.f23410b, j11 + j12);
            FileLoader.getInstance(this.f23911a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f23912b, a11Var.f23410b, 0L);
        }
    }

    public final synchronized void b(long j10, long j11, File file) {
        a11 a11Var = (a11) this.f23913c.get(Long.valueOf(j10));
        if (!this.d && a11Var != null && !a11Var.e) {
            e(a11Var);
            a11Var.f23410b = Math.max(a11Var.f23410b, j11);
            a11Var.f23411c = j11;
            FileLoader.getInstance(this.f23911a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f23912b, a11Var.f23410b, j11);
        }
    }

    public final synchronized void c(long j10) {
        a11 a11Var = (a11) this.f23913c.remove(Long.valueOf(j10));
        if (a11Var == null) {
            return;
        }
        a11Var.e = true;
        if (a11Var.d) {
            FileLoader.getInstance(this.f23911a).cancelFileUpload(a11Var.f23409a.getAbsolutePath(), this.f23912b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f23911a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f23913c.values().iterator();
                while (it.hasNext()) {
                    a11 a11Var = (a11) it.next();
                    if (a11Var.d && !a11Var.e) {
                        FileLoader.getInstance(this.f23911a).cancelFileUpload(a11Var.f23409a.getAbsolutePath(), this.f23912b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c11.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(a11 a11Var) {
        if (a11Var.d) {
            return;
        }
        a11Var.d = true;
        FileLoader.getInstance(this.f23911a).uploadFile(a11Var.f23409a.getAbsolutePath(), this.f23912b, false, 1L, 33554432, false);
    }
}
