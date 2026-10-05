package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class a11 implements ki.p0, NotificationCenter.NotificationCenterDelegate {
    public final int f24425a;
    public final boolean f24426b;
    public final HashMap f24427c = new HashMap();
    public boolean d;

    public a11(int i10, boolean z10) {
        this.f24425a = i10;
        this.f24426b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        y01 y01Var = (y01) this.f24427c.get(Long.valueOf(j3));
        if (!this.d && y01Var != null && !y01Var.f33145e) {
            e(y01Var);
            y01Var.f33143b = Math.max(y01Var.f33143b, j10 + j11);
            FileLoader.getInstance(this.f24425a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f24426b, y01Var.f33143b, 0L);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        y01 y01Var = (y01) this.f24427c.get(Long.valueOf(j3));
        if (!this.d && y01Var != null && !y01Var.f33145e) {
            e(y01Var);
            y01Var.f33143b = Math.max(y01Var.f33143b, j10);
            y01Var.f33144c = j10;
            FileLoader.getInstance(this.f24425a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f24426b, y01Var.f33143b, j10);
        }
    }

    public final synchronized void c(long j3) {
        y01 y01Var = (y01) this.f24427c.remove(Long.valueOf(j3));
        if (y01Var == null) {
            return;
        }
        y01Var.f33145e = true;
        if (y01Var.d) {
            FileLoader.getInstance(this.f24425a).cancelFileUpload(y01Var.f33142a.getAbsolutePath(), this.f24426b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f24425a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f24427c.values().iterator();
                while (it.hasNext()) {
                    y01 y01Var = (y01) it.next();
                    if (y01Var.d && !y01Var.f33145e) {
                        FileLoader.getInstance(this.f24425a).cancelFileUpload(y01Var.f33142a.getAbsolutePath(), this.f24426b);
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
        FileLoader.getInstance(this.f24425a).uploadFile(y01Var.f33142a.getAbsolutePath(), this.f24426b, false, 1L, 33554432, false);
    }
}
