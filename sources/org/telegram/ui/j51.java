package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j51 implements Utilities.Callback {
    public final int f34646a;
    public final LinkedHashSet f34647b;
    public final Runnable f34648c;

    public j51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f34646a = i10;
        this.f34647b = linkedHashSet;
        this.f34648c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f34646a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f34647b.addAll(arrayList);
                }
                this.f34648c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f34647b.addAll(tL_emojiList.document_id);
                }
                this.f34648c.run();
                return;
        }
    }
}
