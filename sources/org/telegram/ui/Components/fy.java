package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fy {
    public final TLRPC.StickerSetCovered f24359a;
    public final TLRPC.TL_messages_stickerSet f24360b;
    public final TLRPC.StickerSet f24361c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public fy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f24359a = null;
        this.f24360b = tL_messages_stickerSet;
        this.f24361c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public fy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f24359a = stickerSetCovered;
        this.f24360b = null;
        this.f24361c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
