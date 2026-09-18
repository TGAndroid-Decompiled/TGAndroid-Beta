package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class me implements View.OnClickListener {
    public final org.telegram.ui.bo f26137a;
    public final Activity f26138b;
    public final ChatActivityEnterView f26139c;

    public me(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.bo boVar, Activity activity) {
        this.f26139c = chatActivityEnterView;
        this.f26137a = boVar;
        this.f26138b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.bo boVar = this.f26137a;
        if (boVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f26139c;
        chatActivityEnterView.f21779f2 = !chatActivityEnterView.f21779f2;
        if (chatActivityEnterView.f21770e0 == null) {
            chatActivityEnterView.f21770e0 = new nr(this.f26138b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.j6.Wk);
        }
        chatActivityEnterView.f21770e0.a(chatActivityEnterView.f21779f2, true);
        chatActivityEnterView.H1.setImageDrawable(chatActivityEnterView.f21770e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.P2, chatActivityEnterView.f21779f2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.P2;
        if (boVar == null) {
            d = 0;
        } else {
            d = boVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j3, d);
        boVar.Q7();
        UndoView undoView = boVar.y3;
        if (undoView != null) {
            if (!chatActivityEnterView.f21779f2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.H1;
        if (chatActivityEnterView.f21779f2) {
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
