package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class kr implements View.OnClickListener {
    public final int f25856a;
    public final long f25857b;
    public final Object f25858c;
    public final Object d;
    public final Object e;

    public kr(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f25856a = i10;
        this.f25858c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f25857b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25856a) {
            case 0:
                nr.S((nr) this.f25858c, (Context) this.d, (ci.d) this.e, this.f25857b);
                return;
            case 1:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.f25858c;
                qyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new w21(qyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f25857b, 1), 100L);
                return;
            default:
                tg.a0.P((tg.a0) this.f25858c, (TL_stories.PrepaidGiveaway) this.d, this.f25857b, (org.telegram.ui.ActionBar.m2) this.e);
                return;
        }
    }

    public kr(tg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f25856a = 2;
        this.f25858c = a0Var;
        this.d = prepaidGiveaway;
        this.f25857b = j3;
        this.e = m2Var;
    }
}
