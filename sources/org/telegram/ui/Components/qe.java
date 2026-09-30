package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class qe implements View.OnClickListener {
    public final org.telegram.ui.wn f27645a;
    public final Activity f27646b;
    public final ChatActivityEnterView f27647c;

    public qe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.wn wnVar, Activity activity) {
        this.f27647c = chatActivityEnterView;
        this.f27645a = wnVar;
        this.f27646b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.wn wnVar = this.f27645a;
        if (wnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f27647c;
        chatActivityEnterView.f22016g2 = !chatActivityEnterView.f22016g2;
        if (chatActivityEnterView.f22001e0 == null) {
            chatActivityEnterView.f22001e0 = new qr(this.f27646b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.h6.Wk);
        }
        chatActivityEnterView.f22001e0.a(chatActivityEnterView.f22016g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.f22001e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.f22016g2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.Q2;
        if (wnVar == null) {
            d = 0;
        } else {
            d = wnVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j3, d);
        wnVar.Q7();
        UndoView undoView = wnVar.y3;
        if (undoView != null) {
            if (!chatActivityEnterView.f22016g2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.f22016g2) {
            str = "AccDescrChanSilentOn";
            i10 = R.string.AccDescrChanSilentOn;
        } else {
            str = "AccDescrChanSilentOff";
            i10 = R.string.AccDescrChanSilentOff;
        }
        imageView.setContentDescription(LocaleController.getString(str, i10));
        chatActivityEnterView.G1(true);
    }
}
