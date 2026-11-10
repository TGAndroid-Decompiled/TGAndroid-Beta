package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.Components.FragmentContextView;
public final class kv extends FragmentContextView {
    public final int X0;
    public final zw Y0;

    public kv(zw zwVar, Context context, zw zwVar2, int i7) {
        super(context, zwVar2, true);
        this.X0 = i7;
        switch (i7) {
            case 1:
                this.Y0 = zwVar;
                super(context, zwVar2, false);
                return;
            default:
                this.Y0 = zwVar;
                return;
        }
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z9;
        boolean z10;
        switch (this.X0) {
            case 0:
                zw zwVar = this.Y0;
                org.telegram.ui.Components.or orVar = zwVar.K1;
                FrameLayout frameLayout = zwVar.H1;
                if (i7 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                orVar.i(frameLayout, z9, true);
                return;
            default:
                zw zwVar2 = this.Y0;
                org.telegram.ui.Components.or orVar2 = zwVar2.K1;
                FrameLayout frameLayout2 = zwVar2.J1;
                if (i7 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                orVar2.i(frameLayout2, z10, true);
                return;
        }
    }
}
