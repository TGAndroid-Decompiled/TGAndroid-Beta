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
    public final void a(RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(recyclerView, l1Var);
        View view = l1Var.f5785a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        if (l1Var.f5788f == 4 && ((ma) l1Var.f5785a).D) {
            return f2.b0.l(3, 0);
        }
        return f2.b0.l(0, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        if (l1Var.f5788f == l1Var2.f5788f) {
            View view = l1Var2.f5785a;
            if (!(view instanceof ma) || ((ma) view).D) {
                ga gaVar = this.d.f37253c;
                int b10 = l1Var.b();
                int b11 = l1Var2.b();
                int i10 = b10 - 4;
                int i11 = b11 - 4;
                pa paVar = gaVar.f34523c;
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
    public final void p(f2.l1 l1Var, int i10) {
        Boolean bool;
        pa paVar = this.d;
        if (i10 == 0) {
            pa.Y(paVar);
        } else {
            paVar.f37252b.I0(false);
            l1Var.f5785a.setPressed(true);
        }
        if (l1Var != null) {
            View view = l1Var.f5785a;
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
    public final void q(f2.l1 l1Var) {
    }
}
