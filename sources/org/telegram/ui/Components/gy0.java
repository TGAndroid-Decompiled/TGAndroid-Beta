package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.messenger.NotificationCenter;
public final class gy0 implements TextWatcher {
    public final int f26813a = 0;
    public final EditTextBoldCursor f26814b;
    public final Serializable f26815c;
    public final Object d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public gy0(sy0 sy0Var, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = sy0Var;
        this.f26815c = iArr;
        this.d = textView;
        this.f26814b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        switch (this.f26813a) {
            case 0:
                return;
            default:
                org.telegram.ui.zm0 zm0Var = (org.telegram.ui.zm0) this.e;
                String str = (String) this.f26815c;
                if (((HashMap) this.d) == zm0Var.f44168t1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f26814b;
                org.telegram.ui.zm0.I0(zm0Var, editTextBoldCursor, str, editable, z10);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = zm0Var.Y[intValue];
                if (intValue == 6) {
                    zm0Var.X0(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f26813a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f26813a) {
            case 0:
                if (((int[]) this.f26815c)[0] == 2) {
                    ((sy0) this.e).o0((TextView) this.d, this.f26814b.getText().toString(), false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public gy0(org.telegram.ui.zm0 zm0Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = zm0Var;
        this.f26814b = editTextBoldCursor;
        this.f26815c = str;
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
