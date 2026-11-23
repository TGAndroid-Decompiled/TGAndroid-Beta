package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j5 implements Runnable {
    public final int f36402a;
    public final l5 f36403b;
    public final ArrayList f36404c;
    public final HashSet d;

    public j5(l5 l5Var, ArrayList arrayList, HashSet hashSet, int i7) {
        this.f36402a = i7;
        this.f36403b = l5Var;
        this.f36404c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f36402a) {
            case 0:
                org.telegram.messenger.g0.g3(new j5(this.f36403b, this.f36404c, this.d, 1));
                return;
            default:
                l5 l5Var = this.f36403b;
                l5Var.d(this.f36404c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(l5Var.f37110e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.u7(11, l5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
