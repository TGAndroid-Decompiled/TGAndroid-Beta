package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class m91 implements Runnable {
    public final int f38548a;
    public final ta1 f38549b;
    public final ArrayList f38550c;

    public m91(ta1 ta1Var, ArrayList arrayList, int i10) {
        this.f38548a = i10;
        this.f38549b = ta1Var;
        this.f38550c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38548a) {
            case 0:
                ta1 ta1Var = this.f38549b;
                ai.d9 d9Var = ta1Var.C0;
                d9Var.getClass();
                ArrayList arrayList = this.f38550c;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (!d9Var.f790j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!d9Var.q(0, arrayList, z10)) {
                    ta1Var.h0();
                    ta1Var.m0();
                    return;
                }
                return;
            default:
                ta1 ta1Var2 = this.f38549b;
                ArrayList arrayList2 = ta1Var2.f40830v0;
                ArrayList arrayList3 = ta1Var2.f40829u0;
                int i11 = 0;
                ta1Var2.f40837z0 = false;
                ArrayList arrayList4 = this.f38550c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(i12);
                        int i13 = ta1Var2.f40827s0.get(messageObject.getId(), -1);
                        if (i13 >= 0 && ((qa1) arrayList3.get(i13)).b() == messageObject.getId()) {
                            ((qa1) arrayList3.get(i13)).f39754b = messageObject;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i11 < size3) {
                            qa1 qa1Var = (qa1) arrayList3.get(i11);
                            if (qa1Var.f39754b == null) {
                                ta1Var2.f40825r0 = qa1Var.b();
                            } else {
                                arrayList2.add(qa1Var);
                                i11++;
                            }
                        }
                    }
                    ta1Var2.m0();
                    ta1Var2.S.setItemAnimator(null);
                    ta1Var2.B0.f();
                    return;
                }
                return;
        }
    }
}
