package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class pe implements View.OnClickListener {
    public final org.telegram.ui.fo f27980a;
    public final Activity f27981b;
    public final ChatActivityEnterView f27982c;

    public pe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.fo foVar, Activity activity) {
        this.f27982c = chatActivityEnterView;
        this.f27980a = foVar;
        this.f27981b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.fo foVar = this.f27980a;
        if (foVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f27982c;
        chatActivityEnterView.f22591g2 = !chatActivityEnterView.f22591g2;
        if (chatActivityEnterView.f22576e0 == null) {
            chatActivityEnterView.f22576e0 = new bs(this.f27981b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.g6.Wk);
        }
        chatActivityEnterView.f22576e0.a(chatActivityEnterView.f22591g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.f22576e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.f22591g2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j10 = chatActivityEnterView.Q2;
        if (foVar == null) {
            d = 0;
        } else {
            d = foVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j10, d);
        foVar.T7();
        UndoView undoView = foVar.y3;
        if (undoView != null) {
            if (!chatActivityEnterView.f22591g2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.f22591g2) {
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
