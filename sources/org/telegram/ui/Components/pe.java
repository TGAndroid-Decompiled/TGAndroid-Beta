package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class pe implements View.OnClickListener {
    public final org.telegram.ui.eo f26106a;
    public final Activity f26107b;
    public final ChatActivityEnterView f26108c;

    public pe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.eo eoVar, Activity activity) {
        this.f26108c = chatActivityEnterView;
        this.f26106a = eoVar;
        this.f26107b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.eo eoVar = this.f26106a;
        if (eoVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f26108c;
        chatActivityEnterView.f20852f2 = !chatActivityEnterView.f20852f2;
        if (chatActivityEnterView.f20843e0 == null) {
            chatActivityEnterView.f20843e0 = new tr(this.f26107b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.j6.Wk);
        }
        chatActivityEnterView.f20843e0.a(chatActivityEnterView.f20852f2, true);
        chatActivityEnterView.H1.setImageDrawable(chatActivityEnterView.f20843e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.P2, chatActivityEnterView.f20852f2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.P2;
        if (eoVar == null) {
            d = 0;
        } else {
            d = eoVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j3, d);
        eoVar.Q7();
        UndoView undoView = eoVar.y3;
        if (undoView != null) {
            if (!chatActivityEnterView.f20852f2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.H1;
        if (chatActivityEnterView.f20852f2) {
            str = "AccDescrChanSilentOn";
            i10 = R.string.AccDescrChanSilentOn;
        } else {
            str = "AccDescrChanSilentOff";
            i10 = R.string.AccDescrChanSilentOff;
        }
        imageView.setContentDescription(LocaleController.getString(str, i10));
        chatActivityEnterView.G1(true);
    }
}
