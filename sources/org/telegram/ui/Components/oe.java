package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class oe implements View.OnClickListener {
    public final org.telegram.ui.sn f28972a;
    public final Activity f28973b;
    public final ChatActivityEnterView f28974c;

    public oe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.sn snVar, Activity activity) {
        this.f28974c = chatActivityEnterView;
        this.f28972a = snVar;
        this.f28973b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.sn snVar = this.f28972a;
        if (snVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f28974c;
        chatActivityEnterView.f23953g2 = !chatActivityEnterView.f23953g2;
        if (chatActivityEnterView.f23938e0 == null) {
            chatActivityEnterView.f23938e0 = new yr(this.f28973b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.h6.Wk);
        }
        chatActivityEnterView.f23938e0.a(chatActivityEnterView.f23953g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.f23938e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.f23953g2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j10 = chatActivityEnterView.Q2;
        if (snVar == null) {
            d = 0;
        } else {
            d = snVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j10, d);
        snVar.T7();
        UndoView undoView = snVar.y3;
        if (undoView != null) {
            if (!chatActivityEnterView.f23953g2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.f23953g2) {
            str = "AccDescrChanSilentOn";
            i10 = R.string.AccDescrChanSilentOn;
        } else {
            str = "AccDescrChanSilentOff";
            i10 = R.string.AccDescrChanSilentOff;
        }
        imageView.setContentDescription(LocaleController.getString(str, i10));
        chatActivityEnterView.E1(true);
    }
}
