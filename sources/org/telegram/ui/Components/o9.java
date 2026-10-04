package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class o9 {
    public static void a(org.telegram.ui.yn ynVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11, int i12) {
        org.telegram.ui.ActionBar.c5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = ynVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (n9 n9Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || n9Var.f28902f != j3) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = n9Var.f28901e) != null && tL_forumTopic2.f20089id == tL_forumTopic.f20089id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f28898a = org.telegram.ui.yn.class;
            obj.f28899b = i10;
            obj.f28902f = j3;
            obj.h = i12;
            obj.f28903g = i11;
            obj.f28900c = chat;
            obj.d = user;
            obj.f28901e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.n1 b(org.telegram.ui.ActionBar.n2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.d6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o9.b(org.telegram.ui.ActionBar.n2, android.view.View, long, long, org.telegram.ui.ActionBar.d6):org.telegram.ui.ActionBar.n1");
    }
}
