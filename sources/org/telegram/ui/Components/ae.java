package org.telegram.ui.Components;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;

public final class ae implements View.OnClickListener {

    public final org.telegram.ui.rn f26733a;

    public final Activity f26734b;

    public final ChatActivityEnterView f26735c;

    public ae(ChatActivityEnterView chatActivityEnterView, org.telegram.ui.rn rnVar, Activity activity) {
        this.f26735c = chatActivityEnterView;
        this.f26733a = rnVar;
        this.f26734b = activity;
    }

    @Override
    public final void onClick(View view) {
        String str;
        int i10;
        org.telegram.ui.rn rnVar = this.f26733a;
        if (rnVar == null) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f26735c;
        chatActivityEnterView.f26079b2 = !chatActivityEnterView.f26079b2;
        if (chatActivityEnterView.f26072a0 == null) {
            chatActivityEnterView.f26072a0 = new br(this.f26734b, R.drawable.input_notify_on, org.telegram.ui.ActionBar.g6.Wk);
        }
        chatActivityEnterView.f26072a0.a(chatActivityEnterView.f26079b2, true);
        chatActivityEnterView.D1.setImageDrawable(chatActivityEnterView.f26072a0);
        MessagesController.getNotificationsSettings(chatActivityEnterView.M).edit().putBoolean("silent_" + chatActivityEnterView.L2, chatActivityEnterView.f26079b2).commit();
        NotificationsController.getInstance(chatActivityEnterView.M).updateServerNotificationsSettings(chatActivityEnterView.L2, rnVar == null ? 0L : rnVar.b());
        rnVar.Q7();
        UndoView undoView = rnVar.f42229u3;
        if (undoView != null) {
            undoView.j(!chatActivityEnterView.f26079b2 ? 54 : 55, 0L, null);
        }
        ImageView imageView = chatActivityEnterView.D1;
        if (chatActivityEnterView.f26079b2) {
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
