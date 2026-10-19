package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class m5 implements Runnable {
    public final int f28388a;
    public final n5 f28389b;
    public final ArrayList f28390c;
    public final TLObject d;

    public m5(n5 n5Var, ArrayList arrayList, TLObject tLObject, int i10) {
        this.f28388a = i10;
        this.f28389b = n5Var;
        this.f28390c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28388a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m5(this.f28389b, this.f28390c, this.d, 1));
                return;
            default:
                n5 n5Var = this.f28389b;
                int i10 = n5Var.e;
                HashSet hashSet = new HashSet(this.f28390c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new k5(n5Var, arrayList, 1));
                    n5Var.d(arrayList);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i11)).f20279id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.vc(10, n5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
