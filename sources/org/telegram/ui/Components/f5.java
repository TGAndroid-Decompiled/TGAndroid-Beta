package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f5 implements Runnable {
    public final int f26745a;
    public final h5 f26746b;
    public final ArrayList f26747c;
    public final HashSet d;

    public f5(h5 h5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f26745a = i10;
        this.f26746b = h5Var;
        this.f26747c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f26745a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f5(this.f26746b, this.f26747c, this.d, 1));
                return;
            default:
                h5 h5Var = this.f26746b;
                h5Var.d(this.f26747c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(h5Var.f27388e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.lo(3, h5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
