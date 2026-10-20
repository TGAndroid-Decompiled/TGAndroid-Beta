package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class oe implements View.OnClickListener {
    public final org.telegram.ui.qn f29029a;
    public final Activity f29030b;
    public final ChatActivityEnterView f29031c;

    public oe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.qn qnVar, Activity activity) {
        this.f29031c = chatActivityEnterView;
        this.f29029a = qnVar;
        this.f29030b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.qn qnVar = this.f29029a;
        if (qnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f29031c;
        chatActivityEnterView.f23950g2 = !chatActivityEnterView.f23950g2;
        if (chatActivityEnterView.f23935e0 == null) {
            chatActivityEnterView.f23935e0 = new yr(this.f29030b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.h6.Wk);
        }
        chatActivityEnterView.f23935e0.a(chatActivityEnterView.f23950g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.f23935e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.f23950g2).commit();
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
            if (!chatActivityEnterView.f23950g2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.f23950g2) {
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
