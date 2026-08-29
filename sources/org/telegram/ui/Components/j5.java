package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j5 implements Runnable {
    public final int f29551a;
    public final l5 f29552b;
    public final ArrayList f29553c;
    public final HashSet d;

    public j5(l5 l5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f29551a = i10;
        this.f29552b = l5Var;
        this.f29553c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f29551a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j5(this.f29552b, this.f29553c, this.d, 1));
                return;
            default:
                l5 l5Var = this.f29552b;
                l5Var.d(this.f29553c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(l5Var.f30232e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.zg(6, l5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
