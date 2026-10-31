package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class d1 extends s4.m0 {
    public final j1 f36587a;

    public d1(j1 j1Var) {
        this.f36587a = j1Var;
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        org.telegram.messenger.bj bjVar;
        float[] fArr;
        i1 i1Var = this.f36587a.f38411w;
        int i10 = 0;
        rect.bottom = 0;
        if (view instanceof b2) {
            bjVar = (org.telegram.messenger.bj) i1Var.f38080b.get(((b2) view).N);
        } else if (view instanceof v2) {
            bjVar = (org.telegram.messenger.bj) i1Var.f38080b.get(((v2) view).L);
        } else {
            bjVar = null;
        }
        if (bjVar != null && bjVar.f14784m != null) {
            Point point = org.telegram.messenger.i0.f16026q;
            float max = Math.max(point.x, point.y) * 0.5f;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= bjVar.f14784m.length) {
                    break;
                }
                i12 += (int) Math.ceil(fArr[i11] * max);
                i11++;
            }
            int M = (org.telegram.messenger.i0.M(11.0f) * (bjVar.d - bjVar.f14777c)) + i12;
            int size = i1Var.f38079a.size();
            while (true) {
                if (i10 < size) {
                    org.telegram.messenger.bj bjVar2 = (org.telegram.messenger.bj) i1Var.f38079a.get(i10);
                    byte b10 = bjVar2.f14777c;
                    byte b11 = bjVar.f14777c;
                    if (b10 == b11 && ((bjVar2.f14775a != bjVar.f14775a || bjVar2.f14776b != bjVar.f14776b || b10 != b11 || bjVar2.d != bjVar.d) && b10 == b11)) {
                        M = org.telegram.messenger.m5.B(4.0f, (int) Math.ceil(max * bjVar2.f14778f), M);
                        break;
                    }
                    i10++;
                } else {
                    break;
                }
            }
            rect.bottom = -M;
        }
    }
}
