package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class z6 implements Runnable {
    public final int f19972a;
    public final MediaDataController f19973b;
    public final TLRPC.TL_messages_stickerSet f19974c;

    public z6(MediaDataController mediaDataController, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10) {
        this.f19972a = i10;
        this.f19973b = mediaDataController;
        this.f19974c = tL_messages_stickerSet;
    }

    @Override
    public final void run() {
        switch (this.f19972a) {
            case 0:
                this.f19973b.lambda$saveStickerSetIntoCache$40(this.f19974c);
                return;
            case 1:
                this.f19973b.lambda$loadGroupStickerSet$45(this.f19974c);
                return;
            case 2:
                this.f19973b.lambda$loadGroupStickerSet$43(this.f19974c);
                return;
            case 3:
                this.f19973b.lambda$putSetToCache$47(this.f19974c);
                return;
            default:
                this.f19973b.lambda$replaceStickerSet$28(this.f19974c);
                return;
        }
    }
}
