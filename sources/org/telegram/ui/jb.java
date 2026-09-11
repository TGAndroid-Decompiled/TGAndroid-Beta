package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class jb extends sb {
    public final ub X2;

    public jb(ub ubVar, Context context) {
        super(context, null);
        this.X2 = ubVar;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jb.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        ub ubVar = this.X2;
        if (ubVar.E != null && ubVar.G != null && (i14 = ubVar.R0) >= 0) {
            if (ubVar.Q0 != 0) {
                int i15 = 0;
                while (true) {
                    qb qbVar = ubVar.I;
                    if (i15 < qbVar.d) {
                        if (i15 >= qbVar.f39821f && i15 < qbVar.h) {
                            ArrayList arrayList = qbVar.f39822n.f41040s0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - qbVar.f39821f)) - 1);
                        } else {
                            messageObject = null;
                        }
                        if (messageObject != null && messageObject.eventId == ubVar.Q0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            ubVar.G.i1(i14, ubVar.S0, true);
            ubVar.R0 = -1;
            ubVar.Q0 = 0L;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
