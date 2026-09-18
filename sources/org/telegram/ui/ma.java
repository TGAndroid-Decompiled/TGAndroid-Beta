package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ma extends s4.v {
    public final ra d;

    public ma(ra raVar) {
        this.d = raVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        View view = c1Var.f42929a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        if (c1Var.f42932f == 4 && ((oa) c1Var.f42929a).G) {
            return s4.v.l(3, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        if (c1Var.f42932f == c1Var2.f42932f) {
            View view = c1Var2.f42929a;
            if (!(view instanceof oa) || ((oa) view).G) {
                ia iaVar = this.d.f37003c;
                int b10 = c1Var.b();
                int b11 = c1Var2.b();
                int i10 = b10 - 4;
                int i11 = b11 - 4;
                ra raVar = iaVar.f34477c;
                ArrayList arrayList = raVar.v;
                if (i10 < arrayList.size() && i11 < arrayList.size()) {
                    if (b10 != b11) {
                        raVar.d = true;
                    }
                    arrayList.set(i10, (TLRPC.TL_username) arrayList.get(i11));
                    arrayList.set(i11, (TLRPC.TL_username) arrayList.get(i10));
                    iaVar.p(b10, b11);
                    int size = arrayList.size() + 3;
                    if (b10 == size || b11 == size) {
                        iaVar.n(b10, 3);
                        iaVar.n(b11, 3);
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        Boolean bool;
        ra raVar = this.d;
        if (i10 == 0) {
            ra.Y(raVar);
        } else {
            raVar.f37002b.J0(false);
            c1Var.f42929a.setPressed(true);
        }
        if (c1Var != null) {
            View view = c1Var.f42929a;
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
    public final void q(s4.c1 c1Var) {
    }
}
