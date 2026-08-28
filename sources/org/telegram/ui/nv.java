package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class nv implements org.telegram.ui.Components.mk0 {
    public final int f40836a;
    public final dy f40837b;

    public nv(dy dyVar, int i9) {
        this.f40836a = i9;
        this.f40837b = dyVar;
    }

    @Override
    public final void a(int i9, View view) {
        of.m0 m0Var;
        switch (this.f40836a) {
            case 0:
                dy dyVar = this.f40837b;
                Object obj = dyVar.f37750y0.f29151r0.G(i9).G;
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
                    dy.d4(qnVar, messageObject);
                    dyVar.presentFragment(qnVar);
                    return;
                } else if (obj instanceof ih.h6) {
                    ih.h6 h6Var = (ih.h6) obj;
                    Bundle h = aa.d.h(3, "type");
                    h.putString("hashtag", h6Var.C);
                    h.putInt("storiesCount", h6Var.J);
                    dyVar.presentFragment(new org.telegram.ui.Components.k90(h, null));
                    return;
                } else {
                    return;
                }
            default:
                dy dyVar2 = this.f40837b;
                dyVar2.X.I0(true);
                ArrayList arrayList = dyVar2.X.T2;
                if (arrayList.isEmpty()) {
                    m0Var = of.o0.Y2[i9];
                } else {
                    m0Var = (of.m0) arrayList.get(i9);
                }
                dyVar2.j3(m0Var);
                return;
        }
    }
}
