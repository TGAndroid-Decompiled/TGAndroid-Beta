package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ky {
    public final TLRPC.StickerSetCovered f28021a;
    public final TLRPC.TL_messages_stickerSet f28022b;
    public final TLRPC.StickerSet f28023c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public ky(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f28021a = null;
        this.f28022b = tL_messages_stickerSet;
        this.f28023c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public ky(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f28021a = stickerSetCovered;
        this.f28022b = null;
        this.f28023c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
