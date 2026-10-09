package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class ly0 implements TextWatcher {
    public final int f28627a = 0;
    public final EditTextBoldCursor f28628b;
    public final Serializable f28629c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f28630e;

    public ly0(xy0 xy0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f28630e = xy0Var;
        this.f28629c = iArr;
        this.d = textView;
        this.f28628b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f28627a) {
            case 0:
                return;
            default:
                org.telegram.ui.nn0 nn0Var = (org.telegram.ui.nn0) this.f28630e;
                String str = (String) this.f28629c;
                if (((HashMap) this.d) == nn0Var.f40283t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f28628b;
                org.telegram.ui.nn0.I0(nn0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = nn0Var.Y[intValue];
                if (intValue == 6) {
                    nn0Var.X0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f28627a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f28627a) {
            case 0:
                if (((int[]) this.f28629c)[0] == 2) {
                    ((xy0) this.f28630e).n0((TextView) this.d, this.f28628b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public ly0(org.telegram.ui.nn0 nn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f28630e = nn0Var;
        this.f28628b = editTextBoldCursor;
        this.f28629c = str;
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
