package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i5 implements Runnable {
    public final int f36049a;
    public final k5 f36050b;
    public final ArrayList f36051c;
    public final HashSet d;

    public i5(k5 k5Var, ArrayList arrayList, HashSet hashSet, int i7) {
        this.f36049a = i7;
        this.f36050b = k5Var;
        this.f36051c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f36049a) {
            case 0:
                org.telegram.messenger.g0.g3(new i5(this.f36050b, this.f36051c, this.d, 1));
                return;
            default:
                k5 k5Var = this.f36050b;
                k5Var.d(this.f36051c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(k5Var.f36681e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.u7(11, k5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
