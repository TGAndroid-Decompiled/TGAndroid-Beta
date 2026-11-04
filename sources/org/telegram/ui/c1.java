package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class c1 extends u4.n0 {
    public final i1 f44188a;

    public c1(i1 i1Var) {
        this.f44188a = i1Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        org.telegram.messenger.ri riVar;
        float[] fArr;
        h1 h1Var = this.f44188a.f46031w;
        int i3 = 0;
        rect.bottom = 0;
        if (view instanceof b2) {
            riVar = (org.telegram.messenger.ri) h1Var.f45773b.get(((b2) view).O);
        } else if (view instanceof w2) {
            riVar = (org.telegram.messenger.ri) h1Var.f45773b.get(((w2) view).M);
        } else {
            riVar = null;
        }
        if (riVar != null && riVar.f25150m != null) {
            Point point = org.telegram.messenger.g0.f22608q;
            float max = Math.max(point.x, point.y) * 0.5f;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= riVar.f25150m.length) {
                    break;
                }
                i11 += (int) Math.ceil(fArr[i10] * max);
                i10++;
            }
            int M = (org.telegram.messenger.g0.M(11.0f) * (riVar.d - riVar.f25142c)) + i11;
            int size = h1Var.f45772a.size();
            while (true) {
                if (i3 < size) {
                    org.telegram.messenger.ri riVar2 = (org.telegram.messenger.ri) h1Var.f45772a.get(i3);
                    byte b10 = riVar2.f25142c;
                    byte b11 = riVar.f25142c;
                    if (b10 == b11 && ((riVar2.f25140a != riVar.f25140a || riVar2.f25141b != riVar.f25141b || b10 != b11 || riVar2.d != riVar.d) && b10 == b11)) {
                        M = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max * riVar2.f25144f), M);
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
            rect.bottom = -M;
        }
    }
}
