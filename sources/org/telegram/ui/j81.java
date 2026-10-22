package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class j81 implements Runnable {
    public final int f38207a;
    public final p91 f38208b;
    public final ArrayList f38209c;

    public j81(p91 p91Var, ArrayList arrayList, int i10) {
        this.f38207a = i10;
        this.f38208b = p91Var;
        this.f38209c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f38207a) {
            case 0:
                p91 p91Var = this.f38208b;
                ArrayList arrayList = p91Var.f40154s0;
                ArrayList arrayList2 = p91Var.f40152r0;
                int i10 = 0;
                p91Var.f40159w0 = false;
                ArrayList arrayList3 = this.f38209c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = p91Var.f40149p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((m91) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((m91) arrayList2.get(i12)).f39166b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            m91 m91Var = (m91) arrayList2.get(i10);
                            if (m91Var.f39166b == null) {
                                p91Var.f40148o0 = m91Var.b();
                            } else {
                                arrayList.add(m91Var);
                                i10++;
                            }
                        }
                    }
                    p91Var.o0();
                    p91Var.S.setItemAnimator(null);
                    p91Var.f40163y0.f();
                    return;
                }
                return;
            default:
                p91 p91Var2 = this.f38208b;
                ci.a7 a7Var = p91Var2.f40164z0;
                a7Var.getClass();
                ArrayList arrayList4 = this.f38209c;
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
