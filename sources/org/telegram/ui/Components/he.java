package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class he implements View.OnClickListener {
    public final org.telegram.ui.tn f29169a;
    public final Activity f29170b;
    public final ChatActivityEnterView f29171c;

    public he(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.tn tnVar, Activity activity) {
        this.f29171c = chatActivityEnterView;
        this.f29169a = tnVar;
        this.f29170b = activity;
    }

    @Override
    public final void onClick(View view) {
        long b10;
        String str;
        int i10;
        int i11;
        org.telegram.ui.tn tnVar = this.f29169a;
        if (tnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f29171c;
        chatActivityEnterView.f26095b2 = !chatActivityEnterView.f26095b2;
        if (chatActivityEnterView.f26087a0 == null) {
            chatActivityEnterView.f26087a0 = new gr(this.f29170b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.g6.Wk);
        }
        chatActivityEnterView.f26087a0.a(chatActivityEnterView.f26095b2, true);
        chatActivityEnterView.D1.setImageDrawable(chatActivityEnterView.f26087a0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.M).edit().putBoolean("silent_" + chatActivityEnterView.L2, chatActivityEnterView.f26095b2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.M);
        long j10 = chatActivityEnterView.L2;
        if (tnVar == null) {
            b10 = 0;
        } else {
            b10 = tnVar.b();
        }
        notificationsController.updateServerNotificationsSettings(j10, b10);
        tnVar.Q7();
        UndoView undoView = tnVar.f42989u3;
        if (undoView != null) {
            if (!chatActivityEnterView.f26095b2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.D1;
        if (chatActivityEnterView.f26095b2) {
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
