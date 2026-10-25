package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class lv implements org.telegram.ui.Components.zl0 {
    public final int f41377a;
    public final cy f41378b;

    public lv(cy cyVar, int i10) {
        this.f41377a = i10;
        this.f41378b = cyVar;
    }

    @Override
    public final void c(int i10, View view) {
        ig.p0 p0Var;
        switch (this.f41377a) {
            case 0:
                cy cyVar = this.f41378b;
                Object obj = cyVar.C0.f27953x0.G(i10).G;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    un unVar = new un(bundle);
                    cy.l4(unVar, messageObject);
                    cyVar.presentFragment(unVar);
                    return;
                } else if (obj instanceof di.t6) {
                    di.t6 t6Var = (di.t6) obj;
                    Bundle g7 = org.telegram.ui.Components.b10.g(3, "type");
                    g7.putString("hashtag", t6Var.C);
                    g7.putInt("storiesCount", t6Var.J);
                    cyVar.presentFragment(new org.telegram.ui.Components.ta0(g7, null));
                    return;
                } else {
                    return;
                }
            default:
                cy cyVar2 = this.f41378b;
                cyVar2.f38567b0.I0(true);
                ArrayList arrayList = cyVar2.f38567b0.f14220f3;
                if (arrayList.isEmpty()) {
                    p0Var = ig.r0.f14213k3[i10];
                } else {
                    p0Var = (ig.p0) arrayList.get(i10);
                }
                cyVar2.q3(p0Var);
                return;
        }
    }
}
