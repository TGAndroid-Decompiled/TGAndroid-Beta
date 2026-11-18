package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kx {
    public final TLRPC.StickerSetCovered f36908a;
    public final TLRPC.TL_messages_stickerSet f36909b;
    public final TLRPC.StickerSet f36910c;
    public final ArrayList d;
    public final TLRPC.Document f36911e;

    public kx(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f36908a = null;
        this.f36909b = tL_messages_stickerSet;
        this.f36910c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f36911e = document;
    }

    public kx(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f36908a = stickerSetCovered;
        this.f36909b = null;
        this.f36910c = stickerSetCovered.set;
        this.d = arrayList;
        this.f36911e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
