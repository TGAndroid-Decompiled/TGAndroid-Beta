package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class na extends s4.v {
    public final sa d;

    public na(sa saVar) {
        this.d = saVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        View view = b1Var.f45920a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        if (b1Var.f45923f == 4 && ((pa) b1Var.f45920a).G) {
            return s4.v.l(3, 0);
        }
        return s4.v.l(0, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        if (b1Var.f45923f == b1Var2.f45923f) {
            View view = b1Var2.f45920a;
            if (!(view instanceof pa) || ((pa) view).G) {
                ja jaVar = this.d.f41416c;
                int b10 = b1Var.b();
                int b11 = b1Var2.b();
                int i10 = b10 - 4;
                int i11 = b11 - 4;
                sa saVar = jaVar.f38223c;
                ArrayList arrayList = saVar.v;
                if (i10 < arrayList.size() && i11 < arrayList.size()) {
                    if (b10 != b11) {
                        saVar.d = true;
                    }
                    arrayList.set(i10, (TLRPC.TL_username) arrayList.get(i11));
                    arrayList.set(i11, (TLRPC.TL_username) arrayList.get(i10));
                    jaVar.p(b10, b11);
                    int size = arrayList.size() + 3;
                    if (b10 == size || b11 == size) {
                        jaVar.n(b10, 3);
                        jaVar.n(b11, 3);
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        Boolean bool;
        sa saVar = this.d;
        if (i10 == 0) {
            sa.Y(saVar);
        } else {
            saVar.f41415b.I0(false);
            b1Var.f45920a.setPressed(true);
        }
        if (b1Var != null) {
            View view = b1Var.f45920a;
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
    public final void q(s4.b1 b1Var) {
    }
}
