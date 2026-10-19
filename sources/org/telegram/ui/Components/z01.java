package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class z01 implements si.p0, NotificationCenter.NotificationCenterDelegate {
    public final int f32799a;
    public final boolean f32800b;
    public final HashMap f32801c = new HashMap();
    public boolean d;

    public z01(int i10, boolean z10) {
        this.f32799a = i10;
        this.f32800b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j10, File file, long j11, long j12) {
        x01 x01Var = (x01) this.f32801c.get(Long.valueOf(j10));
        if (!this.d && x01Var != null && !x01Var.e) {
            e(x01Var);
            x01Var.f32245b = Math.max(x01Var.f32245b, j11 + j12);
            FileLoader.getInstance(this.f32799a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f32800b, x01Var.f32245b, 0L);
        }
    }

    public final synchronized void b(long j10, long j11, File file) {
        x01 x01Var = (x01) this.f32801c.get(Long.valueOf(j10));
        if (!this.d && x01Var != null && !x01Var.e) {
            e(x01Var);
            x01Var.f32245b = Math.max(x01Var.f32245b, j11);
            x01Var.f32246c = j11;
            FileLoader.getInstance(this.f32799a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f32800b, x01Var.f32245b, j11);
        }
    }

    public final synchronized void c(long j10) {
        x01 x01Var = (x01) this.f32801c.remove(Long.valueOf(j10));
        if (x01Var == null) {
            return;
        }
        x01Var.e = true;
        if (x01Var.d) {
            FileLoader.getInstance(this.f32799a).cancelFileUpload(x01Var.f32244a.getAbsolutePath(), this.f32800b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f32799a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f32801c.values().iterator();
                while (it.hasNext()) {
                    x01 x01Var = (x01) it.next();
                    if (x01Var.d && !x01Var.e) {
                        FileLoader.getInstance(this.f32799a).cancelFileUpload(x01Var.f32244a.getAbsolutePath(), this.f32800b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z01.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(x01 x01Var) {
        if (x01Var.d) {
            return;
        }
        x01Var.d = true;
        FileLoader.getInstance(this.f32799a).uploadFile(x01Var.f32244a.getAbsolutePath(), this.f32800b, false, 1L, 33554432, false);
    }
}
