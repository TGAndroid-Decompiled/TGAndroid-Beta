package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class j5 implements Runnable {
    public final int f36271a;
    public final k5 f36272b;
    public final ArrayList f36273c;
    public final TLObject d;

    public j5(k5 k5Var, ArrayList arrayList, TLObject tLObject, int i7) {
        this.f36271a = i7;
        this.f36272b = k5Var;
        this.f36273c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f36271a) {
            case 0:
                org.telegram.messenger.g0.g3(new j5(this.f36272b, this.f36273c, this.d, 1));
                return;
            default:
                k5 k5Var = this.f36272b;
                int i7 = k5Var.f36650e;
                HashSet hashSet = new HashSet(this.f36273c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    org.telegram.messenger.tr.a0(i7).f27149a.c(new h5(k5Var, arrayList, 1));
                    k5Var.d(arrayList);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i10)).f28498id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.v7(11, k5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
