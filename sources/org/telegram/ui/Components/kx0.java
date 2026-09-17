package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class kx0 implements TextWatcher {
    public final int f25701a = 0;
    public final EditTextBoldCursor f25702b;
    public final Serializable f25703c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public kx0(wx0 wx0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = wx0Var;
        this.f25703c = iArr;
        this.d = textView;
        this.f25702b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f25701a) {
            case 0:
                return;
            default:
                org.telegram.ui.qn0 qn0Var = (org.telegram.ui.qn0) this.e;
                String str = (String) this.f25703c;
                if (((HashMap) this.d) == qn0Var.f36986t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f25702b;
                org.telegram.ui.qn0.J0(qn0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = qn0Var.Y[intValue];
                if (intValue == 6) {
                    qn0Var.Y0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f25701a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f25701a) {
            case 0:
                if (((int[]) this.f25703c)[0] == 2) {
                    ((wx0) this.e).m0((TextView) this.d, this.f25702b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public kx0(org.telegram.ui.qn0 qn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = qn0Var;
        this.f25702b = editTextBoldCursor;
        this.f25703c = str;
        this.d = hashMap;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
