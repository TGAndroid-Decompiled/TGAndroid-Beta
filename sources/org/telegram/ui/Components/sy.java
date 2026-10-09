package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class sy {
    public final TLRPC.StickerSetCovered f30948a;
    public final TLRPC.TL_messages_stickerSet f30949b;
    public final TLRPC.StickerSet f30950c;
    public final ArrayList d;
    public final TLRPC.Document f30951e;

    public sy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f30948a = null;
        this.f30949b = tL_messages_stickerSet;
        this.f30950c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f30951e = document;
    }

    public sy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f30948a = stickerSetCovered;
        this.f30949b = null;
        this.f30950c = stickerSetCovered.set;
        this.d = arrayList;
        this.f30951e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
