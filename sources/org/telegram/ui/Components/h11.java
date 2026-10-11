package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class h11 implements ki.s0, NotificationCenter.NotificationCenterDelegate {
    public final int f26935a;
    public final boolean f26936b;
    public final HashMap f26937c = new HashMap();
    public boolean d;

    public h11(int i10, boolean z10) {
        this.f26935a = i10;
        this.f26936b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        f11 f11Var = (f11) this.f26937c.get(Long.valueOf(j3));
        if (!this.d && f11Var != null && !f11Var.f26292e) {
            e(f11Var);
            f11Var.f26290b = Math.max(f11Var.f26290b, j10 + j11);
            FileLoader.getInstance(this.f26935a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f26936b, f11Var.f26290b, 0L);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        f11 f11Var = (f11) this.f26937c.get(Long.valueOf(j3));
        if (!this.d && f11Var != null && !f11Var.f26292e) {
            e(f11Var);
            f11Var.f26290b = Math.max(f11Var.f26290b, j10);
            f11Var.f26291c = j10;
            FileLoader.getInstance(this.f26935a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f26936b, f11Var.f26290b, j10);
        }
    }

    public final synchronized void c(long j3) {
        f11 f11Var = (f11) this.f26937c.remove(Long.valueOf(j3));
        if (f11Var == null) {
            return;
        }
        f11Var.f26292e = true;
        if (f11Var.d) {
            FileLoader.getInstance(this.f26935a).cancelFileUpload(f11Var.f26289a.getAbsolutePath(), this.f26936b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f26935a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f26937c.values().iterator();
                while (it.hasNext()) {
                    f11 f11Var = (f11) it.next();
                    if (f11Var.d && !f11Var.f26292e) {
                        FileLoader.getInstance(this.f26935a).cancelFileUpload(f11Var.f26289a.getAbsolutePath(), this.f26936b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h11.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(f11 f11Var) {
        if (f11Var.d) {
            return;
        }
        f11Var.d = true;
        FileLoader.getInstance(this.f26935a).uploadFile(f11Var.f26289a.getAbsolutePath(), this.f26936b, false, 1L, 33554432, false);
    }
}
