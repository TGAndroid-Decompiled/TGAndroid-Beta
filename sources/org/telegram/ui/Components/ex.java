package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ex {
    public final TLRPC.StickerSetCovered f34443a;
    public final TLRPC.TL_messages_stickerSet f34444b;
    public final TLRPC.StickerSet f34445c;
    public final ArrayList d;
    public final TLRPC.Document f34446e;

    public ex(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f34443a = null;
        this.f34444b = tL_messages_stickerSet;
        this.f34445c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f34446e = document;
    }

    public ex(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f34443a = stickerSetCovered;
        this.f34444b = null;
        this.f34445c = stickerSetCovered.set;
        this.d = arrayList;
        this.f34446e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
