package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yw {
    public final TLRPC.StickerSetCovered f40749a;
    public final TLRPC.TL_messages_stickerSet f40750b;
    public final TLRPC.StickerSet f40751c;
    public final ArrayList d;
    public final TLRPC.Document f40752e;

    public yw(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f40749a = null;
        this.f40750b = tL_messages_stickerSet;
        this.f40751c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f40752e = document;
    }

    public yw(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f40749a = stickerSetCovered;
        this.f40750b = null;
        this.f40751c = stickerSetCovered.set;
        this.d = arrayList;
        this.f40752e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
