package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class oe implements View.OnClickListener {
    public final org.telegram.ui.qn f29034a;
    public final Activity f29035b;
    public final ChatActivityEnterView f29036c;

    public oe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.qn qnVar, Activity activity) {
        this.f29036c = chatActivityEnterView;
        this.f29034a = qnVar;
        this.f29035b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.qn qnVar = this.f29034a;
        if (qnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f29036c;
        chatActivityEnterView.f23954g2 = !chatActivityEnterView.f23954g2;
        if (chatActivityEnterView.f23939e0 == null) {
            chatActivityEnterView.f23939e0 = new yr(this.f29035b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.h6.Wk);
        }
        chatActivityEnterView.f23939e0.a(chatActivityEnterView.f23954g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.f23939e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.f23954g2).commit();
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
            if (!chatActivityEnterView.f23954g2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.f23954g2) {
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
