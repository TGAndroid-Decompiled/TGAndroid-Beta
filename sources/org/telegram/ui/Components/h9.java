package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class h9 {
    public static void a(org.telegram.ui.xn xnVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11, int i12) {
        org.telegram.ui.ActionBar.e5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = xnVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (g9 g9Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || g9Var.f25085f != j10) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = g9Var.e) != null && tL_forumTopic2.f19236id == tL_forumTopic.f19236id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f25082a = org.telegram.ui.xn.class;
            obj.f25083b = i10;
            obj.f25085f = j10;
            obj.h = i12;
            obj.f25086g = i11;
            obj.f25084c = chat;
            obj.d = user;
            obj.e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.p1 b(org.telegram.ui.ActionBar.p2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.f6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h9.b(org.telegram.ui.ActionBar.p2, android.view.View, long, long, org.telegram.ui.ActionBar.f6):org.telegram.ui.ActionBar.p1");
    }
}
