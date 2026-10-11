package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class re implements View.OnClickListener {
    public final org.telegram.ui.zn f30502a;
    public final Activity f30503b;
    public final ChatActivityEnterView f30504c;

    public re(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.zn znVar, Activity activity) {
        this.f30504c = chatActivityEnterView;
        this.f30502a = znVar;
        this.f30503b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.zn znVar = this.f30502a;
        if (znVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f30504c;
        chatActivityEnterView.f23921g2 = !chatActivityEnterView.f23921g2;
        if (chatActivityEnterView.f23906e0 == null) {
            chatActivityEnterView.f23906e0 = new fs(this.f30503b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.h6.Wk);
        }
        chatActivityEnterView.f23906e0.a(chatActivityEnterView.f23921g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.f23906e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.f23921g2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.Q2;
        if (znVar == null) {
            d = 0;
        } else {
            d = znVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j3, d);
        znVar.T7();
        UndoView undoView = znVar.y3;
        if (undoView != null) {
            if (!chatActivityEnterView.f23921g2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.f23921g2) {
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
