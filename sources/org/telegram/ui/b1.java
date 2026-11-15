package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class b1 extends v4.n0 {
    public final h1 f45557a;

    public b1(h1 h1Var) {
        this.f45557a = h1Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        org.telegram.messenger.yi yiVar;
        float[] fArr;
        g1 g1Var = this.f45557a.f47579w;
        int i7 = 0;
        rect.bottom = 0;
        if (view instanceof a2) {
            yiVar = (org.telegram.messenger.yi) g1Var.f47268b.get(((a2) view).O);
        } else if (view instanceof v2) {
            yiVar = (org.telegram.messenger.yi) g1Var.f47268b.get(((v2) view).M);
        } else {
            yiVar = null;
        }
        if (yiVar != null && yiVar.f27754m != null) {
            Point point = org.telegram.messenger.g0.f23609q;
            float max = Math.max(point.x, point.y) * 0.5f;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= yiVar.f27754m.length) {
                    break;
                }
                i11 += (int) Math.ceil(fArr[i10] * max);
                i10++;
            }
            int M = (org.telegram.messenger.g0.M(11.0f) * (yiVar.d - yiVar.f27746c)) + i11;
            int size = g1Var.f47267a.size();
            while (true) {
                if (i7 < size) {
                    org.telegram.messenger.yi yiVar2 = (org.telegram.messenger.yi) g1Var.f47267a.get(i7);
                    byte b10 = yiVar2.f27746c;
                    byte b11 = yiVar.f27746c;
                    if (b10 == b11 && ((yiVar2.f27744a != yiVar.f27744a || yiVar2.f27745b != yiVar.f27745b || b10 != b11 || yiVar2.d != yiVar.d) && b10 == b11)) {
                        M = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max * yiVar2.f27748f), M);
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
