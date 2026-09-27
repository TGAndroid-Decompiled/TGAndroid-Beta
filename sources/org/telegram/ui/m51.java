package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m51 implements Utilities.Callback {
    public final int f35511a;
    public final LinkedHashSet f35512b;
    public final Runnable f35513c;

    public m51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f35511a = i10;
        this.f35512b = linkedHashSet;
        this.f35513c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35511a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f35512b.addAll(arrayList);
                }
                this.f35513c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f35512b.addAll(tL_emojiList.document_id);
                }
                this.f35513c.run();
                return;
        }
    }
}
