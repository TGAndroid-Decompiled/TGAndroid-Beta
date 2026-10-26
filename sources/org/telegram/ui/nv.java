package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class nv implements View.OnLongClickListener {
    public final int f42007a;
    public final cy f42008b;

    public nv(cy cyVar, int i10) {
        this.f42007a = i10;
        this.f42008b = cyVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        switch (this.f42007a) {
            case 0:
                cy cyVar = this.f42008b;
                ArrayList arrayList = cyVar.I2;
                if (cyVar.getParentActivity() == null) {
                    return false;
                }
                boolean z12 = !arrayList.isEmpty();
                boolean z13 = true;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    long longValue = ((Long) arrayList.get(i12)).longValue();
                    if (z12 && longValue != cyVar.getUserConfig().getClientUserId()) {
                        z12 = false;
                    }
                    if (DialogObject.isEncryptedDialog(longValue)) {
                        z13 = false;
                    }
                    TLRPC.Chat chat = cyVar.getMessagesController().getChat(Long.valueOf(-longValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z13 = false;
                    }
                }
                if (cyVar.i4() && cyVar.u3()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ArrayList arrayList2 = cyVar.D2;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            if (((MediaController.PhotoEntry) obj).hasVideoEditsLostAsDocument()) {
                                z10 = false;
                            }
                        }
                    }
                }
                ArrayList arrayList3 = cyVar.D2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(cyVar, view);
                int i14 = R.drawable.msg_sendfile;
                if (z11) {
                    i10 = R.string.SendAsFiles;
                } else {
                    i10 = R.string.SendAsFile;
                }
                H.l(i14, LocaleController.getString(i10), new cv(cyVar, 19), z10);
                H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new cv(cyVar, 20), false);
                int i15 = R.drawable.msg_calendar2;
                if (z12) {
                    i11 = R.string.SetReminder;
                } else {
                    i11 = R.string.ScheduleMessage;
                }
                H.l(i15, LocaleController.getString(i11), new org.telegram.ui.Components.d60(10, cyVar, z12), z13);
                H.Z();
                return true;
            case 1:
                cy cyVar2 = this.f42008b;
                cyVar2.z4(cyVar2.I2, 104, true, true, null);
                return true;
            case 2:
                this.f42008b.x4(view);
                return true;
            default:
                cy cyVar3 = this.f42008b;
                cyVar3.getContactsController().loadGlobalPrivacySetting();
                cyVar3.S4();
                return true;
        }
    }
}
