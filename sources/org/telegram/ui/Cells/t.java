package org.telegram.ui.Cells;

import android.view.View;
import c8.wa;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.w80;
public final class t extends uj0 implements is {
    public ArrayList f31442f3;
    public v4.b0 f31443g3;
    public int f31444h3;

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25509h5) {
            z1();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.e().c(this, ns.f25509h5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.e().n(this, ns.f25509h5);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        a0();
    }

    public final void z1() {
        ArrayList arrayList = this.f31442f3;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(w80.values()));
        if (np.s1(this.f31444h3).D3()) {
            int i7 = 0;
            while (i7 < arrayList.size()) {
                if (((w80) arrayList.get(i7)).f52496e) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
        getAdapter().f();
        a0();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (wa.a((w80) arrayList.get(i10))) {
                this.f31443g3.h1(i10, org.telegram.messenger.g0.L(16.0f));
                return;
            }
        }
    }
}
