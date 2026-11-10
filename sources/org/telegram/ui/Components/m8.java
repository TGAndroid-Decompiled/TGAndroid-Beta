package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class m8 extends org.telegram.ui.t11 {
    public boolean f35889e2;
    public final s8 f35890f2;

    public m8(s8 s8Var, s8 s8Var2, Activity activity, int i7) {
        super(s8Var2, activity, false, null, 4, true, null, 16, i7);
        this.f35890f2 = s8Var;
        this.f35889e2 = true;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.f35889e2) {
            this.f35889e2 = false;
            this.f35890f2.f37889b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        TLRPC.TL_emojiList tL_emojiList;
        boolean z9;
        long j3;
        int i10;
        boolean z10 = this.R;
        s8 s8Var = this.f35890f2;
        if (z10) {
            i10 = ((org.telegram.ui.ActionBar.f2) s8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.ui.b0(i10).J1;
        } else {
            i7 = ((org.telegram.ui.ActionBar.f2) s8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.ui.b0(i7).K1;
        }
        long j10 = 0;
        if (tL_emojiList != null) {
            if (document != null) {
                j3 = document.f26966id;
            } else if (l10 != null) {
                j3 = l10.longValue();
            } else {
                j3 = 0;
            }
            z9 = tL_emojiList.document_id.contains(Long.valueOf(j3));
        } else {
            z9 = false;
        }
        if (l10 != null) {
            j10 = l10.longValue();
        }
        s8Var.m0(z9, j10, document);
    }
}
