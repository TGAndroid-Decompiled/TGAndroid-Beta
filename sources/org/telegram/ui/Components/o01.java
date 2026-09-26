package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class o01 implements ki.p0, NotificationCenter.NotificationCenterDelegate {
    public final int f26865a;
    public final boolean f26866b;
    public final HashMap f26867c = new HashMap();
    public boolean d;

    public o01(int i10, boolean z10) {
        this.f26865a = i10;
        this.f26866b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        m01 m01Var = (m01) this.f26867c.get(Long.valueOf(j3));
        if (!this.d && m01Var != null && !m01Var.e) {
            e(m01Var);
            m01Var.f26323b = Math.max(m01Var.f26323b, j10 + j11);
            FileLoader.getInstance(this.f26865a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f26866b, m01Var.f26323b, 0L);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        m01 m01Var = (m01) this.f26867c.get(Long.valueOf(j3));
        if (!this.d && m01Var != null && !m01Var.e) {
            e(m01Var);
            m01Var.f26323b = Math.max(m01Var.f26323b, j10);
            m01Var.f26324c = j10;
            FileLoader.getInstance(this.f26865a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f26866b, m01Var.f26323b, j10);
        }
    }

    public final synchronized void c(long j3) {
        m01 m01Var = (m01) this.f26867c.remove(Long.valueOf(j3));
        if (m01Var == null) {
            return;
        }
        m01Var.e = true;
        if (m01Var.d) {
            FileLoader.getInstance(this.f26865a).cancelFileUpload(m01Var.f26322a.getAbsolutePath(), this.f26866b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f26865a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f26867c.values().iterator();
                while (it.hasNext()) {
                    m01 m01Var = (m01) it.next();
                    if (m01Var.d && !m01Var.e) {
                        FileLoader.getInstance(this.f26865a).cancelFileUpload(m01Var.f26322a.getAbsolutePath(), this.f26866b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o01.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(m01 m01Var) {
        if (m01Var.d) {
            return;
        }
        m01Var.d = true;
        FileLoader.getInstance(this.f26865a).uploadFile(m01Var.f26322a.getAbsolutePath(), this.f26866b, false, 1L, 33554432, false);
    }
}
