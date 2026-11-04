package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class l8 extends org.telegram.ui.g11 {
    public boolean f35617f2;
    public final r8 f35618g2;

    public l8(r8 r8Var, r8 r8Var2, Activity activity, int i3) {
        super(r8Var2, activity, false, null, 4, true, null, 16, i3);
        this.f35618g2 = r8Var;
        this.f35617f2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.f35617f2) {
            this.f35617f2 = false;
            this.f35618g2.f37669b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i3;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z10;
        long j10;
        int i10;
        boolean z11 = this.S;
        r8 r8Var = this.f35618g2;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.d2) r8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.li.b0(i10).K1;
        } else {
            i3 = ((org.telegram.ui.ActionBar.d2) r8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.li.b0(i3).L1;
        }
        long j11 = 0;
        if (tL_emojiList != null) {
            if (document != null) {
                j10 = document.f27007id;
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
        r8Var.m0(z10, j11, document);
    }
}
