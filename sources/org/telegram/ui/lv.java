package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class lv implements org.telegram.ui.Components.xl0 {
    public final int f39032a;
    public final cy f39033b;

    public lv(cy cyVar, int i10) {
        this.f39032a = i10;
        this.f39033b = cyVar;
    }

    @Override
    public final void a(int i10, View view) {
        hg.o0 o0Var;
        switch (this.f39032a) {
            case 0:
                cy cyVar = this.f39033b;
                Object obj = cyVar.C0.f32198v0.G(i10).G;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    qn qnVar = new qn(bundle);
                    cy.b4(qnVar, messageObject);
                    cyVar.presentFragment(qnVar);
                    return;
                } else if (obj instanceof ci.u6) {
                    ci.u6 u6Var = (ci.u6) obj;
                    Bundle i11 = org.telegram.ui.Cells.c1.i(3, "type");
                    i11.putString("hashtag", u6Var.C);
                    i11.putInt("storiesCount", u6Var.J);
                    cyVar.presentFragment(new org.telegram.ui.Components.wa0(i11, null));
                    return;
                } else {
                    return;
                }
            default:
                cy cyVar2 = this.f39033b;
                cyVar2.f36076b0.I0(true);
                ArrayList arrayList = cyVar2.f36076b0.V2;
                if (arrayList.isEmpty()) {
                    o0Var = hg.q0.f12015a3[i10];
                } else {
                    o0Var = (hg.o0) arrayList.get(i10);
                }
                cyVar2.g3(o0Var);
                return;
        }
    }
}
