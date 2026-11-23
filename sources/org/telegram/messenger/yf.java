package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yf implements Runnable {
    public final int f28229a;
    public final Object f28230b;
    public final Object f28231c;
    public final Object d;

    public yf(Object obj, Object obj2, Object obj3, int i7) {
        this.f28229a = i7;
        this.f28231c = obj;
        this.f28230b = obj2;
        this.d = obj3;
    }

    private final void a() {
        w7 w7Var = (w7) this.f28231c;
        TLRPC.Document document = (TLRPC.Document) this.f28230b;
        fj fjVar = (fj) this.d;
        int i7 = 3;
        if (document == null) {
            ConcurrentHashMap concurrentHashMap = r8.I;
        } else {
            Integer num = (Integer) r8.J.get(Long.valueOf(document.f28498id));
            if (num != null) {
                i7 = num.intValue();
            }
        }
        w7Var.Y(document, null, null, null, null, fjVar, null, 0L, i7, w7.N, 0L, false, 0);
    }

    private final void b() {
        w7 w7Var = (w7) this.f28231c;
        lg.f fVar = (lg.f) this.f28230b;
        i7 i7Var = (i7) this.d;
        if (((ArrayList) fVar.d).remove(i7Var)) {
            w7Var.f27750w.remove(i7Var.f24753r);
            fVar.b(i7Var.f24737j);
        }
    }

    private final void c() {
        e8 e8Var = (e8) this.f28231c;
        File file = (File) this.f28230b;
        d8 d8Var = (d8) this.d;
        e8Var.c();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = e8Var.f23773c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                sQLitePreparedStatement.bindLong(2, d8Var.f23628a);
                sQLitePreparedStatement.bindInteger(3, d8Var.f23629b);
                sQLitePreparedStatement.bindInteger(4, d8Var.f23630c);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                a8.g(e10, true);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    private final void d() {
        String str = (String) this.f28230b;
        i7 i7Var = (i7) this.d;
        ec ecVar = ((ob) this.f28231c).f26146b;
        HashMap hashMap = ecVar.h;
        ConcurrentHashMap concurrentHashMap = ecVar.f23787i;
        sb sbVar = (sb) hashMap.remove(str);
        if (sbVar != null) {
            ArrayList arrayList = sbVar.v;
            ecVar.f23786g.remove(str);
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                String str2 = (String) sbVar.f26883x.get(i7);
                String str3 = (String) sbVar.f26884y.get(i7);
                int intValue = ((Integer) sbVar.f26885z.get(i7)).intValue();
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i7);
                int intValue2 = ((Integer) sbVar.f26882w.get(i7)).intValue();
                sb sbVar2 = (sb) concurrentHashMap.get(str2);
                if (sbVar2 == null) {
                    sbVar2 = new sb(ecVar);
                    sbVar2.f26863a = sbVar.f26863a;
                    sbVar2.h = sbVar.h;
                    sbVar2.f26875o = sbVar.f26875o;
                    sbVar2.f26876p = i7Var.g();
                    sbVar2.f26870j = sbVar.f26870j;
                    sbVar2.f26865c = sbVar.f26865c;
                    sbVar2.d = str2;
                    sbVar2.f26869i = sbVar.f26869i;
                    sbVar2.f26873m = intValue;
                    sbVar2.f26868g = sbVar.f26868g;
                    sbVar2.f26878r = sbVar.f26878r;
                    sbVar2.f26881u = new tb(ecVar, sbVar2);
                    sbVar2.f26867f = str3;
                    sbVar2.f26872l = sbVar.f26872l;
                    sbVar2.f26874n = sbVar.f26874n;
                    concurrentHashMap.put(str2, sbVar2);
                    ecVar.f23788j.add(ec.n(str2));
                    arrayList2.add(sbVar2.f26881u);
                }
                sbVar2.a(imageReceiver, str2, str3, intValue, intValue2);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                tb tbVar = (tb) arrayList2.get(i10);
                sb sbVar3 = tbVar.f27074c;
                if (sbVar3.f26873m == 1) {
                    ecVar.f23795q.c(tbVar);
                } else {
                    com.google.android.gms.internal.cast.b0 b0Var = ecVar.f23794p;
                    int i11 = sbVar3.f26863a;
                    if (i11 != 1) {
                        b0Var.getClass();
                        tbVar = new of.b(i11, tbVar);
                    }
                    ((of.a) b0Var.f6480b).execute(tbVar);
                }
            }
        }
    }

    private final void f() {
        ((tb) this.f28231c).f27074c.c((Drawable) this.f28230b, (String) this.d);
    }

    private final void g() {
        int[] iArr = (int[]) this.f28231c;
        Runnable runnable = (Runnable) this.d;
        int i7 = iArr[0] + 1;
        iArr[0] = i7;
        if (i7 >= ((int[]) this.f28230b)[0] && runnable != null) {
            runnable.run();
        }
    }

    private final void h() {
        qd qdVar = (qd) this.f28231c;
        pd pdVar = (pd) this.f28230b;
        pd pdVar2 = (pd) this.d;
        ArrayList arrayList = qdVar.J;
        if (pdVar != null) {
            arrayList.remove(pdVar);
        }
        arrayList.add(pdVar2);
        qdVar.K.k(pdVar2, pdVar2.f26319a);
        qd.q();
        ks.e().k(ks.G4, new Object[0]);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yf.run():void");
    }

    public yf(TLObject tLObject, w10 w10Var, TLRPC.TL_error tL_error) {
        this.f28229a = 12;
        this.d = tLObject;
        this.f28231c = w10Var;
        this.f28230b = tL_error;
    }
}
