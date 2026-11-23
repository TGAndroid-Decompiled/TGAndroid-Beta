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
    public final int f28289a;
    public final Object f28290b;
    public final Object f28291c;
    public final Object d;

    public zf(Object obj, Object obj2, Object obj3, int i7) {
        this.f28289a = i7;
        this.f28291c = obj;
        this.f28290b = obj2;
        this.d = obj3;
    }

    private final void a() {
        w7 w7Var = (w7) this.f28291c;
        TLRPC.Document document = (TLRPC.Document) this.f28290b;
        gj gjVar = (gj) this.d;
        int i7 = 3;
        if (document == null) {
            ConcurrentHashMap concurrentHashMap = s8.I;
        } else {
            Integer num = (Integer) s8.J.get(Long.valueOf(document.f28404id));
            if (num != null) {
                i7 = num.intValue();
            }
        }
        w7Var.Y(document, null, null, null, null, gjVar, null, 0L, i7, w7.N, 0L, false, 0);
    }

    private final void b() {
        w7 w7Var = (w7) this.f28291c;
        lg.f fVar = (lg.f) this.f28290b;
        i7 i7Var = (i7) this.d;
        if (((ArrayList) fVar.d).remove(i7Var)) {
            w7Var.f27665w.remove(i7Var.f24629r);
            fVar.b(i7Var.f24613j);
        }
    }

    private final void c() {
        f8 f8Var = (f8) this.f28291c;
        File file = (File) this.f28290b;
        e8 e8Var = (e8) this.d;
        f8Var.c();
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = f8Var.f23841c.executeFast("REPLACE INTO paths_by_dialog_id VALUES(?, ?, ?, ?)");
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindString(1, file.getPath().replace("'", "").replace("\"", ""));
                sQLitePreparedStatement.bindLong(2, e8Var.f23651a);
                sQLitePreparedStatement.bindInteger(3, e8Var.f23652b);
                sQLitePreparedStatement.bindInteger(4, e8Var.f23653c);
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
        String str = (String) this.f28290b;
        i7 i7Var = (i7) this.d;
        fc fcVar = ((pb) this.f28291c).f26259b;
        HashMap hashMap = fcVar.h;
        ConcurrentHashMap concurrentHashMap = fcVar.f23855i;
        tb tbVar = (tb) hashMap.remove(str);
        if (tbVar != null) {
            ArrayList arrayList = tbVar.v;
            fcVar.f23854g.remove(str);
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                String str2 = (String) tbVar.f26974x.get(i7);
                String str3 = (String) tbVar.f26975y.get(i7);
                int intValue = ((Integer) tbVar.f26976z.get(i7)).intValue();
                ImageReceiver imageReceiver = (ImageReceiver) arrayList.get(i7);
                int intValue2 = ((Integer) tbVar.f26973w.get(i7)).intValue();
                tb tbVar2 = (tb) concurrentHashMap.get(str2);
                if (tbVar2 == null) {
                    tbVar2 = new tb(fcVar);
                    tbVar2.f26954a = tbVar.f26954a;
                    tbVar2.h = tbVar.h;
                    tbVar2.f26966o = tbVar.f26966o;
                    tbVar2.f26967p = i7Var.g();
                    tbVar2.f26961j = tbVar.f26961j;
                    tbVar2.f26956c = tbVar.f26956c;
                    tbVar2.d = str2;
                    tbVar2.f26960i = tbVar.f26960i;
                    tbVar2.f26964m = intValue;
                    tbVar2.f26959g = tbVar.f26959g;
                    tbVar2.f26969r = tbVar.f26969r;
                    tbVar2.f26972u = new ub(fcVar, tbVar2);
                    tbVar2.f26958f = str3;
                    tbVar2.f26963l = tbVar.f26963l;
                    tbVar2.f26965n = tbVar.f26965n;
                    concurrentHashMap.put(str2, tbVar2);
                    fcVar.f23856j.add(fc.n(str2));
                    arrayList2.add(tbVar2.f26972u);
                }
                tbVar2.a(imageReceiver, str2, str3, intValue, intValue2);
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                ub ubVar = (ub) arrayList2.get(i10);
                tb tbVar3 = ubVar.f27139c;
                if (tbVar3.f26964m == 1) {
                    fcVar.f23863q.c(ubVar);
                } else {
                    com.google.android.gms.internal.cast.b0 b0Var = fcVar.f23862p;
                    int i11 = tbVar3.f26954a;
                    if (i11 != 1) {
                        b0Var.getClass();
                        ubVar = new of.b(i11, ubVar);
                    }
                    ((of.a) b0Var.f6481b).execute(ubVar);
                }
            }
        }
    }

    private final void f() {
        ((ub) this.f28291c).f27139c.c((Drawable) this.f28290b, (String) this.d);
    }

    private final void g() {
        int[] iArr = (int[]) this.f28291c;
        Runnable runnable = (Runnable) this.d;
        int i7 = iArr[0] + 1;
        iArr[0] = i7;
        if (i7 >= ((int[]) this.f28290b)[0] && runnable != null) {
            runnable.run();
        }
    }

    private final void h() {
        rd rdVar = (rd) this.f28291c;
        qd qdVar = (qd) this.f28290b;
        qd qdVar2 = (qd) this.d;
        ArrayList arrayList = rdVar.J;
        if (qdVar != null) {
            arrayList.remove(qdVar);
        }
        arrayList.add(qdVar2);
        rdVar.K.k(qdVar2, qdVar2.f26398a);
        rd.q();
        ls.e().k(ls.G4, new Object[0]);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.zf.run():void");
    }

    public zf(TLObject tLObject, y10 y10Var, TLRPC.TL_error tL_error) {
        this.f28289a = 12;
        this.d = tLObject;
        this.f28291c = y10Var;
        this.f28290b = tL_error;
    }
}
