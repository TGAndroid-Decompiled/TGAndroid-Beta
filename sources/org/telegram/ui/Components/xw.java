package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xw {
    public final TLRPC.StickerSetCovered f40534a;
    public final TLRPC.TL_messages_stickerSet f40535b;
    public final TLRPC.StickerSet f40536c;
    public final ArrayList d;
    public final TLRPC.Document f40537e;

    public xw(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f40534a = null;
        this.f40535b = tL_messages_stickerSet;
        this.f40536c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f40537e = document;
    }

    public xw(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f40534a = stickerSetCovered;
        this.f40535b = null;
        this.f40536c = stickerSetCovered.set;
        this.d = arrayList;
        this.f40537e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
