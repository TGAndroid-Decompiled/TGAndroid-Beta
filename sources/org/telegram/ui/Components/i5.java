package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i5 implements Runnable {
    public final int f24885a;
    public final k5 f24886b;
    public final ArrayList f24887c;
    public final HashSet d;

    public i5(k5 k5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f24885a = i10;
        this.f24886b = k5Var;
        this.f24887c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f24885a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i5(this.f24886b, this.f24887c, this.d, 1));
                return;
            default:
                k5 k5Var = this.f24886b;
                k5Var.d(this.f24887c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(k5Var.e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.qo(3, k5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
