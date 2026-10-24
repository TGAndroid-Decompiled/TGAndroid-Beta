package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class iy {
    public final TLRPC.StickerSetCovered f27512a;
    public final TLRPC.TL_messages_stickerSet f27513b;
    public final TLRPC.StickerSet f27514c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public iy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f27512a = null;
        this.f27513b = tL_messages_stickerSet;
        this.f27514c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public iy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f27512a = stickerSetCovered;
        this.f27513b = null;
        this.f27514c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
