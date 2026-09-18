package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class bw implements org.telegram.ui.Components.kl0 {
    public final int f32460a;
    public final uy f32461b;

    public bw(uy uyVar, int i10) {
        this.f32460a = i10;
        this.f32461b = uyVar;
    }

    @Override
    public final void d(int i10, View view) {
        gg.q0 q0Var;
        switch (this.f32460a) {
            case 0:
                uy uyVar = this.f32461b;
                Object obj = uyVar.C0.f26226w0.G(i10).G;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    zn znVar = new zn(bundle);
                    uy.d4(znVar, messageObject);
                    uyVar.presentFragment(znVar);
                    return;
                } else if (obj instanceof ai.v8) {
                    ai.v8 v8Var = (ai.v8) obj;
                    Bundle f7 = org.telegram.ui.Cells.c1.f(3, "type");
                    f7.putString("hashtag", v8Var.C);
                    f7.putInt("storiesCount", v8Var.J);
                    uyVar.presentFragment(new org.telegram.ui.Components.ka0(f7, null));
                    return;
                } else {
                    return;
                }
            default:
                uy uyVar2 = this.f32461b;
                uyVar2.f38133b0.J0(true);
                ArrayList arrayList = uyVar2.f38133b0.X2;
                if (arrayList.isEmpty()) {
                    q0Var = gg.s0.f9914c3[i10];
                } else {
                    q0Var = (gg.q0) arrayList.get(i10);
                }
                uyVar2.j3(q0Var);
                return;
        }
    }
}
