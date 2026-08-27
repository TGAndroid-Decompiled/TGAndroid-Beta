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

    public final int f28255a;

    public final g5 f28256b;

    public final ArrayList f28257c;
    public final TLObject d;

    public f5(g5 g5Var, ArrayList arrayList, TLObject tLObject, int i10) {
        this.f28255a = i10;
        this.f28256b = g5Var;
        this.f28257c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28255a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f5(this.f28256b, this.f28257c, this.d, 1));
                break;
            default:
                g5 g5Var = this.f28256b;
                int i10 = g5Var.f28534e;
                HashSet hashSet = new HashSet(this.f28257c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new d5(g5Var, arrayList, 1));
                    g5Var.d(arrayList);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i11)).f22386id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.gg(7, g5Var, arrayList2));
                    }
                }
                break;
        }
    }
}
