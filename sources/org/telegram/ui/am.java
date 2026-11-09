package org.telegram.ui;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class am implements org.telegram.ui.ActionBar.r1, h2.j {
    public final int f43719a = 2;
    public final boolean f43720b;
    public final Object f43721c;
    public final Object d;
    public final Object f43722e;
    public final Object f43723f;

    public am(a8.wa waVar, x2.u uVar, x2.c0 c0Var, IOException iOException, boolean z9) {
        this.f43721c = waVar;
        this.d = uVar;
        this.f43722e = c0Var;
        this.f43723f = iOException;
        this.f43720b = z9;
    }

    @Override
    public void accept(Object obj) {
        a8.wa waVar = (a8.wa) this.f43721c;
        ((x2.k0) obj).r(waVar.f700b, (x2.g0) waVar.f701c, (x2.u) this.d, (x2.c0) this.f43722e, (IOException) this.f43723f, this.f43720b);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11 = this.f43719a;
        Object obj = this.f43723f;
        Object obj2 = this.f43722e;
        Object obj3 = this.d;
        Object obj4 = this.f43721c;
        boolean z9 = this.f43720b;
        switch (i11) {
            case 0:
                nm nmVar = (nm) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                cn cnVar = nmVar.f48207a;
                org.telegram.messenger.voip.k kVar = new org.telegram.messenger.voip.k(18, nmVar, (org.telegram.ui.Cells.q1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z9 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        kVar.a(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = cnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                    ThemeActivity.H0(i10, parentActivity, new org.telegram.messenger.voip.k(19, nmVar, kVar), cnVar.getResourceProvider());
                    return;
                }
                kVar.a(Boolean.FALSE);
                return;
            default:
                org.telegram.ui.Components.ib0 ib0Var = (org.telegram.ui.Components.ib0) obj4;
                org.telegram.ui.Components.ib0 ib0Var2 = (org.telegram.ui.Components.ib0) obj3;
                org.telegram.ui.Components.ib0 ib0Var3 = (org.telegram.ui.Components.ib0) obj2;
                jg.a2 a2Var = (jg.a2) obj;
                if (z9) {
                    org.telegram.ui.Components.v4.d(ib0Var, ib0Var2, ib0Var3);
                }
                int value = ib0Var3.getValue();
                int value2 = ib0Var2.getValue();
                int value3 = ib0Var.getValue();
                dk0 dk0Var = (dk0) a2Var.f16669c;
                int i12 = a2Var.f16668b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) a2Var.d;
                if (i12 == 8) {
                    int[] iArr = dk0Var.f45046y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    dk0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public am(nm nmVar, org.telegram.ui.Cells.q1 q1Var, boolean[] zArr, boolean z9, TL_account.contentSettings contentsettings) {
        this.f43721c = nmVar;
        this.d = q1Var;
        this.f43722e = zArr;
        this.f43720b = z9;
        this.f43723f = contentsettings;
    }

    public am(boolean z9, org.telegram.ui.Components.ib0 ib0Var, org.telegram.ui.Components.ib0 ib0Var2, org.telegram.ui.Components.ib0 ib0Var3, jg.a2 a2Var) {
        this.f43720b = z9;
        this.f43721c = ib0Var;
        this.d = ib0Var2;
        this.f43722e = ib0Var3;
        this.f43723f = a2Var;
    }
}
