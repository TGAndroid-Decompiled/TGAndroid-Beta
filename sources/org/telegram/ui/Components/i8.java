package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i8 extends org.telegram.ui.g31 {
    public boolean f27025e2;
    public final o8 f27026f2;

    public i8(o8 o8Var, o8 o8Var2, Activity activity, int i10) {
        super(o8Var2, activity, false, null, 4, true, null, 16, i10);
        this.f27026f2 = o8Var;
        this.f27025e2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f27025e2) {
            this.f27025e2 = false;
            this.f27026f2.f29046b.s(null);
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
        o8 o8Var = this.f27026f2;
        if (z11) {
            i11 = ((org.telegram.ui.ActionBar.k2) o8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.vi.b0(i11).J1;
        } else {
            i10 = ((org.telegram.ui.ActionBar.k2) o8Var).currentAccount;
            tL_emojiList = org.telegram.messenger.vi.b0(i10).K1;
        }
        long j11 = 0;
        if (tL_emojiList != null) {
            if (document != null) {
                j10 = document.f19800id;
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
        o8Var.m0(z10, j11, document);
    }
}
