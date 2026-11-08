package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c5 implements Runnable {
    public final int f32451a;
    public final e5 f32452b;
    public final ArrayList f32453c;
    public final HashSet d;

    public c5(e5 e5Var, ArrayList arrayList, HashSet hashSet, int i7) {
        this.f32451a = i7;
        this.f32452b = e5Var;
        this.f32453c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f32451a) {
            case 0:
                org.telegram.messenger.g0.h3(new c5(this.f32452b, this.f32453c, this.d, 1));
                return;
            default:
                e5 e5Var = this.f32452b;
                e5Var.d(this.f32453c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(e5Var.f33201e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.ld(9, e5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
