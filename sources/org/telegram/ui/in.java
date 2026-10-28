package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class in extends org.telegram.ui.Components.kb1 {
    public MessageObject f40210c;
    public int d = 0;
    public boolean e = true;
    public int f40211f = 0;
    public int f40212g;
    public boolean h;
    public int f40213i;
    public final wn f40214j;

    public in(wn wnVar) {
        this.f40214j = wnVar;
    }

    @Override
    public final void N() {
        MessageObject messageObject = this.f40210c;
        wn wnVar = this.f40214j;
        if (messageObject != null) {
            wnVar.A0.T();
            int indexOf = wnVar.K6.indexOf(this.f40210c) + wnVar.A0.J;
            if (indexOf >= 0) {
                wnVar.f45364z0.i1(indexOf, (int) ((this.f40212g + this.f40213i) - wnVar.I9), this.h);
            }
        } else {
            wnVar.A0.T();
            wnVar.f45364z0.i1(this.d, this.f40211f, this.e);
        }
        this.f40210c = null;
        wnVar.y3 = true;
        wnVar.nd(false);
        AndroidUtilities.runOnUIThread(new xi(this, 9));
    }

    @Override
    public final void Q() {
        wn wnVar = this.f40214j;
        wnVar.Y9 = wnVar.getNotificationCenter().setAnimationInProgress(wnVar.Y9, wn.f45041ld);
        sk skVar = wnVar.Ma;
        if (skVar.f38956n) {
            skVar.d();
        }
    }

    @Override
    public final void S(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.setDelegate(null);
            s1Var.setResourcesProvider(null);
        }
    }
}
