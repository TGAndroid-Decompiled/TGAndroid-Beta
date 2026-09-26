package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.gn0;
import org.telegram.ui.in;
import org.telegram.ui.wn;
public final class zj implements org.telegram.ui.ActionBar.z1, e2.h {
    public final int f18323a = 3;
    public final boolean f18324b;
    public final Object f18325c;
    public final Object d;
    public final Object e;
    public final Object f18326f;

    public zj(a5.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.f18325c = aVar;
        this.d = tVar;
        this.e = b0Var;
        this.f18326f = iOException;
        this.f18324b = z10;
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f18325c;
        ((u2.j0) obj).f(aVar.f277b, (u2.f0) aVar.f278c, (u2.t) this.d, (u2.b0) this.e, (IOException) this.f18326f, this.f18324b);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        int i12 = this.f18323a;
        boolean z10 = this.f18324b;
        Object obj = this.f18326f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f18325c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f18324b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (wn) obj, a2Var, i10);
                return;
            case 1:
                in inVar = (in) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                wn wnVar = inVar.f34557a;
                org.telegram.ui.oc ocVar = new org.telegram.ui.oc(11, inVar, (org.telegram.ui.Cells.u1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        ocVar.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = wnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.oc(12, inVar, ocVar), wnVar.getResourceProvider());
                    return;
                }
                ocVar.run(Boolean.FALSE);
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
                gn0 gn0Var = (gn0) d2Var.f9697c;
                int i13 = d2Var.f9696b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) d2Var.d;
                if (i13 == 8) {
                    int[] iArr = gn0Var.f34021x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    gn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public zj(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, wn wnVar) {
        this.f18325c = sendMessagesHelper;
        this.f18324b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f18326f = wnVar;
    }

    public zj(in inVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f18325c = inVar;
        this.d = u1Var;
        this.e = zArr;
        this.f18324b = z10;
        this.f18326f = contentsettings;
    }

    public zj(boolean z10, ed0 ed0Var, ed0 ed0Var2, ed0 ed0Var3, gg.d2 d2Var) {
        this.f18324b = z10;
        this.f18325c = ed0Var;
        this.d = ed0Var2;
        this.e = ed0Var3;
        this.f18326f = d2Var;
    }
}
