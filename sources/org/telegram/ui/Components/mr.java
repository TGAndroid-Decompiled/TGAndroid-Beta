package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class mr implements View.OnClickListener {
    public final int f28681a;
    public final long f28682b;
    public final Object f28683c;
    public final Object d;
    public final Object f28684e;

    public mr(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f28681a = i10;
        this.f28683c = obj;
        this.d = obj2;
        this.f28684e = obj3;
        this.f28682b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28681a) {
            case 0:
                pr.Q((pr) this.f28683c, (Context) this.d, (ci.d) this.f28684e, this.f28682b);
                return;
            case 1:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f28683c;
                uyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new h31(uyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.f28684e, this.f28682b, 1), 100L);
                return;
            default:
                tg.a0.N((tg.a0) this.f28683c, (TL_stories.PrepaidGiveaway) this.d, this.f28682b, (org.telegram.ui.ActionBar.n2) this.f28684e);
                return;
        }
    }

    public mr(tg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f28681a = 2;
        this.f28683c = a0Var;
        this.d = prepaidGiveaway;
        this.f28682b = j3;
        this.f28684e = n2Var;
    }
}
