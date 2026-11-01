package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.ui.SecretMediaViewer;
public final class yj implements Runnable {
    public final int f19590a;
    public final wp f19591b;
    public final a0.h f19592c;
    public final a0.h d;

    public yj(wp wpVar, a0.h hVar, a0.h hVar2, int i10) {
        this.f19590a = i10;
        this.f19591b = wpVar;
        this.f19592c = hVar;
        this.d = hVar2;
    }

    @Override
    public final void run() {
        boolean z10;
        kj kjVar;
        char c10;
        ArrayList arrayList;
        boolean z11;
        char c11 = 0;
        switch (this.f19590a) {
            case 0:
                wp wpVar = this.f19591b;
                a0.h hVar = this.f19592c;
                a0.h hVar2 = this.d;
                if (hVar != null) {
                    int i10 = 0;
                    for (int m10 = hVar.m(); i10 < m10; m10 = m10) {
                        ArrayList arrayList2 = (ArrayList) hVar.n(i10);
                        long j10 = hVar.j(i10);
                        if (!arrayList2.isEmpty() && ((Integer) arrayList2.get(0)).intValue() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        wpVar.a0(arrayList2, null, null, j10, true, 0, z11, 0L, null, 0);
                        i10++;
                        hVar2 = hVar2;
                    }
                }
                a0.h hVar3 = hVar2;
                if (hVar3 != null) {
                    if (SecretMediaViewer.g() && SecretMediaViewer.f().f34023s) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        kjVar = SecretMediaViewer.f().f33997f0;
                    } else {
                        kjVar = null;
                    }
                    int m11 = hVar3.m();
                    int i11 = 0;
                    while (i11 < m11) {
                        long j11 = hVar3.j(i11);
                        ArrayList arrayList3 = (ArrayList) hVar3.n(i11);
                        if (z10 && kjVar != null && kjVar.I1 == wpVar.currentAccount && kj.B0(kjVar.f16690k) == j11 && arrayList3.contains(Integer.valueOf(kjVar.f1()))) {
                            int f12 = kjVar.f1();
                            arrayList3.remove(Integer.valueOf(f12));
                            kjVar.G0 = true;
                            long V = wpVar.V(f12, j11);
                            c10 = c11;
                            arrayList = arrayList3;
                            wp wpVar2 = wpVar;
                            wpVar = wpVar2;
                            SecretMediaViewer.f().f34013n1 = new gk(f12, V, j11, wpVar2);
                            at notificationCenter = wpVar.getNotificationCenter();
                            Object[] objArr = new Object[1];
                            objArr[c10] = kjVar.f16690k;
                            notificationCenter.k(48, objArr);
                        } else {
                            c10 = c11;
                            arrayList = arrayList3;
                        }
                        if (!arrayList.isEmpty()) {
                            is messagesStorage = wpVar.getMessagesStorage();
                            messagesStorage.f16331a.c(new ur(messagesStorage, arrayList, j11, 1));
                        }
                        i11++;
                        c11 = c10;
                    }
                }
                Utilities.d.c(new yj(wpVar, hVar, hVar3, 3));
                return;
            case 1:
                wp wpVar3 = this.f19591b;
                a0.h hVar4 = this.f19592c;
                a0.h hVar5 = this.d;
                wpVar3.W = hVar4;
                wpVar3.X = hVar5;
                return;
            case 2:
                wp wpVar4 = this.f19591b;
                a0.h hVar6 = this.f19592c;
                a0.h hVar7 = this.d;
                wpVar4.T1 = true;
                is messagesStorage2 = wpVar4.getMessagesStorage();
                messagesStorage2.f16331a.c(new lg(messagesStorage2, hVar6, hVar7, 17));
                return;
            default:
                wp wpVar5 = this.f19591b;
                Utilities.d.c(new yj(wpVar5, this.f19592c, this.d, 2));
                wpVar5.U1 = 0;
                wpVar5.V1 = null;
                wpVar5.W1 = null;
                return;
        }
    }
}
