package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class p8 extends org.telegram.ui.a61 {
    public boolean Z1;
    public final v8 a2;

    public p8(v8 v8Var, v8 v8Var2, Activity activity, int i10) {
        super(v8Var2, activity, false, null, 4, true, null, 16, i10);
        this.a2 = v8Var;
        this.Z1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.Z1) {
            this.Z1 = false;
            this.a2.f33296b.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        boolean zContains;
        long jLongValue;
        boolean z10 = this.N;
        v8 v8Var = this.a2;
        TLRPC.TL_emojiList tL_emojiList = z10 ? MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) v8Var).currentAccount).profileAvatarConstructorDefault : MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) v8Var).currentAccount).groupAvatarConstructorDefault;
        if (tL_emojiList != null) {
            if (document != null) {
                jLongValue = document.f22386id;
            } else {
                jLongValue = l10 != null ? l10.longValue() : 0L;
            }
            zContains = tL_emojiList.document_id.contains(Long.valueOf(jLongValue));
        } else {
            zContains = false;
        }
        v8Var.h0(zContains, l10 != null ? l10.longValue() : 0L, document);
    }
}
