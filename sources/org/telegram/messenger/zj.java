package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.kn;
import org.telegram.ui.kn0;
import org.telegram.ui.yn;
public final class zj implements org.telegram.ui.ActionBar.a2, e2.h {
    public final int f20023a = 3;
    public final boolean f20024b;
    public final Object f20025c;
    public final Object d;
    public final Object f20026e;
    public final Object f20027f;

    public zj(a5.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.f20025c = aVar;
        this.d = tVar;
        this.f20026e = b0Var;
        this.f20027f = iOException;
        this.f20024b = z10;
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f20025c;
        ((u2.k0) obj).f(aVar.f299b, (u2.f0) aVar.f300c, (u2.t) this.d, (u2.b0) this.f20026e, (IOException) this.f20027f, this.f20024b);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12 = this.f20023a;
        boolean z10 = this.f20024b;
        Object obj = this.f20027f;
        Object obj2 = this.f20026e;
        Object obj3 = this.d;
        Object obj4 = this.f20025c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f20024b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (yn) obj, b2Var, i10);
                return;
            case 1:
                kn knVar = (kn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                yn ynVar = knVar.f38002a;
                org.telegram.ui.qc qcVar = new org.telegram.ui.qc(11, knVar, (org.telegram.ui.Cells.u1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        qcVar.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = ynVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.qc(12, knVar, qcVar), ynVar.getResourceProvider());
                    return;
                }
                qcVar.run(Boolean.FALSE);
                return;
            default:
                gd0 gd0Var = (gd0) obj4;
                gd0 gd0Var2 = (gd0) obj3;
                gd0 gd0Var3 = (gd0) obj2;
                gg.d2 d2Var = (gg.d2) obj;
                if (z10) {
                    org.telegram.ui.Components.e5.d(gd0Var, gd0Var2, gd0Var3);
                }
                int value = gd0Var3.getValue();
                int value2 = gd0Var2.getValue();
                int value3 = gd0Var.getValue();
                kn0 kn0Var = (kn0) d2Var.f10558c;
                int i13 = d2Var.f10557b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) d2Var.d;
                if (i13 == 8) {
                    int[] iArr = kn0Var.f38056x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    kn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public zj(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, yn ynVar) {
        this.f20025c = sendMessagesHelper;
        this.f20024b = z10;
        this.d = messageObject;
        this.f20026e = keyboardButtonProto;
        this.f20027f = ynVar;
    }

    public zj(kn knVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f20025c = knVar;
        this.d = u1Var;
        this.f20026e = zArr;
        this.f20024b = z10;
        this.f20027f = contentsettings;
    }

    public zj(boolean z10, gd0 gd0Var, gd0 gd0Var2, gd0 gd0Var3, gg.d2 d2Var) {
        this.f20024b = z10;
        this.f20025c = gd0Var;
        this.d = gd0Var2;
        this.f20026e = gd0Var3;
        this.f20027f = d2Var;
    }
}
