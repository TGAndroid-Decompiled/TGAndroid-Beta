package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ur implements View.OnClickListener {
    public final int f31205a;
    public final long f31206b;
    public final Object f31207c;
    public final Object d;
    public final Object e;

    public ur(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f31205a = i10;
        this.f31207c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f31206b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31205a) {
            case 0:
                xr.S((xr) this.f31207c, (Context) this.d, (ei.d) this.e, this.f31206b);
                return;
            case 1:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f31207c;
                eyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new ai.c3(eyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f31206b, 19), 100L);
                return;
            default:
                ug.y.P((ug.y) this.f31207c, (TL_stories.PrepaidGiveaway) this.d, this.f31206b, (org.telegram.ui.ActionBar.o2) this.e);
                return;
        }
    }

    public ur(ug.y yVar, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f31205a = 2;
        this.f31207c = yVar;
        this.d = prepaidGiveaway;
        this.f31206b = j10;
        this.e = o2Var;
    }
}
