package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nu implements View.OnLongClickListener {
    public final int f48126a;
    public final uw f48127b;

    public nu(uw uwVar, int i3) {
        this.f48126a = i3;
        this.f48127b = uwVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z10;
        boolean z11;
        int i3;
        int i10;
        int i11 = this.f48126a;
        uw uwVar = this.f48127b;
        switch (i11) {
            case 0:
                ArrayList arrayList = uwVar.J2;
                if (uwVar.getParentActivity() == null) {
                    return false;
                }
                boolean z12 = !arrayList.isEmpty();
                boolean z13 = true;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    long longValue = ((Long) arrayList.get(i12)).longValue();
                    if (z12 && longValue != uwVar.getUserConfig().e()) {
                        z12 = false;
                    }
                    if (org.telegram.messenger.m5.C(longValue)) {
                        z13 = false;
                    }
                    TLRPC.Chat M0 = uwVar.getMessagesController().M0(Long.valueOf(-longValue));
                    if (M0 != null && !org.telegram.messenger.t3.B(M0)) {
                        z13 = false;
                    }
                }
                if (uwVar.m4() && uwVar.x3()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ArrayList arrayList2 = uwVar.E2;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            if (((org.telegram.messenger.ye) obj).b()) {
                                z10 = false;
                            }
                        }
                    }
                }
                ArrayList arrayList3 = uwVar.E2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.f60 H = org.telegram.ui.Components.f60.H(uwVar, view);
                if (z11) {
                    i3 = 2131745645;
                } else {
                    i3 = 2131745646;
                }
                H.l(2131232359, org.telegram.messenger.bd.M0(i3, null), new au(uwVar, 5), z10);
                H.c(2131231508, org.telegram.messenger.bd.M0(2131745593, null), new au(uwVar, 6), false);
                if (z12) {
                    i10 = 2131745524;
                } else {
                    i10 = 2131745869;
                }
                H.l(2131232077, org.telegram.messenger.bd.M0(i10, null), new org.telegram.ui.Components.up0(6, uwVar, z12), z13);
                H.Z();
                return true;
            case 1:
                uw uwVar2 = this.f48127b;
                uwVar2.D4(uwVar2.J2, 104, true, true, null);
                return true;
            case 2:
                uwVar.B4(view);
                return true;
            default:
                uwVar.getContactsController().B();
                uwVar.W4();
                return true;
        }
    }
}
