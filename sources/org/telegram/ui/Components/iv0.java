package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class iv0 extends lm0 {
    public final Context f29383c;
    public final int d;
    public final org.telegram.ui.ActionBar.u6 e;
    public final gv0 f29384f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f29385n = new ArrayList();
    public su0 f29386r;
    public final aw0 f29387s;

    public iv0(aw0 aw0Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f29387s = aw0Var;
        this.f29383c = context;
        this.d = i10;
        this.e = u6Var;
        this.f29384f = new gv0(this, i10, u6Var);
        E();
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f29385n;
        arrayList.clear();
        ArrayList c10 = this.f29387s.f26698v1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10.size(); i11++) {
            MessageObject messageObject = (MessageObject) c10.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j10 = i12;
                tL_message.message = LocaleController.formatDateChat(j10);
                tL_message.f22048id = 0;
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
        return this.f29385n.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f29385n;
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
            ArrayList arrayList = this.f29385n;
            if (i10 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                int i11 = e1Var.f47741f;
                View view = e1Var.f47738a;
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
            hv0 hv0Var = new hv0(this.f29383c, this.d, false, null, this.e);
            hv0Var.setDelegate(this.f29384f);
            return new s4.e1(hv0Var);
        }
        return new s4.e1(new org.telegram.ui.Cells.v0(this.f29383c, this.e, false));
    }
}
