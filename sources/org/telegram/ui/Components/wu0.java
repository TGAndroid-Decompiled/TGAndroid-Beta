package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class wu0 extends yl0 {
    public final Context f32629c;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 f32630e;
    public final uu0 f32631f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f32632n = new ArrayList();
    public hu0 f32633r;
    public final pv0 f32634s;

    public wu0(pv0 pv0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f32634s = pv0Var;
        this.f32629c = context;
        this.d = i10;
        this.f32630e = d6Var;
        this.f32631f = new uu0(this, i10, d6Var);
        E();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f32632n;
        arrayList.clear();
        ArrayList c10 = this.f32634s.f29802t1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10.size(); i11++) {
            MessageObject messageObject = (MessageObject) c10.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i12;
                tL_message.message = LocaleController.formatDateChat(j3);
                tL_message.f20063id = 0;
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
        return this.f32632n.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f32632n;
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
            ArrayList arrayList = this.f32632n;
            if (i10 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                int i11 = c1Var.f46535f;
                View view = c1Var.f46531a;
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
            vu0 vu0Var = new vu0(this.f32629c, this.d, false, null, this.f32630e);
            vu0Var.setDelegate(this.f32631f);
            return new s4.c1(vu0Var);
        }
        return new s4.c1(new org.telegram.ui.Cells.w0(this.f32629c, this.f32630e, false));
    }
}
