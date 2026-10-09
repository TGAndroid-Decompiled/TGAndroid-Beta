package org.telegram.ui;

import android.content.Context;
public final class jd extends org.telegram.ui.Components.fk0 {
    public final int f38912r;
    public final Object f38913s;

    public jd(Object obj, Context context, int i10) {
        super(context);
        this.f38912r = i10;
        this.f38913s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f38912r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((md) this.f38913s).f39845f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((j70) this.f38913s).f38846e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((gf0) this.f38913s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f38912r) {
            case 0:
                super.invalidate();
                ((md) this.f38913s).f39845f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.i30) this.f38913s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((j70) this.f38913s).f38846e.invalidate();
                return;
            default:
                super.invalidate();
                ((gf0) this.f38913s).h.invalidate();
                return;
        }
    }
}
