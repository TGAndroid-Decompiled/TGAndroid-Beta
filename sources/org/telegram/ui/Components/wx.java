package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class wx {
    public final TLRPC.StickerSetCovered f34503a;
    public final TLRPC.TL_messages_stickerSet f34504b;
    public final TLRPC.StickerSet f34505c;
    public final ArrayList d;
    public final TLRPC.Document f34506e;

    public wx(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f34503a = null;
        this.f34504b = tL_messages_stickerSet;
        this.f34505c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f34506e = document;
    }

    public wx(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f34503a = stickerSetCovered;
        this.f34504b = null;
        this.f34505c = stickerSetCovered.set;
        this.d = arrayList;
        this.f34506e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
