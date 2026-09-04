package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ir implements View.OnClickListener {
    public final int f27243a;
    public final long f27244b;
    public final Object f27245c;
    public final Object d;
    public final Object f27246e;

    public ir(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f27243a = i10;
        this.f27245c = obj;
        this.d = obj2;
        this.f27246e = obj3;
        this.f27244b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27243a) {
            case 0:
                lr.S((lr) this.f27245c, (Context) this.d, (di.d) this.f27246e, this.f27244b);
                return;
            case 1:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f27245c;
                uyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new i21(uyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.f27246e, this.f27244b, 1), 100L);
                return;
            default:
                ug.b0.P((ug.b0) this.f27245c, (TL_stories.PrepaidGiveaway) this.d, this.f27244b, (org.telegram.ui.ActionBar.n2) this.f27246e);
                return;
        }
    }

    public ir(ug.b0 b0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f27243a = 2;
        this.f27245c = b0Var;
        this.d = prepaidGiveaway;
        this.f27244b = j3;
        this.f27246e = n2Var;
    }
}
