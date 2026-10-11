package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ty {
    public final TLRPC.StickerSetCovered f31181a;
    public final TLRPC.TL_messages_stickerSet f31182b;
    public final TLRPC.StickerSet f31183c;
    public final ArrayList d;
    public final TLRPC.Document f31184e;

    public ty(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f31181a = null;
        this.f31182b = tL_messages_stickerSet;
        this.f31183c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f31184e = document;
    }

    public ty(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f31181a = stickerSetCovered;
        this.f31182b = null;
        this.f31183c = stickerSetCovered.set;
        this.d = arrayList;
        this.f31184e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
