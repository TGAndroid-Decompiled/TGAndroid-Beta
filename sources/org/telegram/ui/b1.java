package org.telegram.ui;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class b1 extends v4.n0 {
    public final h1 f45551a;

    public b1(h1 h1Var) {
        this.f45551a = h1Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        org.telegram.messenger.yi yiVar;
        float[] fArr;
        g1 g1Var = this.f45551a.f47569w;
        int i7 = 0;
        rect.bottom = 0;
        if (view instanceof a2) {
            yiVar = (org.telegram.messenger.yi) g1Var.f47258b.get(((a2) view).O);
        } else if (view instanceof v2) {
            yiVar = (org.telegram.messenger.yi) g1Var.f47258b.get(((v2) view).M);
        } else {
            yiVar = null;
        }
        if (yiVar != null && yiVar.f27756m != null) {
            Point point = org.telegram.messenger.g0.f23611q;
            float max = Math.max(point.x, point.y) * 0.5f;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= yiVar.f27756m.length) {
                    break;
                }
                i11 += (int) Math.ceil(fArr[i10] * max);
                i10++;
            }
            int M = (org.telegram.messenger.g0.M(11.0f) * (yiVar.d - yiVar.f27748c)) + i11;
            int size = g1Var.f47257a.size();
            while (true) {
                if (i7 < size) {
                    org.telegram.messenger.yi yiVar2 = (org.telegram.messenger.yi) g1Var.f47257a.get(i7);
                    byte b10 = yiVar2.f27748c;
                    byte b11 = yiVar.f27748c;
                    if (b10 == b11 && ((yiVar2.f27746a != yiVar.f27746a || yiVar2.f27747b != yiVar.f27747b || b10 != b11 || yiVar2.d != yiVar.d) && b10 == b11)) {
                        M = org.telegram.messenger.k5.B(4.0f, (int) Math.ceil(max * yiVar2.f27750f), M);
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
