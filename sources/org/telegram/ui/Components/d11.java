package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class d11 implements ri.o0, NotificationCenter.NotificationCenterDelegate {
    public final int f23942a;
    public final boolean f23943b;
    public final HashMap f23944c = new HashMap();
    public boolean d;

    public d11(int i10, boolean z10) {
        this.f23942a = i10;
        this.f23943b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j10, File file, long j11, long j12) {
        b11 b11Var = (b11) this.f23944c.get(Long.valueOf(j10));
        if (!this.d && b11Var != null && !b11Var.e) {
            e(b11Var);
            b11Var.f23357b = Math.max(b11Var.f23357b, j11 + j12);
            FileLoader.getInstance(this.f23942a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f23943b, b11Var.f23357b, 0L);
        }
    }

    public final synchronized void b(long j10, long j11, File file) {
        b11 b11Var = (b11) this.f23944c.get(Long.valueOf(j10));
        if (!this.d && b11Var != null && !b11Var.e) {
            e(b11Var);
            b11Var.f23357b = Math.max(b11Var.f23357b, j11);
            b11Var.f23358c = j11;
            FileLoader.getInstance(this.f23942a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f23943b, b11Var.f23357b, j11);
        }
    }

    public final synchronized void c(long j10) {
        b11 b11Var = (b11) this.f23944c.remove(Long.valueOf(j10));
        if (b11Var == null) {
            return;
        }
        b11Var.e = true;
        if (b11Var.d) {
            FileLoader.getInstance(this.f23942a).cancelFileUpload(b11Var.f23356a.getAbsolutePath(), this.f23943b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f23942a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f23944c.values().iterator();
                while (it.hasNext()) {
                    b11 b11Var = (b11) it.next();
                    if (b11Var.d && !b11Var.e) {
                        FileLoader.getInstance(this.f23942a).cancelFileUpload(b11Var.f23356a.getAbsolutePath(), this.f23943b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d11.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(b11 b11Var) {
        if (b11Var.d) {
            return;
        }
        b11Var.d = true;
        FileLoader.getInstance(this.f23942a).uploadFile(b11Var.f23356a.getAbsolutePath(), this.f23943b, false, 1L, 33554432, false);
    }
}
