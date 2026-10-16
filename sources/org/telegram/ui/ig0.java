package org.telegram.ui;

import android.content.Context;
public final class ig0 extends tg.n {
    public final int f36804f0;

    public ig0(Context context, int i10, int i11, int i12) {
        super(context, i10, i11);
        this.f36804f0 = i12;
    }

    @Override
    public void n() {
        switch (this.f36804f0) {
            case 4:
                return;
            default:
                super.n();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f36804f0) {
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
        switch (this.f36804f0) {
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

    private final void p() {
    }
}
