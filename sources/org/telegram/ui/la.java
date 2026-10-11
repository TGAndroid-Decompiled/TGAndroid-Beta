package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class la extends s4.w {
    public final qa d;

    public la(qa qaVar) {
        this.d = qaVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        View view = d1Var.f47748a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        if (d1Var.f47752f == 4 && ((na) d1Var.f47748a).G) {
            return s4.w.l(3, 0);
        }
        return s4.w.l(0, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        if (d1Var.f47752f == d1Var2.f47752f) {
            View view = d1Var2.f47748a;
            if (!(view instanceof na) || ((na) view).G) {
                ha haVar = this.d.f41080c;
                int b10 = d1Var.b();
                int b11 = d1Var2.b();
                int i10 = b10 - 4;
                int i11 = b11 - 4;
                qa qaVar = haVar.f38362c;
                ArrayList arrayList = qaVar.v;
                if (i10 < arrayList.size() && i11 < arrayList.size()) {
                    if (b10 != b11) {
                        qaVar.d = true;
                    }
                    arrayList.set(i10, (TLRPC.TL_username) arrayList.get(i11));
                    arrayList.set(i11, (TLRPC.TL_username) arrayList.get(i10));
                    haVar.p(b10, b11);
                    int size = arrayList.size() + 3;
                    if (b10 == size || b11 == size) {
                        haVar.n(b10, 3);
                        haVar.n(b11, 3);
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
        qa qaVar = this.d;
        if (i10 == 0) {
            qa.Y(qaVar);
        } else {
            qaVar.f41079b.I0(false);
            d1Var.f47748a.setPressed(true);
        }
        if (d1Var != null) {
            View view = d1Var.f47748a;
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
