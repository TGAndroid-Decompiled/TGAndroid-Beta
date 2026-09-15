package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class me implements View.OnClickListener {
    public final org.telegram.ui.bo f26149a;
    public final Activity f26150b;
    public final ChatActivityEnterView f26151c;

    public me(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.bo boVar, Activity activity) {
        this.f26151c = chatActivityEnterView;
        this.f26149a = boVar;
        this.f26150b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.bo boVar = this.f26149a;
        if (boVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f26151c;
        chatActivityEnterView.f21767f2 = !chatActivityEnterView.f21767f2;
        if (chatActivityEnterView.f21758e0 == null) {
            chatActivityEnterView.f21758e0 = new nr(this.f26150b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.i6.Wk);
        }
        chatActivityEnterView.f21758e0.a(chatActivityEnterView.f21767f2, true);
        chatActivityEnterView.H1.setImageDrawable(chatActivityEnterView.f21758e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.P2, chatActivityEnterView.f21767f2).commit();
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
            if (!chatActivityEnterView.f21767f2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.H1;
        if (chatActivityEnterView.f21767f2) {
            str = "AccDescrChanSilentOn";
            i10 = R.string.AccDescrChanSilentOn;
        } else {
            str = "AccDescrChanSilentOff";
            i10 = R.string.AccDescrChanSilentOff;
        }
        imageView.setContentDescription(LocaleController.getString(str, i10));
        chatActivityEnterView.F1(true);
    }
}
