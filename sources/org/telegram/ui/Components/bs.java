package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class bs implements View.OnClickListener {
    public final int f25037a;
    public final long f25038b;
    public final Object f25039c;
    public final Object d;
    public final Object f25040e;

    public bs(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f25037a = i10;
        this.f25039c = obj;
        this.d = obj2;
        this.f25040e = obj3;
        this.f25038b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25037a) {
            case 0:
                es.T((es) this.f25039c, (Context) this.d, (ci.d) this.f25040e, this.f25038b);
                return;
            case 1:
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) this.f25039c;
                tyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new p31(tyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.f25040e, this.f25038b, 1), 100L);
                return;
            default:
                tg.a0.Q((tg.a0) this.f25039c, (TL_stories.PrepaidGiveaway) this.d, this.f25038b, (org.telegram.ui.ActionBar.n2) this.f25040e);
                return;
        }
    }

    public bs(tg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f25037a = 2;
        this.f25039c = a0Var;
        this.d = prepaidGiveaway;
        this.f25038b = j3;
        this.f25040e = n2Var;
    }
}
