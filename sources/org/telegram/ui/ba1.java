package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ba1 implements Runnable {
    public final int f34496a;
    public final hb1 f34497b;
    public final ArrayList f34498c;

    public ba1(hb1 hb1Var, ArrayList arrayList, int i10) {
        this.f34496a = i10;
        this.f34497b = hb1Var;
        this.f34498c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f34496a) {
            case 0:
                hb1 hb1Var = this.f34497b;
                ArrayList arrayList = hb1Var.f36710s0;
                ArrayList arrayList2 = hb1Var.f36708r0;
                int i10 = 0;
                hb1Var.f36715w0 = false;
                ArrayList arrayList3 = this.f34498c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = hb1Var.f36705p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((eb1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((eb1) arrayList2.get(i12)).f35508b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            eb1 eb1Var = (eb1) arrayList2.get(i10);
                            if (eb1Var.f35508b == null) {
                                hb1Var.f36704o0 = eb1Var.b();
                            } else {
                                arrayList.add(eb1Var);
                                i10++;
                            }
                        }
                    }
                    hb1Var.o0();
                    hb1Var.S.setItemAnimator(null);
                    hb1Var.f36719y0.f();
                    return;
                }
                return;
            default:
                hb1 hb1Var2 = this.f34497b;
                bi.o8 o8Var = hb1Var2.f36720z0;
                o8Var.getClass();
                ArrayList arrayList4 = this.f34498c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!o8Var.f3430j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!o8Var.q(0, arrayList4, z10)) {
                    hb1Var2.j0();
                    hb1Var2.o0();
                    return;
                }
                return;
        }
    }
}
