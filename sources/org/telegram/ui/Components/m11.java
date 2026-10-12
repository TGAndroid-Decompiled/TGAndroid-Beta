package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class m11 implements qi.m0, NotificationCenter.NotificationCenterDelegate {
    public final int f28358a;
    public final boolean f28359b;
    public final HashMap f28360c = new HashMap();
    public boolean d;

    public m11(int i10, boolean z10) {
        this.f28358a = i10;
        this.f28359b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        k11 k11Var = (k11) this.f28360c.get(Long.valueOf(j3));
        if (!this.d && k11Var != null && !k11Var.f27724e) {
            e(k11Var);
            k11Var.f27722b = Math.max(k11Var.f27722b, j10 + j11);
            FileLoader.getInstance(this.f28358a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f28359b, k11Var.f27722b, 0L);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        k11 k11Var = (k11) this.f28360c.get(Long.valueOf(j3));
        if (!this.d && k11Var != null && !k11Var.f27724e) {
            e(k11Var);
            k11Var.f27722b = Math.max(k11Var.f27722b, j10);
            k11Var.f27723c = j10;
            FileLoader.getInstance(this.f28358a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f28359b, k11Var.f27722b, j10);
        }
    }

    public final synchronized void c(long j3) {
        k11 k11Var = (k11) this.f28360c.remove(Long.valueOf(j3));
        if (k11Var == null) {
            return;
        }
        k11Var.f27724e = true;
        if (k11Var.d) {
            FileLoader.getInstance(this.f28358a).cancelFileUpload(k11Var.f27721a.getAbsolutePath(), this.f28359b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f28358a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f28360c.values().iterator();
                while (it.hasNext()) {
                    k11 k11Var = (k11) it.next();
                    if (k11Var.d && !k11Var.f27724e) {
                        FileLoader.getInstance(this.f28358a).cancelFileUpload(k11Var.f27721a.getAbsolutePath(), this.f28359b);
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
        FileLoader.getInstance(this.f28358a).uploadFile(k11Var.f27721a.getAbsolutePath(), this.f28359b, false, 1L, 33554432, false);
    }
}
