package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class ca1 extends org.telegram.ui.Components.m61 {
    public final StickersActivity f38413b;

    public ca1(StickersActivity stickersActivity) {
        this.f38413b = stickersActivity;
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        int i10;
        StickersActivity stickersActivity = this.f38413b;
        i10 = ((org.telegram.ui.ActionBar.r2) stickersActivity).currentAccount;
        MediaDataController.getInstance(i10).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i10;
        StickersActivity stickersActivity = this.f38413b;
        i10 = ((org.telegram.ui.ActionBar.r2) stickersActivity).currentAccount;
        MediaDataController.getInstance(i10).toggleStickerSet(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
