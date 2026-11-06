package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class d5 implements Runnable {
    public final int f32764a;
    public final e5 f32765b;
    public final ArrayList f32766c;
    public final TLObject d;

    public d5(e5 e5Var, ArrayList arrayList, TLObject tLObject, int i7) {
        this.f32764a = i7;
        this.f32765b = e5Var;
        this.f32766c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f32764a) {
            case 0:
                org.telegram.messenger.g0.h3(new d5(this.f32765b, this.f32766c, this.d, 1));
                return;
            default:
                e5 e5Var = this.f32765b;
                int i7 = e5Var.f33140e;
                HashSet hashSet = new HashSet(this.f32766c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    org.telegram.messenger.yr.a0(i7).f26688a.c(new b5(e5Var, arrayList, 1));
                    e5Var.d(arrayList);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i10)).f26958id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.ld(9, e5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
