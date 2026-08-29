package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ga extends f2.b0 {
    public final la d;

    public ga(la laVar) {
        this.d = laVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(recyclerView, n1Var);
        View view = n1Var.f6432a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        if (n1Var.f6436f == 4 && ((ia) n1Var.f6432a).C) {
            return f2.b0.l(3, 0);
        }
        return f2.b0.l(0, 0);
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        if (n1Var.f6436f == n1Var2.f6436f) {
            View view = n1Var2.f6432a;
            if (!(view instanceof ia) || ((ia) view).C) {
                ca caVar = this.d.f40141c;
                int b10 = n1Var.b();
                int b11 = n1Var2.b();
                int i10 = b10 - 4;
                int i11 = b11 - 4;
                la laVar = caVar.f37059c;
                ArrayList arrayList = laVar.v;
                if (i10 < arrayList.size() && i11 < arrayList.size()) {
                    if (b10 != b11) {
                        laVar.d = true;
                    }
                    arrayList.set(i10, (TLRPC.TL_username) arrayList.get(i11));
                    arrayList.set(i11, (TLRPC.TL_username) arrayList.get(i10));
                    caVar.p(b10, b11);
                    int size = arrayList.size() + 3;
                    if (b10 == size || b11 == size) {
                        caVar.n(b10, 3);
                        caVar.n(b11, 3);
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void p(f2.n1 n1Var, int i10) {
        Boolean bool;
        la laVar = this.d;
        if (i10 == 0) {
            la.Y(laVar);
        } else {
            laVar.f40140b.I0(false);
            n1Var.f6432a.setPressed(true);
        }
        if (n1Var != null) {
            View view = n1Var.f6432a;
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
    public final void q(f2.n1 n1Var) {
    }
}
