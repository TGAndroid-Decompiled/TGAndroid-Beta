package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class kb extends tb {
    public final vb X2;

    public kb(vb vbVar, Context context) {
        super(context, null);
        this.X2 = vbVar;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r12, android.view.View r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kb.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        vb vbVar = this.X2;
        if (vbVar.v != null && vbVar.f38441x != null && (i14 = vbVar.N0) >= 0) {
            if (vbVar.M0 != 0) {
                int i15 = 0;
                while (true) {
                    rb rbVar = vbVar.E;
                    if (i15 < rbVar.d) {
                        if (i15 >= rbVar.f37018f && i15 < rbVar.h) {
                            ArrayList arrayList = rbVar.f37019n.f38429o0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - rbVar.f37018f)) - 1);
                        } else {
                            messageObject = null;
                        }
                        if (messageObject != null && messageObject.eventId == vbVar.M0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            vbVar.f38441x.i1(i14, vbVar.O0, true);
            vbVar.N0 = -1;
            vbVar.M0 = 0L;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
