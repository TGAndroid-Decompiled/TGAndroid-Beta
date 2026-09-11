package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class eu0 extends kl0 {
    public final Context f25786c;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 f25787e;
    public final cu0 f25788f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList f25789n = new ArrayList();
    public pt0 f25790r;
    public final xu0 f25791s;

    public eu0(xu0 xu0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f25791s = xu0Var;
        this.f25786c = context;
        this.d = i10;
        this.f25787e = f6Var;
        this.f25788f = new cu0(this, i10, f6Var);
        E();
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.f25789n;
        arrayList.clear();
        ArrayList c10 = this.f25791s.f32722t1[8].c();
        int i10 = 0;
        for (int i11 = 0; i11 < c10.size(); i11++) {
            MessageObject messageObject = (MessageObject) c10.get(i11);
            if (messageObject.dateKeyInt != i10) {
                int i12 = messageObject.messageOwner.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j3 = i12;
                tL_message.message = LocaleController.formatDateChat(j3);
                tL_message.f19890id = 0;
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
        return this.f25789n.size();
    }

    @Override
    public final int j(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f25789n;
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
            ArrayList arrayList = this.f25789n;
            if (i10 < arrayList.size()) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                int i11 = c1Var.f45742f;
                View view = c1Var.f45738a;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.t1) view).X3(messageObject, null, false, false, false, false);
                } else {
                    ((org.telegram.ui.Cells.w0) view).setMessageObject(messageObject);
                }
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            du0 du0Var = new du0(this.f25786c, this.d, false, null, this.f25787e);
            du0Var.setDelegate(this.f25788f);
            return new s4.c1(du0Var);
        }
        return new s4.c1(new org.telegram.ui.Cells.w0(this.f25786c, this.f25787e, false));
    }
}
