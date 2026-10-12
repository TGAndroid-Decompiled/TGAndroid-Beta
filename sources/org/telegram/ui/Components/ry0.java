package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class ry0 implements TextWatcher {
    public final int f30275a = 0;
    public final EditTextBoldCursor f30276b;
    public final Serializable f30277c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f30278e;

    public ry0(dz0 dz0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f30278e = dz0Var;
        this.f30277c = iArr;
        this.d = textView;
        this.f30276b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f30275a) {
            case 0:
                return;
            default:
                org.telegram.ui.pn0 pn0Var = (org.telegram.ui.pn0) this.f30278e;
                String str = (String) this.f30277c;
                if (((HashMap) this.d) == pn0Var.f41046t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f30276b;
                org.telegram.ui.pn0.I0(pn0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = pn0Var.Y[intValue];
                if (intValue == 6) {
                    pn0Var.X0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f30275a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f30275a) {
            case 0:
                if (((int[]) this.f30277c)[0] == 2) {
                    ((dz0) this.f30278e).n0((TextView) this.d, this.f30276b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public ry0(org.telegram.ui.pn0 pn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f30278e = pn0Var;
        this.f30276b = editTextBoldCursor;
        this.f30277c = str;
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
