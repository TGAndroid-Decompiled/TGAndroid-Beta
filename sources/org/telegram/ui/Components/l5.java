package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class l5 implements Runnable {
    public final int f28057a;
    public final m5 f28058b;
    public final ArrayList f28059c;
    public final TLObject d;

    public l5(m5 m5Var, ArrayList arrayList, TLObject tLObject, int i10) {
        this.f28057a = i10;
        this.f28058b = m5Var;
        this.f28059c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28057a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l5(this.f28058b, this.f28059c, this.d, 1));
                return;
            default:
                m5 m5Var = this.f28058b;
                int i10 = m5Var.f28384e;
                HashSet hashSet = new HashSet(this.f28059c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new j5(m5Var, arrayList, 1));
                    m5Var.d(arrayList);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i11)).f19875id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.ro(3, m5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
