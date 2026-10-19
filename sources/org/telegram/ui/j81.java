package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class j81 implements Runnable {
    public final int f38197a;
    public final p91 f38198b;
    public final ArrayList f38199c;

    public j81(p91 p91Var, ArrayList arrayList, int i10) {
        this.f38197a = i10;
        this.f38198b = p91Var;
        this.f38199c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38197a) {
            case 0:
                p91 p91Var = this.f38198b;
                ArrayList arrayList = p91Var.f40145s0;
                ArrayList arrayList2 = p91Var.f40143r0;
                int i10 = 0;
                p91Var.f40150w0 = false;
                ArrayList arrayList3 = this.f38199c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = p91Var.f40140p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((m91) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((m91) arrayList2.get(i12)).f39156b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            m91 m91Var = (m91) arrayList2.get(i10);
                            if (m91Var.f39156b == null) {
                                p91Var.f40139o0 = m91Var.b();
                            } else {
                                arrayList.add(m91Var);
                                i10++;
                            }
                        }
                    }
                    p91Var.o0();
                    p91Var.S.setItemAnimator(null);
                    p91Var.f40154y0.f();
                    return;
                }
                return;
            default:
                p91 p91Var2 = this.f38198b;
                ci.a7 a7Var = p91Var2.f40155z0;
                a7Var.getClass();
                ArrayList arrayList4 = this.f38199c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!a7Var.f5150j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!a7Var.q(0, arrayList4, z10)) {
                    p91Var2.j0();
                    p91Var2.o0();
                    return;
                }
                return;
        }
    }
}
