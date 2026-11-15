package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a5 implements Runnable {
    public final int f32850a;
    public final c5 f32851b;
    public final ArrayList f32852c;
    public final HashSet d;

    public a5(c5 c5Var, ArrayList arrayList, HashSet hashSet, int i7) {
        this.f32850a = i7;
        this.f32851b = c5Var;
        this.f32852c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f32850a) {
            case 0:
                org.telegram.messenger.g0.h3(new a5(this.f32851b, this.f32852c, this.d, 1));
                return;
            default:
                c5 c5Var = this.f32851b;
                c5Var.d(this.f32852c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(c5Var.f33508e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.v7(11, c5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
