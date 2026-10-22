package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class a11 implements si.p0, NotificationCenter.NotificationCenterDelegate {
    public final int f24462a;
    public final boolean f24463b;
    public final HashMap f24464c = new HashMap();
    public boolean d;

    public a11(int i10, boolean z10) {
        this.f24462a = i10;
        this.f24463b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j10, File file, long j11, long j12) {
        y01 y01Var = (y01) this.f24464c.get(Long.valueOf(j10));
        if (!this.d && y01Var != null && !y01Var.e) {
            e(y01Var);
            y01Var.f32536b = Math.max(y01Var.f32536b, j11 + j12);
            FileLoader.getInstance(this.f24462a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f24463b, y01Var.f32536b, 0L);
        }
    }

    public final synchronized void b(long j10, long j11, File file) {
        y01 y01Var = (y01) this.f24464c.get(Long.valueOf(j10));
        if (!this.d && y01Var != null && !y01Var.e) {
            e(y01Var);
            y01Var.f32536b = Math.max(y01Var.f32536b, j11);
            y01Var.f32537c = j11;
            FileLoader.getInstance(this.f24462a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f24463b, y01Var.f32536b, j11);
        }
    }

    public final synchronized void c(long j10) {
        y01 y01Var = (y01) this.f24464c.remove(Long.valueOf(j10));
        if (y01Var == null) {
            return;
        }
        y01Var.e = true;
        if (y01Var.d) {
            FileLoader.getInstance(this.f24462a).cancelFileUpload(y01Var.f32535a.getAbsolutePath(), this.f24463b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f24462a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f24464c.values().iterator();
                while (it.hasNext()) {
                    y01 y01Var = (y01) it.next();
                    if (y01Var.d && !y01Var.e) {
                        FileLoader.getInstance(this.f24462a).cancelFileUpload(y01Var.f32535a.getAbsolutePath(), this.f24463b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a11.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(y01 y01Var) {
        if (y01Var.d) {
            return;
        }
        y01Var.d = true;
        FileLoader.getInstance(this.f24462a).uploadFile(y01Var.f32535a.getAbsolutePath(), this.f24463b, false, 1L, 33554432, false);
    }
}
