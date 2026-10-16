package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class xr implements View.OnClickListener {
    public final int f30994a;
    public final long f30995b;
    public final Object f30996c;
    public final Object d;
    public final Object e;

    public xr(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f30994a = i10;
        this.f30996c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f30995b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30994a) {
            case 0:
                as.T((as) this.f30996c, (Context) this.d, (di.d) this.e, this.f30995b);
                return;
            case 1:
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) this.f30996c;
                yyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new bi.b8(yyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f30995b, 11), 100L);
                return;
            default:
                ug.a0.Q((ug.a0) this.f30996c, (TL_stories.PrepaidGiveaway) this.d, this.f30995b, (org.telegram.ui.ActionBar.m2) this.e);
                return;
        }
    }

    public xr(ug.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f30994a = 2;
        this.f30996c = a0Var;
        this.d = prepaidGiveaway;
        this.f30995b = j10;
        this.e = m2Var;
    }
}
