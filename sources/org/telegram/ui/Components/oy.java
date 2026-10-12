package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oy {
    public final TLRPC.StickerSetCovered f28111a;
    public final TLRPC.TL_messages_stickerSet f28112b;
    public final TLRPC.StickerSet f28113c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public oy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f28111a = null;
        this.f28112b = tL_messages_stickerSet;
        this.f28113c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public oy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f28111a = stickerSetCovered;
        this.f28112b = null;
        this.f28113c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
