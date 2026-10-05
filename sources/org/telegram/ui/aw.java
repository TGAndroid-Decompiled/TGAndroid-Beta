package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class aw implements org.telegram.ui.Components.ml0 {
    public final int f34984a;
    public final uy f34985b;

    public aw(uy uyVar, int i10) {
        this.f34984a = i10;
        this.f34985b = uyVar;
    }

    @Override
    public final void d(int i10, View view) {
        gg.q0 q0Var;
        switch (this.f34984a) {
            case 0:
                uy uyVar = this.f34985b;
                Object obj = uyVar.C0.f30166x0.G(i10).G;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    yn ynVar = new yn(bundle);
                    uy.m4(ynVar, messageObject);
                    uyVar.presentFragment(ynVar);
                    return;
                } else if (obj instanceof ai.v8) {
                    ai.v8 v8Var = (ai.v8) obj;
                    Bundle h = org.telegram.ui.Cells.c1.h(3, "type");
                    h.putString("hashtag", v8Var.C);
                    h.putInt("storiesCount", v8Var.J);
                    uyVar.presentFragment(new org.telegram.ui.Components.pa0(h, null));
                    return;
                } else {
                    return;
                }
            default:
                uy uyVar2 = this.f34985b;
                uyVar2.f41418b0.J0(true);
                ArrayList arrayList = uyVar2.f41418b0.f10783e3;
                if (arrayList.isEmpty()) {
                    q0Var = gg.s0.j3[i10];
                } else {
                    q0Var = (gg.q0) arrayList.get(i10);
                }
                uyVar2.t3(q0Var);
                return;
        }
    }
}
