package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

public final class k81 implements Runnable {

    public final int f39652a;

    public final q91 f39653b;

    public final ArrayList f39654c;

    public k81(q91 q91Var, ArrayList arrayList, int i10) {
        this.f39652a = i10;
        this.f39653b = q91Var;
        this.f39654c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f39652a) {
            case 0:
                q91 q91Var = this.f39653b;
                ArrayList arrayList = q91Var.f41568o0;
                ArrayList arrayList2 = q91Var.f41567n0;
                q91Var.f41574s0 = false;
                ArrayList arrayList3 = this.f39654c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i10);
                        int i11 = q91Var.f41565l0.get(messageObject.getId(), -1);
                        if (i11 >= 0 && ((n91) arrayList2.get(i11)).b() == messageObject.getId()) {
                            ((n91) arrayList2.get(i11)).f40699b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        n91 n91Var = (n91) arrayList2.get(i12);
                        if (n91Var.f40699b == null) {
                            q91Var.f41564k0 = n91Var.b();
                            q91Var.o0();
                            q91Var.O.setItemAnimator(null);
                            q91Var.f41576u0.f();
                        } else {
                            arrayList.add(n91Var);
                        }
                        break;
                    }
                    q91Var.o0();
                    q91Var.O.setItemAnimator(null);
                    q91Var.f41576u0.f();
                    break;
                }
                break;
            default:
                q91 q91Var2 = this.f39653b;
                jh.j6 j6Var = q91Var2.f41577v0;
                j6Var.getClass();
                ArrayList arrayList4 = this.f39654c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!j6Var.f13541j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!j6Var.q(0, arrayList4, z10)) {
                    q91Var2.j0();
                    q91Var2.o0();
                }
                break;
        }
    }
}
