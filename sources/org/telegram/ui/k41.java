package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class k41 implements Utilities.Callback {

    public final int f39599a;

    public final LinkedHashSet f39600b;

    public final Runnable f39601c;

    public k41(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f39599a = i10;
        this.f39600b = linkedHashSet;
        this.f39601c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39599a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f39600b.addAll(arrayList);
                }
                this.f39601c.run();
                break;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f39600b.addAll(tL_emojiList.document_id);
                }
                this.f39601c.run();
                break;
        }
    }
}
