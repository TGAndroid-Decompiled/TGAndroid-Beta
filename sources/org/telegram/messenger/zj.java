package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.fn;
import org.telegram.ui.tm;
import org.telegram.ui.tn;
import org.telegram.ui.vm0;
public final class zj implements org.telegram.ui.ActionBar.b2 {
    public final int f22380a = 0;
    public final boolean f22381b;
    public final Object f22382c;
    public final Object d;
    public final Object f22383e;
    public final Object f22384f;

    public zj(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, tn tnVar) {
        this.f22382c = sendMessagesHelper;
        this.f22381b = z10;
        this.d = messageObject;
        this.f22383e = keyboardButtonProto;
        this.f22384f = tnVar;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        int i12 = this.f22380a;
        boolean z10 = this.f22381b;
        Object obj = this.f22384f;
        Object obj2 = this.f22383e;
        Object obj3 = this.d;
        Object obj4 = this.f22382c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f22381b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (tn) obj, c2Var, i10);
                return;
            case 1:
                fn fnVar = (fn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                tn tnVar = fnVar.f38212a;
                tm tmVar = new tm(1, fnVar, (org.telegram.ui.Cells.s1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        tmVar.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = tnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new tm(2, fnVar, tmVar), tnVar.getResourceProvider());
                    return;
                }
                tmVar.run(Boolean.FALSE);
                return;
            default:
                qc0 qc0Var = (qc0) obj4;
                qc0 qc0Var2 = (qc0) obj3;
                qc0 qc0Var3 = (qc0) obj2;
                e3.d dVar = (e3.d) obj;
                if (z10) {
                    org.telegram.ui.Components.c5.d(qc0Var, qc0Var2, qc0Var3);
                }
                int value = qc0Var3.getValue();
                int value2 = qc0Var2.getValue();
                int value3 = qc0Var.getValue();
                vm0 vm0Var = (vm0) dVar.f5808c;
                int i13 = dVar.f5807b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) dVar.d;
                if (i13 == 8) {
                    int[] iArr = vm0Var.f43675x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    vm0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public zj(fn fnVar, org.telegram.ui.Cells.s1 s1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f22382c = fnVar;
        this.d = s1Var;
        this.f22383e = zArr;
        this.f22381b = z10;
        this.f22384f = contentsettings;
    }

    public zj(boolean z10, qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3, e3.d dVar) {
        this.f22381b = z10;
        this.f22382c = qc0Var;
        this.d = qc0Var2;
        this.f22383e = qc0Var3;
        this.f22384f = dVar;
    }
}
