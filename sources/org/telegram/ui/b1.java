package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class b1 extends v4.o0 {
    public final h1 f45747a;

    public b1(h1 h1Var) {
        this.f45747a = h1Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        org.telegram.messenger.yi yiVar;
        float[] fArr;
        g1 g1Var = this.f45747a.f48202w;
        int i7 = 0;
        rect.bottom = 0;
        if (view instanceof a2) {
            yiVar = (org.telegram.messenger.yi) g1Var.f47904b.get(((a2) view).O);
        } else if (view instanceof v2) {
            yiVar = (org.telegram.messenger.yi) g1Var.f47904b.get(((v2) view).M);
        } else {
            yiVar = null;
        }
        if (yiVar != null && yiVar.f28102m != null) {
            Point point = org.telegram.messenger.g0.f24046q;
            float max = Math.max(point.x, point.y) * 0.5f;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= yiVar.f28102m.length) {
                    break;
                }
                i11 += (int) Math.ceil(fArr[i10] * max);
                i10++;
            }
            int M = (org.telegram.messenger.g0.M(11.0f) * (yiVar.d - yiVar.f28094c)) + i11;
            int size = g1Var.f47903a.size();
            while (true) {
                if (i7 < size) {
                    org.telegram.messenger.yi yiVar2 = (org.telegram.messenger.yi) g1Var.f47903a.get(i7);
                    byte b10 = yiVar2.f28094c;
                    byte b11 = yiVar.f28094c;
                    if (b10 == b11 && ((yiVar2.f28092a != yiVar.f28092a || yiVar2.f28093b != yiVar.f28093b || b10 != b11 || yiVar2.d != yiVar.d) && b10 == b11)) {
                        M = org.telegram.messenger.f3.B(4.0f, (int) Math.ceil(max * yiVar2.f28096f), M);
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
