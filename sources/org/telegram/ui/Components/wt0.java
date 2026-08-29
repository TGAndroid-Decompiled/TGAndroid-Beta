package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class wt0 extends il0 {
    public final Context f34488c;
    public final int d;
    public final org.telegram.ui.ActionBar.c6 f34489e;
    public final ut0 f34490f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f34491n = new ArrayList();
    public ht0 f34492r;
    public final qu0 f34493s;

    public wt0(qu0 qu0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f34493s = qu0Var;
        this.f34488c = context;
        this.d = i10;
        this.f34489e = c6Var;
        this.f34490f = new ut0(this, i10, c6Var);
        E();
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f34491n;
        arrayList.clear();
        ArrayList c3 = this.f34493s.f32088p1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c3.size(); i11++) {
            MessageObject messageObject = (MessageObject) c3.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j10 = i12;
                tL_message.message = LocaleController.formatDateChat(j10);
                tL_message.f22413id = 0;
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
        return this.f34491n.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f34491n;
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
    public final void v(f2.n1 n1Var, int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f34491n;
            if (i10 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                int i11 = n1Var.f6436f;
                View view = n1Var.f6432a;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.s1) view).X3(messageObject, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.v0) view).setMessageObject(messageObject);
                }
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            vt0 vt0Var = new vt0(this.f34488c, this.d, false, null, this.f34489e);
            vt0Var.setDelegate(this.f34490f);
            return new f2.n1(vt0Var);
        }
        return new f2.n1(new org.telegram.ui.Cells.v0(this.f34488c, this.f34489e, false));
    }
}
