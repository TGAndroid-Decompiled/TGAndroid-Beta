package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ir implements View.OnClickListener {
    public final int f27271a;
    public final long f27272b;
    public final Object f27273c;
    public final Object d;
    public final Object f27274e;

    public ir(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f27271a = i10;
        this.f27273c = obj;
        this.d = obj2;
        this.f27274e = obj3;
        this.f27272b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27271a) {
            case 0:
                lr.S((lr) this.f27273c, (Context) this.d, (di.d) this.f27274e, this.f27272b);
                return;
            case 1:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.f27273c;
                uyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new i21(uyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.f27274e, this.f27272b, 1), 100L);
                return;
            default:
                ug.b0.P((ug.b0) this.f27273c, (TL_stories.PrepaidGiveaway) this.d, this.f27272b, (org.telegram.ui.ActionBar.n2) this.f27274e);
                return;
        }
    }

    public ir(ug.b0 b0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f27271a = 2;
        this.f27273c = b0Var;
        this.d = prepaidGiveaway;
        this.f27272b = j3;
        this.f27274e = n2Var;
    }
}
