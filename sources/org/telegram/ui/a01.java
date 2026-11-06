package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;
public final class a01 implements org.telegram.messenger.c20 {
    public final int f43489a;
    public final LinkedHashSet f43490b;
    public final Runnable f43491c;

    public a01(LinkedHashSet linkedHashSet, Runnable runnable, int i7) {
        this.f43489a = i7;
        this.f43490b = linkedHashSet;
        this.f43491c = runnable;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f43489a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.f43490b.addAll(arrayList);
                }
                this.f43491c.run();
                return;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.f43490b.addAll(tL_emojiList.document_id);
                }
                this.f43491c.run();
                return;
        }
    }
}
