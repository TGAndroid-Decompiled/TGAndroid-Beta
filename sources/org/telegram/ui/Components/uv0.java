package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.TLRPC;

public final class uv0 {

    public final i5 f33217a;

    public Drawable f33218b;

    public uv0(FrameLayout frameLayout) {
        this(18, frameLayout);
    }

    public final i5 a(TLRPC.User user, TLRPC.Chat chat, int i10, boolean z10) {
        i5 i5Var = this.f33217a;
        if (chat != null && chat.verified) {
            Drawable dqVar = this.f33218b;
            if (dqVar == null) {
                dqVar = new dq(org.telegram.ui.ActionBar.g6.f23085f1, org.telegram.ui.ActionBar.g6.f23139i1);
            }
            this.f33218b = dqVar;
            i5Var.g(dqVar, z10);
            i5Var.k(null);
            return i5Var;
        }
        if (chat != null && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            i5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            i5Var.k(Integer.valueOf(i10));
            return i5Var;
        }
        if (user != null && user.verified) {
            Drawable dqVar2 = this.f33218b;
            if (dqVar2 == null) {
                dqVar2 = new dq(org.telegram.ui.ActionBar.g6.f23085f1, org.telegram.ui.ActionBar.g6.f23139i1);
            }
            this.f33218b = dqVar2;
            i5Var.g(dqVar2, z10);
            i5Var.k(null);
            return i5Var;
        }
        if (user != null && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            i5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            i5Var.k(Integer.valueOf(i10));
            return i5Var;
        }
        if (user == null || !user.premium) {
            i5Var.g(null, z10);
            i5Var.k(null);
            return i5Var;
        }
        i5Var.g(ag.j2.d().f495e, z10);
        i5Var.k(Integer.valueOf(i10));
        return i5Var;
    }

    public uv0(int i10, View view) {
        this.f33217a = new i5(AndroidUtilities.dp(i10), view);
    }
}
