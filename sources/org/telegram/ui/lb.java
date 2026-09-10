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
        if (wbVar.E != null && wbVar.G != null && (i14 = wbVar.R0) >= 0) {
            if (wbVar.Q0 != 0) {
                int i15 = 0;
                while (true) {
                    sb sbVar = wbVar.I;
                    if (i15 < sbVar.d) {
                        if (i15 >= sbVar.f36637f && i15 < sbVar.h) {
                            ArrayList arrayList = sbVar.f36638n.f37813s0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - sbVar.f36637f)) - 1);
                        } else {
                            messageObject = null;
                        }
                        if (messageObject != null && messageObject.eventId == wbVar.Q0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            wbVar.G.i1(i14, wbVar.S0, true);
            wbVar.R0 = -1;
            wbVar.Q0 = 0L;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
