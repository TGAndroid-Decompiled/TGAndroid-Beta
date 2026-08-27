package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class px {

    public final TLRPC.StickerSetCovered f31674a;

    public final TLRPC.TL_messages_stickerSet f31675b;

    public final TLRPC.StickerSet f31676c;
    public final ArrayList d;

    public final TLRPC.Document f31677e;

    public px(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f31674a = null;
        this.f31675b = tL_messages_stickerSet;
        this.f31676c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f31677e = document;
    }

    public px(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f31674a = stickerSetCovered;
        this.f31675b = null;
        this.f31676c = stickerSetCovered.set;
        this.d = arrayList;
        this.f31677e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
