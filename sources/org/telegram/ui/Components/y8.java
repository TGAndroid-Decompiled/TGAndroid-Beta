package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class y8 extends org.telegram.ui.x51 {
    public boolean f32585d2;
    public final e9 f32586e2;

    public y8(e9 e9Var, e9 e9Var2, Activity activity, int i10) {
        super(e9Var2, activity, false, null, 4, true, null, 16, i10);
        this.f32586e2 = e9Var;
        this.f32585d2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f32585d2) {
            this.f32585d2 = false;
            this.f32586e2.f25844b.s(null);
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
        e9 e9Var = this.f32586e2;
        if (z11) {
            i11 = ((org.telegram.ui.ActionBar.n2) e9Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i11).profileAvatarConstructorDefault;
        } else {
            i10 = ((org.telegram.ui.ActionBar.n2) e9Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i10).groupAvatarConstructorDefault;
        }
        long j11 = 0;
        if (tL_emojiList != null) {
            if (document != null) {
                j10 = document.f20282id;
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
        e9Var.h0(z10, j11, document);
    }
}
