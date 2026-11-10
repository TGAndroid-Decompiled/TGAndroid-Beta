package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class b5 implements Runnable {
    public final int f32115a;
    public final d5 f32116b;
    public final ArrayList f32117c;
    public final HashSet d;

    public b5(d5 d5Var, ArrayList arrayList, HashSet hashSet, int i7) {
        this.f32115a = i7;
        this.f32116b = d5Var;
        this.f32117c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f32115a) {
            case 0:
                org.telegram.messenger.g0.h3(new b5(this.f32116b, this.f32117c, this.d, 1));
                return;
            default:
                d5 d5Var = this.f32116b;
                d5Var.d(this.f32117c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(d5Var.f32890e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.ld(9, d5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
