package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class b5 implements Runnable {
    public final int f33195a;
    public final c5 f33196b;
    public final ArrayList f33197c;
    public final TLObject d;

    public b5(c5 c5Var, ArrayList arrayList, TLObject tLObject, int i7) {
        this.f33195a = i7;
        this.f33196b = c5Var;
        this.f33197c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f33195a) {
            case 0:
                org.telegram.messenger.g0.h3(new b5(this.f33196b, this.f33197c, this.d, 1));
                return;
            default:
                c5 c5Var = this.f33196b;
                int i7 = c5Var.f33505e;
                HashSet hashSet = new HashSet(this.f33197c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    org.telegram.messenger.vr.a0(i7).f27220a.c(new z4(c5Var, arrayList, 1));
                    c5Var.d(arrayList);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i10)).f28057id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.v7(11, c5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
