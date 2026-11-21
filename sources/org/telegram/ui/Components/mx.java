package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mx {
    public final TLRPC.StickerSetCovered f37657a;
    public final TLRPC.TL_messages_stickerSet f37658b;
    public final TLRPC.StickerSet f37659c;
    public final ArrayList d;
    public final TLRPC.Document f37660e;

    public mx(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f37657a = null;
        this.f37658b = tL_messages_stickerSet;
        this.f37659c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f37660e = document;
    }

    public mx(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f37657a = stickerSetCovered;
        this.f37658b = null;
        this.f37659c = stickerSetCovered.set;
        this.d = arrayList;
        this.f37660e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
