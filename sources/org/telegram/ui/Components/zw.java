package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zw {
    public final TLRPC.StickerSetCovered f41156a;
    public final TLRPC.TL_messages_stickerSet f41157b;
    public final TLRPC.StickerSet f41158c;
    public final ArrayList d;
    public final TLRPC.Document f41159e;

    public zw(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f41156a = null;
        this.f41157b = tL_messages_stickerSet;
        this.f41158c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f41159e = document;
    }

    public zw(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f41156a = stickerSetCovered;
        this.f41157b = null;
        this.f41158c = stickerSetCovered.set;
        this.d = arrayList;
        this.f41159e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
