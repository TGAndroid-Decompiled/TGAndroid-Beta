package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ev0 extends lm0 {
    public final Context f26080c;
    public final int d;
    public final org.telegram.ui.ActionBar.g6 e;
    public final cv0 f26081f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f26082n = new ArrayList();
    public pu0 f26083r;
    public final xv0 f26084s;

    public ev0(xv0 xv0Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f26084s = xv0Var;
        this.f26080c = context;
        this.d = i10;
        this.e = g6Var;
        this.f26081f = new cv0(this, i10, g6Var);
        E();
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f26082n;
        arrayList.clear();
        ArrayList c10 = this.f26084s.f32707t1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10.size(); i11++) {
            MessageObject messageObject = (MessageObject) c10.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j10 = i12;
                tL_message.message = LocaleController.formatDateChat(j10);
                tL_message.f20364id = 0;
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
        return this.f26082n.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f26082n;
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
            ArrayList arrayList = this.f26082n;
            if (i10 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                int i11 = b1Var.f46346f;
                View view = b1Var.f46343a;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.t1) view).W3(messageObject, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            dv0 dv0Var = new dv0(this.f26080c, this.d, false, null, this.e);
            dv0Var.setDelegate(this.f26081f);
            return new s4.b1(dv0Var);
        }
        return new s4.b1(new org.telegram.ui.Cells.v0(this.f26080c, this.e, false));
    }
}
