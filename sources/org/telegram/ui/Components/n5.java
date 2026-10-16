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
    public final int f27278a;
    public final o5 f27279b;
    public final ArrayList f27280c;
    public final TLObject d;

    public n5(o5 o5Var, ArrayList arrayList, TLObject tLObject, int i10) {
        this.f27278a = i10;
        this.f27279b = o5Var;
        this.f27280c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f27278a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n5(this.f27279b, this.f27280c, this.d, 1));
                return;
            default:
                o5 o5Var = this.f27279b;
                int i10 = o5Var.e;
                HashSet hashSet = new HashSet(this.f27280c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new l5(o5Var, arrayList, 1));
                    o5Var.d(arrayList);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i11)).f18922id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.to(3, o5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
