package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class fu0 extends sl0 {
    public final Context f27012c;
    public final int d;
    public final org.telegram.ui.ActionBar.g6 f27013e;
    public final du0 f27014f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f27015n = new ArrayList();
    public qt0 f27016r;
    public final zu0 f27017s;

    public fu0(zu0 zu0Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f27017s = zu0Var;
        this.f27012c = context;
        this.d = i10;
        this.f27013e = g6Var;
        this.f27014f = new du0(this, i10, g6Var);
        E();
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f27015n;
        arrayList.clear();
        ArrayList c3 = this.f27017s.f33998q1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c3.size(); i11++) {
            MessageObject messageObject = (MessageObject) c3.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j10 = i12;
                tL_message.message = LocaleController.formatDateChat(j10);
                tL_message.f20864id = 0;
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
        return this.f27015n.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f27015n;
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
    public final void v(f2.m1 m1Var, int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f27015n;
            if (i10 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                int i11 = m1Var.f5879f;
                View view = m1Var.f5875a;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.t1) view).X3(messageObject, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
                }
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            eu0 eu0Var = new eu0(this.f27012c, this.d, false, null, this.f27013e);
            eu0Var.setDelegate(this.f27014f);
            return new f2.m1(eu0Var);
        }
        return new f2.m1(new org.telegram.ui.Cells.v0(this.f27012c, this.f27013e, false));
    }
}
