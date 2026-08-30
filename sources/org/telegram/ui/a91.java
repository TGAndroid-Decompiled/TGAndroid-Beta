package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class a91 implements Runnable {
    public final int f32494a;
    public final ga1 f32495b;
    public final ArrayList f32496c;

    public a91(ga1 ga1Var, ArrayList arrayList, int i10) {
        this.f32494a = i10;
        this.f32495b = ga1Var;
        this.f32496c = arrayList;
    }

    @Override
    public final void run() {
        boolean z4;
        switch (this.f32494a) {
            case 0:
                ga1 ga1Var = this.f32495b;
                ArrayList arrayList = ga1Var.f34546p0;
                ArrayList arrayList2 = ga1Var.f34545o0;
                int i10 = 0;
                ga1Var.f34552t0 = false;
                ArrayList arrayList3 = this.f32496c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = ga1Var.m0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((da1) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((da1) arrayList2.get(i12)).f33569b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            da1 da1Var = (da1) arrayList2.get(i10);
                            if (da1Var.f33569b == null) {
                                ga1Var.f34542l0 = da1Var.b();
                            } else {
                                arrayList.add(da1Var);
                                i10++;
                            }
                        }
                    }
                    ga1Var.o0();
                    ga1Var.P.setItemAnimator(null);
                    ga1Var.f34554v0.f();
                    return;
                }
                return;
            default:
                ga1 ga1Var2 = this.f32495b;
                nh.l6 l6Var = ga1Var2.f34556w0;
                l6Var.getClass();
                ArrayList arrayList4 = this.f32496c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!l6Var.f15581j.containsKey((Integer) obj)) {
                            z4 = true;
                        }
                    } else {
                        z4 = false;
                    }
                }
                if (!l6Var.q(0, arrayList4, z4)) {
                    ga1Var2.j0();
                    ga1Var2.o0();
                    return;
                }
                return;
        }
    }
}
