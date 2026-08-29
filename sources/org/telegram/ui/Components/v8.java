package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class v8 extends org.telegram.ui.d61 {
    public boolean Z1;
    public final b9 a2;

    public v8(b9 b9Var, b9 b9Var2, Activity activity, int i10) {
        super(b9Var2, activity, false, null, 4, true, null, 16, i10);
        this.a2 = b9Var;
        this.Z1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Z1) {
            this.Z1 = false;
            this.a2.f27004b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z10;
        long j10;
        int i11;
        boolean z11 = this.N;
        b9 b9Var = this.a2;
        if (z11) {
            i11 = ((org.telegram.ui.ActionBar.o2) b9Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i11).profileAvatarConstructorDefault;
        } else {
            i10 = ((org.telegram.ui.ActionBar.o2) b9Var).currentAccount;
            tL_emojiList = MediaDataController.getInstance(i10).groupAvatarConstructorDefault;
        }
        long j11 = 0;
        if (tL_emojiList != null) {
            if (document != null) {
                j10 = document.f22398id;
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
        b9Var.h0(z10, j11, document);
    }
}
