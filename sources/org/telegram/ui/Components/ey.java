package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ey {
    public final TLRPC.StickerSetCovered f24002a;
    public final TLRPC.TL_messages_stickerSet f24003b;
    public final TLRPC.StickerSet f24004c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public ey(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f24002a = null;
        this.f24003b = tL_messages_stickerSet;
        this.f24004c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public ey(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f24002a = stickerSetCovered;
        this.f24003b = null;
        this.f24004c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
