package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class kr implements View.OnClickListener {
    public final int f25676a;
    public final long f25677b;
    public final Object f25678c;
    public final Object d;
    public final Object e;

    public kr(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f25676a = i10;
        this.f25678c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f25677b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25676a) {
            case 0:
                nr.S((nr) this.f25678c, (Context) this.d, (ci.d) this.e, this.f25677b);
                return;
            case 1:
                org.telegram.ui.ry ryVar = (org.telegram.ui.ry) this.f25678c;
                ryVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new i21(ryVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f25677b, 1), 100L);
                return;
            default:
                tg.b0.P((tg.b0) this.f25678c, (TL_stories.PrepaidGiveaway) this.d, this.f25677b, (org.telegram.ui.ActionBar.n2) this.e);
                return;
        }
    }

    public kr(tg.b0 b0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f25676a = 2;
        this.f25678c = b0Var;
        this.d = prepaidGiveaway;
        this.f25677b = j3;
        this.e = n2Var;
    }
}
