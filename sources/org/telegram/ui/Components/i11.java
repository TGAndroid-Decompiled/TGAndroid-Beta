package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class i11 implements ki.q0, NotificationCenter.NotificationCenterDelegate {
    public final int f27135a;
    public final boolean f27136b;
    public final HashMap f27137c = new HashMap();
    public boolean d;

    public i11(int i10, boolean z10) {
        this.f27135a = i10;
        this.f27136b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        g11 g11Var = (g11) this.f27137c.get(Long.valueOf(j3));
        if (!this.d && g11Var != null && !g11Var.f26568e) {
            e(g11Var);
            g11Var.f26566b = Math.max(g11Var.f26566b, j10 + j11);
            FileLoader.getInstance(this.f27135a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f27136b, g11Var.f26566b, 0L);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        g11 g11Var = (g11) this.f27137c.get(Long.valueOf(j3));
        if (!this.d && g11Var != null && !g11Var.f26568e) {
            e(g11Var);
            g11Var.f26566b = Math.max(g11Var.f26566b, j10);
            g11Var.f26567c = j10;
            FileLoader.getInstance(this.f27135a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f27136b, g11Var.f26566b, j10);
        }
    }

    public final synchronized void c(long j3) {
        g11 g11Var = (g11) this.f27137c.remove(Long.valueOf(j3));
        if (g11Var == null) {
            return;
        }
        g11Var.f26568e = true;
        if (g11Var.d) {
            FileLoader.getInstance(this.f27135a).cancelFileUpload(g11Var.f26565a.getAbsolutePath(), this.f27136b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f27135a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f27137c.values().iterator();
                while (it.hasNext()) {
                    g11 g11Var = (g11) it.next();
                    if (g11Var.d && !g11Var.f26568e) {
                        FileLoader.getInstance(this.f27135a).cancelFileUpload(g11Var.f26565a.getAbsolutePath(), this.f27136b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.i11.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(g11 g11Var) {
        if (g11Var.d) {
            return;
        }
        g11Var.d = true;
        FileLoader.getInstance(this.f27135a).uploadFile(g11Var.f26565a.getAbsolutePath(), this.f27136b, false, 1L, 33554432, false);
    }
}
