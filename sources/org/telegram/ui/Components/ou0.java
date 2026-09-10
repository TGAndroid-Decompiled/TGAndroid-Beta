package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ou0 extends ul0 {
    public final Context f25914c;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final mu0 f25915f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f25916n = new ArrayList();
    public zt0 f25917r;
    public final iv0 f25918s;

    public ou0(iv0 iv0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f25918s = iv0Var;
        this.f25914c = context;
        this.d = i10;
        this.e = f6Var;
        this.f25915f = new mu0(this, i10, f6Var);
        E();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f25916n;
        arrayList.clear();
        ArrayList c10 = this.f25918s.f24127t1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10.size(); i11++) {
            MessageObject messageObject = (MessageObject) c10.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i12;
                tL_message.message = LocaleController.formatDateChat(j3);
                tL_message.f17216id = 0;
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
        return this.f25916n.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f25916n;
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
            ArrayList arrayList = this.f25916n;
            if (i10 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                int i11 = c1Var.f41613f;
                View view = c1Var.f41610a;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.t1) view).X3(messageObject, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.w0) view).setMessageObject(messageObject);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            nu0 nu0Var = new nu0(this.f25914c, this.d, false, null, this.e);
            nu0Var.setDelegate(this.f25915f);
            return new s4.c1(nu0Var);
        }
        return new s4.c1(new org.telegram.ui.Cells.w0(this.f25914c, this.e, false));
    }
}
