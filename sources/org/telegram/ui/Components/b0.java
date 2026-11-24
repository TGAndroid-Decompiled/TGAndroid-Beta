package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class b0 extends q59 {
    public Context c;
    public ArrayList d;

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int c;
        if (u69Var.f == 0) {
            boolean z = true;
            cnb cnbVar = (cnb) ((ArrayList) this.d.get(i - 1)).get(0);
            if (cnbVar.e == cmb.De) {
                c = 0;
            } else {
                c = cnbVar.c();
            }
            ejb ejbVar = (ejb) u69Var.a;
            ejbVar.a.setText(nxe.c(cnbVar.e));
            ejbVar.b = c;
            if (c != 0) {
                z = false;
            }
            ejbVar.setWillNotDraw(z);
            ejbVar.invalidate();
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View ejbVar;
        Context context = this.c;
        if (i != 0) {
            ejbVar = new View(context);
            ejbVar.setLayoutParams(new g69(-1, gm.L(56.0f)));
        } else {
            ejbVar = new ejb(context);
            ejbVar.setLayoutParams(new g69(-1, -2));
        }
        return new u69(ejbVar);
    }
}
