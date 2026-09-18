package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jr implements View.OnClickListener {
    public final int f25420a;
    public final long f25421b;
    public final Object f25422c;
    public final Object d;
    public final Object e;

    public jr(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f25420a = i10;
        this.f25422c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f25421b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25420a) {
            case 0:
                mr.S((mr) this.f25422c, (Context) this.d, (ci.d) this.e, this.f25421b);
                return;
            case 1:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f25422c;
                uyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new y21(uyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f25421b, 1), 100L);
                return;
            default:
                tg.a0.P((tg.a0) this.f25422c, (TL_stories.PrepaidGiveaway) this.d, this.f25421b, (org.telegram.ui.ActionBar.n2) this.e);
                return;
        }
    }

    public jr(tg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f25420a = 2;
        this.f25422c = a0Var;
        this.d = prepaidGiveaway;
        this.f25421b = j3;
        this.e = n2Var;
    }
}
