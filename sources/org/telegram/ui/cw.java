package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class cw implements org.telegram.ui.Components.al0 {
    public final int f32928a;
    public final wy f32929b;

    public cw(wy wyVar, int i10) {
        this.f32928a = i10;
        this.f32929b = wyVar;
    }

    @Override
    public final void d(int i10, View view) {
        gg.q0 q0Var;
        switch (this.f32928a) {
            case 0:
                wy wyVar = this.f32929b;
                Object obj = wyVar.C0.f30567w0.G(i10).G;
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
                    wy.d4(boVar, messageObject);
                    wyVar.presentFragment(boVar);
                    return;
                } else if (obj instanceof ai.v8) {
                    ai.v8 v8Var = (ai.v8) obj;
                    Bundle e = org.telegram.ui.Cells.p6.e(3, "type");
                    e.putString("hashtag", v8Var.C);
                    e.putInt("storiesCount", v8Var.J);
                    wyVar.presentFragment(new org.telegram.ui.Components.ba0(e, null));
                    return;
                } else {
                    return;
                }
            default:
                wy wyVar2 = this.f32929b;
                wyVar2.f39199b0.J0(true);
                ArrayList arrayList = wyVar2.f39199b0.X2;
                if (arrayList.isEmpty()) {
                    q0Var = gg.s0.f9915c3[i10];
                } else {
                    q0Var = (gg.q0) arrayList.get(i10);
                }
                wyVar2.j3(q0Var);
                return;
        }
    }
}
