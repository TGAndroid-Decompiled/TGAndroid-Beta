package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m51 implements Utilities.Callback {
    public final int f38417a;
    public final LinkedHashSet f38418b;
    public final Runnable f38419c;

    public m51(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.f38417a = i10;
        this.f38418b = linkedHashSet;
        this.f38419c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38417a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f38418b.addAll(arrayList);
                }
                this.f38419c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f38418b.addAll(tL_emojiList.document_id);
                }
                this.f38419c.run();
                return;
        }
    }
}
