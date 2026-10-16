package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ad implements Utilities.Callback {
    public final int f33878a;
    public final ed f33879b;

    public ad(ed edVar, int i10) {
        this.f33878a = i10;
        this.f33879b = edVar;
    }

    @Override
    public final void run(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f33878a) {
            case 0:
                ed edVar = this.f33879b;
                edVar.getClass();
                ((org.telegram.ui.Components.w21) view).setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19689i5, edVar.f35257b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.w21) {
                    org.telegram.ui.Components.w21 w21Var = (org.telegram.ui.Components.w21) view;
                    if (w21Var.G.f31345a.f19343b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f33879b.v;
                    }
                    w21Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
