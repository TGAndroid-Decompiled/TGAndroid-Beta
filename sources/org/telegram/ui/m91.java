package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class m91 implements Runnable {
    public final int f35497a;
    public final sa1 f35498b;
    public final ArrayList f35499c;

    public m91(sa1 sa1Var, ArrayList arrayList, int i10) {
        this.f35497a = i10;
        this.f35498b = sa1Var;
        this.f35499c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f35497a) {
            case 0:
                sa1 sa1Var = this.f35498b;
                ArrayList arrayList = sa1Var.f37676s0;
                ArrayList arrayList2 = sa1Var.f37674r0;
                int i10 = 0;
                sa1Var.f37681w0 = false;
                ArrayList arrayList3 = this.f35499c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = sa1Var.f37671p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((pa1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((pa1) arrayList2.get(i12)).f36475b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            pa1 pa1Var = (pa1) arrayList2.get(i10);
                            if (pa1Var.f36475b == null) {
                                sa1Var.f37670o0 = pa1Var.b();
                            } else {
                                arrayList.add(pa1Var);
                                i10++;
                            }
                        }
                    }
                    sa1Var.o0();
                    sa1Var.S.setItemAnimator(null);
                    sa1Var.f37685y0.f();
                    return;
                }
                return;
            default:
                sa1 sa1Var2 = this.f35498b;
                ai.d9 d9Var = sa1Var2.f37686z0;
                d9Var.getClass();
                ArrayList arrayList4 = this.f35499c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!d9Var.f726j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!d9Var.q(0, arrayList4, z10)) {
                    sa1Var2.j0();
                    sa1Var2.o0();
                    return;
                }
                return;
        }
    }
}
