package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class ia extends f2.c0 {
    public final na d;

    public ia(na naVar) {
        this.d = naVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        View view = o1Var.f5789a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        return (o1Var.f5793f == 4 && ((ka) o1Var.f5789a).C) ? f2.c0.l(3, 0) : f2.c0.l(0, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        if (o1Var.f5793f != o1Var2.f5793f) {
            return false;
        }
        View view = o1Var2.f5789a;
        if ((view instanceof ka) && !((ka) view).C) {
            return false;
        }
        ea eaVar = this.d.f40702c;
        int iB = o1Var.b();
        int iB2 = o1Var2.b();
        int i10 = iB - 4;
        int i11 = iB2 - 4;
        na naVar = eaVar.f37689c;
        ArrayList arrayList = naVar.v;
        if (i10 < arrayList.size() && i11 < arrayList.size()) {
            if (iB != iB2) {
                naVar.d = true;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
            arrayList.set(i10, (TLRPC.TL_username) arrayList.get(i11));
            arrayList.set(i11, tL_username);
            eaVar.p(iB, iB2);
            int size = arrayList.size() + 3;
            if (iB == size || iB2 == size) {
                eaVar.n(iB, 3);
                eaVar.n(iB2, 3);
            }
        }
        return true;
    }

    @Override
    public final void p(f2.o1 o1Var, int i10) {
        na naVar = this.d;
        if (i10 == 0) {
            na.Y(naVar);
        } else {
            naVar.f40701b.I0(false);
            o1Var.f5789a.setPressed(true);
        }
        if (o1Var != null) {
            o1Var.f5789a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override
    public final void q(f2.o1 o1Var) {
    }
}
