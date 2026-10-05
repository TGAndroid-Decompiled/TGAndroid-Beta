package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gy {
    public final TLRPC.StickerSetCovered f27006a;
    public final TLRPC.TL_messages_stickerSet f27007b;
    public final TLRPC.StickerSet f27008c;
    public final ArrayList d;
    public final TLRPC.Document f27009e;

    public gy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f27006a = null;
        this.f27007b = tL_messages_stickerSet;
        this.f27008c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f27009e = document;
    }

    public gy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f27006a = stickerSetCovered;
        this.f27007b = null;
        this.f27008c = stickerSetCovered.set;
        this.d = arrayList;
        this.f27009e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
