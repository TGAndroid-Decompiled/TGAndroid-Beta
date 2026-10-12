package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m5 implements Runnable {
    public final int f27205a;
    public final o5 f27206b;
    public final ArrayList f27207c;
    public final HashSet d;

    public m5(o5 o5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f27205a = i10;
        this.f27206b = o5Var;
        this.f27207c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f27205a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m5(this.f27206b, this.f27207c, this.d, 1));
                return;
            default:
                o5 o5Var = this.f27206b;
                o5Var.d(this.f27207c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(o5Var.e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.to(3, o5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
