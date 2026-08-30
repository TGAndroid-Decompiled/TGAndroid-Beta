package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class g5 implements Runnable {
    public final int f25045a;
    public final h5 f25046b;
    public final ArrayList f25047c;
    public final TLObject d;

    public g5(h5 h5Var, ArrayList arrayList, TLObject tLObject, int i10) {
        this.f25045a = i10;
        this.f25046b = h5Var;
        this.f25047c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f25045a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g5(this.f25046b, this.f25047c, this.d, 1));
                return;
            default:
                h5 h5Var = this.f25046b;
                int i10 = h5Var.e;
                HashSet hashSet = new HashSet(this.f25047c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new e5(h5Var, arrayList, 1));
                    h5Var.d(arrayList);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i11)).f19190id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.lo(3, h5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
