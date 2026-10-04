package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class k5 implements Runnable {
    public final int f27953a;
    public final m5 f27954b;
    public final ArrayList f27955c;
    public final HashSet d;

    public k5(m5 m5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f27953a = i10;
        this.f27954b = m5Var;
        this.f27955c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f27953a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k5(this.f27954b, this.f27955c, this.d, 1));
                return;
            default:
                m5 m5Var = this.f27954b;
                m5Var.d(this.f27955c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(m5Var.f28530e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.no(3, m5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
