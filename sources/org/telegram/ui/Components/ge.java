package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
public final class ge implements View.OnClickListener {
    public final org.telegram.ui.bn f35505a;
    public final Activity f35506b;
    public final ChatActivityEnterView f35507c;

    public ge(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.bn bnVar, Activity activity) {
        this.f35507c = chatActivityEnterView;
        this.f35505a = bnVar;
        this.f35506b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i7;
        int i10;
        org.telegram.ui.bn bnVar = this.f35505a;
        if (bnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f35507c;
        chatActivityEnterView.W2 = !chatActivityEnterView.W2;
        if (chatActivityEnterView.f32580f0 == null) {
            chatActivityEnterView.f32580f0 = new kr(this.f35506b, 2131231510, org.telegram.ui.ActionBar.m6.Nl);
        }
        chatActivityEnterView.f32580f0.a(chatActivityEnterView.W2, true);
        chatActivityEnterView.f32725y2.setImageDrawable(chatActivityEnterView.f32580f0);
        org.telegram.messenger.np.u1(chatActivityEnterView.R).f25821g7.edit().putBoolean("silent_" + chatActivityEnterView.G3, chatActivityEnterView.W2).commit();
        org.telegram.messenger.ys t6 = org.telegram.messenger.ys.t(chatActivityEnterView.R);
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
        ImageView imageView = chatActivityEnterView.f32725y2;
        if (chatActivityEnterView.W2) {
            str = "AccDescrChanSilentOn";
            i7 = 2131754906;
        } else {
            str = "AccDescrChanSilentOff";
            i7 = 2131754907;
        }
        imageView.setContentDescription(org.telegram.messenger.hd.N0(i7, str));
        chatActivityEnterView.n2(true);
    }
}
