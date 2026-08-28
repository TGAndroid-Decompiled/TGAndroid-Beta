package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q8 extends org.telegram.ui.b61 {
    public boolean Z1;
    public final w8 a2;

    public q8(w8 w8Var, w8 w8Var2, Activity activity, int i9) {
        super(w8Var2, activity, false, null, 4, true, null, 16, i9);
        this.a2 = w8Var;
        this.Z1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.Z1) {
            this.Z1 = false;
            this.a2.f34139b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i9;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z10;
        long j10;
        int i10;
        boolean z11 = this.N;
        w8 w8Var = this.a2;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.o2) w8Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i10).profileAvatarConstructorDefault;
        } else {
            i9 = ((org.telegram.ui.ActionBar.o2) w8Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i9).groupAvatarConstructorDefault;
        }
        long j11 = 0;
        if (tL_emojiList != null) {
            if (document != null) {
                j10 = document.f22386id;
            } else if (l10 != null) {
                j10 = l10.longValue();
            } else {
                j10 = 0;
            }
            z10 = tL_emojiList.document_id.contains(Long.valueOf(j10));
        } else {
            z10 = false;
        }
        if (l10 != null) {
            j11 = l10.longValue();
        }
        w8Var.g0(z10, j11, document);
    }
}
