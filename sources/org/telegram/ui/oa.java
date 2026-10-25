package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class oa extends s4.w {
    public final ta d;

    public oa(ta taVar) {
        this.d = taVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        View view = e1Var.f47735a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        if (e1Var.f47738f == 4 && ((qa) e1Var.f47735a).G) {
            return s4.w.l(3, 0);
        }
        return s4.w.l(0, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        if (e1Var.f47738f == e1Var2.f47738f) {
            View view = e1Var2.f47735a;
            if (!(view instanceof qa) || ((qa) view).G) {
                ka kaVar = this.d.f43706c;
                int b10 = e1Var.b();
                int b11 = e1Var2.b();
                int i10 = b10 - 4;
                int i11 = b11 - 4;
                ta taVar = kaVar.f40865c;
                ArrayList arrayList = taVar.v;
                if (i10 < arrayList.size() && i11 < arrayList.size()) {
                    if (b10 != b11) {
                        taVar.d = true;
                    }
                    arrayList.set(i10, (TLRPC.TL_username) arrayList.get(i11));
                    arrayList.set(i11, (TLRPC.TL_username) arrayList.get(i10));
                    kaVar.p(b10, b11);
                    int size = arrayList.size() + 3;
                    if (b10 == size || b11 == size) {
                        kaVar.n(b10, 3);
                        kaVar.n(b11, 3);
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(s4.e1 e1Var, int i10) {
        Boolean bool;
        ta taVar = this.d;
        if (i10 == 0) {
            ta.Z(taVar);
        } else {
            taVar.f43705b.I0(false);
            e1Var.f47735a.setPressed(true);
        }
        if (e1Var != null) {
            View view = e1Var.f47735a;
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
    public final void q(s4.e1 e1Var) {
    }
}
