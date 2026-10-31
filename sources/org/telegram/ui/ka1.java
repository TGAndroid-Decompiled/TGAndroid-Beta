package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ka1 extends i31 {
    public boolean f38731e2;
    public final la1 f38732f2;

    public ka1(la1 la1Var, la1 la1Var2, Activity activity) {
        super(la1Var2, activity, false, null, 3, null);
        this.f38732f2 = la1Var;
        this.f38731e2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f38731e2) {
            this.f38731e2 = false;
            this.f38732f2.f39138f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        long j10;
        la1 la1Var = this.f38732f2;
        i10 = ((org.telegram.ui.ActionBar.k2) la1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.d20.i(i10).f15156e0)) {
            org.telegram.messenger.ui mediaDataController = la1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.k2) la1Var).currentAccount;
            TLRPC.TL_messages_stickerSet n02 = mediaDataController.n0(org.telegram.messenger.d20.i(i11).f15156e0);
            if (n02 == null) {
                j10 = 0;
            } else {
                j10 = n02.set.f19820id;
            }
            if (j10 == org.telegram.messenger.ui.q0(document)) {
                z10 = true;
            }
        }
        la1Var.f0(l4, z10);
    }
}
