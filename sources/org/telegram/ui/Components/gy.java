package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gy {
    public final TLRPC.StickerSetCovered f26945a;
    public final TLRPC.TL_messages_stickerSet f26946b;
    public final TLRPC.StickerSet f26947c;
    public final ArrayList d;
    public final TLRPC.Document f26948e;

    public gy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f26945a = null;
        this.f26946b = tL_messages_stickerSet;
        this.f26947c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f26948e = document;
    }

    public gy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f26945a = stickerSetCovered;
        this.f26946b = null;
        this.f26947c = stickerSetCovered.set;
        this.d = arrayList;
        this.f26948e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
