package org.telegram.ui;

import android.content.Context;
public final class jd extends org.telegram.ui.Components.aj0 {
    public final int f37774r;
    public final Object f37775s;

    public jd(Object obj, Context context, int i10) {
        super(context);
        this.f37774r = i10;
        this.f37775s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f37774r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((md) this.f37775s).f38669f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((l70) this.f37775s).f38237e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((hf0) this.f37775s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f37774r) {
            case 0:
                super.invalidate();
                ((md) this.f37775s).f38669f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.r20) this.f37775s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((l70) this.f37775s).f38237e.invalidate();
                return;
            default:
                super.invalidate();
                ((hf0) this.f37775s).h.invalidate();
                return;
        }
    }
}
