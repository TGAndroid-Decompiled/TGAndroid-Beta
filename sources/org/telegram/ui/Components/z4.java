package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class z4 implements Runnable {
    public final int f32893a;
    public final b5 f32894b;
    public final ArrayList f32895c;
    public final HashSet d;

    public z4(b5 b5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f32893a = i10;
        this.f32894b = b5Var;
        this.f32895c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f32893a) {
            case 0:
                org.telegram.messenger.i0.g3(new z4(this.f32894b, this.f32895c, this.d, 1));
                return;
            default:
                b5 b5Var = this.f32894b;
                b5Var.d(this.f32895c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(b5Var.e).sendRequest(tL_messages_getCustomEmojiDocuments, new ag.k0(23, b5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
