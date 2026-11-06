package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class b1 extends v4.m0 {
    public final h1 f44133a;

    public b1(h1 h1Var) {
        this.f44133a = h1Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        org.telegram.messenger.aj ajVar;
        float[] fArr;
        g1 g1Var = this.f44133a.f46169w;
        int i7 = 0;
        rect.bottom = 0;
        if (view instanceof a2) {
            ajVar = (org.telegram.messenger.aj) g1Var.f45749b.get(((a2) view).N);
        } else if (view instanceof v2) {
            ajVar = (org.telegram.messenger.aj) g1Var.f45749b.get(((v2) view).L);
        } else {
            ajVar = null;
        }
        if (ajVar != null && ajVar.f21452m != null) {
            Point point = org.telegram.messenger.g0.f22537q;
            float max = Math.max(point.x, point.y) * 0.5f;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= ajVar.f21452m.length) {
                    break;
                }
                i11 += (int) Math.ceil(fArr[i10] * max);
                i10++;
            }
            int M = (org.telegram.messenger.g0.M(11.0f) * (ajVar.d - ajVar.f21444c)) + i11;
            int size = g1Var.f45748a.size();
            while (true) {
                if (i7 < size) {
                    org.telegram.messenger.aj ajVar2 = (org.telegram.messenger.aj) g1Var.f45748a.get(i7);
                    byte b10 = ajVar2.f21444c;
                    byte b11 = ajVar.f21444c;
                    if (b10 == b11 && ((ajVar2.f21442a != ajVar.f21442a || ajVar2.f21443b != ajVar.f21443b || b10 != b11 || ajVar2.d != ajVar.d) && b10 == b11)) {
                        M = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max * ajVar2.f21446f), M);
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
