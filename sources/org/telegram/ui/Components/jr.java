package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jr implements View.OnClickListener {
    public final int f25411a;
    public final long f25412b;
    public final Object f25413c;
    public final Object d;
    public final Object e;

    public jr(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f25411a = i10;
        this.f25413c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f25412b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25411a) {
            case 0:
                mr.S((mr) this.f25413c, (Context) this.d, (ci.d) this.e, this.f25412b);
                return;
            case 1:
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) this.f25413c;
                wyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new k21(wyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f25412b, 1), 100L);
                return;
            default:
                tg.b0.P((tg.b0) this.f25413c, (TL_stories.PrepaidGiveaway) this.d, this.f25412b, (org.telegram.ui.ActionBar.o2) this.e);
                return;
        }
    }

    public jr(tg.b0 b0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f25411a = 2;
        this.f25413c = b0Var;
        this.d = prepaidGiveaway;
        this.f25412b = j3;
        this.e = o2Var;
    }
}
