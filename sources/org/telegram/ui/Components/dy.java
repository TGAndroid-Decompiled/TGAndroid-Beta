package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dy {
    public final TLRPC.StickerSetCovered f25503a;
    public final TLRPC.TL_messages_stickerSet f25504b;
    public final TLRPC.StickerSet f25505c;
    public final ArrayList d;
    public final TLRPC.Document f25506e;

    public dy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f25503a = null;
        this.f25504b = tL_messages_stickerSet;
        this.f25505c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f25506e = document;
    }

    public dy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f25503a = stickerSetCovered;
        this.f25504b = null;
        this.f25505c = stickerSetCovered.set;
        this.d = arrayList;
        this.f25506e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
