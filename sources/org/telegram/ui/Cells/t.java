package org.telegram.ui.Cells;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.aa0;
public final class t extends uk0 implements vs {
    public ArrayList f23062e3;
    public s4.a0 f23063f3;
    public int f23064g3;

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.f14721h5) {
            z1();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        at.e().c(this, at.f14721h5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        at.e().n(this, at.f14721h5);
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
        ArrayList arrayList = this.f23062e3;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(aa0.values()));
        if (wp.r1(this.f23064g3).A3()) {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                if (((aa0) arrayList.get(i10)).e) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
        getAdapter().f();
        a0();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (w7.j6.a((aa0) arrayList.get(i11))) {
                this.f23063f3.h1(i11, org.telegram.messenger.i0.L(16.0f));
                return;
            }
        }
    }
}
