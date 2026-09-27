package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class lr implements View.OnClickListener {
    public final int f26120a;
    public final long f26121b;
    public final Object f26122c;
    public final Object d;
    public final Object e;

    public lr(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f26120a = i10;
        this.f26122c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f26121b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26120a) {
            case 0:
                or.S((or) this.f26122c, (Context) this.d, (ci.d) this.e, this.f26121b);
                return;
            case 1:
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) this.f26122c;
                tyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new y21(tyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f26121b, 1), 100L);
                return;
            default:
                tg.a0.P((tg.a0) this.f26122c, (TL_stories.PrepaidGiveaway) this.d, this.f26121b, (org.telegram.ui.ActionBar.o2) this.e);
                return;
        }
    }

    public lr(tg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f26120a = 2;
        this.f26122c = a0Var;
        this.d = prepaidGiveaway;
        this.f26121b = j3;
        this.e = o2Var;
    }
}
