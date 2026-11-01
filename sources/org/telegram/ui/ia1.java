package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ia1 extends g31 {
    public boolean f37988e2;
    public final ja1 f37989f2;

    public ia1(ja1 ja1Var, ja1 ja1Var2, Activity activity) {
        super(ja1Var2, activity, false, null, 3, null);
        this.f37989f2 = ja1Var;
        this.f37988e2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f37988e2) {
            this.f37988e2 = false;
            this.f37989f2.f38325f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        long j10;
        ja1 ja1Var = this.f37989f2;
        i10 = ((org.telegram.ui.ActionBar.k2) ja1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(org.telegram.messenger.e20.i(i10).f15515e0)) {
            org.telegram.messenger.vi mediaDataController = ja1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.k2) ja1Var).currentAccount;
            TLRPC.TL_messages_stickerSet n02 = mediaDataController.n0(org.telegram.messenger.e20.i(i11).f15515e0);
            if (n02 == null) {
                j10 = 0;
            } else {
                j10 = n02.set.f19821id;
            }
            if (j10 == org.telegram.messenger.vi.q0(document)) {
                z10 = true;
            }
        }
        ja1Var.g0(l4, z10);
    }
}
