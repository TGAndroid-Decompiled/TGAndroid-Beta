package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ty {
    public final TLRPC.StickerSetCovered f31274a;
    public final TLRPC.TL_messages_stickerSet f31275b;
    public final TLRPC.StickerSet f31276c;
    public final ArrayList d;
    public final TLRPC.Document f31277e;

    public ty(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f31274a = null;
        this.f31275b = tL_messages_stickerSet;
        this.f31276c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f31277e = document;
    }

    public ty(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f31274a = stickerSetCovered;
        this.f31275b = null;
        this.f31276c = stickerSetCovered.set;
        this.d = arrayList;
        this.f31277e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
