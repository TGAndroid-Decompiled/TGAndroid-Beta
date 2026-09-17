package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class lb extends ub {
    public final wb X2;

    public lb(wb wbVar, Context context) {
        super(context, null);
        this.X2 = wbVar;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        wb wbVar = this.X2;
        if (wbVar.v != null && wbVar.f38674x != null && (i14 = wbVar.N0) >= 0) {
            if (wbVar.M0 != 0) {
                int i15 = 0;
                while (true) {
                    sb sbVar = wbVar.E;
                    if (i15 < sbVar.d) {
                        if (i15 >= sbVar.f37446f && i15 < sbVar.h) {
                            ArrayList arrayList = sbVar.f37447n.f38662o0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - sbVar.f37446f)) - 1);
                        } else {
                            messageObject = null;
                        }
                        if (messageObject != null && messageObject.eventId == wbVar.M0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            wbVar.f38674x.i1(i14, wbVar.O0, true);
            wbVar.N0 = -1;
            wbVar.M0 = 0L;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
