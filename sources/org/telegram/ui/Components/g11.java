package org.telegram.ui.Components;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
public final class g11 implements ki.q0, NotificationCenter.NotificationCenterDelegate {
    public final int f26552a;
    public final boolean f26553b;
    public final HashMap f26554c = new HashMap();
    public boolean d;

    public g11(int i10, boolean z10) {
        this.f26552a = i10;
        this.f26553b = z10;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
    }

    public final synchronized void a(long j3, File file, long j10, long j11) {
        e11 e11Var = (e11) this.f26554c.get(Long.valueOf(j3));
        if (!this.d && e11Var != null && !e11Var.f25918e) {
            e(e11Var);
            e11Var.f25916b = Math.max(e11Var.f25916b, j10 + j11);
            FileLoader.getInstance(this.f26552a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f26553b, e11Var.f25916b, 0L);
        }
    }

    public final synchronized void b(long j3, long j10, File file) {
        e11 e11Var = (e11) this.f26554c.get(Long.valueOf(j3));
        if (!this.d && e11Var != null && !e11Var.f25918e) {
            e(e11Var);
            e11Var.f25916b = Math.max(e11Var.f25916b, j10);
            e11Var.f25917c = j10;
            FileLoader.getInstance(this.f26552a).checkUploadNewDataAvailable(file.getAbsolutePath(), this.f26553b, e11Var.f25916b, j10);
        }
    }

    public final synchronized void c(long j3) {
        e11 e11Var = (e11) this.f26554c.remove(Long.valueOf(j3));
        if (e11Var == null) {
            return;
        }
        e11Var.f25918e = true;
        if (e11Var.d) {
            FileLoader.getInstance(this.f26552a).cancelFileUpload(e11Var.f25915a.getAbsolutePath(), this.f26553b);
        }
    }

    public final synchronized void d(boolean z10) {
        try {
            if (this.d) {
                return;
            }
            this.d = true;
            NotificationCenter.getInstance(this.f26552a).removeObserver(this, NotificationCenter.fileUploaded);
            if (z10) {
                Iterator it = this.f26554c.values().iterator();
                while (it.hasNext()) {
                    e11 e11Var = (e11) it.next();
                    if (e11Var.d && !e11Var.f25918e) {
                        FileLoader.getInstance(this.f26552a).cancelFileUpload(e11Var.f25915a.getAbsolutePath(), this.f26553b);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g11.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public final void e(e11 e11Var) {
        if (e11Var.d) {
            return;
        }
        e11Var.d = true;
        FileLoader.getInstance(this.f26552a).uploadFile(e11Var.f25915a.getAbsolutePath(), this.f26553b, false, 1L, 33554432, false);
    }
}
