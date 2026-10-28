package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class n5 implements Runnable {
    public final int f30735a;
    public final p5 f30736b;
    public final ArrayList f30737c;
    public final HashSet d;

    public n5(p5 p5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f30735a = i10;
        this.f30736b = p5Var;
        this.f30737c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f30735a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n5(this.f30736b, this.f30737c, this.d, 1));
                return;
            default:
                p5 p5Var = this.f30736b;
                p5Var.d(this.f30737c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(p5Var.e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.z7(11, p5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
