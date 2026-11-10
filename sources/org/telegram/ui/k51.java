package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class k51 extends org.telegram.ui.Components.p31 {
    public final StickersActivity f47166b;

    public k51(StickersActivity stickersActivity) {
        this.f47166b = stickersActivity;
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z9) {
        int i7;
        StickersActivity stickersActivity = this.f47166b;
        i7 = ((org.telegram.ui.ActionBar.f2) stickersActivity).currentAccount;
        org.telegram.messenger.ui.b0(i7).f2(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i7;
        StickersActivity stickersActivity = this.f47166b;
        i7 = ((org.telegram.ui.ActionBar.f2) stickersActivity).currentAccount;
        org.telegram.messenger.ui.b0(i7).f2(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
