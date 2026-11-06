package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yw {
    public final TLRPC.StickerSetCovered f40780a;
    public final TLRPC.TL_messages_stickerSet f40781b;
    public final TLRPC.StickerSet f40782c;
    public final ArrayList d;
    public final TLRPC.Document f40783e;

    public yw(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f40780a = null;
        this.f40781b = tL_messages_stickerSet;
        this.f40782c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f40783e = document;
    }

    public yw(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f40780a = stickerSetCovered;
        this.f40781b = null;
        this.f40782c = stickerSetCovered.set;
        this.d = arrayList;
        this.f40783e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
