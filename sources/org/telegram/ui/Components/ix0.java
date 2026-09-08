package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class ix0 implements TextWatcher {
    public final int f27307a = 0;
    public final EditTextBoldCursor f27308b;
    public final Serializable f27309c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f27310e;

    public ix0(ux0 ux0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f27310e = ux0Var;
        this.f27309c = iArr;
        this.d = textView;
        this.f27308b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f27307a) {
            case 0:
                return;
            default:
                org.telegram.ui.pn0 pn0Var = (org.telegram.ui.pn0) this.f27310e;
                String str = (String) this.f27309c;
                if (((HashMap) this.d) == pn0Var.f39620t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f27308b;
                org.telegram.ui.pn0.J0(pn0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = pn0Var.Y[intValue];
                if (intValue == 6) {
                    pn0Var.Y0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f27307a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f27307a) {
            case 0:
                if (((int[]) this.f27309c)[0] == 2) {
                    ((ux0) this.f27310e).m0((TextView) this.d, this.f27308b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public ix0(org.telegram.ui.pn0 pn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f27310e = pn0Var;
        this.f27308b = editTextBoldCursor;
        this.f27309c = str;
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
