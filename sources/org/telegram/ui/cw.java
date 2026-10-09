package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class cw implements View.OnLongClickListener {
    public final int f36742a;
    public final ty f36743b;

    public cw(ty tyVar, int i10) {
        this.f36742a = i10;
        this.f36743b = tyVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f36742a) {
            case 0:
                ty tyVar = this.f36743b;
                ArrayList arrayList = tyVar.I2;
                if (tyVar.getParentActivity() == null) {
                    return false;
                }
                boolean z10 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long longValue = ((Long) arrayList.get(i10)).longValue();
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        z10 = false;
                    }
                    TLRPC.Chat chat = tyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z10 = false;
                    }
                }
                org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(tyVar, view);
                H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ov(tyVar, 20), false);
                H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new ov(tyVar, 21), z10);
                H.Z();
                return true;
            case 1:
                ty tyVar2 = this.f36743b;
                tyVar2.o4(tyVar2.I2, 104, true, true, null);
                return true;
            case 2:
                this.f36743b.m4(view);
                return true;
            default:
                ty tyVar3 = this.f36743b;
                tyVar3.getContactsController().loadGlobalPrivacySetting();
                tyVar3.H4();
                return true;
        }
    }
}
