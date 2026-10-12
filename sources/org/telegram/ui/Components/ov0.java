package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class ov0 extends vm0 {
    public final Context f29309c;
    public final int d;
    public final org.telegram.ui.ActionBar.c6 f29310e;
    public final mv0 f29311f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f29312n = new ArrayList();
    public zu0 f29313r;
    public final hw0 f29314s;

    public ov0(hw0 hw0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f29314s = hw0Var;
        this.f29309c = context;
        this.d = i10;
        this.f29310e = c6Var;
        this.f29311f = new mv0(this, i10, c6Var);
        E();
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f29312n;
        arrayList.clear();
        ArrayList c10 = this.f29314s.f26953t1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10.size(); i11++) {
            MessageObject messageObject = (MessageObject) c10.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i12;
                tL_message.message = LocaleController.formatDateChat(j3);
                tL_message.f19824id = 0;
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
        return this.f29312n.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f29312n;
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
            ArrayList arrayList = this.f29312n;
            if (i10 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                int i11 = d1Var.f47901f;
                View view = d1Var.f47897a;
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
            nv0 nv0Var = new nv0(this.f29309c, this.d, false, null, this.f29310e);
            nv0Var.setDelegate(this.f29311f);
            return new s4.d1(nv0Var);
        }
        return new s4.d1(new org.telegram.ui.Cells.w0(this.f29309c, this.f29310e, false));
    }
}
