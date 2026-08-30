package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class eu0 extends rl0 {
    public final Context f24675c;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final cu0 f24676f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f24677n = new ArrayList();
    public pt0 f24678r;
    public final yu0 f24679s;

    public eu0(yu0 yu0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f24679s = yu0Var;
        this.f24675c = context;
        this.d = i10;
        this.e = f6Var;
        this.f24676f = new cu0(this, i10, f6Var);
        E();
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f24677n;
        arrayList.clear();
        ArrayList c3 = this.f24679s.f31138q1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c3.size(); i11++) {
            MessageObject messageObject = (MessageObject) c3.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j10 = i12;
                tL_message.message = LocaleController.formatDateChat(j10);
                tL_message.f19205id = 0;
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
        return this.f24677n.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f24677n;
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
    public final void v(f2.l1 l1Var, int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f24677n;
            if (i10 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                int i11 = l1Var.f5788f;
                View view = l1Var.f5785a;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.t1) view).X3(messageObject, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
                }
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            du0 du0Var = new du0(this.f24675c, this.d, false, null, this.e);
            du0Var.setDelegate(this.f24676f);
            return new f2.l1(du0Var);
        }
        return new f2.l1(new org.telegram.ui.Cells.v0(this.f24675c, this.e, false));
    }
}
