package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class iv extends FragmentContextView {
    public final int Y0;
    public final yw Z0;

    public iv(yw ywVar, Context context, yw ywVar2, int i7) {
        super(context, ywVar2, true);
        this.Y0 = i7;
        switch (i7) {
            case 1:
                this.Z0 = ywVar;
                super(context, ywVar2, false);
                return;
            default:
                this.Z0 = ywVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        boolean z11;
        switch (this.Y0) {
            case 0:
                yw ywVar = this.Z0;
                org.telegram.ui.Components.vr vrVar = ywVar.L1;
                FrameLayout frameLayout = ywVar.I1;
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vrVar.i(frameLayout, z10, true);
                return;
            default:
                yw ywVar2 = this.Z0;
                org.telegram.ui.Components.vr vrVar2 = ywVar2.L1;
                FrameLayout frameLayout2 = ywVar2.K1;
                if (i7 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                vrVar2.i(frameLayout2, z11, true);
                return;
        }
    }
}
