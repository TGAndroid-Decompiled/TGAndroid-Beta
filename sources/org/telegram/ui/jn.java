package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class jn extends w7.z5 {
    public MessageObject f34822a;
    public int f34823b = 0;
    public boolean f34824c = true;
    public int d = 0;
    public int e;
    public boolean f34825f;
    public int f34826g;
    public final wn h;

    public jn(wn wnVar) {
        this.h = wnVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f34822a;
        wn wnVar = this.h;
        if (messageObject != null) {
            wnVar.A0.T();
            int indexOf = wnVar.f39647u6.indexOf(this.f34822a) + wnVar.A0.J;
            if (indexOf >= 0) {
                wnVar.f39705z0.i1(indexOf, (int) ((this.e + this.f34826g) - wnVar.f39625s9), this.f34825f);
            }
        } else {
            wnVar.A0.T();
            wnVar.f39705z0.i1(this.f34823b, this.d, this.f34824c);
        }
        this.f34822a = null;
        wnVar.f39543m3 = true;
        wnVar.Wc(false);
        AndroidUtilities.runOnUIThread(new aj(this, 8));
    }

    @Override
    public final void c() {
        wn wnVar = this.h;
        wnVar.I9 = wnVar.getNotificationCenter().setAnimationInProgress(wnVar.I9, wn.Mc);
        sk skVar = wnVar.f39677wa;
        if (skVar.f34292n) {
            skVar.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.setDelegate(null);
            u1Var.setResourcesProvider(null);
        }
    }
}
