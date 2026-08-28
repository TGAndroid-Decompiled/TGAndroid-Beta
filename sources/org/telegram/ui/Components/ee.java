package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class ee implements View.OnClickListener {
    public final org.telegram.ui.qn f28008a;
    public final Activity f28009b;
    public final ChatActivityEnterView f28010c;

    public ee(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.qn qnVar, Activity activity) {
        this.f28010c = chatActivityEnterView;
        this.f28008a = qnVar;
        this.f28009b = activity;
    }

    @Override
    public final void onClick(View view) {
        long b10;
        String str;
        int i9;
        int i10;
        org.telegram.ui.qn qnVar = this.f28008a;
        if (qnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f28010c;
        chatActivityEnterView.f26083b2 = !chatActivityEnterView.f26083b2;
        if (chatActivityEnterView.f26076a0 == null) {
            chatActivityEnterView.f26076a0 = new dr(this.f28009b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.f6.Wk);
        }
        chatActivityEnterView.f26076a0.a(chatActivityEnterView.f26083b2, true);
        chatActivityEnterView.D1.setImageDrawable(chatActivityEnterView.f26076a0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.M).edit().putBoolean("silent_" + chatActivityEnterView.L2, chatActivityEnterView.f26083b2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.M);
        long j10 = chatActivityEnterView.L2;
        if (qnVar == null) {
            b10 = 0;
        } else {
            b10 = qnVar.b();
        }
        notificationsController.updateServerNotificationsSettings(j10, b10);
        qnVar.Q7();
        UndoView undoView = qnVar.f42093u3;
        if (undoView != null) {
            if (!chatActivityEnterView.f26083b2) {
                i10 = 54;
            } else {
                i10 = 55;
            }
            undoView.j(i10, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.D1;
        if (chatActivityEnterView.f26083b2) {
            str = "AccDescrChanSilentOn";
            i9 = R.string.AccDescrChanSilentOn;
        } else {
            str = "AccDescrChanSilentOff";
            i9 = R.string.AccDescrChanSilentOff;
        }
        imageView.setContentDescription(LocaleController.getString(str, i9));
        chatActivityEnterView.G1(true);
    }
}
