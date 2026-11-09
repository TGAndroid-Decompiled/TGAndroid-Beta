package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public abstract class d9 {
    public static void a(org.telegram.ui.cn cnVar, int i7, TLRPC.Chat chat, TLRPC.User user, TLRPC.TL_forumTopic tL_forumTopic, long j3, int i10, int i11) {
        org.telegram.ui.ActionBar.q4 parentLayout;
        TLRPC.TL_forumTopic tL_forumTopic2;
        if ((chat != null || user != null) && (parentLayout = cnVar.getParentLayout()) != null) {
            if (parentLayout.getPulledDialogs() == null) {
                parentLayout.setPulledDialogs(new ArrayList());
            }
            for (c9 c9Var : parentLayout.getPulledDialogs()) {
                if (tL_forumTopic != null || c9Var.f32594f != j3) {
                    if (tL_forumTopic != null && (tL_forumTopic2 = c9Var.f32593e) != null && tL_forumTopic2.f27008id == tL_forumTopic.f27008id) {
                        return;
                    }
                } else {
                    return;
                }
            }
            ?? obj = new Object();
            obj.f32590a = org.telegram.ui.cn.class;
            obj.f32591b = i7;
            obj.f32594f = j3;
            obj.h = i11;
            obj.f32595g = i10;
            obj.f32592c = chat;
            obj.d = user;
            obj.f32593e = tL_forumTopic;
            parentLayout.getPulledDialogs().add(obj);
        }
    }

    public static org.telegram.ui.ActionBar.g1 b(org.telegram.ui.ActionBar.f2 r37, android.view.View r38, long r39, long r41, org.telegram.ui.ActionBar.g6 r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d9.b(org.telegram.ui.ActionBar.f2, android.view.View, long, long, org.telegram.ui.ActionBar.g6):org.telegram.ui.ActionBar.g1");
    }
}
