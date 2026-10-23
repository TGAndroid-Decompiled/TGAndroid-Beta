package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ky {
    public final TLRPC.StickerSetCovered f27983a;
    public final TLRPC.TL_messages_stickerSet f27984b;
    public final TLRPC.StickerSet f27985c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public ky(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f27983a = null;
        this.f27984b = tL_messages_stickerSet;
        this.f27985c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public ky(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f27983a = stickerSetCovered;
        this.f27984b = null;
        this.f27985c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
