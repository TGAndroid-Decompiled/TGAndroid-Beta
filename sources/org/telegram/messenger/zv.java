package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zv implements Runnable {
    public final int f28006a;
    public final bw f28007b;
    public final ArrayList f28008c;

    public zv(bw bwVar, ArrayList arrayList, int i7) {
        this.f28006a = i7;
        this.f28007b = bwVar;
        this.f28008c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f28006a) {
            case 0:
                bw bwVar = this.f28007b;
                bwVar.getClass();
                int i7 = 0;
                while (true) {
                    ArrayList arrayList = this.f28008c;
                    if (i7 < arrayList.size()) {
                        gj gjVar = new gj(bwVar.currentAccount, (TLRPC.Message) arrayList.get(i7), false, true);
                        gjVar.C0 = true;
                        bwVar.getSendMessagesHelper().k0(0L, gjVar, true);
                        i7++;
                    } else {
                        return;
                    }
                }
            default:
                bw bwVar2 = this.f28007b;
                bwVar2.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f28008c;
                    if (i10 < arrayList2.size()) {
                        gj gjVar2 = (gj) bwVar2.getMessagesController().T.f(((Long) arrayList2.get(i10)).longValue());
                        if (gjVar2 != null) {
                            gjVar2.Z = true;
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
        }
    }
}
