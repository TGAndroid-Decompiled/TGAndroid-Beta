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
    public final int f28131a;
    public final Object f28132b;
    public final Object f28133c;
    public final Object d;

    public yf(Object obj, Object obj2, Object obj3, int i7) {
        this.f28131a = i7;
        this.f28133c = obj;
        this.f28132b = obj2;
        this.d = obj3;
    }

    private final void a() {
        w7 w7Var = (w7) this.f28133c;
        TLRPC.Document document = (TLRPC.Document) this.f28132b;
        fj fjVar = (fj) this.d;
        int i7 = 3;
        if (document == null) {
            ConcurrentHashMap concurrentHashMap = s8.I;
        } else {
            Integer num = (Integer) s8.J.get(Long.valueOf(document.f28411id));
            if (num != null) {
                i7 = num.intValue();
            }
        }
        w7Var.Y(document, null, null, null, null, fjVar, null, 0L, i7, w7.N, 0L, false, 0);
    }

    private final void b() {
        w7 w7Var = (w7) this.f28133c;
        lg.f fVar = (lg.f) this.f28132b;
        i7 i7Var = (i7) this.d;
        if (((ArrayList) fVar.d).remove(i7Var)) {
            w7Var.f27657w.remove(i7Var.f24630r);
            fVar.b(i7Var.f24614j);
        }
    }

    private final void c() {
        f8 f8Var = (f8) this.f28133c;
        File file = (File) this.f28132b;
        e8 e8Var = (e8) this.d;
        f8Var.c();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = f8Var.f23857c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                sQLitePreparedStatement.bindLong(2, e8Var.f23672a);
                sQLitePreparedStatement.bindInteger(3, e8Var.f23673b);
                sQLitePreparedStatement.bindInteger(4, e8Var.f23674c);
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
        String str = (String) this.f28132b;
        i7 i7Var = (i7) this.d;
        ec ecVar = ((ob) this.f28133c).f26051b;
        HashMap hashMap = ecVar.h;
        ConcurrentHashMap concurrentHashMap = ecVar.f23685i;
        sb sbVar = (sb) hashMap.remove(str);
        if (sbVar != null) {
            ArrayList arrayList = sbVar.v;
            ecVar.f23684g.remove(str);
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                String str2 = (String) sbVar.f26784x.get(i7);
                String str3 = (String) sbVar.f26785y.get(i7);
                int intValue = ((Integer) sbVar.f26786z.get(i7)).intValue();
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i7);
                int intValue2 = ((Integer) sbVar.f26783w.get(i7)).intValue();
                sb sbVar2 = (sb) concurrentHashMap.get(str2);
                if (sbVar2 == null) {
                    sbVar2 = new sb(ecVar);
                    sbVar2.f26764a = sbVar.f26764a;
                    sbVar2.h = sbVar.h;
                    sbVar2.f26776o = sbVar.f26776o;
                    sbVar2.f26777p = i7Var.g();
                    sbVar2.f26771j = sbVar.f26771j;
                    sbVar2.f26766c = sbVar.f26766c;
                    sbVar2.d = str2;
                    sbVar2.f26770i = sbVar.f26770i;
                    sbVar2.f26774m = intValue;
                    sbVar2.f26769g = sbVar.f26769g;
                    sbVar2.f26779r = sbVar.f26779r;
                    sbVar2.f26782u = new tb(ecVar, sbVar2);
                    sbVar2.f26768f = str3;
                    sbVar2.f26773l = sbVar.f26773l;
                    sbVar2.f26775n = sbVar.f26775n;
                    concurrentHashMap.put(str2, sbVar2);
                    ecVar.f23686j.add(ec.n(str2));
                    arrayList2.add(sbVar2.f26782u);
                }
                sbVar2.a(imageReceiver, str2, str3, intValue, intValue2);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                tb tbVar = (tb) arrayList2.get(i10);
                sb sbVar3 = tbVar.f26979c;
                if (sbVar3.f26774m == 1) {
                    ecVar.f23693q.c(tbVar);
                } else {
                    com.google.android.gms.internal.cast.b0 b0Var = ecVar.f23692p;
                    int i11 = sbVar3.f26764a;
                    if (i11 != 1) {
                        b0Var.getClass();
                        tbVar = new of.b(i11, tbVar);
                    }
                    ((of.a) b0Var.f6489b).execute(tbVar);
                }
            }
        }
    }

    private final void f() {
        ((tb) this.f28133c).f26979c.c((Drawable) this.f28132b, (String) this.d);
    }

    private final void g() {
        int[] iArr = (int[]) this.f28133c;
        Runnable runnable = (Runnable) this.d;
        int i7 = iArr[0] + 1;
        iArr[0] = i7;
        if (i7 >= ((int[]) this.f28132b)[0] && runnable != null) {
            runnable.run();
        }
    }

    private final void h() {
        qd qdVar = (qd) this.f28133c;
        pd pdVar = (pd) this.f28132b;
        pd pdVar2 = (pd) this.d;
        ArrayList arrayList = qdVar.J;
        if (pdVar != null) {
            arrayList.remove(pdVar);
        }
        arrayList.add(pdVar2);
        qdVar.K.k(pdVar2, pdVar2.f26227a);
        qd.q();
        ks.e().k(ks.F4, new Object[0]);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yf.run():void");
    }

    public yf(TLObject tLObject, x10 x10Var, TLRPC.TL_error tL_error) {
        this.f28131a = 12;
        this.d = tLObject;
        this.f28133c = x10Var;
        this.f28132b = tL_error;
    }
}
