package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m5 implements Runnable {
    public final int f28530a;
    public final o5 f28531b;
    public final ArrayList f28532c;
    public final HashSet d;

    public m5(o5 o5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f28530a = i10;
        this.f28531b = o5Var;
        this.f28532c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f28530a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m5(this.f28531b, this.f28532c, this.d, 1));
                return;
            default:
                o5 o5Var = this.f28531b;
                o5Var.d(this.f28532c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(o5Var.f29257e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.oo(3, o5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
