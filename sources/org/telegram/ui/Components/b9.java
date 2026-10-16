package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class b9 extends org.telegram.ui.r71 {
    public boolean f23415d2;
    public final h9 f23416e2;

    public b9(h9 h9Var, h9 h9Var2, Activity activity, int i10) {
        super(h9Var2, activity, false, null, 4, true, null, 16, i10);
        this.f23416e2 = h9Var;
        this.f23415d2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f23415d2) {
            this.f23415d2 = false;
            this.f23416e2.f25211b.s(null);
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
        h9 h9Var = this.f23416e2;
        if (z11) {
            i11 = ((org.telegram.ui.ActionBar.m2) h9Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i11).profileAvatarConstructorDefault;
        } else {
            i10 = ((org.telegram.ui.ActionBar.m2) h9Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i10).groupAvatarConstructorDefault;
        }
        long j11 = 0;
        if (tL_emojiList != null) {
            if (document != null) {
                j10 = document.f18922id;
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
        h9Var.h0(z10, j11, document);
    }
}
