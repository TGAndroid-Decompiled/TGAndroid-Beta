package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class nt0 extends yk0 {

    public final Context f31029c;
    public final int d;

    public final org.telegram.ui.ActionBar.c6 f31030e;

    public final lt0 f31031f;
    public final ArrayList h = new ArrayList(10);

    public final ArrayList f31032n = new ArrayList();

    public ys0 f31033r;

    public final hu0 f31034s;

    public nt0(hu0 hu0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f31034s = hu0Var;
        this.f31029c = context;
        this.d = i10;
        this.f31030e = c6Var;
        this.f31031f = new lt0(this, i10, c6Var);
        E();
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f31032n;
        arrayList.clear();
        ArrayList arrayListC = this.f31034s.f29140p1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < arrayListC.size(); i11++) {
            MessageObject messageObject = (MessageObject) arrayListC.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j10 = i12;
                tL_message.message = LocaleController.formatDateChat(j10);
                tL_message.f22401id = 0;
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
        return this.f31032n.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.f31032n;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((MessageObject) arrayList.get(i10)).contentType;
    }

    @Override
    public final void l() {
        E();
        super.l();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f31032n;
            if (i10 >= arrayList.size()) {
                return;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            int i11 = o1Var.f5793f;
            View view = o1Var.f5789a;
            if (i11 == 0) {
                ((org.telegram.ui.Cells.s1) view).W3(messageObject, null, false, false, false, false);
            } else {
                ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
            }
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        if (i10 != 0) {
            return new lk0(new org.telegram.ui.Cells.v0(this.f31029c, this.f31030e, false));
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f31030e;
        mt0 mt0Var = new mt0(this.f31029c, this.d, false, null, c6Var);
        mt0Var.setDelegate(this.f31031f);
        return new lk0(mt0Var);
    }
}
