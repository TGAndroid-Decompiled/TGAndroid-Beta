package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class gn extends i7.g6 {
    public MessageObject f38625a;
    public int f38626b = 0;
    public boolean f38627c = true;
    public int d = 0;
    public int f38628e;
    public boolean f38629f;
    public int f38630g;
    public final tn h;

    public gn(tn tnVar) {
        this.h = tnVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f38625a;
        tn tnVar = this.h;
        if (messageObject != null) {
            tnVar.f43013w0.T();
            int indexOf = tnVar.q6.indexOf(this.f38625a) + tnVar.f43013w0.F;
            if (indexOf >= 0) {
                tnVar.f42999v0.i1(indexOf, (int) ((this.f38628e + this.f38630g) - tnVar.f42921o9), this.f38629f);
            }
        } else {
            tnVar.f43013w0.T();
            tnVar.f42999v0.i1(this.f38626b, this.d, this.f38627c);
        }
        this.f38625a = null;
        tnVar.f42841i3 = true;
        tnVar.Wc(false);
        AndroidUtilities.runOnUIThread(new ui(this, 8));
    }

    @Override
    public final void c() {
        tn tnVar = this.h;
        tnVar.E9 = tnVar.getNotificationCenter().setAnimationInProgress(tnVar.E9, tn.Jc);
        mk mkVar = tnVar.f42970sa;
        if (mkVar.f40300n) {
            mkVar.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.setDelegate(null);
            s1Var.setResourcesProvider(null);
        }
    }
}
