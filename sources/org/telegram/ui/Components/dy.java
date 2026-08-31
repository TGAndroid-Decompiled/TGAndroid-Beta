package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dy {
    public final TLRPC.StickerSetCovered f26339a;
    public final TLRPC.TL_messages_stickerSet f26340b;
    public final TLRPC.StickerSet f26341c;
    public final ArrayList d;
    public final TLRPC.Document f26342e;

    public dy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f26339a = null;
        this.f26340b = tL_messages_stickerSet;
        this.f26341c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f26342e = document;
    }

    public dy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f26339a = stickerSetCovered;
        this.f26340b = null;
        this.f26341c = stickerSetCovered.set;
        this.d = arrayList;
        this.f26342e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
