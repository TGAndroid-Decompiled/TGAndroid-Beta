package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ew implements View.OnLongClickListener {
    public final int f36194a;
    public final uy f36195b;

    public ew(uy uyVar, int i10) {
        this.f36194a = i10;
        this.f36195b = uyVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f36194a) {
            case 0:
                uy uyVar = this.f36195b;
                uyVar.r4(uyVar.I2, 104, true, true, null);
                return true;
            case 1:
                uy uyVar2 = this.f36195b;
                ArrayList arrayList = uyVar2.I2;
                if (uyVar2.getParentActivity() == null) {
                    return false;
                }
                boolean z10 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long longValue = ((Long) arrayList.get(i10)).longValue();
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        z10 = false;
                    }
                    TLRPC.Chat chat = uyVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z10 = false;
                    }
                }
                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(uyVar2, view);
                H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new qv(uyVar2, 19), false);
                H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new qv(uyVar2, 20), z10);
                H.Z();
                return true;
            case 2:
                this.f36195b.p4(view);
                return true;
            default:
                uy uyVar3 = this.f36195b;
                uyVar3.getContactsController().loadGlobalPrivacySetting();
                uyVar3.K4();
                return true;
        }
    }
}
