package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class b1 extends v4.o0 {
    public final h1 f45718a;

    public b1(h1 h1Var) {
        this.f45718a = h1Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        org.telegram.messenger.xi xiVar;
        float[] fArr;
        g1 g1Var = this.f45718a.f48193w;
        int i7 = 0;
        rect.bottom = 0;
        if (view instanceof a2) {
            xiVar = (org.telegram.messenger.xi) g1Var.f47868b.get(((a2) view).O);
        } else if (view instanceof v2) {
            xiVar = (org.telegram.messenger.xi) g1Var.f47868b.get(((v2) view).M);
        } else {
            xiVar = null;
        }
        if (xiVar != null && xiVar.f27892m != null) {
            Point point = org.telegram.messenger.g0.f24121q;
            float max = Math.max(point.x, point.y) * 0.5f;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= xiVar.f27892m.length) {
                    break;
                }
                i11 += (int) Math.ceil(fArr[i10] * max);
                i10++;
            }
            int M = (org.telegram.messenger.g0.M(11.0f) * (xiVar.d - xiVar.f27884c)) + i11;
            int size = g1Var.f47867a.size();
            while (true) {
                if (i7 < size) {
                    org.telegram.messenger.xi xiVar2 = (org.telegram.messenger.xi) g1Var.f47867a.get(i7);
                    byte b10 = xiVar2.f27884c;
                    byte b11 = xiVar.f27884c;
                    if (b10 == b11 && ((xiVar2.f27882a != xiVar.f27882a || xiVar2.f27883b != xiVar.f27883b || b10 != b11 || xiVar2.d != xiVar.d) && b10 == b11)) {
                        M = org.telegram.messenger.f3.B(4.0f, (int) Math.ceil(max * xiVar2.f27886f), M);
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
