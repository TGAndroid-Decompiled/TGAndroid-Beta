package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class lr implements View.OnClickListener {
    public final int f26068a;
    public final long f26069b;
    public final Object f26070c;
    public final Object d;
    public final Object e;

    public lr(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f26068a = i10;
        this.f26070c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f26069b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26068a) {
            case 0:
                or.S((or) this.f26070c, (Context) this.d, (ci.d) this.e, this.f26069b);
                return;
            case 1:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.f26070c;
                qyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new y21(qyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f26069b, 1), 100L);
                return;
            default:
                tg.a0.P((tg.a0) this.f26070c, (TL_stories.PrepaidGiveaway) this.d, this.f26069b, (org.telegram.ui.ActionBar.m2) this.e);
                return;
        }
    }

    public lr(tg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f26068a = 2;
        this.f26070c = a0Var;
        this.d = prepaidGiveaway;
        this.f26069b = j3;
        this.e = m2Var;
    }
}
