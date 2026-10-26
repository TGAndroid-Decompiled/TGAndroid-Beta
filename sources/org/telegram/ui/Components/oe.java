package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class oe implements View.OnClickListener {
    public final org.telegram.ui.un f31276a;
    public final Activity f31277b;
    public final ChatActivityEnterView f31278c;

    public oe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.un unVar, Activity activity) {
        this.f31278c = chatActivityEnterView;
        this.f31276a = unVar;
        this.f31277b = activity;
    }

    @Override
    public final void onClick(View view) {
        long b10;
        String str;
        int i10;
        int i11;
        org.telegram.ui.un unVar = this.f31276a;
        if (unVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f31278c;
        chatActivityEnterView.f25885g2 = !chatActivityEnterView.f25885g2;
        if (chatActivityEnterView.f25870e0 == null) {
            chatActivityEnterView.f25870e0 = new as(this.f31277b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.y6.Wk);
        }
        chatActivityEnterView.f25870e0.a(chatActivityEnterView.f25885g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.f25870e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.f25885g2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j10 = chatActivityEnterView.Q2;
        if (unVar == null) {
            b10 = 0;
        } else {
            b10 = unVar.b();
        }
        notificationsController.updateServerNotificationsSettings(j10, b10);
        unVar.X7();
        UndoView undoView = unVar.K3;
        if (undoView != null) {
            if (!chatActivityEnterView.f25885g2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.f25885g2) {
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
