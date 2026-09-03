package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class lh implements h5.d {
    public final int f35764a;
    public final Object f35765b;
    public final Object f35766c;
    public final Object d;

    public lh(Object obj, Object obj2, Object obj3, int i10) {
        this.f35764a = i10;
        this.f35766c = obj;
        this.d = obj2;
        this.f35765b = obj3;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.User user;
        int i10 = this.f35764a;
        Object obj2 = this.f35765b;
        Object obj3 = this.d;
        Object obj4 = this.f35766c;
        switch (i10) {
            case 0:
                Boolean bool = (Boolean) obj;
                zn.p0((zn) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 1:
                Boolean bool2 = (Boolean) obj;
                qy.B0((qy) obj4, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj3);
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                ze.c cVar = (ze.c) obj3;
                int[] iArr = (int[]) obj2;
                Long l10 = (Long) obj;
                Pattern pattern = LaunchActivity.f31586y1;
                if (cVar != null) {
                    launchActivity.getClass();
                    cVar.b();
                }
                if (MessagesController.getInstance(launchActivity.L).getUserOrChat(l10.longValue()) == null) {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    if (R != null && (R instanceof zn)) {
                        ((zn) R).qb();
                        return;
                    }
                    return;
                }
                new kh.g2(launchActivity, iArr[0], l10.longValue(), null, null).show();
                return;
            default:
                yb0 yb0Var = (yb0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                c30 c30Var = (c30) obj2;
                Long l11 = (Long) obj;
                if (l11 == null) {
                    user = null;
                } else {
                    user = MessagesController.getInstance(yb0Var.f40222b).getUser(l11);
                }
                userArr[0] = user;
                if (user == null) {
                    yb0Var.a();
                    org.telegram.messenger.y3.s(R.string.NoUsernameFound, yb0.b(), null);
                    return;
                }
                c30Var.run();
                return;
        }
    }

    public lh(qy qyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        this.f35764a = 1;
        this.f35766c = qyVar;
        this.f35765b = tL_attachMenuBot;
        this.d = launchActivity;
    }
}
