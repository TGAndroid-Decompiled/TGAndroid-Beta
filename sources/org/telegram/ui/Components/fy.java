package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fy {
    public final TLRPC.StickerSetCovered f24329a;
    public final TLRPC.TL_messages_stickerSet f24330b;
    public final TLRPC.StickerSet f24331c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public fy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f24329a = null;
        this.f24330b = tL_messages_stickerSet;
        this.f24331c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public fy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f24329a = stickerSetCovered;
        this.f24330b = null;
        this.f24331c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
