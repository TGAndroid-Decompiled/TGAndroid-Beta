package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class k5 implements Runnable {
    public final int f24606a;
    public final l5 f24607b;
    public final ArrayList f24608c;
    public final TLObject d;

    public k5(l5 l5Var, ArrayList arrayList, TLObject tLObject, int i10) {
        this.f24606a = i10;
        this.f24607b = l5Var;
        this.f24608c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f24606a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k5(this.f24607b, this.f24608c, this.d, 1));
                return;
            default:
                l5 l5Var = this.f24607b;
                int i10 = l5Var.e;
                HashSet hashSet = new HashSet(this.f24608c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new i5(l5Var, arrayList, 1));
                    l5Var.d(arrayList);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i11)).f17201id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getCustomEmojiDocuments, new bi.o2(28, l5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
