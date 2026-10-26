package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class a9 extends org.telegram.ui.c61 {
    public boolean f26434e2;
    public final g9 f26435f2;

    public a9(g9 g9Var, g9 g9Var2, Activity activity, int i10) {
        super(g9Var2, activity, false, null, 4, true, null, 16, i10);
        this.f26435f2 = g9Var;
        this.f26434e2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f26434e2) {
            this.f26434e2 = false;
            this.f26435f2.f28491b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z10;
        long j10;
        int i11;
        boolean z11 = this.R;
        g9 g9Var = this.f26435f2;
        if (z11) {
            i11 = ((org.telegram.ui.ActionBar.r2) g9Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i11).profileAvatarConstructorDefault;
        } else {
            i10 = ((org.telegram.ui.ActionBar.r2) g9Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i10).groupAvatarConstructorDefault;
        }
        long j11 = 0;
        if (tL_emojiList != null) {
            if (document != null) {
                j10 = document.f22033id;
            } else if (l4 != null) {
                j10 = l4.longValue();
            } else {
                j10 = 0;
            }
            z10 = tL_emojiList.document_id.contains(Long.valueOf(j10));
        } else {
            z10 = false;
        }
        if (l4 != null) {
            j11 = l4.longValue();
        }
        g9Var.i0(z10, j11, document);
    }
}
