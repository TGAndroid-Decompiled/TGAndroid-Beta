package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l5 implements Runnable {
    public final int f28075a;
    public final n5 f28076b;
    public final ArrayList f28077c;
    public final HashSet d;

    public l5(n5 n5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f28075a = i10;
        this.f28076b = n5Var;
        this.f28077c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f28075a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l5(this.f28076b, this.f28077c, this.d, 1));
                return;
            default:
                n5 n5Var = this.f28076b;
                n5Var.d(this.f28077c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(n5Var.e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.vc(10, n5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
