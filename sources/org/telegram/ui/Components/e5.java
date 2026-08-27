package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

public final class e5 implements Runnable {

    public final int f27948a;

    public final g5 f27949b;

    public final ArrayList f27950c;
    public final HashSet d;

    public e5(g5 g5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.f27948a = i10;
        this.f27949b = g5Var;
        this.f27950c = arrayList;
        this.d = hashSet;
    }

    @Override
    public final void run() {
        switch (this.f27948a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e5(this.f27949b, this.f27950c, this.d, 1));
                break;
            default:
                g5 g5Var = this.f27949b;
                g5Var.d(this.f27950c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(g5Var.f28534e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.gg(7, g5Var, arrayList));
                }
                break;
        }
    }
}
