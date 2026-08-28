package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ha extends f2.d0 {
    public final ma d;

    public ha(ma maVar) {
        this.d = maVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        View view = q1Var.f5501a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        if (q1Var.f5505f == 4 && ((ja) q1Var.f5501a).C) {
            return f2.d0.l(3, 0);
        }
        return f2.d0.l(0, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        if (q1Var.f5505f == q1Var2.f5505f) {
            View view = q1Var2.f5501a;
            if (!(view instanceof ja) || ((ja) view).C) {
                da daVar = this.d.f40363c;
                int b10 = q1Var.b();
                int b11 = q1Var2.b();
                int i9 = b10 - 4;
                int i10 = b11 - 4;
                ma maVar = daVar.f37485c;
                ArrayList arrayList = maVar.v;
                if (i9 < arrayList.size() && i10 < arrayList.size()) {
                    if (b10 != b11) {
                        maVar.d = true;
                    }
                    arrayList.set(i9, (TLRPC.TL_username) arrayList.get(i10));
                    arrayList.set(i10, (TLRPC.TL_username) arrayList.get(i9));
                    daVar.p(b10, b11);
                    int size = arrayList.size() + 3;
                    if (b10 == size || b11 == size) {
                        daVar.n(b10, 3);
                        daVar.n(b11, 3);
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(f2.q1 q1Var, int i9) {
        Boolean bool;
        ma maVar = this.d;
        if (i9 == 0) {
            ma.X(maVar);
        } else {
            maVar.f40362b.I0(false);
            q1Var.f5501a.setPressed(true);
        }
        if (q1Var != null) {
            View view = q1Var.f5501a;
            int i10 = R.id.dragging;
            if (i9 == 2) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
            view.setTag(i10, bool);
        }
    }

    @Override
    public final void q(f2.q1 q1Var) {
    }
}
