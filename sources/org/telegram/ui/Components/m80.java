package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class m80 implements View.OnClickListener {
    public final int f25179a;
    public final long f25180b;
    public final Object f25181c;

    public m80(Object obj, long j3, int i10) {
        this.f25179a = i10;
        this.f25181c = obj;
        this.f25180b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25179a) {
            case 0:
                q80.q((q80) this.f25181c, this.f25180b);
                return;
            case 1:
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) this.f25181c;
                MessagesController messagesController = wyVar.getMessagesController();
                long j3 = this.f25180b;
                boolean isDialogMuted = messagesController.isDialogMuted(j3, 0L);
                if (!isDialogMuted) {
                    wyVar.getNotificationsController().setDialogNotificationsSettings(j3, 0L, 3);
                } else {
                    wyVar.getNotificationsController().setDialogNotificationsSettings(j3, 0L, 4);
                }
                wc.A(wyVar, !isDialogMuted, null).j();
                wyVar.finishPreviewFragment();
                return;
            case 2:
                Utilities.Callback callback = ((ph.p) this.f25181c).f40442f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f25180b));
                    return;
                }
                return;
            case 3:
                wh.m.P((wh.m) this.f25181c, this.f25180b);
                return;
            case 4:
                wh.p1 p1Var = (wh.p1) this.f25181c;
                p1Var.getClass();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f25180b));
                    return;
                }
                return;
            default:
                zh.a3 a3Var = (zh.a3) this.f25181c;
                a3Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.f25180b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                a3Var.J0.H(new ProfileActivity(bundle, null));
                return;
        }
    }
}
