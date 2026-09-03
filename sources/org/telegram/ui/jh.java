package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jh implements h5.d {
    public final int f38051a;
    public final Object f38052b;
    public final Object f38053c;
    public final Object d;

    public jh(Object obj, Object obj2, Object obj3, int i10) {
        this.f38051a = i10;
        this.f38053c = obj;
        this.d = obj2;
        this.f38052b = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        int i10 = this.f38051a;
        Object obj2 = this.f38052b;
        Object obj3 = this.d;
        Object obj4 = this.f38053c;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                xn.p0((xn) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 1:
                Boolean bool2 = (Boolean) obj;
                py.B0((py) obj4, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj3);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                af.f fVar = (af.f) obj3;
                int[] iArr = (int[]) obj2;
                Long l10 = (Long) obj;
                Pattern pattern = LaunchActivity.f34134y1;
                if (fVar != null) {
                    launchActivity.getClass();
                    fVar.b();
                }
                if (MessagesController.getInstance(launchActivity.L).getUserOrChat(l10.longValue()) == null) {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    if (R != null && (R instanceof xn)) {
                        ((xn) R).qb();
                        return;
                    }
                    return;
                }
                new lh.g2(launchActivity, iArr[0], l10.longValue(), null, null).show();
                return;
            default:
                xb0 xb0Var = (xb0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                b30 b30Var = (b30) obj2;
                Long l11 = (Long) obj;
                if (l11 == null) {
                    user = null;
                } else {
                    user = MessagesController.getInstance(xb0Var.f43001b).getUser(l11);
                }
                userArr[0] = user;
                if (user == null) {
                    xb0Var.a();
                    org.telegram.messenger.y3.s(R.string.NoUsernameFound, xb0.b(), null);
                    return;
                }
                b30Var.run();
                return;
        }
    }

    public jh(py pyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        this.f38051a = 1;
        this.f38053c = pyVar;
        this.f38052b = tL_attachMenuBot;
        this.d = launchActivity;
    }
}
