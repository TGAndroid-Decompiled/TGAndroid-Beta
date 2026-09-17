package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dy {
    public final TLRPC.StickerSetCovered f25504a;
    public final TLRPC.TL_messages_stickerSet f25505b;
    public final TLRPC.StickerSet f25506c;
    public final ArrayList d;
    public final TLRPC.Document f25507e;

    public dy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f25504a = null;
        this.f25505b = tL_messages_stickerSet;
        this.f25506c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f25507e = document;
    }

    public dy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f25504a = stickerSetCovered;
        this.f25505b = null;
        this.f25506c = stickerSetCovered.set;
        this.d = arrayList;
        this.f25507e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
