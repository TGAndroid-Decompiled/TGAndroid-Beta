package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class oe implements View.OnClickListener {
    public final org.telegram.ui.xn f26726a;
    public final Activity f26727b;
    public final ChatActivityEnterView f26728c;

    public oe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.xn xnVar, Activity activity) {
        this.f26728c = chatActivityEnterView;
        this.f26726a = xnVar;
        this.f26727b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.xn xnVar = this.f26726a;
        if (xnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f26728c;
        chatActivityEnterView.f21737f2 = !chatActivityEnterView.f21737f2;
        if (chatActivityEnterView.f21728e0 == null) {
            chatActivityEnterView.f21728e0 = new or(this.f26727b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.h6.Wk);
        }
        chatActivityEnterView.f21728e0.a(chatActivityEnterView.f21737f2, true);
        chatActivityEnterView.H1.setImageDrawable(chatActivityEnterView.f21728e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.P2, chatActivityEnterView.f21737f2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.P2;
        if (xnVar == null) {
            d = 0;
        } else {
            d = xnVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j3, d);
        xnVar.Q7();
        UndoView undoView = xnVar.y3;
        if (undoView != null) {
            if (!chatActivityEnterView.f21737f2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.H1;
        if (chatActivityEnterView.f21737f2) {
            str = "AccDescrChanSilentOn";
            i10 = R.string.AccDescrChanSilentOn;
        } else {
            str = "AccDescrChanSilentOff";
            i10 = R.string.AccDescrChanSilentOff;
        }
        imageView.setContentDescription(LocaleController.getString(str, i10));
        chatActivityEnterView.H1(true);
    }
}
