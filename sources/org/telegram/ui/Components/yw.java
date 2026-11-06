package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yw {
    public final TLRPC.StickerSetCovered f40768a;
    public final TLRPC.TL_messages_stickerSet f40769b;
    public final TLRPC.StickerSet f40770c;
    public final ArrayList d;
    public final TLRPC.Document f40771e;

    public yw(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f40768a = null;
        this.f40769b = tL_messages_stickerSet;
        this.f40770c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f40771e = document;
    }

    public yw(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f40768a = stickerSetCovered;
        this.f40769b = null;
        this.f40770c = stickerSetCovered.set;
        this.d = arrayList;
        this.f40771e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
