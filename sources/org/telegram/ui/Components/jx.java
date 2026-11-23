package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jx {
    public final TLRPC.StickerSetCovered f36556a;
    public final TLRPC.TL_messages_stickerSet f36557b;
    public final TLRPC.StickerSet f36558c;
    public final ArrayList d;
    public final TLRPC.Document f36559e;

    public jx(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f36556a = null;
        this.f36557b = tL_messages_stickerSet;
        this.f36558c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f36559e = document;
    }

    public jx(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f36556a = stickerSetCovered;
        this.f36557b = null;
        this.f36558c = stickerSetCovered.set;
        this.d = arrayList;
        this.f36559e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
