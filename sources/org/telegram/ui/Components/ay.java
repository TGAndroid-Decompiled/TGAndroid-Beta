package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ay {
    public final TLRPC.StickerSetCovered f23523a;
    public final TLRPC.TL_messages_stickerSet f23524b;
    public final TLRPC.StickerSet f23525c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public ay(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f23523a = null;
        this.f23524b = tL_messages_stickerSet;
        this.f23525c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public ay(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f23523a = stickerSetCovered;
        this.f23524b = null;
        this.f23525c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
