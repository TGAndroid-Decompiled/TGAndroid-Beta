package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j5 implements Runnable {
    public final int f25284a;
    public final l5 f25285b;
    public final ArrayList f25286c;
    public final HashSet d;

    public j5(l5 l5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f25284a = i10;
        this.f25285b = l5Var;
        this.f25286c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f25284a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j5(this.f25285b, this.f25286c, this.d, 1));
                return;
            default:
                l5 l5Var = this.f25285b;
                l5Var.d(this.f25286c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(l5Var.e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.oo(3, l5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
