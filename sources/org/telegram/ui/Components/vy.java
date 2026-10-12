package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vy {
    public final TLRPC.StickerSetCovered f32208a;
    public final TLRPC.TL_messages_stickerSet f32209b;
    public final TLRPC.StickerSet f32210c;
    public final ArrayList d;
    public final TLRPC.Document f32211e;

    public vy(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f32208a = null;
        this.f32209b = tL_messages_stickerSet;
        this.f32210c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f32211e = document;
    }

    public vy(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f32208a = stickerSetCovered;
        this.f32209b = null;
        this.f32210c = stickerSetCovered.set;
        this.d = arrayList;
        this.f32211e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
