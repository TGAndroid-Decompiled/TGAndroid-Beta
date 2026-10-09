package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class iv0 extends pm0 {
    public final Context f27489c;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 f27490e;
    public final gv0 f27491f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f27492n = new ArrayList();
    public tu0 f27493r;
    public final bw0 f27494s;

    public iv0(bw0 bw0Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f27494s = bw0Var;
        this.f27489c = context;
        this.d = i10;
        this.f27490e = e6Var;
        this.f27491f = new gv0(this, i10, e6Var);
        E();
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f27492n;
        arrayList.clear();
        ArrayList c10 = this.f27494s.f25162t1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10.size(); i11++) {
            MessageObject messageObject = (MessageObject) c10.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i12;
                tL_message.message = LocaleController.formatDateChat(j3);
                tL_message.f20059id = 0;
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
        return this.f27492n.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f27492n;
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
    public final void v(s4.d1 d1Var, int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f27492n;
            if (i10 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                int i11 = d1Var.f47660f;
                View view = d1Var.f47656a;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.u1) view).X3(messageObject, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.w0) view).setMessageObject(messageObject);
                }
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            hv0 hv0Var = new hv0(this.f27489c, this.d, false, null, this.f27490e);
            hv0Var.setDelegate(this.f27491f);
            return new s4.d1(hv0Var);
        }
        return new s4.d1(new org.telegram.ui.Cells.w0(this.f27489c, this.f27490e, false));
    }
}
