package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z6 implements Runnable {
    public final int f20009a;
    public final MediaDataController f20010b;
    public final TLRPC.TL_messages_stickerSet f20011c;

    public z6(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f20009a = i10;
        this.f20010b = mediaDataController;
        this.f20011c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f20009a) {
            case 0:
                this.f20010b.lambda$saveStickerSetIntoCache$40(this.f20011c);
                return;
            case 1:
                this.f20010b.lambda$loadGroupStickerSet$45(this.f20011c);
                return;
            case 2:
                this.f20010b.lambda$loadGroupStickerSet$43(this.f20011c);
                return;
            case 3:
                this.f20010b.lambda$putSetToCache$47(this.f20011c);
                return;
            default:
                this.f20010b.lambda$replaceStickerSet$28(this.f20011c);
                return;
        }
    }
}
