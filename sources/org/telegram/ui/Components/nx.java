package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nx {
    public final TLRPC.StickerSetCovered f28970a;
    public final TLRPC.TL_messages_stickerSet f28971b;
    public final TLRPC.StickerSet f28972c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public nx(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f28970a = null;
        this.f28971b = tL_messages_stickerSet;
        this.f28972c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public nx(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f28970a = stickerSetCovered;
        this.f28971b = null;
        this.f28972c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
