package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class e5 implements Runnable {
    public final int f27921a;
    public final g5 f27922b;
    public final ArrayList f27923c;
    public final HashSet d;

    public e5(g5 g5Var, ArrayList arrayList, HashSet hashSet, int i9) {
        this.f27921a = i9;
        this.f27922b = g5Var;
        this.f27923c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f27921a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e5(this.f27922b, this.f27923c, this.d, 1));
                return;
            default:
                g5 g5Var = this.f27922b;
                g5Var.d(this.f27923c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(g5Var.f28654e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.rc(10, g5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
