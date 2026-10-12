package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class xr implements View.OnClickListener {
    public final int f31311a;
    public final long f31312b;
    public final Object f31313c;
    public final Object d;
    public final Object e;

    public xr(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f31311a = i10;
        this.f31313c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f31312b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31311a) {
            case 0:
                as.T((as) this.f31313c, (Context) this.d, (di.d) this.e, this.f31312b);
                return;
            case 1:
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) this.f31313c;
                yyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new bi.b8(yyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f31312b, 11), 100L);
                return;
            default:
                ug.a0.Q((ug.a0) this.f31313c, (TL_stories.PrepaidGiveaway) this.d, this.f31312b, (org.telegram.ui.ActionBar.m2) this.e);
                return;
        }
    }

    public xr(ug.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f31311a = 2;
        this.f31313c = a0Var;
        this.d = prepaidGiveaway;
        this.f31312b = j10;
        this.e = m2Var;
    }
}
