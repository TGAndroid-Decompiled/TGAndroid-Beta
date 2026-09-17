package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class oe implements View.OnClickListener {
    public final org.telegram.ui.co f29067a;
    public final Activity f29068b;
    public final ChatActivityEnterView f29069c;

    public oe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.co coVar, Activity activity) {
        this.f29069c = chatActivityEnterView;
        this.f29067a = coVar;
        this.f29068b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.co coVar = this.f29067a;
        if (coVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f29069c;
        chatActivityEnterView.f23726f2 = !chatActivityEnterView.f23726f2;
        if (chatActivityEnterView.f23717e0 == null) {
            chatActivityEnterView.f23717e0 = new mr(this.f29068b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.j6.Wk);
        }
        chatActivityEnterView.f23717e0.a(chatActivityEnterView.f23726f2, true);
        chatActivityEnterView.H1.setImageDrawable(chatActivityEnterView.f23717e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.P2, chatActivityEnterView.f23726f2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.P2;
        if (coVar == null) {
            d = 0;
        } else {
            d = coVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j3, d);
        coVar.Q7();
        UndoView undoView = coVar.y3;
        if (undoView != null) {
            if (!chatActivityEnterView.f23726f2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.H1;
        if (chatActivityEnterView.f23726f2) {
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
