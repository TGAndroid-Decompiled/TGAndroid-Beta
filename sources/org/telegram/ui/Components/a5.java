package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class a5 implements Runnable {
    public final int f31724a;
    public final c5 f31725b;
    public final ArrayList f31726c;
    public final HashSet d;

    public a5(c5 c5Var, ArrayList arrayList, HashSet hashSet, int i3) {
        this.f31724a = i3;
        this.f31725b = c5Var;
        this.f31726c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f31724a) {
            case 0:
                org.telegram.messenger.g0.h3(new a5(this.f31725b, this.f31726c, this.d, 1));
                return;
            default:
                c5 c5Var = this.f31725b;
                c5Var.d(this.f31726c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(c5Var.f32564e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.ActionBar.h6(12, c5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
