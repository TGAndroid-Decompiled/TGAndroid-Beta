package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class pr implements View.OnClickListener {
    public final int f26236a;
    public final long f26237b;
    public final Object f26238c;
    public final Object d;
    public final Object e;

    public pr(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f26236a = i10;
        this.f26238c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f26237b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26236a) {
            case 0:
                sr.S((sr) this.f26238c, (Context) this.d, (bi.d) this.e, this.f26237b);
                return;
            case 1:
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) this.f26238c;
                wyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new bi.ua(wyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f26237b, 27), 100L);
                return;
            default:
                sg.a0.P((sg.a0) this.f26238c, (TL_stories.PrepaidGiveaway) this.d, this.f26237b, (org.telegram.ui.ActionBar.p2) this.e);
                return;
        }
    }

    public pr(sg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f26236a = 2;
        this.f26238c = a0Var;
        this.d = prepaidGiveaway;
        this.f26237b = j3;
        this.e = p2Var;
    }
}
