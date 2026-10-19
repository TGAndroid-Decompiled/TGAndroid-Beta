package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class av0 extends hm0 {
    public final Context f24709c;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final yu0 f24710f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f24711n = new ArrayList();
    public lu0 f24712r;
    public final tv0 f24713s;

    public av0(tv0 tv0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f24713s = tv0Var;
        this.f24709c = context;
        this.d = i10;
        this.e = d6Var;
        this.f24710f = new yu0(this, i10, d6Var);
        E();
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f24711n;
        arrayList.clear();
        ArrayList c10 = this.f24713s.f30730t1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10.size(); i11++) {
            MessageObject messageObject = (MessageObject) c10.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j10 = i12;
                tL_message.message = LocaleController.formatDateChat(j10);
                tL_message.f20296id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j10 * 1000);
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
        return this.f24711n.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f24711n;
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
    public final void v(s4.b1 b1Var, int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f24711n;
            if (i10 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                int i11 = b1Var.f45913f;
                View view = b1Var.f45910a;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.u1) view).X3(messageObject, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.w0) view).setMessageObject(messageObject);
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            zu0 zu0Var = new zu0(this.f24709c, this.d, false, null, this.e);
            zu0Var.setDelegate(this.f24710f);
            return new s4.b1(zu0Var);
        }
        return new s4.b1(new org.telegram.ui.Cells.w0(this.f24709c, this.e, false));
    }
}
