package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gy {
    public final TLRPC.StickerSetCovered f24684a;
    public final TLRPC.TL_messages_stickerSet f24685b;
    public final TLRPC.StickerSet f24686c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public gy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f24684a = null;
        this.f24685b = tL_messages_stickerSet;
        this.f24686c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public gy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f24684a = stickerSetCovered;
        this.f24685b = null;
        this.f24686c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
