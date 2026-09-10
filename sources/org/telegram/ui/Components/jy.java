package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jy {
    public final TLRPC.StickerSetCovered f24519a;
    public final TLRPC.TL_messages_stickerSet f24520b;
    public final TLRPC.StickerSet f24521c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public jy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f24519a = null;
        this.f24520b = tL_messages_stickerSet;
        this.f24521c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public jy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f24519a = stickerSetCovered;
        this.f24520b = null;
        this.f24521c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
