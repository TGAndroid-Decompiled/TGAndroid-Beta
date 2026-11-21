package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class k5 implements Runnable {
    public final int f36776a;
    public final l5 f36777b;
    public final ArrayList f36778c;
    public final TLObject d;

    public k5(l5 l5Var, ArrayList arrayList, TLObject tLObject, int i7) {
        this.f36776a = i7;
        this.f36777b = l5Var;
        this.f36778c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f36776a) {
            case 0:
                org.telegram.messenger.g0.g3(new k5(this.f36777b, this.f36778c, this.d, 1));
                return;
            default:
                l5 l5Var = this.f36777b;
                int i7 = l5Var.f37105e;
                HashSet hashSet = new HashSet(this.f36778c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    org.telegram.messenger.tr.a0(i7).f27080a.c(new i5(l5Var, arrayList, 1));
                    l5Var.d(arrayList);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i10)).f28437id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.u7(11, l5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
