package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class qe implements View.OnClickListener {
    public final org.telegram.ui.yn f30011a;
    public final Activity f30012b;
    public final ChatActivityEnterView f30013c;

    public qe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.yn ynVar, Activity activity) {
        this.f30013c = chatActivityEnterView;
        this.f30011a = ynVar;
        this.f30012b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.yn ynVar = this.f30011a;
        if (ynVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f30013c;
        chatActivityEnterView.f23889g2 = !chatActivityEnterView.f23889g2;
        if (chatActivityEnterView.f23874e0 == null) {
            chatActivityEnterView.f23874e0 = new qr(this.f30012b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.i6.Wk);
        }
        chatActivityEnterView.f23874e0.a(chatActivityEnterView.f23889g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.f23874e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.f23889g2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.Q2;
        if (ynVar == null) {
            d = 0;
        } else {
            d = ynVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j3, d);
        ynVar.Q7();
        UndoView undoView = ynVar.f43541w3;
        if (undoView != null) {
            if (!chatActivityEnterView.f23889g2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.f23889g2) {
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
