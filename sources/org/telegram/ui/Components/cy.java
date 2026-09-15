package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cy {
    public final TLRPC.StickerSetCovered f23160a;
    public final TLRPC.TL_messages_stickerSet f23161b;
    public final TLRPC.StickerSet f23162c;
    public final ArrayList d;
    public final TLRPC.Document e;

    public cy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f23160a = null;
        this.f23161b = tL_messages_stickerSet;
        this.f23162c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.e = document;
    }

    public cy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f23160a = stickerSetCovered;
        this.f23161b = null;
        this.f23162c = stickerSetCovered.set;
        this.d = arrayList;
        this.e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
