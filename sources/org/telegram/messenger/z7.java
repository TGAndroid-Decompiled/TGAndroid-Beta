package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class z7 {
    public final Object f19486a;
    public final TLRPC.Document f19487b;
    public final String f19488c;
    public final int d;
    public final b8 e;

    public z7(b8 b8Var, Object obj, TLRPC.Document document, String str, int i10) {
        this.e = b8Var;
        this.f19486a = obj;
        this.f19487b = document;
        this.f19488c = str;
        this.d = i10;
    }

    public final void a(org.telegram.messenger.m7 r14, long r15, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z7.a(org.telegram.messenger.m7, long, long):void");
    }

    public final void b(m7 m7Var, int i10) {
        int i11;
        Object obj = this.f19486a;
        b8 b8Var = this.e;
        ConcurrentHashMap concurrentHashMap = b8Var.f14747x;
        String str = this.f19488c;
        concurrentHashMap.remove(str);
        b8.J.d(new mg(b8Var, m7Var.f16884e1, m7Var, 23), 0L);
        rb rbVar = b8Var.E;
        if (rbVar != null) {
            rbVar.f17713b.f15870u.remove(str);
            i11 = i10;
            i0.g3(new i2.a0(rbVar, str, i11, rbVar.f17712a, 1));
        } else {
            i11 = i10;
        }
        if (this.f19487b != null && (obj instanceof jj) && i11 == 0) {
            b6 downloadController = b8Var.getDownloadController();
            jj jjVar = (jj) obj;
            downloadController.getClass();
            i0.g3(new o7(downloadController, jjVar, i11, 2));
            downloadController.getMessagesStorage().f15938a.c(new x5(downloadController, jjVar, 2));
        } else if (i11 == -1) {
            LaunchActivity.D(2);
        }
    }

    public final void c(m7 m7Var, File file) {
        Object obj = this.f19486a;
        b8 b8Var = this.e;
        if (!m7Var.f16925y && m7Var.f16927z) {
            b8.J.d(new mg(b8Var, m7Var.f16884e1, m7Var, 23), 0L);
            return;
        }
        j8 E = b8.E(obj);
        if (E != null) {
            k8 k8Var = b8Var.getFileLoader().d;
            k8Var.getClass();
            if (file != null) {
                k8Var.h(new mg(k8Var, file, E, 24));
            }
        }
        if (obj instanceof jj) {
            jj jjVar = (jj) obj;
            if (this.f19487b != null && jjVar.P) {
                b6 downloadController = b8Var.getDownloadController();
                downloadController.getClass();
                if (jjVar.F0() != null) {
                    i0.g3(new w5(downloadController, jjVar.F0(), jjVar, 0));
                }
            }
        }
        if (!m7Var.f16925y) {
            b8Var.f14747x.remove(this.f19488c);
            rb rbVar = b8Var.E;
            if (rbVar != null) {
                String str = this.f19488c;
                Object obj2 = this.f19486a;
                int i10 = this.d;
                rbVar.f17713b.f15870u.remove(str);
                i0.g3(new bi.k0(rbVar, file, str, rbVar.f17712a, obj2, i10));
            }
        }
        b8.J.d(new mg(b8Var, m7Var.f16884e1, m7Var, 23), 0L);
    }
}
