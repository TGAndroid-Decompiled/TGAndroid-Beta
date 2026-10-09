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
    public final int f29034a;
    public final o5 f29035b;
    public final ArrayList f29036c;
    public final TLObject d;

    public n5(o5 o5Var, ArrayList arrayList, TLObject tLObject, int i10) {
        this.f29034a = i10;
        this.f29035b = o5Var;
        this.f29036c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f29034a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n5(this.f29035b, this.f29036c, this.d, 1));
                return;
            default:
                o5 o5Var = this.f29035b;
                int i10 = o5Var.f29389e;
                HashSet hashSet = new HashSet(this.f29036c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new l5(o5Var, arrayList, 1));
                    o5Var.d(arrayList);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i11)).f20044id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.oo(3, o5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
