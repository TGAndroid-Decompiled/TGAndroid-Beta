package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class aw implements org.telegram.ui.Components.zk0 {
    public final int f31965a;
    public final uy f31966b;

    public aw(uy uyVar, int i10) {
        this.f31965a = i10;
        this.f31966b = uyVar;
    }

    @Override
    public final void d(int i10, View view) {
        gg.q0 q0Var;
        switch (this.f31965a) {
            case 0:
                uy uyVar = this.f31966b;
                Object obj = uyVar.C0.f30306v0.G(i10).G;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    bo boVar = new bo(bundle);
                    uy.d4(boVar, messageObject);
                    uyVar.presentFragment(boVar);
                    return;
                } else if (obj instanceof ai.v8) {
                    ai.v8 v8Var = (ai.v8) obj;
                    Bundle e = org.telegram.ui.Cells.p6.e(3, "type");
                    e.putString("hashtag", v8Var.C);
                    e.putInt("storiesCount", v8Var.J);
                    uyVar.presentFragment(new org.telegram.ui.Components.ba0(e, null));
                    return;
                } else {
                    return;
                }
            default:
                uy uyVar2 = this.f31966b;
                uyVar2.f38191b0.I0(true);
                ArrayList arrayList = uyVar2.f38191b0.X2;
                if (arrayList.isEmpty()) {
                    q0Var = gg.s0.f9910c3[i10];
                } else {
                    q0Var = (gg.q0) arrayList.get(i10);
                }
                uyVar2.j3(q0Var);
                return;
        }
    }
}
