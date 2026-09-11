package org.telegram.ui;

import android.content.Context;
public final class eg0 extends tg.e {
    public final int f36023b0;

    public eg0(Context context, int i10, int i11, int i12) {
        super(context, i10, i11);
        this.f36023b0 = i12;
    }

    @Override
    public void k() {
        switch (this.f36023b0) {
            case 4:
                return;
            default:
                super.k();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f36023b0) {
            case 0:
                super.onAttachedToWindow();
                setPaused(false);
                return;
            case 1:
                super.onAttachedToWindow();
                setPaused(false);
                return;
            case 2:
                super.onAttachedToWindow();
                setPaused(false);
                return;
            case 3:
                super.onAttachedToWindow();
                setPaused(false);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f36023b0) {
            case 0:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
            case 1:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
            case 2:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
            case 3:
                super.onDetachedFromWindow();
                setPaused(true);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    private final void l() {
    }
}
