package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y8 extends org.telegram.ui.a71 {
    public boolean f30565d2;
    public final e9 f30566e2;

    public y8(e9 e9Var, e9 e9Var2, Activity activity, int i10) {
        super(e9Var2, activity, false, null, 4, true, null, 16, i10);
        this.f30566e2 = e9Var;
        this.f30565d2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f30565d2) {
            this.f30565d2 = false;
            this.f30566e2.f23881b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z10;
        long j3;
        int i11;
        boolean z11 = this.R;
        e9 e9Var = this.f30566e2;
        if (z11) {
            i11 = ((org.telegram.ui.ActionBar.m2) e9Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i11).profileAvatarConstructorDefault;
        } else {
            i10 = ((org.telegram.ui.ActionBar.m2) e9Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i10).groupAvatarConstructorDefault;
        }
        long j10 = 0;
        if (tL_emojiList != null) {
            if (document != null) {
                j3 = document.f18342id;
            } else if (l4 != null) {
                j3 = l4.longValue();
            } else {
                j3 = 0;
            }
            z10 = tL_emojiList.document_id.contains(Long.valueOf(j3));
        } else {
            z10 = false;
        }
        if (l4 != null) {
            j10 = l4.longValue();
        }
        e9Var.h0(z10, j10, document);
    }
}
