package org.telegram.ui.Components;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gr0 implements Runnable {
    public final int f24389a;
    public final Object f24390b;
    public final Object f24391c;
    public final Object d;

    public gr0(Object obj, Object obj2, Object obj3, int i10) {
        this.f24389a = i10;
        this.f24390b = obj;
        this.f24391c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ((org.telegram.ui.web.b1) this.f24390b).run(new Pair((HashMap) this.f24391c, (ArrayList) this.d));
    }

    private final void b() {
        uf.d dVar = (uf.d) this.f24390b;
        TLObject tLObject = (TLObject) this.f24391c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        String str = dVar.f43723b;
        int i10 = dVar.f43722a;
        if (tLObject != null) {
            MediaDataController.getInstance(i10).onRingtoneUploaded(str, (TLRPC.Document) tLObject, false);
        } else {
            dVar.a();
            MediaDataController.getInstance(i10).onRingtoneUploaded(str, null, true);
            if (tL_error != null) {
                NotificationCenter.getInstance(i10).doOnIdle(new p2.b(29, dVar, tL_error));
            }
        }
        dVar.a();
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gr0.run():void");
    }

    public gr0(org.telegram.ui.web.g1 g1Var, ArrayList arrayList, String str) {
        this.f24389a = 19;
        this.f24390b = g1Var;
        this.d = arrayList;
        this.f24391c = str;
    }
}
