package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class aw implements View.OnLongClickListener {
    public final int f31892a;
    public final ry f31893b;

    public aw(ry ryVar, int i10) {
        this.f31892a = i10;
        this.f31893b = ryVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f31892a) {
            case 0:
                ry ryVar = this.f31893b;
                ryVar.r4(ryVar.I2, 104, true, true, null);
                return true;
            case 1:
                ry ryVar2 = this.f31893b;
                ArrayList arrayList = ryVar2.I2;
                if (ryVar2.getParentActivity() == null) {
                    return false;
                }
                boolean z10 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long longValue = ((Long) arrayList.get(i10)).longValue();
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        z10 = false;
                    }
                    TLRPC.Chat chat = ryVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z10 = false;
                    }
                }
                org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(ryVar2, view);
                H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new mv(ryVar2, 19), false);
                H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new mv(ryVar2, 20), z10);
                H.Z();
                return true;
            case 2:
                this.f31893b.p4(view);
                return true;
            default:
                ry ryVar3 = this.f31893b;
                ryVar3.getContactsController().loadGlobalPrivacySetting();
                ryVar3.K4();
                return true;
        }
    }
}
