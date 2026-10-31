package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class y8 {
    public static void a(org.telegram.ui.un unVar, int i10, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j10, int i11, int i12) {
        org.telegram.ui.ActionBar.z4 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = unVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (x8 x8Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || x8Var.f32426f != j10) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = x8Var.e) != null && tL_forumTopic2.f19845id == tL_forumTopic.f19845id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f32423a = org.telegram.ui.un.class;
            obj.f32424b = i10;
            obj.f32426f = j10;
            obj.h = i12;
            obj.f32427g = i11;
            obj.f32425c = chat;
            obj.d = user;
            obj.e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.k1 b(org.telegram.ui.ActionBar.k2 r38, android.view.View r39, long r40, long r42, org.telegram.ui.ActionBar.p6 r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y8.b(org.telegram.ui.ActionBar.k2, android.view.View, long, long, org.telegram.ui.ActionBar.p6):org.telegram.ui.ActionBar.k1");
    }
}
