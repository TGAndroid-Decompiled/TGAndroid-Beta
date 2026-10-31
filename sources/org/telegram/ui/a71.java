package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class a71 extends org.telegram.ui.Components.s41 {
    public final StickersActivity f35578b;

    public a71(StickersActivity stickersActivity) {
        this.f35578b = stickersActivity;
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        int i10;
        StickersActivity stickersActivity = this.f35578b;
        i10 = ((org.telegram.ui.ActionBar.k2) stickersActivity).currentAccount;
        org.telegram.messenger.ui.b0(i10).f2(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i10;
        StickersActivity stickersActivity = this.f35578b;
        i10 = ((org.telegram.ui.ActionBar.k2) stickersActivity).currentAccount;
        org.telegram.messenger.ui.b0(i10).f2(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
