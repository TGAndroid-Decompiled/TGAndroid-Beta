package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ma extends s4.w {
    public final ra d;

    public ma(ra raVar) {
        this.d = raVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        View view = d1Var.f47702a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        if (d1Var.f47706f == 4 && ((oa) d1Var.f47702a).G) {
            return s4.w.l(3, 0);
        }
        return s4.w.l(0, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        if (d1Var.f47706f == d1Var2.f47706f) {
            View view = d1Var2.f47702a;
            if (!(view instanceof oa) || ((oa) view).G) {
                ia iaVar = this.d.f41364c;
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                int i10 = b10 - 4;
                int i11 = b11 - 4;
                ra raVar = iaVar.f38637c;
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
    public final void p(s4.d1 d1Var, int i10) {
        Boolean bool;
        ra raVar = this.d;
        if (i10 == 0) {
            ra.Y(raVar);
        } else {
            raVar.f41363b.I0(false);
            d1Var.f47702a.setPressed(true);
        }
        if (d1Var != null) {
            View view = d1Var.f47702a;
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
    public final void q(s4.d1 d1Var) {
    }
}
