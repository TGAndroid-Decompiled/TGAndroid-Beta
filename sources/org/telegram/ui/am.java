package org.telegram.ui;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class am implements org.telegram.ui.ActionBar.r1, h2.j {
    public final int f43717a = 2;
    public final boolean f43718b;
    public final Object f43719c;
    public final Object d;
    public final Object f43720e;
    public final Object f43721f;

    public am(a8.wa waVar, x2.t tVar, x2.b0 b0Var, IOException iOException, boolean z9) {
        this.f43719c = waVar;
        this.d = tVar;
        this.f43720e = b0Var;
        this.f43721f = iOException;
        this.f43718b = z9;
    }

    @Override
    public void accept(Object obj) {
        a8.wa waVar = (a8.wa) this.f43719c;
        ((x2.j0) obj).r(waVar.f700b, (x2.f0) waVar.f701c, (x2.t) this.d, (x2.b0) this.f43720e, (IOException) this.f43721f, this.f43718b);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        int i11 = this.f43717a;
        Object obj = this.f43721f;
        Object obj2 = this.f43720e;
        Object obj3 = this.d;
        Object obj4 = this.f43719c;
        boolean z9 = this.f43718b;
        switch (i11) {
            case 0:
                nm nmVar = (nm) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                cn cnVar = nmVar.f48227a;
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
                org.telegram.ui.Components.hb0 hb0Var = (org.telegram.ui.Components.hb0) obj4;
                org.telegram.ui.Components.hb0 hb0Var2 = (org.telegram.ui.Components.hb0) obj3;
                org.telegram.ui.Components.hb0 hb0Var3 = (org.telegram.ui.Components.hb0) obj2;
                jg.a2 a2Var = (jg.a2) obj;
                if (z9) {
                    org.telegram.ui.Components.u4.d(hb0Var, hb0Var2, hb0Var3);
                }
                int value = hb0Var3.getValue();
                int value2 = hb0Var2.getValue();
                int value3 = hb0Var.getValue();
                ek0 ek0Var = (ek0) a2Var.f16669c;
                int i12 = a2Var.f16668b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) a2Var.d;
                if (i12 == 8) {
                    int[] iArr = ek0Var.f45370y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    ek0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public am(nm nmVar, org.telegram.ui.Cells.q1 q1Var, boolean[] zArr, boolean z9, TL_account.contentSettings contentsettings) {
        this.f43719c = nmVar;
        this.d = q1Var;
        this.f43720e = zArr;
        this.f43718b = z9;
        this.f43721f = contentsettings;
    }

    public am(boolean z9, org.telegram.ui.Components.hb0 hb0Var, org.telegram.ui.Components.hb0 hb0Var2, org.telegram.ui.Components.hb0 hb0Var3, jg.a2 a2Var) {
        this.f43718b = z9;
        this.f43719c = hb0Var;
        this.d = hb0Var2;
        this.f43720e = hb0Var3;
        this.f43721f = a2Var;
    }
}
