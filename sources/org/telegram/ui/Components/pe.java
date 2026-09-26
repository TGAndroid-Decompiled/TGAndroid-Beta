package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
public final class pe implements View.OnClickListener {
    public final org.telegram.ui.wn f27341a;
    public final Activity f27342b;
    public final ChatActivityEnterView f27343c;

    public pe(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.wn wnVar, Activity activity) {
        this.f27343c = chatActivityEnterView;
        this.f27341a = wnVar;
        this.f27342b = activity;
    }

    @Override
    public final void onClick(View view) {
        long d;
        String str;
        int i10;
        int i11;
        org.telegram.ui.wn wnVar = this.f27341a;
        if (wnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f27343c;
        chatActivityEnterView.f21994g2 = !chatActivityEnterView.f21994g2;
        if (chatActivityEnterView.f21979e0 == null) {
            chatActivityEnterView.f21979e0 = new pr(this.f27342b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.h6.Wk);
        }
        chatActivityEnterView.f21979e0.a(chatActivityEnterView.f21994g2, true);
        chatActivityEnterView.I1.setImageDrawable(chatActivityEnterView.f21979e0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.Q).edit().putBoolean("silent_" + chatActivityEnterView.Q2, chatActivityEnterView.f21994g2).commit();
        NotificationsController notificationsController = NotificationsController.getInstance(chatActivityEnterView.Q);
        long j3 = chatActivityEnterView.Q2;
        if (wnVar == null) {
            d = 0;
        } else {
            d = wnVar.d();
        }
        notificationsController.updateServerNotificationsSettings(j3, d);
        wnVar.Q7();
        UndoView undoView = wnVar.y3;
        if (undoView != null) {
            if (!chatActivityEnterView.f21994g2) {
                i11 = 54;
            } else {
                i11 = 55;
            }
            undoView.j(i11, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.I1;
        if (chatActivityEnterView.f21994g2) {
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
