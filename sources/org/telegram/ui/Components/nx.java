package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nx {
    public final TLRPC.StickerSetCovered f28901a;
    public final TLRPC.TL_messages_stickerSet f28902b;
    public final TLRPC.StickerSet f28903c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public nx(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f28901a = null;
        this.f28902b = tL_messages_stickerSet;
        this.f28903c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public nx(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f28901a = stickerSetCovered;
        this.f28902b = null;
        this.f28903c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
