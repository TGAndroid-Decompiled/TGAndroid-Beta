package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dy {
    public final TLRPC.StickerSetCovered f25476a;
    public final TLRPC.TL_messages_stickerSet f25477b;
    public final TLRPC.StickerSet f25478c;
    public final ArrayList d;
    public final TLRPC.Document f25479e;

    public dy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f25476a = null;
        this.f25477b = tL_messages_stickerSet;
        this.f25478c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f25479e = document;
    }

    public dy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f25476a = stickerSetCovered;
        this.f25477b = null;
        this.f25478c = stickerSetCovered.set;
        this.d = arrayList;
        this.f25479e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
