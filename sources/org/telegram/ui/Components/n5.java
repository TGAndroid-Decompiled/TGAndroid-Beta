package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class n5 implements Runnable {
    public final int f28731a;
    public final o5 f28732b;
    public final ArrayList f28733c;
    public final TLObject d;

    public n5(o5 o5Var, ArrayList arrayList, TLObject tLObject, int i10) {
        this.f28731a = i10;
        this.f28732b = o5Var;
        this.f28733c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f28731a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n5(this.f28732b, this.f28733c, this.d, 1));
                return;
            default:
                o5 o5Var = this.f28732b;
                int i10 = o5Var.f29074e;
                HashSet hashSet = new HashSet(this.f28733c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new l5(o5Var, arrayList, 1));
                    o5Var.d(arrayList);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i11)).f19808id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.so(3, o5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
