package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ir implements View.OnClickListener {
    public final int f27244a;
    public final long f27245b;
    public final Object f27246c;
    public final Object d;
    public final Object f27247e;

    public ir(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f27244a = i10;
        this.f27246c = obj;
        this.d = obj2;
        this.f27247e = obj3;
        this.f27245b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27244a) {
            case 0:
                lr.S((lr) this.f27246c, (Context) this.d, (di.d) this.f27247e, this.f27245b);
                return;
            case 1:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f27246c;
                uyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new i21(uyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.f27247e, this.f27245b, 1), 100L);
                return;
            default:
                ug.b0.P((ug.b0) this.f27246c, (TL_stories.PrepaidGiveaway) this.d, this.f27245b, (org.telegram.ui.ActionBar.n2) this.f27247e);
                return;
        }
    }

    public ir(ug.b0 b0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f27244a = 2;
        this.f27246c = b0Var;
        this.d = prepaidGiveaway;
        this.f27245b = j3;
        this.f27247e = n2Var;
    }
}
