package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q8 extends org.telegram.ui.w61 {
    public boolean a2;
    public final w8 f30355b2;

    public q8(w8 w8Var, w8 w8Var2, Activity activity, int i10) {
        super(w8Var2, activity, false, null, 4, true, null, 16, i10);
        this.f30355b2 = w8Var;
        this.a2 = true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.a2) {
            this.a2 = false;
            this.f30355b2.f32676b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z4;
        long j10;
        int i11;
        boolean z10 = this.O;
        w8 w8Var = this.f30355b2;
        if (z10) {
            i11 = ((org.telegram.ui.ActionBar.p2) w8Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i11).profileAvatarConstructorDefault;
        } else {
            i10 = ((org.telegram.ui.ActionBar.p2) w8Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i10).groupAvatarConstructorDefault;
        }
        long j11 = 0;
        if (tL_emojiList != null) {
            if (document != null) {
                j10 = document.f20851id;
            } else if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = 0;
            }
            z4 = tL_emojiList.document_id.contains(Long.valueOf(j10));
        } else {
            z4 = false;
        }
        if (l10 != null) {
            j11 = l10.longValue();
        }
        w8Var.h0(z4, j11, document);
    }
}
