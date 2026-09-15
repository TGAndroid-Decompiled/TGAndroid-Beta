package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jr implements View.OnClickListener {
    public final int f25400a;
    public final long f25401b;
    public final Object f25402c;
    public final Object d;
    public final Object e;

    public jr(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f25400a = i10;
        this.f25402c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f25401b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25400a) {
            case 0:
                mr.S((mr) this.f25402c, (Context) this.d, (ci.d) this.e, this.f25401b);
                return;
            case 1:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f25402c;
                uyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new j21(uyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f25401b, 1), 100L);
                return;
            default:
                tg.b0.P((tg.b0) this.f25402c, (TL_stories.PrepaidGiveaway) this.d, this.f25401b, (org.telegram.ui.ActionBar.n2) this.e);
                return;
        }
    }

    public jr(tg.b0 b0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f25400a = 2;
        this.f25402c = b0Var;
        this.d = prepaidGiveaway;
        this.f25401b = j3;
        this.e = n2Var;
    }
}
