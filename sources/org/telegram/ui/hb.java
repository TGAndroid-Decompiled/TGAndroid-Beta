package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class hb extends qb {
    public final sb U2;

    public hb(sb sbVar, Context context) {
        super(context, null);
        this.U2 = sbVar;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hb.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        sb sbVar = this.U2;
        if (sbVar.B != null && sbVar.D != null && (i14 = sbVar.O0) >= 0) {
            if (sbVar.N0 != 0) {
                int i15 = 0;
                while (true) {
                    ob obVar = sbVar.F;
                    if (i15 < obVar.d) {
                        if (i15 >= obVar.f39637f && i15 < obVar.h) {
                            ArrayList arrayList = obVar.f39638n.f41108p0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - obVar.f39637f)) - 1);
                        } else {
                            messageObject = null;
                        }
                        if (messageObject != null && messageObject.eventId == sbVar.N0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            sbVar.D.i1(i14, sbVar.P0, true);
            sbVar.O0 = -1;
            sbVar.N0 = 0L;
        }
        super.onLayout(z4, i10, i11, i12, i13);
    }
}
