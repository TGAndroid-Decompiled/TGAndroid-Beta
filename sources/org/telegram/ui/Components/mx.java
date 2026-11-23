package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mx {
    public final TLRPC.StickerSetCovered f37654a;
    public final TLRPC.TL_messages_stickerSet f37655b;
    public final TLRPC.StickerSet f37656c;
    public final ArrayList d;
    public final TLRPC.Document f37657e;

    public mx(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f37654a = null;
        this.f37655b = tL_messages_stickerSet;
        this.f37656c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f37657e = document;
    }

    public mx(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f37654a = stickerSetCovered;
        this.f37655b = null;
        this.f37656c = stickerSetCovered.set;
        this.d = arrayList;
        this.f37657e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
