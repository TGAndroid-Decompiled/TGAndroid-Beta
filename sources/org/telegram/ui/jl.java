package org.telegram.ui;

import android.view.View;
public final class jl extends org.telegram.ui.Components.q6 {
    public final int f49018b;
    public final il f49019c;

    public jl(il ilVar, int i7) {
        super("p2", 0);
        this.f49018b = i7;
        switch (i7) {
            case 1:
                this.f49019c = ilVar;
                super("progress", 0);
                return;
            case 2:
                this.f49019c = ilVar;
                super("alpha", 0);
                return;
            default:
                this.f49019c = ilVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f49018b) {
            case 0:
                ((org.telegram.messenger.cj) obj).f23288e = f10;
                View view = this.f49019c.f48757c.R.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ((org.telegram.messenger.cj) obj).f23290g = f10;
                View view2 = this.f49019c.f48757c.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.messenger.cj) obj).f23289f = f10;
                View view3 = this.f49019c.f48757c.R.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f49018b) {
            case 0:
                return Float.valueOf(((org.telegram.messenger.cj) obj).f23288e);
            case 1:
                return Float.valueOf(((org.telegram.messenger.cj) obj).f23290g);
            default:
                return Float.valueOf(((org.telegram.messenger.cj) obj).f23289f);
        }
    }
}
