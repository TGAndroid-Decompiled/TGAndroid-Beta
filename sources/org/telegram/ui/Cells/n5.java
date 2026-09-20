package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.rk;
public final class n5 extends View {
    public int f20698a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(rk.C(2.0f, this.f20698a, 1073741824), rk.C(2.0f, this.f20698a, 1073741824));
    }

    public void setItemSize(int i10) {
        this.f20698a = i10;
    }
}
