package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class p81 implements Runnable {
    public final int f42395a;
    public final w91 f42396b;
    public final ArrayList f42397c;

    public p81(w91 w91Var, ArrayList arrayList, int i10) {
        this.f42395a = i10;
        this.f42396b = w91Var;
        this.f42397c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f42395a) {
            case 0:
                w91 w91Var = this.f42396b;
                di.z6 z6Var = w91Var.C0;
                z6Var.getClass();
                ArrayList arrayList = this.f42397c;
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
                w91 w91Var2 = this.f42396b;
                ArrayList arrayList2 = w91Var2.f45044v0;
                ArrayList arrayList3 = w91Var2.f45043u0;
                int i11 = 0;
                w91Var2.f45051z0 = false;
                ArrayList arrayList4 = this.f42397c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(i12);
                        int i13 = w91Var2.f45041s0.get(messageObject.getId(), -1);
                        if (i13 >= 0 && ((t91) arrayList3.get(i13)).b() == messageObject.getId()) {
                            ((t91) arrayList3.get(i13)).f43703b = messageObject;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i11 < size3) {
                            t91 t91Var = (t91) arrayList3.get(i11);
                            if (t91Var.f43703b == null) {
                                w91Var2.f45039r0 = t91Var.b();
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
