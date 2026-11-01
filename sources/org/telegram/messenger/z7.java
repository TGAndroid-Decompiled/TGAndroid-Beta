package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class z7 {
    public final Object f19671a;
    public final TLRPC.Document f19672b;
    public final String f19673c;
    public final int d;
    public final b8 e;

    public z7(b8 b8Var, Object obj, TLRPC.Document document, String str, int i10) {
        this.e = b8Var;
        this.f19671a = obj;
        this.f19672b = document;
        this.f19673c = str;
        this.d = i10;
    }

    public final void a(org.telegram.messenger.m7 r14, long r15, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.z7.a(org.telegram.messenger.m7, long, long):void");
    }

    public final void b(m7 m7Var, int i10) {
        int i11;
        Object obj = this.f19671a;
        b8 b8Var = this.e;
        ConcurrentHashMap concurrentHashMap = b8Var.f14947x;
        String str = this.f19673c;
        concurrentHashMap.remove(str);
        b8.J.d(new ng(b8Var, m7Var.f17054e1, m7Var, 23), 0L);
        sb sbVar = b8Var.E;
        if (sbVar != null) {
            sbVar.f18077b.f16263u.remove(str);
            i11 = i10;
            i0.g3(new i2.a0(sbVar, str, i11, sbVar.f18076a, 1));
        } else {
            i11 = i10;
        }
        if (this.f19672b != null && (obj instanceof kj) && i11 == 0) {
            b6 downloadController = b8Var.getDownloadController();
            kj kjVar = (kj) obj;
            downloadController.getClass();
            i0.g3(new o7(downloadController, kjVar, i11, 2));
            downloadController.getMessagesStorage().f16331a.c(new x5(downloadController, kjVar, 2));
        } else if (i11 == -1) {
            LaunchActivity.D(2);
        }
    }

    public final void c(m7 m7Var, File file) {
        Object obj = this.f19671a;
        b8 b8Var = this.e;
        if (!m7Var.f17095y && m7Var.f17097z) {
            b8.J.d(new ng(b8Var, m7Var.f17054e1, m7Var, 23), 0L);
            return;
        }
        j8 E = b8.E(obj);
        if (E != null) {
            k8 k8Var = b8Var.getFileLoader().d;
            k8Var.getClass();
            if (file != null) {
                k8Var.h(new ng(k8Var, file, E, 24));
            }
        }
        if (obj instanceof kj) {
            kj kjVar = (kj) obj;
            if (this.f19672b != null && kjVar.P) {
                b6 downloadController = b8Var.getDownloadController();
                downloadController.getClass();
                if (kjVar.F0() != null) {
                    i0.g3(new w5(downloadController, kjVar.F0(), kjVar, 0));
                }
            }
        }
        if (!m7Var.f17095y) {
            b8Var.f14947x.remove(this.f19673c);
            sb sbVar = b8Var.E;
            if (sbVar != null) {
                String str = this.f19673c;
                Object obj2 = this.f19671a;
                int i10 = this.d;
                sbVar.f18077b.f16263u.remove(str);
                i0.g3(new bi.k0(sbVar, file, str, sbVar.f18076a, obj2, i10));
            }
        }
        b8.J.d(new ng(b8Var, m7Var.f17054e1, m7Var, 23), 0L);
    }
}
