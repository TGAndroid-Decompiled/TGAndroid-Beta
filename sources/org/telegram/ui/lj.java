package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class lj extends FragmentContextView {
    public final int X0;
    public final an Y0;

    public lj(an anVar, Context context, an anVar2, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, anVar2, null, true, f6Var);
        this.X0 = i7;
        switch (i7) {
            case 1:
                this.Y0 = anVar;
                super(context, anVar2, null, false, f6Var);
                return;
            default:
                this.Y0 = anVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z9;
        boolean z10;
        switch (this.X0) {
            case 0:
                an anVar = this.Y0;
                org.telegram.ui.Components.lg lgVar = anVar.f43718a1;
                FrameLayout frameLayout = anVar.f43899o2;
                if (i7 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                lgVar.i(frameLayout, z9, true);
                return;
            default:
                an anVar2 = this.Y0;
                org.telegram.ui.Components.lg lgVar2 = anVar2.f43718a1;
                FrameLayout frameLayout2 = anVar2.f43875m2;
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lgVar2.i(frameLayout2, z10, true);
                return;
        }
    }
}
