package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class n91 implements Runnable {
    public final int f35901a;
    public final ra1 f35902b;
    public final ArrayList f35903c;

    public n91(ra1 ra1Var, ArrayList arrayList, int i10) {
        this.f35901a = i10;
        this.f35902b = ra1Var;
        this.f35903c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f35901a) {
            case 0:
                ra1 ra1Var = this.f35902b;
                ArrayList arrayList = ra1Var.f37078s0;
                ArrayList arrayList2 = ra1Var.f37076r0;
                int i10 = 0;
                ra1Var.f37083w0 = false;
                ArrayList arrayList3 = this.f35903c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = ra1Var.f37073p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((oa1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((oa1) arrayList2.get(i12)).f36173b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            oa1 oa1Var = (oa1) arrayList2.get(i10);
                            if (oa1Var.f36173b == null) {
                                ra1Var.f37072o0 = oa1Var.b();
                            } else {
                                arrayList.add(oa1Var);
                                i10++;
                            }
                        }
                    }
                    ra1Var.m0();
                    ra1Var.S.setItemAnimator(null);
                    ra1Var.f37087y0.f();
                    return;
                }
                return;
            default:
                ra1 ra1Var2 = this.f35902b;
                ai.d9 d9Var = ra1Var2.f37088z0;
                d9Var.getClass();
                ArrayList arrayList4 = this.f35903c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!d9Var.f729j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!d9Var.q(0, arrayList4, z10)) {
                    ra1Var2.h0();
                    ra1Var2.m0();
                    return;
                }
                return;
        }
    }
}
