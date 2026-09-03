package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class i91 implements Runnable {
    public final int f34879a;
    public final oa1 f34880b;
    public final ArrayList f34881c;

    public i91(oa1 oa1Var, ArrayList arrayList, int i10) {
        this.f34879a = i10;
        this.f34880b = oa1Var;
        this.f34881c = arrayList;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f34879a) {
            case 0:
                oa1 oa1Var = this.f34880b;
                ArrayList arrayList = oa1Var.f36730p0;
                ArrayList arrayList2 = oa1Var.f36729o0;
                int i10 = 0;
                oa1Var.f36736t0 = false;
                ArrayList arrayList3 = this.f34881c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = oa1Var.m0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((la1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((la1) arrayList2.get(i12)).f35727b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            la1 la1Var = (la1) arrayList2.get(i10);
                            if (la1Var.f35727b == null) {
                                oa1Var.f36726l0 = la1Var.b();
                            } else {
                                arrayList.add(la1Var);
                                i10++;
                            }
                        }
                    }
                    oa1Var.o0();
                    oa1Var.P.setItemAnimator(null);
                    oa1Var.f36738v0.f();
                    return;
                }
                return;
            default:
                oa1 oa1Var2 = this.f34880b;
                nh.l6 l6Var = oa1Var2.f36740w0;
                l6Var.getClass();
                ArrayList arrayList4 = this.f34881c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!l6Var.f15561j.containsKey((Integer) obj)) {
                            z4 = true;
                        }
                    } else {
                        z4 = false;
                    }
                }
                if (!l6Var.q(0, arrayList4, z4)) {
                    oa1Var2.j0();
                    oa1Var2.o0();
                    return;
                }
                return;
        }
    }
}
