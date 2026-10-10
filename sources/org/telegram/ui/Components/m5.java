package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class m5 implements Runnable {
    public final int f28631a;
    public final o5 f28632b;
    public final ArrayList f28633c;
    public final HashSet d;

    public m5(o5 o5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f28631a = i10;
        this.f28632b = o5Var;
        this.f28633c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f28631a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m5(this.f28632b, this.f28633c, this.d, 1));
                return;
            default:
                o5 o5Var = this.f28632b;
                o5Var.d(this.f28633c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(o5Var.f29345e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.oo(3, o5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
