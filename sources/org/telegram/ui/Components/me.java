package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class me implements View.OnClickListener {
    public final org.telegram.ui.sn f28584a;
    public final Activity f28585b;
    public final ChatActivityEnterView f28586c;

    public me(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.sn snVar, Activity activity) {
        this.f28586c = chatActivityEnterView;
        this.f28584a = snVar;
        this.f28585b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.sn snVar = this.f28584a;
        if (snVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f28586c;
        chatActivityEnterView.f24093g2 = !chatActivityEnterView.f24093g2;
        if (chatActivityEnterView.f24078e0 == null) {
            chatActivityEnterView.f24078e0 = new wr(this.f28585b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.k6.Wk);
        }
        chatActivityEnterView.f24078e0.a(chatActivityEnterView.f24093g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.f24078e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.f24093g2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j10 = chatActivityEnterView.Q2;
        if (snVar == null) {
            d = 0;
        } else {
            d = snVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j10, d);
        snVar.T7();
        UndoView undoView = snVar.K3;
        if (undoView != null) {
            if (!chatActivityEnterView.f24093g2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.f24093g2) {
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
