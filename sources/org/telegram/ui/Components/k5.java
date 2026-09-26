package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class k5 implements Runnable {
    public final int f25634a;
    public final m5 f25635b;
    public final ArrayList f25636c;
    public final HashSet d;

    public k5(m5 m5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f25634a = i10;
        this.f25635b = m5Var;
        this.f25636c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f25634a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k5(this.f25635b, this.f25636c, this.d, 1));
                return;
            default:
                m5 m5Var = this.f25635b;
                m5Var.d(this.f25636c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(m5Var.e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.lo(3, m5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
