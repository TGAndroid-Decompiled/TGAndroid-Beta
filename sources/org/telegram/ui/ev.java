package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class ev extends FragmentContextView {
    public final int Y0;
    public final uw Z0;

    public ev(uw uwVar, Context context, uw uwVar2, int i3) {
        super(context, uwVar2, true);
        this.Y0 = i3;
        switch (i3) {
            case 1:
                this.Z0 = uwVar;
                super(context, uwVar2, false);
                return;
            default:
                this.Z0 = uwVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i3) {
        boolean z10;
        boolean z11;
        switch (this.Y0) {
            case 0:
                uw uwVar = this.Z0;
                org.telegram.ui.Components.pr prVar = uwVar.K1;
                FrameLayout frameLayout = uwVar.H1;
                if (i3 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                prVar.i(frameLayout, z10, true);
                return;
            default:
                uw uwVar2 = this.Z0;
                org.telegram.ui.Components.pr prVar2 = uwVar2.K1;
                FrameLayout frameLayout2 = uwVar2.J1;
                if (i3 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                prVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
