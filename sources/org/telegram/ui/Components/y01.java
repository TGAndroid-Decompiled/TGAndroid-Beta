package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class y01 implements si.p0, NotificationCenter.NotificationCenterDelegate {
    public final int f32511a;
    public final boolean f32512b;
    public final HashMap f32513c = new HashMap();
    public boolean d;

    public y01(int i10, boolean z10) {
        this.f32511a = i10;
        this.f32512b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j10, File file, long j11, long j12) {
        w01 w01Var = (w01) this.f32513c.get(Long.valueOf(j10));
        if (!this.d && w01Var != null && !w01Var.e) {
            e(w01Var);
            w01Var.f31966b = Math.max(w01Var.f31966b, j11 + j12);
            FileLoader.getInstance(this.f32511a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f32512b, w01Var.f31966b, 0L);
        }
    }

    public final synchronized void b(long j10, long j11, File file) {
        w01 w01Var = (w01) this.f32513c.get(Long.valueOf(j10));
        if (!this.d && w01Var != null && !w01Var.e) {
            e(w01Var);
            w01Var.f31966b = Math.max(w01Var.f31966b, j11);
            w01Var.f31967c = j11;
            FileLoader.getInstance(this.f32511a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f32512b, w01Var.f31966b, j11);
        }
    }

    public final synchronized void c(long j10) {
        w01 w01Var = (w01) this.f32513c.remove(Long.valueOf(j10));
        if (w01Var == null) {
            return;
        }
        w01Var.e = true;
        if (w01Var.d) {
            FileLoader.getInstance(this.f32511a).cancelFileUpload(w01Var.f31965a.getAbsolutePath(), this.f32512b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f32511a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f32513c.values().iterator();
                while (it.hasNext()) {
                    w01 w01Var = (w01) it.next();
                    if (w01Var.d && !w01Var.e) {
                        FileLoader.getInstance(this.f32511a).cancelFileUpload(w01Var.f31965a.getAbsolutePath(), this.f32512b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y01.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(w01 w01Var) {
        if (w01Var.d) {
            return;
        }
        w01Var.d = true;
        FileLoader.getInstance(this.f32511a).uploadFile(w01Var.f31965a.getAbsolutePath(), this.f32512b, false, 1L, 33554432, false);
    }
}
