package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
public final class xd implements View.OnClickListener {
    public final org.telegram.ui.an f41652a;
    public final Activity f41653b;
    public final ChatActivityEnterView f41654c;

    public xd(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.an anVar, Activity activity) {
        this.f41654c = chatActivityEnterView;
        this.f41652a = anVar;
        this.f41653b = activity;
    }

    @Override
    public final void onClick(View view) {
        long b10;
        String str;
        int i7;
        int i10;
        org.telegram.ui.an anVar = this.f41652a;
        if (anVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f41654c;
        chatActivityEnterView.O2 = !chatActivityEnterView.O2;
        if (chatActivityEnterView.f32192f0 == null) {
            chatActivityEnterView.f32192f0 = new br(this.f41653b, 2131231509, org.telegram.ui.ActionBar.j6.Nl);
        }
        chatActivityEnterView.f32192f0.a(chatActivityEnterView.O2, true);
        chatActivityEnterView.f32267q2.setImageDrawable(chatActivityEnterView.f32192f0);
        org.telegram.messenger.np.s1(chatActivityEnterView.R).f25273e7.edit().putBoolean("silent_" + chatActivityEnterView.f32327y3, chatActivityEnterView.O2).commit();
        org.telegram.messenger.at t6 = org.telegram.messenger.at.t(chatActivityEnterView.R);
        long j3 = chatActivityEnterView.f32327y3;
        if (anVar == null) {
            b10 = 0;
        } else {
            b10 = anVar.b();
        }
        t6.c0(j3, b10, true);
        anVar.h8();
        UndoView undoView = anVar.N3;
        if (undoView != null) {
            if (!chatActivityEnterView.O2) {
                i10 = 54;
            } else {
                i10 = 55;
            }
            undoView.j(i10, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.f32267q2;
        if (chatActivityEnterView.O2) {
            str = "AccDescrChanSilentOn";
            i7 = 2131754906;
        } else {
            str = "AccDescrChanSilentOff";
            i7 = 2131754907;
        }
        imageView.setContentDescription(org.telegram.messenger.hd.M0(i7, str));
        chatActivityEnterView.a2(true);
    }
}
