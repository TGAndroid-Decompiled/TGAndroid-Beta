package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class d1 extends s4.m0 {
    public final j1 f36460a;

    public d1(j1 j1Var) {
        this.f36460a = j1Var;
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        org.telegram.messenger.cj cjVar;
        float[] fArr;
        i1 i1Var = this.f36460a.f38248w;
        int i10 = 0;
        rect.bottom = 0;
        if (view instanceof b2) {
            cjVar = (org.telegram.messenger.cj) i1Var.f37922b.get(((b2) view).N);
        } else if (view instanceof v2) {
            cjVar = (org.telegram.messenger.cj) i1Var.f37922b.get(((v2) view).L);
        } else {
            cjVar = null;
        }
        if (cjVar != null && cjVar.f15167m != null) {
            Point point = org.telegram.messenger.i0.f16172q;
            float max = Math.max(point.x, point.y) * 0.5f;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= cjVar.f15167m.length) {
                    break;
                }
                i12 += (int) Math.ceil(fArr[i11] * max);
                i11++;
            }
            int M = (org.telegram.messenger.i0.M(11.0f) * (cjVar.d - cjVar.f15160c)) + i12;
            int size = i1Var.f37921a.size();
            while (true) {
                if (i10 < size) {
                    org.telegram.messenger.cj cjVar2 = (org.telegram.messenger.cj) i1Var.f37921a.get(i10);
                    byte b10 = cjVar2.f15160c;
                    byte b11 = cjVar.f15160c;
                    if (b10 == b11 && ((cjVar2.f15158a != cjVar.f15158a || cjVar2.f15159b != cjVar.f15159b || b10 != b11 || cjVar2.d != cjVar.d) && b10 == b11)) {
                        M = org.telegram.messenger.m5.B(4.0f, (int) Math.ceil(max * cjVar2.f15161f), M);
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
