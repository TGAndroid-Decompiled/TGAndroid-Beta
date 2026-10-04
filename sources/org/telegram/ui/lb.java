package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class lb extends ub {
    public final wb f38223e3;

    public lb(wb wbVar, Context context) {
        super(context, null);
        this.f38223e3 = wbVar;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lb.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        wb wbVar = this.f38223e3;
        if (wbVar.v != null && wbVar.f42052x != null && (i14 = wbVar.N0) >= 0) {
            if (wbVar.M0 != 0) {
                int i15 = 0;
                while (true) {
                    sb sbVar = wbVar.E;
                    if (i15 < sbVar.d) {
                        if (i15 >= sbVar.f40446f && i15 < sbVar.h) {
                            ArrayList arrayList = sbVar.f40447n.f42040o0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - sbVar.f40446f)) - 1);
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
            wbVar.f42052x.i1(i14, wbVar.O0, true);
            wbVar.N0 = -1;
            wbVar.M0 = 0L;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
