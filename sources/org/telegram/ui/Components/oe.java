package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class oe implements View.OnClickListener {
    public final org.telegram.ui.qn f28991a;
    public final Activity f28992b;
    public final ChatActivityEnterView f28993c;

    public oe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.qn qnVar, Activity activity) {
        this.f28993c = chatActivityEnterView;
        this.f28991a = qnVar;
        this.f28992b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.qn qnVar = this.f28991a;
        if (qnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f28993c;
        chatActivityEnterView.f23947g2 = !chatActivityEnterView.f23947g2;
        if (chatActivityEnterView.f23932e0 == null) {
            chatActivityEnterView.f23932e0 = new yr(this.f28992b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.h6.Wk);
        }
        chatActivityEnterView.f23932e0.a(chatActivityEnterView.f23947g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.f23932e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.f23947g2).commit();
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
            if (!chatActivityEnterView.f23947g2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.f23947g2) {
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
