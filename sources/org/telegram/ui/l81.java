package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class l81 implements Runnable {
    public final int f38823a;
    public final r91 f38824b;
    public final ArrayList f38825c;

    public l81(r91 r91Var, ArrayList arrayList, int i10) {
        this.f38823a = i10;
        this.f38824b = r91Var;
        this.f38825c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38823a) {
            case 0:
                r91 r91Var = this.f38824b;
                ArrayList arrayList = r91Var.f40661s0;
                ArrayList arrayList2 = r91Var.f40659r0;
                int i10 = 0;
                r91Var.f40666w0 = false;
                ArrayList arrayList3 = this.f38825c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = r91Var.f40656p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((o91) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((o91) arrayList2.get(i12)).f39695b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            o91 o91Var = (o91) arrayList2.get(i10);
                            if (o91Var.f39695b == null) {
                                r91Var.f40655o0 = o91Var.b();
                            } else {
                                arrayList.add(o91Var);
                                i10++;
                            }
                        }
                    }
                    r91Var.o0();
                    r91Var.S.setItemAnimator(null);
                    r91Var.f40670y0.f();
                    return;
                }
                return;
            default:
                r91 r91Var2 = this.f38824b;
                ci.a7 a7Var = r91Var2.f40671z0;
                a7Var.getClass();
                ArrayList arrayList4 = this.f38825c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!a7Var.f5152j.containsKey((Integer) obj)) {
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
