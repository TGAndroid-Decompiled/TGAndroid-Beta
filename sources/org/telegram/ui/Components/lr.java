package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class lr implements View.OnClickListener {
    public final int f26069a;
    public final long f26070b;
    public final Object f26071c;
    public final Object d;
    public final Object e;

    public lr(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f26069a = i10;
        this.f26071c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f26070b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26069a) {
            case 0:
                or.S((or) this.f26071c, (Context) this.d, (ci.d) this.e, this.f26070b);
                return;
            case 1:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.f26071c;
                qyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new y21(qyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f26070b, 1), 100L);
                return;
            default:
                tg.a0.P((tg.a0) this.f26071c, (TL_stories.PrepaidGiveaway) this.d, this.f26070b, (org.telegram.ui.ActionBar.m2) this.e);
                return;
        }
    }

    public lr(tg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f26069a = 2;
        this.f26071c = a0Var;
        this.d = prepaidGiveaway;
        this.f26070b = j3;
        this.e = m2Var;
    }
}
