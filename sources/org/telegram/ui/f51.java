package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class f51 extends org.telegram.ui.Components.u31 {
    public final StickersActivity f46995b;

    public f51(StickersActivity stickersActivity) {
        this.f46995b = stickersActivity;
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        int i7;
        StickersActivity stickersActivity = this.f46995b;
        i7 = ((org.telegram.ui.ActionBar.e2) stickersActivity).currentAccount;
        org.telegram.messenger.si.b0(i7).f2(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i7;
        StickersActivity stickersActivity = this.f46995b;
        i7 = ((org.telegram.ui.ActionBar.e2) stickersActivity).currentAccount;
        org.telegram.messenger.si.b0(i7).f2(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
