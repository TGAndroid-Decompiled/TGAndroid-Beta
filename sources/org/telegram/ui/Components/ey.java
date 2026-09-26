package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ey {
    public final TLRPC.StickerSetCovered f24008a;
    public final TLRPC.TL_messages_stickerSet f24009b;
    public final TLRPC.StickerSet f24010c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public ey(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f24008a = null;
        this.f24009b = tL_messages_stickerSet;
        this.f24010c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public ey(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f24008a = stickerSetCovered;
        this.f24009b = null;
        this.f24010c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
