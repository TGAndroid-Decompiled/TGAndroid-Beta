package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class qe implements View.OnClickListener {
    public final org.telegram.ui.yn f30039a;
    public final Activity f30040b;
    public final ChatActivityEnterView f30041c;

    public qe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.yn ynVar, Activity activity) {
        this.f30041c = chatActivityEnterView;
        this.f30039a = ynVar;
        this.f30040b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.yn ynVar = this.f30039a;
        if (ynVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f30041c;
        chatActivityEnterView.f23897g2 = !chatActivityEnterView.f23897g2;
        if (chatActivityEnterView.f23882e0 == null) {
            chatActivityEnterView.f23882e0 = new qr(this.f30040b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.i6.Wk);
        }
        chatActivityEnterView.f23882e0.a(chatActivityEnterView.f23897g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.f23882e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.f23897g2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.Q2;
        if (ynVar == null) {
            d = 0;
        } else {
            d = ynVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j3, d);
        ynVar.Q7();
        UndoView undoView = ynVar.f43542w3;
        if (undoView != null) {
            if (!chatActivityEnterView.f23897g2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.f23897g2) {
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
