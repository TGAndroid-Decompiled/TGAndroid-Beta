package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class oe implements View.OnClickListener {
    public final org.telegram.ui.un f31274a;
    public final Activity f31275b;
    public final ChatActivityEnterView f31276c;

    public oe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.un unVar, Activity activity) {
        this.f31276c = chatActivityEnterView;
        this.f31274a = unVar;
        this.f31275b = activity;
    }

    @Override
    public final void onClick(View view) {
        long b10;
        String str;
        int i10;
        int i11;
        org.telegram.ui.un unVar = this.f31274a;
        if (unVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f31276c;
        chatActivityEnterView.f25883g2 = !chatActivityEnterView.f25883g2;
        if (chatActivityEnterView.f25868e0 == null) {
            chatActivityEnterView.f25868e0 = new as(this.f31275b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.y6.Wk);
        }
        chatActivityEnterView.f25868e0.a(chatActivityEnterView.f25883g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.f25868e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.f25883g2).commit();
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
            if (!chatActivityEnterView.f25883g2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.f25883g2) {
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
