package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class r01 implements ki.p0, NotificationCenter.NotificationCenterDelegate {
    public final int f27798a;
    public final boolean f27799b;
    public final HashMap f27800c = new HashMap();
    public boolean d;

    public r01(int i10, boolean z10) {
        this.f27798a = i10;
        this.f27799b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        p01 p01Var = (p01) this.f27800c.get(Long.valueOf(j3));
        if (!this.d && p01Var != null && !p01Var.e) {
            e(p01Var);
            p01Var.f27209b = Math.max(p01Var.f27209b, j10 + j11);
            FileLoader.getInstance(this.f27798a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f27799b, p01Var.f27209b, 0L);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        p01 p01Var = (p01) this.f27800c.get(Long.valueOf(j3));
        if (!this.d && p01Var != null && !p01Var.e) {
            e(p01Var);
            p01Var.f27209b = Math.max(p01Var.f27209b, j10);
            p01Var.f27210c = j10;
            FileLoader.getInstance(this.f27798a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f27799b, p01Var.f27209b, j10);
        }
    }

    public final synchronized void c(long j3) {
        p01 p01Var = (p01) this.f27800c.remove(Long.valueOf(j3));
        if (p01Var == null) {
            return;
        }
        p01Var.e = true;
        if (p01Var.d) {
            FileLoader.getInstance(this.f27798a).cancelFileUpload(p01Var.f27208a.getAbsolutePath(), this.f27799b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f27798a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f27800c.values().iterator();
                while (it.hasNext()) {
                    p01 p01Var = (p01) it.next();
                    if (p01Var.d && !p01Var.e) {
                        FileLoader.getInstance(this.f27798a).cancelFileUpload(p01Var.f27208a.getAbsolutePath(), this.f27799b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r01.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(p01 p01Var) {
        if (p01Var.d) {
            return;
        }
        p01Var.d = true;
        FileLoader.getInstance(this.f27798a).uploadFile(p01Var.f27208a.getAbsolutePath(), this.f27799b, false, 1L, 33554432, false);
    }
}
