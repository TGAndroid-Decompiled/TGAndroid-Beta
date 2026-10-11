package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ty {
    public final TLRPC.StickerSetCovered f31393a;
    public final TLRPC.TL_messages_stickerSet f31394b;
    public final TLRPC.StickerSet f31395c;
    public final ArrayList d;
    public final TLRPC.Document f31396e;

    public ty(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f31393a = null;
        this.f31394b = tL_messages_stickerSet;
        this.f31395c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f31396e = document;
    }

    public ty(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f31393a = stickerSetCovered;
        this.f31394b = null;
        this.f31395c = stickerSetCovered.set;
        this.d = arrayList;
        this.f31396e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
