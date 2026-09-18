package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class j5 implements Runnable {
    public final int f25116a;
    public final k5 f25117b;
    public final ArrayList f25118c;
    public final TLObject d;

    public j5(k5 k5Var, ArrayList arrayList, TLObject tLObject, int i10) {
        this.f25116a = i10;
        this.f25117b = k5Var;
        this.f25118c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f25116a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j5(this.f25117b, this.f25118c, this.d, 1));
                return;
            default:
                k5 k5Var = this.f25117b;
                int i10 = k5Var.e;
                HashSet hashSet = new HashSet(this.f25118c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new h5(k5Var, arrayList, 1));
                    k5Var.d(arrayList);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i11)).f18127id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.qo(3, k5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
