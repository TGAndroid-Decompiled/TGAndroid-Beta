package org.telegram.ui.Cells;

import android.view.View;
import b8.uf;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.t80;
public final class t extends tj0 implements cs {
    public ArrayList f30366f3;
    public u4.b0 f30367g3;
    public int f30368h3;

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23242h5) {
            z1();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.e().c(this, hs.f23242h5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.e().n(this, hs.f23242h5);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        a0();
    }

    public final void z1() {
        ArrayList arrayList = this.f30366f3;
        arrayList.clear();
        arrayList.addAll(Arrays.asList(t80.values()));
        if (hp.s1(this.f30368h3).D3()) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                if (((t80) arrayList.get(i3)).f49737e) {
                    arrayList.remove(i3);
                    i3--;
                }
                i3++;
            }
        }
        getAdapter().f();
        a0();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (uf.a((t80) arrayList.get(i10))) {
                this.f30367g3.h1(i10, org.telegram.messenger.g0.L(16.0f));
                return;
            }
        }
    }
}
