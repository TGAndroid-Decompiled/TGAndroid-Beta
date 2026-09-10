package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class fw implements View.OnLongClickListener {
    public final int f32924a;
    public final wy f32925b;

    public fw(wy wyVar, int i10) {
        this.f32924a = i10;
        this.f32925b = wyVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f32924a) {
            case 0:
                wy wyVar = this.f32925b;
                wyVar.r4(wyVar.I2, 104, true, true, null);
                return true;
            case 1:
                wy wyVar2 = this.f32925b;
                ArrayList arrayList = wyVar2.I2;
                if (wyVar2.getParentActivity() == null) {
                    return false;
                }
                boolean z10 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long longValue = ((Long) arrayList.get(i10)).longValue();
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        z10 = false;
                    }
                    TLRPC.Chat chat = wyVar2.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z10 = false;
                    }
                }
                org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(wyVar2, view);
                H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new rv(wyVar2, 19), false);
                H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new rv(wyVar2, 20), z10);
                H.Z();
                return true;
            case 2:
                this.f32925b.p4(view);
                return true;
            default:
                wy wyVar3 = this.f32925b;
                wyVar3.getContactsController().loadGlobalPrivacySetting();
                wyVar3.K4();
                return true;
        }
    }
}
