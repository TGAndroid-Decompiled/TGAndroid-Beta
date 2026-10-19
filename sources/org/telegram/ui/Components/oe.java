package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class oe implements View.OnClickListener {
    public final org.telegram.ui.qn f28993a;
    public final Activity f28994b;
    public final ChatActivityEnterView f28995c;

    public oe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.qn qnVar, Activity activity) {
        this.f28995c = chatActivityEnterView;
        this.f28993a = qnVar;
        this.f28994b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.qn qnVar = this.f28993a;
        if (qnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f28995c;
        chatActivityEnterView.f23949g2 = !chatActivityEnterView.f23949g2;
        if (chatActivityEnterView.f23934e0 == null) {
            chatActivityEnterView.f23934e0 = new yr(this.f28994b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.h6.Wk);
        }
        chatActivityEnterView.f23934e0.a(chatActivityEnterView.f23949g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.f23934e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.f23949g2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j10 = chatActivityEnterView.Q2;
        if (qnVar == null) {
            d = 0;
        } else {
            d = qnVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j10, d);
        qnVar.T7();
        UndoView undoView = qnVar.y3;
        if (undoView != null) {
            if (!chatActivityEnterView.f23949g2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.f23949g2) {
            str = "AccDescrChanSilentOn";
            i10 = R.string.AccDescrChanSilentOn;
        } else {
            str = "AccDescrChanSilentOff";
            i10 = R.string.AccDescrChanSilentOff;
        }
        imageView.setContentDescription(LocaleController.getString(str, i10));
        chatActivityEnterView.D1(true);
    }
}
