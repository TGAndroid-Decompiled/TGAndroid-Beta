package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cy {
    public final TLRPC.StickerSetCovered f23153a;
    public final TLRPC.TL_messages_stickerSet f23154b;
    public final TLRPC.StickerSet f23155c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public cy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f23153a = null;
        this.f23154b = tL_messages_stickerSet;
        this.f23155c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public cy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f23153a = stickerSetCovered;
        this.f23154b = null;
        this.f23155c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
