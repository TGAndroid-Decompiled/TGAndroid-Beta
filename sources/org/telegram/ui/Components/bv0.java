package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class bv0 extends im0 {
    public final Context f25041c;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final zu0 f25042f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f25043n = new ArrayList();
    public mu0 f25044r;
    public final uv0 f25045s;

    public bv0(uv0 uv0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f25045s = uv0Var;
        this.f25041c = context;
        this.d = i10;
        this.e = d6Var;
        this.f25042f = new zu0(this, i10, d6Var);
        E();
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f25043n;
        arrayList.clear();
        ArrayList c10 = this.f25045s.f31066t1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10.size(); i11++) {
            MessageObject messageObject = (MessageObject) c10.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j10 = i12;
                tL_message.message = LocaleController.formatDateChat(j10);
                tL_message.f20297id = 0;
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
        return this.f25043n.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f25043n;
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
            ArrayList arrayList = this.f25043n;
            if (i10 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                int i11 = b1Var.f45920f;
                View view = b1Var.f45917a;
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
            av0 av0Var = new av0(this.f25041c, this.d, false, null, this.e);
            av0Var.setDelegate(this.f25042f);
            return new s4.b1(av0Var);
        }
        return new s4.b1(new org.telegram.ui.Cells.w0(this.f25041c, this.e, false));
    }
}
