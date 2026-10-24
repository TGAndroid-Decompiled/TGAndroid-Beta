package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j5 implements Runnable {
    public final int f27553a;
    public final l5 f27554b;
    public final ArrayList f27555c;
    public final HashSet d;

    public j5(l5 l5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f27553a = i10;
        this.f27554b = l5Var;
        this.f27555c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f27553a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j5(this.f27554b, this.f27555c, this.d, 1));
                return;
            default:
                l5 l5Var = this.f27554b;
                l5Var.d(this.f27555c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(l5Var.e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.vc(10, l5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
