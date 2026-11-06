package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class a01 implements org.telegram.messenger.c20 {
    public final int f43514a;
    public final LinkedHashSet f43515b;
    public final Runnable f43516c;

    public a01(LinkedHashSet linkedHashSet, Runnable runnable, int i7) {
        this.f43514a = i7;
        this.f43515b = linkedHashSet;
        this.f43516c = runnable;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f43514a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f43515b.addAll(arrayList);
                }
                this.f43516c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f43515b.addAll(tL_emojiList.document_id);
                }
                this.f43516c.run();
                return;
        }
    }
}
