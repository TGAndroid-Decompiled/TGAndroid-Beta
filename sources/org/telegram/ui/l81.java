package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class l81 implements Runnable {
    public final int f38769a;
    public final r91 f38770b;
    public final ArrayList f38771c;

    public l81(r91 r91Var, ArrayList arrayList, int i10) {
        this.f38769a = i10;
        this.f38770b = r91Var;
        this.f38771c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38769a) {
            case 0:
                r91 r91Var = this.f38770b;
                ArrayList arrayList = r91Var.f40652s0;
                ArrayList arrayList2 = r91Var.f40650r0;
                int i10 = 0;
                r91Var.f40657w0 = false;
                ArrayList arrayList3 = this.f38771c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = r91Var.f40647p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((o91) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((o91) arrayList2.get(i12)).f39708b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            o91 o91Var = (o91) arrayList2.get(i10);
                            if (o91Var.f39708b == null) {
                                r91Var.f40646o0 = o91Var.b();
                            } else {
                                arrayList.add(o91Var);
                                i10++;
                            }
                        }
                    }
                    r91Var.o0();
                    r91Var.S.setItemAnimator(null);
                    r91Var.f40661y0.f();
                    return;
                }
                return;
            default:
                r91 r91Var2 = this.f38770b;
                ci.z6 z6Var = r91Var2.f40662z0;
                z6Var.getClass();
                ArrayList arrayList4 = this.f38771c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!z6Var.f6185j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!z6Var.q(0, arrayList4, z10)) {
                    r91Var2.j0();
                    r91Var2.o0();
                    return;
                }
                return;
        }
    }
}
