package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ex {
    public final TLRPC.StickerSetCovered f34444a;
    public final TLRPC.TL_messages_stickerSet f34445b;
    public final TLRPC.StickerSet f34446c;
    public final ArrayList d;
    public final TLRPC.Document f34447e;

    public ex(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f34444a = null;
        this.f34445b = tL_messages_stickerSet;
        this.f34446c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f34447e = document;
    }

    public ex(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f34444a = stickerSetCovered;
        this.f34445b = null;
        this.f34446c = stickerSetCovered.set;
        this.d = arrayList;
        this.f34447e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
