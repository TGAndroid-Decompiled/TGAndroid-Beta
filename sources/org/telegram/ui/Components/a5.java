package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class a5 implements Runnable {
    public final int f24285a;
    public final b5 f24286b;
    public final ArrayList f24287c;
    public final TLObject d;

    public a5(b5 b5Var, ArrayList arrayList, TLObject tLObject, int i10) {
        this.f24285a = i10;
        this.f24286b = b5Var;
        this.f24287c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f24285a) {
            case 0:
                org.telegram.messenger.i0.g3(new a5(this.f24286b, this.f24287c, this.d, 1));
                return;
            default:
                b5 b5Var = this.f24286b;
                int i10 = b5Var.e;
                HashSet hashSet = new HashSet(this.f24287c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    org.telegram.messenger.is.a0(i10).f16331a.c(new y4(b5Var, arrayList, 1));
                    b5Var.d(arrayList);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i11)).f19800id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getCustomEmojiDocuments, new ag.k0(23, b5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
