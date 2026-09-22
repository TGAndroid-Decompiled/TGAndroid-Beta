package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jr implements View.OnClickListener {
    public final int f25397a;
    public final long f25398b;
    public final Object f25399c;
    public final Object d;
    public final Object e;

    public jr(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f25397a = i10;
        this.f25399c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f25398b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25397a) {
            case 0:
                mr.S((mr) this.f25399c, (Context) this.d, (ci.d) this.e, this.f25398b);
                return;
            case 1:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f25399c;
                uyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new j21(uyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f25398b, 1), 100L);
                return;
            default:
                tg.b0.P((tg.b0) this.f25399c, (TL_stories.PrepaidGiveaway) this.d, this.f25398b, (org.telegram.ui.ActionBar.n2) this.e);
                return;
        }
    }

    public jr(tg.b0 b0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f25397a = 2;
        this.f25399c = b0Var;
        this.d = prepaidGiveaway;
        this.f25398b = j3;
        this.e = n2Var;
    }
}
