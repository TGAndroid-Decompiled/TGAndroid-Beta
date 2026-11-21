package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
public final class ge implements View.OnClickListener {
    public final org.telegram.ui.bn f35524a;
    public final Activity f35525b;
    public final ChatActivityEnterView f35526c;

    public ge(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.bn bnVar, Activity activity) {
        this.f35526c = chatActivityEnterView;
        this.f35524a = bnVar;
        this.f35525b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i7;
        int i10;
        org.telegram.ui.bn bnVar = this.f35524a;
        if (bnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f35526c;
        chatActivityEnterView.W2 = !chatActivityEnterView.W2;
        if (chatActivityEnterView.f32611f0 == null) {
            chatActivityEnterView.f32611f0 = new kr(this.f35525b, 2131231510, org.telegram.ui.ActionBar.m6.Nl);
        }
        chatActivityEnterView.f32611f0.a(chatActivityEnterView.W2, true);
        chatActivityEnterView.f32756y2.setImageDrawable(chatActivityEnterView.f32611f0);
        org.telegram.messenger.mp.u1(chatActivityEnterView.R).f25686g7.edit().putBoolean("silent_" + chatActivityEnterView.G3, chatActivityEnterView.W2).commit();
        org.telegram.messenger.xs t6 = org.telegram.messenger.xs.t(chatActivityEnterView.R);
        long j3 = chatActivityEnterView.G3;
        if (bnVar == null) {
            d = 0;
        } else {
            d = bnVar.d();
        }
        t6.c0(j3, d, true);
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
        ImageView imageView = chatActivityEnterView.f32756y2;
        if (chatActivityEnterView.W2) {
            str = "AccDescrChanSilentOn";
            i7 = 2131754906;
        } else {
            str = "AccDescrChanSilentOff";
            i7 = 2131754907;
        }
        imageView.setContentDescription(org.telegram.messenger.gd.N0(i7, str));
        chatActivityEnterView.n2(true);
    }
}
