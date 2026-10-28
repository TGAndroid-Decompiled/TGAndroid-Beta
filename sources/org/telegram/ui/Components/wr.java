package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class wr implements View.OnClickListener {
    public final int f34565a;
    public final long f34566b;
    public final Object f34567c;
    public final Object d;
    public final Object e;

    public wr(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f34565a = i10;
        this.f34567c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f34566b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34565a) {
            case 0:
                zr.S((zr) this.f34567c, (Context) this.d, (fi.d) this.e, this.f34566b);
                return;
            case 1:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.f34567c;
                eyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new bi.y2(eyVar, (MessagesController.DialogFilter) this.d, (TLRPC.Dialog) this.e, this.f34566b, 19), 100L);
                return;
            default:
                vg.a0.P((vg.a0) this.f34567c, (TL_stories.PrepaidGiveaway) this.d, this.f34566b, (org.telegram.ui.ActionBar.r2) this.e);
                return;
        }
    }

    public wr(vg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f34565a = 2;
        this.f34567c = a0Var;
        this.d = prepaidGiveaway;
        this.f34566b = j10;
        this.e = r2Var;
    }
}
