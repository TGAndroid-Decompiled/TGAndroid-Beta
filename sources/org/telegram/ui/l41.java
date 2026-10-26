package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class l41 implements Utilities.Callback {
    public final int f41136a;
    public final LinkedHashSet f41137b;
    public final Runnable f41138c;

    public l41(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f41136a = i10;
        this.f41137b = linkedHashSet;
        this.f41138c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41136a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f41137b.addAll(arrayList);
                }
                this.f41138c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f41137b.addAll(tL_emojiList.document_id);
                }
                this.f41138c.run();
                return;
        }
    }
}
