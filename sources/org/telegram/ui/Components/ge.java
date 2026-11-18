package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
public final class ge implements View.OnClickListener {
    public final org.telegram.ui.bn f35478a;
    public final Activity f35479b;
    public final ChatActivityEnterView f35480c;

    public ge(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.bn bnVar, Activity activity) {
        this.f35480c = chatActivityEnterView;
        this.f35478a = bnVar;
        this.f35479b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i7;
        int i10;
        org.telegram.ui.bn bnVar = this.f35478a;
        if (bnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f35480c;
        chatActivityEnterView.U2 = !chatActivityEnterView.U2;
        if (chatActivityEnterView.f32583f0 == null) {
            chatActivityEnterView.f32583f0 = new ir(this.f35479b, 2131231510, org.telegram.ui.ActionBar.n6.Nl);
        }
        chatActivityEnterView.f32583f0.a(chatActivityEnterView.U2, true);
        chatActivityEnterView.f32707w2.setImageDrawable(chatActivityEnterView.f32583f0);
        org.telegram.messenger.mp.u1(chatActivityEnterView.R).f25658g7.edit().putBoolean("silent_" + chatActivityEnterView.E3, chatActivityEnterView.U2).commit();
        org.telegram.messenger.xs t6 = org.telegram.messenger.xs.t(chatActivityEnterView.R);
        long j3 = chatActivityEnterView.E3;
        if (bnVar == null) {
            d = 0;
        } else {
            d = bnVar.d();
        }
        t6.c0(j3, d, true);
        bnVar.h8();
        UndoView undoView = bnVar.N3;
        if (undoView != null) {
            if (!chatActivityEnterView.U2) {
                i10 = 54;
            } else {
                i10 = 55;
            }
            undoView.j(i10, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.f32707w2;
        if (chatActivityEnterView.U2) {
            str = "AccDescrChanSilentOn";
            i7 = 2131754906;
        } else {
            str = "AccDescrChanSilentOff";
            i7 = 2131754907;
        }
        imageView.setContentDescription(org.telegram.messenger.gd.M0(i7, str));
        chatActivityEnterView.j2(true);
    }
}
