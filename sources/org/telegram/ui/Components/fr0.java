package org.telegram.ui.Components;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fr0 implements Runnable {
    public final int f24057a;
    public final Object f24058b;
    public final Object f24059c;
    public final Object d;

    public fr0(Object obj, Object obj2, Object obj3, int i10) {
        this.f24057a = i10;
        this.f24058b = obj;
        this.f24059c = obj2;
        this.d = obj3;
    }

    private final void a() {
        ((org.telegram.ui.web.b1) this.f24058b).run(new Pair((HashMap) this.f24059c, (ArrayList) this.d));
    }

    private final void b() {
        uf.d dVar = (uf.d) this.f24058b;
        TLObject tLObject = (TLObject) this.f24059c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        String str = dVar.f43696b;
        int i10 = dVar.f43695a;
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
        this.f24057a = 19;
        this.f24058b = g1Var;
        this.d = arrayList;
        this.f24059c = str;
    }
}
