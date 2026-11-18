package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class b1 extends v4.o0 {
    public final h1 f45708a;

    public b1(h1 h1Var) {
        this.f45708a = h1Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        org.telegram.messenger.xi xiVar;
        float[] fArr;
        g1 g1Var = this.f45708a.f48121w;
        int i7 = 0;
        rect.bottom = 0;
        if (view instanceof a2) {
            xiVar = (org.telegram.messenger.xi) g1Var.f47832b.get(((a2) view).O);
        } else if (view instanceof v2) {
            xiVar = (org.telegram.messenger.xi) g1Var.f47832b.get(((v2) view).M);
        } else {
            xiVar = null;
        }
        if (xiVar != null && xiVar.f27890m != null) {
            Point point = org.telegram.messenger.g0.f24118q;
            float max = Math.max(point.x, point.y) * 0.5f;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= xiVar.f27890m.length) {
                    break;
                }
                i11 += (int) Math.ceil(fArr[i10] * max);
                i10++;
            }
            int M = (org.telegram.messenger.g0.M(11.0f) * (xiVar.d - xiVar.f27882c)) + i11;
            int size = g1Var.f47831a.size();
            while (true) {
                if (i7 < size) {
                    org.telegram.messenger.xi xiVar2 = (org.telegram.messenger.xi) g1Var.f47831a.get(i7);
                    byte b10 = xiVar2.f27882c;
                    byte b11 = xiVar.f27882c;
                    if (b10 == b11 && ((xiVar2.f27880a != xiVar.f27880a || xiVar2.f27881b != xiVar.f27881b || b10 != b11 || xiVar2.d != xiVar.d) && b10 == b11)) {
                        M = org.telegram.messenger.f3.B(4.0f, (int) Math.ceil(max * xiVar2.f27884f), M);
                        break;
                    }
                    i7++;
                } else {
                    break;
                }
            }
            rect.bottom = -M;
        }
    }
}
