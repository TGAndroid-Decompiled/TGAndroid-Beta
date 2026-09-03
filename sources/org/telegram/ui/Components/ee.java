package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class ee implements View.OnClickListener {
    public final org.telegram.ui.zn f24598a;
    public final Activity f24599b;
    public final ChatActivityEnterView f24600c;

    public ee(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.zn znVar, Activity activity) {
        this.f24600c = chatActivityEnterView;
        this.f24598a = znVar;
        this.f24599b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.zn znVar = this.f24598a;
        if (znVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f24600c;
        chatActivityEnterView.f22719c2 = !chatActivityEnterView.f22719c2;
        if (chatActivityEnterView.f22710b0 == null) {
            chatActivityEnterView.f22710b0 = new jr(this.f24599b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.j6.Wk);
        }
        chatActivityEnterView.f22710b0.a(chatActivityEnterView.f22719c2, true);
        chatActivityEnterView.E1.setImageDrawable(chatActivityEnterView.f22710b0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.N).edit().putBoolean("silent_" + chatActivityEnterView.M2, chatActivityEnterView.f22719c2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.N);
        long j10 = chatActivityEnterView.M2;
        if (znVar == null) {
            d = 0;
        } else {
            d = znVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j10, d);
        znVar.Q7();
        UndoView undoView = znVar.f40775v3;
        if (undoView != null) {
            if (!chatActivityEnterView.f22719c2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.E1;
        if (chatActivityEnterView.f22719c2) {
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
