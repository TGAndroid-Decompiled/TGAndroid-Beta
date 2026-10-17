package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ur implements View.OnClickListener {
    public final int f31072a;
    public final long f31073b;
    public final Object f31074c;
    public final Object d;
    public final Object e;

    public ur(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f31072a = i10;
        this.f31074c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f31073b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31072a) {
            case 0:
                xr.T((xr) this.f31074c, (Context) this.d, (ei.d) this.e, this.f31073b);
                return;
            case 1:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f31074c;
                eyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new ai.c3(eyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f31073b, 19), 100L);
                return;
            default:
                ug.y.Q((ug.y) this.f31074c, (TL_stories.PrepaidGiveaway) this.d, this.f31073b, (org.telegram.ui.ActionBar.n2) this.e);
                return;
        }
    }

    public ur(ug.y yVar, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f31072a = 2;
        this.f31074c = yVar;
        this.d = prepaidGiveaway;
        this.f31073b = j10;
        this.e = n2Var;
    }
}
