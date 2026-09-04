package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class oe implements View.OnClickListener {
    public final org.telegram.ui.co f29039a;
    public final Activity f29040b;
    public final ChatActivityEnterView f29041c;

    public oe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.co coVar, Activity activity) {
        this.f29041c = chatActivityEnterView;
        this.f29039a = coVar;
        this.f29040b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.co coVar = this.f29039a;
        if (coVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f29041c;
        chatActivityEnterView.f23698f2 = !chatActivityEnterView.f23698f2;
        if (chatActivityEnterView.f23689e0 == null) {
            chatActivityEnterView.f23689e0 = new mr(this.f29040b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.j6.Wk);
        }
        chatActivityEnterView.f23689e0.a(chatActivityEnterView.f23698f2, true);
        chatActivityEnterView.H1.setImageDrawable(chatActivityEnterView.f23689e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.P2, chatActivityEnterView.f23698f2).commit();
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
            if (!chatActivityEnterView.f23698f2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.H1;
        if (chatActivityEnterView.f23698f2) {
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
