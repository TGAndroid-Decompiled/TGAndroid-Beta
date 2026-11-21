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
    public final int f28157a;
    public final Object f28158b;
    public final Object f28159c;
    public final Object d;

    public yf(Object obj, Object obj2, Object obj3, int i7) {
        this.f28157a = i7;
        this.f28159c = obj;
        this.f28158b = obj2;
        this.d = obj3;
    }

    private final void a() {
        w7 w7Var = (w7) this.f28159c;
        TLRPC.Document document = (TLRPC.Document) this.f28158b;
        fj fjVar = (fj) this.d;
        int i7 = 3;
        if (document == null) {
            ConcurrentHashMap concurrentHashMap = s8.I;
        } else {
            Integer num = (Integer) s8.J.get(Long.valueOf(document.f28437id));
            if (num != null) {
                i7 = num.intValue();
            }
        }
        w7Var.Y(document, null, null, null, null, fjVar, null, 0L, i7, w7.N, 0L, false, 0);
    }

    private final void b() {
        w7 w7Var = (w7) this.f28159c;
        lg.f fVar = (lg.f) this.f28158b;
        i7 i7Var = (i7) this.d;
        if (((ArrayList) fVar.d).remove(i7Var)) {
            w7Var.f27683w.remove(i7Var.f24655r);
            fVar.b(i7Var.f24639j);
        }
    }

    private final void c() {
        f8 f8Var = (f8) this.f28159c;
        File file = (File) this.f28158b;
        e8 e8Var = (e8) this.d;
        f8Var.c();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = f8Var.f23882c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                sQLitePreparedStatement.bindLong(2, e8Var.f23697a);
                sQLitePreparedStatement.bindInteger(3, e8Var.f23698b);
                sQLitePreparedStatement.bindInteger(4, e8Var.f23699c);
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
        String str = (String) this.f28158b;
        i7 i7Var = (i7) this.d;
        ec ecVar = ((ob) this.f28159c).f26077b;
        HashMap hashMap = ecVar.h;
        ConcurrentHashMap concurrentHashMap = ecVar.f23710i;
        sb sbVar = (sb) hashMap.remove(str);
        if (sbVar != null) {
            ArrayList arrayList = sbVar.v;
            ecVar.f23709g.remove(str);
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                String str2 = (String) sbVar.f26810x.get(i7);
                String str3 = (String) sbVar.f26811y.get(i7);
                int intValue = ((Integer) sbVar.f26812z.get(i7)).intValue();
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i7);
                int intValue2 = ((Integer) sbVar.f26809w.get(i7)).intValue();
                sb sbVar2 = (sb) concurrentHashMap.get(str2);
                if (sbVar2 == null) {
                    sbVar2 = new sb(ecVar);
                    sbVar2.f26790a = sbVar.f26790a;
                    sbVar2.h = sbVar.h;
                    sbVar2.f26802o = sbVar.f26802o;
                    sbVar2.f26803p = i7Var.g();
                    sbVar2.f26797j = sbVar.f26797j;
                    sbVar2.f26792c = sbVar.f26792c;
                    sbVar2.d = str2;
                    sbVar2.f26796i = sbVar.f26796i;
                    sbVar2.f26800m = intValue;
                    sbVar2.f26795g = sbVar.f26795g;
                    sbVar2.f26805r = sbVar.f26805r;
                    sbVar2.f26808u = new tb(ecVar, sbVar2);
                    sbVar2.f26794f = str3;
                    sbVar2.f26799l = sbVar.f26799l;
                    sbVar2.f26801n = sbVar.f26801n;
                    concurrentHashMap.put(str2, sbVar2);
                    ecVar.f23711j.add(ec.n(str2));
                    arrayList2.add(sbVar2.f26808u);
                }
                sbVar2.a(imageReceiver, str2, str3, intValue, intValue2);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                tb tbVar = (tb) arrayList2.get(i10);
                sb sbVar3 = tbVar.f27005c;
                if (sbVar3.f26800m == 1) {
                    ecVar.f23718q.c(tbVar);
                } else {
                    com.google.android.gms.internal.cast.b0 b0Var = ecVar.f23717p;
                    int i11 = sbVar3.f26790a;
                    if (i11 != 1) {
                        b0Var.getClass();
                        tbVar = new of.b(i11, tbVar);
                    }
                    ((of.a) b0Var.f6515b).execute(tbVar);
                }
            }
        }
    }

    private final void f() {
        ((tb) this.f28159c).f27005c.c((Drawable) this.f28158b, (String) this.d);
    }

    private final void g() {
        int[] iArr = (int[]) this.f28159c;
        Runnable runnable = (Runnable) this.d;
        int i7 = iArr[0] + 1;
        iArr[0] = i7;
        if (i7 >= ((int[]) this.f28158b)[0] && runnable != null) {
            runnable.run();
        }
    }

    private final void h() {
        qd qdVar = (qd) this.f28159c;
        pd pdVar = (pd) this.f28158b;
        pd pdVar2 = (pd) this.d;
        ArrayList arrayList = qdVar.J;
        if (pdVar != null) {
            arrayList.remove(pdVar);
        }
        arrayList.add(pdVar2);
        qdVar.K.k(pdVar2, pdVar2.f26253a);
        qd.q();
        ks.e().k(ks.G4, new Object[0]);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yf.run():void");
    }

    public yf(TLObject tLObject, x10 x10Var, TLRPC.TL_error tL_error) {
        this.f28157a = 12;
        this.d = tLObject;
        this.f28159c = x10Var;
        this.f28158b = tL_error;
    }
}
