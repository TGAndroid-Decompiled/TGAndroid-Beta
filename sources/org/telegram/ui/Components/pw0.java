package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
public final class pw0 implements TextWatcher {
    public final int f29444a = 0;
    public final EditTextBoldCursor f29445b;
    public final Serializable f29446c;
    public final Object d;
    public final org.telegram.messenger.us e;

    public pw0(cx0 cx0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = cx0Var;
        this.f29446c = iArr;
        this.d = textView;
        this.f29445b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f29444a) {
            case 0:
                return;
            default:
                org.telegram.ui.ll0 ll0Var = (org.telegram.ui.ll0) this.e;
                String str = (String) this.f29446c;
                if (((HashMap) this.d) == ll0Var.f39301t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f29445b;
                org.telegram.ui.ll0.M0(ll0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = ll0Var.Y[intValue];
                if (intValue == 6) {
                    ll0Var.b1(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f29444a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f29444a) {
            case 0:
                if (((int[]) this.f29446c)[0] == 2) {
                    ((cx0) this.e).K0((TextView) this.d, this.f29445b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public pw0(org.telegram.ui.ll0 ll0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = ll0Var;
        this.f29445b = editTextBoldCursor;
        this.f29446c = str;
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
