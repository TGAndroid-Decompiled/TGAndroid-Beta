package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jy {
    public final TLRPC.StickerSetCovered f29733a;
    public final TLRPC.TL_messages_stickerSet f29734b;
    public final TLRPC.StickerSet f29735c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public jy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f29733a = null;
        this.f29734b = tL_messages_stickerSet;
        this.f29735c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public jy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f29733a = stickerSetCovered;
        this.f29734b = null;
        this.f29735c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
