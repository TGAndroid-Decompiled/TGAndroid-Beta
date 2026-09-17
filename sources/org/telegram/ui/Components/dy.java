package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dy {
    public final TLRPC.StickerSetCovered f25477a;
    public final TLRPC.TL_messages_stickerSet f25478b;
    public final TLRPC.StickerSet f25479c;
    public final ArrayList d;
    public final TLRPC.Document f25480e;

    public dy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f25477a = null;
        this.f25478b = tL_messages_stickerSet;
        this.f25479c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f25480e = document;
    }

    public dy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f25477a = stickerSetCovered;
        this.f25478b = null;
        this.f25479c = stickerSetCovered.set;
        this.d = arrayList;
        this.f25480e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
