package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class o5 implements Runnable {
    public final int f31154a;
    public final p5 f31155b;
    public final ArrayList f31156c;
    public final TLObject d;

    public o5(p5 p5Var, ArrayList arrayList, TLObject tLObject, int i10) {
        this.f31154a = i10;
        this.f31155b = p5Var;
        this.f31156c = arrayList;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f31154a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o5(this.f31155b, this.f31156c, this.d, 1));
                return;
            default:
                p5 p5Var = this.f31155b;
                int i10 = p5Var.e;
                HashSet hashSet = new HashSet(this.f31156c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new m5(p5Var, arrayList, 1));
                    p5Var.d(arrayList);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i11)).f22033id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.z7(11, p5Var, arrayList2));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
