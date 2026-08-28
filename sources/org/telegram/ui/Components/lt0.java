package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class lt0 extends vk0 {
    public final Context f30545c;
    public final int d;
    public final org.telegram.ui.ActionBar.b6 f30546e;
    public final jt0 f30547f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f30548n = new ArrayList();
    public ws0 f30549r;
    public final eu0 f30550s;

    public lt0(eu0 eu0Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f30550s = eu0Var;
        this.f30545c = context;
        this.d = i9;
        this.f30546e = b6Var;
        this.f30547f = new jt0(this, i9, b6Var);
        E();
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f30548n;
        arrayList.clear();
        ArrayList c10 = this.f30550s.f28155p1[8].c();
        int i9 = 0;
        for (int i10 = 0; i10 < c10.size(); i10++) {
            MessageObject messageObject = (MessageObject) c10.get(i10);
            if (messageObject.dateKeyInt != i9) {
                int i11 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j10 = i11;
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
                i9 = messageObject.dateKeyInt;
            }
            arrayList.add(messageObject);
        }
    }

    @Override
    public final int h() {
        return this.f30548n.size();
    }

    @Override
    public final int j(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f30548n;
            if (i9 < arrayList.size()) {
                return ((MessageObject) arrayList.get(i9)).contentType;
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
    public final void v(f2.q1 q1Var, int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f30548n;
            if (i9 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i9);
                int i10 = q1Var.f5505f;
                View view = q1Var.f5501a;
                if (i10 == 0) {
                    ((org.telegram.ui.Cells.t1) view).X3(messageObject, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.w0) view).setMessageObject(messageObject);
                }
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        if (i9 == 0) {
            kt0 kt0Var = new kt0(this.f30545c, this.d, false, null, this.f30546e);
            kt0Var.setDelegate(this.f30547f);
            return new f2.q1(kt0Var);
        }
        return new f2.q1(new org.telegram.ui.Cells.w0(this.f30545c, this.f30546e, false));
    }
}
