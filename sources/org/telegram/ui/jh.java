package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jh implements h5.d {
    public final int f35347a;
    public final Object f35348b;
    public final Object f35349c;
    public final Object d;

    public jh(Object obj, Object obj2, Object obj3, int i10) {
        this.f35347a = i10;
        this.f35349c = obj;
        this.d = obj2;
        this.f35348b = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        int i10 = this.f35347a;
        Object obj2 = this.f35348b;
        Object obj3 = this.d;
        Object obj4 = this.f35349c;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                xn.p0((xn) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 1:
                Boolean bool2 = (Boolean) obj;
                oy.B0((oy) obj4, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj3);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                af.f fVar = (af.f) obj3;
                int[] iArr = (int[]) obj2;
                Long l10 = (Long) obj;
                Pattern pattern = LaunchActivity.f31612y1;
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
                new kh.h2(launchActivity, iArr[0], l10.longValue(), null, null).show();
                return;
            default:
                wb0 wb0Var = (wb0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                a30 a30Var = (a30) obj2;
                Long l11 = (Long) obj;
                if (l11 == null) {
                    user = null;
                } else {
                    user = MessagesController.getInstance(wb0Var.f39390b).getUser(l11);
                }
                userArr[0] = user;
                if (user == null) {
                    wb0Var.a();
                    org.telegram.messenger.y3.s(R.string.NoUsernameFound, wb0.b(), null);
                    return;
                }
                a30Var.run();
                return;
        }
    }

    public jh(oy oyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        this.f35347a = 1;
        this.f35349c = oyVar;
        this.f35348b = tL_attachMenuBot;
        this.d = launchActivity;
    }
}
