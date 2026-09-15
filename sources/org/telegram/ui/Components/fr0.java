package org.telegram.ui.Components;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fr0 implements Runnable {
    public final int f24060a;
    public final Object f24061b;
    public final Object f24062c;
    public final Object d;

    public fr0(Object obj, Object obj2, Object obj3, int i10) {
        this.f24060a = i10;
        this.f24061b = obj;
        this.f24062c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ((org.telegram.ui.web.b1) this.f24061b).run(new Pair((HashMap) this.f24062c, (ArrayList) this.d));
    }

    private final void b() {
        uf.d dVar = (uf.d) this.f24061b;
        TLObject tLObject = (TLObject) this.f24062c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        String str = dVar.f43700b;
        int i10 = dVar.f43699a;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fr0.run():void");
    }

    public fr0(org.telegram.ui.web.g1 g1Var, ArrayList arrayList, String str) {
        this.f24060a = 19;
        this.f24061b = g1Var;
        this.d = arrayList;
        this.f24062c = str;
    }
}
