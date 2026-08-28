package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class m81 implements Runnable {
    public final int f40351a;
    public final s91 f40352b;
    public final ArrayList f40353c;

    public m81(s91 s91Var, ArrayList arrayList, int i9) {
        this.f40351a = i9;
        this.f40352b = s91Var;
        this.f40353c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f40351a) {
            case 0:
                s91 s91Var = this.f40352b;
                ArrayList arrayList = s91Var.f42625o0;
                ArrayList arrayList2 = s91Var.f42624n0;
                int i9 = 0;
                s91Var.f42631s0 = false;
                ArrayList arrayList3 = this.f40353c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i10);
                        int i11 = s91Var.f42622l0.get(messageObject.getId(), -1);
                        if (i11 >= 0 && ((p91) arrayList2.get(i11)).b() == messageObject.getId()) {
                            ((p91) arrayList2.get(i11)).f41381b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i9 < size2) {
                            p91 p91Var = (p91) arrayList2.get(i9);
                            if (p91Var.f41381b == null) {
                                s91Var.f42621k0 = p91Var.b();
                            } else {
                                arrayList.add(p91Var);
                                i9++;
                            }
                        }
                    }
                    s91Var.n0();
                    s91Var.O.setItemAnimator(null);
                    s91Var.f42633u0.f();
                    return;
                }
                return;
            default:
                s91 s91Var2 = this.f40352b;
                ih.n6 n6Var = s91Var2.f42634v0;
                n6Var.getClass();
                ArrayList arrayList4 = this.f40353c;
                int size3 = arrayList4.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size3) {
                        Object obj = arrayList4.get(i12);
                        i12++;
                        if (!n6Var.f11852j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!n6Var.q(0, arrayList4, z10)) {
                    s91Var2.i0();
                    s91Var2.n0();
                    return;
                }
                return;
        }
    }
}
