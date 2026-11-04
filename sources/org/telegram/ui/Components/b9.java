package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class b9 {
    public static void a(org.telegram.ui.wm wmVar, int i3, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i10, int i11) {
        org.telegram.ui.ActionBar.q4 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = wmVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (a9 a9Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || a9Var.f31771f != j10) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = a9Var.f31770e) != null && tL_forumTopic2.f27053id == tL_forumTopic.f27053id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f31767a = org.telegram.ui.wm.class;
            obj.f31768b = i3;
            obj.f31771f = j10;
            obj.h = i11;
            obj.f31772g = i10;
            obj.f31769c = chat;
            obj.d = user;
            obj.f31770e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.f1 b(org.telegram.ui.ActionBar.d2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.e6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b9.b(org.telegram.ui.ActionBar.d2, android.view.View, long, long, org.telegram.ui.ActionBar.e6):org.telegram.ui.ActionBar.f1");
    }
}
