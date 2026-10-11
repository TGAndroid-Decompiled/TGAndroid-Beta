package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class my0 implements TextWatcher {
    public final int f28971a = 0;
    public final EditTextBoldCursor f28972b;
    public final Serializable f28973c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f28974e;

    public my0(yy0 yy0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f28974e = yy0Var;
        this.f28973c = iArr;
        this.d = textView;
        this.f28972b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f28971a) {
            case 0:
                return;
            default:
                org.telegram.ui.mn0 mn0Var = (org.telegram.ui.mn0) this.f28974e;
                String str = (String) this.f28973c;
                if (((HashMap) this.d) == mn0Var.f40061t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f28972b;
                org.telegram.ui.mn0.I0(mn0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = mn0Var.Y[intValue];
                if (intValue == 6) {
                    mn0Var.X0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f28971a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f28971a) {
            case 0:
                if (((int[]) this.f28973c)[0] == 2) {
                    ((yy0) this.f28974e).n0((TextView) this.d, this.f28972b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public my0(org.telegram.ui.mn0 mn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f28974e = mn0Var;
        this.f28972b = editTextBoldCursor;
        this.f28973c = str;
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
