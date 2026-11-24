package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class b0 extends n39 {
    public Context c;
    public ArrayList d;

    @Override
    public final boolean D(s49 s49Var) {
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
    public final void t(s49 s49Var, int i) {
        int c;
        if (s49Var.f == 0) {
            boolean z = true;
            blb blbVar = (blb) ((ArrayList) this.d.get(i - 1)).get(0);
            if (blbVar.e == bkb.De) {
                c = 0;
            } else {
                c = blbVar.c();
            }
            dhb dhbVar = (dhb) s49Var.a;
            dhbVar.a.setText(lve.c(blbVar.e));
            dhbVar.b = c;
            if (c != 0) {
                z = false;
            }
            dhbVar.setWillNotDraw(z);
            dhbVar.invalidate();
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View dhbVar;
        Context context = this.c;
        if (i != 0) {
            dhbVar = new View(context);
            dhbVar.setLayoutParams(new e49(-1, gl.L(56.0f)));
        } else {
            dhbVar = new dhb(context);
            dhbVar.setLayoutParams(new e49(-1, -2));
        }
        return new s49(dhbVar);
    }
}
