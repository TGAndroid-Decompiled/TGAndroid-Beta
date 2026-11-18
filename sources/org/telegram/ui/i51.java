package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class i51 extends org.telegram.ui.Components.e41 {
    public final StickersActivity f48543b;

    public i51(StickersActivity stickersActivity) {
        this.f48543b = stickersActivity;
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        int i7;
        StickersActivity stickersActivity = this.f48543b;
        i7 = ((org.telegram.ui.ActionBar.h2) stickersActivity).currentAccount;
        org.telegram.messenger.ri.d0(i7).k2(stickersActivity.getParentActivity(), stickerSetCovered, 2, stickersActivity, false, false);
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        int i7;
        StickersActivity stickersActivity = this.f48543b;
        i7 = ((org.telegram.ui.ActionBar.h2) stickersActivity).currentAccount;
        org.telegram.messenger.ri.d0(i7).k2(stickersActivity.getParentActivity(), stickerSetCovered, 0, stickersActivity, false, false);
    }
}
