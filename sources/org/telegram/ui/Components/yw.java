package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yw {
    public final TLRPC.StickerSetCovered f40764a;
    public final TLRPC.TL_messages_stickerSet f40765b;
    public final TLRPC.StickerSet f40766c;
    public final ArrayList d;
    public final TLRPC.Document f40767e;

    public yw(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, ArrayList arrayList) {
        TLRPC.Document document = null;
        this.f40764a = null;
        this.f40765b = tL_messages_stickerSet;
        this.f40766c = tL_messages_stickerSet.set;
        this.d = arrayList;
        if (arrayList != null && !arrayList.isEmpty()) {
            document = (TLRPC.Document) arrayList.get(0);
        }
        this.f40767e = document;
    }

    public yw(TLRPC.StickerSetCovered stickerSetCovered, ArrayList arrayList) {
        this.f40764a = stickerSetCovered;
        this.f40765b = null;
        this.f40766c = stickerSetCovered.set;
        this.d = arrayList;
        this.f40767e = arrayList.isEmpty() ? null : (TLRPC.Document) arrayList.get(0);
    }
}
