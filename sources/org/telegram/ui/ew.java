package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ew implements View.OnLongClickListener {
    public final int f37557a;
    public final vy f37558b;

    public ew(vy vyVar, int i10) {
        this.f37557a = i10;
        this.f37558b = vyVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f37557a) {
            case 0:
                vy vyVar = this.f37558b;
                ArrayList arrayList = vyVar.I2;
                if (vyVar.getParentActivity() == null) {
                    return false;
                }
                boolean z10 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long longValue = ((Long) arrayList.get(i10)).longValue();
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        z10 = false;
                    }
                    TLRPC.Chat chat = vyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z10 = false;
                    }
                }
                org.telegram.ui.Components.s80 H = org.telegram.ui.Components.s80.H(vyVar, view);
                H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new rv(vyVar, 20), false);
                H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new rv(vyVar, 21), z10);
                H.Z();
                return true;
            case 1:
                vy vyVar2 = this.f37558b;
                vyVar2.o4(vyVar2.I2, 104, true, true, null);
                return true;
            case 2:
                this.f37558b.m4(view);
                return true;
            default:
                vy vyVar3 = this.f37558b;
                vyVar3.getContactsController().loadGlobalPrivacySetting();
                vyVar3.H4();
                return true;
        }
    }
}
