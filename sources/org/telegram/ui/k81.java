package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k81 extends g11 {
    public boolean f46829f2;
    public final l81 f46830g2;

    public k81(l81 l81Var, l81 l81Var2, Activity activity) {
        super(l81Var2, activity, false, null, 3, null);
        this.f46830g2 = l81Var;
        this.f46829f2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.f46829f2) {
            this.f46829f2 = false;
            this.f46830g2.f47222f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i3;
        int i10;
        long j10;
        l81 l81Var = this.f46830g2;
        i3 = ((org.telegram.ui.ActionBar.d2) l81Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.h10.i(i3).f22841f0)) {
            org.telegram.messenger.li mediaDataController = l81Var.getMediaDataController();
            i10 = ((org.telegram.ui.ActionBar.d2) l81Var).currentAccount;
            TLRPC.TL_messages_stickerSet n02 = mediaDataController.n0(org.telegram.messenger.h10.i(i10).f22841f0);
            if (n02 == null) {
                j10 = 0;
            } else {
                j10 = n02.set.f27028id;
            }
            if (j10 == org.telegram.messenger.li.q0(document)) {
                z10 = true;
            }
        }
        l81Var.g0(l10, z10);
    }
}
