package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class jv extends FragmentContextView {
    public final int X0;
    public final yw Y0;

    public jv(yw ywVar, Context context, yw ywVar2, int i7) {
        super(context, ywVar2, true);
        this.X0 = i7;
        switch (i7) {
            case 1:
                this.Y0 = ywVar;
                super(context, ywVar2, false);
                return;
            default:
                this.Y0 = ywVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z9;
        boolean z10;
        switch (this.X0) {
            case 0:
                yw ywVar = this.Y0;
                org.telegram.ui.Components.pr prVar = ywVar.K1;
                FrameLayout frameLayout = ywVar.H1;
                if (i7 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                prVar.i(frameLayout, z9, true);
                return;
            default:
                yw ywVar2 = this.Y0;
                org.telegram.ui.Components.pr prVar2 = ywVar2.K1;
                FrameLayout frameLayout2 = ywVar2.J1;
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                prVar2.i(frameLayout2, z10, true);
                return;
        }
    }
}
