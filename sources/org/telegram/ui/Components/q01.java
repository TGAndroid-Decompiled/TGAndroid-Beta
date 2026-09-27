package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class q01 implements ki.p0, NotificationCenter.NotificationCenterDelegate {
    public final int f27540a;
    public final boolean f27541b;
    public final HashMap f27542c = new HashMap();
    public boolean d;

    public q01(int i10, boolean z10) {
        this.f27540a = i10;
        this.f27541b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        o01 o01Var = (o01) this.f27542c.get(Long.valueOf(j3));
        if (!this.d && o01Var != null && !o01Var.e) {
            e(o01Var);
            o01Var.f26928b = Math.max(o01Var.f26928b, j10 + j11);
            FileLoader.getInstance(this.f27540a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f27541b, o01Var.f26928b, 0L);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        o01 o01Var = (o01) this.f27542c.get(Long.valueOf(j3));
        if (!this.d && o01Var != null && !o01Var.e) {
            e(o01Var);
            o01Var.f26928b = Math.max(o01Var.f26928b, j10);
            o01Var.f26929c = j10;
            FileLoader.getInstance(this.f27540a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f27541b, o01Var.f26928b, j10);
        }
    }

    public final synchronized void c(long j3) {
        o01 o01Var = (o01) this.f27542c.remove(Long.valueOf(j3));
        if (o01Var == null) {
            return;
        }
        o01Var.e = true;
        if (o01Var.d) {
            FileLoader.getInstance(this.f27540a).cancelFileUpload(o01Var.f26927a.getAbsolutePath(), this.f27541b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f27540a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f27542c.values().iterator();
                while (it.hasNext()) {
                    o01 o01Var = (o01) it.next();
                    if (o01Var.d && !o01Var.e) {
                        FileLoader.getInstance(this.f27540a).cancelFileUpload(o01Var.f26927a.getAbsolutePath(), this.f27541b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q01.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(o01 o01Var) {
        if (o01Var.d) {
            return;
        }
        o01Var.d = true;
        FileLoader.getInstance(this.f27540a).uploadFile(o01Var.f26927a.getAbsolutePath(), this.f27541b, false, 1L, 33554432, false);
    }
}
