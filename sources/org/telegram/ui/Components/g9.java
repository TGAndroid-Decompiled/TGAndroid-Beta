package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class g9 {
    public static void a(org.telegram.ui.qn qnVar, int i9, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i10, int i11) {
        org.telegram.ui.ActionBar.b5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = qnVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (f9 f9Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || f9Var.f28349f != j10) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = f9Var.f28348e) != null && tL_forumTopic2.f22432id == tL_forumTopic.f22432id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f28345a = org.telegram.ui.qn.class;
            obj.f28346b = i9;
            obj.f28349f = j10;
            obj.h = i11;
            obj.f28350g = i10;
            obj.f28347c = chat;
            obj.d = user;
            obj.f28348e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.o1 b(org.telegram.ui.ActionBar.o2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.b6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.g9.b(org.telegram.ui.ActionBar.o2, android.view.View, long, long, org.telegram.ui.ActionBar.b6):org.telegram.ui.ActionBar.o1");
    }
}
