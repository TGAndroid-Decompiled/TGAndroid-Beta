package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mx {
    public final TLRPC.StickerSetCovered f37655a;
    public final TLRPC.TL_messages_stickerSet f37656b;
    public final TLRPC.StickerSet f37657c;
    public final ArrayList d;
    public final TLRPC.Document f37658e;

    public mx(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f37655a = null;
        this.f37656b = tL_messages_stickerSet;
        this.f37657c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f37658e = document;
    }

    public mx(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f37655a = stickerSetCovered;
        this.f37656b = null;
        this.f37657c = stickerSetCovered.set;
        this.d = arrayList;
        this.f37658e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
