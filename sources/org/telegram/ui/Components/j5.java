package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class j5 implements Runnable {
    public final int f24237a;
    public final l5 f24238b;
    public final ArrayList f24239c;
    public final HashSet d;

    public j5(l5 l5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f24237a = i10;
        this.f24238b = l5Var;
        this.f24239c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f24237a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j5(this.f24238b, this.f24239c, this.d, 1));
                return;
            default:
                l5 l5Var = this.f24238b;
                l5Var.d(this.f24239c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(l5Var.e).sendRequest(tL_messages_getCustomEmojiDocuments, new bi.o2(28, l5Var, arrayList));
                    return;
                }
                return;
        }
    }
}
