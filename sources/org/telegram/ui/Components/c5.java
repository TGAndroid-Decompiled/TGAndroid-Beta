package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class c5 implements Runnable {
    public final int f32455a;
    public final d5 f32456b;
    public final ArrayList f32457c;
    public final TLObject d;

    public c5(d5 d5Var, ArrayList arrayList, TLObject tLObject, int i7) {
        this.f32455a = i7;
        this.f32456b = d5Var;
        this.f32457c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f32455a) {
            case 0:
                org.telegram.messenger.g0.h3(new c5(this.f32456b, this.f32457c, this.d, 1));
                return;
            default:
                d5 d5Var = this.f32456b;
                int i7 = d5Var.f32890e;
                HashSet hashSet = new HashSet(this.f32457c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    org.telegram.messenger.yr.a0(i7).f26723a.c(new a5(d5Var, arrayList, 1));
                    d5Var.d(arrayList);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i10)).f26966id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.ld(9, d5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
