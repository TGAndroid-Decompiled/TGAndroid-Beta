package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.jn;
import org.telegram.ui.jn0;
import org.telegram.ui.xn;
public final class zj implements org.telegram.ui.ActionBar.b2, e2.h {
    public final int f18317a = 3;
    public final boolean f18318b;
    public final Object f18319c;
    public final Object d;
    public final Object e;
    public final Object f18320f;

    public zj(a5.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.f18319c = aVar;
        this.d = tVar;
        this.e = b0Var;
        this.f18320f = iOException;
        this.f18318b = z10;
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f18319c;
        ((u2.j0) obj).f(aVar.f277b, (u2.f0) aVar.f278c, (u2.t) this.d, (u2.b0) this.e, (IOException) this.f18320f, this.f18318b);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        int i12 = this.f18317a;
        boolean z10 = this.f18318b;
        Object obj = this.f18320f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f18319c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f18318b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (xn) obj, c2Var, i10);
                return;
            case 1:
                jn jnVar = (jn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                xn xnVar = jnVar.f34766a;
                org.telegram.ui.qc qcVar = new org.telegram.ui.qc(11, jnVar, (org.telegram.ui.Cells.u1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        qcVar.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = xnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.qc(12, jnVar, qcVar), xnVar.getResourceProvider());
                    return;
                }
                qcVar.run(Boolean.FALSE);
                return;
            default:
                ed0 ed0Var = (ed0) obj4;
                ed0 ed0Var2 = (ed0) obj3;
                ed0 ed0Var3 = (ed0) obj2;
                gg.d2 d2Var = (gg.d2) obj;
                if (z10) {
                    org.telegram.ui.Components.e5.d(ed0Var, ed0Var2, ed0Var3);
                }
                int value = ed0Var3.getValue();
                int value2 = ed0Var2.getValue();
                int value3 = ed0Var.getValue();
                jn0 jn0Var = (jn0) d2Var.f9703c;
                int i13 = d2Var.f9702b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) d2Var.d;
                if (i13 == 8) {
                    int[] iArr = jn0Var.f34819x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    jn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public zj(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar) {
        this.f18319c = sendMessagesHelper;
        this.f18318b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f18320f = xnVar;
    }

    public zj(jn jnVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f18319c = jnVar;
        this.d = u1Var;
        this.e = zArr;
        this.f18318b = z10;
        this.f18320f = contentsettings;
    }

    public zj(boolean z10, ed0 ed0Var, ed0 ed0Var2, ed0 ed0Var3, gg.d2 d2Var) {
        this.f18318b = z10;
        this.f18319c = ed0Var;
        this.d = ed0Var2;
        this.e = ed0Var3;
        this.f18320f = d2Var;
    }
}
