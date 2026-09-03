package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class h9 {
    public static void a(org.telegram.ui.xn xnVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11, int i12) {
        org.telegram.ui.ActionBar.f5 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = xnVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (g9 g9Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || g9Var.f27120f != j10) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = g9Var.f27119e) != null && tL_forumTopic2.f20897id == tL_forumTopic.f20897id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f27116a = org.telegram.ui.xn.class;
            obj.f27117b = i10;
            obj.f27120f = j10;
            obj.h = i12;
            obj.f27121g = i11;
            obj.f27118c = chat;
            obj.d = user;
            obj.f27119e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.p1 b(org.telegram.ui.ActionBar.p2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.g6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h9.b(org.telegram.ui.ActionBar.p2, android.view.View, long, long, org.telegram.ui.ActionBar.g6):org.telegram.ui.ActionBar.p1");
    }
}
