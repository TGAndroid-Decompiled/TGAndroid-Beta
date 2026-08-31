package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class b91 implements Runnable {
    public final int f35392a;
    public final ha1 f35393b;
    public final ArrayList f35394c;

    public b91(ha1 ha1Var, ArrayList arrayList, int i10) {
        this.f35392a = i10;
        this.f35393b = ha1Var;
        this.f35394c = arrayList;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f35392a) {
            case 0:
                ha1 ha1Var = this.f35393b;
                ArrayList arrayList = ha1Var.f37436p0;
                ArrayList arrayList2 = ha1Var.f37435o0;
                int i10 = 0;
                ha1Var.f37442t0 = false;
                ArrayList arrayList3 = this.f35394c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = ha1Var.m0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((ea1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((ea1) arrayList2.get(i12)).f36456b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            ea1 ea1Var = (ea1) arrayList2.get(i10);
                            if (ea1Var.f36456b == null) {
                                ha1Var.f37432l0 = ea1Var.b();
                            } else {
                                arrayList.add(ea1Var);
                                i10++;
                            }
                        }
                    }
                    ha1Var.o0();
                    ha1Var.P.setItemAnimator(null);
                    ha1Var.f37444v0.f();
                    return;
                }
                return;
            default:
                ha1 ha1Var2 = this.f35393b;
                oh.l6 l6Var = ha1Var2.f37446w0;
                l6Var.getClass();
                ArrayList arrayList4 = this.f35394c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!l6Var.f17403j.containsKey((Integer) obj)) {
                            z4 = true;
                        }
                    } else {
                        z4 = false;
                    }
                }
                if (!l6Var.q(0, arrayList4, z4)) {
                    ha1Var2.j0();
                    ha1Var2.o0();
                    return;
                }
                return;
        }
    }
}
