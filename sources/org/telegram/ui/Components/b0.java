package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class b0 extends c79 {
    public Context c;
    public ArrayList d;

    @Override
    public final boolean D(f89 f89Var) {
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
    public final void t(f89 f89Var, int i) {
        int c;
        if (f89Var.f == 0) {
            boolean z = true;
            apb apbVar = (apb) ((ArrayList) this.d.get(i - 1)).get(0);
            if (apbVar.e == aob.Ee) {
                c = 0;
            } else {
                c = apbVar.c();
            }
            zkb zkbVar = (zkb) f89Var.a;
            zkbVar.a.setText(d0f.c(apbVar.e));
            zkbVar.b = c;
            if (c != 0) {
                z = false;
            }
            zkbVar.setWillNotDraw(z);
            zkbVar.invalidate();
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View zkbVar;
        Context context = this.c;
        if (i != 0) {
            zkbVar = new View(context);
            zkbVar.setLayoutParams(new r79(-1, hl.L(56.0f)));
        } else {
            zkbVar = new zkb(context);
            zkbVar.setLayoutParams(new r79(-1, -2));
        }
        return new f89(zkbVar);
    }
}
