package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gy {
    public final TLRPC.StickerSetCovered f26950a;
    public final TLRPC.TL_messages_stickerSet f26951b;
    public final TLRPC.StickerSet f26952c;
    public final ArrayList d;
    public final TLRPC.Document f26953e;

    public gy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f26950a = null;
        this.f26951b = tL_messages_stickerSet;
        this.f26952c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f26953e = document;
    }

    public gy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f26950a = stickerSetCovered;
        this.f26951b = null;
        this.f26952c = stickerSetCovered.set;
        this.d = arrayList;
        this.f26953e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
