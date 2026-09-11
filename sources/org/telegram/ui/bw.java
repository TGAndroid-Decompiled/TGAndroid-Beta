package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class bw implements org.telegram.ui.Components.zk0 {
    public final int f34935a;
    public final uy f34936b;

    public bw(uy uyVar, int i10) {
        this.f34935a = i10;
        this.f34936b = uyVar;
    }

    @Override
    public final void a(int i10, View view) {
        hg.q0 q0Var;
        switch (this.f34935a) {
            case 0:
                uy uyVar = this.f34936b;
                Object obj = uyVar.C0.f32969v0.G(i10).G;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    co coVar = new co(bundle);
                    uy.d4(coVar, messageObject);
                    uyVar.presentFragment(coVar);
                    return;
                } else if (obj instanceof bi.d8) {
                    bi.d8 d8Var = (bi.d8) obj;
                    Bundle e7 = org.telegram.ui.Cells.p6.e(3, "type");
                    e7.putString("hashtag", d8Var.C);
                    e7.putInt("storiesCount", d8Var.J);
                    uyVar.presentFragment(new org.telegram.ui.Components.ca0(e7, null));
                    return;
                } else {
                    return;
                }
            default:
                uy uyVar2 = this.f34936b;
                uyVar2.f41242b0.I0(true);
                ArrayList arrayList = uyVar2.f41242b0.X2;
                if (arrayList.isEmpty()) {
                    q0Var = hg.s0.f11237c3[i10];
                } else {
                    q0Var = (hg.q0) arrayList.get(i10);
                }
                uyVar2.j3(q0Var);
                return;
        }
    }
}
