package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class oe implements View.OnClickListener {
    public final org.telegram.ui.zn f26897a;
    public final Activity f26898b;
    public final ChatActivityEnterView f26899c;

    public oe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.zn znVar, Activity activity) {
        this.f26899c = chatActivityEnterView;
        this.f26897a = znVar;
        this.f26898b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.zn znVar = this.f26897a;
        if (znVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f26899c;
        chatActivityEnterView.f21988f2 = !chatActivityEnterView.f21988f2;
        if (chatActivityEnterView.f21979e0 == null) {
            chatActivityEnterView.f21979e0 = new nr(this.f26898b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.j6.Wk);
        }
        chatActivityEnterView.f21979e0.a(chatActivityEnterView.f21988f2, true);
        chatActivityEnterView.H1.setImageDrawable(chatActivityEnterView.f21979e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.P2, chatActivityEnterView.f21988f2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.P2;
        if (znVar == null) {
            d = 0;
        } else {
            d = znVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j3, d);
        znVar.Q7();
        UndoView undoView = znVar.y3;
        if (undoView != null) {
            if (!chatActivityEnterView.f21988f2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.H1;
        if (chatActivityEnterView.f21988f2) {
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
