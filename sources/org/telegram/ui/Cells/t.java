package org.telegram.ui.Cells;

import android.view.View;
import c8.ya;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.z80;
public final class t extends ek0 implements gs {
    public ArrayList f31825f3;
    public v4.c0 f31826g3;
    public int f31827h3;

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.f25338k5) {
            z1();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ls.e().c(this, ls.f25338k5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.e().n(this, ls.f25338k5);
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
        ArrayList arrayList = this.f31825f3;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(z80.values()));
        if (np.u1(this.f31827h3).K3()) {
            int i7 = 0;
            while (i7 < arrayList.size()) {
                if (((z80) arrayList.get(i7)).f54497e) {
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
        getAdapter().f();
        a0();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (ya.a((z80) arrayList.get(i10))) {
                this.f31826g3.h1(i10, org.telegram.messenger.g0.L(16.0f));
                return;
            }
        }
    }
}
