package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bw implements View.OnLongClickListener {
    public final int f36463a;
    public final sy f36464b;

    public bw(sy syVar, int i10) {
        this.f36463a = i10;
        this.f36464b = syVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f36463a) {
            case 0:
                sy syVar = this.f36464b;
                ArrayList arrayList = syVar.I2;
                if (syVar.getParentActivity() == null) {
                    return false;
                }
                boolean z10 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long longValue = ((Long) arrayList.get(i10)).longValue();
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        z10 = false;
                    }
                    TLRPC.Chat chat = syVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z10 = false;
                    }
                }
                org.telegram.ui.Components.q80 H = org.telegram.ui.Components.q80.H(syVar, view);
                H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new nv(syVar, 20), false);
                H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new nv(syVar, 21), z10);
                H.Z();
                return true;
            case 1:
                sy syVar2 = this.f36464b;
                syVar2.o4(syVar2.I2, 104, true, true, null);
                return true;
            case 2:
                this.f36464b.m4(view);
                return true;
            default:
                sy syVar3 = this.f36464b;
                syVar3.getContactsController().loadGlobalPrivacySetting();
                syVar3.H4();
                return true;
        }
    }
}
