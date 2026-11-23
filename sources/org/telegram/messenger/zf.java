package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zf implements Runnable {
    public final int f28325a;
    public final Object f28326b;
    public final Object f28327c;
    public final Object d;

    public zf(Object obj, Object obj2, Object obj3, int i7) {
        this.f28325a = i7;
        this.f28327c = obj;
        this.f28326b = obj2;
        this.d = obj3;
    }

    private final void a() {
        w7 w7Var = (w7) this.f28327c;
        TLRPC.Document document = (TLRPC.Document) this.f28326b;
        gj gjVar = (gj) this.d;
        int i7 = 3;
        if (document == null) {
            ConcurrentHashMap concurrentHashMap = s8.I;
        } else {
            Integer num = (Integer) s8.J.get(Long.valueOf(document.f28440id));
            if (num != null) {
                i7 = num.intValue();
            }
        }
        w7Var.Y(document, null, null, null, null, gjVar, null, 0L, i7, w7.N, 0L, false, 0);
    }

    private final void b() {
        w7 w7Var = (w7) this.f28327c;
        lg.f fVar = (lg.f) this.f28326b;
        i7 i7Var = (i7) this.d;
        if (((ArrayList) fVar.d).remove(i7Var)) {
            w7Var.f27701w.remove(i7Var.f24665r);
            fVar.b(i7Var.f24649j);
        }
    }

    private final void c() {
        f8 f8Var = (f8) this.f28327c;
        File file = (File) this.f28326b;
        e8 e8Var = (e8) this.d;
        f8Var.c();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = f8Var.f23877c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                sQLitePreparedStatement.bindLong(2, e8Var.f23687a);
                sQLitePreparedStatement.bindInteger(3, e8Var.f23688b);
                sQLitePreparedStatement.bindInteger(4, e8Var.f23689c);
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
        String str = (String) this.f28326b;
        i7 i7Var = (i7) this.d;
        fc fcVar = ((pb) this.f28327c).f26295b;
        HashMap hashMap = fcVar.h;
        ConcurrentHashMap concurrentHashMap = fcVar.f23891i;
        tb tbVar = (tb) hashMap.remove(str);
        if (tbVar != null) {
            ArrayList arrayList = tbVar.v;
            fcVar.f23890g.remove(str);
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                String str2 = (String) tbVar.f27010x.get(i7);
                String str3 = (String) tbVar.f27011y.get(i7);
                int intValue = ((Integer) tbVar.f27012z.get(i7)).intValue();
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i7);
                int intValue2 = ((Integer) tbVar.f27009w.get(i7)).intValue();
                tb tbVar2 = (tb) concurrentHashMap.get(str2);
                if (tbVar2 == null) {
                    tbVar2 = new tb(fcVar);
                    tbVar2.f26990a = tbVar.f26990a;
                    tbVar2.h = tbVar.h;
                    tbVar2.f27002o = tbVar.f27002o;
                    tbVar2.f27003p = i7Var.g();
                    tbVar2.f26997j = tbVar.f26997j;
                    tbVar2.f26992c = tbVar.f26992c;
                    tbVar2.d = str2;
                    tbVar2.f26996i = tbVar.f26996i;
                    tbVar2.f27000m = intValue;
                    tbVar2.f26995g = tbVar.f26995g;
                    tbVar2.f27005r = tbVar.f27005r;
                    tbVar2.f27008u = new ub(fcVar, tbVar2);
                    tbVar2.f26994f = str3;
                    tbVar2.f26999l = tbVar.f26999l;
                    tbVar2.f27001n = tbVar.f27001n;
                    concurrentHashMap.put(str2, tbVar2);
                    fcVar.f23892j.add(fc.n(str2));
                    arrayList2.add(tbVar2.f27008u);
                }
                tbVar2.a(imageReceiver, str2, str3, intValue, intValue2);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ub ubVar = (ub) arrayList2.get(i10);
                tb tbVar3 = ubVar.f27175c;
                if (tbVar3.f27000m == 1) {
                    fcVar.f23899q.c(ubVar);
                } else {
                    com.google.android.gms.internal.cast.b0 b0Var = fcVar.f23898p;
                    int i11 = tbVar3.f26990a;
                    if (i11 != 1) {
                        b0Var.getClass();
                        ubVar = new of.b(i11, ubVar);
                    }
                    ((of.a) b0Var.f6518b).execute(ubVar);
                }
            }
        }
    }

    private final void f() {
        ((ub) this.f28327c).f27175c.c((Drawable) this.f28326b, (String) this.d);
    }

    private final void g() {
        int[] iArr = (int[]) this.f28327c;
        Runnable runnable = (Runnable) this.d;
        int i7 = iArr[0] + 1;
        iArr[0] = i7;
        if (i7 >= ((int[]) this.f28326b)[0] && runnable != null) {
            runnable.run();
        }
    }

    private final void h() {
        rd rdVar = (rd) this.f28327c;
        qd qdVar = (qd) this.f28326b;
        qd qdVar2 = (qd) this.d;
        ArrayList arrayList = rdVar.J;
        if (qdVar != null) {
            arrayList.remove(qdVar);
        }
        arrayList.add(qdVar2);
        rdVar.K.k(qdVar2, qdVar2.f26434a);
        rd.q();
        ls.e().k(ls.G4, new Object[0]);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zf.run():void");
    }

    public zf(TLObject tLObject, y10 y10Var, TLRPC.TL_error tL_error) {
        this.f28325a = 12;
        this.d = tLObject;
        this.f28327c = y10Var;
        this.f28326b = tL_error;
    }
}
