package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fy {
    public final TLRPC.StickerSetCovered f24349a;
    public final TLRPC.TL_messages_stickerSet f24350b;
    public final TLRPC.StickerSet f24351c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public fy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f24349a = null;
        this.f24350b = tL_messages_stickerSet;
        this.f24351c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public fy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f24349a = stickerSetCovered;
        this.f24350b = null;
        this.f24351c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
