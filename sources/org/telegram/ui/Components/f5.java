package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class f5 implements Runnable {
    public final int f28269a;
    public final g5 f28270b;
    public final ArrayList f28271c;
    public final TLObject d;

    public f5(g5 g5Var, ArrayList arrayList, TLObject tLObject, int i9) {
        this.f28269a = i9;
        this.f28270b = g5Var;
        this.f28271c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28269a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f5(this.f28270b, this.f28271c, this.d, 1));
                return;
            default:
                g5 g5Var = this.f28270b;
                int i9 = g5Var.f28654e;
                HashSet hashSet = new HashSet(this.f28271c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    MessagesStorage.getInstance(i9).getStorageQueue().postRunnable(new d5(g5Var, arrayList, 1));
                    g5Var.d(arrayList);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i10)).f22386id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.rc(10, g5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
