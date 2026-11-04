package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yg implements u10 {
    public final int f26580a;
    public final li f26581b;
    public final TLRPC.StickerSet f26582c;

    public yg(li liVar, TLRPC.StickerSet stickerSet, int i3) {
        this.f26580a = i3;
        this.f26581b = liVar;
        this.f26582c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f26580a;
        ArrayList arrayList = (ArrayList) obj;
        li liVar = this.f26581b;
        liVar.getClass();
        switch (i3) {
            case 0:
                liVar.f1(this.f26582c.f27028id, false);
                return;
            default:
                liVar.g1(this.f26582c.f27028id, false);
                return;
        }
    }
}
