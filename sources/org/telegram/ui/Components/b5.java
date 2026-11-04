package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class b5 implements Runnable {
    public final int f32083a;
    public final c5 f32084b;
    public final ArrayList f32085c;
    public final TLObject d;

    public b5(c5 c5Var, ArrayList arrayList, TLObject tLObject, int i3) {
        this.f32083a = i3;
        this.f32084b = c5Var;
        this.f32085c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f32083a) {
            case 0:
                org.telegram.messenger.g0.h3(new b5(this.f32084b, this.f32085c, this.d, 1));
                return;
            default:
                c5 c5Var = this.f32084b;
                int i3 = c5Var.f32564e;
                HashSet hashSet = new HashSet(this.f32085c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    org.telegram.messenger.qr.a0(i3).f24934a.c(new z4(c5Var, arrayList, 1));
                    c5Var.d(arrayList);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i10)).f27007id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.ActionBar.h6(12, c5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
