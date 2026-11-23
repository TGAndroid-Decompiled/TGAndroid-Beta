package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class mx {
    public final TLRPC.StickerSetCovered f37610a;
    public final TLRPC.TL_messages_stickerSet f37611b;
    public final TLRPC.StickerSet f37612c;
    public final ArrayList d;
    public final TLRPC.Document f37613e;

    public mx(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f37610a = null;
        this.f37611b = tL_messages_stickerSet;
        this.f37612c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f37613e = document;
    }

    public mx(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f37610a = stickerSetCovered;
        this.f37611b = null;
        this.f37612c = stickerSetCovered.set;
        this.d = arrayList;
        this.f37613e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
