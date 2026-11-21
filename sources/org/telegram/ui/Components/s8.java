package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s8 extends org.telegram.ui.s11 {
    public boolean f39521f2;
    public final y8 f39522g2;

    public s8(y8 y8Var, y8 y8Var2, Activity activity, int i7) {
        super(y8Var2, activity, false, null, 4, true, null, 16, i7);
        this.f39522g2 = y8Var;
        this.f39521f2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f39521f2) {
            this.f39521f2 = false;
            this.f39522g2.f42352b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z10;
        long j3;
        int i10;
        boolean z11 = this.S;
        y8 y8Var = this.f39522g2;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.g2) y8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.ri.d0(i10).M1;
        } else {
            i7 = ((org.telegram.ui.ActionBar.g2) y8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.ri.d0(i7).N1;
        }
        long j10 = 0;
        if (tL_emojiList != null) {
            if (document != null) {
                j3 = document.f28437id;
            } else if (l10 != null) {
                j3 = l10.longValue();
            } else {
                j3 = 0;
            }
            z10 = tL_emojiList.document_id.contains(Long.valueOf(j3));
        } else {
            z10 = false;
        }
        if (l10 != null) {
            j10 = l10.longValue();
        }
        y8Var.m0(z10, j10, document);
    }
}
