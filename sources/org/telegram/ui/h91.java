package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class h91 implements Runnable {
    public final int f37305a;
    public final na1 f37306b;
    public final ArrayList f37307c;

    public h91(na1 na1Var, ArrayList arrayList, int i10) {
        this.f37305a = i10;
        this.f37306b = na1Var;
        this.f37307c = arrayList;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f37305a) {
            case 0:
                na1 na1Var = this.f37306b;
                ArrayList arrayList = na1Var.f39268p0;
                ArrayList arrayList2 = na1Var.f39267o0;
                int i10 = 0;
                na1Var.f39274t0 = false;
                ArrayList arrayList3 = this.f37307c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = na1Var.m0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((ka1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((ka1) arrayList2.get(i12)).f38242b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            ka1 ka1Var = (ka1) arrayList2.get(i10);
                            if (ka1Var.f38242b == null) {
                                na1Var.f39264l0 = ka1Var.b();
                            } else {
                                arrayList.add(ka1Var);
                                i10++;
                            }
                        }
                    }
                    na1Var.o0();
                    na1Var.P.setItemAnimator(null);
                    na1Var.f39276v0.f();
                    return;
                }
                return;
            default:
                na1 na1Var2 = this.f37306b;
                oh.l6 l6Var = na1Var2.f39278w0;
                l6Var.getClass();
                ArrayList arrayList4 = this.f37307c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!l6Var.f17405j.containsKey((Integer) obj)) {
                            z4 = true;
                        }
                    } else {
                        z4 = false;
                    }
                }
                if (!l6Var.q(0, arrayList4, z4)) {
                    na1Var2.j0();
                    na1Var2.o0();
                    return;
                }
                return;
        }
    }
}
