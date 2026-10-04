package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class qe implements View.OnClickListener {
    public final org.telegram.ui.yn f30017a;
    public final Activity f30018b;
    public final ChatActivityEnterView f30019c;

    public qe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.yn ynVar, Activity activity) {
        this.f30019c = chatActivityEnterView;
        this.f30017a = ynVar;
        this.f30018b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.yn ynVar = this.f30017a;
        if (ynVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f30019c;
        chatActivityEnterView.f23894g2 = !chatActivityEnterView.f23894g2;
        if (chatActivityEnterView.f23879e0 == null) {
            chatActivityEnterView.f23879e0 = new qr(this.f30018b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.i6.Wk);
        }
        chatActivityEnterView.f23879e0.a(chatActivityEnterView.f23894g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.f23879e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.f23894g2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.Q2;
        if (ynVar == null) {
            d = 0;
        } else {
            d = ynVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j3, d);
        ynVar.Q7();
        UndoView undoView = ynVar.f43549w3;
        if (undoView != null) {
            if (!chatActivityEnterView.f23894g2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.f23894g2) {
            str = "AccDescrChanSilentOn";
            i10 = R.string.AccDescrChanSilentOn;
        } else {
            str = "AccDescrChanSilentOff";
            i10 = R.string.AccDescrChanSilentOff;
        }
        imageView.setContentDescription(LocaleController.getString(str, i10));
        chatActivityEnterView.F1(true);
    }
}
