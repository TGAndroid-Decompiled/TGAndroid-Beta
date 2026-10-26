package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class p81 implements Runnable {
    public final int f42398a;
    public final w91 f42399b;
    public final ArrayList f42400c;

    public p81(w91 w91Var, ArrayList arrayList, int i10) {
        this.f42398a = i10;
        this.f42399b = w91Var;
        this.f42400c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f42398a) {
            case 0:
                w91 w91Var = this.f42399b;
                di.z6 z6Var = w91Var.C0;
                z6Var.getClass();
                ArrayList arrayList = this.f42400c;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (!z6Var.f9494j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!z6Var.q(0, arrayList, z10)) {
                    w91Var.i0();
                    w91Var.n0();
                    return;
                }
                return;
            default:
                w91 w91Var2 = this.f42399b;
                ArrayList arrayList2 = w91Var2.f45047v0;
                ArrayList arrayList3 = w91Var2.f45046u0;
                int i11 = 0;
                w91Var2.f45054z0 = false;
                ArrayList arrayList4 = this.f42400c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(i12);
                        int i13 = w91Var2.f45044s0.get(messageObject.getId(), -1);
                        if (i13 >= 0 && ((t91) arrayList3.get(i13)).b() == messageObject.getId()) {
                            ((t91) arrayList3.get(i13)).f43706b = messageObject;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i11 < size3) {
                            t91 t91Var = (t91) arrayList3.get(i11);
                            if (t91Var.f43706b == null) {
                                w91Var2.f45042r0 = t91Var.b();
                            } else {
                                arrayList2.add(t91Var);
                                i11++;
                            }
                        }
                    }
                    w91Var2.n0();
                    w91Var2.S.setItemAnimator(null);
                    w91Var2.B0.f();
                    return;
                }
                return;
        }
    }
}
