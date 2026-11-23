package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
public final class he implements View.OnClickListener {
    public final org.telegram.ui.bn f35717a;
    public final Activity f35718b;
    public final ChatActivityEnterView f35719c;

    public he(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.bn bnVar, Activity activity) {
        this.f35719c = chatActivityEnterView;
        this.f35717a = bnVar;
        this.f35718b = activity;
    }

    @Override
    public final void onClick(View view) {
        long b10;
        String str;
        int i7;
        int i10;
        org.telegram.ui.bn bnVar = this.f35717a;
        if (bnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f35719c;
        chatActivityEnterView.W2 = !chatActivityEnterView.W2;
        if (chatActivityEnterView.f32678f0 == null) {
            chatActivityEnterView.f32678f0 = new hr(this.f35718b, 2131231513, org.telegram.ui.ActionBar.n6.Nl);
        }
        chatActivityEnterView.f32678f0.a(chatActivityEnterView.W2, true);
        chatActivityEnterView.f32823y2.setImageDrawable(chatActivityEnterView.f32678f0);
        org.telegram.messenger.mp.u1(chatActivityEnterView.R).f25753g7.edit().putBoolean("silent_" + chatActivityEnterView.G3, chatActivityEnterView.W2).commit();
        org.telegram.messenger.xs t6 = org.telegram.messenger.xs.t(chatActivityEnterView.R);
        long j3 = chatActivityEnterView.G3;
        if (bnVar == null) {
            b10 = 0;
        } else {
            b10 = bnVar.b();
        }
        t6.c0(j3, b10, true);
        bnVar.h8();
        UndoView undoView = bnVar.N3;
        if (undoView != null) {
            if (!chatActivityEnterView.W2) {
                i10 = 54;
            } else {
                i10 = 55;
            }
            undoView.j(i10, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.f32823y2;
        if (chatActivityEnterView.W2) {
            str = "AccDescrChanSilentOn";
            i7 = 2131754906;
        } else {
            str = "AccDescrChanSilentOff";
            i7 = 2131754907;
        }
        imageView.setContentDescription(org.telegram.messenger.gd.N0(i7, str));
        chatActivityEnterView.p2(true);
    }
}
