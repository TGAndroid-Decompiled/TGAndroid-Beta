package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class es implements View.OnClickListener {
    public final ArrayList f45500a;
    public final boolean f45501b;
    public final is f45502c;

    public es(is isVar, ArrayList arrayList, boolean z9) {
        this.f45502c = isVar;
        this.f45500a = arrayList;
        this.f45501b = z9;
    }

    @Override
    public final void onClick(View view) {
        ms msVar = this.f45502c.f46750a;
        if (msVar.f47980w != null) {
            int intValue = ((Integer) view.getTag()).intValue();
            ArrayList arrayList = this.f45500a;
            if (((Integer) arrayList.get(intValue)).intValue() != 0 && ((Integer) arrayList.get(intValue)).intValue() != 6) {
                if (((Integer) arrayList.get(intValue)).intValue() == 1) {
                    ks ksVar = msVar.f47970l;
                    if (ksVar != null) {
                        ksVar.M(msVar.f47957a0, msVar.f47967i);
                    }
                } else if (((Integer) arrayList.get(intValue)).intValue() == 2) {
                    org.telegram.messenger.ui.b0(msVar.f47976r).d(2, msVar.f47959b0, msVar.W, (int) (System.currentTimeMillis() / 1000), this.f45501b);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 3) {
                    TLRPC.Document document = msVar.W;
                    Object obj = msVar.f47959b0;
                    String str = msVar.Y;
                    ks ksVar2 = msVar.f47970l;
                    if (ksVar2 == null) {
                        return;
                    }
                    org.telegram.ui.Components.v4.I(msVar.f47980w, ksVar2.a(), new a1.d(ksVar2, document, str, obj, 13));
                } else if (((Integer) arrayList.get(intValue)).intValue() == 4) {
                    org.telegram.messenger.ui.b0(msVar.f47976r).d(0, msVar.f47959b0, msVar.W, (int) (System.currentTimeMillis() / 1000), true);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 5) {
                    msVar.f47970l.i(msVar.X);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 7) {
                    msVar.f47970l.o(msVar.W);
                } else if (((Integer) arrayList.get(intValue)).intValue() == 8) {
                    msVar.f47970l.F(msVar.W);
                }
            } else {
                ks ksVar3 = msVar.f47970l;
                if (ksVar3 != null) {
                    TLRPC.Document document2 = msVar.W;
                    String str2 = msVar.Y;
                    boolean z9 = true;
                    Object obj2 = msVar.f47959b0;
                    if (((Integer) arrayList.get(intValue)).intValue() != 0) {
                        z9 = false;
                    }
                    ksVar3.l(document2, str2, obj2, z9, 0, 0);
                }
            }
            msVar.o();
        }
    }
}
