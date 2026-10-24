package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class sr implements View.OnClickListener {
    public final int f30613a;
    public final long f30614b;
    public final Object f30615c;
    public final Object d;
    public final Object e;

    public sr(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f30613a = i10;
        this.f30615c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f30614b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30613a) {
            case 0:
                vr.S((vr) this.f30615c, (Context) this.d, (ei.d) this.e, this.f30614b);
                return;
            case 1:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f30615c;
                eyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new ai.c3(eyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f30614b, 19), 100L);
                return;
            default:
                ug.y.P((ug.y) this.f30615c, (TL_stories.PrepaidGiveaway) this.d, this.f30614b, (org.telegram.ui.ActionBar.o2) this.e);
                return;
        }
    }

    public sr(ug.y yVar, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f30613a = 2;
        this.f30615c = yVar;
        this.d = prepaidGiveaway;
        this.f30614b = j10;
        this.e = o2Var;
    }
}
