package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class re implements View.OnClickListener {
    public final org.telegram.ui.eo f30146a;
    public final Activity f30147b;
    public final ChatActivityEnterView f30148c;

    public re(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.eo eoVar, Activity activity) {
        this.f30148c = chatActivityEnterView;
        this.f30146a = eoVar;
        this.f30147b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.eo eoVar = this.f30146a;
        if (eoVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f30148c;
        chatActivityEnterView.f23658g2 = !chatActivityEnterView.f23658g2;
        if (chatActivityEnterView.f23643e0 == null) {
            chatActivityEnterView.f23643e0 = new gs(this.f30147b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.h6.Wk);
        }
        chatActivityEnterView.f23643e0.a(chatActivityEnterView.f23658g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.f23643e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.f23658g2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.Q2;
        if (eoVar == null) {
            d = 0;
        } else {
            d = eoVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j3, d);
        eoVar.T7();
        UndoView undoView = eoVar.y3;
        if (undoView != null) {
            if (!chatActivityEnterView.f23658g2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.f23658g2) {
            str = "AccDescrChanSilentOn";
            i10 = R.string.AccDescrChanSilentOn;
        } else {
            str = "AccDescrChanSilentOff";
            i10 = R.string.AccDescrChanSilentOff;
        }
        imageView.setContentDescription(LocaleController.getString(str, i10));
        chatActivityEnterView.J1(true);
    }
}
