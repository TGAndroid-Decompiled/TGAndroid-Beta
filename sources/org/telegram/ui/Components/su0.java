package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class su0 extends xl0 {
    public final Context f28368c;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final qu0 f28369f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f28370n = new ArrayList();
    public du0 f28371r;
    public final lv0 f28372s;

    public su0(lv0 lv0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f28372s = lv0Var;
        this.f28368c = context;
        this.d = i10;
        this.e = d6Var;
        this.f28369f = new qu0(this, i10, d6Var);
        E();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f28370n;
        arrayList.clear();
        ArrayList c10 = this.f28372s.f26150t1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10.size(); i11++) {
            MessageObject messageObject = (MessageObject) c10.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i12;
                tL_message.message = LocaleController.formatDateChat(j3);
                tL_message.f18358id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j3 * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                MessageObject messageObject2 = new MessageObject(this.d, tL_message, false, false);
                messageObject2.type = 10;
                messageObject2.contentType = 1;
                messageObject2.isDateObject = true;
                arrayList.add(messageObject2);
                i10 = messageObject.dateKeyInt;
            }
            arrayList.add(messageObject);
        }
    }

    @Override
    public final int h() {
        return this.f28370n.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f28370n;
            if (i10 < arrayList.size()) {
                return ((MessageObject) arrayList.get(i10)).contentType;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void l() {
        E();
        super.l();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f28370n;
            if (i10 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                int i11 = c1Var.f42965f;
                View view = c1Var.f42962a;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.u1) view).X3(messageObject, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.w0) view).setMessageObject(messageObject);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            ru0 ru0Var = new ru0(this.f28368c, this.d, false, null, this.e);
            ru0Var.setDelegate(this.f28369f);
            return new s4.c1(ru0Var);
        }
        return new s4.c1(new org.telegram.ui.Cells.w0(this.f28368c, this.e, false));
    }
}
