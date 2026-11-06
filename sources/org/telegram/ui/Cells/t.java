package org.telegram.ui.Cells;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.w80;
public final class t extends pj0 implements ls {
    public ArrayList f30287e3;
    public v4.b0 f30288f3;
    public int f30289g3;

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f24996h5) {
            z1();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.e().c(this, qs.f24996h5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.e().n(this, qs.f24996h5);
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
        ArrayList arrayList = this.f30287e3;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(w80.values()));
        if (qp.s1(this.f30289g3).D3()) {
            int i7 = 0;
            while (i7 < arrayList.size()) {
                if (((w80) arrayList.get(i7)).f51018e) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
        getAdapter().f();
        a0();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (c8.sa.a((w80) arrayList.get(i10))) {
                this.f30288f3.h1(i10, org.telegram.messenger.g0.L(16.0f));
                return;
            }
        }
    }
}
