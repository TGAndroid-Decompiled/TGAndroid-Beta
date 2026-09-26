package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class lr implements View.OnClickListener {
    public final int f26148a;
    public final long f26149b;
    public final Object f26150c;
    public final Object d;
    public final Object e;

    public lr(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f26148a = i10;
        this.f26150c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f26149b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26148a) {
            case 0:
                or.S((or) this.f26150c, (Context) this.d, (ci.d) this.e, this.f26149b);
                return;
            case 1:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.f26150c;
                qyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new x21(qyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f26149b, 1), 100L);
                return;
            default:
                tg.a0.P((tg.a0) this.f26150c, (TL_stories.PrepaidGiveaway) this.d, this.f26149b, (org.telegram.ui.ActionBar.m2) this.e);
                return;
        }
    }

    public lr(tg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f26148a = 2;
        this.f26150c = a0Var;
        this.d = prepaidGiveaway;
        this.f26149b = j3;
        this.e = m2Var;
    }
}
