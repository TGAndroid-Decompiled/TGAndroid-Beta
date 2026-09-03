package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dy {
    public final TLRPC.StickerSetCovered f26371a;
    public final TLRPC.TL_messages_stickerSet f26372b;
    public final TLRPC.StickerSet f26373c;
    public final ArrayList d;
    public final TLRPC.Document f26374e;

    public dy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f26371a = null;
        this.f26372b = tL_messages_stickerSet;
        this.f26373c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f26374e = document;
    }

    public dy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f26371a = stickerSetCovered;
        this.f26372b = null;
        this.f26373c = stickerSetCovered.set;
        this.d = arrayList;
        this.f26374e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
