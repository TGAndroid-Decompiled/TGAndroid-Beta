package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class my0 implements TextWatcher {
    public final int f28931a = 0;
    public final EditTextBoldCursor f28932b;
    public final Serializable f28933c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate f28934e;

    public my0(yy0 yy0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.f28934e = yy0Var;
        this.f28933c = iArr;
        this.d = textView;
        this.f28932b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f28931a) {
            case 0:
                return;
            default:
                org.telegram.ui.nn0 nn0Var = (org.telegram.ui.nn0) this.f28934e;
                String str = (String) this.f28933c;
                if (((HashMap) this.d) == nn0Var.f40329t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f28932b;
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
        int i13 = this.f28931a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f28931a) {
            case 0:
                if (((int[]) this.f28933c)[0] == 2) {
                    ((yy0) this.f28934e).n0((TextView) this.d, this.f28932b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public my0(org.telegram.ui.nn0 nn0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.f28934e = nn0Var;
        this.f28932b = editTextBoldCursor;
        this.f28933c = str;
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
