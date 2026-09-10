package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class o9 {
    public static void a(org.telegram.ui.eo eoVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i11, int i12) {
        org.telegram.ui.ActionBar.f5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = eoVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (n9 n9Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || n9Var.f25457f != j3) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = n9Var.e) != null && tL_forumTopic2.f17247id == tL_forumTopic.f17247id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f25454a = org.telegram.ui.eo.class;
            obj.f25455b = i10;
            obj.f25457f = j3;
            obj.h = i12;
            obj.f25458g = i11;
            obj.f25456c = chat;
            obj.d = user;
            obj.e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.p1 b(org.telegram.ui.ActionBar.p2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.f6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o9.b(org.telegram.ui.ActionBar.p2, android.view.View, long, long, org.telegram.ui.ActionBar.f6):org.telegram.ui.ActionBar.p1");
    }
}
