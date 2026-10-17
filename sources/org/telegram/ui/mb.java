package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class mb extends vb {
    public final xb V2;

    public mb(xb xbVar, Context context) {
        super(context, null);
        this.V2 = xbVar;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mb.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        xb xbVar = this.V2;
        if (xbVar.v != null && xbVar.f43072x != null && (i14 = xbVar.N0) >= 0) {
            if (xbVar.M0 != 0) {
                int i15 = 0;
                while (true) {
                    tb tbVar = xbVar.E;
                    if (i15 < tbVar.d) {
                        if (i15 >= tbVar.f41641f && i15 < tbVar.h) {
                            ArrayList arrayList = tbVar.f41642n.f43060o0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - tbVar.f41641f)) - 1);
                        } else {
                            messageObject = null;
                        }
                        if (messageObject != null && messageObject.eventId == xbVar.M0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            xbVar.f43072x.i1(i14, xbVar.O0, true);
            xbVar.N0 = -1;
            xbVar.M0 = 0L;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
