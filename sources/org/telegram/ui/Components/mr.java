package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class mr implements View.OnClickListener {
    public final int f26358a;
    public final long f26359b;
    public final Object f26360c;
    public final Object d;
    public final Object e;

    public mr(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f26358a = i10;
        this.f26360c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f26359b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26358a) {
            case 0:
                pr.S((pr) this.f26360c, (Context) this.d, (ci.d) this.e, this.f26359b);
                return;
            case 1:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.f26360c;
                qyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new z21(qyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f26359b, 1), 100L);
                return;
            default:
                tg.a0.P((tg.a0) this.f26360c, (TL_stories.PrepaidGiveaway) this.d, this.f26359b, (org.telegram.ui.ActionBar.m2) this.e);
                return;
        }
    }

    public mr(tg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f26358a = 2;
        this.f26360c = a0Var;
        this.d = prepaidGiveaway;
        this.f26359b = j3;
        this.e = m2Var;
    }
}
