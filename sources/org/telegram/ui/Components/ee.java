package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class ee implements View.OnClickListener {
    public final org.telegram.ui.xn f26562a;
    public final Activity f26563b;
    public final ChatActivityEnterView f26564c;

    public ee(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.xn xnVar, Activity activity) {
        this.f26564c = chatActivityEnterView;
        this.f26562a = xnVar;
        this.f26563b = activity;
    }

    @Override
    public final void onClick(View view) {
        long b10;
        String str;
        int i10;
        int i11;
        org.telegram.ui.xn xnVar = this.f26562a;
        if (xnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f26564c;
        chatActivityEnterView.f24587c2 = !chatActivityEnterView.f24587c2;
        if (chatActivityEnterView.f24578b0 == null) {
            chatActivityEnterView.f24578b0 = new mr(this.f26563b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.k6.Wk);
        }
        chatActivityEnterView.f24578b0.a(chatActivityEnterView.f24587c2, true);
        chatActivityEnterView.E1.setImageDrawable(chatActivityEnterView.f24578b0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.N).edit().putBoolean("silent_" + chatActivityEnterView.M2, chatActivityEnterView.f24587c2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.N);
        long j10 = chatActivityEnterView.M2;
        if (xnVar == null) {
            b10 = 0;
        } else {
            b10 = xnVar.b();
        }
        notificationsController.updateServerNotificationsSettings(j10, b10);
        xnVar.Q7();
        UndoView undoView = xnVar.f43356v3;
        if (undoView != null) {
            if (!chatActivityEnterView.f24587c2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.E1;
        if (chatActivityEnterView.f24587c2) {
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
