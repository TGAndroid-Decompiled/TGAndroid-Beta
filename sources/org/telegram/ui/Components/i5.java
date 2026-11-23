package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i5 implements Runnable {
    public final int f35914a;
    public final k5 f35915b;
    public final ArrayList f35916c;
    public final HashSet d;

    public i5(k5 k5Var, ArrayList arrayList, HashSet hashSet, int i7) {
        this.f35914a = i7;
        this.f35915b = k5Var;
        this.f35916c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f35914a) {
            case 0:
                org.telegram.messenger.g0.g3(new i5(this.f35915b, this.f35916c, this.d, 1));
                return;
            default:
                k5 k5Var = this.f35915b;
                k5Var.d(this.f35916c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(k5Var.f36650e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.v7(11, k5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
