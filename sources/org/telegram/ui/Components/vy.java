package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vy {
    public final TLRPC.StickerSetCovered f32194a;
    public final TLRPC.TL_messages_stickerSet f32195b;
    public final TLRPC.StickerSet f32196c;
    public final ArrayList d;
    public final TLRPC.Document f32197e;

    public vy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f32194a = null;
        this.f32195b = tL_messages_stickerSet;
        this.f32196c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f32197e = document;
    }

    public vy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f32194a = stickerSetCovered;
        this.f32195b = null;
        this.f32196c = stickerSetCovered.set;
        this.d = arrayList;
        this.f32197e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
