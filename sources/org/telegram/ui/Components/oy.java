package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oy {
    public final TLRPC.StickerSetCovered f27795a;
    public final TLRPC.TL_messages_stickerSet f27796b;
    public final TLRPC.StickerSet f27797c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public oy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f27795a = null;
        this.f27796b = tL_messages_stickerSet;
        this.f27797c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public oy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f27795a = stickerSetCovered;
        this.f27796b = null;
        this.f27797c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
