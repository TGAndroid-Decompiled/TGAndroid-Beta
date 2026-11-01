package org.telegram.ui.ActionBar;

import android.app.Dialog;
import android.view.View;
import android.view.WindowInsets;
public final class o2 implements View.OnApplyWindowInsetsListener {
    public final int f20621a;
    public final Dialog f20622b;

    public o2(Dialog dialog, int i10) {
        this.f20621a = i10;
        this.f20622b = dialog;
    }

    @Override
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f20621a) {
            case 0:
                return z2.A((z2) this.f20622b, windowInsets);
            default:
                return xh.m2.h((xh.m2) this.f20622b, view, windowInsets);
        }
    }
}
