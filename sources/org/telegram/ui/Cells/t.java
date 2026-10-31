package org.telegram.ui.Cells;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.ba0;
public final class t extends tk0 implements us {
    public ArrayList f23061e3;
    public s4.a0 f23062f3;
    public int f23063g3;

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f19625h5) {
            z1();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.e().c(this, zs.f19625h5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.e().n(this, zs.f19625h5);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a0();
    }

    public final void z1() {
        ArrayList arrayList = this.f23061e3;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(ba0.values()));
        if (vp.r1(this.f23063g3).A3()) {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                if (((ba0) arrayList.get(i10)).e) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
        getAdapter().f();
        a0();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (w7.j6.a((ba0) arrayList.get(i11))) {
                this.f23062f3.h1(i11, org.telegram.messenger.i0.L(16.0f));
                return;
            }
        }
    }
}
