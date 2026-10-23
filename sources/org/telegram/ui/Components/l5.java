package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class l5 implements Runnable {
    public final int f28215a;
    public final n5 f28216b;
    public final ArrayList f28217c;
    public final HashSet d;

    public l5(n5 n5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f28215a = i10;
        this.f28216b = n5Var;
        this.f28217c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f28215a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l5(this.f28216b, this.f28217c, this.d, 1));
                return;
            default:
                n5 n5Var = this.f28216b;
                n5Var.d(this.f28217c);
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
