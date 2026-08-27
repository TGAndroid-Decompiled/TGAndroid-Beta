package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class gh implements d5.d {

    public final int f38413a;

    public final Object f38414b;

    public final Object f38415c;
    public final Object d;

    public gh(Object obj, Object obj2, Object obj3, int i10) {
        this.f38413a = i10;
        this.f38415c = obj;
        this.d = obj2;
        this.f38414b = obj3;
    }

    @Override
    public final void accept(Object obj) {
        int i10 = this.f38413a;
        Object obj2 = this.f38414b;
        Object obj3 = this.d;
        Object obj4 = this.f38415c;
        switch (i10) {
            case 0:
                rn.p0((rn) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
                break;
            case 1:
                gy.B0((gy) obj4, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj3);
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                we.d dVar = (we.d) obj3;
                int[] iArr = (int[]) obj2;
                Long l10 = (Long) obj;
                Pattern pattern = LaunchActivity.f35496x1;
                if (dVar != null) {
                    launchActivity.getClass();
                    dVar.b();
                }
                if (MessagesController.getInstance(launchActivity.K).getUserOrChat(l10.longValue()) != null) {
                    new gh.k2(launchActivity, iArr[0], l10.longValue(), null, null).show();
                    break;
                } else {
                    org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                    if (n2VarR != null && (n2VarR instanceof rn)) {
                        ((rn) n2VarR).qb();
                        break;
                    }
                }
                break;
            default:
                ob0 ob0Var = (ob0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                org.telegram.ui.Components.l11 l11Var = (org.telegram.ui.Components.l11) obj2;
                Long l11 = (Long) obj;
                TLRPC.User user = l11 == null ? null : MessagesController.getInstance(ob0Var.f41051b).getUser(l11);
                userArr[0] = user;
                if (user != null) {
                    l11Var.run();
                } else {
                    ob0Var.a();
                    org.telegram.messenger.y1.r(R.string.NoUsernameFound, ob0.b(), null);
                }
                break;
        }
    }

    public gh(gy gyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        this.f38413a = 1;
        this.f38415c = gyVar;
        this.f38414b = tL_attachMenuBot;
        this.d = launchActivity;
    }
}
