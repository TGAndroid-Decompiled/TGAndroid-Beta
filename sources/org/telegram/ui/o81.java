package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class o81 implements Runnable {
    public final int f40096a;
    public final u91 f40097b;
    public final ArrayList f40098c;

    public o81(u91 u91Var, ArrayList arrayList, int i10) {
        this.f40096a = i10;
        this.f40097b = u91Var;
        this.f40098c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f40096a) {
            case 0:
                u91 u91Var = this.f40097b;
                ArrayList arrayList = u91Var.f42334s0;
                ArrayList arrayList2 = u91Var.f42332r0;
                int i10 = 0;
                u91Var.f42339w0 = false;
                ArrayList arrayList3 = this.f40098c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = u91Var.f42329p0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((r91) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((r91) arrayList2.get(i12)).f41065b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            r91 r91Var = (r91) arrayList2.get(i10);
                            if (r91Var.f41065b == null) {
                                u91Var.f42328o0 = r91Var.b();
                            } else {
                                arrayList.add(r91Var);
                                i10++;
                            }
                        }
                    }
                    u91Var.o0();
                    u91Var.S.setItemAnimator(null);
                    u91Var.f42343y0.f();
                    return;
                }
                return;
            default:
                u91 u91Var2 = this.f40097b;
                ci.z6 z6Var = u91Var2.f42344z0;
                z6Var.getClass();
                ArrayList arrayList4 = this.f40098c;
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
                    u91Var2.j0();
                    u91Var2.o0();
                    return;
                }
                return;
        }
    }
}
