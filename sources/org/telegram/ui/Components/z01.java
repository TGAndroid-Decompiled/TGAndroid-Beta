package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class z01 implements ki.p0, NotificationCenter.NotificationCenterDelegate {
    public final int f33325a;
    public final boolean f33326b;
    public final HashMap f33327c = new HashMap();
    public boolean d;

    public z01(int i10, boolean z10) {
        this.f33325a = i10;
        this.f33326b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        x01 x01Var = (x01) this.f33327c.get(Long.valueOf(j3));
        if (!this.d && x01Var != null && !x01Var.f32683e) {
            e(x01Var);
            x01Var.f32681b = Math.max(x01Var.f32681b, j10 + j11);
            FileLoader.getInstance(this.f33325a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f33326b, x01Var.f32681b, 0L);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        x01 x01Var = (x01) this.f33327c.get(Long.valueOf(j3));
        if (!this.d && x01Var != null && !x01Var.f32683e) {
            e(x01Var);
            x01Var.f32681b = Math.max(x01Var.f32681b, j10);
            x01Var.f32682c = j10;
            FileLoader.getInstance(this.f33325a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f33326b, x01Var.f32681b, j10);
        }
    }

    public final synchronized void c(long j3) {
        x01 x01Var = (x01) this.f33327c.remove(Long.valueOf(j3));
        if (x01Var == null) {
            return;
        }
        x01Var.f32683e = true;
        if (x01Var.d) {
            FileLoader.getInstance(this.f33325a).cancelFileUpload(x01Var.f32680a.getAbsolutePath(), this.f33326b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f33325a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f33327c.values().iterator();
                while (it.hasNext()) {
                    x01 x01Var = (x01) it.next();
                    if (x01Var.d && !x01Var.f32683e) {
                        FileLoader.getInstance(this.f33325a).cancelFileUpload(x01Var.f32680a.getAbsolutePath(), this.f33326b);
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
        FileLoader.getInstance(this.f33325a).uploadFile(x01Var.f32680a.getAbsolutePath(), this.f33326b, false, 1L, 33554432, false);
    }
}
