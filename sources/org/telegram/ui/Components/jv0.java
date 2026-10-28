package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class jv0 extends mm0 {
    public final Context f29770c;
    public final int d;
    public final org.telegram.ui.ActionBar.u6 e;
    public final hv0 f29771f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f29772n = new ArrayList();
    public tu0 f29773r;
    public final bw0 f29774s;

    public jv0(bw0 bw0Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f29774s = bw0Var;
        this.f29770c = context;
        this.d = i10;
        this.e = u6Var;
        this.f29771f = new hv0(this, i10, u6Var);
        E();
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f29772n;
        arrayList.clear();
        ArrayList c10 = this.f29774s.f26986v1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10.size(); i11++) {
            MessageObject messageObject = (MessageObject) c10.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j10 = i12;
                tL_message.message = LocaleController.formatDateChat(j10);
                tL_message.f22049id = 0;
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
        return this.f29772n.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f29772n;
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
    public final void v(s4.e1 e1Var, int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f29772n;
            if (i10 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                int i11 = e1Var.f47776f;
                View view = e1Var.f47773a;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.s1) view).Z3(messageObject, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
                }
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            iv0 iv0Var = new iv0(this.f29770c, this.d, false, null, this.e);
            iv0Var.setDelegate(this.f29771f);
            return new s4.e1(iv0Var);
        }
        return new s4.e1(new org.telegram.ui.Cells.v0(this.f29770c, this.e, false));
    }
}
