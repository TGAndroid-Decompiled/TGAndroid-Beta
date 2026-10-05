package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class cw implements View.OnLongClickListener {
    public final int f35558a;
    public final uy f35559b;

    public cw(uy uyVar, int i10) {
        this.f35558a = i10;
        this.f35559b = uyVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f35558a) {
            case 0:
                uy uyVar = this.f35559b;
                ArrayList arrayList = uyVar.I2;
                if (uyVar.getParentActivity() == null) {
                    return false;
                }
                boolean z10 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long longValue = ((Long) arrayList.get(i10)).longValue();
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        z10 = false;
                    }
                    TLRPC.Chat chat = uyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z10 = false;
                    }
                }
                org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(uyVar, view);
                H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new pv(uyVar, 17), false);
                H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new pv(uyVar, 18), z10);
                H.Z();
                return true;
            case 1:
                uy uyVar2 = this.f35559b;
                uyVar2.A4(uyVar2.I2, 104, true, true, null);
                return true;
            case 2:
                this.f35559b.y4(view);
                return true;
            default:
                uy uyVar3 = this.f35559b;
                uyVar3.getContactsController().loadGlobalPrivacySetting();
                uyVar3.T4();
                return true;
        }
    }
}
