package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class n81 implements Runnable {
    public final int f39771a;
    public final t91 f39772b;
    public final ArrayList f39773c;

    public n81(t91 t91Var, ArrayList arrayList, int i10) {
        this.f39771a = i10;
        this.f39772b = t91Var;
        this.f39773c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f39771a) {
            case 0:
                t91 t91Var = this.f39772b;
                ArrayList arrayList = t91Var.f41965s0;
                ArrayList arrayList2 = t91Var.f41963r0;
                int i10 = 0;
                t91Var.f41970w0 = false;
                ArrayList arrayList3 = this.f39773c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = t91Var.f41960p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((q91) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((q91) arrayList2.get(i12)).f40751b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            q91 q91Var = (q91) arrayList2.get(i10);
                            if (q91Var.f40751b == null) {
                                t91Var.f41959o0 = q91Var.b();
                            } else {
                                arrayList.add(q91Var);
                                i10++;
                            }
                        }
                    }
                    t91Var.o0();
                    t91Var.S.setItemAnimator(null);
                    t91Var.f41974y0.f();
                    return;
                }
                return;
            default:
                t91 t91Var2 = this.f39772b;
                ci.z6 z6Var = t91Var2.f41975z0;
                z6Var.getClass();
                ArrayList arrayList4 = this.f39773c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!z6Var.f6194j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!z6Var.q(0, arrayList4, z10)) {
                    t91Var2.j0();
                    t91Var2.o0();
                    return;
                }
                return;
        }
    }
}
