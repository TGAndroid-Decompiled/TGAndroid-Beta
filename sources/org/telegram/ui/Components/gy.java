package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gy {
    public final TLRPC.StickerSetCovered f26944a;
    public final TLRPC.TL_messages_stickerSet f26945b;
    public final TLRPC.StickerSet f26946c;
    public final ArrayList d;
    public final TLRPC.Document f26947e;

    public gy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f26944a = null;
        this.f26945b = tL_messages_stickerSet;
        this.f26946c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f26947e = document;
    }

    public gy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f26944a = stickerSetCovered;
        this.f26945b = null;
        this.f26946c = stickerSetCovered.set;
        this.d = arrayList;
        this.f26947e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
