package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ka extends f2.b0 {
    public final pa d;

    public ka(pa paVar) {
        this.d = paVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.m1 m1Var) {
        super.a(recyclerView, m1Var);
        View view = m1Var.f5875a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        if (m1Var.f5879f == 4 && ((ma) m1Var.f5875a).D) {
            return f2.b0.l(3, 0);
        }
        return f2.b0.l(0, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        if (m1Var.f5879f == m1Var2.f5879f) {
            View view = m1Var2.f5875a;
            if (!(view instanceof ma) || ((ma) view).D) {
                ga gaVar = this.d.f39993c;
                int b10 = m1Var.b();
                int b11 = m1Var2.b();
                int i10 = b10 - 4;
                int i11 = b11 - 4;
                pa paVar = gaVar.f37140c;
                ArrayList arrayList = paVar.v;
                if (i10 < arrayList.size() && i11 < arrayList.size()) {
                    if (b10 != b11) {
                        paVar.d = true;
                    }
                    arrayList.set(i10, (TLRPC.TL_username) arrayList.get(i11));
                    arrayList.set(i11, (TLRPC.TL_username) arrayList.get(i10));
                    gaVar.p(b10, b11);
                    int size = arrayList.size() + 3;
                    if (b10 == size || b11 == size) {
                        gaVar.n(b10, 3);
                        gaVar.n(b11, 3);
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(f2.m1 m1Var, int i10) {
        Boolean bool;
        pa paVar = this.d;
        if (i10 == 0) {
            pa.Y(paVar);
        } else {
            paVar.f39992b.I0(false);
            m1Var.f5875a.setPressed(true);
        }
        if (m1Var != null) {
            View view = m1Var.f5875a;
            int i11 = R.id.dragging;
            if (i10 == 2) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
            view.setTag(i11, bool);
        }
    }

    @Override
    public final void q(f2.m1 m1Var) {
    }
}
