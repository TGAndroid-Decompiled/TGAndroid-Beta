package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class l81 implements Runnable {
    public final int f38814a;
    public final r91 f38815b;
    public final ArrayList f38816c;

    public l81(r91 r91Var, ArrayList arrayList, int i10) {
        this.f38814a = i10;
        this.f38815b = r91Var;
        this.f38816c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38814a) {
            case 0:
                r91 r91Var = this.f38815b;
                ArrayList arrayList = r91Var.f40686s0;
                ArrayList arrayList2 = r91Var.f40684r0;
                int i10 = 0;
                r91Var.f40691w0 = false;
                ArrayList arrayList3 = this.f38816c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = r91Var.f40681p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((o91) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((o91) arrayList2.get(i12)).f39716b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            o91 o91Var = (o91) arrayList2.get(i10);
                            if (o91Var.f39716b == null) {
                                r91Var.f40680o0 = o91Var.b();
                            } else {
                                arrayList.add(o91Var);
                                i10++;
                            }
                        }
                    }
                    r91Var.o0();
                    r91Var.S.setItemAnimator(null);
                    r91Var.f40695y0.f();
                    return;
                }
                return;
            default:
                r91 r91Var2 = this.f38815b;
                ci.a7 a7Var = r91Var2.f40696z0;
                a7Var.getClass();
                ArrayList arrayList4 = this.f38816c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!a7Var.f5153j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!a7Var.q(0, arrayList4, z10)) {
                    r91Var2.j0();
                    r91Var2.o0();
                    return;
                }
                return;
        }
    }
}
