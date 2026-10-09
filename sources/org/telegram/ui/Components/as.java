package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class as implements View.OnClickListener {
    public final int f24753a;
    public final long f24754b;
    public final Object f24755c;
    public final Object d;
    public final Object f24756e;

    public as(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f24753a = i10;
        this.f24755c = obj;
        this.d = obj2;
        this.f24756e = obj3;
        this.f24754b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24753a) {
            case 0:
                ds.T((ds) this.f24755c, (Context) this.d, (ci.d) this.f24756e, this.f24754b);
                return;
            case 1:
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) this.f24755c;
                tyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new o31(tyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.f24756e, this.f24754b, 1), 100L);
                return;
            default:
                tg.a0.Q((tg.a0) this.f24755c, (TL_stories.PrepaidGiveaway) this.d, this.f24754b, (org.telegram.ui.ActionBar.n2) this.f24756e);
                return;
        }
    }

    public as(tg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f24753a = 2;
        this.f24755c = a0Var;
        this.d = prepaidGiveaway;
        this.f24754b = j3;
        this.f24756e = n2Var;
    }
}
