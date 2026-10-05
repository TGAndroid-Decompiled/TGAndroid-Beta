package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class mr implements View.OnClickListener {
    public final int f28767a;
    public final long f28768b;
    public final Object f28769c;
    public final Object d;
    public final Object f28770e;

    public mr(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f28767a = i10;
        this.f28769c = obj;
        this.d = obj2;
        this.f28770e = obj3;
        this.f28768b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28767a) {
            case 0:
                pr.Q((pr) this.f28769c, (Context) this.d, (ci.d) this.f28770e, this.f28768b);
                return;
            case 1:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f28769c;
                uyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new i31(uyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.f28770e, this.f28768b, 1), 100L);
                return;
            default:
                tg.a0.N((tg.a0) this.f28769c, (TL_stories.PrepaidGiveaway) this.d, this.f28768b, (org.telegram.ui.ActionBar.n2) this.f28770e);
                return;
        }
    }

    public mr(tg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f28767a = 2;
        this.f28769c = a0Var;
        this.d = prepaidGiveaway;
        this.f28768b = j3;
        this.f28770e = n2Var;
    }
}
