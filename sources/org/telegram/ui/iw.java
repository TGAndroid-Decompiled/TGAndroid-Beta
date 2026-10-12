package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class iw implements View.OnLongClickListener {
    public final int f37208a;
    public final yy f37209b;

    public iw(yy yyVar, int i10) {
        this.f37208a = i10;
        this.f37209b = yyVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f37208a) {
            case 0:
                yy yyVar = this.f37209b;
                ArrayList arrayList = yyVar.I2;
                if (yyVar.getParentActivity() == null) {
                    return false;
                }
                boolean z10 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    long longValue = ((Long) arrayList.get(i10)).longValue();
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        z10 = false;
                    }
                    TLRPC.Chat chat = yyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z10 = false;
                    }
                }
                org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(yyVar, view);
                H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new uv(yyVar, 20), false);
                H.l(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new uv(yyVar, 21), z10);
                H.Z();
                return true;
            case 1:
                yy yyVar2 = this.f37209b;
                yyVar2.o4(yyVar2.I2, 104, true, true, null);
                return true;
            case 2:
                this.f37209b.m4(view);
                return true;
            default:
                yy yyVar3 = this.f37209b;
                yyVar3.getContactsController().loadGlobalPrivacySetting();
                yyVar3.H4();
                return true;
        }
    }
}
