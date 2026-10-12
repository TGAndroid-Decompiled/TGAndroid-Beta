package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m5 implements Runnable {
    public final int f28392a;
    public final o5 f28393b;
    public final ArrayList f28394c;
    public final HashSet d;

    public m5(o5 o5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f28392a = i10;
        this.f28393b = o5Var;
        this.f28394c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f28392a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m5(this.f28393b, this.f28394c, this.d, 1));
                return;
            default:
                o5 o5Var = this.f28393b;
                o5Var.d(this.f28394c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(o5Var.f29078e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.so(3, o5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
