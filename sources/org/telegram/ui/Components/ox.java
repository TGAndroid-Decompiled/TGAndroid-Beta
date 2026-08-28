package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ox {
    public final TLRPC.StickerSetCovered f31457a;
    public final TLRPC.TL_messages_stickerSet f31458b;
    public final TLRPC.StickerSet f31459c;
    public final ArrayList d;
    public final TLRPC.Document f31460e;

    public ox(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f31457a = null;
        this.f31458b = tL_messages_stickerSet;
        this.f31459c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f31460e = document;
    }

    public ox(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f31457a = stickerSetCovered;
        this.f31458b = null;
        this.f31459c = stickerSetCovered.set;
        this.d = arrayList;
        this.f31460e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
