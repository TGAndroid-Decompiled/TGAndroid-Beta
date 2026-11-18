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
    public final int f28129a;
    public final Object f28130b;
    public final Object f28131c;
    public final Object d;

    public yf(Object obj, Object obj2, Object obj3, int i7) {
        this.f28129a = i7;
        this.f28131c = obj;
        this.f28130b = obj2;
        this.d = obj3;
    }

    private final void a() {
        w7 w7Var = (w7) this.f28131c;
        TLRPC.Document document = (TLRPC.Document) this.f28130b;
        fj fjVar = (fj) this.d;
        int i7 = 3;
        if (document == null) {
            ConcurrentHashMap concurrentHashMap = s8.I;
        } else {
            Integer num = (Integer) s8.J.get(Long.valueOf(document.f28409id));
            if (num != null) {
                i7 = num.intValue();
            }
        }
        w7Var.Y(document, null, null, null, null, fjVar, null, 0L, i7, w7.N, 0L, false, 0);
    }

    private final void b() {
        w7 w7Var = (w7) this.f28131c;
        lg.f fVar = (lg.f) this.f28130b;
        i7 i7Var = (i7) this.d;
        if (((ArrayList) fVar.d).remove(i7Var)) {
            w7Var.f27655w.remove(i7Var.f24627r);
            fVar.b(i7Var.f24611j);
        }
    }

    private final void c() {
        f8 f8Var = (f8) this.f28131c;
        File file = (File) this.f28130b;
        e8 e8Var = (e8) this.d;
        f8Var.c();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = f8Var.f23854c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                sQLitePreparedStatement.bindLong(2, e8Var.f23669a);
                sQLitePreparedStatement.bindInteger(3, e8Var.f23670b);
                sQLitePreparedStatement.bindInteger(4, e8Var.f23671c);
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
        String str = (String) this.f28130b;
        i7 i7Var = (i7) this.d;
        ec ecVar = ((ob) this.f28131c).f26049b;
        HashMap hashMap = ecVar.h;
        ConcurrentHashMap concurrentHashMap = ecVar.f23682i;
        sb sbVar = (sb) hashMap.remove(str);
        if (sbVar != null) {
            ArrayList arrayList = sbVar.v;
            ecVar.f23681g.remove(str);
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                String str2 = (String) sbVar.f26782x.get(i7);
                String str3 = (String) sbVar.f26783y.get(i7);
                int intValue = ((Integer) sbVar.f26784z.get(i7)).intValue();
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i7);
                int intValue2 = ((Integer) sbVar.f26781w.get(i7)).intValue();
                sb sbVar2 = (sb) concurrentHashMap.get(str2);
                if (sbVar2 == null) {
                    sbVar2 = new sb(ecVar);
                    sbVar2.f26762a = sbVar.f26762a;
                    sbVar2.h = sbVar.h;
                    sbVar2.f26774o = sbVar.f26774o;
                    sbVar2.f26775p = i7Var.g();
                    sbVar2.f26769j = sbVar.f26769j;
                    sbVar2.f26764c = sbVar.f26764c;
                    sbVar2.d = str2;
                    sbVar2.f26768i = sbVar.f26768i;
                    sbVar2.f26772m = intValue;
                    sbVar2.f26767g = sbVar.f26767g;
                    sbVar2.f26777r = sbVar.f26777r;
                    sbVar2.f26780u = new tb(ecVar, sbVar2);
                    sbVar2.f26766f = str3;
                    sbVar2.f26771l = sbVar.f26771l;
                    sbVar2.f26773n = sbVar.f26773n;
                    concurrentHashMap.put(str2, sbVar2);
                    ecVar.f23683j.add(ec.n(str2));
                    arrayList2.add(sbVar2.f26780u);
                }
                sbVar2.a(imageReceiver, str2, str3, intValue, intValue2);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                tb tbVar = (tb) arrayList2.get(i10);
                sb sbVar3 = tbVar.f26977c;
                if (sbVar3.f26772m == 1) {
                    ecVar.f23690q.c(tbVar);
                } else {
                    com.google.android.gms.internal.cast.b0 b0Var = ecVar.f23689p;
                    int i11 = sbVar3.f26762a;
                    if (i11 != 1) {
                        b0Var.getClass();
                        tbVar = new of.b(i11, tbVar);
                    }
                    ((of.a) b0Var.f6486b).execute(tbVar);
                }
            }
        }
    }

    private final void f() {
        ((tb) this.f28131c).f26977c.c((Drawable) this.f28130b, (String) this.d);
    }

    private final void g() {
        int[] iArr = (int[]) this.f28131c;
        Runnable runnable = (Runnable) this.d;
        int i7 = iArr[0] + 1;
        iArr[0] = i7;
        if (i7 >= ((int[]) this.f28130b)[0] && runnable != null) {
            runnable.run();
        }
    }

    private final void h() {
        qd qdVar = (qd) this.f28131c;
        pd pdVar = (pd) this.f28130b;
        pd pdVar2 = (pd) this.d;
        ArrayList arrayList = qdVar.J;
        if (pdVar != null) {
            arrayList.remove(pdVar);
        }
        arrayList.add(pdVar2);
        qdVar.K.k(pdVar2, pdVar2.f26225a);
        qd.q();
        ks.e().k(ks.G4, new Object[0]);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yf.run():void");
    }

    public yf(TLObject tLObject, x10 x10Var, TLRPC.TL_error tL_error) {
        this.f28129a = 12;
        this.d = tLObject;
        this.f28131c = x10Var;
        this.f28130b = tL_error;
    }
}
