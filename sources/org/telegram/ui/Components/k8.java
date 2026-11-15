package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k8 extends org.telegram.ui.n11 {
    public boolean f36319f2;
    public final q8 f36320g2;

    public k8(q8 q8Var, q8 q8Var2, Activity activity, int i7) {
        super(q8Var2, activity, false, null, 4, true, null, 16, i7);
        this.f36320g2 = q8Var;
        this.f36319f2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.f36319f2) {
            this.f36319f2 = false;
            this.f36320g2.f38564b.s(null);
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
        q8 q8Var = this.f36320g2;
        if (z11) {
            i10 = ((org.telegram.ui.ActionBar.e2) q8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.si.b0(i10).K1;
        } else {
            i7 = ((org.telegram.ui.ActionBar.e2) q8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.si.b0(i7).L1;
        }
        long j10 = 0;
        if (tL_emojiList != null) {
            if (document != null) {
                j3 = document.f28057id;
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
        q8Var.m0(z10, j10, document);
    }
}
