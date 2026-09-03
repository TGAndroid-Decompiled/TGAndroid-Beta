package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class f5 implements Runnable {
    public final int f24799a;
    public final h5 f24800b;
    public final ArrayList f24801c;
    public final HashSet d;

    public f5(h5 h5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f24799a = i10;
        this.f24800b = h5Var;
        this.f24801c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f24799a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f5(this.f24800b, this.f24801c, this.d, 1));
                return;
            default:
                h5 h5Var = this.f24800b;
                h5Var.d(this.f24801c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(h5Var.e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.no(3, h5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
