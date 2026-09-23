package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dy {
    public final TLRPC.StickerSetCovered f23484a;
    public final TLRPC.TL_messages_stickerSet f23485b;
    public final TLRPC.StickerSet f23486c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public dy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f23484a = null;
        this.f23485b = tL_messages_stickerSet;
        this.f23486c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public dy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f23484a = stickerSetCovered;
        this.f23485b = null;
        this.f23486c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
