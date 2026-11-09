package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zw {
    public final TLRPC.StickerSetCovered f41172a;
    public final TLRPC.TL_messages_stickerSet f41173b;
    public final TLRPC.StickerSet f41174c;
    public final ArrayList d;
    public final TLRPC.Document f41175e;

    public zw(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f41172a = null;
        this.f41173b = tL_messages_stickerSet;
        this.f41174c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f41175e = document;
    }

    public zw(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f41172a = stickerSetCovered;
        this.f41173b = null;
        this.f41174c = stickerSetCovered.set;
        this.d = arrayList;
        this.f41175e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
