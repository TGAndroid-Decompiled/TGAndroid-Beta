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
                if (tL_forumTopic != null || n9Var.f28908f != j3) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = n9Var.f28907e) != null && tL_forumTopic2.f20094id == tL_forumTopic.f20094id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f28904a = org.telegram.ui.yn.class;
            obj.f28905b = i10;
            obj.f28908f = j3;
            obj.h = i12;
            obj.f28909g = i11;
            obj.f28906c = chat;
            obj.d = user;
            obj.f28907e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.n1 b(org.telegram.ui.ActionBar.n2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.d6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o9.b(org.telegram.ui.ActionBar.n2, android.view.View, long, long, org.telegram.ui.ActionBar.d6):org.telegram.ui.ActionBar.n1");
    }
}
