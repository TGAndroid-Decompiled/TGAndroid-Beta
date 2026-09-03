package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class aw implements View.OnLongClickListener {
    public final int f35264a;
    public final py f35265b;

    public aw(py pyVar, int i10) {
        this.f35264a = i10;
        this.f35265b = pyVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f35264a) {
            case 0:
                py pyVar = this.f35265b;
                pyVar.r4(pyVar.F2, 104, true, true, null);
                return true;
            case 1:
                py pyVar2 = this.f35265b;
                ArrayList arrayList = pyVar2.F2;
                if (pyVar2.getParentActivity() == null) {
                    return false;
                }
                boolean z4 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long longValue = ((Long) arrayList.get(i10)).longValue();
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        z4 = false;
                    }
                    TLRPC.Chat chat = pyVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z4 = false;
                    }
                }
                org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(pyVar2, view);
                H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new nv(pyVar2, 19), false);
                H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new nv(pyVar2, 20), z4);
                H.Z();
                return true;
            case 2:
                this.f35265b.p4(view);
                return true;
            default:
                py pyVar3 = this.f35265b;
                pyVar3.getContactsController().loadGlobalPrivacySetting();
                pyVar3.K4();
                return true;
        }
    }
}
